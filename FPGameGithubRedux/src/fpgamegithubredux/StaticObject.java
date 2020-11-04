package fpgamegithubredux;

import java.util.ArrayList;

public class StaticObject {
   
		public int id;
        //public var descriptions:Array;
        public ArrayList<String> descriptions;
		public String description;
		
				
		public void Static_object(int i, ArrayList<String> descs, String desc){
            //default -1, null array, null
			if(descs == null){
                //descriptions = new Array();
                descriptions = new ArrayList<String>();
			}else{
				descriptions = descs;
			}
			description = desc;
			id = i;
		}
		
		public void set_description(String d){
			description = d;
		}
		
		public void set_id(int i){
			id = i;
		}
		
		public String get_description(){
			String ret = description;
			int i = 0;
			for(i=0; i<descriptions.size();i++){//.length
			 	ret = ret.replace("<s"+i+">","<a href=\"event:inspect,</id>," + Integer.toString(i) +"\"><i>");//was String()
				ret = ret.replace("</s"+i+">","</i></a>");
			}
			
            //ret = ret.replace("</id>",id);
            ret = ret.replace("</id>",Integer.toString(id));
			
			return ret;
		}
		
		public String get_sub_description(int j, int k){
			String ret = "";
			int i;
			
			if (j < descriptions.size() && j >= 0){//.length
				ret = descriptions.get(j);//[]
			} else {
				return ret;
			}
			
			for(i=0; i<descriptions.size();i++){//.length
			 	ret = ret.replace("<s"+i+">","<a href=\"event:inspect,</id>," + Integer.toString(i) +"\"><i>");// was String()
				ret = ret.replace("</s"+i+">","</i></a>");
			}
			
            //ret = ret.replace("</id>",id);
            ret = ret.replace("</id>",Integer.toString(id));
			
			return ret;
		}
		
		public void add_sub_descriptions(String s){
            //descriptions[descriptions.length] = s;
            descriptions.set(descriptions.size(), s);
		}
        
		 
}
