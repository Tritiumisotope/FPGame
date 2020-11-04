package fpgamegithubredux;

import java.util.ArrayList;

public class BodyPartState {
    
        public Number mod;

        public String[] descriptions;//public var descriptions:Array
        public int[] mod_changes;//was Number[] public var mod_changes:Array
        public int[] comparisons;//was number[] public var comparisons:Array
        public String[] outputs;//public var outputs:Array
        public Boolean[] rat_stat_id;//public var rat_stat_id:Array
        public Boolean[] mod_stat_id;//public var mod_stat_id:Array
        public int[] ratio_stat;//public var ratio_stat:Array
		public Boolean[] static_ratio_stat;//public var static_ratio_stat:Array
        protected String[] operations;//public var operations:Array
        protected ArrayList<Integer> stat_effected;//public var stat_effected:Array
		
		public BodyPartState(){
			// constructor code
            mod = 1.0;
            

            stat_effected = new ArrayList<>();
            
		}
		
		public Number get_state_mod(int i){
			int k = 0;
			for (k=0;k< stat_effected.size();k++){//.length
				
				if(i == stat_effected.get(k)){//[]
					
					return mod;
				}
			}
			
			//if we didn't set a stat to effect, should effect all of them
			if (stat_effected == null) return mod;//[]]
			
			return 1;
		}
		public void new_ratio_stat(int i){
            new_ratio_stat(i, false);
        }
		public void new_ratio_stat(int i,Boolean static_val){
			ratio_stat[ratio_stat.length] = i;
			static_ratio_stat[static_ratio_stat.length] = static_val;
		}
		public void new_comparison(String op, Number rat, Number mo,
         String out){
			new_comparison(op,rat,mo,out,"",false,false);
		 }
		public void new_comparison(String op, Number rat, Number mo,
         String out, String desc){
			 new_comparison(op,rat,mo,out,desc,false,false);
		 }
		 public void new_comparison(String op, Number rat, Number mo,
         String out, String desc,Boolean rat_is_stat_id){
			new_comparison(op,rat,mo,out,desc,rat_is_stat_id,false);
		 }
        public void new_comparison(String op, Number rat, Number mo,
         String out, String desc,Boolean rat_is_stat_id,Boolean mod_is_stat_id){//default ">=", 0,1,"","",false, false
			operations[operations.length] = op;
			comparisons[comparisons.length] = rat.intValue();
			mod_changes[mod_changes.length] = mo.intValue();
			outputs[outputs.length] = out;
			descriptions[descriptions.length] = desc;
			rat_stat_id[rat_stat_id.length] = rat_is_stat_id;
			mod_stat_id[mod_stat_id.length] = mod_is_stat_id;
		}
		
		public void set_stat_effected(int i){
			
			stat_effected.set(stat_effected.size(), i);//[] = i
			
		}
		
		public String get_current_state_description(Character c,BodyPart bp){
			String s = "";
			double operator= 1;//was number
			if(static_ratio_stat[0]){
				operator = ratio_stat[0];
			}else{
				operator = bp.get_stat(c, ratio_stat[0]).doubleValue();
				if(operator < 0 && c != null)operator = c.getStat(ratio_stat[0]);
			}
			double denominator = 1;//was Number
			if(static_ratio_stat[1]){
				denominator = ratio_stat[1];
			}else{
				denominator = bp.get_stat(c, ratio_stat[1]).doubleValue();
				if(denominator <= 0 && c != null)denominator = c.getStat(ratio_stat[1]);
			}
			int i = 0;
			for (i=0;i<outputs.length;i++){
			    double mod_use = mod_changes[i];//was Number
				if(mod_stat_id[i] && c != null){
					mod_use = bp.get_stat(c, mod_changes[i]).intValue();
					if(mod_use < 0)mod_use = c.getStat(mod_changes[i]);
				}
				
				double compare_use= comparisons[i];//was Number
				if(rat_stat_id[i] && c != null){
					compare_use = bp.get_stat(c, comparisons[i]).doubleValue();
					if(compare_use < 0)compare_use = c.getStat(comparisons[i]);
				}
				if(c != null && mod_changes[i] == -1)mod_use = compare_use + operator/denominator;
				if (mod.doubleValue() != mod_use)mod = mod_use;
				if (operations[i].equals(">=")){//==
					if(operator/denominator >= compare_use){
						return descriptions[i];
					}
				}else if(operations[i].equals("<=")){
					if(operator/denominator <= compare_use){
						return descriptions[i];
					}
				}else if(operations[i].equals("==")){
					if(operator/denominator == compare_use){
						return descriptions[i];
					}
				}else if(operations[i].equals("<")){
					if(operator/denominator < compare_use){
						return descriptions[i];
					}
				}else if(operations[i].equals(">")){
					if(operator/denominator > compare_use){
						return descriptions[i];
					}
				}else if(operations[i].equals("!=")){
					if(operator/denominator != compare_use){
						return descriptions[i];
					}
				}else{
					//trace("(Body_part_state.get_current_state_description)Got " + operations[i] + " as an operation and don't know what to do. Just returning description.")
					return descriptions[i];
				}
			}
			
			return s;
		}
		
		public String get_state_description(Character c, BodyPart bp){
				//we have seven things we need here...
				//the stats (2) - Done!
				
				//the operator (1) - tempted to leave this always as devisor
				
				//these all need to be grouped together... - this... may be done...
				//the comparison (1)
				//the comparitor (1)
				//the output(1)
				//the change to the modifier(may need to have multiple modifiers... one for each stat!)
                double operator = 1;//Number
                double denominator = 1;//Number
				if(static_ratio_stat[0]){
                    operator = ratio_stat[0];
                    denominator = (double)bp.get_stat(c, ratio_stat[1]);
					if(denominator <= 0)denominator = c.getStat(ratio_stat[1]); 
				}else{
                    //operator = bp.get_stat(c, ratio_stat[0]).intValue()
                    denominator = ratio_stat[1];
					if(bp.get_stat(c, ratio_stat[0]).intValue() < 0)operator = c.getStat(ratio_stat[0]);
				}
				/*TODO check if simplified by above changes
				if(static_ratio_stat[1]){
					denominator = ratio_stat[1];
				}else{
					denominator = (double)bp.get_stat(c, ratio_stat[1]);
					if(denominator <= 0)denominator = c.getStat(ratio_stat[1]); 
                }
                */
				int i = 0;
				String s = "";
				for(i=0;i<operations.length;i++){
				    int compare_use = comparisons[i];//Number
					if(rat_stat_id[i]){
						compare_use = bp.get_stat(c, comparisons[i]).intValue();
						if(compare_use < 0)compare_use = (int)c.getStat(comparisons[i]);
					}
					int mod_use = mod_changes[i];//number
					if(mod_stat_id[i]){
						mod_use = bp.get_stat(c, mod_changes[i]).intValue();
						if(mod_use < 0)mod_use = (int)c.getStat(mod_changes[i]);
					}					
					
					if (operations[i].equals(">=")){
						if(operator/denominator >= compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals("<=")){
						if(operator/denominator <= compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals("==")){
						if(operator/denominator == compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals("<")){
						if(operator/denominator < compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals(">")){
						if(operator/denominator > compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals("!=")){
						if(operator/denominator != compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals("^")){
						if(mod.intValue() < compare_use + operator/denominator){
							if(mod.intValue() != compare_use + operator/denominator && mod.intValue() != mod_use){
								if(mod_changes[i] == -1){
									mod = compare_use + operator/denominator;
								}else{
									mod = mod_use;
								}
								s += outputs[i];
							}
							return s;
						}
					}else if(operations[i].equals("v")&&mod.intValue() > compare_use + operator/denominator && mod.intValue() != mod_use){
						
							if(mod.intValue() != compare_use + operator/denominator){
								if(mod_use == -1){
									mod = compare_use + operator/denominator;
								}else{
									mod = mod_use;
								}
								s += outputs[i];
							}
							return s;
						
					}
				}
				return s;
		}
		
		public void clone(BodyPartState ps){
			ratio_stat = ps.ratio_stat;
			static_ratio_stat = ps.static_ratio_stat;
			operations = ps.operations;
			comparisons = ps.comparisons;
			mod_changes = ps.mod_changes;
			outputs = ps.outputs;
			descriptions = ps.descriptions;
			stat_effected = ps.stat_effected;
			rat_stat_id = ps.rat_stat_id;
			mod_stat_id = ps.mod_stat_id;
		}
        
}
