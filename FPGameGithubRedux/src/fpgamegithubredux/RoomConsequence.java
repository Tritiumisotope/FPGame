package fpgamegithubredux;

import java.util.ArrayList;

public class RoomConsequence extends Consequence{
    	
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
            actions_to_add.set(actions_to_add.size(),a);//actions_to_add[actions_to_add.length] = a
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
        
		/*TODO
        @Override 
        public String trigger(r:Number, c:Character = null, c2:Character = null){
			var ret:String = super.trigger(r,c,c2);
			if((  !never_change && ((!change_on_success && r >= 0) || (change_on_success && r < 0))  || always_change)){
				var i:int = 0;
				if (move_room != null && join_room == null && join_area < 0){
					if(move_room.description == "temp"){
						//character is running away...
						if(!never_move)ret += c2.new_location(c.location.get_exit(Math.random()*c.location.exits.length));
					}else{
						if(ret.indexOf("</c") >= 0){
							trace("(Room_Consequence)may be making a mistake moving this character... there are still more things to do with this Action/Consequence. ");
							//Kind of want to "hold" the move until we're actually done with the action...
							//maybe have a "once the character is no longer "busy" *then* they can move
						}
						if(!never_move)ret += c.new_location(move_room);
					}
				}else if(move_room != null && (join_room != null || join_area >= 0)){
					var temp_join_room:Room = join_room;
					
					if(join_area >= 0){
						if(move_room.area.world.areas[join_area] != null && temp_join_room == null){
							temp_join_room = move_room.area.world.areas[join_area].get_connect_room();
							if(temp_join_room == null) temp_join_room = move_room.area.world.areas[join_area].get_random_room();
						}
					}
					
					if(temp_join_room.area == null){
						trace("(Room_Consequence)Joining a room with no area... should be adding it to the current rooms area, but doing nothing instead.");
					}
					
					//check to see if the two rooms are already connected...
					if(temp_join_room.get_exit_id(move_room) >= 0 && move_room.get_exit_id(temp_join_room) >= 0){
						room_effect_exit_name_from = move_room.get_exit_name(temp_join_room);
						room_effect_exit_name_to = temp_join_room.get_exit_name(move_room);
						move_room.remove_exit(temp_join_room);
						temp_join_room.remove_exit(move_room);
					}else{
						if (room_effect_exit_name_from == null){
							move_room.new_exit(temp_join_room);
							room_effect_exit_name_from = move_room.get_exit_name(temp_join_room);
							room_effect_exit_name_to = temp_join_room.get_exit_name(move_room);
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
					i = 0;
					for (i;i<containers.length;i++){
						join_room.new_static_content(containers[i]);
					}
				}else if(move_room == null && move_area >= 0){
					if(c.location != null){
						if(c.location.area != null){
							move_room = c.location.area.world.areas[move_area].get_random_room();
							if(!never_move)c.new_location(move_room);
						}
					}
				}else if(move_room == null && join_room == null && actions_to_add[0] != null){
					var temp_room:Room = c.location;
					i = 0;
					for(i;i<actions_to_add.length;i++){
						if(actions_to_add[i] != null){
							temp_room.new_static_content(actions_to_add[i]);
						}
					}
				}
				
				if(floor_to_generate != -2){
					var last_room:Room = move_room;
					if(last_room == null) last_room = c.location;
					var exempt_rooms:Array = new Array();
					exempt_rooms = exempt_rooms.concat(c.location.area.room_list);
					if(exempt_rooms.indexOf(last_room) >= 0)exempt_rooms = exempt_rooms.slice(0,exempt_rooms.indexOf(last_room)).concat(exempt_rooms.slice(exempt_rooms.indexOf(last_room)+1,exempt_rooms.length));
					var template_count:int = 0;
					for(template_count;template_count<c.location.area.template_rooms.length;template_count++){
						var template:Template_Room = null;						
						if(c.location.area.template_floor_range[template_count] == null){
							template = c.location.area.template_rooms[template_count];
						}else{
							 if(c.location.area.template_floor_range[template_count][0] < 0 || c.location.area.template_floor_range[template_count][0] <= Math.abs(floor_to_generate)){
								 if(c.location.area.template_floor_range[template_count][1] < 0 || c.location.area.template_floor_range[template_count][1] >= Math.abs(floor_to_generate)){
									 template = c.location.area.template_rooms[template_count];
								 }
							 }							 
						}
							
						if(template != null){
							//should be generating more than just one of these... and making sure it's within the existing limits of the map
							var room_count:int = (c.location.area.rooms.length * c.location.area.rooms[0].length)/2;//I really don't know what this number should be...
							var x:int = 0;
							for(x;x<room_count;x++){
								var new_room:Room = template.make_room(Math.abs(c.location.area.get_base_floor() - floor_to_generate));
								new_room.area = c.location.area;
								new_room.set_id(c.location.area.room_list.length);
								if(c.location.area.place_room(new_room, last_room,-1,exempt_rooms,true)>=0){
									c.location.area.room_list[c.location.area.room_list.length] = new_room;
									last_room = new_room;									
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
        */
        /*TODO
		override public function clone():Consequence{
			var ret:Room_Consequence = new Room_Consequence();
			ret.stat_effected = this.stat_effected;
			ret.consequence = this.consequence;
			var i:int = 0;
			for(i;i<this.consequence_description.length;i++){
				ret.consequence_description[i] = this.consequence_description[i];
			}
			
			ret.roll_required = this.roll_required;
			ret.show_effects = this.show_effects;
			ret.temp_flag = this.temp_flag;
			ret.amt_by_roll = this.amt_by_roll;
			ret.amt_formula = this.amt_formula;
			ret.random_effect = this.random_effect;
			ret.consequence_tick_effect = this.consequence_tick_effect;
			ret.change_on_success = this.change_on_success;
			ret.always_change = this.always_change;
			ret.never_change = this.never_change;
			ret.change_effects = this.change_effects;
			ret.action_for_stat = this.action_for_stat;
			ret.consequence_challenge = this.consequence_challenge;
			ret.xp_reward = this.xp_reward;
			ret.un_equip_slots = this.un_equip_slots;
			ret.un_equip_target = this.un_equip_target;
			ret.impregnate = this.impregnate;
			ret.consume = this.consume;
			ret.extract = this.extract;
			ret.consequence_target = this.consequence_target;
			ret.make_party = this.make_party;
			ret.remove_party = this.remove_party;
			ret.max_damage = this.max_damage;
			ret.target_part = this.target_part;
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
        */

}
