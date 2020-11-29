package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

public class RoomConsequence extends Consequence{
		private static final Logger LOGGER = Logger.getLogger(RoomConsequence.class.getName());
    	
		public Room move_room;
		public Room join_room;
		public int move_area;
		public int join_area;
		public int floor_to_generate;
		public String room_effect_exit_name_from;
		public String room_effect_exit_name_to;
        public ArrayList<Container> containers;//public var containers:Array
		public ArrayList<CharActionObject> actions_to_add;//public var actions_to_add:Array
		public Boolean never_move;
		
		public RoomConsequence() {
			// constructor code
			super();
			move_room = null;
			join_room = null;
			move_area = -1;
			join_area = -1;
			floor_to_generate = -2;
			room_effect_exit_name_from = null;
			room_effect_exit_name_to = null;
			containers = new ArrayList<>();
			actions_to_add = new ArrayList<>();
			never_move = false;
		}
		
		public void set_never_move(){
			never_move = !never_move;
		}
		
		public void add_room_action(CharActionObject a){
            actions_to_add.add(a);//actions_to_add[actions_to_add.length] = a
		}
		public void generate_new_floor(){
            generate_new_floor(0);
        }
		public void generate_new_floor(int floor_num){//default 0
			floor_to_generate = floor_num;
		}
		
		public void set_join_area(int i){//default -1
			join_area = i;
		}
		
		public void set_move_area(int i){//default -1
			move_area = i;
		}
		public void add_room_effect(){
			add_room_effect(null,null,null,null);
		}

		public void add_room_effect(Room r1){
			add_room_effect(r1,null,null,null);
		}
		public void add_room_effect(Room r1,Room r2){
			add_room_effect(r1,r2,null,null);
		}
		public void add_room_effect(Room r1,Room r2, String s, String s2){
            //default null,null,null,null
			if(r1 == null) r1 = new Room("temp");
			move_room = r1;
			if(r2 != null) join_room = r2;
			if (s != null) room_effect_exit_name_from = s;
			if(s2 != null) room_effect_exit_name_to = s2;
		}
		
		public void add_container_creation(Container c, Room r){
			containers.add(c); //containers[containers.length] = c
			join_room = r;
        }
		@Override 
        public String trigger(Number r){
			return trigger(r,null,null);
		}
		@Override 
        public String trigger(Number r, Character c){
			return trigger(r, c,null);
		}
        @Override 
        public String trigger(Number r, Character c, Character c2){//def c, c2
			String ret = super.trigger(r,c,c2);
			if((  !never_change && ((!change_on_success && r.doubleValue() >= 0) || (change_on_success && r.doubleValue() < 0))  || always_change)){
				int i = 0;
				if (move_room != null && join_room == null && join_area < 0){
					if(move_room.description.equals("temp")){
						//character is running away...
						if(!never_move)ret += c2.new_location(c.location.get_exit((int)Math.random()*c.location.exits.size()));
					}else{
						if(ret.indexOf("</c") >= 0){
							LOGGER.info("(Room_Consequence)may be making a mistake moving this character... there are still more things to do with this Action/Consequence. ");
							//Kind of want to "hold" the move until we're actually done with the action...
							//maybe have a "once the character is no longer "busy" *then* they can move
						}
						if(!never_move)ret += c.new_location(move_room);
					}
				}else if(move_room != null && (join_room != null || join_area >= 0)){
					Room temp_join_room = join_room;
					
					if(join_area >= 0){
						if(move_room.area.world.areas.get(join_area) != null && temp_join_room == null){
							temp_join_room = move_room.area.world.areas.get(join_area).get_connect_room();
							if(temp_join_room == null) temp_join_room = move_room.area.world.areas.get(join_area).get_random_room();
						}
					}
					
					if(temp_join_room.area == null){
						LOGGER.info("(Room_Consequence)Joining a room with no area... should be adding it to the current rooms area, but doing nothing instead.");
					}
					
					//check to see if the two rooms are already connected...
					if(temp_join_room.get_exit_id(move_room) >= 0 && move_room.get_exit_id(temp_join_room) >= 0){
						room_effect_exit_name_from = move_room.getExitName(temp_join_room);
						room_effect_exit_name_to = temp_join_room.getExitName(move_room);
						move_room.remove_exit(temp_join_room);
						temp_join_room.remove_exit(move_room);
					}else{
						if (room_effect_exit_name_from == null){
							move_room.new_exit(temp_join_room);
							room_effect_exit_name_from = move_room.getExitName(temp_join_room);
							room_effect_exit_name_to = temp_join_room.getExitName(move_room);
						}else{
							move_room.new_exit(temp_join_room,room_effect_exit_name_from);
							if(room_effect_exit_name_to == null){
								temp_join_room.new_exit(move_room, room_effect_exit_name_from);
								room_effect_exit_name_to = room_effect_exit_name_from;
							}else{
								temp_join_room.new_exit(move_room, room_effect_exit_name_to);
							}
						}
						if(move_room.area != null)move_room.area.get_map(1);
						if(temp_join_room.area != null)temp_join_room.area.get_map(1);
						if(join_room != temp_join_room)join_room = temp_join_room;
					}
				}else if(move_room == null && join_room != null){
					for (i=0;i<containers.size();i++){
						join_room.new_static_content(containers.get(i));
					}
				}else if(move_room == null && move_area >= 0){
					if(c.location != null){
						if(c.location.area != null){
							move_room = c.location.area.world.areas.get(move_area).get_random_room();
							if(!never_move)c.new_location(move_room);
						}
					}
				}else if(move_room == null && join_room == null && actions_to_add.get(0) != null){
					Room temp_room = c.location;
					for(i=0;i<actions_to_add.size();i++){
						if(actions_to_add.get(i) != null){
							temp_room.new_static_content(actions_to_add.get(i));
						}
					}
				}
				
				if(floor_to_generate != -2){
					Room last_room = move_room;
					if(last_room == null) last_room = c.location;
					ArrayList<Room> exempt_rooms = new ArrayList<>();//was array
					exempt_rooms.addAll(c.location.area.room_list);// = exempt_rooms.concat(c.location.area.room_list)
					if(exempt_rooms.indexOf(last_room) >= 0)exempt_rooms.remove(exempt_rooms.indexOf(last_room));//exempt_rooms = exempt_rooms.slice(0,exempt_rooms.indexOf(last_room)).concat(exempt_rooms.slice(exempt_rooms.indexOf(last_room)+1,exempt_rooms.length))
					int template_count = 0;
					for(template_count=0;template_count<c.location.area.templateRooms.size();template_count++){
						Template_Room template = null;						
						if(c.location.area.templateFloorRange.get(template_count) == null){
							template = c.location.area.templateRooms.get(template_count);
						}else{
							 if(c.location.area.templateFloorRange.get(template_count).get(0) < 0 || c.location.area.templateFloorRange.get(template_count).get(0) <= Math.abs(floor_to_generate)){
								 if(c.location.area.templateFloorRange.get(template_count).get(1) < 0 || c.location.area.templateFloorRange.get(template_count).get(1) >= Math.abs(floor_to_generate)){
									 template = c.location.area.templateRooms.get(template_count);
								 }
							 }							 
						}
							
						if(template != null){
							//should be generating more than just one of these... and making sure it's within the existing limits of the map
							int room_count = (c.location.area.rooms.size() * c.location.area.rooms.get(0).size())/2;//I really don't know what this number should be...
							int x = 0;
							for(x=0;x<room_count;x++){
								Room newRoom = template.make_room(Math.abs(c.location.area.get_base_floor() - floor_to_generate));
								newRoom.area = c.location.area;
								newRoom.set_id(c.location.area.room_list.size());
								if(c.location.area.place_room(newRoom, last_room,-1,exempt_rooms,true)>=0){
									c.location.area.room_list.add(newRoom);//c.location.area.room_list.get(c.location.area.room_list.size()) = new_room
									last_room = newRoom;									
								}
							}
						}
					}
					
					c.location.area.filler_area(floor_to_generate);
					floor_to_generate = -2;
				}
			}
			return ret;
		}
        

		@Override 
		public Consequence copyConsequence(){
			RoomConsequence ret = new RoomConsequence();
			ret.statEffected = this.statEffected;
			ret.conseq = this.conseq;
			ret.consequenceDescription = new ArrayList<>(this.consequenceDescription);
			
			ret.roll_required = this.roll_required;
			ret.showEffects = this.showEffects;
			ret.tempFlag = this.tempFlag;
			ret.amt_by_roll = this.amt_by_roll;
			ret.amt_formula = this.amt_formula;
			ret.random_effect = this.random_effect;
			ret.consequenceTickEffect = this.consequenceTickEffect;
			ret.change_on_success = this.change_on_success;
			ret.always_change = this.always_change;
			ret.never_change = this.never_change;
			ret.change_effects = this.change_effects;
			ret.action_for_stat = this.action_for_stat;
			ret.consequenceChallenge = this.consequenceChallenge;
			ret.xp_reward = this.xp_reward;
			ret.un_equip_slots = this.un_equip_slots;
			ret.un_equip_target = this.un_equip_target;
			ret.impregnate = this.impregnate;
			ret.consume = this.consume;
			ret.extract = this.extract;
			ret.consequenceTarget = this.consequenceTarget;
			ret.make_party = this.make_party;
			ret.remove_party = this.remove_party;
			ret.max_damage = this.max_damage;
			ret.targetPart = this.targetPart;
			ret.remove_effect_ids = this.remove_effect_ids;
			ret.interupt_chal = this.interupt_chal;
			ret.char_effect = this.char_effect;
			
			ret.move_room = this.move_room;
			ret.join_room = this.join_room;
			ret.move_area = this.move_area;
			ret.join_area = this.join_area;
			ret.room_effect_exit_name_from = this.room_effect_exit_name_from;
			ret.room_effect_exit_name_to = this.room_effect_exit_name_to;
			ret.containers = this.containers;
			ret.actions_to_add = this.actions_to_add;
			ret.never_move = this.never_move;
			return ret;
        }
}
