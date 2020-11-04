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
		
		public String appearance(int i, Character c){//default 0, null
			return name;
		}
		
		public String replace_name(String s, Character c){
			String ret= s;
			String repl_name= name;
			if(c != null && this instanceof Character){//was in
				Character temp_char = (Character)this;
				//repl_name = temp_char.personality.get_name(c, temp_char);
				//TODO character personality
			}
			
			while(ret.indexOf("</n>") >= 0){
				ret = ret.replace("</n>",repl_name);
			}
			
			return ret;
			
		}
}
