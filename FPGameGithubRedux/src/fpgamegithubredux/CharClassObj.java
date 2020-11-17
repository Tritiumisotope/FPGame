package fpgamegithubredux;

public class CharClassObj {
    //Character_class, int, Boolean, in that order
    private Character_class cclass;
    private int num;
    private Boolean bool;

    public CharClassObj(Character_class i, int j, Boolean k){
        cclass = i;
        num = j;
        bool = k;
    }
    public Character_class getCclass(){
        return cclass;
    }
    public int getLevel(){
        return num;
    }
    public Boolean getBool(){
        return bool;
    }
    public void setCclass(Character_class c){
        cclass = c;
    }
    public void setLevel(int n){
        num = n;
    }
    public void setBool(Boolean b){
        bool = b;
    }
}
