package fpgamegithubredux;

import java.util.ArrayList;

public class Room{

    protected String description;
    protected ArrayList<Object> contents;
    protected ArrayList<CharAction> actions;
    protected Room[] exits;
    protected Area area;
    protected String[] exitNames;

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

    public String getRoomDescription(Character lookingCharacter){
        String ret = "";

        ret = "<br>" + description + "<br>";
        ret += "The room contains: ";
        Boolean nothing = true;
        if(!contents.isEmpty()){
            for(Object o : contents){
                if(o instanceof Character){
                    Character tempChar = (Character)o;
                    if(tempChar != lookingCharacter){
                        ret += "<a href=\"event:look," + contents.indexOf(o) +"\">" +tempChar.getStatus(lookingCharacter) + "</a>,";
                        nothing = false;
                    }
                }else if(o instanceof Item){
                    Item tempItem = (Item)o;

                    ret += "<a href=\"event:pick_up," + contents.indexOf(o) +"\">" + tempItem.getDroppedDescription() + "</a>,";
                    nothing = false;
                }
            }
        }
        if(Boolean.TRUE.equals(nothing))ret += "Nothing!";
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
    }
    public void removeContent(Object o){
			//var found:Boolean;
			//found = false;
			for (int i=0;i<contents.size();i++){
				if(contents.get(i)==o){
                    //contents[i] = null;
                    contents.set(i,null);
					//if(i == contents.length - 1)found = true;
					break;
				}
			}
			//if(found) contents = contents.slice(0,contents.length-1);
    }

    public int getContentID(Object o){
        return contents.indexOf(o);
    }

    public Object getContent(int objID){
        return contents.get(objID);
    }

    public Item itemLoss(int contentID){
        if(contentID >= 0 && contentID < contents.size() && contents.get(contentID) instanceof Item){
            Item tempItem = (Item)contents.get(contentID);
            contents.remove(contentID);
            return tempItem;
        }
        return null;
    }
}