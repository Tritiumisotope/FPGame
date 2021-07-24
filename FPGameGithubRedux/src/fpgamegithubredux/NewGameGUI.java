/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 *
 * @author Ailer and Tritium
 */
public class NewGameGUI implements ActionListener {
    protected Character newPlayer;
    protected String output;
    protected String output2;
    protected String name;
    private NumberFormat amountFormat;
    private static final Logger LOGGER = Logger.getLogger(NewGameGUI.class.getName());
    protected String[] sexChoices = { "Male", "Female", "Futa" };
    protected JTextPane textField;
    private JFormattedTextField ageEntry;
    protected JTextField nameEntry;
    // protected JTextField ageEntry;
    protected JButton confirmName = new JButton("->");
    protected JButton confirmAge = new JButton("->");
    protected JButton goBack;
    protected int sex;
    protected int fitness;
    protected int sex_flag = 0;
    protected String char_name = "";
    protected int body_flag = 0;
    protected int eye_flag = 0;
    protected int hair_flag = 0;
    protected int age_flag = 0;
    protected HyperlinkListener hlListen;
    protected int question_num_flag = -1;
    protected int question_answer_flag = -1;
    MainGUIPanel theMainGUI;

    public NewGameGUI() {
        confirmName.addActionListener(this);
        confirmName.setActionCommand("nameConfirmed");
        confirmAge.addActionListener(this);
        confirmAge.setActionCommand("ageConfirmed");
    }

    public void newGameStart(MainGUIPanel mainGUI, JTextPane upperTextField, JButton look) {
        textField = upperTextField;
        theMainGUI = mainGUI;
        goBack = look;
        newPlayer = new Character();
        getSex();
    }

    private void getSex() {
        // TODO worldgen here?
        output = "Today, while walking on your way home, you notice a familiar empty lot occupied by what appears to be a covered wooden caravan cart, not unlike those you've heard of gypsies using in days gone by. Out front, a large, garishly painted sign proclaims the strange carts intentions:\r\n\r\n"
                + "<br><br>" + "<i>Fortunes told!</i><br>" + "<b>Today Only</b><br>" + "<b><i>FREE!</i></b><br><br>"
                + "Looking around, none of the other passersby seem to notice the out of place cart, and a sense of foreboding come over you. Curiosity wins, and you creep up to the cart, risking a peek in....<br><br>"
                + "\"Who's there!\" A decrepit and gasping female voice echos as soon as soon as your eyes fall on the deteriorating old gypsy, her robes a mish-mash of colour that assaults your eyes, and the glassy stare coming from her un-nerving you.<br><br>"
                + "\"A customer! Come in!\" the woman cries as you begin to shy from the doorstep. The desperation in her voice has you a few steps in the cramped space of the cart before you realize what's happening. \"Sit sit!\" she says, coughing and gesturing vaguely across the scarred wooden table she sits at.<br><br>"
                + "You're barely in place before the gypsy begins apologizing about the state of affairs around the cart. You sit awkwardly as her pale gaze jumps about the small space, until finally it falls on you."
                + "\"I'm sorry to ask...\" she says \"... but even I'm not what I used to be.\" The comment is punctuated by a coughing fit, before she continues. \"Silent as you are, I'm afraid I have to know before we start... are you a man, or a woman?\"<br><br>"
                + "What sex would you like to be? <font color='#0000FF'><a href=\"event:new_player,1\">Male</a> <a href=\"event:new_player,2\">Female</a></font>";

        textField.setText(output);
        hlListen = e -> {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                try {
                    String result = e.getDescription();
                    if ("event:new_player,1".equals(result)) {
                        LOGGER.info("Male");
                        newPlayer.setSexDemo(0);
                        newPlayer.set_sex(FPalaceHelper.sex_male());
                        sex_flag = 1;
                        setName();
                    } else if ("event:new_player,2".equals(result)) {
                        LOGGER.info("Female");
                        newPlayer.setSexDemo(1);
                        newPlayer.set_sex(FPalaceHelper.sex_female());
                        sex_flag = 2;
                        setName();
                    } else {
                        String msg = "(newGameGui.java) got unexpected result: " + result;
                        LOGGER.fine(msg);
                    }

                } catch (Exception e2) {
                    e2.printStackTrace();
                }

            }

        };
        textField.addHyperlinkListener(hlListen);
    }

    private void setName() {
        textField.removeHyperlinkListener(hlListen);
        output2 = "\"And your name?\" the old gypsy asks, "
                + "a distinct lack of surprise at your answer to the last question. "
                + "Thinking over it for a few moments, you decide to tell the gypsy your name is ";
        textField.setText(output2);
        nameEntry = new JTextField();
        nameEntry.setBounds(10, 120, 300, 22);
        textField.add(nameEntry);
        confirmName.setBounds(310, 120, 80, 22);
        textField.add(confirmName);
    }

    private void setFitness() {
        output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"<br><br>"
                + "Not sure what she means, you sit gaping at the odd sight of the ancient woman until she <i>hrrmphs</i> and raises her boney hands towards you, wriggling fingers and saying \"I can find out for myself if you're going to give me the silent treatment....\"<br><br>"
                + "The screeching as your chair backs up stops her. \"Oh? Not interested?\" The grin on the gypsies face is mindnumbingly disturbing as drool steadily flows from a hanging lip. Before long you make the decision that it's time to leave, but the gypsy seems to sense your anxiety and begins to plead \"Don't go! Please! It was just a jest! A joke! Yes! You can forgive an old woman, yes?\" You get the sense that if she could move more easily, she would have been kissing your feet by the end, but instead she was bowing her head into the table. \"Please...\" she continue \"I only meant to ask what type of body you've ended up with.\" As if to drive the point home, she casually begins \"I'm blind you see...\" before trailing off.\n\n"
                + "What body type do you have? <font color='#0000FF'><a href=\"fitness,1\">Athletic</a> <a href=\"fitness,2\">Chubby</a> <a href=\"fitness,3\">Slim</a></font>";
        // Slim, Muscular, Chubby for both sexes... Ectomorphic, Mesomorphic,
        // Endomorphic in reality
        textField.setText(output);
        hlListen = new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        String result = e.getDescription();

                        if ("fitness,1".equals(result)) {
                            LOGGER.info("Athletic");
                            // body_flag = 1;
                            //newPlayer.applyAffectByID(0, 0);
                            setEyeColor();
                        } else if ("fitness,2".equals(result)) {
                            LOGGER.info("Chubby");
                            // body_flag = 2;
                            //newPlayer.applyAffectByID(0, 1);
                            setEyeColor();
                        } else if ("fitness,3".equals(result)) {
                            LOGGER.info("Slim");
                            // body_flag = 3;
                            //newPlayer.applyAffectByID(0, 2);
                            setEyeColor();
                        } else {
                            String msg = "(newGameGui.java) got unexpected result: " + result;
                            LOGGER.fine(msg);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        textField.addHyperlinkListener(hlListen);

    }

    private void setEyeColor() {
        output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
                + "What eye colour do you have? <font color='#0000FF'><a href=\"eyeColor,4\">Brown</a> <a href=\"eyeColor,8\">Green</a> <a href=\"eyeColor,14\">Blue</a></font>";
        // textField.removeHyperlinkListener(hlListen);
        textField.setText(output);
        hlListen = new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        String result = e.getDescription();

                        if ("eyeColor,4".equals(result)) {
                            LOGGER.info("Brown");
                            eye_flag = 4;
                            // body_flag = 1;
                            // newPlayer.applyAffectByID(1,4);
                            setHairColor();
                        } else if ("eyeColor,8".equals(result)) {
                            LOGGER.info("Green");
                            eye_flag = 8;
                            // body_flag = 2;
                            // newPlayer.applyAffectByID(1,8);
                            setHairColor();
                        } else if ("eyeColor,14".equals(result)) {
                            LOGGER.info("Blue");
                            eye_flag = 14;
                            // body_flag = 3;
                            // newPlayer.applyAffectByID(1,14);
                            setHairColor();
                        } else {
                            String msg = "(newGameGui.java) got unexpected result: " + result;
                            LOGGER.fine(msg);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        textField.addHyperlinkListener(hlListen);

    }

    private void setHairColor() {
        output = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
                + "What hair colour do you have? <font color='#0000FF'><a href=\"hairColor,2\">Black</a> <a href=\"hairColor,5\">Brown</a> <a href=\"hairColor,7\">Red</a> <a href=\"hairColor,4\">Blonde</a></font>";
        // textField.removeHyperlinkListener(hlListen);
        textField.setText(output);
        hlListen = new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        String result = e.getDescription();

                        if ("hairColor,2".equals(result)) {
                            LOGGER.info("Black");
                            hair_flag = 2;
                            // body_flag = 1;
                            //newPlayer.applyAffectByID(2, 2);
                        } else if ("hairColor,5".equals(result)) {
                            LOGGER.info("Brown");
                            hair_flag = 5;
                            // body_flag = 2;
                            //newPlayer.applyAffectByID(2, 5);
                        } else if ("hairColor,7".equals(result)) {
                            LOGGER.info("Red");
                            hair_flag = 7;
                            // body_flag = 3;
                            //newPlayer.applyAffectByID(2, 7);
                        } else if ("hairColor,4".equals(result)) {
                            LOGGER.info("Blonde");
                            hair_flag = 4;
                            // body_flag = 3;
                            //newPlayer.applyAffectByID(2, 4);
                        } else {
                            String msg = "(newGameGui.java) got unexpected result: " + result;
                            LOGGER.fine(msg);
                        }
                        output = "";
                        textField.setText(output);
                        setAge();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        textField.setText(output);
        textField.addHyperlinkListener(hlListen);

    }

    private void setAge() {
        textField.removeHyperlinkListener(hlListen);
        output2 = "The old gypsy looks a little taken aback at your answer, and you hear her mumble under her breath about thinking otherwise. She raises her voice and begins to speak to you in earnest once again. \"Could you tell me a bit more?\"\n\n"
                + "How old are you?";
        textField.setText(output2);
        ageEntry = new JFormattedTextField(amountFormat);
        ageEntry.setBounds(10, 120, 300, 22);
        ageEntry.setValue("Please enter age");
        confirmAge.setEnabled(false);
        ageEntry.setColumns(10);
        ageEntry.addKeyListener(new KeyListener() {
            
            public void keyPressed(KeyEvent ke) {
                String value = ageEntry.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    if(ageEntry.getValue().equals("Please enter age")){
                        ageEntry.setValue("");
                    }
                    ageEntry.setEditable(true);
                    confirmAge.setEnabled(true);
                }else if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                    ageEntry.setEditable(true);
                } else {
                    ageEntry.setEditable(false);
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {//needed
            }
            @Override
            public void keyReleased(KeyEvent e) {//needed
            }
         });
        textField.add(ageEntry);
        confirmAge.setBounds(310,120,80,22);
        
        textField.add(confirmAge);

    }
    private void afterName(){
        textField.removeHyperlinkListener(hlListen);
        

        Race race = FPalace_races.race_human();

        newPlayer.new_body_part(FPalaceHelper.new_hair(race,1/*hair length*/,hair_flag));
        newPlayer.new_body_part(FPalaceHelper.new_head(race));
        newPlayer.new_body_part(FPalaceHelper.new_head(race));
        newPlayer.new_body_part(FPalaceHelper.new_eyes(race,(eye_flag-9.9)));
        newPlayer.new_body_part(FPalaceHelper.new_torso(race));
        newPlayer.new_body_part(FPalaceHelper.new_left_arms(race));
        newPlayer.new_body_part(FPalaceHelper.new_left_hands(race));
        newPlayer.new_body_part(FPalaceHelper.new_right_arms(race));
        newPlayer.new_body_part(FPalaceHelper.new_right_hands(race));
        newPlayer.new_body_part(FPalaceHelper.new_hips(race));
        newPlayer.new_body_part(FPalaceHelper.new_left_legs(race));
        newPlayer.new_body_part(FPalaceHelper.new_left_feet(race));
        newPlayer.new_body_part(FPalaceHelper.new_right_legs(race));
        newPlayer.new_body_part(FPalaceHelper.new_right_feet(race));
        
        if (sex_flag == 1){
            newPlayer.new_body_part(FPalaceHelper.new_penis(race));
            newPlayer.new_body_part(FPalaceHelper.new_balls(race));
            
            if(body_flag == 1){
                
            }else if(body_flag == 2){
                newPlayer.apply_affect_by_id(FPalaceHelper.waist_id,8);
                newPlayer.apply_affect_by_id(FPalaceHelper.hips_id,4);
            }else if(body_flag == 3){
                newPlayer.apply_affect_by_id(FPalaceHelper.bust_id,-4);
                newPlayer.apply_affect_by_id(FPalaceHelper.hips_id,-4);
            }
        }

        if (sex_flag == 2){
            newPlayer.new_body_part(FPalaceHelper.new_breasts(race));
            newPlayer.new_body_part(FPalaceHelper.new_vagina(race));
            newPlayer.new_body_part(FPalaceHelper.new_clit(race));
            
            if(body_flag == 1){
                
            }else if(body_flag == 2){
                newPlayer.apply_affect_by_id(FPalaceHelper.bust_id,4);
                newPlayer.apply_affect_by_id(FPalaceHelper.waist_id,8);
                newPlayer.apply_affect_by_id(FPalaceHelper.hips_id,4);
                newPlayer.apply_affect_by_id(FPalaceHelper.breast_size_id,3);
                newPlayer.apply_affect_by_id(FPalaceHelper.milk_volume_id,40);
                
            }else if(body_flag == 3){
                newPlayer.apply_affect_by_id(FPalaceHelper.bust_id,-4);
                newPlayer.apply_affect_by_id(FPalaceHelper.hips_id,-4);
                newPlayer.apply_affect_by_id(FPalaceHelper.breast_size_id,-2);
                newPlayer.apply_affect_by_id(FPalaceHelper.milk_volume_id,-40);
            }
        }


        newPlayer.apply_affect_by_id(FPalaceHelper.str_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.dex_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.con_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.sex_appeal_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.int_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.wis_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.will_id,-1,0,null,Body.change_stats_total);
        newPlayer.apply_affect_by_id(FPalaceHelper.cha_id,-1,0,null,Body.change_stats_total);

        if(age_flag != 23){
            newPlayer.apply_affect_by_id(FPalaceHelper.age_id,age_flag-23,0,null,Body.change_stats_total);
        }
        /*
        Room tempRoom = new Room();

        Item tempItem = new Item();
        tempItem.setDroppedDescription("something is on the ground here");
        tempItem.setName("something");

        tempRoom.newContent(tempItem);

        tempRoom.newContent(FPalace_items.bandages());
        */
        World temp_world = new World();
        temp_world = FPalace_content.new_world(temp_world);
        
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        temp_world = FPalace_content.new_world(temp_world);
        //temp_world = FPalace_content.new_world(temp_world);
        //temp_world = FPalace_content.new_world(temp_world);
        //temp_world = FPalace_content.new_world(temp_world);
        
        //Room tempRoom = temp_world.areas.get(0).get_random_room();
        Room tempRoom = temp_world.areas.get((int)Math.round(Math.random()*(temp_world.areas.size()-1))).get_random_room();
        /*
        Character tempChar = new Character();
        tempChar.location = tempRoom;
        tempRoom.newContent(tempChar);
        */
        
        newPlayer.location = tempRoom;
        tempRoom.newContent(newPlayer);
        newPlayer.location.player_found();

        newPlayer.set_character_class(FPalace_classes.cclass_adventurer());
			
			newPlayer.skills.set_skill_value(newPlayer, FPalace_skills.adventure_id, 1);
			newPlayer.skills.set_skill_value(newPlayer, FPalace_skills.fight_id, 1);
			newPlayer.skills.set_skill_value(newPlayer, FPalace_skills.knowledge_id, 1);
			newPlayer.skills.set_skill_value(newPlayer, FPalace_skills.people_id, 1);
			

        newPlayer.set_xp(9);

        Quest main_quest = new Quest();
        main_quest.set_name("Getting Home");
        main_quest.new_objective("Figure out where you are",Quest.talk_action,null);
        main_quest.add_conversation_topic(FPalace_topics.topic_help(main_quest),0);
        
        main_quest.new_objective("Find Century City",Quest.area_action,(10/*Century City Area ID*/));
        
        main_quest.new_objective("Learn about the Lost",Quest.talk_action,null);
        
        newPlayer.personality.new_objective(main_quest, newPlayer);
        
        newPlayer.setBusy();
        newPlayer.tick();
        
        newPlayer.reset_stats();
        newPlayer.body.check_state(newPlayer);

        //newPlayer.apply_affect_by_id(FPalaceHelper.curr_hp_id, -5,0,null,Body.change_stats_total);
        //newPlayer.apply_affect_by_id(FPalaceHelper.curr_hp_id, -0.1);

        goBack.setEnabled(true);
        theMainGUI.player = newPlayer;
        textField.setText("\"Well...\" the gypsy begins, a look of concern upon her face, \"Here is your fortune.\" She pauses again, lowering her voice, and forcing you to lean in to hear. \n\n"
        + "\"You will lead an interesting life....\" The look of pain that crosses the old womans age distorted face confuses you at first, but it changes and morphs rapidly into a strange seething anger. \"OUT!\" The yell nearly knocks you from your chair, as you find yourself jerking backward.\n\n"
        +"\"I can't have someone like you here! OUT!\" The gypsy yells again, and you are slathered in spittle and drool as it leaps from her mouth. Your welcome clearly over-stayed, you acquiesce to the womans demands, quickly shuffling out of the crowded cart. It cost nothing, but you still can't help but feel cheated by the strange experience as you walk home.\n\n"
        +"The strange experience sticks with you through the rest of the day, and as you find yourself falling asleep the gypsies fortune weighs on your mind. A strange nightmare filled sleep envelopes you, the terrible gypsies strange demeanor and gestures amplified and made more monstrous by recollection, until you find yourself leaping from sleep and back to reality, only to find yourself no longer where you fell asleep, the searing light of the sun beating upon your freshly opened eyes. \n\nYou're not quite sure what's going on. ");

        theMainGUI.enableButtons();

        LOGGER.info(newPlayer.name);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("nameConfirmed")){
                //name = nameEntry.getText();
                LOGGER.info("nameconfirmationbuttonpressed");
                newPlayer.setName(nameEntry.getText());
                textField.remove(nameEntry);
                nameEntry = null;
                textField.remove(confirmName);
                setFitness();
        }
        if(command.equals("ageConfirmed")){
            //String text = ageEntry.getText();
            //String digits = text.replaceAll("[^0-9.]", "");
            //System.out.println(digits);
            //int age = Integer.parseInt(digits);
            String text = ageEntry.getText();
            age_flag = Integer.parseInt(text);
            System.out.println(age_flag);
            LOGGER.info("ageconfirmationbuttonpressed");
            //newPlayer.setAge(ageEntry.getText());
            newPlayer.ageDemo = age_flag;
            //newPlayer.applyAffectByID(FPalaceHelper.age_id, age_flag-23);//,0,null,Body.change_stats_total)
            
            textField.remove(ageEntry);
            nameEntry = null;
            textField.remove(confirmAge);
            afterName();
        }
    }
    public void exitNewGameStart(){
        textField.removeHyperlinkListener(hlListen);
        textField.removeAll();
    }
}
