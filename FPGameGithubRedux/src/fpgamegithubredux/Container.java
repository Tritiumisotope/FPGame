package fpgamegithubredux;

import java.util.ArrayList;

public class Container extends StaticObject {

    public ArrayList<Item> contents;//public var contents:Array;
    public ArrayList<Object> contents_table;//public var contents_table:Array;
    public String name;
    public Boolean open_or_close;
    public Boolean always_open;
    public String bury;
    public String bury_text;
    public CharAction bury_action;
    
    public Container() {
        init();
    }
    
    public void init(){
        contents = new ArrayList<>();//contents = new Array();
        contents_table = new ArrayList<>();//contents_table = new Array();
        open_or_close = false;
        always_open = false;
        bury = "";
        bury_action = null;
    }
    
    public void set_name(String n){
        name = n;			
    }
    public void set_bury(){
        set_bury("","",null);
    }
    public void set_bury(String s , String b, CharAction ba){//def "","",null
        if(s.equals("")){
            bury = "Bury";
            bury_text = "buries";
        }else{
            bury = s;
            bury_text = b;
        }
        bury_action = ba;
    }
    
    public void add_content(Item item){
        //contents[contents.length] = item;\
        contents.add(item);
    }
    
    public void add_to_loot_table(Item item,Number item_probability){
        //contents_table[contents_table.length] = item;
        contents_table.add(item);
        //contents_table[contents_table.length] = item_probability;
        contents_table.add(item_probability);
    }
    
    public String get_content(){
        String output;
        int i;
        output = "";
        for(i=0;i<contents.size();i++){
            output += "<a href=\"event:loot,"+id+","+i+"\">" + contents.get(i).getName() + "</a>";
            if(i<contents.size()-1) output += ", ";
        }
        if(contents.size() > 1){
            output += "\n<font color='#0000FF'><a href=\"event:loot,"+id+",-1\">Get all</a></font>";
        }
        
        return output;
    }
    
    public String open(){
        open_or_close = !open_or_close;
        
        return "You " + (open_or_close?"open ":"close ") + "the <a href=\"event:inspect,"+id+",0\">" + name + "</a>";
    }
    
    public Item item_loss(int k){
        if( 0 <= k && k < contents.size()){
            if (contents.get(k) instanceof Item){//was is
                Item item = contents.get(k);
                //remove_content(contents.get(k));
                //TODO verify this works better
                contents.remove(k);
                return item;
            }
        }
        return null;
    }
    /*TODO render moot if above works
    public void remove_content(DynamicObject o){//needed for other?
        int i;
        Boolean found;
        found = false;
        for (i=0;i<contents.size();i++){
            if(contents.get(i)==o) found = true;
            if(found && i<contents.length-1){
                contents[i] = contents[i+1];
            }
        }
        if(found) contents.length = contents.length - 1;
    }
    */
    @Override 
    public String get_sub_description(int i, int k){
        String s;
        s="";
        if (i < descriptions.size() && i >= 0) s += descriptions.get(i)+ "\n";
        if (i == 0 && !always_open) s += "The " + name + " is <a href=\"event:open,"+k+"\">" + (open_or_close?"open.":"closed.") + "</a>\n";
        if (open_or_close || always_open){
            if (contents.size() > 0 ){
                s += "The " + name + " contains: " + get_content();
            }else{
                s += "The " + name + " is empty.";
            }				
        }
        
        if(!bury.equals("")){
            s += "\n\n<font color='#0000FF'><a href=\"event:loot,"+k+",-2\">"+bury+"</a></font>";
        }
        
        return s;
    }
    
    public void set_always_open(){
        always_open = !always_open;
    }
    
    public void clone(Container c,int floor_modifier){//default 0
        this.name = c.name;
        this.description = c.description;
        this.descriptions = c.descriptions;
        this.always_open = c.always_open;
        this.bury = c.bury;
        this.bury_text = c.bury_text;
        this.bury_action = c.bury_action;
        Item item = null;
        int i = 0;
        for (i-=0;i<c.contents.size();i++){
            //item = c.contents.get(i).clone();//TODO fuck clone, all my homies hate clone
            item = c.contents.get(i).copyItem();
            this.add_content(item);
        }
        contents_table = c.contents_table;
        for(i=0;i<contents_table.size()/2;i+=2){//TODO holy fuck check
            if(contents_table.get(i+1) instanceof Integer &&item != null){//had to add because packed with items and Integers
                if(Math.random() <= (Integer)contents_table.get(i+1)){
                    //item = contents_table[i].clone();

                    if(floor_modifier != 0){
                        int count = 0;
                        for(count=0;count<item.effects.size();count++){
                            if(item.effects.get(count) != null){
                                //item.effects[count]+=floor_modifier;
                                item.effects.set(count, item.effects.get(count) + floor_modifier);
                            }
                        }
                    }
                    this.add_content(item);
                }
            }
        }
    }
}

