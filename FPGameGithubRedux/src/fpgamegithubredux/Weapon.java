package fpgamegithubredux;

public class Weapon extends Item{
		
    public int num_hold_slots_req;
    public CharAction attack_action;
    
    public int[] stat_req;//public var stat_req:Array
    public int[] stat_min;//public var stat_min:Array
    
    public int[] skill_id;//public var skill_id:Array
    public int[] skill_bonus;//public var skill_bonus:Array
    

    public int enchantment_level;
    
    
    public int[] upgrade_slot_ids;//public var upgrade_slot_ids:Array
    //public var upgrade_items:Array;
    
    public Weapon(){
        new Weapon(null);
    }
    public Weapon(String n){//default null
        super(n);
        numUses = -1;
        
        attack_action = null;
        
        num_hold_slots_req = 1;
        
        /*
        stat_req = new Array();
        stat_min = new Array();
        
        skill_id = new Array();
        skill_bonus = new Array();
        */
        enchantment_level = 0;
        
        /*
        upgrade_slot_ids = new Array();
        upgrade_items = new Array();
        */
    }
    /*
    public function attach_upgrade_item(ui:Upgrade_Item, c:Character):String{
        var ret:String = "";
        var i:int = 0;
        for(i;i<upgrade_slot_ids.length;i++){
            if(upgrade_slot_ids[i] == ui.upgrade_type_id && upgrade_items[i] == null){
                upgrade_items[i] = ui;
                ret += "</n> attaches the " + ui.get_name() + " to the " + get_name()+". \n";
                c.drop_item(ui);
                var effect_count:int = 0;
                for(effect_count;effect_count<ui.effects.length;effect_count++){
                    if(ui.effects[effect_count] != null){
                        add_effect(effect_count, ui.effects[effect_count]);
                    }
                }
                
                effect_count = 0;
                for(effect_count;effect_count<ui.skill_id.length;effect_count++){
                    set_skill_bonus(ui.skill_id[effect_count],ui.skill_bonus[effect_count]);
                }
                
            }
        }
        if(ret == "") ret = "You can't attach the " + ui.get_name() + " to that. \n";
        return ret;
    }
    */
    public void add_upgrade_slot(int id){
        upgrade_slot_ids[upgrade_slot_ids.length] = id;
    }
    
    public int get_enchantment_level(){
        return enchantment_level;
    }
    
    public void set_enchantment_level(int i){
        enchantment_level = i;
    }
    
    public void set_skill_bonus(int id,int bonus){
        skill_id[skill_id.length] = id;
        skill_bonus[skill_bonus.length] = bonus;
    }
    
    public void set_num_hold(int i){
        num_hold_slots_req = i;
    }
    
    public void set_hold_condition(int stat_id,int min){//default min -1
        stat_req[stat_req.length] = stat_id;
        stat_min[stat_min.length] = min;
    }
    
    public void set_attack_action(CharAction a){
        attack_action = a;
    }
    
    public int get_num_hold(){
        return num_hold_slots_req;
    }
    /*
    public void equip_effects(Character c){
        var i:int = 0;
        for (i;i<change_effects.length;i++){
            if (change_effects[i] != null){
                if(change_effects[i] is Consequence){
                    change_effects[i].trigger(0, c);
                }else{
                    change_effects[i].challenge(0,c);
                }
            }
        }
        
        if(stat_action_add.length > 0){
            i = 0;
            for(i;i<Math.ceil(stat_action_add.length/2);i++){
                c.add_stat_action(stat_action_add[i*2], stat_action_add[i*2+1]);
            }
        }
        
        i = 0;
        for(i;i<effects.length;i++){
            if(effects[i] != null)c.apply_equip_affect_by_id(i, effects[i]);
        }
        
        i = 0;
        for(i;i<skill_id.length;i++){
            if(skill_bonus[i] != 0)c.set_skill_bonus(skill_id[i], skill_bonus[i]);
        }
        
    }
    
    public function remove_effects(c:Character):void{
        var i:int = 0;
        for(i;i<effects.length;i++){
            if(effects[i] != null)c.apply_equip_affect_by_id(i, -effects[i]);
        }
        
        if(stat_action_add.length > 0){
            i = 0;
            for(i;i<Math.ceil(stat_action_add.length/2);i++){
                c.remove_stat_action(stat_action_add[i*2], stat_action_add[i*2+1]);
            }
        }
        
        i = 0;
        for(i;i<skill_id.length;i++){
            if(skill_bonus[i] != 0)c.set_skill_bonus(skill_id[i], -skill_bonus[i]);
        }
    }
    
    override public function get_description(c:Character, ident_effectiveness:Array = null, keep_tags:Boolean = false):String{
        var ret:String = super.get_description(c, ident_effectiveness, keep_tags);
        var ident_chance:Number = 0;
        if(ident_effectiveness != null){
            ident_chance = ident_effectiveness[0]/ident_difficulty;
        }
        
        var showing:Boolean = false;
        var count:int = 0;
        if(stat_req.length > 0){
            for(count;count < stat_req.length;count ++){
                if(Math.random() <= ident_chance){
                    if(!showing){
                        showing = true;
                        ret += "\nRequires the following stats:\n";
                    }
                    ret += stat_min[count] + " " + FPalace_helper.get_stat_name_by_id(stat_req[count]) + "\n"
                }
            }
        }
        
        showing = false;
        count = 0;
        if(skill_id.length > 0){
            for(count;count < skill_id.length;count ++){
                if(Math.random() <= ident_chance){
                    if(!showing){
                        showing = true;
                        ret += "\nImpacts skills:\n";
                    }
                    ret += FPalace_skills.get_skill_name(skill_id[count]) + "\n"
                }
            }
        }
        
        if(attack_action != null){
            var damage_types:Array = new Array();
            count = 0;
            for(count;count<attack_action.consequences.length;count++){
                if(attack_action.consequences[count].damage_type_id > -1){
                    var already_exists:Boolean = false;
                    var count2:int = 0;
                    for(count2;count2<damage_types.length;count2++){
                        if(damage_types[count2] == attack_action.consequences[count].damage_type_id){
                            already_exists = true;
                            break
                        }
                    }
                    if(!already_exists)damage_types[damage_types.length] = attack_action.consequences[count].damage_type_id;
                }
            }
        
            showing = false;
            count = 0;
            if(damage_types.length > 0){
                for(count;count < damage_types.length;count ++){
                    if(Math.random() <= ident_chance){
                        if(!showing){
                            showing = true;
                            ret += "\nDoes damage of type:\n";
                        }
                        ret += FPalace_helper.get_type_name_by_id(damage_types[count]) + "\n"
                    }
                }
            }
        }
        
        return ret;
    }
    
    override public function same_item(i:Item):Boolean{
        var ret:Boolean = super.same_item(i);
        
        if(ret && i is Weapon){
            var temp:Weapon = i as Weapon;
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
    
    override public function clone():Item{
        var temp:Weapon = new Weapon();
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
        for(count;count<change_effects.length;count++){
            temp.change_effects[count] = this.change_effects[count];
        }
        temp.propogate = this.propogate;
        temp.inventory_description = inventory_description;
        temp.ident_difficulty = this.ident_difficulty;
        temp.weight = this.weight;
        count = 0;
        for(count;count < stat_action_add.length;count++){
            temp.stat_action_add[count] = this.stat_action_add[count];
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