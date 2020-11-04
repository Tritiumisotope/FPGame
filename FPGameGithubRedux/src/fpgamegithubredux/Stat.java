package fpgamegithubredux;

public class Stat {
    public static final int STATUSCONFIRMEDOK = 1;//is all good
	public static final int STATUSCONFIRMEDINCAPACITATED = 0;//incapacitates
	public static final int STATUSCONFIRMEDDEAD = -1;//kills part

    protected int statID;
    protected String name;
    
    protected String[] stat_description;//public var stat_description:Array
    protected int[] stat_description_requirement;//public var stat_description_requirement:Array
    protected String[] short_description;//public var short_description:Array
    protected int[] short_description_requirement;//public var short_description_requirement:Array
    
    public Boolean stat_desc_ttl_or_indiv;
    
    protected int[] stat_desc_ttl_part_limit;//public var stat_desc_ttl_part_limit:Array;
    protected String[] stat_up;//public var stat_up:Array
    protected int[] stat_up_requirement;//public var stat_up_requirement:Array
    protected String[] stat_up_operators;//public var stat_up_operators:Array
    protected int[] stat_up_products;//public var stat_up_products:Array
    protected String[] stat_down;//public var stat_down:Array
    protected int[] stat_down_requirement;//public var stat_down_requirement:Array
    protected String[] stat_down_operators;//public var stat_down_operators:Array
    protected double[] stat_down_products;//public var stat_down_products:Array
    
    public Boolean age;
    public Boolean always_show;
    public Boolean rummage_inventory;
    public Boolean rummage_body;
    public Boolean alchemy_hundreds;
    public Boolean always_calc;
    
    protected Number statValue;
    protected int show_decimals;
    protected int max_stat_id;
    protected int min_stat_id;
    protected Number tempStatValue;
    protected double stat_value_from_equip;

    protected String[] check_condition;//public var check_condition:Array
    protected int[] check_against;//public var check_against:Array
    protected int[] status_outcome;//public var status_outcome:Array
    protected Boolean[] check_combat;//public var check_combat:Array
    protected String[] incapac_text;//public var incapac_text:Array
    protected Boolean[] check_total;//public var check_total:Array

    
    //public var stat_calculation:Array;
    protected String[] stat_calculation;
    
    protected CharAction[] stat_actions;//public var stat_actions:Array
    public Stat(){
        this(-1);
    }
    public Stat(int i){
        //statID = 0
        //statValue = 0.0
        //tempStatValue = 0.0
        age = false;
        if(i>=0){
            statID = i;
        }else{
            statID = 0;
        }
        max_stat_id = -1;
        min_stat_id = -1;
        
        stat_description = null;
        stat_description_requirement = null;
        short_description  = null;
        short_description_requirement  = null;
        stat_up = null;
        stat_up_requirement = null;
        stat_up_operators = null;
        stat_up_products = null;
        stat_down = null;
        stat_down_requirement = null;
        stat_down_operators = null;
        stat_down_products = null;
        
        
        tempStatValue = statValue = stat_value_from_equip = 0;
        show_decimals = 2;
        stat_desc_ttl_or_indiv = false;
        always_show = false;
        
        check_condition = null;
        check_against = null;
        status_outcome = null;
        check_combat = null;
        incapac_text = null;
        check_total = null;
        stat_actions = null;
        
        //stat_desc_ttl_part_limit = new Array();
        
        //stat_calculation = null;
        
        rummage_inventory = false;
        rummage_body = false;
        alchemy_hundreds = false;
        always_calc = false;
        
        name = "";
    }
    public void set_always_calc(){
        always_calc = !always_calc;
    }
    public void new_stat_action(CharAction a){
        stat_actions[stat_actions.length] = a;
    }
    
    public void remove_stat_action(CharAction a){
        
        for(int i=0;i<stat_actions.length;i++){
            if(stat_actions[i] == a)stat_actions[i] = null;
        }
    }
    
    public CharAction[] get_actions(){
        return stat_actions;
    }
    
    public void set_rummage_inv(){
        rummage_inventory = !rummage_inventory;
    }
    
    public void set_rummage_body(){
        rummage_body = !rummage_body;
    }
    
    public void set_alchemy_hundreds(){
        alchemy_hundreds = !alchemy_hundreds;
    }
    
    public void set_show_decimal(int i){
        if(i>=0)show_decimals = i;
    }
    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }
    public void add_combat_status_check(String operator, int versus, int outcome){
        add_combat_status_check(operator, versus, outcome, "", false);
    
        }
    public void add_combat_status_check(String operator, int versus, int outcome, String it){
        add_combat_status_check(operator, versus, outcome, it, false);
    }
    public void add_combat_status_check(String operator, int versus, int outcome, String it, Boolean ct){
        //operator:String = ">=", versus:int = -1, outcome:int = status_confired_ok, it:String = "", ct:Boolean = false
        check_condition[check_condition.length] = operator;
        check_against[check_against.length] = versus;
        status_outcome[status_outcome.length] = outcome;
        check_combat[check_combat.length] = true;
        incapac_text[incapac_text.length] = it;
        check_total[check_total.length] = ct;
    }
    public void add_overworld_status_check(String operator, int versus, int outcome, String it){
        add_overworld_status_check(operator,versus,outcome,it, false);
    }
    public void add_overworld_status_check(String operator, int versus, int outcome, String it, Boolean ct){
        //operator:String = ">=", versus:int = -1, outcome:int = status_confired_ok, it:String = "", ct:Boolean = false
        check_condition[check_condition.length] = operator;
        check_against[check_against.length] = versus;
        status_outcome[status_outcome.length] = outcome;
        check_combat[check_combat.length] = false;
        incapac_text[incapac_text.length] = it;
        check_total[check_total.length] = ct;
    }
    
    public String get_overworld_status(Character c,BodyPart bp){
        String ret = "";
        int stat_out = check_overworld_status(c, bp);
        for(int i=0 ;i<check_condition.length;i++){
            if(!check_combat[i] && status_outcome[i] == stat_out){
                ret = incapac_text[i];
                break;
            }
        }
        return ret;
    }
    
    
        public String get_combat_status(Character c, BodyPart bp){
			String ret = "";
			int stat_out= check_combat_status(c, bp);
			int i = 0;
			for(i=0;i<check_condition.length;i++){
				if(check_combat[i] && status_outcome[i] == stat_out){
					ret = incapac_text[i];
					break;
				}
			}
			return ret;
		}
	
		public int check_overworld_status(Character c, BodyPart bp){
			min_max_check(c, bp);
			int ret = 1;
			int i = 0;
			for(i=0;i<check_condition.length;i++){
				if(!check_combat[i]){
					int compare = -1;
					double temp_stat_val;
					if(check_total[i]){
						temp_stat_val = c.getStat(statID);
					}else{
						temp_stat_val = get_stat_value(c);
					}
					if(check_against[i] < 0){
						compare = -check_against[i] - 1;
					}else{
						if(bp != null && !check_total[i])compare = bp.get_stat(c, check_against[i]).intValue();
						if(compare < 0 || check_total[i]) compare = (int)c.getStat(check_against[i]);
					}
										
					if(check_condition[i].equals(">")){
						if(temp_stat_val > compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals(">=")){
						if(temp_stat_val >= compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals("=")){
						if(temp_stat_val == compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals("<=")){
						if(temp_stat_val <= compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals("<")){
						if(temp_stat_val < compare && status_outcome[i] < ret)ret = status_outcome[i];
					}
				}
			}
			return ret;
		}
		
		public int check_combat_status(Character c, BodyPart bp){
			min_max_check(c, bp);
			int ret = 1;
			int i = 0;
			for(i=0;i<check_condition.length;i++){
				if(check_combat[i]){
					int compare = -1;
					int temp_stat_val = (int)get_stat_value(c);
					if(check_total[i]) temp_stat_val = (int)c.getStat(statID);
					if(check_against[i] < 0){
						compare = -check_against[i] - 1;
					}else{
						if(bp != null && !check_total[i])compare = bp.get_stat(c, check_against[i]).intValue();
						if(compare < 0 || check_total[i]) compare = (int)c.getStat(check_against[i]);
					}
					
					if(check_condition[i].equals(">")){
						if(temp_stat_val > compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals(">=")){
						if(temp_stat_val >= compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals("=")){
						if(temp_stat_val == compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals("<=")){
						if(temp_stat_val <= compare && status_outcome[i] < ret)ret = status_outcome[i];
					}else if(check_condition[i].equals("<")){
						if(temp_stat_val < compare && status_outcome[i] < ret)ret = status_outcome[i];
					}					
				}
			}
			
			return ret;
		}
		
    
    public void set_always_show(){
        always_show = !always_show;
    }
    
    public Boolean get_always_show(){
        return always_show;
    }
    
    public void set_age(){
        age = !age;
    }
    
    public void set_stat_calculation(String[] sc){
        stat_calculation = sc;
    }
    public void setStatValue(Number val, int dumb){
        if (dumb==1){
            setStatValue(val,true);
        }else{
            setStatValue(val,false);
        }
        }
    public void setStatValue(Number val){setStatValue(val,false);}
    public void setStatValue(Number val, Boolean tempFlag){
        if(Boolean.FALSE.equals(tempFlag)){
            statValue = val;  
        }
        tempStatValue = val;
    }
    public void set_max(int stat_id){
        max_stat_id = stat_id;
    }
    
    public void set_min(int stat_id){
        min_stat_id = stat_id;
    }
    public double get_stat_value(Character c){
        return get_stat_value(c,1,true,false);
    }
    public double get_stat_value(Character c, int i, Boolean add_equip, Boolean skip_calc){//Number
        // i:int = 1, add_equip:Boolean = true, skip_calc:Boolean = false
        double ret = statValue.doubleValue();
        if(i == 1)ret = tempStatValue.doubleValue();
        if(add_equip)ret += stat_value_from_equip;
        
        if((always_calc ||!skip_calc) && stat_calculation != null && c != null){
            //if(rummage_inventory)ret += c.get_inventory_weight();
            //if(rummage_body)ret += c.get_equip_weight();
            //TODO
            int count = 0;
            String[] temp_calc = new String[0];//was Number maybe? in Array
            
            for(count = 0;count < stat_calculation.length;count++){
                if(temp_calc[count] == null){
                    /*
                    if(stat_calculation[count] instanceof String){//was is
                        if(stat_calculation[count].indexOf("s") >= 0 || stat_calculation[count].indexOf("k") >= 0){
                            if(stat_calculation[count].indexOf("s") >= 0){
                                //temp_calc[count] = c.getStat(Integer.parseInt((stat_calculation[count].substring(stat_calculation[count].indexOf("s") + 1, stat_calculation[count].length()))));
                                //TODO figure out WEIRDNESS
                            }else{
                                //temp_calc[count] = c.get_skill_by_id((int)(stat_calculation[count].substr(stat_calculation[count].indexOf("k") + 1, stat_calculation[count].length)));
                            }								
                            
                            if(temp_calc[count] < 0)temp_calc[count] = 0;
                            int temp_count = count + 1;
                            for(temp_count= count + 1;temp_count< stat_calculation.length;temp_count++){
                                if(stat_calculation[temp_count] == stat_calculation[count]){
                                    temp_calc[temp_count] = temp_calc[count];
                                }
                            }
                        }else{
                            temp_calc[count] = stat_calculation[count];
                        }
                        */
                    //}else{
                        temp_calc[count] = stat_calculation[count];
                    //}
                }
            }
            
            //TODO what even?!
            
            StringStack char_stack = new StringStack(); // was array with new
            NumStack num_stack = new NumStack();//new Array();
            
            count = 0;
            for(count=0; count <= temp_calc.length; count ++){
                if(temp_calc[count] instanceof String || temp_calc[count] == null){//was is
                    String temp_char = "";
                    Number num1;
                    Number num2;
                    
                    if(temp_calc[count].equals("(")){
                        char_stack.push(temp_calc[count]);
                    }else if(temp_calc[count].equals(")") || temp_calc[count] == null){
                        temp_char = char_stack.pop();
                        if(!temp_char.equals("(")){
                            char_stack.pop();
                            num2 = num_stack.pop();
                            num1 = num_stack.pop();
                            if(temp_char.equals("*")){
                                num_stack.push(num1.doubleValue()*num2.doubleValue());
                            }else if(temp_char.equals("/")){
                                num_stack.push(num1.doubleValue()/num2.doubleValue());
                            }else if(temp_char.equals("+")){
                                num_stack.push(num1.doubleValue()+num2.doubleValue());
                            }else if(temp_char.equals("-")){
                                num_stack.push(num1.doubleValue()-num2.doubleValue());
                            }else{
                                num_stack.push(num1);
                                num_stack.push(num2);
                            }
                        }
                    }else{
                        temp_char = char_stack.pop();
                        if(temp_char.equals("(")){
                            char_stack.push(temp_char);
                            char_stack.push(temp_calc[count]);
                        }else{
                            char_stack.push(temp_calc[count]);
                            num2 = num_stack.pop();
                            num1 = num_stack.pop();
                            if(temp_char.equals("*")){
                                num_stack.push(num1.doubleValue()*num2.doubleValue());
                            }else if(temp_char.equals("/")){
                                num_stack.push(num1.doubleValue()/num2.doubleValue());
                            }else if(temp_char.equals("+")){
                                num_stack.push(num1.doubleValue()+num2.doubleValue());
                            }else if(temp_char.equals("-")){
                                num_stack.push(num1.doubleValue()-num2.doubleValue());
                            }else{
                                if(temp_char != null)num_stack.push(num1);
                                num_stack.push(num2);
                            }
                        }
                    }
                    
                }else{
                    //num_stack.push(temp_calc[count]);
                }
            }
            /*
            if(char_stack.length == 0 && num_stack.length == 1){
                ret += num_stack[0];
            }else{
                //trace("(Stat)We got a stat calculation gone wrong here....\n calc array:" + stat_calculation + "\n temp_calc:" + temp_calc + "\n char_stack:" + char_stack + "\n num_stack:" + num_stack);
            }
            */
            
        }
        return ret;
    }
    public int get_id(){
        return statID;
    }
    public void new_description(String d){
        new_description(d,0);
    }
    public void new_description(String d, int i){
        //default 0
        stat_description[stat_description.length] = d;
        stat_description_requirement[stat_description_requirement.length] = i;
    }
    
    public void new_short_description(String d,int i){
        //default 0
        short_description[short_description.length] = d;
        short_description_requirement[short_description_requirement.length] = i;
    }
    
    public String get_short_description(double stat_val){//was Number
        String ret = "";
        int max_good = -1;
        int i = 0;
        for(i=0;i<short_description.length;i++){
            if(short_description_requirement[i] <= stat_val && short_description_requirement[i] > max_good){
                max_good = short_description_requirement[i];
                ret = short_description[i];
            }
        }
        return ret;
    }
    public void new_increase_description(String su){
        new_increase_description(su, 0, "", 0);
    }
    public void new_increase_description(String su, int i, String op, int pro){
        //su:String, i:int = 0, op:String = "", pro:Number = 0
        stat_up[stat_up.length] = su;
        stat_up_requirement[stat_up_requirement.length] = i;
        stat_up_operators[stat_down_operators.length] = op;
        stat_up_products[stat_down_products.length] = pro;
    }
    public void new_descrease_description(String sd){
        new_descrease_description(sd, 0, "", 0);
    }
    public void new_descrease_description(String sd, int i, String op, double pro){
        //sd:String, i:int = 0, op:String = "", pro:Number = 0
        stat_down[stat_down.length] = sd;
        stat_down_requirement[stat_down_requirement.length] = i;
        stat_down_operators[stat_down_operators.length] = op;
        stat_down_products[stat_down_products.length] = pro;
    }
    
    public String get_description(Character c,double current_value){
        //default Number -1
        String s = "";
        
        if(current_value == -1 && c != null) current_value = c.getStat(statID);			
        
        int i = 0;
        int req_met= -99;//was Number
        for(i=0;i<stat_description.length;i++){
            if(current_value >= stat_description_requirement[i] && stat_description_requirement[i] >= req_met){
                if(!stat_description[i].equals(s))s = stat_description[i];
                req_met = stat_description_requirement[i];
            }
        }
        
        //s = s.replace("</" + statID + ">",current_value.toFixed(show_decimals));
        s = s.replace("</sd" + statID + ">",get_short_description(current_value));
        
        return s;
    }
    
    public String get_equip_change(Number change_amount,Character c){
        String ret= "";
        
        stat_value_from_equip += change_amount.doubleValue();
        
        int i = 0;
        
        if(change_amount.intValue() > 0){
            for(i = 0;i<stat_up.length;i++){
                if(Boolean.TRUE.equals(stat_op(i,c, stat_up_requirement[i], stat_up_operators[i],stat_up_products[i]))) ret = stat_up[i];
            }
        }else if(change_amount.intValue() < 0){
            for(i = 0;i<stat_down.length;i++){
                if(Boolean.TRUE.equals(stat_op(i,c, stat_down_requirement[i], stat_down_operators[i],stat_down_products[i]))) ret = stat_down[i];
            }
        }
        
        
        //ret = ret.replace("</" + id + ">",get_stat_value(c).toFixed(show_decimals));			
        
        return ret;
    }
    
    
    //I'm not sure if this is displaying correctly... particularly for temp effects
    
    public String get_change_magnitude(int change_amount, Character c, int temp_flag,BodyPart bp){
        //change_amount:Number,Character c,temp_flag:int, BodyPart bp = null
        String s = "";
        int i = 0;
        setStatValue(get_stat_value(null, temp_flag, false, true)+change_amount,temp_flag);
        min_max_check(c, bp);
        if(change_amount > 0){
            for(i = 0;i<stat_up.length;i++){
                if(c!= null && stat_op(i,c, stat_up_requirement[i], stat_up_operators[i],stat_up_products[i])) s = stat_up[i];
            }
        }else if(change_amount < 0){
            for(i = 0;i<stat_down.length;i++){
                if(c!= null && stat_op(i,c, stat_down_requirement[i], stat_down_operators[i],stat_down_products[i])) s = stat_down[i];
            }
        }
        double statValRound = get_stat_value(c);
        long factor = (long) Math.pow(10, show_decimals);
        statValRound = statValRound * factor;
        long tmp = Math.round(statValRound);
        statValRound =  (double) tmp / factor;
        
        s = s.replace("</" + statID + ">",Double.toString(statValRound));//get_stat_value(c).toFixed(show_decimals));
        
        return s;			
    }
    
    
    private Boolean stat_op(int curr_effect_id,Character c,int comp_stat_id,String op,double pro){
        if(op.equals("/")){
            if(c.getStat(statID)/c.getStat(comp_stat_id) >= pro) return true;
        }else if(op.equals("")){
            if(c.getStat(statID) >= comp_stat_id) return true;
        }
        
        return false;
    }
    /*
    public void reset_stat(Character c, k:int = -1, BodyPart bp = null){
        min_max_check(c, bp);
        if(k == -1){
            temp_stat_value = stat_value;								
        }else{
            if(temp_stat_value > stat_value){
                temp_stat_value -= Math.min(k, temp_stat_value - stat_value);
            }else if(temp_stat_value < stat_value){
                temp_stat_value += Math.min(k, stat_value - temp_stat_value);
            }
        }
    }
    */
    public void set_stat_description_show(){
        set_stat_description_show(null);
    }
    public void set_stat_description_show(int[] parts_to_check){//def null
        stat_desc_ttl_or_indiv = !stat_desc_ttl_or_indiv;
        if(parts_to_check != null)stat_desc_ttl_part_limit = parts_to_check;
    }
    
    public Boolean at_max(Character c){
        return at_max(c, null);
    }
    public Boolean at_max(Character c, BodyPart bp){//default null
        Boolean ret = false;
        if(max_stat_id != -1){
            int max;//was number
            if(max_stat_id < 0){
                max = -max_stat_id - 2;
                if(get_stat_value(c,0,false,true) >= max) ret = true;
            }else if(bp == null){
                max = (int)c.getStat(max_stat_id);
                if(c.get_stat(statID,0,0,-1,false).intValue() >= max) ret = true;
            }else{
                if(bp.get_stat(c, max_stat_id).intValue() > -1){
                    max = bp.get_stat(c, max_stat_id).intValue();
                    if(get_stat_value(c,0,false,true) >= max) ret = true;
                }else{
                    return at_max(c);						
                }
            }
        }
        return ret;
    }
    
    public Boolean at_min(Character c){
        return at_min(c, null);
    }
    public Boolean at_min(Character c, BodyPart bp){//default null
        Boolean ret = false;
        if(min_stat_id != -1){ 
            int min;//was number
            if(min_stat_id < 0){
                min = -min_stat_id - 2;
                if(get_stat_value(c,0,false,true) <= min) ret = true;
            }else if(bp == null){
                min = (int)c.getStat(min_stat_id);
                if(c.get_stat(statID,0,0,-1,false).intValue() <= min) ret = true;
            }else{
                if(bp.get_stat(c, min_stat_id).intValue() > -1){
                    min = bp.get_stat(c, min_stat_id).intValue();
                    if(get_stat_value(c,0,false,true) <= min) ret = true;
                }else{
                    return at_min(c);
                }
            }
        }
        return ret;
    }
    
    private void min_max_check(Character c){
        min_max_check(c, null);
    }
    private void min_max_check(Character c, BodyPart bp){//default null
        Boolean flag = false;
        if(max_stat_id != -1){				
            int max;//was number
            if(max_stat_id < 0){
                max = -max_stat_id - 2;
                if(get_stat_value(c, 0,false,true) > max) flag = true;
            }else if(bp == null){
                max = (int)c.getStat(max_stat_id);
                if(c.get_stat(statID, 0,0,-1,false).intValue() > max) flag = true;
            }else{
                if(bp.get_stat(c, max_stat_id).intValue() > -1){
                    max = bp.get_stat(c, max_stat_id).intValue();
                    if(get_stat_value(c, 0,false,true) > max) flag = true;
                }else{
                    min_max_check(c);
                    return;
                }
            }
            if(flag)setStatValue(max, false);//was 0
        }
        if(min_stat_id != -1){ 
            flag = false;
            int min;
            if(min_stat_id < 0){
                min = -min_stat_id - 2;
                if(get_stat_value(c, 0,false,true) < min) flag = true;
            }else if(bp == null){
                min = (int)c.getStat(min_stat_id);
                if(c.get_stat(statID, 0,0,-1,false).intValue() < min) flag = true;
            }else{
                if(bp.get_stat(c, min_stat_id).intValue() > -1){
                    min = bp.get_stat(c, min_stat_id).intValue();
                    if(get_stat_value(c, 0,false,true) < min) flag = true;
                }else{
                    min_max_check(c);
                    return;
                }
            }
            if(flag)setStatValue(min, false);//0				
        }
    }
    
    
    public void statCopy(Stat s){
        statID = s.statID;
        stat_description = s.stat_description;
        
        stat_description_requirement = s.stat_description_requirement;
        short_description  = s.short_description;
        short_description_requirement  = s.short_description_requirement;
        stat_up = s.stat_up;
        stat_up_requirement = s.stat_up_requirement;
        stat_up_operators = s.stat_up_operators;
        stat_up_products = s.stat_up_products;
        stat_down = s.stat_down;
        stat_down_requirement = s.stat_down_requirement;
        stat_down_operators = s.stat_down_operators;
        stat_down_products = s.stat_down_products;
        age = s.age;
        max_stat_id = s.max_stat_id;
        min_stat_id = s.min_stat_id;
        statValue = s.statValue;
        stat_value_from_equip = s.stat_value_from_equip;
        tempStatValue = statValue;
        stat_desc_ttl_or_indiv = s.stat_desc_ttl_or_indiv;
        always_show = s.always_show;
        rummage_inventory = s.rummage_inventory;
        rummage_body = s.rummage_body;
        always_calc = s.always_calc;
        alchemy_hundreds = s.alchemy_hundreds;
        check_condition = s.check_condition;
        check_against = s.check_against;
        status_outcome = s.status_outcome;
        check_combat = s.check_combat;
        incapac_text = s.incapac_text;
        check_total = s.check_total;
        //stat_calculation = s.stat_calculation;
        name = s.getName();
        stat_actions = s.stat_actions;
        //stat_desc_ttl_part_limit = s.stat_desc_ttl_part_limit;
    }
}
