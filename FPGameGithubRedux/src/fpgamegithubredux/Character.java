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
    //public int fitness;

    public ArrayList<Object> possessions;
    public ArrayList<Integer> stat_id;
    public ArrayList<Object> stats;

    public ArrayList<Object> current_tick_effects;

    public Room location;
            
    public Character(){
        name = "Jeff";
        sex = "Male";
        
        possessions = new ArrayList<Object>();
        stat_id = new ArrayList<Integer>();
        stats = new ArrayList<Object>();

        location = null;

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

    public String look(int char_id, int look_id){
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
            for(Object o : possessions){
                return_string += "something, ";
            }
        }

        if(return_string.charAt(return_string.length()-2) == ',')return_string = return_string.substring(0, return_string.length()-2);

        return sanitize(return_string);
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
        String return_string = string_to_sanitize.replace("</n>", name);
        return return_string;
    }
}
