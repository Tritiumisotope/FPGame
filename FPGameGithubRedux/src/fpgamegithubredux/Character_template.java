package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Character_template {

		private static final Logger LOGGER = Logger.getLogger(Character_template.class.getName());
    
		public Character char_to_clone;
		public ArrayList<Integer> stats;
		public ArrayList<Number> mins;//public var mins:Array
		public ArrayList<Number> maxs;//public var maxs:Array

		public Character_template(){
			// constructor code
			char_to_clone = null;
			stats = new ArrayList<>();
			mins = new ArrayList<>();
			maxs = new ArrayList<>();
		}
		
		public void set_char_to_clone(Character c){
			char_to_clone = c;
		}
		
		public void set_stat_jiggle(int statID,Number statMin,Number statMax){
            stats.add(statID);//stats[stats.length] = stat_id
			mins.add(statMin);//mins[mins.length] = stat_min
			maxs.add(statMax);//maxs[maxs.length] = stat_max
		}
		public Character gen_char(){
                return gen_char(0,null);
        }
        public Character gen_char(int levelAdjust){
            return gen_char(levelAdjust,null);
        }
		public Character gen_char(int levelAdjust, Room r){//def 0, null
			Character ret = new Character();
            ret.copyCharacter(char_to_clone);
			int i = 0;
			if(r != null){
                
				for(i=0;i<ret.personality.objectives.size();i++){
					int j = 0;
					for(j=0;j<ret.personality.objectives.get(i).objectives.size();j++){
						if(ret.personality.objectives.get(i).objective_actions.get(j) == Quest.area_action && ret.personality.objectives.get(i).objective_targets.get(j) == null){
							ret.personality.objectives.get(i).objective_targets.set(j,new ArrayList<>(Arrays.asList(r.area)));//ret.personality.objectives.get(i).objective_targets[j] = [r.area]
						}else if(ret.personality.objectives.get(i).objective_actions.get(j) == Quest.room_action && ret.personality.objectives.get(i).objective_targets.get(j) == null){
							ret.personality.objectives.get(i).objective_targets.set(j,new ArrayList<>(Arrays.asList(r)));//ret.personality.objectives.get(i).objective_targets[j] = [r]
						}else if(ret.personality.objectives.get(i).objective_actions.get(j) == Quest.wait_action && ret.personality.objectives.get(i).objective_targets.get(j) == null){
							ret.personality.objectives.get(i).objective_targets.set(j,new ArrayList<>(Arrays.asList(r)));//ret.personality.objectives.get(i).objective_targets[j] = [r]
                        }//TODO combine last?
					}
                }
                
			}
			String charName = "";
			if(ret.name.equals("")){
                
                
				if(ret.get_primary_race() != null){
					if(ret.sex.get_noun().equals("his")){
						charName = ret.get_primary_race().get_random_male_name();
					}else{
						charName = ret.get_primary_race().get_random_female_name();
					}
					
					charName += " " + ret.get_primary_race().get_random_surname();
				}else{
					charName = char_to_clone.getName();
                }
                ret.set_name(ret.set_surname(charName,true));
                
			}
            
			for(i=0;i<stats.size();i++){
				Number currStatValue = ret.get_stat(stats.get(i),0,0,-1,false);
				if(currStatValue.doubleValue() < 0){
					LOGGER.info("(Character_template.gen_char)Attempting to adjust a stat that either doesn't exist, or is at -1. Stat id:" + stats.get(i) + ". Character name: " + charName);
				}else{
					Number rand = currStatValue;//TODO WHY?!
					if(currStatValue.doubleValue() > maxs.get(i).doubleValue() || currStatValue.doubleValue() < mins.get(i).doubleValue()){
						//mid should be between min and max is average...
						rand = Math.random()*(maxs.get(i).doubleValue() - mins.get(i).doubleValue()) + mins.get(i).doubleValue();
					}else{
						//current value is average...
						rand = Math.random();
						if(rand.doubleValue() > 0.5){
							rand = ((rand.doubleValue()-0.5)*2)*(maxs.get(i).doubleValue() - currStatValue.doubleValue()) + currStatValue.doubleValue();
						}else{
							rand = (rand.doubleValue()*2)*(currStatValue.doubleValue() - mins.get(i).doubleValue()) + mins.get(i).doubleValue();
						}
					}
					if(currStatValue.doubleValue() > 0){
						ret.apply_affect_by_id(stats.get(i),rand.doubleValue() - currStatValue.doubleValue(),0,null, Body.prorate_change_total);
					}else{
						ret.apply_affect_by_id(stats.get(i),rand.doubleValue() - currStatValue.doubleValue(),0,null, Body.change_stats_total);
					}
				}				
            }
            
			
			if(levelAdjust > 0){
                ArrayList<Integer> skillList= new ArrayList<>();
                
				skillList.addAll(ret.get_current_class().class_skills); //skill_list = skill_list.concat(ret.get_current_class().class_skills)
				skillList.addAll(ret.skills.skill_ids);// skill_list = skill_list.concat(ret.skills.skill_ids)
				for(i=0;i<levelAdjust;i++){
					ret.set_xp(ret.nxt_lvl_xp - ret.xp);
					//spend xp to upgrade skills... should get trained/class skills, and spend xp to increase whatever is cheapest until it's all spent
					Boolean xpToSpend = true;
					ArrayList<Integer> skillCosts = new ArrayList<>();
					while(xpToSpend){
						xpToSpend = false;
						int lowestCostIndex = 0;
						int skillCount = 0;
						for(skillCount=0;skillCount<skillList.size();skillCount++){
							skillCosts.set(skillCount, ret.skills.get_skill_cost(ret,skillList.get(skillCount),1));
							if(skillCosts.get(skillCount) < skillCosts.get(lowestCostIndex))lowestCostIndex = skillCount;
							if(skillCosts.get(skillCount) <= ret.xp) xpToSpend = true;
						}
						if(xpToSpend)ret.increase_skill_by_id(skillList.get(lowestCostIndex));
					}
					
					
                }	
                	
			}else if(levelAdjust < 0){
				LOGGER.info("(Character_template.gen_char)Should be lowering an npcs level. Doing nothing.");
			}
			
			if(ret.stat_points > 0){
            
				Boolean xpToSpend = true;
				ArrayList<Integer> skillList = new ArrayList<>();
				int[] first = {FPalaceHelper.str_id,FPalaceHelper.dex_id,FPalaceHelper.con_id,FPalaceHelper.sex_appeal_id,FPalaceHelper.will_id,FPalaceHelper.wis_id,FPalaceHelper.int_id,FPalaceHelper.cha_id};
				for(int arrels : first){
					skillList.add(first[arrels]);
					}
				ArrayList<Integer> skillCosts = new ArrayList<>();					
				while(xpToSpend){
					xpToSpend = false;
					int lowestCostIndex = 0;
					int skillCount = 0;
					for(skillCount=0;skillCount<skillList.size();skillCount++){
						skillCosts.set(skillCount, ret.get_current_class().get_stat_cost(skillList.get(skillCount)));
						if(skillCosts.get(skillCount) < skillCosts.get(lowestCostIndex))lowestCostIndex = skillCount;
						if(skillCosts.get(skillCount) <= ret.stat_points) xpToSpend = true;
					}
					if(xpToSpend){
						ret.apply_affect_by_id(skillList.get(lowestCostIndex),1,0,null, Body.change_stats_total);
						ret.stat_points -= ret.get_current_class().get_stat_cost(skillList.get(lowestCostIndex));
					}
                }
                
			}
			
			if(!ret.body.alive(ret))LOGGER.info("(Character_template.gen_char) Just made a dead character"); 
			return ret;
		}
		
		public Character_template copyCharTemp(){
			Character_template ret = new Character_template();
			Character tempChar = new Character();
			tempChar.copyCharacter(this.char_to_clone);
			ret.set_char_to_clone(tempChar);
			int i = 0;
			for(i=0;i<stats.size();i++){
				ret.set_stat_jiggle(stats.get(i),mins.get(i),maxs.get(i));			
			}
			
			return ret;
		}
}
