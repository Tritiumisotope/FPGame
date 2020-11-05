/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Ailer and Tritium
 */
public class Character extends DynamicObject {
    //protected String name
    
    public static int relations_affect_id = -99999;
    public static int gold_id = -99998;
    public static int attraction_id = -99997;
    public static int introduced_id = -99996;
    
    private static final Logger LOGGER = Logger.getLogger(Character.class.getName());
    protected ArrayList<Item> possessions;
    protected Character mother;
    protected Character father;
    
    protected String surname;

    protected Room location;
    protected String status;

    protected ArrayList<CharAction> actions;

    public Body body;
    //protected Sex sex;//public var sex:Sex
    //public ArrayList<Character_class cclass;//public var cclass:Array

    public Skill_set skills;

    public int equip_state = 0;
		
    public Personality personality;
    
    public int ai_move = 0;
    public int busy;
    protected int waitTime;
    //ONLY USED BY AREA
    public Boolean ai_already_moved = false;
    //ONLY USED BY AREA
    public int total_actions_taken;
    public String previous_action_output;
    //to DIE>
    protected String[] sexChoices = {"Male","Female","Futa"};
    protected String sex;
    //to DIE^
    protected int gold;
    public int xp;//:uint
    public int nxt_lvl_xp;//:uint
	public int lvl;//:uint
    public int stat_points;//:uint
    
    public int fitness;//this must die
    public int ageDemo;//this must ide


    
    protected ArrayList<Integer> statID;
    protected ArrayList<Stat> stats;
    protected Party party;

    protected ArrayList<Object> currentTickEffects;

    public String challenge_output;
    public String next_attack;
    
    public int char_sprite_id;
    public int char_34sprite_id;

    
            
    public Character(){
        this("Jeff");
    }
    public Character(String newName){
        setName(newName);
        //setSex(newSex)
        //sex = new Sex()
        possessions = new ArrayList<>();
        statID = new ArrayList<>();
        stats = new ArrayList<>();
        actions = new ArrayList<>();
        currentTickEffects = new ArrayList<>();

        personality = new Personality();
        personality.new_relationship(this, this, Relationship.initial_reaction_change);
        personality.relationships.get(0).set_introduced();
        location = null;//non_standard

        gold = 0;

        busy = 0;
        waitTime = 0;
        
        Stat tempStat = new Stat();
        tempStat.setName("Fitness");
        tempStat.statID = 0;
        tempStat.statValue = 0;
        
        newStat(tempStat.statID, tempStat);
        
        CharAction tempAction = new CharAction();
        tempAction.name = "Talk";
        tempAction.dialogue = "</n> takes a moment to talk to </n2>";
        
        actions.add(tempAction);
    }
    public String set_surname(String s){
        return set_surname(s, false);
    }
    public String set_surname(String s,Boolean full_name){//default false
        String ret = s;
        if(full_name){
            if(s.indexOf(" ") > 0){
                //TODO
                //ret = s.substr(0,s.indexOf(" "));
                //surname = s.substr(s.indexOf(" ")+1,s.length);
            }else{
                surname = "";
            }
        }else{
            surname = s;
        }
        return ret;
    }
    
    public String get_surname(){
        return surname;
    }
    public void setName(String theName){
        name = theName;
    }
    @Override
    public String getName(){
        return name;
    }
    /*
    public String set_sex(Sex s){
        String ret = "";
        if(sex != null && location != null){
            sex.reverse_bonuses(this, true);
            sex = s;
            s.apply_bonuses(this, true);
            //personality.determine_orient(sex);
        }else{
            //if(sex != null)sex.reverse_bonuses(this);
            sex = s;
            //s.apply_bonuses(this);
        }
        //personality.advance_objectives(Quest.sex_action, [s], this);
        return ret;
    }
    */
    //test version
    public void setSex(int theSex){
        sex = sexChoices[theSex];
    }
    
    public void apply_tick_effect(TickEffect tf){
        /*
        if(!get_primary_race().check_immunity(tf.status_id)){
            personality.advance_objectives(Quest.status_add_action, tf, this);
            current_tick_effects[current_tick_effects.length] = tf;
        }
        */
    }
    public void newStat(int newStatID, Stat newStat){newStat(newStatID, newStat, 0.0);}
    public void newStat(int newStatID, Stat newStat, Double statVal){
        if(!statID.contains(newStatID)){
            statID.add(newStatID);
            newStat.setStatValue(statVal);
            stats.add(newStat);
        }
    }

    public double getStat(int statID){
        double ret = -1.0;
        for(Stat tempStat : stats){
            if(tempStat.statID == statID){
                ret = tempStat.statValue.doubleValue();
            }
        }

        return ret;
    }
    public Number get_stat(int i){
        return get_stat(i,1,0,-1,true);
    }
    public Number get_stat(int i,int get_hard_value){
        return get_stat(i,get_hard_value,0,-1,true);
    }
    public Number get_stat(int i,int get_hard_value, int multi_part_process){
        return get_stat(i,get_hard_value,multi_part_process,-1,true);
    }
    public Number get_stat(int i,int get_hard_value, int multi_part_process, int part_id){
        return get_stat(i,get_hard_value,multi_part_process,part_id,true);
    }
    public Number get_stat(int i,int get_hard_value, 
    int multi_part_process/*Body.get_stat_total*/, 
    int part_id/*Body.target_all_parts*/, Boolean add_equip){
        //default get_hard = 1, multi_part =0, part_id = -1, add_eqip = true
        if(i == 0) return 0;
        Number ret = -1;
        
        if(part_id < 0){
            int k = 0;
            for(k=0;k<statID.size();k++){//.length
                if(i == statID.get(k)){//[]
                    //ret += stat[k].get_stat_value(this, get_hard_value,add_equip) + 1;
                }
            }
            /*
            Number body_stat = -1;
            if(body != null){
                body_stat = body.get_stat_by_id(this, i,get_hard_value,multi_part_process,part_id,add_equip);
            }
            */
            /*
            if(body_stat > -1 && ret > -1){
                ret += body_stat; 
            }else if(body_stat > - 1){
                ret += body_stat + 1; 
            }
            */
        }else{
            /*
            Number part_stat =body.get_stat_by_id(this, i, get_hard_value, multi_part_process, part_id,add_equip);
            if(part_stat > - 1){
                ret += part_stat + 1; 
            }
            */
        }
                    
        if(ret.intValue() < 0){
            ret = -1;//stat not found
        }
        /*
        if(i == Character.relations_affect_id){
            //only one thing should ever do this, and it's just to see if the "stat" exists over in Challenge
            return 1;
        }
        
        if(i == Character.gold_id){
            return gold;
        }
        */           
        return ret;
    }
    public String apply_affect_by_id(int i,Number k){
        return apply_affect_by_id(i,k, 0, null, 0, false, -1,-1);
    }
    public String apply_affect_by_id(int i,Number k,int temp, Character c,int body_app_method /*Body.change_stats_individual*/,Boolean char_only,int part_id /*Body.target_all_parts*/,int effect_type){
        //def temp = 0, c = null, body_app_method = 0 /*Body.change_stats_individual*/, char_only = false, part_id:int = -1 /*Body.target_all_parts*/, effect_type:int = -1
        String s = "";
        Boolean found = false;
        int count = 0;
        if (k.intValue() == 0) i = -1;
        if(effect_type > -1){
            //k *= sex.get_damage_mod(effect_type);
            //k = k.doubleValue()* sex.get_damage_mod(effect_type);
            //k *= personality.get_damage_mod(effect_type);
        }
        int j = 0;
        if(part_id == Body.target_all_parts){
            for(j=0;j<statID.size();j++){//.length
                //if(i == stat_id[j]){
                if(i == statID.get(j)){
                    count++;
                    if(stats.get(j).age){
                        //k = Math.ceil(k/get_primary_race().get_aging_mod());
                        //sex.age(this,k);
                        //s += stat[j].get_change_magnitude(k,this,temp);
                    }//TODO so much
                    
                    if(body_app_method == Body.change_stats_individual){
                        //s += stats[j].get_change_magnitude(k,this,temp);				
                    }else if(body_app_method == Body.change_first_stat && !found){
                        //s += stats[j].get_change_magnitude(k,this,temp);
                        found = true;
                    }
                }
            }
            
            /*if(body_app_method == Body.change_stats_total && !char_only && count > 0){
                if(temp == 0){
                    if(k > 0){
                        count += body.part_count_by_stat(this, i, 1);
                    }else{
                        count += body.part_count_by_stat(this, i, 0);
                    }
                }else{
                    count += body.part_count_by_stat(this, i);
                }
                
                var start_amt:Number = get_stat(i,temp);
                var change_by:Number = k/count;
                s += apply_affect_by_id(i,change_by,temp,c,Body.change_stats_individual,true,-1,effect_type);
                var end_amt:Number = get_stat(i,temp);
                change_by = k - (end_amt - start_amt);
                if((change_by >= 0.05 || change_by <= -0.05) && temp == 0 && change_by.toFixed(2) != k.toFixed(2) && change_by.toFixed(2) != (-k).toFixed(2)){
                    //We've run into mins or maxes... need to do... something
                    apply_affect_by_id(i,change_by,temp,c,Body.change_stats_total,false, -1, effect_type);
                }
            }else{		*/			
                //s += body.get_effects(i,k,this, temp,body_app_method,count,Body.target_all_parts,effect_type);
            /*}*/
        }else if(part_id == Body.target_parts_one_by_one){
            //trace("(Character) Should be eroding stat from part by part, instead of all at once.. doing nothing");
            //not sure what to do here yet...
        }else if(part_id >= 0){
            //we have a specific part id to apply this affect to...
            //if(!char_only)s += body.get_effects(i,k,this, temp,body_app_method,0, part_id,effect_type);
        }else{
            //trace("(Character) got passed a part id of "+ part_id + " and I have no idea what to do with it");
        }
        
        //deal with the relationship garbage - this should really happen when an action is attempted, not when it's successful....
        if(c != null){
            //personality.new_relationship(c, this, Relationship.stat_change, character_reaction(c, i, k));
            //c.personality.determine_reaction_to_other(c, this, c, i, k);
            if(location == null){
                 if(c.location != null){
                    //c.location.spread_reaction(this, c, i, k);
                }else{
                    //character died from previous action...
                }
            }else{
                //location.spread_reaction(this, c, i, k);
            }
        }
        
        if(equip_state == 0){
            //get_combat_status();//will remove dead parts, if there are any
            //if(!body.alive(this) && location != null && !char_only)s += die();
            //s += re_equip(equip_state);
            //s += body.check_state(this);
        }
        
        if(!s.equals("") && !char_only){
            //set_challenge_output("<sid"+i+","+k+",0,\""+s+"\">");
            
        }
        
        return s;
    }
    //test version
    public String applyAffectByID(int statIDForChange, Number changeBy){
        String ret = "";
        int index = statID.indexOf(statIDForChange);
        if(index >= 0){
            Stat temp = ((Stat)stats.get(index));
            //temp.statValue += changeBy;
            temp.statValue = temp.statValue.doubleValue()+ changeBy.doubleValue();
        }

        return ret;
    }
    
    public String appearance(int lookID, Character c){
        String ret = "";
        if(c == this || c == null){
            ret = "You are " + name + "<br>";
        }else{
            ret = "This is " + name + "<br>";
        }

        if(lookID !=0){
            //TBD
        }else{
            ArrayList<CharAction> tempList = getAllOverworldActions();
            for(CharAction act : tempList){
                ret += "<a href=\"event:action," + location.getContentID(this) + "," + tempList.indexOf(act) +"\"><font color='#0000FF'>"+act.getName() +"</font></a>    ";
            }
        }
        
        return ret;
    }
    public String newLocation(Room newRoom){
        //dummy
        return "";
    }
    public void drop(int item){
        //dummy
    }
    public String look(){return look(-1, 0);}
    public String look(int contentID){return look(contentID, 0);}
    public String look(int contentID, int lookID){
        String ret = "";

        if(location != null){
            if(contentID >= 0){
                Object tempObject = location.getContent(contentID);
                if(tempObject instanceof Character){
                    ret = ((Character)tempObject).appearance(lookID, this);
                }
            }else{
                ret = location.getRoomDescription(this);
            }
        }

        return ret;
    }
    public int get_skill_by_id(int skill_id){
        return skills.get_skill_value(this, skill_id);
    }
    
    public int get_skill_rank_by_id(int skill_id){
        return skills.get_skill_ranks(skill_id);
    }
    public String fireAction(int contendID, int actionID){
        String ret = "";
        if(location != null){
            CharAction tempAction;
            if(contendID < 0){
                tempAction = location.getAction(actionID);
                ret = sanitize(tempAction.trigger(this));
            }else{
                Character tempChar = (Character)location.getContent(contendID);
                tempAction = tempChar.getAllOverworldActions().get(actionID);
                ret = sanitize(tempAction.trigger(this));
            }
        }

        return ret;
    }

    public String fireChallenge(int contentID, int actionID, int challengeID, int triggeringContentID){
        String ret = "";
            if(contentID<0){
                ret = location.fireChallenge(actionID, challengeID, this);//TODO THIS?!
            }
        return ret;
    }

    public String inventory(){
        String returnString = "";
        if(possessions.isEmpty()){
            returnString = "</n>\'s Inventory contains nothing.";
        }else{
            returnString = "</n>\'s Inventory contains: ";
            for(Item o : possessions){
                returnString += "<a href=\"event:use_item," + possessions.indexOf(o) +"\">" + o.getDroppedDescription()+ "</a>,";
            }
        }

        if(returnString.charAt(returnString.length()-1) == ',')returnString = returnString.substring(0, returnString.length()-1);

        return sanitize(returnString);
    }

    public String pickUp(int contentID){
        String ret = "";
        Item newItem = location.itemLoss(contentID);
        if(newItem != null){
            LOGGER.info("Item picked up is:" + newItem.getDroppedDescription());
            addToPossessions(newItem);
            ret += sanitize("</n> got " + newItem.getDroppedDescription() + ".<br>") + look();
        }

        return ret;
    }

    public String statistics(){
        String ret = "Name: " + name + "<br>";
        for(Stat s:stats){
            ret += s.getName() + ": " + s.statValue + "(" + s.tempStatValue + ")";
        }
        
        return ret;
    }

    public String showAllSkills(){
        return "<table><tr><u><tc>Skill</tc><tc>Ranks</tc><tc>Bonus</tc><tc>Cost</tc><tc>Current XP to spend: <font color='#00FF00'>0</font>/100</tc></u></tr></table>";
    }

    public String sanitize(String stringToSanitize){
        return stringToSanitize.replace("</n>", name);
    }

    public void setBusy(){setBusy(1);}
    public void setBusy(int numTicks){
        busy += numTicks;
        waitTime = 0;
    }
    public Boolean get_move(){
        if (ai_move > 0)return true;
        return false;
    }
    
    public void set_move(int i){//default 1
        ai_move+=i;
    }
    
    public String get_short_description(Character c){
        String ret = "";
        /*TODO determine_sex, get_primary_race
        Sex determined_sex = c.determine_sex(this);
        String temp_string = "";
        if(get_primary_race().get_name() != c.get_primary_race().get_name()){
            if(personality.job == null){
                temp_string = determined_sex.get_age_name(this);
                if(temp_string == ""){
                    temp_string = determined_sex.get_name() + " " + get_primary_race().get_name();
                }else{
                    if(get_primary_race().get_anthro()){
                        temp_string = get_primary_race().get_name() + " " + temp_string;
                    }else{
                        temp_string = get_primary_race().get_name();
                    }
                }
            }else{
                temp_string = get_primary_race().get_name() + " " + personality.job.get_name();
            }
        }else{
            if(personality.job == null){
                temp_string = determined_sex.get_age_name(this);
                if(temp_string == ""){
                    temp_string = determined_sex.get_name() + " " + get_primary_race().get_name();
                }
            }else{
                temp_string = get_primary_race().get_name() + " " + personality.job.get_name();
            }
        }
        
        if(temp_string.charAt(0) == "a" || temp_string.charAt(0) == "e" || temp_string.charAt(0) == "i" || temp_string.charAt(0) == "o" || temp_string.charAt(0) == "u"){
            ret = "an " + temp_string;
        }else if(temp_string != ""){
            ret = "a " + temp_string;
        }
        */  
        return ret;
    }

    public String getPersonalActions(){
        return "";
    }

    public ArrayList<CharAction> getAllOverworldActions(){
        ArrayList<CharAction> ret = new ArrayList<>();
        
        for(CharAction a : actions )ret.add(a);

        return ret;
    }    

    public void addToPossessions(Item newItem){
        if(newItem != null){
            LOGGER.info("valid item passed is:" + newItem.getDroppedDescription());
            if(newItem.getDroppedDescription().equalsIgnoreCase("gold")){
                gold += newItem.value;
                if(gold < 0)gold = 0;
            }else{
                possessions.add(newItem);
            }
        }
        String msg = possessions.get(possessions.size()-1).getDroppedDescription();
        LOGGER.info(msg);
    }

    public String getStatus(){return getStatus(null);}
    public String getStatus(Character lookingCharacter){
        String ret = name;

        return ret;
    }
}
