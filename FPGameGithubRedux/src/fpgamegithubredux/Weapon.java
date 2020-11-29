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
                c.drop_item(ui);
                int effect_count = 0;
                for(effect_count=0;effect_count<ui.effects.size();effect_count++){
                    if(ui.effects.get(effect_count) != null){
                        add_effect(effect_count, ui.effects.get(effect_count));
                    }
                }
                
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
    
    public void set_hold_condition(int statID,int min){//default min -1
        stat_req.add(statID); //stat_req[stat_req.length] = stat_id
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
            if (changeEffects.get(i) != null){//TODO would an else-if instanceof charaction negate this?
                if(changeEffects.get(i) instanceof Consequence){//was is
                    ((Consequence)changeEffects.get(i)).trigger(0, c);
                }else{
                    ((CharAction)changeEffects.get(i)).challenge(0,c);
                }
            }
        }
        
        if(!statActionAdd.isEmpty()){//TODO verify same as size()>0 being true
            for(i=0;i<statActionAdd.size();i++){
                c.add_stat_action(statActionAdd.get(i).statID(), statActionAdd.get(i).charAction());//(i*2, i*2+1)
            }
        }
        
        for(i=0;i<effects.size();i++){
            if(effects.get(i) != null)c.apply_equip_affect_by_id(i, effects.get(i));
        }
        
        for(i=0;i<skill_id.size();i++){
            if(skill_bonus.get(i) != 0)c.set_skill_bonus(skill_id.get(i), skill_bonus.get(i));
        }
        
    }
    
    public void remove_effects(Character c){
        int i = 0;
        for(i=0;i<effects.size();i++){
            if(effects.get(i) != null)c.apply_equip_affect_by_id(i, -effects.get(i));
        }
        
        if(!statActionAdd.isEmpty()){//was size()>0
            for(i=0;i<statActionAdd.size();i++){
                c.remove_stat_action(statActionAdd.get(i).statID(), statActionAdd.get(i).charAction());//(2*i,2*i+1)
            }
        }
        
        for(i=0;i<skill_id.size();i++){
            if(skill_bonus.get(i) != 0)c.set_skill_bonus(skill_id.get(i), -skill_bonus.get(i));
        }
    }
 
    public String get_description(Character c){
        return get_description(c,null,null);
    }

    public String get_description(Character c, ArrayList<Integer> identEffectiveness){
        return get_description(c,identEffectiveness,null);
    }
    public String get_description(Character c, ArrayList<Integer> ident_effectiveness, Boolean keep_tags){//default ident=null, keep=false
        String ret = super.getDescription(c, ident_effectiveness, keep_tags);
        Number ident_chance = 0;
        if(ident_effectiveness != null){
            ident_chance = ident_effectiveness.get(0)/identDifficulty;
        }
        
        Boolean showing = false;
        int count = 0;
        if(stat_req.isEmpty()){//was size()>0
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
        if(!skill_id.isEmpty()){//was size()>0
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
                    if(!already_exists)damage_types.add(attack_action.consequences.get(count).damage_type_id);
                }
            }
        
            showing = false;
            if(!damage_types.isEmpty()){//was size()>0 and not !
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
            if(temp.skill_bonus.toString().equals(skill_bonus.toString()) && temp.skill_id.toString().equals(skill_id.toString()) && temp.enchantment_level == enchantment_level
                && temp.stat_min.toString().equals(stat_min.toString()) && temp.stat_req.toString().equals(stat_req.toString()) && temp.num_hold_slots_req == num_hold_slots_req){
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
    public Item copyItem(){//should this just return Weapon?
        Weapon temp = new Weapon();
        temp.name = this.name;
        temp.num_hold_slots_req = this.num_hold_slots_req;
        temp.attack_action = this.attack_action;
        temp.stat_req = this.stat_req;
        temp.stat_min = this.stat_min;
        temp.droppedDescription = this.droppedDescription;
        temp.value = this.value;
        temp.effects = new ArrayList<>(this.effects);//TODO each of these was just a copy loop to temp
        temp.useDescription = this.useDescription;
        temp.changeEffects = new ArrayList<>(this.changeEffects);
        temp.propogate = this.propogate;
        temp.inventoryDescription = inventoryDescription;
        temp.identDifficulty = this.identDifficulty;
        temp.weight = this.weight;
        temp.statActionAdd = new ArrayList<>(this.statActionAdd);
        temp.numUses = this.numUses;
        temp.skill_id = new ArrayList<>(this.skill_id);
        temp.skill_bonus = new ArrayList<>(this.skill_bonus);
        
        temp.imageID = this.imageID;
        
        temp.enchantment_level = this.enchantment_level;
        
        temp.topic = this.topic;
        
        temp.craftingRequirements = new ArrayList<>(this.craftingRequirements);
        
        temp.upgrade_slot_ids = upgrade_slot_ids;
        temp.upgrade_items = new ArrayList<>();
        
        temp.tickCount = 0;
        temp.destroyTick = this.destroyTick;
        temp.spawnChar = this.spawnChar;
        
        return temp;
    }
    
}