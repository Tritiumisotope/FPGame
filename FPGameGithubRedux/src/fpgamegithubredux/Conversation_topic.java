package fpgamegithubredux;

import java.util.ArrayList;

public class Conversation_topic {
	
    public static final int ask_topic = 0;
    public static final int being_told_topic = 1;
    public static final int telling_topic = 2;
    
    
    public String dialog_name;
    
    public ArrayList<CharAction> actions;//public var actions:Array;
    /*
    public var tell_dialog:Array;
    //maybe get rid of these three arrays, and replace with single array of instances of the Challenge class
    public var stat_check:Array;
    public var check_challenge:Array;
    public var party_check:Array;
    public var mob_check:Array;
    //end contemplations
    */
    public Boolean no_spread;
    public Boolean no_mention;
    
    protected ArrayList<String> ct_ref_names;//public var ct_ref_names:Array;
    
    public Conversation_topic(){
        // constructor code
        
        dialog_name = "";
        actions = new ArrayList<>();
        /*
        tell_dialog = new Array();
        stat_check = new Array();
        check_challenge = new Array();
        party_check = new Array();
        mob_check = new Array();
        ct_ref_names = new Array();
        */
        no_spread = false;
        no_mention = false;
        
    }
    
    public void add_topic_reference_by_name(String ref_name){
        //ct_ref_names[ct_ref_names.length] = ref_name;
        ct_ref_names.set(ct_ref_names.size(),ref_name);
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
    /*
    public function add_dialog(s:String, stat_id:Array = null/*int = -1*//*, defence:Array = null/*int = 0*//*, same_party:Boolean = false, ask_or_tell:int = 0, mob:Mob = null):void{
        var n_action:Action = new Action();
        n_action.set_dialogue(s);
        add_action(n_action, stat_id, defence, same_party, ask_or_tell,mob);
    }
    */
    public void add_action(CharAction a, int[] stat_id/*int = -1*/, int[] defence/*int = 0*/,Boolean same_party,int ask_or_tell){
        add_action(a,stat_id,defence,same_party,ask_or_tell,null);
    }
    public void add_action(CharAction a, int[] stat_id/*int = -1*/, int[] defence/*int = 0*/,Boolean same_party,int ask_or_tell, Mob mob){
        //a:Action, stat_id:Array = null/*int = -1*/, defence:Array = null/*int = 0*/, same_party:Boolean = false, ask_or_tell:int = 0, mob:Mob = null
        //actions[actions.length] = a;
        actions.set(actions.size(), a);
        /*
        stat_check[stat_check.length] = stat_id;
        check_challenge[check_challenge.length] = defence;
        party_check[party_check.length] = same_party;
        tell_dialog[tell_dialog.length] = ask_or_tell;
        mob_check[mob_check.length] = mob;
        */
    }
    
    public void set_topic_name(String s){
        dialog_name = s;
    }
    /*
    public function get_topic_name():String{
        return dialog_name;
    }
    
    public function get_topic_step(i:int):Action{
        if(actions[i] != null) return actions[i];
        return null;
    }
    
    public function get_start_step(c_self:Character, c_init:Character, init_listening:Boolean = false):int{
        var ret:int = -1;
        //figure out the ask/tell/being told situation here...
        var initiator_has_topic:Boolean = false;
        var i:int = 0;
        var init_topics:Array = c_init.personality.get_topics(c_init);
        for(i;i<init_topics.length;i++){
            if(init_topics[i] == this || (init_topics[i].dialog_name == this.dialog_name && init_topics[i].actions.length == this.actions.length)){
                initiator_has_topic = true;
                break;
            }
        }
        
        var char_swap:Boolean = false;
        var need_ask:Boolean = false;
        var need_tell:Boolean = false;
        var need_told:Boolean = false;
        //if c_init has the conversation topic, chances are we are in an ask/tell situation... if they do not, it is likely a "being told" situation.
        if(initiator_has_topic){
            var self_has_topic:Boolean = false;
            i = 0;
            var self_topics:Array = c_self.personality.get_topics(c_self);
            for(i;i<self_topics.length;i++){
                if(self_topics[i] == this || (self_topics[i].dialog_name == this.dialog_name && self_topics[i].actions.length == this.actions.length)){
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
        
        i = 0;
        for(i;i<actions.length;i++){
            if((need_ask && tell_dialog[i] == Conversation_topic.ask_topic) ||
               (need_tell && tell_dialog[i] == Conversation_topic.telling_topic) ||
               (need_told && tell_dialog[i] == Conversation_topic.being_told_topic)){
            
                var pass_check:Boolean = true
                var check_count:int = 0;
                for(check_count;check_count<stat_check[i].length;check_count++){
                    if(stat_check[i][check_count] < 0 && stat_check[i][check_count] != Character.gold_id){
                        //check relationship
                        if(stat_check[i][check_count] == Character.relations_affect_id){
                            if(c_self.personality.check_relationship(c_init,c_self) >= check_challenge[i][check_count]){
                                if(!party_check[i] || (party_check[i] && c_self.party == c_init.party && c_self.party != null)){
                                    //ret = i;
                                }else{
                                    pass_check = false;
                                }
                            }else{
                                pass_check = false;
                            }
                        }else if(stat_check[i][check_count] == Character.attraction_id){
                            if(c_self.personality.determine_attraction(c_init,c_self) >= check_challenge[i][check_count]){
                                if(!party_check[i] || (party_check[i] && c_self.party == c_init.party && c_self.party != null)){
                                    //ret = i;
                                }else{
                                    pass_check = false;
                                }
                            }else{
                                pass_check = false;
                            }
                        }else if(stat_check[i][check_count] == Character.introduced_id){
                            if(c_self.personality.get_introduced(c_init,c_self)){
                                if(check_challenge[i][check_count] < 0){
                                    pass_check = false;
                                }else{
                                    if(!party_check[i] || (party_check[i] && c_self.party == c_init.party && c_self.party != null)){
                                        //ret = i;
                                    }else{
                                        pass_check = false;
                                    }
                                }
                            }else{
                                if(check_challenge[i][check_count] < 0){
                                    
                                }else{
                                    pass_check = false;
                                }
                            }
                        }else{
                            trace("(Conversation_topic.get_start_step)got id " + stat_check[i][check_count] + " and don't know what to do about it");
                        }
                    }else{
                        //check stat
                        if(char_swap){//need to swap characters for this stat check
                            var temp_char:Character = c_self;
                            c_self = c_init;
                            c_init = temp_char;
                        }
                        if(c_self.get_stat(stat_check[i][check_count]) >= check_challenge[i][check_count]){
                            if(!party_check[i] || (party_check[i] && c_self.party == c_init.party && c_self.party != null)){
                                //ret = i;
                            }else{
                                pass_check = false;
                            }
                        }else{
                            pass_check = false;
                        }
                        if(char_swap){//swap 'em back
                            temp_char = c_self;
                            c_self = c_init;
                            c_init = temp_char;
                        }
                    }
                }
                
                if(pass_check && mob_check[i] != null){
                    pass_check = false;
                    check_count = 0;
                    for(check_count;check_count<c_self.personality.mob_allegiances.length;check_count++){
                        if(mob_check[i] == c_self.personality.mob_allegiances[check_count]){
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
    */
}
