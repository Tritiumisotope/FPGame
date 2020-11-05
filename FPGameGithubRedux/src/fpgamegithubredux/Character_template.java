package fpgamegithubredux;

import java.util.ArrayList;

public class Character_template {
    
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
		
		public void set_stat_jiggle(int stat_id,Number stat_min,Number stat_max){
            stats.add(stat_id);//stats[stats.length] = stat_id
			//mins[mins.length] = stat_min;
			//maxs[maxs.length] = stat_max;
		}
		public Character gen_char(){
                return gen_char(0,null);
        }
        public Character gen_char(int level_adjust){
            return gen_char(level_adjust,null);
        }
		public Character gen_char(int level_adjust, Room r){//def 0, null
			Character ret = new Character();
            //ret.clone(char_to_clone);
            //TODO clone method in Character
			int i = 0;
			if(r != null){
                /*
				for(i=0;i<ret.personality.objectives.length;i++){
					int j = 0;
					for(j=0;j<ret.personality.objectives[i].objectives.length;j++){
                        
						if(ret.personality.objectives[i].objective_actions[j] == Quest.area_action && ret.personality.objectives[i].objective_targets[j] == null){
							//ret.personality.objectives[i].objective_targets[j] = [r.area];
						}else if(ret.personality.objectives[i].objective_actions[j] == Quest.room_action && ret.personality.objectives[i].objective_targets[j] == null){
							//ret.personality.objectives[i].objective_targets[j] = [r];
						}else if(ret.personality.objectives[i].objective_actions[j] == Quest.wait_action && ret.personality.objectives[i].objective_targets[j] == null){
							//ret.personality.objectives[i].objective_targets[j] = [r];
                        }
                        
					}
                }
                */
			}
			
			if(ret.name.equals("")){
                String char_name = "";
                /*
				if(ret.get_primary_race() != null){
					if(ret.sex.get_noun() == "his"){
						char_name = ret.get_primary_race().get_random_male_name();
					}else{
						char_name = ret.get_primary_race().get_random_female_name();
					}
					
					char_name += " " + ret.get_primary_race().get_random_surname();
				}else{
					char_name = char_to_clone.get_name();
                }
                ret.set_name(ret.set_surname(char_name,true));
                */
			}
			
            i = 0;
            
			for(i=0;i<stats.length;i++){
				Number curr_stat_value = ret.get_stat(stats.get(i),0,0,-1,false);
				if(curr_stat_value < 0){
					trace("(Character_template.gen_char)Attempting to adjust a stat that either doesn't exist, or is at -1. Stat id:" + stats.get(i) + ". Character name: " + char_name);
				}else{
					Number rand = curr_stat_value;
					if(curr_stat_value.doubleValue() > maxs.get(i).doubleValue() || curr_stat_value.doubleValue() < mins.get(i).doubleValue()){
						//mid shoulb be between min and max is average...
						rand = Math.random()*(maxs.get(i).doubleValue() - mins.get(i).doubleValue()) + mins.get(i).doubleValue();
					}else{
						//current value is average...
						rand = Math.random();
						if(rand.doubleValue() > 0.5){
							rand = ((rand.doubleValue()-0.5)*2)*(maxs.get(i).doubleValue() - curr_stat_value.doubleValue()) + curr_stat_value.doubleValue();
						}else{
							rand = (rand.doubleValue()*2)*(curr_stat_value.doubleValue() - mins.get(i).doubleValue()) + mins.get(i).doubleValue();
						}
					}
					if(curr_stat_value.doubleValue() > 0){
						ret.apply_affect_by_id(stats.get(i),rand.doubleValue() - curr_stat_value.doubleValue(),0,null, Body.prorate_change_total);
					}else{
						ret.apply_affect_by_id(stats.get(i),rand - curr_stat_value,0,null, Body.change_stats_total);
					}
				}				
            }
            */
			
			if(level_adjust > 0){
                //var skill_list= new Array();
                /*
				skill_list = skill_list.concat(ret.get_current_class().class_skills);
				skill_list = skill_list.concat(ret.skills.skill_ids);
				i = 0;
				for(i=0;i<level_adjust;i++){
					ret.set_xp(ret.nxt_lvl_xp - ret.xp);
					//spend xp to upgrade skills... should get trained/class skills, and spend xp to increase whatever is cheapest until it's all spent
					Boolean xp_to_spend = true;
					//var skill_costs:Array = new Array();
					while(xp_to_spend){
						xp_to_spend = false;
						int lowest_cost_index = 0;
						int skill_count = 0;
						for(skill_count=0;skill_count<skill_list.length;skill_count++){
							skill_costs[skill_count] = ret.skills.get_skill_cost(ret,skill_list[skill_count],1);
							if(skill_costs[skill_count] < skill_costs[lowest_cost_index])lowest_cost_index = skill_count;
							if(skill_costs[skill_count] <= ret.xp) xp_to_spend = true;
						}
						if(xp_to_spend)ret.increase_skill_by_id(skill_list[lowest_cost_index]);
					}
					
					
                }	
                */			
			}else if(level_adjust < 0){
				//trace("(Character_template.gen_char)Should be lowering an npcs level. Doing nothing.");
			}
			
			if(ret.stat_points > 0){
            /*
				xp_to_spend = true;
				skill_list = new Array(FPalaceHelper.str_id,FPalaceHelper.dex_id,FPalaceHelper.con_id,FPalaceHelper.sex_appeal_id,FPalaceHelper.will_id,FPalaceHelper.wis_id,FPalaceHelper.int_id,FPalaceHelper.cha_id);
				skill_costs = new Array();					
				while(xp_to_spend){
					xp_to_spend = false;
					lowest_cost_index = 0;
					skill_count = 0;
					for(skill_count=0;skill_count<skill_list.length;skill_count++){
						skill_costs[skill_count] = ret.get_current_class().get_stat_cost(skill_list[skill_count]);
						if(skill_costs[skill_count] < skill_costs[lowest_cost_index])lowest_cost_index = skill_count;
						if(skill_costs[skill_count] <= ret.stat_points) xp_to_spend = true;
					}
					if(xp_to_spend){
						ret.apply_affect_by_id(skill_list[lowest_cost_index],1,0,null, Body.change_stats_total);
						ret.stat_points -= ret.get_current_class().get_stat_cost(skill_list[lowest_cost_index]);
					}
                }
                */
			}
			
			//if(!ret.body.alive(ret))trace("(Character_template.gen_char) Just made a dead character"); 
			return ret;
		}
		
		public Character_template copyCharTemp(){
			Character_template ret = new Character_template();
			Character temp_char = new Character();
			//temp_char.clone(this.char_to_clone);
			ret.set_char_to_clone(temp_char);
			int i = 0;
			for(i=0;i<stats.size();i++){
				//ret.set_stat_jiggle(stats.get(i),mins.get(i),maxs.get(i));			
			}
			
			return ret;
		}
}
