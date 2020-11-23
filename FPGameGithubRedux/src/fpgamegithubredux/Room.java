package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Room extends StaticObject{
    private static final Logger LOGGER = Logger.getLogger(Room.class.getName());
    //protected String description
    protected ArrayList<Room> exits;
    protected ArrayList<String> exit_names;
    protected ArrayList<Object> contents;
    public ArrayList<StaticObject> static_contents;
    protected Area area;
    public Template_Room template;

    //protected String[] exitNames;//DUMMY
    protected static final String[] REUSED = new String[]{"somewhere", " arrives from "};

    protected ArrayList<CharAction> actions;
    public ArrayList<Integer> action_max_times;
    public ArrayList<Integer>  action_current_num_times;
    public ArrayList<CharAction> exit_actions;

    public Boolean player_discovered;
    public Boolean show_area_effects;

    public int discovered_difficulty;
    public int sight_difficulty;
    public int locate_difficulty;

    protected String lastTick;
    protected String nextTick;

    public String custom_name;
		
	public Combat_manager cm = null;

    protected int lastAreaTick;

    public int background_image_id;
    public int combat_image_id;

    public Room(){
        this("This is a room. There is something <a0> about it.");
    }
    public Room(String d){
        exits = new ArrayList<>();
        exit_names = new ArrayList<>();
        contents = new ArrayList<>();
        static_contents = new ArrayList<>();

        actions = new ArrayList<>();
        action_max_times = new ArrayList<>();
        action_current_num_times = new ArrayList<>();
        exit_actions = new ArrayList<>();
        description = d;

        CharAction tempAction = new CharAction();
        tempAction.name = "strange";
        tempAction.dialogue = "You </c0> around.";

        Challenge tempChal = new Challenge();
        tempChal.setText("look");

        Consequence tempConseq = new Consequence();
        tempConseq.addConsequence(0, 0.0, "It looks like someone has completely disinfected everything in this room. The smell is horrible. ", 0);
        tempConseq.addConsequence(0, 0.0, "Worse still, you notice everything is giving off its own light. ", 5);
        tempConseq.addConsequence(0, 0.0, "You decide the ground looks nice. ", -1);

        tempAction.addChallenge(tempChal, tempConseq);

        addAction(tempAction);

        show_area_effects = false;
			
        discovered_difficulty = 10;
        sight_difficulty = 10;
        locate_difficulty = 10;
        
        template = null;
        
        lastTick = "";
        nextTick = "";
        lastAreaTick = 0;
        background_image_id = -1;
        combat_image_id = -1;
        custom_name = "";
    }
    public void set_custom_name(String s){
        custom_name = s;
    }
    
    public void set_background_img(int i){
        background_image_id = i;
    }
    
    public int get_background_img(){
        int ret = background_image_id;
        if(ret >= 0){
            return background_image_id;
        }else if(area != null){
            return area.get_background_img();
        }
        return ret;
    }
    
    public void set_combat_img(int i){
        combat_image_id = i;
    }
    
    public int get_combat_img(){
        int ret = combat_image_id;
        if(ret >= 0){
            return combat_image_id;
        }else{
            return get_background_img();
        }
    }
    
    public void set_area_effects(){
        show_area_effects = !show_area_effects;
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
    
    public int get_discovery_difficulty(){
        return discovered_difficulty;
    }
    
    public int get_sight_difficulty(){
        return sight_difficulty;
    }
    
    public int get_locate_difficulty(){
        return locate_difficulty;
    }
    public String getLastTick(){
        return lastTick;
    }
    
    public void setLastTick(String s){
        lastTick = nextTick + s;
        nextTick = "";
    }
    public void spread_reaction(Character c_effected,Character c_acted, int i, Number k){
        int count = 0;
        for(count=0;count<contents.size();count++){
            if(contents.get(count) instanceof Character){
                Character temp_char = (Character)contents.get(count);
                if(temp_char != c_effected && temp_char != c_acted){
                    temp_char.personality.determine_reaction_to_other(temp_char, c_effected, c_acted, i, k);
                }
            }
        }
    }
    public Character get_random_character(){
        return get_random_character(null);
    }
    public Character get_random_character(Character c){//def null
        Character ret = null;
        ArrayList<Character> tempArray = new ArrayList<>();
        int count = 0;
        for(count=0;count<contents.size();count++){
            if(contents.get(count) instanceof Character){
                if((Character)contents.get(count) != c){
                    if(c != null){
                        if(c.party == null){
                            tempArray.add((Character)contents.get(count));//tempArray[tempArray.length] = contents[count]
                        }else{
                            if(!c.party.member_of((Character)contents.get(count)))tempArray.add((Character)contents.get(count));
                        }
                    }else{
                        tempArray.add((Character)contents.get(count));
                    }
                }
            }
        }
        ret = tempArray.get((int)Math.round(Math.random()*(tempArray.size()-1)));
        return ret;
    }
    public int get_character_count(){
        return get_character_count(null);
    }
    public int get_character_count(Character c){//def null
        int ret = 0;
        int count = 0;
        for(count=0;count<contents.size();count++){
            if(contents.get(count) instanceof Character){
                if(contents.get(count) != c){
                    if(c != null){
                        if(c.party == null){
                            ret++;
                        }else{
                            if(!c.party.member_of((Character)contents.get(count)))ret++;
                        }
                    }else{
                        ret++;
                    }
                }
            }
        }
        return ret;
    }
    
    public int get_exit_id(Room r){
        for(int i=0;i<exits.size();i++){
            if(exits.get(i) == r){
                return i;
            }
        }
        return -1;
    }
    public void set_template(Template_Room t){
        template = t;
    }
    
    public Template_Room get_template(){
        return template;	
    }
    
    public void player_found(){
        player_discovered = true;
        if(area != null)area.set_player_discovered();
    }
    
    public Boolean found(){
        return player_discovered;
    }
    
    public Boolean attached_to_other_area(){
        Boolean ret = false;
        int i = 0;
        for(i=0;i<exits.size();i++){
            if(exits.get(i).area != area) ret = true;//TODO return true faster?
        }
        
        return ret;
    }
    
    public void add_exit_action(Room r,CharAction a){
        int i = 0;
        for (i=0;i<exits.size();i++){
            if(exits.get(i) == r){
                a.set_id(actions.size() + i);
                exit_actions.set(i, a);//exit_actions[i] = a
            }
        }
    }
    /*
    //Same to here as original, line 291, aside from constructors
    public String getRoomDescription(Character lookingCharacter){//dummy version
        String ret;
        StringBuilder bld = new StringBuilder();
        bld.append("<br>" + description + "<br>");//ret = "<br>" + description + "<br>"
        String output = "";
        for (int i=0;i<static_contents.size();i++){
            if (static_contents.get(i) != null){
                output = output + static_contents.get(i).get_description();
                if (i == static_contents.size() -1){
                    output = output + "<br>";
                }
            }
        }
        
        if(show_area_effects){
            output += area.get_outdoor_description();
        }
        
        for(int i=0; i<descriptions.size();i++){
             while (!output.equals(output.replace("<s"+i+">","<a href=\"event:inspect,-1," + Integer.toString(i) +"\"><i>"))) output = output.replace("<s"+i+">","<a href=\"event:inspect,-1," + Integer.toString(i) +"\"><i>");
            while (!output.equals(output.replace("</s"+i+">","</i></a>"))) output = output.replace("</s"+i+">","</i></a>");
        }
        bld.append(output);            
        bld.append(get_exits());
        
        
        
        bld.append("The room contains: ");//ret += "The room contains: "
        Boolean nothing = true;
        if(!contents.isEmpty()){
            for(Object o : contents){
                if(o instanceof Character){
                    Character tempChar = (Character)o;
                    if(tempChar != lookingCharacter){
                        bld.append(" <a href=\"event:look," + contents.indexOf(o) +"\">" +tempChar.getStatus(lookingCharacter) + "</a>,");
                        nothing = false;
                    }
                }else if(o instanceof Item){
                    Item tempItem = (Item)o;

                    bld.append(" <a href=\"event:pick_up," + contents.indexOf(o) +"\">" + tempItem.getDroppedDescription() + "</a>,");                    
                    nothing = false;
                }
            }
        }
        
        if(Boolean.TRUE.equals(nothing))bld.append("Nothing!");//ret += "Nothing!"
        
        ret = bld.toString();

        if(ret.charAt(ret.length()-1) == ',')ret = ret.substring(0, ret.length()-1);

        for(CharAction a : actions){
            if(a != null){
                ret = ret.replaceAll("<a"+actions.indexOf(a)+">", "<a href=\"event:action,-1," + actions.indexOf(a) +"\"><i>"+a.getName() +"</i></a>");
            }
        }

        return ret;
    }
    */
    
    
    public String getRoomDescription(){
        return getRoomDescription(null);
    }
    public String getRoomDescription(Character c){
        String output;
        int i;
        
        output =  "<br>" + description + "<br>"; 
        
        for (i=0;i<static_contents.size();i++){
            if (static_contents.get(i) != null){
                output = output + static_contents.get(i).get_description();
                if (i == static_contents.size() -1){
                    output = output + "<br>";
                }
            }
        }
        
        if(show_area_effects){
            output += area.get_outdoor_description();
        }
        
        for(i=0; i<descriptions.size();i++){
            while (output != output.replace("<s"+i+">","<a href=\"event:inspect,-1," + i +"\"><i>")) output = output.replace("<s"+i+">","<a href=\"event:inspect,-1," + i +"\"><i>");
            while (output != output.replace("</s"+i+">","</i></a>")) output = output.replace("</s"+i+">","</i></a>");
        }
                    
        output +=  get_exits();
        
        if (contents.size() > 0) output = output + "<br>The room contains: ";
        String content_string = "";
        Boolean nothing = false;
        for (i=0;i<contents.size();i++){
            
            if(contents.get(i) != null){
                if (contents.get(i) instanceof Character){
                    Character temp = (Character)contents.get(i);
                    
                    if(temp == c)continue;
                    if(c.party != null){
                        if(c.party.member_of(temp))continue;
                    }
                    Boolean already_in_combat = false;
                    if(cm != null){
                        if(cm.get_init(temp) >= 0) already_in_combat = true;
                        if(cm.get_init(c) >= 0) already_in_combat = false;
                    }
                    
                    if((temp.get_aggresive(c)/*||c.get_aggresive(temp)*/) && c.get_combat_status() && temp.get_combat_status() && (temp.busy <= 0 || !already_in_combat)){
                        int rand_enemy = c.location.getContentID(c);
                        int rand = temp.personality.determine_action(c, temp);
                        if(rand >= 0){
                            if(cm == null) cm = new Combat_manager();
                            cm.add_participant(temp);
                            cm.add_participant(c);
                            c.setBusy();
                            temp.setBusy();
                            int dynamic_choice = -1;
                            int chall_id = -1;
                            CharAction temp_action = temp.get_attack_action(rand);
                            if(temp_action.consequences.get(0) instanceof DynamicConsequence && ((DynamicConsequence)temp_action.consequences.get(0)).consequence_list_type != DynamicConsequence.list_nolist){
                                chall_id = 0;
                                dynamic_choice = temp.personality.determine_dynamic(rand_enemy, rand, temp);
                            }
                            
                            if(dynamic_choice == -1){
                                output = "<br><a href=\"event:combat,"+c.location.getContentID(temp)+","+rand+","+rand_enemy+"\"><i>" + temp.personality.get_name(c,temp) + " is attacking.</i></a>";
                            }else{
                                output = "<br><a href=\"event:combat,"+c.location.getContentID(temp)+","+rand+","+rand_enemy+","+chall_id+","+dynamic_choice+"\"><i>" + temp.personality.get_name(c,temp) + " is attacking.</i></a>";
                            }
                            
                            return output;
                        }else{
                            LOGGER.info("(Room.get_room_description)That's odd... should be starting combat, but couldn't figure out an attack");
                        }
                    }
                    
                    if(cm != null && cm.get_init(temp) > -1 && cm.active_combat()){
                        //character is part of combat... skip 'em
                        continue;
                    }else if(temp.party == null){
                        
                        if (nothing){
                            content_string = content_string + ", ";
                            //if(i == contents.length -3) output += " and";
                        }
                        
                        content_string += "<a href=\"event:look," + i +"\">" +temp.getStatus(c) + "</a>";
                    }else{
                        if(temp.party.get_leader() == temp){
                            
                            if (nothing){
                                content_string = content_string + ", ";
                                //if(i == contents.length -3) output += " and";
                            }
                            
                            content_string += temp.party.get_status(c);
                        }else{
                            continue;
                        }
                    }
                }else if(contents.get(i) instanceof Item){
                    Item temp2 = (Item)contents.get(i);
                    if(content_string.indexOf(temp2.getDroppedDescription()) >= 0){
                        if(content_string.charAt(content_string.indexOf(temp2.getDroppedDescription())-2) == 'x'){
                            int char_loc;
                            char_loc = content_string.indexOf(temp2.getDroppedDescription())-1;
                            
                            while(content_string.charAt(char_loc) != '>' && char_loc >= 0){
                                char_loc--;
                            }
                            char_loc++;
                            
                            int item_count = Integer.parseInt(content_string.substring(char_loc, content_string.indexOf(temp2.getDroppedDescription())-2-char_loc));
                            item_count ++;
                            
                            content_string = content_string.substring(0,char_loc) + item_count + "x " + content_string.substring(content_string.indexOf(temp2.getDroppedDescription()),content_string.length() - content_string.indexOf(temp2.getDroppedDescription()));
                        }else{
                            content_string = content_string.substring(0,content_string.indexOf(temp2.getDroppedDescription())) + "2x " + content_string.substring(content_string.indexOf(temp2.getDroppedDescription()),content_string.length() - content_string.indexOf(temp2.getDroppedDescription()));
                        }
                    }else{
                        if (nothing){
                            content_string = content_string + ", ";
                            //if(i == contents.length -3) output += " and";
                        }
                        content_string = content_string + "<a href=\"event:pick_up," + i +"\">" + temp2.getDroppedDescription() + "</a>";
                    }
                }
                nothing = true;
            }
        }
        
        if(cm != null && cm.active_combat()){
            if (nothing){
                content_string = cm.get_description(c)  + ", " + content_string;
                //if(i == contents.length -3) output += " and";
            }else{
                nothing = true;
                content_string = cm.get_description(c) + content_string;
            }
        }
        
        if (!nothing){
            content_string += "Nothing!";
        }else{
            content_string += ".";
        }
        
        output += content_string;
        
        
        for (int j = 0;j<actions.size();j++){
                if(actions.get(j) != null) {					
                    if (action_max_times.get(j) > action_current_num_times.get(j) || action_max_times.get(j) == -1){
                        output = output.replace("<a"+j+">","<a href=\"event:action,-1," + j +"\"><i>"+actions.get(j).getName() +"</i></a>"); 						
                    }else{
                        output = output.replace("<a"+j+">",actions.get(j).getName()); 
                    }
                }
            }
                    
        return output;
    }//TODO delete earlier demo version, fix this version 
        

    public void addAction(CharAction a){
        addAction(a, -1);
    }
    public void addAction(CharAction newAction,int num_times ){//def -1
        //commented in real version
        newAction.charID = actions.size();
        actions.add(newAction);
        action_max_times.add(num_times);//These two chouldn't hurt
        action_current_num_times.add(0);
        for(int i=0;i<exit_actions.size();i++){
            if(exit_actions.get(i) != null)exit_actions.get(i).set_id(i + actions.size());
        }
    }

    public CharAction getAction(int actionID){//rest commented in
        if(actionID>=0 && actionID < actions.size()){
            action_current_num_times.set(actionID, action_current_num_times.get(actionID+1));
            return actions.get(actionID);
        }else if(actionID>=0){
            return exit_actions.get(actionID - actions.size());
        }
        return null;
    }

    public String fireChallenge(int actionID, int challengeID, Character triggeringCharacter){
        return fireChallenge(actionID, challengeID, triggeringCharacter,null);
    }
    public String fireChallenge(int actionID, int challengeID, Character triggeringCharacter,ArrayList<Integer> dynamic_choice){
        String ret = "";
        CharAction tempAction = getAction(actionID);
        if(tempAction != null){
            ret = tempAction.challenge(challengeID, triggeringCharacter,null,0,dynamic_choice);
            if(ret.indexOf("</replace>") >= 0){
                tempAction = tempAction.consequences.get(challengeID).replace_action;
                if(tempAction != null){
                    actions.set(actionID, tempAction);
                }
                
                while(ret.indexOf("</replace>") >= 0)ret = ret.replace("</replace>", "");
            }
        }
        return ret;
    }//dummy version, commented rest in
    public int getContentID(Object o){
        return contents.indexOf(o);
    }
    public String get_content_sub_description(int i, int k){
        String s = "";
        if (i == -1 && k >= 0 && k < descriptions.size()){
            s = get_sub_description(k,i);
            int j = 0;
            for (j=0;j<actions.size();j++){
                 if(actions.get(j) != null){
                     if (action_max_times.get(j) > action_current_num_times.get(j) || action_max_times.get(j) == -1){
                        s = s.replace("<a"+j+">","<a href=\"event:action,-1," + Integer.toString(j) +"\"><i>"+actions.get(j).getName() +"</i></a>"); 
                     }else{
                         s = s.replace("<a"+j+">",actions.get(j).getName());
                     }
                 }
             }
             return s;
        }
        
        
        if (static_contents.size() > i && i >= 0) return static_contents.get(i).get_sub_description(k,i);
        
        return s;
        
    }


    public Object getContent(int objID){
        if (contents.size() > objID && objID >= 0)return contents.get(objID);
        return null;
    }
    
    public void remove_exit(Room e){
        int i = 0;
        for(i=0;i<exits.size();i++){
            if(exits.get(i) == e){
                //exit_names = exit_names.slice(0,i).concat(exit_names.slice(i+1,exit_names.length))
                exit_names.remove(i);
                //exits = exits.slice(0,i).concat(exits.slice(i+1,exits.length))
                exits.remove(i);
                //exit_actions = exit_actions.slice(0,i).concat(exit_actions.slice(i+1,exit_actions.length))
                exit_actions.remove(i);
                break;
            }
        }
    }
    public void remove_static_contents(int i){
        //static_contents = static_contents.slice(0, i).concat(static_contents.slice(i+1, static_contents.length))
        static_contents.remove(i);

        for(int count=0;count<static_contents.size();count++){
            static_contents.get(count).set_id(count);
        }
    }
    public int new_exit(Room e){
        return new_exit(e,null);
    }
    public int new_exit(Room e,String d){// default d = null
        int i = 0;
        int k = 0;
        String[] dir_list = new String[]{"North", "East", "West", "North-East", "North-West", "South-West",  "South-East", "South"};
        String[] not_dir_list = new String[]{"South", "West", "East", "South-West", "South-East", "North-East", "North-West", "North"};
        
        LOGGER.info("Attempting to add an exit to a room");
        
        if(e == null) return -1;
        
        if (d == null){
            for (i=0;i<dir_list.length;i++){
                Boolean b = false;
                for (k=0;k<exit_names.size();k++){
                    if (dir_list[i].equals(exit_names.get(k))){
                        b = true;
                        break;
                    }
                }
                if (b) continue;
                //TODO just do a contains?
                
                if (e.new_exit(this,not_dir_list[i]) != -1){
                    exit_names.add(dir_list[i]); //exit_names[exit_names.length] = dir_list[i]
                    exits.add(e); //exits[exits.length] = e
                    if(template != null && template.exit_actions.get(0) != null){
                        add_exit_action(e, Area.generate_filler_exit_action(null, e, dir_list[i], template.exit_actions.get(0), template.exit_challenges.get(0), template.exit_consequences.get(0)));
                    }
                    break;
                }
            }
        }else{//defined direction
            for (i=0;i<exit_names.size();i++){
                if (d.equals(exit_names.get(i)) || e == exits.get(i)) return -1;
                //TODO is this an Already Connected check?
                LOGGER.info("Already Connected!");
            }
            if(exit_names.size() <= 0){
                exit_names.add(i,d); //exit_names = exit_names.slice(0,i).concat(d).concat(exit_names.slice(i,exit_names.length))
                exits.add(i,e); //exits = exits.slice(0,i).concat(e).concat(exits.slice(i,exits.length))
                exit_actions.add(i,null); //exit_actions = exit_actions.slice(0,i).concat(null).concat(exit_actions.slice(i,exit_actions.length))
                if(template != null && template.exit_actions.size() > 0 && template.exit_actions.get(0) != null){
                    add_exit_action(e, Area.generate_filler_exit_action(null, e, d, template.exit_actions.get(0), template.exit_challenges.get(0), template.exit_consequences.get(0)));
                }
                for(k=0;k<exit_actions.size();k++){
                    if(exit_actions.get(k) != null)exit_actions.get(k).set_id(k + actions.size());
                }
                
            }else{
                for(i=0;i<exit_names.size();i++){
                    if(exit_names.get(i) == null){
                        exit_names.set(i, d);
                        exits.set(i, e);
                        if(template != null && template.exit_actions.get(0) != null){
                            add_exit_action(e, Area.generate_filler_exit_action(null, e, d, template.exit_actions.get(0), template.exit_challenges.get(0), template.exit_consequences.get(0)));
                        }
                        break;
                    }
                    
                    if(arbitrary_value_generator(d) < arbitrary_value_generator(exit_names.get(i))){
                        exit_names.add(i,d); //exit_names = exit_names.slice(0,i).concat(d).concat(exit_names.slice(i,exit_names.length))
                        exits.add(i,e); //exits = exits.slice(0,i).concat(e).concat(exits.slice(i,exits.length))
                        exit_actions.add(i,null); //exit_actions = exit_actions.slice(0,i).concat(null).concat(exit_actions.slice(i,exit_actions.length))
                        if(template != null && template.exit_actions.size() > 0 && template.exit_actions.get(0) != null){
                            add_exit_action(e, Area.generate_filler_exit_action(null, e, d, template.exit_actions.get(0), template.exit_challenges.get(0), template.exit_consequences.get(0)));
                        }
                        for(k=0;k<exit_actions.size();k++){
                            if(exit_actions.get(k) != null)exit_actions.get(k).set_id(k + actions.size());
                        }
                        break;
                    }
                    
                }
            }				
        }
        
        if(e == this) LOGGER.info("(Room.new_exit)Linked Room to self");
                                
        return 1;
    }
    public int arbitrary_value_generator(String s){
        if(s.equals("North")){
            return 0;
        }else if(s.equals("North-East")){
            return 1;
        }else if(s.equals("East")){
            return 2;
        }else if(s.equals("South-East")){
            return 3;
        }else if(s.equals("South")){
            return 4;
        }else if(s.equals("South-West")){
            return 5;
        }else if(s.equals("West")){
            return 6;
        }else if(s.equals("North-West")){
            return 7;
        }else if(s.equals("Up")){
            return 8;
        }else if(s.equals("Down")){
            return 9;
        }else{
            return exit_names.size();
        }
    }
    public void newContent(Object o){newContent(o, null);}
    public void newContent(Object o, Room prevRoom){
        contents.add(o);
        int i = 0;
        for(i=0;i<=contents.size()-1;i++){//.length
            if(contents.get(i) == null){//[i]
                contents.set(i, o);//[i]
                break;
            }
        }
        
        if(o instanceof Character){//was is
            Character tempChar = (Character)(o);
            String fromName = REUSED[0];
            
            if(prevRoom != null){
                
                fromName = getExitName(prevRoom);
                if(!fromName.equals(REUSED[0]))fromName = "the "+ fromName;
                
                if(prevRoom.lastAreaTick > lastAreaTick){
                    nextTick += tempChar.getName() + REUSED[1]+fromName+".<br>";
                }else{
                    setLastTick(getLastTick() + tempChar.getName() + REUSED[1]+fromName+".<br>");
                }
            }else{
                setLastTick(getLastTick() + tempChar.getName() + REUSED[1]+fromName+".<br>");
            }
        }
    }
    public String getExitName(Room r){
        int i;
        for(i=0;i<exits.size();i++){
            if(exits.get(i) == r) return exit_names.get(i);
        }
        
        return REUSED[0];
    }
    public void removeContent(Object o){
        for (int i=0;i<contents.size();i++){
            if(contents.get(i)==o){
                contents.remove(i);//contents[i] = null
                break;
            }
        }
    }

    public Item itemLoss(int contentID){//same as original from here down (original line 697)
        if(contentID >= 0 && contentID < contents.size() && contents.get(contentID) instanceof Item){
            LOGGER.info("valid ID");//the instanceOf check is new though
            Item tempItem = (Item)contents.get(contentID);
            LOGGER.info("Item lost is:" + tempItem.getDroppedDescription());
            contents.remove(contentID);
            return tempItem;
        }
        return null;
    }
    public String open(int i){
        if( 0 <= i && i < static_contents.size()){
            if (static_contents.get(i) instanceof Container){
                Container cont = (Container)static_contents.get(i);
                return cont.open();
            }
        }
        return "";
                    
    }
    
    public void new_static_content(StaticObject o){
        //lets make sure we don't already have this particular object...
        Boolean found = false;
        int i = 0;
        for(i=0;i<static_contents.size();i++){
            if(static_contents.get(i) == o){
                found = true;
                break;
            }
        }
        
        if(!found){
            o.set_id(static_contents.size());
            static_contents.add(o); //static_contents[static_contents.length] = o
        }
        
    }
    
    public Item take_from_sub_content(int i,int k){
        if( 0 <= i && i < static_contents.size() && static_contents.get(i) instanceof Container){
            Container temp = (Container)static_contents.get(i);
            return temp.item_loss(k);
        }
        return null;
    }
    
    public int get_exit_by_name(String s){
        int i= 0;
        for(i=0;i<exit_names.size();i++){
            if(exit_names.get(i).equals(s)) return i;
        }
        return -1;
    }
    
    public String get_exits(){
        int i;
        String output;
        
        output = "There are " + exits.size() + " visible exits: ";
        
        for (i=0;i<exits.size();i++){
            
            output = output + "<a href=\"event:go_to_new_room," + Integer.toString(i) +"\"><font color='#4CC417'>"+ exit_names.get(i)+"</font></a>";

            if (i<exits.size() - 1){
                output = output + ",";
            }
            output = output + " ";
        }


        return output;
    }
    
    public Room get_exit(int i){
        if(i<exits.size() && i >= 0) return exits.get(i);
        return null;
    }
    
    public String get_exit_direction(int i){
        if(i<exit_names.size() && i >= 0) return exit_names.get(i);
        return "";
    }
    
    @Override 
    public String get_sub_description(int j,int k){
        String ret = "";
        int i;
        
        if (j < descriptions.size() && j >= 0){
            ret = descriptions.get(j);
        } else {
            return ret;
        }
        
        for(i=0; i<descriptions.size();i++){
             ret = ret.replace("<s"+i+">","<a href=\"event:inspect,-1," + Integer.toString(i) +"\"><i>");
            ret = ret.replace("</s"+i+">","</i></a>");
        }
        
        return ret;
    }
}