package fpgamegithubredux;

import java.util.ArrayList;

public class Trait {
    
		protected static final int attracted = 0;
		protected static final int disgusted = 1;
		
		protected Race racial_trait;
		protected int part_trait;
		
		protected int stat_trait;
		protected Number stat_amt;
		protected Boolean abv_or_blw;
		protected int trait_strength;
		
		protected int attraction_check;
		
		protected ArrayList<Integer> damage_type_strengths;
		protected ArrayList<Integer> damage_type_weaknesses;
		
		public Trait() {
			// constructor code
			racial_trait = null;
			part_trait = -1;
			
			stat_trait = -1;
			stat_amt = 0;
			abv_or_blw = true;//Above the stat amt
			trait_strength = 1;
			
			attraction_check = -1;
			
			damage_type_strengths = new ArrayList<>();// new Array()
			damage_type_weaknesses = new ArrayList<>();//new Array()
		}
		
		public void set_trait_strength(int i){
			trait_strength = i;
		}
		
		public void set_attraction_check(int attractionCheckType){
			attraction_check = attractionCheckType;
		}
		
		public void set_part_id(int id){
			part_trait = id;
		}
		public void set_stat_trait(int statID){
			set_stat_trait(statID,0,true);
		}
		public void set_stat_trait(int statID,Number compareAmt){
			set_stat_trait(statID,compareAmt,true);
		}
		public void set_stat_trait(int statID,Number compareAmt, Boolean aob){//default 0, true
			stat_trait = statID;
			stat_amt = compareAmt;
			abv_or_blw = aob;
		}
		
		public void set_racial_trait(Race r){
			racial_trait = r;
		}
		
		public Boolean has_trait(Character c,Character cSelf){
			Boolean ret= false;
			
			if(c != null){
				if(part_trait > -1){
					if(c.body.has_part(part_trait))ret = true;
				}
				if(racial_trait != null){
					if(c.get_primary_race().getName().equals(racial_trait.getName()))ret = true;
				}
				if(stat_trait > -1){
					if(stat_amt.intValue() != 0 && (c.get_stat(stat_trait).doubleValue() >= stat_amt.doubleValue() && abv_or_blw) || (c.get_stat(stat_trait).doubleValue() <= stat_amt.doubleValue() && !abv_or_blw))ret = true;
				}else if(stat_amt.intValue() == -1 &&(c.get_stat(stat_trait).doubleValue() >= cSelf.get_stat(stat_trait).doubleValue() && abv_or_blw) || (c.get_stat(stat_trait).doubleValue() <= cSelf.get_stat(stat_trait).doubleValue() && !abv_or_blw)){
					ret = true;
				}
			}			
			
			return ret;
		}
		
		public Number reaction_mod(Character c, int quant, Character cSelf){//was number
			int ret = 0;//was number
			if(abv_or_blw){
				if(quant >= stat_amt.intValue()){
					ret += (quant - stat_amt.intValue()) * trait_strength;
				}
			}else{
				if(quant <= stat_amt.intValue()){
					ret += (stat_amt.intValue() - quant) * trait_strength;
				}
			}
			
			if(attraction_check == attracted){
				if(c != cSelf && !(cSelf.personality.determine_attraction(c, cSelf) > 5 || cSelf.personality.check_relationship(c,cSelf) > Personality.friends)){
					ret = 0;
				}
			}else if(attraction_check == disgusted){
				if(c == cSelf || (cSelf.personality.determine_attraction(c, cSelf) > 5 || cSelf.personality.check_relationship(c,cSelf) > Personality.friends)){
					ret = 0;
				}
			}
			
			return ret;
		}
		
		public void add_damage_resistance(int id){
			damage_type_strengths.add(id); //damage_type_strengths[damage_type_strengths.length] = id
		}
		
		public void add_damage_weakness(int id){
			damage_type_weaknesses.add(id); //damage_type_weaknesses[damage_type_weaknesses.length] = id
		}
}
