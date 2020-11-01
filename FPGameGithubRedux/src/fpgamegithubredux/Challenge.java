package fpgamegithubredux;

import java.util.Random;

public class Challenge {
    protected String tag;
    protected int variability;
    protected Random r = new Random();
    public Challenge(){
        tag = "";
        variability = 20;
    }
    public void setVariability(int newVari){
        variability = newVari;
    }
    public void setText(String incomingTag){
        tag = incomingTag;
    }
    public String getText(){
        return tag;
    }
    public int roll(Character attacker, Character defender){
        int ret = 0;
        
        int attackerRoll = (r.nextInt(variability));
        int defenderRoll = (r.nextInt(variability));

        ret = attackerRoll - defenderRoll;

        return ret;
    }
    public int roll(Character onlyChar){
        return r.nextInt(variability);
    }
}
