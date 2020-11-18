package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CharAction {
    public static final int attack_type_single_target = 0;//single target
    public static final int attack_type_all_enemy_target_single_conseq = 1;//all enemies, consequnce is on initiator
    public static final int attack_type_party_target_party_conseq = 2;//party of target, consequence on party of target
    public static final int attack_type_all_enemy_target_all_enemy_conseq = 3;//all enemies, consequence on all enemies
    public static final int attack_type_all_target_all_conseq = 4;//everyone in combat, consequence on everyone in combat
    public static final int attack_type_all_target_no_user_conseq = 5;//everyone in combat, consequence on everyone in combat except the user
    public static final int attack_type_self_target = 6;

    private static final Logger LOGGER = Logger.getLogger(Character.class.getName());

    protected String name;
    protected ArrayList<Challenge> challenges;
    protected String dialogue;
    protected String status_change;
    protected int auto_trigger_id;
    public DynamicObject originator;
    protected int charID;
    protected ArrayList<Consequence> consequences;
    protected ArrayList<Integer>  requirement;
    protected ArrayList<Integer>  requirement_amount;
    protected ArrayList<Boolean>  requirement_remove;
    public int blowback;
    public int blowback_amount;
    protected Item item_req;
    protected Boolean force_failure;
    public Boolean alchemy_flag= false;
    public Boolean enchant_flag = false;
    public Boolean sewing_flag = false;
    public Boolean craft_flag = false;
    public Boolean trade_flag = false;
    public Boolean dismantle_flag = false;
    public Item trader_item = null;
    public Boolean personal = false;
    public Boolean party_use = false;
    public Boolean rest_flag;
    public int attack_flag = -1;
	public String attack_type = "";
	public int attack_order = -1;
	public String attack_desc = "";
	public Boolean fire_weapon_challenge = false;
	public Boolean talk_flag = false;
	public Boolean delayed_trigger = false;
	public Boolean consume_action = false;
	public Boolean impreg_action = false;
	public Boolean extract_action = false;
	public Boolean bury_action = false;
	public String cclass_origin;
    public int cclass_level;
    

    public CharAction(){
        name = "";
        challenges = new ArrayList<>();
        dialogue = "";
        status_change = "";
        auto_trigger_id = -1;
        consequences = new ArrayList<>();
        requirement = new ArrayList<>();
        requirement_amount = new ArrayList<>();
        requirement_remove = new ArrayList<>();
        item_req = null;
        blowback = -1;
        blowback_amount = 0;
        cclass_origin = "";
        cclass_level = 0;
        delayed_trigger = false;
    }
    public void set_consume_action(){
        consume_action = !consume_action;
    }
    
    public void set_impreg_action(){
        impreg_action = !impreg_action;
    }
    
    public void set_extract_action(){
        extract_action = !extract_action;
    }
    
    public void set_bury_action(){
        bury_action = !bury_action;
    }
    
    public Boolean get_consume(){
        return consume_action;
    }
    
    public Boolean get_impreg(){
        return impreg_action;
    }
    
    public Boolean get_extract(){
        return extract_action;
    }
    
    public Boolean get_bury(){
        return bury_action;
    }
    
    public void set_delayed_trigger(){
        delayed_trigger = !delayed_trigger;
    }
    
    public void set_attack_order(int i){
        if(i>=0) attack_order = i;
    }
    
    public int get_attack_order(){
        return attack_order;
    }
    
    public void set_talk_flag(){
        talk_flag = !talk_flag;
    }
    
    public void set_trade_flag(){
        trade_flag = !trade_flag;
    }
    
    public void set_dismantle_flag(){
        dismantle_flag = !dismantle_flag;
    }
    
    public void set_trade_item(Item i){
        trader_item = i;
    }
    public void set_rest_flag(){
        rest_flag = !rest_flag;
    }
    
    public Boolean get_rest_flag(){
        return rest_flag;
    }
    public Boolean get_trade_flag(){
        return trade_flag;
    }
    
    public Boolean get_dismantle_flag(){
        return dismantle_flag;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void set_originator(DynamicObject d){
        originator = d;
    }
    
    public void set_id(int i){
        charID = i;
    }
    
    public void set_alchemy_flag(){
        alchemy_flag = !alchemy_flag;
    }
    
    public void set_enchant_flag(){
        enchant_flag = !enchant_flag;
    }
    
    public void set_sewing_flag(){
        sewing_flag = !sewing_flag;
    }
    
    public void set_craft_flag(){
        craft_flag = !craft_flag;
    }

    public void addChallenge(Challenge chal){addChallenge(chal, null);}
    public void addChallenge(Challenge chal, Consequence con){
        if(con == null) con = new Consequence();
        challenges.add(chal);
        consequences.add(con);
    }
    public void set_dialogue(String s){
        set_dialogue(s,-1);
    }
    public void set_dialogue(String s,int auto_trigger_chal_id){
        //default -1
        dialogue = s;
        auto_trigger_id = auto_trigger_chal_id;
    }
    public void set_status_change(String s){
        status_change = s;
    }
    
    public void set_attack_description(String s){
        attack_desc = s;
    }
    public String get_attack_description(Character c){
        String ret = "";
        if(attack_flag >= 0){
            ret += getName() + "\n";
            
            int i = 0;
            if(requirement.get(0) != null){
                for(i=0;i<requirement.size();i++){
                    if(requirement_amount.get(i) > 0 && requirement_remove.get(i)){
                        ret += "Requires " + requirement_amount.get(i) + " " + FPalaceHelper.get_stat_name_by_id(requirement.get(i)) + "\n";
                    }
                }
            }
            
            ArrayList<Integer> damage_types = new ArrayList<>();
            for(i=0;i<consequences.size();i++){
                if(consequences.get(i).damage_type_id > -1){
                    Boolean already_exists = false;
                    int count2 = 0;
                    for(count2=0;count2<damage_types.size();count2++){
                        if(damage_types.get(count2) == consequences.get(i).damage_type_id){
                            already_exists = true;
                            break;
                        }
                    }
                    if(!already_exists)damage_types.add(consequences.get(i).damage_type_id);//damage_types[damage_types.length] = consequences.get(i).damage_type_id
                }
            }
        
            Boolean showing = false;
            if(damage_types.size() > 0){
                for(i=0;i<damage_types.size();i++){
                    if(!showing){
                        showing = true;
                        ret += "Does damage of type: ";
                    }
                    ret += FPalaceHelper.get_type_name_by_id(damage_types.get(i)) + " ";				
                }
            }
            
            if(showing)ret+="\n";
            
            if(!attack_desc.equals("")){
                ret += attack_desc;
            }else{
                for(i=0;i<challenges.size();i++){
                    Challenge chall = challenges.get(i);
                    if(!(chall.static_attack && chall.static_defense)){
                        if(!chall.stats_or_skills){
                            if(!chall.static_attack){
                                ret += FPalaceHelper.get_stat_name_by_id(chall.attack_stat);
                            }else{
                                ret += chall.attack_stat;
                            }
                            ret += " vs ";
                            if(!chall.static_defense){
                                 ret += FPalaceHelper.get_stat_name_by_id(chall.defense_stat) + "\n";
                            }else{
                                ret += chall.defense_stat + "\n";
                            }
                        }else{
                            if(!chall.static_attack){
                                ret += FPalace_skills.get_skill_name(chall.attack_stat);
                            }else{
                                ret += chall.attack_stat;
                            }
                            ret += " vs ";
                            if(!chall.static_defense){
                                 ret += FPalace_skills.get_skill_name(chall.defense_stat) + "\n";
                            }else{
                                ret += chall.defense_stat + "\n";
                            }
                        }
                    }
                    break;//TODO this only runs ONCE?!
                }
            }
        }
        return ret;			
    }
    
    public String trigger(Character triggeringChar){
        return trigger(triggeringChar,0,null);
    }
    public String trigger(Character triggeringChar,int force_tags){
        return trigger(triggeringChar,force_tags,null);
    }
    public String trigger(Character triggeringChar,int force_tags,Character sanitize_for){//def 0,null
        String ret = dialogue;

        triggeringChar.setBusy();
        if(status_change != "")triggeringChar.status = status_change;
        
        Character temp_char = (Character)originator;
        
        if(sanitize_for != null){
            ret = temp_char.sanitize(triggeringChar.sanitize(ret,sanitize_for),sanitize_for);
        }
        
        if (ret == "null"){
            if(temp_char != null)temp_char.setBusy();
            if(alchemy_flag){
                ret = "<a href=\"event:alchemy\">Begin Alchemy</a>";
                if(temp_char != null && temp_char.previous_action_output == "" && temp_char != triggeringChar){
                    temp_char.previous_action_output = triggeringChar.getName() + " is looking to use your <a href=\"event:alchemy\">alchemy</a> skills.";
                }
            }else if(enchant_flag){
                ret = "<a href=\"event:enchant\">Begin Enchanting</a>";					
            }else if(sewing_flag){
                ret = "<a href=\"event:sew\">Begin Sewing</a>";					
            }else if(craft_flag){
                ret = "<a href=\"event:craft\">Begin Crafting</a>";
            }else if(trade_flag){
                ret = "<a href=\"event:buy,"+ triggeringChar.location.get_content_id(temp_char) +"\">Buy</a>\t<a href=\"event:sell,"+ triggeringChar.location.get_content_id(temp_char) +"\">Sell</a>";
                ret += "\n\n<font color='#0000FF'><a href=\"event:look," + triggeringChar.location.get_content_id(temp_char) +"\">Back</a></font>";
            }else if(dismantle_flag){
                ret = "<a href=\"event:dismantle\">Begin Dismantling</a>";					
            }else if(talk_flag){
                ret = temp_char.sanitize(triggeringChar.sanitize(temp_char.talk(triggeringChar),triggeringChar),triggeringChar);
                if(temp_char.previous_action_output == ""){
                    
                    temp_char.previous_action_output = triggeringChar.sanitize(temp_char.sanitize("</n2> walks up and interrupts what you were doing.\n\n"+triggeringChar.talk(temp_char),temp_char),temp_char);
                    
                    if(status_change != "")temp_char.status = status_change;
                }
            }else{
                //show combat options
                if(temp_char.get_combat_status()){
                    if(triggeringChar.location.cm == null) triggeringChar.location.cm = new Combat_manager();
                    triggeringChar.location.cm.add_participant(triggeringChar);
                    triggeringChar.location.cm.add_participant(temp_char);
                    
                    //One of these characters (c) does not like the other...
                    if(triggeringChar.personality.relationship_exists(temp_char)){
                        if(triggeringChar.personality.check_relationship(temp_char,triggeringChar) >= 0)triggeringChar.personality.make_aggressive(temp_char);
                    }else{
                        triggeringChar.personality.new_relationship(temp_char,triggeringChar, Relationship.aggressive_change);
                        triggeringChar.personality.make_aggressive(temp_char);
                        //temp_char.personality.new_relationship(c,temp_char, Relationship.aggressive_change);
                        //temp_char.personality.make_aggressive(c);
                    }
                    triggeringChar.setBusy();
                    temp_char.setBusy();
                                            
                    ret = "<a href=\"event:combat,"+triggeringChar.location.get_content_id(triggeringChar)+",-1,-1\">BEGIN COMBAT</a>";
                }else{
                    ret = temp_char.sanitize(temp_char.get_combat_failures(),triggeringChar) + "\n\n";
                    //should give the option to start combat anyway...
                    ret += "<a href=\"event:combat,"+triggeringChar.location.get_content_id(triggeringChar)+",-1,"+triggeringChar.location.get_content_id(temp_char)+"\">BEGIN COMBAT</a>";
                }
            }
        }else{
            //here we weave the challenges in replacing their tags (</c1></c2>...</cn>) in the dialogue
            if(force_tags == 0){
                int i = 0;
                for(i=0;i<challenges.size();i++){
                    int cont_id = triggeringChar.location.get_content_id(temp_char);
                    if(temp_char == null) cont_id = -1;
                    Challenge temp = challenges.get(i);
                    while(ret.indexOf("</c"+ Integer.toString(i) +">") > -1)ret = ret.replace("</c"+ Integer.toString(i) +">", "<a href=\"event:challenge,"+ cont_id +","+ Integer.toString(charID) +"," + Integer.toString(i) +"," + triggeringChar.location.get_content_id(triggeringChar) + "\"><i>" + temp.getText() + "</i></a>");
                }
            }
        }
        

        if(auto_trigger_id > -1){
            ret += challenge(auto_trigger_id,triggeringChar, temp_char, force_tags,null,false,sanitize_for);
        }
        
        if(rest_flag){
            rest_action(triggeringChar);
        }
        

        //here we weave the challenges in, replacing their tags (</c1></c2>...</cn>) in the dialogue
        /*
        for(Challenge c : challenges){
            ret = ret.replaceAll("</c" + challenges.indexOf(c) + ">", "<a href=\"event:challenge,"+ contID +","+ charID +"," + challenges.indexOf(c) +"," + triggeringChar.location.getContentID(triggeringChar) + "\"><i>" + c.getText() + "</i></a>");
        }
        */

        return ret;
    }



    public static void rest_action(Character c){
        if(c.party != null){
            int i = 0;
            for(i=0;i<c.party.members.size();i++){
                Character temp_char = c.party.members.get(i);
                temp_char.reset_stats(-1, (int)c.get_stat(FPalaceHelper.con_id).doubleValue()/10);
                temp_char.apply_affect_by_id(FPalaceHelper.curr_hp_id, temp_char.get_stat(FPalaceHelper.max_hp_id),0, null, Body.change_stats_total);
                temp_char.apply_affect_by_id(FPalaceHelper.curr_mp_id, temp_char.get_stat(FPalaceHelper.max_mp_id),0, null, Body.change_stats_total);
                temp_char.apply_affect_by_id(FPalaceHelper.curr_fatigue_id, temp_char.get_stat(FPalaceHelper.max_fatigue_id),0, null, Body.change_stats_total);
                temp_char.setBusy(FPGameGithub.T1_HOUR*8);
                temp_char.waitTime = -FPGameGithub.T1_HOUR*8;
            }
        }else{
            c.reset_stats(-1, (int)c.get_stat(FPalaceHelper.con_id).doubleValue()/10);
            c.apply_affect_by_id(FPalaceHelper.curr_hp_id, c.get_stat(FPalaceHelper.max_hp_id),0, null, Body.change_stats_total);
            c.apply_affect_by_id(FPalaceHelper.curr_mp_id, c.get_stat(FPalaceHelper.max_mp_id),0, null, Body.change_stats_total);
            c.apply_affect_by_id(FPalaceHelper.curr_fatigue_id, c.get_stat(FPalaceHelper.max_fatigue_id),0, null, Body.change_stats_total);
            c.setBusy(FPGameGithub.T1_HOUR*8);
            c.waitTime = -FPGameGithub.T1_HOUR*8;
        }
    }
    public void set_requirement(int stat_id,int req){
        set_requirement(stat_id, req, true);
    }
    public void set_requirement(int stat_id,int req,Boolean req_rmv){//default true
        //requirement[requirement.length] = stat_id
        requirement.add(stat_id);
        //requirement_amount[requirement_amount.length] = req
        requirement_amount.add(req);
        //requirement_remove[requirement_remove.length] = req_rmv
        requirement_remove.add(req_rmv);
    }//TODO verify
    
    public void set_blowback(int stat_id,int req){
        blowback = stat_id;
        blowback_amount = req;
    }
    
    public void set_item_requirement(Item i){
        item_req = i;
    }
    
    public void set_force_failure(){
        force_failure = !force_failure;
    }
    public void set_attack_flag(){
        set_attack_flag(attack_type_single_target, "");
    }
    public void set_attack_flag(int i){
        set_attack_flag(i, "");
    }
    public void set_attack_flag(int i, String at){
        //def i attack_type_single_target, at ""
        attack_flag = i;
        attack_type = at;
    }
    
    
    public void set_fire_weapon_challenge(){
        fire_weapon_challenge = !fire_weapon_challenge;
    }
    /*
    public String triggerConsequence(Character attacker, Character defender, int roll, int challengeID){
        String ret = "";
        Consequence tempConseq = consequences.get(challengeID);
        ret += tempConseq.trigger(roll, attacker, defender);

        return ret;
    }
    */
    public String triggerConsequence(Character c1,Character origin,Character c2,int roll,int consequence_id){
        Boolean cont = false;
        Consequence con = consequences.get(consequence_id);
        String s = "";
        if (item_req != null){
            int j = 0;
            for (j=0;j<c1.possessions.size();j++){
                if (c1.possessions.get(j).name == item_req.name){
                    cont = true;
                    break;
                }
            }
        }else{
            cont = true;
        }
        
        int temp_blowback = 0;
        
        if (cont || (force_failure && consequence_id > 0)){
            if(blowback > -1 && con.amt_by_roll){
                if(roll > c1.get_stat(blowback).intValue() && c1.get_stat(blowback).intValue() > 0) temp_blowback = c1.get_stat(blowback).intValue();
            }
            s += con.trigger(roll, c1,c2);
        }else{
            if(force_failure){
                s+= con.trigger(-100,c1,c2);
            }else{
                s += origin.getName() + " doesn't seem to have the right item to do that.";
            }
        }
        
        if(roll >= 0 && blowback > -1){
            String blowback_text = "";
            if(blowback_amount > 0) temp_blowback = blowback_amount;
            if (con.amt_by_roll){
                blowback_text += origin.apply_affect_by_id(blowback,  Math.min(roll,temp_blowback));
            }else{
                blowback_text += origin.apply_affect_by_id(blowback, temp_blowback);
            }
            blowback_text = Consequence.name_swap(blowback_text);
            s += blowback_text;
        }
        return s;
    }

    public int rollChallenge(int challengeID, Character attacker){return rollChallenge(challengeID, attacker, null);}
    public int rollChallenge(int challengeID, Character attacker, Character defender){
        int ret = 0;
        if(defender == null){
            defender = attacker;
        }
        Challenge tempChall = challenges.get(challengeID);
        if(tempChall != null){
            ret = tempChall.roll(attacker, defender);
        }

        return ret;
    }
    /* temp testing methods
    public String challenge(int challengeID, Character triggeringCharacter){//TODO actually write this method
        return challenge(challengeID,triggeringCharacter,null/*,0,null,false,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter,Character reactiveCharacter
    /*, force_tags:int = 0, dynamic_choice:Array = null, no_requirement:Boolean = false, sanitize_for:Character = null){
        //def triggering =null,null,0,null,false,null, rest of params dummied for now
        String ret = "";

        int roll = rollChallenge(challengeID, triggeringCharacter);
        ret += triggerConsequence(triggeringCharacter, triggeringCharacter, roll, challengeID);

        return ret;
    }
    */
    public String challenge(int challengeID){
        return challenge(challengeID, null, null, 0, null, false,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter){
        return challenge(challengeID, triggeringCharacter, null, 0, null, false,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter,Character reactiveCharacter){
        return challenge(challengeID, triggeringCharacter, reactiveCharacter, 0, null, false,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter,Character reactiveCharacter,
    int force_tags){
        return challenge(challengeID, triggeringCharacter, reactiveCharacter, force_tags, null, false,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter,Character reactiveCharacter,
    int force_tags,ArrayList<Integer> dynamic_choice){
        return challenge(challengeID, triggeringCharacter, reactiveCharacter, force_tags, dynamic_choice, false,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter,Character reactiveCharacter,
    int force_tags,ArrayList<Integer> dynamic_choice,Boolean no_requirement){
        return challenge(challengeID, triggeringCharacter, reactiveCharacter, force_tags, dynamic_choice, no_requirement,null);
    }
    public String challenge(int challengeID, Character triggeringCharacter,Character reactiveCharacter,
    int force_tags,ArrayList<Integer> dynamic_choice,Boolean no_requirement,Character sanitize_for){
        //def triggering =null,null,0,null,false,null
        //I'm pretty sure c1 is always the instigator (aka player) here
        //what a terrible assumption
        String ret = "";

        if (challengeID < 0 || challengeID >= challenges.size()){
            LOGGER.info("(Action.challenge)Got a bad challenge id");
            return "";
        }
        
        Character origin = (Character)originator;			
        
        if(origin == null && reactiveCharacter != null){
            origin = reactiveCharacter;
        }else if(origin == null && triggeringCharacter != null){
            origin = triggeringCharacter;
        }
        
        if(reactiveCharacter == null || reactiveCharacter == triggeringCharacter){
            if(challenges.get(challengeID).room_challenge == Challenge.GETNONPARTYTARGET){
                reactiveCharacter = triggeringCharacter;
                triggeringCharacter = triggeringCharacter.location.get_random_character(triggeringCharacter);
                origin = reactiveCharacter;
            }
        }
        //in the case of a normal attack, we need to check if we should be firing off a weapon challenge instead
        Boolean found = false;
        if(fire_weapon_challenge){
            int k = 0;
            int hand_hold = 0;
            Character temp_c;
            Weapon weapon = null;
            
            if(attack_flag >= 0){
                temp_c = origin;
            }else{
                temp_c = triggeringCharacter;
            }
            
            for(k=0;k<temp_c.body.parts.size();k++){
                if(temp_c.body.parts.get(k).hold != null){
                    weapon = temp_c.body.parts.get(k).hold;
                    if(weapon.attack_action != null){
                        if(weapon.attack_action.challenges.get(0) != null){
                            if(hand_hold == 0){
                                hand_hold = weapon.get_num_hold();
                            }
                            //only fire off the action once per weapon
                            if(hand_hold == 1){
                                //always fire off the weapons first challenge
                                found = true;
                                ret += weapon.attack_action.challenge(0, triggeringCharacter, reactiveCharacter,force_tags,dynamic_choice,no_requirement,sanitize_for);
                            }
                            hand_hold--;
                        }
                    }
                }
            }
        }
        
        if(found) return ret;
        int next_challenge = -1;
        int dynamic_challenge = 0;
        //Challenge consequences
        if (consequences.get(challengeID) != null){
            Consequence con = consequences.get(challengeID);
            int roll = 0;
            if(dynamic_choice == null || dynamic_choice.get(0) == null || !(con instanceof DynamicConsequence)){
                Boolean pass_requirements = false;
                if(requirement.get(0) != null && !no_requirement){
                    int req_count = 0;
                    for(req_count=0;req_count<requirement.size();req_count++){
                        if(origin.get_stat(requirement.get(req_count)).intValue() >= requirement_amount.get(req_count)){
                            if(req_count > 0 && !pass_requirements){
                                
                            }else{
                                pass_requirements = true;
                            }
                        }else{
                            pass_requirements = false;
                        }
                    }
                }else{
                    pass_requirements = true;
                }
                
                if (pass_requirements){						
                    //int roll = 0;moved above
                    if (attack_flag >= 0){
                        ArrayList<Character> target_list = new ArrayList<>();							
                        if(attack_flag == attack_type_all_enemy_target_single_conseq){
                            if(origin.location == null){
                                LOGGER.info("(Action.challenge)A character without a location is trying to attack....");
                                return "";
                            }
                            if(origin.location.cm == null){
                                LOGGER.info("(Action.challenge)A character without a combat manager is trying to attack....");
                                return "";
                            }
                            target_list = new ArrayList<>(origin.location.cm.get_enemies(origin));
                            //trace roll against all of the targets
                            int count = 0;
                            for(count=0;count<target_list.size();count++){
                                int temp_roll = rollChallenge(challengeID, origin, target_list.get(count));
                                if(temp_roll < roll)roll = temp_roll;
                            }
                            if(sanitize_for != null){
                                ret += reactiveCharacter.sanitize(triggeringCharacter.sanitize(triggerConsequence(triggeringCharacter, origin, reactiveCharacter, roll, challengeID),sanitize_for),sanitize_for);
                            }else{
                                ret += triggerConsequence(triggeringCharacter, origin, reactiveCharacter, roll, challengeID);									
                            }
                        }else if(attack_flag == attack_type_party_target_party_conseq){
                            if(reactiveCharacter.party == null){
                                //target_list[target_list.length] = reactiveCharacter;
                                target_list.add(reactiveCharacter);
                            }else{
                                target_list = reactiveCharacter.party.get_members();
                            }
                            int count = 0;
                            for(count=0;count<target_list.size();count++){
                                roll = rollChallenge(challengeID, origin, target_list.get(count));
                                if(sanitize_for != null){
                                    ret += reactiveCharacter.sanitize(target_list.get(count).sanitize(triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n",sanitize_for),sanitize_for);
                                }else{
                                    ret += triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n";
                                }
                            }								
                        }else if(attack_flag == attack_type_all_enemy_target_all_enemy_conseq){
                            if(origin.location == null){
                                LOGGER.info("(Action.challenge)A character without a location is trying to attack....");
                                return "";
                            }
                            target_list = origin.location.cm.get_enemies(origin);
                            int count = 0;
                            for(count=0;count<target_list.size();count++){
                                roll = rollChallenge(challengeID, origin, target_list.get(count));
                                if(sanitize_for != null){
                                    ret += reactiveCharacter.sanitize(target_list.get(count).sanitize(triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n",sanitize_for),sanitize_for);
                                }else{
                                    ret += triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n";
                                }
                            }								
                        }else if(attack_flag == attack_type_all_target_all_conseq){
                            if(origin.location == null){
                                LOGGER.info("(Action.challenge)A character without a location is trying to attack....");
                                return "";
                            }
                            target_list = origin.location.cm.participants;
                            int count = 0;
                            for(count=0 ;count<target_list.size();count++){
                                roll = rollChallenge(challengeID, origin, target_list.get(count));
                                if(sanitize_for != null){
                                    ret += reactiveCharacter.sanitize(target_list.get(count).sanitize(triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n",sanitize_for),sanitize_for);
                                }else{
                                    ret += triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n";
                                }
                            }								
                        }else if(attack_flag == attack_type_all_target_no_user_conseq){
                            if(origin.location == null){
                                LOGGER.info("(Action.challenge)A character without a location is trying to attack....");
                                return "";
                            }
                            target_list = origin.location.cm.participants;
                            int count = 0;
                            for(count=0;count<target_list.size();count++){
                                if(target_list.get(count) != origin){
                                    roll = rollChallenge(challengeID, origin, target_list.get(count));
                                    if(sanitize_for != null){
                                        ret += reactiveCharacter.sanitize(target_list.get(count).sanitize(triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n",sanitize_for),sanitize_for);
                                    }else{
                                        ret += triggerConsequence(target_list.get(count), origin, reactiveCharacter, roll, challengeID) + "\n";
                                    }
                                }
                            }								
                        }else if(attack_flag == attack_type_self_target){
                            roll = rollChallenge(challengeID, origin, origin);
                            if(sanitize_for != null){
                                ret += origin.sanitize(triggeringCharacter.sanitize(triggerConsequence(triggeringCharacter, origin, origin, roll, challengeID),sanitize_for),sanitize_for);
                            }else{
                                ret += triggerConsequence(triggeringCharacter, origin, origin, roll, challengeID);
                            }
                        }else{
                            roll = rollChallenge(challengeID, origin, triggeringCharacter);
                            if(sanitize_for != null){
                                ret += origin.sanitize(triggeringCharacter.sanitize(triggerConsequence(triggeringCharacter, origin, origin, roll, challengeID),sanitize_for),sanitize_for);
                            }else{
                                ret += triggerConsequence(triggeringCharacter, origin, reactiveCharacter, roll, challengeID);
                            }
                        }
                    }else{
                        if(triggeringCharacter == origin && reactiveCharacter != null)origin = reactiveCharacter;
                        roll = rollChallenge(challengeID, triggeringCharacter, origin);
                        if(sanitize_for != null){
                            ret += reactiveCharacter.sanitize(triggeringCharacter.sanitize(triggerConsequence(triggeringCharacter, origin, reactiveCharacter, roll, challengeID),sanitize_for),sanitize_for);
                        }else{
                            ret += triggerConsequence(triggeringCharacter, origin, reactiveCharacter, roll, challengeID);
                        }
                    }						
                }else{
                    if(sanitize_for != null){
                        ret += reactiveCharacter.sanitize(triggeringCharacter.sanitize("</n2> tried to " + name + " but couldn't! ",sanitize_for),sanitize_for);
                    }else{
                        ret += "</n2> tried to " + name + " but couldn't! ";
                    }
                }				
            }else if(dynamic_choice.get(0) != null){
                DynamicConsequence dynamic_con = (DynamicConsequence)con;
                if(dynamic_con.consequence_list_type == DynamicConsequence.list_nolist){
                    if (attack_flag >= 0){
                        roll = rollChallenge(challengeID, origin, triggeringCharacter);							
                    }else{
                        roll = rollChallenge(challengeID, triggeringCharacter, origin);							
                    }
                    if(dynamic_con.consequence_list_action != DynamicConsequence.list_target_part)ret += triggerConsequence(triggeringCharacter, origin, reactiveCharacter, roll, challengeID);
                }
                if(sanitize_for != null){
                    ret += reactiveCharacter.sanitize(triggeringCharacter.sanitize(dynamic_con.trigger_dynamic(dynamic_choice,roll,triggeringCharacter, reactiveCharacter),sanitize_for),sanitize_for);
                }else{
                    ret += dynamic_con.trigger_dynamic(dynamic_choice,roll,triggeringCharacter, reactiveCharacter);
                }
            }
            
            if (roll >= 0 && requirement.get(0) != null && !no_requirement){
                //need to meet the item requirement
                //s += origin.apply_affect_by_id(requirement, -requirement_amount);
                //don't know if we should print this
                int req_count = 0;
                for(req_count=0;req_count < requirement.size(); req_count++){
                    if( requirement_remove.get(req_count) && requirement_amount.get(req_count) > 0 && origin.get_stat(requirement.get(req_count)).intValue() >= requirement_amount.get(req_count)){
                        origin.apply_affect_by_id(requirement.get(req_count), -requirement_amount.get(req_count),0,null,Body.change_stats_total);
                    }
                }
            }
            
            //int next_challenge = -1; moved outside
            int j = 0;
            for(j=0;j<challenges.size();j++){
                Challenge temp = challenges.get(j);
                if(force_tags == 0){
                    while(ret.indexOf("</c"+ Integer.toString(j) +">") > -1){
                        if (originator == null){
                            ret = ret.replace("</c"+ Integer.toString(j) +">", "<a href=\"event:challenge,-1,"+ Integer.toString(charID) +"," + Integer.toString(j) +"\"><i>" + temp.getText() + "</i></a>");
                        }
                        if (temp != null && origin != null && triggeringCharacter.location != null){
                            ret = ret.replace("</c"+ Integer.toString(j) +">", "<a href=\"event:challenge,"+ triggeringCharacter.location.get_content_id(origin) +","+ Integer.toString(charID) +"," + Integer.toString(j) +"," + triggeringCharacter.location.get_content_id(triggeringCharacter) + "\"><i>" + temp.getText() + "</i></a>");
                        }
                    }
                }
                if(ret.replace("</trigger"+j+">","") != ret){
                       ret = ret.replace("</trigger"+j+">","");
                       next_challenge = j;
                }
            }
            
            //int dynamic_challenge = 0;moved outside
            if(force_tags == 0){
                while(ret.indexOf("</dc") > -1){
                    while(ret.indexOf("</dc" + dynamic_challenge + ">") > -1){
                        if(attack_flag >= 0){
                            ret = ret.replace("<dc" + dynamic_challenge + ">", "<a href=\"event:combat,"+ triggeringCharacter.location.get_content_id(reactiveCharacter) +"," + Integer.toString(charID) +","  + triggeringCharacter.location.get_content_id(triggeringCharacter) +","+ ((next_challenge>-1)?Integer.toString(next_challenge):Integer.toString(challengeID)) +((dynamic_choice!=null&&dynamic_choice.get(0)!=null)?","+ dynamic_choice:"") +"," +Integer.toString(dynamic_challenge) + "\">");
                            ret = ret.replace("</dc" + dynamic_challenge + ">", "</a>");
                        }else if (originator == null){
                            ret = ret.replace("<dc" + dynamic_challenge + ">", "<a href=\"event:challenge,-1,"+ Integer.toString(charID) + "," + ((next_challenge>-1)?Integer.toString(next_challenge):Integer.toString(challengeID)) + ((dynamic_choice!=null&&dynamic_choice.get(0)!=null)?","+ dynamic_choice:"") +"," +Integer.toString(dynamic_challenge) +"\">");//this probably isn't right...
                            ret = ret.replace("</dc" + dynamic_challenge + ">", "</a>");
                        }else if (origin != null && triggeringCharacter.location != null){
                            ret = ret.replace("<dc" + dynamic_challenge + ">", "<a href=\"event:challenge,"+ triggeringCharacter.location.get_content_id(origin) +","+ Integer.toString(charID) +"," + ((next_challenge>-1)?Integer.toString(next_challenge):Integer.toString(challengeID)) +"," + triggeringCharacter.location.get_content_id(triggeringCharacter) +((dynamic_choice!=null&&dynamic_choice.get(0)!=null)?","+ dynamic_choice:"") +"," +Integer.toString(dynamic_challenge) + "\">");//this probably isn't right...
                            ret = ret.replace("</dc" + dynamic_challenge + ">", "</a>");
                        }
                    }
                    dynamic_challenge++;
                }
            }
        }
        
        if(next_challenge > -1 && dynamic_challenge <= 0){
            //disable the requirement for the following challenges
            if(!delayed_trigger){
                
                if(consequences.get(next_challenge) instanceof RoomConsequence && consequences.get(challengeID) instanceof RoomConsequence
                && ((RoomConsequence)consequences.get(next_challenge)).join_room == null && ((RoomConsequence)consequences.get(next_challenge)).move_area == -1
                && ((RoomConsequence)consequences.get(next_challenge)).join_area == -1 && ((RoomConsequence)consequences.get(next_challenge)).actions_to_add.get(0) == null
                && ((RoomConsequence)consequences.get(challengeID)).move_room != null && ((RoomConsequence)consequences.get(challengeID)).join_room == null && ((RoomConsequence)consequences.get(challengeID)).move_area == -1
                && ((RoomConsequence)consequences.get(challengeID)).join_area == -1 && ((RoomConsequence)consequences.get(challengeID)).actions_to_add.get(0) == null){
                    ((RoomConsequence)consequences.get(next_challenge)).add_room_effect(((RoomConsequence)consequences.get(challengeID)).move_room);
                }
                
                ret += challenge(next_challenge,triggeringCharacter, reactiveCharacter,force_tags, dynamic_choice, true,sanitize_for);				
            }else{
                int attack_id = -1;
                int count = 0;
                ArrayList<CharAction> char_attack_array = origin.get_attack_actions();
                for(count=0;count<char_attack_array.size();count++){
                    if(char_attack_array.get(count) == this){
                        attack_id = count;
                        break;
                    }
                }
                if(attack_id != -1 && triggeringCharacter != null && triggeringCharacter.location != null)origin.set_next_attack(triggeringCharacter.location.get_content_id(origin) +","+ Integer.toString(attack_id) +"," + Integer.toString(next_challenge) +"," + triggeringCharacter.location.get_content_id(triggeringCharacter));
            }
        }
        
        /*if(s == ""){
            trace("(Action)Just did a whole challenge without ANY output. Given inputs: " + i + "," + triggeringCharacter + "," + reactiveCharacter + "," + force_tags + "," + dynamic_choice + "," + no_requirement);
            trace("Action name: " + name);
            if(triggeringCharacter != null)trace("Character 1: "+ triggeringCharacter.get_name());
            if(reactiveCharacter != null)trace("Character 2: "+ reactiveCharacter.get_name());
        }*/
        
        return ret;
    }
    public void set_personal(){
        //nothing personal
        personal = !personal;
    }
    public void set_party_use(){
        party_use = !party_use;
    }
    
    public Boolean get_personal(){
        return personal;
    }
    public Boolean get_party_use(){
        return party_use;
    }
    public String get_cclass_origin(){
        return cclass_origin;
    }
    
    public void set_cclass_origin(String s){
        if(cclass_origin.equals("")){
            cclass_origin = s;
        }
    }
    
    public int get_cclass_level(){
        return cclass_level;
    }
    
    public void set_cclass_level(int i){
        if(cclass_level < i){
            cclass_level = i;
        }
    }
    public void copyCharAction(CharAction a){
        name = a.name;
        challenges = new ArrayList<>(a.challenges);//TODO show this is the right way to clone!
        consequences = new ArrayList<>(a.consequences);			
        dialogue = a.dialogue;
        status_change = a.status_change;
        auto_trigger_id = a.auto_trigger_id;
        requirement = a.requirement;
        requirement_amount = a.requirement_amount;
        requirement_remove = a.requirement_remove;
        blowback = a.blowback;
        blowback_amount = a.blowback_amount;
        item_req = a.item_req;
        force_failure = a.force_failure;
        alchemy_flag = a.alchemy_flag;
        enchant_flag = a.enchant_flag;
        trade_flag = a.trade_flag;
        dismantle_flag = a.dismantle_flag;
        talk_flag = a.talk_flag;
        personal = a.personal;
        party_use = a.party_use;
        cclass_origin = a.cclass_origin;
        cclass_level = a.cclass_level;
        trader_item = a.trader_item;
        attack_order = a.attack_order;
        attack_desc = a.attack_desc;
        delayed_trigger = a.delayed_trigger;
        consume_action = a.consume_action;
        impreg_action = a.impreg_action;
        extract_action = a.extract_action;
        bury_action = a.bury_action;
        sewing_flag = a.sewing_flag;
        rest_flag = a.rest_flag;
        attack_flag = a.attack_flag;
        attack_type = a.attack_type;
        fire_weapon_challenge = a.fire_weapon_challenge;
        cclass_origin = a.cclass_origin;
        cclass_level = a.cclass_level;
    }
}
