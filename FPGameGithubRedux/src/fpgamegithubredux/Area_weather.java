package fpgamegithubredux;

import java.util.ArrayList;

public class Area_weather {
    
		ArrayList<String> daytime_status;//public var daytime_status:Array
		ArrayList<Integer> daytime_status_time;//public var daytime_status_time:Array
		
		public int min_tick;

		public Area_weather(){
			// constructor code
			daytime_status = new ArrayList<>();
			daytime_status_time = new ArrayList<>();
			min_tick = 1;
		}
		
		public void set_minimum_length(int i){
			min_tick = i;
		}
		
		public int get_min_length(){
			return min_tick;
		}
		
		public void new_daytime_status(String stat, int time){
            daytime_status.add(stat); //daytime_status[daytime_status.length] = stat
            daytime_status_time.add(time);//daytime_status_time[daytime_status_time.length] = time
		}
		
		public String get_description(int currentDayCount){
			String ret = "";
			int i = 0;
			for(i=0;i<daytime_status.size();i++){
				if(currentDayCount >= daytime_status_time.get(i))ret = daytime_status.get(i);
			}
			return ret;
		}
}
