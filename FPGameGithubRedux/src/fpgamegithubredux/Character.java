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
    public String name;
    public Character mother;
    public Character father;
    public String[] sexChoices = {"Male","Female","Futa"};
    public String sex;
    public int gold;
    public int busy;
    public int wait_time;
    //public int fitness;

    public ArrayList<Item> possessions;
    public ArrayList<Integer> statID;
    public ArrayList<Object> stats;

    public ArrayList<CharAction> actions;

    public ArrayList<Object> current_tick_effects;

    protected ArrayList<Object> currentTickEffects;

    protected Room location;
            
    public Character(){
        name = "Jeff";
        sex = "Male";
        
        possessions = new ArrayList<Item>();
        statID = new ArrayList<Integer>();
        stats = new ArrayList<Object>();
        actions = new ArrayList<CharAction>();

        location = null;

        gold = 0;

        busy = 0;
        wait_time = 0;
    }
    public Character(String newName,int newSex, double newFitness){
        setName(newName);
        setSex(newSex);
        newStat(0, newFitness);
        
    }
    public void setName(String theName){
        name = theName;
    }

    public void setSex(int theSex){
        sex = sexChoices[theSex];
    }

    public void newStat(int newStatID, double statVal){
        if(!statID.contains(newStatID)){
            statID.add(newStatID);
            stats.add(statVal);
        }
    }

    public String applyAffectByID(int statIDForChange, double changeBy){
        String ret = "";
        int index = statID.indexOf(statIDForChange);
        if(index >= 0){
            Double temp = (Double)stats.get(index);
            temp += changeBy;
        }

        return ret;
    }

    public String appearance(int lookID, Character c){
        return "You are " + name;
    }

    public String look(){return look(-1, 0);}
    public String look(int content_id){return look(content_id, 0);}
    public String look(int content_id, int look_id){
        String ret = "";

        if(location != null){
            if(content_id >= 0){
                ret = "something, something....";
            }else{
                ret = location.getRoomDescription(this);
            }
        }

        return ret;
    }

    public String inventory(){
        String returnString = "";
        StringBuilder bld = new StringBuilder();//added
        if(possessions.isEmpty()){
            returnString = "</n> Inventory contains nothing.";
        }else{
            returnString = "</n> Inventory contains: ";
            for(Item o : possessions){
                returnString += "<a href=\"event:use_item," + possessions.indexOf(o) +"\">" + o.name + "</a>,";
            }
            returnString = returnString + bld.toString();
            //no idea why it prefers this...assume compilation simplifies the run
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
        return "Name: " + name + "\n";
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
