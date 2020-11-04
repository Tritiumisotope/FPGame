package fpgamegithubredux;

import java.util.Random;

public class Challenge {
    public static final int EXITCHECK = 1;
    public static final int CONTENTCOUNT = 2;
    public static final int CONTENTCHECK = 3;
    public static final int NONPARTYCOUNT = 4;
    public static final int GETNONPARTYTARGET = 5;

    protected String tag;
    protected Boolean stats_or_skills;
    protected Boolean hard_stats;
    protected int room_challenge;

    protected int variability;
    protected int ticks_to_pass;
    protected Random r = new Random();

    public int attack_stat;
    public int attack_part_process;
    public Boolean static_attack;
    public int attack_equip_slot;
    public Boolean attack_equip_slot_count;
    public int attack_status_id;
    public Boolean attack_hold;
    public Item attack_item;
    //public Quest attack_quest;
    public int attack_quest_step;
    
    public double defense_stat;
    public int defense_part_process;
    public Boolean static_defense;
    public int defense_increment;
    public int defense_equip_slot;
    public Boolean defense_equip_slot_count;
    public int defense_status_id;
    public Boolean defense_hold;
    public Item defense_item;
    public Challenge(){
        new Challenge(false);
    }
    public Challenge(Boolean bool){
        tag = "";
        variability = 20;
        static_defense = false;
        static_attack = false;
        defense_increment = 0;
        attack_equip_slot = -1;
        attack_equip_slot_count = false;
        defense_equip_slot = -1;
        defense_equip_slot_count = false;
        attack_status_id = -1;
        defense_status_id = -1;
        attack_hold = false;
        defense_hold = false;
        attack_stat = -1;
        defense_stat = -1;
        //attack_part_process = Body.get_stat_total;
        //defense_part_process = Body.get_stat_total;
        //stats_or_skills = use_skills;
        hard_stats = false;
        room_challenge = 0;
        ticks_to_pass = 0;
        attack_item = null;
        //attack_quest = null;
        attack_quest_step = -1;
        
        defense_item = null;
    }

    		
    public void set_hard_stat(){
        hard_stats = !hard_stats;
    }
    public void set_defense_status_id(int i){
        defense_status_id = i;
    }

    public void set_attack_status_id(int i){
        attack_status_id = i;
    }
    		
    public void set_tick_cost(int i){
        ticks_to_pass = i;
    }
        
    public void set_attack_hold_check(){
        attack_hold = !attack_hold;
    }
    
    public void set_attack_item(Item i){
        attack_item = i;
    }
    /*
    public function set_attack_quest(q:Quest, quest_step:int = -1):void{
        attack_quest = q;
        attack_quest_step = quest_step;
    }
    */
    public void set_defense_item(Item i){
        defense_item = i;
    }
    
    public void set_defense_hold_check(){
        defense_hold = !defense_hold;
    }
    
    public void set_room_challenge(int chall_type){
        room_challenge = chall_type;
    }
    
    public int get_room_challenge(){
        return room_challenge;
    }
    public void set_attack_stat(int stat_id){
        set_attack_stat(stat_id, -1, 0);
    }
    public void set_attack_stat(int stat_id, int static_atk){
        set_attack_stat(stat_id, static_atk, 0);
    }
    public void set_attack_stat(int stat_id,int static_atk,int multi_part_process){//def atk = -1, multi = 0
        if (stat_id != -1){
            attack_stat = stat_id;
            attack_part_process = multi_part_process;
        }else{
            attack_stat = static_atk;
            static_attack = true;
        }
    }
    public void set_attack_equip_slot_check(int i){
        set_attack_equip_slot_check(i, false);
    }
    public void set_attack_equip_slot_check(int i,Boolean part_count){//default false
        attack_equip_slot = i;
        attack_equip_slot_count = part_count;
    }
		
    public void set_defense_stat(int stat_id){
        set_defense_stat(stat_id,-1,0);
    }
    public void set_defense_stat(Number stat_id, Number static_atk){
        set_defense_stat(stat_id,static_atk,0);
    }
    public void set_defense_stat(Number stat_id, Number static_atk, int multi_part_process){//default -1,0
        if (stat_id.intValue() != -1){
            defense_stat = stat_id.doubleValue();
            defense_part_process = multi_part_process;
        }else{
            defense_stat = static_atk.doubleValue();
            static_defense = true;
        }
    }
    public void set_defense_equip_slot_check(int i){
        set_defense_equip_slot_check(i, false);
    }
    public void set_defense_equip_slot_check(int i,Boolean part_count){//default false
        defense_equip_slot = i;
        defense_equip_slot_count = part_count;
    }
    
    public void static_defense_climb(int i){
        defense_increment = i;
    }
    public void setVariability(int newi){//TODO rename again, damn replace all...
        variability = newi;
    }
    public void setText(String incomingTag){
        tag = incomingTag;
    }
    public String getText(){
        return tag;
    }
    public int roll(Character attacker, Character defender){
        int ret = 0;
        int attackerRoll;
        int defenderRoll;
        if (variability>0){
        attackerRoll = (r.nextInt(variability));
        defenderRoll = (r.nextInt(variability));
        }else{
            attackerRoll = 0;
            defenderRoll = 0;
        }

        ret = attackerRoll - defenderRoll;

        return ret;
    }
    public int roll(Character onlyChar){
        return r.nextInt(variability);
    }
}
