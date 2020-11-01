package fpgamegithubredux;

public class Stat {

    protected int ID;
    protected Double stat_value;
    protected Double temp_stat_value;

    public Stat(){
        ID = 0;
        stat_value = 0.0;
        temp_stat_value = 0.0;
    }

    public void set_stat_value(Double val){set_stat_value(val,false);}
    public void set_stat_value(Double val, Boolean temp_flag){
        if(!temp_flag){
            stat_value = val;
            temp_stat_value = val;
        }else{
            temp_stat_value = val;
        }
    }
}
