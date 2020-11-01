package fpgamegithubredux;

import java.util.ArrayList;

public class Room{

    String description;
    ArrayList<Object> contents;

    public Room(){
        contents = new ArrayList<Object>();
        description = "This is a room";
    }

    public String get_room_description(Character lookingCharacter){
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

        return ret;
    }

    public void new_content(Object o){new_content(o, null);}
    public void new_content(Object o, Room prev_room){
        contents.add(o);
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