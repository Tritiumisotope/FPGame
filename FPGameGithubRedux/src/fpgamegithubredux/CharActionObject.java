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
		}//TODO overwrite last or add?!
		
		public CharAction get_action(int action_id,Room location){
            //curr_action_times[action_id]++;
            curr_action_times.set(action_id, curr_action_times.get(action_id)+1) ;
			if(curr_action_times.get(action_id) >= max_action_times.get(action_id)){//[] and []
                //location.remove_static_contents(id);
                //TODO method
			}
			return room_actions.get(action_id);//[]
		}
		
		@Override
		public String get_description(){
			String ret = super.get_description();
			
			for(int count=0;count<room_actions.size();count++){
				ret = ret.replace("<a"+count+">","<a href=\"event:action,"+(-2-id)+"," + Integer.toString(count) +"\"><i>"+ room_actions.get(count).getName() +"</i></a>"); 
			}
			return ret;
		}
		
		@Override 
		public String get_sub_description(int i,int my_room_id){
			String s = "";
			if (i < descriptions.size() && i >= 0) s += descriptions.get(i)+ "\n";
			
			for(int count = 0;count<room_actions.size();count++){
				s = s.replace("<a"+count+">","<a href=\"event:action,"+(-2-id)+"," + Integer.toString(count) +"\"><i>"+ room_actions.get(count).getName() +"</i></a>"); 
			}
			
			return s;
		}
		
		public void clone(CharActionObject c){
			this.description = c.description;
			this.descriptions = c.descriptions;
			this.room_actions = c.room_actions;
			this.max_action_times = c.max_action_times;
			this.curr_action_times = c.curr_action_times;
        }
}
