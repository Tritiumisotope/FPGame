package fpgamegithubredux;

import java.util.ArrayList;

public class Quest {
		
    public static final int no_action = -1;
    public static final int talk_action = 1;
    public static final int kill_action = 2;
    public static final int incapacitate_action = 16;
    public static final int status_remove_action = 3;
    public static final int status_add_action = 4;
    public static final int skill_action = 5;
    public static final int sex_action = 6;
    public static final int party_action = 7;
    public static final int part_action = 8;
    public static final int equip_action = 9;
    public static final int unequip_action = 10;
    public static final int hold_action = 11;
    public static final int unhold_action = 12;
    public static final int pick_up_action = 13;
    public static final int drop_action = 14;
    public static final int class_action = 15;	
    public static final int area_action = 17;
    public static final int room_action = 18;
    public static final int wait_action = 19;
    
    protected String name;
    protected ArrayList<String> objectives;//protected var objectives:Array
    protected ArrayList<Integer> objective_actions;//protected var objective_actions:Array
    protected ArrayList<ArrayList<Object>> objective_targets;//protected var objective_targets:Array
    protected ArrayList<Conversation_topic> topics;//protected var topics:Array
    protected ArrayList<Integer> topics_objective;//protected var topics_objective:Array
    protected int end_step;
    protected ArrayList<Object> end_rewards;//protected var end_rewards:Array
    protected ArrayList<Integer> next_objective;//protected var next_objective:Array
    protected ArrayList<Integer> objective_timer;//protected var objective_timer:Array

    public Quest() {
        // constructor code
        name = "Quest";			
        objectives = new ArrayList<>();
        objective_actions = new ArrayList<>();
        objective_targets = new ArrayList<>();
        topics = new ArrayList<>(); 
        topics_objective = new ArrayList<>();
        end_step = -1;
        end_rewards = new ArrayList<>();
        next_objective = new ArrayList<>();
        objective_timer = new ArrayList<>();
    }
    
    public void set_name(String s){
        name = s;
    }
    
    public void set_end_step(int step_num){
        end_step = step_num;
    }

    public void add_end_reward(ArrayList<Object> reward){

        end_rewards.add(reward);//end_rewards = end_rewards.concat(reward)
    }
    
    
    public String end_quest(Character c){
        String ret = "";
        int i= 0;
        for(i=0;i<end_rewards.size();i++){
            if(end_rewards.get(i) instanceof Integer){
                Integer temp = (Integer)end_rewards.get(i);
                ret += c.set_xp(temp);//ret += c.set_xp(end_rewards.get(i))
            }else if(end_rewards.get(i) instanceof Item){
                //c.add_to_possessions(end_rewards.get(i));
                //TODO
            }else{
                //trace("(Quest.end_quest)Should be rewarding character for ending the quest, but got " + end_rewards[i] + " and don't know what to do with it");
            }
        }
        return ret;
    }
    
    
    public void new_objective(String s,int action_type,ArrayList<ArrayList<Object>> action_target){
        new_objective(s,action_type,action_target,-1,-1);
    }
    public void new_objective(String s,int action_type,ArrayList<ArrayList<Object>> action_target,int go_to_objective,int ticks_to_complete){
        //default -1,-1
        objectives.add(s);//objectives[objectives.length] = s
        objective_actions.add(action_type);//objective_actions[objective_actions.length] = action_type
        ArrayList<Object> temp = new ArrayList<>();//objective_targets[objective_targets.length] = action_target
        temp.add(action_target);
        objective_targets.add(temp);
        next_objective.add(go_to_objective);//next_objective[next_objective.length] = go_to_objective
        objective_timer.add(ticks_to_complete);  //objective_timer[objective_timer.length] = ticks_to_complete
    }
    
    public String get_objectives(Character c){
        String ret = name+":\n";
        
        ArrayList<Integer> temp = c.personality.get_obj_steps(this);
        if(temp != null){
            int i = 0;
            for(i=0;i<temp.size();i++){
                if(i >= temp.size() -1){
                    ret += "\t" + objectives.get(temp.get(i)) + "\n";
                }else{
                    ret += "✔\t" + objectives.get(temp.get(i)) + "\n";
                }
            }
        }else{
            ret += "\t" + objectives.get(c.personality.get_obj_step(this)) + "\n";
        }
        return ret;
    }
    
    public void add_conversation_topic(Conversation_topic ct,int obj_num){
        topics.add(ct);//topics[topics.length] = ct
        topics_objective.add(obj_num);//topics_objective[topics_objective.length] = obj_num;
    }
    
    public ArrayList<Conversation_topic> get_conversation_topics(int curr_obj_num){
        ArrayList<Conversation_topic> ret= new ArrayList<>();
        int i = 0;
        for(i=0;i<topics.size();i++){
            if(topics_objective.get(i) == curr_obj_num){
                ret.add(topics.get(i));//ret = ret.concat(topics[i])
            }
        }
        
        return ret;
    }
    
    public Room get_target_room(int curr_obj_num){
        Room target_room = null;
        if(objective_targets.get(curr_obj_num).get(0) instanceof Room){
            Room temp = (Room) objective_targets.get(curr_obj_num).get(0);
            if(objective_actions.get(curr_obj_num) == Quest.area_action){
                //target_room
            }else if(objective_actions.get(curr_obj_num) == Quest.room_action){
                target_room = temp;//TODO why only 2D?
            }else if(objective_actions.get(curr_obj_num) == Quest.wait_action){
                target_room = temp;
            }
        }
        return target_room;
    }
    
    public Character get_target_char(int curr_obj_num){
        Character target_char = null;
        if(objective_targets.get(curr_obj_num).get(0) instanceof Character){
            Character temp = (Character) objective_targets.get(curr_obj_num).get(0);
            if(objective_actions.get(curr_obj_num) == Quest.talk_action){
                //target_char
            }else if(objective_actions.get(curr_obj_num) == Quest.kill_action){
                target_char = temp;
            }else if(objective_actions.get(curr_obj_num) == Quest.incapacitate_action){
                target_char = temp;
            }
        }
        return target_char;
    }
    
    public CharAction get_target_action(int curr_obj_num){
        CharAction target_action= null;
        /* DUMMIED BEFORE
        if(objective_actions.get(curr_obj_num) == Quest.status_remove_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.status_add_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.sex_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.party_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.part_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.class_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.talk_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.kill_action){
            target_action
        }else if(objective_actions.get(curr_obj_num) == Quest.incapacitate_action){
            target_action
        }
        */
        return target_action;
    }
    
    public Item get_target_item(int curr_obj_num){
        Item target_item = null;
        /*DUMMIED BEFORE
        if(objective_actions.get(curr_obj_num) == Quest.equip_action){
            target_item
        }else if(objective_actions.get(curr_obj_num) == Quest.unequip_action){
            target_item
        }else if(objective_actions.get(curr_obj_num) == Quest.hold_action){
            target_item
        }else if(objective_actions.get(curr_obj_num) == Quest.unhold_action){
            target_item
        }else if(objective_actions.get(curr_obj_num) == Quest.pick_up_action){
            target_item
        }else if(objective_actions.get(curr_obj_num) == Quest.drop_action){
            target_item
        }
        */
        return target_item;
    }
    
    public String get_target_command(int curr_obj_num){
        String target_command = null;
        
        if(objective_actions.get(curr_obj_num) == Quest.skill_action){
            target_command = "show_skills";
        }else if(objective_actions.get(curr_obj_num) == Quest.equip_action){
            target_command = "equip";
        }else if(objective_actions.get(curr_obj_num) == Quest.unequip_action){
            target_command = "unequip";
        }else if(objective_actions.get(curr_obj_num) == Quest.hold_action){
            target_command = "hold";
        }else if(objective_actions.get(curr_obj_num) == Quest.unhold_action){
            target_command = "unhold";
        }else if(objective_actions.get(curr_obj_num) == Quest.pick_up_action){
            target_command = "loot";//"pick_up"
        }else if(objective_actions.get(curr_obj_num) == Quest.drop_action){
            target_command = "use_item";
        }else if(objective_actions.get(curr_obj_num) == Quest.wait_action){
            target_command = "wait";
        }
        return target_command;
    }

}

