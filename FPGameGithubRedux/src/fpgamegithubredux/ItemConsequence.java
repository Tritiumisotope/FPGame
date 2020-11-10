package fpgamegithubredux;

import java.util.ArrayList;

public class ItemConsequence extends Consequence {
		
    public Item recipe_reward;
    
    public ArrayList<Item> item_reward;//public var item_reward:Array
    public ArrayList<Integer> item_reward_roll;//public var item_reward_roll:Array
    public ArrayList<Boolean> item_gen;//public var item_gen:Array
    public ArrayList<Boolean> item_reward_target;//public var item_reward_target:Array
    public ArrayList<Boolean> remove_flag;//public var remove_flag:Array
    
    
    protected ArrayList<Item> item_use;//public var item_use:Array
    protected ArrayList<Integer> item_use_roll;//public var item_use_roll:Array
    protected ArrayList<Boolean> item_use_target;//public var item_use_target:Array
    protected ArrayList<Boolean> item_use_holder;//public var item_use_holder:Array
    
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
        item_use = new ArrayList<>();			
        item_use_roll = new ArrayList<>();			
        item_use_target = new ArrayList<>();
        item_use_holder = new ArrayList<>();
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
        item_reward.set(item_reward.size(), i);//item_reward[item_reward.length] = i
        item_reward_roll.set(item_reward_roll.size(),r);//item_reward_roll[item_reward_roll.length] = r
        item_gen.set(item_gen.size(), gen_flag);//item_gen[item_gen.length] = gen_flag
        item_reward_target.set(item_reward_target.size(),target);//item_reward_target[item_reward_target.length] = target
        remove_flag.set(remove_flag.size(), r_flag);// remove_flag[remove_flag.length] = r_flag
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
        item_use.add(i); //item_use[item_use.size()] = i;
        item_use_roll.add(r); //item_use_roll[item_use_roll.length] = r;
        item_use_target.add(target); //item_use_target[item_use_target.length] = target;
        item_use_holder.add(holder); //item_use_holder[item_use_holder.length] = holder;
    }
    
    @Override 
    public String trigger(Number r, Character c, Character c2){//default null, null
        String ret = "";
        
        if(recipe_reward != null){
            if(c!= null){
                c.personality.add_recipe(recipe_reward);
            }
        }
        
        int i = 0;
        for(i=0;i<item_reward.size();i++){
            if(c!= null && ((r.doubleValue() >= item_reward_roll.get(i) && item_reward_roll.get(i) >= 0) || (r.doubleValue() <= item_reward_roll.get(i) && item_reward_roll.get(i) < 0))){
                Item item;
                item = item_reward.get(i).copyItem();
                if(item_gen.get(i)){
                    if(extract > 0){
                        ArrayList<Object> consume_effects = c.get_stat_actions(extract);
                        int consume_count = 0;//TODO ABOVE!!
                        for(consume_count=0;consume_count<consume_effects.size();consume_count++){
                            CharAction temp_a = (CharAction)consume_effects.get(consume_count) ;
                            if(temp_a != null){
                                if(temp_a.get_consume()){
                                    //Should loop through the Actions challenges/Consequences, and modify them to not need a second participant
                                    CharAction new_action = new CharAction();
                                    new_action.copyCharAction(temp_a);
                                    int chall_count = 0;
                                    for(chall_count=0;chall_count<new_action.challenges.size();chall_count++){
                                        Challenge temp_chall = new_action.challenges.get(chall_count);
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
                        //ret += c.fluid_extraction(extract);
                        //TODO
                    }else if(extract < 0){
                        //trace("(Item_Consequence)Something about item generation, and strange consumptions...");
                    }
                }
                int k = 0;
                /*
                if(item_reward_target.get(i)){
                    if(!remove_flag[i]){
                        c.add_to_possessions(item);
                    }else{
                        for(k;k<c.possessions.size();k++){
                            if(c.possessions.get(k).name == item.name){
                                c.drop(k);
                                break;
                            }
                        }
                    }						
                }else{
                    if(!remove_flag[i]){
                        c2.add_to_possessions(item);
                    }else{
                        for(k;k<c2.possessions.size();k++){
                            if(c2.possessions.get(k).name == item.name){
                                c2.drop(k);
                                break;
                            }
                        }
                    }						
                }
                */
            }
        }
        
        for(i=0;i<item_use.size();i++){
            if(c!= null && ((r.intValue() >= item_use_roll.get(i) && item_use_roll.get(i) >= 0) || (r.intValue() <= item_use_roll.get(i) && item_use_roll.get(i) < 0))){
                //trace("(Item_Consequence.trigger)Should be using an item. ");
                int k = 0;
                if(item_use_holder.get(i)){
                    for(k=0;k<c.possessions.size();k++){
                        if(c.possessions.get(k).name.equals(item_use.get(i).name)){
                            if(item_reward_target.get(i)){
                                ret += c.sanitize(c.possessions.get(k).useItem(c,k),c);							
                            }else{
                                ret += c2.sanitize(c.possessions.get(k).useItem(c2,k),c);							
                            }							
                            if(!c.possessions.get(k).stillUsable()) c.drop(k);
                            break;
                        }
                    }
                }else{
                    for(k=0;k<c2.possessions.size();k++){
                        if(c2.possessions.get(k).name.equals(item_use.get(i).name)){
                            if(item_reward_target.get(i)){
                                ret += c.sanitize(c2.possessions.get(k).useItem(c,k),c);							
                            }else{
                                ret += c2.sanitize(c2.possessions.get(k).useItem(c2,k),c);							
                            }							
                            if(!c2.possessions.get(k).stillUsable()) c2.drop(k);
                            break;
                        }
                    }
                }
            }
        }
        ret += super.trigger(r,c,c2);
        
        if(rest_flag && c!= null && ((r.intValue() >= 0 && !this.change_on_success) || always_change || (r.intValue() < 0 && this.change_on_success))){
            CharAction.rest_action(c);
        }
        return ret;
    }
    
    
    @Override 
    public Consequence copyConsequence(){
        ItemConsequence ret= new ItemConsequence();
        ret.statEffected = new ArrayList<>(this.statEffected);
        ret.conseq = new ArrayList<>(this.conseq);//was consequence, presumed same
        /*
        for(int i=0;i<this.consequenceDescription.size();i++){
            ret.consequenceDescription[i] = this.consequenceDescription[i];
        }
        */
        ret.consequenceDescription = new ArrayList<>(this.consequenceDescription);
        ret.roll_required = new ArrayList<>(this.roll_required);
        ret.showEffects = new ArrayList<>(this.showEffects);
        ret.tempFlag = new ArrayList<>(this.tempFlag);
        ret.amt_by_roll = this.amt_by_roll;
        ret.amt_formula = new ArrayList<>(this.amt_formula);
        ret.random_effect = this.random_effect;
        ret.consequenceTickEffect = new ArrayList<>(this.consequenceTickEffect);
        ret.change_on_success = this.change_on_success;
        ret.always_change = this.always_change;
        ret.never_change = this.never_change;
        ret.change_effects = new ArrayList<>(this.change_effects);
        ret.action_for_stat = new ArrayList<>(this.action_for_stat);
        ret.consequenceChallenge = new ArrayList<>(this.consequenceChallenge);
        ret.xp_reward = this.xp_reward;
        ret.un_equip_slots = new ArrayList<>(this.un_equip_slots);
        ret.un_equip_target = new ArrayList<>(this.un_equip_target);
        ret.impregnate = this.impregnate;
        ret.consume = this.consume;
        ret.extract = this.extract;
        ret.consequenceTarget = new ArrayList<>(this.consequenceTarget);
        ret.make_party = this.make_party;
        ret.remove_party = this.remove_party;
        ret.max_damage = this.max_damage;
        ret.targetPart = new ArrayList<>(this.targetPart);
        ret.remove_effect_ids = new ArrayList<>(this.remove_effect_ids);
        ret.interupt_chal = this.interupt_chal;
        ret.char_effect = new ArrayList<>(this.char_effect);
        //can we not call super due to combat start element?
        
        ret.recipe_reward = this.recipe_reward;
        
        ret.item_reward = new ArrayList<>(this.item_reward);
        ret.item_gen = new ArrayList<>(this.item_gen);
        ret.item_reward_roll = new ArrayList<>(this.item_reward_roll);
        ret.item_reward_target = new ArrayList<>(this.item_reward_target);
        ret.remove_flag = new ArrayList<>(this.remove_flag);
        
        ret.item_use = this.item_use;
        ret.item_use_roll = this.item_use_roll;
        ret.item_use_target = this.item_use_target;
        ret.rest_flag = this.rest_flag;
        return ret;
    }
}
