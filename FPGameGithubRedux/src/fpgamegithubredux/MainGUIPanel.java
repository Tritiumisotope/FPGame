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
    
    protected JTextField inputText;
    protected JTextPane textField;
    private static final Logger LOGGER = Logger.getLogger(MainGUIPanel.class.getName());
    protected Font theFont;
    protected int[] textsizes = new int[]{8,10,11,12,13,14,16};
    protected String contents;
    protected OptionsGUI options;
    protected NewGameGUI newgame;
    protected boolean optguion = false;
    protected boolean startingagame = false;
    protected StartupGUI startup = new StartupGUI();
    public Character player;
    public World world;
    private String[] messages = {"Not Supported Yet"};
    
    public MainGUIPanel(){
        //this was Main.as
        setLayout(null);
        options = new OptionsGUI();
        newgame = new NewGameGUI();
        textField = new JTextPane();
        
        textField.setBounds(124,69,super.getWidth()-124,super.getHeight()-69);
        textField.setContentType("text/html");

        theFont = new Font("Serif", Font.ITALIC, 12);
        textField.setFont(theFont);
        startup.setStartup(textField);
        add(textField);
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
  
    }
    private void parseEvent(String result){
         //Parse out our command and its arguments
         LOGGER.info("Hyperlink pressed,");
         
         String[] splitResult = result.split(",");
         LOGGER.info(result);
         if(result.contains("event:look")&&splitResult.length > 1){
             int contentID = Integer.parseInt(splitResult[1]);
             textField.setText(player.look(contentID));                     
         }else if(result.contains("event:pick_up")&&splitResult.length > 1){
             int contentID = Integer.parseInt(splitResult[1]);
             textField.setText(player.pickUp(contentID));
         }else if(result.contains("event:action")&&splitResult.length > 2){
             int contentID = Integer.parseInt(splitResult[1]);
             int actionID = Integer.parseInt(splitResult[2]);
             textField.setText(player.fireAction(contentID, actionID));
         }else if(result.contains("event:challenge")&&splitResult.length > 4){
             int contentID = Integer.parseInt(splitResult[1]);
             int actionID = Integer.parseInt(splitResult[2]);
             int challengeID = Integer.parseInt(splitResult[3]);
             int triggeringContentID = Integer.parseInt(splitResult[4]);
             textField.setText(player.fireChallenge(contentID, actionID, challengeID, triggeringContentID));
         }else if(result.contains("event:use_item")&&splitResult.length > 1){
            int inventoryID = Integer.parseInt(splitResult[1]);
            if(splitResult.length > 2){
                int useCase = Integer.parseInt(splitResult[2]);
                textField.setText(player.use_item(inventoryID,useCase));
            }else{
                textField.setText(player.use_item(inventoryID));
            }            
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
                if(i!=6 && i!=9 && i!=10){
                super.buttons[i].setEnabled(false);
                }
            }
            
        }
        else{
            player = null;
            newgame = new NewGameGUI();
            newgame.newGameStart(this,textField,super.buttons[0]);
            for (int i=0;i<11;i++){
                if(i!=6 && i!=9 && i!=10){
                super.buttons[i].setEnabled(false);
                }
            }
            
        }
    }
    @Override
    public void lookPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setText(player.look());
    }
    @Override
    public void appearancePressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        System.out.println("Appearance");
        textField.setText(capitalize(player.appearance(1, null)));//TODO this everywhere with capitalize if doable.
    }
    @Override
    public void inventoryPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setText(player.inventory());   
    }
    @Override
    public void statusPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setText(player.statistics());  
    }
    @Override
    public void trainPressed(){
        textField.setVisible(true);
        textField.setEnabled(true);
        textField.setText(player.showAllSkills());  
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
        textField.setBounds(124,69,super.getWidth()-124-60,super.getHeight()-69-120);
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
        System.out.println("capitalize called");
        //var myPattern:RegExp = /(\. [a-z])|(\n[a-z])|(! [a-z])|(: [a-z])/g;  
        Pattern myPattern =  Pattern.compile("(\\. [a-z])|(<br>[a-z])|(\n[a-z])|(! [a-z])|(: [a-z])"); // /(\. [a-z])|(\n[a-z])|(! [a-z])|(: [a-z])/g;  
        Matcher myMatcher = myPattern.matcher(ret);
        while (myMatcher.find()) {
            System.out.print("Start index: " + myMatcher.start());
            System.out.print(" End index: " + myMatcher.end() + " ");
            System.out.println(myMatcher.group());
            ret = ret.substring(0, myMatcher.end()-1) + ret.substring(myMatcher.end()-1, myMatcher.end()).toUpperCase() + 
            ret.substring(myMatcher.end());
        }
        /*
        private String Uppercase() {
            return arguments[0].toUpperCase();
        }
        */
        myPattern = Pattern.compile("([a-z])");
        String ret_start= ret.substring(0,1);
        myMatcher = myPattern.matcher(ret_start);
        while (myMatcher.find()) {
            System.out.print("Start index: " + myMatcher.start());
            System.out.print(" End index: " + myMatcher.end() + " ");
            System.out.println(myMatcher.group());
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
}