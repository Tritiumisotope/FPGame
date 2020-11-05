package fpgamegithubredux;

import java.util.ArrayList;

public class Personality {
    

		public static final int hate = -1;
		public static final int dislike = 0;
		public static final int tolerate = 5;
		public static final int like = 10;
		public static final int really_like = 20;
		public static final int friends = 40;
		public static final int true_love = 80;
		
        public ArrayList<Trait> likes;
        
        public ArrayList<Trait> dislikes;
        
		//needs/goals
		public ArrayList<Quest> objectives;//:Array
		public ArrayList<ArrayList<Integer>> curr_obj_step;//public var curr_obj_step:Array
        //public var curr_obj_start_tick:Array
        
		//mood
			//sadness, anger, contempt, disgust, surprise, fear, and happiness
		//sanity
		//diet
        //sexual orientation
        
		public ArrayList<Trait> attraction_traits;
        public ArrayList<Trait> disgust_traits;
        
		
		//memory
		//public var memory_action_names:Array;
		//public var memory_action_vals:Array;
		
        public ArrayList<Conversation_topic> topics;//things known about

        public ArrayList<Relationship> relationships;//public var relationships:Array;//people known

		public ArrayList<Mob> mob_allegiances;//mobs known
		
		public ArrayList<Item> known_recipes;
		
        //public Character_job job;
        //TODO Character_job
		
		public void Personality(){

            relationships = new ArrayList<>();
            topics = new ArrayList<>();
            mob_allegiances = new ArrayList<>();
			likes = new ArrayList<>();
            dislikes = new ArrayList<>();
            
			objectives = new ArrayList<>();
			//curr_obj_step = new Array();
            //curr_obj_start_tick = new Array();
            
			known_recipes = new ArrayList<>();
			attraction_traits = new ArrayList<>();
            disgust_traits = new ArrayList<>();
            
			//memory_action_names = new Array();
			//memory_action_vals = new Array();
			
			//job = null;
			
			add_like(FPalaceHelper.trait_hp_gain());
			add_like(FPalaceHelper.trait_max_hp_gain());
			add_like(FPalaceHelper.trait_fatigue_gain());
			add_like(FPalaceHelper.trait_gold_gain());
			add_like(FPalaceHelper.trait_mp_gain());
			add_like(FPalaceHelper.trait_lust_gain());
			add_like(FPalaceHelper.trait_lust_loss());
			
			add_dislike(FPalaceHelper.trait_hp_loss());
			add_dislike(FPalaceHelper.trait_lust_gain_by_unattractive());
			add_dislike(FPalaceHelper.trait_lust_loss_by_unattractive());
			
			add_recipe(FPalace_items.bandages());
		}
		/*TODO job
		public String set_job(Character_job j, Character c){
			var ret:String = "";
			ret = "</n> has taken on " + j.get_name() + " as a job. ";
			var i:int = 0;
			if(job != null){
				for(i;i<job.objectives.size();i++){
					job.objectives.get(i).end_quest(c);
				}
				//remove objectives given by the job
			}
			job = j;
			i = 0;
			for(i;i<job.objectives.size();i++){
				new_objective(job.objectives.get(i),c);
			}
			return ret;
		}
		*/
		public void add_attraction(Trait t){
            //attraction_traits[attraction_traits.length] = t;
            attraction_traits.add(t);
		}
		
		public void add_disgust(Trait t){
            //disgust_traits[disgust_traits.length] = t;
            disgust_traits.add(t);
		}
		
		public void add_recipe(Item r){
			int i = 0;
			for(i=0;i<known_recipes.size();i++){
				if(known_recipes.get(i).getName() == r.getName())break;
			}
            //if(i >= known_recipes.size())known_recipes[known_recipes.length] = r;
            if(i >= known_recipes.size())known_recipes.add(r);
		}
		
		public void add_like(Trait t){
            //if(t != null)likes[likes.length] = t;
            if(t != null)likes.add(t);
		}
		/*TODO Quest
		public function new_objective(q:Quest, c:Character):void{
			if(q != null){
				var i:int = 0;
				for(i;i<objectives.size();i++){
					if(objectives.get(i).name == q.name){
						return;
					}
				}
				objectives[objectives.size()] = q;
				curr_obj_step[curr_obj_step.length] = [0];
				curr_obj_start_tick[curr_obj_start_tick.length] = c.get_tick();
			}
		
		}
		*/
		public int get_obj_step(Quest q){
			int i = 0;
			for(i=0;i<objectives.size();i++){
				if(objectives.get(i).name == q.name){
					return curr_obj_step.get(i).get(curr_obj_step.get(i).size()-1);
				}
			}
			return -1;
		}
		
		public ArrayList<Integer> get_obj_steps(Quest q){
			int i = 0;
			for(i=0;i<objectives.size();i++){
				if(objectives.get(i).name == q.name){
					return curr_obj_step.get(i);
				}
			}
			return null;
		}
		
		public String set_obj_step(Quest q,int new_step,Character c){
			String ret = "";
			int i = 0;
			for(i=0;i<objectives.size();i++){
				if(objectives.get(i).name == q.name){
					/*
					if(q.end_step > -1 && new_step >= q.end_step){
						Quest temp_quest = objectives.get(i);
						ret += temp_quest.end_quest(c);
						
						objectives = objectives.slice(0, i).concat(objectives.slice(i+1, objectives.size()));
						curr_obj_step = curr_obj_step.slice(0, i).concat(curr_obj_step.slice(i+1, curr_obj_step.length));
						curr_obj_start_tick[i] = c.get_tick();
					}else{
						curr_obj_step.get(i)[curr_obj_step.get(i).length] = new_step;
						curr_obj_start_tick[i] = c.get_tick();
						if(q.objective_actions[new_step] == Quest.pick_up_action){
							trace("(Personality.set_obj_step)Should go through inventory to check and see if we've already got this objective step done...");
						}
					}
					break;
					*/
				}
			}
			return ret;
		}
		
		public void add_dislike(Trait t){
            //if(t != null)dislikes[dislikes.length] = t;
            if(t != null)dislikes.add(t);
		}
		
		public void new_allegiance(Mob m, Character c_self){
			int i = 0;
			for(i=0;i<mob_allegiances.size();i++){
				if(mob_allegiances.get(i) == m)return;
				int j = 0;//make sure we aren't joining two enemy mobs here...
				for(j=0;j<=mob_allegiances.get(i).enemy_mobs.size();j++){
					if(m==mob_allegiances.get(i).enemy_mobs.get(j))return;
				}
			}
			m.add_member(c_self);
            //mob_allegiances[mob_allegiances.length] = m;
            mob_allegiances.add(m);
		}
		
		public ArrayList<Conversation_topic> get_topics(Character c_self){
			ArrayList<Conversation_topic> ret_array = new ArrayList<>();
			
            //ret_array = ret_array.concat(topics);
            ret_array.addAll(topics);
			
			//check items for topics, and add them to topics array...
			if(c_self != null){
				int i = 0;
				for(i=0;i<c_self.possessions.size();i++){
					if(c_self.possessions.get(i).topic != null){
                        //ret_array = ret_array.concat(c_self.possessions.get(i).topic);
                        ret_array.add(c_self.possessions.get(i).topic);
					}
				}
				ArrayList<Object> temp_array = c_self.body.get_equip_array();
				for(i=0;i<temp_array.size();i++){
                    if(temp_array.get(i) instanceof Weapon){
                        Weapon temp = (Weapon)temp_array.get(i);
                        ret_array.add(temp.topic);
                    }else{//standard equipment
                        Equipment temp = (Equipment)temp_array.get(i);
                        ret_array.add(temp.topic);
                    }
                    /*
					if(temp_array.get(i).topic != null){
						ret_array = ret_array.concat(temp_array[i].topic);
                    }
                    */
				}
				
                //ret_array = ret_array.concat(c_self.sex.get_topics());
                //TODO add true sex to Character
                //if(c_self.location != null && c_self.location.area != null)ret_array = ret_array.concat(c_self.location.area.get_topics()); old
                if(c_self.location != null && c_self.location.area != null)ret_array.addAll(c_self.location.area.get_topics());
                //if(job != null) ret_array = ret_array.concat(job.get_topics());
                //TODO JOb
			}
            int i = 0;
            /*TODO objectives
			for(i=0;i<objectives.size();i++){
				ret_array = ret_array.concat(objectives.get(i).get_conversation_topics(curr_obj_step.get(i)[curr_obj_step.get(i).length-1]));
			}
			*/
			for(i=0;i<mob_allegiances.size();i++){
                //ret_array = ret_array.concat(mob_allegiances.get(i).get_topics(c_self));
                ret_array.addAll(mob_allegiances.get(i).get_topics(c_self));
			}
			
			//need to remove duplicate topics...

			for(i=0;i<ret_array.size();i++){
				
				for(int k=i + 1;k<ret_array.size();k++){
					if(ret_array.get(i).get_topic_name() == ret_array.get(k).get_topic_name()){
                        //ret_array = ret_array.slice(0, k).concat(ret_array.slice(k+1, ret_array.length));
                        ret_array.remove(k);
                        //TODO verify!!!
						k--;
					}
				}
			}
			
			return ret_array;
		}

		public String get_name(Character c, Character c_self){
			String ret = "";

			if(c.personality.relationship_exists(c_self)){
				//see if we've been introduced, and if we have, change ret to be our name
				int i = 0;
				for(i=0;i<relationships.size();i++){
					if(relationships.get(i).relationship_with == c){
						Relationship temp_rel = relationships.get(i);
						/*TODO get_surname
						if(temp_rel.get_introduced()){
							if(c_self.get_surname() == "" || check_relationship(c, c_self) > Personality.friends){
								ret = c_self.get_name();
							}else{
								ret = c_self.get_name() + " " + c_self.get_surname();
							}
						}else{
							ret = c_self.get_short_description(c);				
						}
						*/
						return ret;
					}
				}
							
			}
			
			ret = c_self.get_short_description(c);		
			return ret;
		}
		public Boolean get_introduced(Character c, Character c_self){
			Boolean ret = false;
			int i = 0;
			for(i=0;i<relationships.size();i++){
				if(relationships.get(i).relationship_with == c){
					Relationship temp_rel = relationships.get(i);
					if(temp_rel.get_introduced()){
						ret = true;
					}
					break;
				}
			}
			return ret;
        }
        
		
		public String start_conversation(Character c, Character c_self){
			String s = "";
			
			Relationship relationship = null;
			int i = 0;
			for(i=0;i<relationships.size();i++){
				if(relationships.get(i).relationship_with == c){
					relationship = relationships.get(i);
					break;
				}
			}
			if(relationship == null){
				new_relationship(c,c_self,Relationship.initial_reaction_change);
				c.personality.new_relationship(c_self,c,Relationship.initial_reaction_change);
				return start_conversation(c, c_self);
			}
			Relationship other_rel = null;
			i = 0;
			for(i=0;i<c.personality.relationships.size();i++){
				if(c.personality.relationships.get(i).relationship_with == c_self){
					other_rel = c.personality.relationships.get(i);
				}
			}
			if(other_rel == null){
				c.personality.new_relationship(c_self,c,Relationship.initial_reaction_change);
				return start_conversation(c, c_self);
			}			
			
			i = 0;
			ArrayList<String> mention_topics = new ArrayList<>();
			ArrayList<Integer> topic_values = new ArrayList<>();
			ArrayList<Conversation_topic> char_topics = get_topics(c_self);
			ArrayList<Conversation_topic> init_topics = c.personality.get_topics(c);
			Boolean know_something_you_dont = false;
			for(i=0;i<char_topics.size();i++){
				if(char_topics.get(i) != null){
					Conversation_topic  ct= (Conversation_topic)char_topics.get(i) ;//was as
					int step = ct.get_start_step(c_self,c,true);
					Boolean untalk_topic = true;
					if(step > -1 && ct.get_mention()){
						int j = 0;
						for(j=0;j<init_topics.size();j++){
							if(init_topics.get(j).get_topic_name() == ct.get_topic_name()){
								//mention_topics[mention_topics.length] = "<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+","+i+","+step+",-1\">Listen</a></font>\n";
								mention_topics.add("<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+","+i+","+step+",-1\">Listen</a></font>\n");
								//topic_values[topic_values.size()] = determine_action_consequence(ct.actions.get(step), c_self, c);
								topic_values.add(determine_action_consequence(ct.actions.get(step), c_self, c));
								untalk_topic = false;
								break;
							}
						}
						if(untalk_topic){
							know_something_you_dont = true;
							//mention_topics = new Array("<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+","+i+","+step+",-1\">Listen</a></font>\n").concat(mention_topics);
							//TODO if this means add to front (unshift) then:
							mention_topics.add(0, "<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+","+i+","+step+",-1\">Listen</a></font>\n");
							//topic_values = new Array([determine_action_consequence(ct.actions[step], c_self, c)]).concat(topic_values);
							//same with unshift here
							topic_values.add(0, determine_action_consequence(ct.actions.get(step), c_self, c));
						}
					}
				}
			}
			if(c_self.get_stat(FPalaceHelper.int_id).intValue() >= 5){
				//mention_topics[mention_topics.length] = "<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+",-2,-2\">Listen</a></font>\n";
				mention_topics.add("<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+",-2,-2\">Listen</a></font>\n");
			}
			
			String temp_string = "";
			int temp_val;
			if(mention_topics.size() > 0){
				//Mention priority should probably be based on something like where the topics come from... 
					//topics from a quest should come highest, while bodily functions should be less so.
						//Topics currently come from their sex(5), the area(4), their items(3), their objectives(1), as well as from personality(2) itself
					//maybe determine priority by wisdom or willpower?
				//Should prioritize based on whether the character has the topic or not - kinda doing this above. Topics the character does not have come first on the list
					//higher rel_status should make them assume the character already knows things more often
				if(!know_something_you_dont){
					i = 0;
					for(i=0;i<mention_topics.size();i++){
						if(topic_values.get(i) > topic_values.get(0)){
							temp_val = topic_values.get(i);
							temp_string = mention_topics.get(i);
							//topic_values[i] = topic_values[0];
							topic_values.set(i, topic_values.get(0));
							//topic_values[0] = temp_val;
							topic_values.set(0, temp_val);
							//mention_topics[i] = mention_topics[0];
							mention_topics.set(i, mention_topics.get(0));
							//mention_topics[0] = temp_string;
							mention_topics.set(0, temp_string);
						}
					}
					temp_string = mention_topics.get(0) + "\n";
					i = 1;
					for(i=1;i<mention_topics.size();i++){
						if(Math.random() < 0.5){
							temp_string = mention_topics.get(i) + "\n";
							break;
						}
					}
				}else{
					temp_string = mention_topics.get(i) + "\n";
				}
			}
			
			//only need to do introduction the first time this is called by this particular character
			
			int rel_status = relationship.relationship_status().intValue();
			
			if(rel_status <= Personality.hate){
				s = "</n2> looks ready to attack at any moment!\n";
			}else if(rel_status >= Personality.true_love){
				if(!relationship.get_introduced()){
					s = "\"I... I'm </n2>\" </pronoun2> says, stuttering in awe of you. \"What's your name?\"\n\n";
					relationship.set_introduced();
					other_rel.set_introduced();
				}else{
					s = "\"Oh hey there </n>...\" </n2> says while staring deeply into your eyes. \n\n";
				}
			}else if(rel_status >= Personality.friends){
				if(!relationship.get_introduced()){
					s = "\"Hey there! How are you? I'm </n2>!\" </pronoun2> says cheerfully.\n\n";
					relationship.set_introduced();
					other_rel.set_introduced();
				}else{
					s = "\"Hey </n>! Whats new?\" </n2> asks, curiousity on </noun2> face.\n\n";
				}
			}else if(rel_status >= Personality.really_like){
				if(!relationship.get_introduced()){
					s = "\"Hey there...\" </pronoun2> says slighly, moving closer, \"I'm </n2>, what's your name?\"\n\n";
					relationship.set_introduced();
					other_rel.set_introduced();
				}else{
					s = "\"Hey there </n>...\" </n2> says, </noun2> attention fully on you.\n\n";
				}
			}else if(rel_status >= Personality.like){
				if(!relationship.get_introduced()){
					s = "\"Hello! I'm </n2>. What can I help you with?\" </pronoun2> says cheerfully.\n\n";
					relationship.set_introduced();
					other_rel.set_introduced();
				}else{
					s = "\"Hey </n>! How are you?\" </n2> asks cheerfully.\n\n";
				}
			}else if(rel_status >= Personality.tolerate){
				if(!relationship.get_introduced()){
					s = "\"Hello there. Do you need something?\" </pronoun2> says, looking moderately bothered.\n\n";
				}else{
					s = "\"Hello </n>. How are you?\" </n2> says over politely.\n\n";
				}
			}else{
				if(!relationship.get_introduced()){
					s = "\"Hello.\" </pronoun2> says shortly, a slight look of displeasure on </noun2> face. \n\n";
				}else{
					s = "\"Hello </n>...\" </n2> says distastefully. \n\n";
				}
			}
						
			s += temp_string;			
			
			int j = 0;
			for(j=0;j<init_topics.size();j++){
				int exist_count = 0;
				int place_holder = (char_topics.size()+j);
				Conversation_topic  ct = init_topics.get(j);//TODO find if this should be in other loop
				int step;//Ditto
				if(char_topics.get(exist_count) != null){
					for(exist_count=0;exist_count<char_topics.size();exist_count++){
						if(char_topics.get(exist_count).get_topic_name() == init_topics.get(j).get_topic_name()){
							place_holder = exist_count;
							ct = char_topics.get(exist_count);
							break;
						}
					}
				}
				step = ct.get_start_step(c_self,c);
				if(step > -1 && ct.get_mention()){
					s += "<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+","+place_holder+","+step+",-1\">" + ct.get_topic_name() + "</a></font>\n";
				}
				
			}
			if(c.get_stat(FPalaceHelper.int_id).intValue() >= 5){
				s += "<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+",-2,-1\">Gossip</a></font>\n";
			}			
			s += "\n<font color='#0000FF'><a href=\"event:look," + c.location.getContentID(c_self) +"\">Back</a></font>";
			
			c_self.setBusy();
			c_self.status = " is talking here";
			c.setBusy();
			c.status = " is talking here";
			
			return s;
		}
		/*
		
		public function gossip(c:Character, c_self:Character, gossip_step:int):String{
			var ret:String = "";
			var temp_r:Relationship;
			var gossip_mod:Number = 0;
			var i:int = 0;
			if(gossip_step == -2){//c_self is the one gossiping... 
				temp_r = relationships[Math.round(Math.random()*(relationships.size()-1))];
				gossip_mod = temp_r.relationship_status();
				if(temp_r.relationship_with == c_self){
					//hmmm should we talk about ourselves...?
					if(check_relationship(c, c_self) >= Personality.friends){
						ret += "</n2> starts to talk about </objnoun2>self. ";
						if(gossip_mod <= Personality.hate){
							ret += "</n2> seems to hate </objnoun2>self. ";
						}else if(gossip_mod >= Personality.true_love){
							ret += "</n2> seems to be in love with </objnoun2>self. ";
						}else if(gossip_mod >= Personality.friends){
							ret += "</n2> seems to be friends with </objnoun2>self. ";
						}else if(gossip_mod >= Personality.really_like){
							ret += "</n2> seems to really like </objnoun2>self. ";
						}else if(gossip_mod >= Personality.like){
							ret += "</n2> seems to like </objnoun2>self. ";
						}else if(gossip_mod >= Personality.tolerate){
							ret += "</n2> seems to tolerate </objnoun2>self. ";
						}else if(gossip_mod >= Personality.dislike){
							ret += "</n2> seems to dislike </objnoun2>self. ";
						}
					}else{
						ret += "</n2> starts to talk about </objnoun2>self, but stops. ";
						gossip_mod = 0;
					}					
				}else{
					ret += "</n2> tells you about "+ temp_r.relationship_with.get_name() +". ";
					if(temp_r.relationship_with.location == null){//this is heavy handed... you don't know someone is dead until you've been told or seen the body
						ret += "</pronoun2> goes on to say how much </pronoun2> misses "+ temp_r.relationship_with.get_name() +" and how they died too soon. ";
					}
					if(temp_r.relationship_type == Relationship.child_type){
						ret += "</pronoun2> mentions how " + temp_r.relationship_with.get_name() + " is </noun2> child. ";
					}else if(temp_r.relationship_type == Relationship.father_type){
						ret += "</pronoun2> mentions how " + temp_r.relationship_with.get_name() + " is </noun2> father. ";
					}else if(temp_r.relationship_type == Relationship.married_type){
						ret += "</pronoun2> mentions how " + temp_r.relationship_with.get_name() + " is </noun2> significant other. ";
					}else if(temp_r.relationship_type == Relationship.mother_type){
						ret += "</pronoun2> mentions how " + temp_r.relationship_with.get_name() + " is </noun2> mother. ";
					}else if(temp_r.relationship_type == Relationship.sibling_type){
						ret += "</pronoun2> mentions how " + temp_r.relationship_with.get_name() + " is </noun2> sibling. ";
					}
									
					if(gossip_mod <= Personality.hate){
						ret += "</n2> seems to hate "  + temp_r.relationship_with.get_name() + ". ";
					}else if(gossip_mod >= Personality.true_love){
						ret += "</n2> seems to be in love with "  + temp_r.relationship_with.get_name() + ". ";
					}else if(gossip_mod >= Personality.friends){
						ret += "</n2> seems to be friends with "  + temp_r.relationship_with.get_name() + ". ";
					}else if(gossip_mod >= Personality.really_like){
						ret += "</n2> seems to really like "  + temp_r.relationship_with.get_name() + ". ";
					}else if(gossip_mod >= Personality.like){
						ret += "</n2> seems to like "  + temp_r.relationship_with.get_name() + ". ";
					}else if(gossip_mod >= Personality.tolerate){
						ret += "</n2> seems to tolerate "  + temp_r.relationship_with.get_name() + ". ";
					}else if(gossip_mod >= Personality.dislike){
						ret += "</n2> seems to dislike "  + temp_r.relationship_with.get_name() + ". ";
					}
				}
				gossip_mod = gossip_mod * c.personality.check_relationship(c_self,c)/100;
				c.personality.new_relationship(temp_r.relationship_with,c, Relationship.initial_reaction_change,gossip_mod);
			}else if(gossip_step == -1){//c is the one gossiping... 
				//Should be giving the option about who you gossip about, instead of choosing at random, but meh for now...
				temp_r = c.personality.relationships[Math.round(Math.random()*(c.personality.relationships.size()-1))];
				gossip_mod = temp_r.relationship_status();
				if(temp_r.relationship_with == c){
					ret += "You tell </n2> a little bit about yourself. ";
				}else{
					ret += "You tell </n2> about "+ temp_r.relationship_with.get_name() +". ";
				}
				
				gossip_mod = gossip_mod * check_relationship(c, c_self)/100;
				new_relationship(temp_r.relationship_with,c_self, Relationship.initial_reaction_change,gossip_mod);
			}else{
				trace("(Personality.gossip)Got a gossip step that I don't know what to do with.");
			}
			c.apply_affect_by_id(Character.relations_affect_id,c.personality.check_relationship(c_self,c)/100,0,c_self);
			c_self.apply_affect_by_id(Character.relations_affect_id,check_relationship(c, c_self)/100,0,c);
			
			if(c.location == c_self.location)ret += "\n\n<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+",-1,-1,-1,-1\">Back to topics</a></font>\n";
			
			return ret;
		}
		
		public function talk(c:Character, c_self:Character, topic_num:int, topic_step:int, challenge_num:int = -1, dynamic_choice:Array = null):String{
			var s:String = "";
			
			if(topic_num == -1){
				return start_conversation(c, c_self);
			}else if(topic_num == -2){//time to delve into relationship for some gossip
				return gossip(c, c_self, topic_step);
			}
			
			var char_topics:Array = get_topics(c_self);
			var new_topic:Conversation_topic;
			var i:int = 0;
			if(topic_num >= char_topics.length){
				new_topic = c.personality.get_topics(c)[topic_num - char_topics.length];			
				add_conversation_topic(new_topic);
				char_topics = get_topics(c_self);
				topic_num = 0;
				for(topic_num;topic_num < char_topics.length; topic_num++){
					if(char_topics[topic_num] == new_topic) break;
				}
			}else{//if c doesn't have this topic, they should now...
				new_topic = char_topics[topic_num];
				if(!new_topic.get_spread()){
					new_topic = new Conversation_topic();
					new_topic.set_topic_name(char_topics[topic_num].get_topic_name());
				}
				
				var add_flag:Boolean = true;
				var init_topics:Array = c.personality.get_topics(c);
				for(i;i<init_topics.length;i++){
					if(init_topics[i].get_topic_name() == new_topic.get_topic_name()){
						add_flag = false;
						break;
					}
				}
				if(add_flag){
					c.personality.add_conversation_topic(new_topic);
				}
			}
			
			if(char_topics[topic_num] != null){
				var o:Object = char_topics[topic_num].get_topic_step(topic_step);
				if(o is Action){
					var a:Action = o as Action;
					if(challenge_num == -1){
						a.set_originator(c_self);
						s += a.trigger(c, 1) + "\n";					
					}else{
						s += a.challenge(challenge_num,c,c_self,1, dynamic_choice);   
					}
				
					i = 0;
					for(i;i<a.challenges.length;i++){
						var temp:Challenge = a.challenges[i];
						while(s.indexOf("</c"+ String(i) +">") > -1)s = s.replace("</c"+ String(i) +">", "<a href=\"event:talk,"+c.location.getContentID(c_self)+","+topic_num+","+topic_step+","+i+"\"><i>" + temp.get_text() + "</i></a>");
					}
					
					var dynamic_challenge:int = 0;
					while(s.indexOf("</dc") > -1){
						while(s.indexOf("</dc" + dynamic_challenge + ">") > -1){
							s = s.replace("<dc" + dynamic_challenge + ">", "<a href=\"event:talk,"+c.location.getContentID(c_self)+","+topic_num+","+ topic_step +","+challenge_num+((dynamic_choice!=null&&dynamic_choice[0]!=null)?","+ dynamic_choice:"") +","+dynamic_challenge+"\">");
							s = s.replace("</dc" + dynamic_challenge + ">", "</a>");
						}
						dynamic_challenge++;
					}
				}else{
					s += o as String;
				}
				
				//deal with references to other conversation topics: <ctref0>, <ctref1>, ... , <ctrefn>
				i = 0;
				for(i;i<char_topics[topic_num].ct_ref_names.length;i++){
					//let's go a lookin for a conversation topic name "topics[topic_num].ct_ref_names[i]"
					var connect_topic:Conversation_topic = get_conversation_topic_by_name(char_topics[topic_num].ct_ref_names[i],c_self);
					
					if(connect_topic != null){
						var new_topic_num:int = 0;
						for(new_topic_num;new_topic_num<char_topics.length;new_topic_num++){
							if(char_topics[new_topic_num] == connect_topic)break;
						}
						
						if(new_topic_num >= char_topics.length)new_topic_num = -1;
						var new_topic_step:int = connect_topic.get_start_step(c_self, c, true);
						
						if(new_topic_step >= 0){
							while(s.indexOf("<ctref" + i + ">") > -1){
								s = s.replace("<ctref" + i + ">", "<a href=\"event:talk,"+c.location.getContentID(c_self)+","+new_topic_num+","+ new_topic_step +"\"><i>"+char_topics[topic_num].ct_ref_names[i]+"</i></a>");
							}
						}else{
							while(s.indexOf("<ctref" + i + ">") > -1){
								s = s.replace("<ctref" + i + ">", ""+char_topics[topic_num].ct_ref_names[i]+"");//this should actually be replace with some anchor tag...
							}
						}
					}else{
						while(s.indexOf("<ctref" + i + ">") > -1){
							s = s.replace("<ctref" + i + ">", ""+char_topics[topic_num].ct_ref_names[i]+"");//this should actually be replace with some anchor tag...
						}
					}
				}
			}
			
			if(c.location == c_self.location)s += "\n\n<font color='#0000FF'><a href=\"event:talk,"+c.location.getContentID(c_self)+",-1,-1,-1,-1\">Back to topics</a></font>";
			
			var c_chall_out:String = c.get_challenge_output();
			if(c_chall_out!="")c_chall_out+="\n";
			s = c_chall_out + s;
			c.set_busy();
			c_self.set_busy();
			
			return s;
		}
		
		private function get_conversation_topic_by_name(looking_for:String, c_self:Character):Conversation_topic{
			var ret:Conversation_topic = null;
			var i:int = 0;
			var temp_array:Array = get_topics(c_self);
			for(i;i<temp_array.length;i++){
				if(temp_array[i].get_topic_name() == looking_for){
					if(temp_array[i].get_topic_step(0) != null){
						ret = temp_array[i];
						break;
					}
				}
			}
			
			return ret;
		}
		
		public function add_conversation_topic(ct:Conversation_topic):void{
			topics[topics.length] = ct;
		}
		
		public function determine_target(enemies:Array, c_self:Character):int{
			var ret:int = 0;//Math.round(Math.random()*(enemies.length-1));
			var min_like:int = 0;
			var i:int = 0;
			for(i;i<enemies.length;i++){
				if(enemies[i].personality == this){//don't target myself... for reasons...
					if(ret == i){
						if(ret <= 0){
							ret++;
						}else{
							ret--;
						}
					}
					continue;
				}else{
					var temp_check:int = check_relationship(enemies[i],c_self);
					if(temp_check < min_like){
						ret = i;
						min_like = temp_check;
					}
				}
			}
			return ret;
		}
		
		public function determine_action(c:Character, self:Character):int{
			var actions:Array = self.get_attack_actions();
			var choice_target:Character;
			var rand:int = 0;//Math.round(Math.random()*(actions.length-1));//this is not a good way of making a choice...
			//return rand;
			//evaluate an attacks for the character
			var action_value:int = 0;
			var top_three:Array = new Array();
			var top_three_val:Array = new Array();
			var i:int = 0;
			for(i;i<actions.length;i++){
				if(actions[i] != null){
					if(actions[i].consequences[0] is Dynamic_Consequence && actions[i].consequences[0].consequence_list_type == Dynamic_Consequence.list_inventory){
						choice_target = self;
					}else{
						choice_target = c;
					}
					action_value = determine_action_consequence(actions[i], self, choice_target);
					//trace(actions[i].get_name() + " " + action_value);
					if(top_three_val[0] == null){
						top_three[0] = i;
						top_three_val[0] = action_value;
						top_three[1] = i;
						top_three_val[1] = action_value;
						top_three[2] = i;
						top_three_val[2] = action_value;
					}else if(action_value >= top_three_val[0]){
						top_three[2] = top_three[1];
						top_three_val[2] = top_three_val[1];
						top_three[1] = top_three[0];
						top_three_val[1] = top_three_val[0];
						top_three[0] = i;
						top_three_val[0] = action_value;
					}else if(top_three[0] == top_three[1] || action_value >= top_three_val[1]){
						top_three[2] = top_three[1];
						top_three_val[2] = top_three_val[1];
						top_three[1] = i;
						top_three_val[1] = action_value;
					}
				}				
			}
			rand = top_three[Math.round(Math.random()*(top_three.length-1))];
			return rand;
		}
		*/
		public int determine_action_consequence(CharAction act, Character self){
			return determine_action_consequence(act,self,null);
		}
		public int determine_action_consequence(CharAction act, Character self, Character target){//def null
			int ret = 0;
			Boolean mem_found = false;
			
			if(act != null){
				Boolean req_met = true;
				int i = 0;
				for(i=0;i<act.requirement.size();i++){
					ret += determine_reaction(self, act.requirement.get(i), -act.requirement_amount.get(i), self).intValue();
					if(self.get_stat(act.requirement.get(i)).intValue() < act.requirement_amount.get(i) && act.requirement_remove.get(i)){
						req_met = false;
						break;
					}
				}
				
				if (act.dialogue == "null"){//Attacking someone!? 
					if(!(act.alchemy_flag||act.enchant_flag||act.sewing_flag||act.craft_flag||act.trade_flag||act.dismantle_flag||act.talk_flag)){
						ret += -1;
					}else if(act.talk_flag){
						ret += check_relationship(target, self);
					}
				}
				//memory_action_names[memory_action_names.length] = act;
				
				if(req_met){
					int my_reaction = 0;
					int others_reaction = 0;
					i = 0;
					for(i=0;i<act.consequences.size();i++){
						Consequence temp_con = act.consequences.get(i);
						int j = 0;
						for(j=0;j<temp_con.conseq.length;j++){
							Character  temp_target= target;
							if(temp_con.consequenceTarget[i] || target == null){
								temp_target = self;
							}
							Number rel_status = check_relationship(temp_target, self);
							int other_count = 0;
							int stat_id = temp_con.statEffected.get(j);
							int own_reaction = 0;
							if(temp_con.conseq[j] == Consequence.amt_from_roll_const){
								int temp_max = (int)-temp_con.max_damage.doubleValue()/2;
								if(temp_max == 0) temp_max = -5;//not sure what this number should actually be
								if((stat_id < 0 && stat_id != Character.relations_affect_id) || stat_id == -Character.relations_affect_id){
									temp_max = -temp_max;
									stat_id = -stat_id;
								}		
								my_reaction += determine_reaction(temp_target, stat_id, temp_max, self).doubleValue() * rel_status.doubleValue()/100;		
								
								for(other_count=0;other_count<self.location.contents.size();other_count++){
									if(self.location.contents.get(other_count) instanceof Character && self.location.contents.get(other_count) != self && self.location.contents.get(other_count) != temp_target){
										if(own_reaction == 0)own_reaction = determine_reaction(self, stat_id, temp_max, temp_target).intValue();
										others_reaction += own_reaction * (check_relationship((Character)self.location.contents.get(other_count),self)/100);
									}
								}
								
							}else{
								my_reaction += determine_reaction(temp_target, stat_id, temp_con.conseq[j], self).doubleValue() * rel_status.doubleValue()/100;
								
								for(other_count=0;other_count<self.location.contents.size();other_count++){
									if(self.location.contents.get(other_count) instanceof Character && self.location.contents.get(other_count) != self && self.location.contents.get(other_count) != temp_target){
										if(own_reaction == 0)own_reaction = determine_reaction(self, stat_id, temp_con.conseq[j], temp_target).intValue();
										others_reaction += own_reaction * (check_relationship((Character)self.location.contents.get(other_count),self)/100);
									}
								}
							}						
						}
						
						if(temp_con instanceof DynamicConsequence){
							DynamicConsequence dynamic_con = (DynamicConsequence)temp_con ;					
							if(dynamic_con.consequence_list_type == DynamicConsequence.list_inventory
							|| dynamic_con.consequence_list_type == DynamicConsequence.list_inventory_alchemy){
								if(dynamic_con.dynamic_choices(target).indexOf("<dc") < 0){
									my_reaction = -1;
									break;
								}
							}
						}
					}
					
					int wis = self.get_stat(FPalaceHelper.wis_id).intValue();
					if(others_reaction < 0 && wis > 10){
						others_reaction = others_reaction * 16/wis;
					}else if(wis < 10){
						others_reaction = others_reaction * wis/10;
					}
					
					ret += my_reaction + others_reaction;
					
					if(act.rest_flag){
						ret += determine_reaction(self, FPalaceHelper.curr_hp_id, self.get_stat(FPalaceHelper.max_hp_id), self).intValue();
						ret += determine_reaction(self, FPalaceHelper.curr_mp_id, self.get_stat(FPalaceHelper.max_mp_id), self).intValue();
						ret += determine_reaction(self, FPalaceHelper.curr_fatigue_id, self.get_stat(FPalaceHelper.max_fatigue_id), self).intValue();
					}
					
					
				}else{
					ret = Math.round(ret/4);
				}
				//memory_action_vals[memory_action_vals.length] = ret;
			}			
			/*
			if(target != null && target != self && check_relationship(target,self) < 0){
				ret = -ret;
			}
			*/
			return ret;
		}
		/*
		public function determine_item_consequences(item:Item, self:Character):int{
			var ret:int = 0;
			var temp_str:String = self.get_item_description(item, true);
			var stat_expression:RegExp = new RegExp("<s[-]*\\d*>","gi");
			var	stat_effects:Array = temp_str.match(stat_expression);
			var i:int = 0;
			for(i;i<stat_effects.length;i++){
				var stat_id:int = int(stat_effects[i].substr(2,stat_effects[i].length-3));
				if(stat_id < 0){
					ret += determine_reaction(self, -stat_id, -1, self);
				}else{
					ret += determine_reaction(self, stat_id, 1, self);
				}
			}
			if(item is Weapon){
				ret += determine_action_consequence((item as Weapon).attack_action,self);
			}			
			
			return ret;
		}
		
		public function determine_dynamic(enemy_id:int, attack_id:int, self:Character):int{
			var ret:int = 0;
			
			var temp_action:Action = self.get_attack_action(attack_id);
			var temp_conseq:Dynamic_Consequence = temp_action.consequences[0];//should be searching through for the dynamic consequence... just assuming 0 
			var temp_enemy:Character = self.location.get_content(enemy_id) as Character;
			
			if(temp_conseq.consequence_list_type == Dynamic_Consequence.list_inventory){
				//go through the inventory, and see if determine what we think are the consequences of it's use
				var con_ratings:Array = new Array();
				var pos_count:int = 0;
				for(pos_count;pos_count < self.possessions.length ;pos_count++){
					var temp_item:Item = self.possessions[pos_count];
					con_ratings[pos_count] = determine_item_consequences(temp_item, self);
				}
				
				if(temp_enemy != self && check_relationship(temp_enemy,self) < 0){
					//if using on someone we dislike, we want negative consequences
					var curr_min:int = con_ratings[0];
					var min_id:int = 0;
					pos_count = 1;
					for(pos_count;pos_count<con_ratings.length;pos_count++){
						if(con_ratings[pos_count] < curr_min){
							curr_min = con_ratings[pos_count];
							min_id = pos_count;
						}
					}
					return min_id;
				}else{
					//if using on someone we like, we want posititve consequences
					var curr_max:int = con_ratings[0];
					var max_id:int = 0;
					pos_count = 1;
					for(pos_count;pos_count<con_ratings.length;pos_count++){
						if(con_ratings[pos_count] > curr_max){
							curr_max = con_ratings[pos_count];
							max_id = pos_count;
						}
					}
					return max_id;
				}
				
			}else if(temp_conseq.consequence_list_type == Dynamic_Consequence.list_noncrit_parts){
				var con_count:int = 0;
				var part_count:int = 0;
				for(con_count;con_count < temp_enemy.body.parts.length;con_count++){
					if(!temp_enemy.body.parts[con_count].crit_part()){
						part_count++;
					}
				}
				ret = Math.round(Math.random()*part_count);
			}else if(temp_conseq.consequence_list_type == Dynamic_Consequence.list_parts){
				con_count = 0;
				part_count= 0;
				for(con_count;con_count < temp_enemy.body.parts.length;con_count++){
					part_count++;
				}
				ret = Math.round(Math.random()*part_count);
			}
			
			return ret;
		}
		
		public function determine_overworld_action(option_set:Array, c:Character):int{
			var ret:int = 0;
			
			var overworld_stat:Boolean = c.get_overworld_status() || c.get_combat_status();
			
			var option_val:Array = new Array();
			var top_val:int = 0;
			var sec_val:int = 0;
			var tri_val:int = 0;
			var i:int = 0;
			for(i;i<option_set.length;i++){
				if(option_set[i] != null){
					option_val[i] = determine_option_value(option_set[i], overworld_stat, c);
					if(option_val[i] >= option_val[top_val]){
						tri_val = sec_val;
						sec_val = top_val;
						top_val = i;
					}else if(top_val == sec_val || option_val[i] >= option_val[sec_val]){
						tri_val = sec_val;
						sec_val = i;
					}
				}
			}
			
			if(option_set[top_val] == null){
				return -1;
			}
			
			if(option_set[sec_val] == null){
				sec_val = top_val;
			}
			
			if(option_set[tri_val] == null){
				tri_val = top_val;
			}
			
			var avail_choice:Array = [top_val, sec_val, tri_val];
			
			var rand:Number = Math.random();
			if(rand >= 0.6){
				ret = avail_choice[0];
			}else if(rand >= 0.2){
				ret = avail_choice[1];
			}else{
				ret = avail_choice[2];
			}
			
			//ret = avail_choice[Math.round(Math.random()*(avail_choice.length-1))];
			
			return ret;
		}
		
		public function determine_option_value(options:String, overworld_stat:Boolean, c:Character):int{
			if(options == null) return -999;
			options = options.slice(options.indexOf(":")+1, options.length-2);
			
			var current_step:int;
			var target_room:Room = null;
			var target_char:Character = null;
			var target_action:Action = null;
			var target_item:Item = null;
			var target_command:String = null;
			
			var temp_item:Item;
			var temp_char:Character;
			var temp_options:Array;
			var ret:int = 0;
			var i:int = 0;
			var tempArray:Array = options.split(",");			
			
			if (tempArray[0] == "open"){
				ret = 1;
			}else if(tempArray[0] == "inspect"){
				ret = 1;
			}else if(tempArray[0] == "go_to_new_room"){
				if(overworld_stat){
					ret = 1;
				}else{
					ret = -1;
				}
			}else if (tempArray[0] == "pick_up"){
				if(c.location.contents[tempArray[1]] is Item){
					temp_item = c.location.contents[tempArray[1]];
					if(temp_item != null){
						ret = determine_item_consequences(temp_item, c);
						ret += determine_reaction(c, Character.gold_id, temp_item.get_value(c, c), c);
					}else{
						ret = -1;
					}
				}
			}else if (tempArray[0] == "loot"){
				ret = 1;				
				if(c.location != null && c.location.static_contents[tempArray[1]] != null){
					temp_item = c.location.static_contents[tempArray[1]].contents[tempArray[2]];
				}
				if(temp_item != null){
					ret += determine_item_consequences(temp_item, c);
					ret += determine_reaction(c, Character.gold_id, temp_item.get_value(c, c), c);					
					
				}
			}else if (tempArray[0] == "look"){
				if(tempArray[1] == null){
					ret = 1;
				}else{
					if(c.location.get_content(tempArray[1]) is Character){
						if(tempArray[2] == null){
							ret = Math.abs(check_relationship(c.location.get_content(tempArray[1]) as Character,c));
						}else{
							ret = 1;
						}
					}else{
						ret = 1;
					}
				}
			}else if(tempArray[0] == "use_item"){
				if(int(tempArray[3]) == 2){
					//never throw items away...
					ret = -999;
				}else{
					//should be checking if this is a good idea or not...
					temp_item = null;
					if(c.party == null){
						if(tempArray[3] == 0 || tempArray[3] == -1){
							temp_item = c.possessions[int(tempArray[1])];
						}
					}else{
						if(tempArray[3] == 0 || tempArray[3] == -1){
							temp_item = c.party.members[int(tempArray[2])].posessions[int(tempArray[1])];
						}
					}
				}
				if(temp_item != null){
					ret = determine_item_consequences(temp_item, c);
				}
			}else if(tempArray[0] == "action"){
				//should be checking if this is a good idea or not...
				var action_to_lookat:Action = null;
				if(int(tempArray[1]) == -1){
					action_to_lookat = c.location.actions[int(tempArray[2])];
				}else{
					if(c.location.contents[int(tempArray[1])] is Character){
						action_to_lookat = c.location.contents[int(tempArray[1])].get_action(int(tempArray[2]));
					}
				}
				if(action_to_lookat != null){
					if(int(tempArray[1]) == -1){
						ret = determine_action_consequence(action_to_lookat, c, c);
					}else{
						ret = determine_action_consequence(action_to_lookat, c, c.location.contents[int(tempArray[1])]);
					}
				}
			}else if(tempArray[0] == "challenge"){
				ret = 1;
			}else if(tempArray[0] == "combat"){
				ret = 0;
			}else if(tempArray[0] == "equip"){
				if(int(tempArray[3]) == 2){
					//never throw items away...
					ret = -999;
				}else{
					//should be checking if this is a good idea or not...
					temp_item = null;
					if(c.party == null){
						if(tempArray[3] == 0 || tempArray[3] == -1){
							temp_item = c.possessions[int(tempArray[1])];
						}
					}else{
						if(tempArray[3] == 0 || tempArray[3] == -1){
							temp_item = c.party.members[int(tempArray[2])].posessions[int(tempArray[1])];
						}
					}
				}
				if(temp_item != null){
					ret = determine_item_consequences(temp_item, c);
				}
			}else if(tempArray[0] == "unequip"){
				if(c.party == null){
					temp_item = c.get_equip_by_count(int(tempArray[1]));
				}else{
					temp_item = c.party.members[int(tempArray[2])].get_equip_by_count(int(tempArray[1]));
				}
				if(temp_item != null){
					ret = -1 -determine_item_consequences(temp_item, c);
				}
			}else if(tempArray[0] == "hold"){
				if(int(tempArray[3]) == 2){
					//never throw items away...
					ret = -999;
				}else{
					//should be checking if this is a good idea or not...
					temp_item = null;
					if(c.party == null){
						if(tempArray[3] == 0 || tempArray[3] == -1){
							temp_item = c.possessions[int(tempArray[1])];
						}
					}else{
						if(tempArray[3] == 0 || tempArray[3] == -1){
							temp_item = c.party.members[int(tempArray[2])].posessions[int(tempArray[1])];
						}
					}
				}
				if(temp_item != null){
					ret = determine_item_consequences(temp_item, c);
				}
			}else if(tempArray[0] == "unhold"){
				if(c.party == null){
					temp_item = c.body.parts[int(tempArray[1])].hold;
				}else{
					temp_item = c.party.members[int(tempArray[2])].body.parts[int(tempArray[1])].hold;
				}
				if(temp_item != null){
					ret = -1 -determine_item_consequences(temp_item, c);
				}
			}else if(tempArray[0] == "alchemy"){
				ret = 1;
			}else if(tempArray[0] == "enchant"){
				ret = 1;
			}else if(tempArray[0] == "sew"){
				ret = 1;
			}else if(tempArray[0] == "buy"){
				//should be checking if this is a good idea or not...
				ret = 1;
			}else if(tempArray[0] == "sell"){
				//should be checking if this is a good idea or not...
				ret = 1;
			}else if(tempArray[0] == "inventory"){
				ret = 1;
			}else if(tempArray[0] == "appearance"){
				ret = 1;
			}else if(tempArray[0] == "status"){
				ret = 1;
			}else if(tempArray[0] == "act_by_type"){
				ret = 1;
			}else if(tempArray[0] == "talk"){
				ret = 1;
			}else if(tempArray[0] == "wait"){
				ret = 1;
			}else if(tempArray[0] == "show_skills"){
				ret = 1;
				//should be checking if this is a good idea or not...
			}else if(tempArray[0] == "cclass_history"){
				ret = 0;
			}else if(tempArray[0] == "sew"){
				ret = 1;
			}else if(tempArray[0] == "dismantle"){
				ret = 1;
			}else if(tempArray[0] == "craft"){
				ret = 1;
			}else{
				trace("(Personality)Don't know what to think of this:"+tempArray);
				ret = 0;
			}
			
			i = 0;
			for(i;i<objectives.size();i++){
				current_step = curr_obj_step.get(i)[curr_obj_step.get(i).length-1];
				
				if(tempArray[0] == "go_to_new_room"){
					target_room = objectives.get(i).get_target_room(current_step);
					if(c.location != null && c.location.get_exit(tempArray[1]) == target_room){
						ret += 5;
					}else if(c.location == target_room){
						ret = -1;
					}
				}
				
				//var target_char:Character = objectives.get(i).get_target_char(current_step);
				//var target_action:Action = objectives.get(i).get_target_action(current_step);
				//var target_item:Item = objectives.get(i).get_target_item(current_step);
				
				target_command = objectives.get(i).get_target_command(current_step);
				if(target_command == tempArray[0])ret += 5;
			}
			return ret;
		}
		*/
		public Number determine_reaction(Character c,int stat_id,Number quant, Character c_self){
			if(c_self.get_stat(stat_id).intValue() < 0){
				quant = 0;
			}else{
				if(stat_id == Character.relations_affect_id){
					//quant *= 2;
					quant =quant.doubleValue() * 2;
				}else{
					Number like_amt = 0;					
					int i = 0;
					for(i=0;i<mob_allegiances.size();i++){
						int j = 0;
						for(j=0;j<mob_allegiances.get(i).ideals.size();j++){
							if(stat_id == mob_allegiances.get(i).ideals.get(j).stat_trait){
								//like_amt += mob_allegiances.get(i).ideals.get(j).reaction_mod(c, quant.intValue(), c_self);
								like_amt = like_amt.doubleValue() +  mob_allegiances.get(i).ideals.get(j).reaction_mod(c, quant.intValue(), c_self).doubleValue();
							}
						}
					}
					i = 0;
					for(i=0;i<likes.size();i++){
						if(stat_id == likes.get(i).stat_trait){
							//like_amt += likes.get(i).reaction_mod(c, quant.intValue(), c_self);
							like_amt = like_amt.doubleValue() + likes.get(i).reaction_mod(c, quant.intValue(), c_self).doubleValue();
						}
					}
					
					Number dislike_amt = 0;
					i = 0;
					for(i=0;i<dislikes.size();i++){
						if(stat_id == dislikes.get(i).stat_trait){
							//dislike_amt += dislikes.get(i).reaction_mod(c, quant.intValue(), c_self);
							dislike_amt =dislike_amt.doubleValue() + dislikes.get(i).reaction_mod(c, quant.intValue(), c_self).doubleValue();
						}
					}
					
					quant = like_amt.doubleValue() - dislike_amt.doubleValue();
				}
			}
			return quant;
		}
		/*
		public function determine_reaction_to_other(c_self:Character, c_effected:Character, c_acted:Character, i:int, k:Number):void{
			if(c_self == c_effected || c_self == c_acted) return;
			var my_reaction:Number = determine_reaction(c_acted, i, k, c_self);			
			var acting_rel:Number = Number(check_relationship(c_acted,c_self));
			var effect_rel:Number = Number(check_relationship(c_effected,c_self));
			
			if(my_reaction >= 0){
				new_relationship(c_acted, c_self, (my_reaction * Math.abs(acting_rel)/1000));
				new_relationship(c_effected, c_self, (my_reaction * Math.abs(effect_rel)/1000));
			}else{
				if(effect_rel >= acting_rel){
					new_relationship(c_acted, c_self, (my_reaction * Math.abs(acting_rel)/1000));
					new_relationship(c_effected, c_self, -(my_reaction * Math.abs(effect_rel)/1000));//pity
				}else{
					new_relationship(c_acted, c_self, -(my_reaction * Math.abs(acting_rel)/1000));
					new_relationship(c_effected, c_self, (my_reaction * Math.abs(effect_rel)/1000));
				}
			}
		}
		*/
		public void new_relationship(Character c, Character c_self,int change_id){
			new_relationship(c,c_self,change_id,0,0);
		}
		public void new_relationship(Character c, Character c_self,int change_id,Number k){
			new_relationship(c,c_self,change_id,k,0);
		}
		public void new_relationship(Character c, Character c_self,int change_id,Number k,int rel_type){//default k=0, rel_type=0
			if(!relationship_exists(c)){
				Relationship r = new Relationship(c);
				//relationships[relationships.size()] = r;
				relationships.add(r);
				r.change_type(rel_type);
				change_relationship(c, determine_initial(c, c_self), Relationship.initial_reaction_change);
			}
			
			change_relationship(c, k, change_id);
		}
		
		private int determine_initial(Character c, Character c_self){
			int ret = 0;
			
			int i = 0;
			for(i=0;i<likes.size();i++){
				if(likes.get(i).has_trait(c, c_self)){
					ret += likes.get(i).trait_strength;
				}
			}
			
			for(i=0;i<dislikes.size();i++){
				if(dislikes.get(i).has_trait(c, c_self)){
					ret -= dislikes.get(i).trait_strength;
				}
			}
			
			//ret += determine_attraction(c, c_self);
            //ret += determine_similarity(c, c_self);
            //TODO so much CHaracter
			
			for(i=0;i<mob_allegiances.size();i++){
				int j = 0;
				for(j=0;j<mob_allegiances.get(i).ideals.size();j++){
					if(mob_allegiances.get(i).ideals.get(j).has_trait(c, c_self))ret += mob_allegiances.get(i).ideals.get(j).trait_strength;
				}
				if(c != null){
					int k= 0;
					for(k=0;k<c.personality.mob_allegiances.size();k++){
						if(c.personality.mob_allegiances.get(k) == mob_allegiances.get(k)){
						   ret +=2;
						}else{
							for(j=0;j<mob_allegiances.get(i).allied_mobs.size();j++){
								if(c.personality.mob_allegiances.get(k) == mob_allegiances.get(i).allied_mobs.get(j))ret +=1;
							}
							for(j=0;j<mob_allegiances.get(i).enemy_mobs.size();j++){
								if(c.personality.mob_allegiances.get(k) == mob_allegiances.get(i).enemy_mobs.get(j))ret -=5;
							}
						}
					}
				}
			}
			
			return ret;
		}
		/*
		private function determine_similarity(c:Character, c_self:Character):int{
			var ret:int = -1;
			if(c == c_self){
				ret = 5;				
			}else{
				if(c.get_primary_race().get_name() == c_self.get_primary_race().get_name())ret += 2;
				if(c.sex.get_name() == c_self.sex.get_name())ret++;
				//professional courtesy....
				if(c.get_current_class() != null && c_self.get_current_class() != null && c.get_current_class().get_name() == c_self.get_current_class().get_name())ret++;
				if(job != null && c.personality.job != null && job.get_name() == c.personality.job.get_name())ret++;
				if(c.party != null && c.party == c_self.party)ret += 3;
				
				//should be checking for a family relationship here...
				if(c_self.father != null && c_self.mother != null){
					if(c == c_self.mother){
						ret+=5;
					}else if(c == c_self.father){
						ret+=2;
					}else if(c.father == c_self.father || c.mother == c_self.mother || c.father == c_self.mother || c.mother == c_self.father){
						//siblings
						ret+=2;
					}else if(c_self.father.father != null && c_self.mother.father != null && c_self.father.mother != null && c_self.mother.mother != null){
						if(c_self.father.father == c || c_self.father.mother == c || c_self.mother.father == c || c_self.mother.mother == c){
							//grandma/grandpa
							ret++;
						}else if(c_self.father.father == c.father || c_self.father.mother == c.mother || c_self.mother.father == c.father || c_self.mother.mother == c.mother){
							//aunts/uncles
							ret++;
						}//cousins is missing, but it gets really messy
					}
				}
				if(c.get_surname() == c_self.get_surname())ret++;//I dunno, but we have the same last name... so maybe?				
			}			
			return ret;
		}
		*/
		public int determine_attraction(Character c, Character c_self){
			int ret = 0;
			
			int i = 0;
			for(i=0;i<attraction_traits.size();i++){
				if(attraction_traits.get(i).has_trait(c, c_self)){
					ret += attraction_traits.get(i).trait_strength;
				}
			}
			
			for(i=0;i<disgust_traits.size();i++){
				if(disgust_traits.get(i).has_trait(c, c_self)){
					ret -= disgust_traits.get(i).trait_strength;
				}
			}
			
			if(c != null)ret += (c.getStat(FPalaceHelper.sex_appeal_id) - 10);
			
			return ret;
		}
        
        
		public int determine_attraction_challenge(Character c, Character c_self){
			int ret = 1 + determine_attraction(c, c_self);
			//0 = perfect attraction, 100 = disgust
			if(ret > 1){
				ret = Math.round(100/ret);
			}else{
				ret = 100;
			}
			
			return ret;
		}
		/*
		public function determine_orient(new_sex:Sex):void{
			if(new_sex != null){
				var temp:Array = new_sex.get_default_orient_attract();
				if(temp!= null){
					var i:int = 0;
					for(i;i<temp.length;i++){
						if(temp[i] != null && temp[i] is Trait)add_attraction(temp[i]);
					}
				}
				temp = new_sex.get_default_orient_disgust();
				if(temp != null){
					i = 0;
					for(i;i<temp.length;i++){
						if(temp[i] != null && temp[i] is Trait)add_disgust(temp[i]);
					}
				}
			}			
		}
        */
        
		public Boolean relationship_exists(Character c){
			int i= 0;
			Boolean found = false;
			for(i=0;i<relationships.size();i++){
				if(relationships.get(i).relationship_with == c){
					found = true;
					break;
				}
			}
			
			return found;			
        }
        
		/*
		public function change_relationship_type(c:Character, rel_type:int):void{
			var i:int = 0;
			for(i;i<relationships.size();i++){
				if(relationships.get(i).relationship_with == c){
					relationships.get(i).change_type(rel_type);
				}
			}
		}
		*/
		public int check_relationship(Character c, Character c_self){
			int ret = 0;
		    Boolean rel_found = false;
			//if(relationship_exists(c)){
                int i = 0;
                /*TODO Relationships class and arraylist
				for(i=0;i<relationships.size();i++){
					if(relationships.get(i).relationship_with == c){
						rel_found = true;
						ret = relationships.get(i).relationship_status();
						break;						
					}
                }
                */
			//}
			
			if(rel_found)return ret;
			return determine_initial(c, c_self);
		}
		
		public void change_relationship(Character c, Number k,int change_id){
			int i = 0;
			for(i=0;i<relationships.size();i++){
				if(relationships.get(i).relationship_with == c){
					relationships.get(i).apply_change(k, change_id);
					break;
				}
			}
			
			return;
		}
		
		public void make_aggressive(Character c){
			int i = 0;
			for(i=0;i<relationships.size();i++){
				if(relationships.get(i).relationship_with == c){
					relationships.get(i).change_to_aggressive();
					break;
				}
			}
		}
		/*
		public function get_all_relationships(c:Character):String{
			var s:String = "";
			var i:int = 0;
			for(i;i<relationships.size();i++){
				if(relationships.get(i).relationship_with.location == null) s+= "(Dead)";
				s += relationships.get(i).relationship_with.get_name() + " : " + (relationships.get(i).positive - relationships.get(i).negative) + " : " + relationships.get(i).relationship_with.personality.check_relationship(c) + "\n";
			}
			return s;
		}
		
		public function get_damage_mod(id:int):Number{
			var ret:Number = 1;
			var i:int = 0;
			var trait_count:int = 0;
			for(trait_count;trait_count<likes.length;trait_count++){
				i = 0
				for(i;i<likes[trait_count].damage_type_strengths.length;i++){
					if(likes[trait_count].damage_type_strengths[i] == id) ret = ret/2;
				}
				i = 0
				for(i;i<likes[trait_count].damage_type_weaknesses.length;i++){
					if(likes[trait_count].damage_type_weaknesses[i] == id) ret = ret*2;
				}
			}
			trait_count = 0;
			for(trait_count;trait_count<dislikes.length;trait_count++){
				i = 0;
				for(i;i<dislikes[trait_count].damage_type_strengths.length;i++){
					if(dislikes[trait_count].damage_type_strengths[i] == id) ret = ret/2;
				}
				i = 0
				for(i;i<dislikes[trait_count].damage_type_weaknesses.length;i++){
					if(dislikes[trait_count].damage_type_weaknesses[i] == id) ret = ret*2;
				}
			}
			return ret;
		}
		
		public function advance_objectives(action_type:int, change_info:Array, c:Character):void{
			var i:int = 0;
			for(i;i<objectives.size();i++){
				var current_step:int = curr_obj_step.get(i)[curr_obj_step.get(i).length-1];
				if(objectives.get(i).objective_actions[current_step] == action_type || objectives.get(i).objective_actions[current_step] == Quest.no_action){
					if(objectives.get(i).objective_timer[current_step] > -1){
						trace("(Personality.advance_objectives)This is a timed quest... just ignoring it, though... current tick is " + c.get_tick() + " and start tick of the quest step was " + curr_obj_start_tick[i]);
					}
					
					if(action_type == Quest.area_action){
						if(change_info[0] is int && objectives.get(i).objective_targets[current_step][0] is int && change_info[0] == objectives.get(i).objective_targets[current_step][0]){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] = c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get an area id as expected.... " + change_info);
						}
					}else if(action_type == Quest.wait_action){
						if(change_info[0] is Room && objectives.get(i).objective_targets[current_step][0] is Room && change_info[0] == objectives.get(i).objective_targets[current_step][0] && change_info[1] > 0){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a room and wait time as expected.... " + change_info);
						}
					}else if(action_type == Quest.room_action){
						if(change_info[0] is Room && objectives.get(i).objective_targets[current_step][0] is Room && change_info[0] == objectives.get(i).objective_targets[current_step][0]){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a room as expected.... " + change_info);
						}
					}else if(action_type == Quest.class_action){
						if(change_info[0] is Character_class && objectives.get(i).objective_targets[current_step][0] is Character_class && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a Character class as expected.... " + change_info);
						}
					}else if(action_type == Quest.drop_action){
						if(change_info[0] is Item && objectives.get(i).objective_targets[current_step][0] is Item && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get an item as expected.... " + change_info);
						}
					}else if(action_type == Quest.equip_action){
						if(change_info[0] is Equipment && objectives.get(i).objective_targets[current_step][0] is Equipment && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a piece of equipment as expected.... " + change_info);
						}
					}else if(action_type == Quest.hold_action){
						if(change_info[0] is Weapon && objectives.get(i).objective_targets[current_step][0] is Weapon && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a weapon as expected.... " + change_info);
						}
					}else if(action_type == Quest.incapacitate_action){
						if(change_info[0] is Character && objectives.get(i).objective_targets[current_step][0] is Character && change_info[0].get_primary_race().get_name() == objectives.get(i).objective_targets[current_step][0].get_primary_race().get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a character as expected.... or we've got a race missmatch between the targets\nChange Info:" + change_info + "\nObjective target:" + objectives.get(i).objective_targets[curr_obj_step.get(i)]);
						}
					}else if(action_type == Quest.kill_action){
						if(change_info[0] is Character && objectives.get(i).objective_targets[current_step][0] is Character && change_info[0].get_primary_race().get_name() == objectives.get(i).objective_targets[current_step][0].get_primary_race().get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a character as expected.... or we've got a race missmatch between the targets\nChange Info:" + change_info + "\nObjective target:" + objectives.get(i).objective_targets[curr_obj_step.get(i)]);
						}
					}else if(action_type == Quest.part_action){
						if(change_info[0] is Body_part && objectives.get(i).objective_targets[current_step][0] is Body_part && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a body part as expected.... " + change_info);
						}
					}else if(action_type == Quest.party_action){
						if(change_info[0] is Party && objectives.get(i).objective_targets[current_step][0] is Party && change_info[0] == objectives.get(i).objective_targets[current_step][0]){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a party as expected.... " + change_info);
						}
					}else if(action_type == Quest.pick_up_action){
						if(change_info[0] is Item && objectives.get(i).objective_targets[current_step][0] is Item && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get an item as expected.... " + change_info);
						}
					}else if(action_type == Quest.sex_action){
						if(change_info[0] is Sex && objectives.get(i).objective_targets[current_step][0] is Sex && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a gender as expected.... " + change_info);
						}
					}else if(action_type == Quest.skill_action){
						if(change_info[0] is int && objectives.get(i).objective_targets[current_step][0] is int && change_info[0] == objectives.get(i).objective_targets[current_step][0]){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get an skill id as expected.... " + change_info);
						}
					}else if(action_type == Quest.status_add_action){
						if(change_info[0] is Tick_Effect && objectives.get(i).objective_targets[current_step][0] is Tick_Effect && change_info[0] == objectives.get(i).objective_targets[current_step][0]){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a tick effect as expected.... " + change_info);
						}
					}else if(action_type == Quest.status_remove_action){
						if(change_info[0] is int && objectives.get(i).objective_targets[current_step][0] is int && change_info[0] == objectives.get(i).objective_targets[current_step][0]){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a status id as expected.... " + change_info);
						}
					}else if(action_type == Quest.talk_action){
						trace("(Personality.advance_objectives)Shouldn't really ever get this one. Should be dealt with in an Action. " + change_info);
					}else if(action_type == Quest.unequip_action){
						if(change_info[0] is Equipment && objectives.get(i).objective_targets[current_step][0] is Equipment && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a piece of equipment as expected.... " + change_info);
						}
					}else if(action_type == Quest.unhold_action){
						if(change_info[0] is Weapon && objectives.get(i).objective_targets[current_step][0] is Weapon && change_info[0].get_name() == objectives.get(i).objective_targets[current_step][0].get_name()){
							if(objectives.get(i).next_objective[current_step] < 0){
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = current_step+1;
								curr_obj_start_tick[i] =  c.get_tick();
							}else{
								curr_obj_step.get(i)[curr_obj_step.get(i).length] = objectives.get(i).next_objective[curr_obj_step.get(i)];
								curr_obj_start_tick[i] =  c.get_tick();
							}
						}else{
							trace("(Personality.advance_objectives)Didn't get a weapon as expected.... " + change_info);
						}
					}else if(objectives.get(i).objective_actions[current_step] == Quest.no_action){
						trace("(Personality.advance_objectives)This is a no action quest... let's see what kind of info I got: " + change_info);
					}else{
						trace("(Personality.advance_objectives)Got an unknown action type of " + action_type + ". Doing nothing.");			
					}
				}
            }
            
        }
        */

}
