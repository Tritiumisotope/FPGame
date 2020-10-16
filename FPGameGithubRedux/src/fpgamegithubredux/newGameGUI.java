/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

//import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.net.URI;
//import java.net.URL;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author hhhin
 */
public class newGameGUI implements ActionListener {
    public Character newPlayer;
    public String output;
    public String output2;
    public String name;
    public String[] sexChoices = {"Male","Female","Futa"};
    public JTextPane text_field;
    public JTextField nameEntry;
    public JButton confirmName = new JButton("->");
    public JButton goBack;
    public int sex;
    public int fitness;
    public HyperlinkListener HLlisten;
    MainGUIPanel TheMainGUI;
    public newGameGUI(){
        confirmName.addActionListener(this);
        confirmName.setActionCommand("nameConfirmed");
    }
    public void newGameStart(MainGUIPanel MainGUI,JTextPane upper_text_field, JButton look, Character newchar){
        text_field = upper_text_field;
        TheMainGUI = MainGUI;
        goBack = look;
        newPlayer = new Character();
        //newchar = newPlayer;
        getSex();
    }
    private void getSex(){
        
    output = "Today, while walking on your way home, you notice a familiar empty lot occupied by what appears to be a covered wooden caravan cart, not unlike those you've heard of gypsies using in days gone by. Out front, a large, garishly painted sign proclaims the strange carts intentions:\r\n\r\n"
				+"<br><br>"+"<i>Fortunes told!</i><br>"
				+"<b>Today Only</b><br>"
				+"<b><i>FREE!</i></b><br><br>"
				+ "Looking around, none of the other passersby seem to notice the out of place cart, and a sense of foreboding come over you. Curiosity wins, and you creep up to the cart, risking a peek in....<br><br>"
				+ "\"Who's there!\" A decrepit and gasping female voice echos as soon as soon as your eyes fall on the deteriorating old gypsy, her robes a mish-mash of colour that assaults your eyes, and the glassy stare coming from her un-nerving you.<br><br>"
				+ "\"A customer! Come in!\" the woman cries as you begin to shy from the doorstep. The desperation in her voice has you a few steps in the cramped space of the cart before you realize what's happening. \"Sit sit!\" she says, coughing and gesturing vaguely across the scarred wooden table she sits at.<br><br>"
				+ "You're barely in place before the gypsy begins apologizing about the state of affairs around the cart. You sit awkwardly as her pale gaze jumps about the small space, until finally it falls on you."
				+ "\"I'm sorry to ask...\" she says \"... but even I'm not what I used to be.\" The comment is punctuated by a coughing fit, before she continues. \"Silent as you are, I'm afraid I have to know before we start... are you a man, or a woman?\"<br><br>"
				+"What sex would you like to be? <font color='#0000FF'><a href=\"event:new_player,1\">Male</a> <a href=\"event:new_player,2\">Female</a></font>";
    
    text_field.setText(output);
    HLlisten = new HyperlinkListener()  {
        @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        String result = e.getDescription();
                        System.out.println(result);
                        if("event:new_player,1".equals(result)){
                            System.out.println("Male");
                            newPlayer.setSex(0);
                            setName();
                        }
                        else if ("event:new_player,2".equals(result)){
                            newPlayer.setSex(1);
                            setName();
                        }
                    
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }

                }
            }
        };
        text_field.addHyperlinkListener(HLlisten);
    }
    private void setName(){
        output2 = "\"And your name?\" the old gypsy asks, "
                + "a distinct lack of surprise at your answer to the last question. "
                + "Thinking over it for a few moments, you decide to tell the gypsy your name is ";
        text_field.setText(output2);
        nameEntry = new JTextField();
        nameEntry.setBounds(10,40,300,22);
        text_field.add(nameEntry);
        confirmName.setBounds(310,40,80,22);
        text_field.add(confirmName);
    }
    private void setFitness(){
        output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"<br><br>"
				+ "Not sure what she means, you sit gaping at the odd sight of the ancient woman until she <i>hrrmphs</i> and raises her boney hands towards you, wriggling fingers and saying \"I can find out for myself if you're going to give me the silent treatment....\"<br><br>"
				+ "The screeching as your chair backs up stops her. \"Oh? Not interested?\" The grin on the gypsies face is mindnumbingly disturbing as drool steadily flows from a hanging lip. Before long you make the decision that it's time to leave, but the gypsy seems to sense your anxiety and begins to plead \"Don't go! Please! It was just a jest! A joke! Yes! You can forgive an old woman, yes?\" You get the sense that if she could move more easily, she would have been kissing your feet by the end, but instead she was bowing her head into the table. \"Please...\" she continue \"I only meant to ask what type of body you've ended up with.\" As if to drive the point home, she casually begins \"I'm blind you see...\" before trailing off.\n\n"
				+ "What body type do you have? <font color='#0000FF'><a href=\"fitness,1\">Athletic</a> <a href=\"fitness,2\">Chubby</a> <a href=\"fitness,3\">Slim</a></font>";
				//Slim, Muscular, Chubby for both sexes... Ectomorphic, Mesomorphic, Endomorphic in reality
        HLlisten = new HyperlinkListener()  {
        @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        String result = e.getDescription();
                        System.out.println(result);
                        if("fitness,1".equals(result)){
                            System.out.println("Male");
                            //fitness = 0;
                            newPlayer.apply_affect_by_id(0,0);
                            afterName();
                        }
                        else if ("fitness,2".equals(result)){
                            //fitness = 1;
                            newPlayer.apply_affect_by_id(0,1);
                            afterName();
                        }
                        else if ("fitness,3".equals(result)){
                            //fitness = 2;
                            newPlayer.apply_affect_by_id(0,2);
                            afterName();
                        }
                    
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }

                }
            }
        };
        text_field.setText(output);
        text_field.addHyperlinkListener(HLlisten);
    
    }
    private void afterName(){
        text_field.setText("You are " + newPlayer.name+", a "+newPlayer.sex);
        //newPlayer = new Character(name, sex, fitness);
        goBack.setEnabled(true);
        TheMainGUI.Player = newPlayer;
        System.out.println(newPlayer.name);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("nameConfirmed")){
                //name = nameEntry.getText();
                System.out.println("buttonpressed");
                newPlayer.setName(nameEntry.getText());
                text_field.remove(nameEntry);
                text_field.remove(confirmName);
                setFitness();
        }
    }
    public void exitNewGameStart(){

        text_field.removeHyperlinkListener(HLlisten);
        text_field.removeAll();
    }
}