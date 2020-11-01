package fpgamegithubredux;

import java.util.ArrayList;

public class CharAction {

    protected String name;
    protected String dialogue;
    protected ArrayList<Challenge> challenges;
    protected ArrayList<Consequence> consequences;
    protected int charID;
    
    public CharAction(){
        name = "";
        dialogue = "";
        challenges = new ArrayList<Challenge>();
        consequences = new ArrayList<Consequence>();
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void addChallenge(Challenge chal){addChallenge(chal, null);}
    public void addChallenge(Challenge chal, Consequence con){
        if(con == null) con = new Consequence();
        challenges.add(chal);
        consequences.add(con);
    }

    public String trigger(Character triggeringChar){
        String ret = dialogue;

        int contID = -1;

        //here we weave the challenges in, replacing their tags (</c1></c2>...</cn>) in the dialogue
        for(Challenge c : challenges){
            ret = ret.replaceAll("</c" + challenges.indexOf(c) + ">", "<a href=\"event:challenge,"+ contID +","+ charID +"," + challenges.indexOf(c) +"," + triggeringChar.location.getContentID(triggeringChar) + "\"><i>" + c.getText() + "</i></a>");
        }

        return ret;
    }

    public String challenge(int challengeID, Character triggeringCharacter){
        String ret = "";

        int roll = rollChallenge(challengeID, triggeringCharacter);
        ret += triggerConsequence(triggeringCharacter, triggeringCharacter, roll, challengeID);

        return ret;
    }

    public int rollChallenge(int challengeID, Character attacker){return rollChallenge(challengeID, attacker, null);}
    public int rollChallenge(int challengeID, Character attacker, Character defender){
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
