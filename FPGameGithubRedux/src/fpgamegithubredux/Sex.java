package fpgamegithubredux;

import java.util.ArrayList;

public class Sex extends DynamicObject {

    public String pronoun;
    public String noun;
    public String obpronoun;
    public Number[] bonus;
    public int[] age_stat;
    public double[][] age_stat_change;
    public ArrayList<Conversation_topic> social_topics;//public var social_topics:Array
    public AgeNamePair[] age_name;
    
    public int[] default_orient;
    
    public int[] damage_type_strengths;
    public int[] damage_type_weaknesses;

    public Sex() {
        name = "";
        bonus = new Number[0];
        age_stat = new int[0];
        age_stat_change = new double[0][0];
        social_topics = new ArrayList<>();
        pronoun = "";
        noun = "";
        obpronoun = "";
        age_name = new AgeNamePair[0];
        damage_type_strengths =new int[0];
        damage_type_weaknesses = new int[0];
        default_orient = new int[0];
    }
    
    public void add_damage_resistance(int id){
        damage_type_strengths[damage_type_strengths.length] = id;
    }
    
    public void add_damage_weakness(int id){
        damage_type_weaknesses[damage_type_weaknesses.length] = id;
    }
    
    public void set_default_orient(int attract,int disgust){
        default_orient[0] = attract;
        default_orient[1] = disgust;
    }
    
    public int get_default_orient_attract(){
        return default_orient[0];
    }
    
    public int get_default_orient_disgust(){
        return default_orient[1];
    }
    
    public void new_age_name(int age, String desc){
        age_name[age_name.length] = new AgeNamePair(age,name);
    }
    
    public String get_age_name(Character c){
        String ret = "";
        int age = (int)c.getStat(FPalaceHelper.age_id);
        int i = 0;
        for(i=0;i<Math.ceil(age_name.length/2);i++){
            //if(age >= age_name[i*2])ret = age_name[i*2+1]
            if(age >= age_name[i].age())ret = age_name[i].name();//TODO verify
        }
        
        return ret;
    }
    
    public void new_topic(Conversation_topic ct){
        //social_topics[social_topics.length] = ct
        social_topics.add(ct);
    }
    
    public ArrayList<Conversation_topic> get_topics(){
        return social_topics;
    }
    
    /*
    public void age(Character c, int age_change){
        int orig_equip_state = c.equip_state;
        Equipment temp_e;
        Equipment[] equip_array = c.body.get_equip_array();
        c.equip_state = 1;
        int i= 0;
        for(i=0;i<equip_array.length;i++){
            temp_e = equip_array[i];
            temp_e.remove_effects(c);
        }
        
        int starting_age = c.getStat(FPalaceHelper.age_id);
        int ending_age = c.getStat(FPalaceHelper.age_id) + age_change;
        i = 0;
        for (i=0;i<age_stat.length;i++){
            int j = starting_age;
            double percent_change = 0;//was Number
            if(age_stat_change[i] != null){
                if(age_change > 0){
                    var curr_stat_val:Number = c.get_stat(age_stat[i],0,0,-1,false);
                    j++;
                    for(j;j<= ending_age;j++){
                        if (age_stat_change[i][j] != null){
                            percent_change = age_stat_change[i][j];
                            percent_change = curr_stat_val*percent_change;
                            curr_stat_val = curr_stat_val + percent_change;
                        }else if(j >= age_stat_change[i].length){
                            percent_change = age_stat_change[i][age_stat_change[i].length-1];
                            percent_change = curr_stat_val*percent_change;
                            curr_stat_val = curr_stat_val + percent_change;
                        }
                    }
                    c.set_challenge_output(c.apply_affect_by_id(age_stat[i], curr_stat_val - c.get_stat(age_stat[i],0),0,null,Body.prorate_change_total));
                }else if(age_change < 0){
                    curr_stat_val = c.get_stat(age_stat[i],0,0,-1,false);
                    for(j;j> ending_age;j--){
                        if (age_stat_change[i][j] != null){
                            percent_change = age_stat_change[i][j];
                            percent_change = curr_stat_val - (curr_stat_val/(1 + percent_change));
                            curr_stat_val = curr_stat_val - percent_change;
                        }
                    }
                    c.set_challenge_output(c.apply_affect_by_id(age_stat[i], curr_stat_val - c.get_stat(age_stat[i],0),0,null,Body.prorate_change_total));
                }
            }
        }
        
        i = 0;
        for(i;i<equip_array.length;i++){
            temp_e = equip_array[i];
            temp_e.equip_effects(c);
        }
        c.equip_state = orig_equip_state;
        
        return;
    }
    */
    
    public void new_age_stat(int stat_id, double[] stat_change){
        age_stat[age_stat.length] = stat_id;
        age_stat_change[age_stat_change.length] = stat_change;
    }
    
            
    public void set_pronoun(String s){
        pronoun = s;
    }
    
    public String get_pronoun(){
        return pronoun;
    }
    
    public void set_noun(String s){
        noun = s;
    }
    
    public String get_noun(){
        return noun;
    }
    
    public void set_objnoun(String s){
        obpronoun = s;
    }
    
    public String get_objnoun(){
        return obpronoun;
    }
    
    public void set_bonus(int k, Number i){//i was Number
        bonus[k] = i;
    }
    
    public void apply_bonuses(Character c, Boolean delay_effect){//default false
        int i= 0;
        for(i=0;i<bonus.length;i++){
            if (bonus[i]!=(Number)0){//TODO check if this needs to be an ArrayList
                if(delay_effect){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence = new Consequence();
                    consequence.addConsequence(i,bonus[i].doubleValue()/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_tick_effect(tf);
                }else{
                    //c.apply_affect_by_id(i,bonus[i],0,null,Body.change_stats_total);					
                }
            }
        }
    }
    
    
    public void reverse_bonuses(Character c, Boolean delay_effect){//default false
        int i = 0;
        for(i=0;i<bonus.length;i++){
            if (bonus[i] != (Number)0){//TODO check if need arraylist
                if(delay_effect){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence= new Consequence();
                    consequence.addConsequence(i,-(int)bonus[i]/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_tick_effect(tf);
                }else{
                    //c.apply_affect_by_id(i,-bonus[i],0,null,Body.change_stats_total );					
                }
            }
        }
    }
    
    public double get_damage_mod(int id){//was Number
        double ret = 1;
        int i = 0;
        for(i=0;i<damage_type_strengths.length;i++){
            if(damage_type_strengths[i] == id) ret = ret/2;
        }
        for(i=0;i<damage_type_weaknesses.length;i++){
            if(damage_type_weaknesses[i] == id) ret = ret*2;
        }
        return ret;
    }
    
    public Sex copySex(){
        Sex s = new Sex();
        s.pronoun = pronoun;
        s.noun = noun;
        s.bonus = bonus;
        s.name = name;
        s.social_topics = social_topics;
        
        s.age_stat = age_stat;
        int i = 0;
        
        for (i=0;i<age_stat_change.length;i++){
            s.age_stat_change[i] = age_stat_change[i];
        }
        
        s.damage_type_strengths = damage_type_strengths;
        s.damage_type_weaknesses =damage_type_weaknesses;
        s.default_orient = default_orient;
        
        return s;
        
        
    }


}
