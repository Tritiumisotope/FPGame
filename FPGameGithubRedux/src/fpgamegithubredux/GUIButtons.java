/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Ailer and Tritium
 */
public class GUIButtons extends JPanel implements ActionListener{
        static final long serialVersionUID = 1;

        private String[] commands = {"Look","Inventory","Map","Wait","Status",
        "Train","New Game","Appearance","Save","Load", "Options"};
        protected JButton[] buttons = {new JButton(commands[0]),new JButton(commands[1]),
        new JButton(commands[2]),new JButton(commands[3]),new JButton(commands[4]),
        new JButton(commands[5]),new JButton(commands[6]),new JButton(commands[7]),
        new JButton(commands[8]),new JButton(commands[9]),new JButton(commands[10])};
        private int buttonwidth = 100;
        private int buttonheight = 22;
        private int[] buttonx = {170,320,470,620,17,17,17,17,17,17,17};
        private int[] buttony = {20,20,20,20,157,217,277,337,397,457,517};

        public GUIButtons(){
            //GUI buttons
            //Look, Inventory, Map, Wait, Status, Skills(Train), New Game, Appearance,
            //Save, Load, Options
            for (int i=0;i<11;i++){
                buttons[i].setBounds(buttonx[i],buttony[i],buttonwidth,buttonheight);
                buttons[i].addActionListener(this);
                buttons[i].setActionCommand(commands[i]);
                if(i<6 || i==7 ||i==8){
                    buttons[i].setEnabled(false);
                    
                }
                add(buttons[i]);
            }

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch(command){
                case "Look":
                    lookPressed();
                    break;
                case "Inventory":
                    inventoryPressed();
                    break;
                case "Map":
                    mapPressed();
                    break;
                case "Wait":
                    waitPressed();
                    break;
                case "Status":
                    statusPressed();
                    break;
                case "Train":
                    trainPressed();
                    break;
                case "New Game":
                    newGamePressed();
                    break;
                case "Appearance":
                    appearancePressed();
                    break;
                case "Save":
                    savePressed();
                    break;
                case "Load":
                    loadPressed();
                    break;
                case "Options":
                    optionsPressed();
                    break;
                default:
                    throw new UnsupportedOperationException("Not supported yet.");
                }
        }
        public void lookPressed(){
            //Overridden
        }
        public void inventoryPressed(){
            //Overridden
        }
        public void mapPressed(){
            //Overridden
        }
        public void waitPressed(){
            //Overridden
        }
        public void statusPressed(){
            //Overridden
        }
        public void trainPressed(){
            //Overridden
        }
        public void newGamePressed(){
            //Overridden
        }
        public void appearancePressed(){
            //Overridden
        }
        public void savePressed(){
            //Overridden
        }
        public void loadPressed() {
            //Overridden
        }
        public void optionsPressed(){
            //Overridden
        }
}