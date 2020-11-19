package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Combat_manager {

    public ArrayList<Character> participants;
    public ArrayList<Integer> initiative;
    public Number current_int;
    
    public Boolean selecting = false;
    public String new_participants;
    
    public Combat_manager() {
        // constructor code
        participants = new ArrayList<>();
        initiative = new ArrayList<>();
        current_int = 0;
        new_participants = "";
    }
    
    public String fire_combat_round(){
        String ret = "";
        Character active_char = next_character();
        Character start_char = active_char;
        int start_initiative = current_int.intValue();
        Boolean continue_flag = true;
        
        while(continue_flag){
            ArrayList<Character> enemy_list = new ArrayList<>();
            enemy_list = get_enemies(active_char);
                                        
            ret += active_char.tick();
                
            if(enemy_list.get(0) != null && active_char != null && active_char.location != null){
                int active_char_id = active_char.location.get_content_id(active_char);
                
                String[] next_action = active_char.get_next_attack().split(",");
                int next_action_id = -1;
                int next_target_id = -1;
                int next_chall_id = -1;
                String chall_string = null;
                ArrayList<Integer> dynamic_string = new ArrayList<>();//TODO was array, verify
                
                if(next_action[0] != null && !next_action[0].equals("")){
                    //next_target_id = next_action[3];
                    if(active_char.location.getContent(next_target_id) != null){
                        //next_action_id = next_action[1];
                        //next_chall_id = next_action[2];
                        //TODO why is this string ret splitting into ints and shit
                        if(next_chall_id != -1)chall_string = Integer.toString(next_chall_id);
                    }else{
                        next_target_id = -1;
                        //trace("(Combat_manager)Have a next action, but no target. Suspicious. Should probably cancel the action choice, but doing nothing instead.");
                    }	
                }
                /*TODO Can't use before declaration!!!
                if(dynamic_choice != -1){
                    if(dynamic_string == null)dynamic_string = new Array();
                    dynamic_string.push(dynamic_choice);
                }
                */
                if(next_action_id < 0){
                    int rand_enemy = active_char.personality.determine_target(enemy_list, active_char);
                    if(enemy_list.get(rand_enemy) != null){
                        next_target_id = active_char.location.get_content_id(enemy_list.get(rand_enemy));
                        next_action_id = active_char.personality.determine_action(enemy_list.get(rand_enemy), active_char);
                        
                        //Need to catch dynamic choices, and make them....
                        //TODO declared after first use...wat
                        int dynamic_choice = -1;
                        CharAction temp_action = active_char.get_attack_action(next_action_id);
                        if(temp_action == null){
                            //trace("(Combat_manager.fire_combat_round)Failed to get an attack action. Not sure why. Skipping character.");
                        }else if(temp_action.consequences.get(0) instanceof DynamicConsequence && ((DynamicConsequence)temp_action.consequences.get(0)).consequence_list_type != DynamicConsequence.list_nolist){
                            next_chall_id = 0;
                            dynamic_choice = active_char.personality.determine_dynamic(next_target_id, next_action_id, active_char);
                        }
                        if(temp_action != null){
                            if(next_chall_id != -1)chall_string = Integer.toString(next_chall_id);
                            if(dynamic_choice != -1){
                                if(dynamic_string == null)dynamic_string = new ArrayList<>();
                                //dynamic_string.push(dynamic_choice)
                                dynamic_string.add(dynamic_choice);
                            }else{
                                dynamic_string = null;
                            }
                            active_char.attack(active_char_id, next_action_id, next_target_id, chall_string, dynamic_string);
                        }
                    }
                }else{
                    active_char.attack(active_char_id, next_action_id, next_target_id, chall_string, dynamic_string);
                }
                
            }
            
            ret += update_participants();
            
            if(start_initiative == get_next_init(current_int.intValue()) || !active_combat() || get_init(start_char) < 0){
                continue_flag = false;
            }else{
                active_char = next_character();
            }
        }
        
        
        return ret;
    }
    
    public String get_description(Character c){
        String ret = "";
        
        for(int i = 0;i<participants.size();i++){
            if(c.personality.relationship_exists(participants.get(i))){//this was participants[c]...BUT WHY
                //trace("(Combat_manager.get_description)Oh, I know someone in this combat! Should probably be adding their name to the tag, but meh.");
            }
        }
        
        ret = "<a href=\"event:combat,"+c.location.get_content_id(c)+",-2,-1\">some folks are fighting here</a>";
        
        return ret;
    }
    
    public void add_participant(Character c){
        add_participant(c,false);
    }
    public void add_participant(Character c,Boolean no_party){//def no_parrty=false
        if(c == null) return;
        int i= 0;
        Boolean found = false;
        for(i=0;i<participants.size();i++){
            if(participants.get(i) == c) found = true;
        }
        
        if(!found){
            //participants[participants.length] = c;
            participants.add(c);

            //var temp_init:int = Math.round(Math.random()*20 + c.get_stat(FPalace_helper.dex_id));
            Challenge init_challenge = new Challenge(true);
            init_challenge.set_attack_stat(FPalace_skills.initiative_id);
            init_challenge.set_defense_stat(-1,1);
            init_challenge.setVariability(20);
        
            int temp_init = init_challenge.roll(c);
            if(temp_init <= 0)temp_init = 1;
            
            c.challenge_output = "";//hide initiative skill gains
            
            //need to make sure no participants have the same initiative...
            i = 0;
            for(i=0;i<initiative.size();i++){
                if(temp_init == initiative.get(i)){
                    temp_init++;
                    i = -1;
                }
            }
            
            //initiative[initiative.length] = temp_init;
            initiative.add(temp_init);
            
            if(c.get_party() != null){
                if(!no_party){
                    new_participants += c.getName();
                    ArrayList<Character> p = new ArrayList<>(c.get_party().get_members());
                    int num_left = p.size() - 1;
                    if(num_left > 1){
                        new_participants += ", ";
                    }else{
                        new_participants += " and ";
                    }
                    i = 0;
                    for(i=0;i<p.size();i++){
                        if(p.get(i) == c) continue;
                        if(p.get(i).location == c.location){
                            num_left--;
                            new_participants += p.get(i).getName();
                            if(num_left > 1){
                                new_participants += ", ";
                            }else if(num_left == 1){
                                if(p.size() > 2)new_participants += ",";
                                new_participants += " and ";
                            }
                            add_participant(p.get(i),true);
                        }
                    }
                    new_participants += " have joined the Fray!\n";
                }
            }else{
                new_participants += c.getName() + " has joined the Fray!\n";
            }
        }
    }
    
    public ArrayList<String> update_participants(){
        ArrayList<String> s = new ArrayList<>();
        int i = 0;
        for(i=0;i<participants.size();i++){
            if(participants.get(i).location == null){
                //s[s.length] = participants[i].get_name() + " has died.";
                //above was commented
                //participants = participants.slice(0,i).concat(participants.slice(i+1,participants.length));
                participants.remove(i);
                //initiative = initiative.slice(0,i).concat(initiative.slice(i+1,initiative.length));
                initiative.remove(i);
                i--;
                continue;
            }
            
            if(participants.get(i).location.cm != this || !participants.get(i).get_combat_status()){
                //participants = participants.slice(0,i).concat(participants.slice(i+1,participants.length));
                participants.remove(i);
                //initiative = initiative.slice(0,i).concat(initiative.slice(i+1,initiative.length));
                initiative.remove(i);
                i--;
                continue;
            }
            
            Boolean ret = false;
            if(!participants.get(i).next_attack.equals("")) ret = true;
            
            int k = 0;
            for(k=0;k<participants.size();k++){
                if(participants.get(i).get_aggresive(participants.get(k)) || participants.get(k).get_aggresive(participants.get(i))){
                    ret = true;
                    break;
                }
            }
            
            if(!ret){
                //s[s.length] = participants[i].get_name() + " is no longer interested in fighting."
                s.add(participants.get(i).getName() + " is no longer interested in fighting.");
                //participants = participants.slice(0,i).concat(participants.slice(i+1,participants.length))
                participants.remove(i);
                //initiative = initiative.slice(0,i).concat(initiative.slice(i+1,initiative.length))
                initiative.remove(i);
                i--;
                continue;
            }
            
            if(participants.get(i).busy <= 0) participants.get(i).setBusy();
            
        }
        
        
        String[] temp_new_part = new_participants.split("\n");//was array, unknown type
        
        //s = s.concat(temp_new_part)
        s.addAll(Arrays.asList(temp_new_part));
        
        new_participants = "";
        //return ("")
        //replace above with
        s = new ArrayList<>();
        s.add("");
        return s;
    }
    
    public Boolean active_combat(){
        Boolean ret = false;
        
        //check to see if anyone is aggressive against anyone else
        int i = 0;
        for(i=0;i<participants.size();i++){
            if(participants.get(i).next_attack != "") ret = true;
            if(!ret){
                int k = i + 1;
                for(k=i+1;k<participants.size();k++){
                    if((participants.get(i).get_aggresive(participants.get(k)) || participants.get(k).get_aggresive(participants.get(i))) && i != k && participants.get(i).location == participants.get(k).location) ret = true;
                }
            }
        }
        
        return ret;
    }
    
    public int get_init(Character c){
        for(int i = 0;i<participants.size();i++){
            if(participants.get(i).equals(c)) return initiative.get(i);
        }
        
        return -1;
    }
    /*
    public function chars_since_last_action(c:Character):int{
        if(current_int == 0) return 1;
        var ret:int = 0;
        var start_int:int = get_next_init();
        var next_int:int = start_int;
        while(true){
            var next_char:Character = null;
            var i:int = 0;
            for(i;i<initiative.length;i++){
                if(initiative.get(i) == current_int){
                    next_char = participants[i];
                    break;
                }else{
                    if(Math.round(initiative.get(i)/4) == current_int || Math.round(initiative.get(i)/8) == current_int){
                        next_char = participants[i];
                    }
                }
            }
            
            if(next_char == c){
                ret = 0;
            }else{
                ret++;
            }
            next_int = get_next_init(next_int);
            if(next_int == start_int)break;
        }
        
        return ret;
    }
    
    public function chars_to_next_action(c:Character):int{
        var ret:int = 0;
        var next_int:int = get_next_init();
        while(next_char != c){
            ret++;
            var next_char:Character = null;
            var i:int = 0;
            for(i;i<initiative.length;i++){
                if(initiative.get(i) == next_int){
                    next_char = participants[i];
                    break;
                }else{
                    if(Math.round(initiative.get(i)/4) == next_int || Math.round(initiative.get(i)/8) == next_int){
                        next_char = participants[i];
                    }
                }
            }
            next_int = get_next_init(next_int);
        }
        return ret;
    }
    */
    public Character next_character(){
        Character ret = null;
        int next_int = get_next_init();
        for(int i =0;i<initiative.size();i++){
            if(initiative.get(i) == next_int){
                ret = participants.get(i);
                break;
            }else{
                if(Math.round(initiative.get(i)/4) == next_int || Math.round(initiative.get(i)/8) == next_int){
                    ret = participants.get(i);
                }
            }
        }
        current_int = next_int;
        
        return ret;
    }
    private int get_next_init(){
        return get_next_init(0);
    }
    private int get_next_init(int curr_init){
        //def 0
        int start_init = current_int.intValue();
        if(curr_init>=1) start_init = curr_init;
        Boolean lowest_init = true;
        int i = 0;
        for(i=0;i<initiative.size();i++){
            if((Math.round(initiative.get(i)/8) < start_init && Math.round(initiative.get(i)/8) >= 1) ||
               (Math.round(initiative.get(i)/4) < start_init && Math.round(initiative.get(i)/4) >= 1) || initiative.get(i) < start_init ){//nothing to see here
                lowest_init = false;
                break;
            }
        }
        
        if(lowest_init || start_init <= 1){
            start_init = 10000;//blarg, hardcoding
        }
        
        int next_int = 0;
        int multi_act_char_int = 0;
        i = 0;
        for(i=0;i<initiative.size();i++){
            if(initiative.get(i) > next_int && initiative.get(i) < start_init) next_int = initiative.get(i);
            
            if((Math.round(initiative.get(i)/4) < start_init && Math.round(initiative.get(i)/4) > multi_act_char_int) || (Math.round(initiative.get(i)/8) < start_init && Math.round(initiative.get(i)/8) > multi_act_char_int)){
                multi_act_char_int = initiative.get(i);
            }
        }
        
        if(Math.round(multi_act_char_int/8) > next_int || (Math.round(multi_act_char_int/4) > next_int && Math.round(multi_act_char_int/4) < start_init)){
            next_int = multi_act_char_int;
        }
        
        //NOW find which character that was...
        i = 0;
        for(i=0;i<initiative.size();i++){
            if(initiative.get(i) == next_int){
                if(next_int >= start_init){
                    if(Math.round(next_int/4) >= start_init){
                        next_int = Math.round(next_int/8);
                    }else{
                        next_int = Math.round(next_int/4);
                    }
                }
                break;
            }
        }
        return next_int;
    }
    
    public ArrayList<Character> get_enemies(Character c){
        ArrayList<Character> enemy_list = new ArrayList<>();
        if(c != null){
            for(int i=0;i<participants.size();i++){
                if(participants.get(i) != null){
                    if (c.get_aggresive(participants.get(i)) || participants.get(i).get_aggresive(c)) {
                        //enemy_list[enemy_list.length] = participants[i];
                        enemy_list.add(participants.get(i));
                    }
                }
            }
        }
        
        return enemy_list;
    }
    /*
    public function get_sideline(c:Character):Array{
        var ret_list:Array = new Array();
        var i:int = 0;
        if(c.get_party() == null){
            for(i;i<participants.length;i++){
                if (!c.get_aggresive(participants[i]) && !participants[i].get_aggresive(c) && participants[i] != c) {
                    ret_list[ret_list.length] = participants[i];
                }
            }
        }else{
            for(i;i<participants.length;i++){
                if (!c.get_aggresive(participants[i]) && !participants[i].get_aggresive(c) && participants[i] != c) {
                    var j:int = 0;
                    var member_list:Array = c.get_party().members;
                    var found:Boolean = false;
                    for(j;j<member_list.length;j++){
                        if(member_list[j] == participants[i]){
                            found = true;
                            break;
                        }
                    }
                                    
                    if(!found)ret_list[ret_list.length] = participants[i];
                }
            }
        }
        
        return ret_list;
    }
    */
}
