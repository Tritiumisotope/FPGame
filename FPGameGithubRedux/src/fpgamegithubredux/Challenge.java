package fpgamegithubredux;

import java.lang.Math;

public class Challenge {
    protected String tag;
    protected int variability;

    public Challenge(){
        tag = "";
        variability = 20;
    }

    public String get_text(){
        return tag;
    }

    public void set_text(String _tag){
        tag = _tag;
    }

    public int roll(Character attacker, Character defender){
        int ret = 0;
        
        int attackerRoll = (int)(Math.random()*variability);
        int defenderRoll = (int)(Math.random()*variability);

        ret = attackerRoll - defenderRoll;

        return ret;
    }
}
