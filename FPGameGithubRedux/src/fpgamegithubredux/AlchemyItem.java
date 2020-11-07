package fpgamegithubredux;

public class AlchemyItem extends Item{
		
    //need some way to show what the items types are
    
    //public var types:Array;
    
    public AlchemyItem(String n){
        // = ""
        setName(n);
        //types = new Array;
    }
    
    public Item combine(Character c, AlchemyItem item2){//, type_array:Array
        int skill = -1;
        int k = 0;
        for (k=0;k<c.actions.size();k++){//.length
            if(c.actions.get(k).alchemy_flag){//[]
                skill++;
            }
        }
            
        //var t:Array = new Array();
        //t = get_types().concat(item2.get_types());
        //t.sort();
        /*to do: create the item based on the number of matching types
            2 match: effect based on type number
                type 1 could be hp gain
                type 2 could be str gain
                etc.
            3 match: effect *150%
            4 match: effect *210%
            5 match: effect *280%
            6 match: effect *400%
            7 match: effect *700%
            8 match: effect *1200%
        for EACH set of matching types (so the generated item could have multiple effects)
        */
        
        AlchemyItem item= new AlchemyItem("Alchemical draught");
        item.setUseDescription("You drink down the alchemical draught, unsure what to expect.");
        item.setDroppedDescription("A bottle sits lazily on the ground here.");
        //var changes:Array;
        /*
        if(type_array != null){
            var initial_array:Array = this.types.concat(item2.types);
            initial_array = initial_array.concat(this.changeEffects).concat(item2.changeEffects).concat(this.statActionAdd).concat(item2.statActionAdd);
            
            var effect_amounts:Array = new Array();
            int x = 0;
            for(x=0;x<type_array.length;x++){
                var y:int = 0;
                changes = new Array();
                var a1_count:int = 0;
                var last_id:int = 0;
                for(y;y<type_array[x].length;y++){
                    if(type_array[x][y] == last_id){
                        a1_count++;
                    }else{
                        if(type_array[x][y].indexOf("c") >= 0 || type_array[x][y].indexOf("a") >= 0){
                            if(type_array[x][y].indexOf("c") >= 0){
                                changes[changes.length] = initial_array[type_array[x][y].substr(type_array[x][y].indexOf("c")+1,type_array[x][y].length)];
                            }else{
                                changes[changes.length] = initial_array[type_array[x][y].substr(type_array[x][y].indexOf("a")+1,type_array[x][y].length)];
                            }
                            a1_count++;
                        }else{
                            if(a1_count >= 2 && last_id != 0){
                                if(last_id < 0){
                                    if(effect_amounts[-last_id] != null){
                                        effect_amounts[-last_id] -= Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }else{
                                        effect_amounts[-last_id] = -Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }
                                }else{
                                    if(effect_amounts[last_id] != null){
                                        effect_amounts[last_id] += Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }else{
                                        effect_amounts[last_id] = Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }
                                }
                                if(changes.length > 0 && a1_count > 2){
                                    a1_count = 0;
                                    for(a1_count;a1_count<changes.length;a1_count++){
                                        if(changes[a1_count] is Consequence){
                                            item.add_consequence(changes[a1_count]);
                                        }else if(changes[a1_count] is Action){
                                            item.add_action(changes[a1_count]);
                                        }
                                    }
                                }
                            }
                            a1_count = 1;
                            changes = new Array();
                            if(type_array[x][y] != ""){
                                var temp_y:int = y-1;
                                while(type_array[x][temp_y] != null && (type_array[x][temp_y].indexOf("c") >= 0 || type_array[x][temp_y].indexOf("a") >= 0)){
                                    if(type_array[x][temp_y].indexOf("c") >= 0){
                                        changes[changes.length] = initial_array[type_array[x][temp_y].substr(type_array[x][temp_y].indexOf("c")+1,type_array[x][temp_y].length)];
                                    }else{
                                        changes[changes.length] = initial_array[type_array[x][temp_y].substr(type_array[x][temp_y].indexOf("a")+1,type_array[x][temp_y].length)];
                                    }
                                    a1_count++;
                                    temp_y--;
                                }
                            }
                            last_id = type_array[x][y];								
                        }
                    }
                }
                if(a1_count >= 2 && last_id != 0){
                    if(last_id < 0){
                        if(effect_amounts[-last_id] != null){
                            effect_amounts[-last_id] -= Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }else{
                            effect_amounts[-last_id] = -Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }
                    }else{
                        if(effect_amounts[last_id] != null){
                            effect_amounts[last_id] += Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }else{
                            effect_amounts[last_id] = Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }
                    }
                    if(changes.length > 0 && a1_count > 2){
                        a1_count = 0;
                        for(a1_count;a1_count<changes.length;a1_count++){
                            if(changes[a1_count] is Consequence){
                                item.add_consequence(changes[a1_count]);
                            }else if(changes[a1_count] is Action){
                                item.add_action(changes[a1_count]);
                            }
                        }
                    }
                }
            }
            //left/right matches
            y = 0;
            for(y;y<type_array.length;y++){
                x = 0;
                changes = new Array();
                a1_count = 0;
                last_id = 0;
                for(x;x<type_array.length;x++){
                    if(type_array[x][y] == last_id){
                        a1_count++;
                    }else{
                        if(type_array[x][y].indexOf("c") >= 0 || type_array[x][y].indexOf("a") >= 0){
                            if(type_array[x][y].indexOf("c") >= 0){
                                changes[changes.length] = initial_array[type_array[x][y].substr(type_array[x][y].indexOf("c")+1,type_array[x][y].length)];
                            }else{
                                changes[changes.length] = initial_array[type_array[x][y].substr(type_array[x][y].indexOf("a")+1,type_array[x][y].length)];
                            }
                            a1_count++;
                        }else{
                            if(a1_count >= 2 && last_id != 0){
                                if(last_id < 0){
                                    if(effect_amounts[-last_id] != null){
                                        effect_amounts[-last_id] -= Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }else{
                                        effect_amounts[-last_id] = -Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }
                                }else{
                                    if(effect_amounts[last_id] != null){
                                        effect_amounts[last_id] += Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }else{
                                        effect_amounts[last_id] = Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                                    }
                                }
                                if(changes.length > 0 && a1_count > 2){
                                    a1_count = 0;
                                    for(a1_count;a1_count<changes.length;a1_count++){
                                        if(changes[a1_count] is Consequence){
                                            item.add_consequence(changes[a1_count]);
                                        }else if(changes[a1_count] is Action){
                                            item.add_action(changes[a1_count]);
                                        }
                                    }
                                }
                            }
                            a1_count = 1;
                            changes = new Array();
                            if(type_array[x][y] != ""){
                                var temp_x:int = x-1;
                                while(type_array[temp_x] != null && type_array[temp_x][y] != null && (type_array[temp_x][y].indexOf("c") >= 0 || type_array[temp_x][y].indexOf("a") >= 0)){
                                    if(type_array[temp_x][y].indexOf("c") >= 0){
                                        changes[changes.length] = initial_array[type_array[temp_x][y].substr(type_array[temp_x][y].indexOf("c")+1,type_array[temp_x][y].length)];
                                    }else{
                                        changes[changes.length] = initial_array[type_array[temp_x][y].substr(type_array[temp_x][y].indexOf("a")+1,type_array[temp_x][y].length)];
                                    }
                                    a1_count++;
                                    temp_x--;
                                }
                            }
                            last_id = type_array[x][y];								
                        }
                    }
                }
                if(a1_count >= 2 && last_id != 0){
                    if(last_id < 0){
                        if(effect_amounts[-last_id] != null){
                            effect_amounts[-last_id] -= Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }else{
                            effect_amounts[-last_id] = -Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }
                    }else{
                        if(effect_amounts[last_id] != null){
                            effect_amounts[last_id] += Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }else{
                            effect_amounts[last_id] = Math.ceil(Math.pow(50.0,(0.5 + (a1_count/4.0)))/50.0);
                        }
                    }
                    if(changes.length > 0 && a1_count > 2){
                        a1_count = 0;
                        for(a1_count;a1_count<changes.length;a1_count++){
                            if(changes[a1_count] is Consequence){
                                item.add_consequence(changes[a1_count]);
                            }else if(changes[a1_count] is Action){
                                item.add_action(changes[a1_count]);
                            }
                        }
                    }
                }
            }
            
            var effect_multiplier:Number = 1;
            if(same_item(item2))effect_multiplier = 0.5;
            
            var i:int = 0;
            for(i;i<effect_amounts.length;i++){
                if(effect_amounts[i] != null){
                    //need to divide the effect by 100 if it's for a stat with a static max of 1
                    if(FPalace_helper.get_stat_by_id(i)!= null && FPalace_helper.get_stat_by_id(i).alchemy_hundreds){
                        effect_amounts[i] = effect_amounts[i]/100;
                    }
                    
                    item.add_effect(i, effect_amounts[i] * effect_multiplier);
                }
            }
        }else{
            var temp:Number;
            var start_pos:int = 0;
            i = 0;
            for (i;i<t.length;i++){
                if(t[i] != t[i-1] && i - start_pos > 1){
                    temp = (i-start_pos);
                    if(t[i-1] >= 0){
                        if(FPalace_helper.get_stat_by_id(t[i-1]) != null && FPalace_helper.get_stat_by_id(t[i-1]).alchemy_hundreds){
                            item.add_effect(t[i-1],  Math.ceil(Math.pow(50.0,(0.5 + (temp/4.0)))/50.0)/100);
                        }else{
                            item.add_effect(t[i-1],  Math.ceil(Math.pow(50.0,(0.5 + (temp/4.0)))/50.0));
                        }
                    }else{
                        if(FPalace_helper.get_stat_by_id(t[i-1]) != null && FPalace_helper.get_stat_by_id(t[i-1]).alchemy_hundreds){
                            item.add_effect(-t[i-1],  -Math.ceil(Math.pow(50.0,(0.5 + (temp/4.0)))/50.0)/100);
                        }else{
                            item.add_effect(-t[i-1],  -Math.ceil(Math.pow(50.0,(0.5 + (temp/4.0)))/50.0));
                        }
                    }						
                    start_pos = i;						
                }else if(t[i] == t[i-1]){
                    //do nothing! Why? Cause it's the best thing ever!
                    
                }else{
                    start_pos = i
                }					
            }				
            if(i - start_pos > 1){
                temp = (i-start_pos);
                //need to divide the effect by 100 if it's for a stat with a static max of 1
                if(FPalace_helper.get_stat_by_id(t[i-1]) != null && FPalace_helper.get_stat_by_id(t[i-1]).alchemy_hundreds){
                    item.add_effect(t[i-1],  Math.ceil(Math.pow(50.0,(0.5 + (temp/4.0)))/50.0)/100);
                }else{
                    item.add_effect(t[i-1],  Math.ceil(Math.pow(50.0,(0.5 + (temp/4.0)))/50.0));
                }
            }				
            //need to figure out passing on change effects (like racial changes) on too...
            changes = new Array();
            changes = this.changeEffects.concat(item2.changeEffects);
            i = 0;
            for(i;i<changes.length;i++){
                if(Math.random() >= 0.5){
                    if(changes[i] is Dynamic_object){
                        item.add_change_effect(changes[i]);
                    }else if(changes[i] is Consequence){
                        item.add_consequence(changes[i]);
                    }
                }
            }				
            //need to do a check for stat effects
            var sa_changes:Array = this.statActionAdd.concat(item2.statActionAdd);
            i = 0;
            for(i;i<sa_changes.length;i++){
                if(sa_changes[i] is Action){
                    if(Math.random() >= 0.5){
                        item.new_stat_action(sa_changes[i-1],sa_changes[i]);
                    }
                }
            }				
        }
        */
        item.numUses = Math.max(this.numUses,item2.numUses);
        
        //change name based on primary known effect
        int max_effect_id = -1;
        int i = 0;
        for(i=0;i<item.effects.length;i++){
            if(item.effects[max_effect_id] < item.effects[i])max_effect_id = i;
            if(item.effects[max_effect_id] == null && item.effects[i] != null)max_effect_id = i;
        }
        if(max_effect_id >= 0){
            if(FPalaceHelper.get_stat_by_id(max_effect_id) != null){
                //item.name = Main.capitalize(FPalace_helper.get_stat_by_id(max_effect_id).get_name() + " Potion");
            }
        }
        
        if(skill > 0){
            /*
            int num_to_get = 3;
            if(skill > 2){
                num_to_get = 12;
            }else if(skill > 1){
                num_to_get = 6;
            }
            
            if(t.length > num_to_get){
                i = Math.round(Math.random()*(t.length - num_to_get));
                item.types = t.slice(i,i+num_to_get);
            }else{
                item.types = t;
            }
            */
            return item;
        }
        
        Item non_alch_item = new Item(item.name);
        non_alch_item.setUseDescription("You drink down the alchemical draught, unsure what to expect.");
        non_alch_item.setDroppedDescription("A bottle sits lazily on the ground here");
        non_alch_item.numUses = item.numUses;
        non_alch_item.effects = item.effects;
        non_alch_item.changeEffects = item.changeEffects;
        non_alch_item.statActionAdd = item.statActionAdd;
                    
        return non_alch_item;
    }
    
    public void add_type(int i){
        //types[types.length] = i;
    }
    /*
    public function get_types():Array{
        return types;			
    }
    */
    @Override 
    public String getDescription(Character c, Integer[] ident_effectiveness, Boolean keep_tags){
        //c:Character, ident_effectiveness:Array = null, keep_tags:Boolean = false
        String ret = "";
        /*
        double ident_chance = 0;
        int ident_roll;
        if(ident_effectiveness != null){
            ident_chance = 2*ident_effectiveness[ident_effectiveness.length - 1]/(identDifficulty);
            ident_roll = ident_effectiveness[ident_effectiveness.length - 1];
            ident_effectiveness = ident_effectiveness.slice(0, ident_effectiveness.length -1);
        }
        */
        ret += super.getDescription(c,ident_effectiveness, keep_tags) + "\n";
        
        //Boolean showing= false;
        //int count = 0;
        /*
        if(types.length > 0){
            for(count = 0;count < types.length;count ++){
                if(ret.indexOf(FPalace_helper.get_stat_name_by_id(types[count])) < 0 && Math.random() <= ident_chance){
                    if(!showing){
                        showing = true;
                        ret += "Has the following Alchemical effects:\n";
                    }
                    
                    if(keep_tags){
                        ret += "<s" + types[count] + ">";
                    }else{
                        if(ident_roll > 10){
                            if(types[count] < 0){
                                ret += "Decrease "+FPalace_helper.get_stat_name_by_id(-types[count]) + "\n";
                            }else{
                                ret += "Increase "+FPalace_helper.get_stat_name_by_id(types[count]) + "\n";
                            }
                        }else{
                            if(types[count] < 0){
                                ret += FPalace_helper.get_stat_name_by_id(-types[count]) + "\n";
                            }else{
                                ret += FPalace_helper.get_stat_name_by_id(types[count]) + "\n";
                            }
                        }
                    }
                }
            }
        }
        */
        return ret;
    }
    
    @Override 
    public Boolean sameItem(Item i){
        Boolean ret = super.sameItem(i);
        
        if(ret && i instanceof AlchemyItem){//was is
            /*
            AlchemyItem temp = i as AlchemyItem;//was as
            if(temp.types.toString() == types.toString()){
                ret = true;
            }else{
                ret = false;
            }
            */
        }else{
            ret = false;
        }
        
        return ret;			
    }
    
    @Override 
    public Item copyItem(){
        AlchemyItem temp = new AlchemyItem(this.name);
        int count= 0;
        /*
        for(count = 0;count<types.length;count++){
            temp.types[count] = this.types[count];
        }
        */
        
        temp.name = this.name;
        temp.inventoryDescription = inventoryDescription;
        temp.droppedDescription = this.droppedDescription;
        temp.value = this.value;
        
        for(count=0;count<effects.length;count++){
            temp.effects[count] = this.effects[count];
        }
        
        temp.useDescription = this.useDescription;
        temp.numUses = this.numUses;
        
        count = 0;
        for(count=0;count<changeEffects.length;count++){
            temp.changeEffects[count] = this.changeEffects[count];
        }
        temp.propogate = this.propogate;
        temp.identDifficulty = this.identDifficulty;
        temp.weight = this.weight;
        count = 0;
        for(count=0;count < statActionAdd.length;count++){
            temp.statActionAdd[count] = this.statActionAdd[count];
        }
        
        temp.imageID = this.imageID;
        
        //temp.topic = this.topic;
        temp.craftingRequirements = this.craftingRequirements;
        
        temp.tickCount = 0;
        temp.destroyTick = this.destroyTick;
        temp.spawnChar = this.spawnChar;
        
        return temp;
    }

}

