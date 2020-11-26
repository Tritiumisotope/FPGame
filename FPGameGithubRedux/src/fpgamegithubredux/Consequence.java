package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Consequence {//TODO get count of all below
    protected static int amt_from_roll_const = -999999;
    private static final Logger LOGGER = Logger.getLogger(Consequence.class.getName());
    
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
    protected ArrayList<Object> amt_formula;
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
    protected ArrayList<Object> char_effect;
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
    public void add_char_effect(Character_template chare,Boolean startFight){//default true
        char_effect.add(chare); //char_effect[char_effect.length] = chare
        start_combat = startFight;
    }
    public void add_char_list(ArrayList<Character_template> charList){
        add_char_list(charList,true);
    }
    public void add_char_list(ArrayList<Character_template> charList,Boolean startFight){//default true
        char_effect.add(charList); //char_effect[char_effect.length] = char_list
        start_combat = startFight;
    }
    
    public void set_max_damage(Number i){
        max_damage = i;
    }

    public void join_party(){
        make_party = !make_party;
    }			
    
    public void leave_party(){
        remove_party = !remove_party;
    }

    public void amt_by_roll_flag(){
        amt_by_roll_flag(null);
    }
    public void amt_by_roll_flag(ArrayList<Object> a){///was array, def null
        amt_by_roll = !amt_by_roll;
        
        if(a != null){
            //ArrayList<String> dia1 = new ArrayList<>(Arrays.asList(a));//TODO check if can be just thrown arrays
            amt_formula = new ArrayList<>(a);//then wasdia1//was a
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
    private Number calculate_amt(Number r){
        Number ret = 0;
        if(amt_formula != null){
            int count = 0;
            ArrayList<Object> temp_calc = new ArrayList<>();
            for(count = 0;count < amt_formula.size();count++){
                if(amt_formula.get(count) instanceof String){
                    if(((String)amt_formula.get(count)).indexOf("r") >= 0){
                        //temp_calc[count] = r
                        temp_calc.set(count,r);
                    }else{
                        //temp_calc[count] = amt_formula[count]
                        temp_calc.set(count,amt_formula.get(count));
                    }
                }else{
                    //temp_calc[count] = amt_formula[count]
                    temp_calc.set(count,amt_formula.get(count));
                }
            }
            StringCalc2 calculator = new StringCalc2();
            LOGGER.info("Input is: "+temp_calc);
            ret = ret.doubleValue() + calculator.calculate(temp_calc);
            LOGGER.info("Output is: "+ret);
            /*
            var char_stack:Array = new Array();
            var num_stack:Array = new Array();
            
            count = 0;
            for(count; count <= temp_calc.length; count ++){
                if(temp_calc[count] is String || temp_calc[count] == null){
                    var temp_char:String = "";
                    var num1:Number;
                    var num2:Number;
                    if(temp_calc[count] == "("){
                        char_stack.push(temp_calc[count]);
                    }else if(temp_calc[count] == ")" || temp_calc[count] == null){
                        temp_char = char_stack.pop();
                        if(temp_char != "("){
                            char_stack.pop();
                            num2 = num_stack.pop();
                            num1 = num_stack.pop();
                            if(temp_char == "*"){
                                num_stack.push(num1*num2);
                            }else if(temp_char == "/"){
                                num_stack.push(num1/num2);
                            }else if(temp_char == "+"){
                                num_stack.push(num1+num2);
                            }else if(temp_char == "-"){
                                num_stack.push(num1-num2);
                            }else{
                                num_stack.push(num1);
                                num_stack.push(num2);
                            }
                        }
                    }else{
                        temp_char = char_stack.pop();
                        if(temp_char == "("){
                            char_stack.push(temp_char);
                            char_stack.push(temp_calc[count]);
                        }else{
                            char_stack.push(temp_calc[count]);
                            num2 = num_stack.pop();
                            num1 = num_stack.pop();
                            if(temp_char == "*"){
                                num_stack.push(num1*num2);
                            }else if(temp_char == "/"){
                                num_stack.push(num1/num2);
                            }else if(temp_char == "+"){
                                num_stack.push(num1+num2);
                            }else if(temp_char == "-"){
                                num_stack.push(num1-num2);
                            }else{
                                if(temp_char != null)num_stack.push(num1);
                                num_stack.push(num2);
                            }
                        }
                    }
                }else{
                    num_stack.push(temp_calc[count]);
                }
                
            }
            if(char_stack.length == 0 && num_stack.length == 1){
                ret += num_stack[0];
            }else{
                //LOGGER.info("(Consequence)We got a calculation gone wrong here....\n calc array:" + amt_formula + "\n temp_calc:" + temp_calc);
                
            }
        */
        }

        return ret;
    }
    public String trigger(Number roll){
        return trigger(roll,null,null);
    }
    public String trigger(Number roll, Character attacker){
        return trigger(roll,attacker,null);
    }
    public String trigger(Number r,Character c,Character c2){//def c = null, c2 = null
        String s = "";
        int dont_break_me = 0;
        Boolean found;
        int next_challenge_id = -1;
        Character temp_char = null;
        Character temp_char2 = null;
        if(c != null){
            temp_char = c;
            temp_char2 = c2;
        }			
        
        int i = 0;
        for (i=0;i<consequenceDescription.size();i++){
            if(c == null) break;
            Boolean name_swap = false;
            if(consequenceTarget.get(i) && c2 != null){
                c = temp_char2;
                c2 = temp_char;
                name_swap = true;
            }else{
                c = temp_char;
                c2 = temp_char2;
            }
            if(c.location == null)continue;
            found = false;
            if (random_effect && r.doubleValue() >= 0) i = (int)Math.round(Math.random()*consequenceDescription.size()-1);
            
            int stat_id = statEffected.get(i);
            int multiplyer = -1;
                            
            if((stat_id < 0 && stat_id != Character.relations_affect_id) || stat_id == -Character.relations_affect_id){
                stat_id = -stat_id;
                 multiplyer *= -1;
            }
            
            Number amt_value = r.doubleValue() * multiplyer;
            
            if(amt_by_roll && amt_formula != null){
                amt_value = calculate_amt(amt_value);
            }
            
            if(max_damage.doubleValue() > 0 && (amt_value.doubleValue() > max_damage.doubleValue() || amt_value.doubleValue() < -max_damage.doubleValue())){
                if(amt_value.doubleValue() > max_damage.doubleValue()){
                    amt_value = max_damage;
                }else{
                    amt_value = -max_damage.doubleValue();
                }
            }
            
            int part_id = targetPart.get(i);
                            
            String affects_string = "";
                
            if(r.doubleValue() >= roll_required.get(i) && roll_required.get(i) >= 0 && (change_skills || c.get_stat(stat_id,1,Body.get_stat_total, part_id).doubleValue() > -1)){
                
                s += consequenceDescription.get(i);
                
                if(xp_reward > 0){
                    if(c.party == null){
                        c.set_xp(xp_reward);
                    }else{
                        c.party.give_xp(xp_reward);
                    }
                }
                //really shouldn't write this out ALL the time.... - dealt with via se flag when adding consequence
                if (showEffects.get(i) == 0){
                    if (amt_by_roll && conseq.get(i) == Consequence.amt_from_roll_const){
                        //sometimes we want to increase something by the roll...
                        if(change_skills){
                            affects_string += c.set_skill_bonus(stat_id, amt_value.intValue());
                        }else{
                            affects_string += c.apply_affect_by_id(stat_id, amt_value,tempFlag.get(i), c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }else{
                        if(change_skills){
                            affects_string += c.set_skill_bonus(stat_id, (int)Math.round(conseq.get(i)));
                        }else{
                            affects_string += c.apply_affect_by_id(stat_id, conseq.get(i),tempFlag.get(i), c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }
                }else{
                    if (amt_by_roll  && conseq.get(i) == Consequence.amt_from_roll_const){
                        if(change_skills){
                            c.set_skill_bonus(stat_id, amt_value.intValue());
                        }else{
                            c.apply_affect_by_id(stat_id, amt_value, tempFlag.get(i), c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }else{
                        if(change_skills){
                            c.set_skill_bonus(stat_id, (int)Math.round(conseq.get(i)));
                        }else{
                            c.apply_affect_by_id(stat_id, conseq.get(i) ,tempFlag.get(i), c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }
                }
                
                if(consequenceChallenge.get(i) > -1){
                    next_challenge_id = consequenceChallenge.get(i);
                }
                
                if(consequenceTickEffect.get(i) != null)c.apply_TickEffect(consequenceTickEffect.get(i).copyTE());
                
                found = true;
                
            }
            if(r.doubleValue() <= roll_required.get(i) && roll_required.get(i) < 0 && (change_skills || c.get_stat(stat_id,1,Body.get_stat_total, part_id).doubleValue() > -1)){
                
                s += consequenceDescription.get(i);
                
                if(xp_reward/10 > 0)c.set_xp(xp_reward/10);
                
                amt_value = amt_value.doubleValue()*-1;//amt_value *= -1
                
                if (showEffects.get(i) == 0){
                    if (amt_by_roll  && conseq.get(i) == Consequence.amt_from_roll_const){
                        if(change_skills){
                            affects_string += c.set_skill_bonus(stat_id, amt_value.intValue());
                        }else{
                            affects_string += c.apply_affect_by_id(stat_id, amt_value,tempFlag.get(i),c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }else{
                        if(change_skills){
                            affects_string += c.set_skill_bonus(stat_id, (int)Math.round(conseq.get(i)));
                        }else{
                            affects_string += c.apply_affect_by_id(stat_id, conseq.get(i),tempFlag.get(i),c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }
                }else{
                    if (amt_by_roll  && conseq.get(i) == Consequence.amt_from_roll_const){
                        if(change_skills){
                            c.set_skill_bonus(stat_id, amt_value.intValue());
                        }else{
                            c.apply_affect_by_id(stat_id,amt_value,tempFlag.get(i),c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }else{
                        if(change_skills){
                            c.set_skill_bonus(stat_id, (int)Math.round(conseq.get(i)));
                        }else{
                            c.apply_affect_by_id(stat_id, conseq.get(i),tempFlag.get(i),c2, Body.change_stats_total, false, part_id,damage_type_id);
                        }
                    }
                }
                if(consequenceTickEffect.get(i) != null)c.apply_TickEffect(consequenceTickEffect.get(i));
                
                if(consequenceChallenge.get(i) > -1){
                    next_challenge_id = consequenceChallenge.get(i);
                }
                
                found = true;
            }
            if(name_swap){
                affects_string = Consequence.name_swap(affects_string);
            }
            
            s += affects_string;
            
            if (random_effect && dont_break_me < consequenceDescription.size() && !found){
                
                dont_break_me ++;
                i = 0;
                if (dont_break_me >= consequenceDescription.size()) r = -1;
                continue;
            }
            
            if (random_effect && found)break;
            
        }
         
        c = temp_char;
        c2 = temp_char2;
        
        if((  !never_change && ((!change_on_success && r.doubleValue() >= 0) || (change_on_success && r.doubleValue() < 0))  || always_change)){
            for (i=0;i<change_effects.size();i++){
                if(action_for_stat.get(i) == -1){
                    s += c.apply_change_effect(change_effects.get(i));
                }else{
                    s += c.apply_change_effect(change_effects.get(i), action_for_stat.get(i));
                }
            }
            for(i=0;i<remove_effect_ids.size();i++){
                s += c.remove_status_effect_by_id(remove_effect_ids.get(i),advance_effect_by.get(i));
            }
            for(i=0;i<un_equip_slots.size();i++){
                ArrayList<Equipment> temp_array = new ArrayList<>();
                Character char_to_unequip= c;
                if(un_equip_target.get(i)){
                    char_to_unequip = c2;
                }
                
                if(char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)) != null){
                    if(!char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)).get(0).covered_by.isEmpty()){//TODO not first instance/not get(0) after part_by_id?
                        //temp_array = temp_array.concat(char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)).get(0).covered_by)
                        temp_array.addAll(char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)).get(0).covered_by);
                    }
                    if(!char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)).get(0).get_equip().isEmpty()){//TODO not first instance/not get(0) after part_by_id?
                        //temp_array = temp_array.concat(char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)).get(0)get_equip())
                        temp_array.addAll(char_to_unequip.body.get_part_by_id(un_equip_slots.get(i)).get(0).get_equip());
                    }
                    
                    //make_sure no duplicates
                    int j = 0;
                    for(j=0;j<temp_array.size();j++){
                        Boolean item_found = false;
                        for(int k=j+1;k<temp_array.size();k++){
                            if(temp_array.get(j) == temp_array.get(k)){
                                item_found = true;
                                break;
                            }
                        }
                        if(item_found)temp_array.set(j,null);//temp_array[j] = null
                        //TODO recheck all logic
                    }
                    
                    int item_count = 0;
                    for(item_count=0;item_count<temp_array.size();item_count++){
                        if(temp_array.get(item_count) != null)char_to_unequip.unequip(temp_array.get(item_count));
                    }
                }
                //should we destroy it?
                //leave it in the characters inventory as it is now?
                //maybe drop it to the ground?
                //Lets just let character decide for now...
            }
            
            if(interupt_chal != null){
                String next_attack = c.get_next_attack();
                if(!next_attack.equals("")){
                    int interupt_roll = interupt_chal.roll(c, c);
                    int num_to_beat = 0;
                    if(amt_by_roll)num_to_beat = r.intValue();
                    if(interupt_roll >= num_to_beat){
                        s += "</n> stops what </pronoun> was doing. ";
                    }else{
                        c.set_next_attack(next_attack);
                    }
                }
            }				
            
            if(impregnate > 0){
                if(impregnate == 1){
                    s += c.impregnate(c2);
                }else{
                    //should swap the names
                    s += Consequence.name_swap(c2.impregnate(c));
                }
            }
            
            if(consume != 0){
                if(consume > 0){
                    s += c.consume(consume, c2);
                }else{
                    //should swap the names
                    s += Consequence.name_swap(c2.consume(-consume, c));
                }
            }
            
            if(extract != 0){
                if(extract > 0){
                    s += c.fluid_extraction(extract);
                }else{
                    //should swap the names
                    s += Consequence.name_swap(c2.fluid_extraction(-extract));
                }
            }
            
            if(make_party){
                if(c2 == null) LOGGER.info("(Consequence)Should be making/joining a character party ... and freaking out a bit because we only have one character");
                
                Party p = null;
                
                if(c.get_party() != null) p = c.get_party();
                if(p == null) p = new Party();
                if(c2.get_party() != null){
                    c2.get_party().remove_member(c2);
                }
                
                p.add_member(c);
                p.add_member(c2);
                c.set_party(p);
                c2.set_party(p);
                                    
            }
            
            if(remove_party){
                if(c2 == null) LOGGER.info("(Consequence)Should be leaving a character party ... and freaking out a bit because we only have one character");
                if(c2.party != null){
                    c2.party.remove_member(c2);
                    c2.set_party(null);						
                }
            }
            
            if(char_effect.get(0) != null){
                Party clone_pty = new Party();
                for(i=0;i<char_effect.size();i++){
                    if(start_combat && c2 != null && c2.location != null){
                        if(c.location.cm == null) c.location.cm = new Combat_manager();
                        c.location.cm.add_participant(c);
                        c.location.cm.add_participant(c2);
                        c.personality.new_relationship(c2, c, Relationship.aggressive_change);
                        c.personality.make_aggressive(c2);
                        c2.personality.new_relationship(c, c2, Relationship.aggressive_change);
                        c2.personality.make_aggressive(c);
                    }
                    Room spawn_loc = c.location;
                    int level_mod = 0;
                    
                    if(spawn_loc != null)level_mod = Math.abs(spawn_loc.area.find_room(spawn_loc)[2]);
                    
                    if(char_effect.get(0) instanceof Character_template){
                        c2 = ((Character_template)char_effect.get(i)).gen_char(level_mod);
                    }else if(char_effect.get(0) instanceof ArrayList<?>) {//TODO this is the only alternative, yes?
                        int rand_char = (int)Math.round(Math.random()*(((ArrayList<Character_template>)char_effect.get(i)).size()-1));
                        c2 = ((ArrayList<Character_template>)char_effect.get(i)).get(rand_char).gen_char(level_mod);
                        if(Math.random() > 0.9)i--;
                    }else{
                        LOGGER.info("Impossible char_effect contents!");
                    }
                    clone_pty.add_member(c2);
                    c2.set_party(clone_pty);
                    if(spawn_loc != null){
                        c2.new_location(spawn_loc,true);
                    }else{
                        LOGGER.info("(Consequence)Should be generating a character, but can't figure out *where*");
                    }
                }
            }
            
            if(start_combat && c2.location != null){
                //Start combat
                if(c.location.cm == null) c.location.cm = new Combat_manager();
                c.location.cm.add_participant(c);
                c.location.cm.add_participant(c2);
                c.personality.new_relationship(c2, c, Relationship.aggressive_change);
                c.personality.make_aggressive(c2);
                c2.personality.new_relationship(c, c2, Relationship.aggressive_change);
                c2.personality.make_aggressive(c);	
                s += "\n<a href=\"event:combat,"+c.location.getContentID(c)+",-1,-1\">BEGIN COMBAT</a>";
            }
        }
        
        if(next_challenge_id > -1){
            //do something to trigger the next challenge!
            //cheating... but still
            s += "</trigger" + next_challenge_id + ">";
        }
        
        return s;
    }
    /*dummy version
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
    */
    public void addConsequence(int statID, Number conseq_amt,String desc,int require_roll){
        addConsequence(statID, conseq_amt, desc, require_roll,0,0,-1,false,null,-1);
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
