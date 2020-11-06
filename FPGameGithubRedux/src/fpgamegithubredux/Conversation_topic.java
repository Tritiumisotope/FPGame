package fpgamegithubredux;

import java.util.ArrayList;

public class Conversation_topic {
	
    public static final int ask_topic = 0;
    public static final int being_told_topic = 1;
    public static final int telling_topic = 2;
    
    
    public String dialog_name;
    
    public ArrayList<CharAction> actions;//public var actions:Array
    
    public ArrayList<Integer> tell_dialog;

    
    //maybe get rid of these three arrays, and replace with single array of instances of the Challenge class
    public ArrayList<ArrayList<Integer>> stat_check;
    public ArrayList<ArrayList<Integer>> check_challenge;
    public ArrayList<Boolean> party_check;
    public ArrayList<Mob> mob_check;
    //end contemplations
    
    public Boolean no_spread;
    public Boolean no_mention;
    
    protected ArrayList<String> ct_ref_names;//public var ct_ref_names:Array
    
    public Conversation_topic(){
        // constructor code
        
        dialog_name = "";
        actions = new ArrayList<>();
        
        tell_dialog = new ArrayList<>();
        stat_check = new ArrayList<>();
        check_challenge = new ArrayList<>();
        party_check = new ArrayList<>();
        mob_check = new ArrayList<>();
        ct_ref_names = new ArrayList<>();
        
        no_spread = false;
        no_mention = false;
        
    }
    
    public void add_topic_reference_by_name(String ref_name){
        ct_ref_names.set(ct_ref_names.size(),ref_name);//ct_ref_names[ct_ref_names.length] = ref_name
    }
    
    public void set_no_spread(){
        no_spread = !no_spread;
    }
    
    public Boolean get_spread(){
        return !no_spread;
    }
    
    public void set_no_mention(){
        no_mention = !no_mention;
    }
    
    public Boolean get_mention(){
        return !no_mention;
    }
    public void add_dialog(String s, int stat_id/*int = -1*/, int defence/*int = 0*/,Boolean same_party,int ask_or_tell){
        add_dialog(s, stat_id, defence, same_party, ask_or_tell, null);
    }
    public void add_dialog(String s, int stat_id/*int = -1*/, int defence/*int = 0*/,Boolean same_party,int ask_or_tell, Mob mob){
        //stat_id:Array = null/*int = -1*//*, defence:Array = null/*int = 0*//*, same_party:Boolean = false, ask_or_tell:int = 0, mob:Mob = null
        CharAction n_action = new CharAction();
        n_action.set_dialogue(s);
        add_action(n_action, stat_id, defence, same_party, ask_or_tell,mob);
    }
    
    public void add_dialog(String s, ArrayList<Integer> stat_id, ArrayList<Integer> defence,Boolean same_party,int ask_or_tell){
        add_dialog(s, stat_id, defence, same_party, ask_or_tell, null);
    }
    public void add_dialog(String s, ArrayList<Integer> stat_id, ArrayList<Integer> defence,Boolean same_party,int ask_or_tell, Mob mob){
        //stat_id:Array = null/*int = -1*//*, defence:Array = null/*int = 0*//*, same_party:Boolean = false, ask_or_tell:int = 0, mob:Mob = null
        CharAction n_action = new CharAction();
        n_action.set_dialogue(s);
        add_action(n_action, stat_id, defence, same_party, ask_or_tell,mob);
    }
    
    public void add_action(CharAction a, int stat_id/*int = -1*/, int defence/*int = 0*/,Boolean same_party,int ask_or_tell){
        add_action(a,stat_id,defence,same_party,ask_or_tell,null);
    }
    public void add_action(CharAction a, int stat_id/*int = -1*/, int defence/*int = 0*/,Boolean same_party,int ask_or_tell, Mob mob){
        //a:Action, stat_id:Array = null/*int = -1*/, defence:Array = null/*int = 0*/, same_party:Boolean = false, ask_or_tell:int = 0, mob:Mob = null
        //arraylist from single int hack
        ArrayList<Integer> dia1 = new ArrayList<>();
        ArrayList<Integer> dia2 = new ArrayList<>();
        dia1.add(stat_id);
        dia2.add(defence);
        actions.add(a);//actions[actions.length] = a
        stat_check.add(dia1);//stat_check[stat_check.length] = stat_id
        check_challenge.add(dia2);//check_challenge[check_challenge.length] = defence
        party_check.add(same_party);//party_check[party_check.length] = same_party
        tell_dialog.add(ask_or_tell);//tell_dialog[tell_dialog.length] = ask_or_tell
        mob_check.add(mob);//mob_check[mob_check.length] = mob
    }
    public void add_action(CharAction a, ArrayList<Integer> stat_id/*int = -1*/, ArrayList<Integer> defence/*int = 0*/,Boolean same_party,int ask_or_tell){
        add_action(a,stat_id,defence,same_party,ask_or_tell,null);
    }
    public void add_action(CharAction a, ArrayList<Integer> stat_id/*int = -1*/, ArrayList<Integer> defence/*int = 0*/,Boolean same_party,int ask_or_tell, Mob mob){
        //a:Action, stat_id:Array = null/*int = -1*/, defence:Array = null/*int = 0*/, same_party:Boolean = false, ask_or_tell:int = 0, mob:Mob = null
        actions.add(a);//actions[actions.length] = a
        stat_check.add(stat_id);//stat_check[stat_check.length] = stat_id
        check_challenge.add(defence);//check_challenge[check_challenge.length] = defence
        party_check.add(same_party);//party_check[party_check.length] = same_party
        tell_dialog.add(ask_or_tell);//tell_dialog[tell_dialog.length] = ask_or_tell
        mob_check.add(mob);//mob_check[mob_check.length] = mob
    }
    
    public void set_topic_name(String s){
        dialog_name = s;
    }
    
    public String get_topic_name(){
        return dialog_name;
    }
    
    public CharAction get_topic_step(int i){
        if(actions.get(i) != null) return actions.get(i);
        return null;
    }
    public int get_start_step(Character c_self, Character c_init){
        return get_start_step(c_self,c_init, false);
    }
    public int get_start_step(Character c_self, Character c_init,Boolean init_listening){//def false
        int ret = -1;
        //figure out the ask/tell/being told situation here...
        Boolean initiator_has_topic = false;
        int i = 0;
        ArrayList<Conversation_topic> init_topics = c_init.personality.get_topics(c_init);
        for(i=0;i<init_topics.size();i++){
            if(init_topics.get(i) == this || (init_topics.get(i).dialog_name.equals(this.dialog_name) && init_topics.get(i).actions.size() == this.actions.size())){
                initiator_has_topic = true;
                break;
            }
        }
        
        Boolean char_swap = false;
        Boolean need_ask = false;
        Boolean need_tell = false;
        Boolean need_told = false;
        //if c_init has the conversation topic, chances are we are in an ask/tell situation... if they do not, it is likely a "being told" situation.
        if(initiator_has_topic){
            Boolean self_has_topic = false;
            ArrayList<Conversation_topic> self_topics = c_self.personality.get_topics(c_self);
            for(i=0;i<self_topics.size();i++){
                if(self_topics.get(i) == this || (self_topics.get(i).dialog_name.equals(this.dialog_name) && self_topics.get(i).actions.size() == this.actions.size())){
                    self_has_topic = true;
                    break;
                }
            }
            
            if(init_listening){
                need_told = true;
            }else{
                if(self_has_topic && initiator_has_topic){
                    need_ask = true;
                    //need to swap the characters around for the stat check
                    char_swap = true;
                }else{
                    need_tell = true;
                }
            }
            
        }else{
            need_told = true;
        }
        
        for(i=0;i<actions.size();i++){
            if((need_ask && tell_dialog.get(i) == Conversation_topic.ask_topic) ||
               (need_tell && tell_dialog.get(i) == Conversation_topic.telling_topic) ||
               (need_told && tell_dialog.get(i) == Conversation_topic.being_told_topic)){
            
                Boolean pass_check = true;
                int check_count = 0;
                for(check_count=0;check_count<stat_check.get(i).size();check_count++){
                    if(stat_check.get(i).get(check_count) < 0 && stat_check.get(i).get(check_count) != Character.gold_id){
                        //check relationship
                        if(stat_check.get(i).get(check_count) == Character.relations_affect_id){
                            if(c_self.personality.check_relationship(c_init,c_self) >= check_challenge.get(i).get(check_count)){

                                if(!party_check.get(i) || (party_check.get(i) && c_self.party == c_init.party && c_self.party != null)){
                                    ret = i;
                                }else{
                                    pass_check = false;
                                }

                            }else{
                                pass_check = false;
                            }
                        }else if(stat_check.get(i).get(check_count) == Character.attraction_id){
                            if(c_self.personality.determine_attraction(c_init,c_self) >= check_challenge.get(i).get(check_count)){

                                if(!party_check.get(i) || (party_check.get(i) && c_self.party == c_init.party && c_self.party != null)){
                                    ret = i;
                                }else{
                                    pass_check = false;
                                }
                                
                            }else{
                                pass_check = false;
                            }
                        }else if(stat_check.get(i).get(check_count) == Character.introduced_id){
                            
                            if(c_self.personality.get_introduced(c_init,c_self)){
                                if(check_challenge.get(i).get(check_count) < 0){
                                    pass_check = false;
                                }else{
                                    if(!party_check.get(i) || (party_check.get(i) && c_self.party == c_init.party && c_self.party != null)){
                                        ret = i;
                                    }else{
                                        pass_check = false;
                                    }
                                }
                            }else{
                                if(check_challenge.get(i).get(check_count)< 0){
                                    
                                }else{
                                    pass_check = false;
                                }
                            }
                            
                        }else{
                            //trace("(Conversation_topic.get_start_step)got id " + stat_check.get(i).get(check_count) + " and don't know what to do about it");
                        }
                    }else{
                        //check stat
                        if(char_swap){//need to swap characters for this stat check
                            Character temp_char = c_self;
                            c_self = c_init;
                            c_init = temp_char;
                        }
                        if(c_self.getStat(stat_check.get(i).get(check_count)) >= check_challenge.get(i).get(check_count)){

                            if(!party_check.get(i)|| (party_check.get(i) && c_self.party == c_init.party && c_self.party != null)){
                                ret = i;
                            }else{
                                pass_check = false;
                            }
                            
                        }else{
                            pass_check = false;
                        }
                        if(char_swap){//swap 'em back
                            Character temp_char = c_self;
                            c_self = c_init;
                            c_init = temp_char;
                        }
                    }
                }
                
                if(pass_check && mob_check.get(i) != null){
                    pass_check = false;
                    for(check_count=0;check_count<c_self.personality.mob_allegiances.size();check_count++){
                        if(mob_check.get(i) == c_self.personality.mob_allegiances.get(check_count)){
                            pass_check = true;
                            break;
                        }
                    }
                }
                
                if(pass_check)ret = i;
            }
        }
        return ret;
        
    }
    
}
