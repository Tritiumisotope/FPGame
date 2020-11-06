package fpgamegithubredux;

import java.util.ArrayList;

public class Weapon extends Item {
		
    protected int num_hold_slots_req;
    protected CharAction attack_action;
    
    protected ArrayList<Integer> stat_req;//protected var stat_req:Array
    protected ArrayList<Integer> stat_min;//protected var stat_min:Array
    
    protected ArrayList<Integer> skill_id;//protected var skill_id:Array
    protected ArrayList<Integer> skill_bonus;//protected var skill_bonus:Array
    

    protected int enchantment_level;
    
    
    protected ArrayList<Integer> upgrade_slot_ids;//protected var upgrade_slot_ids:Array
    protected ArrayList<Upgrade_Item> upgrade_items;
    
    public Weapon(){
        new Weapon(null);
    }
    public Weapon(String n){//default null
        super(n);
        numUses = -1;
        
        attack_action = null;
        
        num_hold_slots_req = 1;
        
        
        stat_req = new ArrayList<>();
        stat_min = new ArrayList<>();
        
        skill_id = new ArrayList<>();
        skill_bonus = new ArrayList<>();
        
        enchantment_level = 0;
        
        upgrade_slot_ids = new ArrayList<>();
        upgrade_items = new ArrayList<>();
        
    }
    public String attach_upgrade_item(Upgrade_Item ui, Character c){
        String ret = "";
        int i = 0;
        for(i=0;i<upgrade_slot_ids.size();i++){
            if(upgrade_slot_ids.get(i) == ui.upgrade_type_id && upgrade_items.get(i)== null){
                upgrade_items.set(i, ui);
                ret += "</n> attaches the " + ui.getName() + " to the " + getName()+". \n";
                //c.drop_item(ui);
                //TODO
                int effect_count = 0;
                for(effect_count=0;effect_count<ui.effects.size();effect_count++){
                    if(ui.effects.get(effect_count) != null){
                        add_effect(effect_count, ui.effects.get(effect_count));
                    }
                }
                
                effect_count = 0;
                for(effect_count=0;effect_count<ui.skill_id.size();effect_count++){
                    set_skill_bonus(ui.skill_id.get(effect_count),ui.skill_bonus.get(effect_count));
                }
                
            }
        }
        if(ret.equals("")) ret = "You can't attach the " + ui.getName() + " to that. \n";
        return ret;
    }
    public void add_upgrade_slot(int id){
        upgrade_slot_ids.add(id); //upgrade_slot_ids[upgrade_slot_ids.length] = id
    }
    
    public int get_enchantment_level(){
        return enchantment_level;
    }
    
    public void set_enchantment_level(int i){
        enchantment_level = i;
    }
    
    public void set_skill_bonus(int id,int bonus){
        skill_id.add(id); //skill_id[skill_id.length] = id
        skill_bonus.add(bonus); //skill_bonus[skill_bonus.length] = bonus
    }
    
    public void set_num_hold(int i){
        num_hold_slots_req = i;
    }
    
    public void set_hold_condition(int stat_id,int min){//default min -1
        stat_req.add(stat_id); //stat_req[stat_req.length] = stat_id
        stat_min.add(min); //stat_min[stat_min.length] = min
    }
    
    public void set_attack_action(CharAction a){
        attack_action = a;
    }
    
    public int get_num_hold(){
        return num_hold_slots_req;
    }
    
    public void equip_effects(Character c){
        int i = 0;
        for (i=0;i<changeEffects.size();i++){
            if (changeEffects.get(i) != null){
                if(changeEffects.get(i) instanceof Consequence){//was is
                    Consequence temp = (Consequence)changeEffects.get(i);
                    temp.trigger(0, c);
                    //changeEffects.get(i).trigger(0, c)
                    //TODO verify both!!
                }else{
                    CharAction temp = (CharAction)changeEffects.get(i);
                    //changeEffects.get(i).challenge(0,c)
                    temp.challenge(0,c);
                }
            }
        }
        
        //if(statActionAdd.size() > 0){
        if(!statActionAdd.isEmpty()){//TODO verify are the same!
            for(i=0;i<Math.ceil(statActionAdd.size()/(double)2);i++){
                //c.add_stat_action(statActionAdd.get(i*2), statActionAdd.get(i*2+1));
                //TODO add_stat_action in Character
            }
        }
        
        for(i=0;i<effects.size();i++){
            //if(effects.get(i) != null)c.apply_equip_affect_by_id(i, effects.get(i));
            //TODO apply_equip_affect_by_id in Character
        }
        
        for(i=0;i<skill_id.size();i++){
            //if(skill_bonus[i] != 0)c.set_skill_bonus(skill_id[i], skill_bonus[i]);
            //TODO set_skill_bonus in Character
        }
        
    }
    
    public void remove_effects(Character c){
        int i = 0;
        for(i=0;i<effects.size();i++){
            //if(effects.get(i) != null)c.apply_equip_affect_by_id(i, -effects.get(i));
            //TODO in Character
        }
        
        if(statActionAdd.size() > 0){
            for(i=0;i<Math.ceil(statActionAdd.size()/2);i++){
                //c.remove_stat_action(statActionAdd.get(i*2), statActionAdd.get(i*2+1));
                //TODO Character remove_stat_action
            }
        }
        
        for(i=0;i<skill_id.size();i++){
            //if(skill_bonus[i] != 0)c.set_skill_bonus(skill_id[i], -skill_bonus[i]);
            //TODO Character skill_bonus
        }
    }
 
    public String get_description(Character c){
        return get_description(c,null,null);
    }

    public String get_description(Character c, ArrayList<Integer> ident_effectiveness){
        return get_description(c,ident_effectiveness,null);
    }
    public String get_description(Character c, ArrayList<Integer> ident_effectiveness, Boolean keep_tags){//default ident=null, keep=false
        String ret = super.getDescription(c, ident_effectiveness, keep_tags);
        Number ident_chance = 0;
        if(ident_effectiveness != null){
            ident_chance = ident_effectiveness.get(0)/identDifficulty;
        }
        
        Boolean showing = false;
        int count = 0;
        if(stat_req.size() > 0){
            for(count=0;count < stat_req.size();count ++){
                if(Math.random() <= ident_chance.doubleValue()){
                    if(!showing){
                        showing = true;
                        ret += "\nRequires the following stats:\n";
                    }
                    ret += stat_min.get(count) + " " + FPalaceHelper.get_stat_name_by_id(stat_req.get(count)) + "\n";
                }
            }
        }
        
        showing = false;
        if(skill_id.size() > 0){
            for(count=0;count < skill_id.size();count ++){
                if(Math.random() <= ident_chance.doubleValue()){
                    if(!showing){
                        showing = true;
                        ret += "\nImpacts skills:\n";
                    }
                    ret += FPalace_skills.get_skill_name(skill_id.get(count)) + "\n";
                }
            }
        }
        
        if(attack_action != null){
            //var damage_types:Array = new Array()
            ArrayList<Integer> damage_types = new ArrayList<>();
            for(count=0;count<attack_action.consequences.size();count++){
                if(attack_action.consequences.get(count).damage_type_id > -1){
                    Boolean already_exists = false;
                    int count2 = 0;
                    for(count2=0;count2<damage_types.size();count2++){
                        if(damage_types.get(count2) == attack_action.consequences.get(count).damage_type_id){
                            already_exists = true;
                            break;
                        }
                    }
                    //if(!already_exists)damage_types[damage_types.length] = attack_action.consequences[count].damage_type_id;
                    if(!already_exists)damage_types.add(attack_action.consequences.get(count).damage_type_id);
                }
            }
        
            showing = false;
            if(damage_types.size() > 0){
                for(count=0;count < damage_types.size();count ++){
                    if(Math.random() <= ident_chance.doubleValue()){
                        if(!showing){
                            showing = true;
                            ret += "\nDoes damage of type:\n";
                        }
                        ret += FPalaceHelper.get_type_name_by_id(damage_types.get(count)) + "\n";
                    }
                }
            }
        }
        
        return ret;
    }
    
    @Override 
    public Boolean sameItem(Item i){
        Boolean ret= super.sameItem(i);
        
        if(ret && i instanceof Weapon){//was is
            Weapon temp = (Weapon)i;
            if(temp.skill_bonus.toString() == skill_bonus.toString() && temp.skill_id.toString() == skill_id.toString() && temp.enchantment_level == enchantment_level
                && temp.stat_min.toString() == stat_min.toString() && temp.stat_req.toString() == stat_req.toString() && temp.num_hold_slots_req == num_hold_slots_req){
                    ret = true;
                }else{
                    ret = false;
                }
        }else{
            ret = false;
        }
        
        return ret;			
    }
    /*
    @Override 
    public Item copyItem(){
        Weapon = new Weapon();
        temp.name = this.name;
        temp.num_hold_slots_req = this.num_hold_slots_req;
        temp.attack_action = this.attack_action;
        temp.stat_req = this.stat_req;
        temp.stat_min = this.stat_min;
        temp.dropped_description = this.dropped_description;
        temp.value = this.value;
        var count:int = 0;
        for(count;count<effects.length;count++){
            temp.effects[count] = this.effects[count];
        }
        temp.use_description = this.use_description;
        count = 0;
        for(count;count<changeEffects.length;count++){
            temp.changeEffects[count] = this.changeEffects[count];
        }
        temp.propogate = this.propogate;
        temp.inventory_description = inventory_description;
        temp.identDifficulty = this.identDifficulty;
        temp.weight = this.weight;
        count = 0;
        for(count;count < statActionAdd.size();count++){
            temp.statActionAdd[count] = this.statActionAdd[count];
        }
        temp.num_uses = this.num_uses;
        
        count = 0;
        for(count;count<skill_id.length;count++){
            temp.skill_id[count] = this.skill_id[count];
        }
        count = 0;
        for(count;count<skill_bonus.length;count++){
            temp.skill_bonus[count] = this.skill_bonus[count];
        }
        
        temp.image_id = this.image_id;
        
        temp.enchantment_level = this.enchantment_level;
        
        temp.topic = this.topic;
        
        temp.crafting_requirements = this.crafting_requirements;
        
        temp.upgrade_slot_ids = upgrade_slot_ids;
        temp.upgrade_items = new Array();
        
        temp.tick_count = 0;
        temp.destroy_tick = this.destroy_tick;
        temp.spawn_char = this.spawn_char;
        
        return temp;
    }
    */
}