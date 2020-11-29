package fpgamegithubredux;

import java.util.ArrayList;

public class Skill {
    		
		public int parent_skill;
		public int id;
		public String name;
		
		public ArrayList<Integer> stat_list;//public var stat_list:Array
		public ArrayList<Integer> stat_ratio_list;//public var stat_ratio_list:Array
		
		public ArrayList<CharAction> actions;//public var actions:Array
		protected ArrayList<Integer> actBonusReq;//public var act_bonus_req:Array
		
		public ArrayList<CharAction> attacks;//public var attacks:Array
		protected ArrayList<Integer> atkBonusReq;//public var atk_bonus_req:Array
		
		public  Skill() {
            // constructor code
            
			stat_list = new ArrayList<>();
			stat_ratio_list = new ArrayList<>();
			parent_skill = -1;
			actions = new ArrayList<>();
			actBonusReq = new ArrayList<>();
			attacks = new ArrayList<>();
            atkBonusReq = new ArrayList<>();
            
		}
		
		public void set_id(int i){
			id = i;
		}
		
		public int get_id(){
			return id;
		}
		
		public void set_parent(int skillID){
			parent_skill = skillID;
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
		public void add_action(CharAction newAct){
			add_action(newAct,0);
		}
		public void add_action(CharAction newAct,int bonusRequirement){//default 0
            actions.add(newAct);//actions[actions.length] = new_act
			actBonusReq.add(bonusRequirement);//act_bonus_req[act_bonus_req.length] = bonus_requirement
		}
		public void add_attack(CharAction newAtk){
			add_attack(newAtk,0);
		}
		public void add_attack(CharAction newAtk,int bonusReq){//def 0
            attacks.add(newAtk);//attacks[attacks.length] = new_atk
			atkBonusReq.add(bonusReq);//atk_bonus_req[atk_bonus_req.length] = bonus_req
		}
		
		public ArrayList<CharAction> get_actions(int charBonus){
			ArrayList<CharAction> ret = new ArrayList<>();
			int i = 0;
			for(i=0;i<actions.size();i++){//.length
                if(charBonus >= actBonusReq.get(i) && actions.get(i) != null)ret.add(actions.get(i));//(char_bonus >= act_bonus_req[i] && actions[i] != null)ret[ret.length] = actions[i]
			}
			return ret;
		}
		
		public ArrayList<CharAction> get_attacks(int charBonus){
			ArrayList<CharAction> ret = new ArrayList<>();
			int i = 0;
			for(i=0;i<attacks.size();i++){//.length
                if(charBonus >= atkBonusReq.get(i) && attacks.get(i) != null)ret.add(attacks.get(i));//(char_bonus >= atk_bonus_req[i] && attacks[i] != null)ret[ret.length] = attacks[i]
			}
			return ret;
		}
		public void add_stat_component(int statID){
			add_stat_component(statID,1);
		}
		public void add_stat_component(int statID,int ratio){//def ratio = 1
            stat_list.add(statID);//stat_list[stat_list.length] = stat_id
			stat_ratio_list.add(ratio);//stat_ratio_list[stat_ratio_list.length] = ratio
		}
        
}
