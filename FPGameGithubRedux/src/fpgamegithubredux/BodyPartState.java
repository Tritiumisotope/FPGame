package fpgamegithubredux;

import java.util.ArrayList;

public class BodyPartState {
    
        protected Number mod;

        protected ArrayList<String> descriptions;//protected var descriptions:Array
        protected ArrayList<Integer> mod_changes;//was Number[] protected var mod_changes:Array
        protected ArrayList<Integer> comparisons;//was number[] protected var comparisons:Array
        protected ArrayList<String> outputs;//protected var outputs:Array
        protected ArrayList<Boolean> rat_stat_id;//protected var rat_stat_id:Array
        protected ArrayList<Boolean> mod_stat_id;//protected var mod_stat_id:Array
		protected ArrayList<Integer> ratio_stat;//protected var ratio_stat:Array
		//TODO double check ratio_stat only ever has two elements!
		protected ArrayList<Boolean> static_ratio_stat;//protected var static_ratio_stat:Array
        protected ArrayList<String> operations;//protected var operations:Array
        protected ArrayList<Integer> stat_effected;//protected var stat_effected:Array
		
		public BodyPartState(){
			// constructor code
            mod = 1.0;
            
			ratio_stat = new ArrayList<>();
			static_ratio_stat = new ArrayList<>();
			operations = new ArrayList<>();
			comparisons = new ArrayList<>();
			mod_changes = new ArrayList<>();
			outputs = new ArrayList<>();
			descriptions = new ArrayList<>();
			stat_effected = new ArrayList<>();
			rat_stat_id = new ArrayList<>();
			mod_stat_id = new ArrayList<>();
            
		}
		
		public Number get_state_mod(int i){
			int k = 0;
			for (k=0;k< stat_effected.size();k++){//.length
				
				if(i == stat_effected.get(k)){//[]
					
					return mod;
				}
			}
			
			//if we didn't set a stat to effect, should effect all of them
			if (stat_effected.get(0) == null) return mod;//[]]
			
			return 1;
		}
		public void new_ratio_stat(int i){
            new_ratio_stat(i, false);
        }
		public void new_ratio_stat(int i,Boolean static_val){
			ratio_stat.add(i); //ratio_stat[ratio_stat.length] = i
			static_ratio_stat.add(static_val); //static_ratio_stat[static_ratio_stat.length] = static_val
		}//TODO figure out why there is an add
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
			operations.add(op); //operations[operations.length] = op
			comparisons.add(rat.intValue()); //comparisons[comparisons.length] = rat.intValue()
			mod_changes.add(mo.intValue()); //mod_changes[mod_changes.length] = mo.intValue()
			outputs.add(out); //outputs[outputs.size()] = out
			descriptions.add(desc);//descriptions[descriptions.length] = desc
			rat_stat_id.add(rat_is_stat_id); //rat_stat_id[rat_stat_id.length] = rat_is_stat_id
			mod_stat_id.add(mod_is_stat_id); //mod_stat_id[mod_stat_id.length] = mod_is_stat_id
		}
		
		public void set_stat_effected(int i){
			stat_effected.add(i);//stat_effected[stat_effected.length] = i
		}
		
		public String get_current_state_description(Character c,BodyPart bp){
			String s = "";
			double operator= 1;//was number
			if(static_ratio_stat.get(0)){
				operator = ratio_stat.get(0);
			}else{
				operator = bp.get_stat(c, ratio_stat.get(0)).doubleValue();
				if(operator < 0 && c != null)operator = c.getStat(ratio_stat.get(0));
			}
			double denominator = 1;//was Number
			if(static_ratio_stat.get(1)){
				denominator = ratio_stat.get(1);
			}else{
				denominator = bp.get_stat(c, ratio_stat.get(1)).doubleValue();
				if(denominator <= 0 && c != null)denominator = c.getStat(ratio_stat.get(1));
			}
			int i = 0;
			for (i=0;i<outputs.size();i++){
			    double mod_use = mod_changes.get(i);//was Number
				if(mod_stat_id.get(i) && c != null){
					mod_use = bp.get_stat(c, mod_changes.get(i)).intValue();
					if(mod_use < 0)mod_use = c.getStat(mod_changes.get(i));
				}
				
				double compare_use= comparisons.get(i);//was Number
				if(rat_stat_id.get(i) && c != null){
					compare_use = bp.get_stat(c, comparisons.get(i)).doubleValue();
					if(compare_use < 0)compare_use = c.getStat(comparisons.get(i));
				}
				if(c != null && mod_changes.get(i) == -1)mod_use = compare_use + operator/denominator;
				if (mod.doubleValue() != mod_use)mod = mod_use;
				if (operations.get(i).equals(">=")){//==
					if(operator/denominator >= compare_use){
						return descriptions.get(i);
					}
				}else if(operations.get(i).equals("<=")){
					if(operator/denominator <= compare_use){
						return descriptions.get(i);
					}
				}else if(operations.get(i).equals("==")){
					if(operator/denominator == compare_use){
						return descriptions.get(i);
					}
				}else if(operations.get(i).equals("<")){
					if(operator/denominator < compare_use){
						return descriptions.get(i);
					}
				}else if(operations.get(i).equals(">")){
					if(operator/denominator > compare_use){
						return descriptions.get(i);
					}
				}else if(operations.get(i).equals("!=")){
					if(operator/denominator != compare_use){
						return descriptions.get(i);
					}
				}else{
					//trace("(Body_part_state.get_current_state_description)Got " + operations.get(i) + " as an operation and don't know what to do. Just returning description.")
					return descriptions.get(i);
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
				if(static_ratio_stat.get(0)){
                    operator = ratio_stat.get(0);
                    denominator = (double)bp.get_stat(c, ratio_stat.get(1));
					if(denominator <= 0)denominator = c.getStat(ratio_stat.get(1)); 
				}else{
                    //operator = bp.get_stat(c, ratio_stat[0]).intValue()
                    denominator = ratio_stat.get(1);
					if(bp.get_stat(c, ratio_stat.get(0)).intValue() < 0)operator = c.getStat(ratio_stat.get(0));
				}
				/*TODO check if simplified by above changes
				if(static_ratio_stat[1]){
					denominator = ratio_stat[1];
				}else{
					denominator = (double)bp.get_stat(c, ratio_stat[1]);
					if(denominator <= 0)denominator = c.getStat(ratio_stat[1]); 
                }*/
				int i = 0;
				String s = "";
				for(i=0;i<operations.size();i++){
				    int compare_use = comparisons.get(i);//Number
					if(rat_stat_id.get(i)){
						compare_use = bp.get_stat(c, comparisons.get(i)).intValue();
						if(compare_use < 0)compare_use = (int)c.getStat(comparisons.get(i));
					}
					int mod_use = mod_changes.get(i);//number
					if(mod_stat_id.get(i)){
						mod_use = bp.get_stat(c, mod_changes.get(i)).intValue();
						if(mod_use < 0)mod_use = (int)c.getStat(mod_changes.get(i));
					}					
					
					if (operations.get(i).equals(">=")){
						if(operator/denominator >= compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals("<=")){
						if(operator/denominator <= compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals("==")){
						if(operator/denominator == compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals("<")){
						if(operator/denominator < compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals(">")){
						if(operator/denominator > compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals("!=")){
						if(operator/denominator != compare_use){
							if(mod.intValue() != mod_use){
								mod = mod_use;
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals("^")){
						if(mod.intValue() < compare_use + operator/denominator){
							if(mod.intValue() != compare_use + operator/denominator && mod.intValue() != mod_use){
								if(mod_changes.get(i) == -1){
									mod = compare_use + operator/denominator;
								}else{
									mod = mod_use;
								}
								s += outputs.get(i);
							}
							return s;
						}
					}else if(operations.get(i).equals("v")&&mod.intValue() > compare_use + operator/denominator && mod.intValue() != mod_use){
						
							if(mod.intValue() != compare_use + operator/denominator){
								if(mod_use == -1){
									mod = compare_use + operator/denominator;
								}else{
									mod = mod_use;
								}
								s += outputs.get(i);
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
