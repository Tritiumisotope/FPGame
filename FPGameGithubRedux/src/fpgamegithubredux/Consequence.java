package fpgamegithubredux;

import java.util.ArrayList;

public class Consequence {
    protected ArrayList<Integer> statEffected;
    protected double[] conseq;
    protected String[] consequenceDescription;
    protected int[] showEffects;
    protected int[] tempFlag;
    protected int[] consequenceChallenge;
    protected Boolean[] consequenceTarget;
    protected TickEffect[] consequenceTickEffect;
    protected int[] targetPart;

    public static int amt_from_roll_const = -999999;
		
    public int[] roll_required;//array
    public Boolean temp_flag;//Array
    public Boolean amt_by_roll;
    //public var amt_formula:Array;
    protected String[] amt_formula;
    public Boolean random_effect;
    public Boolean change_on_success;
    public Boolean always_change;
    public Boolean never_change;
    public ArrayList<Object> change_effects;
    public ArrayList<Integer> action_for_stat;
    /*
    public var change_effects:Array;
    public var action_for_stat:Array;
    */
    public int xp_reward;//uint

    
    public ArrayList<Integer> un_equip_slots;//public var un_equip_slots:Array;
    public ArrayList<Boolean> un_equip_target;//public var un_equip_target:Array;
    
    public int impregnate;
    public int consume;
    public int extract;
    public int damage_type_id;
    public Boolean make_party;
    public Boolean remove_party;
    public Number max_damage;
    public Boolean change_skills;
    public Challenge interupt_chal;
    public CharAction replace_action;
    //public var char_effect:Array;
    public Boolean start_combat;
    
    protected ArrayList<String> conseqDescr;
    protected ArrayList<Double> effectAmount;
    protected ArrayList<Integer> rollRequired;

    public int[] remove_effect_ids;
    public int[] advance_effect_by;

    public Consequence(){
        statEffected = new ArrayList<>();
        conseqDescr = new ArrayList<>();
        effectAmount = new ArrayList<>();
        rollRequired = new ArrayList<>();
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
        remove_effect_ids[remove_effect_ids.length] = status_id;
        advance_effect_by[advance_effect_by.length] = tick_count;
    }
    
    public void set_change_skills(){
        change_skills = !change_skills;
    }
    /*TODO
    public void add_char_effect(Character_template char,Boolean start_fight){//default true
        char_effect[char_effect.length] = char;
        start_combat = start_fight;
    }
    
    public void add_char_list(char_list:Array, start_fight:Boolean = true){//default true
        char_effect[char_effect.length] = char_list;
        start_combat = start_fight;
    }
    */
    public void set_max_damage(Number i){
        max_damage = i;
    }

    public void amt_by_roll_flag(){
        amt_by_roll_flag(null);
    }
    public void amt_by_roll_flag(String[] a){///was array, def null
        amt_by_roll = !amt_by_roll;
        if(a != null){
            amt_formula = a;
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
    public void add_disrobe(int i){
        add_disrobe(i, false);
    }
    public void add_disrobe(int i, Boolean target){//default false
        //un_equip_slots[un_equip_slots.length] = i;
        //un_equip_target[un_equip_target.length] = target;
        un_equip_slots.set(un_equip_slots.size(),i);
        un_equip_target.set(un_equip_target.size(), target);
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
    public void add_change_effect(Object o, int stat_id){//default -1
        //change_effects[change_effects.length] = o;
        change_effects.set(change_effects.size(), o);
        //action_for_stat[action_for_stat.length] = stat_id;
        action_for_stat.set(action_for_stat.size(),stat_id);
    }

    public String trigger(int roll, Character attacker, Character defender){
        //String ret = ""
        StringBuilder bld = new StringBuilder();
        for(String desc : conseqDescr){
            int index = conseqDescr.indexOf(desc);
            int statID = statEffected.get(index);
            int neededRoll = rollRequired.get(index);

            if(neededRoll >= 0 && roll >= neededRoll && defender.getStat(statID) > -1){
                bld.append(desc);//ret += desc
            }
            if(neededRoll < 0 && roll <= neededRoll && defender.getStat(statID) > -1){
                bld.append(desc);//ret += desc
            }
        }

        return bld.toString();//ret
    }
    public void addConsequence(int statID, int changeBy, String desc, int requireRoll){
        statEffected.add(statID);
        effectAmount.add((double)changeBy);
        conseqDescr.add(desc);
        rollRequired.add(requireRoll);
    }
    public void addConsequence(int statID, Double changeBy, String desc, int requireRoll){
        statEffected.add(statID);
        effectAmount.add(changeBy);
        conseqDescr.add(desc);
        rollRequired.add(requireRoll);
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
        statEffected.set(statEffected.size(), statID);//statEffected[statEffected.length] = statID;
        conseq[conseq.length] = conseq_amt.doubleValue();
        consequenceDescription[consequenceDescription.length] = desc;
        rollRequired.set(rollRequired.size(), require_roll);
        showEffects[showEffects.length] = show_changes;
        tempFlag[tempFlag.length] = temp;
        consequenceChallenge[consequenceChallenge.length] = trigger_challenge;
        consequenceTarget[consequenceTarget.length] = flip_target;
        consequenceTickEffect[consequenceTickEffect.length] = tf;
        targetPart[targetPart.length] = target_part_id;
    }
}
