/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.util.ArrayList;
//import java.util.List;

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
    public ArrayList<Integer> stat_id;
    public ArrayList<Object> stats;

    public ArrayList<CharAction> actions;

    public ArrayList<Object> current_tick_effects;

    public Room location;
            
    public Character(){
        name = "Jeff";
        sex = "Male";
        
        possessions = new ArrayList<Item>();
        stat_id = new ArrayList<Integer>();
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
        new_stat(0, newFitness);
        
    }
    public void setName(String theName){
        name = theName;
    }

    public void setSex(int theSex){
        sex = sexChoices[theSex];
    }

    public void new_stat(int new_stat_id, double stat_val){
        if(!stat_id.contains(new_stat_id)){
            stat_id.add(new_stat_id);
            stats.add(stat_val);
        }
    }

    public String apply_affect_by_id(int stat_id_for_change, double change_by){
        String ret = "";
        int index = stat_id.indexOf(stat_id_for_change);
        if(index >= 0){
            Double temp = (Double)stats.get(index);
            temp += change_by;
        }

        return ret;
    }

    public String appearance(int look_id, Character c){
        String ret = "You are " + name;

        return ret;
    }

    public String look(){return look(-1, 0);}
    public String look(int content_id){return look(content_id, 0);}
    public String look(int content_id, int look_id){
        String ret = "";

        if(location != null){
            ret = location.get_room_description(this);
        }

        return ret;
    }

    public String inventory(){
        String return_string = "";

        if(possessions.size() <= 0){
            return_string = "</n> Inventory contains nothing.";
        }else{
            return_string = "</n> Inventory contains: ";
            for(Item o : possessions){
                return_string += "<a href=\"event:use_item," + possessions.indexOf(o) +"\">" + o.name + "</a>,";
            }
        }

        if(return_string.charAt(return_string.length()-1) == ',')return_string = return_string.substring(0, return_string.length()-1);

        return sanitize(return_string);
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
        String return_string = "";

        return_string = "Name: " + name + "\n";

        return return_string;
    }

    public String show_all_skills(){
        String return_string = "<table><tr><u><tc>Skill</tc><tc>Ranks</tc><tc>Bonus</tc><tc>Cost</tc><tc>Current XP to spend: <font color='#00FF00'>0</font>/100</tc></u></tr></table>";

        return return_string;
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
