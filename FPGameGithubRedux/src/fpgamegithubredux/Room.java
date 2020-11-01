package fpgamegithubredux;

import java.util.ArrayList;

public class Room{

    protected String description;
    protected ArrayList<Object> contents;
    protected ArrayList<CharAction> actions;

    public Room(){
        contents = new ArrayList<Object>();
        actions = new ArrayList<CharAction>();
        description = "This is a room. There is something <a0> about it.";

        CharAction tempAction = new CharAction();
        tempAction.name = "strange";
        tempAction.dialogue = "You </c0> around.";

        Challenge tempChal = new Challenge();
        tempChal.set_text("look");

        Consequence tempConseq = new Consequence();
        tempConseq.add_consequence(0, 0.0, "It looks like someone has completely disinfected everything in this room. The smell is horrible. ", 0);
        tempConseq.add_consequence(0, 0.0, "Worse still, you notice everything is giving off its own light. ", 5);
        tempConseq.add_consequence(0, 0.0, "You decide the ground looks nice. ", -1);

        tempAction.add_challenge(tempChal, tempConseq);

        add_action(tempAction);
    }

    public String getRoomDescription(Character lookingCharacter){
        String ret = "";

        ret = "<br>" + description + "<br>";

        Boolean nothing = true;
        if(contents.size() > 0){
            ret += "The room contains: ";
            for(Object o : contents){
                if(o instanceof Character){
                    Character temp_char = (Character)o;
                    if(temp_char != lookingCharacter){
                        ret += "<a href=\"event:look," + contents.indexOf(o) +"\">" +temp_char.get_status(lookingCharacter) + "</a>,";
                        nothing = false;
                    }
                }else if(o instanceof Item){
                    Item temp_item = (Item)o;

                    ret += "<a href=\"event:pick_up," + contents.indexOf(o) +"\">" + temp_item.get_dropped_description() + "</a>,";
                    nothing = false;
                }
            }

            if(nothing)ret += "Nothing!";
        }

        for(CharAction a : actions){
            if(a != null){
                ret = ret.replaceAll("<a"+actions.indexOf(a)+">", "<a href=\"event:action,-1," + actions.indexOf(a) +"\"><i>"+a.get_name() +"</i></a>");
            }
        }

        return ret;
    }

    public String fire_challenge(int action_id, int challenge_id, Character triggeringCharacter){
        String ret = "";

        CharAction tempAction = getAction(action_id);
        if(tempAction != null){
            ret = tempAction.challenge(challenge_id, triggeringCharacter);
        }

        return ret;
    }

    public void add_action(CharAction new_action){
        new_action.ID = actions.size();
        actions.add(new_action);
    }

    public CharAction getAction(int action_id){
        if(action_id>=0 && action_id < actions.size()){
            return actions.get(action_id);
        }
        return null;
    }

    public void new_content(Object o){new_content(o, null);}
    public void new_content(Object o, Room prev_room){
        contents.add(o);
    }

    public int get_content_id(Object o){
        return contents.indexOf(o);
    }

    public Object get_content(int ID){
        return contents.get(ID);
    }

    public Item item_loss(int content_id){
        if(content_id >= 0 && content_id < contents.size()){
            if(contents.get(content_id) instanceof Item){
                Item temp_item = (Item)contents.get(content_id);
                contents.remove(content_id);
                return temp_item;
            }
        }
        return null;
    }
}