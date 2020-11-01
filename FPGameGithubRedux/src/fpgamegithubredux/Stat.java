package fpgamegithubredux;

public class Stat {

    protected int statID;
    protected String name;
    protected Double statValue;
    protected Double tempStatValue;

    public Stat(){
        statID = 0;
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
        if(Boolean.FALSE.equals(tempFlag)){
            statValue = val;  
        }
        tempStatValue = val;
    }
}
