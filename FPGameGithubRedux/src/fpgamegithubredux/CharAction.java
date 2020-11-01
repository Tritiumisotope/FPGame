package fpgamegithubredux;

import java.util.ArrayList;

public class CharAction {

    protected String name;
    protected String dialogue;
    protected ArrayList<Challenge> challenges;
    protected ArrayList<Consequence> consequences;
    protected int ID;
    
    public CharAction(){
        name = "";
        dialogue = "";
        challenges = new ArrayList<Challenge>();
        consequences = new ArrayList<Consequence>();
    }

    public String get_name(){
        return name;
    }

    public void set_name(String _name){
        name = _name;
    }

    public void add_challenge(Challenge chal){add_challenge(chal, null);}
    public void add_challenge(Challenge chal, Consequence con){
        if(con == null) con = new Consequence();
        challenges.add(chal);
        consequences.add(con);
    }

    public String trigger(Character triggeringChar){
        String ret = dialogue;

        int cont_id = -1;

        //here we weave the challenges in, replacing their tags (</c1></c2>...</cn>) in the dialogue
        for(Challenge c : challenges){
            ret = ret.replaceAll("</c" + challenges.indexOf(c) + ">", "<a href=\"event:challenge,"+ cont_id +","+ ID +"," + challenges.indexOf(c) +"," + triggeringChar.location.get_content_id(triggeringChar) + "\"><i>" + c.getText() + "</i></a>");
        }

        return ret;
    }

    public String challenge(int challengeID, Character triggeringCharacter){
        String ret = "";

        int roll = roll_challenge(challengeID, triggeringCharacter);
        ret += triggerConsequence(triggeringCharacter, triggeringCharacter, roll, challengeID);

        return ret;
    }

    public int roll_challenge(int challengeID, Character attacker){return roll_challenge(challengeID, attacker, null);}
    public int roll_challenge(int challengeID, Character attacker, Character defender){
        int ret = 0;
        if(defender == null){
            defender = attacker;
        }
        Challenge tempChall = challenges.get(challengeID);
        if(tempChall != null){
            ret = tempChall.roll(attacker, defender);
        }

        return ret;
    }

    public String triggerConsequence(Character attacker, Character defender, int roll, int challengeID){
        String ret = "";
        Consequence tempConseq = consequences.get(challengeID);
        ret += tempConseq.trigger(roll, attacker, defender);

        return ret;
    }
}
