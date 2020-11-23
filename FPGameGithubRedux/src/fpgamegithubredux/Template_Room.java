package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;

public class Template_Room extends StaticObject {
    
    protected ArrayList<Container> container;//public var container:Array
    protected ArrayList<Number> container_chance;//public var container_chance:Array
    protected ArrayList<CharActionObject> action_objects;//public var action_objects:Array
    protected ArrayList<Number> action_chance;//public var action_chance:Array
    protected ArrayList<Item> item;//public var item:Array
    protected ArrayList<Number> item_chance;//public var item_chance:Array
    protected ArrayList<Character_template> characters;//public var characters:Array
    protected ArrayList<Number> characters_chance;//public var characters_chance:Array
    protected ArrayList<Party> parties;//public var parties:Array
    protected ArrayList<Number> parties_chance;//public var parties_chance:Array
    protected ArrayList<Template_Room> other_rooms;//public var other_rooms:Array
    protected ArrayList<Template_Room> no_connect_template;//public var no_connect_template:Array
    
    protected Boolean unconnected;
    protected int max_exits;
    protected int max_same_exits;
    protected int same_exit_offset;
    protected int map_room_colour;//:uint
    protected CharAction hidden_exit_action;
    protected Challenge hidden_exit_challenge;
    protected Consequence hidden_exit_consequence;
    protected String prop_description;
    protected int prop_desc_dist;
    protected Boolean prop_to_same_template;
    protected Boolean filler_connect;
    protected Boolean no_area_exit;
    protected Boolean show_area_effects;
    protected int discovered_difficulty;
    protected int sight_difficulty;
    protected int locate_difficulty;
    protected int background_image_id;
    protected int combat_image_id;
    
    protected ArrayList<CharAction> room_actions;//public var room_actions:Array
    protected ArrayList<CharAction> exit_actions;//public var exit_actions:Array
    protected ArrayList<Challenge> exit_challenges;//public var exit_challenges:Array
    protected ArrayList<Consequence> exit_consequences;//public var exit_consequences:Array
    public Template_Room(){
        this(null,-1,null,null,null,null,null,null,null);
    }
    public Template_Room(String d){
        this(d,-1,null,null,null,null,null,null,null);
    }
    public Template_Room(String d, int i, ArrayList<String> descs,ArrayList<Container> c, ArrayList<Number> cc, ArrayList<Item> it,ArrayList<Number> itc, ArrayList<Character_template> ch, ArrayList<Number> chc){
        //def null, -1, then 7 nulls
        set_description(d);
        id = i;
        
        if(descs == null){
            descriptions = new ArrayList<>();
        }else{
            descriptions = descs;
        }
        if(c == null){
            container = new ArrayList<>();
        }else{
            container = c;
        }
        if(cc == null){
            container_chance = new ArrayList<>();
        }else{
            container_chance = cc;
        }
        if(it == null){
            item = new ArrayList<>();
        }else{
            item = it;
        }
        if(itc == null){
            item_chance = new ArrayList<>();
        }else{
            item_chance = itc;
        }
        if(ch == null){
            characters = new ArrayList<>();
        }else{
            characters = ch;
        }
        if(chc == null){
            characters_chance = new ArrayList<>();
        }else{
            characters_chance = chc;
        }
        
        no_connect_template = new ArrayList<>();
        parties = new ArrayList<>();
        parties_chance = new ArrayList<>();
        other_rooms = new ArrayList<>();
        
        map_room_colour = 0xFFFFFF;
        max_same_exits = -1;
        max_exits = -1;
        same_exit_offset = 0;
        hidden_exit_action = null;
        hidden_exit_challenge = null;
        hidden_exit_consequence = null;
        prop_description = "";
        prop_desc_dist = 0;
        prop_to_same_template = false;
        show_area_effects = false;
        filler_connect = true;
        no_area_exit = false;
        
        room_actions = new ArrayList<>();
        exit_actions = new ArrayList<>();
        exit_challenges = new ArrayList<>();
        exit_consequences = new ArrayList<>();
        
        
        discovered_difficulty = 10;
        sight_difficulty = 10;
        locate_difficulty = 10;
        background_image_id = -1;
        combat_image_id = -1;
        
        unconnected = false;
        
        action_objects  = new ArrayList<>();
        action_chance  = new ArrayList<>();
        
    }
    
    public void set_background_img(int i){
        background_image_id = i;
    }
    
    public void set_combat_img(int i){
        combat_image_id = i;
    }
    
    public void set_area_effects(){
        show_area_effects = !show_area_effects;
    }
    
    public void set_unconnected(){
        unconnected = !unconnected;
    }
    
    public void add_action(CharAction a){
        room_actions.add(a); //room_actions[room_actions.length] = a
    }
    
    public void add_exit_action(CharAction ea, Challenge echall,Consequence econs){
        exit_actions.add(ea); //exit_actions[exit_actions.length] = ea
        exit_challenges.add(echall); //exit_challenges[exit_challenges.length] = echall
        exit_consequences.add(econs); //exit_consequences[exit_consequences.length] = econs
    }
    
    public void set_discovery_difficulty(int i){
        discovered_difficulty = i;
    }
    
    public void set_sight_difficulty(int i){
        sight_difficulty = i;
    }
    
    public void set_locate_difficulty(int i){
        locate_difficulty = i;
    }
    
    public void set_no_area_exit(){
        no_area_exit = !no_area_exit;
    }
    
    public Boolean get_no_area_exit(){
        return no_area_exit;
    }
    
    public void add_no_connect_template(Template_Room t){
        no_connect_template.add(t);//no_connect_template[no_connect_template.length] = t
    }

    public Boolean check_template_connect(Template_Room t){
        Boolean ret = true;
        int i = 0;
        for(i=0;i<no_connect_template.size();i++){
            if(t == no_connect_template.get(i)){
                ret = false;
                break;
            }
        }
        
        return ret;
    }
    
    public void set_map_room_colour(int i){
        map_room_colour = i;
    }
    
    public int get_map_room_colour(){//uint
        return map_room_colour;
    }
    
    public void set_filler_connect(){
        filler_connect = !filler_connect;
    }
    
    public Boolean get_filler_connect(){
        return filler_connect;
    }
    
    public void set_propagating_to_template(){
        prop_to_same_template = !prop_to_same_template;
    }
    
    public Boolean get_propagating_to_template(){
        return prop_to_same_template;
    }
    
    public void set_propagating_description_distance(int i){
        prop_desc_dist = i;
    }
    
    public int get_propagating_description_distance(){
        return prop_desc_dist;
    }
    
    public void set_propagating_description(String s){
        prop_description = s;
        if(prop_desc_dist < 1) prop_desc_dist = 1;
    }
    
    public String get_propagating_description(){
        return prop_description;
    }
    
    
    public int get_same_exit_offset(){
        return same_exit_offset;
    }
    
    public void set_same_exit_offset(int i){
        same_exit_offset = i;
    }
    
    public int get_max_same_exits(){
        return max_same_exits;
    }
    
    public void set_max_same_exits(int i){
        max_same_exits = i;
    }
    
    public int get_max_exits(){
        return max_exits;
    }
    
    public void set_max_exits(int i){
        max_exits = i;
    }
    
    public CharAction get_hidden_exit_action(){
        return hidden_exit_action;
    }
    
    public void set_hidden_exit_action(CharAction a,Challenge ch,Consequence con){
        hidden_exit_action = a;
        hidden_exit_challenge = ch;
        hidden_exit_consequence = con;
    }
    
    public ArrayList<String> get_avail_exits(Room r){
        ArrayList<String> ret_arr = new ArrayList<>(Arrays.asList("North", "North-East", "East", "South-East", "South", "South-West", "West", "North-West"));                
        int i= 0;
        for(i=0;i<r.exit_names.size();i++){
            int k = 0;
            if(ret_arr.size()<=0) break;
            for(k=0;k<ret_arr.size();k++){
                if(r.exit_names.get(i).equals(ret_arr.get(k))){
                    if(ret_arr.size() > 0 && (k-same_exit_offset < 0 || k+1+same_exit_offset >= ret_arr.size())){
                        if(k-same_exit_offset < 0){
                            //ret_arr = ret_arr.slice(k+1+same_exit_offset,ret_arr.length - k-same_exit_offset)
                            ret_arr = new ArrayList<>(ret_arr.subList(k+1+same_exit_offset,ret_arr.size() - k-same_exit_offset));
                        }
                        if(k+1+same_exit_offset >= ret_arr.size()){
                            //ret_arr = ret_arr.slice(k+1+same_exit_offset - ret_arr.length,k-same_exit_offset)
                            System.out.println(ret_arr);
                            System.out.println(k);
                            System.out.println(same_exit_offset);
                            System.out.println(ret_arr.size());
                            System.out.println(k+1+same_exit_offset - ret_arr.size());
                            System.out.println(k-same_exit_offset);
                            ret_arr = new ArrayList<>(ret_arr.subList(k+1+same_exit_offset - ret_arr.size(),k-same_exit_offset));
                        }
                    }else if(ret_arr.size()>0){
                        //ret_arr = ret_arr.slice(0,k-same_exit_offset).concat(ret_arr.slice(k+1+same_exit_offset,ret_arr.length))
                        ArrayList<String> temp_arr = new ArrayList<>(ret_arr.subList(0,k-same_exit_offset));
                        temp_arr.addAll(ret_arr.subList(k+1+same_exit_offset,ret_arr.size()));
                        ret_arr = new ArrayList<>(temp_arr);//TODO verify all three!!!
                    }
                    break;
                }
            }
        }
        return ret_arr;
    }
    
    public void add_other_room(Template_Room t){
        other_rooms.add(t); //other_rooms[other_rooms.length] = t
    }
    public void add_container(Container c){
        add_container(c,0.3);
    }
    public void add_container(Container c, Number n){//def 0.3
        container.add(c); //container[container.length] = c
        container_chance.add(n); //container_chance[container_chance.length] = n
    }
    
    public void add_action_object(CharActionObject ao, Number n){//def 0.3
        action_objects.add(ao); //action_objects[action_objects.length]  = ao
        action_chance.add(n); //action_chance [action_chance.length] = n
    }
    
    public void add_item(Item c, Number n){//def 0.3
        item.add(c); //item[item.length] = c
        item_chance.add(n); //item_chance[item_chance.length] = n
    }
    
    public void add_character(Character_template c, Number n){//def 0.3
        characters.add(c); //characters[characters.length] = c
        characters_chance.add(n); //characters_chance[characters_chance.length] = n
    }
    
    public void add_character_list(ArrayList<Character_template> c_list, Number n){//def 0.3
        characters.addAll(c_list); //characters[characters.length] = c_list
        characters_chance.add(n); //characters_chance[characters_chance.length] = n
    }
    
    public void add_party(Party party, Number n){//def 0.3
        parties.add(party); //parties[characters.length] = party
        parties_chance.add(n); //parties_chance[characters_chance.length] = n
    }
    public void spawn_creatures(Room r){
        spawn_creatures(r,0);
    }
    public void spawn_creatures(Room r,int level_adjust){//def 0
        ArrayList<Character> family_array = new ArrayList<>();
        Character clonech1 = new Character();
        int k = 0;
        for(k=0;k<characters.size();k++){
            if (Math.random() <= characters_chance.get(k).doubleValue() && characters.get(k) != null){
                if(characters.get(k) instanceof Character_template){
                    clonech1 = characters.get(k).gen_char(level_adjust, r);
                }else{//TODO what would these elses be?
                    //int rand_char = Math.round(Math.random()*(characters.get(k).size()-1));
                    //clonech1 = characters.get(k).get(rand_char).gen_char(level_adjust, r);
                }//TODO array of arrays? is this still necessary whem characters are added sequentially?
                clonech1.new_location(r, true);
                family_array.add(clonech1);//family_array[family_array.length] = clonech1
            }
        }
        
        for(k=1;k<family_array.size();k++){//Looking for a male/female pair
            if(family_array.get(k).sex != family_array.get(0).sex){
                family_array.get(k).impregnate(family_array.get(0),true);
                family_array.get(0).impregnate(family_array.get(k),true);
                family_array.get(k).surname = family_array.get(0).surname;
                family_array.get(k).personality.new_relationship(family_array.get(0), family_array.get(k), Relationship.initial_reaction_change, Personality.true_love, Relationship.married_type);
                family_array.get(0).personality.new_relationship(family_array.get(k), family_array.get(0), Relationship.initial_reaction_change, Personality.true_love, Relationship.married_type);
                break;
            }
        }
        
        for(k=0;k<parties.size();k++){
            if (Math.random() <= parties_chance.get(k).doubleValue() && parties.get(k) != null){
                Party clone_pty = new Party();
                parties.get(k).copyParty();
                int i = 0;
                /*TODO Array of arrays?
                for(i=0;i<parties[.get(k).length;i++){
                    clonech1 = parties[k][i].gen_char(level_adjust, r);
                    clone_pty.add_member(clonech1);
                    clonech1.set_party(clone_pty);
                }
                */
                for(i=0;i<clone_pty.members.size();i++){
                    clone_pty.members.get(i).new_location(r, true);
                }
                
            }
            
        }
    }
    
    public Room make_room(){
        return make_room(0);
    }
    public Room make_room(int level_adjust){//def 0
        Room new_room = new Room(description);
        new_room.set_template(this);
        int k = 0;
        for(k=0;k<descriptions.size();k++){
            new_room.add_sub_descriptions(descriptions.get(k));
        }
        for(k=0;k<room_actions.size();k++){
            new_room.addAction(room_actions.get(k));
            //TODO ROOM
        }
        for(k=0;k<container.size();k++){
            if (Math.random() <= container_chance.get(k).doubleValue() && container.get(k) != null){
                Container cloneCont1 = new Container();
                cloneCont1.clone(container.get(k),Math.abs(level_adjust));
                new_room.new_static_content(cloneCont1);
            }
        }
        for(k=0;k<action_objects.size();k++){
            if(Math.random() <= action_chance.get(k).doubleValue() && action_objects.get(k) != null){
                CharActionObject cloneAction = new CharActionObject();
                cloneAction.clone(action_objects.get(k));
                new_room.new_static_content(cloneAction);
            }				
        }
        for(k=0;k<item.size();k++){
            if (Math.random() <= item_chance.get(k).doubleValue() && item.get(k) != null){
                Item cloneit1 = item.get(k).copyItem();
                new_room.newContent(cloneit1);
            }
        }
        spawn_creatures(new_room,level_adjust);
        for(k=0;k<other_rooms.size();k++){
            if(other_rooms.get(k) != null){
                Room temp_room = other_rooms.get(k).make_room();
                
                //get the new direction
                int rand_x = 0;
                int rand_y = 0;
                int rand_z = 0;
                
                while(rand_x == 0 && rand_y == 0 && rand_z == 0){
                    rand_x = (int)Math.round(Math.random()*2) - 1;
                    rand_y = (int)Math.round(Math.random()*2) - 1;
                    //rand_z = Math.round(Math.random()*2) - 1;
                }
                
                String to_name = Area.get_direction(0, 0, 0, rand_x, rand_y, rand_z);
                String from_name = Area.get_direction(rand_x, rand_y, rand_z, 0, 0, 0);
                if(new_room.new_exit(temp_room, to_name) == 1){
                    temp_room.new_exit(new_room, from_name);
                }else{
                    k--;
                }
            }
        }
        new_room.set_discovery_difficulty(discovered_difficulty);
    
        new_room.set_sight_difficulty(sight_difficulty);
        
        new_room.set_locate_difficulty(locate_difficulty);
        
        if(show_area_effects)new_room.set_area_effects();
        
        new_room.set_background_img(background_image_id);
        
        new_room.set_combat_img(combat_image_id);
        return new_room;
    }
    

}
