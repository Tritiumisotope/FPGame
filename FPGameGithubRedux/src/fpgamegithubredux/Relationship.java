package fpgamegithubredux;

import java.util.ArrayList;

public class Relationship {
    public static final int stat_change = 0;
    public static final int initial_reaction_change = 1;
    public static final int aggressive_change = 2;
    
    public static final int known_type = 0;
    public static final int sibling_type = 1;
    public static final int father_type = 2;
    public static final int mother_type = 3;
    public static final int child_type = 4;
    public static final int married_type = 5;
    
    public Character relationship_with;
    public Number positive;
    public Number negative;
    public Boolean introduced;
    public ArrayList<Integer> change_reasons;//public var change_reasons:Array
    public int relationship_type;		

    public Relationship(){
        this(null);
    }
    public Relationship(Character c){
        // constructor code
        relationship_with = c;
        introduced = false;
        positive = 0;
        negative = 0;
        change_reasons = new ArrayList<>();
        relationship_type = known_type;
    }
    
    public Boolean get_introduced(){
        return introduced;
    }
    
    public void set_introduced(){
        introduced = true;
    }
    
    public void change_type(int new_type){
        relationship_type = new_type;
    }
    
    public void apply_change(Number k,int change_id){
        //TODO verify let 0 fail on its own, we have no else!
        //if statement checking if k double value not equal zero
        if(k.doubleValue() > 0){
            if(positive.doubleValue() > 0 && k.doubleValue()-(positive.doubleValue()/2) > 0){
                k = Math.round(2*Math.log(k.doubleValue()-(positive.doubleValue()/2)));
            }else if(positive.doubleValue() > 0){
                k = 1;
            }
            if(k.doubleValue()<0) k = -k.doubleValue();
            
            //trace("(Relationship)positive change of " + k)
            //positive += k
            positive = positive.doubleValue() + k.doubleValue();
        }else if(k.doubleValue()<0){
            k = -k.doubleValue();
            if(negative.doubleValue() > 0 && k.doubleValue()-(negative.doubleValue()/2) > 0){
                k = Math.round(2*Math.log(k.doubleValue()-(negative.doubleValue()/2)));
            }else if(negative.doubleValue() > 0){
                k = 1;
            }
            if(k.doubleValue()<0) k = -k.doubleValue();
            
            //trace("(Relationship)negative change of " + k)
            //negative += k
            negative = negative.doubleValue() + k.doubleValue();
        }
        //trace("(Relationship)made change of " + k + " ending status:" + relationship_status())
        //close bracket
        //change_reasons[change_reasons.length] = change_id
        change_reasons.add(change_id);
    }
    
    public void change_to_aggressive(){
        negative = positive.doubleValue() + 1;
    }
    
    public Number relationship_status(){
        return positive.doubleValue() - negative.doubleValue();
    }

}

