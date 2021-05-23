package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class World {
    private static final Logger LOGGER = Logger.getLogger(World.class.getName());
		
    public ArrayList<Area> areas;//:Array
    public ArrayList<Room> starting_rooms;//:Array
    public ArrayList<ArrayList<Object>> links;//:Array
    public ArrayList<Object> settings;//:Array
    
    private ArrayList<Integer> already_tried_area;//:Array
    
    public World(){this(null, null, null);}
    public World(ArrayList<Area> a,ArrayList<Room> sr,ArrayList<ArrayList<Object>> l) {//def null,null,null
        // constructor code
        if(a == null){
            areas = new ArrayList<>();
        }else{
            areas = a;
        }
        if(sr == null){
            starting_rooms = new ArrayList<>();
        }else{
            starting_rooms = sr;
        }
        if(l == null){
            links = new ArrayList<>();
        }else{
            links = l;
        }
        already_tried_area = new ArrayList<>();
    }
    
    public void set_settings(ArrayList<Object> settings_array){
        settings = settings_array;
    }
    //*TODO make this work?
    public String[] add_exit_to_piece(String[] map_piece,String exit_name){//TODO fixed size	array
        if(exit_name.equals("North")){
            map_piece[1] = "|";
        }else if(exit_name.equals("East")){
            map_piece[6] = "-";
        }else if(exit_name.equals("West")){
            map_piece[4] = "-";
        }else if(exit_name.equals("North-East")){
            map_piece[2] = "/";
        }else if(exit_name.equals("North-West")){
            map_piece[0] = "\\";
        }else if(exit_name.equals("South-West")){
            map_piece[8] = "/";
        }else if(exit_name.equals("South-East")){
            map_piece[10] = "\\";
        }else if(exit_name.equals("South")){
            map_piece[9] = "|";
        }else{
            map_piece[5] = "@";
        }
        
        return map_piece;
    }
    
    public String get_map(){
        return get_map(null);
    }
    public String get_map(Area character_area){//def null
        String ret = "";
        
        ArrayList<String[]> map_pieces = new ArrayList<>();//Array
        ArrayList<ArrayList<Integer>> map = make_integer_map();
        ArrayList<ArrayList<String[]>> stringMap = new ArrayList<>();
        
        
        int i;
        for(i=0;i<links.size();i++){
            if((Boolean)links.get(i).get(2) == false){
                if(areas.get((Integer)links.get(i).get(0)).get_player_discovered()){
                    if(map_pieces.get((Integer)links.get(i).get(0)) != null){
                        map_pieces.set((Integer)links.get(i).get(0), add_exit_to_piece(map_pieces.get((Integer)links.get(i).get(0)), (String)links.get(i).get(3)));
                    }else{
                        if(character_area == areas.get((Integer)links.get(i).get(0))){
                            map_pieces.set((Integer)links.get(i).get(0), new String[]{" "," "," ","\n"," ","<colour="+areas.get((Integer)links.get(i).get(0)).get_map_colour()+">P"," ","\n"," "," "," "});
                        }else{
                            map_pieces.set((Integer)links.get(i).get(0), new String[]{" "," "," ","\n"," ","<a href=\"event:show_map," + (Integer)links.get(i).get(0) +"\" colour="+areas.get((Integer)links.get(i).get(0)).get_map_colour()+">O</a>"," ","\n"," "," "," "});								
                        }
                        map_pieces.set((Integer)links.get(i).get(0), add_exit_to_piece(map_pieces.get((Integer)links.get(i).get(0)), (String)links.get(i).get(3)));
                    }
                }
                if(areas.get((Integer)links.get(i).get(1)).get_player_discovered()){
                    if(map_pieces.get((Integer)links.get(i).get(1)) != null){
                        map_pieces.set((Integer)links.get(i).get(1), add_exit_to_piece(map_pieces.get((Integer)links.get(i).get(1)), (String)links.get(i).get(4)));
                    }else{
                        if(character_area == areas.get((Integer)links.get(i).get(1))){
                            map_pieces.set((Integer)links.get(i).get(1), new String[]{" "," "," ","\n"," ","<colour="+areas.get((Integer)links.get(i).get(1)).get_map_colour()+">P"," ","\n"," "," "," "});
                        }else{
                            map_pieces.set((Integer)links.get(i).get(1), new String[]{" "," "," ","\n"," ","<a href=\"event:show_map," + (Integer)links.get(i).get(1) +"\" colour="+areas.get((Integer)links.get(i).get(1)).get_map_colour()+">O</a>"," ","\n"," "," "," "});
                        }
                        map_pieces.set((Integer)links.get(i).get(1), add_exit_to_piece(map_pieces.get((Integer)links.get(i).get(1)), (String)links.get(i).get(4)));
                    }
                }
            }
        }
        

        for(i = 0;i<map.size();i++){
            if(map.get(i) != null){
                stringMap.add(new ArrayList<>());
                for(int j=0;j<map.get(i).size();j++){
                    if(map.get(i).get(j) != null){
                        //map.get(i).set(j,map_pieces.get(map.get(i).get(j)));//map[i][j] = map_pieces[map[i][j]]
                        stringMap.get(i).add(map_pieces.get(map.get(i).get(j)));
                        //null-fill stringMap and assign here?
                    }else{//again with maintaining addresses
                        stringMap.get(i).add(null);
                    }
                }
            }else{//keeping that same exact set of addresses!
                stringMap.add(null);
            }
        }
        
        
        for(i=0;i<map.size();i++){
            if(map.get(i) != null){
                int line_count = 0;
                for(line_count=0;line_count<3;line_count++){
                    int j = 0;
                    for(j=0;j<map.get(i).size();j++){
                        if(map.get(i).get(j) != null){
                            if(line_count == 0){
                                /*use stringMap?
                                ret += map.get(i).get(j)[0];
                                ret += map.get(i).get(j)[1];
                                ret += map.get(i).get(j)[2];
                            }else if(line_count == 1){
                                ret += map.get(i).get(j)[4];
                                ret += map.get(i).get(j)[5];
                                ret += map.get(i).get(j)[6];
                            }else if(line_count == 2){
                                ret += map.get(i).get(j)[8];
                                ret += map.get(i).get(j)[9];
                                ret += map.get(i).get(j)[10];
                                */
                                ret += stringMap.get(i).get(j)[0];
                                ret += stringMap.get(i).get(j)[1];
                                ret += stringMap.get(i).get(j)[2];
                            }else if(line_count == 1){
                                ret += stringMap.get(i).get(j)[4];
                                ret += stringMap.get(i).get(j)[5];
                                ret += stringMap.get(i).get(j)[6];
                            }else if(line_count == 2){
                                ret += stringMap.get(i).get(j)[8];
                                ret += stringMap.get(i).get(j)[9];
                                ret += stringMap.get(i).get(j)[10];
                            }
                        }else{
                            ret += "   ";
                        }
                    }
                    ret += "\n";
                }
            }else{
                ret += "\n\n\n";
            }
        }
        
        return ret;
    }
    public ArrayList<ArrayList<Integer>> make_integer_map(){
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        
        //map[0] = new ArrayList<>()
        map.add(new ArrayList<>());
        
        int i = 0;
        for(i=0;i<links.size();i++){
            if((Boolean)links.get(i).get(2) == false){
                Boolean found = false;
                int x = 0;
                for(x=0;x<map.size();x++){
                    int y = 0;
                    if(map.get(x) != null){
                        for(y=0;y<map.get(x).size();y++){
                            if(map.get(x).get(y) == links.get(i).get(0)){
                                found = true;
                                break;
                            }
                        }
                    }
                    if(found) break;
                }
                                    
                Boolean found2 = false;
                int x2 = 0;
                for(x2=0;x2<map.size();x2++){
                    int y2 = 0;
                    if(map.get(x2) != null){
                        for(y2=0;y2<map.get(x2).size();y2++){
                            if(map.get(x2).get(y2) == links.get(i).get(1)){
                                found2 = true;
                                break;
                            }
                        }
                    }
                    if(found2) break;
                }
                
                if(!found && !found2){
                    int[] temp = areas.get((Integer)links.get(i).get(0)).get_offset_by_name((String)links.get(i).get(3));
                    
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    //should find empty space... 
                    int max_existing_y = 0;
                    for(x=0;x<map.size();x++){
                        if(map.get(x).size()>max_existing_y)max_existing_y=map.get(x).size();
                    }
                    
                    x=0;
                    int y=0;
                    if(x+temp[0] < 0)x++;
                    if(y + temp[1] < 0)y++;
                    while(x >= map.size())map.add(new ArrayList<>());
                    if(map.get(x) == null) map.set(x, new ArrayList<>());//map.get(x) = new Array()
                    while(x+temp[0] >= map.size())map.add(new ArrayList<>());
                    if(map.get(x+temp[0]) == null) map.set(x+temp[0], new ArrayList<>());//map.get(x+temp[0]) = new Array()
                    
                    while(y >= map.get(x).size())map.get(x).add(null);
                    while(y >= map.get(x+temp[0]).size())map.get(x+temp[0]).add(null);
                    while(y + temp[1] >= map.get(x).size())map.get(x).add(null);
                    while(y + temp[1] >= map.get(x+temp[0]).size())map.get(x+temp[0]).add(null);
                    
                    while(map.get(x + temp[0]).get(y + temp[1]) != null || map.get(x).get(y) != null || (temp[0] != 0 && temp[1] != 0 && map.get(x+temp[0]) != null && map.get(x+temp[0]).get(y) != null && map.get(x).get(y+temp[1]) != null)){
                        if(y < max_existing_y+1){
                            y++;
                        }else{
                            x++;
                            y = 0;
                        }
                        if(y + temp[1] < 0)y++;
                        
                        while(x >= map.size())map.add(new ArrayList<>());
                        if(map.get(x) == null) map.set(x, new ArrayList<>());//map.get(x) = new Array()
                        while(x+temp[0] >= map.size())map.add(new ArrayList<>());
                        if(map.get(x+temp[0]) == null) map.set(x+temp[0], new ArrayList<>());//map.get(x+temp[0]) = new Array()
                        
                        while(y >= map.get(x).size())map.get(x).add(null);
                        while(y >= map.get(x+temp[0]).size())map.get(x+temp[0]).add(null);
                        while(y + temp[1] >= map.get(x).size())map.get(x).add(null);
                        while(y + temp[1] >= map.get(x+temp[0]).size())map.get(x+temp[0]).add(null);
                    }
                    
                    if(map.get(x) == null) map.set(x, new ArrayList<>());//map.get(x) = new Array()
                    if(map.get(x+temp[0]) == null) map.set(x+temp[0], new ArrayList<>());//map.get(x+temp[0]) = new Array()
                    
                    //should be checking if the exit makes an overpass...
                    if(temp[0] != 0 && temp[1] != 0 && map.get(x+temp[0]) != null && map.get(x+temp[0]).get(y) != null && map.get(x).get(y+temp[1]) != null){
                        LOGGER.info("Should be checking for an overpasss exit... pretty sure I found one. Skipping placement. ");
                    }else{
                        if(map.get(x).get(y) != null && !map.get(x).get(y).equals((Integer)links.get(i).get(0)))LOGGER.info("(World.make_integer_map1.1)Overwriting an area...");
                        map.get(x).set(y, (Integer)links.get(i).get(0));//map.get(x).get(y) = links.get(i).get(0)
                        map.get(x+temp[0]).set(y+temp[1],(Integer)links.get(i).get(1));//map.get(x+temp[0])[y+temp[1]] = links.get(i)[1]
                    }
                }else if(found){
                    int[] temp = areas.get((Integer)links.get(i).get(0)).get_offset_by_name((String)links.get(i).get(3));
                    int y = 0;//TODO check this is intended
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    
                    if(x + temp[0] < 0 || y + temp[1] < 0){
                        if(x + temp[0] < 0){
                            //int count = map.size()
                            map.add(0,null);//map[0] = null
                            x++;
                        }
                        
                        if(y + temp[1] < 0){
                            int count = 0;
                            for(count=0;count<map.size();count++){
                                if(map.get(count) != null){
                                    map.get(count).add(0,null);//map[count][0] = null
                                    
                                }
                            }
                            y++;
                        }
                    }
                    
                    while(x+temp[0] >= map.size())map.add(new ArrayList<>());
                    if(map.get(x+temp[0]) == null) map.set(x+temp[0], new ArrayList<>());
                    while(y+temp[1] >= map.get(x+temp[0]).size())map.get(x+temp[0]).add(null);
                    if(map.get(x+temp[0]).get(y+temp[1]) != null && !map.get(x+temp[0]).get(y+temp[1]).equals((Integer)links.get(i).get(1)))LOGGER.info("(World.make_integer_map2)Overwriting an area...");
                    map.get(x+temp[0]).set(y+temp[1], (Integer)links.get(i).get(1));
                    
                }else if(found2){
                    int[] temp = areas.get((Integer)links.get(i).get(1)).get_offset_by_name((String)links.get(i).get(4));
                    int y2 = 0;//TODO confirm!
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    
                    if(x2 + temp[0] < 0 || y2 + temp[1] < 0){
                        if(x2 + temp[0] < 0){
                            
                            for(int count= map.size();count>0;count--){
                                map.set(count, map.get(count-1));//map[count] = map[count - 1]
                            }
                            map.set(0,null);//map[0] = null
                            
                            //map.remove(map.size()-1)
                            //map.add(0,null)//TODO VERIFY!!!
                            x2++;
                        }
                        
                        if(y2 + temp[1] < 0){
                            int count = 0;
                            for(count=0;count<map.size();count++){
                                if(map.get(count) != null){
                                    //int count2 = map.get(count).size()
                                    for(int count2= map.get(count).size();count2>0;count2--){
                                        map.get(count).set(count2, map.get(count).get(count2 - 1));//map[count][count2] = map[count][count2 - 1]
                                    }
                                    map.get(count).set(0, null);//map[count][0] = null
                                    
                                }
                            }
                            y2++;
                        }
                    }
                    
                    if(map.get(x2+temp[0]) == null) map.set(x2+temp[0], new ArrayList<>());
                    if(map.get(x2+temp[0]).get(y2+temp[1]) != null)LOGGER.info("(World.make_integer_map3)Overwriting an area...");
                    map.get(x2+temp[0]).set(y2+temp[1], (Integer)links.get(i).get(0));
                    
                }
            }
        }
        
        return map;
    }
    
    public void add_area(Area a){
        a.world = this;
        a.set_id(areas.size());
        areas.add(a); //areas[areas.length] = a
        //a.trimNullEdges();//remove_empty_edges()
        //a.check_connections();
    }
    public void connect_areas(int i,int k,Room r1,Room r2){
        connect_areas(i, k, r1, r2,false,false);
    }
    public void connect_areas(int i,int k,Room r1,Room r2,Boolean sub_area_flag){
        connect_areas(i, k, r1, r2, sub_area_flag,false);
    }
    public void connect_areas(int i,int k,Room r1,Room r2,Boolean sub_area_flag,Boolean stay_in_edges){
        //def r1=null, r2=null, sub_area_flag=false, stay_in_edges = false
        Room temp_room1 = null;
        Room temp_room2 = null;
        int count;
        for(count=0;count<links.size();count++){
            if(((Integer)links.get(count).get(0) == i  && (Integer)links.get(count).get(1) == k) || ((Integer)links.get(count).get(0) == k  && (Integer)links.get(count).get(1) == i))return;
        }
        
        if ( i >= 0 && k >= 0 && k < areas.size() && i < areas.size()){
            if(r1 == null) r1 = areas.get(i).get_connect_room();
            if(r2 == null) r2 = areas.get(k).get_connect_room();
            
            if(r1 != null && r1.area != areas.get(i)){
                //want to find an edge room to connect this one to....
                temp_room1 = r1;
                r1 = null;
            }
            if(r2 != null && r2.area != areas.get(k)){
                temp_room2 = r2;
                r2 = null;
            }
            
            if (r1 == null && r2 == null && !sub_area_flag){
                r1 = areas.get(i).get_edge_room(stay_in_edges);
                r2 = areas.get(k).get_edge_room(stay_in_edges);
                
                if(!make_area_exit_match(areas.get(i), areas.get(k), r1, r2,false,stay_in_edges)){
                    ArrayList<Room> area_room_list = areas.get(k).get_edge_rooms(0,stay_in_edges);
                    ArrayList<Room>  area_room_list2 = areas.get(i).get_edge_rooms(0,stay_in_edges);
                    
                    //chance didn't work... brute force!
                    ArrayList<String>  area_exit_list = new ArrayList<>();
                    ArrayList<String>  area_exit_list2 = new ArrayList<>();
                    
                    for(count=0;count<area_room_list.size();count++){
                        r2 = area_room_list.get(count);
                        area_exit_list.addAll(remove_existing_edge_exit(get_edge_exits(areas.get(k),r2), areas.get(k), sub_area_flag));
                        int count2 = 0;//above/below addAlls were a = a.concat
                        for(count2=0;count2<area_room_list2.size();count2++){
                            r1 = area_room_list2.get(count2);
                            area_exit_list2.addAll(remove_existing_edge_exit(get_edge_exits(areas.get(i),r1), areas.get(i), sub_area_flag));
                            if(make_area_exit_match(areas.get(i), areas.get(k), r1, r2,false,stay_in_edges)){
                                if(temp_room1 != null){
                                    inject_edge_room(areas.get(i), r1, r2, temp_room1);
                                    r1 = temp_room1;
                                }
                                if(temp_room2 != null){
                                    inject_edge_room(areas.get(k), r2, r1, temp_room2);
                                    r2 = temp_room2;
                                }
                                already_tried_area = new ArrayList<>();
                                if(r1.get_exit_id(r2) >= 0 && r2.get_exit_id(r1) >= 0){//TODO note this is how links are set!
                                    links.add(new ArrayList<Object>(Arrays.asList(i,k,sub_area_flag, r1.exit_names.get(r1.get_exit_id(r2)), r2.exit_names.get(r2.get_exit_id(r1)))));//links[links.length] = [i,k,sub_area_flag, r1.exit_names[r1.get_exit_id(r2)], r2.exit_names[r2.get_exit_id(r1)]]
                                }else{
                                    Boolean made = false;
                                    int count3 = 0;
                                    for(count3=0;count3<r1.exits.size();count3++){
                                        if(r1.exits.get(count3).area == r2.area){
                                            made = true;
                                            //links[links.length] = [i,k,sub_area_flag, r1.exit_names[count3], r1.exits[count3].exit_names[r1.exits[count3].get_exit_id(r1)] ]
                                            links.add(new ArrayList<>(Arrays.asList(i,k,sub_area_flag, r1.exit_names.get(count3), r1.exits.get(count3).exit_names.get(r1.exits.get(count3).get_exit_id(r1)))));
                                            break;
                                        }
                                    }
                                    if(!made){
                                        for(count3=0;count3<r2.exits.size();count3++){
                                            if(r2.exits.get(count3).area == r1.area){
                                                //links[links.length] = [i,k,sub_area_flag,  r2.exits[count3].exit_names[r2.exits[count3].get_exit_id(r2)] , r2.exit_names[count3] ]
                                                links.add(new ArrayList<>(Arrays.asList(i,k,sub_area_flag,  r2.exits.get(count3).exit_names.get(r2.exits.get(count3).get_exit_id(r2)) , r2.exit_names.get(count3))));
                                                break;
                                            }
                                        }
                                    }
                                    if(!made)LOGGER.info("(World.connect_areas)Got me two over-world areas that are connected, but two rooms that aren't. Not sure what to do about this.");
                                }
                                return;
                            }
                        }
                    }
                    
                    if(!stay_in_edges){
                        LOGGER.info("Buggrip, failed to connect areas " + areas.get(i).description + " to " + areas.get(k).description);
                        LOGGER.info("Despite " + area_room_list2.size() + " rooms to choose from in " + areas.get(i).description + " and a further " + area_room_list.size() + " in " + areas.get(k).description);
                        LOGGER.info("Un-used exits in " + areas.get(i).description + ": " + area_exit_list2);
                        LOGGER.info("Un-used exits in " + areas.get(k).description + ": " + area_exit_list);
                        LOGGER.info("changing what area i'm connecting to.");
                    }
                    int found_area_id = -1;
                    int connect_area_id = -1;
                    int link_area_id = -1;
                    for(count=0;count<links.size();count++){
                        if(!(Boolean)links.get(count).get(2)){
                            if((Integer)links.get(count).get(0) == i || (Integer)links.get(count).get(1) == i){
                                if(found_area_id >= 0 && found_area_id != i){
                                    found_area_id = -1;
                                    break;
                                }else{
                                    found_area_id = i;
                                    connect_area_id = k;
                                }
                            }else if((Integer)links.get(count).get(0) == k || (Integer)links.get(count).get(1) == k){
                                if(found_area_id >= 0 && found_area_id != k){
                                    found_area_id = -1;
                                    break;
                                }else{
                                    found_area_id = k;
                                    connect_area_id = i;
                                }
                            }
                            if((Integer)links.get(count).get(0) == found_area_id){
                                link_area_id = (Integer)links.get(count).get(1);
                            }else if(found_area_id >= 0){
                                link_area_id = (Integer)links.get(count).get(0);
                            }	
                        }							
                    }
                    
                    if(found_area_id >= 0){
                        already_tried_area.add(found_area_id);//already_tried_area[already_tried_area.length] = found_area_id
                        if(!already_tried_check(link_area_id))connect_areas(link_area_id,connect_area_id,null,null,false,stay_in_edges);							
                    }else{
                        LOGGER.info("doesn't look like that'll work out though.");
                    }
                    
                    return;
                }
            }else {
                if(sub_area_flag){
                    //try and get an edge room for the sub-area... a random room is fine for the overworld area.
                    
                    //need to figure out which area is the sub-area, and if both areas are sub-areas, and I should be doing trying an edge to edge exit
                    ArrayList<ArrayList<Integer>> map = make_integer_map();
                    Boolean found1 = false;
                    Boolean found2 = false;
                    int x = 0;
                    for(x=0;x<map.size();x++){
                        int y = 0;
                        if(map.get(x) != null){
                            for(y=0;y<map.get(x).size();y++){
                                if(map.get(x).get(y) != null && map.get(x).get(y) == i){
                                    found1 = true;
                                }
                                if(map.get(x).get(y) != null && map.get(x).get(y) == k){
                                    found2 = true;
                                }
                                if(found1 && found2)break;
                            }
                        }
                        if(found1 && found2)break;
                    }
                    
                    if(found1 && r2 == null){
                        r2 = areas.get(k).get_edge_room();//need to limit to exits that are towards the maps edge...
                    }
                    if(found2 && r1 == null){
                        r1 = areas.get(i).get_edge_room();//need to limit to exits that are towards the maps edge...
                    }
                    if(!found1 && !found2){
                        if(r2 == null)r2 = areas.get(k).get_edge_room();
                        if(r1 == null)r1 = areas.get(i).get_edge_room();
                    }
                }
                //Figure out the directions for the exits
                if(r1 == null || r2 == null){
                    ArrayList<String> temp_exits;
                    Boolean made = false;
                    if(r2 == null){
                        r2 = areas.get(k).get_random_room(true);
                        if(r1 != null){
                            temp_exits = get_edge_exits(areas.get(i),r1);
                            for(count=0;count<temp_exits.size();count++){
                                if(r2.new_exit(r1, neg_direction(temp_exits.get(count))) >= 0){
                                    made = true;
                                    r1.new_exit(r2, temp_exits.get(count));
                                    break;
                                }
                            }
                            if(!made){
                                connect_areas(i,k, r1, null, sub_area_flag, stay_in_edges);
                                return;							
                            }
                        }
                    }
                    if(r1 == null){
                        r1 = areas.get(i).get_random_room(true);
                        temp_exits = get_edge_exits(areas.get(k),r2);
                        for(count=0;count<temp_exits.size();count++){
                            if(r1.new_exit(r2, neg_direction(temp_exits.get(count))) >= 0){
                                made = true;
                                r2.new_exit(r1, temp_exits.get(count));
                                break;
                            }
                        }
                        if(!made){
                            connect_areas(i,k, null, r2, sub_area_flag, stay_in_edges);
                            return;							
                        }
                    }
                }else{
                    if(r1.new_exit(r2) < 0)LOGGER.info("(World.connect_areas)Just failed to connect areas " + areas.get(i).description + " to " + areas.get(k).description);
                }					
            }
            
            if(temp_room1 != null){
                inject_edge_room(areas.get(i), r1, r2, temp_room1);
                r1 = temp_room1;
            }
            if(temp_room2 != null){
                inject_edge_room(areas.get(k), r2, r1, temp_room2);
                r2 = temp_room2;
            }
            already_tried_area = new ArrayList<>();
            if(r1.get_exit_id(r2) >= 0 && r2.get_exit_id(r1) >= 0){
                //links[links.length] = [i,k,sub_area_flag, r1.exit_names[r1.get_exit_id(r2)], r2.exit_names[r2.get_exit_id(r1)]]
                links.add(new ArrayList<>(Arrays.asList(i,k,sub_area_flag, r1.exit_names.get(r1.get_exit_id(r2)), r2.exit_names.get(r2.get_exit_id(r1)))));
            }else{
                Boolean made = false;
                int count3 = 0;
                for(count3=0;count3<r1.exits.size();count3++){
                    if(r1.exits.get(count3).area == r2.area){
                        made = true;
                        //links[links.length] = [i,k,sub_area_flag, r1.exit_names[count3], r1.exits[count3].exit_names[r1.exits[count3].get_exit_id(r1)] ]
                        links.add(new ArrayList<>(Arrays.asList(i,k,sub_area_flag, r1.exit_names.get(count3), r1.exits.get(count3).exit_names.get(r1.exits.get(count3).get_exit_id(r1)) )));
                        break;
                    }
                }
                if(!made){
                    for(count3=0;count3<r2.exits.size();count3++){
                        if(r2.exits.get(count3).area == r1.area){
                            //links[links.length] = [i,k,sub_area_flag,  r2.exits[count3].exit_names[r2.exits[count3].get_exit_id(r2)] , r2.exit_names[count3] ];
                            links.add(new ArrayList<>(Arrays.asList(i,k,sub_area_flag,  r2.exits.get(count3).exit_names.get(r2.exits.get(count3).get_exit_id(r2)) , r2.exit_names.get(count3))));
                            break;
                        }
                    }
                }
                if(!made)LOGGER.info("(World.connect_areas)Got me two areas that are connected, but two rooms that aren't. Not sure what to do about this.");
            }			
        }
    }
    
    private Boolean already_tried_check(int area_id){
        Boolean ret = false;
        int count = 0;
        for(count=0;count<already_tried_area.size();count++){
            if(already_tried_area.get(count).equals(area_id)){
                ret = true;
                break;
            }
        }
        
        return ret;
    }
    
    public void inject_edge_room(Area area,Room orig_room,Room cnt_room,Room new_room){
        int[] temp = area.find_room(orig_room);//Array
        String temp_exit = orig_room.exit_names.get(orig_room.get_exit_id(cnt_room));
        String temp_exit2 = cnt_room.exit_names.get(cnt_room.get_exit_id(orig_room));
        orig_room.remove_exit(cnt_room);
        cnt_room.remove_exit(orig_room);
        orig_room.new_exit(new_room,temp_exit);
        new_room.new_exit(orig_room,temp_exit2);
        area.existing_exit_add(orig_room,null,temp[0],temp[1],temp[2],"");
        new_room.new_exit(cnt_room,temp_exit);
        cnt_room.new_exit(new_room,temp_exit2);
    }
    
    public ArrayList<String> remove_existing_edge_exit(ArrayList<String> exit_list,Area area,Boolean sub_area_flag){
        //def false
        int area_id = 0;
        for(area_id=0;area_id<areas.size();area_id++){
            if(areas.get(area_id) == area) break;
        }
        
        ArrayList<String> existing_exits = new ArrayList<>();
        int i = 0;
        for(i=0;i<links.size();i++){
            if(((Integer)links.get(i).get(0) == area_id || (Integer)links.get(i).get(1) == area_id) && (Boolean)links.get(i).get(2) == false){
                if((Integer)links.get(i).get(0) == area_id){
                    //existing_exits[existing_exits.length] = (String)links.get(i).get(3)
                    existing_exits.add((String)links.get(i).get(3));
                }else{
                    //existing_exits[existing_exits.length] = (String)links.get(i).get(4)
                    existing_exits.add((String)links.get(i).get(4));
                }
            }
        }
        
        for(i=0;i<existing_exits.size();i++){
            int j = 0;
            for(j=0;j<exit_list.size();j++){
                if(existing_exits.get(i).equals(exit_list.get(j))){
                    //exit_list = exit_list.slice(0,j).concat(exit_list.slice(j+1, exit_list.length))
                    exit_list.remove(j);
                    break;
                }
            }
        }
        
        if(!sub_area_flag){
            ArrayList<ArrayList<Integer>> map = make_integer_map();
            //find the area on the map
            Boolean found = false;
            int j = 0;
            for(i=0;i<map.size();i++){
                for(j=0;j<map.get(i).size();j++){
                    if(map.get(i).get(j) != null && map.get(i).get(j) == area_id){
                        found = true;
                        break;
                    }
                }
                if(found)break;
            }
            
            if(found){
                //check if any of the exits are populated on the map...
                int k = 0;
                for(k=0;k<exit_list.size();k++){
                    int[] temp = area.get_offset_by_name(exit_list.get(k));
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    
                    Boolean remove_exit = false;
                    
                    //need to check if we're making an over-pass exit here too...
                    if(temp[0] != 0 && temp[1] != 0){
                        if(i+temp[0] >= 0 && j+temp[1] >= 0 
                        && i+temp[0] < map.size() && i < map.size()
                        && j+temp[1] < map.get(i).size() && j < map.get(i+temp[0]).size()
                        && map.get(i+temp[0]) != null 
                        && map.get(i+temp[0]).get(j) != null 
                        && map.get(i).get(j+temp[1]) != null){
                            int link_count = 0;
                            for(link_count=0;link_count<links.size();link_count++){
                                if((((Integer)links.get(link_count).get(0)).equals(map.get(i+temp[0]).get(j)) && ((Integer)links.get(link_count).get(1)).equals(map.get(i).get(j+temp[1]))) ||
                                 (((Integer)links.get(link_count).get(1)).equals(map.get(i+temp[0]).get(j)) && ((Integer)links.get(link_count).get(0)).equals(map.get(i).get(j+temp[1])))){
                                    remove_exit = true;
                                }
                            }
                        }
                    }
                    
                    if(!remove_exit){
                        if(i+temp[0] >= 0 && i+temp[0] < map.size() && map.get(i+temp[0]) != null){
                            if(j+temp[1] >= 0 && j+temp[1] < map.get(i+temp[0]).size() && map.get(i+temp[0]).get(j+temp[1]) != null){
                                remove_exit = true;
                            }
                        }
                    }
                    
                    if(remove_exit){
                        //exit_list = exit_list.slice(0,k).concat(exit_list.slice(k+1, exit_list.length))
                        exit_list.remove(k);
                        k--;
                    }
                }
            }
        }
        return exit_list;			
    }
    
    public Boolean make_area_exit_match(Area a1,Area a2,Room r1,Room r2,Boolean sub_area_flag,Boolean stay_in_edges){
        //def false, false
        Boolean found = false;
        ArrayList<String> r1_avail_exit = get_edge_exits(a1, r1);
        ArrayList<String> r2_avail_exit = get_edge_exits(a2, r2);
        
        ArrayList<ArrayList<Integer>> map = make_integer_map();
        int max_y = 0;
        int x = 0;
        for(x=0;x<map.size();x++){
            if(map.get(x).size() > max_y)max_y = map.get(x).size();
        }
        
        int[] a1_location = null;
        int[] a2_location = null;
        for(x=0;x<map.size();x++){
            int y = 0;
            if(map.get(x) != null){
                for(y=0;y<map.get(x).size();y++){
                    if(map.get(x).get(y) != null && areas.get(map.get(x).get(y)) == a1){
                        a1_location = new int[]{x,y};
                    }
                    if(map.get(x).get(y) != null && areas.get(map.get(x).get(y)) == a2){
                        a2_location = new int[]{x,y};
                    }
                    if(a1_location != null && a2_location != null)break;
                }
            }
            if(a1_location != null && a2_location != null)break;
        }
        
        if(a1_location != null && a2_location != null){
            if(r1_avail_exit.indexOf(Area.get_direction(a1_location[0], a2_location[1], 0, a2_location[0], a1_location[1], 0)) >= 0 && r2_avail_exit.indexOf(Area.get_direction(a2_location[0], a1_location[1], 0, a1_location[0], a2_location[1], 0)) >= 0){ 
                if(stay_in_edges && !a1.description.equals(a2.description)){
                    ocean_spread(r1, Area.get_direction(a1_location[0], a2_location[1], 0, a2_location[0], a1_location[1], 0), r2, Area.get_direction(a2_location[0], a1_location[1], 0, a1_location[0], a2_location[1], 0));
                }else{
                    r1.new_exit(r2, Area.get_direction(a1_location[0], a2_location[1], 0, a2_location[0], a1_location[1], 0));
                    r2.new_exit(r1, Area.get_direction(a2_location[0], a1_location[1], 0, a1_location[0], a2_location[1], 0));
                    
                }
                found = true;
            }
            return found;
        }
        
        //remove existing edge exits
        r1_avail_exit = remove_existing_edge_exit(r1_avail_exit, a1, sub_area_flag);
        r2_avail_exit = remove_existing_edge_exit(r2_avail_exit, a2, sub_area_flag);
                    
        //need to find matching (east/west,north/south, etc.) exit pair
        ArrayList<String> dir_list = new ArrayList<>(Arrays.asList("North", "East", "West", "North-East", "North-West", "South-West",  "South-East", "South"));
        ArrayList<String> not_dir_list = new ArrayList<>(Arrays.asList("South", "West", "East", "South-West", "South-East", "North-East", "North-West", "North"));
        int count = 0;
        for(count=0;count<r1_avail_exit.size();count++){
            int count2 = 0;
            for(count2=0;count2<dir_list.size();count2++){
                if(r1_avail_exit.get(count).equals(dir_list.get(count2))){
                    int count3 = 0;
                    for(count3=0;count3<r2_avail_exit.size();count3++){
                        if(r2_avail_exit.get(count3).equals(not_dir_list.get(count2))){
                            if(stay_in_edges){
                                Boolean map_found = false;
                                for(x=0;x<map.size();x++){
                                    int y = 0;
                                    for(y=0;y<map.get(x).size();y++){
                                        if(map.get(x).get(y) == a1.id || map.get(x).get(y) == a2.id){
                                            String dir_from_placed = "";
                                            int spread_area = -1;
                                            if(map.get(x).get(y) == a1.id){
                                                dir_from_placed = not_dir_list.get(count2);
                                                spread_area = a2.id;													
                                            }else{
                                                dir_from_placed = dir_list.get(count2);
                                                spread_area = a1.id;													
                                            }
                                            if(dir_from_placed.equals("North")){
                                                if(x+1 < map.size())found = true;
                                            }else if(dir_from_placed.equals("North-West")){
                                                if(x+1 < map.size() && y+1 < max_y)found = true;
                                            }else if(dir_from_placed.equals("North-East")){
                                                if(x+1 < map.size() && y-1 >= 0)found = true;
                                            }else if(dir_from_placed.equals("South-East")){
                                                if(x-1 >= 0 && y-1 >= 0)found = true;
                                            }else if(dir_from_placed.equals("South-West")){
                                                if(x-1 >= 0 && y+1 < max_y)found = true;
                                            }else if(dir_from_placed.equals("East")){
                                                if(y-1 >= 0)found = true;
                                            }else if(dir_from_placed.equals("West")){
                                                if(y+1 < max_y)found = true;
                                            }else if(dir_from_placed.equals("South")){
                                                if(x-1 >= 0 )found = true;
                                            }
                                            if(found){
                                                if(areas.get(spread_area).fillerTemplate.get(0) != null && !a1.description.equals(a2.description)){
                                                    if(spread_area == a1.id){
                                                        ocean_spread(r1, dir_list.get(count2), r2, not_dir_list.get(count2));
                                                    }else if(spread_area == a2.id){
                                                        ocean_spread(r2, not_dir_list.get(count2), r1, dir_list.get(count2));
                                                    }														
                                                }else{
                                                    r1.new_exit(r2, dir_list.get(count2));
                                                    r2.new_exit(r1, not_dir_list.get(count2));
                                                }
                                                
                                            }
                                            map_found = true;
                                            break;
                                        }
                                    }
                                    if(map_found)break;
                                }									
                            }else{
                                found = true;
                                r1.new_exit(r2, dir_list.get(count2));
                                r2.new_exit(r1, not_dir_list.get(count2));
                                break;
                            }
                        }
                    }
                    if(found)break;
                }
            }
            if(found)break;
        }
        
        return found;
    }
    public ArrayList<String> get_edge_exits(Area a,Room r){
        return get_edge_exits(a, r,0);
    }
    public ArrayList<String> get_edge_exits(Area a,Room r,int indent){//def 0
        ArrayList<String> arr = new ArrayList<>();
        int[] temp_loc = a.find_room(r);
        
        if(temp_loc == null)return arr;
        
        int x = temp_loc[0];
        int y = temp_loc[1];
        int z = temp_loc[2];
        int max_y= 0;
        int count = 0;
        for(count=0;count<a.rooms.size();count++){
            if(a.rooms.get(count).size() - 1 >= max_y) max_y = a.rooms.get(count).size() - 1;
        }
        
        if((x + indent) + 1 >= a.rooms.size()){// .add was arr[arr.length] for all these
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, temp_loc[1], temp_loc[2]));
        }
        if((x - indent)-1<0){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, temp_loc[1], temp_loc[2]));
        }
        if((y + indent)+1 > max_y){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], temp_loc[0], y+1, temp_loc[2]));
        }
        if((y - indent)-1<0){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], temp_loc[0], y-1, temp_loc[2]));
        }
         
        if((x + indent) + 1 >= a.rooms.size()){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y + 1, temp_loc[2]));
        }else if((x - indent)-1<0){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y + 1, temp_loc[2]));
        }else if(a.rooms.get((x + indent) + 1) != null && (y + indent)+1 >= max_y ){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y + 1, temp_loc[2]));
        }else if((x - indent)-1>=0 && (y + indent)+1 >= max_y){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y + 1, temp_loc[2]));
        }

        if((x + indent) + 1 >= a.rooms.size()){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y - 1, temp_loc[2]));
        }else if((x - indent)-1<0){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y - 1, temp_loc[2]));
        }else if(a.rooms.get((x + indent) + 1) != null && (y - indent)-1<0){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y - 1, temp_loc[2]));
        }else if((x - indent)-1>=0 && (y - indent)-1<0){
            arr.add(Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y - 1, temp_loc[2]));
        }
        
        //check to make sure the exits don't already exist on our room
        if(r.exit_names != null){
            int i = 0;
            for(i=0;i<r.exit_names.size();i++){
                int j = 0;
                for(j=0;j<arr.size();j++){
                    if(r.exit_names.get(i).equals(arr.get(j))){
                        //suspicious... 
                        //arr = arr.slice(0,j).concat(arr.slice(j+1,arr.length))
                        arr.remove(j);
                        break;
                    }
                }
                if(arr.size() <= 0)break;
            }
        }
        
        if(arr.size() < 1){
            if(indent > 1){
                LOGGER.info("(World)indent already tried while search for available edge exits... heading for failure.");
            }else{
                return get_edge_exits(a, r, indent + 1);
            }
        }
        
        return arr;
    }
    
    private void ocean_connect(ArrayList<ArrayList<Integer>> map,Area temp_ocean,int old_x,int old_y,int new_x,int new_y){
        if(map.get(new_x).get(old_y) != null && map.get(old_x).get(new_y) != null && 
            !areas.get(map.get(new_x).get(old_y)).description.equals(temp_ocean.description) &&
            !areas.get(map.get(old_x).get(new_y)).description.equals(temp_ocean.description)){
            //if these two areas are connected, I should do nothing
            int count = 0;
            for(count=0;count<links.size();count++){
                if((links.get(count).get(0) == map.get(new_x).get(old_y)  && ((Integer)links.get(count).get(1)).equals(map.get(old_x).get(new_y))) || 
                (links.get(count).get(0) == map.get(old_x).get(new_y)  && ((Integer)links.get(count).get(1)).equals(map.get(new_x).get(old_y)))){
                    break;
                }
            }
            if(count>=links.size())connect_areas(areas.size() - 1,map.get(new_x).get(new_y),null,null,false,true);
        }else{
            connect_areas(areas.size() - 1,map.get(new_x).get(new_y),null,null,false,true);
        }
    }
    
    private void ocean_spread(Room r1,String r1_connect_dir,Room r2,String r2_connect_dir){
        int[] room_loc;//Array()
        Room new_room = r1.area.fillerTemplate.get(0).make_room();
        new_room.area = r2.area;
        new_room.set_id(r2.area.room_list.size());			
        new_room.new_exit(r1, r2_connect_dir);
        Boolean no_spread = false;
        Boolean placed = false;
        Area spread_to_area = r2.area;
        int count = 0;			
        int max_y = 0;
        for(count=0;count<spread_to_area.rooms.size();count++){
            if(spread_to_area.rooms.get(count).size() > max_y)max_y = spread_to_area.rooms.get(count).size();
        }
        max_y--;
        
        room_loc = spread_to_area.find_room(r2);
        if(r2_connect_dir.equals("North") || r2_connect_dir.equals("South")){
            //should move east or west to find the location
            count = 1;
            while(!placed){
                if(room_loc[1]+count<=max_y && (spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count) == null || spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).get(room_loc[2]) == null)){
                    if(spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count) == null)spread_to_area.rooms.get(room_loc[0]).set(room_loc[1]+count, new ArrayList<>());//spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count) = new Array()
                    //spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]] = new_room
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).set(room_loc[2], new_room);
                    //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                    spread_to_area.room_list.add(new_room);
                    placed = true;
                }else if(room_loc[1]-count>=0 && (spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count) == null || spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).get(room_loc[2]) == null)){
                    if(spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count) == null)spread_to_area.rooms.get(room_loc[0]).set(room_loc[1]-count,new ArrayList<>());//spread_to_area.rooms[room_loc[0]][room_loc[1]-count] = new Array()
                    //spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]] = new_room
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).set(room_loc[2], new_room);
                    //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                    spread_to_area.room_list.add(new_room);
                    placed = true;
                }else if((room_loc[1]+count<=max_y && spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).get(room_loc[2]) != null) || (room_loc[1]-count>=0 && spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).get(room_loc[2]) != null)){
                    if(room_loc[1]-count>=0 && spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count) != null && 
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).get(room_loc[2]) != null && 
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).get(room_loc[2]).template != null && 
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                        new_room = spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]-count).get(room_loc[2]);
                        no_spread = true;
                        placed = true;
                    }else if(room_loc[1]+count<=max_y && spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count) != null && 
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).get(room_loc[2]) != null && 
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).get(room_loc[2]).template != null && 
                    spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                        new_room = spread_to_area.rooms.get(room_loc[0]).get(room_loc[1]+count).get(room_loc[2]);
                        no_spread = true;
                        placed = true;
                    }
                }
                count++;
            }
        }else if(r2_connect_dir.equals("West") || r2_connect_dir.equals("East")){
            //should move north or south to find the location
            count = 1;
            while(!placed){
                if(spread_to_area.rooms.get(room_loc[0]+count) != null && (spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]) == null || spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]) == null)){
                    if(spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]) == null)spread_to_area.rooms.get(room_loc[0]+count).set(room_loc[1], new ArrayList<>());//spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]) = new Array()
                    //spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]) = new_room
                    spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).set(room_loc[2], new_room);
                    //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                    spread_to_area.room_list.add(new_room);
                    placed = true;
                }else if(spread_to_area.rooms.get(room_loc[0]-count) != null && (spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]) == null || spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).get(room_loc[2]) == null)){
                    if(spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]) == null)spread_to_area.rooms.get(room_loc[0]-count).set(room_loc[1], new ArrayList<>());//spread_to_area.rooms[room_loc[0]-count][room_loc[1]] = new Array()
                    //spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]] = new_room
                    spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).set(room_loc[2], new_room);
                    //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                    spread_to_area.room_list.add(new_room);
                    placed = true;
                }else if((spread_to_area.rooms.get(room_loc[0]+count) != null && spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]) != null) || (spread_to_area.rooms.get(room_loc[0]-count) != null && spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).get(room_loc[2]) != null)){
                    if(spread_to_area.rooms.get(room_loc[0]+count) != null && spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]) != null && 
                    spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]).template != null && 
                    spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                        new_room = spread_to_area.rooms.get(room_loc[0]+count).get(room_loc[1]).get(room_loc[2]);
                        no_spread = true;
                        placed = true;
                    }else if(spread_to_area.rooms.get(room_loc[0]-count) != null && spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).get(room_loc[2]) != null &&
                     spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).get(room_loc[2]).template != null && 
                     spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                        new_room = spread_to_area.rooms.get(room_loc[0]-count).get(room_loc[1]).get(room_loc[2]);
                        no_spread = true;
                        placed = true;
                    }
                }
                count++;
            }
        }else{
            //get to your corner and move out from there...
            count = 0;
            if(r2_connect_dir.indexOf("North") >= 0){
                if(r2_connect_dir.indexOf("East") >= 0){
                    while(!placed){
                        if(spread_to_area.rooms.get(count).get(0) == null || spread_to_area.rooms.get(count).get(0).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(count).get(0) == null)spread_to_area.rooms.get(count).set(0, new ArrayList<>());//spread_to_area.rooms.get(count).get(0) = new Array()
                            //spread_to_area.rooms.get(count).get(0).get(room_loc[2]) = new_room
                            spread_to_area.room_list.add(new_room);//spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            placed = true;
                        }else if((spread_to_area.rooms.get(0).get(count) == null && count <= max_y) || spread_to_area.rooms.get(0).get(count).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(0).get(count) == null)spread_to_area.rooms.get(0).set(count, new ArrayList<>());//spread_to_area.rooms.get(0).get(count) = new Array()
                            //spread_to_area.rooms.get(0).get(count)[room_loc[2]] = new_room
                            spread_to_area.rooms.get(0).get(count).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            spread_to_area.room_list.add(new_room);
                            placed = true;
                        }else if((count < spread_to_area.rooms.size() && spread_to_area.rooms.get(count).get(0).get(room_loc[2]) != null) || (count <= max_y && spread_to_area.rooms.get(0).get(count).get(room_loc[2]) != null)){
                            if(count < spread_to_area.rooms.size() && spread_to_area.rooms.get(count).get(0).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(count).get(0).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(count).get(0).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(count).get(0).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }else if(count <= max_y && spread_to_area.rooms.get(0).get(count).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(0).get(count).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(0).get(count).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(0).get(count).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }								
                        }
                        count++;
                    }						
                }else{
                    while(!placed){
                        if(spread_to_area.rooms.get(count).get(max_y) == null || spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(count).get(max_y) == null)spread_to_area.rooms.get(count).set(max_y, new ArrayList<>());//spread_to_area.rooms[count][max_y] = new Array()
                            //spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]) = new_room
                            spread_to_area.rooms.get(count).get(max_y).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            spread_to_area.room_list.add(new_room);
                            placed = true;
                        }else if(count <= max_y && (spread_to_area.rooms.get(0).get(max_y-count) == null || spread_to_area.rooms.get(0).get(max_y-count).get(room_loc[2]) == null)){
                            if(spread_to_area.rooms.get(0).get(max_y-count) == null)spread_to_area.rooms.get(0).set(max_y-count, new ArrayList<>());//spread_to_area.rooms[0][max_y-count] = new Array()
                            //spread_to_area.rooms[0][max_y-count][room_loc[2]] = new_room
                            spread_to_area.rooms.get(0).get(max_y-count).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            spread_to_area.room_list.add(new_room);
                            placed = true;
                        }else if((count <= max_y && spread_to_area.rooms.get(0).get(max_y-count).get(room_loc[2]) != null)||(count < spread_to_area.rooms.size() && spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]) != null)){
                            if(count <= max_y && spread_to_area.rooms.get(0).get(max_y-count).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(0).get(max_y-count).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(0).get(max_y-count).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(0).get(max_y-count).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }else if(count < spread_to_area.rooms.size() && spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]) != null &&
                            spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(count).get(max_y).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }
                        }
                        count++;
                    }
                }
            }else{
                if(r2_connect_dir.indexOf("East") >= 0){
                    while(!placed){
                        if((count <= spread_to_area.rooms.size() - 1 && spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0) == null) || spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0) == null)spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).set(0, new ArrayList<>());//spread_to_area.rooms[spread_to_area.rooms.size()-1-count][0] = new Array()
                            //spread_to_area.rooms[spread_to_area.rooms.size()-1-count][0][room_loc[2]] = new_room
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            placed = true;
                        }else if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count) == null || spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count) == null)spread_to_area.rooms.get(spread_to_area.rooms.size()-1).set(count, new ArrayList<>());//spread_to_area.rooms[spread_to_area.rooms.size()-1][count] = new Array()
                            //spread_to_area.rooms[spread_to_area.rooms.size()-1][count][room_loc[2]] = new_room
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            
                            placed = true;
                        }else if((count <= spread_to_area.rooms.size() - 1 && spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).get(room_loc[2]) != null) || (count <= max_y && spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).get(room_loc[2]) != null)){
                            if(count <= spread_to_area.rooms.size() - 1 && spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(0).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }else if(count <= max_y && spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(count).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }
                        }
                        count++;
                    }
                }else{
                    while(!placed){
                        if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y) == null || spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y) == null)spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).set(max_y, new ArrayList<>());//spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count][max_y] = new Array()
                            //spread_to_area.rooms[spread_to_area.rooms.size()-1-count][max_y][room_loc[2]] = new_room
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            spread_to_area.room_list.add(new_room);
                            placed = true;
                        }else if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count) == null || spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).get(room_loc[2]) == null){
                            if(spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count) == null)spread_to_area.rooms.get(spread_to_area.rooms.size()-1).set(max_y-count, new ArrayList<>());//spread_to_area.rooms[spread_to_area.rooms.size()-1][max_y-count] = new Array()
                            //spread_to_area.rooms[spread_to_area.rooms.size()-1][max_y-count][room_loc[2]] = new_room
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).set(room_loc[2], new_room);
                            //spread_to_area.room_list[spread_to_area.room_list.length] = new_room
                            spread_to_area.room_list.add(new_room);
                            placed = true;
                        }else if((count >= spread_to_area.rooms.size()-1 && spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).get(room_loc[2]) != null) || (count <= max_y && spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).get(room_loc[2]) != null)){
                            if(count >= spread_to_area.rooms.size()-1 && spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(spread_to_area.rooms.size()-1-count).get(max_y).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }else if(count <= max_y && spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).get(room_loc[2]) != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).get(room_loc[2]).template != null && 
                            spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).get(room_loc[2]).template.description.equals(r1.area.fillerTemplate.get(0).description)){
                                new_room = spread_to_area.rooms.get(spread_to_area.rooms.size()-1).get(max_y-count).get(room_loc[2]);
                                no_spread = true;
                                placed = true;
                            }
                        }
                        count++;
                    }
                }
            }
        }
        r1.new_exit(new_room, r1_connect_dir);
        if(!no_spread){
            ocean_room_spread(new_room, spread_to_area,max_y,spread_to_area.find_room(new_room));
        }else{
            new_room.new_exit(r1, r2_connect_dir);
        }
    }
    
    private void ocean_existing_room_connect(Room spread_room,Room new_room,String to_path,String from_path){
        if(new_room.template == spread_room.template){
            spread_room.new_exit(new_room, from_path);
            new_room.new_exit(spread_room, to_path);
        }else if(spread_room.template.hidden_exit_action != null){
            Boolean good_exit = false;
            ArrayList<String> avail_exits = spread_room.template.get_avail_exits(new_room);
            int temp_str_count = 0;
            for(temp_str_count=0;temp_str_count<avail_exits.size();temp_str_count++){
                if(to_path.equals(avail_exits.get(temp_str_count))){
                    good_exit = true;
                    break;
                }
            }
            if (good_exit){
                if(spread_room.new_exit(new_room, from_path) != -1){
                    //add the hidden exit to the non-filler room
                    Area.generate_filler_exit_action(new_room, spread_room, to_path, spread_room.template.hidden_exit_action, spread_room.template.hidden_exit_challenge, spread_room.template.hidden_exit_consequence);
                }
            }
        }
    }
    
    private int ocean_room_spread(Room spread_room,Area spread_area,int max_y,int[] room_loc){
        return ocean_room_spread(spread_room, spread_area, max_y, room_loc,0);
    }
    private int ocean_room_spread(Room spread_room,Area spread_area,int max_y,int[] room_loc,int room_count){
        //def rom_cnt = 0
        //spread the ocean, and make the appropriate exits for each room			
        Room new_room;
        Boolean good_exit;
        ArrayList<String> avail_exits;
        int temp_str_count = 0;
        String to_path = "";
        String from_path = "";
        //ArrayList<String> temp_loc = new ArrayList<>();//was array, but trying this...
        int[] temp_loc = new int[3];//it is x-y-z coords after all
        if(room_count < Math.max(max_y/6,1) && room_loc[0]-1 >= 0 && spread_area.rooms.get(room_loc[0]-1) != null && (spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]) == null || spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]).get(room_loc[2]) == null)){
            if(spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]) == null)spread_area.rooms.get(room_loc[0]-1).set(room_loc[1],new ArrayList<>());//spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]) = new Array()
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.size());
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1],room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0]-1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            //spread_area.rooms.get(room_loc[0]-1][room_loc[1]][room_loc[2]] = new_room
            spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]).set(room_loc[2], new_room);
            spread_area.room_list.add(new_room);//spread_area.room_list[spread_area.room_list.size()] = new_room
            temp_loc[0] = room_loc[0] - 1;
            temp_loc[1] = room_loc[1];
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[0]-1 >= 0 && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]) != null && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]).get(room_loc[2]),Area.get_direction(room_loc[0]-1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1],room_loc[2]));
        }
        
        if(room_loc[0]-1 >= 0 && room_loc[1]-1 >= 0 && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]-1) != null && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]-1).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]-1).get(room_loc[2]),Area.get_direction(room_loc[0]-1,room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1]-1,room_loc[2]));				
        }
        
        if(room_count < Math.max(max_y/6,1) && room_loc[0]+1 < spread_area.rooms.size() && (spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]) == null || spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]).get(room_loc[2]) == null)){
            if(spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]) == null)spread_area.rooms.get(room_loc[0]+1).set(room_loc[1], new ArrayList<>());//spread_area.rooms[room_loc[0]+1][room_loc[1]] = new Array()
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.size());
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1],room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0]+1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            //spread_area.rooms[room_loc[0]+1][room_loc[1]][room_loc[2]] = new_room
            spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]).set(room_loc[2], new_room);
            spread_area.room_list.add(new_room);//spread_area.room_list[spread_area.room_list.size()] = new_room
            temp_loc[0] = room_loc[0] + 1;
            temp_loc[1] = room_loc[1];
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[0]+1 < spread_area.rooms.size() && spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]) != null && spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]).get(room_loc[2]),Area.get_direction(room_loc[0]+1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1],room_loc[2]));				
        }
        
        if(room_loc[0]+1 < spread_area.rooms.size() && room_loc[1]+1 <= max_y && spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]+1) != null && spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]+1).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]+1).get(room_loc[2]),Area.get_direction(room_loc[0]+1,room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1]+1,room_loc[2]));				
        }
        
        if(room_count < Math.max(max_y/6,1) && room_loc[1]-1 >= 0 && (spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1) == null || spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1).get(room_loc[2]) == null)){
            if(spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1) == null)spread_area.rooms.get(room_loc[0]).set(room_loc[1]-1, new ArrayList<>());//spread_area.rooms[room_loc[0]][room_loc[1]-1] = new Array()
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.size());
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]-1,room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0],room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            //spread_area.rooms[room_loc[0]][room_loc[1]-1][room_loc[2]] = new_room
            spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1).set(room_loc[2], new_room);
            spread_area.room_list.add(new_room);//spread_area.room_list[spread_area.room_list.size()] = new_room
            temp_loc[0] = room_loc[0];
            temp_loc[1] = room_loc[1] - 1;
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[1]-1 >= 0 && spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1) != null && spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]).get(room_loc[1]-1).get(room_loc[2]),Area.get_direction(room_loc[0],room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]-1,room_loc[2]));				
        }
        
        if(room_loc[0]+1 < spread_area.rooms.size() && room_loc[1]-1 >= 0 && spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]-1) != null && spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]-1).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]+1).get(room_loc[1]-1).get(room_loc[2]),Area.get_direction(room_loc[0]+1,room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1]-1,room_loc[2]));
        }
        
        if(room_count < Math.max(max_y/6,1) && room_loc[1]+1 <= max_y && (spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1) == null || spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1).get(room_loc[2]) == null)){
            if(spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1) == null)spread_area.rooms.get(room_loc[0]).set(room_loc[1]+1, new ArrayList<>());//spread_area.rooms[room_loc[0]][room_loc[1]+1] = new Array()
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.size());
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]+1,room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0],room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            //spread_area.rooms.get(room_loc[0]][room_loc[1]+1][room_loc[2]] = new_room
            spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1).set(room_loc[2], new_room);
            spread_area.room_list.add(new_room);//spread_area.room_list[spread_area.room_list.size()] = new_room
            temp_loc[0] = room_loc[0];
            temp_loc[1] = room_loc[1] + 1;
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
            //TODO WHAT?! size?!
        }else if(room_loc[1]+1 <= max_y && /*spread_area.rooms.size() &&*/ spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1) != null && /*spread_area.rooms.size() &&*/ spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1).get(room_loc[2]) != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]).get(room_loc[1]+1).get(room_loc[2]),Area.get_direction(room_loc[0],room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]+1,room_loc[2]));				
        }
            
        if(room_loc[0]-1 >= 0 && room_loc[1]+1 <= max_y && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]+1) != null && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]+1).get(room_loc[2]) != null && spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]+1).get(room_loc[2]).template == spread_room.template){
            ocean_existing_room_connect(spread_room, spread_area.rooms.get(room_loc[0]-1).get(room_loc[1]+1).get(room_loc[2]),Area.get_direction(room_loc[0]-1,room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1]+1,room_loc[2]));				
        }
        
        return room_count;
    }
    
    public void map_gen(){
        //make the oceans...
        ArrayList<ArrayList<Integer>> map = make_integer_map();
        int max_x = map.size();
        int x = 0;
        int max_y = 0;
        int gen_count = 0;
        for(x=0;x<map.size();x++){
            if(map.get(x).size() > max_y)max_y = map.get(x).size();
        }
        
        for(x=0;x<map.size();x++){
            int y = 0;
            for(y=0;y<max_y;y++){
                if(y >= map.get(x).size() || map.get(x).get(y) == null)gen_count++;
            }
        }
        
        gen_count++;
        
        while(gen_count>0){
            //TODO FPalace_content
            Area temp_ocean = FPalace_content.area_ocean();
            temp_ocean.filler_area();				
            
            map = make_integer_map();
            //connect to surrounding areas...
            Boolean placed = false;

            for(x=0;x<=max_x;x++){
                if(map.get(x) == null)map.set(x, new ArrayList<>());//map.get(x) = new Array()
                int y = 0;
                for(y=0;y<max_y;y++){
                    if(map.get(x).get(y) == null && ((y-1 >= 0 && map.get(x).get(y-1) !=null) || (y+1 < map.get(x).size() && map.get(x).get(y+1) != null))){
                        if(map.get(x).get(y-1) !=null){
                            add_area(temp_ocean);
                            connect_areas(areas.size()- 1,map.get(x).get(y-1),null,null,false,true);
                        }else{
                            add_area(temp_ocean);
                            connect_areas(areas.size()- 1,map.get(x).get(y+1),null,null,false,true);
                        }
                        placed = true;
                        break;
                    }
                }
                if(placed)break;
            }
            
            if(placed){
                map = make_integer_map();
                placed = false;
                for(x=0;x<map.size();x++){
                    int y = 0;
                    for(y=0;y<max_y;y++){
                        if(map.get(x).get(y) == areas.size()- 1){
                            if(map.get(x-1) != null && map.get(x-1).get(y-1) != null)ocean_connect(map, temp_ocean, x, y, x-1, y-1);
                            if(map.get(x-1) != null && map.get(x-1).get(y) != null)connect_areas(areas.size()- 1,map.get(x-1).get(y),null,null,false,true);
                            if(map.get(x-1) != null && map.get(x-1).get(y+1) != null)ocean_connect(map, temp_ocean, x, y, x-1, y+1);										
                            if(map.get(x).get(y-1) != null)connect_areas(areas.size()- 1,map.get(x).get(y-1),null,null,false,true);
                            if(map.get(x).get(y+1) != null)connect_areas(areas.size()- 1,map.get(x).get(y+1),null,null,false,true);
                            if(map.get(x+1) != null && map.get(x+1).get(y+1) != null)ocean_connect(map, temp_ocean, x, y, x+1, y-1);
                            if(map.get(x+1) != null && map.get(x+1).get(y+1) != null)connect_areas(areas.size()- 1,map.get(x+1).get(y+1),null,null,false,true);
                            if(map.get(x+1) != null && map.get(x+1).get(y+1) != null)ocean_connect(map, temp_ocean, x, y, x+1, y+1);
                            
                            placed = true;
                            break;
                        }
                    }
                    if(placed)break;
                }					
            }else{
                Number rand = Math.random();
                if(map.get(0).get(0) != null && rand.doubleValue() >= 0.75){
                    add_area(temp_ocean);
                    connect_areas(areas.size()- 1,map.get(0).get(0),null,null,false,true);
                    placed = true;
                }else if(map.get(map.size()-2).get(max_y-1) != null && rand.doubleValue() >= 0.5){
                    add_area(temp_ocean);
                    connect_areas(areas.size()- 1,map.get(map.size()-2).get(max_y-1),null,null,false,true);
                    placed = true;
                }else if(map.get(0).get(max_y-1) != null && rand.doubleValue() >= 0.25){
                    add_area(temp_ocean);
                    connect_areas(areas.size()- 1,map.get(0).get(max_y-1),null,null,false,true);
                    placed = true;
                }else if(map.get(map.size()-2).get(0) != null){
                    add_area(temp_ocean);
                    connect_areas(areas.size()- 1,map.get(map.size()-2).get(0),null,null,false,true);
                    placed = true;
                }
                
                if(placed){
                    map = make_integer_map();
                    
                    for(x=0;x<map.size();x++){
                        if(map.get(x).size() > max_y)max_y = map.get(x).size();
                    }
                    
                    for(x=0;x<map.size();x++){
                        int y = 0;
                        for(y=0;y<max_y;y++){
                            if(map.get(x).get(y) == null)gen_count++;
                        }
                    }
                    
                    placed = false;
                    for(x=0;x<map.size();x++){
                        int y = 0;
                        for(y=0;y<max_y;y++){
                            if(map.get(x).get(y) == areas.size()- 1){
                                if(map.get(x-1) != null && map.get(x-1).get(y-1) != null)ocean_connect(map, temp_ocean, x, y, x-1, y-1);
                                if(map.get(x-1) != null && map.get(x-1).get(y) != null)connect_areas(areas.size()- 1,map.get(x-1).get(y),null,null,false,true);
                                if(map.get(x-1) != null && map.get(x-1).get(y+1) != null)ocean_connect(map, temp_ocean, x, y, x-1, y+1);										
                                if(map.get(x).get(y-1) != null)connect_areas(areas.size()- 1,map.get(x).get(y-1),null,null,false,true);
                                if(map.get(x).get(y+1) != null)connect_areas(areas.size()- 1,map.get(x).get(y+1),null,null,false,true);
                                if(map.get(x+1) != null && map.get(x+1).get(y+1) != null)ocean_connect(map, temp_ocean, x, y, x+1, y-1);
                                if(map.get(x+1) != null && map.get(x+1).get(y+1) != null)connect_areas(areas.size()- 1,map.get(x+1).get(y+1),null,null,false,true);
                                if(map.get(x+1) != null && map.get(x+1).get(y+1) != null)ocean_connect(map, temp_ocean, x, y, x+1, y+1);
                                
                                placed = true;
                                break;
                            }
                        }
                        if(placed)break;
                    }
                }					
            }
            if(!placed){
                //areas.pop() original comment
            }
            gen_count--;				
        }
    }
    
    protected void finalizeThis(){
        int i = 0;
        for (i=0;i<areas.size();i++){
            areas.get(i).filler_area();		
            areas.get(i).finalizeThis();
        }
    }
    
    public void new_starting_room(Room r){
        starting_rooms.add(r);//starting_rooms[starting_rooms.length] = r
    }
    
    public Room get_starting_room(int i){//def 0
        if(starting_rooms.get(i) != null) return starting_rooms.get(i);
        return areas.get(0).get_random_room();
        //return null;//TODO why?
    }
    
    public int get_area_id(Area a){
        int ret;
        for(ret = areas.size();ret>=0;ret--){
            if(areas.get(ret) == a)break;
        }
        return ret;
    }
    private int get_ovrwld_area_id(int area_id){
        return get_ovrwld_area_id(area_id,-1);
    }
    private int get_ovrwld_area_id(int area_id,int skip_id){//def skip = -1
        int ret = -1;
        Boolean area_is_ovrwld = false;
        ArrayList<Integer> area_links = new ArrayList<>();
        
        int x = 0;
        for(x=0;x<links.size();x++){
            if((Integer)links.get(x).get(0) == area_id || (Integer)links.get(x).get(1) == area_id){
                if((Boolean)links.get(x).get(2) == false){
                    area_is_ovrwld = true;
                    break;
                }else{
                    if((Integer)links.get(x).get(0) == area_id){
                        //area_links[area_links.length] = links[x][1]
                        area_links.add((Integer)links.get(x).get(1));
                    }else{
                        //area_links[area_links.length] = links[x][0]
                        area_links.add((Integer)links.get(x).get(0));
                    }
                }
            }				
        }
        
        if(area_is_ovrwld){
            return area_id;
        }else{
            for(x=0;x<area_links.size();x++){
                if(area_links.get(x) != skip_id){
                    int temp_id = get_ovrwld_area_id(area_links.get(x),area_id);
                    if(temp_id >= 0){
                        ret = temp_id;
                        break;
                    }
                }
            }
        }
        return ret;
    }
    
    public int get_distance(int area1_id,int area2_id){
        int ret = 0;
        area1_id = get_ovrwld_area_id(area1_id);
        area2_id = get_ovrwld_area_id(area2_id);
        ArrayList<ArrayList<Integer>> map = make_integer_map();
        int[] area1_loc = null;
        int[] area2_loc = null;			
        int x = 0;
        for(x=0;x<map.size();x++){
            int y = 0;
            for(y=0;y<map.get(x).size();y++){
                if(map.get(x).get(y) == area1_id){
                    area1_loc = new int[]{x,y};
                }else if(map.get(x).get(y) == area2_id){
                    area2_loc = new int[]{x,y};
                }
                if(area1_loc != null && area2_loc != null)break;
            }
        }
        
        if(area1_loc != null && area2_loc != null){
            ret = (int)Math.round(Math.sqrt(Math.pow(area1_loc[0] - area2_loc[0], 2) + Math.pow(area1_loc[1] - area2_loc[1], 2)));
        }else{
            LOGGER.info("(World.get_distance)Failed to find an area on the map. Returning distance 0");
        }
        
        return ret;
    }
    public void tick(){
        tick(null,null);
    }
    public void tick(Area a,Character c){//def null, null
        if(a != null){
            a.tick(c);
        }
        
        //this takes areas.length ticks to have the entire world progress by a single tick...
        Area temp_area = areas.get(0);
        int area_to_tick = 0;
        int min_tick = temp_area.totalActionsTaken;
        int i = 0;
        for(i=0;i<areas.size();i++){
            temp_area = areas.get(i);
            if(temp_area.totalActionsTaken < min_tick){
                area_to_tick = i;
                min_tick = temp_area.totalActionsTaken;
            }
        }
        
        temp_area = areas.get(area_to_tick);
        temp_area.tick(c);
    }
    
    private String neg_direction(String s){
        ArrayList<String> dir_list = new ArrayList<>(Arrays.asList("North", "East", "West", "North-East", "North-West", "South-West",  "South-East", "South"));
        ArrayList<String> not_dir_list = new ArrayList<>(Arrays.asList("South", "West", "East", "South-West", "South-East", "North-East", "North-West", "North"));
        int i = 0;
        for(i=0;i<dir_list.size();i++){
            if(dir_list.get(i).equals(s)){
                return not_dir_list.get(i);
            }
        }
        return "";
    }
    
}

