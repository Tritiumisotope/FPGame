package fpgamegithubredux;

import java.util.ArrayList;

public class Quest_Consequence extends Consequence {
		
    protected ArrayList<Quest> quest;//Array
    protected ArrayList<Integer> endObjective;//:Array
    
    public Quest_Consequence() {
        // constructor code
        super();
        quest = new ArrayList<>();
        endObjective = new ArrayList<>();
    }
    public void set_quest(Quest q){
        set_quest(q,-1);
    }
    public void set_quest(Quest q,int gotoObjNum){//def -1
        quest.add(q);//quest[quest.length] = q
        endObjective.add(gotoObjNum);//end_objective[end_objective.length] = goto_obj_num
    }
    @Override 
    public String trigger(Number r){
        return trigger(r, null,null);
    }
    @Override 
    public String trigger(Number r,Character c){
        return trigger(r, c,null);
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
                    if(endObjective.get(i) >= 0){
                        ret += c.personality.set_obj_step(quest.get(i),endObjective.get(i),c);
                        c2.personality.set_obj_step(quest.get(i),endObjective.get(i),c2);
                    }else{
                        c.personality.new_objective(quest.get(i), c);
                    }
                }
            }
        }
        
        return ret;
    }

    @Override 
    public Consequence copyConsequence(){
        Quest_Consequence ret = new Quest_Consequence();
        ret.statEffected = new ArrayList<>(this.statEffected);
        ret.conseq = new ArrayList<>(this.conseq);//was consequence, presumed same
        ret.consequenceDescription = new ArrayList<>(this.consequenceDescription);//TODO verify, was a loop
        
        ret.roll_required = new ArrayList<>(this.roll_required);
        ret.showEffects = new ArrayList<>(this.showEffects);
        ret.tempFlag = new ArrayList<>(this.tempFlag);
        ret.amt_by_roll = this.amt_by_roll;
        ret.amt_formula = new ArrayList<>(this.amt_formula);
        ret.random_effect = this.random_effect;
        ret.consequenceTickEffect = new ArrayList<>(this.consequenceTickEffect);
        ret.change_on_success = this.change_on_success;
        ret.always_change = this.always_change;
        ret.never_change = this.never_change;
        ret.change_effects = new ArrayList<>(this.change_effects);
        ret.action_for_stat = new ArrayList<>(this.action_for_stat);
        ret.consequenceChallenge = new ArrayList<>(this.consequenceChallenge);
        ret.xp_reward = this.xp_reward;
        ret.un_equip_slots = new ArrayList<>(this.un_equip_slots);
        ret.un_equip_target = new ArrayList<>(this.un_equip_target);
        ret.impregnate = this.impregnate;
        ret.consume = this.consume;
        ret.extract = this.extract;
        ret.consequenceTarget = new ArrayList<>(this.consequenceTarget);
        ret.make_party = this.make_party;
        ret.remove_party = this.remove_party;
        ret.max_damage = this.max_damage;
        ret.targetPart = new ArrayList<>(this.targetPart);
        ret.remove_effect_ids = new ArrayList<>(this.remove_effect_ids);
        ret.interupt_chal = this.interupt_chal;
        ret.char_effect = new ArrayList<>(this.char_effect);
        
        ret.quest = new ArrayList<>(this.quest);
        ret.endObjective = new ArrayList<>(this.endObjective);
        return ret;
    }
    

}

