package fpgamegithubredux;

import java.util.ArrayList;

public class Consequence {
    protected ArrayList<Integer> statEffected;
    protected ArrayList<String> conseqDescr;
    protected ArrayList<Double> effectAmount;
    protected ArrayList<Integer> rollRequired;

    public Consequence(){
        statEffected = new ArrayList<Integer>();
        conseqDescr = new ArrayList<String>();
        effectAmount = new ArrayList<Double>();
        rollRequired = new ArrayList<Integer>();
    }
    
    public String trigger(int roll, Character attacker, Character defender){
        String ret = "";

        for(String desc : conseqDescr){
            int index = conseqDescr.indexOf(desc);
            int statID = statEffected.get(index);
            int neededRoll = rollRequired.get(index);

            if(neededRoll >= 0 && roll >= neededRoll && defender.get_stat(statID) > -1){
                ret += desc;
            }
            if(neededRoll < 0 && roll <= neededRoll && defender.get_stat(statID) > -1){
                ret += desc;
            }
        }

        return ret;
    }

    public void add_consequence(int statID, Double changeBy, String desc, int requireRoll){
        statEffected.add(statID);
        effectAmount.add(changeBy);
        conseqDescr.add(desc);
        rollRequired.add(requireRoll);
    }
}
