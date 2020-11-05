package fpgamegithubredux;

import java.util.ArrayList;

public class Skill_set {
    
    public ArrayList<Integer> skill_ids;//public var skill_ids:Array;
    public ArrayList<Integer> skill_ranks;//public var skill_ranks:Array;
    public ArrayList<Integer> skill_value;//public var skill_value:Array;
    public ArrayList<Integer> last_update_tick;//public var last_update_tick:Array;
    public ArrayList<Integer> bonus_mod;//public var bonus_mod:Array;
    


    public Skill_set() {
        // constructor code
        
        skill_ids = new ArrayList<>();
        skill_ranks = new ArrayList<>();
        skill_value = new ArrayList<>();
        last_update_tick = new ArrayList<>();
        bonus_mod = new ArrayList<>();
        
    }
    /*
    public function set_bonus(skill_id:int, change_amt:int):String{
        var ret:String = "";
        var i:int = 0;
        var changed:Boolean = false;
        for(i;i<skill_ids.length;i++){
            if(skill_ids[i] == skill_id){
                bonus_mod[i] += change_amt;
                changed = true;
                break;
            }
        }
        if(!changed){
            skill_ids[skill_ids.length] = skill_id;
            skill_ranks[skill_ranks.length] = 0;
            skill_value[skill_value.length] = -1;
            last_update_tick[last_update_tick.length] = 0;
            bonus_mod[bonus_mod.length] = change_amt;
        }
        
        if(change_amt >= 0){
            ret += "</n> looks more skilled at " + FPalace_skills.get_skill_name(skill_id) + ". ";
        }else{
            ret += "</n> looks less skilled at " + FPalace_skills.get_skill_name(skill_id) + ". ";
        }
        
        return ret;
    }
    */
    public int get_skill_value(Character c,int skill_id){
        int ret = 0;
        int skill_rank = 0;
        int bonus = 0;
        int i = 0;
        for(i=0;i<skill_ids.size();i++){//.length
            if(skill_ids.get(i) == skill_id){//[]
                skill_rank = skill_ranks.get(i);//[]
                if(skill_value.get(i) == -1 || c.total_actions_taken > last_update_tick.get(i) ){//[] and []
                    //skill_value[i] = FPalace_skills.get_skill_value_by_id(c, skill_id, skill_rank);
                    skill_value.set(i, FPalace_skills.get_skill_value_by_id(c, skill_id, skill_rank));
                    //last_update_tick[i] = c.total_actions_taken;
                    last_update_tick.set(i, c.total_actions_taken);
                }
                ret = skill_value.get(i) + bonus_mod.get(i);//[] and []
                break;
            }
        }
        
        if(i == skill_ids.size()){//.length
            /*
            skill_ids[skill_ids.length] = skill_id;
            skill_ranks[skill_ranks.length] = 0;
            bonus_mod[bonus_mod.length] = 0;
            skill_value[skill_value.length] = FPalace_skills.get_skill_value_by_id(c, skill_id, skill_rank);
            last_update_tick[last_update_tick.length] = c.total_actions_taken;
            */
            skill_ids.set(skill_ids.size(), skill_id);
            skill_ranks.set(skill_ranks.size(),  0);
            bonus_mod.set(bonus_mod.size(),  0);
            skill_value.set(skill_value.size(),  FPalace_skills.get_skill_value_by_id(c, skill_id, skill_rank));
            last_update_tick.set(last_update_tick.size(),  c.total_actions_taken);
        }
        
        return ret;
    }
    
    
    public ArrayList<CharAction> get_skill_actions(Character c/*, start_id:int, strangers_personal_party_ind:int = 0*/){
        ArrayList<CharAction> act_array = new ArrayList<>();
        int i = 0;
        for(i=0;i<skill_ids.size();i++){
            Skill temp_skill = FPalace_skills.get_skill_by_id(skill_ids.get(i));
            if(temp_skill != null){
                if(temp_skill.actions.size()> 0){
                    act_array.addAll(temp_skill.get_actions(get_skill_value(c, skill_ids.get(i)))); //act_array = act_array.concat(temp_skill.get_actions(get_skill_value(c, skill_ids.get(i))));
                }
            }else{
                //trace("(Skill_set.get_skill_actions)Got a bad skill id: " + skill_ids.get(i));
            }
        }
        return act_array;
    }
    
    public CharAction get_action(Character c,int action_num){
        ArrayList<CharAction> act_array = new ArrayList<>();
        int i = 0;
        for(i=0;i<skill_ids.size();i++){
            Skill temp_skill = FPalace_skills.get_skill_by_id(skill_ids.get(i));
            if(temp_skill.actions.size() > 0){
                act_array.addAll(temp_skill.get_actions(get_skill_value(c, skill_ids.get(i)))); //act_array = act_array.concat(temp_skill.get_actions(get_skill_value(c, skill_ids.get(i))));
            }
        }
        for(i=0;i<act_array.size();i++){
            if(action_num == 0){
                return act_array.get(i);
            }
            action_num--;
        }
        return null;
    }
    
    public ArrayList<CharAction> get_skill_attack_actions(Character c){
        ArrayList<CharAction> act_array = new ArrayList<>();
        int i= 0;
        for(i=0;i<skill_ids.size();i++){
            Skill temp_skill = FPalace_skills.get_skill_by_id(skill_ids.get(i));
            if(temp_skill != null && temp_skill.attacks.size() > 0){
                act_array.addAll(temp_skill.get_attacks(get_skill_value(c, skill_ids.get(i)))); //act_array = act_array.concat(temp_skill.get_attacks(get_skill_value(c, skill_ids.get(i))));
            }
        }
        return act_array;
    }
    
    public int get_skill_cost(Character c,int skill_id,int change_amount){
        int base_xp_cost = 10;
        int xp_cost = 10;
        int existing_ranks = 0;
        for(int i=0;i<skill_ids.size();i++){
            if(skill_ids.get(i) == skill_id) {
                //xp_cost = Math.floor(base_xp_cost * Math.pow((skill_ranks[i] + 1), 2))
                xp_cost = (int)Math.floor(base_xp_cost * (skill_ranks.get(i)+ 1));
                existing_ranks = skill_ranks.get(i);
                break;
            }
        }
        
        if(change_amount > 1){
            change_amount--;
            for(int ca = change_amount-1;ca>1;ca--){
                //xp_cost += Math.floor(base_xp_cost * Math.pow( existing_ranks + change_amount + 1,2))
                xp_cost += Math.floor(base_xp_cost * (existing_ranks + change_amount + 1));
            }
        }
        
        if(get_skill_ranks(skill_id) <= 0){
            int parent_id = FPalace_skills.get_skill_parent(skill_id);
            if(parent_id >= 0&&get_skill_ranks(parent_id) < 5){
                xp_cost += get_skill_cost(c, parent_id, 5 - get_skill_ranks(parent_id))/2;
            }
        }
        
        if(c.get_current_class() != null){
            if(c.get_current_class().is_class_skill(skill_id)){
                if(existing_ranks == 0) xp_cost = base_xp_cost;
                xp_cost = xp_cost/2;   
            }
        }
        
        return xp_cost; 
    }
    
    public String set_skill_value(Character c,int skill_id,int change_amount){
        String ret = "</n>s " + FPalace_skills.get_skill_name(skill_id) + " skill level changes by " + change_amount +"! \n";
        
        int i = 0;
        for(i=0;i<skill_ids.size();i++){//.length
            if(skill_ids.get(i) == skill_id) break;///[]
        }
        if(i==skill_ids.size()){//.length
            skill_ids.set(i,skill_id);//[] for all
            skill_ranks.set(i, 0);
            bonus_mod.set(i,0);
            skill_value.set(i,-1);
            last_update_tick.set(i,0);
        }
        
        //skill_ranks[i] += change_amount; all like this before
        skill_ranks.set(i, skill_ranks.get(i) + change_amount);
        skill_value.set(i, FPalace_skills.get_skill_value_by_id(c, skill_id, skill_ranks.get(i)));//[] and []
        last_update_tick.set(i,c.total_actions_taken);
        
        return ret;
    }
    
    public int get_skill_ranks(int skill_id){
        int i = 0;
        for(i=0;i<skill_ids.size();i++){//.length
            if(skill_ids.get(i) == skill_id) return skill_ranks.get(i);//[] and[]
        }
        return 0;
    }
    
    public String show_all_skills(Character c, ArrayList<Integer> show_children_of){//default show_children_of:Array = null
        return FPalace_skills.get_skill_tree(c, this, show_children_of);
    }
    

}
