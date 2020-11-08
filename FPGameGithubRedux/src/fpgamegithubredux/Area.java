package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.awt.Color;

public class Area extends StaticObject{
    public static int fully_connected_filler = 0;
    public static int single_connected_filler = 1;
    private static final Logger LOGGER = Logger.getLogger(Area.class.getName());
    protected ArrayList<ArrayList<ArrayList<Room>>> rooms;//Room[][][] rooms
    protected ArrayList<Room> room_list;
    protected String map;
    protected ArrayList<String> legend; //was array
    protected ArrayList<Integer> legendFloor; //was array	
    protected ArrayList<Template_Room> fillerTemplate;// was var filler_template:Array //Template_Room
    protected ArrayList<Integer> fillerType;//var filler_type:Array//int
    protected ArrayList<ArrayList<Integer>> fillerFloorRange;//var filler_floor_range:Array
    protected ArrayList<Template_Room> dynamicBuildTemplate;//var dynamicBuildTemplate:Array;//Template_Room
    protected ArrayList<ArrayList<Integer>> dynamicBuildFloorRange;//var dynamicBuildFloorRange:Array
    protected Boolean dynamicBuildUp;//var dynamic_build_up:Boolean
    protected ArrayList<Template_Room> templateRooms;//var template_rooms:Array
    protected ArrayList<ArrayList<Integer>> templateFloorRange;//var template_floor_range:Array		
    protected int[] tempOffset;//var temp_offset:Array, always 3 elements!
    protected int totalActionsTaken = 0;//var totalActionsTaken:Number = 0
    protected ArrayList<Room> connectRooms;//var connect_rooms:Array
    protected World world;//public var world:World
    protected Boolean playerDiscovered;//var player_discovered:Boolean
    protected Color mapColor;//var map_colour:uint
    protected ArrayList<Character_template> spawnCreatures;//var spawn_creatures:Array
    protected int npcSpawnThreshold;//var npcSpawnThreshold:int	
    protected ArrayList<Area_weather> weathers;//protected AreaWeather[]; weathers//protected var weathers:Array
    protected int current_weather; //protected var current_weather:int
    protected int current_weather_length;//protected var current_weather_length:int	
    protected ArrayList<Conversation_topic> conversations;//protected var conversations:Array
    protected int backgroundImageID;//var background_image_id:int
    protected int moveTimeMod;//var move_time_mod:int
    protected static String pathPlaceHldr;
    private ArrayList<Room> alreadyCheckedPlaceholder;//var already_checked_placeholder:Array
    private int baseFloorZ;//var baseFloorZ:int
       
    public Area(){
        new Area("");
    }
    public Area(String d) {//String d
        set_description(d);
        rooms = new ArrayList<>();//new Array()
        map = "";
        room_list = new ArrayList<>();
        templateRooms = new ArrayList<>();//template_rooms = null;//new Array()
        templateFloorRange = new ArrayList<>();//template_floor_range = null;//new Array()
        legend = new ArrayList<>();//new Array()
        legendFloor = new ArrayList<>();//legend_floor = null;//new Array()
        connectRooms = new ArrayList<>();//new Array()
        //world = null
        playerDiscovered = false;
        mapColor = new Color(255,255,255);
        tempOffset = new int[3];//temp_offset = null;//new Array()
        fillerTemplate = new ArrayList<>();//new Array()
        fillerType = new ArrayList<>();//new Array()
        fillerFloorRange = new ArrayList<>();//filler_floor_range = null;//new Array()
        dynamicBuildTemplate = new ArrayList<>();//new Array()
        dynamicBuildUp = true;
        dynamicBuildFloorRange=new ArrayList<>();//dynamicBuildFloorRange = null;//new Array()

        
        spawnCreatures = new ArrayList<>();//new Array()
        npcSpawnThreshold = -1;
        
        //weathers = null;//new Array()
        current_weather = 0;
        current_weather_length = 0;
        totalActionsTaken = FPGameGithub.T1_DAY/4 - 1;
        
        //conversations = null;//new Array()
        
        backgroundImageID = -1;
        moveTimeMod = 1;
        baseFloorZ = 0;
    }
    
    public void set_move_time(int i){
        if(i>=1)moveTimeMod = i;
    }
    
    public void set_background_img(int i){
        backgroundImageID = i;
    }
    
    public int get_background_img(){
        return backgroundImageID;
    }
    
    public int get_base_floor(){
        return baseFloorZ;
    }
    
    public void new_conversation_topic(Conversation_topic ct){
        //conversations[conversations.length] = ct
        conversations.add(ct);
    }
    
    
    public ArrayList<Conversation_topic> get_topics(){
        return conversations;
    }

    public void new_weather(Area_weather aw){
        weathers.add(aw);//weathers[weathers.length] = aw\
    }
    
    public String get_outdoor_description(){
        String ret = "";
        
        if(weathers.get(current_weather) != null){//if weathers[current_weather] != null
            ret = weathers.get(current_weather).get_description(totalActionsTaken%FPGameGithub.T1_DAY);//ret = weathers[current_weather].get_description(totalActionsTaken%Main.t1_day
        }
        
        
        return ret;
    }
    
    public void add_creature_spawn(Character_template c){
        spawnCreatures.add(c); //spawn_creatures[spawn_creatures.length] = c
    }
    
    public void set_spawn_threshold(int i){
        npcSpawnThreshold = i;
    }
    
    public void set_player_discovered(){
        playerDiscovered = true;
    }
    
    public void set_colour(int i){//was uint
        mapColor = new Color(i);//was just int
    }
    
    public Boolean get_player_discovered(){
        return playerDiscovered;
    }
    
    public Color get_map_colour(){//was int
        return mapColor;
    }
    
    public void add_connect_room(Room r){
        //make sure the room is actually part of this area
        r.area = this;
        connectRooms.add(r);        //connectRooms[connectRooms.size()] = r
    }
    
    public Room get_connect_room(){
        Room r = null;
        
        if(connectRooms.get(connectRooms.size() - 1) != null) r = connectRooms.get(connectRooms.size() - 1);
        //connectRooms = Arrays.copyOfRange(connectRooms,0,connectRooms.size()-1);//connectRooms = connectRooms.slice(0, connectRooms.size() - 1)
        connectRooms = (ArrayList<Room>)connectRooms.subList(0,connectRooms.size()-1);//TODO verify
        return r;
    }
    
    public int[] find_room(Room fr){
        int x = 0;
        int y = 0;
        int z = 0;
        Boolean found = false;
        for (x = 0;x<rooms.size();x++){//TODO check if works without null check, also .length
            if (rooms.get(x) != null){//[]
                for(y = 0;y<rooms.get(x).size();y++){//[].length
                    if(rooms.get(x).get(y) != null){//[][]
                        for(z=0;z<rooms.get(x).get(y).size();z++){//[][].length
                            if(rooms.get(x).get(y).get(z) != null && rooms.get(x).get(y).get(z)  == fr){
                                found = true;
                                break;
                            }
                        }
                    }
                    if(found) break;
                }
            }
            if(found){
                int[] numbers = new int[3];
                numbers[0] =x;
                numbers[1] =y;
                numbers[2] =z;
                return numbers;
            }
        }
        return new int[3];
    }
    public int place_room(Room r, Room lr, int max_same_room){//3/5 vars
        return place_room(r, lr, max_same_room,null,false);
    }
    public int place_room(Room r, Room lr, int max_same_room,ArrayList<Room> exempt_rooms, Boolean restrict_edges){
        //lr = null, max_same_room = -1, exempt rooms = null, restrict edges = false
        if (r == null) return 1;
        int[] temp = new int[3];//Array temp, also no need to initialize, it gets filled by find_room?
        tempOffset = null;
        if (rooms.get(0) == null){//[]
            //rooms[0] = null;//new Array()
            //rooms[0][0] = null;//new Array()
            //rooms[0][0][0] = r
            ArrayList<Room> oneDRoom = new ArrayList<Room>();
            oneDRoom.add(r);
            ArrayList<ArrayList<Room>> twoDRoom = new ArrayList<ArrayList<Room>>();
            twoDRoom.add(oneDRoom);
            rooms = new ArrayList<ArrayList<ArrayList<Room>>>();
            rooms.add(twoDRoom);//TODO figure out if this stupid shit works
            if(r.exits.size() > 0){
                
                if(existing_exit_check(r, 0, 0, 0, max_same_room)){
                    temp = find_room(r);
                    existing_exit_add(r, lr, temp[0], temp[1], 0, "");
                }else{
                    LOGGER.info("(Area)Well bugger. Failed to place the very first room.");
                }
                				
            }
            return 1;
        }
        
        if(lr == null && exempt_rooms == null){
            lr = this.get_random_room();
            exempt_rooms = null;//new array()
        }else if(lr == null){
            if(exempt_rooms == null) exempt_rooms = null;//new Array
            if (exempt_rooms.size() >= room_list.size()){
                //There is no one to attach to for our poor friend. Guess he gets to be a loner
                Boolean placed = false;
                int max = 0;
                int counter = 0;
                for(counter = 0;counter<rooms.size();counter++){//.length
                    if(rooms.get(counter).size()-1 > max) max = rooms.get(counter).size()-1;//[].length
                }
                counter = 0;
                while (!placed){
                    counter++; 
                    int rand_x = (int)Math.round(Math.random() * (rooms.size()-1));//.length
                    int rand_y= (int)Math.round(Math.random() * max);
                    int rand_z = 0;
                    if(rooms.get(rand_x).get(rand_y) == null)rooms.get(rand_x).set(rand_y, new ArrayList<Room>());//new Array(), [][]
                    //TODO verify above
                       
                    if(rooms.get(rand_x).get(rand_y).get(rand_z) == null){//now the innermost! was [][][]
                        if(r.exits.size() > 0){
                            
                            if(existing_exit_check(r, rand_x, rand_y, rand_z, max_same_room)){
                                existing_exit_add(r, lr, rand_x, rand_y, rand_z, null);
                                placed = true;
                            }
                            
                        }else{
                            existing_exit_add(r, null, rand_x, rand_y, rand_z, null);
                            placed = true;
                        }
                    }
                    if(counter > 25)break;
                }
                
                if(!placed){
                    LOGGER.info("(AREA.place_room)failed to place room.");
                    return -1;
                }
                LOGGER.info("(AREA.place_room)Placed room randomly.");
                return 1;
            }
            
            int[] temp_room_list = new int[0];
            
            int i = 0;
            for(i=0;i<room_list.size();i++){
                Boolean check = false;
                for(int k=0;k<exempt_rooms.size();k++){
                    if(room_list.get(k) == exempt_rooms.get(i)){
                        check = true;
                        break;
                    }
                }
                
                if(!check){
                    temp_room_list[temp_room_list.length] = i;
                }
                
            }
            
            int wakka = temp_room_list[(int)Math.round(Math.random()*(temp_room_list.length-1))];
            lr = room_list.get(wakka);
        }
        
        
            //We have to find the room we want to link to
            //but only if it's in the same area as the first
            if(r.area == lr.area && r.area == this&&lr != null){//TODO pulling in null  okay
                temp = find_room(lr);
                if(temp != null){
                    int x = temp[0];//[0]
                    int y = temp[1];//[1]
                    int z = temp[2];//[2]
                    
                    int[] connect_status = is_good_connect(x, y, z, r, lr, max_same_room, -1, -1, -1, restrict_edges);//var connect_status:Array = is_good_connect(x, y, z, r, lr, max_same_room, -1, -1, -1, restrict_edges)

                    if(connect_status[0] == -1){
                        //return place_room(r, null, max_same_room, exempt_rooms.concat(lr), restrict_edges);//TODO concat rooms
                    }else if(connect_status[0] == -2){
                        return place_room(r, null, max_same_room, exempt_rooms, restrict_edges);
                    }
                    
                    temp = find_room(lr);
                    x = temp[0];//[0]
                    y = temp[1];//[1]
                    z = temp[2];//[2]
                    
                    int new_x = connect_status[1];
                    int new_y = connect_status[2];
                    int new_z = connect_status[3];
                    Boolean other_rooms_ok= true;
                    
                    String to_path= get_direction(new_x, new_y, new_z, x, y, z);
                    String from_path = get_direction(x, y, z, new_x, new_y, new_z);
                    
                    if(r.exits.size() > 0){
                        other_rooms_ok = existing_exit_check(r, new_x, new_y, new_z, max_same_room);
                        if(other_rooms_ok){
                            temp = find_room(lr);
                            x = temp[0];//[0]
                            y = temp[1];//[1]
                            z = temp[2];//[2]
                            int[] offset = get_offset_by_name(from_path);
                            new_x = x + offset[0];
                            new_y = y + offset[1];
                            new_z = z + offset[2];
                        }
                    }
                    
                    if(!other_rooms_ok){
                        //return place_room(r, null, max_same_room, exempt_rooms.concat(lr), restrict_edges)
                        exempt_rooms.add(lr);
                        return place_room(r, null, max_same_room, exempt_rooms, restrict_edges);
                    }
                    
                    if(lr.new_exit(r, from_path) > -1){
                        r.new_exit(lr, to_path);
                        
                        //need to add r's existing exits to the rooms, room_list, and map_pieces arrays
                        existing_exit_add(r, lr, new_x, new_y, new_z, to_path);
                        
                        return 1;
                    }else{
                        return place_room(r, null, max_same_room, exempt_rooms, restrict_edges);
                    }
                    
                }else{
                    LOGGER.info("(Area)Failed to find a room while placing...");
                    return place_room(r, null, max_same_room, exempt_rooms, restrict_edges);
                }
            }
        
        return 1;
    }
    


    public void existing_exit_add(Room r, Room lr, int new_x, int new_y, int new_z, String to_path) {
        if(new_x < 0 || new_y < 0 || new_z < 0){
            if(new_x < 0){ 
                
                if(new_x < -1)LOGGER.info("(Area.existing_exit_add)Shifting on the x-axis... but not enough.");
                for(new_x = rooms.size();new_x >= 1;new_x--){
                    rooms.set(new_x, rooms.get(new_x - 1));//[] and []
                }
                new_x = 0;
                rooms.set(new_x,  null);//[] =
                
            }
            int x = 0;
            if(new_y < 0){ 
                
                if(new_y < -1)LOGGER.info("(Area.existing_exit_add)Shifting on the y-axis... but not enough.");
                for(x=0;x<rooms.size();x++){//.length
                    if(rooms.get(x) != null){//[]
                        //new_y = rooms.get(x].length;//should this be max y?
                        for(new_y=rooms.get(x).size();new_y >= 1;new_y--){//[].length
                            rooms.get(x).set(new_y, rooms.get(x).get(new_y - 1));//[][] = [][]
                        }
                        new_y = 0;
                        rooms.get(x).set(new_y, null);//[][] =
                    }
                }
                
            }
            
            if(new_z < 0){
                new_z = 0;
                baseFloorZ++;
                for(x=0;x<rooms.size();x++){//.length
                    if(rooms.get(x) != null){ //[]
                        for(int y=0;y<rooms.get(x).size();y++){
                            if(rooms.get(x).get(y) != null)rooms.get(x).get(y).add(0,null);//if(rooms.get(x).get(y) != null)rooms.get(x].get(y).unshift(null)//TODO learn unshift
                            //from https://stackoverflow.com/questions/8452672/java-howto-arraylist-push-pop-shift-and-unshift
                            if(rooms.get(x).get(y) != null){
                                rooms.get(x).get(y).add(0,null);
                            }
                        }
                    }
                }
            }				
        }
        
        //if(rooms[new_x] == null)rooms[new_x] = null;//was new Array()
        if(rooms.get(new_x) == null)rooms.set(new_x, new ArrayList<ArrayList<Room>>());
        //if(rooms[new_x][new_y] == null)rooms[new_x][new_y] = null; // was new Array()
        if(rooms.get(new_x).get(new_y) == null)rooms.get(new_x).set(new_y, new ArrayList<Room>());
        if(rooms.get(new_x).get(new_y).get(new_z) != null&&rooms.get(new_x).get(new_y).get(new_z) != r){//[][][]
            String areaMsgOut = ("(Area.existing_exit_add)Over-writing a room on the map at co-ordinates " + new_x + "," + new_y + "," + new_z + " existing_exit_check() has failed us!");
            LOGGER.info(areaMsgOut); //was one line of trace
        }
        rooms.get(new_x).get(new_y).set(new_z, r);
        
        if(r.exits.size() > 0){
            int counter = 0;
            for(counter=0;counter<r.exits.size();counter++){
                //figure out the offset based on the name
                if(r.exits.get(counter).area == null && r.exits.get(counter) != lr){
                    int[] offset = get_offset_by_name(r.exitNames[counter]);
                    int figured_new_x = new_x + offset[0];
                    int figured_new_y = new_y + offset[1];
                    int figured_new_z = new_z + offset[2];
                    
                    r.exits.get(counter).area = this;
                    r.exits.get(counter).set_id(room_list.size());
                    //room_list[room_list.size()] = r.exits.get(counter)
                    room_list.set(room_list.size(),r.exits.get(counter));
                    
                    existing_exit_add(r.exits.get(counter), r, figured_new_x, figured_new_y, figured_new_z, r.exitNames[counter]);
                    int[] temp_arr = find_room(r);
                    
                    if(temp_arr != null){
                        new_x = temp_arr[0];//[0]
                        new_y = temp_arr[1];//[1]
                        new_z = temp_arr[2];//[2]
                    }else{
                        LOGGER.info("(Area)I literally just placed this room, and now I can't find it...");
                    }
                    
                }
            }
        }
    }
    public Boolean existing_exit_check(Room r,int new_x,int new_y,int new_z,int max_same_room ){
        return existing_exit_check( r, new_x, new_y, new_z, max_same_room, null);
    }
    public Boolean existing_exit_check(Room r,int new_x,int new_y,int new_z,int max_same_room, ArrayList<Room> already_checked){

        //already checked = null
        Boolean other_rooms_ok = true;
        if(rooms.get(new_x)  != null){
            if(rooms.get(new_x).get(new_y) != null){
                if(rooms.get(new_x).get(new_y).get(new_z) != null){//TODO will this return null if get x or y are?
                    if(rooms.get(new_x).get(new_y).get(new_z) != r)other_rooms_ok = false;
                }
            }
        }
        if(r.exits.size() > 0 && other_rooms_ok){
            int counter = 0;
            if(already_checked == null){
                already_checked = new ArrayList<>();//new Array()
            }else{
                for(counter=0;counter<already_checked.size();counter++){
                    if(already_checked.get(counter) == r) return other_rooms_ok;
                }
            }
            //already_checked = already_checked.concat(r);//TODO concat a room?!
            already_checked.add(r);
            set_already_checked(already_checked);
            for(counter=0;counter<r.exits.size();counter++){
                if(r.exits.get(counter).area != null) continue;
                //figure out the offset based on the name
                int[] offset = get_offset_by_name(r.exitNames[counter]);//TODO this is always 3 elements?
                /*
                int[] offset = new int[get_offset_by_name(r.exitNames[counter]).size()];
                for (int i=0; i < offset.length; i++)
                {
                    offset[i] = get_offset_by_name(r.exitNames[counter]).get(i).intValue();
                }*///TODO does this shit really work?
                //TODO readme as ArrayList to primitive
                //need to check if we need to assign a new offset
                if(offset[0] == 0 && offset[1] == 0 && offset[2] == 0){
                    Boolean loop_flag = true;
                    while(loop_flag){
                        loop_flag = false;
                        int rand_direct = (int)Math.random()*26 + 1;
                        if((rand_direct/9) > 0){
                            if((rand_direct/9) > 1){
                                offset[0]++;
                            }else{
                                offset[0]--;
                            }
                            rand_direct = rand_direct - ((rand_direct / 9)*9);
                        }
                        
                        if((rand_direct/3) > 0){
                            if((rand_direct/3) > 1){
                                offset[1]++;
                            }else{
                                offset[1]--;
                            }
                            rand_direct = rand_direct - ((rand_direct / 3)*3);
                        }
                        
                        if(rand_direct > 0){
                            if(rand_direct > 1){
                                offset[2]++;
                            }else{
                                offset[2]--;
                            }
                        }
                        //should check to see if this is actually a good exit... just go through the exits OWN exits to make sure none of their offsets is the same as this one
                        int exit_exits = 0;
                        for(exit_exits=0;exit_exits<r.exits.get(counter).exits.size();exit_exits++){
                            if(r.exits.get(counter).exits.get(exit_exits) == r)continue;
                            int[] exit_exit_offset = get_offset_by_name(r.exits.get(counter).exitNames[exit_exits]);
                            if(offset[0] == -exit_exit_offset[0] && offset[1] == -exit_exit_offset[1] && offset[2] == -exit_exit_offset[2]){
                                loop_flag = true;
                                break;
                            }
                            
                        }
                    }
                    this.tempOffset = offset;
                    //TODO
                    LOGGER.info("(Area.existing_exit_check)Assigned direction " + offset + " to exit named " + r.exitNames[counter]);
                }
                
                int figured_new_x = new_x + offset[0];
                int figured_new_y = new_y + offset[1];
                int figured_new_z = new_z + offset[2];
                
                if(rooms.get(figured_new_x) != null){
                    if(rooms.get(figured_new_x).get(figured_new_y) != null){
                        if(rooms.get(figured_new_x).get(figured_new_y).get(figured_new_z) != null){
                            other_rooms_ok = false;
                        }
                    }
                    
                    //check for an "overpass" exit
                    if(rooms.get(new_x) != null && rooms.get(figured_new_x).get(new_y) != null && rooms.get(new_x).get(figured_new_y) != null 
                    && rooms.get(figured_new_x).get(new_y).get(figured_new_z) != null && rooms.get(new_x).get(figured_new_y).get(figured_new_z) != null){
                        if(rooms.get(new_x).get(figured_new_y).get(figured_new_z).get_exit_id(rooms.get(figured_new_x).get(new_y).get(figured_new_z)) >= 0 ){
                            other_rooms_ok = false;
                        }
                    }
                }
                
                if(r.exits.get(counter).exits.size() > 0 && other_rooms_ok){
                    other_rooms_ok = existing_exit_check(r.exits.get(counter), figured_new_x, figured_new_y, figured_new_z, max_same_room, already_checked);
                    already_checked = get_already_checked();
                }
                
                if(!other_rooms_ok){
                    break;
                }
            }
        }
        return other_rooms_ok;
    }
    
    
    private void set_already_checked(ArrayList<Room> a){
        alreadyCheckedPlaceholder = a;
    }    
    
    private ArrayList<Room> get_already_checked(){
        return alreadyCheckedPlaceholder;
    }
    
    
    public int[] is_good_connect(int x,int y,int z,Room r,Room lr, int max_same_room,int new_x,int new_y,int new_z,Boolean restrict_edges){
        //new_x = -1, new_y = -1, new_z = -1, restrict_edges = false
        if(new_z == -1) new_z = z;
        
        if(new_x == -1 || new_y == -1){
            new_x = x;
            new_y = y;
        }
        
        int max_y = -1;
        int count = 0;
        if(restrict_edges){
            for(count=0;count<rooms.size();count++){//.length
                if(rooms.get(count).size() > max_y) max_y = rooms.get(count).size();//[].length and  .length
            }
        }
        
        int x_jiggle;
        int y_jiggle;
        int z_jiggle;
        count = 0;
        while(new_x == x && new_y == y){
            count++;
            x_jiggle = (int)(Math.random()*3);
            y_jiggle = (int)(Math.random()*3);
            z_jiggle = (int)(Math.random()*3);
            
            switch (x_jiggle){
                case 0:
                new_x--;
                break;
                case 2:
                new_x++;
                break;
                default:
                break;
            }
            switch (y_jiggle){
                case 0:
                new_y--;
                break;
                case 2:
                new_y++;
                break;
                default:
                break;
            }
            switch (z_jiggle){
                case 0:
                new_z--;
                break;
                case 2:
                new_z++;
                break;
                default:
                break;
            }
            
            if(new_x < 0 && !restrict_edges){ 
                for(new_x = rooms.size();new_x >= 0;new_x--){//.length
                    rooms.set(new_x,rooms.get(new_x - 1));
                }
                if(rooms.get(new_x) == null){
                    rooms.set(new_x, new ArrayList<ArrayList<Room>>());//new Array
                }
                int[] temp = find_room(lr);
                x = temp[0];//[0]
                y = temp[1];//[1]
                z = temp[2];//[2]
            }
            if(new_y < 0 && !restrict_edges){ 
                for(x= 0;x<rooms.size();x++){//.length
                    if(rooms.get(x) == null) rooms.set(x, new ArrayList<ArrayList<Room>>());//new Array()
                    for(new_y= rooms.get(x).size();new_y >= 0;new_y--){
                        rooms.get(x).set(new_y, rooms.get(x).get(new_y - 1));//[][] = [] []
                    }
                }
                new_y = 0;
                int[] temp = find_room(lr);
                x = temp[0];//[0]
                y = temp[1];//[1]
                z = temp[2];//[2]
            }
            
            if(restrict_edges && (new_y < 0 || new_x < 0 || new_x >= rooms.size() || (new_y >= max_y && max_y > -1))){//.length
                return new int[]{-1};
            }
            
            if(rooms.get(new_x) == null) rooms.set(new_x, new ArrayList<ArrayList<Room>>());//new Array()
            if(rooms.get(new_x).get(new_y) == null)rooms.get(new_x).set(new_y,new ArrayList<Room>());//new Array
            
            if(rooms.get(new_x).get(new_y).get(new_z) != null){
                //Let's join them... if they aren't already joined
                if(new_x != x || new_y != y || new_z != z){
                    String to_path= get_direction(new_x, new_y, new_z, x, y, z);
                    String from_path = get_direction(x, y, z, new_x, new_y, new_z);
                    
                    if(rooms.get(new_x) != null){
                        //check to see if the existing room already has enough exits
                        int same_room_count = 1;
                        int temp_room_count = 0;
                        int temp_max_same = -1;
                        
                        if(lr.template != null)temp_max_same = lr.template.get_max_same_exits();
                        if (temp_max_same > -1){
                            if (rooms.get(new_x).get(new_y).get(new_z).description.equals(lr.description) || 
                            (rooms.get(new_x).get(new_y).get(new_z).template != null && 
                            rooms.get(new_x).get(new_y).get(new_z).template.equals(lr.template))){//TODO IS THIS PEMDAS'D?!
                                for(temp_room_count=0;temp_room_count<lr.exits.size();temp_room_count++){
                                    if (lr.exits.get(temp_room_count).description.equals(lr.description) || (lr.exits.get(temp_room_count).template != null && lr.exits.get(temp_room_count).template == lr.template)) same_room_count++;
                                }
                            }
                        }
                        
                        Boolean good_exit = true;
                        
                        if (lr.template != null){
                            if(lr.template == rooms.get(new_x).get(new_y).get(new_z).template){
                                if (rooms.get(new_x).get(new_y).get(new_z).template.get_same_exit_offset() > 0 && good_exit){
                                    good_exit = false;
                                    ArrayList<String> avail_exits = lr.template.get_avail_exits(lr);
                                    int temp_str_count = 0;
                                    for(temp_str_count=0;temp_str_count<avail_exits.size();temp_str_count++){
                                        if(from_path.equals(avail_exits.get(temp_str_count))){
                                            good_exit = true;
                                            break;
                                        }
                                    }
                                    
                                    if(good_exit){
                                        good_exit = false;
                                        avail_exits = rooms.get(new_x).get(new_y).get(new_z).template.get_avail_exits(rooms.get(new_x).get(new_y).get(new_z));
                                        for(temp_str_count=0;temp_str_count<avail_exits.size();temp_str_count++){
                                            if(to_path.equals(avail_exits.get(temp_str_count))){
                                                good_exit = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }else{
                                if(!lr.template.check_template_connect(rooms.get(new_x).get(new_y).get(new_z).template) || (rooms.get(new_x).get(new_y).get(new_z).template != null && !rooms.get(new_x).get(new_y).get(new_z).template.check_template_connect(lr.template))){
                                    good_exit = false;
                                }		
                            }
                            
                            if(lr.template.get_max_exits() > -1 && lr.exits.size()-1 >= lr.template.get_max_exits()){
                                good_exit = false;
                            }
                        }
                        
                        if(rooms.get(x) == null) rooms.set(x, new ArrayList<ArrayList<Room>>());//new Array()
                        if(rooms.get(new_x) == null) rooms.set(new_x, new ArrayList<ArrayList<Room>>());//new Array()
                        
                        
                        
                        if(rooms.get(x).get(new_y) != null && rooms.get(x).get(new_y).get(z) != null && rooms.get(new_x).get(y) != null && 
                        rooms.get(new_x).get(y).get(z) != null && (same_room_count < temp_max_same || temp_max_same == -1) && good_exit){
                            
                            if(rooms.get(x).get(new_y).get(z).get_exit_id(rooms.get(new_x).get(y).get(z)) == -1){
                                rooms.get(new_x).get(new_y).get(new_z).new_exit(lr, to_path);
                                lr.new_exit(rooms.get(new_x).get(new_y).get(new_z), from_path);
                            }
                            
                        }else if((same_room_count < temp_max_same || temp_max_same == -1) && good_exit){
                            
                            rooms.get(new_x).get(new_y).get(new_z).new_exit(lr, to_path);
                            lr.new_exit(rooms.get(new_x).get(new_y).get(new_z), from_path);
                            
                        }
                    }
                    
                }
                
                //need to be able to tell when can't move to current lr
                new_x = x;
                new_y = y;
                new_z = z;
                if (count > 10){
                    if (rooms.get(x+1) == null) rooms.set(x+1, new ArrayList<ArrayList<Room>>());//new Array()
                    if (rooms.get(x-1) == null) rooms.set(x-1, new ArrayList<ArrayList<Room>>());//new Array()
                    //fine, i'll pick the damn room
                    
                    if(rooms.get(x+1).get(y) == null && existing_exit_check(r,  x+1, y, new_z, max_same_room)){
                            new_x = x+1;
                    }
                    if(rooms.get(x+1).get(y+1) == null && existing_exit_check(r,  x+1, y+1, new_z, max_same_room)){
                            new_x = x+1;
                            new_y = y+1;
                    }
                    if(rooms.get(x).get(y+1) == null && existing_exit_check(r,  x, y+1, new_z, max_same_room)){
                            new_y = y+1;
                    }
                    
                    if(x-1 >=0){
                        if(rooms.get(x-1).get(y+1) == null && existing_exit_check(r,  x-1, y+1, new_z, max_same_room)){
                                new_y = y+1;
                                new_x = x-1;
                        }else if(rooms.get(x-1).get(y) == null && existing_exit_check(r,  x-1, y, new_z, max_same_room)){
                                new_x = x-1;
                        }else if(y-1>=0){
                            if(rooms.get(x-1).get(y-1) == null && existing_exit_check(r,  x-1, y-1, new_z, max_same_room)){
                                new_x = x-1;
                                new_y = y -1;
                            }
                        }
                    }
                    
                    if(y-1 >= 0){
                        if(rooms.get(x).get(y-1) == null && existing_exit_check(r,  x, y-1, new_z, max_same_room)){
                            new_y = y -1;
                        }else if(rooms.get(x+1).get(y-1) == null && existing_exit_check(r,  x+1, y-1, new_z, max_same_room)){
                            new_x = x+1;
                            new_y = y -1;
                        }
                    }
                    
                    if(new_x == x && new_y == y && new_z == z){
                        //after all that if up there, nothing can be done for our poor little room...
                        return new int[]{-1};
                    }
                    
                }
            }
            
            if(r.exits.size() > 0){
                
                if(!existing_exit_check(r,  new_x, new_y, new_z, max_same_room)){
                    new_x = x;
                    new_y = y;
                    new_z = z;
                }
                
            }
            
            if(rooms.get(x) != null && rooms.get(new_x) != null){
                if(rooms.get(x).get(new_y) != null && rooms.get(new_x).get(y) != null){
                    if(rooms.get(x).get(new_y).get(z) != null && rooms.get(new_x).get(y).get(z) != null){
                        
                        if(rooms.get(x).get(new_y).get(z).get_exit_id(rooms.get(new_x).get(y).get(z)) >= 0){
                            new_x = x;
                            new_y = y;
                            new_z = z;
                        }
                        
                    }
                }
            }
        }
        
        if(rooms.get(new_x) == null) rooms.set(new_x, new ArrayList<ArrayList<Room>>());//new Array()
        if(rooms.get(new_x).get(new_y) == null) rooms.get(new_x).set(new_y, new ArrayList<Room>());//new Array()
        
        //TODO Unused?
        //String to_path = get_direction(new_x, new_y, new_z, x, y, z)
        String from_path = get_direction(x, y, z, new_x, new_y, new_z);
        
        if (max_same_room > -1){
            
            if (r.description.equals(lr.description) || (r.template != null && lr.template!= null && r.template == lr.template)){
                int same_room_count = 1;
                int temp_room_count = 0;
                for(temp_room_count = 0;temp_room_count<lr.exits.size();temp_room_count++){
                    if (lr.exits.get(temp_room_count).description.equals(lr.description) || (lr.exits.get(temp_room_count).template != null && lr.template!= null && lr.exits.get(temp_room_count).template == lr.template)) same_room_count++;
                }
                if (same_room_count > max_same_room){
                    //sorry bud, better try another room
                    return new int[]{-1};//TODO oof?
                }
                
            }
            
        }
        
        if (lr.template != null){
            if(lr.template == r.template){
                if (r.template.get_same_exit_offset() > 0){
                    
                    Boolean good_exit= false;
                    ArrayList<String> avail_exits = lr.template.get_avail_exits(lr);
                    int temp_str_count = 0;
                    for(temp_str_count=0;temp_str_count<avail_exits.size();temp_str_count++){
                        if(from_path.equals(avail_exits.get(temp_str_count))){
                            good_exit = true;
                            break;
                        }
                    }
                    
                    if(!good_exit && avail_exits.size() <= 0){
                        return new int[]{-1};
                        
                    }else if(!good_exit){
                        return new int[]{-2};
                    }
                    
                }
            }else if(r.template != null){
                if(!lr.template.check_template_connect(r.template) || !r.template.check_template_connect(lr.template)){
                    return new int[]{-1};
                }
            }
                     
        }
        
        
        return new int[]{1, new_x, new_y, new_z};//return [1, new_x, new_y, new_z]
    }
    
    public static String get_direction(int x1,int y1,int z1,int x2,int y2,int z2){
            String to_path = "";
            if (x1 > x2){
                to_path += "North"; 
            }else if(x1 < x2){
                to_path += "South";
            }
            if (y1 != y2 && x1 != x2){
                to_path += "-";
            }
            if (y1 > y2){
                to_path += "East"; 
            }else if(y1 < y2){
                to_path += "West"; 
            }
            
            if (z1 != z2 && (y1 != y2 || x1 != x2)){
                to_path += " and ";
            }
            
            if (z1 > z2){
                to_path += "Up"; 
            }else if(z1 < z2){
                to_path += "Down"; 
            }
            
            return to_path;
    }
    
    public int[] get_offset_by_name(String s){
        int[] ret_array = new int[]{0,0,0};

        if(s==null)return ret_array;
        
        if(s.indexOf("North") >= 0){
            ret_array[0]--;
        }else if(s.indexOf("South") >= 0){
            ret_array[0]++;
        }
        
        if(s.indexOf("East") >= 0){
            ret_array[1]--;
        }else if(s.indexOf("West") >= 0){
            ret_array[1]++;
        }
        
        if(s.indexOf("Up") >= 0){
            ret_array[2]++;
        }else if(s.indexOf("Down") >= 0){
            ret_array[2]--;
        }
        
        if(ret_array[0] == 0 && ret_array[1] == 0 && ret_array[2] == 0&&tempOffset != null){
            ret_array = tempOffset;
            //TODO
        }
        return ret_array;
    }

    public void random_area(int num_rooms, Template_Room tr){
        //num+rooms = 10, tr= null
        int i;
        if(tr == null){
            i = (int)Math.round(Math.random() * (templateRooms.size() - 1));
            tr = templateRooms.get(i);
        }
        
        if(tr == null) return;
        for (i = 1; i<=num_rooms;i++){
            Room new_room = tr.make_room();
            add_room(new_room, tr.get_max_same_exits());
        }
        
    }
    
    
    
    public void filler_area(int floor_to_build){
        //floor_to_build = -2
        if(floor_to_build < -1)floor_to_build = baseFloorZ;
        Template_Room filler_template_t = null;
        int filler_type_t = -1;
        int x;
        for(x=0;x<fillerTemplate.size();x++){
            if(fillerFloorRange.get(x) == null){
                filler_template_t = fillerTemplate.get(x);
                filler_type_t = fillerType.get(x);
            }else{
                if(fillerFloorRange.get(x).get(0) < 0 || Math.abs(baseFloorZ - floor_to_build) >= fillerFloorRange.get(x).get(0)){
                    if(fillerFloorRange.get(x).get(1) < 0 || Math.abs(baseFloorZ - floor_to_build) <= fillerFloorRange.get(x).get(1)){
                        filler_template_t = fillerTemplate.get(x);
                        filler_type_t = fillerType.get(x);
                    }
                }
            }
        }
        
        if(filler_template_t == null && filler_type_t != -1) filler_template_t = new Template_Room("");
        
        if(filler_template_t != null){		
            
            Boolean dynamic_build = false;
            Template_Room dynamicBuildTemplate_t = dynamicBuildTemplate.get(0);
            for(x=0;x<dynamicBuildTemplate.size();x++){
                if(dynamicBuildFloorRange.get(x) == null){
                    dynamicBuildTemplate_t = dynamicBuildTemplate.get(x);
                }else{
                    if(dynamicBuildFloorRange.get(x).get(0) < 0 || Math.abs(baseFloorZ - floor_to_build) >= dynamicBuildFloorRange.get(x).get(0)){
                        if(dynamicBuildFloorRange.get(x).get(1) < 0 || Math.abs(baseFloorZ - floor_to_build) <= dynamicBuildFloorRange.get(x).get(1)){
                            dynamicBuildTemplate_t = dynamicBuildTemplate.get(x);
                        }
                    }
                }
            }			
            if(dynamicBuildTemplate_t != null)dynamic_build = true;
            
            int max_y = 0;
            int y = 0;
            int z = floor_to_build;
            for(x=0;x<rooms.size();x++){
                if(rooms.get(x).size() >= max_y) max_y = rooms.get(x).size();
            }
            if(z < 0){
                z = 0;
                floor_to_build = 0;
                baseFloorZ++;
                for(x=0;x<rooms.size();x++){
                    for(y=max_y - 1;y>=0;y--){
                        rooms.get(x).get(y).add(0,null); //rooms.get(x].get(y).unshift(null)
                    }
                }
            }
            Boolean double_up = false;
            for(x=0;x<rooms.size();x++){					
                for(y=max_y - 1;y>=0;y--){
                    if(rooms.get(x).get(y) == null)	rooms.get(x).set(y,new ArrayList<Room>());//new Array()
                    
                    if(rooms.get(x).get(y).get(z) == null){
                        Room new_room;
                        int temp_x;
                        int temp_y;
                        int temp_z;
                        if(dynamic_build && Math.random()*2 <= Math.pow((x*max_y + max_y - y)/(max_y*rooms.size()-1),2)){//shouldn't always be the first room i place...
                            new_room = dynamicBuildTemplate_t.make_room(Math.abs(baseFloorZ - floor_to_build));
                            new_room.template = filler_template_t;
                            Room next_floor_room = dynamicBuildTemplate_t.make_room((Math.abs(baseFloorZ - floor_to_build)));
                            next_floor_room.area = this;
                            next_floor_room.set_id(room_list.size());
                            room_list.add(next_floor_room);//room_list[room_list.size()] = next_floor_room
                            
                            CharAction a = new CharAction();
                            a.setName("");
                            a.set_dialogue("",0);
                            
                            Challenge c = new Challenge();
                            c.set_attack_stat(-1,1);
                            c.set_defense_stat(-1,0);
                            c.setVariability(0);
                            c.setText("");
                            RoomConsequence rcon = new RoomConsequence();//RoomConsequence
                            rcon.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
                            rcon.add_room_effect(next_floor_room);
                            if(dynamicBuildUp){
                                new_room.new_exit(next_floor_room,"Up");
                                next_floor_room.new_exit(new_room,"Down");
                                rcon.generate_new_floor(z+1);
                                rooms.get(x).get(y).add(z+1,next_floor_room); //rooms.get(x].get(y)[z+1] = next_floor_room
                            }else{
                                new_room.new_exit(next_floor_room,"Down");
                                next_floor_room.new_exit(new_room,"Up");
                                if(z-1 < 0){
                                    z++;
                                    floor_to_build++;
                                    baseFloorZ++;
                                    for(temp_x=0;temp_x<rooms.size();temp_x++){
                                        if(rooms.get(temp_x) != null){
                                            for(temp_y=max_y -1;temp_y>=0;temp_y--){
                                                if(rooms.get(temp_x).get(temp_y) != null)rooms.get(temp_x).get(temp_y).add(0,null); //rooms.get(temp_x).get(temp_y).unshift(null)
                                            }
                                        }
                                    }
                                }		
                                rcon.generate_new_floor(z-1);
                                rooms.get(x).get(y).set(z-1,next_floor_room); //rooms.get(x].get(y)[z-1] = next_floor_room
                            }
                            
                            a.addChallenge(c,rcon);
                
                            new_room.add_exit_action(next_floor_room, a);
                            
                            dynamic_build = false;
                        }else{
                            new_room = filler_template_t.make_room((Math.abs(baseFloorZ - floor_to_build)));
                        }
                        
                        new_room.area = this;
                        new_room.set_id(room_list.size());
                        room_list.add(new_room); //room_list[room_list.size()] = new_room
                        rooms.get(x).get(y).set(z, new_room); //rooms.get(x).get(y).get(z) = new_room
                        //if(z < -rooms.get(x].get(y).length) rooms.get(x].get(y)[-z] = null
                        if(z < -rooms.get(x).get(y).size()) rooms.get(x).get(y).set(-z, null);
                        
                        temp_z = z;
                        String to_path;
                        String from_path;
                        Boolean filler_connect;
                        Room temp_room;
                        
                        //filler room does single connect to other rooms
                        if(filler_type_t == single_connected_filler){
                            ArrayList<Room> connect_room_array = new ArrayList<>();//var connect_room_array:Array = null;//new Array()
                            Boolean found = false;
                            for(temp_x=x-1;temp_x<=x+1;temp_x++){
                                if(rooms.get(temp_x) != null){
                                    for(temp_y=y-1;temp_y<=y+1;temp_y++){
                                        if(rooms.get(temp_x).get(temp_y) != null && rooms.get(temp_x).get(temp_y).get(temp_z) != null && rooms.get(temp_x).get(temp_y).get(temp_z) != new_room){

                                            if(temp_x != x && temp_y != y && rooms.get(temp_x).get(y) != null && rooms.get(temp_x).get(y).get(z) != null && rooms.get(x).get(temp_y) != null && rooms.get(x).get(temp_y).get(temp_z) != null && rooms.get(temp_x).get(y).get(z).get_exit_id(rooms.get(x).get(temp_y).get(temp_z)) >= 0){
                                                //no overpass exits!
                                            }else{
                                                temp_room = rooms.get(temp_x).get(temp_y).get(temp_z);
                                                filler_connect = true;
                                                if(temp_room.template != null){
                                                    filler_connect = temp_room.template.get_filler_connect();
                                                }
                                                if(filler_connect){
                                                    connect_room_array.add(temp_room); //connect_room_array[connect_room_array.length] = temp_room
                                                }
                                            }
                                            
                                        }
                                    }
                                }
                            }
                            int rand_room = -1;
                            if(double_up){
                                for(temp_x=0;temp_x<connect_room_array.size();temp_x++){
                                    if(connect_room_array.get(temp_x).template != new_room.template){
                                        rand_room = temp_x;
                                        break;
                                    }
                                }
                            }
                            if(rand_room<0)rand_room = (int)Math.round(Math.random()*(connect_room_array.size()-1));
                            
                            while(connect_room_array.size() > 0 && !found){
                                Room connect_room = connect_room_array.get(rand_room);
                                int[] temp = find_room(connect_room);
                                to_path = get_direction(temp[0], temp[1], temp[2], x, y, z);
                                from_path = get_direction(x, y, z, temp[0], temp[1], temp[2]);
                                if(connect_room.new_exit(new_room, to_path) != -1){
                                    new_room.new_exit(connect_room, from_path);
                                    if(double_up && new_room.template != connect_room.template){
                                        double_up = false;
                                    }else{
                                        found = true;
                                    }
                                }else{
                                    connect_room_array.remove(rand_room); //connect_room_array = connect_room_array.slice(0,rand_room).concat(connect_room_array.slice(rand_room+1,connect_room_array.length))
                                }
                            
                                rand_room = (int)Math.round(Math.random()*(connect_room_array.size()-1));
                                if(new_room.exits.size() > 0 && !found){ 
                                    while(connect_room_array.size() > 0 && connect_room_array.get(rand_room).template != new_room.template){
                                        //connect_room_array = connect_room_array.slice(0,rand_room).concat(connect_room_array.slice(rand_room+1,connect_room_array.length))
                                        connect_room_array.remove(rand_room);
                                        rand_room = (int)Math.round(Math.random()*(connect_room_array.size()-1));
                                    }
                                }							
                            }
                            
                            if(!found){
                                //thinking our next room to have 2 options takes both, instead of just one...
                                double_up = true;
                            }							
                        }else if(filler_type_t == fully_connected_filler){
                            //filler room completely connects to other filler rooms
                            //TODO unused?
                            //Boolean all_populated = true
                            for(temp_x=x-1;temp_x<=x+1;temp_x++){
                                temp_y = y - 1;
                                if(rooms.get(temp_x) != null){
                                    for(temp_y=y-1;temp_y<=y+1;temp_y++){
                                        if(rooms.get(temp_x).get(temp_y) != null){
                                            if(rooms.get(temp_x).get(temp_y).get(temp_z) != null){
                                                temp_room = rooms.get(temp_x).get(temp_y).get(temp_z);
                                                filler_connect = true;
                                                if(temp_room.template != null){
                                                    filler_connect = temp_room.template.get_filler_connect();
                                                }
                                                if(temp_room != new_room && filler_connect){
                                                    to_path = get_direction(temp_x, temp_y, temp_z, x, y, z);
                                                    from_path = get_direction(x, y, z, temp_x, temp_y, temp_z);
                                                    //these exits are coming out wrong when we have multiple z levels on the edge of a map
                                                    if(filler_template_t.hidden_exit_action != null){
                                                        
                                                        if(temp_room.description.equals(filler_template_t.description) || (temp_room.template != null && temp_room.template.description.equals(filler_template_t.description))){
                                                            //check if we're making an overpass exit over a nonfiller path...
                                                            if(temp_x != x && temp_y != y && rooms.get(temp_x).get(y) != null && rooms.get(temp_x).get(y).get(z) != null && rooms.get(x).get(temp_y) != null && rooms.get(x).get(temp_y).get(temp_z) != null && !rooms.get(temp_x).get(y).get(z).description.equals(filler_template_t.description) && !rooms.get(x).get(temp_y).get(temp_z).description.equals(filler_template_t.description) && rooms.get(temp_x).get(y).get(z).get_exit_id(rooms.get(x).get(temp_y).get(temp_z)) >= 0){
                                                            //TODO can we invert this, with boolean algebra? and simplify by extracting to boolean vars?    
                                                            }else{
                                                           
                                                                if(temp_room.new_exit(new_room, to_path) != -1){
                                                                    new_room.new_exit(temp_room, from_path);
                                                                    if(temp_x < 0)LOGGER.info("(Area)Failed to create a filler room at " + x + "," + y + "," + z + ":" + temp_x + "," + temp_y + "," + temp_z);
                                                                }
                                                                
                                                            }
                                                        }else{
                                                            //check to see if the exit is already populated
                                                            Boolean good_exit = false;
                                                            ArrayList<String> avail_exits = new_room.template.get_avail_exits(temp_room);
                                                            int temp_str_count = 0;
                                                            for(temp_str_count=0;temp_str_count<avail_exits.size();temp_str_count++){
                                                                if(to_path.equals(avail_exits.get(temp_str_count))){
                                                                    good_exit = true;
                                                                    break;
                                                                }
                                                            }
                                                            
                                                            if (good_exit){
                                                                
                                                                if(temp_x != x && temp_y != y && rooms.get(temp_x).get(y) != null &&
                                                                 rooms.get(temp_x).get(y).get(z) != null && rooms.get(x).get(temp_y) != null && 
                                                                 rooms.get(x).get(temp_y).get(temp_z) != null && !rooms.get(temp_x).get(y).get(z).description.equals(filler_template_t.description)
                                                                 && !rooms.get(x).get(temp_y).get(temp_z).description.equals(filler_template_t.description) &&
                                                                  rooms.get(temp_x).get(y).get(z).get_exit_id(rooms.get(x).get(temp_y).get(temp_z)) >= 0){
                                                                
                                                                }else{
                                                                    if(temp_room.template != null && (temp_room.template.exit_actions.get(0) != null || temp_room.template.hidden_exit_action != null)){
                                                                       if(temp_room.template.exit_actions.get(0) != null){
                                                                           if(new_room.new_exit(temp_room, from_path) != -1){
                                                                                temp_room.new_exit(new_room, to_path);
                                                                            }
                                                                       }else{
                                                                           LOGGER.info("(Area.filler_area)Should be connecting two filler rooms via hidden exits... doing nothing instead");
                                                                       }
                                                                    }else{
                                                                        if(new_room.new_exit(temp_room, from_path) != -1){
                                                                            //add the hidden exit to the non-filler room
                                                                            Area.generate_filler_exit_action(temp_room, new_room, to_path, filler_template_t.hidden_exit_action, filler_template_t.hidden_exit_challenge, filler_template_t.hidden_exit_consequence);
                                                                        }
                                                                    }
                                                                }
                                                            }		
                                                            														
                                                        }
                                                        														
                                                    }else{
                                                        
                                                        if(temp_room.new_exit(new_room, to_path) != -1){
                                                            new_room.new_exit(temp_room, from_path);
                                                            
                                                        }
                                                        
                                                    }														
                                                }													
                                            }												
                                        }											
                                    }										
                                }else if(temp_y < max_y && temp_x<rooms.size() && temp_y >= 0 && temp_x >= 0 && rooms.get(temp_x).get(temp_y) == null){
                                    //all_populated = false
                                    //TODO also unused?
                                }									
                            }								
                        }							
                    }						
                    if(rooms.get(x).get(y).get(z) == null)LOGGER.info("(Area.filler_area)Ok, I've messed up trying to place a room at " + x + "," + y + "," + z);
                }					
            }				
            check_connections(floor_to_build);
        }else{
            LOGGER.info("(Area.filler_area)Huh... just tried to make a filler area for " + this.get_description() + " but couldn't find a template.");
        }
    }
    
    public static CharAction generate_filler_exit_action(Room r,Room move_room,String path,CharAction exit_action,Challenge exit_challenge,Consequence exit_consequence){//was Action
        //exit_action was Action
        CharAction act= new CharAction();
        act.copyCharAction(exit_action);
        //TODO

        //check if the action already exists
        int count = 0;
        if(r!= null){
            for(count=0;count<r.actions.size();count++){//was .length
                if(act.name.indexOf(pathPlaceHldr) > -1){
                    /*may not want to do this if the exits are meant to be unique....
                    if(rooms.get(temp_x).get(temp_y).actions[count].name.indexOf(act.name.slice(0,act.name.indexOf(pathPlaceHldr))) > -1){
                        act = rooms.get(temp_x).get(temp_y).actions[count];
                        break;
                    }*/
                }else if(r.actions.get(count).name.equals(act.name)){
                        act = r.actions.get(count);
                        break;
                }
            }
        }
        
        Challenge chall = new Challenge();
        chall.clone(exit_challenge);
        
        chall.setText(chall.getText().replace(pathPlaceHldr, path));
        
        Consequence conseq= (Consequence)exit_consequence.copyConsequence();

        if(conseq instanceof RoomConsequence){//was is
            ((RoomConsequence) conseq ).add_room_effect(move_room);//as
            //conseq.add_room_effect(move_room);
            //TODO one immediately above
        }
        
        int con_count = 0;
        
        for(con_count=0;con_count<conseq.consequenceDescription.size();con_count++){
            conseq.consequenceDescription.set(con_count, conseq.consequenceDescription.get(con_count).replace(pathPlaceHldr, path));
        }
        
        for(con_count=0;con_count<conseq.consequenceDescription.size();con_count++){
            conseq.consequenceDescription.set(con_count, conseq.consequenceDescription.get(con_count).replace(pathPlaceHldr, path));
        }

                                                                                                                                
        act.addChallenge(chall, conseq);
        
        act.name = act.name.replace(pathPlaceHldr, path);
        if(act.dialogue == null || act.dialogue.equals("null")){
            act.set_dialogue("</c" + (act.challenges.size() - 1) + ">");//was .length for challenges
        }else{
            act.dialogue = act.dialogue.replace(pathPlaceHldr, path);
        }
        if(r != null){
            if(act != r.actions.get(count)){//was just [count]
                r.addAction(act);
                r.set_description(r.description + "<a" + (r.actions.size()-1 - 1) +">");//was .length
            }else{
                act.set_dialogue(act.dialogue + "\n</c" + (act.challenges.size() - 1) + ">");//was .length
            }
        }			
        return act;
    }
    
    public void remove_empty_edges(){
        Boolean top_x_good = false;
        Boolean bottom_x_good = false;
        Boolean left_y_good = false;
        Boolean right_y_good = false;
        int max_y = 0;
        int x;
        int y=0;
        int z=0;
        for(x=0;x<rooms.size();x++){
            if(rooms.get(x) != null&&rooms.get(x).size() >= max_y){
                max_y = rooms.get(x).size();
            }
        }
        for(x=0;x<rooms.size();x++){
            if(x == 0 || x == rooms.size() - 1){
                for(y=0;y<max_y;y++){
                    if(rooms.get(x) != null && rooms.get(x).get(y) != null){
                        for(z=0;z<rooms.get(x).get(y).size();z++){
                            if(rooms.get(x).get(y).get(z) != null){
                                if(x == 0){
                                    left_y_good = true;
                                }else{
                                    right_y_good = true;
                                }
                                break;
                            }
                        }
                        if(left_y_good && right_y_good)break;
                    }
                }
            }
            if(rooms.get(x) != null && rooms.get(x).get(0) != null){
                for(z=0;z<rooms.get(x).get(0).size();z++){
                    if(rooms.get(x).get(0).get(z) != null){
                        bottom_x_good = true;
                        break;
                    }
                }
            }
            if(rooms.get(x) != null && rooms.get(x).get(max_y-1) != null){
                for(z=0;z<rooms.get(x).get(max_y-1).size();z++){
                    if(rooms.get(x).get(max_y-1).get(z) != null){
                        top_x_good = true;
                        break;
                    }
                }
            }
        }
        
        if(!top_x_good){
            for(x=0;x<rooms.size();x++){
                if(rooms.get(x) != null && rooms.get(x).size() > max_y-1)rooms.get(x).remove(rooms.get(x).size());//TODO figure out if truly [x].pop()
            }
        }
        
        if(!bottom_x_good){//actually right side of the map
            for(x=0;x<rooms.size();x++){
                if(rooms.get(x) != null)rooms.get(x).remove(0);//TODO figure outif this is [x].shift()
            }
        }
        
        if(!left_y_good){
            rooms.remove(0);//.shift()
        }
        
        if(!right_y_good){
            rooms.remove(rooms.size());//.pop()
        }
    }
    public void check_connections(){
        check_connections(-2,null,null);
    }
    public void check_connections(int floor_to_check){
        check_connections(floor_to_check,null,null);
    }
    public void check_connections(int floor_to_check,ArrayList<Room> connected_rooms){
        check_connections(floor_to_check, connected_rooms, null);
    }
    public void check_connections(int floor_to_check,ArrayList<Room> connected_rooms,ArrayList<Room> unconnected_rooms){
        //floor_to_check was -2, connected_rooms was null, unconnected rooms was null
        if(connected_rooms == null){
            connected_rooms = new ArrayList<>();//new Array()
            unconnected_rooms = new ArrayList<>();//new Array()
            if(floor_to_check < 0){
                //unconnected_rooms = unconnected_rooms.concat(room_list)
                unconnected_rooms.addAll(room_list);
            }else{
                
                for(int x= 0;x<rooms.size();x++){
                   
                    for(int y=0;y<rooms.get(x).size();y++){
                        if(rooms.get(x).get(y).get(floor_to_check) != null)unconnected_rooms.add(rooms.get(x).get(y).get(floor_to_check));//unconnected_rooms[unconnected_rooms.length] = rooms.get(x).get(y).get(floor_to_check)
                    }
                }
            }
            
           
            for(int j=0;j<unconnected_rooms.size();j++){
                
                if(unconnected_rooms.get(j).template != null && (unconnected_rooms.get(j).template.unconnected || !unconnected_rooms.get(j).template.get_filler_connect())){
                    //unconnected_rooms = unconnected_rooms.slice(0,j).concat(unconnected_rooms.slice(j+1,unconnected_rooms.length))
                    unconnected_rooms.remove(j);
                    j--;
                }
                
            }			
            
            connected_rooms.add(unconnected_rooms.remove(unconnected_rooms.size()));//TODO check off by 1 //connected_rooms[connected_rooms.length] = unconnected_rooms.pop()
        }else if(unconnected_rooms == null){
            unconnected_rooms = null;//new Array()
        }		
    
        int current_room = connected_rooms.size() - 1;
        while(current_room < connected_rooms.size()){
            
            for(int i=0;i<connected_rooms.get(current_room).exits.size();i++){
                
                for(int j=0;j<unconnected_rooms.size();j++){
                    if(unconnected_rooms.get(j) == connected_rooms.get(current_room).exits.get(i)){
                        connected_rooms.add(unconnected_rooms.get(j)); //connected_rooms[connected_rooms.size()] = unconnected_rooms.get(j)
                        unconnected_rooms.remove(j); //unconnected_rooms = unconnected_rooms.slice(0,j).concat(unconnected_rooms.slice(j+1,unconnected_rooms.length))

                        break;
                    }						
                }
            }
            current_room++;
        }		
    
        if(unconnected_rooms.size()>0){
            //connect a room from connected_rooms and unconnected_rooms, then run check_connections() again
            Boolean found = false;
            
            for(int i=0;i<connected_rooms.size();i++){
                int[] temp_loc1= find_room(connected_rooms.get(i));
                for(int j=0;j<unconnected_rooms.size();j++){
                    int[] temp_loc2 = find_room(unconnected_rooms.get(j));
                    if(temp_loc1[2] == temp_loc2[2] && Math.abs(temp_loc1[0] - temp_loc2[0]) <= 1 && Math.abs(temp_loc1[1] - temp_loc2[1]) <= 1){//all .get(x) were [x]
                        
                        if(unconnected_rooms.get(j).get_exit_id(connected_rooms.get(i)) < 0 && 
                        (rooms.get(temp_loc1[0]).get(temp_loc2[1]).get(temp_loc1[2])!= null && 
                        rooms.get(temp_loc2[0]).get(temp_loc1[1]).get(temp_loc1[2]) != null)){ //&& 
                        //rooms[temp_loc1.get(0)][temp_loc2.get(1)][temp_loc1.get(2)].get_exit_id(rooms[temp_loc2.get(0)][temp_loc1.get(1)][temp_loc1.get(2)]) < 0)){
                            //need a new connection
                            connected_rooms.get(i).new_exit(unconnected_rooms.get(j), get_direction(temp_loc1[0],temp_loc1[1],temp_loc1[2],temp_loc2[0],temp_loc2[1], temp_loc2[2]));
                            unconnected_rooms.get(j).new_exit(connected_rooms.get(i), get_direction(temp_loc2[0],temp_loc2[1], temp_loc2[2],temp_loc1[0],temp_loc1[1],temp_loc1[2]));
                        }
                        
                        connected_rooms.add(unconnected_rooms.get(j)); //connected_rooms[connected_rooms.length] = unconnected_rooms.get(j)
                        unconnected_rooms.remove(j);//unconnected_rooms = unconnected_rooms.slice(0,j).concat(unconnected_rooms.slice(j+1,unconnected_rooms.length))
                        found = true;							
                    }
                }
                if(found)break;
            }				
            if(found)check_connections(floor_to_check, connected_rooms, unconnected_rooms);				
        }
    }
    
    public void finalizeThis(){
        int max_y = 0;
        int x = 0;
        int y = 0;
        int z = baseFloorZ;
        for(x=0;x<rooms.size();x++){
            /*
            if(rooms.get(x) != null){
                if(rooms.get(x).size() >= max_y) max_y = rooms.get(x).size();
            }
            */
            if(rooms.get(x) != null && rooms.get(x).size() >= max_y){
                max_y = rooms.get(x).size();//TODO Verify same as above!
            }

        }
        
        for(x=0;x<rooms.size();x++){
            for(y = max_y - 1;y>=0;y--){
                if(rooms.get(x).get(y) != null){
                    if(rooms.get(x).get(y).get(z) == null){
                        if(fillerTemplate.get(0) != null){
                            LOGGER.info("(AREA) found an empty space in area " + get_description() + " despite a filler template at " + x + "," + y + "," + z);
                        }else{
                            
                        }
                    }else{
                        Room r = rooms.get(x).get(y).get(z);
                        
                        if(r.template != null){
                            if(r.template.get_propagating_description_distance() > 0){
                                int temp_x = x - r.template.get_propagating_description_distance();
                                for(temp_x= x - r.template.get_propagating_description_distance();temp_x <= x + r.template.get_propagating_description_distance();temp_x++){
                                    int temp_y = y - r.template.get_propagating_description_distance(); 
                                    int temp_z = 0;
                                    for(temp_y=y - r.template.get_propagating_description_distance();temp_y <= y + r.template.get_propagating_description_distance();temp_y++){
                                        if(temp_x == x && temp_y == y) continue;
                                        if(rooms.get(temp_x) != null){
                                            if(rooms.get(temp_x).get(temp_y) != null){
                                                if(rooms.get(temp_x).get(temp_y).get(temp_z) != null){
                                                    Room prop_room= rooms.get(temp_x).get(temp_y).get(temp_z);
                                                    String to_path = get_direction(temp_x, temp_y, temp_z, x, y, z);
                                                    
                                                    if(r.template.get_propagating_to_template()){
                                                        if(prop_room.template == r.template){
                                                            //need to check and make sure the exit actually exists in this case
                                                            if(prop_room.get_exit_id(r) >= 0){
                                                                
                                                                //we can have multiples of this... just to make things fun...
                                                                String temp_string = r.template.get_propagating_description();
                                                                //temp_string = temp_string.slice(0, temp_string.indexOf(pathPlaceHldr))
                                                                temp_string = temp_string.substring(0,temp_string.indexOf(pathPlaceHldr));
                                                                if(prop_room.description.indexOf(temp_string) >=0){//TODO all above and below string slices
                                                                    //String multi_desc = prop_room.description.slice(0,prop_room.description.indexOf(temp_string))
                                                                    String multi_desc = prop_room.description.substring(0,prop_room.description.indexOf(temp_string));
                                                                    //need to find out what the previous path was....
                                                                    //temp_string = prop_room.description.slice(multi_desc.length() + temp_string.length(), prop_room.description.length())
                                                                    temp_string = prop_room.description.substring(multi_desc.length() + temp_string.length(), prop_room.description.length());
                                                                    String template_end = r.template.get_propagating_description();
                                                                    //template_end = template_end.slice(template_end.indexOf(pathPlaceHldr) + 7, template_end.length())
                                                                    template_end = template_end.substring(template_end.indexOf(pathPlaceHldr) + 7, template_end.length());

                                                                    //String previous_path = temp_string.slice(0, temp_string.indexOf(template_end))
                                                                    String previous_path = temp_string.substring(0, temp_string.indexOf(template_end));
                                                                    
                                                                    if(previous_path.indexOf(to_path) < 0){
                                                                        if(previous_path.indexOf("and") >= 0){
                                                                            //temp_string = previous_path.slice(0, previous_path.indexOf(" and ")) + ", " + previous_path.slice(previous_path.indexOf(" and ") + 5, previous_path.length) + " and " + to_path
                                                                            temp_string = previous_path.substring(0, previous_path.indexOf(" and ")) + ", " + previous_path.substring(previous_path.indexOf(" and ") + 5, previous_path.length()) + " and " + to_path;
                                                                        }else{
                                                                            temp_string = previous_path + " and " + to_path;
                                                                        }
                                                                                                                                    
                                                                        //prop_room.set_description(multi_desc + r.template.get_propagating_description().replace(pathPlaceHldr, temp_string) + prop_room.description.slice(prop_room.description.indexOf(template_end,multi_desc.length)+template_end.length,prop_room.description.length))
                                                                        prop_room.set_description(multi_desc + r.template.get_propagating_description().replace(pathPlaceHldr, temp_string) + prop_room.description.substring(prop_room.description.indexOf(template_end,multi_desc.length())+template_end.length(),prop_room.description.length()));
                                                                    }
                                                                }else{
                                                                    prop_room.set_description(rooms.get(temp_x).get(temp_y).get(temp_z).description + "\n" + r.template.get_propagating_description().replace(pathPlaceHldr, to_path));
                                                                }
                                                                
                                                            }
                                                        }
                                                    }else{
                                                        
                                                        if(prop_room.template != r.template){
                                                            String temp_string = r.template.get_propagating_description();
                                                            //temp_string = temp_string.slice(0, temp_string.indexOf(pathPlaceHldr))
                                                            temp_string = temp_string.substring(0, temp_string.indexOf(pathPlaceHldr));
                                                            
                                                            if(prop_room.description.indexOf(temp_string) >=0){
                                                                //String multi_desc = prop_room.description.slice(0,prop_room.description.indexOf(temp_string))
                                                                String multi_desc = prop_room.description.substring(0,prop_room.description.indexOf(temp_string));
                                                                
                                                                //need to find out what the previous path was....
                                                                //temp_string = prop_room.description.slice(multi_desc.length() + temp_string.length(), prop_room.description.length())
                                                                temp_string = prop_room.description.substring(multi_desc.length() + temp_string.length(), prop_room.description.length());
                                                                String template_end = r.template.get_propagating_description();
                                                                //template_end = template_end.slice(template_end.indexOf(pathPlaceHldr) + 7, template_end.length())
                                                                template_end = template_end.substring(template_end.indexOf(pathPlaceHldr) + 7, template_end.length());
                                                                
                                                                //String previous_path = temp_string.slice(0, temp_string.indexOf(template_end))
                                                                String previous_path = temp_string.substring(0, temp_string.indexOf(template_end));
                                                                
                                                                if(previous_path.indexOf(to_path) < 0){
                                                                    if(previous_path.indexOf("and") >= 0){
                                                                        //temp_string = previous_path.slice(0, previous_path.indexOf(" and ")) + ", " + previous_path.slice(previous_path.indexOf(" and ") + 5, previous_path.length) + " and " + to_path
                                                                        temp_string = previous_path.substring(0, previous_path.indexOf(" and ")) + ", " + previous_path.substring(previous_path.indexOf(" and ") + 5, previous_path.length()) + " and " + to_path;
                                                                    }else{
                                                                        temp_string = previous_path + " and " + to_path;
                                                                    }
                                                                                                                                
                                                                    //prop_room.set_description(multi_desc + r.template.get_propagating_description().replace(pathPlaceHldr, temp_string) + prop_room.description.slice(prop_room.description.indexOf(template_end,multi_desc.length())+template_end.length(),prop_room.description.length()))
                                                                    prop_room.set_description(multi_desc + r.template.get_propagating_description().replace(pathPlaceHldr, temp_string) + prop_room.description.substring(prop_room.description.indexOf(template_end,multi_desc.length())+template_end.length(),prop_room.description.length()));
                                                                }
                                                            }else{
                                                                prop_room.set_description(rooms.get(temp_x).get(temp_y).get(temp_z).description + "\n" + r.template.get_propagating_description().replace(pathPlaceHldr, to_path));
                                                            }
                                                        }
                                                        
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        //check for duplicate rooms in room_list
        for(int i=0;i<room_list.size();i++){//was .length
            if(room_list.get(i).id != i)room_list.get(i).id = i;
            for(int j = i+1;j<room_list.size();j++){
                if(room_list.get(i)== room_list.get(j)){
                    LOGGER.info("(Area)We have the same room multiple times in room list in Area " + get_description() + ". " + i + " " + j);
                    //if(room_list.get(i).template == filler_template) LOGGER.info("And it looks like a filler room");
                    LOGGER.info("(Area)Doing absolutely nothing about it");
                }
            }
        }
        
    }
    public String create_map_piece(){
        return create_map_piece(null,null,null,0);
    }
    public String create_map_piece(Room r,Character c,Boolean mini_map,int floor_num){
        //r was null, c was null, mini_map was null, floornum was 0
        int k = 0;
        //var temp:Array = new Array(" "," "," ","\n"," "," "," ","\n"," "," "," ")	
        String[] temp = new String[]{" "," "," ","\n"," "," "," ","\n"," "," "," "};
        
        if(r != null){
            int colour;//was uint
            if(r.template != null){
                colour = r.template.get_map_room_colour();
            }else{
                colour = 0xFFFFFF;
            }
            
            String room_symbol = "O";
            if(!get_legend_id(r.custom_name,floor_num,true).equals("#"))room_symbol = get_legend_id(r.custom_name,floor_num,true);
            
            temp[5] = "<colour=" + Integer.toString(colour) + ">" + room_symbol;
            
            if(r.found() && !mini_map){
                temp[5] = "<a href=\"event:quickmove," + Integer.toString(r.id) +"," + Integer.toString(world.get_area_id(this)) +"\" colour=" + Integer.toString(colour) + ">"+ room_symbol+ "</a>";
            }else if(c != null && mini_map){
                if(c.location.get_exit_id(r) >= 0){
                    temp[5] = "<a href=\"event:go_to_new_room," + c.location.get_exit_id(r) +"\" colour=" + Integer.toString(colour) + ">"+ room_symbol+ "</a>";
                }
            }
            
            if(fillerTemplate != null){
                /*TODO what?!
                if(r.description == fillerTemplate.description){
                    room_symbol = "F";
                    temp[5] = "<colour=" + String(colour) + ">" + room_symbol;
                    if(r.found()&& !mini_map){
                        temp[5] = "<a href=\"event:quickmove," + String(r.id)  +"," + String(world.get_area_id(this)) +"\" colour=" + String(colour) + ">"+ room_symbol+ "</a>";
                    }else if(c != null && mini_map){
                        if(c.location.get_exit_id(r) >= 0){
                            temp[5] = "<a href=\"event:go_to_new_room," + c.location.get_exit_id(r) +"\" colour=" + String(colour) + ">"+ room_symbol+ "</a>";
                        }
                    }
                }
                */
            }
            
            for (k=0;k<r.exitNames.length;k++){
                if(r.exitNames[k].equals("North")){
                    temp[1] = "|";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[1] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("East")){
                    temp[6] = "-";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[6] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("West")){
                    temp[4] = "-";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[4] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("North-East")){
                    temp[2] = "/";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[2] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("North-West")){
                    temp[0] = "\\";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[0] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("South-West")){
                    temp[8] = "/";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[8] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("South-East")){
                    temp[10] = "\\";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[10] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else if(r.exitNames[k].equals("South")){
                    temp[9] = "|";
                    if(r.area != r.exits.get(k).area && r.exits.get(k).area != null){
                        temp[9] = get_legend_id(r.exits.get(k).area.description,floor_num);
                    }
                }else{
                    room_symbol = "@";
                    temp[5] = "<colour=" + Integer.toString(colour) + ">" + room_symbol;
                    if(r.found()&& !mini_map){
                        temp[5] = "<a href=\"event:quickmove," + Integer.toString(r.id) +"," + Integer.toString(world.get_area_id(this)) +"\" colour=" + Integer.toString(colour) + ">"+ room_symbol+ "</a>";
                    }else if(c != null && mini_map){
                        if(c.location.get_exit_id(r) >= 0){
                            temp[5] = "<a href=\"event:go_to_new_room," + c.location.get_exit_id(r) +"\" colour=" + Integer.toString(colour) + ">"+ room_symbol+ "</a>";
                        }
                    }
                }
            }
            if(c != null && r.getContentID(c) >= 0){
                room_symbol = "P";
                temp[5] = "<colour=" + Integer.toString(colour) + ">" + room_symbol;
            }
        }
        
        int j = 0;
        String ret = "";
        for (j=0;j<temp.length;j++){
            ret += temp[j];
        }
                    
        return ret;
    }
    
    
    public String get_legend(int floor_num,Character c){
        String ret = "";
        int i = 0;
        for(i=0;i<legend.size();i++){
            if(legendFloor.get(i) == floor_num)ret += (i+1) +": "+ legend.get(i)+"\n";
        }
        if(c != null && c.location != null){
            if(!get_legend_id(c.location.custom_name,floor_num,true).equals("#")){
                ret += "\n<font color='#0000FF'><a href=\"event:remove_legend_mark\">Remove Custom Marker</a></font>";
            }else{
                ret += "\n<font color='#0000FF'><a href=\"event:new_legend_mark\">Create Custom Marker</a></font>";
            }
        }
        
        return ret;
    }
    public String get_legend_id(String s,int floor_num){
        return get_legend_id(s, floor_num,null);
    }
    public String get_legend_id(String s,int floor_num,Boolean no_create){
        //no_create was false
        if(!s.equals("")){
            Boolean found = false;
            int j = 0;
            for(j=0;j<legend.size();j++){
                if(legend.get(j).equals(s)){
                    found = true;
                    break;
                }
            }
            if(found){
                return Integer.toString(j + 1);
            }else{
                if(!no_create){
                    legend.set(legend.size(), s);
                    legendFloor.set(legendFloor.size(), floor_num);
                    return Integer.toString(legend.size());
                }
            }
        }
        
        return "#";
    }
    
    public String create_legend_mark(Character c, String s){
        //s was "Custom Mark"
        String ret = "";
        
        if(get_legend_id(s,find_room(c.location)[2])!="#"){
            ret = "Custom marker created.";
            c.location.set_custom_name(s);
        }else{
            ret = "Custom marker creation failed!";
        }
        
        ret += "\n\n<font color='#0000FF'><a href=\"event:show_map\">back</a></font>";
        return ret;
    }
    
    public String remove_legend_mark(Character c){
        String retString = "";
        
        retString = "Custom Marker Removed.\n\n<font color='#0000FF'><a href=\"event:show_map\">back</a></font>";
        //may need to remove entry from legend and legend_floor arrays... only real way to know is to check if this rooms custom name is used anywhere else on the floor
        Boolean no_remove= false;
        int i = 0;
        
        for(i=0;i<room_list.size();i++){
            if(c.location != room_list.get(i)&& room_list.get(i).custom_name.equals(c.location.custom_name)){
                no_remove = true;
                break;
            }
        }
        
        if(!no_remove){
            for(i=0;i<legend.size();i++){
                
                if(legend.get(i).equals(c.location.custom_name)){
                    for(int j=i;j<legend.size()-1;j++){
                        legend.set(j, legend.get(j+1));
                    }
                    //legend.size()--;//was length, still makes no sense
                    //TODO WAT
                    break;
                }
                
            }
        }
        
        c.location.set_custom_name("");
        
        return retString;
    }
    
    //now we need to make it so the map makes sense, make a map, etc.
    public String get_map(int gen_flag,Character c,int sight,int show_location,Boolean mini_map){
        //gen_flag was 0, c was null, sight was -1, show_location was 0, mini_map was false
        if (!map.equals("") && gen_flag == 0) return map;
        
        ArrayList<ArrayList<ArrayList<String>>> map_pieces = new ArrayList<>();//new Array()
        map = "";
        int x;// = map_pieces.length-1, commented before
        int y;
        int z = baseFloorZ;
        int place_holder = 0;
        
        int max_y = 0;
        for(x=0;x<rooms.size();x++){     
            map_pieces.set(x, new ArrayList<ArrayList<String>>());//map_pieces[x] = new ArrayList<String>()//new Array()
            map_pieces.get(x).set(rooms.get(x).size() - 1,null);//map_pieces[x][rooms.get(x].length - 1] = null
            if(rooms.get(x).size() >= max_y) max_y = rooms.get(x).size();
        }
        
        int char_x = -1;
        int char_y = -1;
        int char_z = -1;
        int max_x = rooms.size() - 1;
        int min_x = 0;
        int min_y = 0;
        Boolean start_again = false;
        
        if(sight == -1) sight = Math.max(max_x, max_y);
        
        if(c != null){
            if(c.location != null){
                int[] temp_a = find_room(c.location);
                if(temp_a != null){
                    char_x = temp_a[0];//[0]
                    char_y = temp_a[1];//[1]
                    char_z = temp_a[2];//[2]
                    LOGGER.info("(Area)Found Character at " + char_x + "," + char_y + "," + char_z);
                    if(char_z != z) z = char_z;
                }
            }
        }
        
        for (x=min_x;x<rooms.size();x++){
                    
            for(y=max_y;y>=min_y;y--){
                ArrayList<String> map_array = new ArrayList<>();//new Array()
                ArrayList<String> map_piece_array = new ArrayList<>();//new Array()
                map_array = new ArrayList<>(Arrays.asList(map.split("\n")));
                if(rooms.get(x) == null){
                    start_again = true;
                    break;
                }
                
                if (rooms.get(x).get(y) == null){
                    map_piece_array = new ArrayList<>(Arrays.asList(create_map_piece().split("\n")));
                }else{
                    if(rooms.get(x) != null){
                        if(rooms.get(x).get(y) != null){
                            map_pieces.get(x).set(y, new ArrayList<String>());//new Array()
                            if(rooms.get(x).get(y).get(z) != null){
                                //if(char_y != -1){//Was commented before
                                    
                                    if((char_x - sight < x && x < char_x + sight && char_y - sight < y && y < char_y + sight) || (rooms.get(x).get(y).get(z).found() && !mini_map )){
                                        if(gen_flag == 1 &&  show_location != 0){
                                            //map_pieces[x].get(y).get(z) = create_map_piece(rooms.get(x].get(y).get(z),c,mini_map,z)
                                        }else if(gen_flag == 1){
                                            if(show_location == 0){
                                                //map_pieces[x].get(y).get(z) = create_map_piece(rooms.get(x].get(y).get(z),null,true,z)
                                                map_pieces.get(x).get(y).set(z, create_map_piece(rooms.get(x).get(y).get(z),null,true,z));
                                            }else{
                                                //map_pieces[x].get(y).get(z) = create_map_piece(rooms.get(x].get(y).get(z),null,false,z)
                                                map_pieces.get(x).get(y).set(z, create_map_piece(rooms.get(x).get(y).get(z),null,false,z));
                                            }
                                        }else{
                                            map_pieces.get(x).get(y).set(z, create_map_piece());
                                        }
                                    
                                    
                                    
                                    }else{
                                        map_pieces.get(x).get(y).set(z, create_map_piece());											
                                    }
                                    
                                    /*}else{
                                    //map_pieces.get(x].get(y).get(z) = create_map_piece()
                                    //was commented before it turns out
                                    }*/
                            }else{
                                map_pieces.get(x).get(y).set(z, create_map_piece());
                            }
                        }
                    }
                    if(map_pieces.get(x).get(y) != null && map_pieces.get(x).get(y).get(z) != null){
                        map_piece_array = (ArrayList<String>)Arrays.asList(map_pieces.get(x).get(y).get(z).split("\n"));//map_piece_array = map_pieces[x].get(y).get(z).split("\n")
                    }else{
                        map_piece_array = (ArrayList<String>)Arrays.asList(create_map_piece().split("\n"));//map_piece_array = create_map_piece().split("\n")
                    }
                }
                int count = 0;
                
                for (count=0;count<3;count++){
                    if(map_array.get(count + place_holder) != null)	{
                        map_array.set(count + place_holder, map_array.get(count + place_holder) + map_piece_array.get(count));//map_array[count + place_holder] += map_piece_array[count]
                    }else{
                        map_array.set(count + place_holder, map_piece_array.get(count));//map_array[count + place_holder] = map_piece_array[count]
                    }
                }
                map = "";
                for(count=0;count<3 + place_holder;count++){
                    map += map_array.get(count) + "\n";
                }
            }
            if(start_again){
                start_again = !start_again;
                continue;
            }
            place_holder += 3;
            
        }
        
        
        String temp_map = "";
        
        temp_map += map;
        
        //add the legend
        if(!mini_map){
            temp_map += "\n\n\n";
            if(z >= baseFloorZ){
                temp_map += "Floor "+(z-baseFloorZ+ 1)+"\n\n";
            }else if(z < baseFloorZ){
                temp_map += "Basement "+(baseFloorZ-z)+"\n\n";
            }				
            temp_map += get_legend(z,c);
        }
        
        return temp_map;
    }
    
    public void add_room(Room e,int max_num_room){
        //max_num_room was -1
        e.area = this;
        e.set_id(room_list.size());
        if(place_room(e, null, max_num_room) >= 0){
            room_list.add(e);//room_list[room_list.size()] = e
        }
        
    }
    public Room get_random_room(){
        return get_random_room(false);
    }
    public Room get_random_room(Boolean for_area_connect){
        //was false
        int room_num;
        int min_room = 0;
        //choose rooms from that later half of the list to spread the area out - doesn't matter if you don't control the directions!
        //min_room = (int)Math.floor((room_list.size()-1)*0.6)
        //These both originally commented in original code
        room_num = min_room + (int)(Math.random()*(room_list.size()-1 - min_room));
        
        
        if(for_area_connect){
            if(room_list.get(room_num).template != null){
                if(room_list.get(room_num).template.get_no_area_exit()) return get_random_room(true);
            }
            if(room_list.get(room_num).attached_to_other_area()) return get_random_room(true);
        }
        
        return new Room();//room_list[room_num];//TODO
        
    }
    public Room[] get_edge_rooms(){
        return get_edge_rooms(0);
    }
    public Room[] get_edge_rooms(int indent){
        return get_edge_rooms(0, false);
    }
    public Room[] get_edge_rooms(int indent, Boolean skip_area_check){
        //default 0, false
        Room[] list = null;//var list:Array = null//new Array()
        int x = 0;
        int y = 0;
        int z = baseFloorZ;
        
        int max_y = 0;
        for(x=0;x<rooms.size();x++){
            if(rooms.get(x).size() > max_y) max_y = rooms.get(x).size() - 1;
        }

        for(x=0;x<rooms.size();x++){
            if(rooms.get(x - 1) == null || rooms.get(x + 1) == null){ 
                int temp = indent;
                if(rooms.get(x+1) == null) temp = -indent;
                for(y=0;y<=max_y;y++){
                    if(rooms.get(x + temp).get(y) != null){
                        
                        if(rooms.get(x + temp).get(y).get(z) != null && (!rooms.get(x + temp).get(y).get(z).attached_to_other_area() || skip_area_check)){
                            if(rooms.get(x + temp).get(y).get(z).template != null){
                                if(!rooms.get(x + temp).get(y).get(z).template.get_no_area_exit())list[list.length] = rooms.get(x + temp).get(y).get(z);
                            }else{
                                list[list.length] = rooms.get(x + temp).get(y).get(z);
                            }
                        }	
                        						
                    }
                }
            }else{
                if(rooms.get(x).get(0 + indent) != null){
                    
                    if(rooms.get(x).get(0 + indent).get(z) != null  && (!rooms.get(x).get(0 + indent).get(z).attached_to_other_area() || skip_area_check)){
                        if(rooms.get(x).get(0 + indent).get(z).template != null){
                            if(!rooms.get(x).get(0 + indent).get(z).template.get_no_area_exit())list[list.length] = rooms.get(x).get(0 + indent).get(z);
                        }else{
                            list[list.length] = rooms.get(x).get(0 + indent).get(z);
                        }  
                    }
                    
                }
                if(rooms.get(x).get(max_y - indent) != null){
                    
                    if(rooms.get(x).get(max_y - indent).get(z) != null && (!rooms.get(x).get(max_y - indent).get(z).attached_to_other_area() || skip_area_check)){
                        if(rooms.get(x).get(max_y - indent).get(z).template != null){
                            if(!rooms.get(x).get(max_y - indent).get(z).template.get_no_area_exit())list[list.length] = rooms.get(x).get(max_y - indent).get(z);
                        }else{
                            list[list.length] = rooms.get(x).get(max_y - indent).get(z);
                        }
                    }
                    
                }
            }
        }
        
        if(list == null){//was 0 in brackets
            list = new Room[0];
            if(indent>0){
                if(indent>1){
                    LOGGER.info("Area being naughty in get_edge_rooms...");
                    return list;
                }
                return get_edge_rooms(2,skip_area_check);
            }
            return get_edge_rooms(1,skip_area_check);
        }
        
        return list;
    }
    public Room get_edge_room(){
        return get_edge_room(false);
    }
    public Room get_edge_room(Boolean skip_area_check){
        //was false
        Room[] list = get_edge_rooms(0,skip_area_check);//var list:Array = get_edge_rooms(0,skip_area_check)
        int room_num;
        
        room_num = (int)Math.round(Math.random()*(list.length-1));
        
        if(list[room_num] != null)return list[room_num];
        LOGGER.info("(Area.get_edge_room)If you thought you were getting an edge room, you're probably wrong");
        return get_random_room();
    }

    public void add_room_template(Template_Room tr,ArrayList<Integer> min_max_floor){//def null
        //min_max_floor was null
        templateRooms.add(tr); //template_rooms[template_rooms.length] = tr
        templateFloorRange.add(min_max_floor); //template_floor_range[template_floor_range.length] = min_max_floor
    }
    
    public void set_filler_template(Template_Room ft,int type,ArrayList<Integer> min_max_floor){//def 0, null
        fillerTemplate.add(ft); //filler_template[filler_template.length] = ft
        fillerType.add(type); //filler_type[filler_type.length] = type
        fillerFloorRange.add(min_max_floor);//filler_floor_range[filler_floor_range.length] = min_max_floor
    }
    
    public void set_dynamicBuildTemplate(Template_Room tr,ArrayList<Integer> min_max_floor){//def null
        dynamicBuildTemplate.add(tr); //dynamicBuildTemplate[dynamicBuildTemplate.length] = tr
        dynamicBuildFloorRange.add(min_max_floor); //dynamicBuildFloorRange[dynamicBuildFloorRange.length] = min_max_floor
    }

    public void set_dynamic_build_direction(){
        dynamicBuildUp = !dynamicBuildUp;
    }
    
    public String get_all_rooms(){
        String output;
        int i;
        output = "";
        for (i = 0; i<rooms.size();i++){
            //output += rooms[i].getRoomDescription();//HOW?!
        }
        return output;
    }
    
    public void tick(Character c){
        
        current_weather_length++;
        
        if(weathers.get(current_weather) != null && current_weather_length > weathers.get(current_weather).get_min_length()){
            current_weather = (int)Math.round(Math.random()*(weathers.size()-1));
            current_weather_length = 0;
        }
        
        int npc_count = 0;
        int q;
        int i = 0;
        
        for(i=0;i<room_list.size();i++){
            /*
            if(room_list.get(i)!= null){
                String tick_happenings = "";
                //room_list[i].last_area_tick = totalActionsTaken;
                if(room_list[i].cm != null){
                    if(!room_list[i].cm.active_combat()){
                        room_list[i].cm = null;
                    }else if(room_list[i].cm.get_init(c) == -1){//see if the player is one of the participants... if not, have the fight proceed.
                        var temp_cm:Combat_manager = room_list[i].cm;
                        tick_happenings += temp_cm.fire_combat_round();
                    }
                }
                if(room_list[i].contents != null){
                    q = 0;
                    for(q;q<room_list[i].contents.length;q++){
                        if (room_list[i].contents[q] is Character){
                            var temp:Character;
                            temp = room_list[i].contents[q];
                            if(temp != c){
                                npc_count++;
                                var already_busy:Boolean = false;
                                if(room_list[i].cm != null){
                                    if(room_list[i].cm.get_init(temp) >= 0){
                                        already_busy = true;
                                    }
                                }
                                if(!temp.ai_already_moved && !already_busy){
                                    tick_happenings += temp.tick();
                                }
                                temp.ai_already_moved = !temp.ai_already_moved;//should only be doing this if moving into room[i+n]
                            }
                            
                        }else if(room_list[i].contents[q] is Item){
                            var temp_i:Item = room_list[i].contents[q];
                            temp_i.tick(room_list[i]);
                        }
                    }
                    q = 0;
                    
                    for(q=0;q<room_list[i].static_contents.length;q++){
                        if(room_list[i].static_contents[q] is Container){
                            //need to clean up bodies
                            //Container temp_cont = room_list[i].static_contents[q];
                            if(totalActionsTaken%FPGameGithub.T1_DAY == 0 && temp_cont.name == "Body"){
                                tick_happenings += "A body deteriorates into the ground.\n";
                                //doesn't drop gold, but that makes sense... whoever took the body took the gold
                                int z = 0;
                                //for(z=0;z<temp_cont.contents.length;z++){
                                    //room_list[i].new_content(temp_cont.contents.get(z));
                                //}
                                
                                room_list[i].remove_static_contents(q);
                                
                                //only clean up the oldest one
                                break;
                            }
                        }
                    }
                    
                }
                
                //room_list[i].set_last_tick(tick_happenings);
            }
            */
        }
        String npcCntOut = "(Area)Ticking area with NPC count: {}" + npc_count;
        LOGGER.info(npcCntOut);//was a LOGGER.info
        
        if(npc_count <= npcSpawnThreshold){
            if(spawnCreatures.size() > 0){
                int spawn_choice = 0;
                if(spawnCreatures.size() > 1)spawn_choice = (int)Math.round(Math.random() *(spawnCreatures.size() - 1));
                Character new_char = spawnCreatures.get(spawn_choice).gen_char();
                new_char.newLocation(new Room());//(get_random_room(), true)
                //TODO update newLocation
                
            }else{
                //use the template_rooms spawns
                Room temp_room = get_random_room();
                if(temp_room.template != null){
                    temp_room.template.spawn_creatures(temp_room);
                }
            }
        }
        
        
        totalActionsTaken++;
    }

}
