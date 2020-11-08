package fpgamegithubredux;

import java.util.ArrayList;

public class World {
		
    public ArrayList<Area> areas;//:Array
    public ArrayList<Room> starting_rooms;//:Array
    public ArrayList<Object> links;//:Array
    public ArrayList<Object> settings;//:Array
    
    private ArrayList<Boolean> already_tried_area;//:Array
    
    public World(ArrayList<Area> a,ArrayList<Room> sr,ArrayList<Object> l) {//def null,null,null
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
    /*
    public void set_settings(ArrayList<Object> settings_array){
        settings = settings_array;
    }
    
    public function add_exit_to_piece(map_piece:Array, exit_name:String):Array{			
        if(exit_name == "North"){
            map_piece[1] = "|";
        }else if(exit_name == "East"){
            map_piece[6] = "-";
        }else if(exit_name == "West"){
            map_piece[4] = "-";
        }else if(exit_name == "North-East"){
            map_piece[2] = "/";
        }else if(exit_name == "North-West"){
            map_piece[0] = "\\";
        }else if(exit_name == "South-West"){
            map_piece[8] = "/";
        }else if(exit_name == "South-East"){
            map_piece[10] = "\\";
        }else if(exit_name == "South"){
            map_piece[9] = "|";
        }else{
            map_piece[5] = "@";
        }
        
        return map_piece;
    }
    
    public function get_map(character_area:Area = null):String{
        var ret:String = "";
        
        var map_pieces:Array = new Array();
        var map:Array = make_integer_map();
        
        var i:int = 0;
        for(i;i<links.length;i++){
            if(links[i][2] == false){
                if(areas[links[i][0]].get_player_discovered()){
                    if(map_pieces[links[i][0]] != null){
                        map_pieces[links[i][0]] = add_exit_to_piece(map_pieces[links[i][0]], links[i][3]);
                    }else{
                        if(character_area == areas[links[i][0]]){
                            map_pieces[links[i][0]] = new Array(" "," "," ","\n"," ","<colour="+areas[links[i][0]].get_map_colour()+">P"," ","\n"," "," "," ");
                        }else{
                            map_pieces[links[i][0]] = new Array(" "," "," ","\n"," ","<a href=\"event:show_map," + links[i][0] +"\" colour="+areas[links[i][0]].get_map_colour()+">O</a>"," ","\n"," "," "," ");								
                        }
                        map_pieces[links[i][0]] = add_exit_to_piece(map_pieces[links[i][0]], links[i][3]);
                    }
                }
                if(areas[links[i][1]].get_player_discovered()){
                    if(map_pieces[links[i][1]] != null){
                        map_pieces[links[i][1]] = add_exit_to_piece(map_pieces[links[i][1]], links[i][4]);
                    }else{
                        if(character_area == areas[links[i][1]]){
                            map_pieces[links[i][1]] = new Array(" "," "," ","\n"," ","<colour="+areas[links[i][1]].get_map_colour()+">P"," ","\n"," "," "," ");
                        }else{
                            map_pieces[links[i][1]] = new Array(" "," "," ","\n"," ","<a href=\"event:show_map," + links[i][1] +"\" colour="+areas[links[i][1]].get_map_colour()+">O</a>"," ","\n"," "," "," ");
                        }
                        map_pieces[links[i][1]] = add_exit_to_piece(map_pieces[links[i][1]], links[i][4])
                    }
                }
            }
        }
        
        i = 0;
        for(i;i<map.length;i++){
            if(map[i] != null){
                var j:int = 0;
                for(j;j<map[i].length;j++){
                    if(map[i][j] != null){
                        map[i][j] = map_pieces[map[i][j]];
                    }
                }
            }
        }
        
        i = 0;
        
        for(i;i<map.length;i++){
            if(map[i] != null){
                var line_count:int = 0;
                for(line_count;line_count<3;line_count++){
                    j = 0;
                    for(j;j<map[i].length;j++){
                        if(map[i][j] != null){
                            if(line_count == 0){
                                ret += map[i][j][0];
                                ret += map[i][j][1];
                                ret += map[i][j][2];
                            }else if(line_count == 1){
                                ret += map[i][j][4];
                                ret += map[i][j][5];
                                ret += map[i][j][6];
                            }else if(line_count == 2){
                                ret += map[i][j][8];
                                ret += map[i][j][9];
                                ret += map[i][j][10];
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
    
    public function make_integer_map():Array{
        var map:Array = new Array();
        
        map[0] = new Array();
        
        var i:int = 0;
        for(i;i<links.length;i++){
            if(links[i][2] == false){
                var found:Boolean = false;
                var x:int = 0;
                for(x;x<map.length;x++){
                    var y:int = 0;
                    if(map[x] != null){
                        for(y;y<map[x].length;y++){
                            if(map[x][y] == links[i][0]){
                                found = true;
                                break
                            }
                        }
                    }
                    if(found) break;
                }
                                    
                var found2:Boolean = false;
                var x2:int = 0;
                for(x2;x2<map.length;x2++){
                    var y2:int = 0;
                    if(map[x2] != null){
                        for(y2;y2<map[x2].length;y2++){
                            if(map[x2][y2] == links[i][1]){
                                found2 = true;
                                break
                            }
                        }
                    }
                    if(found2) break;
                }
                
                if(!found && !found2){
                    var temp:Array = areas[links[i][0]].get_offset_by_name(links[i][3]);
                    
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    //should find empty space... 
                    var max_existing_y:int = 0;
                    x = 0;
                    for(x;x<map.length;x++){
                        if(map[x].length>max_existing_y)max_existing_y=map[x].length;
                    }
                    
                    x=0;
                    y=0;
                    if(x+temp[0] < 0)x++;
                    if(y + temp[1] < 0)y++;
                    if(map[x] == null) map[x] = new Array();
                    if(map[x+temp[0]] == null) map[x+temp[0]] = new Array();
                    while(map[x + temp[0]][y + temp[1]] != null || map[x][y] != null || (temp[0] != 0 && temp[1] != 0 && map[x+temp[0]] != null && map[x+temp[0]][y] != null && map[x][y+temp[1]] != null)){
                        if(y < max_existing_y+1){
                            y++;
                        }else{
                            x++;
                            y = 0;
                        }
                        if(y + temp[1] < 0)y++;
                        
                        if(map[x] == null) map[x] = new Array();
                        if(map[x+temp[0]] == null) map[x+temp[0]] = new Array();
                    }
                    
                    if(map[x] == null) map[x] = new Array();
                    if(map[x+temp[0]] == null) map[x+temp[0]] = new Array();
                    
                    //should be checking if the exit makes an overpass...
                    if(temp[0] != 0 && temp[1] != 0 && map[x+temp[0]] != null && map[x+temp[0]][y] != null && map[x][y+temp[1]] != null){
                        trace("Should be checking for an overpasss exit... pretty sure I found one. Skipping placement. ");
                    }else{
                        if(map[x][y] != null && map[x][y] != links[i][0])trace("(World.make_integer_map1.1)Overwriting an area...");
                        map[x][y] = links[i][0];
                        map[x+temp[0]][y+temp[1]] = links[i][1];
                    }
                }else if(found){
                    temp = areas[links[i][0]].get_offset_by_name(links[i][3]);
                    
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    
                    if(x + temp[0] < 0 || y + temp[1] < 0){
                        if(x + temp[0] < 0){
                            var count:int = map.length;
                            for(count;count>0;count--){
                                map[count] = map[count - 1];
                            }
                            map[0] = null;
                            x++;
                        }
                        
                        if(y + temp[1] < 0){
                            count = 0;
                            for(count;count<map.length;count++){
                                if(map[count] != null){
                                    var count2:int = map[count].length;
                                    for(count2;count2>0;count2--){
                                        map[count][count2] = map[count][count2 - 1];
                                    }
                                    map[count][0] = null;
                                    
                                }
                            }
                            y++;
                        }
                    }
                    
                    if(map[x+temp[0]] == null) map[x+temp[0]] = new Array();
                    if(map[x+temp[0]][y+temp[1]] != null && map[x+temp[0]][y+temp[1]] != links[i][1])trace("(World.make_integer_map2)Overwriting an area...");
                    map[x+temp[0]][y+temp[1]] = links[i][1];
                    
                }else if(found2){
                    temp = areas[links[i][1]].get_offset_by_name(links[i][4]);
                    
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    
                    if(x2 + temp[0] < 0 || y2 + temp[1] < 0){
                        if(x2 + temp[0] < 0){
                            count = map.length;
                            for(count;count>0;count--){
                                map[count] = map[count - 1];
                            }
                            map[0] = null;
                            x2++;
                        }
                        
                        if(y2 + temp[1] < 0){
                            count = 0;
                            for(count;count<map.length;count++){
                                if(map[count] != null){
                                    count2 = map[count].length;
                                    for(count2;count2>0;count2--){
                                        map[count][count2] = map[count][count2 - 1];
                                    }
                                    map[count][0] = null;
                                    
                                }
                            }
                            y2++;
                        }
                    }
                    
                    if(map[x2+temp[0]] == null) map[x2+temp[0]] = new Array();
                    if(map[x2+temp[0]][y2+temp[1]] != null)trace("(World.make_integer_map3)Overwriting an area...");
                    map[x2+temp[0]][y2+temp[1]] = links[i][0];
                    
                }
            }
        }
        
        return map;
    }
    
    public function add_area(a:Area):void{
        a.world = this;
        a.set_id(areas.length);
        areas[areas.length] = a;
        a.remove_empty_edges();
        a.check_connections();
    }
    
    public function connect_areas(i:int,k:int, r1:Room = null, r2:Room = null, sub_area_flag:Boolean = false, stay_in_edges:Boolean = false):void{
        var temp_room1:Room = null;
        var temp_room2:Room = null;
        var count:int;
        count = 0;
        for(count;count<links.length;count++){
            if((links[count][0] == i  && links[count][1] == k) || (links[count][0] == k  && links[count][1] == i))return;
        }
        
        if ( i >= 0 && k >= 0 && k < areas.length && i < areas.length){
            if(r1 == null) r1 = areas[i].get_connect_room();
            if(r2 == null) r2 = areas[k].get_connect_room();
            
            if(r1 != null && r1.area != areas[i]){
                //want to find an edge room to connect this one to....
                temp_room1 = r1;
                r1 = null;
            }
            if(r2 != null && r2.area != areas[k]){
                temp_room2 = r2;
                r2 = null;
            }
            
            if (r1 == null && r2 == null && !sub_area_flag){
                r1 = areas[i].get_edge_room(stay_in_edges);
                r2 = areas[k].get_edge_room(stay_in_edges);
                
                if(!make_area_exit_match(areas[i], areas[k], r1, r2,false,stay_in_edges)){
                    var area_room_list:Array = areas[k].get_edge_rooms(0,stay_in_edges);
                    var area_room_list2:Array = areas[i].get_edge_rooms(0,stay_in_edges);
                    
                    //chance didn't work... brute force!
                    var area_exit_list:Array = new Array();
                    var area_exit_list2:Array = new Array();
                    
                    count = 0
                    for(count;count<area_room_list.length;count++){
                        r2 = area_room_list[count];
                        area_exit_list = area_exit_list.concat(remove_existing_edge_exit(get_edge_exits(areas[k],r2), areas[k], sub_area_flag));
                        var count2:int = 0;
                        for(count2;count2<area_room_list2.length;count2++){
                            r1 = area_room_list2[count2];
                            area_exit_list2 = area_exit_list2.concat(remove_existing_edge_exit(get_edge_exits(areas[i],r1), areas[i], sub_area_flag));
                            if(make_area_exit_match(areas[i], areas[k], r1, r2,false,stay_in_edges)){
                                if(temp_room1 != null){
                                    inject_edge_room(areas[i], r1, r2, temp_room1);
                                    r1 = temp_room1;
                                }
                                if(temp_room2 != null){
                                    inject_edge_room(areas[k], r2, r1, temp_room2);
                                    r2 = temp_room2;
                                }
                                already_tried_area = new Array();
                                if(r1.get_exit_id(r2) >= 0 && r2.get_exit_id(r1) >= 0){
                                    links[links.length] = [i,k,sub_area_flag, r1.exit_names[r1.get_exit_id(r2)], r2.exit_names[r2.get_exit_id(r1)]];
                                }else{
                                    var made:Boolean = false;
                                    var count3:int = 0;
                                    for(count3;count3<r1.exits.length;count3++){
                                        if(r1.exits[count3].area == r2.area){
                                            made = true;
                                            links[links.length] = [i,k,sub_area_flag, r1.exit_names[count3], r1.exits[count3].exit_names[r1.exits[count3].get_exit_id(r1)] ];
                                            break;
                                        }
                                    }
                                    if(!made){
                                        count3 = 0;
                                        for(count3;count3<r2.exits.length;count3++){
                                            if(r2.exits[count3].area == r1.area){
                                                links[links.length] = [i,k,sub_area_flag,  r2.exits[count3].exit_names[r2.exits[count3].get_exit_id(r2)] , r2.exit_names[count3] ];
                                                break;
                                            }
                                        }
                                    }
                                    if(!made)trace("(World.connect_areas)Got me two over-world areas that are connected, but two rooms that aren't. Not sure what to do about this.")
                                }
                                return;
                            }
                        }
                    }
                    
                    if(!stay_in_edges){
                        trace('Buggrip, failed to connect areas ' + areas[i].description + ' to ' + areas[k].description);
                        trace("Despite " + area_room_list2.length + " rooms to choose from in " + areas[i].description + " and a further " + area_room_list.length + " in " + areas[k].description);
                        trace("Un-used exits in " + areas[i].description + ": " + area_exit_list2);
                        trace("Un-used exits in " + areas[k].description + ": " + area_exit_list);
                        trace("changing what area i'm connecting to.");
                    }
                    var found_area_id:int = -1;
                    var connect_area_id:int = -1;
                    var link_area_id:int = -1;
                    count = 0
                    for(count;count<links.length;count++){
                        if(!links[count][2]){
                            if(links[count][0] == i || links[count][1] == i){
                                if(found_area_id >= 0 && found_area_id != i){
                                    found_area_id = -1;
                                    break;
                                }else{
                                    found_area_id = i;
                                    connect_area_id = k;
                                }
                            }else if(links[count][0] == k || links[count][1] == k){
                                if(found_area_id >= 0 && found_area_id != k){
                                    found_area_id = -1;
                                    break;
                                }else{
                                    found_area_id = k;
                                    connect_area_id = i
                                }
                            }
                            if(links[count][0] == found_area_id){
                                link_area_id = links[count][1]
                            }else if(found_area_id >= 0){
                                link_area_id = links[count][0];
                            }	
                        }							
                    }
                    
                    if(found_area_id >= 0){
                        already_tried_area[already_tried_area.length] = found_area_id;
                        if(!already_tried_check(link_area_id))connect_areas(link_area_id,connect_area_id,null,null,false,stay_in_edges);							
                    }else{
                        trace("doesn't look like that'll work out though.");
                    }
                    
                    return;
                }
            }else {
                if(sub_area_flag){
                    //try and get an edge room for the sub-area... a random room is fine for the overworld area.
                    
                    //need to figure out which area is the sub-area, and if both areas are sub-areas, and I should be doing trying an edge to edge exit
                    var map:Array = make_integer_map();
                    var found1:Boolean = false;
                    var found2:Boolean = false;
                    var x:int = 0;
                    for(x;x<map.length;x++){
                        var y:int = 0;
                        if(map[x] != null){
                            for(y;y<map[x].length;y++){
                                if(map[x][y] == i){
                                    found1 = true;
                                }
                                if(map[x][y] == k){
                                    found2 = true;
                                }
                                if(found1 && found2)break;
                            }
                        }
                        if(found1 && found2)break;
                    }
                    
                    if(found1 && r2 == null){
                        r2 = areas[k].get_edge_room();//need to limit to exits that are towards the maps edge...
                    }
                    if(found2 && r1 == null){
                        r1 = areas[i].get_edge_room();//need to limit to exits that are towards the maps edge...
                    }
                    if(!found1 && !found2){
                        if(r2 == null)r2 = areas[k].get_edge_room();
                        if(r1 == null)r1 = areas[i].get_edge_room();
                    }
                }
                //Figure out the directions for the exits
                if(r1 == null || r2 == null){
                    var temp_exits:Array;
                    made = false;
                    if(r2 == null){
                        r2 = areas[k].get_random_room(true);
                        if(r1 != null){
                            temp_exits = get_edge_exits(areas[i],r1);
                            count = 0;
                            for(count;count<temp_exits.length;count++){
                                if(r2.new_exit(r1, neg_direction(temp_exits[count])) >= 0){
                                    made = true;
                                    r1.new_exit(r2, temp_exits[count]);
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
                        r1 = areas[i].get_random_room(true);
                        temp_exits = get_edge_exits(areas[k],r2);
                        count = 0;
                        for(count;count<temp_exits.length;count++){
                            if(r1.new_exit(r2, neg_direction(temp_exits[count])) >= 0){
                                made = true;
                                r2.new_exit(r1, temp_exits[count]);
                                break;
                            }
                        }
                        if(!made){
                            connect_areas(i,k, null, r2, sub_area_flag, stay_in_edges);
                            return;							
                        }
                    }
                }else{
                    if(r1.new_exit(r2) < 0)trace("(World.connect_areas)Just failed to connect areas " + areas[i].description + " to " + areas[k].description);
                }					
            }
            
            if(temp_room1 != null){
                inject_edge_room(areas[i], r1, r2, temp_room1);
                r1 = temp_room1;
            }
            if(temp_room2 != null){
                inject_edge_room(areas[k], r2, r1, temp_room2);
                r2 = temp_room2;
            }
            already_tried_area = new Array();
            if(r1.get_exit_id(r2) >= 0 && r2.get_exit_id(r1) >= 0){
                links[links.length] = [i,k,sub_area_flag, r1.exit_names[r1.get_exit_id(r2)], r2.exit_names[r2.get_exit_id(r1)]];
            }else{
                made = false;
                count3 = 0;
                for(count3;count3<r1.exits.length;count3++){
                    if(r1.exits[count3].area == r2.area){
                        made = true;
                        links[links.length] = [i,k,sub_area_flag, r1.exit_names[count3], r1.exits[count3].exit_names[r1.exits[count3].get_exit_id(r1)] ];
                        break;
                    }
                }
                if(!made){
                    count3 = 0;
                    for(count3;count3<r2.exits.length;count3++){
                        if(r2.exits[count3].area == r1.area){
                            links[links.length] = [i,k,sub_area_flag,  r2.exits[count3].exit_names[r2.exits[count3].get_exit_id(r2)] , r2.exit_names[count3] ];
                            break;
                        }
                    }
                }
                if(!made)trace("(World.connect_areas)Got me two areas that are connected, but two rooms that aren't. Not sure what to do about this.")
            }			
        }
    }
    
    private function already_tried_check(area_id:int):Boolean{
        var ret:Boolean = false;
        var count:int = 0;
        for(count;count<already_tried_area.length;count++){
            if(already_tried_area[count] == area_id){
                ret = true;
                break;
            }
        }
        
        return ret;
    }
    
    public function inject_edge_room(area:Area, orig_room:Room, cnt_room:Room, new_room:Room):void{
        var temp:Array = area.find_room(orig_room);
        var temp_exit:String = orig_room.exit_names[orig_room.get_exit_id(cnt_room)];
        var temp_exit2:String = cnt_room.exit_names[cnt_room.get_exit_id(orig_room)];
        orig_room.remove_exit(cnt_room);
        cnt_room.remove_exit(orig_room);
        orig_room.new_exit(new_room,temp_exit);
        new_room.new_exit(orig_room,temp_exit2);
        area.existing_exit_add(orig_room,null,temp[0],temp[1],temp[2],"");
        new_room.new_exit(cnt_room,temp_exit);
        cnt_room.new_exit(new_room,temp_exit2);
    }
    
    public function remove_existing_edge_exit(exit_list:Array, area:Area, sub_area_flag:Boolean = false):Array{
        var area_id:int = 0;
        for(area_id;area_id<areas.length;area_id++){
            if(areas[area_id] == area) break;
        }
        
        var existing_exits:Array = new Array();
        var i:int = 0;
        for(i;i<links.length;i++){
            if((links[i][0] == area_id || links[i][1] == area_id) && links[i][2] == false){
                if(links[i][0] == area_id){
                    existing_exits[existing_exits.length] = links[i][3];
                }else{
                    existing_exits[existing_exits.length] = links[i][4];
                }
            }
        }
        
        i=0;
        for(i;i<existing_exits.length;i++){
            var j:int = 0;
            for(j;j<exit_list.length;j++){
                if(existing_exits[i] == exit_list[j]){
                    exit_list = exit_list.slice(0,j).concat(exit_list.slice(j+1, exit_list.length));
                    break;
                }
            }
        }
        
        if(!sub_area_flag){
            var map:Array = make_integer_map();
            //find the area on the map;
            var found:Boolean = false;
            i=0;
            for(i;i<map.length;i++){
                j = 0;
                for(j;j<map[i].length;j++){
                    if(map[i][j] == area_id){
                        found = true;
                        break;
                    }
                }
                if(found)break;
            }
            
            if(found){
                //check if any of the exits are populated on the map...
                var k:int = 0;
                for(k;k<exit_list.length;k++){
                    var temp:Array = area.get_offset_by_name(exit_list[k]);
                    if(temp[1] > 0){
                        temp[1] = -1;
                    }else if(temp[1] < 0){
                        temp[1] = 1;
                    }
                    
                    var remove_exit:Boolean = false;
                    
                    //need to check if we're making an over-pass exit here too...
                    if(temp[0] != 0 && temp[1] != 0){
                        if(map[i+temp[0]] != null && map[i+temp[0]][j] != null && map[i][j+temp[1]] != null){
                            var link_count:int = 0;
                            for(link_count;link_count<links.length;link_count++){
                                if((links[link_count][0] == map[i+temp[0]][j] && links[link_count][1] == map[i][j+temp[1]]) || (links[link_count][1] == map[i+temp[0]][j] && links[link_count][0] == map[i][j+temp[1]])){
                                    remove_exit = true;
                                }
                            }
                        }
                    }
                    
                    if(!remove_exit){
                        if(map[i+temp[0]] != null){
                            if(map[i+temp[0]][j+temp[1]] != null){
                                remove_exit = true;
                            }
                        }
                    }
                    
                    if(remove_exit){
                        exit_list = exit_list.slice(0,k).concat(exit_list.slice(k+1, exit_list.length));
                        k--;
                    }
                }
            }
        }
        return exit_list;			
    }
    
    public function make_area_exit_match(a1:Area, a2:Area, r1:Room, r2:Room,sub_area_flag:Boolean = false, stay_in_edges:Boolean = false):Boolean{
        var found:Boolean = false;
        var r1_avail_exit:Array = get_edge_exits(a1, r1);
        var r2_avail_exit:Array = get_edge_exits(a2, r2);
        
        var map:Array = make_integer_map();
        var max_y:int = 0;
        var x:int = 0;
        for(x;x<map.length;x++){
            if(map[x].length > max_y)max_y = map[x].length;
        }
        
        var a1_location:Array = null;
        var a2_location:Array = null;
        x = 0;
        for(x;x<map.length;x++){
            var y:int = 0;
            if(map[x] != null){
                for(y;y<map[x].length;y++){
                    if(areas[map[x][y]] == a1){
                        a1_location = [x,y];
                    }
                    if(areas[map[x][y]] == a2){
                        a2_location = [x,y];
                    }
                    if(a1_location != null && a2_location != null)break;
                }
            }
            if(a1_location != null && a2_location != null)break;
        }
        
        if(a1_location != null && a2_location != null){
            if(r1_avail_exit.indexOf(Area.get_direction(a1_location[0], a2_location[1], 0, a2_location[0], a1_location[1], 0)) >= 0 && r2_avail_exit.indexOf(Area.get_direction(a2_location[0], a1_location[1], 0, a1_location[0], a2_location[1], 0)) >= 0){ 
                if(stay_in_edges && a1.description != a2.description){
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
        var dir_list:Array = new Array("North", "East", "West", "North-East", "North-West", "South-West",  "South-East", "South");
        var not_dir_list:Array = new Array("South", "West", "East", "South-West", "South-East", "North-East", "North-West", "North");
        var count:int = 0;
        for(count;count<r1_avail_exit.length;count++){
            var count2:int = 0;
            for(count2;count2<dir_list.length;count2++){
                if(r1_avail_exit[count] == dir_list[count2]){
                    var count3:int = 0;
                    for(count3;count3<r2_avail_exit.length;count3++){
                        if(r2_avail_exit[count3] == not_dir_list[count2]){
                            if(stay_in_edges){
                                var map_found:Boolean = false;
                                x = 0;
                                for(x;x<map.length;x++){
                                    y = 0;
                                    for(y;y<map[x].length;y++){
                                        if(map[x][y] == a1.id || map[x][y] == a2.id){
                                            var dir_from_placed:String = "";
                                            var spread_area:int = -1;
                                            if(map[x][y] == a1.id){
                                                dir_from_placed = not_dir_list[count2];
                                                spread_area = a2.id;													
                                            }else{
                                                dir_from_placed = dir_list[count2];
                                                spread_area = a1.id;													
                                            }
                                            if(dir_from_placed == "North"){
                                                if(x+1 < map.length)found = true;
                                            }else if(dir_from_placed == "North-West"){
                                                if(x+1 < map.length && y+1 < max_y)found = true;
                                            }else if(dir_from_placed == "North-East"){
                                                if(x+1 < map.length && y-1 >= 0)found = true;
                                            }else if(dir_from_placed == "South-East"){
                                                if(x-1 >= 0 && y-1 >= 0)found = true;
                                            }else if(dir_from_placed == "South-West"){
                                                if(x-1 >= 0 && y+1 < max_y)found = true;
                                            }else if(dir_from_placed == "East"){
                                                if(y-1 >= 0)found = true;
                                            }else if(dir_from_placed == "West"){
                                                if(y+1 < max_y)found = true;
                                            }else if(dir_from_placed == "South"){
                                                if(x-1 >= 0 )found = true;
                                            }
                                            if(found){
                                                if(areas[spread_area].filler_template[0] != null && a1.description != a2.description){
                                                    if(spread_area == a1.id){
                                                        ocean_spread(r1, dir_list[count2], r2, not_dir_list[count2]);
                                                    }else if(spread_area == a2.id){
                                                        ocean_spread(r2, not_dir_list[count2], r1, dir_list[count2]);
                                                    }														
                                                }else{
                                                    r1.new_exit(r2, dir_list[count2]);
                                                    r2.new_exit(r1, not_dir_list[count2]);
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
                                r1.new_exit(r2, dir_list[count2]);
                                r2.new_exit(r1, not_dir_list[count2]);
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
    
    public function get_edge_exits(a:Area, r:Room, indent:int = 0):Array{
        var arr:Array = new Array();
        var temp_loc:Array = a.find_room(r);
        
        if(temp_loc == null)return arr;
        
        var x:int = temp_loc[0];
        var y:int = temp_loc[1];
        var z:int = temp_loc[2];
        var max_y:int = 0;
        var count:int = 0;
        for(count;count<a.rooms.length;count++){
            if(a.rooms[count].length - 1 >= max_y) max_y = a.rooms[count].length - 1;
        }
        
        if(a.rooms[(x + indent) + 1] == null){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, temp_loc[1], temp_loc[2]);
        }
        if((x - indent)-1<0){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, temp_loc[1], temp_loc[2]);
        }
        if((y + indent)+1 > max_y){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], temp_loc[0], y+1, temp_loc[2]);
        }
        if((y - indent)-1<0){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], temp_loc[0], y-1, temp_loc[2]);
        }
         
        if(a.rooms[(x + indent) + 1] == null){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y + 1, temp_loc[2]);
        }else if((x - indent)-1<0){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y + 1, temp_loc[2]);
        }else if(a.rooms[(x + indent) + 1] != null && (y + indent)+1 >= max_y ){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y + 1, temp_loc[2]);
        }else if((x - indent)-1>=0 && (y + indent)+1 >= max_y){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y + 1, temp_loc[2]);
        }
        if(a.rooms[(x + indent) + 1] == null){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y - 1, temp_loc[2]);
        }else if((x - indent)-1<0){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y - 1, temp_loc[2]);
        }else if(a.rooms[(x + indent) + 1] != null && (y - indent)-1<0){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x + 1, y - 1, temp_loc[2]);
        }else if((x - indent)-1>=0 && (y - indent)-1<0){
            arr[arr.length] = Area.get_direction(temp_loc[0], temp_loc[1], temp_loc[2], x - 1, y - 1, temp_loc[2]);
        }
        
        //check to make sure the exits don't already exist on our room
        if(r.exit_names != null){
            var i:int = 0;
            for(i;i<r.exit_names.length;i++){
                var j:int = 0;
                for(j;j<arr.length;j++){
                    if(r.exit_names[i] == arr[j]){
                        //suspicious... 
                        arr = arr.slice(0,j).concat(arr.slice(j+1,arr.length));
                        break;
                    }
                }
                if(arr.length <= 0)break;
            }
        }
        
        if(arr.length < 1){
            if(indent > 1){
                //trace("(World)indent already tried while search for available edge exits... heading for failure.");
            }else{
                return get_edge_exits(a, r, indent + 1);
            }
        }
        
        return arr;
    }
    
    private function ocean_connect(map:Array, temp_ocean:Area, old_x:int, old_y:int, new_x:int, new_y:int):void{
        if(map[new_x][old_y] != null && map[old_x][new_y] != null && areas[map[new_x][old_y]].description != temp_ocean.description &&
            areas[map[old_x][new_y]].description != temp_ocean.description){
            //if these two areas are connected, I should do nothing
            var count:int = 0;
            for(count;count<links.length;count++){
                if((links[count][0] == map[new_x][old_y]  && links[count][1] == map[old_x][new_y]) || (links[count][0] == map[old_x][new_y]  && links[count][1] == map[new_x][old_y])){
                    break;
                }
            }
            if(count>=links.length)connect_areas(areas.length - 1,map[new_x][new_y],null,null,false,true);
        }else{
            connect_areas(areas.length - 1,map[new_x][new_y],null,null,false,true);
        }
    }
    
    private function ocean_spread(r1:Room, r1_connect_dir:String, r2:Room, r2_connect_dir:String):void{
        var room_loc:Array;
        var new_room:Room = r1.area.filler_template[0].make_room();
        new_room.area = r2.area;
        new_room.set_id(r2.area.room_list.length);			
        new_room.new_exit(r1, r2_connect_dir);
        var no_spread:Boolean = false;
        var placed:Boolean = false;
        var spread_to_area:Area = r2.area;
        var count:int = 0;			
        var max_y:int = 0;
        for(count;count<spread_to_area.rooms.length;count++){
            if(spread_to_area.rooms[count].length > max_y)max_y = spread_to_area.rooms[count].length;
        }
        max_y--;
        
        room_loc = spread_to_area.find_room(r2);
        if(r2_connect_dir == "North" || r2_connect_dir == "South"){
            //should move east or west to find the location
            count = 1;
            while(!placed){
                if(room_loc[1]+count<=max_y && (spread_to_area.rooms[room_loc[0]][room_loc[1]+count] == null || spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]] == null)){
                    if(spread_to_area.rooms[room_loc[0]][room_loc[1]+count] == null)spread_to_area.rooms[room_loc[0]][room_loc[1]+count] = new Array();
                    spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]] = new_room;
                    spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                    placed = true;
                }else if(room_loc[1]-count>=0 && (spread_to_area.rooms[room_loc[0]][room_loc[1]-count] == null || spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]] == null)){
                    if(spread_to_area.rooms[room_loc[0]][room_loc[1]-count] == null)spread_to_area.rooms[room_loc[0]][room_loc[1]-count] = new Array();
                    spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]] = new_room;
                    spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                    placed = true;
                }else if((room_loc[1]+count<=max_y && spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]] != null) || (room_loc[1]-count>=0 && spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]] != null)){
                    if(room_loc[1]-count>=0 && spread_to_area.rooms[room_loc[0]][room_loc[1]-count] != null && spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]] != null && spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]].template != null && spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]].template.description == r1.area.filler_template[0].description){
                        new_room = spread_to_area.rooms[room_loc[0]][room_loc[1]-count][room_loc[2]]
                        no_spread = true;
                        placed = true;
                    }else if(room_loc[1]+count<=max_y && spread_to_area.rooms[room_loc[0]][room_loc[1]+count] != null && spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]] != null && spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]].template != null && spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]].template.description == r1.area.filler_template[0].description){
                        new_room = spread_to_area.rooms[room_loc[0]][room_loc[1]+count][room_loc[2]]
                        no_spread = true;
                        placed = true;
                    }
                }
                count++;
            }
        }else if(r2_connect_dir == "West" || r2_connect_dir == "East"){
            //should move north or south to find the location
            count = 1;
            while(!placed){
                if(spread_to_area.rooms[room_loc[0]+count] != null && (spread_to_area.rooms[room_loc[0]+count][room_loc[1]] == null || spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]] == null)){
                    if(spread_to_area.rooms[room_loc[0]+count][room_loc[1]] == null)spread_to_area.rooms[room_loc[0]+count][room_loc[1]] = new Array();
                    spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]] = new_room;
                    spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                    placed = true;
                }else if(spread_to_area.rooms[room_loc[0]-count] != null && (spread_to_area.rooms[room_loc[0]-count][room_loc[1]] == null || spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]] == null)){
                    if(spread_to_area.rooms[room_loc[0]-count][room_loc[1]] == null)spread_to_area.rooms[room_loc[0]-count][room_loc[1]] = new Array();
                    spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]] = new_room;
                    spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                    placed = true;
                }else if((spread_to_area.rooms[room_loc[0]+count] != null && spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]] != null) || (spread_to_area.rooms[room_loc[0]-count] != null && spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]] != null)){
                    if(spread_to_area.rooms[room_loc[0]+count] != null && spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]] != null && spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]].template != null && spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]].template.description == r1.area.filler_template[0].description){
                        new_room = spread_to_area.rooms[room_loc[0]+count][room_loc[1]][room_loc[2]];
                        no_spread = true;
                        placed = true;
                    }else if(spread_to_area.rooms[room_loc[0]-count] != null && spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]] != null && spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]].template != null && spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]].template.description == r1.area.filler_template[0].description){
                        new_room = spread_to_area.rooms[room_loc[0]-count][room_loc[1]][room_loc[2]];
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
                        if(spread_to_area.rooms[count][0] == null || spread_to_area.rooms[count][0][room_loc[2]] == null){
                            if(spread_to_area.rooms[count][0] == null)spread_to_area.rooms[count][0] = new Array();
                            spread_to_area.rooms[count][0][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if((spread_to_area.rooms[0][count] == null && count <= max_y) || spread_to_area.rooms[0][count][room_loc[2]] == null){
                            if(spread_to_area.rooms[0][count] == null)spread_to_area.rooms[0][count] = new Array();
                            spread_to_area.rooms[0][count][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if((count < spread_to_area.rooms.length && spread_to_area.rooms[count][0][room_loc[2]] != null) || (count <= max_y && spread_to_area.rooms[0][count][room_loc[2]] != null)){
                            if(count < spread_to_area.rooms.length && spread_to_area.rooms[count][0][room_loc[2]] != null && spread_to_area.rooms[count][0][room_loc[2]].template != null && spread_to_area.rooms[count][0][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[count][0][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }else if(count <= max_y && spread_to_area.rooms[0][count][room_loc[2]] != null && spread_to_area.rooms[0][count][room_loc[2]].template != null && spread_to_area.rooms[0][count][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[0][count][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }								
                        }
                        count++;
                    }						
                }else{
                    while(!placed){
                        if(spread_to_area.rooms[count][max_y] == null || spread_to_area.rooms[count][max_y][room_loc[2]] == null){
                            if(spread_to_area.rooms[count][max_y] == null)spread_to_area.rooms[count][max_y] = new Array();
                            spread_to_area.rooms[count][max_y][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if(count <= max_y && (spread_to_area.rooms[0][max_y-count] == null || spread_to_area.rooms[0][max_y-count][room_loc[2]] == null)){
                            if(spread_to_area.rooms[0][max_y-count] == null)spread_to_area.rooms[0][max_y-count] = new Array();
                            spread_to_area.rooms[0][max_y-count][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if((count <= max_y && spread_to_area.rooms[0][max_y-count][room_loc[2]] != null)||(count < spread_to_area.rooms.length && spread_to_area.rooms[count][max_y][room_loc[2]] != null)){
                            if(count <= max_y && spread_to_area.rooms[0][max_y-count][room_loc[2]] != null && spread_to_area.rooms[0][max_y-count][room_loc[2]].template != null && spread_to_area.rooms[0][max_y-count][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[0][max_y-count][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }else if(count < spread_to_area.rooms.length && spread_to_area.rooms[count][max_y][room_loc[2]] != null && spread_to_area.rooms[count][max_y][room_loc[2]].template != null && spread_to_area.rooms[count][max_y][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[count][max_y][room_loc[2]]
                                no_spread = true;
                                placed = true;
                            }
                        }
                        count++
                    }
                }
            }else{
                if(r2_connect_dir.indexOf("East") >= 0){
                    while(!placed){
                        if((count <= spread_to_area.rooms.length - 1 && spread_to_area.rooms[spread_to_area.rooms.length-1-count][0] == null) || spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]] == null){
                            if(spread_to_area.rooms[spread_to_area.rooms.length-1-count][0] == null)spread_to_area.rooms[spread_to_area.rooms.length-1-count][0] = new Array();
                            spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if(spread_to_area.rooms[spread_to_area.rooms.length-1][count] == null || spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]] == null){
                            if(spread_to_area.rooms[spread_to_area.rooms.length-1][count] == null)spread_to_area.rooms[spread_to_area.rooms.length-1][count] = new Array();
                            spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if((count <= spread_to_area.rooms.length - 1 && spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]] != null) || (count <= max_y && spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]] != null)){
                            if(count <= spread_to_area.rooms.length - 1 && spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]] != null && spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]].template != null && spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[spread_to_area.rooms.length-1-count][0][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }else if(count <= max_y && spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]] != null && spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]].template != null && spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[spread_to_area.rooms.length-1][count][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }
                        }
                        count++;
                    }
                }else{
                    while(!placed){
                        if(spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y] == null || spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]] == null){
                            if(spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y] == null)spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y] = new Array();
                            spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if(spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count] == null || spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]] == null){
                            if(spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count] == null)spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count] = new Array();
                            spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]] = new_room;
                            spread_to_area.room_list[spread_to_area.room_list.length] = new_room;
                            placed = true;
                        }else if((count >= spread_to_area.rooms.length-1 && spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]] != null) || (count <= max_y && spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]] != null)){
                            if(count >= spread_to_area.rooms.length-1 && spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]] != null && spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]].template != null && spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[spread_to_area.rooms.length-1-count][max_y][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }else if(count <= max_y && spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]] != null && spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]].template != null && spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]].template.description == r1.area.filler_template[0].description){
                                new_room = spread_to_area.rooms[spread_to_area.rooms.length-1][max_y-count][room_loc[2]];
                                no_spread = true;
                                placed = true;
                            }
                        }
                        count++;
                    }
                }
            }
        }
        r1.new_exit(new_room, r1_connect_dir)
        if(!no_spread){
            ocean_room_spread(new_room, spread_to_area,max_y,spread_to_area.find_room(new_room));
        }else{
            new_room.new_exit(r1, r2_connect_dir);
        }
    }
    
    private function ocean_existing_room_connect(spread_room:Room, new_room:Room, to_path:String, from_path:String):void{
        if(new_room.template == spread_room.template){
            spread_room.new_exit(new_room, from_path);
            new_room.new_exit(spread_room, to_path);
        }else if(spread_room.template.hidden_exit_action != null){
            var good_exit:Boolean = false;
            var avail_exits:Array = spread_room.template.get_avail_exits(new_room);
            var temp_str_count:int = 0;
            for(temp_str_count;temp_str_count<avail_exits.length;temp_str_count++){
                if(to_path == avail_exits[temp_str_count]){
                    good_exit = true;
                    break;
                }
            }
            if (good_exit){
                if(spread_room.new_exit(new_room, from_path) != -1){
                    //add the hidden exit to the non-filler room
                    Area.generate_filler_exit_action(new_room, spread_room, to_path, spread_room.template.hidden_exit_action, spread_room.template.hidden_exit_challenge, spread_room.template.hidden_exit_consequence)
                }
            }
        }
    }
    
    private function ocean_room_spread(spread_room:Room, spread_area:Area, max_y:int, room_loc:Array, room_count:int = 0):int{
        //spread the ocean, and make the appropriate exits for each room			
        var new_room:Room;
        var good_exit:Boolean;
        var avail_exits:Array;
        var temp_str_count:int = 0;
        var to_path:String = "";
        var from_path:String = "";
        var temp_loc:Array = new Array();
        if(room_count < Math.max(max_y/6,1) && room_loc[0]-1 >= 0 && spread_area.rooms[room_loc[0]-1] != null && (spread_area.rooms[room_loc[0]-1][room_loc[1]] == null || spread_area.rooms[room_loc[0]-1][room_loc[1]][room_loc[2]] == null)){
            if(spread_area.rooms[room_loc[0]-1][room_loc[1]] == null)spread_area.rooms[room_loc[0]-1][room_loc[1]] = new Array();
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.length);
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1],room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0]-1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            spread_area.rooms[room_loc[0]-1][room_loc[1]][room_loc[2]] = new_room;
            spread_area.room_list[spread_area.room_list.length] = new_room;
            temp_loc[0] = room_loc[0] - 1;
            temp_loc[1] = room_loc[1];
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[0]-1 >= 0 && spread_area.rooms[room_loc[0]-1][room_loc[1]] != null && spread_area.rooms[room_loc[0]-1][room_loc[1]][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]-1][room_loc[1]][room_loc[2]],Area.get_direction(room_loc[0]-1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1],room_loc[2]));
        }
        
        if(room_loc[0]-1 >= 0 && room_loc[1]-1 >= 0 && spread_area.rooms[room_loc[0]-1][room_loc[1]-1] != null && spread_area.rooms[room_loc[0]-1][room_loc[1]-1][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]-1][room_loc[1]-1][room_loc[2]],Area.get_direction(room_loc[0]-1,room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1]-1,room_loc[2]));				
        }
        
        if(room_count < Math.max(max_y/6,1) && room_loc[0]+1 < spread_area.rooms.length && (spread_area.rooms[room_loc[0]+1][room_loc[1]] == null || spread_area.rooms[room_loc[0]+1][room_loc[1]][room_loc[2]] == null)){
            if(spread_area.rooms[room_loc[0]+1][room_loc[1]] == null)spread_area.rooms[room_loc[0]+1][room_loc[1]] = new Array();
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.length);
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1],room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0]+1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            spread_area.rooms[room_loc[0]+1][room_loc[1]][room_loc[2]] = new_room;
            spread_area.room_list[spread_area.room_list.length] = new_room;
            temp_loc[0] = room_loc[0] + 1;
            temp_loc[1] = room_loc[1];
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[0]+1 < spread_area.rooms.length && spread_area.rooms[room_loc[0]+1][room_loc[1]] != null && spread_area.rooms[room_loc[0]+1][room_loc[1]][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]+1][room_loc[1]][room_loc[2]],Area.get_direction(room_loc[0]+1,room_loc[1],room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1],room_loc[2]));				
        }
        
        if(room_loc[0]+1 < spread_area.rooms.length && room_loc[1]+1 <= max_y && spread_area.rooms[room_loc[0]+1][room_loc[1]+1] != null && spread_area.rooms[room_loc[0]+1][room_loc[1]+1][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]+1][room_loc[1]+1][room_loc[2]],Area.get_direction(room_loc[0]+1,room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1]+1,room_loc[2]));				
        }
        
        if(room_count < Math.max(max_y/6,1) && room_loc[1]-1 >= 0 && (spread_area.rooms[room_loc[0]][room_loc[1]-1] == null || spread_area.rooms[room_loc[0]][room_loc[1]-1][room_loc[2]] == null)){
            if(spread_area.rooms[room_loc[0]][room_loc[1]-1] == null)spread_area.rooms[room_loc[0]][room_loc[1]-1] = new Array();
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.length);
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]-1,room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0],room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            spread_area.rooms[room_loc[0]][room_loc[1]-1][room_loc[2]] = new_room;
            spread_area.room_list[spread_area.room_list.length] = new_room;
            temp_loc[0] = room_loc[0];
            temp_loc[1] = room_loc[1] - 1;
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[1]-1 >= 0 && spread_area.rooms[room_loc[0]][room_loc[1]-1] != null && spread_area.rooms[room_loc[0]][room_loc[1]-1][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]][room_loc[1]-1][room_loc[2]],Area.get_direction(room_loc[0],room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]-1,room_loc[2]));				
        }
        
        if(room_loc[0]+1 < spread_area.rooms.length && room_loc[1]-1 >= 0 && spread_area.rooms[room_loc[0]+1][room_loc[1]-1] != null && spread_area.rooms[room_loc[0]+1][room_loc[1]-1][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]+1][room_loc[1]-1][room_loc[2]],Area.get_direction(room_loc[0]+1,room_loc[1]-1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]+1,room_loc[1]-1,room_loc[2]));
        }
        
        if(room_count < Math.max(max_y/6,1) && room_loc[1]+1 <= max_y && (spread_area.rooms[room_loc[0]][room_loc[1]+1] == null || spread_area.rooms[room_loc[0]][room_loc[1]+1][room_loc[2]] == null)){
            if(spread_area.rooms[room_loc[0]][room_loc[1]+1] == null)spread_area.rooms[room_loc[0]][room_loc[1]+1] = new Array();
            new_room = spread_room.template.make_room();
            new_room.area = spread_area;
            new_room.set_id(spread_area.room_list.length);
            spread_room.new_exit(new_room, Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]+1,room_loc[2]));
            new_room.new_exit(spread_room, Area.get_direction(room_loc[0],room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]));
            spread_area.rooms[room_loc[0]][room_loc[1]+1][room_loc[2]] = new_room;
            spread_area.room_list[spread_area.room_list.length] = new_room;
            temp_loc[0] = room_loc[0];
            temp_loc[1] = room_loc[1] + 1;
            temp_loc[2] = room_loc[2];
            ocean_room_spread(new_room, spread_area, max_y, temp_loc, room_count+1);
        }else if(room_loc[1]+1 <= max_y && spread_area.rooms.length && spread_area.rooms[room_loc[0]][room_loc[1]+1] != null && spread_area.rooms.length && spread_area.rooms[room_loc[0]][room_loc[1]+1][room_loc[2]] != null){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]][room_loc[1]+1][room_loc[2]],Area.get_direction(room_loc[0],room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0],room_loc[1]+1,room_loc[2]));				
        }
        
        if(room_loc[0]-1 >= 0 && room_loc[1]+1 <= max_y && spread_area.rooms[room_loc[0]-1][room_loc[1]+1] != null && spread_area.rooms[room_loc[0]-1][room_loc[1]+1][room_loc[2]] != null && spread_area.rooms[room_loc[0]-1][room_loc[1]+1][room_loc[2]].template == spread_room.template){
            ocean_existing_room_connect(spread_room, spread_area.rooms[room_loc[0]-1][room_loc[1]+1][room_loc[2]],Area.get_direction(room_loc[0]-1,room_loc[1]+1,room_loc[2],room_loc[0],room_loc[1],room_loc[2]),Area.get_direction(room_loc[0],room_loc[1],room_loc[2],room_loc[0]-1,room_loc[1]+1,room_loc[2]));				
        }
        
        return room_count;
    }
    
    public function map_gen():void{
        //make the oceans...
        var map:Array = make_integer_map();
        var max_x:int = map.length;
        var x:int = 0;
        var max_y:int = 0;
        var gen_count:int = 0;
        for(x;x<map.length;x++){
            if(map[x].length > max_y)max_y = map[x].length;
        }
        
        x = 0;
        for(x;x<map.length;x++){
            var y:int = 0;
            for(y;y<max_y;y++){
                if(map[x][y] == null)gen_count++;
            }
        }
        
        gen_count++;
        
        while(gen_count>0){
            var temp_ocean:Area = FPalace_content.area_ocean();
            temp_ocean.filler_area();				
            
            map = make_integer_map();
            //connect to surrounding areas...
            var placed:Boolean = false;
            x = 0;
            for(x;x<=max_x;x++){
                if(map[x] == null)map[x] = new Array();
                y = 0;
                for(y;y<max_y;y++){
                    if(map[x][y] == null && (map[x][y-1] !=null || map[x][y+1] != null)){
                        if(map[x][y-1] !=null){
                            add_area(temp_ocean);
                            connect_areas(areas.length - 1,map[x][y-1],null,null,false,true);
                        }else{
                            add_area(temp_ocean);
                            connect_areas(areas.length - 1,map[x][y+1],null,null,false,true);
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
                x = 0;
                for(x;x<map.length;x++){
                    y = 0;
                    for(y;y<max_y;y++){
                        if(map[x][y] == areas.length - 1){
                            if(map[x-1] != null && map[x-1][y-1] != null)ocean_connect(map, temp_ocean, x, y, x-1, y-1);
                            if(map[x-1] != null && map[x-1][y] != null)connect_areas(areas.length - 1,map[x-1][y],null,null,false,true);
                            if(map[x-1] != null && map[x-1][y+1] != null)ocean_connect(map, temp_ocean, x, y, x-1, y+1);										
                            if(map[x][y-1] != null)connect_areas(areas.length - 1,map[x][y-1],null,null,false,true);
                            if(map[x][y+1] != null)connect_areas(areas.length - 1,map[x][y+1],null,null,false,true);
                            if(map[x+1] != null && map[x+1][y-1] != null)ocean_connect(map, temp_ocean, x, y, x+1, y-1);
                            if(map[x+1] != null && map[x+1][y] != null)connect_areas(areas.length - 1,map[x+1][y],null,null,false,true);
                            if(map[x+1] != null && map[x+1][y+1] != null)ocean_connect(map, temp_ocean, x, y, x+1, y+1);
                            
                            placed = true;
                            break;
                        }
                    }
                    if(placed)break;
                }					
            }else{
                var rand:Number = Math.random();
                if(map[0][0] != null && rand >= 0.75){
                    add_area(temp_ocean);
                    connect_areas(areas.length - 1,map[0][0],null,null,false,true);
                    placed = true;
                }else if(map[map.length-2][max_y-1] != null && rand >= 0.5){
                    add_area(temp_ocean);
                    connect_areas(areas.length - 1,map[map.length-2][max_y-1],null,null,false,true);
                    placed = true;
                }else if(map[0][max_y-1] != null && rand >= 0.25){
                    add_area(temp_ocean);
                    connect_areas(areas.length - 1,map[0][max_y-1],null,null,false,true);
                    placed = true;
                }else if(map[map.length-2][0] != null){
                    add_area(temp_ocean);
                    connect_areas(areas.length - 1,map[map.length-2][0],null,null,false,true);
                    placed = true;
                }
                
                if(placed){
                    map = make_integer_map();
                    
                    x = 0;
                    for(x;x<map.length;x++){
                        if(map[x].length > max_y)max_y = map[x].length;
                    }
                    
                    x = 0;
                    for(x;x<map.length;x++){
                        y = 0;
                        for(y;y<max_y;y++){
                            if(map[x][y] == null)gen_count++;
                        }
                    }
                    
                    placed = false;
                    x = 0;
                    for(x;x<map.length;x++){
                        y = 0;
                        for(y;y<max_y;y++){
                            if(map[x][y] == areas.length - 1){
                                if(map[x-1] != null && map[x-1][y-1] != null)ocean_connect(map, temp_ocean, x, y, x-1, y-1);
                                if(map[x-1] != null && map[x-1][y] != null)connect_areas(areas.length - 1,map[x-1][y],null,null,false,true);
                                if(map[x-1] != null && map[x-1][y+1] != null)ocean_connect(map, temp_ocean, x, y, x-1, y+1);										
                                if(map[x][y-1] != null)connect_areas(areas.length - 1,map[x][y-1],null,null,false,true);
                                if(map[x][y+1] != null)connect_areas(areas.length - 1,map[x][y+1],null,null,false,true);
                                if(map[x+1] != null && map[x+1][y-1] != null)ocean_connect(map, temp_ocean, x, y, x+1, y-1);
                                if(map[x+1] != null && map[x+1][y] != null)connect_areas(areas.length - 1,map[x+1][y],null,null,false,true);
                                if(map[x+1] != null && map[x+1][y+1] != null)ocean_connect(map, temp_ocean, x, y, x+1, y+1);
                                
                                placed = true;
                                break;
                            }
                        }
                        if(placed)break;
                    }
                }					
            }
            if(!placed){
                //areas.pop();
            }
            gen_count--;				
        }
    }
    
    public function finalize():void{
        var i:int = 0;
        for (i;i<areas.length;i++){
            areas[i].filler_area();		
            areas[i].finalize();
        }
    }
    
    public function new_starting_room(r:Room):void{
        starting_rooms[starting_rooms.length] = r;
    }
    
    public function get_starting_room(i:int = 0):Room{
        if(starting_rooms[i] != null) return starting_rooms[i];
        return areas[0].get_random_room();
        return null;
    }
    */
    public int get_area_id(Area a){
        int ret;
        for(ret = areas.size();ret>=0;ret--){
            if(areas.get(ret) == a)break;
        }
        return ret;
    }
    /*
    private function get_ovrwld_area_id(area_id:int, skip_id:int = -1):int{
        var ret:int = -1;
        var area_is_ovrwld:Boolean = false;
        var area_links:Array = new Array();
        
        var x:int = 0;
        for(x;x<links.length;x++){
            if(links[x][0] == area_id || links[x][1] == area_id){
                if(links[x][2] == false){
                    area_is_ovrwld = true;
                    break;
                }else{
                    if(links[x][0] == area_id){
                        area_links[area_links.length] = links[x][1];
                    }else{
                        area_links[area_links.length] = links[x][0];
                    }
                }
            }				
        }
        
        if(area_is_ovrwld){
            return area_id;
        }else{
            x = 0;
            for(x;x<area_links.length;x++){
                if(area_links[x] != skip_id){
                    var temp_id:int = get_ovrwld_area_id(area_links[x],area_id);
                    if(temp_id >= 0){
                        ret = temp_id;
                        break;
                    }
                }
            }
        }
        return ret;
    }
    
    public function get_distance(area1_id:int, area2_id:int):int{
        var ret:int = 0;
        area1_id = get_ovrwld_area_id(area1_id);
        area2_id = get_ovrwld_area_id(area2_id);
        var map:Array = make_integer_map();
        var area1_loc:Array = null;
        var area2_loc:Array = null;			
        var x:int = 0;
        for(x;x<map.length;x++){
            var y:int = 0;
            for(y;y<map[x].length;y++){
                if(map[x][y] == area1_id){
                    area1_loc = [x,y];
                }else if(map[x][y] == area2_id){
                    area2_loc = [x,y];
                }
                if(area1_loc != null && area2_loc != null)break;
            }
        }
        
        if(area1_loc != null && area2_loc != null){
            ret = Math.round(Math.sqrt(Math.pow(area1_loc[0] - area2_loc[0], 2) + Math.pow(area1_loc[1] - area2_loc[1], 2)));
        }else{
            trace("(World.get_distance)Failed to find an area on the map. Returning distance 0");
        }
        
        return ret;
    }
    
    public function tick(a:Area = null,c:Character = null):void{
        if(a != null){
            a.tick(c);
        }
        
        //this takes areas.length ticks to have the entire world progress by a single tick...
        var temp_area:Area = areas[0];
        var area_to_tick:int = 0;
        var min_tick:int = temp_area.total_actions_taken;
        var i:int = 0;
        for(i;i<areas.length;i++){
            temp_area = areas[i];
            if(temp_area.total_actions_taken < min_tick){
                area_to_tick = i;
                min_tick = temp_area.total_actions_taken;
            }
        }
        
        temp_area = areas[area_to_tick];
        temp_area.tick(c);
    }
    
    private function neg_direction(s:String):String{
        var dir_list:Array = new Array("North", "East", "West", "North-East", "North-West", "South-West",  "South-East", "South");
        var not_dir_list:Array = new Array("South", "West", "East", "South-West", "South-East", "North-East", "North-West", "North");
        var i:int = 0;
        for(i;i<dir_list.length;i++){
            if(dir_list[i] == s){
                return not_dir_list[i];
            }
        }
        return "";
    }
    */
}

