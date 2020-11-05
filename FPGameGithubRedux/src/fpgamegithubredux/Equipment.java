package fpgamegithubredux;

import java.util.ArrayList;

public class Equipment extends Item {
    
        public static final int hide_part = -2;
        
		
		public ArrayList<Integer> equips_on;//public var equips_on:Array
		public ArrayList<Integer> equips_on_num;//public var equips_on_num:Array

		public ArrayList<Integer> covers;//public var covers:Array
		public ArrayList<String> covers_desc;//public var covers_desc:Array
		public ArrayList<Integer> cover_stat;//public var cover_stat:Array
		public ArrayList<Integer> cover_min;//public var cover_min:Array
		public ArrayList<Integer> stat_req;//public var stat_req:Array
		public ArrayList<Integer> stat_min;//public var stat_min:Array
		public ArrayList<Integer> stat_max;//public var stat_max:Array
		public ArrayList<Integer> cover_num;//public var cover_num:Array
		public ArrayList<Integer> covered_perception_difficulty;//public var covered_perception_difficulty:Array

		public Boolean _show_other_cover;

		public ArrayList<Integer> skill_id;//public var skill_id:Array
		public ArrayList<Integer> skill_bonus;//public var skill_bonus:Array

		protected int[] cover_parts;//public var cover_parts:Array
		protected int[] cover_parts_images;//public var cover_parts_images:Array
        
		public int enchantment_level;
		
		public ArrayList<Integer> damage_type_strengths;//public var damage_type_strengths:Array
		public ArrayList<Integer> damage_type_weaknesses;//public var damage_type_weaknesses:Array

		public ArrayList<Integer> upgrade_slot_ids;//public var upgrade_slot_ids:Array


		public ArrayList<Object> remove_consequence;//public var remove_consequence:Array

		public ArrayList<Upgrade_Item> upgrade_items;//public var upgrade_items:Array
        
        public Equipment(){
            new Equipment(null);
        }
		public Equipment(String n){//default null
			// constructor code
			super(n);
            numUses = -1;
            
			equips_on = new ArrayList<>();
			equips_on_num = new ArrayList<>();
			
			covers = new ArrayList<>();
			covers_desc = new ArrayList<>();
			stat_req = new ArrayList<>();
			stat_min = new ArrayList<>();
			stat_max = new ArrayList<>();
			cover_min = new ArrayList<>();
			cover_stat = new ArrayList<>();
			cover_num = new ArrayList<>();
            covered_perception_difficulty = new ArrayList<>();
            
			_show_other_cover = false;
            
            
			skill_id = new ArrayList<>();
			skill_bonus = new ArrayList<>();
			
			//cover_parts = new ArrayList<>()
			//cover_parts_images = new ArrayList<>()
            
            
			enchantment_level = 0;
            
            
			damage_type_strengths = new ArrayList<>();
			damage_type_weaknesses = new ArrayList<>();
			
			upgrade_slot_ids = new ArrayList<>();
			upgrade_items = new ArrayList<>();
			
            remove_consequence = new ArrayList<>();
            
		}
		
		public String attach_upgrade_item(Upgrade_Item ui, Character c){
			String ret = "";
			int i = 0;
			for(i=0;i<upgrade_slot_ids.size();i++){
				if(upgrade_slot_ids.get(i) == ui.upgrade_type_id && upgrade_items.get(i)== null){
					ret += "</n> attaches the " + ui.getName() + " to the " + getName()+". \n";
					upgrade_items.set(i,ui);
					//c.drop_item(ui);
					//TODO
					int effect_count = 0;
					for(effect_count=0;effect_count<ui.effects.size();effect_count++){
						if(ui.effects.get(effect_count) != null){
							add_effect(effect_count, ui.effects.get(effect_count));
						}
					}
					effect_count = 0;
					for(effect_count=0;effect_count<ui.skill_id.size();effect_count++){
						set_skill_bonus(ui.skill_id.get(effect_count),ui.skill_bonus.get(effect_count));
					}
				}
			}
			if(ret.equals("")) ret = "You can't attach the " + ui.getName() + " to that. \n";
			return ret;
		}
		public void add_upgrade_slot(int id){
			//upgrade_slot_ids[upgrade_slot_ids.length] = id
			upgrade_slot_ids.set(upgrade_slot_ids.size(), id);
		}
		
		public void add_damage_resistance(int id){
			//damage_type_strengths[damage_type_strengths.length] = id
			damage_type_strengths.set(damage_type_strengths.size(), id);
		}
		
		public void add_damage_weakness(int id){
			//damage_type_weaknesses[damage_type_weaknesses.length] = id
			damage_type_weaknesses.set(damage_type_weaknesses.size(), id);
		}
		
		public Number get_damage_mod(int id){
			Number ret = 1;
			int i = 0;
			for(i=0;i<damage_type_strengths.size();i++){
				if(damage_type_strengths.get(i) == id) ret = ret.doubleValue()/2;
			}
			for(i=0;i<damage_type_weaknesses.size();i++){
				if(damage_type_weaknesses.get(i) == id) ret = ret.doubleValue()*2;
			}
			return ret;
		}
		
		public int get_enchantment_level(){
			return enchantment_level;
		}
		
		public void set_enchantment_level(int i){
			enchantment_level = i;
		}
		
		public void new_cover_image(int part_id, int image_id){
			cover_parts[cover_parts.length] = part_id;
			cover_parts_images[cover_parts_images.length] = image_id;
		}
		
		
		public int get_part_image(int part_id){
			int ret = -1;
			int i = 0;
			for(i=0;i<cover_parts.length;i++){
				if(cover_parts[i] == part_id){
					ret = cover_parts_images[i];
					break;
				}
			}
			
			return ret;
		}
		
		public void set_skill_bonus(int id,int bonus){
			//skill_id[skill_id.length] = id
			skill_id.set(skill_id.size(), id);
			//skill_bonus[skill_bonus.length] = bonus
			skill_bonus.set(skill_bonus.size(), bonus);
		}
		
		public void set_show_other_cover(){
			_show_other_cover = !_show_other_cover;
		}
		
		public Boolean show_other_cover(){
			return _show_other_cover;
		}
		
		public void new_equip_slot(int i){
			new_equip_slot(i, 0);
		}
		public void new_equip_slot(int i,int num_slots){//default num_slots 0
			//equips_on[equips_on.length] = i
			equips_on.set(equips_on.size(), i);
			//equips_on_num[equips_on_num.length] = num_slots
			equips_on_num.set(equips_on_num.size(), num_slots);
		}
		
		public int get_max_equip_slot(int equip_on_id){
			return equips_on_num.get(equip_on_id);//[]
		}
		
		public int get_max_cover_slot(int covers_part_id){
			//return cover_num[covers_part_id]
			return cover_num.get(covers_part_id);
		}
		public void new_cover_slot(int i){
			new_cover_slot(i,"",-1,0,0,0);
		}
		public void new_cover_slot(int i,String s){
			new_cover_slot(i,s,-1,0,0,0);
		}
		public void new_cover_slot(int i,String s,int c){
			new_cover_slot(i,s,c,0,0,0);
		}
		public void new_cover_slot(int i,String s,int c,int min){
			new_cover_slot(i,s,c,min,0,0);
		}
		public void new_cover_slot(int i,String s,int c,int min, int cover_nm){
			new_cover_slot(i,s,c,min,cover_nm,0);
		}
		public void new_cover_slot(int i,String s,int c,int min, int cover_nm,int perception_difficulty){
			//default s="", -1, 0, 0, 0, 0
			covers.set(covers.size(), i);//covers[covers.length] = i
			covers_desc.set(covers_desc.size(), s);//covers_desc[covers_desc.length] = s
			cover_min.set(cover_min.size(), min);//cover_min[cover_min.length] = min
			cover_stat.set(cover_stat.size(), c);//cover_stat[cover_stat.length] = c
			cover_num.set(cover_num.size(),cover_nm);//cover_num[cover_num.length] = cover_nm
			covered_perception_difficulty.set(covered_perception_difficulty.size(), perception_difficulty);//covered_perception_difficulty[covered_perception_difficulty.length] = perception_difficulty
		}
		
		public ArrayList<Integer> get_equip_slots(){
			return equips_on;
		}
		
		public ArrayList<Integer> get_cover_slots(){
			//need to return the slots covered as distinct....
			ArrayList<Integer> temp = covers;
			int i = 0;
			for(i=0;i<temp.size();i++){
				for(int j=i+1;j<temp.size();j++){
					//if(temp.get(j) == temp.get(i)) temp = temp.slice(0,j).concat(temp.slice(j+1,temp.length))
					if(temp.get(j).equals(temp.get(i))) temp.remove(j);
				}
			}
			
			return temp;
		}
		
		public void set_equip_condition(int stat_id,int max){
			set_equip_condition(stat_id, max, -1);
		}
		public void set_equip_condition(int stat_id,int max,int min){//dedault min -1
			//stat_req[stat_req.length] = stat_id
			//stat_min[stat_min.length] = min
			//stat_max[stat_max.length] = max
			stat_req.set(stat_req.size(), stat_id);
			stat_min.set(stat_min.size(), min);
			stat_max.set(stat_max.size(), max);

		}
		
		public void add_remove_consequence(Consequence c){
			//remove_consequence[remove_consequence.length] = c
			remove_consequence.set(remove_consequence.size(), c);
		}
		
		public void add_remove_action(CharAction a){
			//remove_consequence[remove_consequence.length] = a
			remove_consequence.set(remove_consequence.size(), a);
			//TODO explain why consequence
		}
		public String remove_effects(Character c){
			return remove_effects(c,false);
		}
		public String remove_effects(Character c,Boolean effects_only){//default false
			String s = "";
			int i = 0;
			/*
			for(i=0;i<effects.size();i++){
				if(effects.get(i) != null)s += c.apply_equip_affect_by_id(i, -effects.get(i));//c.apply_affect_by_id(i,-effects[i],0,null, Body.change_stats_total);
			}
			*/
			/*
			for(i=0;i<skill_id.size();i++){
				if(skill_bonus.get(i) != 0)s += c.set_skill_bonus(skill_id.get(i), -skill_bonus.get(i));
			}
			*/
			if(!effects_only){
				/*TODO
				if(statActionAdd.size() > 0){
					i = 0;
					for(i=0;i<Math.ceil(statActionAdd.size()/2);i++){
						c.remove_stat_action(statActionAdd.get(i*2), statActionAdd.get(i*2+1));
					}
				}
				*/
				for (i=0;i<remove_consequence.size();i++){
					if (remove_consequence.get(i) != null){
						if(remove_consequence.get(i) instanceof Consequence){
							Consequence temp = (Consequence)remove_consequence.get(i);
							//s += remove_consequence.get(i).trigger(0, c)
							s += temp.trigger(0, c);
						}else{
							//s += remove_consequence.get(i).challenge(0,c)
							CharAction temp = (CharAction)remove_consequence.get(i);
							s += temp.challenge(0,c);
						}
					}
				}
			}
			return s;
		}
		
		public String equip_effects(Character c){
			return equip_effects(c,false);
		}

		public String equip_effects(Character c,Boolean effects_only){//default false
			String s = "";
			int i = 0;
			if(!effects_only){
				for (i=0;i<changeEffects.size();i++){
					if (changeEffects.get(i) != null){
						if(changeEffects.get(i) instanceof Consequence){
							Consequence temp = (Consequence)changeEffects.get(i);
							//s += changeEffects.get(i).trigger(0, c)
							s += temp.trigger(0, c);
						}else{
							CharAction temp = (CharAction)changeEffects.get(i);
							//s += changeEffects.get(i).challenge(0,c)
							s += temp.challenge(0,c);
						}
					}
				}
				/*TODO add_stat_action Character
				if(statActionAdd.size() > 0){
					i = 0;
					for(i=0;i<Math.ceil(statActionAdd.size()/2);i++){
						c.add_stat_action(statActionAdd.get(i*2), statActionAdd.get(i*2+1));
					}
				}
				*/
			}
			/*TODO
			for(i=0;i<effects.size();i++){
				if(effects.get(i) != null)s += c.apply_equip_affect_by_id(i, effects.get(i));
			}
			*//*TODO
			for(i=0;i<skill_id.size();i++){
				if(skill_bonus.get(i) != 0)s += c.set_skill_bonus(skill_id.get(i), skill_bonus.get(i));
			}
			*/
			return s;
		}
		
		public int covered_difficulty(Character c,int id, BodyPart bp){
			int ret = 1;
			int i = 0;
			for (i=0;i<covers.size();i++){
				if(covers.get(i) == id && (cover_stat.get(i) == -1 || bp.get_stat(c, cover_stat.get(i)).intValue() >= cover_min.get(i))){
					ret += covered_perception_difficulty.get(i);
				}
			}
			return ret;
		}
		/*
		public function covered_description(c:Character, id:int,bp:Body_part):String{
			var s:String = "";
			var i:int = 0;
			for (i;i<covers.length;i++){
				if(covers[i] == id && (cover_stat[i] == -1 || bp.get_stat(c, cover_stat[i]) >= cover_min[i])){
					s = covers_desc[i];
				}
			}
			
			var j:int = 0;
			for (j;j<bp.stat_id.length;j++){
				if(bp.stat_description[j] != null){
					s = s.replace("</" + bp.stat_id[j] + ">",String(bp.get_stat(c, bp.stat_id[j]).toFixed(bp.stat_description[j].show_decimals)));
					s = s.replace("<sd/" + bp.stat_id[j] + ">",bp.stat_description[j].get_short_description(bp.get_stat(c, bp.stat_id[j])));
				}
			}
			
			return s;					
		}
		
		@Override 
		public function getDescription(c:Character, ident_effectiveness:Array = null, keep_tags:Boolean = false):String{
			var ret:String = super.get_description(c, ident_effectiveness, keep_tags);
			var ident_chance:Number = 0;
			if(ident_effectiveness != null){
				ident_chance = ident_effectiveness[0]/ident_difficulty;
			}
			
			var count:int = 0;
			var showing:Boolean = false;
			if(stat_req.length > 0){
				for(count;count < stat_req.length;count ++){
					var l_string:String = FPalace_helper.get_stat_name_by_id(stat_req[count]);
					if(l_string != "?" && Math.random() <= ident_chance){
						if(!showing){
							showing = true;
							ret += "\nRequires the following skills:\n";
						}
						
						if(stat_min[count] > 0){
							ret += "Between " + stat_min[count] + " and " + stat_max[count] + " " + l_string + "\n"
						}else{
							ret += "Under " + stat_max[count] + " " + l_string + "\n"
						}
					}
				}
			}
			
			showing = false;
			count = 0;
			if(skill_id.length > 0){
				for(count;count < skill_id.length;count ++){
					if(Math.random() <= ident_chance){
						if(!showing){
							showing = true;
							ret += "\nImpacts skills:\n";
						}
						ret += FPalace_skills.get_skill_name(skill_id[count]) + "\n"
					}
				}
			}
			
			showing = false;
			count = 0;
			if(damage_type_strengths.length > 0){
				for(count;count < damage_type_strengths.length;count ++){
					if(Math.random() <= ident_chance){
						if(!showing){
							showing = true;
							ret += "\nProtects against:\n";
						}
						ret += FPalace_helper.get_type_name_by_id(damage_type_strengths[count]) + "\n"
					}
				}
			}
			
			showing = false;
			count = 0;
			if(damage_type_weaknesses.length > 0){
				for(count;count < damage_type_weaknesses.length;count ++){
					if(Math.random() <= ident_chance){
						if(!showing){
							showing = true;
							ret += "\nWeak against:\n";
						}
						ret += FPalace_helper.get_type_name_by_id(damage_type_weaknesses[count]) + "\n"
					}
				}
			}
			
			return ret;
		}
		
		override public function same_item(i:Item):Boolean{
			var ret:Boolean = super.same_item(i);
			
			if(ret && i is Equipment){
				var temp:Equipment = i as Equipment;
				
				if(temp.equips_on.toString() == equips_on.toString() && temp.equips_on_num.toString() == equips_on_num.toString()
				    && temp.covers.toString() == covers.toString() && temp.covers_desc.toString() == covers_desc.toString() 
					&& temp.cover_stat.toString() == cover_stat.toString() && temp.cover_min.toString() == cover_min.toString() 
					&& temp.stat_req.toString() == stat_req.toString() && temp.stat_min.toString() == stat_min.toString() 
					&& temp.stat_max.toString() == stat_max.toString() && temp.cover_num.toString() == cover_num.toString()
					&& temp.covered_perception_difficulty.toString() == covered_perception_difficulty.toString()
					&& temp._show_other_cover == _show_other_cover && temp.skill_id.toString() == skill_id.toString()
					&& temp.skill_bonus.toString() == skill_bonus.toString() && temp.cover_parts.toString() == cover_parts.toString()
					&& temp.cover_parts_images.toString() == cover_parts_images.toString() && temp.enchantment_level == enchantment_level					
					&& temp.damage_type_strengths.toString() == damage_type_strengths.toString()
					&& temp.damage_type_weaknesses.toString() == damage_type_weaknesses.toString()){
						ret = true;
					}else{
						ret = false;
					}
			}else{
				ret = false;
			}
			
			return ret;			
		}
		
		@Override 
		public Item copyItem(){
			var temp:Equipment = new Equipment();
			temp.name = this.name;
			temp.dropped_description = this.dropped_description;
			temp.value = this.value;
			var count:int = 0;
			for(count;count<effects.length;count++){
				temp.effects[count] = this.effects[count];
			}
			temp.use_description = this.use_description;
			count = 0;
			for(count;count<changeEffects.length;count++){
				temp.changeEffects[count] = this.changeEffects[count];
			}
			temp.equips_on = this.equips_on;
			temp.equips_on_num = this.equips_on_num;
			temp.propogate = this.propogate;
			temp.inventory_description = inventory_description;
			temp.ident_difficulty = this.ident_difficulty;
			temp.weight = this.weight;
			temp.num_uses = this.num_uses;
			count = 0;
			for(count;count < statActionAdd.size();count++){
				temp.statActionAdd[count] = this.statActionAdd[count];
			}
			
			temp.covers = this.covers
			
			var i:int = 0;
			for(i;i<this.covers_desc.length;i++){
				temp.covers_desc[i] = this.covers_desc[i];
			}
			i = 0;
			for(i;i<this.cover_stat.length;i++){
				temp.cover_stat[i] = this.cover_stat[i];
			}
			i = 0;
			for(i;i<this.cover_min.length;i++){
				temp.cover_min[i] = this.cover_min[i];
			}
			i = 0;
			for(i;i<this.stat_req.length;i++){
				temp.stat_req[i] = this.stat_req[i];
			}
			i = 0;
			for(i;i<this.stat_min.length;i++){
				temp.stat_min[i] = this.stat_min[i];
			}
			i = 0;
			for(i;i<this.stat_max.length;i++){
				temp.stat_max[i] = this.stat_max[i];
			}
			
			i = 0;
			for(i;i<this.covered_perception_difficulty.length;i++){
				temp.covered_perception_difficulty[i] = this.covered_perception_difficulty[i];
			}
			
			count = 0;
			for(count;count<skill_id.length;count++){
				temp.skill_id[count] = this.skill_id[count];
			}
			count = 0;
			for(count;count<skill_bonus.length;count++){
				temp.skill_bonus[count] = this.skill_bonus[count];
			}
			
			temp.cover_num = this.cover_num;
			temp.image_id = this.image_id;
			
			temp.cover_parts = this.cover_parts;
			temp.cover_parts_images = this.cover_parts_images;
			
			temp.enchantment_level = this.enchantment_level;
			temp._show_other_cover = this._show_other_cover;
			
			temp.damage_type_strengths = this.damage_type_strengths;
			temp.damage_type_weaknesses = this.damage_type_weaknesses;
			
			temp.topic = this.topic;
			
			temp.crafting_requirements = this.crafting_requirements;
			
			temp.upgrade_slot_ids = upgrade_slot_ids;
			temp.upgrade_items = new Array();
			
			count = 0;
			for(count;count<remove_consequence.length;count++){
				temp.remove_consequence[count] = this.remove_consequence[count];
			}
			
			temp.tick_count = 0;
			temp.destroy_tick = this.destroy_tick;
			temp.spawn_char = this.spawn_char;
			
			return temp;
        }
        */

}
