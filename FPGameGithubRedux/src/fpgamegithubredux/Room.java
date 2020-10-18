package fpgamegithubredux;

public class Room{

    String description;

    public Room(){
        description = "This is a room";
    }

    public String get_room_description(Character lookingCharacter){
        String ret = "";

        ret = "\n" + description + "\n";

        return ret;
    }
}