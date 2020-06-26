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
        public JButton Inventory_button, Map_button, Look_button, Wait_button, Status_button,
            Skill_button, Newgame_button, Appearance_button, Save_button,
            Load_button, Options_button;
        
        public GUIButtons(){
        //GUI buttons
        Inventory_button = new JButton("Inventory");
        Inventory_button.setBounds(320,20,100,22);
        Inventory_button.setEnabled(false);
        add(Inventory_button);
        
        Map_button = new JButton("Map");
        Map_button.setBounds(470,20,100,22);
        Map_button.setEnabled(false);
        add(Map_button);
        
        Look_button = new JButton("Look");
        Look_button.setBounds(170,20,100,22);
        Look_button.setEnabled(false);
        add(Look_button);
        
        Wait_button = new JButton("Wait");
        Wait_button.setBounds(620,20,100,22);
        Wait_button.setEnabled(false);
        add(Wait_button);
        
        Status_button = new JButton("Status");
        Status_button.setBounds(17,157,100,22);
        Status_button.setEnabled(false);
        add(Status_button);
        
        Skill_button = new JButton("Train");
        Skill_button.setBounds(17,217,100,22);
        Skill_button.setEnabled(false);
        add(Skill_button);
        
        Newgame_button = new JButton("New Game");
        Newgame_button.setBounds(17,277,100,22);
        add(Newgame_button);
        
        Appearance_button = new JButton("Appearance");
        Appearance_button.setBounds(17,337,100,22);
        Appearance_button.setEnabled(false);
        add(Appearance_button);
        
        Save_button = new JButton("Save");
        Save_button.setBounds(17,397,100,22);
        Save_button.setEnabled(false);
        add(Save_button);
        
        Load_button = new JButton("Load");
        Load_button.setBounds(17,457,100,22);
        Load_button.setActionCommand("Load");
        Load_button.addActionListener(this);
        add(Load_button);
        
        Options_button = new JButton("Options");
        Options_button.setBounds(17,517,100,22);
        Options_button.setActionCommand("Options");
        Options_button.addActionListener(this);
        add(Options_button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
        public void loadPressed() {

        }
        public void optionsPressed() {

        }
}
