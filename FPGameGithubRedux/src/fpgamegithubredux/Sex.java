package fpgamegithubredux;

import java.util.ArrayList;

public class Sex extends DynamicObject {

    public String pronoun;
    public String noun;
    public String obpronoun;
    public ArrayList<Number> bonus;
    public ArrayList<Integer> age_stat;
    public ArrayList<ArrayList<Double>> age_stat_change;
    public ArrayList<Conversation_topic> social_topics;//public var social_topics:Array
    public ArrayList<AgeNamePair> age_name;
    
    public ArrayList<ArrayList<Trait>> default_orient;
    
    public ArrayList<Integer> damage_type_strengths;
    public ArrayList<Integer> damage_type_weaknesses;

    public Sex() {
        name = "";
        bonus = new ArrayList<>();//new Number[0]
        age_stat = new ArrayList<>();//new int[0]
        ArrayList<Double> dubtemp = new ArrayList<>();
        age_stat_change = new ArrayList<>();//new double[0][0]
        age_stat_change.add(dubtemp);
        social_topics = new ArrayList<>();
        pronoun = "";
        noun = "";
        obpronoun = "";
        age_name = new ArrayList<>();//new AgeNamePair[0]
        damage_type_strengths = new ArrayList<>();//=new int[0]
        damage_type_weaknesses = new ArrayList<>();//new int[0]
        default_orient = new ArrayList<>(); // before was array, a size 2 array of arrays specifically
        ArrayList<Trait> attr = new ArrayList<>();//TODO this is correct?
        ArrayList<Trait> disg = new ArrayList<>();
        default_orient.add(attr);
        default_orient.add(disg);
    }
    
    public void add_damage_resistance(int id){
        damage_type_strengths.add(id); //damage_type_strengths[damage_type_strengths.size()] = id
    }
    
    public void add_damage_weakness(int id){
        damage_type_weaknesses.add(id);//damage_type_weaknesses[damage_type_weaknesses.size()] = id
    }

    public void set_default_orient(Trait[] attract,Trait[] disgust){
        ArrayList<Trait> dia1 = new ArrayList<>();
        Trait[] first = attract;
        for(int i=0;i<first.length;i++){
        dia1.add(first[i]);
        }
        ArrayList<Trait> dia2 = new ArrayList<>();
        Trait[] second = disgust;
        for(int i=0;i<second.length;i++){
        dia2.add(second[i]);
        }
        default_orient.set(0,dia1);
        default_orient.set(1,dia2);
    }
    public void set_default_orient(ArrayList<Trait> attract,ArrayList<Trait> disgust){//both were array
        default_orient.set(0,attract);//default_orient[0] = attract
        default_orient.set(1, disgust); //default_orient[1] = disgust
    }
    
    public ArrayList<Trait> get_default_orient_attract(){
        return default_orient.get(0);//return default_orient[0]
    }
    
    public ArrayList<Trait> get_default_orient_disgust(){
        return default_orient.get(1);//return default_orient[1]
    }
    
    public void new_age_name(int age, String desc){
        age_name.add(new AgeNamePair(age,desc));//age_name[age_name.size()] = new AgeNamePair(age,name)
    }
    
    public String get_age_name(Character c){
        String ret = "";
        int age = (int)c.getStat(FPalaceHelper.age_id);
        int i = 0;
        for(i=0;i<Math.ceil(age_name.size()/2);i++){
            //if(age >= age_name[i*2])ret = age_name[i*2+1]
            if(age >= age_name.get(i).age())ret = age_name.get(i).name();//TODO verify
        }
        
        return ret;
    }
    
    public void new_topic(Conversation_topic ct){
        //social_topics[social_topics.size()] = ct
        social_topics.add(ct);
    }
    
    public ArrayList<Conversation_topic> get_topics(){
        return social_topics;
    }
    
    
    public void age(Character c, int age_change){
        int orig_equip_state = c.equip_state;
        Equipment temp_e;
        ArrayList<Object> equip_array = c.body.get_equip_array();
        c.equip_state = 1;
        int i= 0;
        for(i=0;i<equip_array.size();i++){
            if(equip_array.get(i) instanceof Equipment){//temp_e = equip_array.get(i)
                temp_e = (Equipment)equip_array.get(i);
                temp_e.remove_effects(c);
            }//TODO verify   
        }
        
        int starting_age = (int)c.getStat(FPalaceHelper.age_id);
        int ending_age = (int)c.getStat(FPalaceHelper.age_id) + age_change;
        for (i=0;i<age_stat.size();i++){
            int j;// = starting_age
            double percent_change = 0;//was Number
            if(age_stat_change.get(i) != null){
                Number curr_stat_val;
                if(age_change > 0){
                    curr_stat_val = c.get_stat(age_stat.get(i),0,0,-1,false);
                    //j++//starting_age+1

                    for(j=starting_age+1;j<= ending_age;j++){
                        if (age_stat_change.get(i).get(j) != null){
                            percent_change = age_stat_change.get(i).get(j);
                            percent_change = curr_stat_val.doubleValue()*percent_change;
                            curr_stat_val = curr_stat_val.doubleValue() + percent_change;
                        }else if(j >= age_stat_change.get(i).size()){
                            percent_change = age_stat_change.get(i).get(age_stat_change.get(i).size()-1);
                            percent_change = curr_stat_val.doubleValue()*percent_change;
                            curr_stat_val = curr_stat_val.doubleValue() + percent_change;
                        }
                    }
                    //TODO
                    //c.set_challenge_output(c.apply_affect_by_id(age_stat.get(i), curr_stat_val.doubleValue() - c.get_stat(age_stat.get(i),0).doubleValue(),0,null,Body.prorate_change_total));
                }else if(age_change < 0){
                    curr_stat_val = c.get_stat(age_stat.get(i),0,0,-1,false);
                    
                    for(j=starting_age;j> ending_age;j--){//TODO verify j
                        if (age_stat_change.get(i).get(j) != null){
                            percent_change = age_stat_change.get(i).get(j);
                            percent_change = curr_stat_val.doubleValue() - (curr_stat_val.doubleValue()/(1 + percent_change));
                            curr_stat_val = curr_stat_val.doubleValue() - percent_change;
                        }
                    }
                    //TODO
                    //c.set_challenge_output(c.apply_affect_by_id(age_stat.get(i), curr_stat_val.doubleValue() - c.get_stat(age_stat.get(i),0).doubleValue(),0,null,Body.prorate_change_total));
                }
            }
        }
        
        for(i=0;i<equip_array.size();i++){
            if(equip_array.get(i) instanceof Equipment){
                temp_e = (Equipment)equip_array.get(i);
                temp_e.equip_effects(c);
            }
        }
        c.equip_state = orig_equip_state;
        
        return;
    }
    public void new_age_stat(int stat_id, double[] stat_change){
        ArrayList<Double> dia1 = new ArrayList<>();
        for(int i=0;i<stat_change.length;i++){
            dia1.add(stat_change[i]);
        }
        age_stat.add(stat_id);
        age_stat_change.add(dia1);
    }
    
    public void new_age_stat(int stat_id, ArrayList<Double> stat_change){
        age_stat.add(stat_id);//age_stat[age_stat.size()] = stat_id
        age_stat_change.add(stat_change); //age_stat_change[age_stat_change.size()] = stat_change
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
        while(bonus.size()<=k){//TODO beat null_fill
            bonus.add(null);
        }
        bonus.set(k,i);//bonus[k] = i
        //TODO verify in bounds?
    }
    public void apply_bonuses(Character c){
        apply_bonuses(c,false);
    }
    public void apply_bonuses(Character c, Boolean delay_effect){//default false
        int i= 0;
        for(i=0;i<bonus.size();i++){
            if (bonus.get(i)!=(Number)0&&bonus.get(i)!=null){//TODO check if this needs to be an ArrayList, and if added null makes sense
                if(delay_effect){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence = new Consequence();
                    consequence.addConsequence(i,bonus.get(i).doubleValue()/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_TickEffect(tf);
                }else{
                    while(i >=bonus.size()){
                        bonus.add(null);
                    }
                    c.apply_affect_by_id(i,bonus.get(i),0,null,Body.change_stats_total);					
                }
            }
        }
    }
    
    public void reverse_bonuses(Character c){
        reverse_bonuses(c,false);
    }
    public void reverse_bonuses(Character c, Boolean delay_effect){//default false
        int i = 0;
        for(i=0;i<bonus.size();i++){
            if (bonus.get(i) != (Number)0 && bonus.get(i) != null){//TODO check if need arraylist
                if(delay_effect){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence= new Consequence();
                    consequence.addConsequence(i,-(int)bonus.get(i)/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_TickEffect(tf);
                }else{
                    Number temp = -1 * bonus.get(i).doubleValue();
                    c.apply_affect_by_id(i,temp,0,null,Body.change_stats_total );//-bonus.get(i)			
                }
            }
        }
    }
    
    public double get_damage_mod(int id){//was Number
        double ret = 1;
        int i = 0;
        for(i=0;i<damage_type_strengths.size();i++){
            if(damage_type_strengths.get(i) == id) ret = ret/2;
        }
        for(i=0;i<damage_type_weaknesses.size();i++){
            if(damage_type_weaknesses.get(i) == id) ret = ret*2;
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
        
        for (i=0;i<age_stat_change.size();i++){
            //s.age_stat_change.get(i) = age_stat_change.get(i);[] and []
            s.age_stat_change.set(i, age_stat_change.get(i));
        }
        
        s.damage_type_strengths = damage_type_strengths;
        s.damage_type_weaknesses =damage_type_weaknesses;
        s.default_orient = default_orient;
        
        return s;
        
        
    }


}
