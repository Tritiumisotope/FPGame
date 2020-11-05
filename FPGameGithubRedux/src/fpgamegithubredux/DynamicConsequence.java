package fpgamegithubredux;

import java.util.ArrayList;

public class DynamicConsequence extends Consequence {
		
    public static int list_nolist = -1;
    public static int list_parts = 0;
    public static int list_noncrit_parts = 1;
    public static int list_inventory = 2;
    public static int list_inventory_alchemy = 3;
    public static int list_forage = 4;
    public static int list_hunt = 5;
    
    public static int list_noaction = -1;
    public static int list_removepart = 0;
    public static int list_removeandaddpart = 1;
    public static int list_useitem = 2;
    public static int list_useitemonother = 3;
    public static int list_target_part = 4;
    public static int list_dilute = 5;
    public static int list_refine = 6;
    public static int list_remove_alchemy = 7;
    public static int list_halvepart = 8;
    
    public int consequence_list_type;
    public int consequence_list_action;
    public String consequence_list_text;
    
    public DynamicConsequence() {
        // constructor code
        super();
        consequence_list_type = DynamicConsequence.list_nolist;
        consequence_list_action = DynamicConsequence.list_noaction;
        consequence_list_text = "";
    }
    public void set_consequence_list(String list_text){
        set_consequence_list(list_text,-1,-1);
    }
    public void set_consequence_list(String list_text,int list_type){
        set_consequence_list(list_text,list_type,-1);
    }
    public void set_consequence_list(String list_text,int list_type,int list_action){
        //default -1, -1
        consequence_list_text = list_text;
        consequence_list_type = list_type;
        consequence_list_action = list_action;
    }
    
    //@Override 
    public String trigger(Number r, Character c, Character c2){//default c1 null, c2 null
        String ret = super.trigger(r.intValue(),c,c2);
        ret += dynamic_choices(c, c2);
        return ret;
    }
    public String dynamic_choices(Character c){
        return dynamic_choices(c, null);
    }
    public String dynamic_choices(Character c, Character c2){//default c2 null
        String s = "";
        if(c2 == null) c2 = c;
        BodyPart temp_bp;
        int con_count = 0;
        //TODO location template, location exit_actions, character add_to_possessions
        /*
        if(consequence_list_type == DynamicConsequence.list_parts){
            for(con_count=0;con_count < c.body.parts.length;con_count++){
                temp_bp = c.body.parts[con_count];
                s += "<dc" + con_count + ">" + temp_bp.getName() + "</dc" + con_count + ">\n";
            }
        }else if(consequence_list_type == DynamicConsequence.list_noncrit_parts){
            for(con_count=0;con_count < c.body.parts.length;con_count++){
                temp_bp = c.body.parts[con_count];
                if(!temp_bp.crit_part()){
                    s += "<dc" + con_count + ">" + temp_bp.getName() + "</dc" + con_count + ">\n";
                }
            }
        }else if(consequence_list_type == DynamicConsequence.list_inventory){
            //right in combat, don't know about overworld
            for(con_count=0;con_count < c2.possessions.size() ;con_count++){//.length
                Item temp_item = c2.possessions.get(con_count);//[]
                s += "<dc" + con_count + ">" + temp_item.getName() + "</dc" + con_count + ">\n";
            }
        }else if(consequence_list_type == DynamicConsequence.list_inventory_alchemy){
            for(con_count=0;con_count < c2.possessions.size() ;con_count++){//.length
                Item temp_aitem = c2.possessions.get(con_count);//[]
                if(temp_aitem instanceof AlchemyItem)s += "<dc" + con_count + ">" + temp_aitem.getName() + "</dc" + con_count + ">\n";//was is
            }
        }else if(consequence_list_type == DynamicConsequence.list_forage){
            Number skill_amt = c.get_skill_by_id(FPalace_skills.adventure_id)/100;
            Item temp_item;//needed to copy
            if(c.location != null && c.location.template != null){
                int i = c.location.template.item.length - 1;
                for(i=c.location.template.item.length - 1;i>=0;i--){
                    temp_item = c.location.template.item[i];
                    if(temp_item != null && Math.random() < c.location.template.item_chance[i] + skill_amt){
                        break;
                    }
                }
                if(consequence_list_text != "") s += consequence_list_text;
                if(temp_item != null){
                    while(s.indexOf("</choice>") > -1) s = s.replace("</choice>", temp_item.getName());
                    temp_item = temp_item.itemCopy();//clone
                    c.add_to_possessions(temp_item);
                }else{
                    while(s.indexOf("</choice>") > -1) s = s.replace("</choice>", "nothing");
                }
            }
        }else if(consequence_list_type == DynamicConsequence.list_hunt){
            //could just use template, but they aren't the characters I want to be able to "Hunt"... or spawn more of
            if(consequence_list_text != "") s += consequence_list_text;
            if(c.location.exit_actions[0] != null && c.location.exit_actions[0].consequences[0].char_effect != null){
                Array char_template_list = new Array();
                for(con_count=0;con_count<c.location.exit_actions[0].consequences.length;con_count++){
                    char_template_list = char_template_list.concat(c.location.exit_actions[0].consequences[con_count].char_effect);
                }
                int rand = Math.round(Math.random()*char_template_list.length-1);
                while(char_template_list[rand] == null && char_template_list.length > 0){
                    char_template_list = char_template_list.slice(0,rand).concat(char_template_list.slice(rand+1,char_template_list.length));
                    rand = Math.round(Math.random()*char_template_list.length-1);
                }
                if(char_template_list[rand] != null && !(char_template_list[rand] is Array && char_template_list[rand][0] == null)){
                    Character new_char = null;
                    if(char_template_list[rand] instanceof Character_template){//was is
                        new_char = char_template_list[rand].gen_char();
                    }else if(char_template_list[rand] instanceof Array){//was is array
                        new_char = char_template_list[rand][Math.round(Math.random()*(char_template_list[rand].length-1))].gen_char();
                    }else{
                        //trace("(DynamicConsequence.dynamic_choices)I don't know how to hunt this...");
                    }
                    
                    if(c.location != null){
                        new_char.new_location(c.location);
                        if(c.location.cm == null) c.location.cm = new Combat_manager();
                        c.location.cm.add_participant(c);
                        c.location.cm.add_participant(new_char);
                    }
                    //Start combat
                    c.personality.new_relationship(new_char,c,Relationship.aggressive_change);
                    c.personality.make_aggressive(new_char);
                    new_char.personality.new_relationship(c,new_char,Relationship.aggressive_change);
                    new_char.personality.make_aggressive(c);
                    while(s.indexOf("</choice>") > -1) s = s.replace("</choice>", "<a href=\"event:combat,"+c.location.get_content_id(c)+",-1,-1\"><i>"+new_char.get_short_description(c)+"</i></a>");
                }else{
                    while(s.indexOf("</choice>") > -1) s = s.replace("</choice>", "nothing");
                }
            }else{
                while(s.indexOf("</choice>") > -1) s = s.replace("</choice>", "nothing");
            }
        }else{
            //if(consequence_list_type != DynamicConsequence.list_nolist)trace("(DynamicConsequence.dynamic_choices)Got an unknown choice type. id: " + consequence_list_type);
        }
        */
        return s;
    }
    
    public String trigger_dynamic(int[] choice,int roll, Character c, Character c2){//was array for choice, default c null, c2 null
        String ret = "";
        
        if(!consequence_list_text.equals("")) ret += consequence_list_text;
        
        ArrayList<Integer> choiceList = new ArrayList<>();
        for(int i:choice){
            choiceList.add(i);
        }
        if(choiceList == null || choiceList.get(0) == null) return ret;//[]
        
        Stat temp_stat;
        BodyPart temp_bp;
        Item temp_item;
        AlchemyItem temp_aitem;
        /*TODO body, type, slice, possessions
        if(consequence_list_action == DynamicConsequence.list_removepart){
            //wrong in combat, right in overworld...
            temp_bp = c.body.parts[choice[0]];
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_bp.get_name());
            c.body.remove_part_by_count(choice[0], c);
            if(temp_bp.crit_part()) ret += c.die();				
        }else if(consequence_list_action == DynamicConsequence.list_removeandaddpart){
            //wrong in combat, right in overworld...
            temp_bp = c.body.parts[choice[0]];
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_bp.get_name());
            c.body.remove_part_by_count(choice[0], c);
            if(temp_bp.crit_part()) ret += c.die();
            c2.apply_change_effect(temp_bp);
        }else if(consequence_list_action == DynamicConsequence.list_useitem){
            //right in combat, don't know about overworld
            temp_item = c2.possessions[choice[0]];
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_item.get_name());
            if(temp_item instanceof Weapon){//was is
                ret += c2.hold(temp_item as Weapon, 0, -1, true);
            }else if(temp_item instanceof Equipment){//was is
                ret += c2.equip((Equipment)temp_item , 0, -1, true);//was as
            }else{
                if(temp_item != null){
                    ret += temp_item.useItem(c2,choice[0]);
                    if(!temp_item.still_usable())c2.drop(choice[0]);
                }
            }
        }else if(consequence_list_action == DynamicConsequence.list_useitemonother){
            //right in combat, don't know about overworld
            temp_item = c2.possessions.get(choice[0]);//[]
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_item.getName());
            if(temp_item instanceof Weapon || temp_item instanceof Equipment){//was is
                //trace("(DynamicConsequence.trigger_dynamic)Using some sort of equipment/weapon on another character... not sure what to do");
            }else{
                if(temp_item != null){
                    if(choiceList.get(1) != null){//[]
                        if(temp_item.changeEffects[0] instanceof CharAction){//was is
                            CharAction temp_a = temp_item.changeEffects[0];
                            if(temp_item.numUses>0)temp_item.numUses--;
                            //ret += temp_a.challenge(0,c,c,1,choice.slice(1,choice.length));
                            //TODO slice
                        }
                    }else{
                        ret += temp_item.useItem(c,choice[0],1);
                    }
                    if(!temp_item.still_usable())c2.drop(choice[0]);
                }
            }
        }else if(consequence_list_action == DynamicConsequence.list_target_part){
            //right in combat, don't know about overworld
            temp_bp = c.body.parts[choice[0]];
            int count= 0;
            for(count=0;count<target_part.length;count++){
                if(!consequence_target[count])target_part[count] = temp_bp.get_part_id();
            }
            ret += trigger(roll, c, c2);
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_bp.getName());
        }else if(consequence_list_action == DynamicConsequence.list_dilute){
            temp_aitem = c2.possessions[choice[0]];
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_aitem.getName());
            if(temp_aitem != null){
                //Should go through the use and alchemy effects of the item, and halving them
                if(temp_aitem.getName().indexOf("Diluted") < 0)temp_aitem.set_name("Diluted " + temp_aitem.getName());
                int i = 0;
                for(i=0;i<temp_aitem.types.length;i++){
                    //go through and randomly remove types...
                    if(Math.random() < 0.5){
                        //temp_aitem.types = temp_aitem.types.slice(0,i).concat(temp_aitem.types.slice(i+1,temp_aitem.types.length));
                        //TODO slice
                        i--;
                    }
                }
                i = 0;
                for(i=0;i<temp_aitem.effects.length;i++){
                    //go through and halve effects...
                    if(temp_aitem.effects[i] != null)temp_aitem.effects[i] = temp_aitem.effects[i]/2;
                }
                i = 0;
                for(i=0;i<temp_aitem.changeEffects.length;i++){
                    //go through and randomly remove change effects...
                    if(Math.random() < 0.5){
                        //temp_aitem.changeEffects = temp_aitem.changeEffects.slice(0,i).concat(temp_aitem.changeEffects.slice(i+1,temp_aitem.changeEffects.length));
                        //TODO slice
                        i--;
                    }
                }
                i = 0;
                for(i=0;i<temp_aitem.statActionAdd.length;i++){
                    //go through and randomly remove action adds...
                    if(Math.random() < 0.5){
                        //temp_aitem.statActionAdd = temp_aitem.statActionAdd.slice(0,i).concat(temp_aitem.statActionAdd.slice(i+1,temp_aitem.statActionAdd.length));
                        //TODO slice
                        i--;
                    }
                }
                if(temp_aitem.getPropogate())temp_aitem.setPropogate();
            }
        }else if(consequence_list_action == DynamicConsequence.list_refine){
            //need to list the types available to refine...
            temp_aitem = c2.possessions[choice[0]];
            int alch_ident = 0;
            Character char_for_chal = c2;
            if(c2.party != null)char_for_chal = c2.party.get_best_at_skill(FPalace_skills.item_alchemy_effects_id);
            Challenge alch_ident_challenge = new Challenge(true);
            alch_ident_challenge.set_attack_stat(FPalace_skills.item_alchemy_effects_id);
            alch_ident_challenge.set_defense_stat(-1,temp_aitem.getIdentifyDifficulty());
            alch_ident_challenge.setVariability(temp_aitem.getIdentifyDifficulty()/2);
            
            int result = alch_ident_challenge.roll(char_for_chal);

            if(result >= 0){
                alch_ident += Math.round((char_for_chal.get_skill_by_id(FPalace_skills.item_alchemy_effects_id)+result)/temp_aitem.getIdentifyDifficulty());
            }
            int i;
            i = 0;
            for(i=0;i<temp_aitem.types.length;i++){
                if(temp_aitem.types[i] != null){
                    String name_string = "";
                    if(Math.random() <= alch_ident){
                        if(temp_aitem.types[i] >= 0){
                            name_string = FPalaceHelper.get_stat_name_by_id(temp_aitem.types[i]);
                        }else{
                            name_string = FPalaceHelper.get_stat_name_by_id(-temp_aitem.types[i]);
                        }
                    }
                    if(name_string == "")name_string = "?";
                    ret += "<dc" + i + ">" + name_string + "</dc" + i + ">\n";
                }
            }
        }else if(consequence_list_action == DynamicConsequence.list_remove_alchemy){
            temp_aitem = c2.possessions.get(choice[0]);//was[[]]
            Challenge alch_challenge = new Challenge(true);
            alch_challenge.set_attack_stat(FPalace_skills.alchemy_id);
            alch_challenge.set_defense_stat(-1,temp_aitem.getIdentifyDifficulty());
            alch_challenge.setVariability(temp_aitem.getIdentifyDifficulty()/2);
            
            int result = alch_challenge.roll(c2);

            int type_to_remove = choice[1];
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_aitem.getName());
            if(result < 0){
                temp_aitem.types = temp_aitem.types.slice(0,(type_to_remove>0) ? type_to_remove-1:0).concat(temp_aitem.types.slice(type_to_remove+2,temp_aitem.types.length));
            }else{
                temp_aitem.types = temp_aitem.types.slice(0,type_to_remove).concat(temp_aitem.types.slice(type_to_remove+1,temp_aitem.types.length));
            }
            if(temp_aitem.getName().indexOf("Refined") < 0)temp_aitem.setName("Refined " + temp_aitem.getName());
            if(temp_aitem.getPropogate())temp_aitem.setPropogate();
        }else if(consequence_list_action == DynamicConsequence.list_halvepart){
            temp_bp = c.body.parts[choice[0]];
            int i = 0;
            for(i=0;i<temp_bp.stat_description.length;i++){
                temp_stat = temp_bp.stat_description[i];
                Number tempValue = -1*temp_stat.statValue.doubleValue()/2
                ret += temp_bp.apply_effect(temp_stat.get_id(),tempValue,c);//-temp_stat.statValue
            }
            while(ret.indexOf("</choice>") > -1) ret = ret.replace("</choice>", temp_bp.get_name());				
        }else{
            if(consequence_list_action != DynamicConsequence.list_noaction){
                //trace("(DynamicConsequence.trigger_dynamic)Got an unknown action id... " + consequence_list_action + " came with choices: " + choice);
            }
        }
        */
        return ret;
        
    }
    
    //@Override 
    public Consequence copyConsequence(){
        DynamicConsequence ret = new DynamicConsequence();
        ret.statEffected = this.statEffected;
        ret.conseq = this.conseq;//was consequence, presumed same
        int i = 0;
        for(i=0;i<this.consequenceDescription.length;i++){
            ret.consequenceDescription[i] = this.consequenceDescription[i];
        }
        
        ret.roll_required = this.roll_required;
        ret.showEffects = this.showEffects;
        ret.temp_flag = this.temp_flag;
        ret.amt_by_roll = this.amt_by_roll;
        ret.amt_formula = this.amt_formula;
        ret.random_effect = this.random_effect;
        ret.consequenceTickEffect = this.consequenceTickEffect;
        ret.change_on_success = this.change_on_success;
        ret.always_change = this.always_change;
        ret.never_change = this.never_change;
        //ret.changeEffects = this.changeEffects;
        //ret.action_for_stat = this.action_for_stat;
        ret.consequenceChallenge = this.consequenceChallenge;
        ret.xp_reward = this.xp_reward;
        //ret.un_equip_slots = this.un_equip_slots;
        //ret.un_equip_target = this.un_equip_target;
        ret.impregnate = this.impregnate;
        ret.consume = this.consume;
        ret.extract = this.extract;
        ret.consequenceTarget = this.consequenceTarget;
        ret.make_party = this.make_party;
        ret.remove_party = this.remove_party;
        ret.max_damage = this.max_damage;
        ret.targetPart = this.targetPart;
        ret.remove_effect_ids = this.remove_effect_ids;
        ret.interupt_chal = this.interupt_chal;
        //ret.char_effect = this.char_effect;
        
        ret.consequence_list_type = this.consequence_list_type;
        ret.consequence_list_action = this.consequence_list_action;
        ret.consequence_list_text = this.consequence_list_text;
        return ret;
    }
    
}
