/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

/**
 *
 * @author hhhin
 */
public class Character {
    public String[] sexChoices = {"Male","Female","Futa"};
    public String sex;
    public String name;
    public int fitness;
            
    public Character(){
        name = "Jeff";
        sex = "Male";
        fitness = 1;
    }
    public Character(String newName,int newSex, int newFitness){
        setName(newName);
        setSex(newSex);
        setFitnessLevel(newFitness);
        
    }
    public void setName(String theName){
        name = theName;
    }
    public void setFitnessLevel(int theFitness){
        fitness = theFitness;
    }
    public void setSex(int theSex){
        sex = sexChoices[theSex];
    }
}
