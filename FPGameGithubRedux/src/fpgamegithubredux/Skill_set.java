package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Skill_set {
    private static final Logger LOGGER = Logger.getLogger(Skill_set.class.getName());

    protected ArrayList<Integer> skill_ids;//public var skill_ids:Array
    protected ArrayList<Integer> skill_ranks;//public var skill_ranks:Array
    protected ArrayList<Integer> skill_value;//public var skill_value:Array
    protected ArrayList<Integer> last_update_tick;//public var last_update_tick:Array
    protected ArrayList<Integer> bonus_mod;//public var bonus_mod:Array
    


    public Skill_set() {
        // constructor code
        
        skill_ids = new ArrayList<>();
        skill_ranks = new ArrayList<>();
        skill_value = new ArrayList<>();
        last_update_tick = new ArrayList<>();
        bonus_mod = new ArrayList<>();
        
    }
    
    public String set_bonus(int skillID,int changeAmt){
        String ret = "";
        Boolean changed = false;
        for(int i=0;i<skill_ids.size();i++){
            if(skill_ids.get(i) == skillID){
                bonus_mod.set(i,bonus_mod.get(i)+changeAmt);//bonus_mod[i] += change_amt
                changed = true;
                break;
            }
        }
        if(Boolean.FALSE.equals(changed)){
            skill_ids.add(skillID); //skill_ids[skill_ids.length] = skill_id
            skill_ranks.add(0); //skill_ranks[skill_ranks.length] = 0
            skill_value.add(-1); //skill_value[skill_value.length] = -1
            last_update_tick.add(0); //last_update_tick[last_update_tick.length] = 0
            bonus_mod.add(changeAmt); //bonus_mod[bonus_mod.length] = change_amt
        }
        
        if(changeAmt >= 0){
            ret += "</n> looks more skilled at " + FPalace_skills.get_skill_name(skillID) + ". ";
        }else{
            ret += "</n> looks less skilled at " + FPalace_skills.get_skill_name(skillID) + ". ";
        }
        
        return ret;
    }
    
    public int get_skill_value(Character c,int skillID){
        int ret = 0;
        int skillRank = 0;
        //int bonus = 0
        int i = 0;
        for(i=0;i<skill_ids.size();i++){//.length
            if(skill_ids.get(i) == skillID){//[]
                skillRank = skill_ranks.get(i);//[]
                if(skill_value.get(i) == -1 || c.total_actions_taken > last_update_tick.get(i) ){//[] and []
                    //REPLACEd BY BELOW//skill_value[i] = FPalace_skills.get_skill_value_by_id(c, skill_id, skill_rank)
                    skill_value.set(i, FPalace_skills.get_skill_value_by_id(c, skillID, skillRank));
                    //REPLACEd BY BELOW//last_update_tick[i] = c.total_actions_taken
                    last_update_tick.set(i, c.total_actions_taken);
                }
                ret = skill_value.get(i) + bonus_mod.get(i);//[] and []
                break;
            }
        }
        
        if(i == skill_ids.size()){//.length
            skill_ids.add(skillID);//skill_ids[skill_ids.length] = skill_id
            skill_ranks.add(0);//skill_ranks[skill_ranks.length] = 0
            bonus_mod.add(0);//bonus_mod[bonus_mod.length] = 0
            //REPLACED BY BELOW//skill_value[skill_value.length] = FPalace_skills.get_skill_value_by_id(c, skill_id, skill_rank)
            skill_value.add(FPalace_skills.get_skill_value_by_id(c, skillID, skillRank));
            last_update_tick.add(c.total_actions_taken);//last_update_tick[last_update_tick.length] = c.total_actions_taken
        }
        
        return ret;
    }
    
    
    public ArrayList<CharAction> get_skill_actions(Character c/*, start_id:int, strangers_personal_party_ind:int = 0*/){
        ArrayList<CharAction> actArray = new ArrayList<>();
        int i = 0;
        for(i=0;i<skill_ids.size();i++){
            Skill tempSkill = FPalace_skills.get_skill_by_id(skill_ids.get(i));
            if(tempSkill != null){
                if(!tempSkill.actions.isEmpty()){
                    actArray.addAll(tempSkill.get_actions(get_skill_value(c, skill_ids.get(i)))); //act_array = act_array.concat(temp_skill.get_actions(get_skill_value(c, skill_ids.get(i))))
                }
            }else{
                LOGGER.info("(Skill_set.get_skill_actions)Got a bad skill id: " + skill_ids.get(i));
            }
        }
        return actArray;
    }
    
    public CharAction get_action(Character c,int actionNum){
        ArrayList<CharAction> actArray = new ArrayList<>();
        int i = 0;
        for(i=0;i<skill_ids.size();i++){
            Skill tempSkill = FPalace_skills.get_skill_by_id(skill_ids.get(i));
            if(!tempSkill.actions.isEmpty()){
                actArray.addAll(tempSkill.get_actions(get_skill_value(c, skill_ids.get(i)))); //act_array = act_array.concat(temp_skill.get_actions(get_skill_value(c, skill_ids.get(i))))
            }
        }
        for(i=0;i<actArray.size();i++){
            if(actionNum == 0){
                return actArray.get(i);
            }
            actionNum--;
        }
        return null;
    }
    
    public ArrayList<CharAction> get_skill_attack_actions(Character c){
        ArrayList<CharAction> actArray = new ArrayList<>();
        int i= 0;
        for(i=0;i<skill_ids.size();i++){
            Skill tempSkill = FPalace_skills.get_skill_by_id(skill_ids.get(i));
            if(tempSkill != null && !tempSkill.attacks.isEmpty()){
                actArray.addAll(tempSkill.get_attacks(get_skill_value(c, skill_ids.get(i)))); //act_array = act_array.concat(temp_skill.get_attacks(get_skill_value(c, skill_ids.get(i))))
            }
        }
        return actArray;
    }
    
    public int get_skill_cost(Character c,int skillID,int changeAmount){
        int baseXPCost = 10;
        int xpCost = 10;
        int existingRanks = 0;
        for(int i=0;i<skill_ids.size();i++){
            if(skill_ids.get(i) == skillID) {
                //REPLACED BELOW//xp_cost = Math.floor(base_xp_cost * Math.pow((skill_ranks[i] + 1), 2))
                xpCost = baseXPCost * (skill_ranks.get(i)+ 1);
                existingRanks = skill_ranks.get(i);
                break;
            }
        }
        
        if(changeAmount > 1){
            changeAmount--;
            for(int ca = changeAmount-1;ca>1;ca--){
                //REPLACED BELOW//xp_cost += Math.floor(base_xp_cost * Math.pow( existing_ranks + change_amount + 1,2))
                xpCost += baseXPCost * (existingRanks + changeAmount + 1);
            }
        }
        
        if(get_skill_ranks(skillID) <= 0){
            int parentID = FPalace_skills.get_skill_parent(skillID);
            if(parentID >= 0&&get_skill_ranks(parentID) < 5){
                xpCost += get_skill_cost(c, parentID, 5 - get_skill_ranks(parentID))/2;
            }
        }
        
        if(c.get_current_class() != null){
            if(Boolean.TRUE.equals(c.get_current_class().is_class_skill(skillID))){
                if(existingRanks == 0) xpCost = baseXPCost;
                xpCost = xpCost/2;   
            }
        }
        
        return xpCost; 
    }
    
    public String set_skill_value(Character c,int skillID,int changeAmount){
        String ret = "</n>s " + FPalace_skills.get_skill_name(skillID) + " skill level changes by " + changeAmount +"! \n";
        
        int i = 0;
        for(i=0;i<skill_ids.size();i++){//.length
            if(skill_ids.get(i) == skillID) break;///[]
        }
        if(i==skill_ids.size()){//.length
            skill_ids.add(skillID);//[] for all
            skill_ranks.add(0);
            bonus_mod.add(0);
            skill_value.add(-1);
            last_update_tick.add(0);
        }
        
        //REPLACED BELOW//skill_ranks[i] += change_amount; all like this before
        skill_ranks.set(i, skill_ranks.get(i) + changeAmount);
        skill_value.set(i, FPalace_skills.get_skill_value_by_id(c, skillID, skill_ranks.get(i)));//[] and []
        last_update_tick.set(i,c.total_actions_taken);
        
        return ret;
    }
    
    public int get_skill_ranks(int skillID){
        int i = 0;
        for(i=0;i<skill_ids.size();i++){//.length
            if(skill_ids.get(i) == skillID) return skill_ranks.get(i);//[] and[]
        }
        return 0;
    }
    public String show_all_skills(Character c){
        return show_all_skills(c,null);
    }
    public String show_all_skills(Character c, ArrayList<Integer> showChildrenOf){//default show_children_of:Array = null
        return FPalace_skills.get_skill_tree(c, this, showChildrenOf);
    }
    

}
