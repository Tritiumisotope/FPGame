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
 * @author hhhin
 */
public class Character {
    public String[] sexChoices = {"Male","Female","Futa"};
    public String sex;
    public String name;
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
}
