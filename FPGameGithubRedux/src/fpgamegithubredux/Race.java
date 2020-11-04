package fpgamegithubredux;

import java.util.ArrayList;

public class Race extends DynamicObject {

    //racial stats sound like a good idea? What about actions/attacks?
    public static int mamal_pregnancy = 0;
    public static int egg_pregnancy = 1;

    
    //public var bonus_stat:Array;
    protected int[] bonus_stat;
    //public var bonuArray s;
    //public var bonus_part:Array;
    protected int[] bonus_part;
    protected Number[] bonus;
    //public var skill_bonus_id:Array;
    protected int[] skill_bonus_id;
    //public var skill_bonuArray s;
    protected Number[] skill_bonus;
    //public var skill_bonus_part:Array;
    protected int[] skill_bonus_part;
    //public var desc:Array;
    protected String[] desc;
    //public var desc_part:Array;
    protected int[] desc_part;
    //public var image_part_id:Array;
    protected int[] image_part_id;
    //public var image_id:Array;
    protected int[] image_id;
    
    //public var male_nameArray s;
    protected String[] male_names;
    //public var female_nameArray s;
    protected String[] female_names;
    //public var surnameArray s;
    protected String[] surnames;
    
    
    //public var statArray s;
    protected Stat[] stats;
    
    //public var actionArray s;
    protected CharAction[] actions;

    protected ArrayList<CharAction> attacks;
    protected ArrayList<Integer> attack_slots;
    /*
    
    public var attackArray s;
    public var attack_slotArray s;
    */
    //public var aging_mod:Number;
    protected Number aging_mod;

    public BodyPart[] parts;
    public int[] parts_count;
    public String[] parts_gender;
    /*
    public var partArray s;
    public var parts_count:Array;
    public var parts_gender:Array;
    */
    public TickEffect preg_effect;
    public int preg_type;
    
    
    //public var stat_max_id:Array;
    protected int[] stat_max_id;
    //public var stat_max:Array;
    protected Number[] stat_max;
    //public var max_part:Array;
    protected int[] max_part;
    /*
    public var damage_type_strengthArray s;
    public var damage_type_weaknesseArray s;
    */
    protected int[] damage_type_strengths;
    protected int[] damage_type_weaknesses;
    
    /*
    public var status_immunitieArray s;
    */
    protected int[] status_immunities;

    public Boolean anthropomorphic;

    public Race(){
        name = "";
        /*
        bonus_stat = new Array();
        bonus = new Array();
        bonus_part = new Array();
        skill_bonus_id = new Array();
        skill_bonus = new Array();
        skill_bonus_part = new Array();
        desc = new Array();
        desc_part = new Array();
        male_names = new Array();
        female_names = new Array();
        */
        surnames[0] = "";
        
        /*
        stats = new Array();
        actions = new Array();
        attacks = new Array();
        attack_slots = new Array();
        */
        stats = null;
        preg_effect = null;
        
        preg_type = mamal_pregnancy;
        //aging_mod = 1;

        
        /*
        stat_max_id = new Array();
        stat_max = new Array();
        max_part = new Array();
        
        parts = new Array();
        parts_count = new Array();
        parts_gender = new Array();
        
        image_part_id = new Array();
        image_id = new Array();
        
        damage_type_strengths = new Array();
        damage_type_weaknesses = new Array();
        
        status_immunities = new Array();
        */
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
        damage_type_strengths[damage_type_strengths.length] = id;
    }
    
    public void add_damage_weakness(int id){
        damage_type_weaknesses[damage_type_weaknesses.length] = id;
    }
    
    public double get_damage_mod(int id){
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
    public void add_part(BodyPart bp){
        add_part( bp, -1, null);
    }
    public void add_part(BodyPart bp, int n){
        add_part( bp, n, null);
    }
    public void add_part(BodyPart bp, int n, String sex){//def n=1, sex=null
        parts[parts.length] = bp;
        parts_count[parts_count.length] = n;
        parts_gender[parts_gender.length] = sex;
    }
    
    
    public Object[] get_new_parts(Character c){
        Object[] ret = null;
        //Object[] avail_connect = c.body.get_avail_connect_part();
        int i = 0;
        /*
        for(i=0;i<parts.length;i++){
            BodyPart temp_bp = parts[i];
            if(c.body.part_count_by_name(temp_bp.name) < parts_count[i] && (parts_gender[i] == null || parts_gender[i] == c.sex.name)){
                int j= 0;
                for(j;j<avail_connect.length;j++){
                    if(avail_connect[j] == temp_bp.get_part_id()){
                        ret[ret.length] = temp_bp;
                        break;
                    }
                }
            }
        }
        */
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
                    ItemConsequence icons = (ItemConsequence)ret.end_consequence ;
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
    
    public void new_stat(Stat s){
        stats[stats.length] = s;
    }
    
    public void new_action(CharAction a){
        actions[actions.length] = a;
    }
    
    public void new_attack(CharAction a){
        new_attack(a,-1);
    }
    public void new_attack(CharAction a, int slot_id){//default -1
        //attacks[attacks.length] = a;
        //attack_slots[attack_slots.length] = slot_id;
        attacks.set(attacks.size(), a);
        attack_slots.set(attack_slots.size(), slot_id);
    }
    
    /*
    public Array get_attacks(BodyPart bp){
        var temp_arr:Array = new Array;
        
        int count = 0;
        for(count=0;count< attacks.length;count++){
            if(attack_slots[count] > -1){
                if(attack_slots[count] == bp.get_part_id()){
                    temp_arr[temp_arr.length] = attacks[count];
                }
            }else{
                temp_arr[temp_arr.length] = attacks[count];
            }
        }
        
        
        return temp_arr;
    }
    */
    
    public void new_male_name(String s){
        male_names[male_names.length] = s;
    }
    
    public void new_male_name_set(String[] s){
        male_names = s;
    }
    
    
    public void new_female_name(String s){
        female_names[female_names.length] = s;
    }
    
    public void new_female_name_set(String[] s){
        female_names = s;
    }
    
    public void new_surname(String s){
        surnames[surnames.length] = s;
    }
    
    public void new_surname_set(String[] s){
        surnames = s;
    }
    
    public String get_random_female_name(){
        String s= "";
        int i= (int)Math.round(Math.random()*(female_names.length - 1));
        
        s += female_names[i];
        
        return s;
    }
    
    public String get_random_male_name(){
        String s= "";
        int i= (int)Math.round(Math.random()*(male_names.length - 1));
        
        s += male_names[i];
        
        return s;
    }
    
    public String get_random_surname(){
        String s= "";
        int i= (int)Math.round(Math.random()*(surnames.length - 1));
        
        s += surnames[i];
        
        return s;
    }
    public void set_bonus(int k, Number i){
        set_bonus( k,  i,-1);
    }
    public void set_bonus(int k, Number i, int pid){//default pid = -1
        bonus_stat[bonus_stat.length] = k;
        bonus[bonus.length] = i;
        bonus_part[bonus_part.length] = pid;
    }
    
    public void set_skill_bonus(int skill_id,Number bonus_amt, int pid){//pid def -1
        skill_bonus_id[skill_bonus_id.length] = skill_id;
        skill_bonus[skill_bonus.length] = bonus_amt;
        skill_bonus_part[skill_bonus_part.length] = pid;
    }
    
    public void set_stat_max(int stat_id,Number max, int pid){
        stat_max_id[stat_max_id.length] = stat_id;
        stat_max[stat_max.length] = max;
        max_part[max_part.length] = pid;
    }
    
    public void apply_bonuses(Character c,BodyPart p,Boolean delay_effect){//default false
        int i= 0;
        for(i=0;i<bonus.length;i++){
            if (bonus[i] != null && (p.part_id == bonus_part[i] || bonus_part[i] == -1)){
                if(delay_effect && bonus_part[i] == -1){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence = new Consequence();
                    consequence.addConsequence(bonus_stat[i],bonus[i].intValue()/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_tick_effect(tf);
                }else{
                    p.apply_effect(bonus_stat[i],bonus[i], c);
                }
            }
        }
        
        i = 0;
        for(i=0;i<skill_bonus.length;i++){
            if (skill_bonus[i] != null && (p.part_id == skill_bonus_part[i] || skill_bonus_part[i] == -1)){
                //c.set_skill_bonus(skill_bonus_id[i], skill_bonus[i]);
                //TODO
            }
        }
    }
    
    
    
    public void reverse_bonuses(Character c,BodyPart p,Boolean delay_effect){//default false
        int i= 0;
        for(i=0;i<bonus.length;i++){
            if (bonus[i] != null && (p.part_id == bonus_part[i] || bonus_part[i] == -1)){
                if(delay_effect && bonus_part[i] != -1){
                    TickEffect tf = new TickEffect();
                    tf.set_end_tick(FPGameGithub.T1_HOUR);
                    Consequence consequence = new Consequence();
                    consequence.addConsequence(bonus_stat[i],-bonus[i].intValue()/4, "", 0);
                    
                    tf.set_end_consequence(consequence);
                    
                    tf.set_tick_consequence(Math.floor(0.75*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.5*FPGameGithub.T1_HOUR),consequence);
                    tf.set_tick_consequence(Math.floor(0.25*FPGameGithub.T1_HOUR),consequence);
                    
                    c.apply_tick_effect(tf);
                }else{
                    Number out = -1*bonus[i].doubleValue();
                    p.apply_effect(bonus_stat[i],out, c);
                }
            }
        }
        
        i = 0;
        for(i=0;i<skill_bonus.length;i++){
            if (skill_bonus[i] != null && (p.part_id == skill_bonus_part[i] || skill_bonus_part[i] == -1)){
                Number out = -1*skill_bonus[i].doubleValue();
                //c.set_skill_bonus(skill_bonus_id[i], out);
                //TODO
            }
        }
    }
    
    
    public String get_description(int part_id, BodyPart bp){
        int i= 0;
        for (i=0;i<desc_part.length;i++){
            if(desc_part[i] == bp.part_id){
                return desc[i];
            }
        }
        
        return name + ". ";
    }
    
    public int get_part_image(int part_id){
        int i= 0;
        for(i=0;i<image_part_id.length;i++){
            if(image_part_id[i] == part_id)return image_id[i];
        }
        return -1;
    }
    
    public void add_part_description(int part_id, String d){
        desc[desc.length] = d;
        desc_part[desc_part.length] = part_id;
    }
    
    public void add_part_image(int part_id, int img_id){
        image_part_id[image_part_id.length] = part_id;
        image_id[image_id.length] = img_id;
    }
    
    public void add_status_immunity(int status_id){
        status_immunities[status_immunities.length] = status_id;
    }
    
    public Boolean check_immunity(int status_id){
        Boolean ret = false;
        int i= 0;
        for(i=0;i<status_immunities.length;i++){
            if(status_immunities[i] == status_id){
                ret = true;
                break;
            }
        }			
        return ret;
    }
}
