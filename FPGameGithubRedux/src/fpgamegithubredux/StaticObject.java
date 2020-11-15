package fpgamegithubredux;

import java.util.ArrayList;

public class StaticObject {
   
		protected int id;
        protected ArrayList<String> descriptions;//public var descriptions:Array
		protected String description;
		
		public StaticObject(){
			this(-1,null,null);
		}
		public StaticObject(int i){
			this(i,null,null);
		}
		public StaticObject(int i, ArrayList<String> descs){
			this(i,descs,null);
		}
		public StaticObject(int i, ArrayList<String> descs, String desc){
            //default -1, null array, null
			if(descs == null){
                descriptions = new ArrayList<>();//descriptions = new Array()
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
			

            ret = ret.replace("</id>",Integer.toString(id));//ret = ret.replace("</id>",id)
			
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
			
            
            ret = ret.replace("</id>",Integer.toString(id));//ret = ret.replace("</id>",id)
			return ret;
		}
		
		public void add_sub_descriptions(String s){
            descriptions.add(s);//descriptions[descriptions.length] = s
		}
        
		 
}
