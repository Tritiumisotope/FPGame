package fpgamegithubredux;

import java.util.ArrayList;

public class CharActionObject extends StaticObject {
    		/*
		public var room_actions:Array;
		public var max_action_times:Array;
		public var curr_action_times:Array;
        */
        public ArrayList<CharAction> room_actions;
        public ArrayList<Integer> max_action_times;
        public ArrayList<Integer> curr_action_times;

		public CharActionObject(){
            room_actions = new ArrayList<>();
            max_action_times = new ArrayList<>();
            curr_action_times = new ArrayList<>();
		}
		
		public void add_action(CharAction a, int max_times){//default -1
			room_actions.set(room_actions.size(), a );//[], .length
            //max_action_times[max_action_times.length] = max_times;
            max_action_times.set(max_action_times.size(),max_times);
            //curr_action_times[curr_action_times.length] = 0;
            curr_action_times.set(curr_action_times.size(), 0);
		}
		
		public CharAction get_action(int action_id,Room location){
            //curr_action_times[action_id]++;
            curr_action_times.set(action_id, curr_action_times.get(action_id)+1) ;
			if(curr_action_times.get(action_id) >= max_action_times.get(action_id)){//[] and []
                //location.remove_static_contents(id);
                //TODO method
			}
			return room_actions.get(action_id);//[]
		}
		/*
		override public function get_description():String{
			var ret:String = super.get_description();
			
			var count:int = 0;
			for(count;count<room_actions.length;count++){
				ret = ret.replace("<a"+count+">","<a href=\"event:action,"+(-2-id)+"," + String(count) +"\"><i>"+ room_actions[count].get_name() +"</i></a>"); 
			}
			
			return ret;
		}
		
		override public function get_sub_description(i:int, my_room_id:int):String{
			var s:String = "";
			if (i < descriptions.length && i >= 0) s += descriptions[i]+ "\n";
			
			var count:int = 0;
			for(count;count<room_actions.length;count++){
				s = s.replace("<a"+count+">","<a href=\"event:action,"+(-2-id)+"," + String(count) +"\"><i>"+ room_actions[count].get_name() +"</i></a>"); 
			}
			
			return s;
		}
		
		public function clone(c:Action_object):void{
			this.description = c.description;
			this.descriptions = c.descriptions;
			this.room_actions = c.room_actions;
			this.max_action_times = c.max_action_times;
			this.curr_action_times = c.curr_action_times;
        }
        */

}
