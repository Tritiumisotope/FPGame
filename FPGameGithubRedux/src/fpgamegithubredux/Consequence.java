package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;

public class Consequence {//TODO get count of all below
    protected static int amt_from_roll_const = -999999;
    
    protected ArrayList<Integer> statEffected;
    protected ArrayList<Double> conseq;
    protected ArrayList<String> consequenceDescription;
    protected ArrayList<Integer> roll_required;//array
    protected ArrayList<Integer> showEffects;
    protected ArrayList<Integer> tempFlag;
    protected ArrayList<Integer> consequenceChallenge;
    protected ArrayList<Boolean> consequenceTarget;
    protected ArrayList<TickEffect> consequenceTickEffect;
    protected Boolean amt_by_roll;
    protected ArrayList<String> amt_formula;
    protected Boolean random_effect;
    protected Boolean change_on_success;
    protected Boolean always_change;
    protected Boolean never_change;
    protected ArrayList<Object> change_effects;
    protected ArrayList<Integer> action_for_stat;
    protected int xp_reward;//uint
    protected ArrayList<Integer> un_equip_slots;//protected var un_equip_slots:Array
    protected ArrayList<Boolean> un_equip_target;//protected var un_equip_target:Array
    protected ArrayList<Integer> targetPart;//same to here as original
    protected int impregnate;
    protected int consume;
    protected int extract;
    protected int damage_type_id;
    protected Boolean make_party;
    protected Boolean remove_party;
    protected Number max_damage;
    protected Boolean change_skills;
    protected ArrayList<Integer> remove_effect_ids;
    protected ArrayList<Integer> advance_effect_by;
    protected Challenge interupt_chal;
    protected CharAction replace_action;
    protected ArrayList<Character_template> char_effect;
    protected Boolean start_combat;
    protected ArrayList<Double> effectAmount;



    public Consequence(){
        statEffected = new ArrayList<>();
        conseq = new ArrayList<>();
        consequenceDescription = new ArrayList<>();
        effectAmount = new ArrayList<>();
        roll_required = new ArrayList<>();
        showEffects = new ArrayList<>();
        tempFlag = new ArrayList<>();
        consequenceChallenge = new ArrayList<>();
        consequenceTarget = new ArrayList<>();
        consequenceTickEffect = new ArrayList<>();

        amt_by_roll = false;
        amt_formula = null;
        random_effect = false;
        change_on_success = false;
        always_change = false;
        never_change = false;

        change_effects = new ArrayList<>();
        action_for_stat = new ArrayList<>();
        xp_reward = 0;
        un_equip_slots = new ArrayList<>();
        un_equip_target = new ArrayList<>();
        targetPart = new ArrayList<>();
        impregnate = 0;
        consume = 0;
        extract = 0;
        damage_type_id = -1;
        make_party = false;
        remove_party = false;
        max_damage = 0;
        change_skills = false;
        remove_effect_ids = new ArrayList<>();
        advance_effect_by = new ArrayList<>();
        interupt_chal = null;
        replace_action = null;
        char_effect = new ArrayList<>();	
        start_combat = false;
    }
    public static String name_swap(String swap_string){
        while(swap_string.indexOf("</n2>") >= 0) swap_string = swap_string.replace("</n2>","</n0>");
        while(swap_string.indexOf("</noun2>") >= 0) swap_string = swap_string.replace("</noun2>","</noun0>");
        while(swap_string.indexOf("</pronoun2>") >= 0) swap_string = swap_string.replace("</pronoun2>","</pronoun0>");
        while(swap_string.indexOf("</objnoun2>") >= 0) swap_string = swap_string.replace("</objnoun2>","</objnoun0>");
        
        while(swap_string.indexOf("</n>") >= 0) swap_string = swap_string.replace("</n>","</n2>");
        while(swap_string.indexOf("</noun>") >= 0) swap_string = swap_string.replace("</noun>","</noun2>");
        while(swap_string.indexOf("</pronoun>") >= 0) swap_string = swap_string.replace("</pronoun>","</pronoun2>");
        while(swap_string.indexOf("</objnoun>") >= 0) swap_string = swap_string.replace("</objnoun>","</objnoun2>");
        
        while(swap_string.indexOf("</n0>") >= 0) swap_string = swap_string.replace("</n0>","</n>");
        while(swap_string.indexOf("</noun0>") >= 0) swap_string = swap_string.replace("</noun0>","</noun>");
        while(swap_string.indexOf("</pronoun0>") >= 0) swap_string = swap_string.replace("</pronoun0>","</pronoun>");
        while(swap_string.indexOf("</objnoun0>") >= 0) swap_string = swap_string.replace("</objnoun0>","</objnoun>");
        
        return swap_string;
    }
    public void set_replace_action(CharAction a){
        replace_action = a;
    }
    
    public void set_interupt_chal(Challenge c){
        interupt_chal = c;
    } 
    public void add_remove_status(int status_id){
        add_remove_status(status_id, -1);
    }
    public void add_remove_status(int status_id, int tick_count){//default -1 tickCount
        remove_effect_ids.add(status_id); //remove_effect_ids[remove_effect_ids.length] = status_id
        advance_effect_by.add(tick_count); //advance_effect_by[advance_effect_by.length] = tick_count
    }
    
    public void set_change_skills(){
        change_skills = !change_skills;
    }

    public void add_char_effect(Character_template chare){
        add_char_effect(chare,true);
    }
    public void add_char_effect(Character_template chare,Boolean start_fight){//default true
        char_effect.add(chare); //char_effect[char_effect.length] = chare
        start_combat = start_fight;
    }
    public void add_char_list(ArrayList<Character_template> char_list){
        add_char_list(char_list,true);
    }
    public void add_char_list(ArrayList<Character_template> char_list,Boolean start_fight){//default true
        char_effect.addAll(char_list); //char_effect[char_effect.length] = char_list
        start_combat = start_fight;
    }
    
    public void set_max_damage(Number i){
        max_damage = i;
    }

    public void amt_by_roll_flag(){
        amt_by_roll_flag(null);
    }
    public void amt_by_roll_flag(String[] a){///was array, def null
        amt_by_roll = !amt_by_roll;
        
        if(a != null){
            ArrayList<String> dia1 = new ArrayList<>(Arrays.asList(a));//TODO check if can be just thrown arrays
            amt_formula = dia1;//was a
        }else{
            amt_formula = null;
        }
    }
    public void set_reward(int i){//was uint
        xp_reward = i;
    }
    public void set_impregnate(){
        set_impregnate(1);
    }
    public void set_impregnate(int i){//def 1
        impregnate = i;
    }
    
    public void set_consume(int i){
        consume = i;
    }
    
    public void set_extract(int i){
        extract = i;
    }
    
    public void set_damage_type(int id){
        damage_type_id = id;
    }
    public void add_change_effect(Object o){
        add_change_effect(o,1);
    }
    public void add_change_effect(Object o, int stat_id){//default -1
        change_effects.add(o);//change_effects.set(change_effects.size(), o);//change_effects[change_effects.length] = o
        action_for_stat.add(stat_id); //action_for_stat.set(action_for_stat.size(),stat_id);//action_for_stat[action_for_stat.length] = stat_id
    }
    public void add_disrobe(int i){
        add_disrobe(i,false);
    }
    public void add_disrobe(int i, Boolean target){//default false
        un_equip_slots.add(i);//un_equip_slots.set(un_equip_slots.size(),i);//un_equip_slots[un_equip_slots.length] = i
        un_equip_target.add(target);//un_equip_target.set(un_equip_target.size(), target);//un_equip_target[un_equip_target.length] = target
    }
    
    public void apply_random_effect(){
        random_effect = !random_effect;
    }
    public void set_change_on_success(){
        change_on_success = !change_on_success;
    }
    
    public void set_always_change(){
        always_change = !always_change;
    }
    
    public void set_never_change(){
        never_change = !never_change;
    }

    public String trigger(Number roll){
        return trigger(roll,null,null);
    }
    public String trigger(Number roll, Character attacker){
        return trigger(roll,attacker,null);
    }
    public String trigger(Number roll, Character attacker, Character defender){//default null, null
        //String ret = ""
        StringBuilder bld = new StringBuilder();
        for(String desc : consequenceDescription){
            int index = consequenceDescription.indexOf(desc);
            int statID = statEffected.get(index);
            int neededRoll = roll_required.get(index);
            System.out.println(defender);
            
            if(defender != null){//TODO null handling better!t
                System.out.println(defender.getStat(statID));
                if(neededRoll >= 0 && roll.intValue() >= neededRoll && defender.getStat(statID) > -1){
                    bld.append(desc);//ret += desc
                }
                if(neededRoll < 0 && roll.intValue() <= neededRoll && defender.getStat(statID) > -1){
                    bld.append(desc);//ret += desc
                }
            }
        }

        return bld.toString();//ret
    }
    public void addConsequence(int statID, int changeBy, String desc, int requireRoll){
        statEffected.add(statID);
        effectAmount.add((double)changeBy);
        consequenceDescription.add(desc);
        roll_required.add(requireRoll);
    }
    public void addConsequence(int statID, Double changeBy, String desc, int requireRoll){
        statEffected.add(statID);
        effectAmount.add(changeBy);
        consequenceDescription.add(desc);
        roll_required.add(requireRoll);
    }
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll,int show_changes){
        addConsequence(statID, conseq_amt, desc, require_roll, show_changes, 0, -1, false, null, -1);
    }
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll,int show_changes,int temp){
        addConsequence(statID, conseq_amt, desc, require_roll, show_changes, temp, -1, false, null, -1);
    }
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll,int show_changes,int temp, 
    int trigger_challenge){
        addConsequence(statID, conseq_amt, desc, require_roll, show_changes, temp, trigger_challenge, false, null, -1);
    }
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll,int show_changes,int temp, 
    int trigger_challenge, Boolean flip_target){
        addConsequence(statID, conseq_amt, desc, require_roll, show_changes, temp, trigger_challenge, flip_target, null, -1);
    }
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll,int show_changes,int temp, 
    int trigger_challenge, Boolean flip_target, TickEffect tf){
        addConsequence(statID, conseq_amt, desc, require_roll, show_changes, temp, trigger_challenge, flip_target, tf, -1);
    }
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll,int show_changes,int temp, 
    int trigger_challenge, Boolean flip_target, TickEffect tf,int target_part_id/*Body.target_all_parts*/){
        //show_changes = 0, temp:int = 0, trigger_challenge:int = -1, flip_target:Boolean = false, tf:Tick_Effect = null, target_part_id:int = -1/*Body.target_all_parts*/
        statEffected.add(statID);//statEffected.set(statEffected.size(), statID);//statEffected[statEffected.length] = statID
        conseq.add(conseq_amt.doubleValue()); //conseq[conseq.length] = conseq_amt.doubleValue()
        consequenceDescription.add(desc); //consequenceDescription[consequenceDescription.length] = desc
        roll_required.add(require_roll);//roll_required.set(roll_required.size(), require_roll)
        showEffects.add(show_changes); //showEffects[showEffects.length] = show_changes
        tempFlag.add(temp); //tempFlag[tempFlag.length] = temp
        consequenceChallenge.add(trigger_challenge); //consequenceChallenge[consequenceChallenge.length] = trigger_challenge
        consequenceTarget.add(flip_target); //consequenceTarget[consequenceTarget.length] = flip_target
        consequenceTickEffect.add(tf); //consequenceTickEffect[consequenceTickEffect.length] = tf
        targetPart.add(target_part_id); //targetPart[targetPart.length] = target_part_id
    }
    public Consequence copyConsequence(){
        Consequence ret = new Consequence();
        ret.statEffected = new ArrayList<>(this.statEffected);
        ret.conseq = new ArrayList<>(this.conseq);//was consequence, presumed same
        ret.consequenceDescription = new ArrayList<>(this.consequenceDescription);
        
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
        ret.damage_type_id = this.damage_type_id;
        ret.consequenceTarget = new ArrayList<>(this.consequenceTarget);
        ret.make_party = this.make_party;
        ret.remove_party = this.remove_party;
        ret.max_damage = this.max_damage;
        ret.targetPart = new ArrayList<>(this.targetPart);
        ret.remove_effect_ids = new ArrayList<>(this.remove_effect_ids);
        ret.advance_effect_by = new ArrayList<>(this.advance_effect_by);
        ret.interupt_chal = this.interupt_chal;
        ret.char_effect = new ArrayList<>(this.char_effect);
        ret.start_combat = this.start_combat;
        
        return ret;
    }
}
