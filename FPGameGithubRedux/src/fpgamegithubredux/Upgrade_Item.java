package fpgamegithubredux;

import java.util.ArrayList;

public class Upgrade_Item extends Item {
        public static final int upgrade_grip = 0;
		public static final int upgrade_tip = 1;
		public static final int upgrade_blade = 2;
		public static final int upgrade_lining = 3;
		public static final int upgrade_plates = 4;
		
		public int upgrade_type_id;		
		public ArrayList<Integer> skill_id;//public var skill_id:Array
		public ArrayList<Integer> skill_bonus;//public var skill_bonus:Array
        public Upgrade_Item(){
            new Upgrade_Item("");
        }
		public Upgrade_Item(String n) {
			// constructor code
			setName(n);
			upgrade_type_id = -1;
			skill_id = new ArrayList<>();
			skill_bonus = new ArrayList<>();
		}
		
		public void set_upgrade_type(int id){
			upgrade_type_id = id;
		}
		
		public void set_skill_bonus(int id,int bonus){
            skill_id.add(skill_id.size(),id);//skill_id[skill_id.length] = id
			skill_bonus.add(skill_bonus.size(),bonus);//skill_bonus[skill_bonus.length] = bonus
        } 
        @Override
        public Item copyItem(){
			Upgrade_Item i = new Upgrade_Item();
			i.name = this.name;
			i.inventoryDescription = inventoryDescription;
			i.droppedDescription = this.droppedDescription;
			i.multiDroppedDescription = this.multiDroppedDescription;
			i.value = this.value;
			int count = 0;
			for(count=0;count<effects.size();count++){

				i.effects.set(count, this.effects.get(count));//i.effects[count] = this.effects[count]
			}
			i.useDescription = this.useDescription;
			for(count=0;count<changeEffects.size();count++){
				
				i.changeEffects.set(count, this.changeEffects.get(count));//i.changeEffects[count] = this.changeEffects[count]
			}
			i.propogate = this.propogate;
			i.identDifficulty = this.identDifficulty;
			i.weight = this.weight;
			for(count=0;count < statActionAdd.size();count++){

				i.statActionAdd.set(count, this.statActionAdd.get(count));//i.statActionAdd[count] = this.statActionAdd[count]
			}
			i.numUses = this.numUses;
			i.imageID = this.imageID;
            i.topic = this.topic;
			i.craftingRequirements = this.craftingRequirements;
			
			i.tickCount = 0;
			i.destroyTick = this.destroyTick;
			i.spawnChar = this.spawnChar;
			
			i.upgrade_type_id = this.upgrade_type_id;
			for(count=0;count<skill_id.size();count++){//.length
                i.skill_id.set(count, this.skill_id.get(count));//i.skill_id[count] = this.skill_id[count]
			}
			for(count=0;count<skill_bonus.size();count++){//.length
                i.skill_bonus.set(count,this.skill_bonus.get(count));//i.skill_bonus[count] = this.skill_bonus[count]
			}
			
			return i;
        }
        
}
