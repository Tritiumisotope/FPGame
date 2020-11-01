/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Desktop;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.net.URI;
import java.net.URL;
//import javax.swing.JButton;
//import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
//import javax.swing.text.MutableAttributeSet;
//import javax.swing.text.StyleConstants;
//import javax.swing.text.StyledDocument;

/**
 *
 * @author Ailer and Tritium
 */
public class MainGUIPanel extends GUIButtons implements ComponentListener{
    static final long serialVersionUID = 0;
    
    protected JTextField inputText;
    protected JTextPane textField;
    
    protected Font theFont;
    protected int[] textsizes = new int[]{8,10,11,12,13,14,16};
    protected String contents;
    protected OptionsGUI options;
    protected newGameGUI newgame;
    protected boolean optguion = false;
    protected boolean startingagame = false;
    protected StartupGUI startup = new StartupGUI();
    protected Character player;
    private String[] messages = {"Not Supported Yet"};
    
    public MainGUIPanel(){
        //this was Main.as
        setLayout(null);
        options = new OptionsGUI();
        newgame = new newGameGUI();
        textField = new JTextPane();
        
        textField.setBounds(124,69,super.getWidth()-124,super.getHeight()-69);
        textField.setContentType("text/html");

        theFont = new Font("Serif", Font.ITALIC, 12);
        textField.setFont(theFont);
        startup.setStartup(textField);
        add(textField);
        addComponentListener(this);

        player = null;

        HyperlinkListener HLlisten = new HyperlinkListener()  {
            @Override
                public void hyperlinkUpdate(HyperlinkEvent e) {
                    if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                        try {
                            String result = e.getDescription();
                            if(result.contains("event:")){
                                //Parse out our command and its arguments
                                String[] split_result = result.split(",");
                                if(result.contains("event:look")){
                                    if(split_result.length > 1){
                                        int content_id = Integer.parseInt(split_result[1]);
                                        textField.setText(player.look(content_id));
                                    }else{
                                        System.out.println("(MainGUIPanel.java)got unexpected result: " + result);
                                    }                               
                                }else if(result.contains("event:pick_up")){
                                    if(split_result.length > 1){
                                        int content_id = Integer.parseInt(split_result[1]);
                                        textField.setText(player.pick_up(content_id));
                                    }else{
                                        System.out.println("(MainGUIPanel.java)got unexpected result: " + result);
                                    }
                                }else if(result.contains("event:action")){
                                    if(split_result.length > 2){
                                        int content_id = Integer.parseInt(split_result[1]);
                                        int action_id = Integer.parseInt(split_result[2]);
                                        textField.setText(player.fire_action(content_id, action_id));
                                    }else{
                                        System.out.println("(MainGUIPanel.java)got unexpected result: " + result);
                                    }
                                }else if(result.contains("event:challenge")){
                                    if(split_result.length > 4){
                                        int content_id = Integer.parseInt(split_result[1]);
                                        int action_id = Integer.parseInt(split_result[2]);
                                        int challenge_id = Integer.parseInt(split_result[3]);
                                        int triggering_content_id = Integer.parseInt(split_result[4]);
                                        textField.setText(player.fire_challenge(content_id, action_id, challenge_id, triggering_content_id));
                                    }else{
                                        System.out.println("(MainGUIPanel.java)got unexpected result: " + result);
                                    }
                                }else{
                                    System.out.println("(MainGUIPanel.java)got unexpected result: " + result);
                                }
                            }else{
                                Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                                if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                                    URL url = e.getURL();
                                    if(url != null){
                                        URI uri = url.toURI();   
                                        desktop.browse(uri);
                                    }
                                }
                            }
                            
                        
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
    
                    }
                }

            };
        
        textField.addHyperlinkListener(HLlisten);
        //input_text = new JTextField();
        //input_text.setBounds(125,568,100,22);
  
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
            newgame = new newGameGUI();
            //newgame.exitNewGameStart();
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
        textField.setText(player.appearance(1, null));       
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
			//int i = 0;
			//Map_button.setText("Map");
                        /*
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
}