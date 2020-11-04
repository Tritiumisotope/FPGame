package fpgamegithubredux;

import java.util.ArrayList;

public class Skill {
    		
		public int parent_skill;
		public int id;
		public String name;
		
		public ArrayList<Integer> stat_list;//public var stat_list:Array;
		public ArrayList<Integer> stat_ratio_list;//public var stat_ratio_list:Array;
		
		public ArrayList<CharAction> actions;//public var actions:Array;
		public ArrayList<Integer> act_bonus_req;//public var act_bonus_req:Array;
		
		public ArrayList<CharAction> attacks;//public var attacks:Array;
		public ArrayList<Integer> atk_bonus_req;//public var atk_bonus_req:Array;
		
		public  Skill() {
            // constructor code
            /*
			stat_list = new Array();
			stat_ratio_list = new Array();
			parent_skill = -1;
			actions = new Array();
			act_bonus_req = new Array();
			attacks = new Array();
            atk_bonus_req = new Array();
            */
		}
		
		public void set_id(int i){
			id = i;
		}
		
		public int get_id(){
			return id;
		}
		
		public void set_parent(int skill_id){
			parent_skill = skill_id;
		}
		
		public int get_parent(){
			return parent_skill;
		}
		
		public void set_name(String s){
			name = s;
		}
		
		public String get_name(){
			return name;
		}
		
		public void add_action(CharAction new_act,int bonus_requirement){//default 0
			//actions[actions.length] = new_act;
            //act_bonus_req[act_bonus_req.length] = bonus_requirement;
            actions.set(actions.size(), new_act);
			act_bonus_req.set(act_bonus_req.size(), bonus_requirement);
		}
		
		public void add_attack(CharAction new_atk,int bonus_req){//def 0
			//attacks[attacks.length] = new_atk;
            //atk_bonus_req[atk_bonus_req.length] = bonus_req;
            attacks.set(attacks.size(), new_atk);
			atk_bonus_req.set(atk_bonus_req.size(), bonus_req);
		}
		
		public ArrayList<CharAction>  get_actions(int char_bonus){
			ArrayList<CharAction> ret = new ArrayList<CharAction>();
			int i = 0;
			for(i=0;i<actions.size();i++){//.length
                //if(char_bonus >= act_bonus_req[i] && actions[i] != null)ret[ret.length] = actions[i];
                if(char_bonus >= act_bonus_req.get(i) && actions.get(i) != null)ret.set(ret.size(), actions.get(i));
			}
			return ret;
		}
		
		public ArrayList<CharAction>  get_attacks(int char_bonus){
			ArrayList<CharAction>  ret = new ArrayList<CharAction>();
			int i = 0;
			for(i=0;i<attacks.size();i++){//.length
                //if(char_bonus >= atk_bonus_req[i] && attacks[i] != null)ret[ret.length] = attacks[i];
                if(char_bonus >= atk_bonus_req.get(i) && attacks.get(i) != null)ret.set(ret.size(), attacks.get(i));
			}
			return ret;
		}
		
		public void add_stat_component(int stat_id,int ratio){//def ratio = 1
			//stat_list[stat_list.length] = stat_id;
            //stat_ratio_list[stat_ratio_list.length] = ratio;
            stat_list.set(stat_list.size(), stat_id);
			stat_ratio_list.set(stat_ratio_list.size(), ratio);
		}
        
}
