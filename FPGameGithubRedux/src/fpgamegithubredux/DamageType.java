package fpgamegithubredux;

public class DamageType {

    public int type_id;
    public String type_name;
    
    public DamageType() {
        // constructor code
        type_id = -1;
        type_name = "";
    }
    
    public void set_type_id(int i){
        type_id = i;
    }
    
    public void set_type_name(String s){
        type_name = s;
    }
    
    public String get_name(){
        return type_name;
    }
    
    public int get_id(){
        return type_id;
    }

}
