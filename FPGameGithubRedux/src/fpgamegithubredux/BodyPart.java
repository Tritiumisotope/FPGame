package fpgamegithubredux;

import java.util.ArrayList;

import javax.swing.JLabel;


public class BodyPart extends DynamicObject {
    public static final int display_front = 0;
    public static final int display_bottom = 1;
    public static final int display_top = 2;
    public static final int display_left = 3;
    public static final int display_right = 4;
    public static final int display_bottom_left = 5;
    public static final int display_bottom_right = 6;
    public static final int display_bottom_back = 7;
    public static final int display_back = 8;
    public static final int display_top_back = 9;
    public static final int display_mid_top = 10;
    
    //multiple descriptions based on stats?
    public int part_id;
    public Race race;
    public String description;
    public String pair_name;
    public String pair_description;
    
    //public  stat_id:Array
    protected int[] stat_id;
    //public  stat_description:Array
    protected Stat[] stat_description;
    //public  equip:Array
    protected ArrayList<Equipment> equip;
    
    public Weapon hold;
    public int hold_slots;
    public Boolean get_pregnant;
    public Boolean critical_part;
    /*
    public  actions:Array
    public  attacks:Array
    public  covered_by:Array
    */
    protected CharAction[] attacks;
    protected CharAction[] actions;
    protected Equipment[] covered_by;
    protected BodyPartState part_state;
    
    public String current_part_state;
    //public  part_upkeep:Array
    public TickEffect[] part_upkeep;
    public int part_count;
    
    public int[] can_connect_to;//was Array
    public ArrayList<ArrayList<BodyPart>> connected_to;//was Array
    
    public int connect_direction;
    
    public int display_length_stat_id;
    public Number display_length_mod;
    
    public int display_width_stat_id;
    public Number display_width_mod;
    public int display_width_stat_id2;
    public Number display_width_mod2;
    
    public Boolean mirror_display;
    
    public void Body_part(){
        name = "";
        pair_name = "";
        description = "";
        pair_description = "";
        current_part_state = "";
        //stat_id = new Array()
        //stat_description = new Array()
        race = null;
        hold = null;
        hold_slots = 0;
        //actions = new Array()
        //attacks = new Array()
        //equip = new Array()
        //covered_by = new Array()
        get_pregnant = false;
        critical_part = false;
        //part_upkeep;// = new Array()
        part_count = 0;
        
        can_connect_to =null;// new Array()
        connected_to = null;//new Array()
        
        connect_direction = 0;
        display_length_stat_id = -1;
        display_length_mod = 1;
        
        display_width_stat_id = -1;
        display_width_mod = 1;
        display_width_stat_id2 = -1;
        display_width_mod2 = 1;
        
        mirror_display = false;
    }
    
    public void set_mirror_display(){
        mirror_display = !mirror_display;
    }
    
    public JLabel get_part_image(){
        JLabel ret = null;
                    
        if(race.get_part_image(part_id) >= 0){
            //ret = new Array()
            ret= FPalaceHelper.get_image_by_id(race.get_part_image(part_id),"body" );//was ret[ret.length]
        }
                    
         int i = 0;
        for(i=0;i<covered_by.length;i++){
            int image_id = covered_by[i].get_part_image(part_id);
            if(image_id >=0){
                //JLabel temp_bmp = FPalaceHelper.get_image_by_id(image_id, "Equipment");//was BitMap
                //if(ret == null)ret = new JLabel();//= new Array()
                                    
                //ret = temp_bmp;//was ret[ret.length]
                ret = new JLabel();//TODO add equipment imgs
            }else if(image_id == Equipment.hide_part){
                //return new Array()
                return new JLabel();
            }
        }
        
        return ret;
    }
    
    public void set_display_length_stat(int stat_id){
        display_length_stat_id = stat_id;
    }
    
    public void set_display_length_mod(Number i){
        display_length_mod = i;
    }
    
    public void set_display_width_stat(int stat_id){
        display_width_stat_id = stat_id;
    }
    
    public void set_display_width_mod(Number i){
        display_width_mod = i;
    }
    
    public void set_display_width2_stat(int stat_id){
        display_width_stat_id2 = stat_id;
    }
    
    public void set_display_width2_mod(Number i){
        display_width_mod2 = i;
    }
    
    public void set_display_direction(int i){
        connect_direction = i;
    }
    
    public void new_connect_slot(int slot_id){
        can_connect_to[can_connect_to.length] = slot_id;
    }
    
    public Boolean connect_to_part(BodyPart bp, Boolean good_on_my_end,Boolean force_connect){//default false, false
        Boolean ret = false;
        if(bp == this)return ret;
        for(int i=0;i<can_connect_to.length;i++){
            if(bp.get_part_id() == can_connect_to[i] && (connected_to.get(i) == null || force_connect)){//[]
                if(good_on_my_end){
                    ret = true;
                }else{
                    ret = bp.connect_to_part(this, true, force_connect);
                }
                if(ret){
                    if(connected_to.get(i) == null)connected_to.set(i, new ArrayList<BodyPart>());// = new Array;//[] to .get() and .set()
                    //connected_to[i][connected_to[i].length] = bp
                    connected_to.get(i).add(bp);
                    break;
                }
            }
            
        }
        return ret;
    }
    
    public void remove_part_connection(BodyPart bp){
        if(bp != null){
             int i = 0;
            for(i=0;i<=connected_to.size();i++){//.length
                if(connected_to.get(0) != null){
                     int j = 0;
                     
                    for(j=0;j<connected_to.get(0).size();j++){//[].length
                        if(connected_to.get(i).get(j) == bp){//[][]
                            /*TODO slice
                            connected_to[i] = connected_to[i].slice(0,j).concat(connected_to[i].slice(j+1,connected_to[i].length))
                            if(connected_to[i].length == 0)connected_to[i] = null
                            break;
                            */
                        }
                    }
                    
                }
            }
        }			
    }
    
    @Override
public String getName(){
        String ret;//=name
        if(part_count%10 == 1&&part_count!=11){
            ret = (part_count) + "st " + name;
        }else if(part_count%10 == 2&&part_count!=12){
            ret = (part_count) + "nd " + name;
        }else if(part_count%10 == 3&&part_count!=13){
            ret = (part_count) + "rd " + name;
        }else{
            ret = (part_count) + "th " + name;
        }

        return ret;
    }
    
    public String get_pair_name(){
         String ret;// = pair_name
         if(part_count%10 == 1&&part_count!=11){
            ret = (part_count) + "st " + pair_name;
        }else if(part_count%10 == 2&&part_count!=12){
            ret = (part_count) + "nd " + pair_name;
        }else if(part_count%10 == 3&&part_count!=13){
            ret = (part_count) + "rd " + pair_name;
        }else{
            ret = (part_count) + "th " + pair_name;
        }
        
        return ret;
    }
    
    public void set_part_count(int i){
        part_count = i;			
    }
    
    public void set_pair_name(String s){
        pair_name = s;
    }
    
    public Boolean crit_part(){
        return critical_part;
    }
    
    public void set_crit_part(){
        critical_part = !critical_part;
    }
    public ArrayList<Integer> get_incap_stat_ids(Character c){
         ArrayList<Integer> ret = new ArrayList<>();
        for(int i=0;i<stat_description.length;i++){
             int ps = stat_description[i].check_combat_status(c, this);
            if(ps <= Stat.STATUSCONFIRMEDINCAPACITATED){
                //ret[ret.length] = stat_description[i].get_id();
                ret.add(stat_description[i].get_id());
            }
        }
        return ret;
    }//TODO Verify!
    
    public int check_combat_status(Character c){
         int ret = 1;//everything is a-ok
        //0 can't move, but still alive
        //-1 somebody killed me
        for(int i=0;i<stat_description.length;i++){
             int ps = stat_description[i].check_combat_status(c, this);
            if(ret > ps)ret = ps;
        }
        
        return ret;
    }
    
    public int check_overworld_status(Character c){
         int ret = 1;//everything is a-ok
        //0 can't move, but still alive
        //-1 somebody killed me
         int i = 0;
        for(i=0;i<stat_description.length;i++){
             int ps = stat_description[i].check_overworld_status(c, this);
            if(ret > ps)ret = ps;
        }
        return ret;
    }
    
    public String get_combat_status(Character c){
         String ret = "";
         int i = 0;
        for(i=0;i<stat_description.length;i++){
             int ps = stat_description[i].check_combat_status(c, this);
            if(ps <= Stat.STATUSCONFIRMEDINCAPACITATED){
                ret += stat_description[i].get_combat_status(c, this);
            }
        }
        return ret;
    }
    
    public String get_overworld_status(Character c){
         String ret = "";
         int i = 0;
        for(i=0;i<stat_description.length;i++){
             int ps = stat_description[i].check_overworld_status(c, this);
            if(ps <= Stat.STATUSCONFIRMEDINCAPACITATED){
                ret += stat_description[i].get_overworld_status(c, this);
            }
        }
        return ret;
    }
    
    public void add_upkeep(TickEffect tf){
        part_upkeep[part_upkeep.length] = tf;
    }
    
    public void set_get_pregnant(){
        get_pregnant = !get_pregnant;
    }
    
    public Boolean gets_pregnant(){
        return get_pregnant;
    }
    
    public String state_check(Character c){
        if (part_state != null){
            String new_part_state = part_state.get_state_description(c, this);
            if(current_part_state.equals(new_part_state))return "";
            if(!new_part_state.equals(""))current_part_state = new_part_state;
            return new_part_state;
        }
        
        return "";
    }
    
    public void set_part_state(BodyPartState p){
        part_state = p;
    }
    
    
    public void add_description(String s){
        description = s;
    }
    
    public void add_pair_description(String s){
        pair_description = s;
    }
    
    public void set_part_id(int i){
        part_id = i;
    }
    
    public int get_part_id(){
        return part_id;
    }
    
    public int get_perception_difficulty(Character c){
         int ret = 0;
         int i = 0;
        for(i=0;i<covered_by.length;i++){
            //ret += covered_by[i].covered_difficulty(c, part_id, this);	
            //TODO			
        }
        
        return ret;
    }
    
    private String get_covered_desc(Character c){
         String ret = null;
        if(covered_by[covered_by.length -1] != null) {
            Equipment cover_equip = covered_by[covered_by.length -1];
            /*TODO
            if(cover_equip.show_other_cover() && covered_by[covered_by.length -2] != null){
                ret = covered_by[covered_by.length -2].covered_description(c, part_id,this) + cover_equip.covered_description(c, part_id,this) + stat_descriptions(c,1);
            }else{
                ret = cover_equip.covered_description(c, part_id,this) + stat_descriptions(c,1);
            }
            */
            
        }
        return ret;
    }
    
    public String pair_appearance(BodyPart other_bp, Character c){
         String ret = "";
        if(!pair_description.equals("")){
            ret = pair_description;
        }
        
         String cover = get_covered_desc(c);
         String other_cover = other_bp.get_covered_desc(c);
        if(cover != null){
            if(!other_cover.equals(cover)){
                while(cover.indexOf("</bpn>") >= 0)cover = cover.replace("</bpn>", getName());
                if(other_cover != null){
                    while(other_cover.indexOf("</bpn>") >= 0)other_cover = other_cover.replace("</bpn>", other_bp.getName());
                    ret = cover + other_cover;
                }else{
                    ret += cover;
                }
            }else{
                ret = cover;
                while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", get_pair_name());
            }
        }else if(other_cover != null){
            //trace("(Body_part.pair_appearance)Should be outputing the other parts cover I think... it actually has some. Ignoring cover instead.");
        }
        
        if(other_bp.stat_descriptions(c).equals(stat_descriptions(c))){
            ret += stat_descriptions(c);
            while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", get_pair_name());
        }else if(!other_bp.stat_descriptions(c).equals("") || !stat_descriptions(c).equals("")){
            ret += stat_descriptions(c);
            while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", getName());
            ret += other_bp.stat_descriptions(c);
            while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", other_bp.getName());
        }
        
        if(hold != null){
            if(other_bp.hold != null){
                if(other_bp.hold == hold){
                    ret += "</pronoun> is holding a " + hold.getName() + " in </noun> </bpn>. ";
                    while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", get_pair_name());
                }else{
                    ret += "</pronoun> is holding a " + hold.getName() + " in </noun> </bpn>. ";
                    while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", getName());	
                    ret += "</pronoun> is holding a " + other_bp.hold.getName() + " in </noun> </bpn>. ";
                    while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", other_bp.getName());
                }
            }else{
                ret += "</pronoun> is holding a " + hold.getName() + " in </noun> </bpn>. ";
                while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", getName());
            }
        }else if(other_bp.hold != null){
            ret += "</pronoun> is holding a " + other_bp.hold.getName() + " in </noun> </bpn>. ";
            while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", other_bp.getName());
        }
        
        
        if(part_state != null && covered_by[covered_by.length -1] == null && other_bp.part_state != null && other_bp.covered_by[covered_by.length -1] == null){
            //trace("(Body_part.pair_appearance)Should be outputing some sort of paired part state. Doing nothing.");
        }else{
            if(part_state != null && covered_by[covered_by.length -1] == null){
                if(!part_state.get_current_state_description(c, this).equals("")){
                    ret += part_state.get_current_state_description(c, this);
                    while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", getName());
                }
            }
            if(other_bp.part_state != null && other_bp.covered_by[covered_by.length -1] == null){
                if(!other_bp.part_state.get_current_state_description(c, this).equals("")){
                    ret += other_bp.part_state.get_current_state_description(c, this);
                    while(ret.indexOf("</bpn>") >= 0)ret = ret.replace("</bpn>", other_bp.getName());
                }
            }
        }
        
        if(race != null){
            while(ret.indexOf("</r>") >= 0)ret = ret.replace("</r>", race.get_description(part_id, this));
            while(ret.indexOf("</rn>") >= 0)ret = ret.replace("</rn>", race.getName());
        }
        
        return ret;
    }
    
    @Override
public String appearance(int i, Character c){//default 0, null
         String s = "";
        if(!description.equals("")){
            s = description + stat_descriptions(c);
        }else{
            s += stat_descriptions(c);
        }
        String cover = get_covered_desc(c);
        if(cover != null) s = cover;
        if(part_state != null && covered_by[covered_by.length -1] == null){
            if(!part_state.get_current_state_description(c, this).equals(""))s += part_state.get_current_state_description(c, this);
        }
        if(hold != null) s += "</pronoun> is holding a " + hold.getName() + " in </noun> </bpn>. ";
        if(race != null){
            while(s.indexOf("</r>") >= 0)s = s.replace("</r>", race.get_description(part_id, this));
            while(s.indexOf("</rn>") >= 0)s = s.replace("</rn>", race.getName());
        }
        while(s.indexOf("</bpn>") >= 0)s = s.replace("</bpn>", getName());
        
        return s;
    }
    
    public void set_race(Race r){
        //remove the racial stats if we already had a race
        if(race != null){
             int i = 0;
            for(i=0;i<race.stats.length;i++){
                remove_stat(race.stats[i].get_id());
            }
        }
        
        race = r;
        if(race == null) return;
        //add the new racial stats (if there are any)
        int i = 0;
        for(i=0;i<race.stats.length;i++){
            Stat c_stat = new Stat(race.stats[i].get_id());
            c_stat.statCopy(race.stats[i]);
            new_stat(c_stat.get_id(),c_stat);			
        }
    }
    public void new_stat(int id, Stat s){
        new_stat(id,s,(Number)0);
    }
    public void new_stat(int id, Stat s, Number c){//default c = 0
        if(race != null){
            int count = 0;
            for(count=0;count<race.max_part.length;count++){
                if(race.max_part[count] == part_id && race.stat_max_id[count] == id){
                    if(c.doubleValue() > race.stat_max[count].doubleValue()){
                        c = race.stat_max[count];
                        break;
                    }
                }
            }
        }
        s.setStatValue(c);
        stat_id[stat_id.length] = id;
        stat_description[stat_description.length] = s;
        
    }
    
    public void remove_stat(int id){
         int i = 0;
        for(i=0;i<stat_id.length;i++){
            if(stat_id[i] == id){
                //TODO
                //stat_id = stat_id.slice(0, i).concat(stat_id.slice(i+1, stat_id.length));
                //stat_description = stat_description.slice(0, i).concat(stat_description.slice(i+1, stat_description.length));
            }
        }
    }
    
    public void add_stat_action(int id, CharAction a){
         int i = 0;
        for(i=0;i<stat_id.length;i++){
            if(stat_id[i] == id){
                stat_description[i].new_stat_action(a);
            }
        }
    }
    /*
    public CharAction[] get_stat_actions(int id){
        CharAction[] ret;// = new Array();
         int i = 0;
        for(i=0;i<stat_id.length;i++){
            if(stat_id[i] == id){
                ret = ret.concat(stat_description[i].get_actions());
            }
        }
        return ret;
    }
    */
    public void remove_stat_action(int id, CharAction a){
         int i = 0;
        for(i=0;i<stat_id.length;i++){
            if(stat_id[i] == id){
                stat_description[i].remove_stat_action(a);
            }
        }
    }
    
    public void set_equip(Equipment e){
        //equip[equip.length] = e;
        equip.add(e);
    }
    
    public void set_cover(Equipment e){
        covered_by[covered_by.length] = e;
    }
    
    public ArrayList<Equipment> get_equip(){
        return equip;
    }
    
    public void set_num_hold_slots(int i){
        hold_slots = i;
    }
    
    public int get_num_hold_slots(){
        return hold_slots;
    }
    
    public void set_hold(Weapon w, Character c){
        if(hold != null){
            //c.unhold(hold);
            //TODO
        }
        hold = w;
    }
    
    public Weapon get_hold(){
        return hold;
    }
    
    public String stat_descriptions(Character c){
        return stat_descriptions(c,0);
    }
    
    public String stat_descriptions(Character c, int always_show_only){//default 0
         int i = 0;
         String s = "";
        for (i=0;i<stat_description.length;i++){
            if (stat_description[i] != null) {
                if(always_show_only != 0 && !stat_description[i].get_always_show()){
                    continue;
                }
                if(!stat_description[i].stat_desc_ttl_or_indiv){
                    s += stat_description[i].get_description(c, (double)get_stat(c, stat_id[i]));
                }else{
                    if(c == null)continue;
                     BodyPart p = null;
                     //found_array:Array = new Array();
                     ArrayList<Integer> found_array= new ArrayList<>();
                     int j = 0;
                     int parts_count = 0;
                     
                    if(stat_description[i].stat_desc_ttl_part_limit.length > 0){
                         Boolean show_desc = false;
                         Number stat_total = 0;
                        for (j=0;j<c.body.parts.length;j++){
                            p = (BodyPart)c.body.parts[j] ;//was as
                            int part_check = p.get_stat(c, stat_id[i]).intValue();//was number
                            if(part_check > -1){
                                int k = 0;
                                if(parts_count == 0 && p == this){
                                    show_desc = true;
                                    //stat_total += part_check;
                                    stat_total = stat_total.doubleValue() + part_check;
                                    for(k=0;k<stat_description[i].stat_desc_ttl_part_limit.length;k++){
                                        if(stat_description[i].stat_desc_ttl_part_limit[k] == part_id){
                                            //found_array[k] = part_check;
                                            found_array.set(k,part_check);
                                            break;
                                        }
                                    }
                                }else if(show_desc){
                                    for(k=0;k<stat_description[i].stat_desc_ttl_part_limit.length;k++){
                                        if(stat_description[i].stat_desc_ttl_part_limit[k] == p.part_id){
                                            if(found_array.get(k) != null && found_array.get(k) < part_check){
                                                //stat_total -= found_array.get(k);
                                                stat_total = stat_total.doubleValue() - found_array.get(k);
                                                //found_array[k] = part_check;
                                                found_array.set(k,part_check);
                                            }else if(found_array.get(k) == null){
                                                //found_array[k] = part_check;
                                                found_array.set(k,part_check);
                                            }else{
                                                part_check = 0;
                                            }
                                            break;
                                        }
                                    }
                                    if(k<stat_description[i].stat_desc_ttl_part_limit.length)stat_total = stat_total.doubleValue() + part_check;
                                }else if(parts_count > 0){
                                    break;
                                }
                                parts_count++;
                            }				
                        }
                        if(show_desc){
                            s += stat_description[i].get_description(c, stat_total.doubleValue());
                        }
                    }else{
                        for (j=0;j<c.body.parts.length;j++){
                            p = (BodyPart)c.body.parts[j];//was as
                            if(p.get_stat(c, stat_id[i]).doubleValue() > -1){
                                if(parts_count == 0 && p == this){
                                    s += stat_description[i].get_description(c, c.get_stat(stat_id[i]).doubleValue());
                                    break;
                                }else if(parts_count > 0){
                                    break;
                                }
                                parts_count++;
                            }				
                        }
                    }
                    
                }
            }
        }
        return s;
    }
    
    
    public String apply_equip_effect(int id,Number change_amt, Character c){
         String ret = "";
         int i = 0;
        for(i=0;i<stat_id.length;i++){
            if(id == stat_id[i]){
                ret += stat_description[i].get_equip_change(change_amt, c);
            }
        }
        
        return ret;
    }
    public String apply_effect(int i,Number k,Character c){
        return apply_effect(i,k,c,0,-1);
    }
    public String apply_effect(int i,Number k,Character c, int temp, int effect_type){//default temp = 0, effect_type = -1
        if(effect_type > -1){
            k = k.doubleValue() * race.get_damage_mod(effect_type);
            int cover_count = 0;
            for(cover_count=0;cover_count<covered_by.length;cover_count++){
                //k = k* covered_by[cover_count].get_damage_mod(effect_type);
                //TODO get_damage_mod
            }
        }
        
        int j = 0;
        String s = "";
        for (j=0;j<stat_id.length;j++){
            if(i == stat_id[j]){
                if(race != null && temp == 0){
                    int count = 0;
                    for(count = 0;count<race.max_part.length;count++){
                        if(race.max_part[count] == part_id && race.stat_max_id[count] == i){
                            if(stat_description[j].statValue.intValue() + k.intValue() > race.stat_max[count].intValue()){
                                k = race.stat_max[count].intValue() - stat_description[j].statValue.intValue();
                                break;
                            }
                        }
                    }
                }					
                
                //s += stat_description[j].get_change_magnitude(k,c,temp,this);
                //TODO that method
                //if(temp == 0 && stat_description[j].stat_value < 0){
                    //if not a temp, and we're setting less than 0, should we destroy the part? 
                    
                //}
                break;
            }
        }
        return s;
    }
    public Number get_stat(Character c, int i){
        return get_stat(c,i,1,true,false);
    }
    public Number get_stat(Character c, int i,int get_hard_value){
        return get_stat(c,i,get_hard_value,true,false);
    }
    public Number get_stat(Character c, int i,int get_hard_value,Boolean add_equip,Boolean skip_calc){
        //default get_hard_value:int = 1,add_equip:Boolean = true, skip_calc:Boolean = false
         int j = 0;
         Number ret = -1;
        for (j=0;j<stat_id.length;j++){
            if(i == stat_id[j] && stat_description[j] != null){
                if (part_state != null && get_hard_value == 1){
                    ret = stat_description[j].get_stat_value(c, get_hard_value, add_equip, skip_calc)*part_state.get_state_mod(stat_id[j]).doubleValue();
                    break;
                }else{
                    ret = stat_description[j].get_stat_value(c, get_hard_value, add_equip, skip_calc);
                    break;
                }					
            }
        }
        return ret;
    }
    public Boolean get_stat_min_max(int s_id, Character c){
        return get_stat_min_max(s_id,c,false);
    }
    public Boolean get_stat_min_max(int s_id, Character c,Boolean min_max){//default false
        Boolean ret = false;
         int i = 0;
        for(i=0;i<stat_id.length;i++){
            if(stat_id[i] == s_id){
                if(min_max){
                    //check if it's against the max
                    ret = stat_description[i].at_max(c, this);
                }else{
                    //check if it's against the min
                    ret = stat_description[i].at_min(c, this);
                }
            }
        }
        
        return ret;
    }
    
    public void reset_stat(Character c, int i, int k){//fdefault i = -1, k = -1
         int j = 0;
        if (i == -1){
            for (j=0;j<stat_description.length;j++){
                //stat_description[j].reset_stat(c, k, this);
                //TODO what?!
            }
        }else{
            for (j=0;j<stat_description.length;j++){
                //if(stat_description[j].getStat() == i)stat_description[j].reset_stat(c, k, this);
            }
        }
    }
    
    public void new_attack(CharAction a){
        attacks[attacks.length] = a;
    }
    
    public void new_action(CharAction a){
        actions[actions.length] = a;
    }
    
    public CharAction get_attack_action(int i){
        if (i>=0 && i<attacks.length){
            return attacks[i];
        }else{
            //trace("(BODY_PART)Should be getting racial attack");
        }
        return null;
    }
    
    public CharAction get_attack_actions(){
         CharAction ret = new CharAction();// = new Array();
        
        //ret = attacks.concat(race.get_attacks(this));
        
        return ret;
    }
    
    public CharAction get_action(int i){
        if (i>=0 && i<actions.length){
            return actions[i];
        }else{
            //trace("(BODY_PART)Should be getting racial action");
        }
        return null;
    }
    
    public CharAction get_actions(){
        CharAction ret = new CharAction();// = new Array();
        
        //ret = actions.concat(race.actions);
        
        return ret;
    }
    
    public String tick(Character c){
         String ret = "";
         int i = 0;
        for(i=0;i<part_upkeep.length;i++){
            ret += part_upkeep[i].tick(c) + "\n";
        }
        return ret;
    }
    
    //Shouldn't be used, except by Body.clone
        //and maybe Character.impregnate

    public void jiggle_stats(Body body,Number set_display){//default set_display = -1
         int i = 0;
        for(i=0;i<stat_description.length;i++){
            if(stat_description[i].get_id() == display_length_stat_id && set_display.intValue() > -1){
                stat_description[i].setStatValue(set_display);
            }else if(!stat_description[i].stat_desc_ttl_or_indiv){
                Number new_val =  Math.random()*stat_description[i].statValue.doubleValue() + 
                stat_description[i].statValue.doubleValue()/2;
                if(race != null){
                    int count = 0;
                    for(count=0;count<race.max_part.length;count++){
                        if(race.max_part[count] == part_id && race.stat_max_id[count] == stat_description[i].get_id()){
                            if(new_val.doubleValue() > race.stat_max[count].doubleValue()){
                                new_val = race.stat_max[count];
                                break;
                            }
                        }
                    }
                }
                stat_description[i].setStatValue(new_val);
            }else{
                if(body.get_part_by_stat(stat_description[i].get_id()) == this){
                    Number new_val =  Math.random()*body.get_stat_by_id(null, stat_description[i].get_id()).doubleValue()/4 - body.get_stat_by_id(null,stat_description[i].get_id()).doubleValue()/8;
                    body.get_effects(stat_description[i].get_id(), new_val, null, 0, Body.change_stats_total);
                
                }
            }
        }
    }
    
    
    public void bodyPartCopy(BodyPart b){
        if (b != null){
            set_name(b.name);
            
            description = b.description;
            pair_description = b.pair_description;
            set_pair_name(b.pair_name);
            
            part_id = b.part_id;
            int i = 0;
            if(b.equip != null){
                for(i=0;i<b.equip.size();i++){
                    //equip[i] = b.equip[i];
                    equip.set(i,b.equip.get(i));
                }
            }
                            
            if(b.covered_by != null){
                for(i=0;i<b.covered_by.length;i++){
                    covered_by[i] = b.covered_by[i];
                }
            }
            
            if(b.hold != null){
                hold = b.hold;
            }
            
            hold_slots = b.hold_slots;

            actions = b.actions;
            attacks = b.attacks;
            get_pregnant = b.get_pregnant;
            
            critical_part = b.critical_part;
            
            if(b.part_state != null){
                part_state = new BodyPartState();
                part_state.clone(b.part_state);
            }
            Race temp_race= b.race;
            b.set_race(null);
            
            for (i=0;i<b.stat_description.length;i++){
                stat_description[i] = new Stat(b.stat_description[i].statID);
                stat_description[i].statCopy(b.stat_description[i]);
            }
            
            for(i=0;i<b.stat_id.length;i++){
                stat_id[i] = b.stat_id[i];
            }
            b.set_race(temp_race);
            set_race(temp_race);
            
            for(i=0;i<part_upkeep.length;i++){
                TickEffect temp = part_upkeep[i].copyTE();
                part_upkeep[i] = temp;
            }
            
            can_connect_to = b.can_connect_to;
            
            part_count = 0;
            
            connect_direction = b.connect_direction;
            display_length_stat_id = b.display_length_stat_id;
            display_length_mod = b.display_length_mod;
            
            display_width_stat_id = b.display_width_stat_id;
            display_width_mod = b.display_width_mod;
            
            display_width_stat_id2 = b.display_width_stat_id2;
            display_width_mod2 = b.display_width_mod2;
            
            mirror_display = b.mirror_display;
        }
    }
}
