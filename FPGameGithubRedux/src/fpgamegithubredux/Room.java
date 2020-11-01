package fpgamegithubredux;

public class Room{

    String description;

    public Room(){
        description = "This is a room, where </n> resides.";
    }

    public String getRoomDescription(Character lookingCharacter){
        String ret = "";

        ret = "\n" + description.replace("</n>", lookingCharacter.name) + "\n";

        return ret;
    }
}