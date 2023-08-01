/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.*;
import java.awt.Canvas;  
import javax.swing.JFrame;  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.regex.*;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author Ailer and Tritium
 */
public class MainGUIPanel extends GUIButtons implements ComponentListener{
    static final long serialVersionUID = 0;
    
    //protected JTextField inputText;
    //protected JTextPane textField;
    protected DrawableTextArea textField;
    protected DrawableTextArea minimap;
    private static final Logger LOGGER = Logger.getLogger(MainGUIPanel.class.getName());
    protected Font theFont;
    protected int[] textsizes = new int[]{8,10,11,12,13,14,16};
    protected String contents;
    protected String textBkp;
    protected OptionsGUI options;
    protected NewGameGUI newgame;
    protected CombatGui combat_gui;
    protected boolean optguion = false;
    protected boolean startingagame = false;
    protected StartupGUI startup = new StartupGUI();
    //world mechanics
    public Character player;
    public World world;
    public boolean look_flag = false;
    public int move_to_id = -1;	
    //character gen
    public Boolean world_gen = false;
    public ArrayList<ArrayList<Object>> array_of_fate = null;

    private String[] messages = {"Not Supported Yet"};
    
    public MainGUIPanel(){
        //this was Main.as
        setLayout(null);
        options = new OptionsGUI();
        newgame = new NewGameGUI();
        textField = new DrawableTextArea();//new JTextPane();
        minimap = new DrawableTextArea();
        /*
        drawArea = new Canvas();
        drawArea.setBounds(124,69,super.getWidth()-124,super.getHeight()-69);
        add(drawArea);
        drawArea.setVisible(false);
        drawArea.setEnabled(false);
        */
        textField.setBounds(124,69,super.getWidth()-124-80,super.getHeight()-69-120);
        minimap.setBounds(super.getWidth()-80,69,80,80);
        textField.setContentType("text/html");
        minimap.setContentType("text/html");



        theFont = new Font("Serif", Font.ITALIC, 12);
        textField.setFont(theFont);
        startup.setStartup(textField);
        add(textField);
        add(minimap);
        addComponentListener(this);

        player = null;

        HyperlinkListener hlListen = e -> {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                try {
                    String result = e.getDescription();
                    if (result.contains("event:")) {
                        parseEvent(result);
                    } else if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)
                            && e.getURL() != null) {
                        Desktop.getDesktop().browse(e.getURL().toURI());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        };
        
        textField.addHyperlinkListener(hlListen);

        //this.addEventListener(Event.ENTER_FRAME, onEnterFrame);
  
    }
    private void parseEvent(String result){
         //Parse out our command and its arguments
         LOGGER.info("Hyperlink pressed,");
         
         String[] splitResult = result.split(",");
         LOGGER.info(result);
        if(result.contains("event:look")&&splitResult.length > 2){
            int contentID = Integer.parseInt(splitResult[1]);
            int lookID = Integer.parseInt(splitResult[2]);
            textField.setText(player.look(contentID, lookID));    
        }else if(result.contains("event:look")&&splitResult.length > 1){
             int contentID = Integer.parseInt(splitResult[1]);
             textField.setText(player.look(contentID));    
        }else if(result.contains("event:open")&&splitResult.length > 1){
            int containerID = Integer.parseInt(splitResult[1]); 
            textField.setText(player.open(containerID)); 
        }else if(result.contains("event:inspect")&&splitResult.length > 2){
            int containerID = Integer.parseInt(splitResult[1]);
            int subDescIdx = Integer.parseInt(splitResult[2]);
            textField.setText(player.inspect(containerID, subDescIdx));   
        }else if(result.contains("event:go_to_new_room")&&splitResult.length > 1){
            int dir = Integer.parseInt(splitResult[1]);  
            go_to_new_room(dir);    
            textField.setText(player.go_to_new_location(dir, 1, 1)+"\n"+player.look());//TODO temporary?
            minimap.setCurRoom(player.location);
            if(!minimap.getMap())minimap.setMap(true);
            repaint();
         }else if(result.contains("event:pick_up")&&splitResult.length > 1){
             int contentID = Integer.parseInt(splitResult[1]);
             textField.setText(player.pickUp(contentID));
        }else if(result.contains("event:loot")&&splitResult.length > 2){
            int contentID = Integer.parseInt(splitResult[1]);
            int lootType = Integer.parseInt(splitResult[2]);
            textField.setText(player.loot(contentID,lootType));
         }else if(result.contains("event:action")&&splitResult.length > 2){
             int contentID = Integer.parseInt(splitResult[1]);
             int actionID = Integer.parseInt(splitResult[2]);
             textField.setText(player.fireAction(contentID, actionID));
         }else if(result.contains("event:challenge")&&splitResult.length > 4){
             /*
             int contentID = Integer.parseInt(splitResult[1]);
             int actionID = Integer.parseInt(splitResult[2]);
             int challengeID = Integer.parseInt(splitResult[3]);
             int triggeringContentID = Integer.parseInt(splitResult[4]);
             textField.setText(player.fire_challenge(contentID, actionID, challengeID, triggeringContentID));
             */
            if(splitResult.length==4){
                challenge(splitResult[1], splitResult[2], splitResult[3]);
            }else if(splitResult.length==5){
                challenge(splitResult[1], splitResult[2], splitResult[3], splitResult[4]);
            }else{
                ArrayList<Integer> temp1 = new ArrayList<>();
                String[] temp2 = Arrays.copyOfRange(splitResult,5,splitResult.length);
                for(int i=0;i<temp2.length;i++){
                    temp1.add(Integer.parseInt(temp2[i]));
                }
                challenge(splitResult[1], splitResult[2], splitResult[3], splitResult[4],temp1);
            }
        }else if(result.contains("event:challenge")&&splitResult.length > 2){
            if(splitResult.length == 3){
                combat(splitResult[1], splitResult[2], splitResult[3]);
            }else if(splitResult.length == 4){
                combat(splitResult[1], splitResult[2], splitResult[3], splitResult[4]);
            }else{
                ArrayList<Integer> temp1 = new ArrayList<>();
                String[] temp2 = Arrays.copyOfRange(splitResult,5,splitResult.length);
                for(int i=0;i<temp2.length;i++){
                    temp1.add(Integer.parseInt(temp2[i]));
                }
                combat(splitResult[1], splitResult[2], splitResult[3], splitResult[4], temp1);
            }
         }else if(result.contains("event:use_item")&&splitResult.length > 1){
            if(splitResult.length == 3)
            {
                use_item(splitResult[1], splitResult[2]);
            }
            else if(splitResult.length == 4)
            {
                use_item(splitResult[1], splitResult[2], splitResult[3]);
            }
            else if(splitResult.length == 5)
            {
                use_item(splitResult[1], splitResult[2], splitResult[3], splitResult[4]);
            }
            else if(splitResult.length == 6)
            {
                use_item(splitResult[1], splitResult[2], splitResult[3], splitResult[4], splitResult[5]);
            }
            else
            {
                use_item(splitResult[1]);
            }
            /* 
            int inventoryID = Integer.parseInt(splitResult[1]);
            if(splitResult.length == 3 ){
                int useCase = Integer.parseInt(splitResult[2]);
                textField.setText(player.use_item(inventoryID,useCase));
            }
            else if(splitResult.length == 4)
            {
                int useCase = Integer.parseInt(splitResult[2]);
                int vara = Integer.parseInt(splitResult[3]);
                textField.setText(player.use_item(inventoryID,useCase, vara));
            }
            else if(splitResult.length == 5)
            {
                int useCase = Integer.parseInt(splitResult[2]);
                int vara = Integer.parseInt(splitResult[3]);
                int varb = Integer.parseInt(splitResult[4]);
                textField.setText(player.use_item(inventoryID,useCase, vara, varb));
            }
            else if(splitResult.length == 6)
            {
                int useCase = Integer.parseInt(splitResult[2]);
                int vara = Integer.parseInt(splitResult[3]);
                int varb = Integer.parseInt(splitResult[4]);
                int varc = Integer.parseInt(splitResult[5]);
                textField.setText(player.use_item(inventoryID,useCase, vara, varb, varc));   
            }
            else{
                textField.setText(player.use_item(inventoryID));
            }
            */
        }else if(result.contains("event:inventory")&&splitResult.length>1){
            inventory(Integer.parseInt(splitResult[1]));
        }else if(result.contains("event:talk")&&splitResult.length>3){
            if(splitResult.length>5){//tempArray[5] != null){
                //talk(tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray.slice(5, tempArray.length));
                String[] temp1 = Arrays.copyOfRange(splitResult,5, splitResult.length);
                ArrayList<Integer> temp2 = new ArrayList<>();
                for(int i = 0;i<temp1.length;i++){
                    temp2.add(Integer.parseInt(temp1[i]));
                }
                talk(splitResult[1], splitResult[2], splitResult[3], splitResult[4], temp2);//TODO is this right?
            }else if(splitResult.length==5){//tempArray[4] != null){
                talk(splitResult[1], splitResult[2], splitResult[3], splitResult[4]);
            }else{
                talk(splitResult[1], splitResult[2], splitResult[3]);
            } 
        }else if(result.contains("show_skills")&&splitResult.length>1){
            if(splitResult.length==2){//tempArray[2] == null){
                show_skills(Integer.parseInt(splitResult[1]));
            }else if(splitResult.length==3){//tempArray[3] == null){
                show_skills(Integer.parseInt(splitResult[1]), Integer.parseInt(splitResult[2]));
            }else{
                /*
                String theArray = splitResult[3];
                System.out.println(theArray);
                theArray = theArray.replace("[","");
                theArray = theArray.replace("]","");
                System.out.println(theArray)
                */
                String[] actualArray = Arrays.copyOfRange(splitResult,3, splitResult.length);
                System.out.println(actualArray.length);
                ArrayList<Integer> temp2 = new ArrayList<>();
                for(int i = 0;i<actualArray.length;i++){
                    System.out.println(actualArray[i]);
                    actualArray[i] = actualArray[i].replace("[","");
                    actualArray[i] = actualArray[i].replace("]","");
                    actualArray[i] = actualArray[i].replace(" ","");
                    temp2.add(Integer.parseInt(actualArray[i]));
                }
                show_skills(Integer.parseInt(splitResult[1]), Integer.parseInt(splitResult[2]), temp2);//was splitResult
            }
        }else if(result.contains("cclass_history") && splitResult.length>1){
            show_cclass_history(Integer.parseInt(splitResult[1]));           
        }else{
             String msg = "(MainGUIPanel.java)got unexpected result: " + result;
             LOGGER.info(msg);
         }
    }
    @Override
    public void optionsPressed(){
        if(!optguion){
                optguion = true;
                options.setoptions(this,textField,super.buttons,-1,-1,-1,-1);
                textField.setVisible(false);
                textField.setEnabled(false);}
        else{
            cleanOptions();
        }
    }
    @Override
    public void loadPressed(){
        cleanOptions();
    }
    @Override
    public void newGamePressed(){
        //same as second options press, i.e. put it away.
        //TODO worldgen here instead of new game GUI
        /* From the main of the original
        if (world == null){
            world = new World();
            world_gen = true;
            world_gen_progressbar.visible = true;
            world_gen_progressbar.enabled = true;
            world = FPalace_content.new_world(world, world_gen_progressbar);				
        }
        */
        cleanOptions();
        if(!startingagame){
            startingagame = true;
            newgame.newGameStart(this,textField, super.buttons[0]);
            for (int i=0;i<11;i++){
                //if(i!=6 && i!=9 && i!=10){
                super.buttons[i].setEnabled(false);
                //}
            }
            
        }
        else{
            player = null;
            newgame = new NewGameGUI();
            newgame.newGameStart(this,textField,super.buttons[0]);
            for (int i=0;i<11;i++){
                //if(i!=6 && i!=9 && i!=10){
                super.buttons[i].setEnabled(false);
                //}
            }
            
        }
        
    }
    @Override
    public void lookPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setMap(false);
        textField.setText(player.look());
    }
    @Override
    public void appearancePressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setMap(false);
        textField.setText(capitalize(player.appearance(1, null)));//TODO this everywhere with capitalize if doable.
    }
    @Override
    public void inventoryPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setMap(false);
        textField.setText(player.inventory());   
    }
    @Override
    public void mapPressed(){
        /*if(player.location != null){*/
        textField.setVisible(true);
        textField.setEnabled(true);
        if(textField.getMap()){

            textField.setText(textBkp);
            textField.setMap(false);
        }
        else{
            textBkp = textField.getText();
            textField.setText(/*player.get_area_map()*/"");
            textField.setCurRoom(player.location);
            textField.setMap(true);
        }
    }
    @Override
    public void statusPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setMap(false);
        textField.setText(player.statistics());  
    }
    @Override
    public void trainPressed(){
        //cleanup_gui();
        show_skills();
        //if(mini_map > 0){
            //create_mini_map();
        //}
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setMap(false);
        //textField.setText(player.showAllSkills());  
    }
    public void enableButtons(){
        for (int i=0;i<11;i++){
            if(i!=6 && i!=9){
            super.buttons[i].setEnabled(true);
            }
        }
    }
    private void cleanOptions(){
        options.notOptions(this);
        optguion = false;
        textField.setVisible(true);
        textField.setEnabled(true);
    }
    public void cleanupGUI(){
            /*
			//int i = 0;
			//Map_button.setText("Map");
			for(i;i<numChildren;i++){
				if(getChildAt(i) is MovieClip){	
					removeChildAt(i);
					i--;
				}else if(getChildAt(i) is TextArea){
					var temp_s:TextArea = this.getChildAt(i) as TextArea;
					temp_s.visible = true;
					temp_s.enabled = true;
					var k:int = 0;
					for(k;k<temp_s.numChildren;k++){
						if(temp_s.getChildAt(k) is MovieClip){
							temp_s.removeChildAt(k);
							k--;
						}
					}
				}
			}
			this.stage.stageFocusRect = false;
			this.stage.focus = this;
            */
    }
    public void resetBounds(){
        //something for later
    }

    @Override
    public void componentResized(ComponentEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        options.reSize(this);
        textField.setBounds(124,69,super.getWidth()-124-80,super.getHeight()-69-120);
        minimap.setBounds(super.getWidth()-80,69,80,80);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        throw new UnsupportedOperationException(messages[0]); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentShown(ComponentEvent e) {
        throw new UnsupportedOperationException(messages[0]); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        throw new UnsupportedOperationException(messages[0]); //To change body of generated methods, choose Tools | Templates.
    }

    public static String capitalize(String s){
        String ret = s;
        //System.out.println("capitalize called")
        //var myPattern:RegExp = /(\. [a-z])|(\n[a-z])|(! [a-z])|(: [a-z])/g
        Pattern myPattern =  Pattern.compile("(\\. [a-z])|(<br>[a-z])|(\n[a-z])|(! [a-z])|(: [a-z])"); // /(\. [a-z])|(\n[a-z])|(! [a-z])|(: [a-z])/g;  
        Matcher myMatcher = myPattern.matcher(ret);
        while (myMatcher.find()) {
            //System.out.print("Start index: " + myMatcher.start())
            //System.out.print(" End index: " + myMatcher.end() + " ")
            //System.out.println(myMatcher.group())
            ret = ret.substring(0, myMatcher.end()-1) + ret.substring(myMatcher.end()-1, myMatcher.end()).toUpperCase() + 
            ret.substring(myMatcher.end());
        }
        /*
        private String Uppercase() {
            return arguments[0].toUpperCase();
        }
        */
        myPattern = Pattern.compile("([a-z])");
        String retStart= ret.substring(0,1);
        myMatcher = myPattern.matcher(retStart);
        while (myMatcher.find()) {
            //System.out.print("Start index: " + myMatcher.start())
            //System.out.print(" End index: " + myMatcher.end() + " ")
            //System.out.println(myMatcher.group())
            ret = ret.substring(0, myMatcher.end()-1) + ret.substring(myMatcher.end()-1, myMatcher.end()).toUpperCase() + 
            ret.substring(myMatcher.end());
        }
        /*
        if(ret_start.contains(myPattern) >= 0){//if(ret_start.search(myPattern) >= 0){
            ret = ret_start.toUpperCase() + ret.substr(1,ret.length);
        }
        */
        
        return ret;
    }
    public void go_to_new_room(int i){
        //output = "";
        move_to_id = i;
        world_tick();


    }
    public void world_tick(){
        world_tick(0);
    }
    public void world_tick(int fake_tick){//def 0
			
        if(player != null && world != null){
            
            
            /*var mySound:Sound = new Sound(); 
            mySound.addEventListener(SampleDataEvent.SAMPLE_DATA, sineWaveGenerator); 
            
            function sineWaveGenerator(event:SampleDataEvent):void{
                var latency:Number = 0;
                if(sound_music_channel != null)latency = ((event.position/44.1) - sound_music_channel.position);
                trace(latency);
                var times_through:int = event.position / 8192;//this times 172.5 gives how many miliseconds have passed
                var curr_time:Number = times_through * 172.5;
                
                var bpm:int = 120;
                
                var quarter_note:Number = (1/bpm) * 60 * 1000;
                
                for ( var c:int=0; c<  8192; c++ ) {
                    //see http://www.phy.mtu.edu/~suits/notefreqs.html for note frequencies
                    
                    //note every 1024 is something greater than 208 beats per minute
                    //max note length 8192, and still in excess of 208 beats per minute
                        //can use c + event.position to keep longer track... I think... confirmed, but no way to loop... setting event.position buggers things up royally
                            //times_through can be used to loop
                            
                    /*if(c < 1024){
                        event.data.writeFloat(Math.sin(  440 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//440Hz = tuning A
                        event.data.writeFloat(Math.sin(  440 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else if(c < 2048){
                        event.data.writeFloat(Math.sin(  493.88 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//B
                        event.data.writeFloat(Math.sin(  493.88 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else if(c < 3072){
                        event.data.writeFloat(Math.sin(  523.25 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//C
                        event.data.writeFloat(Math.sin(  523.25 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else if(c < 4096){
                        event.data.writeFloat(Math.sin(  587.33 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//D
                        event.data.writeFloat(Math.sin(  587.33 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else if(c < 5120){
                        event.data.writeFloat(Math.sin(  659.26 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//E
                        event.data.writeFloat(Math.sin(  659.26 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else if(c < 6144){
                        event.data.writeFloat(Math.sin(  261.63 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//Middle C
                        event.data.writeFloat(Math.sin(  261.63 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else if(c < 7168){
                        event.data.writeFloat(Math.sin(  246.94 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//B
                        event.data.writeFloat(Math.sin(  246.94 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }else{
                        event.data.writeFloat(Math.sin(  329.63 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));//E
                        event.data.writeFloat(Math.sin(  329.63 * (Number(c+event.position) * Math.PI * 2 /44100.0  )   ));
                    }*//*
                    
                    
                    if(curr_time < quarter_note){
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                        
                    }else if(curr_time < quarter_note*2){
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                    }else if(curr_time < quarter_note*3){
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));							
                    }else if(curr_time < quarter_note*4){
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));	
                    }else{
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));
                        event.data.writeFloat(resonant_freq((Number(c+event.position)),440,0,0));	
                    }}
            }
            
            if(sound_music_channel != null)sound_music_channel.stop();
            //sound_music_channel = mySound.play(); //off... hopefully temporarily
            var intervalIndentifier:uint = setTimeout(stop_sound, 4000 /* milliseconds *//*);
            
            
            function stop_sound():void{
                if(sound_music_channel != null) sound_music_channel.stop();
            }
            */             
            if(fake_tick > 0)player.busy = fake_tick;
            
            if(player.busy > 0){
                //setting this to < 100 is what gets onEnterFrame to kick off the world movement
                /*
                world_gen_progressbar.value = 0;
                world_gen_progressbar.minimum = 100/player.busy;
                world_gen_progressbar.setProgress(world_gen_progressbar.value, 100);
                world_gen_progressbar.visible = true;
                world_gen_progressbar.enabled = true;
                
                Look_button.enabled = false;
                newgame_button.enabled = false;
                Inventory_button.enabled = false;
                appearance.enabled = false;
                status.enabled = false;
                skill_button.enabled = false;
                map_button.enabled = false;
                if(wait_button.label == "Wait")wait_button.enabled = false;
                //movieClip_1.enabled = false;
                save_button.enabled = false;
                //load_button.enabled = false;
                //options_button.enabled = false;
                //text_field.enabled = false;
                */
            }
        }
    }
    public void show_cclass_history(){
        show_cclass_history(0);
    }
    public void show_cclass_history(int i){//def 0
        if(player.location != null){
            if(player.location.getContent(i) instanceof Character){
                textField.setText(((Character)player.location.getContent(i)).get_class_history());
            }
        }
    }
    public void show_skills(){
        show_skills(0,-1,null);
    }
    public void show_skills(int i){
        show_skills(i, -1,null);
    }
    public void show_skills(int i,int j){
        show_skills(i, j,null);
    }
    public void show_skills(int i,int j, ArrayList<Integer> show_children_of){//def 0,-1,null
        String s = "";
        int k = 0;
        
        Character chara;
        
        if(player.party == null){
            chara = player;
        }else{
            chara = player.party.members.get(i);
            if(i+1<player.party.members.size() && j == -1){
                s += "<font color='#0000FF'><a href=\"event:show_skills,"+(i+1)+"\">&gt;&gt;</a></font>\n";
            }
        }
        
        if(j == -1){
            s += chara.skills.show_all_skills(chara, show_children_of);
        }else{
            s += chara.sanitize(chara.increase_skill_by_id(j), player);
            if(show_children_of != null){
                s += "\n<font color='#0000FF'><a href=\"event:show_skills,"+i+",-1,"+new ArrayList<>(show_children_of)/*show_children_of.slice(3, show_children_of.size())*/+"\">back</a></font>";
            }else{
                s += "\n<font color='#0000FF'><a href=\"event:show_skills,"+i+"\">back</a></font>";
            }
        }
        
        if (player.party != null && j == -1){
            if(i>0){
                s += "\n<font color='#0000FF'><a href=\"event:show_skills,"+(i-1)+"\">&lt;&lt;</a></font>";
            }
        }
        textField.setContentType("text/html");
        System.out.println("Trying to set to html...");
        textField.setText("<html><body><p>"+s+ "</p></body></html>");
    }
    public void challenge(String i,String k,String j){
        challenge(i, k, j,null,null);
    }
    public void challenge(String i,String k,String j,String l){
        challenge(i, k, j,l,null);
    }
    public void challenge(String i,String k,String j,String l,ArrayList<Integer> m){//def l=null, m=null
        String s = "";
        if(player == null) return;
        if(player.location == null){
            death();
            return;
        }
        Room start_locat = player.location;
        s = player.fire_challenge(Integer.parseInt(i), Integer.parseInt(k), Integer.parseInt(j), l, m) + "\n";
        
        if (s.toUpperCase().indexOf("<A HREF") > -1){//TODO was >0?
            /*
            save_button.enabled = false;
            appearance.enabled = false;
            status.enabled = false;
            skill_button.enabled = false;
            newgame_button.enabled = false;
            Inventory_button.enabled = false;
            map_button.enabled = false;
            Look_button.enabled = false;
            wait_button.enabled = false;
            */
        }else{
            if(player.location != start_locat){
                look_flag = true;
            }
            /*
            save_button.enabled = true;
            appearance.enabled = true;
            status.enabled = true;
            skill_button.enabled = true;
            newgame_button.enabled = true;
            Inventory_button.enabled = true;
            map_button.enabled = true;
            Look_button.enabled = true;
            wait_button.enabled = true;
            */
            world_tick();
        }
        
        textField.setText(s);
    }
    public void combat(String i, String k, String j){combat(i,k,j,null,null);}
    public void combat(String i, String k, String j, String l){combat(i,k,j,l,null);}
    public void combat(String i, String k, String j, String l, ArrayList<Integer> m){ // def l=null, array=null
        //disable and make the existing gui invisible
        /* TODO implement! 
        int count = 0;
        for(count = 0;count<this.numChildren;count++){
            Object temp_s = this.getChildAt(count);
            temp_s.visible = false;
            temp_s.enabled = false;
        }
        */
        LOGGER.info("Initiating combat (not implemented!)");
        //make the combat_gui visible
        if(Integer.parseInt(j) >= 0){
            Character temp_char = (Character)player.location.getContent(Integer.parseInt(j)) ;
            if(temp_char != null && temp_char.busy <= 1)temp_char.setBusy();
        }
        /*var combat_mc:MovieClip = null; //TODO implement
        try{
            combat_mc = Main_gui.combat_gui(player, Integer.parseInt(i),Integer.parseInt(k),Integer.parseInt(j), this, l, m);
        }catch(e:Error){
            trace("Combat Error: " + e.getStackTrace());
        }finally{
            
        }
        */
        
        /*
        Boolean re_enable = false;
        if(combat_mc != null){
            this.addChild(combat_mc);
        }else{
            re_enable = true;
        }			
        */
        
        if(player.location != null){
            if(player.location.cm != null){
                if(player.location.cm.get_init(player) == player.location.cm.current_int.intValue() && Integer.parseInt(k) == -1 && Integer.parseInt(j) == -1){
                    world_tick(1);
                }
            }
        }
        
        //need to check if combat is active for the player/player party
        /* 
        if(player.location != null){
            if(player.location.cm != null){
                if (player.location.cm.active_combat()){
                    save_button.enabled = false;
                    appearance.enabled = false;
                    status.enabled = false;
                    skill_button.enabled = false;
                    newgame_button.enabled = false;
                    Inventory_button.enabled = false;
                    map_button.enabled = false;
                    Look_button.enabled = false;
                    wait_button.enabled = false;
                }else{
                    re_enable = true;
                }
            }else{
                re_enable = true;
            }
        }else{
            re_enable = true;
        }
        
        if(re_enable){
            reenable_gui();
        }
        */
        
    }
    public void death(){
        /*
        save_button.enabled = false;
        appearance.enabled = false;
        status.enabled = false;
        skill_button.enabled = false;
        Inventory_button.enabled = false;
        map_button.enabled = false;
        Look_button.enabled = false;
        wait_button.enabled = false;
        input_text.visible = false;
        input_text.enabled = false;
        newgame_button.enabled = true;
        newgame_button.label = "New Game";
        */
        textField.setText("You have died.");
    }
    public void talk(String i,String j,String k){
        talk(i, j, k, null,null);
    }
    public void talk(String i,String j,String k,String l){
        talk(i, j, k, l,null);
    }
    public void talk(String i,String j,String k,String l,ArrayList<Integer> m){//def l = null, m = null
        //TODO should dynamic_choice be integer in the character talk? should m?
        Character temp_char = (Character)player.location.getContent(Integer.parseInt(i));
        if(temp_char != null){
            String output = "";
            if(m != null){
                output = temp_char.talk(player, Integer.parseInt(j), Integer.parseInt(k), Integer.parseInt(l), m);
            }else if(l != null){
                output = temp_char.talk(player, Integer.parseInt(j), Integer.parseInt(k), Integer.parseInt(l));
            }else{
                output = temp_char.talk(player, Integer.parseInt(j), Integer.parseInt(k));
            }
            output = temp_char.sanitize(player.sanitize(output,player),player);
            textField.setText(output);
            //var temp_clip:MovieClip = new MovieClip();
            //if(temp_char.location == player.location)temp_clip.addChild(temp_char.draw_34self(714,440,player));
            //temp_clip.addChild(player.draw_34self(174,440,player,true));
            //this.addChildAt(temp_clip,this.getChildIndex(text_field));				
        }
        world_tick();
    }
    public void use_item(String Inv_id) {
        use_item(Inv_id, "null", "null", "null", "null");}
    public void use_item(String Inv_id, String use_case) {
        use_item(Inv_id, use_case, "null", "null", "null");}
    public void use_item(String Inv_id, String use_case, String party_member) {
        use_item(Inv_id, use_case, party_member, "null", "null");}
    public void use_item(String Inv_id, String use_case, String party_member, String Something) {
        use_item(Inv_id, use_case, party_member, Something, "null");}
    public void use_item(String Inv_id, String use_case,  String party_member, String Something, String num_to_move)
    {
        //i k j l num_to_move
        //inv item, use case, party member, something, num_to_move
        //var item_image_id:int = -1;
        //var temp_clip:MovieClip;
        /* 
        if (args.length > 1)
        {
            int inventoryID = Integer.parseInt(args[1]);
        }

        if (args.length > 2)
        {
            int use_case = Integer.parseInt(args[2]);
        }
        int party_member = Integer.parseInt(args[3]);
        int something = Integer.parseInt(args[4]);
        int num_to_move = Integer.parseInt(args[5]);
        */
        if(player.party == null){
            //draw the item image...
            //item_image_id = player.possessions[int(i)].get_image_id();				
            if(use_case != "null"){
                if(num_to_move != "null"){
                    textField.setText(player.use_item(Integer.parseInt(Inv_id), Integer.parseInt(use_case),-1,Integer.parseInt(num_to_move)));
                }else{
                    textField.setText(player.use_item(Integer.parseInt(Inv_id), Integer.parseInt(use_case)));
                }
            }else{
                
                textField.setText(player.use_item(Integer.parseInt(Inv_id)));
            }
            //output = player.sanitize(output,player);
        }else{
            //draw the item image...
            //item_image_id = player.party.members[int(j)].possessions[int(i)].get_image_id();
            
            if(use_case != "null"){
                if(player.party.members.get(Integer.parseInt(party_member)) != player)player.setBusy();
                if(Something == "null"){
                    if(num_to_move != "null"){
                        textField.setText(player.party.members.get(Integer.parseInt(party_member)).use_item(Integer.parseInt(Inv_id), Integer.parseInt(use_case),
                         -1, Integer.parseInt(num_to_move)));
                    }else{
                        textField.setText(player.party.members.get(Integer.parseInt(party_member)).use_item(Integer.parseInt(Inv_id), Integer.parseInt(use_case)));
                    }
                }else{
                    if(num_to_move != "null"){
                        //textField.setText(player.party.members[int(j)].use_item(int(i), int(k), int(l),int(num_to_move)));
                        textField.setText(player.party.members.get(Integer.parseInt(party_member)).use_item(Integer.parseInt(Inv_id), Integer.parseInt(use_case),
                        Integer.parseInt(Something), Integer.parseInt(num_to_move)));
                    }else{
                        //textField.setText(player.party.members[int(j)].use_item(int(i), int(k), int(l)));
                        textField.setText(player.party.members.get(Integer.parseInt(party_member)).use_item(Integer.parseInt(Inv_id), Integer.parseInt(use_case),
                        Integer.parseInt(Something)));
                    }
                }
            }else{
                textField.setText(player.party.members.get(Integer.parseInt(party_member)).use_item(Integer.parseInt(Inv_id)));
            }
            //output = player.party.members.get(Integer.parseInt(party_member)).sanitize(output, player);
        }
        /* 
        if(item_image_id >= 0){
            temp_clip = new MovieClip();
            temp_clip.addChild(FPalace_helper.get_image_by_id(item_image_id));
            temp_clip.scaleX = 100/temp_clip.width;
            temp_clip.scaleY = 100/temp_clip.height;
            temp_clip.x = 663.45;
            temp_clip.y = 426.45;
            this.addChild(temp_clip);
        }
        */
        
        world_tick();

    }
    /* 
    public function use_item(i:String, k:String = null, j:String = null, l:String = null, num_to_move:String = null):void{	
        var item_image_id:int = -1;
        var temp_clip:MovieClip;
        if(player.party == null){
            //draw the item image...
            item_image_id = player.possessions[int(i)].get_image_id();				
            if(k != null){
                if(num_to_move != null){
                    output = player.use_item(int(i), int(k),-1,int(num_to_move));
                }else{
                    output = player.use_item(int(i), int(k));
                }
            }else{
                
                output = player.use_item(int(i));
            }
            output = player.sanitize(output,player);
        }else{
            //draw the item image...
            item_image_id = player.party.members[int(j)].possessions[int(i)].get_image_id();
            
            if(k!= null){
                if(player.party.members[int(j)] != player)player.set_busy();
                if(l == null){
                    if(num_to_move != null){
                        output = player.party.members[int(j)].use_item(int(i), int(k), -1, int(num_to_move));
                    }else{
                        output = player.party.members[int(j)].use_item(int(i), int(k));
                    }
                }else{
                    if(num_to_move != null){
                        output = player.party.members[int(j)].use_item(int(i), int(k), int(l),int(num_to_move));
                    }else{
                        output = player.party.members[int(j)].use_item(int(i), int(k), int(l));
                    }
                }
            }else{
                output = player.party.members[int(j)].use_item(int(i));
            }
            output = player.party.members[int(j)].sanitize(output, player);
        }
        
        if(item_image_id >= 0){
            temp_clip = new MovieClip();
            temp_clip.addChild(FPalace_helper.get_image_by_id(item_image_id));
            temp_clip.scaleX = 100/temp_clip.width;
            temp_clip.scaleY = 100/temp_clip.height;
            temp_clip.x = 663.45;
            temp_clip.y = 426.45;
            this.addChild(temp_clip);
        }
        
        world_tick();
    }
    */
    public void inventory(int in)
    {
        if(player.party == null){			
            textField.setText(player.inventory());
            //temp_clip.addChild(player.draw_self(714,440, null,true));
            //this.addChild(temp_clip);
        }else{
            String s = "";
            if(in+1<player.party.members.size()){
                s += "<font color='#0000FF'><a href=\"event:inventory,"+(in+1)+"\">&gt;&gt;</a></font>\n";
            }
            
            s+= player.party.members.get(in).inventory() + "\n";
            //temp_clip.addChild(player.party.members[i].draw_self(714,440,player,true));
            //this.addChild(temp_clip);
            
            if(in>0){
                s += "<font color='#0000FF'><a href=\"event:inventory,"+(in-1)+"\">&lt;&lt;</a></font>";
            }
            textField.setText(s);
        }
    }
    /* 
    public function inventory(i:int = 0):void{
        //want to include the character.draw_self
        var temp_clip:MovieClip = new MovieClip();
        if(player.party == null){			
            output = player.inventory();
            temp_clip.addChild(player.draw_self(714,440, null,true));
            this.addChild(temp_clip);
        }else{
            var s:String = "";
            if(i+1<player.party.members.length){
                s += "<font color='#0000FF'><a href=\"event:inventory,"+(i+1)+"\">&gt;&gt;</a></font>\n";
            }
            
            s+= player.party.members[i].inventory() + "\n";
            temp_clip.addChild(player.party.members[i].draw_self(714,440,player,true));
            this.addChild(temp_clip);
            
            if(i>0){
                s += "<font color='#0000FF'><a href=\"event:inventory,"+(i-1)+"\">&lt;&lt;</a></font>";
            }
            output = s;
        }
    }
    */
    /*
    public void paint(Graphics g) {  
        super.paint(g);
        g.drawString("Hello",40,40);  
        setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  

          
    }  
    */
    /*
    public void new_player(){
        newPlayer(null);
    }
    public void new_player(ArrayList<Object> argVars){//def null
        int sex_flag = 0;
        String char_name = "";
        int body_flag = 0;
        int eye_flag = 0;
        int hair_flag = 0;
        int age_flag = 0;
        
        int question_num_flag = -1;
        int question_answer_flag = -1;
        if(argVars != null){
            if(!argVars.isEmpty() && argVars.get(0) != null){ 
                sex_flag = (int)argVars.get(0);
            }
            if(argVars.size()>1){//argVars[2] != null){
                if((String)argVars.get(1) == "placeholder"){
                    char_name = input_text.text;
                }else{
                    char_name = (String)argVars.get(1);
                }
            }
            if(argVars.size()>2){//argVars[3] != null){
                body_flag = (int)argVars.get(2);
            }
            if(argVars.size()>3){//argVars[4] != null){
                eye_flag = (int)argVars.get(3);
            }
            if(argVars.size()>4){//argVars[5] != null){
                hair_flag = (int)argVars.get(4);
            }
            if(argVars.size()>5){//argVars[6] != null){
                if(input_text.text != ""){
                    if(argVars.get(5) == "placeholder"){
                        age_flag = Integer.parseInt(input_text.text);
                    }else{
                        age_flag = (int)argVars.get(5);
                    }
                }
            }
            
            if(argVars.size()>6/*argVars[7] != null*//*)question_num_flag = (int)argVars.get(6);
            
            if(argVars.size()>7/*argVars[8] != null*//*)question_answer_flag = (int)argVars.get(7);
        }
        /*TODO
        
        input_text.visible = false;
        input_text.enabled = false;
        input_text.restrict = null;
        input_text.maxChars = 0;
        
        Look_button.enabled = false;
        Inventory_button.enabled = false;
        appearance.enabled = false;
        status.enabled = false;
        skill_button.enabled = false;
        map_button.enabled = false;
        wait_button.enabled = false;
        saveButton.enabled = false;
        *//*
        
        int last_choice_id = 0;
        
        //set the previous questions answers in the array of fate
        if(question_num_flag >= 0 && question_num_flag < array_of_fate.size()){
            int unneeded_stat_id = -1;
            last_choice_id = question_answer_flag;
            if(question_answer_flag == (int)array_of_fate.get(question_num_flag).get(0)){
                unneeded_stat_id = (int)array_of_fate.get(question_num_flag).get(1);
            }else{
                unneeded_stat_id = (int)array_of_fate.get(question_num_flag).get(0);
            }
            int i = 0;
            for(i=0;i<array_of_fate.size();i++){
                if(i == question_num_flag){
                    continue;						
                }else{
                    if((int)array_of_fate.get(i).get(0) == question_answer_flag || (int)array_of_fate.get(i).get(1) == question_answer_flag){
                        if((int)array_of_fate.get(i).get(3) == -1 && (int)array_of_fate.get(question_num_flag).get(3) == -1){
                            array_of_fate.get(i).set(3,0);//array_of_fate[i][3] = 0;
                        }
                        if((int)array_of_fate.get(i).get(3) == -2 && (int)array_of_fate.get(question_num_flag).get(3) == -2){
                            array_of_fate.get(i).set(3,0);//array_of_fate[i][3] = 0;
                        }
                    }
                    if((int)array_of_fate.get(i).get(0) == unneeded_stat_id || (int)array_of_fate.get(i).get(1) == unneeded_stat_id){
                        if((int)array_of_fate.get(i).get(3) == -2 && (int)array_of_fate.get(question_num_flag).get(3) == -2){
                            array_of_fate.get(i).set(3,-3);//array_of_fate[i][3] = -3;
                        }
                        if((int)array_of_fate.get(i).get(3) == -1 && (int)array_of_fate.get(question_num_flag).get(3) == -1){
                            array_of_fate.get(i).set(3,-2);//array_of_fate[i][3] = -2;
                        }
                        if((int)array_of_fate.get(i).get(3) == 0 && (int)array_of_fate.get(question_num_flag).get(3) == 0){
                            array_of_fate.get(i).set(3,-3);//array_of_fate[i][3] = -3;
                        }						 
                    }
                }
            }
            
            array_of_fate.get(question_num_flag).set(3,question_answer_flag);//array_of_fate[question_num_flag][3] = question_answer_flag;
        }
        
        if (world == null){
            world = new World();
            world_gen = true;
            //world_gen_progressbar.visible = true;
            //world_gen_progressbar.enabled = true;
            world = FPalace_content.new_world(world/*, world_gen_progressbar*//*);				
        }

        if (sex_flag == 0){
            textField.setText("Today, while walking on your way home, you notice a familiar empty lot occupied by what appears to be a covered wooden caravan cart, not unlike those you've heard of gypsies using in days gone by. Out front, a large, garishly painted sign proclaims the strange carts intentions:\n\n"
            +"<i>Fortunes told!</i>\n"
            +"<b>Today Only</b>\n"
            +"<b><i>FREE!</i></b>\n\n"
            + "Looking around, none of the other passersby seem to notice the out of place cart, and a sense of foreboding come over you. Curiosity wins, and you creep up to the cart, risking a peek in....\n\n"
            + "\"Who's there!\" A decrepit and gasping female voice echos as soon as soon as your eyes fall on the deteriorating old gypsy, her robes a mish-mash of colour that assaults your eyes, and the glassy stare coming from her un-nerving you.\n\n"
            + "\"A customer! Come in!\" the woman cries as you begin to shy from the doorstep. The desperation in her voice has you a few steps in the cramped space of the cart before you realize what's happening. \"Sit sit!\" she says, coughing and gesturing vaguely across the scarred wooden table she sits at.\n\n"
            + "You're barely in place before the gypsy begins apologizing about the state of affairs around the cart. You sit awkwardly as her pale gaze jumps about the small space, until finally it falls on you."
            + "\"I'm sorry to ask...\" she says \"... but even I'm not what I used to be.\" The comment is punctuated by a coughing fit, before she continues. \"Silent as you are, I'm afraid I have to know before we start... are you a man, or a woman?\"\n\n"
            +"What sex would you like to be? <font color='#0000FF'><a href=\"event:new_player,1\">Male</a> <a href=\"event:new_player,2\">Female</a></font>");
                            
            return;
        }
        
        if(char_name == ""){
            if(world_gen){
               world = FPalace_content.new_world(world/*, world_gen_progressbar*//*);
            }
            /*
            input_text.text = "Player";
            input_text.restrict = "a-zA-Z '";
            input_text.setStyle("textFormat", textfield_text_format);
            input_text.height = textfield_text_format.size + 10;
            text_field.htmlText = "\"And your name?\" the old gypsy asks, a distinct lack of surprise at your answer to the last question. Thinking over it for a few moments, you decide to tell the gypsy your name is ";
            input_text.x = text_field.x + 10;//text_field.textField.textWidth;
            input_text.y = text_field.y + text_field.textField.textHeight + input_text.height/2;
            input_text.addEventListener(KeyboardEvent.KEY_UP, done_key_press);
            var m:Main = this;
            function done_key_press(e:KeyboardEvent):void{
                if(e.keyCode == combat_confirm_keycode){
                    var new_e:TextEvent = new TextEvent(TextEvent.LINK, false, false, "new_player,"+sex_flag+",placeholder");								
                    m.linkHandler(new_e);
                    input_text.removeEventListener(KeyboardEvent.KEY_UP, done_key_press);
                }
            }
            *//*
            //text_field.htmlText = "";
            
            textField.setText("\"And your name?\" the old gypsy asks, a distinct lack of surprise at your answer to the last question. Thinking over it for a few moments, you decide to tell the gypsy your name is \n\n\n <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+",placeholder\">Done</a></font>");
            //input_text.visible = true;
            //input_text.enabled = true;
            
            return;
        }
        
        if (body_flag == 0){
            if(world_gen){
               world = FPalace_content.new_world(world, world_gen_progressbar);
            }
            output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
            + "Not sure what she means, you sit gaping at the odd sight of the ancient woman until she <i>hrrmphs</i> and raises her boney hands towards you, wriggling fingers and saying \"I can find out for myself if you're going to give me the silent treatment....\"\n\n"
            + "The screeching as your chair backs up stops her. \"Oh? Not interested?\" The grin on the gypsies face is mindnumbingly disturbing as drool steadily flows from a hanging lip. Before long you make the decision that it's time to leave, but the gypsy seems to sense your anxiety and begins to plead \"Don't go! Please! It was just a jest! A joke! Yes! You can forgive an old woman, yes?\" You get the sense that if she could move more easily, she would have been kissing your feet by the end, but instead she was bowing her head into the table. \"Please...\" she continue \"I only meant to ask what type of body you've ended up with.\" As if to drive the point home, she casually begins \"I'm blind you see...\" before trailing off.\n\n"
            + "What body type do you have? <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+",1\">Athletic</a> <a href=\"event:new_player,"+sex_flag+","+char_name+",2\">Chubby</a> <a href=\"event:new_player,"+sex_flag+","+char_name+",3\">Slim</a></font>";
            //Slim, Muscular, Chubby for both sexes... Ectomorphic, Mesomorphic, Endomorphic in reality
            
            return;
        }
        
        //race?
        //hair colour and length (eye colour?)
        if(eye_flag == 0){
            if(world_gen){
               world = FPalace_content.new_world(world/*, world_gen_progressbar*//*);
            }
            output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
            + "What eye colour do you have? <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+",4\">Brown</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+",8\">Green</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+",14\">Blue</a></font>";
            
            return;
        }
        if(hair_flag == 0){
            if(world_gen){
               world = FPalace_content.new_world(world/*, world_gen_progressbar*//*);
            }
            output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
            + "What hair colour do you have? <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+",2\">Black</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+",5\">Brown</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+",7\">Red</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+",4\">Blonde</a></font>";
            
            return;
        }
        //age
        if(age_flag == 0){
            if(world_gen){
               world = FPalace_content.new_world(world, world_gen_progressbar);
            }
            //Should really let the player enter their age... with a minimum check...
            text_field.htmlText = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
            + "How old are you?";
            input_text.text = "23";
            input_text.restrict = "0-9";
            input_text.maxChars = 2;
            input_text.x = text_field.x + 10;//text_field.textField.textWidth;
            input_text.y = text_field.y + text_field.textField.textHeight + input_text.height/2;
            input_text.addEventListener(KeyboardEvent.KEY_UP, done_age_press);
            MainGUIPanel m = this;
            void done_age_press(KeyboardEvent e){
                if(e.keyCode == combat_confirm_keycode){
                    var new_e:TextEvent = new TextEvent(TextEvent.LINK, false, false, "new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",placeholder");								
                    m.linkHandler(new_e);
                    input_text.removeEventListener(KeyboardEvent.KEY_UP, done_age_press);
                }
            }
            text_field.htmlText = "";
            output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
            + "How old are you?\n\n\n <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",placeholder\">Done</a></font>";// <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",18\">18</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",23\">23</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",28\">28</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",33\">33</a> <a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+",38\">38</a></font>";
            
            input_text.visible = true;
            input_text.enabled = true;
            
            return;
        }
        
        //create the array_of_fate
        if(array_of_fate == null){
            output = "Joints straining with every motion, you can't help but find yourself waiting for a sickening snap as the ancient woman reaches into a pile of seemingly useless junk and extracts a small book, no larger than a deck of cards. She flips it open and stares with her useless milky white eyes for a moment before eight cards slip from its pages and land on the table between you. The strange gypsy seems almost surprised at the sound of the cards dropping, and <i>hrrmphs</i> again.\n\n" 
            + "\"A bit special, are we?\" The woman says under her breath as she places the open book on the table, giving you a glimpse. You don't even recognize the alphabet of the letters before the gypsy suddenly slams it shut, and you can see a bruise already beginning to form in the palm of her hand from the force. A slight wince of pain crosses her face, and you can see her strain to pick up the cards.\n\n"
            + "You do your best to read the expression on her face, but can't help but be confused by the sightless gaze directed at the cards. A solemn tone enters the gypsies voice as she places the cards face down in a pile and draws two of them face up between you.\n\n";
            
            array_of_fate = new ArrayList<>();
            //Utima style questions to determine primary and secondary stats
            //Str - Dex =
            array_of_fate[0] = new Array();
            array_of_fate[0][0] = FPalace_helper.str_id;
            array_of_fate[0][1] = FPalace_helper.dex_id;
            array_of_fate[0][2] = "Question\n";
            array_of_fate[0][3] = -1;
            array_of_fate[0][4] = "Strength";
            array_of_fate[0][5] = "Dexterity";
            //Str - Con =
            array_of_fate[1] = new Array();
            array_of_fate[1][0] = FPalace_helper.str_id;
            array_of_fate[1][1] = FPalace_helper.con_id;
            array_of_fate[1][2] = "Question\n";
            array_of_fate[1][3] = -1;
            array_of_fate[1][4] = "Strength";
            array_of_fate[1][5] = "Constitution";
            //Str - Sex Appeal =
            array_of_fate[2] = new Array();
            array_of_fate[2][0] = FPalace_helper.str_id;
            array_of_fate[2][1] = FPalace_helper.sex_appeal_id;
            array_of_fate[2][2] = "Question\n";
            array_of_fate[2][3] = -1;
            array_of_fate[2][4] = "Strength";
            array_of_fate[2][5] = "Beauty";
            //Str - Will =
            array_of_fate[3] = new Array();
            array_of_fate[3][0] = FPalace_helper.str_id;
            array_of_fate[3][1] = FPalace_helper.will_id;
            array_of_fate[3][2] = "Question\n";
            array_of_fate[3][3] = -1;
            array_of_fate[3][4] = "Strength";
            array_of_fate[3][5] = "Willpower";
            //Str - Wis = 
            array_of_fate[4] = new Array();
            array_of_fate[4][0] = FPalace_helper.str_id;
            array_of_fate[4][1] = FPalace_helper.wis_id;
            array_of_fate[4][2] = "Question\n";
            array_of_fate[4][3] = -1;
            array_of_fate[4][4] = "Strength";
            array_of_fate[4][5] = "Wisdom";
            //Str - Int =
            array_of_fate[5] = new Array();
            array_of_fate[5][0] = FPalace_helper.str_id;
            array_of_fate[5][1] = FPalace_helper.int_id;
            array_of_fate[5][2] = "Question\n";
            array_of_fate[5][3] = -1;
            array_of_fate[5][4] = "Strength";
            array_of_fate[5][5] = "Intelligence";
            //Str - Cha =
            array_of_fate[6] = new Array();
            array_of_fate[6][0] = FPalace_helper.str_id;
            array_of_fate[6][1] = FPalace_helper.cha_id;
            array_of_fate[6][2] = "Question\n";
            array_of_fate[6][3] = -1;
            array_of_fate[6][4] = "Strength";
            array_of_fate[6][5] = "Charisma";
            //Dex - Con = 
            array_of_fate[7] = new Array();
            array_of_fate[7][0] = FPalace_helper.dex_id;
            array_of_fate[7][1] = FPalace_helper.con_id;
            array_of_fate[7][2] = "Question\n";
            array_of_fate[7][3] = -1;
            array_of_fate[7][4] = "Dexterity";
            array_of_fate[7][5] = "Constitution";
            //Dex - Sex Appeal = 
            array_of_fate[8] = new Array();
            array_of_fate[8][0] = FPalace_helper.dex_id;
            array_of_fate[8][1] = FPalace_helper.sex_appeal_id;
            array_of_fate[8][2] = "Question\n";
            array_of_fate[8][3] = -1;
            array_of_fate[8][4] = "Dexterity";
            array_of_fate[8][5] = "Beauty";
            //Dex - Will =
            array_of_fate[9] = new Array();
            array_of_fate[9][0] = FPalace_helper.dex_id;
            array_of_fate[9][1] = FPalace_helper.will_id;
            array_of_fate[9][2] = "Question\n";
            array_of_fate[9][3] = -1;
            array_of_fate[9][4] = "Dexterity";
            array_of_fate[9][5] = "Willpower";
            //Dex - Wis = 
            array_of_fate[10] = new Array();
            array_of_fate[10][0] = FPalace_helper.dex_id;
            array_of_fate[10][1] = FPalace_helper.wis_id;
            array_of_fate[10][2] = "Question\n";
            array_of_fate[10][3] = -1;
            array_of_fate[10][4] = "Dexterity";
            array_of_fate[10][5] = "Wisdom";
            //Dex - Int = 
            array_of_fate[11] = new Array();
            array_of_fate[11][0] = FPalace_helper.dex_id;
            array_of_fate[11][1] = FPalace_helper.int_id;
            array_of_fate[11][2] = "Question\n";
            array_of_fate[11][3] = -1;
            array_of_fate[11][4] = "Dexterity";
            array_of_fate[11][5] = "Intelligence";
            //Dex - Cha = 
            array_of_fate[12] = new Array();
            array_of_fate[12][0] = FPalace_helper.dex_id;
            array_of_fate[12][1] = FPalace_helper.cha_id;
            array_of_fate[12][2] = "Question\n";
            array_of_fate[12][3] = -1;
            array_of_fate[12][4] = "Dexterity";
            array_of_fate[12][5] = "Charisma";
            //Con - Sex Appeal = 
            array_of_fate[13] = new Array();
            array_of_fate[13][0] = FPalace_helper.con_id;
            array_of_fate[13][1] = FPalace_helper.sex_appeal_id;
            array_of_fate[13][2] = "Question\n";
            array_of_fate[13][3] = -1;
            array_of_fate[13][4] = "Constitution";
            array_of_fate[13][5] = "Beauty";
            //Con - Will = 
            array_of_fate[14] = new Array();
            array_of_fate[14][0] = FPalace_helper.con_id;
            array_of_fate[14][1] = FPalace_helper.will_id;
            array_of_fate[14][2] = "Question\n";
            array_of_fate[14][3] = -1;
            array_of_fate[14][4] = "Constitution";
            array_of_fate[14][5] = "Willpower";
            //Con - Wis = 
            array_of_fate[15] = new Array();
            array_of_fate[15][0] = FPalace_helper.con_id;
            array_of_fate[15][1] = FPalace_helper.wis_id;
            array_of_fate[15][2] = "Question\n";
            array_of_fate[15][3] = -1;
            array_of_fate[15][4] = "Constitution";
            array_of_fate[15][5] = "Wisdom";
            //Con - Int = 
            array_of_fate[16] = new Array();
            array_of_fate[16][0] = FPalace_helper.con_id;
            array_of_fate[16][1] = FPalace_helper.int_id;
            array_of_fate[16][2] = "Question\n";
            array_of_fate[16][3] = -1;
            array_of_fate[16][4] = "Constitution";
            array_of_fate[16][5] = "Intelligence";
            //Con - Cha = 
            array_of_fate[17] = new Array();
            array_of_fate[17][0] = FPalace_helper.con_id;
            array_of_fate[17][1] = FPalace_helper.cha_id;
            array_of_fate[17][2] = "Question\n";
            array_of_fate[17][3] = -1;
            array_of_fate[17][4] = "Constitution";
            array_of_fate[17][5] = "Charisma";
            //Sex Appeal - Will = 
            array_of_fate[18] = new Array();
            array_of_fate[18][0] = FPalace_helper.sex_appeal_id;
            array_of_fate[18][1] = FPalace_helper.will_id;
            array_of_fate[18][2] = "Question\n";
            array_of_fate[18][3] = -1;
            array_of_fate[18][4] = "Beauty";
            array_of_fate[18][5] = "Willpower";
            //Sex Appeal - Wis = 
            array_of_fate[19] = new Array();
            array_of_fate[19][0] = FPalace_helper.sex_appeal_id;
            array_of_fate[19][1] = FPalace_helper.wis_id;
            array_of_fate[19][2] = "Question\n";
            array_of_fate[19][3] = -1;
            array_of_fate[19][4] = "Beauty";
            array_of_fate[19][5] = "Wisdom";
            //Sex Appeal - Int = 
            array_of_fate[20] = new Array();
            array_of_fate[20][0] = FPalace_helper.sex_appeal_id;
            array_of_fate[20][1] = FPalace_helper.int_id;
            array_of_fate[20][2] = "Question\n";
            array_of_fate[20][3] = -1;
            array_of_fate[20][4] = "Beauty";
            array_of_fate[20][5] = "Intelligence";
            //Sex Appeal - Cha = 
            array_of_fate[21] = new Array();
            array_of_fate[21][0] = FPalace_helper.sex_appeal_id;
            array_of_fate[21][1] = FPalace_helper.cha_id;
            array_of_fate[21][2] = "Question\n";
            array_of_fate[21][3] = -1;
            array_of_fate[21][4] = "Beauty";
            array_of_fate[21][5] = "Charisma";
            //Will - Wis = 
            array_of_fate[22] = new Array();
            array_of_fate[22][0] = FPalace_helper.will_id;
            array_of_fate[22][1] = FPalace_helper.wis_id;
            array_of_fate[22][2] = "Question\n";
            array_of_fate[22][3] = -1;
            array_of_fate[22][4] = "Willpower";
            array_of_fate[22][5] = "Wisdom";
            //Will - Int = 
            array_of_fate[23] = new Array();
            array_of_fate[23][0] = FPalace_helper.will_id;
            array_of_fate[23][1] = FPalace_helper.int_id;
            array_of_fate[23][2] = "Question\n";
            array_of_fate[23][3] = -1;
            array_of_fate[23][4] = "Willpower";
            array_of_fate[23][5] = "Intelligence";
            //Will - Cha = 
            array_of_fate[24] = new Array();
            array_of_fate[24][0] = FPalace_helper.will_id;
            array_of_fate[24][1] = FPalace_helper.cha_id;
            array_of_fate[24][2] = "Question\n";
            array_of_fate[24][3] = -1;
            array_of_fate[24][4] = "Willpower";
            array_of_fate[24][5] = "Charisma";
            //Wis - Int = 
            array_of_fate[25] = new Array();
            array_of_fate[25][0] = FPalace_helper.wis_id;
            array_of_fate[25][1] = FPalace_helper.int_id;
            array_of_fate[25][2] = "Question\n";
            array_of_fate[25][3] = -1;
            array_of_fate[25][4] = "Wisdom";
            array_of_fate[25][5] = "Intelligence";
            //Wis - Cha = 
            array_of_fate[26] = new Array();
            array_of_fate[26][0] = FPalace_helper.wis_id;
            array_of_fate[26][1] = FPalace_helper.cha_id;
            array_of_fate[26][2] = "Question\n";
            array_of_fate[26][3] = -1;
            array_of_fate[26][4] = "Wisdom";
            array_of_fate[26][5] = "Charisma";
            //Int - Cha = 
            array_of_fate[27] = new Array();
            array_of_fate[27][0] = FPalace_helper.int_id;
            array_of_fate[27][1] = FPalace_helper.cha_id;
            array_of_fate[27][2] = "Question\n";
            array_of_fate[27][3] = -1;
            array_of_fate[27][4] = "Intelligence";
            array_of_fate[27][5] = "Charisma";
        }else{
            output = "The gypsy listens to your answer, and almost immediately returns the cards to the short deck before giving it a shuffle and drawing two more cards.\n\n";
            
        }
        
        //determine which question to ask;
        var question_num:int = Math.round(Math.random()*(array_of_fate.length-1));//random starting question...
        var num_checked:int = 0;
        
        while(array_of_fate[question_num][3] != -1){//asked, or superfluous question
            if(num_checked >= array_of_fate.length){
                num_checked = -1;
                break;
            }
            num_checked++;
            question_num++;
            if(question_num >= array_of_fate.length)question_num = 0;
        }
        
        if(num_checked == -1){
            question_num = Math.round(Math.random()*(array_of_fate.length-1));//random starting question...
            num_checked = 0;
            while(array_of_fate[question_num][3] != -2){
                if(num_checked >= array_of_fate.length){
                    num_checked = -1;
                    break;
                }
                num_checked++;
                question_num++;
                if(question_num >= array_of_fate.length)question_num = 0;
            }
            
            if(num_checked == -1){
                question_num = Math.round(Math.random()*(array_of_fate.length-1));//random starting question...
                num_checked = 0;
                while(array_of_fate[question_num][3] != 0){
                    if(num_checked >= array_of_fate.length){
                        num_checked = -1;
                        break;
                    }
                    num_checked++;
                    question_num++;
                    if(question_num >= array_of_fate.length)question_num = 0;
                }
            }
            
        }
        
        //ask the questions
        if(num_checked != -1){
            output += array_of_fate[question_num][2] + "<font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+","+age_flag+","+question_num+","+array_of_fate[question_num][0]+"\">"+array_of_fate[question_num][4]+"</a></font> or <font color='#0000FF'><a href=\"event:new_player,"+sex_flag+","+char_name+","+body_flag+","+eye_flag+","+hair_flag+","+age_flag+","+question_num+","+array_of_fate[question_num][1]+"\">"+array_of_fate[question_num][5]+"</a></font>";
            if(world_gen){
                world = FPalace_content.new_world(world, world_gen_progressbar);
            }
            return;
        }
        world.set_settings([mini_map,textfield_text_format.size,combat_text_format.size,quickload_keycode,quicksave_keycode,
            appearance_keycode,map_keycode,inventory_keycode,status_keycode,look_keycode,wait_keycode,ne_keycode,n_keycode,nw_keycode,
            e_keycode,w_keycode,se_keycode,s_keycode,sw_keycode,combat_confirm_keycode,combat_up_keycode,combat_down_keycode,combat_right_keycode,combat_left_keycode]);
        
        world_gen = false;
        world_gen_progressbar.visible = false;
        world_gen_progressbar.enabled = false;
        Look_button.enabled = true;
        Inventory_button.enabled = true;
        appearance.enabled = true;
        status.enabled = true;
        skill_button.enabled = true;
        map_button.enabled = true;
        save_button.enabled = true;
        wait_button.enabled = true;
        save_button.enabled = true;
        newgame_button.label = "Journal";
        
        player = null;
        player = new Character(char_name);

        var race:Race = FPalace_races.race_human();
        //var race:Race = FPalace_races.race_goo();
        
        player.new_body_part(FPalace_helper.new_hair(race,1/*hair length*//*,hair_flag));
        player.new_body_part(FPalace_helper.new_head(race));
        player.new_body_part(FPalace_helper.new_eyes(race,eye_flag-9.9));
        player.new_body_part(FPalace_helper.new_torso(race));
        player.new_body_part(FPalace_helper.new_left_arms(race));
        player.new_body_part(FPalace_helper.new_left_hands(race));
        player.new_body_part(FPalace_helper.new_right_arms(race));
        player.new_body_part(FPalace_helper.new_right_hands(race));
        player.new_body_part(FPalace_helper.new_hips(race));
        player.new_body_part(FPalace_helper.new_left_legs(race));
        player.new_body_part(FPalace_helper.new_left_feet(race));
        player.new_body_part(FPalace_helper.new_right_legs(race));
        player.new_body_part(FPalace_helper.new_right_feet(race));

        if (sex_flag == 1){
            player.new_body_part(FPalace_helper.new_penis(race));
            player.new_body_part(FPalace_helper.new_balls(race));
            
            if(body_flag == 1){
                
            }else if(body_flag == 2){
                player.apply_affect_by_id(FPalace_helper.waist_id,8);
                player.apply_affect_by_id(FPalace_helper.hips_id,4);
            }else if(body_flag == 3){
                player.apply_affect_by_id(FPalace_helper.bust_id,-4);
                player.apply_affect_by_id(FPalace_helper.hips_id,-4);
            }
        }

        if (sex_flag == 2){
            player.new_body_part(FPalace_helper.new_breasts(race));
            player.new_body_part(FPalace_helper.new_vagina(race));
            player.new_body_part(FPalace_helper.new_clit(race));
            
            if(body_flag == 1){
                
            }else if(body_flag == 2){
                player.apply_affect_by_id(FPalace_helper.bust_id,4);
                player.apply_affect_by_id(FPalace_helper.waist_id,8);
                player.apply_affect_by_id(FPalace_helper.hips_id,4);
                player.apply_affect_by_id(FPalace_helper.breast_size_id,3);
                player.apply_affect_by_id(FPalace_helper.milk_volume_id,40);
                
            }else if(body_flag == 3){
                player.apply_affect_by_id(FPalace_helper.bust_id,-4);
                player.apply_affect_by_id(FPalace_helper.hips_id,-4);
                player.apply_affect_by_id(FPalace_helper.breast_size_id,-2);
                player.apply_affect_by_id(FPalace_helper.milk_volume_id,-40);
            }
        }
        
        i = 0;
        for(i;i<array_of_fate.length;i++){
            if(array_of_fate[i][3] > 0){
                player.apply_affect_by_id(array_of_fate[i][3],1,0,null,Body.change_stats_total);
            }
        }
        array_of_fate = null;
        
        player.apply_affect_by_id(FPalace_helper.str_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.dex_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.con_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.sex_appeal_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.int_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.wis_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.will_id,-1,0,null,Body.change_stats_total);
        player.apply_affect_by_id(FPalace_helper.cha_id,-1,0,null,Body.change_stats_total);
                    
        if(age_flag != 23){
            player.apply_affect_by_id(FPalace_helper.age_id,age_flag-23,0,null,Body.change_stats_total);
        }
        player.personality.determine_orient(player.sex);
        
        //grasslands/sex_appeal = 0
        //forest/wisdom = 1
        //desert/willpower = 2
        //mountains/strength = 3
        //volcano/intelligence = 4
        //snow plains/charisma = 5
        //shrublands/dexterity = 6
        //savanna/constitution = 7
        
        if(last_choice_id == FPalace_helper.sex_appeal_id){
            player.new_location(world.get_starting_room(0),true);
        }else if(last_choice_id == FPalace_helper.wis_id){
            player.new_location(world.get_starting_room(1),true);
        }else if(last_choice_id == FPalace_helper.will_id){
            player.new_location(world.get_starting_room(2),true);
        }else if(last_choice_id == FPalace_helper.str_id){
            player.new_location(world.get_starting_room(3),true);
        }else if(last_choice_id == FPalace_helper.int_id){
            player.new_location(world.get_starting_room(4),true);
        }else if(last_choice_id == FPalace_helper.dex_id){
            player.new_location(world.get_starting_room(6),true);
        }else if(last_choice_id == FPalace_helper.cha_id){
            player.new_location(world.get_starting_room(5),true);
        }else if(last_choice_id == FPalace_helper.con_id){
            player.new_location(world.get_starting_room(7),true);
        }else{
            player.new_location(world.get_starting_room(Math.round(Math.random()*7)),true);
        }			
        
        player.location.player_found();
                                
        //player.apply_affect_by_id(FPalace_helper.max_hp_id,90,0,null,Body.change_stats_total);
        //player.apply_affect_by_id(FPalace_helper.str_id,20,0,null,Body.change_stats_total);
        //player.apply_affect_by_id(FPalace_helper.lust_id,30,0,null,Body.change_stats_total);
        //player.apply_affect_by_id(FPalace_helper.dex_id,20,0,null,Body.change_stats_total);
        
        
        /*
        player.set_character_class(FPalace_classes.cclass_martial_artist());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_barbarian());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_sword_dancer());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_spellsword());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_viking());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_gladiator());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_warrior());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_dragoon());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_pirate());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_con_artist());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_spellthief());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_ranger());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_ninja());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_thief());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_fighter());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_soldier());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_mercenary());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_geomancer());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_paladin());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_grappler());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_knight());
        player.set_xp(400000);			
        player.set_character_class(FPalace_classes.cclass_dominatrix());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_sexmagus());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_fertility_nun());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_warmage());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_chronomancer());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_necromancer());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_summoner());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_sorcerer());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_wizard());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_witch());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_crusader());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_druid());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_medic());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_oracle());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_cleric());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_monk());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_prophet());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_duelist());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_assassin());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_scholar());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_gambler());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_bibliomancer());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_occultist());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_archeologist());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_swashbuckler());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_bard());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_lord());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_diplomat());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_beastmaster());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_missionary());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_spy());
        player.set_xp(400000);		
        player.set_character_class(FPalace_classes.cclass_gene_splice());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_fleshstealer());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_stripper());
        player.set_xp(400000);
        player.set_character_class(FPalace_classes.cclass_alchemist());
        player.set_xp(400000);			
        *//*
        player.set_character_class(FPalace_classes.cclass_adventurer());
        
        player.skills.set_skill_value(player, FPalace_skills.adventure_id, 1);
        player.skills.set_skill_value(player, FPalace_skills.fight_id, 1);
        player.skills.set_skill_value(player, FPalace_skills.knowledge_id, 1);
        player.skills.set_skill_value(player, FPalace_skills.people_id, 1);
        
        //player.skills.set_skill_value(player, FPalace_skills.item_effects_id, 5);	
        
        //player.personality.add_recipe(FPalace_items.white_blouse());
        
        player.set_xp(9);
        
        //player.personality.set_job(FPalace_classes.job_prostitute(),player);
                    
        var main_quest:Quest = new Quest();
        main_quest.set_name("Getting Home");
        main_quest.new_objective("Figure out where you are",Quest.talk_action,null);
        main_quest.add_conversation_topic(FPalace_topics.topic_help(main_quest),0);
        
        main_quest.new_objective("Find Century City",Quest.area_action,[10/*Century City Area ID*//*]);
        
        main_quest.new_objective("Learn about the Lost",Quest.talk_action,null);
        
        player.personality.new_objective(main_quest, player);
        
        player.set_busy();
        player.tick();
        
        player.reset_stats();
        player.body.check_state(player);
        
        //player.char_sprite_id = FPalace_helper.animated_test_img;
        
        //var item:Item;			
        //item = FPalace_items.horny_chastity_belt();
        //item = FPalace_items.Tent();
        //item = FPalace_items.Stallion_Stout();
        //item = FPalace_items.bovine_milk_jug();
        //item = FPalace_items.caudata_egg();
        //item = FPalace_items.baby_berry();
        //item = FPalace_items.iceberg_lettuce();
        //item = FPalace_items.pleni_chili();
        //item = FPalace_items.baggy_bluejeans();
        //item = FPalace_items.futa_cola();
        //item = FPalace_items.hermpire_ring();
        //item = FPalace_items.be_cock_ring();
        //item = FPalace_items.manyuu_blade();
        //item = FPalace_items.naughty_pictures();
        //item = FPalace_items.bottled_abortion();
        //item = FPalace_items.pregnaid();
        //item = FPalace_items.bronze_shortsword_recipe();
        //item = FPalace_items.strong_grip();
        //item = FPalace_items.maternity_bra();
        //item = FPalace_items.reduction_salve();
        //item = FPalace_items.lactaid();
        //item = FPalace_items.mighty_whities();
        //item = FPalace_items.habit();
        //item = FPalace_items.bronze_gauntlets();
        //item = FPalace_items.goggles();
        //item = FPalace_items.spandex_suit();
        //item = FPalace_items.whip();
        //item = FPalace_items.training_bra();
        //item = FPalace_items.jutting_jockstrap();
        //item = FPalace_items.queens_cock_ring();
        //item = FPalace_items.prosperous_one_piece();
        //item = FPalace_items.rapunzels_ribbon();
        //item = FPalace_items.booty_thong();			
        //item = FPalace_items.girdle_masculin_feminin();
        //item = FPalace_items.Spam_PLength();
        //item = FPalace_items.Fem_BreastSize();
        //item = FPalace_items.maidens_wand();
        //item = FPalace_items.weight_loss_pills();
        //item = FPalace_items.mushrooms()
        //item = FPalace_items.catnip();
        //item = FPalace_items.textiles();
        //item = FPalace_items.Prothg_wine();
        //item = FPalace_items.fancy_pee_cap();
        //item = FPalace_items.bronze_salet();
        //item = FPalace_items.knife();
        /*
        item = new Item("Test");
        item.set_dropped_description("a test item sits lazily on the ground here");
        item.set_inventory_description("test");
        item.set_use_description("</n> smashes the test.");
        item.set_image_id(FPalace_helper.unknown_img);
        item.set_identify_difficulty(2);
        item.add_effect(FPalace_helper.cum_volume_id, -1000);
        item.set_value(10);
        */
        //player.add_to_possessions(item);
        
        //var temp_npc:Character;
        //temp_npc = FPalace_npcs.FPalace_Librarian().gen_char();
        //temp_npc = FPalace_npcs.female_elf().gen_char();
        //temp_npc = FPalace_npcs.cat_girl().gen_char();
        //temp_npc = FPalace_npcs.futa_high_Female().gen_char();
        //temp_npc = FPalace_npcs.futa_high_Male().gen_char();
        //temp_npc = FPalace_npcs.Amazonian_Isle_Amazon().gen_char();
        //temp_npc = FPalace_npcs.spider_girl().gen_char();
        //temp_npc = FPalace_npcs.goo_girl().gen_char();
        //temp_npc = FPalace_npcs.FPalace_Artist_Linty();
        //temp_npc = FPalace_npcs.goo_slime().gen_char();
        //temp_npc = FPalace_npcs.century_city_brian();
        //temp_npc = FPalace_npcs.century_city_anna();
        //temp_npc = FPalace_npcs.century_city_zoe();
        //temp_npc = FPalace_npcs.century_city_catherine();
        
        //temp_npc.personality.new_relationship(player,100);
        //player.personality.new_relationship(temp_npc,100);
        //temp_npc.new_location(player.location,true);
        /*
        player.party = new Party();
        player.party.add_member(player);
        player.party.add_member(temp_npc);
        *//*
                    
        textField.setText("\"Well...\" the gypsy begins, a look of concern upon her face, \"Here is your fortune.\" She pauses again, lowering her voice, and forcing you to lean in to hear. \n\n"
        + "\"You will lead an interesting life....\" The look of pain that crosses the old womans age distorted face confuses you at first, but it changes and morphs rapidly into a strange seething anger. \"OUT!\" The yell nearly knocks you from your chair, as you find yourself jerking backward.\n\n"
        +"\"I can't have someone like you here! OUT!\" The gypsy yells again, and you are slathered in spittle and drool as it leaps from her mouth. Your welcome clearly over-stayed, you acquiesce to the womans demands, quickly shuffling out of the crowded cart. It cost nothing, but you still can't help but feel cheated by the strange experience as you walk home.\n\n"
        +"The strange experience sticks with you through the rest of the day, and as you find yourself falling asleep the gypsies fortune weighs on your mind. A strange nightmare filled sleep envelopes you, the terrible gypsies strange demeanor and gestures amplified and made more monstrous by recollection, until you find yourself leaping from sleep and back to reality, only to find yourself no longer where you fell asleep, the searing light of the sun beating upon your freshly opened eyes. \n\nYou're not quite sure what's going on. ");
        //look_flag = true;
        
        create_mini_map();
        
        LOGGER.log("(MAIN)play started");			
    }
    */
    
}