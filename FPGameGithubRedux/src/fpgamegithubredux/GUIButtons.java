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
 * @author hhhin
 */
public class GUIButtons extends JPanel implements ActionListener{
        static final long serialVersionUID = 1;

        public JButton buttons[] = {new JButton("Look"),new JButton("Inventory"),
        new JButton("Map"),new JButton("Wait"),new JButton("Status"),
        new JButton("Skills"),new JButton("New Game"),new JButton("Appearance"),
        new JButton("Save"),new JButton("Load"),new JButton("Options")};
        public int buttonwidth = 100;
        public int buttonheight = 22;
        public int[] buttonx = {170,320,470,620,17,17,17,17,17,17,17};
        public int[] buttony = {20,20,20,20,157,217,277,337,397,457,517};
        public String[] commands = {"Look","Inventory","Map","Wait","Status",
            "Train","New Game","Appearance","Save","Load", "Options"};
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
            if(command.equals("Options")){
                optionsPressed();
            }
            else if(command.equals("Load")){
                loadPressed();
            }
            else if(command.equals("New Game")){
                newGamePressed();
            }
            else if(command.equals("Look")){
                lookPressed();
            }
            else if(command.equals("Appearance")){
                appearancePressed();
            }
            else if(command.equals("Inventory")){
                inventoryPressed();
            }
            else if(command.equals("Status")){
                statusPressed();
            }
            else if(command.equals("Train")){
                trainPressed();
            }
            else{
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        public void loadPressed() {}
        public void optionsPressed(){}
        public void newGamePressed(){}
        public void lookPressed(){}
        public void appearancePressed(){}
        public void inventoryPressed(){}
        public void statusPressed(){}
        public void trainPressed(){}
}