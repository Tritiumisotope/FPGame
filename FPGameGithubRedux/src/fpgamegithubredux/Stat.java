package fpgamegithubredux;

public class Stat {

    protected int ID;
    protected String name;
    protected Double statValue;
    protected Double tempStatValue;

    public Stat(){
        ID = 0;
        statValue = 0.0;
        tempStatValue = 0.0;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setStatValue(Double val){setStatValue(val,false);}
    public void setStatValue(Double val, Boolean tempFlag){
        if(!tempFlag){
            statValue = val;
            tempStatValue = val;
        }else{
            tempStatValue = val;
        }
    }
}
