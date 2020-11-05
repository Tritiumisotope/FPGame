package fpgamegithubredux;

import java.util.ArrayList;

public class Quest_Consequence extends Consequence {
		
    public ArrayList<Quest> quest;//Array
    public ArrayList<Integer> end_objective;//:Array
    
    public Quest_Consequence() {
        // constructor code
        super();
        quest = new ArrayList<>();
        end_objective = new ArrayList<>();
    }
    public void set_quest(Quest q){
        set_quest(q,-1);
    }
    public void set_quest(Quest q,int goto_obj_num){//def -1
        //quest[quest.length] = q;
        quest.add(q);
        //end_objective[end_objective.length] = goto_obj_num;
        end_objective.add(goto_obj_num);
    }
    
    @Override 
    public String trigger(Number r,Character c,Character c2){//def null, null
        String ret = "";
        ret += super.trigger(r,c,c2);
        
        if((  !never_change && ((!change_on_success && r.doubleValue() >= 0) || (change_on_success && r.doubleValue() < 0))  || 
        always_change)){
            if(quest.get(0) != null){
                int i = 0;
                for(i=0;i<quest.size();i++){
                    if(end_objective.get(i) >= 0){
                        //ret += c.personality.set_obj_step(quest.get(i),end_objective.get(i),c);
                        //c2.personality.set_obj_step(quest.get(i),end_objective.get(i),c2);
                    }else{
                        //c.personality.new_objective(quest.get(i), c);
                        //TODO
                    }
                }
            }
        }
        
        return ret;
    }
    /*Not in super yet
    @Override 
    public Consequence clone(){
        Quest_Consequence ret = new Quest_Consequence();
        ret.statEffected = this.statEffected;
        ret.conseq = this.conseq;
        int i = 0;
        for(i=0;i<this.consequenceDescription.length;i++){
            ret.consequenceDescription[i] = this.consequenceDescription[i];
        }
        
        ret.roll_required = this.roll_required;
        ret.showEffects = this.showEffects;
        ret.temp_flag = this.temp_flag;
        ret.amt_by_roll = this.amt_by_roll;
        ret.amt_formula = this.amt_formula;
        ret.random_effect = this.random_effect;
        ret.consequenceTickEffect = this.consequenceTickEffect;
        ret.change_on_success = this.change_on_success;
        ret.always_change = this.always_change;
        ret.never_change = this.never_change;
        ret.change_effects = this.change_effects;
        ret.action_for_stat = this.action_for_stat;
        ret.consequenceChallenge = this.consequenceChallenge;
        ret.xp_reward = this.xp_reward;
        ret.un_equip_slots = this.un_equip_slots;
        ret.un_equip_target = this.un_equip_target;
        ret.impregnate = this.impregnate;
        ret.consume = this.consume;
        ret.extract = this.extract;
        ret.consequenceTarget = this.consequenceTarget;
        ret.make_party = this.make_party;
        ret.remove_party = this.remove_party;
        ret.max_damage = this.max_damage;
        ret.targetPart = this.targetPart;
        ret.remove_effect_ids = this.remove_effect_ids;
        ret.interupt_chal = this.interupt_chal;
        ret.charEffect = this.charEffect;
        
        ret.quest = this.quest;
        ret.end_objective = this.end_objective;
        return ret;
    }
    */

}

