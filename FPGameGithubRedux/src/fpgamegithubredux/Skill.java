package fpgamegithubredux;

import java.util.ArrayList;

public class Skill {
    		
		public int parent_skill;
		public int id;
		public String name;
		
		public ArrayList<Integer> stat_list;//public var stat_list:Array
		public ArrayList<Integer> stat_ratio_list;//public var stat_ratio_list:Array
		
		public ArrayList<CharAction> actions;//public var actions:Array
		public ArrayList<Integer> act_bonus_req;//public var act_bonus_req:Array
		
		public ArrayList<CharAction> attacks;//public var attacks:Array
		public ArrayList<Integer> atk_bonus_req;//public var atk_bonus_req:Array
		
		public  Skill() {
            // constructor code
            
			stat_list = new ArrayList<>();
			stat_ratio_list = new ArrayList<>();
			parent_skill = -1;
			actions = new ArrayList<>();
			act_bonus_req = new ArrayList<>();
			attacks = new ArrayList<>();
            atk_bonus_req = new ArrayList<>();
            
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
		public void add_action(CharAction new_act){
			add_action(new_act,0);
		}
		public void add_action(CharAction new_act,int bonus_requirement){//default 0
            actions.add(new_act);//actions[actions.length] = new_act
			act_bonus_req.add(bonus_requirement);//act_bonus_req[act_bonus_req.length] = bonus_requirement
		}
		public void add_attack(CharAction new_atk){
			add_attack(new_atk,0);
		}
		public void add_attack(CharAction new_atk,int bonus_req){//def 0
            attacks.add(new_atk);//attacks[attacks.length] = new_atk
			atk_bonus_req.add(bonus_req);//atk_bonus_req[atk_bonus_req.length] = bonus_req
		}
		
		public ArrayList<CharAction>  get_actions(int char_bonus){
			ArrayList<CharAction> ret = new ArrayList<CharAction>();
			int i = 0;
			for(i=0;i<actions.size();i++){//.length
                //REPLACED BELOW//if(char_bonus >= act_bonus_req[i] && actions[i] != null)ret[ret.length] = actions[i]
                if(char_bonus >= act_bonus_req.get(i) && actions.get(i) != null)ret.add(actions.get(i));
			}
			return ret;
		}
		
		public ArrayList<CharAction>  get_attacks(int char_bonus){
			ArrayList<CharAction>  ret = new ArrayList<CharAction>();
			int i = 0;
			for(i=0;i<attacks.size();i++){//.length
                //REPLACED BELOW//if(char_bonus >= atk_bonus_req[i] && attacks[i] != null)ret[ret.length] = attacks[i]
                if(char_bonus >= atk_bonus_req.get(i) && attacks.get(i) != null)ret.add(attacks.get(i));
			}
			return ret;
		}
		public void add_stat_component(int stat_id){
			add_stat_component(stat_id,1);
		}
		public void add_stat_component(int stat_id,int ratio){//def ratio = 1
            stat_list.add(stat_id);//stat_list[stat_list.length] = stat_id
			stat_ratio_list.add(ratio);//stat_ratio_list[stat_ratio_list.length] = ratio
		}
        
}
