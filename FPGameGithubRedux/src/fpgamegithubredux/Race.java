package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;

public class Race extends DynamicObject {

    //racial stats sound like a good idea? What about actions/attacks?
    public static int mamal_pregnancy = 0;
    public static int egg_pregnancy = 1;

    protected ArrayList<Integer> bonus_stat;//public var bonus_stat:Array
    protected ArrayList<Number> bonus;//public var bonuArray s
    protected ArrayList<Integer> bonus_part;//public var bonus_part:Array
    
    protected ArrayList<Integer> skill_bonus_id;    //public var skill_bonus_id:Array
    protected ArrayList<Number> skill_bonus;    //public var skill_bonuArray s
    protected ArrayList<Integer> skill_bonus_part;    //public var skill_bonus_part:Array
    protected ArrayList<String> desc;//public var desc:Array
    protected ArrayList<Integer> desc_part;//public var desc_part:Array

    protected ArrayList<Integer> image_part_id;    //public var image_part_id:Array
    protected ArrayList<Integer> image_id;   //public var image_id:Array
    

    protected ArrayList<String> male_names;//public var male_nameArray s
    protected ArrayList<String> female_names;//public var female_nameArray s
    protected ArrayList<String> surnames;//public var surnames:Array
    
    protected ArrayList<Stat> stats;    //public var statArray s
    protected ArrayList<CharAction> actions;    //public var actionArray s
    protected ArrayList<CharAction> attacks;    //public var attackArray s
    protected ArrayList<Integer> attack_slots;   //public var attack_slotArray s
    
    protected Number aging_mod;//public var aging_mod:Number

    public ArrayList<BodyPart> parts;//public var partArray s
    public ArrayList<Integer> parts_count;//public var parts_count:Array
    public ArrayList<String> parts_gender;//public var parts_gender:Array

    public TickEffect preg_effect;
    public int preg_type;
    
    
    
    protected ArrayList<Integer> stat_max_id;//public var stat_max_id:Array
    
    protected ArrayList<Number> stat_max;//public var stat_max:Array
    
    protected ArrayList<Integer> max_part;//public var max_part:Array
 
    protected ArrayList<Integer> damage_type_strengths;   //public var damage_type_strengthArray s
    protected ArrayList<Integer> damage_type_weaknesses;    //public var damage_type_weaknesseArray s
    
    protected ArrayList<Integer> status_immunities;//    public var status_immunitieArray s

    public Boolean anthropomorphic;

    public Race(){
        name = "";
        
        bonus_stat = new ArrayList<>();
        bonus = new ArrayList<>();
        bonus_part = new ArrayList<>();
        
        skill_bonus_id = new ArrayList<>();
        skill_bonus = new ArrayList<>();
        skill_bonus_part = new ArrayList<>();
        
        desc = new ArrayList<>();
        desc_part = new ArrayList<>();
        male_names = new ArrayList<>();
        female_names = new ArrayList<>();
        
        surnames = new ArrayList<>();
        
        
        stats = new ArrayList<>();
        actions = new ArrayList<>();
        attacks = new ArrayList<>();
        attack_slots = new ArrayList<>();
        preg_effect = null;
        preg_type = mamal_pregnancy;
        aging_mod = 1;

        
        stat_max_id = new ArrayList<>();
        stat_max = new ArrayList<>();
        max_part = new ArrayList<>();
        
        parts = new ArrayList<>();
        parts_count = new ArrayList<>();
        parts_gender = new ArrayList<>();
        
        image_part_id = new ArrayList<>();
        image_id = new ArrayList<>();
        
        damage_type_strengths = new ArrayList<>();
        damage_type_weaknesses = new ArrayList<>();
        
        status_immunities = new ArrayList<>();
        
        anthropomorphic = true;
    }
    
    public void set_anthropomorphic(){
        anthropomorphic = !anthropomorphic;
    }
    
    public Boolean get_anthro(){
        return anthropomorphic;
    }
    
    public void set_preg_type(int id){
        preg_type = id;
    }
    
    public void add_damage_resistance(int id){
        damage_type_strengths.add(id); //damage_type_strengths[damage_type_strengths.length] = id
    }
    
    public void add_damage_weakness(int id){
        damage_type_weaknesses.add(id); //damage_type_weaknesses[damage_type_weaknesses.length] = id
    }
    
    public double get_damage_mod(int id){
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
    public void add_part(BodyPart bp){
        add_part( bp, -1, null);
    }
    public void add_part(BodyPart bp, int n){
        add_part( bp, n, null);
    }
    public void add_part(BodyPart bp, int n, String sex){//def n=1, sex=null
        parts.add(bp); //parts[parts.length] = bp
        parts_count.add(n);//parts_count[parts_count.length] = n
        parts_gender.add(sex); //parts_gender[parts_gender.length] = sex
    }
    
    
    public ArrayList<BodyPart> get_new_parts(Character c){
        ArrayList<BodyPart> ret = new ArrayList<>();
        ArrayList<Integer> avail_connect = c.body.get_avail_connect_part();
        for(int i=0;i<parts.size();i++){
            BodyPart temp_bp = parts.get(i);
            if(c.body.part_count_by_name(temp_bp.name) < parts_count.get(i) && (parts_gender.get(i) == null || parts_gender.get(i).equals(c.sex.name))){
                int j= 0;
                for(j=0;j<avail_connect.size();j++){
                    if(avail_connect.get(j) == temp_bp.get_part_id()){
                        //ret[ret.length] = temp_bp
                        ret.add(temp_bp);
                        break;
                    }
                }
            }
        }
        return ret;
    }
    
    
    public void set_aging_mod(Number n){
        aging_mod = n;
    }
    
    public Number get_aging_mod(){
        return aging_mod;
    }
    
    public TickEffect get_preg_effect(Character kid){
        //var reTickEffect t = null;
        TickEffect ret = new TickEffect();
        if(preg_effect != null){
            //ret = preg_effect.clone();
            if(preg_type == mamal_pregnancy){
                ret.set_character_effect(kid);
            }else if(preg_type == egg_pregnancy){
                if(ret.end_consequence != null && ret.end_consequence instanceof ItemConsequence){//was is
                    //ItemConsequence icons = (ItemConsequence)ret.end_consequence ;
                    //Item temp_egg = icons.item_reward[0];
                    //temp_egg.add_spawn_at_tick(kid, Math.round(8*FPGameGithub.T1_MONTH*aging_mod.doubleValue()));
                    //TODO
                }else{
                    //trace("(Race.get_preg_effect)Should be getting ready to lay an egg. No item end consequence to alter an egg for. Doing nothing.");
                }
            }
        }
        return ret;
    }
    
    
    public void set_preg_effect(TickEffect t){
        preg_effect = t;
    }
    
    public void new_stat(Stat s){;
        stats.add(s); //stats[stats.length] = s;
    }
    
    public void new_action(CharAction a){
        actions.add(a); //actions[actions.length] = a;
    }
    
    public void new_attack(CharAction a){
        new_attack(a,-1);
    }
    public void new_attack(CharAction a, int slot_id){//default -1
        //attacks[attacks.length] = a;
        //attack_slots[attack_slots.length] = slot_id;
        attacks.add(a);
        attack_slots.add(slot_id);
    }
    
    
    public ArrayList<CharAction> get_attacks(BodyPart bp){
        ArrayList<CharAction> temp_arr = new ArrayList<>();
        
        int count = 0;
        for(count=0;count< attacks.size();count++){
            if(attack_slots.get(count) > -1){
                if(attack_slots.get(count) == bp.get_part_id()){
                    temp_arr.add(attacks.get(count)); //temp_arr[temp_arr.length] = attacks[count];
                }
            }else{
                temp_arr.add(attacks.get(count)); //temp_arr[temp_arr.length] = attacks[count];
            }
        }
        
        
        return temp_arr;
    }
    
    
    public void new_male_name(String s){
        male_names.add(s); //male_names[male_names.length] = s
    }
    
    public void new_male_name_set(String[] s){
        male_names.addAll(Arrays.asList(s)); //male_names = s
    }
    
    
    public void new_female_name(String s){
        female_names.add(s); //female_names[female_names.length] = s
    }
    
    public void new_female_name_set(String[] s){
        female_names.addAll(Arrays.asList(s)); //female_names = s
    }
    
    public void new_surname(String s){
        surnames.add(s); //surnames[surnames.length] = s
    }
    
    public void new_surname_set(ArrayList<String> s){
        surnames = s;
    }
    
    public String get_random_female_name(){
        String s= "";
        int i= (int)Math.round(Math.random()*(female_names.size() - 1));
        
        s += female_names.get(i);
        
        return s;
    }
    
    public String get_random_male_name(){
        String s= "";
        int i= (int)Math.round(Math.random()*(male_names.size()- 1));
        
        s += male_names.get(i);
        
        return s;
    }
    
    public String get_random_surname(){
        String s= "";
        int i= (int)Math.round(Math.random()*(surnames.size() - 1));
        
        s += surnames.get(i);
        
        return s;
    }
    public void set_bonus(int k, Number i){
        set_bonus( k,  i,-1);
    }
    public void set_bonus(int k, Number i, int pid){//default pid = -1
        bonus_stat.add(k); //bonus_stat[bonus_stat.length] = k;
        bonus.add(i); //bonus[bonus.length] = i;
        bonus_part.add(pid); //bonus_part[bonus_part.length] = pid;
    }
    
    public void set_skill_bonus(int skill_id,Number bonus_amt, int pid){//pid def -1
        skill_bonus_id.add(skill_id); //skill_bonus_id[skill_bonus_id.length] = skill_id;
        skill_bonus.add(bonus_amt); //skill_bonus[skill_bonus.length] = bonus_amt;
        skill_bonus_part.add(pid);//skill_bonus_part[skill_bonus_part.length] = pid;
    }
    
    public void set_stat_max(int stat_id,Number max, int pid){
        stat_max_id.add(stat_id); //stat_max_id[stat_max_id.length] = stat_id;
        stat_max.add(max); //stat_max[stat_max.length] = max;
        max_part.add(pid); //max_part[max_part.length] = pid;
    }
    public void apply_bonuses(Character c,BodyPart p){
        apply_bonuses(c, p, false);
    }
    public void apply_bonuses(Character c,BodyPart p,Boolean delay_effect){//default false
        int i= 0;
        for(i=0;i<bonus.size();i++){
            if (bonus.get(i) != null && (p.part_id == bonus_part.get(i) || bonus_part.get(i) == -1)){
                if(delay_effect && bonus_part.get(i) == -1){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence = new Consequence();
                    consequence.addConsequence(bonus_stat.get(i),bonus.get(i).intValue()/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_TickEffect(tf);
                }else{
                    p.apply_effect(bonus_stat.get(i),bonus.get(i), c);
                }
            }
        }
        
        i = 0;
        for(i=0;i<skill_bonus.size();i++){
            if (skill_bonus.get(i) != null && (p.part_id == skill_bonus_part.get(i) || skill_bonus_part.get(i) == -1)){
                //c.set_skill_bonus(skill_bonus_id[i], skill_bonus.get(i));
                //TODO
            }
        }
    }
    
    public void reverse_bonuses(Character c,BodyPart p){
        reverse_bonuses(c, p,false);
    }
    
    public void reverse_bonuses(Character c,BodyPart p,Boolean delay_effect){//default false
        int i= 0;
        for(i=0;i<bonus.size();i++){
            if (bonus.get(i) != null && (p.part_id == bonus_part.get(i) || bonus_part.get(i) == -1)){
                if(delay_effect && bonus_part.get(i) != -1){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence = new Consequence();
                    consequence.addConsequence(bonus_stat.get(i),-bonus.get(i).intValue()/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_TickEffect(tf);
                }else{
                    Number out = -1*bonus.get(i).doubleValue();
                    p.apply_effect(bonus_stat.get(i),out, c);
                }
            }
        }
        
        i = 0;
        for(i=0;i<skill_bonus.size();i++){
            if (skill_bonus.get(i) != null && (p.part_id == skill_bonus_part.get(i) || skill_bonus_part.get(i) == -1)){
                //Number out = -1*skill_bonus.get(i).doubleValue();
                //c.set_skill_bonus(skill_bonus_id[i], out);
                //TODO
            }
        }
    }
    
    
    public String get_description(int part_id, BodyPart bp){
        int i= 0;
        for (i=0;i<desc_part.size();i++){
            if(desc_part.get(i) == bp.part_id){
                return desc.get(i);
            }
        }
        
        return name + ". ";
    }
    
    public int get_part_image(int part_id){
        int i= 0;
        for(i=0;i<image_part_id.size();i++){
            if(image_part_id.get(i) == part_id)return image_id.get(i);
        }
        return -1;
    }
    
    public void add_part_description(int part_id, String d){
        desc.add(d); //desc[desc.length] = d
        desc_part.add(part_id); //desc_part[desc_part.length] = part_id
    }
    
    public void add_part_image(int part_id, int img_id){
        image_part_id.add(part_id);//image_part_id[image_part_id.length] = part_id
        image_id.add(img_id);//image_id[image_id.length] = img_id
    }
    
    public void add_status_immunity(int status_id){
        status_immunities.add(status_id);//status_immunities[status_immunities.length] = status_id
    }
    
    public Boolean check_immunity(int status_id){
        Boolean ret = false;
        int i= 0;
        for(i=0;i<status_immunities.size();i++){
            if(status_immunities.get(i) == status_id){
                ret = true;
                break;
            }
        }			
        return ret;
    }
}
