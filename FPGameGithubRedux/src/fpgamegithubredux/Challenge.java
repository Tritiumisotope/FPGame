package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

public class Challenge {
    public static final int EXITCHECK = 1;
    public static final int CONTENTCOUNT = 2;
    public static final int CONTENTCHECK = 3;
    public static final int NONPARTYCOUNT = 4;
    public static final int GETNONPARTYTARGET = 5;

    private static final Logger LOGGER = Logger.getLogger(Challenge.class.getName());

    protected String tag;
    protected Boolean stats_or_skills;
    protected Boolean hard_stats;
    protected int room_challenge;

    protected int variability;
    protected int ticks_to_pass;
    protected Random r = new Random();

    protected int attack_stat;
    protected int attack_part_process;
    protected Boolean static_attack;
    protected int attack_equip_slot;
    protected Boolean attack_equip_slot_count;
    protected int attack_status_id;
    protected Boolean attack_hold;
    protected Item attack_item;
    protected Quest attack_quest;
    protected int attack_quest_step;
    
    protected int defense_stat;
    protected int defense_part_process;
    protected Boolean static_defense;
    protected int defense_increment;
    protected int defense_equip_slot;
    protected Boolean defense_equip_slot_count;
    protected int defense_status_id;
    protected Boolean defense_hold;
    protected Item defense_item;
    public Challenge(){
        this(false);
    }
    public Challenge(Boolean useSkills){
        tag = "";
        this.variability = 20;
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
        attack_part_process = Body.get_stat_total;
        defense_part_process = Body.get_stat_total;
        stats_or_skills = useSkills;
        hard_stats = false;
        room_challenge = 0;
        ticks_to_pass = 0;
        attack_item = null;
        attack_quest = null;
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
    public void set_attack_quest(Quest q){
        attack_quest = q;
        attack_quest_step = -1;
    }
    public void set_attack_quest(Quest q,int quest_step){//def -1
        attack_quest = q;
        attack_quest_step = quest_step;
    }
    public void set_defense_item(Item i){
        defense_item = i;
    }
    
    public void set_defense_hold_check(){
        defense_hold = !defense_hold;
    }
    
    public void set_room_challenge(int challType){
        room_challenge = challType;
    }
    
    public int get_room_challenge(){
        return room_challenge;
    }
    public void set_attack_stat(int statID){
        set_attack_stat(statID, -1, 0);
    }
    public void set_attack_stat(int statID, int staticAtk){
        set_attack_stat(statID, staticAtk, 0);
    }
    public void set_attack_stat(int statID, int staticAtk, int multiPartProcess){//def atk = -1, multi = 0
        if (statID != -1){
            attack_stat = statID;
            attack_part_process = multiPartProcess;
        }else{
            attack_stat = staticAtk;
            static_attack = true;
        }
    }
    public void set_attack_equip_slot_check(int i){
        set_attack_equip_slot_check(i, false);
    }
    public void set_attack_equip_slot_check(int i,Boolean partCount){//default false
        attack_equip_slot = i;
        attack_equip_slot_count = partCount;
    }
		
    public void set_defense_stat(int statID){
        set_defense_stat(statID,-1,0);
    }
    public void set_defense_stat(Number statID, Number staticAtk){
        set_defense_stat(statID,staticAtk,0);
    }
    public void set_defense_stat(Number statID, Number staticAtk, int multiPartProcess){//default -1,0
        if (statID.intValue() != -1){
            defense_stat = statID.intValue();
            defense_part_process = multiPartProcess;
        }else{
            defense_stat = staticAtk.intValue();
            static_defense = true;
        }
    }
    public void set_defense_equip_slot_check(int i){
        set_defense_equip_slot_check(i, false);
    }
    public void set_defense_equip_slot_check(int i,Boolean partCount){//default false
        defense_equip_slot = i;
        defense_equip_slot_count = partCount;
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
    public int roll(){
        return roll(null,null,null,null);
    }
    public int roll(Character c1){
        return roll(c1,null,null,null);
    }
    public int roll(Character c1,Character c2){
        return roll(c1, c2,null,null);
    }
    public int roll(Character c1,Character c2,Room r1){
        return roll(c1, c2, r1,null);
    }
    public int roll(Character c1,Character c2,Room r1,Room r2){
        //def null,null,null,null
        //need to get the stat in question
        int c1_attack = 0;
        int c2_defense = 0;
        
        if(room_challenge > 0){
            if(r1 == null && r2 == null){
                r1 = c1.location;
                r2 = c2.location;
            }
            if(room_challenge == Challenge.EXITCHECK){
                if(!static_attack){
                    if(r1 != null)c1_attack = r1.get_exit_id(r2);						
                }
                if(!static_defense){
                    if(r2 != null)c2_defense = r2.get_exit_id(r1);
                }
            }else if(room_challenge == Challenge.CONTENTCOUNT){
                if(!static_attack){
                    if(r1 != null){
                        c1_attack = r1.get_character_count();
                    }
                }
                if(!static_defense){
                    if(r2 != null){
                        c2_defense = r2.get_character_count();
                    }
                }
            }else if(room_challenge == Challenge.CONTENTCHECK){
                LOGGER.info("(Challenge.roll)Should be checking content in a room... doing nothing");
            }else if(room_challenge == Challenge.NONPARTYCOUNT){
                if(!static_attack){
                    if(r1 != null){
                        c1_attack = r1.get_character_count(c1);
                    }
                }
                if(!static_defense){
                    if(r2 != null){
                        c2_defense = r2.get_character_count(c2);
                    }
                }
            }else if(room_challenge == Challenge.GETNONPARTYTARGET){
                //dealt with by Action
            }
        }
        int get_temp_stat = 1;
        if(hard_stats)get_temp_stat = 0;
        if( attack_stat != -1){
            if(attack_stat == Character.relations_affect_id){
                if(c1 != c2 && c2 != null){
                    c1_attack = c1.personality.check_relationship(c2,c1);
                }else{
                    c1_attack = 0;
                }
            }else if(attack_stat == Character.attraction_id){
                if(c1 != c2 && c2 != null){
                    c1_attack = c1.personality.determine_attraction_challenge(c2,c1);
                }else{
                    c1_attack = 0;
                }
            }else{
                if (static_attack){
                    c1_attack = attack_stat;
                }else{
                    if(c1 != null){
                        if(!stats_or_skills){
                            c1_attack = c1.get_stat(attack_stat,get_temp_stat,attack_part_process).intValue();
                        }else{
                            c1_attack = c1.get_skill_by_id(attack_stat);
                        }
                    }
                }
            }
        }
        if(defense_stat != -1){
            if(defense_stat == Character.relations_affect_id){
                if(c1 != c2 && c1 != null){
                    c2_defense = c2.personality.check_relationship(c1,c2); 
                }else{
                    c2_defense = 0;
                }
            }else if(defense_stat == Character.attraction_id){
                if(c1 != c2 && c1 != null){
                    c2_defense = c2.personality.determine_attraction_challenge(c1,c2); 
                }else{
                    c2_defense = 0;
                }
            }else{
                if (static_defense){
                    c2_defense = defense_stat;
                    defense_stat += defense_increment;
                }else{
                    if(c2 != null){
                        if(!stats_or_skills){
                            c2_defense = c2.get_stat(defense_stat,get_temp_stat,defense_part_process).intValue();
                        }else{
                            c2_defense = c2.get_skill_by_id(defense_stat);
                        }
                    }
                }
            }
        }
        
        //then we roll
        int attack_roll = (int)Math.round(Math.random()* variability) + c1_attack;
        int defense_roll = (int)Math.round(Math.random()* variability) + c2_defense;
                    
        if(attack_equip_slot > -1){
            if(c1.body.get_part_by_id(attack_equip_slot) != null){
                if(attack_equip_slot_count){
                    attack_roll+=c1.body.part_count_by_id(attack_equip_slot);
                }else if(/*Added the NOT*/!c1.body.get_part_by_id(attack_equip_slot).get(0).get_equip().isEmpty()/*.get(0) != null*/
                 || /*Added the NOT*/!c1.body.get_part_by_id(attack_equip_slot).get(0).covered_by.isEmpty()/*[0] != null*/){
                    //TODO for all members of arraylist from .get_part_by_id()?
                    attack_roll ++;						
                }
            }
        }
        
        if(attack_status_id > -1){
            ArrayList<Integer> temp_array = new ArrayList<>(c1.get_status_effects());
            int count = 0;
            for(count=0;count<temp_array.size();count++){
                if(temp_array.get(count) == attack_status_id) attack_roll++;
            }
        }
        
        if(attack_hold){
            if(c1.body.holding_weapon_or_shield()) attack_roll++;
        }
        
        if(attack_item != null){
            int count = 0;
            for(count=0;count<c1.possessions.size();count++){
                if(c1.possessions.get(count).name.equals(attack_item.name)){
                    attack_roll++;
                }
            }
        }
        
        if(attack_quest != null){
            int count = 0;
            for(count=0;count<c1.personality.objectives.size();count++){
                if(c1.personality.objectives.get(count).name.equals(attack_quest.name)){
                    if(attack_quest_step == -1 || c1.personality.curr_obj_step.get(count).get(c1.personality.curr_obj_step.get(count).size()-1) == attack_quest_step){
                        attack_roll++;
                        break;
                    }
                }
            }
        }			
        
        if(defense_equip_slot > -1){
            if(c2.body.get_part_by_id(defense_equip_slot) != null){
                if(defense_equip_slot_count){
                    defense_roll+=c2.body.part_count_by_id(defense_equip_slot);						 
                }else if(/*Added the NOT*/ !c2.body.get_part_by_id(defense_equip_slot).get(0).get_equip().isEmpty()/*[0] != null*/ ||
                /*Added the NOT*/ !c2.body.get_part_by_id(defense_equip_slot).get(0).covered_by.isEmpty()/*[0] != null*/){
                    //TODO above for all results of .get_part_by_id?
                    defense_roll ++;
                }
            }
        }
        
        if(defense_status_id > -1){
            ArrayList<Integer> temp_array = c2.get_status_effects();
            int count = 0;
            for(count=0;count<temp_array.size();count++){
                if(temp_array.get(count) == defense_status_id) defense_roll++;
            }//TODO contains?
        }
        
        if(defense_hold){
            if(c2.body.holding_weapon_or_shield()) defense_roll++;
        }
        
        if(defense_item != null){
            int count = 0;
            for(count=0;count<c2.possessions.size();count++){
                if(c2.possessions.get(count).name.equals(defense_item.name)){
                    defense_roll++;
                    break;
                }
            }
        }
        
        int success_level = attack_roll - defense_roll;
        
        //determine probability of outcome, and give out xp and (far more rarely) skill/stat points
        double prob_c1 = 0.00;//was number
        double prob_c2 = 0.00;//was number
        if(variability > 0){
            if(c1_attack < c2_defense){
                if(c1_attack + variability >= c2_defense){
                    prob_c1 = (((c1_attack+variability+1-c2_defense)*(c1_attack+variability+2-c2_defense))/2)/((variability+1)*(variability+1));
                    prob_c2 = 1 - prob_c1;
                }else{
                    prob_c2 = 1;
                }
            }else if(c2_defense < c1_attack){
                if(c2_defense + variability > c1_attack){
                    prob_c2 = (((c2_defense+variability+1-c1_attack)*(c2_defense+variability+2-c1_attack))/2)/((variability+1)*(variability+1));
                    prob_c1 = 1 - prob_c2;
                }else{
                    prob_c1 = 1;
                }
            }else{
                prob_c1 = prob_c2 = 0.5;
            }
        }
        
        if(success_level >= 0){
            //c1 wins!
            if(!static_attack && prob_c1 < 1 && prob_c1 > 0 && c1 != null){//NO XP FOR SURE THINGS!
                c1.set_challenge_output(c1.set_xp((int)Math.ceil(1/prob_c1)));
                //chance for skill/stat increase
                if(!stats_or_skills){//stat increase
                    prob_c1 = 1.0/(100 * prob_c1 * 2 * Math.pow(2.0, c1.get_stat(attack_stat,1,attack_part_process).doubleValue()));
                    if(prob_c1 < 1/1000000.0) prob_c1 = 1/1000000.0;
                    if(Math.random() <= prob_c1){
                        c1.set_challenge_output(c1.apply_affect_by_id(attack_stat, 1));
                    }
                }else{//skill increase
                    prob_c1 = 1.0/(prob_c1 * 2 * c1.skills.get_skill_cost(c1,attack_stat,1));//Math.pow(4, c1.get_skill_rank_by_id(attack_stat)))
                    
                    if(prob_c1 < 1/1000000.0) prob_c1 = 1/1000000.0;
                    if(Math.random() <= prob_c1){
                        c1.set_challenge_output(c1.set_skills_by_id(attack_stat, 1));
                    }
                }
                
            }
            if(!static_defense && prob_c2 < 1 && prob_c2 > 0 && c2 != null && c1 != c2){//you failed, but still deserve something
                c2.set_challenge_output(c2.set_xp((int)Math.ceil(1/(10*prob_c2))));
                
                if(!stats_or_skills){//stat increase
                    prob_c2 = 1.0/(100 * prob_c2 * 2 * Math.pow(2.0, c2.get_stat(defense_stat,1,defense_part_process).doubleValue()));
                    if(prob_c2 < 1/1000000.0) prob_c2 = 1/1000000.0;
                    if(Math.random() <= prob_c2){
                        c2.set_challenge_output(c2.apply_affect_by_id(defense_stat, 1));
                    }
                }else{//skill increase
                    prob_c2 = 1.0/(prob_c2 * 2 * c2.skills.get_skill_cost(c2,defense_stat,1));//Math.pow(4, c2.get_skill_rank_by_id(defense_stat)))
                    if(prob_c2 < 1/1000000.0) prob_c2 = 1/1000000.0;
                    if(Math.random() <= prob_c2){
                        c2.set_challenge_output(c2.set_skills_by_id(defense_stat, 1));
                    }
                }
            }
        }else{
            //c2 wins!
            if(!static_defense && prob_c2 < 1 && prob_c2 > 0 && c2 != null){
                c2.set_challenge_output(c2.set_xp((int)Math.ceil(1/prob_c2)));
                //chance for skill/stat increase
                if(!stats_or_skills){//stat increase
                    prob_c2 = 1.0/(100 * prob_c2 * 2 * Math.pow(2.0, c2.get_stat(defense_stat,1,defense_part_process).doubleValue()));
                    if(prob_c2 < 1/1000000.0) prob_c2 = 1/1000000.0;
                    if(Math.random() <= prob_c2){
                        c2.set_challenge_output(c2.apply_affect_by_id(defense_stat, 1));
                    }
                }else{//skill increase
                    prob_c2 = 1.0/(prob_c2 * 2 * c2.skills.get_skill_cost(c2,defense_stat,1));//Math.pow(4, c2.get_skill_rank_by_id(defense_stat)))
                    if(prob_c2 < 1/1000000.0) prob_c2 = 1/1000000.0;
                    if(Math.random() <= prob_c2){
                        c2.set_challenge_output(c2.set_skills_by_id(defense_stat, 1));
                    }
                }
            }
            if(!static_attack && prob_c1 < 1 && prob_c1 > 0 && c1 != null && c1 != c2){
                c1.set_challenge_output(c1.set_xp((int)Math.ceil(1/(10*prob_c1))));
                
                if(!stats_or_skills){//stat increase
                    prob_c1 = 1.0/(100 * prob_c1 * 2 * Math.pow(2.0, c1.get_stat(attack_stat,1,attack_part_process).doubleValue()));
                    if(prob_c1 < 1/1000000.0) prob_c1 = 1/1000000.0;
                    if(Math.random() <= prob_c1){
                        c1.set_challenge_output(c1.apply_affect_by_id(attack_stat, 1));
                    }
                }else{//skill increase
                    prob_c1 = 1.0/(prob_c1 * 2 * c1.skills.get_skill_cost(c1,attack_stat,1));//Math.pow(4, c1.get_skill_rank_by_id(attack_stat)))
                    if(prob_c1 < 1/1000000.0) prob_c1 = 1/1000000.0;
                    if(Math.random() <= prob_c1){
                        c1.set_challenge_output(c1.set_skills_by_id(attack_stat, 1));
                    }
                }
            }
        }
        
        if(ticks_to_pass > 0){
            if(c1 == c2){
                if(c1 != null)c1.setBusy(ticks_to_pass);
            }else{
                if(c1 != null)c1.setBusy(ticks_to_pass);
                if(c2 != null)c2.setBusy(ticks_to_pass);
            }
        }
                    
        return success_level;
        
    }
    /*
    public int roll(Character attacker, Character defender){//TODO real method?
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
    */
    public void copyChall(Challenge c){
        tag = c.tag;
        attack_stat = c.attack_stat;
        attack_part_process = c.attack_part_process;
        defense_stat = c.defense_stat;
        variability = c.variability;
        static_defense = c.static_defense;
        defense_increment = c.defense_increment;
        defense_part_process = c.defense_part_process;
        static_attack = c.static_attack;
        attack_equip_slot = c.attack_equip_slot;
        attack_equip_slot_count = c.attack_equip_slot_count;
        defense_equip_slot = c.defense_equip_slot;
        defense_equip_slot_count = c.defense_equip_slot_count;
        attack_status_id = c.attack_status_id;
        defense_status_id = c.defense_status_id;
        attack_hold = c.attack_hold;
        defense_hold = c.defense_hold;			
        stats_or_skills = c.stats_or_skills;
        room_challenge = c.room_challenge;
        hard_stats = c.hard_stats;
        attack_item = c.attack_item;
        attack_quest = c.attack_quest;
        attack_quest_step = c.attack_quest_step;
        
        defense_item = c.defense_item;
    }
}
