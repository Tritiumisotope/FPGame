/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.util.ArrayList;

/**
 *
 * @author Ailer and Tritium
 */
public class Character {
    protected String name;
    protected Character mother;
    protected Character father;
    protected String[] sexChoices = {"Male","Female","Futa"};
    protected String sex;
    protected int gold;
    protected int busy;
    protected int wait_time;
    //public int fitness;

    protected ArrayList<Item> possessions;
    protected ArrayList<Integer> statID;
    protected ArrayList<Stat> stats;

    protected ArrayList<CharAction> actions;

    protected ArrayList<Object> currentTickEffects;

    protected Room location;
            
    public Character(){
        this("Jeff", 0, 0.0);
    }
    public Character(String newName,int newSex, double newFitness){
        setName(newName);
        setSex(newSex);

        possessions = new ArrayList<Item>();
        statID = new ArrayList<Integer>();
        stats = new ArrayList<Stat>();
        actions = new ArrayList<CharAction>();

        location = null;

        gold = 0;

        busy = 0;
        wait_time = 0;
        
        Stat temp_stat = new Stat();
        temp_stat.set_name("Fitness");
        temp_stat.ID = 0;
        temp_stat.stat_value = newFitness;
        
        newStat(temp_stat.ID, temp_stat);
        
        CharAction tempAction = new CharAction();
        tempAction.name = "Talk";
        tempAction.dialogue = "</n> takes a moment to talk to </n2>";
        
        actions.add(tempAction);
    }

    public void setName(String theName){
        name = theName;
    }

    public void setSex(int theSex){
        sex = sexChoices[theSex];
    }

    public void newStat(int newStatID, Stat newStat){newStat(newStatID, newStat, 0.0);}
    public void newStat(int newStatID, Stat newStat, Double stat_val){
        if(!statID.contains(newStatID)){
            statID.add(newStatID);
            newStat.set_stat_value(stat_val);
            stats.add(newStat);
        }
    }

    public Double get_stat(int statID){
        Double ret = -1.0;
        for(Stat tempStat : stats){
            if(tempStat.ID == statID){
                ret = tempStat.stat_value;
            }
        }

        return ret;
    }

    public String applyAffectByID(int statIDForChange, double changeBy){
        String ret = "";
        int index = statID.indexOf(statIDForChange);
        if(index >= 0){
            Stat temp = ((Stat)stats.get(index));
            temp.stat_value += changeBy;
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

        }else{
            ArrayList<CharAction> tempList = get_all_overworld_actions();
            for(CharAction act : tempList){
                ret += "<a href=\"event:action," + location.get_content_id(this) + "," + tempList.indexOf(act) +"\"><font color='#0000FF'>"+act.get_name() +"</font></a>    ";
            }
        }
        
        return ret;
    }

    public String look(){return look(-1, 0);}
    public String look(int content_id){return look(content_id, 0);}
    public String look(int content_id, int look_id){
        String ret = "";

        if(location != null){
            if(content_id >= 0){
                Object tempObject = location.get_content(content_id);
                if(tempObject instanceof Character){
                    ret = ((Character)tempObject).appearance(look_id, this);
                }
            }else{
                ret = location.getRoomDescription(this);
            }
        }

        return ret;
    }

    public String fire_action(int contendID, int actionID){
        String ret = "";
        if(location != null){
            CharAction tempAction;
            if(contendID < 0){
                tempAction = location.getAction(actionID);
                ret = sanitize(tempAction.trigger(this));
            }else{
                Character tempChar = (Character)location.get_content(contendID);
                tempAction = tempChar.get_all_overworld_actions().get(actionID);
                ret = sanitize(tempAction.trigger(this));
            }
        }

        return ret;
    }

    public String fire_challenge(int content_id, int action_id, int challenge_id, int triggering_content_id){
        String ret = "";
            if(content_id<0){
                ret = location.fire_challenge(action_id, challenge_id, this);
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
                returnString += "<a href=\"event:use_item," + possessions.indexOf(o) +"\">" + o.name + "</a>,";
            }
        }

        if(returnString.charAt(returnString.length()-1) == ',')returnString = returnString.substring(0, returnString.length()-1);

        return sanitize(returnString);
    }

    public String pick_up(int content_id){
        String ret = "";
        Item new_item = location.item_loss(content_id);
        if(new_item != null){
            add_to_possessions(new_item);
            ret += sanitize("</n> got " + new_item.name + ".<br>") + look();
        }

        return ret;
    }

    public String statistics(){
        String ret = "Name: " + name + "<br>";
        for(Stat s:stats){
            ret += s.get_name() + ": " + s.stat_value + "(" + s.temp_stat_value + ")";
        }
        
        return ret;
    }

    public String showAllSkills(){
        return "<table><tr><u><tc>Skill</tc><tc>Ranks</tc><tc>Bonus</tc><tc>Cost</tc><tc>Current XP to spend: <font color='#00FF00'>0</font>/100</tc></u></tr></table>";
    }

    public String sanitize(String string_to_sanitize){
        String return_string = string_to_sanitize.replaceAll("</n>", name);
        return return_string;
    }

    public void set_busy(){set_busy(1);}
    public void set_busy(int num_ticks){
        busy += num_ticks;
        wait_time = 0;
    }

    public String get_personal_actions(){
        String ret = "";

        return ret;
    }

    public ArrayList<CharAction> get_all_overworld_actions(){
        ArrayList<CharAction> ret = new ArrayList<CharAction>();
        
        for(CharAction a : actions )ret.add(a);

        return ret;
    }    

    public void add_to_possessions(Item new_item){
        if(new_item != null){
            if(new_item.name.toLowerCase() == "gold"){
                gold += new_item.value;
                if(gold < 0)gold = 0;
            }else{
                possessions.add(new_item);
            }
        }
    }

    public String get_status(){return get_status(null);}
    public String get_status(Character lookingCharacter){
        String ret = name;


        return ret;
    }
}
