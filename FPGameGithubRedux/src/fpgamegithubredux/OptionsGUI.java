/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class OptionsGUI implements ActionListener{
    public JTextPane options_text_field = new JTextPane();
    public JTextPane text_field;
    public int[] textsizes = new int[]{8,10,11,12,13,14,16};
    public int textsizechosen;
    public int buttonwidth = 90, buttonheight = 22, buttony=20;
    public int[] buttonx = {5,95,185,275,365,455,545};
    public Font newfont;
    public JButton buttons[] = {new JButton("Smallest"), new JButton("Smaller"),
        new JButton("Small"), new JButton("Normal"), new JButton("Large"), 
        new JButton("Larger"), new JButton("Largest")};
    public String[] commands = {"Smallest","Smaller","Small","Normal","Large",
    "Larger","Largest"};
    public JButton Smallest_text_button, Smaller_text_button,
            Small_text_button,Normal_text_button,Large_text_button, 
            Larger_text_button,Largest_text_button;
    public void notoptions(JPanel MainGUI){
        MainGUI.remove(options_text_field);
    }
    public void setoptions(JPanel MainGUI,JTextPane upper_text_field,JButton[] superbuttons, int mini_map_status ,int textfield_size , int combattext_size,int keybind_to_change){
        //input_text.setVisible(false);
        //input_text.setEnabled(false);
        text_field = upper_text_field;
        options_text_field.setBounds(124,69,MainGUI.getWidth()-124,MainGUI.getHeight()-69);
        options_text_field.setContentType("text/html");
        MainGUI.add(options_text_field);
        String ret= "";
        options_text_field.setText("");
        options_text_field.setVisible(true);
        options_text_field.setEnabled(true);
        options_text_field.setEditable(false);
        
        MutableAttributeSet attrs = text_field.getInputAttributes();
        int text_field_size = StyleConstants.getFontSize(attrs);
        
        if(textfield_size > -1){
            StyleConstants.setFontSize(attrs, textsizes[textfield_size-1]);
            StyledDocument doc = text_field.getStyledDocument();
            doc.setCharacterAttributes(0, doc.getLength() + 1, attrs, false);
        ret += "options set!\n\n";
        }
        for(int i=0;i<7;i++){
            buttons[i].setBounds(buttonx[i],buttony,buttonwidth,buttonheight);
            buttons[i].setActionCommand("textfield"+commands[i]);
            buttons[i].addActionListener(this);
            options_text_field.add(buttons[i]);
        }
        /*
        if(mini_map <= 0){
				ret += "mini-map: <b>off</b>  <a href=\"event:options,1\">small</a>  <a href=\"event:options,2\">large</a>" +  "\n";
	}else if(mini_map == 1){
				ret += "mini-map: <a href=\"event:options,0\">off</a>  <b>small</b>  <a href=\"event:options,2\">large</a>" +  "\n";
	}else{
				ret += "mini-map: <a href=\"event:options,0\">off</a>   <a href=\"event:options,1\">small</a>  <b>large</b>" +  "\n";
	}
        */
        options_text_field.setText(ret);
    }
    public void reSize(JPanel MainGUI){
        options_text_field.setBounds(124,69,MainGUI.getWidth()-124,MainGUI.getHeight()-69);
    }
    public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            System.out.println(command);
            if(command.contains("textfield")){
                MutableAttributeSet attrs = text_field.getInputAttributes();
                int text_field_size = StyleConstants.getFontSize(attrs);
                if(command.equals("textfieldSmallest")){
                    StyleConstants.setFontSize(attrs, 8);
                    textsizechosen = 8;
                }
                else if(command.equals("textfieldSmaller")){
                    StyleConstants.setFontSize(attrs, 10);
                    textsizechosen = 10;
                }
                else if(command.equals("textfieldSmall")){
                    StyleConstants.setFontSize(attrs, 11);
                    textsizechosen =11;
                }
                else if(command.equals("textfieldNormal")){
                    StyleConstants.setFontSize(attrs, 12);
                    textsizechosen = 12;
                }
                else if(command.equals("textfieldLarge")){
                    StyleConstants.setFontSize(attrs, 13);
                    textsizechosen = 13;
                }
                else if(command.equals("textfieldLarger")){
                    StyleConstants.setFontSize(attrs, 14);
                    textsizechosen = 14;
                }
                else if(command.equals("textfieldLargest")){
                    StyleConstants.setFontSize(attrs, 16);
                    textsizechosen = 16;
                }
                StyledDocument doc = text_field.getStyledDocument();
                doc.setCharacterAttributes(0, doc.getLength() + 1, attrs, false);
                text_field.setStyledDocument(doc);
                Font textfont = text_field.getFont();
                newfont = new Font(textfont.getName(),textfont.getStyle(),textsizechosen);
                text_field.setFont(newfont);
            }
            else{
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
    } 
}
