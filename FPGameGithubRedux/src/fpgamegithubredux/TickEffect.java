package fpgamegithubredux;

import java.util.ArrayList;

public class TickEffect {

    public static final int prone_status = 1;
    public static final int poisoned_status = 2;
    public static final int lactating_status = 3;
    public static final int fluid_regen_status = 4;
    public static final int pregnant_status = 5;
    public static final int drunk_status = 6;
    public static final int maternity_bra_status = 7;
    public static final int mighty_whities_status = 8;
    public static final int training_bra_status = 9;
    public static final int jutting_jockstrap_status = 10;
    public static final int one_piece_status = 11;
    public static final int rapunzels_ribbon_status = 12;
    public static final int booty_thong_status = 13;
    public static final int worms_status = 14;
    public static final int horny_chastity_status = 15;
    
    public Character character_effect;
    public int end_tick;
    public int current_tick;
    public Consequence end_consequence;
    public int status_id;
    
    public ArrayList<Number> tick_count;
    public ArrayList<Consequence> tick_consequence;
    public ArrayList<Challenge> tick_challenge;
    
    public static String get_status_effect_name(int status_id){
        String ret = "";
        if(status_id == prone_status){
            ret += "prone";
        }else if(status_id == poisoned_status){
            ret += "poison";
        }else if(status_id == lactating_status){
            ret += "lactating";
        }else if(status_id == pregnant_status){
            ret += "pregnant";
        }else if(status_id == drunk_status){
            ret += "drunk";
        }else if(status_id == worms_status){
            ret += "worms";
        }
        
        return ret;
    }
    
    public TickEffect(){
        character_effect = null;
        end_tick = -1;
        current_tick = 0;
        status_id = -1;
        tick_count=new ArrayList<>();
        tick_consequence=new ArrayList<>();
        tick_challenge =new ArrayList<>();
    }
    
    public void set_end_consequence(Consequence c){
        end_consequence = c;
    }
    
    public void set_status_id(int i){
        status_id = i;
    }
    
    public int get_id(){
        return status_id;
    }
    public void set_tick_consequence(double tick_num, Consequence c){
        set_tick_consequence(tick_num, c, null);
    }
    public void set_tick_consequence(double tick_num, Consequence c, Challenge chall){
        //default Challenge null
        tick_count.add(tick_num); //tick_count[tick_count.size()] = tick_num
        tick_consequence.add(c); //tick_consequence[tick_consequence.length] = c
        tick_challenge.add(chall); //tick_challenge[tick_challenge.length] = chall
    }
    
    public void set_character_effect(Character c){
        character_effect = c;
    }
    
    public void set_end_tick(int i){
        end_tick = i;
    }
    
    public String tick(Character c){
        current_tick++;
        
        String ret = "";
        int i = 0;
        int roll = 1;
        
        for(i=0;i<tick_count.size();i++){
            if(end_tick > -1){
                if(current_tick == tick_count.get(i).intValue()){
                    if(tick_challenge.get(i) != null){
                        roll = tick_challenge.get(i).roll(c, c);
                    }else{
                        roll = 1;
                    }
                    ret += tick_consequence.get(i).trigger(roll, c, c);
                }
            }else{
                if(current_tick%tick_count.get(i).intValue()==0){
                    if(tick_challenge.get(i) != null){
                        roll = tick_challenge.get(i).roll(c, c);
                    }else{
                        roll = 1;
                    }
                    ret += tick_consequence.get(i).trigger(roll, c, c);
                }
            }
        }
        
        if(end_tick >= 0 && current_tick >= end_tick){
            if(character_effect != null){
                character_effect.newLocation(c.location);
                character_effect = null;
            }
            if(end_consequence != null)ret += end_consequence.trigger(1, c, c);
        }
        return ret;
    }
    
    public int ticks_left(){
        if(end_tick >= 0){
            return end_tick - current_tick;
        }else{
            return 1;
        }
    }
    
    public TickEffect copyTE(){
        TickEffect ret = new TickEffect();
        
        ret.set_status_id(status_id);
        ret.set_end_tick(end_tick);
        ret.set_end_consequence(end_consequence);
        ret.set_character_effect(character_effect);
        
        ret.tick_count = tick_count;
        ret.tick_consequence = tick_consequence;
        ret.tick_challenge = tick_challenge;
        
        return ret;
    }

}
