package fpgamegithubredux;

import java.util.ArrayList;

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
    /*
    public String fire_combat_round(){
        String ret = "";
        Character active_char = next_character();
        Character start_char = active_char;
        int start_initiative = current_int;
        Boolean continue_flag = true;
        
        while(continue_flag){
            ArrayList<Character> enemy_list = new ArrayList<>();
            enemy_list = get_enemies(active_char);
                                        
            ret += active_char.tick();
                
            if(enemy_list[0] != null && active_char != null && active_char.location != null){
                var active_char_id:int = active_char.location.get_content_id(active_char);
                
                var next_action:Array = active_char.get_next_attack().split(",");
                var next_action_id:int = -1;
                var next_target_id:int = -1;
                var next_chall_id:int = -1;
                var chall_string:String = null;
                var dynamic_string:Array = null;
                
                if(next_action[0] != null && next_action[0] != ""){
                    next_target_id = next_action[3];
                    if(active_char.location.get_content(next_target_id) != null){
                        next_action_id = next_action[1];
                        next_chall_id = next_action[2];
                        if(next_chall_id != -1)chall_string = String(next_chall_id);
                    }else{
                        next_target_id = -1;
                        trace("(Combat_manager)Have a next action, but no target. Suspicious. Should probably cancel the action choice, but doing nothing instead.");
                    }	
                }
                
                if(dynamic_choice != -1){
                    if(dynamic_string == null)dynamic_string = new Array();
                    dynamic_string.push(dynamic_choice);
                }
                
                if(next_action_id < 0){
                    var rand_enemy:int = active_char.personality.determine_target(enemy_list, active_char);
                    if(enemy_list[rand_enemy] != null){
                        next_target_id = active_char.location.get_content_id(enemy_list[rand_enemy]);
                        next_action_id = active_char.personality.determine_action(enemy_list[rand_enemy], active_char);
                        
                        //Need to catch dynamic choices, and make them....
                        var dynamic_choice:int = -1;
                        var temp_action:Action = active_char.get_attack_action(next_action_id);
                        if(temp_action == null){
                            trace("(Combat_manager.fire_combat_round)Failed to get an attack action. Not sure why. Skipping character.");
                        }else if(temp_action.consequences[0] is Dynamic_Consequence && temp_action.consequences[0].consequence_list_type != Dynamic_Consequence.list_nolist){
                            next_chall_id = 0;
                            dynamic_choice = active_char.personality.determine_dynamic(next_target_id, next_action_id, active_char);
                        }
                        if(temp_action != null){
                            if(next_chall_id != -1)chall_string = String(next_chall_id);
                            if(dynamic_choice != -1){
                                if(dynamic_string == null)dynamic_string = new Array();
                                dynamic_string.push(dynamic_choice);
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
            
            if(start_initiative == get_next_init(current_int) || !active_combat() || get_init(start_char) < 0){
                continue_flag = false;
            }else{
                active_char = next_character();
            }
        }
        
        
        return ret;
    }
    *//*
    public function get_description(c:Character):String{
        var ret:String = "";
        
        var i:int = 0;
        for(i;i<participants.length;i++){
            if(c.personality.relationship_exists(participants[c])){
                trace("(Combat_manager.get_description)Oh, I know someone in this combat! Should probably be adding their name to the tag, but meh.");
            }
        }
        
        ret = "<a href=\"event:combat,"+c.location.get_content_id(c)+",-2,-1\">some folks are fighting here</a>";
        
        return ret;
    }
    
    public function add_participant(c:Character, no_party:Boolean = false):void{
        if(c == null) return;
        var i:int = 0;
        var found:Boolean = false;
        for(i;i<participants.length;i++){
            if(participants[i] == c) found = true;
        }
        
        if(!found){
            participants[participants.length] = c;
            
            //var temp_init:int = Math.round(Math.random()*20 + c.get_stat(FPalace_helper.dex_id));
            var init_challenge:Challenge = new Challenge(true);
            init_challenge.set_attack_stat(FPalace_skills.initiative_id);
            init_challenge.set_defense_stat(-1,1);
            init_challenge.set_variability(20);
        
            var temp_init:int = init_challenge.roll(c);
            if(temp_init <= 0)temp_init = 1;
            
            c.challenge_output = "";//hide initiative skill gains
            
            //need to make sure no participants have the same initiative...
            i = 0;
            for(i;i<initiative.length;i++){
                if(temp_init == initiative[i]){
                    temp_init++;
                    i = -1;
                }
            }
            
            initiative[initiative.length] = temp_init;
            
            if(c.get_party() != null){
                if(!no_party){
                    new_participants += c.get_name();
                    var p:Array = c.get_party().get_members();
                    var num_left:int = p.length - 1;
                    if(num_left > 1){
                        new_participants += ", ";
                    }else{
                        new_participants += " and ";
                    }
                    i = 0;
                    for(i;i<p.length;i++){
                        if(p[i] == c) continue;
                        if(p[i].location == c.location){
                            num_left--;
                            new_participants += p[i].get_name();
                            if(num_left > 1){
                                new_participants += ", ";
                            }else if(num_left == 1){
                                if(p.length > 2)new_participants += ",";
                                new_participants += " and ";
                            }
                            add_participant(p[i],true);
                        }
                    }
                    new_participants += " have joined the Fray!\n";
                }
            }else{
                new_participants += c.get_name() + " has joined the Fray!\n";
            }
        }
    }
    
    public function update_participants():Array{
        var s:Array = new Array;
        var i:int = 0;
        for(i;i<participants.length;i++){
            if(participants[i].location == null){
                //s[s.length] = participants[i].get_name() + " has died.";
                participants = participants.slice(0,i).concat(participants.slice(i+1,participants.length));
                initiative = initiative.slice(0,i).concat(initiative.slice(i+1,initiative.length));
                i--;
                continue;
            }
            
            if(participants[i].location.cm != this || !participants[i].get_combat_status()){
                participants = participants.slice(0,i).concat(participants.slice(i+1,participants.length));
                initiative = initiative.slice(0,i).concat(initiative.slice(i+1,initiative.length));
                i--;
                continue;
            }
            
            var ret:Boolean = false;
            if(participants[i].next_attack != "") ret = true;
            
            var k:int = 0;
            for(k;k<participants.length;k++){
                if(participants[i].get_aggresive(participants[k]) || participants[k].get_aggresive(participants[i])){
                    ret = true;
                    break;
                }
            }
            
            if(!ret){
                s[s.length] = participants[i].get_name() + " is no longer interested in fighting.";
                participants = participants.slice(0,i).concat(participants.slice(i+1,participants.length));
                initiative = initiative.slice(0,i).concat(initiative.slice(i+1,initiative.length));
                i--;
                continue;
            }
            
            if(participants[i].busy <= 0) participants[i].set_busy();
            
        }
        
        
        var temp_new_part:Array = new_participants.split("\n");
        
        s = s.concat(temp_new_part);
        
        new_participants = "";
        return [""];
        return s;
    }
    
    public function active_combat():Boolean{
        var ret:Boolean = false;
        
        //check to see if anyone is aggressive against anyone else
        var i:int = 0;
        for(i;i<participants.length;i++){
            if(participants[i].next_attack != "") ret = true;
            if(!ret){
                var k:int = i + 1;
                for(k;k<participants.length;k++){
                    if((participants[i].get_aggresive(participants[k]) || participants[k].get_aggresive(participants[i])) && i != k && participants[i].location == participants[k].location) ret = true;
                }
            }
        }
        
        return ret;
    }
    
    public function get_init(c:Character):int{
        var i:int = 0;
        for(i;i<participants.length;i++){
            if(participants[i] == c) return initiative[i];
        }
        
        return -1;
    }
    
    public function chars_since_last_action(c:Character):int{
        if(current_int == 0) return 1;
        var ret:int = 0;
        var start_int:int = get_next_init();
        var next_int:int = start_int;
        while(true){
            var next_char:Character = null;
            var i:int = 0;
            for(i;i<initiative.length;i++){
                if(initiative[i] == current_int){
                    next_char = participants[i];
                    break;
                }else{
                    if(Math.round(initiative[i]/4) == current_int || Math.round(initiative[i]/8) == current_int){
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
                if(initiative[i] == next_int){
                    next_char = participants[i];
                    break;
                }else{
                    if(Math.round(initiative[i]/4) == next_int || Math.round(initiative[i]/8) == next_int){
                        next_char = participants[i];
                    }
                }
            }
            next_int = get_next_init(next_int);
        }
        return ret;
    }
    
    public function next_character():Character{
        var ret:Character;
        var next_int:int = get_next_init();
        var i:int = 0;
        for(i;i<initiative.length;i++){
            if(initiative[i] == next_int){
                ret = participants[i];
                break;
            }else{
                if(Math.round(initiative[i]/4) == next_int || Math.round(initiative[i]/8) == next_int){
                    ret = participants[i];
                }
            }
        }
        current_int = next_int;
        
        return ret;
    }
    
    private function get_next_init(curr_init:int = 0):int{
        var start_init:int = current_int;
        if(curr_init>=1) start_init = curr_init;
        var lowest_init:Boolean = true;
        var i:int = 0;
        for(i;i<initiative.length;i++){
            if((Math.round(initiative[i]/8) < start_init && Math.round(initiative[i]/8) >= 1) ||
               (Math.round(initiative[i]/4) < start_init && Math.round(initiative[i]/4) >= 1) || initiative[i] < start_init ){//nothing to see here
                lowest_init = false;
                break;
            }
        }
        
        if(lowest_init || start_init <= 1){
            start_init = 10000;//blarg, hardcoding
        }
        
        var next_int:int = 0;
        var multi_act_char_int:int = 0;
        i = 0;
        for(i;i<initiative.length;i++){
            if(initiative[i] > next_int && initiative[i] < start_init) next_int = initiative[i];
            
            if((Math.round(initiative[i]/4) < start_init && Math.round(initiative[i]/4) > multi_act_char_int) || (Math.round(initiative[i]/8) < start_init && Math.round(initiative[i]/8) > multi_act_char_int)){
                multi_act_char_int = initiative[i];
            }
        }
        
        if(Math.round(multi_act_char_int/8) > next_int || (Math.round(multi_act_char_int/4) > next_int && Math.round(multi_act_char_int/4) < start_init)){
            next_int = multi_act_char_int;
        }
        
        //NOW find which character that was...
        i = 0;
        for(i;i<initiative.length;i++){
            if(initiative[i] == next_int){
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
    
    public function get_enemies(c:Character):Array{
        var enemy_list:Array = new Array();
        if(c != null){
            var i:int = 0;
            for(i;i<participants.length;i++){
                if(participants[i] != null){
                    if (c.get_aggresive(participants[i]) || participants[i].get_aggresive(c)) {
                        enemy_list[enemy_list.length] = participants[i];
                    }
                }
            }
        }
        
        return enemy_list;
    }
    
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
