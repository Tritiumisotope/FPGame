package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Party {
    private static final Logger LOGGER = Logger.getLogger(Party.class.getName());
    public ArrayList<Character> members;//public var members:Array
    

    public Party(ArrayList<Character> newMems) {
        // constructor code
        members = newMems;
    }
    public Party() {
        // constructor code
        members = new ArrayList<>();
    }
    
    public Character get_best_at_skill(int skill_id){
        int ret_char = 0;
        int highest_val = 0;
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i).get_skill_by_id(skill_id) > highest_val){
                highest_val = members.get(i).get_skill_by_id(skill_id);
                ret_char = i;
            }
        }
        
        return members.get(ret_char);
    }
    
    public Character get_best_at_stat(int stat_id){
        int ret_char = 0;
        int highest_val = 0;
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i).get_stat(stat_id).intValue() > highest_val){
                highest_val = members.get(i).get_stat(stat_id).intValue();
                ret_char = i;
            }
        }
        
        return members.get(ret_char);
    }
    
    public void advance_objectives(int action_type,ArrayList<Object> action_trigger){
        int i = 0;
        for(i=0;i<members.size();i++){
            //members.get(i).personality.advance_objectives(action_type,action_trigger,members.get(i));
            //TODO advance_objectives in personality
        }
    }
    
    public String get_party_character_output(Character sanitize_for){
        String ret = "";
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i) != null){
                //ret += members.get(i).sanitize(members.get(i).get_challenge_output(), sanitize_for);
                //TODO Character get_challenge_output
            }
        }
        
        return ret;
    }
    
    public String get_status(Character c){
        String ret = "";
        ArrayList<Character> members_to_display = new ArrayList<>();
            
        int char_init = -1;
        
        int i = 0;
        for(i=0;i<members.size();i++){
            if(c.location == members.get(i).location){
                /*TODO CombatManager
                if(members.get(i).location.cm == null || members.get(i).location.cm.get_init(members.get(i)) < 0){
                    members_to_display[members_to_display.length] = members.get(i);
                }else{
                    if(members.get(i).location.cm.get_init(members.get(i)) > char_init)char_init = members.get(i).location.cm.get_init(members.get(i));
                }
                */
            }
        }
        if(members_to_display.size() > 0){
            for(i=0;i<members_to_display.size();i++){
                if(members_to_display.get(i) != null){
                    //ret += "<a href=\"event:look," + c.location.get_content_id(members_to_display.get(i)) +"\">" + members_to_display.get(i).personality.get_name(c, members_to_display.get(i)) + "</a>";
                    //TODO Room
                    if(i < members_to_display.size() - 2){
                        ret += ", ";
                    }else if(i < members_to_display.size() - 1){
                        ret += ", and ";
                    }
                }
            }
            
            String verb = "are";
            if(members_to_display.size() == 1) verb = "is";
            
            if(char_init > -1){
                ret += " "+verb+" watching the fight";
            }else if(get_leader().get_stat(FPalaceHelper.lust_id).doubleValue() >= get_leader().get_stat(FPalaceHelper.max_lust_id).doubleValue()){
                ret += " "+verb+" lying in a pool of their own juices on the ground";
            }else if(get_leader().busy > 0){
                ret += " "+verb+" doing something here";
            }else{
                ret += " "+verb+" standing here";
            }				
        }
        
        return ret;
    }
    
    public void add_member(Character c){
        //check to make sure not already a member
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i) == c) return;
        }
        
        c.party = this;
        //members[members.length] = c
        members.add(c);
    }
    
    public void remove_member(Character c){
        int i = 0;
        Boolean found = false;
        for(i=0;i<members.size();i++){
            if(members.get(i) == c){
                found = true;
            }
            if(found && i < members.size() -1) members.set(i, members.get(i+1));
        }
        
        //if(found) members = members.slice(0,members.size() - 1)
        if(found) members.remove(members.size() - 1);
        //TODO check
    }
    
    public Boolean member_of(Character c){
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i) == c) return true;
        }
        return false;
    }
    
    public ArrayList<Character> get_members(){
        return members;
    }
    
    public Character get_leader(){
        return (Character)members.get(0);
    }
    public Boolean get_aggressive(Character c){
        return get_aggressive(c,0);
    }
    public Boolean get_aggressive(Character c,int c_party_check){//def 0
        int i = 0;
        Boolean found = false;
        
        for(i=0;i<members.size();i++){
            /*TODO get_aggressive in Character
            if(members.get(i).get_aggresive(c, 1, c_party_check)){
                found = true;
            }
            */
        }
        
        return found;
    }
    
    public Boolean in_combat(){
        Boolean ret = false;
        int i = 0;
        for(i=0;i<members.size();i++){
            /*TODO combat_manager
            if (members.get(i).location != null && members.get(i).location.cm != null && members.get(i).location.cm.active_combat() && members.get(i).location.cm.get_init(members.get(i)) > -1 && members.get(i).get_combat_status()){
                ret = true;
                break;
            }
            */
        }
        
        return ret;
    }
    
    public String give_xp(int i){//was uint
        String s = "";
        
        int reward = Math.round(i/members.size());//was uint
        
        int count = 0;
        
        for(count=0;count<members.size();count++){
            s += members.get(count).set_xp(reward);
        }
        return s;
        
    }
    
    public Party copyParty(){
        Party p = new Party();
        
        int k= 0;
        
        for(k=0;k<members.size();k++){
            Character clonech1 = new Character("");
            //clonech1.clone(members.get(k));
            //TODO copyCharacter after giving all applicable fields
            //need to assign an actual name based on sex/race
            /*
            var char_name:String = "";
            
            if(clonech1.get_primary_race() != null){
                if(clonech1.sex.name == "Male"){
                    char_name = clonech1.get_primary_race().get_random_male_name();
                }else{
                    char_name = clonech1.get_primary_race().get_random_female_name();
                }
                
                char_name += " " + clonech1.get_primary_race().get_random_surname();
                
                clonech1.set_name(char_name);
            }else{
                clonech1.set_name(members[k].get_name());
            }
            */
            //clonech1.set_party(p);
            //TODO set_party in Character
            p.add_member(clonech1);
            
        }
        
        return p;
    }

}
