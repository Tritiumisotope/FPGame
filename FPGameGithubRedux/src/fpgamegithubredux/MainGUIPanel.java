/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JTextField;
import javax.swing.JTextPane;

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
    protected NewGameGUI newgame;
    protected boolean optguion = false;
    protected boolean startingagame = false;
    protected StartupGUI startup = new StartupGUI();
    protected Character player;
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
            startup.exitStartup(textField);
            for (int i=0;i<11;i++){
                if(i!=6 && i!=9 && i!=10){
                super.buttons[i].setEnabled(false);
                }
            }
            
        }
        else{
            player = null;
            newgame = new NewGameGUI();
            //newgame.exitNewGameStart();
            newgame.newGameStart(this,textField,super.buttons[0]);
            startup.exitStartup(textField);
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
                textField.setText(player.look(0,0));
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
        options.notoptions(this);
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