package fpgamegithubredux;

public class Item {
    protected String name;
    protected int value;

    public Item(){
        name = "";
        value = 0;
    }

    public String getDroppedDescription(){
        return name;
    }
}
