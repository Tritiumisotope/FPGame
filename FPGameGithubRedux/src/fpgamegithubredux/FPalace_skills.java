package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;

public class FPalace_skills {
    	
		public static final int adventure_id= 0;
        public static final int perception_id= 1;
            public static final int map_sight_id= 2;
            public static final int map_reading_id= 3;
            public static final int map_making_id= 4;
        public static final int initiative_id= 5;
        public static final int fortitude_id= 46;
        public static final int swimming_id= 6;
    public static final int fight_id= 7; 
        public static final int melee_id= 8;
            public static final int one_handed_id= 9;
            public static final int two_handed_id= 10;
            public static final int unarmed_id= 11;
                public static final int striking_id= 12;
                public static final int grappling_id= 13;
        public static final int ranged_id= 14;
        public static final int defence_id= 15;
            public static final int dodging_id= 16;
            public static final int blocking_id= 17;
            public static final int parrying_id= 18;
            
        public static final int toughness_id= 45;
    public static final int covert_id= 20; 
        //stealth
        public static final int theft_id= 21; 
    public static final int magic_id= 22; 
        public static final int mental_magic_id= 23;
        public static final int physical_magic_id= 24;
        public static final int spiritual_magic_id= 25;
        public static final int concentration_id= 19;
        //artifacts
    public static final int knowledge_id= 26;
        public static final int weighing_id= 27;
        public static final int valuing_id= 28;
    public static final int crafting_id= 29;
        public static final int alchemy_id= 30;
            public static final int item_alchemy_effects_id= 31;
            //potency
            //purity
        public static final int items_id= 32;
            public static final int item_effects_id= 33;
        public static final int sewing_id= 34;
        public static final int smithing_id= 35;
            public static final int weapon_effects_id= 36;
            public static final int equipment_effects_id= 37;
    public static final int people_id= 38;
        public static final int conversing_id= 39;
            public static final int flirting_id= 40;					
            public static final int intimidating_id= 41;
        public static final int sex_id= 42;
            public static final int blowjobs_id= 43;
        //politics/culture			
        public static final int trade_id= 44;
            
        
    /*Discworld Tree
=======SKILLS=======Level/Bonus================================================ 
adventuring.........    -    -         | | printing........   10   57 
| movement..........    -    -         | | sculpture.......   54  188 
| | swimming........   25  112         | music.............   10   57 
| | riding..........    -    -         | | instruments.....   10   57 
| | | horse.........   25  112         | | special.........   10   57 
| | | camel.........   25  112         | | theory..........   10   57 
| | climbing........    -    -         | | performance.....   10   57 
| | | tree..........   25  112         | points............   47  168 
| | | rock..........   25  112         faith...............    5   26 
| | | rope..........   25  112         | rituals...........    5   26 
| | sailing.........   25  112         | items.............    5   27 
| | following.......    -    -         | points............    5   27 
| | | pursuit.......   26  115         fighting............   24  110 
| | | evade.........   25  112         | melee.............   28  120 
| acrobatics........    -    -         | | dagger..........   16   78 
| | tumbling........   28  120         | | sword...........   54  162 
| | vaulting........   25  112         | | heavy-sword.....   15   75 
| | balancing.......   25  112         | | axe.............   15   75 
| evaluating........    -    -         | | mace............   15   75 
| | weapons.........   25  129         | | flail...........   15   75 
| | armour..........   25  129         | | polearm.........   81  183 
| perception........   26  125         | | misc............   15   75 
| direction.........   85  194         | range.............   10   49 
| health............  101  193         | | thrown..........   10   49 
| points............   31  132         | | bow.............   10   50 
covert..............   14   74         | | fired...........   10   49 
| stealth...........   15   77         | unarmed...........   18   90 
| | inside..........   15   77         | | striking........   21  102 
| | outside.........   15   77         | | grappling.......   15   75 
| | underwater......   15   77         | defence...........   25  112 
| hiding............   10   53         | | parrying........   20   99 
| | person..........   10   53         | | blocking........   10   50 
| | object..........   10   53         | | dodging.........   45  152 
| lockpick..........   10   50         | special...........   26  124 
| | doors...........   10   50         | | weapon..........   53  181 
| | safes...........   10   50         | | unarmed.........   15   83 
| | traps...........   10   50         | | tactics.........   26  129 
| manipulation......   24  113         | | mounted.........   10   50 
| | palming.........   20  103         | points............   41  152 
| | passing.........   16   82         magic...............  114  219 
| | sleight-of-hand.   41  156         | spells............  200  259 
| | stealing........   20  103         | | offensive.......  160  239 
| casing............   10   54         | | defensive.......  241  283 
| | person..........   10   54         | | misc............  101  203 
| | place...........   10   54         | | special.........  300  315 
| items.............   10   57         | methods...........   75  197 
| | poisons.........   10   57         | | elemental.......   70  190 
| | traps...........   10   57         | | | air...........   73  191 
| | weapons.........   10   57         | | | earth.........   50  174 
| points............   20  107         | | | fire..........  104  209 
crafts..............   17    -         | | | water.........   54  178 
| smithing..........   23  114         | | mental..........   82  216 
| | gold............   33  141         | | | animating.....  104  229 
| | silver..........   37  152         | | | channeling....  106  230 
| | black...........   21  109         | | | charming......   50  191 
| | | tools.........   20  107         | | | convoking.....  100  227 
| | | weapons.......   28  128         | | | cursing.......   50  191 
| | | armour........   17   91         | | physical........   83  192 
| | gem.............   14   74         | | | binding.......  104  203 
| | locks...........   14   74         | | | brewing.......   50  169 
| mining............   10   54         | | | chanting......   61  180 
| | gem.............   10   54         | | | dancing.......   57  177 
| | ore.............   10   54         | | | enchanting....  108  206 
| | mineral.........   10   54         | | | evoking.......  106  205 
| hunting...........   10   55         | | | healing.......   83  192 
| | tracking........   10   55         | | | scrying.......  100  201 
| | fishing.........   10   55         | | spiritual.......   65  187 
| | trapping........   10   55         | | | abjuring......   61  185 
| | foraging........   10   55         | | | banishing.....   54  178 
| carpentry.........   10   53         | | | conjuring.....   50  174 
| | furniture.......   10   53         | | | divining......  103  207 
| | coopering.......   10   53         | | | summoning.....   60  185 
| | turning.........   10   53         | items.............   65  185 
| | whittling.......   10   53         | | held............   62  184 
| pottery...........   10   53         | | | wand..........   50  172 
| | forming.........   10   53         | | | rod...........   50  172 
| | glazing.........   10   53         | | | staff.........  100  205 
| | staining........   10   53         | | | broom.........   50  172 
| | firing..........   10   53         | | worn............   50  172 
| materials.........   19  101         | | | amulet........   50  172 
| | tanning.........   14   74         | | | ring..........   50  172 
| | leatherwork.....   16   85         | | scroll..........  100  205 
| | weaving.........   14   74         | | talisman........   50  172 
| | spinning........   14   74         | points............  117  215 
| | needlework......   46  167         people..............    -    - 
| | dyeing..........   14   74         | trading...........    -    - 
| husbandry.........   10   56         | | buying..........   25  129 
| | plant...........   10   56         | | selling.........   25  129 
| | animal..........   10   56         | | valueing........    -    - 
| culinary..........   10   55         | | | gems..........   25  129 
| | cooking.........   10   55         | | | jewellery.....   25  129 
| | baking..........   10   55         | | | weapons.......   25  129 
| | butchering......   10   55         | | | armour........   25  129 
| | preserving......   10   55         | teaching..........    -    - 
| | brewing.........   10   55         | | covert..........   40  160 
| | distilling......   10   55         | | crafts..........   35  146 
| medicine..........   22  113         | | faith...........   25  121 
| | firstaid........   38  156         | | fighting........   35  137 
| | diagnosis.......   14   75         | | magic...........   35  149 
| | treatment.......   14   75         | | people..........  115  205 
| arts..............   23  123         | | adventuring.....   50  167 
| | design..........   47  180         | culture...........    -    - 
| | calligraphy.....   10   57         | | djelian.........    5   28 
| | drawing.........   10   57         | | agatean.........   10   56 
| | painting........   10   57         | points............  127  212 
*/
    
    private static ArrayList<Skill> skill_list = null;
    
    public FPalace_skills() {
        // constructor code
    }
    
    public static ArrayList<Skill> get_skill_list(){
        if (skill_list == null){
            skill_list = new ArrayList<>(Arrays.asList(skill_adventure(), skill_perception(),
            skill_map_sight(), skill_map_making(), skill_map_reading(), skill_initiative(), skill_fortitude(),
             skill_swimming(), skill_fight(), skill_melee(), skill_one_handed(), skill_two_handed(), skill_unarmed(), 
             skill_striking(), skill_grappling(), skill_ranged(), skill_defence(), skill_dodging(), skill_parrying(), 
             skill_blocking(), skill_toughness(), skill_covert(), skill_theft(), skill_magic(), skill_mental_magic(), 
             skill_physical_magic(), skill_spiritual_magic(), skill_concentration(), skill_knowledge(), skill_valuing(), 
             skill_weights(), skill_crafts(), skill_alchemy(), skill_item_alchemy_effects(), skill_items(), skill_item_effects(),
              skill_sewing(), skill_smithing(), skill_weapon_effects(), skill_equipment_effects(), skill_people(),
              skill_conversing(),skill_flirting(),skill_intimidating(),skill_sex(),skill_oral(),skill_trade()));
            }
        return skill_list;
    }
    
    public static Skill get_skill_by_id(int skill_id){
        Skill ret_skill = null;
        ArrayList<Skill> skill_list = get_skill_list();
        int i = 0;
        for(i=0;i<skill_list.size();i++){//.length
            if(skill_id == skill_list.get(i).get_id()){//[]
                ret_skill = skill_list.get(i);//[]
                break;
            }
        }
        
        return ret_skill;
    }
    
    public static String get_skill_name(int skill_id){
        ArrayList<Skill>  skill_array = get_skill_list();
        int i= 0;
        for(i=0;i<skill_array.size();i++){//.length
            if(skill_array.get(i).get_id() == skill_id) return skill_array.get(i).get_name();//[] and []
        }
        
        return "";
    }
    
    private static ArrayList<Integer> remove_skill_children(int skill_id,ArrayList<Integer> child_array){//was array return and child
        int i = 0;
        while(child_array.size()>i/*.get(i) != null*/){//[]
            if(get_skill_parent(child_array.get(i)) == skill_id){///[]
                child_array = remove_skill_children(child_array.get(i), child_array);//[]
                child_array.remove(i);//child_array = child_array.slice(0,i).concat(child_array.slice(i+1, child_array.length))
            }else{
                i++;
            }
        }
        
        return child_array;
    }
    
    public static int get_total_skill_value(Character c,int skill_id){//def -1
        int ret = 0;
        ArrayList<Skill>  skill_array = get_skill_list();
        ArrayList<Integer>  all_skills = new ArrayList<>();//was array
        int i = 0;
        for(i=0;i<skill_array.size();i++){//.length
            all_skills.add(skill_array.get(i).get_id());//all_skills[i] = skill_array[i].get_id()
        }
        
        if(skill_id == -1){
            for(i=0;i<all_skills.size();i++){//.length
                ret += c.get_skill_by_id(all_skills.get(i));//[]
            }
        }else{
            ret += c.get_skill_by_id(skill_id);
            for(i=0;i<all_skills.size();i++){//.length
                if(get_skill_parent(all_skills.get(i)) == skill_id)ret += get_total_skill_value(c, all_skills.get(i));//[] and []
            }
        }
        
        return ret;
    }
    
    public static String get_skill_tree(Character c, Skill_set ss, ArrayList<Integer> show_children_of){//show_children_of:Array = null
        String ret = "";
        ArrayList<Skill>  skill_array = get_skill_list();
        
        int i = 0;
        int char_id = 0;
        
        if(c.party != null){
            for(i=0;i<c.party.members.size();i++){
                if(c.party.members.get(i) == c){
                    char_id = i;
                    break;
                }
            }
        }
        
        
        
        ArrayList<Integer>  all_skills = new ArrayList<>(); //var all_skills:Array = new Array
        
        for(i=0;i<skill_array.size();i++){
            all_skills.add(skill_array.get(i).get_id()); //all_skills[i] = skill_array[i].get_id()
        }
        System.out.println("All skills: "+all_skills);
        if(show_children_of != null){
            if(!show_children_of.toString().equals(all_skills.toString())){
                ret += "<a href=\"event:show_skills,"+char_id+",-1,"+ all_skills +"\">Show all</a>\n";
            }
        }else{
            ret += "<a href=\"event:show_skills,"+char_id+",-1,"+ all_skills +"\">Show all</a>\n";
        }
        
        ArrayList<Integer> trained = new ArrayList<>();
        for(i=0;i<ss.skill_ids.size();i++){
            trained.add(ss.skill_ids.get(i)); //trained[trained.length] = ss.skill_ids[i]
            int parent_id = get_skill_parent(ss.skill_ids.get(i));
            while(parent_id >= 0){
                if(!trained.contains(parent_id)){//does this prevent dupes?
                    trained.add(parent_id);//probably going to get duplicates out of this
                }
                parent_id = get_skill_parent(parent_id);
            }
        }
        if(trained != null && trained.get(0) != null){
            if(show_children_of != null){
                if(!show_children_of.toString().equals(trained.toString())){
                    ret += "<a href=\"event:show_skills,"+char_id+",-1,"+ trained +"\">Show trained</a>\n";
                }//the otherwise here is the only case we do nothing
            }else{
                ret += "<a href=\"event:show_skills,"+char_id+",-1,"+ trained +"\">Show trained</a>\n";
            }
        }
        int parent_id;
        if(c.get_current_class() != null){
            
            ArrayList<Integer> primaries = new ArrayList<>();
            for(i=0;i<c.get_current_class().class_skills.size();i++){
                primaries.add(c.get_current_class().class_skills.get(i)); //primaries[primaries.length] = c.get_current_class().class_skills[i]
                parent_id = get_skill_parent(c.get_current_class().class_skills.get(i));
                while(parent_id >= 0){
                    if(!primaries.contains(parent_id)){//does this prevent dupes?
                        primaries.add(parent_id); //primaries[primaries.length] = parent_id;//probably going to get duplicates out of this
                    }
                    parent_id = get_skill_parent(parent_id);
                }
            }
            if(primaries != null && primaries.get(0) != null){
                if(show_children_of != null){
                    if(!show_children_of.toString().equals(primaries.toString())){
                        ret += "<a href=\"event:show_skills,"+char_id+",-1,"+ primaries +"\">Show primaries</a><br>";
                    }
                }else{
                    ret += "<a href=\"event:show_skills,"+char_id+",-1,"+ primaries +"\">Show primaries</a><br>";
                }
            }
        }
        ret += "\n<table><tr><u><tc>Skill</tc><tc>Ranks</tc><tc>Bonus</tc><tc>Cost</tc><tc>Current XP to spend: <font color='#00FF00'>"+c.get_xp()+"</font>/"+c.nxt_lvl_xp+"</tc></u></tr>";
        
        for(i=0;i<skill_array.size();i++){
            int j = 0;
            int ranks = 0;
            for(j=0;j<ss.skill_ids.size();j++){
                if(skill_array.get(i).get_id() == ss.skill_ids.get(j)){
                    ranks = ss.skill_ranks.get(j);
                }
            }
            
            String s_name = skill_array.get(i).get_name();
            int skill_val = 0;
            int cost = ss.get_skill_cost(c,skill_array.get(i).get_id(),1);
            skill_val = ss.get_skill_value(c, skill_array.get(i).get_id());
            ArrayList<Integer> child_array;
            if(show_children_of != null){
                ArrayList<Integer> plchldr = new ArrayList<>(show_children_of);
                //plchldr.remove(0);//0
                //plchldr.remove(0);//1
                //plchldr.remove(0);//2
                child_array = new ArrayList<>(plchldr);
            }else{
                child_array = new ArrayList<>();
            }

            int remove_children = -1;
            Boolean no_show= true;
            int parent_check = 0;
            for(parent_check=0;parent_check<child_array.size();parent_check++){
                if(child_array.get(parent_check) == skill_array.get(i).get_parent()){
                   no_show = false;
                }
                if(child_array.get(parent_check) == skill_array.get(i).get_id()){
                    remove_children = parent_check;
                }
            }
            
            if(no_show && skill_array.get(i).get_parent() != -1)continue;
            
            parent_id = skill_array.get(i).get_id();
            while(get_skill_parent(parent_id) != -1){
                s_name = "~" + s_name;
                parent_id = get_skill_parent(parent_id);
            }
            
            Boolean rc = false;
            
            if(remove_children >= 0){
                System.out.println("Child array before remove_skill_childre: "+child_array);
                child_array = remove_skill_children(child_array.get(remove_children), child_array);
                System.out.println("Child array after remove_skill_childre: "+child_array);
                System.out.println("IDX to remove: "+remove_children);
                child_array.remove(remove_children);//child_array = child_array.slice(0,remove_children).concat(child_array.slice(remove_children+1, child_array.length))
                rc = true;
            }else{
                child_array.add(skill_array.get(i).get_id());//child_array[child_array.length] = skill_array[i].get_id()
            }
            
            if(!child_array.isEmpty()){//size() > 0
                if(rc){
                    if(has_children(skill_array.get(i).get_id())){
                        s_name = "<tr><a href=\"event:show_skills,"+char_id+",-1,"+ child_array +"\"><tc>" + s_name + "[-]</tc></a>";
                    }else{
                        s_name = "<tr><a href=\"event:show_skills,"+char_id+",-1,"+ child_array +"\"><tc>" + s_name + "</tc></a>";
                    }
                }else{
                    if(has_children(skill_array.get(i).get_id())){
                        s_name = "<tr><a href=\"event:show_skills,"+char_id+",-1,"+ child_array +"\"><tc>" + s_name + "[+]</tc></a>";
                    }else{
                        s_name = "<tr><a href=\"event:show_skills,"+char_id+",-1,"+ child_array +"\"><tc>" + s_name + "</tc></a>";
                    }						
                }					
            }else{
                s_name = "<tr><a href=\"event:show_skills,"+char_id+"\"><tc>" + s_name + "[-]</tc></a>";
            }
            
            ret += s_name;
            ret += "<tc>" + Integer.toString(ranks) + "</tc>";
            
            
            if(cost<=c.get_xp()){
                if(show_children_of != null){
                    ret += "<tc>" + skill_val+"</tc><a href=\"event:show_skills,"+char_id+","+skill_array.get(i).get_id()+","+show_children_of+"\"><font color='#0000FF'><tc>"+ cost +"</tc></font></a></tr>";
                }else{
                    ret += "<tc>" + skill_val+"</tc><a href=\"event:show_skills,"+char_id+","+skill_array.get(i).get_id()+"\"><font color='#0000FF'><tc>"+ cost +"</tc></font></a></tr>";
                }
            }else{
                ret += "<tc>" + skill_val+"</tc><font color='#FF0000'><tc>"+ cost +"</tc></font></tr>";
            }
        }
        
        return ret + "</table>";
        
    }
    
    public static Boolean has_children(int skill_id){
        Boolean ret= false;
        ArrayList<Skill>  skill_array = get_skill_list();
        int i = 0;
        for(i=0;i<skill_array.size();i++){//.length
            if(skill_array.get(i).get_parent() == skill_id){
                ret = true;
                break;
            }
        }
        
        return ret;
    }
    
    public static int get_skill_parent(int skill_id){
        int ret = -1;
        ArrayList<Skill> skill_array = get_skill_list();
        for(int i=0;i<skill_array.size();i++){//.length
            if(skill_array.get(i).get_id() == skill_id){//[]
                if(skill_array.get(i).get_parent() != -1)ret = skill_array.get(i).get_parent();//[] and []
                break;
            }
        }
        return ret;
    }
            
    public static int get_skill_value_by_id(Character c,int skill_id,int skill_ranks){
        ArrayList<Skill> skill_array = get_skill_list();
        int i = 0;
        int ret = 0;
        for(i=0;i<skill_array.size();i++){//.length
            if(skill_array.get(i).get_id() == skill_id){//][]
                int j = 0;
                int numerator= 0;
                int denominator = 0;
                for(j=0;j<skill_array.get(i).stat_list.size();j++){//[] and .length
                    numerator += Math.max(Math.round(c.get_stat(skill_array.get(i).stat_list.get(j)).intValue() * (float)skill_array.get(i).stat_ratio_list.get(j)),0);//[] and []
                    denominator += skill_array.get(i).stat_ratio_list.get(j);//[] and []
                }
                
                if(denominator != 0){
                    ret = (int)Math.round(Math.ceil(numerator/(double)denominator) * (Math.log(skill_ranks*(double)2)/0.699));
                }else{
                    ret = -1;
                }
                
                if(skill_ranks == 0 && skill_array.get(i).get_parent() != -1){//[]
                    int temp = get_skill_value_by_id(c,skill_id, 1) - 1;
                    int temp_ranks = c.skills.get_skill_ranks(skill_array.get(i).get_parent());//[]
                    ret = Math.min(temp,temp_ranks);
                }
                
                break;
            }
        }
        
        return ret;
    }
    
    public static Skill skill_adventure(){
        Skill s = new Skill();
        s.set_name("Adventuring");
        s.set_id(adventure_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.int_id, 2);
        
        CharAction a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Forage");
        a.set_dialogue("",0);
        
        Challenge challenge = new Challenge(true);
            challenge.set_tick_cost(FPGameGithub.T10_MIN);
            challenge.set_attack_stat(adventure_id);
            challenge.set_defense_stat(-1, 15);
            challenge.setVariability(10);
            challenge.setText("Forage");
            
            Consequence consequence = new Consequence();
            consequence.addConsequence(0,0,"How long would you like to forage for: </c1>, </c3>, </c6>", 0);
            //consequence.add_consequence(0,0,"</n> forages around, looking for something useful. ", 0,0,0,1)
            //TODO originally commented?
            consequence.addConsequence(0,0,"</n> forages around for a bit, but finds nothing of use. ", -1);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge();
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("10 min");
            
            DynamicConsequence dconsequence = new DynamicConsequence();
            dconsequence.addConsequence(FPalaceHelper.curr_fatigue_id,-1,"", 0);
            dconsequence.set_consequence_list("</n> ends up finding </choice>. ", DynamicConsequence.list_forage);
            
            a.addChallenge(challenge,dconsequence);
            
            challenge = new Challenge();
            challenge.set_tick_cost(FPGameGithub.T10_MIN);
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("");
            
            dconsequence = new DynamicConsequence();
            dconsequence.addConsequence(0,0,"", 0,0,0,1);
            dconsequence.set_consequence_list("</n> ends up finding </choice>. \n", DynamicConsequence.list_forage);
            
            a.addChallenge(challenge,dconsequence);
            
            challenge = new Challenge();
            challenge.set_tick_cost(FPGameGithub.T10_MIN);//TODO recheck these times are right
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("30 min");
            
            dconsequence = new DynamicConsequence();
            dconsequence.addConsequence(FPalaceHelper.curr_fatigue_id,-1,"", 0,0,0,2);
            dconsequence.set_consequence_list("</n> ends up finding </choice>. \n", DynamicConsequence.list_forage);
            
            a.addChallenge(challenge,dconsequence);
            
            challenge = new Challenge();
            challenge.set_tick_cost(FPGameGithub.T10_MIN);
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("40 min");
            
            dconsequence = new DynamicConsequence();
            dconsequence.addConsequence(0,0,"", 0,0,0,3);
            dconsequence.set_consequence_list("</n> ends up finding </choice>. \n", DynamicConsequence.list_forage);
            
            a.addChallenge(challenge,dconsequence);
            
            challenge = new Challenge();
            challenge.set_tick_cost(FPGameGithub.T10_MIN);
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("50 min");
            
            dconsequence = new DynamicConsequence();
            dconsequence.addConsequence(0,0,"", 0,0,0,4);
            dconsequence.set_consequence_list("</n> ends up finding </choice>. \n", DynamicConsequence.list_forage);
            
            a.addChallenge(challenge,dconsequence);
            
            challenge = new Challenge();
            challenge.set_tick_cost(FPGameGithub.T10_MIN);
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("1 hour");
            
            dconsequence = new DynamicConsequence();
            dconsequence.addConsequence(FPalaceHelper.curr_fatigue_id,-1,"", 0,0,0,5);
            dconsequence.set_consequence_list("</n> ends up finding </choice>. \n", DynamicConsequence.list_forage);
            
            a.addChallenge(challenge,dconsequence);
        
        s.add_action(a, 10);
        
        return s;
    }
    
    public static Skill skill_perception(){
        Skill s= new Skill();
        s.set_name("Perception");
        s.set_id(perception_id);
        s.set_parent(adventure_id);
        s.add_stat_component(FPalaceHelper.wis_id, 4);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        
        return s;
    }
            
    
    public static Skill skill_map_reading(){
        Skill s= new Skill();
        s.set_name("Map Reading");
        s.set_id(map_reading_id);
        s.set_parent(perception_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.int_id, 3);
        
        return s;
    }
    
    public static Skill skill_map_sight(){
        Skill s= new Skill();
        s.set_name("Sight");
        s.set_id(map_sight_id);
        s.set_parent(perception_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        
        return s;
    }
    
    public static Skill skill_map_making(){
        Skill s= new Skill();
        s.set_name("Map Making");
        s.set_id(map_making_id);
        s.set_parent(perception_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        
        return s;
    }
    
    public static Skill skill_initiative(){
        Skill s= new Skill();
        s.set_name("Initiative");
        s.set_id(initiative_id);
        s.set_parent(adventure_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        
        return s;
    }
    
    public static Skill skill_fortitude(){
        Skill s= new Skill();
        s.set_name("Fortitude");
        s.set_id(fortitude_id);
        s.set_parent(adventure_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.con_id, 3);
        
        return s;
    }
    
    public static Skill skill_swimming(){
        Skill s= new Skill();
        s.set_name("Swimming");
        s.set_id(swimming_id);
        s.set_parent(adventure_id);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        
        return s;
    }
    
    public static Skill skill_fight(){
        Skill s= new Skill();
        s.set_name("Fighting");
        s.set_id(fight_id);
        s.add_stat_component(FPalaceHelper.str_id, 3);
        s.add_stat_component(FPalaceHelper.con_id, 1);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        
        return s;
    }
    
    public static Skill skill_melee(){
        Skill s= new Skill();
        s.set_name("Melee");
        s.set_id(melee_id);
        s.set_parent(fight_id);
        s.add_stat_component(FPalaceHelper.str_id, 4);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        
        return s;
    }
    
    public static Skill skill_one_handed(){
        Skill s= new Skill();
        s.set_name("One Handed");
        s.set_id(one_handed_id);
        s.set_parent(melee_id);
        s.add_stat_component(FPalaceHelper.str_id, 3);
        s.add_stat_component(FPalaceHelper.dex_id, 2);
        
        return s;
    }
            
    public static Skill skill_two_handed(){
        Skill s= new Skill();
        s.set_name("Two Handed");
        s.set_id(two_handed_id);
        s.set_parent(melee_id);
        s.add_stat_component(FPalaceHelper.str_id, 3);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        s.add_stat_component(FPalaceHelper.con_id, 1);
        
        return s;
    }
        
    public static Skill skill_unarmed(){
        Skill s= new Skill();
        s.set_name("Unarmed");
        s.set_id(unarmed_id);
        s.set_parent(melee_id);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        
        return s;
    }
    
    public static Skill skill_striking(){
        Skill s= new Skill();
        s.set_name("Striking");
        s.set_id(striking_id);
        s.set_parent(unarmed_id);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        
        
        
        CharAction a= new CharAction();
            a.setName("Knee");
            a.set_attack_flag(CharAction.attack_type_single_target, "Skills");
            a.set_attack_description("Strike a single opponent, targeting the groin. ");
            a.set_requirement(FPalaceHelper.curr_fatigue_id,1);
            Challenge  challenge= new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.striking_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Knee");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
            Challenge inter_chal = new Challenge(true);
                inter_chal.set_attack_stat(FPalace_skills.concentration_id);
                inter_chal.set_defense_stat(-1,4);
                inter_chal.setVariability(10);
            
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "</n2> knees </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-0.5, "</n2> crushes </n>s balls. ",5,0,0,-1, false, null, FPalaceHelper.balls_slot);//need this to target specific part id...
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> lashes out with a leg. ",-1);
            
            a.addChallenge(challenge,consequence);
            
        s.add_attack(a,5);
        
        return s;
    }
            
    public static Skill skill_grappling(){
        Skill s= new Skill();
        s.set_name("Grappling");
        s.set_id(grappling_id);
        s.set_parent(unarmed_id);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        s.add_stat_component(FPalaceHelper.con_id, 1);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        
        return s;
    }
    
    public static Skill skill_ranged(){
        Skill s= new Skill();
        s.set_name("Ranged");
        s.set_id(ranged_id);
        s.set_parent(fight_id);
        s.add_stat_component(FPalaceHelper.dex_id, 4);
        s.add_stat_component(FPalaceHelper.str_id, 1);
        
        return s;
    }
    
    public static Skill skill_defence(){
        Skill s= new Skill();
        s.set_name("Defence");
        s.set_id(defence_id);
        s.set_parent(fight_id);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        s.add_stat_component(FPalaceHelper.con_id, 2);
        
        return s;
    }
    
    public static Skill skill_dodging(){
        Skill s= new Skill();
        s.set_name("Dodge");
        s.set_id(dodging_id);
        s.set_parent(defence_id);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        s.add_stat_component(FPalaceHelper.con_id, 2);
        
        return s;
    }
            
    public static Skill skill_blocking(){
        Skill s= new Skill();
        s.set_name("Block");
        s.set_id(blocking_id);
        s.set_parent(defence_id);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        s.add_stat_component(FPalaceHelper.con_id, 2);
        
        return s;
    }
            
    public static Skill skill_parrying(){
        Skill s= new Skill();
        s.set_name("Parry");
        s.set_id(parrying_id);
        s.set_parent(defence_id);
        s.add_stat_component(FPalaceHelper.dex_id, 2);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        s.add_stat_component(FPalaceHelper.con_id, 1);
        
        return s;
    }
    
    public static Skill skill_concentration(){
        Skill s= new Skill();
        s.set_name("Concentration");
        s.set_id(concentration_id);
        s.set_parent(magic_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.con_id, 2);
        
        return s;
    }
    
    public static Skill skill_toughness(){
        Skill s= new Skill();
        s.set_name("Toughness");
        s.set_id(toughness_id);
        s.set_parent(fight_id);
        s.add_stat_component(FPalaceHelper.con_id, 3);
        s.add_stat_component(FPalaceHelper.str_id, 1);
        
        return s;
    }
    
    public static Skill skill_covert(){
        Skill s= new Skill();
        s.set_name("Covert");
        s.set_id(covert_id);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        
        CharAction a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Hunt");
        a.set_dialogue("",0);
        
        Challenge challenge = new Challenge(true);
            challenge.set_tick_cost(FPGameGithub.T30_MIN);
            challenge.set_attack_stat(covert_id);
            challenge.set_defense_stat(-1, 15);
            challenge.setVariability(10);
            challenge.setText("Hunt");
            
            Consequence consequence= new Consequence();
            consequence.addConsequence(0,0,"</n> waits around for something to hunt. ", 0,0,0,1);
            consequence.addConsequence(0,0,"</n> waits around for a bit, but nothing passes by. ", -1);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge();
            challenge.set_attack_stat(-1,1);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("");
            
            DynamicConsequence dconsequence = new DynamicConsequence();
            dconsequence.set_consequence_list("</choice> wanders by. ", DynamicConsequence.list_hunt);
            
            a.addChallenge(challenge,dconsequence);
        
        s.add_action(a, 10);
        
        return s;
    }
    
    public static Skill skill_theft(){
        Skill s= new Skill();
        s.set_name("Theft");
        s.set_id(theft_id);
        s.set_parent(covert_id);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        
        return s;
    }
    
    public static Skill skill_magic(){
        Skill s= new Skill();
        s.set_name("Magic");
        s.set_id(magic_id);
        s.add_stat_component(FPalaceHelper.int_id, 3);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        
        return s;
    }
    
    
    public static Skill skill_mental_magic(){
        Skill s= new Skill();
        s.set_name("Mental");
        s.set_id(mental_magic_id);
        s.set_parent(magic_id);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        s.add_stat_component(FPalaceHelper.will_id, 2);
        
        CharAction a3 = new CharAction();
        a3.set_requirement(FPalaceHelper.curr_mp_id,1);
        a3.setName("Mind Lance");
        a3.set_attack_description("Strike out at a single foes mind. ");
        a3.set_attack_flag(CharAction.attack_type_single_target, "Magic");
        
        Challenge challenge2 = new Challenge(true);
        challenge2.set_attack_stat(FPalace_skills.mental_magic_id);
        challenge2.set_defense_stat(-1,10);
        challenge2.setVariability(10);
        challenge2.setText("Mind Lance");
        Consequence consequence2 = new Consequence();
        consequence2.addConsequence(0,0, "</n2> waves </noun2> hands in an intricate manner while intently gazing at </n>. ",0,0,0,1);
        consequence2.addConsequence(FPalaceHelper.curr_mp_id,-1, "</n2> moves </noun2> hands in a series of clumsy gestures that look like flailing about. </noun2> eyes dart back and forth between </noun2> hands and </n>. ",-1,0,0,-1,true);
        
        a3.addChallenge(challenge2,consequence2);
        
        challenge2 = new Challenge(true);
        challenge2.set_attack_stat(FPalace_skills.mental_magic_id);
        challenge2.set_defense_stat(FPalace_skills.magic_id);
        challenge2.setVariability(10);
        challenge2.setText("");
        consequence2 = new Consequence();
        consequence2.amt_by_roll_flag();
        consequence2.set_max_damage(8);
        consequence2.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "</n> meets </n2>s gaze for a split second and suddenly screams in pain. ",0);
        consequence2.addConsequence(0,0, "Nothing happens! ",-1);							
        
        a3.addChallenge(challenge2,consequence2);
        
        s.add_attack(a3, 5);
        
        return s;
    }
    
    public static Skill skill_physical_magic(){
        Skill s= new Skill();
        s.set_name("Physical");
        s.set_id(physical_magic_id);
        s.set_parent(magic_id);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        s.add_stat_component(FPalaceHelper.will_id, 1);
        s.add_stat_component(FPalaceHelper.dex_id, 2);
        
        CharAction a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Enchant");
        a.set_enchant_flag();
                
        s.add_action(a, 15);
        
        return s;
    }
    
    public static Skill skill_spiritual_magic(){
        Skill s= new Skill();
        s.set_name("Spiritual");
        s.set_id(spiritual_magic_id);
        s.set_parent(magic_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.will_id, 2);
        
        return s;
    }
    
    public static Skill skill_knowledge(){
        Skill s= new Skill();
        s.set_name("Knowledge");
        s.set_id(knowledge_id);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        s.add_stat_component(FPalaceHelper.int_id, 3);
        
        return s;
    }
    
    
    
    public static Skill skill_weights(){
        Skill s= new Skill();
        s.set_name("Weights");
        s.set_id(weighing_id);
        s.set_parent(knowledge_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        
        return s;
    }
    
    public static Skill skill_crafts(){
        Skill s= new Skill();
        s.set_name("Crafting");
        s.set_id(crafting_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        s.add_stat_component(FPalaceHelper.int_id, 1);
        
        CharAction a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Dismantle");
        a.set_dismantle_flag();
                
        s.add_action(a, 10);
        
        a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Crafting");
        a.set_craft_flag();
                
        s.add_action(a, 20);
        
        return s;
    }
    
    public static Skill skill_alchemy(){
        Skill s= new Skill();
        s.set_name("Alchemy");
        s.set_id(alchemy_id);
        s.set_parent(crafting_id);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.dex_id, 1);
        s.add_stat_component(FPalaceHelper.int_id, 3);
        
        CharAction a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Alchemy");
        a.set_alchemy_flag();
                
        s.add_action(a, 30);
        
        return s;
    }
            
    public static Skill skill_items(){
        Skill s= new Skill();
        s.set_name("Items");
        s.set_id(items_id);
        s.set_parent(crafting_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.int_id, 2);
        
        return s;
    }
    
    public static Skill skill_sewing(){
        Skill s= new Skill();
        s.set_name("Sewing");
        s.set_id(sewing_id);
        s.set_parent(crafting_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.dex_id, 2);
        
        CharAction a = new CharAction();
        a.set_personal();
        a.set_attack_flag(-1, "Skills");
        a.setName("Sewing");
        a.set_sewing_flag();
                
        s.add_action(a, 10);
        
        return s;
    }
    
    public static Skill skill_smithing(){
        Skill s= new Skill();
        s.set_name("Smithing");
        s.set_id(smithing_id);
        s.set_parent(crafting_id);
        s.add_stat_component(FPalaceHelper.str_id, 3);
        s.add_stat_component(FPalaceHelper.dex_id, 2);
        
        return s;
    }
    
    public static Skill skill_item_effects(){
        Skill s= new Skill();
        s.set_name("Effects");
        s.set_id(item_effects_id);
        s.set_parent(items_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.int_id, 2);
        
        return s;
    }
    
    public static Skill skill_item_alchemy_effects(){
        Skill s= new Skill();
        s.set_name("Properties");
        s.set_id(item_alchemy_effects_id);
        s.set_parent(alchemy_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.int_id, 2);
        
        return s;
    }
    
    public static Skill skill_weapon_effects(){
        Skill s= new Skill();
        s.set_name("Weapons");
        s.set_id(weapon_effects_id);
        s.set_parent(smithing_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.dex_id, 2);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        
        return s;
    }
    
    public static Skill skill_equipment_effects(){
        Skill s= new Skill();
        s.set_name("Equipment");
        s.set_id(equipment_effects_id);
        s.set_parent(smithing_id);
        s.add_stat_component(FPalaceHelper.wis_id, 3);
        s.add_stat_component(FPalaceHelper.con_id, 2);
        s.add_stat_component(FPalaceHelper.str_id, 2);
        
        return s;
    }
    
    public static Skill skill_people(){
        Skill s= new Skill();
        s.set_name("People");
        s.set_id(people_id);
        s.add_stat_component(FPalaceHelper.sex_appeal_id, 3);
        s.add_stat_component(FPalaceHelper.cha_id, 2);
        
        CharAction a = new CharAction();
            a.setName("Calm Down");
            a.set_attack_flag(CharAction.attack_type_all_target_no_user_conseq, "Skills");
            a.set_attack_description("Try to calm yourself down. ");
            a.set_dialogue("</n2> tries to calm down. ", 0);
            a.set_requirement(FPalaceHelper.curr_mp_id,1);
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(Character.relations_affect_id);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(0);
            challenge.setText("");
            Consequence consequence = new Consequence();
            consequence.addConsequence(Character.relations_affect_id,0, "",0);
            consequence.addConsequence(-Character.relations_affect_id ,Consequence.amt_from_roll_const, "</n2> hates </n> a bit less. ",-1,0,0,-1,true);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
            
        s.add_attack(a,5);
        
        return s;
    }
    
    public static Skill skill_intimidating(){
        Skill s= new Skill();
        s.set_name("Intimidating");
        s.set_id(intimidating_id);
        s.set_parent(conversing_id);
        s.add_stat_component(FPalaceHelper.str_id, 3);
        s.add_stat_component(FPalaceHelper.cha_id, 2);
        
        return s;
    }
    
    public static Skill skill_conversing(){
        Skill s= new Skill();
        s.set_name("Conversation");
        s.set_id(conversing_id);
        s.set_parent(people_id);
        s.add_stat_component(FPalaceHelper.sex_appeal_id, 2);
        s.add_stat_component(FPalaceHelper.cha_id, 3);
        
        return s;
    }
    
    public static Skill skill_flirting(){
        Skill s= new Skill();
        s.set_name("Flirting");
        s.set_id(flirting_id);		
        s.set_parent(conversing_id);
        s.add_stat_component(FPalaceHelper.sex_appeal_id, 3);
        s.add_stat_component(FPalaceHelper.cha_id, 2);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        
        return s;
    }		
    
    public static Skill skill_sex(){
        Skill s= new Skill();
        s.set_name("Sex");
        s.set_id(sex_id);		
        s.set_parent(people_id);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        s.add_stat_component(FPalaceHelper.cha_id, 2);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        
        return s;
    }
    
    public static Skill skill_oral(){
        Skill s= new Skill();
        s.set_name("Oral");
        s.set_id(blowjobs_id);		
        s.set_parent(sex_id);
        s.add_stat_component(FPalaceHelper.dex_id, 3);
        s.add_stat_component(FPalaceHelper.cha_id, 2);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        
        return s;
    }
    
    public static Skill skill_trade(){
        Skill s= new Skill();
        s.set_name("Trade");
        s.set_id(trade_id);
        s.set_parent(people_id);
        s.add_stat_component(FPalaceHelper.sex_appeal_id, 2);
        s.add_stat_component(FPalaceHelper.int_id, 2);
        s.add_stat_component(FPalaceHelper.wis_id, 2);
        s.add_stat_component(FPalaceHelper.cha_id, 2);
        
        return s;
    }
    public static Skill skill_valuing(){
        Skill s = new Skill();
        s.set_name("Valuing");
        s.set_id(valuing_id);		
        s.set_parent(knowledge_id);
        s.add_stat_component(FPalaceHelper.int_id, 2);
        s.add_stat_component(FPalaceHelper.wis_id, 1);
        
        return s;
    }
    
}
