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
    //protected String name;
    
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
    //public var sex:Sex;
    //public var cclass:Array;

    public Skill_set skills;

    public int equip_state = 0;
		
    //public var personality:Personality;
    
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
    public int xp;//:uint;
    public int nxt_lvl_xp;//:uint;
	public int lvl;//:uint;
	public int stat_points;//:uint;
    public int fitness;//this must die


    
    protected ArrayList<Integer> statID;
    protected ArrayList<Stat> stats;

    
    

    

    protected ArrayList<Object> currentTickEffects;

    
            
    public Character(){
        this("Jeff", 0, 0.0);
    }
    public Character(String newName,int newSex, double newFitness){
        setName(newName);
        setSex(newSex);

        possessions = new ArrayList<>();
        statID = new ArrayList<>();
        stats = new ArrayList<>();
        actions = new ArrayList<>();

        location = null;

        gold = 0;

        busy = 0;
        waitTime = 0;
        
        Stat tempStat = new Stat();
        tempStat.setName("Fitness");
        tempStat.statID = 0;
        tempStat.statValue = newFitness;
        
        newStat(tempStat.statID, tempStat);
        
        CharAction tempAction = new CharAction();
        tempAction.name = "Talk";
        tempAction.dialogue = "</n> takes a moment to talk to </n2>";
        
        actions.add(tempAction);
    }

    public void setName(String theName){
        name = theName;
    }
    @Override
    public String getName(){
        return name;
    }
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

    public String applyAffectByID(int statIDForChange, double changeBy){
        String ret = "";
        int index = statID.indexOf(statIDForChange);
        if(index >= 0){
            Stat temp = ((Stat)stats.get(index));
            //temp.statValue += changeBy;
            temp.statValue = temp.statValue.doubleValue()+ changeBy;
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
            returnString = "</n> Inventory contains nothing.";
        }else{
            returnString = "</n> Inventory contains: ";
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
