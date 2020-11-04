package fpgamegithubredux;

import java.util.ArrayList;

public class Mob {
    
		public ArrayList<Trait> ideals;//public Trait[] ideals;
		public ArrayList<Area> controlled_areas;
		public ArrayList<Character> members;//Character[] members
		//public var economy:Economy;
		public ArrayList<Mob> allied_mobs;
		public ArrayList<Mob> enemy_mobs;
		
		public ArrayList<Conversation_topic> topics;//public var topics:Array

		public Mob(){
			// constructor code
			ideals = new ArrayList<>();//ideals = new Array()
			controlled_areas = new ArrayList<>();
			allied_mobs = new ArrayList<>();
			enemy_mobs = new ArrayList<>();
			topics = new ArrayList<>();//topics = new Array()
			members = new ArrayList<>();
		}
		
		public void add_member(Character c){
			//members[members.length] = c;
			members.add(c);
		}
        
        
		public void new_ideal(Trait t){
			//ideals[ideals.length] = t;
			ideals.add(t);
		}
		
		public void new_ally(Mob m){
			//allied_mobs[allied_mobs.length] = m;
			allied_mobs.add(m);
		}
		
		public void new_enemy(Mob m){
			//enemy_mobs[enemy_mobs.length] = m;
			enemy_mobs.add(m);
		}
		
		public void new_topic(Conversation_topic ct){
			//topics[topics.length] = ct;
			topics.add(ct);
		}
        
        
		public ArrayList<Conversation_topic> get_topics(Character c){
			
			return topics;
        }
        
		
		public void initialize_mob(){
			int i = 0;
			for(i=0;i<members.size();i++){
				if(members.get(i).location == null){
					//members = members.slice(0,i).concat(members.slice(i+1,members.length));
					members.remove(i);
					i--;
				}else{
					int j = i+1;
					for(j=i+1;j<members.size();j++){
						if(members.get(j).location == null){
							//members = members.slice(0,j).concat(members.slice(j+1,members.length));
							members.remove(j);//TODO verify
							j--;
						}else if(Math.random() >= 0.5){
							//members[i].personality.new_relationship(members[j], members[i], Relationship.initial_reaction_change, Math.random()*20);
							//members[j].personality.new_relationship(members[i], members[j], Relationship.initial_reaction_change, Math.random()*20);
						}
					}
				}
			}
		}
}
