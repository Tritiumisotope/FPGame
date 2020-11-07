package fpgamegithubredux;

public class Mob {
    
		public Trait[] ideals;
		public Area[] controlled_areas;
		public Character[] members;
		//public var economy:Economy;
		public Mob[] allied_mobs;
		public Mob[] enemy_mobs;
		
		//public var topics:Array;

		public Mob(){
			// constructor code
			//ideals = new Array();
			controlled_areas = null;
			allied_mobs = null;
			enemy_mobs = null;
			//topics = new Array();
			members = null;
		}
		
		public void add_member(Character c){
			members[members.length] = c;
		}
        
        
		public void new_ideal(Trait t){
			ideals[ideals.length] = t;
		}
		
		public void new_ally(Mob m){
			allied_mobs[allied_mobs.length] = m;
		}
		
		public void new_enemy(Mob m){
			enemy_mobs[enemy_mobs.length] = m;
		}
		/*
		public void new_topic(Conversation_topic ct){
			topics[topics.length] = ct;
		}
        */
        /*
		public Array get_topics(Character c){
			
			return topics;
        }
        */
		
		public void initialize_mob(){
			int i = 0;
			for(i=0;i<members.length;i++){
				if(members[i].location == null){
					//members = members.slice(0,i).concat(members.slice(i+1,members.length));
					i--;
				}else{
					int j = i+1;
					for(j=i+1;j<members.length;j++){
						if(members[j].location == null){
							//members = members.slice(0,j).concat(members.slice(j+1,members.length));
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
