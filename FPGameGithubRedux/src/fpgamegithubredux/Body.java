package fpgamegithubredux;

import java.util.ArrayList;

public class Body {

    public static final int change_stats_individual = 0;
    public static final int change_stats_total = 1;
    public static final int change_first_stat = 2;
    public static final int prorate_change_total = 3;
    
    public static final int get_stat_total = 0;
    public static final int get_stat_min = 1;
    public static final int get_stat_max = 2;
    
    public static final int target_all_parts = -1;
    public static final int target_parts_one_by_one = -2;
    
    public BodyPart[] parts;//Array, number of parts vary?
    //TODO verify if other parts NULL!!!!
    
    public Body(){
        //parts = new Array()
        //FPalaceHelper.34view_test_img
    }
    
    public Sex get_sex(Character c, Character c_self){//default null, null
        Boolean no_contest = true;
        Sex ret;
        Boolean has_breasts = false;
        Boolean has_cock = false;
        Boolean has_balls = false;
        Boolean has_vag = false;
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(c == null){
                if(parts[i].get_part_id() == FPalaceHelper.breasts_slot)has_breasts = true;
                if(parts[i].get_part_id() == FPalaceHelper.cock_slot)has_cock = true;
                if(parts[i].get_part_id() == FPalaceHelper.balls_slot)has_balls = true;
                if(parts[i].get_part_id() == FPalaceHelper.vag_slot)has_vag = true;
            }else{
                Challenge percept_chal = new Challenge(true);
                int result = -1;
                int difficulty = 0;
                if(parts[i].get_part_id() == FPalaceHelper.breasts_slot){
                    difficulty = parts[i].get_perception_difficulty(c_self);
                    if(difficulty > 0){
                        percept_chal.set_attack_stat(FPalace_skills.perception_id);
                        percept_chal.set_defense_stat(-1,difficulty);
                        percept_chal.setVariability(10);
                        
                        result = percept_chal.roll(c);
            
                        if(result >= 0){
                            has_breasts = true;
                        }
                        no_contest = false;
                    }else{
                        has_breasts = true;
                    }
                }
                if(parts[i].get_part_id() == FPalaceHelper.cock_slot){
                    difficulty = parts[i].get_perception_difficulty(c_self);
                    if(difficulty > 0){
                        percept_chal.set_attack_stat(FPalace_skills.perception_id);
                        percept_chal.set_defense_stat(-1,difficulty);
                        percept_chal.setVariability(10);
                        
                        result = percept_chal.roll(c);
            
                        if(result >= 0){
                            has_cock = true;
                        }
                        if(no_contest)no_contest = false;
                    }else{
                        has_cock = true;
                    }
                }
                if(parts[i].get_part_id() == FPalaceHelper.balls_slot){
                    difficulty = parts[i].get_perception_difficulty(c_self);
                    if(difficulty > 0){
                        percept_chal.set_attack_stat(FPalace_skills.perception_id);
                        percept_chal.set_defense_stat(-1,difficulty);
                        percept_chal.setVariability(10);
                        
                        result = percept_chal.roll(c);
            
                        if(result >= 0){
                            has_balls = true;
                        }
                        if(no_contest)no_contest = false;
                    }else{
                        has_balls = true;
                    }
                }
                if(parts[i].get_part_id() == FPalaceHelper.vag_slot){
                    difficulty = parts[i].get_perception_difficulty(c_self);
                    if(difficulty > 0){
                        percept_chal.set_attack_stat(FPalace_skills.perception_id);
                        percept_chal.set_defense_stat(-1,difficulty);
                        percept_chal.setVariability(10);
                        
                        result = percept_chal.roll(c);
            
                        if(result >= 0){
                            has_vag = true;
                        }
                        if(no_contest)no_contest = false;
                    }else{
                        has_vag = true;
                    }
                }
            }
        }
        
        if(has_breasts && has_cock && has_balls && has_vag){
            ret = FPalaceHelper.sex_herm();
        }else if(has_breasts && has_cock && has_vag){
            ret = FPalaceHelper.sex_futa();
        }else if(has_breasts && has_cock){
            ret = FPalaceHelper.sex_shemale();
        }else if(has_breasts && has_vag){
            ret = FPalaceHelper.sex_female();
        }else if(has_cock && has_balls){
            ret = FPalaceHelper.sex_male();
        }else if(has_breasts){
            ret = FPalaceHelper.sex_female_eunuch();
        }else if(has_cock){
            ret = FPalaceHelper.sex_male_eunuch();
        }else{
            ret = FPalaceHelper.sex_androgynous();
        }
        
        return ret;
    }
    
    
    public Boolean alive(Character c){
        Boolean ret = true;
        
        if(parts.length <= 0 && c.location != null){
            //trace("(Body)body has no parts... can't tell if dead, or being created, but the location isn't null, so assuming dead");
            ret = false;
        }
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i].crit_part()){
                if(parts[i].check_combat_status(c) == Stat.STATUSCONFIRMEDDEAD){
                    ret = false;
                    break;
                }
            }
        }
        return ret;
    }
    
    public ArrayList<Integer> get_incap_stat_ids(Character c){
        ArrayList<Integer>  ret_array= new ArrayList<>();
        
        int i = 0;
        for(i=0;i<parts.length;i++){
            int part_status = parts[i].check_combat_status(c);
            if(part_status <= Stat.STATUSCONFIRMEDINCAPACITATED){//part is currently incapacitated
                /*TODO get_incap for parts returns array, even in AS
                int found_id = parts[i].get_incap_stat_ids(c);
                Boolean found = false;
                int j = 0;
                for(j=0;j<ret_array.size();j++){
                    if(ret_array.get(j) == found_id){
                        found = true;
                        break;
                    }
                }					
                //if(!found)ret_array = ret_array.concat(found_id);
                if(!found)ret_array.add(found_id);
                */
            }
        }
        
        return ret_array;
    }
    
    public Boolean check_combat_status(Boolean ret, Character c){
        Boolean body_ret = true;
        int i = 0;
        for(i=0;i<parts.length;i++){
            int part_status = parts[i].check_combat_status(c);
            if(part_status == Stat.STATUSCONFIRMEDDEAD){//part death!
                if(parts[i].crit_part()){
                    body_ret = false;
                    break;
                }else{
                    //c.set_challenge_output("<b></n> has broken </noun> " + parts[i].getName()+". </b>");
                    //remove_part_by_count(i, c);
                    //TODO remove part, set_challenge_output
                    i--;
                }
            }else if(part_status == Stat.STATUSCONFIRMEDINCAPACITATED){//part is currently incapacitated
                body_ret = false;
                break;
            }
        }
        
        if(!ret && body_ret)body_ret = false;
                    
        return body_ret;
    }
    
    public Boolean check_overworld_status(Boolean ret, Character c){
        Boolean body_ret = true;
        int i = 0;
        for(i=0;i<parts.length;i++){
            int part_status = parts[i].check_overworld_status(c);
            if(part_status == Stat.STATUSCONFIRMEDINCAPACITATED){//part is currently incapacitated
                body_ret = false;
                break;
            }
        }
        
        if(!ret && body_ret)body_ret = false;
        
        return body_ret;
    }
    
    public String get_combat_status(Character c){
        String ret = "";
        int i = 0;
        for(i=0;i<parts.length;i++){
            int part_status= parts[i].check_combat_status(c);
            if(part_status == Stat.STATUSCONFIRMEDINCAPACITATED){//part is currently incapacitated
                String temp_string = parts[i].get_combat_status(c);
                if(ret.indexOf(temp_string) < 0)ret += temp_string;
            }
        }
        return ret;
    }
    
    public String get_overworld_status(Character c){
        String ret = "";
        int i = 0;
        for(i=0;i<parts.length;i++){
            int part_status = parts[i].check_overworld_status(c);
            if(part_status == Stat.STATUSCONFIRMEDINCAPACITATED){//part is currently incapacitated
                String temp_string = parts[i].get_overworld_status(c);
                if(ret.indexOf(temp_string) < 0)ret += temp_string;
            }
        }
        return ret;
    }
    
    public void remove_part_by_count(int i, Character c){
        if(parts[i] != null){
            if(parts[i].equip != null){
                while(parts[i].equip.size() > 0){
                    //unequip(parts[i].equip[0], c);
                    //TODO unequip
                }
            }
            /*
            parts[i].covered_by = new Array();
            if(parts[i].get_hold() != null)unhold(parts[i].get_hold(), c);
            
            int count = 0;
            
            if(c.location != null && c.equip_state == 0){
                var temp_e:Equipment;
                var equip_array:Array = get_equip_array();
                c.equip_state = 1;
                for(count;count<equip_array.length;count++){
                    temp_e = equip_array[count];
                    temp_e.remove_effects(c,true);
                }
                c.equip_state = 0;
            }
            
            var temp_part:Body_part = parts[i];
            parts = parts.slice(0,i).concat(parts.slice(i+1,parts.length));
            
            
            //need to go through and make sure the numbering is correct...
            var num_found:int = 0;
            if(temp_part.part_count > 0){
                count = 0;
                for(count;count<parts.length;count++){
                    if(parts[count].name == temp_part.name && parts[count].get_part_id() == temp_part.get_part_id()){
                        if(parts[count].part_count > temp_part.part_count){
                            parts[count].part_count--;
                        }
                        num_found++;
                    }
                }
            }
            if(num_found == 1){//we now only have one part like this. We need to set its part_count to 0
                count = 0;
                for(count;count<parts.length;count++){
                    if(parts[count].name == temp_part.name && parts[count].get_part_id() == temp_part.get_part_id()){
                        parts[count].part_count = 0;
                        break;	
                    }
                }
            }
            
            //kill any non-critical parts it is connected to... and make sure no parts are connected to it
            var crit_part_connection:Boolean = false;
            count = 0;
            for(count;count<temp_part.connected_to.length;count++){
                if(temp_part.connected_to[count] != null && temp_part.connected_to[count] is Array){
                    var count2:int = 0;
                    for(count2;count2<temp_part.connected_to[count].length;count2++){
                        var connect_part:Body_part = temp_part.connected_to[count][count2];
                        if(connect_part != null){
                            if(connect_part.crit_part() && !crit_part_connection){
                                crit_part_connection = true;
                                count == 0;
                            }
                            if(crit_part_connection && !connect_part.crit_part()){
                                var more_counting:int = 0;
                                for(more_counting;more_counting < parts.length; more_counting++){
                                    if(parts[more_counting] == connect_part)break;
                                }
                                remove_part_by_count(more_counting, c);
                            }else{
                                connect_part.remove_part_connection(temp_part);
                            }
                        }
                    }
                }
            }
            
            if(c.location != null && c.equip_state == 0){
                c.equip_state = 1;
                count = 0;
                for(count;count<equip_array.length;count++){
                    temp_e = equip_array[count];
                    temp_e.equip_effects(c,true);
                }
                c.equip_state = 0;
            }
            */
        }
        
        //c.determine_sex();
        
    }
    
    public void add_stat_action(int stat_id, CharAction a){
        int i = 0;
        for(i=0;i<parts.length;i++){
            parts[i].add_stat_action(stat_id, a);
        }
    }
    
    public void remove_stat_action(int stat_id, CharAction a){
        int i = 0;
        for(i=0;i<parts.length;i++){
            parts[i].remove_stat_action(stat_id, a);
        }
    }
    /*TODO get_stat_actions
    public ArrayList<BodyPart> get_stat_actions(int stat_id){//was Array
        ArrayList<BodyPart> ret = new ArrayList<>();
        int i = 0;
        for(i=0;i<parts.length;i++){
            ret = ret.concat(parts[i].get_stat_actions(stat_id));
        }
        return ret;
    }
    */
    //TODO make parts have equipment in ArrayList
    public ArrayList<Object> get_equip_array(){
        return get_equip_array(false);
    }
    public ArrayList<Object> get_equip_array(Boolean include_weapons){//default false, was array
        ArrayList<Object> equip_array = new ArrayList<>();
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i].equip != null){
                int j = 0;
                for(j=0;j<parts[i].equip.size();j++){
                    int k = 0;
                    Boolean already_found = false;
                    for(k=0;k<equip_array.size();k++){
                        if(equip_array.get(k) == parts[i].equip.get(j)){
                            already_found = true;
                            break;
                        }
                    }
                    
                    if(!already_found) {
                        //equip_array[equip_array.length] = parts[i].equip[j];
                        equip_array.add(parts[i].equip.get(j));
                    }
                }
            }
            
            if(include_weapons && parts[i].get_hold() != null){
                //equip_array[equip_array.length] = parts[i].get_hold();
                equip_array.add(parts[i].get_hold());
            }
        }
        return equip_array;
    }
    
    /*TODO Array method sussing
    public function get_avail_connect_part():Array{
        var ret:Array = new Array();
        int i = 0;
        for(i=0;i<parts.length;i++){
            var temp_part:Body_part = parts[i];
            var k:int = 0;
            for(k;k<temp_part.can_connect_to.length;k++){
                if(temp_part.connected_to[k] == null){
                    var duplicate:Boolean = false;
                    var j:int = 0;
                    for(j;j<ret.length;j++){
                        if(temp_part.can_connect_to[k] == ret[j]){
                            duplicate = true;
                            break;
                        }
                    }
                    if(!duplicate)ret[ret.length] = temp_part.can_connect_to[k];
                }
            }
        }
        
        return ret;
    }
    */
    /*TODO get_equip_array
    public void add_part(BodyPart p,Character c){
        int i = 0;
        int j = 0;
        ArrayList<BodyPart> temp_array = new ArrayList<>();
        int name_in_use = 0;
        Boolean added= false;
        Equipment temp_e;
        var equip_array:Array = get_equip_array();
        if(c.location != null && c.equip_state == 0){//make sure we aren't in world gen
            c.equip_state = 1;
            for(i=0;i<equip_array.length;i++){
                temp_e = equip_array[i];
                temp_e.remove_effects(c,true);
            }
            c.equip_state = 0;
        }
        temp_array[0] = p;
        i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                if(parts[i].name.indexOf(p.name) >= 0){
                    if(name_in_use == 0)parts[i].set_part_count(1);
                    name_in_use++;
                }
            }
            if(!added && parts[i - 1] != null && parts[i] != null){
                if(p.get_part_id() >= parts[i - 1].get_part_id()
                   && p.get_part_id() < parts[i].get_part_id() ){
                    parts = parts.slice(0, i).concat(temp_array).concat(parts.slice(i, parts.length));
                    i++;
                    added = true;
                }
            }else if(!added && parts[i - 1] == null){
                if(p.get_part_id() < parts[i].get_part_id()){
                    parts = temp_array.concat(parts);
                    added = true;
                }
            }
        }
        
        i = 0;
        while(i < parts.length && !p.connect_to_part(parts[i]))i++;
        
        if(i >= parts.length && parts.length > 2){
            if(name_in_use > 0){
                i = 0;
                var lowest:int = 100;
                var lowest_id:int = -1;
                for(i=0;i<p.can_connect_to.length;i++){
                    var temp_connect_part:Array = get_part_by_id(p.can_connect_to[i]);
                    if(temp_connect_part.length > 0){
                        var already_connected_count:int = 0;
                        j = 0;
                        for(j;j<temp_connect_part.length;j++){
                            var k:int = 0;
                            for(k;k<temp_connect_part[j].can_connect_to.length;k++){
                                if(temp_connect_part[j].can_connect_to[k] == p.get_part_id() && temp_connect_part[j].connected_to[k] != null){
                                    already_connected_count++;
                                }
                            }
                        }
                        if(already_connected_count<lowest){
                            lowest = already_connected_count;
                            lowest_id = i;
                        }
                    }
                }
                
                var connect_part_arr:Array = get_part_by_id(p.can_connect_to[lowest_id]);
                if(lowest_id >= 0 && connect_part_arr.length > 0){
                    p.connect_to_part(connect_part_arr[0],false,true);
                }
            }else{
                trace("(Body.add_part)Pretty sure I just failed to connect a body part. " + p.race.get_name()+ " " + p.get_name());				
            }
        }
        
        if(name_in_use > 0)	p.set_part_count(name_in_use + 1);
        
        if(!added)parts[parts.length] = p;
        
        //go through the equipment and see if any of it should be covering/equiped on the new part
        if(!(p.covered_by[0] != null || p.equip[0] != null)){
            i = 0;
            for(i=0;i<equip_array.length;i++){
                temp_e = equip_array[i];
                j = 0;
                temp_array = temp_e.get_cover_slots();
                for(j;j<temp_array.length;j++){
                    if(temp_array[j] == p.get_part_id()){
                        p.set_cover(temp_e);
                        break;
                    }
                }
                
                j = 0;
                temp_array = temp_e.get_equip_slots();
                for(j;j<temp_array.length;j++){
                    if(temp_array[j] == p.get_part_id()){
                        p.set_equip(temp_e);
                        break;
                    }
                }
            }
        }
        if(c.location != null && c.equip_state == 0){//make sure we aren't in world gen
            c.equip_state = 1;
            i = 0;
            for(i=0;i<equip_array.length;i++){
                temp_e = equip_array[i];
                temp_e.equip_effects(c,true);
            }
            c.equip_state = 0;
        }
    }
    */
    public String get_parts_appearance(Character c){
        int i = 0;
        String s = "";
        for (i=0;i<parts.length;i++){
            BodyPart p= (BodyPart)parts[i];//parts[i] as Body_part;
            if(p != null){
                Boolean same_id = false;
                if(parts[i+1] != null){
                    if(parts[i+1].get_part_id() == p.get_part_id() && parts[i+1].race.name == p.race.name && p.pair_description != "" && p.name != parts[i+1].name){
                        same_id = true;
                    }
                }
                if(s.indexOf(p.appearance(0, c)) <= -1 && !(same_id && s.indexOf(p.pair_appearance(parts[i+1], c)) >= 0)){
                    if(same_id){
                        s += p.pair_appearance(parts[i+1], c);
                        i++;
                    }else{
                        s += p.appearance(0, c);
                    }
                }
            }
        }
        return s;
    }
    /*TODO BodyPart get_stat
    public String get_equip_effects(int id,Number change_amt, Character c){
        String ret = "";
        int i = 0;
        for(i=0;i<parts.length;i++){
            BodyPart bp = (BodyPart)parts[i]; //as Body_part;
            if(bp.get_stat(c, id, 0) > -1){
                ret = bp.apply_equip_effect(id, change_amt, c);
            }
        }
        
        return ret;
    }
    */
    public String get_effects(int stat_id,Number k, Character c, int temp,int body_app_method){
        return get_effects(stat_id, k, c, temp, body_app_method,0,target_all_parts,-1);
    }
    public String get_effects(int stat_id,Number k, Character c, int temp,int body_app_method,int char_stat_count,int part_id,int effect_type){
        //default temp=0, body_app_method=change_stats_individual, char_stat_count = 0, part_id = target_all_parts, effect_type = -1
        String s = "";
        int j = 0;
        Number current_value = 0;
        
        if(body_app_method == prorate_change_total)current_value = c.get_stat(stat_id,temp);
        Boolean found = false;
        int parts_count = 0;
        for (j=0;j<parts.length;j++){
            BodyPart p = (BodyPart)parts[j] ;
            if(p.get_stat(c, stat_id,0).doubleValue() > -1 && (part_id == target_all_parts || part_id == p.get_part_id())){
                parts_count++;
                //sometimes only want the last of these to return...
                String temp_string = "";
                
                if(body_app_method == change_stats_individual){
                    temp_string = p.apply_effect(stat_id,k,c, temp,effect_type);		
                }else if(body_app_method == change_first_stat && !found){
                    temp_string = p.apply_effect(stat_id,k,c, temp,effect_type);
                    found = true;
                }else if(body_app_method == prorate_change_total){
                    temp_string = p.apply_effect(stat_id,k.doubleValue()*(p.get_stat(c,stat_id,temp).doubleValue()/current_value.doubleValue()),c,temp,effect_type);
                }
                
                if(!temp_string.equals("")) s = temp_string;
                
            }else if(part_id == target_parts_one_by_one){
                //trace("(Body.get_effects)I have no idea what I'm doing, ever. It's just a thing.");
            }
        }
        
        if(body_app_method == change_stats_total){
            Number new_change= k.doubleValue() / (parts_count + char_stat_count);
            s += get_effects(stat_id, new_change, c, temp, change_stats_individual, 0, part_id,effect_type);
        }/*else if(body_app_method == prorate_change_total){
            if(temp == 0 && (current_value + k).toFixed(2) != new_val.toFixed(2)){
                //try again...
                var new_val:Number = c.get_stat(stat_id, temp);
                new_change = (current_value + k) - new_val;
                if(new_change != k && (new_change >= 0.05 || new_change <= -0.05)){
                    if(new_change > 0){
                        if(get_max_stat(stat_id) > new_val){
                            c.apply_affect_by_id(stat_id, new_change,  temp, c, body_app_method, false, -1, effect_type);
                        }else{
                            c.apply_affect_by_id(stat_id, new_change,  1, c, body_app_method, false, -1, effect_type);//Force to be temp
                        }
                    }else{
                        if(new_val > 0){
                            c.apply_affect_by_id(stat_id, new_change,  temp, c, body_app_method, false, -1, effect_type);
                        }else{
                            c.apply_affect_by_id(stat_id, new_change,  1, c, body_app_method, false, -1, effect_type);//Force to be temp
                        }
                    }
                }
            }
        }*/
        
        return s;
    }
    
    
    public int part_count_by_stat(Character c,int stat_id,int min_max_chk){//default min_max_chk -1
        int j = 0;
        int parts_count = 0;
        for (j=0;j<parts.length;j++){
            BodyPart p = parts[j];//as Body_part;
            if(p.get_stat(c, stat_id).intValue() > -1){
                if(min_max_chk == -1){
                    parts_count++;
                }else if(min_max_chk == 0){
                    //don't count if it's at its minimum value
                    if(!p.get_stat_min_max(stat_id, c)){
                        parts_count++;
                    }						
                }else if(min_max_chk == 1){
                    //don't count if it's at it's maximum value
                    if(!p.get_stat_min_max(stat_id, c, true)){
                        parts_count++;
                    }
                }
            }				
        }
        return parts_count;
    }
    
    
    public Boolean has_part(int part_id){
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i].get_part_id() == part_id){
                return true;
            }
        }
        return false;
    }
    
    public Boolean holding_weapon_or_shield(){
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i].hold != null){
                return true;
            }
        }
        return false;
    }
    
    public int part_count_by_name(String n){
        int j = 0;
        int parts_count = 0;
        for (j=0;j<parts.length;j++){
            BodyPart p = (BodyPart)parts[j] ;//as Body_part;
            if(parts[j].name.equals(n)){//TODO why not use p?!
                parts_count++;
            }				
        }
        return parts_count;
    }
    
    public int part_count_by_id(int part_id){
        int j = 0;
        int parts_count = 0;
        for (j=0;j<parts.length;j++){
            BodyPart p = (BodyPart)parts[j];//TODO why not use p?!
            if(parts[j].get_part_id() == part_id){
                parts_count++;
            }				
        }
        return parts_count;
    }
    /*Array Sussing
    public function get_part_by_id(int part_id):Array{
        int i = 0;
        var ret_part:Array = new Array();
        for(i=0;i<parts.length;i++){
            if(parts[i].get_part_id() == part_id){
                ret_part[ret_part.length] = parts[i];					
            }
        }
        return ret_part;
    }
    */
    
    public BodyPart get_part_by_stat(int stat_id){
        int i = 0;
        BodyPart ret_part = null;
        for(i=0;i<parts.length;i++){
            if(parts[i].get_stat(null, stat_id).intValue() >= 0){
                if(ret_part == null){
                    ret_part = parts[i];
                }else{
                    //trace("(BODY.get_part_by_stat)No check done for multiple parts with the same stat. Returning First found.");
                    break;
                }
            }
        }
        return ret_part;
    }

    public String equip(Equipment e,Character c){
        c.equip_state = 1;
        String ret = e.equip_effects(c);
        c.equip_state = 0;
        
        ArrayList<Integer> temp = e.get_equip_slots();
        int j = 0;
        for(j=0;j<temp.size();j++){
            int max_slot = e.get_max_equip_slot(j);
            int curr_count = 0;
            int i = 0;
            for(i=0;i<parts.length;i++){
                if(parts[i].get_part_id() == temp.get(j) && (curr_count < max_slot || max_slot == 0)){
                    parts[i].set_equip(e);
                    curr_count++;
                }
            }
        }
        
        temp = e.get_cover_slots();
        for(j=0;j<temp.size();j++){
            int max_slot = e.get_max_cover_slot(j);
            int curr_count = 0;
            int i = 0;
            for(i=0;i<parts.length;i++){
                if(parts[i].get_part_id() == temp.get(j) && (curr_count < max_slot || max_slot == 0)){
                    parts[i].set_cover(e);
                    curr_count++;
                }
            }
        }
        
        check_combat_status(true,c);
        
        return ret;
    }
    

    public String unequip(Equipment e, Character c){
        String ret = "";
        if(e != null){
            //"</n> removes the " + e.get_name() + ".";
            //TODO WTF
            int i = 0;
            for (i=0;i<parts.length;i++){
                int j = 0;
                for(j=0;j<parts[i].equip.size();j++){
                    if(parts[i].equip.get(j) == e){
                        //parts[i].equip = parts[i].equip.slice(0,j).concat(parts[i].equip.slice(j+1,parts[i].equip.length));
                        /*
                        ArrayList<Equipment> temp = new ArrayList<>();
                        temp.addAll(parts[i].equip.subList(0,j));
                        temp.addAll(parts[i].equip.subList(j+1,parts[i].equip.size()));
                        parts[i].equip =temp;
                        */
                        //TODO above or below?!
                        parts[i].equip.remove(j);
                        //TODO
                        j--;
                    }
                }
                for(j=0;j<parts[i].covered_by.length;j++){
                    if(parts[i].covered_by[j] == e){
                        //parts[i].covered_by = parts[i].covered_by.slice(0,j).concat(parts[i].covered_by.slice(j+1,parts[i].covered_by.length));
                        //TODO
                        j--;
                    }
                }
                if(parts[i] == null); //trace("wha?" + i);
            }
            c.equip_state = 1;
            //ret += e.remove_effects(c);
            //TODO
            c.equip_state = 0;
            //c.add_to_possessions(e);
            //TODO
            
            check_combat_status(true,c);
        }
        return ret;
    }
    
    
    public int hold(Weapon w,Character c){
        int i = 0;
        for(i=0;i<w.stat_req.length;i++){
            if(c.get_stat(w.stat_req[i]).intValue() < w.stat_min[i]) return -1;
        }			
        
        int slots_req = w.get_num_hold();
        for(i=0;i<parts.length;i++){
            if(parts[i].hold == null && parts[i].get_num_hold_slots() > 0){
                slots_req -= parts[i].get_num_hold_slots();
            }
            if(slots_req <= 0) break;//we know we have the required number of hold slots... still need to hold it though
        }
        
        if(slots_req > 0){
            return -1;
        }else{
            slots_req = w.get_num_hold();
            for(i=0;i<parts.length;i++){
                if(parts[i].hold == null && parts[i].get_num_hold_slots() > 0){
                    parts[i].set_hold(w,c);
                    slots_req -= parts[i].get_num_hold_slots();
                }
                
                if(slots_req <= 0) break;//we've finished holding
            }
        }
        
        c.equip_state = 1;
        w.equip_effects(c);
        c.equip_state = 0;
        
        return 1;
    }
    
    public String unhold(Weapon w,Character c){
        int i = 0;
        for (i=0;i<parts.length;i++){
            if(parts[i].hold == w){
                parts[i].hold = null;
            }
        }
        c.equip_state = 1;
        w.remove_effects(c);
        c.equip_state = 0;
        c.addToPossessions(w);
        
        return "</n> stops holding the " + w.getName() + ".";
    }
    
    
    
    public void drop_equipment(Character c){
        int i = 0;
        for (i=0;i<parts.length;i++){
            if(parts[i].get_equip() != null){
                while(parts[i].equip.size() > 0){
                    unequip(parts[i].equip.get(0), c);
                }
            }
            if(parts[i].get_hold() != null)unhold(parts[i].get_hold(), c);
        }
    }
    public Number get_stat_by_id(Character c,int i){
        return get_stat_by_id(c, i,1,get_stat_total,target_all_parts,true);
    }
    public Number get_stat_by_id(Character c,int i,int get_hard_value,int multi_part_process
    ,int part_id,Boolean add_equip){
        //default get_hard_value = 1, multi_part_process= get_stat_total, part_id= target_all_parts, add_equip = true
        Number ret = -1;
        Boolean skip_calc = false;
        Boolean found_flag = false;
        int k = 0;
        Number temp=null;
        for (k=0;k<parts.length;k++){
            if(parts[k] != null){
                temp = parts[k].get_stat(c, i, get_hard_value,add_equip,skip_calc);
                if(temp.doubleValue() > -1 && (part_id == target_all_parts ||  part_id == parts[k].get_part_id())){
                    if(multi_part_process == get_stat_total){
                        skip_calc = true;
                        //ret += temp;
                        ret = ret.doubleValue() + temp.doubleValue();
                    }else if(multi_part_process == get_stat_min){
                        if(!found_flag){
                            //ret += temp;
                            ret = ret.doubleValue() + temp.doubleValue();
                        }else{
                            if(temp.doubleValue() < ret.doubleValue()){
                                ret = temp;
                            }
                        }
                    }else if(multi_part_process == get_stat_max){
                        if(!found_flag){
                            //ret += temp;
                            ret = ret.doubleValue() + temp.doubleValue();
                        }else{
                            if(temp.doubleValue() > ret.doubleValue()){
                                ret = temp;
                            }
                        }
                    }
                    
                    if(!found_flag){
                        //need to deal with the -1 applied by unfound
                        ret =ret.doubleValue()+1;
                        found_flag = true;
                    }
                }
            }else if(temp.doubleValue() > -1 && part_id == target_parts_one_by_one){
                //trace("(Body)No clue what I'm doing here");
            }
        }
        return ret;
    }
    /*
    public function check_state(c:Character):String{
        String s = "";
        var k:int = 0;
        for (k;k<parts.length;k++){
            if(parts[k] != null) s += parts[k].state_check(c);
        }
        return s;
    }
    
    public function reset_stat(c:Character, i:int = -1, k:int = -1):void{
        if (i == -1){
            var j:int = 0;
            for (j;j<parts.length;j++){
                parts[j].reset_stat(c, i, k);
            }
        }
    }
    
    public function get_max_stat(stat_id:int):Number{
        var ret:int = 0;
        int i = 0;
        for(i=0;i<parts.length;i++){
            int count = 0;
            for(count;count<parts[i].race.max_part.length;count++){
                if(parts[i].race.max_part[count] == parts[i].part_id && parts[i].race.stat_max_id[count] == stat_id && parts[i].get_stat(null, stat_id,0) > -1){
                    ret += parts[i].race.stat_max[count];
                }
            }
        }
        return ret;
    }
    
    public function get_actions_array(c:Character):Array{
        var ret:Array = new Array();
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                ret = ret.concat(parts[i].get_actions());
            }
        }
        return ret;
    }
    
    public function get_parts_actions(c:Character, start_id:int, strangers_personal_party_ind:int = 0):String{
        String ret = "";
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                var k:int = 0;
                var temp_array:Array = parts[i].get_actions();
                for(k;k<temp_array.length;k++){
                    //should check to see if the attack is already present in the return...
                    if( ret.indexOf(temp_array[k].get_name()) < 0){
                        if(temp_array[k].get_name() != "" ){
                            //need to get personal actions sometimes... and the form is different if i'm getting it and am not the player/party leader
                            if(c.location != null){
                                if(strangers_personal_party_ind == 0 && !temp_array[k].get_personal()){
                                    ret += "<a href=\"event:action," + c.location.get_content_id(c) + "," + String(start_id) +"\"><font color='#0000FF'>"+temp_array[k].get_name() +"</font></a>    "; 
                                }else if( strangers_personal_party_ind == 1 && temp_array[k].get_personal()){
                                    ret += "<a href=\"event:action," + c.location.get_content_id(c) + "," + String(start_id) +"\"><font color='#0000FF'>"+ temp_array[k].get_name() +"</font></a>    "; 
                                }else if( strangers_personal_party_ind == 2){
                                    if(temp_array[k].get_personal()){
                                        ret += "<a href=\"event:action," + c.location.get_content_id(c) + "," + String(start_id) + "," + c.location.get_content_id(c) + "\"><font color='#0000FF'>"+temp_array[k].get_name() +"</font></a>    "; 
                                    }else{
                                        ret += "<a href=\"event:action," + c.location.get_content_id(c) + "," + String(start_id) +"\"><font color='#0000FF'>"+temp_array[k].get_name() +"</font></a>    "; 
                                    }
                                }
                            }
                        }
                    }
                    start_id++;
                }
            }
        }
        return ret;
    }
    
    public function get_action(action_num:int):Action{
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                var k:int = 0;
                var temp_array:Array = parts[i].get_actions();
                for(k;k<temp_array.length;k++){
                    if(action_num == 0){
                        return temp_array[k];
                    }
                    action_num--;
                }
            }
        }
        return null;
    }
    
    public function get_part_attacks(c:Character, target:Character, start_id:int):String{
        String ret = "";
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                var k:int = 0;
                var temp_array:Array = parts[i].get_attack_actions();
                for(k;k<temp_array.length;k++){
                    //should check to see if the attack is already present in the return...
                    if(ret.indexOf(temp_array[k].get_name()) < 0){
                        ret += "<a href=\"event:combat,"+ c.location.get_content_id(c) +","+ String(start_id) +"," + c.location.get_content_id(target) +"\">" + temp_array[k].get_name() + "</a>\n";//<font color='#0000FF'></font>
                    }
                    
                    start_id++;
                }
            }
        }
        
        return ret;
    }
    
    public function get_part_attack_action(attack_num:int):Action{
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                var k:int = 0;
                var temp_array:Array = parts[i].get_attack_actions();
                for(k;k<temp_array.length;k++){
                    if(attack_num == 1 || attack_num == 0) return temp_array[k];
                    attack_num--;
                }
            }
        }
        
        return null;
    }
    
    public function get_part_attack_actions():Array{
        var ret:Array = new Array();
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i] != null){
                var k:int = 0;
                var temp_array:Array = parts[i].get_attack_actions();
                for(k;k<temp_array.length;k++){
                    ret[ret.length] = temp_array[k];
                }
            }
        }
                    
        return ret;
    }
    
    public function get_pregnant_race():Race{
        int i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i].gets_pregnant()) break;
        }
        
        return parts[i].race;
    }
    
    public function make_pregnant(baby:Character, mom:Character, preg_to_tick:int = 0):void{
        //find our pregnant part			
        var preg_race:Race = get_pregnant_race();
        if(preg_race != null){
            var preg_tick:Tick_Effect = preg_race.get_preg_effect(baby);
            if(preg_to_tick > 0){
                var lowest_curr_tick:int = preg_tick.current_tick;
                while(lowest_curr_tick < preg_to_tick && preg_tick != null){
                    lowest_curr_tick = preg_tick.end_tick;
                    int i = 0;
                    for(i=0;i<preg_tick.tick_count.length;i++){
                        if(preg_tick.tick_count[i] < lowest_curr_tick && preg_tick.tick_count[i] > preg_tick.current_tick){
                            lowest_curr_tick = preg_tick.tick_count[i];
                        }
                    }
                    preg_tick.current_tick = lowest_curr_tick-1;
                    preg_tick.tick(mom)
                }
                if(preg_tick.current_tick < preg_to_tick)preg_tick.current_tick = preg_to_tick;
            }
            if(preg_tick != null)mom.apply_tick_effect(preg_tick);
        }
    }
    */
    public String tick(Character c){
        String ret = "";
        int i = 0;
        for(i=0;i<parts.length;i++){
            ret += parts[i].tick(c);
        }
        return ret;
    }
    /*
    private function draw_part(center_x:int, center_y:int, c:Character, bp:Body_part = null, drawn_parts:Array = null, calling_part:Body_part = null):Sprite{
        var already_drawn:Boolean = false;
        var draw_size_multiplier:Number = 2;
        if(drawn_parts == null)drawn_parts = new Array();
        if(bp == null){
            bp = parts[0];//should be the top most part...
        }
        int i = 0;
        for(i=0;i<drawn_parts.length;i++){
            if(drawn_parts[i] == bp){
                already_drawn = true;
            }
        }
        if(!already_drawn){
            var return_sprite:Sprite = new Sprite();
            
            var part_height:Number = 4;
            var part_width:Number = 4;
            
            if(bp.display_length_stat_id >= 0){
                part_height = bp.get_stat(null, bp.display_length_stat_id);
                if(part_height < 0){
                    part_height = calling_part.get_stat(null, bp.display_length_stat_id);;
                    if(part_height < 0){
                        part_height = this.get_stat_by_id(c,bp.display_length_stat_id,1,Body.get_stat_max);
                    }
                }
            }
            
            if(part_height < 0) part_height = 4;
            
            part_height = part_height * bp.display_length_mod * draw_size_multiplier;
            
            if(bp.display_width_stat_id >= 0){
                part_width = bp.get_stat(null, bp.display_width_stat_id);
                if(part_width < 0){
                    part_width = calling_part.get_stat(null, bp.display_width_stat_id);
                    if(part_width < 0){
                        part_width = this.get_stat_by_id(c,bp.display_width_stat_id,1,Body.get_stat_max);
                    }
                }
            }
            
            if(part_width < 0) part_width = 4;
            
            part_width = part_width * bp.display_width_mod * draw_size_multiplier;
            
            var part_width2:Number = 4;
            
            if(bp.display_width_stat_id2 >= 0){
                part_width2 = bp.get_stat(null, bp.display_width_stat_id2);
                if(part_width2 < 0){
                    part_width2 = calling_part.get_stat(null, bp.display_width_stat_id2);
                    if(part_width2 < 0){
                        part_width2 = this.get_stat_by_id(c,bp.display_width_stat_id2,1,Body.get_stat_max);
                    }
                }
                
                if(part_width2 < 0)	part_width2 = 4;
                
                part_width2 = part_width2 * bp.display_width_mod2 * draw_size_multiplier;
            }else{
                part_width2 = part_width;
            }
            
            var nothing_drawn:Boolean = false;
            var temp_part_image_array:Array = bp.get_part_image();
            var part_sprite:Sprite = new Sprite();
            if(temp_part_image_array == null){
                var g:Graphics = part_sprite.graphics;
                g.lineStyle(2,0x000000);
                g.beginFill( 0x000000);
                g.drawRect(center_x-(part_width/2), center_y-(part_height/2), part_width, part_height);
                g.endFill();
                g.beginFill( 0xFFFFFF);
                g.drawRect(center_x-(part_width/2)+1, center_y-(part_height/2)+1, part_width-2, part_height-2);		
                g.endFill();
            }else{
                i = 0;
                for(i=0;i<temp_part_image_array.length;i++){
                    var temp_bmp:Bitmap = temp_part_image_array[i];
                    
                    //thinking this is how we do second widths/heights... 
                    var distortion:DistortImage = new DistortImage(temp_bmp.width, temp_bmp.height, 3, 3);
                    if(bp.mirror_display){
                        distortion.setTransform(part_sprite.graphics, 
                                        temp_bmp.bitmapData, 
                                        new Point(center_x + part_width/2, center_y - part_height/2), //tl
                                        new Point(center_x - part_width/2, center_y - part_height/2), //tr
                                        new Point(center_x - part_width2/2, center_y + part_height/2), //br
                                        new Point(center_x + part_width2/2, center_y + part_height/2)); //bl
                    }else{
                        distortion.setTransform(part_sprite.graphics, 
                                        temp_bmp.bitmapData, 
                                        new Point(center_x - part_width/2, center_y - part_height/2), //tl
                                        new Point(center_x + part_width/2, center_y - part_height/2), //tr
                                        new Point(center_x + part_width2/2, center_y + part_height/2), //br
                                        new Point(center_x - part_width2/2, center_y + part_height/2)); //bl
                    }
                }
            }
            
            return_sprite.addChild(part_sprite);
            
            drawn_parts[drawn_parts.length] = bp;
            i = 0;
            for(i=0;i<bp.can_connect_to.length;i++){
                if(bp.connected_to[i] != null){
                    var j:int = 0;
                    for(j;j<bp.connected_to[i].length;j++){
                        var connect_part:Body_part = bp.connected_to[i][j];
                        if(connect_part != null){
                            var temp_sprite:Sprite;
                            var display_length:Number = 4;
                            var display_width:Number = 4;
                            var add_child_at:int = -1;
                            
                            if(connect_part.display_length_stat_id >= 0){
                                display_length = connect_part.get_stat(null, connect_part.display_length_stat_id);
                                if(display_length < 0){
                                    display_length = bp.get_stat(null, connect_part.display_length_stat_id);
                                    if(display_length < 0){
                                        display_length = this.get_stat_by_id(c,connect_part.display_length_stat_id,1,Body.get_stat_max);
                                    }
                                }
                            }
                            if(display_length < 0) display_length = 4;
                            display_length = display_length * connect_part.display_length_mod * draw_size_multiplier;
                            
                            if(connect_part.display_width_stat_id >= 0){
                                display_width = connect_part.get_stat(null, connect_part.display_width_stat_id);
                                if(display_width < 0){
                                    display_width = bp.get_stat(null, connect_part.display_width_stat_id);
                                    if(display_width < 0){
                                        display_width = this.get_stat_by_id(c,connect_part.display_width_stat_id,1,Body.get_stat_max);
                                    }
                                }
                            }
                            if(display_width < 0) display_width = 4;
                            display_width = display_width * connect_part.display_width_mod * draw_size_multiplier;
                            
                            if(connect_part.connect_direction == Body_part.display_front){
                                temp_sprite = draw_part(center_x, center_y, c, connect_part, drawn_parts,bp);
                            }else if(connect_part.connect_direction == Body_part.display_bottom){
                                temp_sprite = draw_part(center_x, center_y + (display_length/2 + part_height/2), c, connect_part, drawn_parts, bp);
                            }else if(connect_part.connect_direction == Body_part.display_top){
                                temp_sprite = draw_part(center_x, center_y - (display_length/2 + part_height/2), c,connect_part, drawn_parts, bp);
                            }else if(connect_part.connect_direction == Body_part.display_left){
                                temp_sprite = draw_part(center_x - (display_width/2 + part_width/2) + 1, center_y + (display_length/2 - part_height/2), c,connect_part, drawn_parts, bp);
                            }else if(connect_part.connect_direction == Body_part.display_right){
                                temp_sprite = draw_part(center_x + (display_width/2 + part_width/2), center_y + (display_length/2 - part_height/2), c,connect_part, drawn_parts, bp);
                            }else if(connect_part.connect_direction == Body_part.display_bottom_left){
                                temp_sprite = draw_part(center_x - (display_width/2 - part_width2/2), center_y + (display_length/2 + part_height/2), c,connect_part, drawn_parts, bp);
                            }else if(connect_part.connect_direction == Body_part.display_bottom_right){
                                temp_sprite = draw_part(center_x + (display_width/2 - part_width2/2) + 1, center_y + (display_length/2 + part_height/2), c,connect_part, drawn_parts, bp);
                            }else if(connect_part.connect_direction == Body_part.display_bottom_back){
                                temp_sprite = draw_part(center_x, center_y + (display_length/2 + part_height/2), c,connect_part, drawn_parts, bp);
                                add_child_at = 0;
                            }else if(connect_part.connect_direction == Body_part.display_back){
                                temp_sprite = draw_part(center_x, center_y, c, connect_part, drawn_parts, bp);
                                add_child_at = 0;
                            }else if(connect_part.connect_direction == Body_part.display_top_back){
                                temp_sprite = draw_part(center_x, center_y - (display_length/2 + part_height/2), c, connect_part, drawn_parts, bp);
                                add_child_at = 0;
                            }else if(connect_part.connect_direction == Body_part.display_mid_top){
                                temp_sprite = draw_part(center_x, center_y + (display_length/2 - part_height/4), c,connect_part, drawn_parts, bp);
                            }else{
                                trace("(Body.draw_part)Found a part without a connect direction...");
                            }
                            
                            if(temp_sprite!=null){
                                nothing_drawn = false;
                                
                                if(add_child_at >= 0){
                                    return_sprite.addChildAt(temp_sprite, add_child_at);
                                }else{
                                    return_sprite.addChild(temp_sprite);
                                }
                            }
                        }
                    }
                }
            }
            if(nothing_drawn) return null;
            return return_sprite;
        }
        return null;
    }
    
    public function draw_34self(center_x:int, center_y:int, c:Character, mirror:Boolean = false):Sprite{
        var return_sprite:Sprite = new Sprite();
        var normal_sprite:Sprite = draw_self(center_x, center_y, c);
        if(c.char_34sprite_id >= 0){
            var temp_sprite:Bitmap = FPalaceHelper.get_image_by_id(c.char_34sprite_id);
            if(temp_sprite != null){
                var orig_ratio:Number = temp_sprite.width/temp_sprite.height;
                temp_sprite.scaleY = normal_sprite.height/temp_sprite.height;
                temp_sprite.width = temp_sprite.height*orig_ratio;
                temp_sprite.x = center_x - temp_sprite.width/2;
                temp_sprite.y = center_y - temp_sprite.height/2;
                if(mirror){
                    temp_sprite.scaleX = -temp_sprite.scaleX;
                    temp_sprite.x += temp_sprite.width;						
                }
                return_sprite.addChild(temp_sprite);
            }
        }else if(normal_sprite != null){
            return_sprite.addChild(normal_sprite);
        }
        return return_sprite;
    }
    
    public function draw_self(center_x:int, center_y:int, c:Character):Sprite{
        var return_sprite:Sprite;
        return_sprite = new Sprite();
        var drawn_sprite:Sprite;
        if(parts[0] != null){
            drawn_sprite = draw_part(center_x, center_y, c);
            //drawn_sprite.x = center_x - drawn_sprite.width/2;
            //drawn_sprite.y = center_y - drawn_sprite.height/2;
            return_sprite.addChild(drawn_sprite);
            
            if( (drawn_sprite.getBounds(return_sprite).bottom + drawn_sprite.getBounds(return_sprite).top) / 2 != center_y){
                drawn_sprite.y = center_y -  (drawn_sprite.getBounds(return_sprite).bottom + drawn_sprite.getBounds(return_sprite).top) / 2;
            }
        }
        
        //Should be going char specific image
        if(c.char_sprite_id >= 0){
            var temp_sprite:Bitmap = FPalaceHelper.get_image_by_id(c.char_sprite_id);
            var orig_ratio:Number = temp_sprite.width/temp_sprite.height;
            temp_sprite.scaleY = drawn_sprite.height/temp_sprite.height;
            temp_sprite.width = temp_sprite.height*orig_ratio;
            temp_sprite.x = center_x - temp_sprite.width/2;
            temp_sprite.y = center_y - temp_sprite.height/2;
            return_sprite.removeChildAt(0);
            return_sprite.addChild(temp_sprite);
        }
        
        return return_sprite;
    }
    
    public function sanitize(s:String, c:Character, c_self:Character):String{
        String ret = s;
        int i = 0;
        for(i=0;i<parts.length;i++){
            var part_count:int = part_count_by_id(parts[i].get_part_id());
            
            while(ret.indexOf("</pd"+parts[i].get_part_id()+">") >= 0){
                if(part_count > 1)trace("(Body.sanitize)Should be outputing multiple descriptions... just giving the first one for now. ");
                ret = ret.replace("</pd"+parts[i].get_part_id()+">", parts[i].appearance(0,c));
            }
            while(ret.indexOf("</p"+parts[i].get_part_id()+"rn>") >= 0){
                if(part_count > 1)trace("(Body.sanitize)Should be outputing multiple descriptions... just giving the first one for now. ");
                ret = ret.replace("</p"+parts[i].get_part_id()+"rn>", parts[i].race.get_name());
            }
            
            var j:int = 0;
            for(j;j<parts[i].stat_id.length;j++){
                while(ret.indexOf("</sd"+parts[i].stat_id[j]+">") >= 0){
                    //should be checking if this stat is shared across multiple parts... just getting the total
                    ret = ret.replace("</sd"+parts[i].stat_id[j]+">", parts[i].stat_description[j].get_short_description(c_self.get_stat(parts[i].stat_id[j])));
                }
            }
            
            j = 0;
            for(j;j<parts[i].stat_id.length;j++){
                while(ret.indexOf("</s"+parts[i].stat_id[j]+">") >= 0){
                    //should be checking if this stat is shared across multiple parts... just getting the total
                    ret = ret.replace("</s"+parts[i].stat_id[j]+">", String(c_self.get_stat(parts[i].stat_id[j]).toFixed(parts[i].stat_description[j].show_decimals)));
                }
            }
        }
        
        var myPattern:RegExp = /(<\/2pd[0-9]*>)/g;
        ret = ret.replace(myPattern, target_change);
        myPattern = /(<\/2p[0-9]*rn>)/g;
        ret = ret.replace(myPattern, target_change);
        myPattern = /(<\/2s[0-9]*>)/g;
        ret = ret.replace(myPattern, target_change);
        myPattern = /(<\/2sd[0-9]*>)/g;
        ret = ret.replace(myPattern, target_change);
        function target_change():String {
            return arguments[0].substr(0,2).concat(arguments[0].substr(3,arguments[0].length));
        }
        
        return ret;
    }
    
    public function clone(b:Body, c:Character):void{
        int i = 0;
        for (i;i<b.parts.length;i++){
            var p:Body_part = new Body_part();
            p.clone(b.parts[i]);
            add_part(p,c);
        }
        
        //Need to go through the equipment, clone it, resize it, and re-equip it in the same order it was previously equiped in...
        var temp_equip_array:Array = new Array();
        var item_id:int = -1;
        i = 0;
        for (i;i<parts.length;i++){
            if(parts[i] != null){
                while(parts[i].get_equip()[0] != null){
                    var old_e:Equipment = parts[i].get_equip()[0];
                    var new_e:Equipment = old_e.clone() as Equipment;
                    
                    unequip(old_e, c);
                    
                    item_id = -1;
                    for(item_id;item_id<c.possessions.length;item_id++){
                        if(c.possessions[item_id] == old_e) break;
                    }
                    c.drop(item_id);
                    
                    temp_equip_array[temp_equip_array.length] = new_e;

                    if(parts[i] == null)break;
                }
                
                if(parts[i] == null)break;
                
                if(parts[i].get_hold() != null){
                    var old_hold:Weapon = parts[i].get_hold();
                    var new_w:Weapon = old_hold.clone() as Weapon;
                    unhold(old_hold, c);
                    
                    var j:int = 0;
                    for(j;j<new_w.stat_req.length;j++){
                        if(c.get_stat(new_w.stat_req[j]) < new_w.stat_min[j]){
                            new_w.stat_min[j] = c.get_stat(new_w.stat_req[j]);
                        }
                    }
                    
                    item_id = -1;
                    for(item_id;item_id<c.possessions.length;item_id++){
                        if(c.possessions[item_id] == old_hold) break;
                    }
                    c.drop(item_id);
                    
                    hold(new_w, c);
                }
            }
        }
        //This is where we jiggle stats...
        /*i = 0;
        for(i=0;i<parts.length;i++){
            if(parts[i-1] != null && parts[i-1].get_part_id() == parts[i].get_part_id() && parts[i-1].race.name == parts[i].race.name && parts[i].pair_description != "" && parts[i].name != parts[i-1].name){
                parts[i].jiggle_stats(this, parts[i-1].get_stat(null, parts[i].display_length_stat_id));
            }else{
                parts[i].jiggle_stats(this);
            }
        }
        */
        //Make sure the equipment/weapons are still usable after the stat jiggle
        /*
        i = 0;
        for(i=0;i<temp_equip_array.length;i++){
            new_e = temp_equip_array[i];
            j = 0;
            for(j;j<new_e.stat_req.length;j++){
                var change_amount:Number = 0;
                var k:int = 0;
                if(c.get_stat(new_e.stat_req[j]) < new_e.stat_min[j]){
                    change_amount =  new_e.stat_min[j] - c.get_stat(new_e.stat_req[j]);
                    new_e.stat_min[j] = c.get_stat(new_e.stat_req[j]) - change_amount;
                    new_e.stat_max[j] = new_e.stat_max[j] - change_amount;
                    for(k;k<new_e.cover_stat.length;k++){
                        if(new_e.cover_stat[k] == new_e.stat_req[j]){
                            new_e.cover_min[k] = new_e.cover_min[k] - change_amount;
                        }
                    }
                }
                
                if(c.get_stat(new_e.stat_req[j]) > new_e.stat_max[j]){
                    change_amount =  c.get_stat(new_e.stat_req[j]) - new_e.stat_max[j];
                    new_e.stat_max[j] = c.get_stat(new_e.stat_req[j]) + change_amount;
                    if(new_e.stat_min[j]>=0)new_e.stat_min[j] = new_e.stat_min[j] + change_amount;
                    for(k;k<new_e.cover_stat.length;k++){
                        if(new_e.cover_stat[k] == new_e.stat_req[j]){
                            new_e.cover_min[k] = new_e.cover_min[k] + change_amount;
                        }
                    }
                }
            }
            c.equip(new_e,0);
        }
        
        check_state(c);
    }
    */
}
