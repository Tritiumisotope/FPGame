package fpgamegithubredux;

import java.util.ArrayList;

public class CharAction {
    public static final int attack_type_single_target = 0;//single target
    public static final int attack_type_all_enemy_target_single_conseq = 1;//all enemies, consequnce is on initiator
    public static final int attack_type_party_target_party_conseq = 2;//party of target, consequence on party of target
    public static final int attack_type_all_enemy_target_all_enemy_conseq = 3;//all enemies, consequence on all enemies
    public static final int attack_type_all_target_all_conseq = 4;//everyone in combat, consequence on everyone in combat
    public static final int attack_type_all_target_no_user_conseq = 5;//everyone in combat, consequence on everyone in combat except the user
    public static final int attack_type_self_target = 6;

    protected String name;
    protected ArrayList<Challenge> challenges;
    protected String dialogue;
    protected String status_change;
    protected int auto_trigger_id;
    public DynamicObject originator;
    protected int charID;
    protected ArrayList<Consequence> consequences;
    public ArrayList<Integer>  requirement;
    public ArrayList<Integer>  requirement_amount;
    public ArrayList<Boolean>  requirement_remove;
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
        dialogue = "";
        challenges = new ArrayList<>();
        consequences = new ArrayList<>();
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
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
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
    public String trigger(Character triggeringChar){
        String ret = dialogue;

        int contID = -1;

        //here we weave the challenges in, replacing their tags (</c1></c2>...</cn>) in the dialogue
        for(Challenge c : challenges){
            ret = ret.replaceAll("</c" + challenges.indexOf(c) + ">", "<a href=\"event:challenge,"+ contID +","+ charID +"," + challenges.indexOf(c) +"," + triggeringChar.location.getContentID(triggeringChar) + "\"><i>" + c.getText() + "</i></a>");
        }

        return ret;
    }

    public String challenge(int challengeID, Character triggeringCharacter){
        String ret = "";

        int roll = rollChallenge(challengeID, triggeringCharacter);
        ret += triggerConsequence(triggeringCharacter, triggeringCharacter, roll, challengeID);

        return ret;
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
    
    public void set_requirement(int stat_id,int req){
        set_requirement(stat_id, req, true);
    }
    public void set_requirement(int stat_id,int req,Boolean req_rmv){//default true
        requirement.set(requirement.size(), stat_id);
        requirement_amount.set(requirement_amount.size(),req);
        requirement_remove.set(requirement_remove.size(),req_rmv);
        //requirement[requirement.length] = stat_id;
        //requirement_amount[requirement_amount.length] = req;
        //requirement_remove[requirement_remove.length] = req_rmv;
    }
    
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
    
    public String triggerConsequence(Character attacker, Character defender, int roll, int challengeID){
        String ret = "";
        Consequence tempConseq = consequences.get(challengeID);
        ret += tempConseq.trigger(roll, attacker, defender);

        return ret;
    }
    public void set_personal(){
        //nothing personal
        personal = !personal;
    }
}
