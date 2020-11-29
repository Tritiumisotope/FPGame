package fpgamegithubredux;

import java.util.ArrayList;

public class CharActionObject extends StaticObject {
        protected ArrayList<CharAction> room_actions;
        protected ArrayList<Integer> max_action_times;
        protected ArrayList<Integer> curr_action_times;

		public CharActionObject(){
            room_actions = new ArrayList<>();
            max_action_times = new ArrayList<>();
            curr_action_times = new ArrayList<>();
		}//TODO Verify class functionality
		
		public void add_action(CharAction a, int maxTimes){//default -1
			room_actions.add(a);
			max_action_times.add(maxTimes);
			curr_action_times.add(0);
			
		}
		
		public CharAction get_action(int actionID,Room location){
            curr_action_times.set(actionID, curr_action_times.get(actionID)+1);//curr_action_times[action_id]++
			if(curr_action_times.get(actionID) >= max_action_times.get(actionID)){//[] and []
                location.remove_static_contents(id);
			}
			return room_actions.get(actionID);//[]
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
		public String get_sub_description(int i,int myRoomID){
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
