/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.net.URI;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author hhhin
 */
public class MainGUIPanel extends GUIButtons implements ActionListener, ComponentListener{
    public JTextField input_text;
    public JTextPane text_field;
    
    //public JTextPane options_text_field;
    public Font font;
    public int[] textsizes = new int[]{8,10,11,12,13,14,16};
    public String contents;
    public OptionsGUI options;
    public newGameGUI newgame;
    public boolean optguion = false;
    public boolean startingagame = false;
    public StartupGUI startup = new StartupGUI();
    public Character Player;
    
    public MainGUIPanel(){
        //this was Main.as
        setLayout(null);
        Insets in = getInsets();
        options = new OptionsGUI();
        newgame = new newGameGUI();
        text_field = new JTextPane();
        
        text_field.setBounds(124,69,super.getWidth()-124,super.getHeight()-69);
        text_field.setContentType("text/html");

        font = new Font("Serif", Font.ITALIC, 12);
        text_field.setFont(font);
        startup.setStartup(text_field);
        add(text_field);
        addComponentListener(this);

        
        //input_text = new JTextField();
        //input_text.setBounds(125,568,100,22);
  
    }
    @Override
    public void optionsPressed(){
        if(!optguion){
                optguion = true;
                options.setoptions(this,text_field,super.buttons,-1,-1,-1,-1);
                text_field.setVisible(false);
                text_field.setEnabled(false);}
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
            newgame.newGameStart(this,text_field, super.buttons[0],Player);
            startup.exitStartup(text_field);
            for (int i=0;i<11;i++){
                if(i!=6 && i!=9){
                super.buttons[i].setEnabled(false);
                }
            }
            
        }
        else{
            newgame.exitNewGameStart();
            newgame.newGameStart(this,text_field,super.buttons[0],Player);
            startup.exitStartup(text_field);
            for (int i=0;i<11;i++){
                if(i!=6 && i!=9){
                super.buttons[i].setEnabled(false);
                }
            }
            
        }
    }
    public void lookPressed(){
                text_field.setVisible(true);
                text_field.setEnabled(true);
                text_field.setText("You are"+ Player.name);
    }
    private void cleanOptions(){
        options.notoptions(this);
        optguion = false;
        text_field.setVisible(true);
        text_field.setEnabled(true);
    }
    public void cleanup_gui(){
			int i = 0;
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
        
    }

    @Override
    public void componentResized(ComponentEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        options.reSize(this);
        text_field.setBounds(124,69,super.getWidth()-124-60,super.getHeight()-69-120);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentShown(ComponentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}