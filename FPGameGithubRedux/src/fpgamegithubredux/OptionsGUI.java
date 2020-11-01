/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.util.logging.Logger;


/**
 *
 * @author Ailer and Tritium
 */
public class OptionsGUI implements ActionListener{
    private static final Logger LOGGER = Logger.getLogger(OptionsGUI.class.getName());
    protected JTextPane optionsTextField = new JTextPane();
    protected JTextPane textField;
    private int[] textSizes = new int[]{8,10,11,12,13,14,16};
    protected int textSizeChosen;
    protected int buttonwidth = 90;
    protected int buttonheight = 22;
    protected int  buttony=20;
    private int[] buttonx = {5,95,185,275,365,455,545};
    protected Font newfont;
    private JButton[] buttons = {new JButton("Smallest"), new JButton("Smaller"),
        new JButton("Small"), new JButton("Normal"), new JButton("Large"), 
        new JButton("Larger"), new JButton("Largest")};
    private String[] commands = {"Smallest","Smaller","Small","Normal","Large",
    "Larger","Largest"};
    private String ret;
    protected JButton smallestTextButton;
    protected JButton smallerTextButton;
    protected JButton smallTextButton;
    protected JButton normalTextButton;
    protected JButton largeTextButton; 
    protected JButton largerTextButton;
    protected JButton largestTextButton;
    public OptionsGUI(){
        ret= "";
        optionsTextField.setText("");
        optionsTextField.setVisible(true);
        optionsTextField.setEnabled(true);
        optionsTextField.setEditable(false);
        for(int i=0;i<7;i++){
            buttons[i].setBounds(buttonx[i],buttony,buttonwidth,buttonheight);
            buttons[i].setActionCommand("textfield"+commands[i]);
            buttons[i].addActionListener(this);
            optionsTextField.add(buttons[i]);
        }
    }
    public void notOptions(JPanel mainGUI){
        mainGUI.remove(optionsTextField);
    }
    public void setoptions(JPanel mainGUI,JTextPane upperTextField,JButton[] superButtons, int miniMapStatus ,int textFieldSize , int combatTextSize,int keybindToChange){
        //input_text.setVisible(false);
        //input_text.setEnabled(false);
        textField = upperTextField;
        optionsTextField.setBounds(124,69,mainGUI.getWidth()-124,mainGUI.getHeight()-69);
        optionsTextField.setContentType("text/html");
        mainGUI.add(optionsTextField);
        
        MutableAttributeSet attrs = textField.getInputAttributes();
        //int text_field_size = StyleConstants.getFontSize(attrs);
        
        if(textFieldSize > -1){
            StyleConstants.setFontSize(attrs, textSizes[textFieldSize-1]);
            StyledDocument doc = textField.getStyledDocument();
            doc.setCharacterAttributes(0, doc.getLength() + 1, attrs, false);
        ret += "options set!\n\n";
        }

        /* to be determined what the heck this did
        if(mini_map <= 0){
				ret += "mini-map: <b>off</b>  <a href=\"event:options,1\">small</a>  <a href=\"event:options,2\">large</a>" +  "\n";
        }else if(mini_map == 1){
                    ret += "mini-map: <a href=\"event:options,0\">off</a>  <b>small</b>  <a href=\"event:options,2\">large</a>" +  "\n";
        }else{
                    ret += "mini-map: <a href=\"event:options,0\">off</a>   <a href=\"event:options,1\">small</a>  <b>large</b>" +  "\n";
        }
        */
        optionsTextField.setText(ret);
    }
    public void reSize(JPanel mainGUI){
        optionsTextField.setBounds(124,69,mainGUI.getWidth()-124,mainGUI.getHeight()-69);
    }
    public void actionPerformed(ActionEvent e) {//all the resizing code from clicking
            String command = e.getActionCommand();
            LOGGER.info(command);
            if(command.contains("textfield")){
                MutableAttributeSet attrs = textField.getInputAttributes();
                if(command.equals("textfieldSmallest")){
                    StyleConstants.setFontSize(attrs, 8);
                    textSizeChosen = 8;
                }
                else if(command.equals("textfieldSmaller")){
                    StyleConstants.setFontSize(attrs, 10);
                    textSizeChosen = 10;
                }
                else if(command.equals("textfieldSmall")){
                    StyleConstants.setFontSize(attrs, 11);
                    textSizeChosen =11;
                }
                else if(command.equals("textfieldNormal")){
                    StyleConstants.setFontSize(attrs, 12);
                    textSizeChosen = 12;
                }
                else if(command.equals("textfieldLarge")){
                    StyleConstants.setFontSize(attrs, 13);
                    textSizeChosen = 13;
                }
                else if(command.equals("textfieldLarger")){
                    StyleConstants.setFontSize(attrs, 14);
                    textSizeChosen = 14;
                }
                else if(command.equals("textfieldLargest")){
                    StyleConstants.setFontSize(attrs, 16);
                    textSizeChosen = 16;
                }
                StyledDocument doc = textField.getStyledDocument();
                doc.setCharacterAttributes(0, doc.getLength() + 1, attrs, false);
                textField.setStyledDocument(doc);
                Font textfont = textField.getFont();
                newfont = new Font(textfont.getName(),textfont.getStyle(),textSizeChosen);
                textField.setFont(newfont);
            }
            else{
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
    } 
}
