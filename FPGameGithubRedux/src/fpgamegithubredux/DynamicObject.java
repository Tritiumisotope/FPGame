package fpgamegithubredux;

public class DynamicObject {
    	
		public String name;

        public void Dynamic_object(){
            Dynamic_object("");
        }
		public void Dynamic_object(String n) {//default ""
			name = n;
		}
		
		public void set_name(String n){
			name = n;
		}
		
		public String getName(){
			return name;
		}
		public String appearance(){
			return appearance(0,null);
		}
		public String appearance(int i){
			return appearance(i,null);
		}
		public String appearance(int i, Character c){//default 0, null
			return name;
		}
		
		public String replace_name(String s, Character c){
			String ret= s;
			String replName= name;
			if(c != null && this instanceof Character){//was in
				Character tempChar = (Character)this;
				replName = tempChar.personality.get_name(c, tempChar);
			}
			
			while(ret.indexOf("</n>") >= 0){
				ret = ret.replace("</n>",replName);
			}
			
			return ret;
			
		}
}
