package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;
import java.awt.Color;

public class RoomsMap {
    protected Map<Integer, Map<Integer, Map<Integer, Room>>> rooms;
    private static final Logger LOGGER = Logger.getLogger(RoomsMap.class.getName());

    public RoomsMap()
    {
        rooms = new HashMap<Integer, Map<Integer, Map<Integer, Room>>>();
    }

    public int[] find_room(Room fr){
        /*
        int x = 0;
        int y = 0;
        int z = 0;
        for (x = 0;x<rooms.size();x++){//TODO check if works without null check, also .length
            if (rooms.get(x) != null){//[]
                for(y = 0;y<rooms.get(x).size();y++){//[].length
                    if(rooms.get(x).get(y) != null){//[][]
                        for(z=0;z<rooms.get(x).get(y).size();z++){//[][].length
                            if(rooms.get(x).get(y).get(z) != null && rooms.get(x).get(y).get(z) == fr){
                                LOGGER.info(x +" "+ y +" "+z + " found!");
                                return new int[]{x,y,z};
                            }
                        }
                    }                    
                }
            }            
        }
        */
        for (Integer key : x_keys()){
            //LOGGER.info(Integer.toString(key));
            for(Integer key2 : y_keys_for_x(key)){
                //LOGGER.info(key + " " + key2);
                for(Integer key3 : z_keys_for_x_y(key, key2))
                {
                    //LOGGER.info(key + " " + key2 + " " + key3);
                    if(rooms.get(key).get(key2).get(key3) == fr){
                        //LOGGER.info(key +" "+ key2 +" "+key3 + " found!");
                        return new int[]{key,key2,key3};
                    }
                    else if( rooms.get(key).get(key2).get(key3).equals(fr))
                    {
                        LOGGER.info( "We got no == but a .equals!");
                    }
                }
            }
        }
        return null;
    }

    public void insert_room(Integer x, Integer y, Integer z, Room r){
        //rooms.get(x).get(y).put(z, r);
        if(!x_key_exists(x)){
            rooms.put(x, new HashMap<Integer, Map<Integer, Room>>());
        }

        if(!y_key_exists_for_x(x, y))
        {
            rooms.get(x).put(y, new HashMap<Integer, Room>());
        }

        if(loc_exists(x, y, z))
            LOGGER.info( x+ " " +y + " " + z + "Already existed! Why?!");
        rooms.get(x).get(y).put(z, r);
    }

    public boolean isEmpty()
    {
        return rooms.isEmpty();
    }

    public Room get_room(Integer x, Integer y, Integer z){
        if (loc_exists(x,y,z))
            return rooms.get(x).get(y).get(z);
        else
        {
            LOGGER.info("Room did not exist for grabs!");
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
            String methodName = e.getMethodName();
            LOGGER.info("Call came from " + methodName + " line " + e.getLineNumber()) ;
            return null;
        }
    }

    public boolean x_key_exists(Integer x){
        return rooms.containsKey(x);
    }

    public boolean y_key_exists_for_x(Integer x, Integer y){
        if(rooms.containsKey(x)) return rooms.get(x).containsKey(y);
        return false;
    }

    public boolean loc_exists(Integer x, Integer y, Integer z){
        if(rooms.containsKey(x)){
            if(rooms.get(x).containsKey(y)) return rooms.get(x).get(y).containsKey(z);
        }
        return false;
    }

    public Vector<Integer> x_keys(){
        Vector<Integer> ret = new Vector<Integer>();
        ret.addAll(Arrays.asList(rooms.keySet().toArray(new Integer[rooms.keySet().size()] )));
        return ret;
    }

    public Vector<Integer> y_keys_for_x(Integer x){
        if(x_key_exists(x))
        {
            Vector<Integer> ret = new Vector<Integer>();
            ret.addAll(Arrays.asList(rooms.get(x).keySet().toArray(new Integer[rooms.get(x).keySet().size()] )));
            return ret;
        }
        else
            return new Vector<Integer>();
    }

    public Vector<Integer> z_keys_for_x_y(Integer x, Integer y){
        if(x_key_exists(x))
        {
            if(y_key_exists_for_x(x, y))
            {
            Vector<Integer> ret = new Vector<Integer>();
            ret.addAll(Arrays.asList(rooms.get(x).get(y).keySet().toArray(new Integer[rooms.get(x).get(y).keySet().size()] )));
            return ret;
            }
            else
                return new Vector<Integer>();
        }
        else
            return new Vector<Integer>();
    }

    public int get_min_x()
    {
        Set<Integer> keys = rooms.keySet();
        int ret = Integer.MAX_VALUE;
        for (Integer key : keys){
            if(key < ret){
                ret = key;
            }
        }

        return ret;
    }

    public int get_max_x()
    {
        Set<Integer> keys = rooms.keySet();
        int ret = Integer.MIN_VALUE;
        for (Integer key : keys){
            if(key > ret){
                ret = key;
            }
        }

        return ret;
    }

    public int get_span_x()
    {
        return get_max_x() - get_min_x();
    }

    public int get_min_y()
    {
        Set<Integer> keys = rooms.keySet();
        int ret = Integer.MAX_VALUE;
        for (Integer key : keys){
            Set<Integer> keys2 = rooms.get(key).keySet();
            for (Integer key2: keys2)
            {
                if(key2 < ret){
                    ret = key2;
                }
            }
        }

        return ret;
    }

    public int get_max_y()
    {
        Set<Integer> keys = rooms.keySet();
        int ret = Integer.MIN_VALUE;
        for (Integer key : keys){
            Set<Integer> keys2 = rooms.get(key).keySet();
            for (Integer key2: keys2)
            {
                if(key2 > ret){
                    ret = key2;
                }
            }
        }

        return ret;
    }

    public int get_max_y_for_x( Integer x)
    {
        int ret = Integer.MIN_VALUE;
        Set<Integer> keys2 = rooms.get(x).keySet();
        for (Integer key2: keys2)
        {
            if(key2 > ret){
                ret = key2;
            }
        }
        return ret;
    }

    public int get_span_y()
    {
        return get_max_y() - get_min_y();
    }

    public int get_min_z()
    {
        Set<Integer> keys = rooms.keySet();
        int ret = Integer.MAX_VALUE;
        for (Integer key : keys){
            Set<Integer> keys2 = rooms.get(key).keySet();
            for (Integer key2: keys2)
            {
                Set<Integer> keys3 = rooms.get(key).get(key2).keySet();
                for (Integer key3: keys3)
                {
                    if(key3 < ret){
                        ret = key3;
                    }
                }
            }
        }

        return ret;
    }

    public int get_max_z()
    {
        Set<Integer> keys = rooms.keySet();
        int ret = Integer.MIN_VALUE;
        for (Integer key : keys){
            Set<Integer> keys2 = rooms.get(key).keySet();
            for (Integer key2: keys2)
            {
                Set<Integer> keys3 = rooms.get(key).get(key2).keySet();
                for (Integer key3: keys3)
                {
                    if(key3 > ret){
                        ret = key3;
                    }
                }
            }
        }

        return ret;
    }

    public void shift_x(Integer shift){
        Vector<Integer> the_keys = x_keys();
        Collections.sort(the_keys);
        if (shift == 1)
        {
            for (int i = the_keys.size()-1; i>=0;i--)
            {
                rooms.put(the_keys.get(i) +1, rooms.remove(the_keys.get(i)));
            }
        }
        rooms.put(0, new HashMap<Integer,Map<Integer, Room>>());
    }

    public void shift_y_at_x(Integer x, Integer shift){
        Vector<Integer> the_keys = y_keys_for_x(x);
        Collections.sort(the_keys);
        if (shift == 1)
        {
            for (int i = the_keys.size()-1; i>=0;i--)
            {
                rooms.get(x).put(the_keys.get(i) +1, rooms.get(x).remove(the_keys.get(i)));
            }
        }
        rooms.get(x).put(0, new HashMap<Integer, Room>());
    }

    public void push_z_at_x_y(Integer x, Integer y){
        Vector<Integer> the_keys = z_keys_for_x_y(x,y);
        Collections.sort(the_keys);
            for (int i = the_keys.size()-1; i>=0;i--)
            {
                rooms.get(x).get(y).put(the_keys.get(i) +1, rooms.get(x).get(y).remove(the_keys.get(i)));
            }
        //rooms.get(x).put(0, new HashMap<Integer, Room>());
    }
}

