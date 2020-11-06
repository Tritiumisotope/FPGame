package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Room extends StaticObject{
    private static final Logger LOGGER = Logger.getLogger(Room.class.getName());
    //protected String description
    protected ArrayList<Room> exits;
    protected ArrayList<String> exit_names;
    protected ArrayList<Object> contents;
    protected ArrayList<CharAction> actions;
    protected Area area;
    protected String[] exitNames;
    protected static final String[] REUSED = new String[]{"somewhere", " arrives from "};

    protected String lastTick;
    protected String nextTick;

    protected int lastAreaTick;

    public Room(){
        contents = new ArrayList<>();
        actions = new ArrayList<>();
        description = "This is a room. There is something <a0> about it.";

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
    }
    public Room(String d){
        contents = new ArrayList<>();
        actions = new ArrayList<>();
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
    }
    public String getLastTick(){
        return lastTick;
    }
    
    public void setLastTick(String s){
        lastTick = nextTick + s;
        nextTick = "";
    }
    public String getRoomDescription(Character lookingCharacter){
        String ret;
        StringBuilder bld = new StringBuilder();
        bld.append("<br>" + description + "<br>");//ret = "<br>" + description + "<br>"
        bld.append("The room contains: ");//ret += "The room contains: "
        Boolean nothing = true;
        if(!contents.isEmpty()){
            for(Object o : contents){
                if(o instanceof Character){
                    Character tempChar = (Character)o;
                    if(tempChar != lookingCharacter){
                        bld.append("<a href=\"event:look," + contents.indexOf(o) +"\">" +tempChar.getStatus(lookingCharacter) + "</a>,");
                        //ret += "<a href=\"event:look," + contents.indexOf(o) +"\">" +tempChar.getStatus(lookingCharacter) + "</a>,"
                        nothing = false;
                    }
                }else if(o instanceof Item){
                    Item tempItem = (Item)o;

                    bld.append("<a href=\"event:pick_up," + contents.indexOf(o) +"\">" + tempItem.getDroppedDescription() + "</a>,");
                    //ret += "<a href=\"event:pick_up," + contents.indexOf(o) +"\">" + tempItem.getDroppedDescription() + "</a>,"
                    nothing = false;
                }
            }
        }
        ret = bld.toString();
        if(Boolean.TRUE.equals(nothing))bld.append("Nothing!");//ret += "Nothing!"
        for(CharAction a : actions){
            if(a != null){
                ret = ret.replaceAll("<a"+actions.indexOf(a)+">", "<a href=\"event:action,-1," + actions.indexOf(a) +"\"><i>"+a.getName() +"</i></a>");
            }
        }

        return ret;
    }

    public String fireChallenge(int actionID, int challengeID, Character triggeringCharacter){
        String ret = "";

        CharAction tempAction = getAction(actionID);
        if(tempAction != null){
            ret = tempAction.challenge(challengeID, triggeringCharacter);
        }

        return ret;
    }

    public void addAction(CharAction newAction){
        newAction.charID = actions.size();
        actions.add(newAction);
    }

    public CharAction getAction(int actionID){
        if(actionID>=0 && actionID < actions.size()){
            return actions.get(actionID);
        }
        return null;
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
                    nextTick += tempChar.getName() + REUSED[1]+fromName+".\n";
                }else{
                    setLastTick(getLastTick() + tempChar.getName() + REUSED[1]+fromName+".\n");
                }
            }else{
                setLastTick(getLastTick() + tempChar.getName() + REUSED[1]+fromName+".\n");
            }
        }
    }
    public String getExitName(Room r){
        int i;
        for(i=0;i<exits.size();i++){
            if(exits.get(i) == r) return exitNames[i];
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

    public int getContentID(Object o){
        return contents.indexOf(o);
    }

    public Object getContent(int objID){
        return contents.get(objID);
    }

    public Item itemLoss(int contentID){
        if(contentID >= 0 && contentID < contents.size() && contents.get(contentID) instanceof Item){
            LOGGER.info("valid ID");
            Item tempItem = (Item)contents.get(contentID);
            LOGGER.info("Item lost is:" + tempItem.getDroppedDescription());
            contents.remove(contentID);
            return tempItem;
        }
        return null;
    }
}