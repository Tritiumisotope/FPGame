package fpgamegithubredux;

public class Item {
    public String name;
    public int value;

    public Item(){
        name = "";
        value = 0;
    }

    public String get_dropped_description(){
        return name;
    }
}
