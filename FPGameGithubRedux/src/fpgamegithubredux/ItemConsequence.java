package fpgamegithubredux;

import java.util.ArrayList;

public class ItemConsequence extends Consequence {
		
    public Item recipe_reward;
    
    public ArrayList<Item> item_reward;//public var item_reward:Array
    public ArrayList<Integer> item_reward_roll;//public var item_reward_roll:Array
    public ArrayList<Boolean> item_gen;//public var item_gen:Array
    public ArrayList<Boolean> item_reward_target;//public var item_reward_target:Array
    public ArrayList<Boolean> remove_flag;//public var remove_flag:Array
    
    
    protected Item[] item_use;//public var item_use:Array;
    protected int[] item_use_roll;//public var item_use_roll:Array;
    protected Boolean[] item_use_target;//public var item_use_target:Array;
    protected Boolean[] item_use_holder;//public var item_use_holder:Array;
    
    public Boolean rest_flag;
    
    public ItemConsequence() {
        // constructor code
        super();
        recipe_reward = null;
        
        item_reward = new ArrayList<>();
        item_reward_roll = new ArrayList<>();
        item_gen = new ArrayList<>();
        item_reward_target = new ArrayList<>();
        remove_flag = new ArrayList<>();			
        /*
        item_use = new Array();			
        item_use_roll = new Array();			
        item_use_target = new Array();
        item_use_holder = new Array();
        */
        rest_flag = false;
    }
    
    public void set_rest_flag(){
        rest_flag = !rest_flag;
    }
    public void add_item_reward(Item i,int r){
        add_item_reward(i, r,false,true,false);
    }
    public void add_item_reward(Item i,int r, Boolean gen_flag){
        add_item_reward(i, r,gen_flag,true,false);
    }
    public void add_item_reward(Item i,int r, Boolean gen_flag,Boolean target){
        add_item_reward(i, r,gen_flag,target,false);
    }
    public void add_item_reward(Item i,int r, Boolean gen_flag,Boolean target,Boolean r_flag){
        //default false, true, false
        /*
        item_reward[item_reward.length] = i;
        item_reward_roll[item_reward_roll.length] = r;
        item_gen[item_gen.length] = gen_flag;
        item_reward_target[item_reward_target.length] = target;
        remove_flag[remove_flag.length] = r_flag;
        */
        item_reward.set(item_reward.size(), i);
        item_reward_roll.set(item_reward_roll.size(),r);
        item_gen.set(item_gen.size(), gen_flag);
        item_reward_target.set(item_reward_target.size(),target);
        remove_flag.set(remove_flag.size(), r_flag);
    }
    
    public void add_item_recipe(Item i){
        recipe_reward = i;
    }
    public void add_item_use(Item i, int r){
        add_item_use(i,r,true,true);
    }
    public void add_item_use(Item i, int r,Boolean target){
        add_item_use(i,r,target,true);
    }
    public void add_item_use(Item i, int r,Boolean target,Boolean holder){//default true, true
        item_use[item_use.length] = i;
        item_use_roll[item_use_roll.length] = r;
        item_use_target[item_use_target.length] = target;
        item_use_holder[item_use_holder.length] = holder;
    }
    /*
    @Override 
    public String trigger(Number r, Character c, Character c2){//default null, null
        String ret = "";
        
        if(recipe_reward != null){
            if(c!= null){
                c.personality.add_recipe(recipe_reward);
            }
        }
        
        var i:int = 0;
        for(i;i<item_reward.length;i++){
            if(c!= null && ((r >= item_reward_roll[i] && item_reward_roll[i] >= 0) || (r <= item_reward_roll[i] && item_reward_roll[i] < 0))){
                var item:Item;
                item = item_reward[i].clone();
                if(item_gen[i]){
                    if(extract > 0){
                        var consume_effects:Array = c.get_stat_actions(extract);
                        var consume_count:int = 0;
                        for(consume_count;consume_count<consume_effects.length;consume_count++){
                            var temp_a:Action = consume_effects[consume_count] as Action;
                            if(temp_a != null){
                                if(temp_a.get_consume()){
                                    //Should loop through the Actions challenges/Consequences, and modify them to not need a second participant
                                    var new_action:Action = new Action();
                                    new_action.clone(temp_a);
                                    var chall_count:int = 0;
                                    for(chall_count;chall_count<new_action.challenges.length;chall_count++){
                                        var temp_chall:Challenge = new_action.challenges[chall_count];
                                        if(temp_chall != null){
                                            if(!temp_chall.static_defense){
                                                //replace non static defense with what the character would provide.
                                                temp_chall.set_defense_stat(-1, c.get_stat(temp_chall.defense_stat));
                                            }
                                        }
                                    }
                                    item.add_action(new_action);
                                }
                            }
                        }
                        ret += c.fluid_extraction(extract);
                    }else if(extract < 0){
                        trace("(Item_Consequence)Something about item generation, and strange consumptions...");
                    }
                }
                var k:int = 0;
                if(item_reward_target[i]){
                    if(!remove_flag[i]){
                        c.add_to_possessions(item);
                    }else{
                        for(k;k<c.possessions.length;k++){
                            if(c.possessions[k].name == item.name){
                                c.drop(k);
                                break;
                            }
                        }
                    }						
                }else{
                    if(!remove_flag[i]){
                        c2.add_to_possessions(item);
                    }else{
                        for(k;k<c2.possessions.length;k++){
                            if(c2.possessions[k].name == item.name){
                                c2.drop(k);
                                break;
                            }
                        }
                    }						
                }
            }
        }
        
        i = 0;
        for(i;i<item_use.length;i++){
            if(c!= null && ((r >= item_use_roll[i] && item_use_roll[i] >= 0) || (r <= item_use_roll[i] && item_use_roll[i] < 0))){
                trace("(Item_Consequence.trigger)Should be using an item. ");
                k = 0;
                if(item_use_holder[i]){
                    for(k;k<c.possessions.length;k++){
                        if(c.possessions[k].name == item_use[i].name){
                            if(item_reward_target[i]){
                                ret += c.sanitize(c.possessions[k].use_item(c,k),c);							
                            }else{
                                ret += c2.sanitize(c.possessions[k].use_item(c2,k),c);							
                            }							
                            if(!c.possessions[k].still_usable()) c.drop(k);
                            break;
                        }
                    }
                }else{
                    for(k;k<c2.possessions.length;k++){
                        if(c2.possessions[k].name == item_use[i].name){
                            if(item_reward_target[i]){
                                ret += c.sanitize(c2.possessions[k].use_item(c,k),c);							
                            }else{
                                ret += c2.sanitize(c2.possessions[k].use_item(c2,k),c);							
                            }							
                            if(!c2.possessions[k].still_usable()) c2.drop(k);
                            break;
                        }
                    }
                }
            }
        }
        ret += super.trigger(r,c,c2);
        
        if(rest_flag && c!= null && ((r >= 0 && !this.change_on_success) || always_change || (r < 0 && this.change_on_success))){
            Action.rest_action(c);
        }
        return ret;
    }
    */
    /*
    override public function clone():Consequence{
        var ret:Item_Consequence = new Item_Consequence();
        ret.stat_effected = this.stat_effected;
        ret.consequence = this.consequence;
        var i:int = 0;
        for(i;i<this.consequence_description.length;i++){
            ret.consequence_description[i] = this.consequence_description[i];
        }
        
        ret.roll_required = this.roll_required;
        ret.show_effects = this.show_effects;
        ret.temp_flag = this.temp_flag;
        ret.amt_by_roll = this.amt_by_roll;
        ret.amt_formula = this.amt_formula;
        ret.random_effect = this.random_effect;
        ret.consequence_tick_effect = this.consequence_tick_effect;
        ret.change_on_success = this.change_on_success;
        ret.always_change = this.always_change;
        ret.never_change = this.never_change;
        ret.change_effects = this.change_effects;
        ret.action_for_stat = this.action_for_stat;
        ret.consequence_challenge = this.consequence_challenge;
        ret.xp_reward = this.xp_reward;
        ret.un_equip_slots = this.un_equip_slots;
        ret.un_equip_target = this.un_equip_target;
        ret.impregnate = this.impregnate;
        ret.consume = this.consume;
        ret.extract = this.extract;
        ret.consequence_target = this.consequence_target;
        ret.make_party = this.make_party;
        ret.remove_party = this.remove_party;
        ret.max_damage = this.max_damage;
        ret.target_part = this.target_part;
        ret.remove_effect_ids = this.remove_effect_ids;
        ret.interupt_chal = this.interupt_chal;
        ret.char_effect = this.char_effect;
        
        ret.recipe_reward = this.recipe_reward;
        
        ret.item_reward = this.item_reward;
        ret.item_gen = this.item_gen;
        ret.item_reward_roll = this.item_reward_roll;
        ret.item_reward_target = this.item_reward_target;
        ret.remove_flag = this.remove_flag;
        
        ret.item_use = this.item_use;
        ret.item_use_roll = this.item_use_roll;
        ret.item_use_target = this.item_use_target;
        ret.rest_flag = this.rest_flag;
        return ret;
    }
    */
}
