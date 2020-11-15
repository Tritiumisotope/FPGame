package fpgamegithubredux;

import java.util.ArrayList;

public class Character_class extends DynamicObject {
		
	
    protected ArrayList<CharAction> attacks;
    protected ArrayList<Number> bonus;
    protected ArrayList<Integer> attack_lvl_req;
    protected ArrayList<CharAction> actions;
    protected ArrayList<Integer> action_lvl_req;
    
    protected ArrayList<Integer> class_skills;
    
    public Character_class() {
        name = "";
        
        bonus = new ArrayList<>();
        attacks = new ArrayList<>();
        attack_lvl_req = new ArrayList<>();
        actions = new ArrayList<>();
        action_lvl_req = new ArrayList<>();
        class_skills = new ArrayList<>();
        
    }
    
    public void add_class_skill(int skill_id){
        class_skills.add(skill_id); //class_skills[class_skills.length] = skill_id
    }
    
    public Boolean is_class_skill(int skill_id){
        Boolean ret = false;
        int i = 0;
        for(i=0;i<class_skills.size();i++){
            if(class_skills.get(i) == skill_id){
                ret = true;
                break;
            }
        }
        return ret;
    }
    public void add_attack(CharAction a){
        add_attack(a, 0);
    }
    public void add_attack(CharAction a, int lr){//def 0
        if(a.get_cclass_origin().equals(name) && a.get_cclass_level() == lr){
            return;
        }
        a.set_cclass_origin(name);
        a.set_cclass_level(lr);
        attacks.add(a); //attacks[attacks.size()] = a
        attack_lvl_req.add(lr); //attack_lvl_req[attack_lvl_req.length] = lr
    }
    public void add_action(CharAction a){
        add_action(a,0);
    }
    public void add_action(CharAction a,int lr){//def 0
        if(a.get_cclass_origin().equals(name) && a.get_cclass_level() == lr){
            return;
        }
        a.set_cclass_origin(name);
        a.set_cclass_level(lr);
        actions.add(a); //actions[actions.length] = a
        action_lvl_req.add(lr); //action_lvl_req[action_lvl_req.length] = lr
    }
    
    public String get_attack(int i, Character c){
        if (i>=0 && i<attacks.size() && c.get_class_lvl(this) >= attack_lvl_req.get(i)) return attacks.get(i).getName();
        return null;
    }
    
    public CharAction get_attack_action(int i, Character c){
        if (i>=0 && i<attacks.size() && c.get_class_lvl(this) >= attack_lvl_req.get(i)) return attacks.get(i);
        return null;
    }
    
    public void set_bonus(int stat_id, Number i){
        if(stat_id >= bonus.size()){
            for(int count = bonus.size();count<= stat_id;count++){
                if(count == stat_id){
                    bonus.add(i);
                }else{
                    bonus.add(null);
                }
            }
        }else{
            bonus.set(stat_id,i); //bonus.get(stat_id) = i
        }       
    }
    
    public int get_stat_cost(int stat_id){//was uint
        int ret = 3;//was uint
        if(bonus.get(stat_id) != null){
            if(bonus.get(stat_id).intValue() <= 2) ret = ret - bonus.get(stat_id).intValue();
        }
        return ret;
    }
    
    public String level_up(Character c){
        String ret = "";//apply_bonuses(c)
        
        int i = 0;
        for(i=0;i<actions.size();i++){
            int j = 0;
            Boolean found = false;
            for(j=0;j<c.actions.size();j++){
                if(c.actions.get(j) == actions.get(i)){
                    found = true;
                    break;
                }
            }
            if(!found && action_lvl_req.get(i) <= c.get_class_lvl(this)){
                c.add_action(actions.get(i));
                if(!actions.get(i).name.equals(""))ret += "<\n> learns " + actions.get(i).name;
            }
        }
        
        return ret;
    }
    
    public Character_class copyClass(){
        Character_class cl = new Character_class();
        
        int i = 0;
        for(i=0;i<attacks.size();i++){
            cl.add_attack(attacks.get(i),attack_lvl_req.get(i));
        }
        
        cl.name = name;
        cl.bonus = bonus;
        cl.actions = actions;
        cl.action_lvl_req = action_lvl_req;
        cl.class_skills = class_skills;
        return cl;
    }
    

}

