package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Collections;

public class AlchemyItem extends Item {
		
    //need some way to show what the items types are
    
    protected ArrayList<Integer> types;//public var types:Array
    
    public AlchemyItem(String n){
        // = ""
        setName(n);
        types = new ArrayList<>();
    }
    
    public Item combine(Character c, AlchemyItem item2, ArrayList<ArrayList<Integer>> type_array){//was type_array of type Array
        int skill = -1;
        int k = 0;
        for (k=0;k<c.actions.size();k++){//.length
            if(c.actions.get(k).alchemy_flag){//[]
                skill++;
            }
        }
        
        ArrayList<Integer> t = new ArrayList<>();//var t:Array = new Array()
        t.addAll(get_types());//t = get_types().concat(item2.get_types());replaced with these two?
        t.addAll(item2.get_types());
        Collections.sort(t);//t.sort()
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
        ArrayList<Object> changes = new ArrayList<>();
        
        if(type_array != null){
            ArrayList<Object> initial_array = new ArrayList<>();//var initial_array:Array = this.types.concat(item2.types)
            initial_array.addAll(types);
            initial_array.addAll(item2.types);
            //initial_array = initial_array.concat(this.changeEffects).concat(item2.changeEffects).concat(this.statActionAdd).concat(item2.statActionAdd);
            initial_array.addAll(changeEffects);

            ArrayList<Double> effect_amounts = new ArrayList<>();
            int x = 0;
            /*TODO suss
            for(x=0;x<type_array.size();x++){
                int y = 0;
                changes = new ArrayList<>();
                int a1_count = 0;
                int last_id = 0;
                for(y=0;y<type_array.get(x).size();y++){
                    if(type_array.get(x).get(y) == last_id){
                        a1_count++;
                    }else{
                        if(type_array.get(x).get(y).indexOf("c") >= 0 || type_array.get(x).get(y).indexOf("a") >= 0){
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
                                            item.addConsequence(changes[a1_count]);
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
                                item.addConsequence(changes[a1_count]);
                            }else if(changes[a1_count] is Action){
                                item.add_action(changes[a1_count]);
                            }
                        }
                    }
                }
            }
            */
            //left/right matches
            int y = 0;
            /*
            for(y=0;y<type_array.length;y++){
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
                                            item.addConsequence(changes[a1_count]);
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
                                item.addConsequence(changes[a1_count]);
                            }else if(changes[a1_count] is Action){
                                item.add_action(changes[a1_count]);
                            }
                        }
                    }
                }
            }
            */
            
            Number effect_multiplier = 1;
            if(sameItem(item2))effect_multiplier = 0.5;
            
            int i = 0;
            for(i=0;i<effect_amounts.size();i++){
                if(effect_amounts.get(i) != null){
                    //need to divide the effect by 100 if it's for a stat with a static max of 1
                    if(FPalaceHelper.get_stat_by_id(i)!= null && FPalaceHelper.get_stat_by_id(i).alchemy_hundreds){
                        effect_amounts.set(i, (double)effect_amounts.get(i)/100);//effect_amounts[i] = effect_amounts[i]/100
                    }
                    
                    item.add_effect(i, effect_amounts.get(i) * effect_multiplier.doubleValue());
                }
            }
        }else{
            Number temp;
            int start_pos = 0;
            int i = 0;
            for (i=0;i<t.size();i++){
                if(!t.get(i).equals(t.get(i-1)) && i - start_pos > 1){
                    temp = (i-start_pos);
                    if(t.get(i-1) >= 0){
                        if(FPalaceHelper.get_stat_by_id(t.get(i-1)) != null && FPalaceHelper.get_stat_by_id(t.get(i-1)).alchemy_hundreds){
                            item.add_effect(t.get(i-1),  Math.ceil(Math.pow(50.0,(0.5 + (temp.doubleValue()/4.0)))/50.0)/100);
                        }else{
                            item.add_effect(t.get(i-1),  Math.ceil(Math.pow(50.0,(0.5 + (temp.doubleValue()/4.0)))/50.0));
                        }
                    }else{
                        if(FPalaceHelper.get_stat_by_id(t.get(i-1)) != null && FPalaceHelper.get_stat_by_id(t.get(i-1)).alchemy_hundreds){
                            item.add_effect(-t.get(i-1),  -Math.ceil(Math.pow(50.0,(0.5 + (temp.doubleValue()/4.0)))/50.0)/100);
                        }else{
                            item.add_effect(-t.get(i-1),  -Math.ceil(Math.pow(50.0,(0.5 + (temp.doubleValue()/4.0)))/50.0));
                        }
                    }						
                    start_pos = i;						
                }else if(t.get(i).equals(t.get(i-1))){
                    //do nothing! Why? Cause it's the best thing ever!
                    
                }else{
                    start_pos = i;
                }					
            }				
            if(i - start_pos > 1){
                temp = (i-start_pos);
                //need to divide the effect by 100 if it's for a stat with a static max of 1
                if(FPalaceHelper.get_stat_by_id(t.get(i-1)) != null && FPalaceHelper.get_stat_by_id(t.get(i-1)).alchemy_hundreds){
                    item.add_effect(t.get(i-1),  Math.ceil(Math.pow(50.0,(0.5 + (temp.doubleValue()/4.0)))/50.0)/100);
                }else{
                    item.add_effect(t.get(i-1),  Math.ceil(Math.pow(50.0,(0.5 + (temp.doubleValue()/4.0)))/50.0));
                }
            }				
            //need to figure out passing on change effects (like racial changes) on too...
            changes = new ArrayList<>();
            changes.addAll(changeEffects);
            changes.addAll(item2.changeEffects);//changes = this.changeEffects.concat(item2.changeEffects)
            for(i=0;i<changes.size();i++){
                if(Math.random() >= 0.5){
                    if(changes.get(i) instanceof DynamicObject){
                        item.add_change_effect((DynamicObject)changes.get(i));
                    }else if(changes.get(i) instanceof Consequence){
                        item.addConsequence((Consequence)changes.get(i));
                    }
                }
            }				
            //need to do a check for stat effects
            
            ArrayList<StatAction> sa_changes = new ArrayList<>();//ArrayList<StatAction> sa_changes = this.statActionAdd.concat(item2.statActionAdd)
            sa_changes.addAll(this.statActionAdd);
            sa_changes.addAll(item2.statActionAdd);
            /*TODO wat
            for(i=0;i<sa_changes.size();i++){
                if(sa_changes.get(i) instanceof CharAction){
                    if(Math.random() >= 0.5){
                        item.new_stat_action(sa_changes.get(i-1),sa_changes[i]);
                    }
                }
            }
            */				
        }
        
        item.numUses = Math.max(this.numUses,item2.numUses);
        
        //change name based on primary known effect
        int max_effect_id = -1;
        int i = 0;
        for(i=0;i<item.effects.size();i++){
            if(item.effects.get(max_effect_id) < item.effects.get(i))max_effect_id = i;
            if(item.effects.get(max_effect_id) == null && item.effects.get(i) != null)max_effect_id = i;
        }
        if(max_effect_id >= 0 &&FPalaceHelper.get_stat_by_id(max_effect_id) != null){
            //item.name = Main.capitalize(FPalaceHelper.get_stat_by_id(max_effect_id).get_name() + " Potion")
        }
        
        if(skill > 0){
            
            int num_to_get = 3;
            if(skill > 2){
                num_to_get = 12;
            }else if(skill > 1){
                num_to_get = 6;
            }
            
            if(t.size() > num_to_get){
                i = (int)Math.round(Math.random()*(t.size() - num_to_get));
                //item.types = t.slice(i,i+num_to_get)
                item.types = (ArrayList<Integer>)t.subList(i,i+num_to_get);//TODO VERIFY!
            }else{
                item.types = t;
            }
            
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
        //types[types.length] = i
        types.add(i);//TODO verify!
    }
    
    public ArrayList<Integer> get_types(){
        return types;			
    }
    
    @Override 
    public String getDescription(Character c, ArrayList<Integer> ident_effectiveness, Boolean keep_tags){
        //c:Character, ident_effectiveness:Array = null, keep_tags:Boolean = false
        String ret = "";
        
        double ident_chance = 0;
        int ident_roll = 0;//TODO check if right to initialize instead of leave blank like original!
        /*
        if(ident_effectiveness != null){
            ident_chance = 2*ident_effectiveness.get(ident_effectiveness.size() - 1)/(identDifficulty);
            ident_roll = ident_effectiveness.get(ident_effectiveness.size() - 1);
            //ident_effectiveness = ident_effectiveness.slice(0, ident_effectiveness.length -1)
            //ident_effectiveness = Arrays.copyOfRange(ident_effectiveness,0, ident_effectiveness.size()-1)//TODO verify
            ident_effectiveness.remove(ident_effectiveness.size());//TODO verify
        }
        */
        ret += super.getDescription(c,ident_effectiveness, keep_tags) + "\n";
        
        Boolean showing= false;
        int count = 0;
        
        if(types.size() > 0){
            for(count = 0;count < types.size();count ++){
                if(ret.indexOf(FPalaceHelper.get_stat_name_by_id(types.get(count))) < 0 && Math.random() <= ident_chance){
                    if(!showing){
                        showing = true;
                        ret += "Has the following Alchemical effects:\n";
                    }
                    
                    if(keep_tags){
                        ret += "<s" + types.get(count) + ">";
                    }else{
                        if(ident_roll > 10){//TODO prove earlier initialization was correct!
                            if(types.get(count) < 0){
                                ret += "Decrease "+FPalaceHelper.get_stat_name_by_id(-types.get(count)) + "\n";
                            }else{
                                ret += "Increase "+FPalaceHelper.get_stat_name_by_id(types.get(count)) + "\n";
                            }
                        }else{
                            if(types.get(count) < 0){
                                ret += FPalaceHelper.get_stat_name_by_id(-types.get(count)) + "\n";
                            }else{
                                ret += FPalaceHelper.get_stat_name_by_id(types.get(count)) + "\n";
                            }
                        }
                    }
                }
            }
        }
        
        return ret;
    }
    
    @Override 
    public Boolean sameItem(Item i){
        Boolean ret = super.sameItem(i);
        
        if(ret && i instanceof AlchemyItem){//was is
            
            AlchemyItem temp =  (AlchemyItem) i ;//was as
            if(temp.types.toString().equals(types.toString())){
                ret = true;
            }else{
                ret = false;
            }
            
        }else{
            ret = false;
        }
        
        return ret;			
    }
    
    @Override 
    public Item copyItem(){
        AlchemyItem temp = new AlchemyItem(this.name);
        int count= 0;
        
        for(count = 0;count<types.size();count++){
            //temp.types[count] = this.types[count]
            temp.types.set(count,this.types.get(count));
        }
        
        
        temp.name = this.name;
        temp.inventoryDescription = inventoryDescription;
        temp.droppedDescription = this.droppedDescription;
        temp.value = this.value;
        
        for(count=0;count<effects.size();count++){
            temp.effects.set(count, this.effects.get(count));//temp.effects[count] = this.effects[count]
        }
        
        temp.useDescription = this.useDescription;
        temp.numUses = this.numUses;
        
        for(count=0;count<changeEffects.size();count++){
            temp.changeEffects.set(count, this.changeEffects.get(count));//temp.changeEffects[count] = this.changeEffects[count]
        }
        temp.propogate = this.propogate;
        temp.identDifficulty = this.identDifficulty;
        temp.weight = this.weight;
        for(count=0;count < statActionAdd.size();count++){
            temp.statActionAdd.set(count, this.statActionAdd.get(count));//temp.statActionAdd[count] = this.statActionAdd[count]
        }
        
        temp.imageID = this.imageID;
        
        temp.topic = this.topic;
        temp.craftingRequirements = this.craftingRequirements;
        
        temp.tickCount = 0;
        temp.destroyTick = this.destroyTick;
        temp.spawnChar = this.spawnChar;
        
        return temp;
    }

}

