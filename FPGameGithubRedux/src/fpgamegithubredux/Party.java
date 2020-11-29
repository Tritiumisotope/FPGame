package fpgamegithubredux;

import java.util.ArrayList;

public class Party {
    public ArrayList<Character> members;//public var members:Array
    

    public Party(ArrayList<Character> newMems) {
        // constructor code
        members = newMems;
    }
    public Party() {
        // constructor code
        members = new ArrayList<>();
    }
    
    public Character get_best_at_skill(int skillID){
        int retChar = 0;
        int highestVal = 0;
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i).get_skill_by_id(skillID) > highestVal){
                highestVal = members.get(i).get_skill_by_id(skillID);
                retChar = i;
            }
        }
        
        return members.get(retChar);
    }
    
    public Character get_best_at_stat(int statID){
        int retChar = 0;
        int highestVal = 0;
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i).get_stat(statID).intValue() > highestVal){
                highestVal = members.get(i).get_stat(statID).intValue();
                retChar = i;
            }
        }
        
        return members.get(retChar);
    }
    
    public void advance_objectives(int actionType,ArrayList<Object> actionTrigger){
        int i = 0;
        for(i=0;i<members.size();i++){
            members.get(i).personality.advance_objectives(actionType,actionTrigger,members.get(i));
        }
    }
    
    public String get_party_character_output(Character sanitizeFor){
        String ret = "";
        int i = 0;
        for(i=0;i<members.size();i++){
            if(members.get(i) != null){
                ret += members.get(i).sanitize(members.get(i).get_challenge_output(), sanitizeFor);
            }
        }
        
        return ret;
    }
    
    public String get_status(Character c){
        String ret = "";
        ArrayList<Character> membersToDisplay = new ArrayList<>();
            
        int charInit = -1;
        
        int i = 0;
        for(i=0;i<members.size();i++){
            if(c.location == members.get(i).location){
                if(members.get(i).location.cm == null || members.get(i).location.cm.get_init(members.get(i)) < 0){
                    membersToDisplay.add(members.get(i));//members_to_display[members_to_display.length] = members.get(i)
                }else{
                    if(members.get(i).location.cm.get_init(members.get(i)) > charInit)charInit = members.get(i).location.cm.get_init(members.get(i));
                }
            }
        }
        if(!membersToDisplay.isEmpty()){//was size()>0
            for(i=0;i<membersToDisplay.size();i++){
                if(membersToDisplay.get(i) != null){
                    ret += "<a href=\"event:look," + c.location.getContentID(membersToDisplay.get(i)) +"\">" + membersToDisplay.get(i).personality.get_name(c, membersToDisplay.get(i)) + "</a>";
                    if(i < membersToDisplay.size() - 2){
                        ret += ", ";
                    }else if(i < membersToDisplay.size() - 1){
                        ret += ", and ";
                    }
                }
            }
            
            String verb = "are";
            if(membersToDisplay.size() == 1) verb = "is";
            
            if(charInit > -1){
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
        

        if(found) members.remove(members.size() - 1);//members = members.slice(0,members.size() - 1)
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
    public Boolean get_aggressive(Character c,int cPartyCheck){//def 0
        int i = 0;
        Boolean found = false;
        
        for(i=0;i<members.size();i++){
            if(members.get(i).get_aggresive(c, 1, cPartyCheck)){
                found = true;
            }
        }
        
        return found;
    }
    
    public Boolean in_combat(){
        Boolean ret = false;
        int i = 0;
        for(i=0;i<members.size();i++){
            if (members.get(i).location != null && members.get(i).location.cm != null && members.get(i).location.cm.active_combat() && members.get(i).location.cm.get_init(members.get(i)) > -1 && members.get(i).get_combat_status()){
                ret = true;
                break;
            }
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
            clonech1.copyCharacter(members.get(k));
            //need to assign an actual name based on sex/race
            
            String charName = "";
            
            if(clonech1.get_primary_race() != null){
                if(clonech1.sex.name.equals("Male")){
                    charName = clonech1.get_primary_race().get_random_male_name();
                }else{
                    charName = clonech1.get_primary_race().get_random_female_name();
                }
                
                charName += " " + clonech1.get_primary_race().get_random_surname();
                
                clonech1.set_name(charName);
            }else{
                clonech1.set_name(members.get(k).getName());
            }
            
            clonech1.set_party(p);
            p.add_member(clonech1);
            
        }
        return p;
    }

}
