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
    private String[] sexChoices = {"Male","Female","Futa"};
    protected String sex;
    //public int fitness;

    protected ArrayList<Object> possessions;
    protected ArrayList<Integer> statID;
    protected ArrayList<Object> stats;

    protected String skillReturn = "<table><tr><u><tc>Skill</tc><tc>Ranks</tc><tc>Bonus</tc><tc>Cost</tc><tc>Current XP to spend: <font color='#00FF00'>0</font>/100</tc></u></tr></table>";

    protected ArrayList<Object> currentTickEffects;

    protected Room location;
            
    public Character(){
        name = "Jeff";
        sex = "Male";
        
        possessions = new ArrayList<>();
        statID = new ArrayList<>();
        stats = new ArrayList<>();

        location = null;

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

    public String look(int charID, int lookID){

        if(location != null){
            return location.getRoomDescription(this);
        }
        else{
            return "";
        }
    }

    public String inventory(){
        String returnString = "";
        StringBuilder bld = new StringBuilder();//added
        if(possessions.isEmpty()){
            returnString = "</n> Inventory contains nothing.";
        }else{
            returnString = "</n> Inventory contains: ";
            for(Object o : possessions){
                bld.append("something, ");//instead of normal addition
            }
            returnString = returnString + bld.toString();
            //no idea why it prefers this...assume compilation simplifies the run
        }

        if(returnString.charAt(returnString.length()-2) == ',')returnString = returnString.substring(0, returnString.length()-2);

        return sanitize(returnString);
    }

    public String statistics(){
        return "Name: " + name + "\n";
    }

    public String showAllSkills(){
        return skillReturn;
    }

    public String sanitize(String stringToSanitize){
        return stringToSanitize.replace("</n>", name);
    }
}
