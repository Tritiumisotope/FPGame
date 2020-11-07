package fpgamegithubredux;

import java.util.ArrayList;

public class Character_job {
		
    protected String name;
    
    protected ArrayList<Conversation_topic> topics; //public var topics:Array
    protected ArrayList<Quest> objectives;//public var objectives:Array
    protected ArrayList<CharAction> actions;//public var actions:Array
    
    public Character_job() {
        // constructor code
        name = "";
        topics = new ArrayList<>();
        objectives = new ArrayList<>();
        actions = new ArrayList<>();
    }
    
    public void set_name(String n){
        name = n;
    }
    
    public String get_name(){
        return name;
    }
    
    public void new_topic(Conversation_topic ct){
        topics.add(ct);//topics[topics.length] = ct
    }
    
    public void new_objective(Quest q){
        objectives.add(q); //objectives[objectives.length] = q
    }
    
    public void new_action(CharAction a){
        actions.add(a);//actions[actions.length] = a
    }
    
    public ArrayList<Conversation_topic> get_topics(){
        return topics;
    }
    
    public ArrayList<CharAction> get_actions(Character c){
        return actions;
    }

}

