package fpgamegithubredux;

public class FPalace_items {

    //Body part change items:
        //Penis: Senip Sangria, futa_cola
        //Breasts: Streabs Sherry
        //Vagina: Gavin ale
        //Balls: Allbs homebrew Alcohol, futa_cola
        
    //Status change items:
        //poison: (Gain):mushrooms (Loss): Healing_Potion
        //lactate: (Gain): lactaid (Loss):
        //pregnant: (Gain): (Loss): bottled_abortion
        //drunk: (Gain): Prothg_wine, Wests_Bourban, Palace_Private_Reserve, Grulv_Vodka, Stallion_Stout (Loss):
    
    //See Alchemical Affects spreadsheet for Alchmy and race change list
    private static final String CLOTHLYING = "some cloth is laying on the ground here";
    private static final String INGOTLAYING = "an ingot is laying on the ground here";
    public FPalace_items() {
        // constructor code
    }
    
    public static Item gold(int i){
        //default 1
        Item item = new Item("Gold");
        item.setDroppedDescription("some coins are laying on the ground here");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setWeight(0);
        item.setValue(i);
        return item;
    }
    
    public static AlchemyItem textiles(){
        AlchemyItem item = new AlchemyItem("Textiles");
        item.setDroppedDescription(CLOTHLYING);
        item.setInventoryDescription("This is a piece of wool cloth. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.anal_width_id);
        item.add_type(-FPalaceHelper.balls_size_id);
        item.add_type(-FPalaceHelper.max_lust_id);
        item.setWeight(1);
        item.setValue(1);
        return item;
    }
    
    public static AlchemyItem gold_bar(){
        AlchemyItem item = new AlchemyItem("Gold Bar");
        item.setDroppedDescription(INGOTLAYING);
        item.setInventoryDescription("This is an ingot of gold. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.max_lust_id);
        item.add_type(-FPalaceHelper.vaginal_width_id);
        item.add_type(FPalaceHelper.max_weight_id);
        item.setWeight(5);
        item.setValue(15);
        return item;
    }
    
    public static AlchemyItem silver_bar(){
        AlchemyItem item = new AlchemyItem("Silver Bar");
        item.setDroppedDescription(INGOTLAYING);
        item.setInventoryDescription("This is an ingot of silver. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.max_weight_id);
        item.add_type(-FPalaceHelper.age_id);
        item.add_type(FPalaceHelper.max_fatigue_id);
        item.setWeight(5);
        item.setValue(10);
        return item;
    }
    
    public static AlchemyItem iron(){
        AlchemyItem item = new AlchemyItem("Iron");
        item.setDroppedDescription(INGOTLAYING);
        item.setInventoryDescription("This is an ingot of iron. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.min_lust_id);
        item.add_type(-FPalaceHelper.vaginal_depth_id);
        item.add_type(FPalaceHelper.erection_ratio_id);
        item.setWeight(5);
        item.setValue(3);
        return item;
    }
    
    public static AlchemyItem bronze(){
        AlchemyItem item = new AlchemyItem("Bronze");
        item.setDroppedDescription(INGOTLAYING);
        item.setInventoryDescription("This is an ingot of bronze. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.age_id);
        item.add_type(-FPalaceHelper.eye_colour_id);
        item.setWeight(5);
        item.setValue(2);
        return item;
    }
    
    public static AlchemyItem glass(){
        AlchemyItem item = new AlchemyItem("Glass");
        item.setDroppedDescription("some glass is laying on the ground here");
        item.setInventoryDescription("This is a piece of glass. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.max_fatigue_id);
        item.add_type(-FPalaceHelper.nipple_size_id);
        item.add_type(-FPalaceHelper.bloat_id);
        item.setWeight(1);
        item.setValue(2);
        return item;
    }
    
    public static AlchemyItem leather(){
        AlchemyItem item = new AlchemyItem("Leather");
        item.setDroppedDescription("some leather is laying on the ground here");
        item.setInventoryDescription("This is a strip of leather. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.bust_id);
        item.add_type(-FPalaceHelper.hair_length_id);			
        item.setWeight(2);
        item.setValue(1);
        return item;
    }
    
    public static AlchemyItem silk(){
        AlchemyItem item = new AlchemyItem("Silk");
        item.setDroppedDescription(CLOTHLYING);
        item.setInventoryDescription("This is a strip of fine silk. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.clit_length);
        item.add_type(-FPalaceHelper.anal_width_id);
        item.add_type(FPalaceHelper.hair_length_id);
        item.setWeight(1);
        item.setValue(5);
        return item;
    }
    
    public static AlchemyItem wood(){
        AlchemyItem item = new AlchemyItem("Wood");
        item.setDroppedDescription("some wood is laying on the ground here");
        item.setInventoryDescription("This is a length of lumber. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.erection_ratio_id);
        item.add_type(-FPalaceHelper.milk_volume_id);
        item.setWeight(3);
        item.setValue(1);
        return item;
    }
    
    public static AlchemyItem paper(){
        AlchemyItem item = new AlchemyItem("Paper");
        item.setDroppedDescription("some paper is laying on the ground here");
        item.setInventoryDescription("These are a few pages of paper. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.weight_id);
        item.add_type(-FPalaceHelper.max_weight_id);
        item.add_type(-FPalaceHelper.eye_colour_id);
        item.setWeight(1);
        item.setValue(1);
        return item;
    }
    
    public static AlchemyItem dye(){
        AlchemyItem item = new AlchemyItem("Dye");
        item.setDroppedDescription("a bottle sits lazily on the ground here");
        item.setInventoryDescription("This is a small bottle of dye. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.vaginal_width_id);
        item.add_type(-FPalaceHelper.semen_fertility_id);
        item.add_type(-FPalaceHelper.hair_colour_id);
        item.setWeight(1);
        item.setValue(5);
        return item;
    }
    
    public static AlchemyItem plastics(){
        AlchemyItem item = new AlchemyItem("Plastics");
        item.setDroppedDescription("Some plastic sits lazily on the ground here");
        item.setInventoryDescription("This is a a good sized chunk of plastic. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.add_type(FPalaceHelper.goo_colour_id);
        item.add_type(-FPalaceHelper.penis_girth_id);
        item.add_type(-FPalaceHelper.nipple_size_id);
        item.setWeight(1);
        item.setValue(2);
        return item;
    }
    
    public static Item FPalace_tower_key(){
        Item item = new Item("Palace Tower Key");
        item.setDroppedDescription("a small key glimmers on the ground here");
        item.setInventoryDescription("This small key has teeth that are completely detached from the shaft.");
        item.setUseDescription("</n> holds a key aloft. Nothing happens.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setNumUses(-1);
        return item;
    }
    
    public static Item nunnery_trapdoor_key(){
        Item item = new Item("Nunnery Trapdoor Key");
        item.setDroppedDescription("a small key glimmers on the ground here");
        item.setInventoryDescription("This small key seems standard enough.");
        item.setUseDescription("</n> holds a key aloft. Nothing happens.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setNumUses(-1);
        return item;
    }

    
    public static Item FPalace_membership(){
        Item item = new Item("Membership");
        item.setDroppedDescription("a plastic card is laying on the ground here");
        item.setInventoryDescription("This plastic card in the shape of a key has a name on it");
        item.setUseDescription("</n> holds a membership card aloft. Nothing happens.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setNumUses(-1);
        return item;
    }
    
    public static Item bandages(){
        //selling NPC: 
        Item item = new Item("Bandages");
        item.add_crafting_requirement(textiles(),1);
        item.setDroppedDescription("a bandage is lying on the ground here");
        item.setInventoryDescription("This is nothing more than a strip of cloth, likely intended for covering wounds. ");
        item.setUseDescription("</n> applies the bandage.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(1);
        item.add_effect(FPalaceHelper.curr_hp_id, 1);
        item.setValue(2);
        return item;
    }
    
    public static Item spermacide(){
        //selling NPC: job_equine_encampment_shopkeeper
        Item item = new Item("Spermacide");
        item.setDroppedDescription("a salve container on the ground here");
        item.setInventoryDescription("This is a small white container with spin off top adorned with a large red x drawn over a worm like thing. ");
        item.setUseDescription("</n> applies the salve.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(1);
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.semen_fertility_id, -0.01);
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_DAY);
            Consequence c2 = new Consequence();
            c2.add_remove_status(TickEffect.worms_status);
            c2.addConsequence(FPalaceHelper.semen_fertility_id,0.05, "", 0);
            
            tf.set_end_consequence(c2);
            
        consequence.addConsequence(FPalaceHelper.semen_fertility_id,-0.04, "</n> feels a tingling from </noun> groin. ",0,0,0,-1, false, tf);
        
        item.addConsequence(consequence);
        
        item.setValue(20);
        return item;
    }
    
    public static Item the_pill(){
        //selling NPC: expedition_leader, lux_invira_general_merchant
        Item item = new Item("THE pill");
        item.setDroppedDescription("an ugly pill pouch sits here");
        item.setInventoryDescription("This pouch of pills has a label that just says \"THE pill\". ");
        item.setUseDescription("</n> swallows a pill.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(1);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.egg_fertility_id, -0.3);
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_DAY);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.egg_fertility_id,0.3, "", 0);
            
            tf.set_end_consequence(c2);
            
        
            consequence.addConsequence(FPalaceHelper.egg_fertility_id,0, "</n> feels a tingling from </noun> groin. ",0,0,0,-1, false, tf);
        
        item.addConsequence(consequence);
        
        item.setValue(20);
        return item;
    }
    
    public static Item weight_loss_pills(){
        //selling NPC: bee_hive_shopkeeper
        Item item = new AlchemyItem("Weight loss pills");
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The writing on this pouch reads like an idiot's attempt to bypass a spam filter. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.waist_id,-0.1);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_status_id(TickEffect.worms_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.waist_id,-0.1, "</n> feels worms crawling under </noun> skin. ", 0);
            c2.addConsequence(FPalaceHelper.curr_hp_id,-1, "", 0);
            tf.set_tick_consequence(FPGameGithub.T1_HOUR, c2);
            
        consequence.addConsequence(FPalaceHelper.waist_id,-0.1, "</n> feels a bit sick. ",0,0,0,-1, false, tf);
        
        item.addConsequence(consequence);
        
        item.setValue(10);
        
        return item;
    }
    
    public static Item reduction_salve(){
        //selling NPC: cclass_merchant
        Item item = new Item("Reduction salve");
        item.setDroppedDescription("a container sits lazily on the ground here");
        item.setInventoryDescription("This salve container has a label that is covered in warnings. ");
        item.setUseDescription("</n> opens the container. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(2);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge challenge = new Challenge();
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        challenge.setText("");
        
        DynamicConsequence dconsequence = new DynamicConsequence();
        dconsequence.set_consequence_list("</n> applies the salve to </noun> </choice>. ", DynamicConsequence.list_parts, DynamicConsequence.list_halvepart);
        dconsequence.addConsequence(0,0, "Where do you want to apply the salve?\n",0);
        a.addChallenge(challenge,dconsequence);
        
        item.add_action(a);
        
        item.setValue(15);
        return item;
    }
    
    public static Item height_potion(){
        //selling NPC: aghapei_guru
        Item item = new Item("Height potion");
        item.setDroppedDescription("a bottle sits lazily on the ground here");
        item.setInventoryDescription("This bottle has a label that confusingly shows a double headed error between two figures of different heights. ");
        item.setUseDescription("</n> opens the container. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(2);
        item.add_effect(FPalaceHelper.curr_mp_id, 3);
        item.add_effect(FPalaceHelper.height_id, 0.1);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge challenge = new Challenge();
        challenge.set_attack_stat(-1,0);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(100);
        challenge.setText("");
        
        Consequence consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.height_id,10, "</n> feels a bit sick. ",0);
        consequence.addConsequence(FPalaceHelper.height_id,-10, "</n> feels a bit sick. ",-1);
        a.addChallenge(challenge,consequence);
        
        item.add_action(a);
        
        item.setValue(15);
        return item;
    }
    
    public static Item Healing_Draught(){
        //selling NPC: lux_invira_shopkeeper
        Item item = new Item("Draught");
        item.setDroppedDescription("a bottle sits lazily on the ground here");
        item.setInventoryDescription("This bottle has a label that says \"Use after a hard night\"");
        item.setUseDescription("</n> drinks the draught, and looks woozy.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(2);
        item.add_effect(FPalaceHelper.curr_hp_id, 5);
        item.add_effect(FPalaceHelper.lust_id, 2);
        item.setValue(10);
        return item;
    }
    
    public static Item upsidedown_potion(){
        //selling NPC: chastity_witch
        Item item = new Item("Upsidedown Potion");
        item.setDroppedDescription("a bottle sits lazily on the ground here");
        item.setInventoryDescription("This bottle is quite literally upside down. The stopper resides in the middle of what you would consider the bottom. ");
        item.setUseDescription("</n> drinks the potion.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(10);
        item.add_effect(FPalaceHelper.curr_mp_id, 5);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.bust_id);
        chall.set_defense_stat(-1, 20);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.hips_id);
        chall.set_defense_stat(-1, 40);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        item.add_action(a);
        
        item.setValue(10);
        return item;
    }
    
    public static Item sunlight_potion(){
        //selling NPC: 
        Item item = new Item("Sunlight Potion");
        item.setDroppedDescription("a bottle sits lazily on the ground here");
        item.setInventoryDescription("This appears to be a bottle that <i>contains</i> sunlight. ");
        item.setUseDescription("</n> drinks the potion.");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(10);
        item.add_effect(FPalaceHelper.curr_mp_id, 2);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.eye_colour_id);
        chall.set_defense_stat(-1, 20);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.eye_colour_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.eye_colour_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        item.add_action(a);		
        
        item.setValue(10);
        return item;
    }
    
    public static Item jade_egg(){
        //selling NPC: industria_grocer
        Item item = new Item("Jade Egg");
        item.setDroppedDescription("there is an egg on the ground");
        item.setInventoryDescription("This is a small egg, perfectly smooth and a beautiful jade colour. ");
        item.setUseDescription("</n> eats the egg. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(20);
        item.add_effect(FPalaceHelper.curr_hp_id, 1);
        item.add_effect(FPalaceHelper.lust_id, 50);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        chall.set_defense_stat(-1, 5);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.vaginal_depth_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.vaginal_depth_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.vaginal_width_id);
        chall.set_defense_stat(-1, 10);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.vaginal_width_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.vaginal_width_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        item.add_action(a);
        
        item.setValue(50);
        return item;
    }
    
    public static Item loli_pop(){
        //selling NPC: Futa High vending machine
        Item item = new Item("Loli-pop");
        item.setDroppedDescription("there is some candy on the ground");
        item.setInventoryDescription("This is a lollipop, the branding of which has been playfully mispelled. ");
        item.setUseDescription("</n> takes a few licks of the lollipop before crunching down and consuming it. ");
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(20);
        item.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        item.add_effect(FPalaceHelper.lust_id, 10);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.breast_size_id);
        chall.set_defense_stat(-1, 1);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.age_id);
        chall.set_defense_stat(-1, 8);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.age_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.age_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        item.add_action(a);			
        
        item.setValue(10);
        return item;
    }
    
    public static Item fem_pills(){
        //selling NPC: nunnery_merchant
        Item item = new AlchemyItem("Fem-pills");
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The label on this pill pouch is little past a rudimentary man with a red x drawn over him. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(20);
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.penis_length_id,-1);
        item.add_effect(FPalaceHelper.penis_girth_id,-0.3);
        item.add_effect(FPalaceHelper.balls_size_id,-0.3);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.bust_id);
        chall.set_defense_stat(-1, 30);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.waist_id);
        chall.set_defense_stat(-1, 26);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", 0,0,0,2);
        c2.addConsequence(-FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", -1,0,0,2);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.hips_id);
        chall.set_defense_stat(-1, 30);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", 0,0,0,2);
        c2.addConsequence(-FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", -1,0,0,2);
        
        a.addChallenge(chall, c2);
        
        item.add_action(a);		
        
        item.setValue(20);
        
        return item;
    }
    
    public static Item man_pills(){
        //selling NPC: nunnery_merchant
        Item item = new AlchemyItem("Man-pills");
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The label on this pill pouch is little past a rudimentary woman with a red x drawn over her. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(20);
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.clit_length,-0.3);
        item.add_effect(FPalaceHelper.nipple_size_id,-0.3);
        item.add_effect(FPalaceHelper.breast_size_id,-0.3);
        item.add_effect(FPalaceHelper.vaginal_depth_id,-0.5);
        item.add_effect(FPalaceHelper.vaginal_width_id,-0.3);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.bust_id);
        chall.set_defense_stat(-1, 32);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.waist_id);
        chall.set_defense_stat(-1, 32);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", 0,0,0,2);
        c2.addConsequence(-FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", -1,0,0,2);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.hips_id);
        chall.set_defense_stat(-1, 32);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", 0,0,0,2);
        c2.addConsequence(-FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", -1,0,0,2);
        
        a.addChallenge(chall, c2);
        
        item.add_action(a);		
        
        item.setValue(20);
        
        return item;
    }
    
    public static Item bleach(){//should really be an alchmy item....
        //selling NPC: mensch_slaver
        Item item = new Item("Bleach");
        item.setDroppedDescription("a jug sits here");     
        item.setInventoryDescription("The jug, despite being unlabelled, carries the smell of bleach. ");     
        item.setUseDescription("</n> applies the bleach to </noun> scalp. ");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(2);
        item.add_effect(FPalaceHelper.curr_hp_id,-1);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.hair_colour_id);
        chall.set_defense_stat(-1, 0);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.hair_colour_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.hair_colour_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        item.add_action(a);			
        
        item.setValue(5);
        
        return item;
    }
    
    public static Item Tent(){
        //selling NPC: cclass_merchant
        var tent = new Item("Tent");
        tent.add_crafting_requirement(textiles(),10);
        tent.add_crafting_requirement(wood(),2);
        tent.setDroppedDescription("a set of poles and canvas is lying on the ground here");
        tent.setInventoryDescription("Everything you need to stay covered overnight.");
        tent.setUseDescription("</n> take a few moments to setup a campsite. ");
        tent.setImageID(FPalaceHelper.unknown_img);
        tent.setIdentifyDifficulty(1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        CharAction camp_site_action = new CharAction();
        camp_site_action.set_dialogue("",0);
        Challenge challenge = new Challenge();
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        challenge.setText("");
        RoomConsequence r_consequence = new RoomConsequence();
        r_consequence.addConsequence(0,0, "The site looks nice and cozy. ",0);
        r_consequence.add_room_action(camp_object);
        
        camp_site_action.addChallenge(challenge, r_consequence);			
        
        tent.add_action(camp_site_action);			
        
        tent.setValue(20);
        
        return tent;
    }
    
    public static Item Healing_Potion(){
        //selling NPC: cclass_merchant
        Item health_potion = new Item("Healing Potion");
        health_potion.setDroppedDescription("a bottle sits lazily on the ground here");
        health_potion.setInventoryDescription("This bottle has a small label with large red heart and white cross on it.");
        health_potion.setUseDescription("</n> drinks the potion and </noun> wounds melt away.");
        health_potion.setImageID(FPalaceHelper.unknown_img);
        health_potion.setIdentifyDifficulty(1);
        health_potion.add_effect(FPalaceHelper.curr_hp_id,7);
        
        Consequence consequence = new Consequence();
            consequence.add_remove_status(TickEffect.poisoned_status);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
        
        health_potion.addConsequence(consequence);
        
        health_potion.setValue(15);
        return health_potion;
    }		
    
    public static Item bronze_shortsword_recipe(){
        //selling NPC: benevol_librarian
        Item recipe = new Item("Short Sword Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a bronze short sword.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(bronze_short_sword());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item spear_recipe(){
        //selling NPC :benevol_librarian
        Item recipe = new Item("Spear Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a spear.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(spear());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item rapier_recipe(){
        //selling NPC: ahimsa_smith
        Item recipe = new Item("Rapier Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a rapier.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(elvish_rapier());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item shield_recipe(){
        //selling NPC: mensch_smith
        Item recipe = new Item("Shield Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a shield.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(bronze_shield());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item greaves_recipe(){
        //selling NPC: ahimsa_smith
        Item recipe = new Item("Greaves Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a pair of greaves.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(bronze_greaves());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item ring_recipe(){
        //selling NPC: benevol_jeweller
        Item recipe = new Item("Ring Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a ring.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(gold_ring());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item gown_recipe(){
        //selling NPC: ahimsa_seamstress
        Item recipe = new Item("Gown Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a gown.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(brown_elvish_gown());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item breastplate_recipe(){
        //selling NPC: ahimsa_smith
        Item recipe = new Item("Breastplate Recipe");
        recipe.setDroppedDescription("a piece of paper is on the ground here");
        recipe.setInventoryDescription("This piece of paper appears to have instructions on how to make a breastplate.");
        recipe.setUseDescription("</n> commits the instructions to memory.");
        recipe.setImageID(FPalaceHelper.unknown_img);
        recipe.setIdentifyDifficulty(1);
        
        ItemConsequence iconsequence = new ItemConsequence();
            iconsequence.add_item_recipe(bronze_breastplate());
        recipe.addConsequence(iconsequence);
        
        recipe.setValue(10);
        return recipe;
    }
    
    public static Item Spam_PLength(){     
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Hosemol");     
        item.setDroppedDescription("an ugly plastic pill bottle sits here");     
        item.setInventoryDescription("The writing on this bottle reads like an idiot's attempt to bypass a spam filter, aside from a strangely professional list of chemicals in a small white box on the back. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.penis_length_id,0.03);
        
        
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,5);
            challenge.set_defense_stat(-1, 0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            ////c2.amt_by_roll_flag({"r", "/", 100.0});
            c2.addConsequence(-FPalaceHelper.penis_length_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);
            
        item.addConsequence(consequence);
        
        item.setValue(30);
        
        return item;
    }
    
    public static Item Spam_PGirth(){     
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Pythonex-treme");     
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The writing on this pouch reads like an idiot's attempt to bypass a spam filter, aside from a strangely professional list of chemicals in a small white box. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.penis_girth_id,0.01);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,5);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(5);
            Consequence c2 = new Consequence();
            ////c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.penis_girth_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);
            
        item.addConsequence(consequence);
        
        item.setValue(30);
        
        return item;
    }
    
    public static Item Spam_BallSize(){     
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Sackdamine");     
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The writing on this pouch reads like an idiot's attempt to bypass a spam filter, aside from a strangely professional list of chemicals in a small white box. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.balls_size_id,0.01);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,5);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(5);
            Consequence c2 = new Consequence();
            ////c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.balls_size_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);
            
        item.addConsequence(consequence);
        
        item.setValue(30);
        
        return item;
    }
    
    public static Item Spam_BustSize(){     
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Absdomniplex");     
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The writing on this pouch reads like an idiot's attempt to bypass a spam filter, aside from a strangely professional list of chemicals in a small white box. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.bust_id,0.05);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(15);
            Consequence c2 = new Consequence();
            ////c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);				
            
        item.addConsequence(consequence);
        
        item.setValue(30);
        
        return item;
    }
    
    public static Item Spam_ErRat(){     
        //selling NPC: witches_potionmaking_student
        Item item = new Item("Ciagra");     
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The writing on this pouch reads like an idiot's attempt to bypass a spam filter, aside from a strangely professional list of chemicals in a small white box. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(4);
        item.add_effect(FPalaceHelper.erection_ratio_id,0.001);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(15);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 1000.0]);
            c2.addConsequence(-FPalaceHelper.erection_ratio_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);				
            
        item.addConsequence(consequence);
        
        item.setValue(30);
        
        return item;
    }
    
    public static Item Spam_CumV(){     
        //selling NPC: nunnery_drug_dealer
        Item item = new Item("Vialis");     
        item.setDroppedDescription("an ugly pill pouch sits here");     
        item.setInventoryDescription("The writing on this pouch reads like an idiot's attempt to bypass a spam filter, aside from a strangely professional list of chemicals in a small white box. ");     
        item.setUseDescription("</n> swallows two of the pills.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(8);
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.cum_volume_id,1);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 10.0]);
            c2.addConsequence(-FPalaceHelper.cum_volume_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);			
            
        item.addConsequence(consequence);
        
        item.setValue(30);
        
        return item;
    }
    
    public static Item Fem_BreastSize(){      
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Valley Hills Magnificence");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with an orange and yellow sunset shining over a pair of tall green hills residing over long green fields. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.breast_size_id,0.02);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_HipSize(){      
        //selling NPC: nunnery_drug_dealer
        Item item = new Item("Garden Gateway Grandeur");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with a door that glows with a light from behind. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.hips_id,0.1);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 10.0]);
            c2.addConsequence(-FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_NipSize(){      
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Rocky Mountain Splendour");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with a picturesque set of peaks. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.nipple_size_id,0.01);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.nipple_size_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_HairLength(){      
        //selling NPC: witches_potionmaking_student
        Item item = new Item("Silky stream Sumptuousness");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with a peaceful stream running through a forest. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.hair_length_id,0.1);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 10.0]);
            c2.addConsequence(-FPalaceHelper.hair_length_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_HairColour(){
        //selling NPC: witches_potionmaking_student
        Item item = new Item("Grassy field Resplendence");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with hills covered in rows of flowers of every conceavable colour. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.hair_colour_id,0.2);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(20);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 10.0]);
            c2.addConsequence(-FPalaceHelper.hair_colour_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_ClitSize(){
        //selling NPC: job_century_city_gro_clerk
        Item item = new Item("Tower Roof Treasure");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with a tower, a window near the top spilling golden light. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.clit_length,0.03);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(20);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.clit_length,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_WaistSize(){
        //selling NPC: nunnery_drug_dealer
        Item item = new Item("Open Plains Pleasure");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with grass covered hills and free running horses. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.waist_id,0.05);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,20);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(40);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Fem_eyeColour(){
        //selling NPC: witches_potionmaking_student
        Item item = new Item("Moon pool Allure");     
        item.setDroppedDescription("a colorful box of pills sits here");     
        item.setInventoryDescription("This box of tablets comes illustrated with forest pools in pale moonlight. There is an annoying lack of information on the box for its intended  however");     
        item.setUseDescription("</n> sucks on the fruit flavored chalky tablet.");     
        item.setImageID(FPalaceHelper.unknown_img);
        item.setIdentifyDifficulty(10);     
        item.setNumUses(2);
        item.add_effect(FPalaceHelper.eye_colour_id,0.2);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(20);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 10.0]);
            c2.addConsequence(-FPalaceHelper.eye_colour_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);    
        item.setValue(20);   
        return item;
    }
    
    public static Item Medic_AnalWidth(){
        //selling NPC: witches_potionmaking_student
        Item item = new Item("Ampulli Extracator");     
        item.setDroppedDescription("a shiny tab of pills sits here");     
        item.setInventoryDescription("This is a shiny tab of tablets. Its name is printed numerous times on the foil, the only clue to its actual ");    
        item.setUseDescription("</n> carefully removes the pill from its packaging and swallows it.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(12);     
        item.add_effect(FPalaceHelper.anal_width_id,0.01);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.anal_width_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);      
        item.setValue(10);     
        return item; 
    }
    
    public static Item Medic_VagWidth(){
        //selling NPC: witches_potionmaking_student
        Item item = new Item("Vulva Expatiation supplement");     
        item.setDroppedDescription("a shiny tab of pills sits here");     
        item.setInventoryDescription("This is a shiny tab of tablets. Its name is printed numerous times on the foil, the only clue to its actual ");    
        item.setUseDescription("</n> carefully removes the pill from its packaging and swallows it.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(12);     
        item.add_effect(FPalaceHelper.vaginal_width_id,0.01);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 100.0]);
            c2.addConsequence(-FPalaceHelper.vaginal_width_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);	
            
        item.addConsequence(consequence);      
        item.setValue(10);     
        return item; 
    }
    
    public static Item Medic_SemenFertility(){
        //selling NPC: nunnery_drug_dealer
        Item item = new Item("Andric procreant");     
        item.setDroppedDescription("a shiny tab of pills sits here");     
        item.setInventoryDescription("This is a shiny tab of tablets. Its name is printed numerous times on the foil, the only clue to its actual ");    
        item.setUseDescription("</n> carefully removes the pill from its packaging and swallows it.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(12);     
        item.add_effect(FPalaceHelper.semen_fertility_id,0.001);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 1000.0]);
            c2.addConsequence(-FPalaceHelper.semen_fertility_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);
            
        item.addConsequence(consequence);      
        item.setValue(10);     
        return item; 
    }
    
    public static Item Medic_WombFertility(){
        //selling NPC: nunnery_drug_dealer
        Item item = new Item("Muliebral procreant");     
        item.setDroppedDescription("a shiny tab of pills sits here");     
        item.setInventoryDescription("This is a shiny tab of tablets. Its name is printed numerous times on the foil, the only clue to its actual ");    
        item.setUseDescription("</n> carefully removes the pill from its packaging and swallows it.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(12);     
        item.add_effect(FPalaceHelper.egg_fertility_id,0.001);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,10);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(10);
            Consequence c2 = new Consequence();
            //c2.amt_by_roll_flag(["r", "/", 10000.0]);
            c2.addConsequence(-FPalaceHelper.egg_fertility_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);
            
        item.addConsequence(consequence);      
        item.setValue(10);     
        return item; 
    }		
    
    public static Item Medic_MilkProd(){
        //selling NPC: nunnery_drug_dealer
        Item item = new Item("Mammary Exocrine Agglomerates");     
        item.setDroppedDescription("a shiny tab of pills sits here");     
        item.setInventoryDescription("This is a shiny tab of tablets. Its name is printed numerous times on the foil, the only clue to its actual ");    
        item.setUseDescription("</n> carefully removes the pill from its packaging and swallows it.");     
        item.setImageID(FPalaceHelper.unknown_img);     
        item.setIdentifyDifficulty(12);     
        item.add_effect(FPalaceHelper.milk_volume_id,1);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            Challenge challenge = new Challenge();
            challenge.set_attack_stat(-1,5);
            challenge.set_defense_stat(-1,0);
            challenge.setVariability(20);
            Consequence c2 = new Consequence();
            c2.amt_by_roll_flag();
            c2.addConsequence(-FPalaceHelper.milk_volume_id,Consequence.amt_from_roll_const, "", 0);
            
            for(int i = 0;i<FPGameGithub.T1_WEEK;i+=FPGameGithub.T1_HOUR)tf.set_tick_consequence(i,c2,challenge);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,0, "",0,0,0,-1, false, tf);
            
        item.addConsequence(consequence);      
        item.setValue(10);     
        return item; 
    }
    
    public static Item bottled_abortion(){
        //selling NPC: cclass_merchant
        var abortion_potion = new Item("AIAB");
        abortion_potion.setDroppedDescription("a bottle sits lazily on the ground here");
        abortion_potion.setInventoryDescription("This bottle has a small label with large red heart that seems to be bleeding.");
        abortion_potion.setUseDescription("</n> drinks the potion. ");
        abortion_potion.setImageID(FPalaceHelper.unknown_img);
        abortion_potion.setIdentifyDifficulty(1);
        abortion_potion.add_effect(FPalaceHelper.curr_hp_id,-2);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge challenge = new Challenge();
        challenge.set_attack_status_id(TickEffect.pregnant_status);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("");
        
        Consequence consequence = new Consequence();
            consequence.add_remove_status(TickEffect.pregnant_status);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n> bleeds from </noun> groin. ",0,0,0,1);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",-1);
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.bloat_id);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        challenge.setText("");
        
        consequence = new Consequence();
            consequence.amt_by_roll_flag();
            consequence.addConsequence(FPalaceHelper.bloat_id,Consequence.amt_from_roll_const, "",0);
            consequence.addConsequence(FPalaceHelper.bloat_id,0, "",-1);
        
        a.addChallenge(challenge, consequence);
        
        abortion_potion.add_action(a);
        
        abortion_potion.setValue(20);
        return abortion_potion;
    }
    
    public static Item pregnaid(){
        //selling NPC: Lilly
        var pregnant_potion = new Item("Pregnaid");
        pregnant_potion.setDroppedDescription("a bottle sits lazily on the ground here");
        pregnant_potion.setInventoryDescription("This bottle has a small label showing a large red heart with a white heart inside of it.");
        pregnant_potion.setUseDescription("</n> drinks the potion. ");
        pregnant_potion.setImageID(FPalaceHelper.unknown_img);
        pregnant_potion.setIdentifyDifficulty(1);
        
        Consequence consequence = new Consequence();
            consequence.add_remove_status(TickEffect.pregnant_status,FPGameGithub.T1_MONTH*3);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
        
        pregnant_potion.addConsequence(consequence);
        
        pregnant_potion.setValue(30);
        return pregnant_potion;
    }
    
    public static Item Senip_Sangria(){
        //selling NPC: FPalace_bartender
        var sangria = new Item("Senip Sangria");
        sangria.setDroppedDescription("a filled glass sits on the ground");
        sangria.setInventoryDescription("The liquid in this conical, long-stemmed glass smells strongly of fruit and wine.");
        sangria.setUseDescription("</n> drinks the sangria and starts to look a little woozy.");
        sangria.setImageID(FPalaceHelper.unknown_img);
        sangria.setIdentifyDifficulty(1);
        sangria.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
            consequence.add_change_effect(FPalaceHelper.new_penis(null));
        
        sangria.addConsequence(consequence);
        
        sangria.setValue(2);
        return sangria;
    }
    
    public static Item Streabs_Sherry(){
        //selling NPC: FPalace_bartender
        var sherry = new Item("Streabs Sherry");
        sherry.setDroppedDescription("a filled glass sits on the ground");
        sherry.setInventoryDescription("The liquid in this conical glass smells strongly of grapes and booze.");
        sherry.setUseDescription("</n> drinks the sherry and starts to look a little woozy.");
        sherry.setImageID(FPalaceHelper.unknown_img);
        sherry.setIdentifyDifficulty(1);
        sherry.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
            consequence.add_change_effect(FPalaceHelper.new_breasts(null));
        
        sherry.addConsequence(consequence);
        
        sherry.setValue(5);
        return sherry;
    }
    
    public static Item Gavin_Ale(){
        //selling NPC: FPalace_bartender
        var ale = new Item("Gavin ale");
        ale.setDroppedDescription("a filled glass sits on the ground");
        ale.setInventoryDescription("The liquid in this large pint glass smells strongly of grain and hops.");
        ale.setUseDescription("</n> drinks the ale and starts to look a little woozy.");
        ale.setImageID(FPalaceHelper.unknown_img);
        ale.setIdentifyDifficulty(1);
        ale.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
            consequence.add_change_effect(FPalaceHelper.new_vagina(null));
            consequence.add_change_effect(FPalaceHelper.new_clit(null));
        
        ale.addConsequence(consequence);
        
        ale.setValue(1);
        return ale;
    }
    
    public static Item Allbs_Homebrew(){
        //selling NPC: FPalace_bartender
        var homebrew = new Item("Allbs homebrew Alcohol");
        homebrew.setDroppedDescription("a filled shot glass sits on the ground");
        homebrew.setInventoryDescription("The liquid in this small shot glass smells strongly of... peaches?");
        homebrew.setUseDescription("</n> drinks the shot and starts to look a little woozy.");
        homebrew.setImageID(FPalaceHelper.unknown_img);
        homebrew.setIdentifyDifficulty(1);
        homebrew.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
            consequence.add_change_effect(FPalaceHelper.new_balls(null));
        
        homebrew.addConsequence(consequence);
        
        homebrew.setValue(1);
        return homebrew;
    }
    
    public static Item Prothg_wine(){
        //selling NPC: FPalace_bartender
        var wine = new Item("Prothgs finest wine");
        wine.setDroppedDescription("a filled wine glass sits on the ground");
        wine.setInventoryDescription("The liquid in this wine glass has a musky scent that leaves you wondering what kind of grape grows in the mountains.");
        wine.setUseDescription("</n> drinks the wine and starts to look a little woozy.");
        wine.setImageID(FPalaceHelper.unknown_img);
        wine.setIdentifyDifficulty(1);
        wine.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
            
        wine.addConsequence(consequence);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.penis_length_id);
        chall.set_defense_stat(-1, 14);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(2);
        c2.addConsequence(FPalaceHelper.penis_length_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.penis_length_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.penis_girth_id);
        chall.set_defense_stat(-1, 10);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.penis_girth_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.penis_girth_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        wine.add_action(a);
        
        wine.setValue(20);
        return wine;
    }
    
    public static Item Wests_Bourban(){
        //selling NPC: FPalace_bartender
        var bourban = new Item("Wests Bourban");
        bourban.setDroppedDescription("a filled glass sits on the ground");
        bourban.setInventoryDescription("The liquid in this glass is murky yet light, and the smell leaves you thinking of fresh cut grass and cattle.");
        bourban.setUseDescription("</n> drinks the bourban and starts to look a little woozy.");
        bourban.setImageID(FPalaceHelper.unknown_img);
        bourban.setIdentifyDifficulty(1);
        bourban.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
        
        bourban.addConsequence(consequence);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.breast_size_id);
        chall.set_defense_stat(-1, 7);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.milk_volume_id);
        chall.set_defense_stat(-1, 500);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(10);
        c2.addConsequence(FPalaceHelper.milk_volume_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.milk_volume_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        bourban.add_action(a);
        
        bourban.setValue(10);
        return bourban;
    }
    
    public static Item Grulv_Vodka(){
        //selling NPC: FPalace_bartender
        var vodka = new Item("Grulv Vodka");
        vodka.setDroppedDescription("a filled glass sits on the ground");
        vodka.setInventoryDescription("The liquid in this glass is as clear as the glass, and the smell already has your stomach ready to heave.");
        vodka.setUseDescription("</n> drinks the vodka and starts to look woozy.");
        vodka.setImageID(FPalaceHelper.unknown_img);
        vodka.setIdentifyDifficulty(1);
        vodka.add_effect(FPalaceHelper.curr_mp_id,-10);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
                        
        vodka.addConsequence(consequence);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        chall.set_defense_stat(-1, 7);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.vaginal_depth_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.vaginal_depth_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.vaginal_width_id);
        chall.set_defense_stat(-1, 5);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.vaginal_width_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.vaginal_width_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        vodka.add_action(a);
        
        vodka.setValue(30);
        return vodka;
    }
    
    public static Item Palace_Private_Reserve(){
        //selling NPC: FPalace_bartender
        var ppp = new Item("Palace Private Reserve");
        ppp.setDroppedDescription("a filled glass sits on the ground");
        ppp.setInventoryDescription("Despite having the familiar smell of red wine, the liquid in this glass has a strange whitish-blue hugh to it.");
        ppp.setUseDescription("</n> drinks the wine and starts to look a little woozy.");
        ppp.setImageID(FPalaceHelper.unknown_img);
        ppp.setIdentifyDifficulty(1);
        ppp.add_effect(FPalaceHelper.curr_mp_id,-2);
        
        Consequence consequence = new Consequence();
        TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
            consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
            consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
            consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
            consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
        
        ppp.addConsequence(consequence);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.balls_size_id);
        chall.set_defense_stat(-1, 7);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(1);
        c2.addConsequence(FPalaceHelper.balls_size_id,Consequence.amt_from_roll_const, "", 0,0,0,1);
        c2.addConsequence(-FPalaceHelper.balls_size_id,Consequence.amt_from_roll_const, "", -1,0,0,1);
        
        a.addChallenge(chall, c2);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.cum_volume_id);
        chall.set_defense_stat(-1, 500);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(10);
        c2.addConsequence(FPalaceHelper.cum_volume_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.cum_volume_id,Consequence.amt_from_roll_const, "", -1);
    
        a.addChallenge(chall, c2);
        
        ppp.add_action(a);
        
        ppp.setValue(15);
        return ppp;
    }
    
    public static Item Stallion_Stout(){
        //selling NPC: equine_encampment_shopkeeper
        var stout = new AlchemyItem("Stallion Stout");
        stout.setDroppedDescription("a filled glass sits on the ground");
        stout.setInventoryDescription("The liquid in this large pint glass smells strongly of grain and hops.");
        stout.setUseDescription("</n> drinks the ale and starts to look a little woozy.");
        stout.setImageID(FPalaceHelper.unknown_img);
        stout.setIdentifyDifficulty(1);
        stout.setNumUses(2);
        
        stout.add_effect(FPalaceHelper.curr_mp_id,-2);
        stout.add_effect(FPalaceHelper.lust_id,15);
        stout.add_change_effect(FPalace_races.race_anthro_equine());
        
        stout.add_type(FPalaceHelper.curr_mp_id);
        stout.add_type(FPalaceHelper.lust_id);
        stout.add_type(FPalaceHelper.str_id);
        stout.add_type(-FPalaceHelper.dex_id);
        stout.add_type(FPalaceHelper.penis_length_id);
        stout.add_type(-FPalaceHelper.erection_ratio_id);
        stout.add_type(FPalaceHelper.hair_length_id);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_end_tick(FPGameGithub.T1_HOUR);
            tf.set_status_id(TickEffect.drunk_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.str_id,-1, "</n> sobers up. ", 0);
            c2.addConsequence(FPalaceHelper.dex_id,1, "",0);
            c2.addConsequence(FPalaceHelper.will_id,-1, "",0);
            c2.addConsequence(FPalaceHelper.int_id,1, "",0);
            c2.addConsequence(FPalaceHelper.wis_id,1, "",0);
            c2.addConsequence(FPalaceHelper.cha_id,-1, "",0);
            tf.set_end_consequence(c2);
            
        consequence.addConsequence(FPalaceHelper.str_id,1, "</n> is a bit drunk. ",0,0,0,-1, false, tf);
        consequence.addConsequence(FPalaceHelper.dex_id,-1, "",0);
        consequence.addConsequence(FPalaceHelper.will_id,1, "",0);
        consequence.addConsequence(FPalaceHelper.int_id,-1, "",0);
        consequence.addConsequence(FPalaceHelper.wis_id,-1, "",0);
        consequence.addConsequence(FPalaceHelper.cha_id,1, "",0);
        
        stout.addConsequence(consequence);
        
        stout.setValue(15);
        return stout;
    }
    
    public static AlchemyItem sexsnake_egg(){
        var ai = new AlchemyItem("Sexsnake Egg");
        ai.setDroppedDescription("there is an egg on the ground");
        ai.setInventoryDescription("This is a small egg, small blotches dotting the off white exterior. ");
        ai.setUseDescription("</n> eats the egg. ");
        ai.setImageID(FPalaceHelper.unknown_img);
        
        ai.add_effect(FPalaceHelper.curr_fatigue_id,1);
        ai.add_effect(FPalaceHelper.biomass_consumed,50);
        
        ai.add_type(FPalaceHelper.curr_fatigue_id);
        ai.add_type(FPalaceHelper.biomass_consumed);
        ai.add_type(FPalaceHelper.penis_length_id);
        ai.add_type(-FPalaceHelper.curr_hp_id);
        ai.add_type(FPalaceHelper.breast_size_id);
                    
        ai.setIdentifyDifficulty(10);
        ai.setValue(3);
        return ai;
    }
    
    public static AlchemyItem scorpion_egg(){
        var ai = new AlchemyItem("Scorpion Egg");
        ai.setDroppedDescription("there is an egg on the ground");
        ai.setInventoryDescription("This is a small egg, rough and sandy on the outside. ");
        ai.setUseDescription("</n> eats the egg. ");
        ai.setImageID(FPalaceHelper.unknown_img);
        
        ai.add_effect(FPalaceHelper.curr_fatigue_id,1);
        ai.add_effect(FPalaceHelper.biomass_consumed,50);
        
        ai.add_type(FPalaceHelper.curr_fatigue_id);
        ai.add_type(-FPalaceHelper.biomass_consumed);
        ai.add_type(-FPalaceHelper.bloat_id);
        ai.add_type(FPalaceHelper.age_id);
                    
        ai.setIdentifyDifficulty(10);
        ai.setValue(3);
        return ai;
    }
    
    public static AlchemyItem actino_egg(){
        var ai = new AlchemyItem("Actino Egg");
        ai.setDroppedDescription("there is an egg on the ground");
        ai.setInventoryDescription("This is a small egg, covered in a strange slime. ");
        ai.setUseDescription("</n> eats the egg. ");
        ai.setImageID(FPalaceHelper.unknown_img);
        
        ai.add_effect(FPalaceHelper.curr_fatigue_id,1);
        ai.add_effect(FPalaceHelper.biomass_consumed,50);
        
        ai.add_type(FPalaceHelper.curr_fatigue_id);
        ai.add_type(FPalaceHelper.biomass_consumed);
        ai.add_type(FPalaceHelper.max_hp_id);
        ai.add_type(-FPalaceHelper.anal_width_id);
        ai.add_type(-FPalaceHelper.bust_id);
                    
        ai.setIdentifyDifficulty(10);
        ai.setValue(10);
        return ai;
    }
    
    public static AlchemyItem arachnid_egg(){
        var ai = new AlchemyItem("Arachnid Egg");
        ai.setDroppedDescription("there is an egg on the ground");
        ai.setInventoryDescription("This is a large egg, trails of spiders silk still running from it. ");
        ai.setUseDescription("</n> eats the egg. ");
        ai.setImageID(FPalaceHelper.unknown_img);
        
        ai.add_effect(FPalaceHelper.curr_fatigue_id,2);
        ai.add_effect(FPalaceHelper.biomass_consumed,250);
        
        ai.add_type(FPalaceHelper.curr_fatigue_id);
        ai.add_type(FPalaceHelper.biomass_consumed);
        ai.add_type(FPalaceHelper.egg_fertility_id);
        ai.add_type(-FPalaceHelper.waist_id);
        ai.add_type(FPalaceHelper.max_fatigue_id);
                    
        ai.setNumUses(2);
        ai.setIdentifyDifficulty(50);
        ai.setValue(10);
        return ai;
    }
    
    public static AlchemyItem caudata_egg(){
        var ai = new AlchemyItem("Caudata Egg");
        ai.setDroppedDescription("there is an egg on the ground");
        ai.setInventoryDescription("This is a large egg covered in green scales. ");
        ai.setUseDescription("</n> eats the egg. ");
        ai.setImageID(FPalaceHelper.unknown_img);
        
        ai.add_effect(FPalaceHelper.curr_fatigue_id,2);
        ai.add_effect(FPalaceHelper.biomass_consumed,250);
        
        ai.add_type(FPalaceHelper.biomass_consumed);
        ai.add_type(FPalaceHelper.curr_fatigue_id);
        ai.add_type(FPalaceHelper.max_weight_id);
        ai.add_type(-FPalaceHelper.milk_volume_id);
        ai.add_type(FPalaceHelper.semen_fertility_id);
        
        ai.setNumUses(2);
        ai.setIdentifyDifficulty(50);
        ai.setValue(10);
        return ai;
    }
    
    public static AlchemyItem futa_cola(){
        //selling NPC: area_futa_high vending machine
        var ai = new AlchemyItem("Futa Cola");
        ai.setDroppedDescription("there is a can on the ground");
        ai.setInventoryDescription("This soda can is colourfully labelled \"Futa Cola\". ");
        ai.setUseDescription("</n> drinks some cola. ");
        ai.setImageID(FPalaceHelper.futa_cola_1_img);
        ai.setNumUses(2);
        ai.setIdentifyDifficulty(50);
        
        ai.add_effect(FPalaceHelper.curr_fatigue_id,2);
        ai.add_effect(FPalaceHelper.curr_mp_id,-2);
        ai.add_effect(FPalaceHelper.curr_hp_id,-2);
        ai.add_effect(FPalaceHelper.lust_id,50);
                    
        ai.add_type(FPalaceHelper.curr_fatigue_id);
        ai.add_type(FPalaceHelper.curr_mp_id);
        ai.add_type(FPalaceHelper.curr_hp_id);
        ai.add_type(FPalaceHelper.lust_id);
        ai.add_type(FPalaceHelper.height_id);
        ai.add_type(FPalaceHelper.bust_id);
        ai.add_type(FPalaceHelper.waist_id);
        ai.add_type(FPalaceHelper.hips_id);
        ai.add_type(FPalaceHelper.breast_size_id);
        ai.add_type(FPalaceHelper.penis_length_id);
        ai.add_type(FPalaceHelper.penis_girth_id);
        ai.add_type(FPalaceHelper.balls_size_id);
        ai.add_type(FPalaceHelper.cum_volume_id);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        
        Consequence consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,1);//has vag
        consequence.addConsequence(0,0, "",-1);//no vag, nothing to do here
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.penis_length_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,3);//already has a dick...
        consequence.addConsequence(0,0, "",-1,0,0,2);//no dick...
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,3);
        consequence.add_change_effect(FPalaceHelper.new_penis(null));
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.balls_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,5);//already has balls...
        consequence.addConsequence(0,0, "",-1,0,0,4);//no balls..
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,5);
        consequence.add_change_effect(FPalaceHelper.new_balls(null));
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.breast_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,7);//has breasts...
        consequence.addConsequence(0,0, "",-1,0,0,-1);//no breasts... nothing to do here
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.height_id,7, "",0);
        consequence.addConsequence(FPalaceHelper.bust_id,1.6, "",0);
        consequence.addConsequence(FPalaceHelper.waist_id,1.3, "",0);
        consequence.addConsequence(FPalaceHelper.hips_id,2, "",0);
        consequence.addConsequence(FPalaceHelper.breast_size_id,1.75, "",0);
        consequence.addConsequence(FPalaceHelper.penis_length_id,4.5, "",0);
        consequence.addConsequence(FPalaceHelper.penis_girth_id,1.5, "",0);
        consequence.addConsequence(FPalaceHelper.balls_size_id,.5, "",0);
        consequence.addConsequence(FPalaceHelper.str_id,1,"",0);
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_hard_stat();//checking erect length, not current length...
        challenge.set_attack_stat(FPalaceHelper.penis_length_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,6);
        consequence.addConsequence(0,0, "",32,0,0,8);
        consequence.addConsequence(0,0, "",-1,0,0,-1);
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_equip_slot_check(FPalaceHelper.cock_slot,true);
        challenge.set_defense_stat(-1,2);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        consequence.addConsequence(0,0, "",0,0,0,6);
        consequence.addConsequence(0,0, "",-1,0,0,9);//should be growing a second cock (same size as first one), and making dicks equine at a certain point...
        
        a.addChallenge(challenge, consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        
        consequence = new Consequence();
        Race race = FPalace_races.race_anthro_equine();
        consequence.addConsequence(0,0, "",0,0,0,-1);
        consequence.addConsequence(FPalaceHelper.height_id,7, "",0);
        consequence.addConsequence(FPalaceHelper.bust_id,1.6, "",0);
        consequence.addConsequence(FPalaceHelper.waist_id,1.3, "",0);
        consequence.addConsequence(FPalaceHelper.hips_id,2, "",0);
        consequence.addConsequence(FPalaceHelper.breast_size_id,1.75, "",0);
        consequence.addConsequence(FPalaceHelper.str_id,1,"",0);
        consequence.add_change_effect(race,FPalaceHelper.cock_slot);
        consequence.add_change_effect(race,FPalaceHelper.balls_slot);
        consequence.add_change_effect(FPalaceHelper.new_penis(race,16,5.5),FPalaceHelper.cock_slot);//this should *duplicate* the existing dick...
        
        a.addChallenge(challenge, consequence);
        
        ai.add_action(a);
        ai.setValue(50);
        return ai;
    }
    
    public static AlchemyItem lactaid(){
        //selling NPC: freedom_farms_lilly, century_city_medical_supplies_clerk
        var ai = new AlchemyItem("Lactaid");
        ai.setDroppedDescription("there is a plastic jar on the ground");
        ai.setInventoryDescription("This jar is filled with pills.");
        ai.setUseDescription("</n> swollows a few pills.");
        ai.setImageID(FPalaceHelper.unknown_img);
        ai.setIdentifyDifficulty(10);
        ai.add_effect(FPalaceHelper.lust_id, -10);
        
        ai.add_type(-FPalaceHelper.lust_id);
        ai.add_type(FPalaceHelper.milk_volume_id);
        ai.add_type(-FPalaceHelper.cum_volume_id);
        ai.add_type(FPalaceHelper.nipple_size_id);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_status_id(TickEffect.lactating_status);
            tf.set_end_tick(FPGameGithub.T1_WEEK);
            
        consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> feels a bit odd. ",0,0,0,-1, false, tf);
        
        ai.addConsequence(consequence);
        ai.setValue(10);
        return ai;
    }
    
    public static AlchemyItem chocoate_bar(){
        //selling NPC: century_city_shopkeeper
        var c_bar = new AlchemyItem("Chocolate bar");
        c_bar.setDroppedDescription("there is a tinfoil covered bar on the ground");
        c_bar.setInventoryDescription("This bar smells a bit like chocolate and looks rather delicious.");
        c_bar.setUseDescription("</n> eats the chocolate bar and savours the taste for a moment.");
        c_bar.setImageID(FPalaceHelper.unknown_img);
        c_bar.setIdentifyDifficulty(10);
        c_bar.add_effect(FPalaceHelper.curr_fatigue_id, 3);
        c_bar.add_effect(FPalaceHelper.lust_id, 15);
        
        c_bar.add_type(FPalaceHelper.lust_id);
        c_bar.add_type(FPalaceHelper.curr_fatigue_id);
        c_bar.add_type(FPalaceHelper.milk_volume_id);
        c_bar.add_type(-FPalaceHelper.cum_volume_id);
        c_bar.add_type(FPalaceHelper.nipple_size_id);
        
        c_bar.setValue(10);
        return c_bar;
    }
    
    public static AlchemyItem floppy_cucumber(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Floppy cucumber");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a cucumber on the ground");
        aitem.setInventoryDescription("This cucumber flops around as you hold it.");
        aitem.setUseDescription("</n> eats the cucumber.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.clit_length);
        aitem.add_type(FPalaceHelper.penis_length_id);
        aitem.add_type(-FPalaceHelper.erection_ratio_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem sperm_fish(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Sperm fish");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a fish on the ground");
        aitem.setInventoryDescription("This fish bears a striking resemblance to something.");
        aitem.setUseDescription("</n> eats the fish.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        
        aitem.add_type(FPalaceHelper.semen_fertility_id);
        aitem.add_type(-FPalaceHelper.skin_colour_id);
        aitem.add_type(-FPalaceHelper.semen_fertility_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem hairy_eggplant(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Hairy Eggplant");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is an eggplant on the ground");
        aitem.setInventoryDescription("This eggplant is covered in short purple hairs.");
        aitem.setUseDescription("</n> eats the eggplant.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.hair_length_id);
        aitem.add_type(-FPalaceHelper.penis_girth_id);
        aitem.add_type(FPalaceHelper.vaginal_width_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem perky_potatoes(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Perky potato");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a potato on the ground");
        aitem.setInventoryDescription("This potato is covered in perky small nubs.");
        aitem.setUseDescription("</n> eats the raw potato.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.nipple_size_id);
        aitem.add_type(-FPalaceHelper.balls_size_id);
        aitem.add_type(FPalaceHelper.max_lust_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem manly_mangoes(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Manly mango");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a mango on the ground");
        aitem.setInventoryDescription("This mangos green orange skin almost looks like a bulging muscle.");
        aitem.setUseDescription("</n> eats the mango.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.erection_ratio_id);
        aitem.add_type(-FPalaceHelper.egg_fertility_id);
        aitem.add_type(FPalaceHelper.cum_volume_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem slim_reed(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Slim reed");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a reed on the ground");
        aitem.setInventoryDescription("This whisper thin reed is barely visible as you hold it.");
        aitem.setUseDescription("</n> eats the reed.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.anal_depth_id);
        aitem.add_type(-FPalaceHelper.bust_id);
        aitem.add_type(-FPalaceHelper.hips_id);
                    
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem sucking_shrooms(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Sucking shrooms");
        aitem.setPropogate();
        aitem.setDroppedDescription("some mushrooms are growing from the ground here");
        aitem.setInventoryDescription("This brown and green mushroom seems to almost be breathing as you hold it. ");
        aitem.setUseDescription("</n> eats the mushroom.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.cum_volume_id);
        aitem.add_type(-FPalaceHelper.anal_depth_id);
        aitem.add_type(-FPalaceHelper.vaginal_depth_id);
        
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem funny_figs(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Funny figs");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some figs on the ground");
        aitem.setInventoryDescription("These figs are shaped like smiles.");
        aitem.setUseDescription("</n> eats the succulent figs.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.lust_id, 10);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(FPalaceHelper.max_mp_id);
        aitem.add_type(-FPalaceHelper.height_id);
        aitem.add_type(-FPalaceHelper.penis_length_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem colourful_cabbage(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Colourful Cabbage");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a head of cabbage on the ground");
        aitem.setInventoryDescription("This cabbage seems to be every colour of the rainbow.");
        aitem.setUseDescription("</n> munches down on the pods.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 3);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.hair_colour_id);
        aitem.add_type(-FPalaceHelper.clit_length);
        aitem.add_type(FPalaceHelper.eye_colour_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem spotted_peas(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Spotted Peas");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some pea pods the ground");
        aitem.setInventoryDescription("These pea pods have strange multi-coloured spots.");
        aitem.setUseDescription("</n> munches down on the pods.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.balls_size_id);
        aitem.add_type(-FPalaceHelper.vaginal_width_id);
        aitem.add_type(FPalaceHelper.eye_colour_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem heavy_squash(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Heavy Squash");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a gourd on the ground");
        aitem.setInventoryDescription("This heavy gourd feels like it could feed a family.");
        aitem.setUseDescription("</n> bites into the flesh of the gourd.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 5);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.max_weight_id);
        aitem.add_type(-FPalaceHelper.semen_fertility_id);
        aitem.add_type(FPalaceHelper.bloat_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem baby_berry(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Baby Berries");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some berries on the ground");
        aitem.setInventoryDescription("These berries are unbelievably small, though their bright red colour is appealing.");
        aitem.setUseDescription("</n> consumes the handful of berries quickly.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.semen_fertility_id);
        aitem.add_type(-FPalaceHelper.age_id);
        aitem.add_type(FPalaceHelper.egg_fertility_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem hearty_pepper(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Hearty Pepper");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a bell pepper on the ground");
        aitem.setInventoryDescription("This is a large bell pepper that glints green and metalic brown.");
        aitem.setUseDescription("</n> bites into the pepper, quickly consuming it.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(7);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.max_fatigue_id);
        aitem.add_type(-FPalaceHelper.max_mp_id);
        aitem.add_type(FPalaceHelper.waist_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem black_onion(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Black Onion");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is an onion on the ground");
        aitem.setInventoryDescription("This is a large, black onion, free of rot.");
        aitem.setUseDescription("</n> bites into the onion, tears quickly streaming down </noun> face.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.max_lust_id);
        aitem.add_type(-FPalaceHelper.milk_volume_id);
        aitem.add_type(FPalaceHelper.anal_depth_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem coconuts(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Pink Coconut");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a coconut on the ground");
        aitem.setInventoryDescription("This is a large, tough skinned coconut that is oddly flesh-toned.");
        aitem.setUseDescription("</n> breaks open the coconut, eating the tender flesh.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 3);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.egg_fertility_id);
        aitem.add_type(-FPalaceHelper.hair_length_id);
        aitem.add_type(FPalaceHelper.vaginal_depth_id);
        
        aitem.setValue(5);
        return aitem;
    }
    
    public static AlchemyItem iceberg_lettuce(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Iceberg lettuce");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a head of lettuce on the ground");
        aitem.setInventoryDescription("This head of lettuce actually looks like an iceberg, sheer fronds sweeping back into one another.");
        aitem.setUseDescription("</n> crunches into the lettuce.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 5);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.semen_fertility_id);
        aitem.add_type(-FPalaceHelper.anal_width_id);
        aitem.add_type(FPalaceHelper.vaginal_depth_id);
        
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem snowy_flower(){
        //selling NPC: job_aghapei_guru
        AlchemyItem aitem = new AlchemyItem("Snowy Flower");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a flower on the ground");
        aitem.setInventoryDescription("This flower is pure white, root, stem, and pettle.");
        aitem.setUseDescription("</n> eats the flower.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.milk_volume_id);
        aitem.add_type(-FPalaceHelper.weight_id);
        aitem.add_type(FPalaceHelper.breast_size_id);
        
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem gaping_moss(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Gaping Moss");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is some glowing moss on the ground");
        aitem.setInventoryDescription("This (predictably) glowing moss seems to push itself into a circle, gaping hole in the middle.");
        aitem.setUseDescription("</n> throws the moss down </noun> throat.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.vaginal_width_id);
        aitem.add_type(-FPalaceHelper.penis_length_id);
        aitem.add_type(FPalaceHelper.anal_width_id);
        
        aitem.setValue(3);
        return aitem;
    }
    
    public static AlchemyItem thick_rice(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Thick rice");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some kernals of rice on the ground");
        aitem.setInventoryDescription("A handfull of rice, each nearly round from the bulging center.");
        aitem.setUseDescription("</n> chews greedily on the rice.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.waist_id);
        aitem.add_type(-FPalaceHelper.min_lust_id);
        aitem.add_type(FPalaceHelper.hips_id);
        
        aitem.setValue(3);
        return aitem;
    }
    
    public static AlchemyItem black_beans(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Black beans");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some beans on the ground");
        aitem.setInventoryDescription("A handfull of black beans, oddly proportioned, one side much larger then the other.");
        aitem.setUseDescription("</n> eats the beans.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.bust_id);
        aitem.add_type(-FPalaceHelper.anal_depth_id);
        aitem.add_type(-FPalaceHelper.hips_id);
        
        aitem.setValue(3);
        return aitem;
    }
    
    public static AlchemyItem pleni_chili(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Pleni Chilis");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a small pepper on the ground");
        aitem.setInventoryDescription("An oddly shaped pepper, with a large cap but long slim body.");
        aitem.setUseDescription("</n> takes a brave bite of the chili.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.semen_fertility_id);
        aitem.add_type(-FPalaceHelper.hair_colour_id);
        aitem.add_type(-FPalaceHelper.eye_colour_id);
        
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem bulky_seeds(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Bulky Seeds");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some seeds on the ground");
        aitem.setInventoryDescription("A handful of surprisingly heavy and tough seeds.");
        aitem.setUseDescription("</n> munches down on the seeds.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.height_id);
        aitem.add_type(-FPalaceHelper.max_hp_id);
        aitem.add_type(FPalaceHelper.weight_id);
        
        aitem.setValue(3);
        return aitem;
    }
    
    public static AlchemyItem garbage(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Garbage");
        aitem.setPropogate();
        aitem.setDroppedDescription("there is a pile of garbage on the ground");
        aitem.setInventoryDescription("Just a pile of rubbish.");
        aitem.setUseDescription("</n> does </noun> best to consume the garbage, coughting and gagging the entire time.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(30);
        aitem.add_effect(FPalaceHelper.lust_id, -10);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -2);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -2);
        
        aitem.add_type(-FPalaceHelper.lust_id);
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.age_id);
        aitem.add_type(-FPalaceHelper.bloat_id);
        aitem.add_type(-FPalaceHelper.balls_size_id);
        aitem.setValue(1);
        return aitem;
    }
    
    public static AlchemyItem cocoa_beans(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Cocoa beans");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some beans on the ground");
        aitem.setInventoryDescription("These small, brown beans smell a bit like chocolate.");
        aitem.setUseDescription("</n> eats the beans and looks a little lusty.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 1);
        
        
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.hips_id);
        aitem.add_type(-FPalaceHelper.bust_id);
        aitem.add_type(FPalaceHelper.hair_colour_id);
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem Honey(){
        //selling NPC: bee_hive_shopkeeper
        AlchemyItem aitem = new AlchemyItem("Honey");
        aitem.setDroppedDescription("there's a broken off honeycomb on the ground");
        aitem.setInventoryDescription("These large, fist size combs of honey smell a bit salty.");
        aitem.setUseDescription("</n> eats the honey and almost goes mad with lust.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_bee());
        aitem.add_effect(FPalaceHelper.lust_id, 50);
        
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(FPalaceHelper.dex_id);
        aitem.add_type(-FPalaceHelper.will_id);
        aitem.add_type(FPalaceHelper.min_lust_id);
        aitem.add_type(-FPalaceHelper.cum_volume_id);
        aitem.add_type(FPalaceHelper.milk_volume_id);
        aitem.setValue(30);
        return aitem;
    }
    
    public static AlchemyItem donkey_daikon(){
        //selling NPC: job_benevol_herbalist
        AlchemyItem aitem = new AlchemyItem("Donkey Daikon");
        aitem.setDroppedDescription("there's a radish on the ground");
        aitem.setInventoryDescription("This large radish has to leaves oddly reminiscent of a donkeys ears.");
        aitem.setUseDescription("</n> eats the radish.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_donkey());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 2);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.wis_id);
        aitem.add_type(-FPalaceHelper.int_id);			
        aitem.add_type(-FPalaceHelper.erection_ratio_id);
        aitem.add_type(-FPalaceHelper.egg_fertility_id);
        aitem.add_type(FPalaceHelper.balls_size_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem froggy_feijoa(){
        //selling NPC: job_chastity_witch
        AlchemyItem aitem = new AlchemyItem("Froggy Feijoa");
        aitem.setDroppedDescription("there's a radish on the ground");
        aitem.setInventoryDescription("This large radish has to leaves oddly reminiscent of a donkeys ears.");
        aitem.setUseDescription("</n> eats the feijoa.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_frog());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.erection_ratio_id);
        aitem.add_type(-FPalaceHelper.sex_appeal_id);
        aitem.add_type(-FPalaceHelper.weight_id);
        aitem.add_type(-FPalaceHelper.hair_length_id);
        aitem.add_type(FPalaceHelper.cha_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem strong_cheese(){
        //selling NPC: job_burrowton_cheesemonger
        AlchemyItem aitem = new AlchemyItem("Strong Cheese");
        aitem.setDroppedDescription("there's some cheese on the ground");
        aitem.setInventoryDescription("This strong smelling cheese has holes that have strangely formed into the shape of some sort of rodent.");
        aitem.setUseDescription("</n> eats the cheese.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_mouse());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.nipple_size_id);
        aitem.add_type(-FPalaceHelper.str_id);
        aitem.add_type(-FPalaceHelper.penis_girth_id);
        aitem.add_type(-FPalaceHelper.vaginal_depth_id);
        aitem.add_type(FPalaceHelper.dex_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem edible_warranty(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Edible Warranty");
        aitem.setDroppedDescription("there's some paper on the ground");
        aitem.setInventoryDescription("This warranty warns that it will be voided if a seal is broken. It smells vaguely of fish. ");
        aitem.setUseDescription("</n> eats the warranty.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_seal());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -2);
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        
        aitem.add_type(FPalaceHelper.fur_colour_id);
        aitem.add_type(-FPalaceHelper.nipple_size_id);
        aitem.add_type(-FPalaceHelper.balls_size_id);
        
        aitem.add_type(-FPalaceHelper.wis_id);
        aitem.add_type(FPalaceHelper.con_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem goblin_giblets(){
        //selling NPC: job_industria_grocer
        AlchemyItem aitem = new AlchemyItem("Goblin giblets");
        aitem.setDroppedDescription("there's some guts on the ground");
        aitem.setInventoryDescription("This pile of cooked giblets clearly came from something larger than a chicken.");
        aitem.setUseDescription("</n> eats some giblets.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_goblin());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 2);
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        
        aitem.add_type(-FPalaceHelper.wis_id);
        aitem.add_type(FPalaceHelper.int_id);			
        aitem.add_type(-FPalaceHelper.height_id);
        aitem.add_type(FPalaceHelper.egg_fertility_id);
        aitem.add_type(FPalaceHelper.min_lust_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem orcish_delight(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Orcish delight");
        aitem.setDroppedDescription("there is some candy on the ground");
        aitem.setInventoryDescription("If you had to guess, these small green cubes are probably made of pure suger.");
        aitem.setUseDescription("</n> eats some candy.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_orc());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_mp_id);
        
        aitem.add_type(-FPalaceHelper.cha_id);
        aitem.add_type(FPalaceHelper.con_id);			
        aitem.add_type(-FPalaceHelper.clit_length);
        aitem.add_type(FPalaceHelper.skin_colour_id);
        aitem.add_type(-FPalaceHelper.biomass_consumed);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem veiny_venison(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Veiny venison");
        aitem.setDroppedDescription("there is some meat on the ground");
        aitem.setInventoryDescription("This hunk of meat is well marbled, but strangely contains thick veins.");
        aitem.setUseDescription("</n> eats some raw meat.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_deer());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 4);
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.curr_mp_id);
        
        aitem.add_type(-FPalaceHelper.str_id);
        aitem.add_type(FPalaceHelper.wis_id);
        
        aitem.add_type(-FPalaceHelper.anal_depth_id);
        aitem.add_type(FPalaceHelper.fur_colour_id);
        aitem.add_type(-FPalaceHelper.max_weight_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem doggy_bone(){
        //selling NPC: job_chastity_witch
        AlchemyItem aitem = new AlchemyItem("Doggy Bone");
        aitem.setDroppedDescription("there's a bone on the ground");
        aitem.setInventoryDescription("This bone is actually soft and maleable, smelling of suger.");
        aitem.setUseDescription("</n> chews on the bone.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_canine());
        aitem.add_effect(FPalaceHelper.curr_mp_id, 1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        
        aitem.add_type(-FPalaceHelper.con_id);
        aitem.add_type(FPalaceHelper.str_id);		
        aitem.add_type(-FPalaceHelper.max_lust_id);
        aitem.add_type(FPalaceHelper.bust_id);
        aitem.add_type(-FPalaceHelper.vaginal_width_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem scaled_egg(){
        //selling NPC: job_industria_grocer
        AlchemyItem aitem = new AlchemyItem("Scaled Egg");
        aitem.setDroppedDescription("there is an egg on the ground");
        aitem.setInventoryDescription("This is a large egg, multi-coloured scales covering it. ");
        aitem.setUseDescription("</n> eats the egg. ");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_anthro_lizard());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.int_id);
        aitem.add_type(-FPalaceHelper.cha_id);
        aitem.add_type(FPalaceHelper.height_id);
        aitem.add_type(-FPalaceHelper.hair_length_id);
        aitem.add_type(-FPalaceHelper.breast_size_id);
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        
        aitem.setValue(30);
        return aitem;
    }
    
    public static AlchemyItem Stubby_twig(){
        //selling NPC: job_benevol_herbalist
        AlchemyItem aitem = new AlchemyItem("Stubby twig");
        aitem.setPropogate();
        aitem.setDroppedDescription("there's a stubby looking plant growing from the path");
        aitem.setInventoryDescription("These roots are wrinkled and thick, but have some give to them.");
        aitem.setUseDescription("</n> chews on the twig over and over, eventually turning it into a paste. It's surprisingly sweet.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_effect(FPalaceHelper.lust_id, 5);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.penis_girth_id);
        aitem.add_type(-FPalaceHelper.breast_size_id);
        aitem.add_type(-FPalaceHelper.egg_fertility_id);
        aitem.setValue(30);
        return aitem;
    }
    
    public static AlchemyItem Cactus_petal(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Cactus petal");
        aitem.setPropogate();
        aitem.setDroppedDescription("there are some cactus petals on the ground");
        aitem.setInventoryDescription("These petals are bright blue and red, and surprisingly thick.");
        aitem.setUseDescription("</n> chews on the cactus petals and looks repulsed by their sharp flavour.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 5);
        
        aitem.add_type(FPalaceHelper.curr_mp_id);			
        aitem.add_type(FPalaceHelper.age_id);
        aitem.add_type(-FPalaceHelper.clit_length);
        aitem.add_type(FPalaceHelper.max_mp_id);
        
        aitem.setValue(30);
        return aitem;
    }
    
    public static AlchemyItem milk_jug(){
        //selling NPC: job_burrowton_cheesemonger
        AlchemyItem aitem = new AlchemyItem("Milk Jug");
        aitem.setDroppedDescription("there's a milk jug on the ground");
        aitem.setInventoryDescription("This is a large jug filled with a heavy white fluid.");
        aitem.setUseDescription("</n> drinks down the smooth and creamy milk.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_effect(FPalaceHelper.biomass_consumed,250);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 5);
        
        aitem.add_type(FPalaceHelper.biomass_consumed);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        
        aitem.add_type(FPalaceHelper.breast_size_id);
        aitem.add_type(-FPalaceHelper.penis_length_id);
        aitem.add_type(FPalaceHelper.milk_volume_id);

        aitem.setNumUses(2);
        aitem.setValue(10);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem bovine_milk_jug(){
        //selling NPC: freedom_farms_lilly
        AlchemyItem aitem = new AlchemyItem("Milk Bottle");
        aitem.setDroppedDescription("there's a milk jug on the ground");
        aitem.setInventoryDescription("This is a large bottle filled with a heavy white fluid, a strange label with a cow slapped across the front.");
        aitem.setUseDescription("</n> drinks down the smooth and creamy milk.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_change_effect(FPalace_races.race_anthro_bovine());
        aitem.add_effect(FPalaceHelper.biomass_consumed,250);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 5);
        
        aitem.add_type(FPalaceHelper.biomass_consumed);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        
        aitem.add_type(FPalaceHelper.con_id);
        aitem.add_type(-FPalaceHelper.will_id);
        aitem.add_type(FPalaceHelper.max_hp_id);
        aitem.add_type(-FPalaceHelper.max_mp_id);
        aitem.add_type(FPalaceHelper.nipple_size_id);
        aitem.setNumUses(2);
        aitem.setValue(30);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem cockorn(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Cockorn");
        aitem.setPropogate();
        aitem.setDroppedDescription("there's an ear of corn on the ground");
        aitem.setInventoryDescription("This is an oddly shaped vegetable covered in small kernals.");
        aitem.setUseDescription("</n> bites down on the uncooked cockorn.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.height_id);
        aitem.add_type(-FPalaceHelper.bloat_id);
        aitem.add_type(-FPalaceHelper.milk_volume_id);
        aitem.setValue(3);
        aitem.setWeight(1);
        return aitem;
    }
    
    public static AlchemyItem cum_jug(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("'Milk' Jug");
        aitem.setDroppedDescription("there's a jug on the ground");
        aitem.setInventoryDescription("This is a large jug filled with a heavy white fluid.");
        aitem.setUseDescription("</n> drinks down the thick and salty 'milk'.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        aitem.add_effect(FPalaceHelper.lust_id, 5);			
        aitem.add_effect(FPalaceHelper.biomass_consumed,250);
        
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(FPalaceHelper.biomass_consumed);
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.bloat_id);
        aitem.add_type(-FPalaceHelper.nipple_size_id);
        aitem.add_type(-FPalaceHelper.breast_size_id);
        
        aitem.setNumUses(2);
        aitem.setValue(5);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem rainbow_cherry(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Rainbow Cherries");
        aitem.setPropogate();
        aitem.setDroppedDescription("there're some multi-coloured cherries on the ground here");
        aitem.setInventoryDescription("Every single cherry seems to have the entire rainbow visible on its skin.");
        aitem.setUseDescription("</n> eats some cherries, finding the flavour different with every chew.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(10);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.hair_colour_id);
        aitem.add_type(-FPalaceHelper.breast_size_id);
        aitem.add_type(FPalaceHelper.eye_colour_id);
        
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem round_apple(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Round Apples");
        aitem.setPropogate();
        aitem.setDroppedDescription("there're some apples on the ground that are completely spherical");
        aitem.setInventoryDescription("Lovely red apples, with none of the usual bumps or imperfections.");
        aitem.setUseDescription("</n> eats the apple, and finds it tastes like a normal apple, but with an unmistakable twinge to the aftertaste.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.breast_size_id);
        aitem.add_type(-FPalaceHelper.waist_id);
        aitem.add_type(FPalaceHelper.balls_size_id);
        
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem dickweed(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Dickweed");
        aitem.setPropogate();
        aitem.setDroppedDescription("there's some dickweed growing nearby");
        aitem.setInventoryDescription("The leaves on these sprigs are strangely reminiscent of something.");
        aitem.setUseDescription("</n> eats the dickweed, finding the taste rather bland and salty.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
                    
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.penis_length_id);
        aitem.add_type(-FPalaceHelper.max_lust_id);
        aitem.add_type(-FPalaceHelper.penis_girth_id);
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem FPalace_book(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Book");
        aitem.setPropogate();
        aitem.setDroppedDescription("there's a book lying on the ground here");
        aitem.setInventoryDescription("A quick flip through shows a number of articles... and pictures.");
        aitem.setUseDescription("</n> reads the book and finds </objnoun>self more informed of the world. And a bit hornier.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        
        aitem.add_type(FPalaceHelper.max_mp_id);
        aitem.add_type(-FPalaceHelper.min_lust_id);
        aitem.add_type(-FPalaceHelper.max_hp_id);
        aitem.setValue(10);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem naughty_pictures(){
        //selling NPC: FPalace_guardian
        AlchemyItem aitem = new AlchemyItem("Naughty Pictures");
        aitem.setDroppedDescription("there is a pile of paper strewn about on the ground here");
        aitem.setInventoryDescription("A stack of paper with full colour images on them.");
        aitem.setUseDescription("</n> starts to look at the images, and finds picture after picture of the most gorgeous futanari </pronoun> has ever seen.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_effect(FPalaceHelper.lust_id, 35);
        
        aitem.add_type(FPalaceHelper.lust_id);
        
        aitem.add_type(FPalaceHelper.anal_width_id);
        aitem.add_type(-FPalaceHelper.max_fatigue_id);
        aitem.add_type(FPalaceHelper.penis_girth_id);
        aitem.setValue(18);
        
        aitem.set_topic(FPalace_topics.topic_naughty_pictures(aitem));
        
        return aitem;
    }
    
    public static AlchemyItem plain_jane_potion(){
        //selling NPC: century_city_shopkeeper, century_city_medical_supplies_clerk
        AlchemyItem aitem = new AlchemyItem("Plain Potion");
        aitem.setDroppedDescription("a bottle sits lazily on the ground here");
        aitem.setInventoryDescription("This bottle contains a shockingly pink fluid and a label that says \"Plain Jane loves to be plain\"");
        aitem.setUseDescription("</n> drinks the potion and appears kind of plain.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 2);			
        aitem.add_change_effect(FPalace_races.race_human());
        
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(FPalaceHelper.weight_id);
        aitem.add_type(-FPalaceHelper.max_hp_id);
        aitem.add_type(-FPalaceHelper.clit_length);
        
        aitem.setNumUses(2);
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem catnip(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Catnip");
        aitem.setDroppedDescription("some herbs are laying on the ground here");
        aitem.setInventoryDescription("These strange leafy buds have a pungent odour when you sniff them.");
        aitem.setUseDescription("</n> munches on the catnip, and appears more playful.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_change_effect(FPalace_races.race_anthro_feline());
        aitem.add_effect(FPalaceHelper.curr_mp_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.cha_id);
        aitem.add_type(-FPalaceHelper.con_id);
        aitem.add_type(FPalaceHelper.milk_volume_id);
        aitem.add_type(-FPalaceHelper.hips_id);
        aitem.add_type(FPalaceHelper.waist_id);
        aitem.setNumUses(2);
                    
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem elvish_bread(){
        //selling NPC: ahimsa_shopkeeper
        AlchemyItem aitem = new AlchemyItem("Elvish bread");
        aitem.setDroppedDescription("some bread is laying on the ground here");
        aitem.setInventoryDescription("This flat bread crumbles when you touch it.");
        aitem.setUseDescription("</n> eats the bread, and looks a bit older and wiser.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_change_effect(FPalace_races.race_elf());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 4);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        
        aitem.add_type(FPalaceHelper.wis_id);
        aitem.add_type(-FPalaceHelper.str_id);
        aitem.add_type(FPalaceHelper.max_mp_id);
        aitem.add_type(-FPalaceHelper.breast_size_id);
        aitem.add_type(-FPalaceHelper.balls_size_id);
        aitem.setNumUses(2);
        
        aitem.setValue(20);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem vial_of_goo(){
        //selling NPC: fpalace_shopkeeper
        AlchemyItem aitem = new AlchemyItem("Vial o' Goo");
        aitem.setDroppedDescription("a vial is laying on the ground here");
        aitem.setInventoryDescription("The vial contains a strange sticky blue liquid.");
        aitem.setUseDescription("</n> drinks down the vial, and can feel </noun> innards turn gooey.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_goo());
        aitem.add_effect(FPalaceHelper.lust_id, 15);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, -1);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.curr_mp_id);
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.will_id);
        aitem.add_type(-FPalaceHelper.wis_id);
        aitem.add_type(FPalaceHelper.vaginal_depth_id);
        aitem.add_type(-FPalaceHelper.height_id);
        aitem.add_type(FPalaceHelper.min_lust_id);
        aitem.setNumUses(2);

        aitem.setValue(20);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem vial_of_ichor(){
        //selling NPC: lux_invira_shopkeeper
        AlchemyItem aitem = new AlchemyItem("Vial of Spiders Ichor");
        aitem.setDroppedDescription("a vile is laying on the ground here");
        aitem.setInventoryDescription("The vial contains a strange sticky green substance.");
        aitem.setUseDescription("</n> drinks down the vial, and seems more at home in a hive.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(20);
        aitem.add_change_effect(FPalace_races.race_anthro_spider());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -1);
        aitem.add_effect(FPalaceHelper.curr_mp_id, 1);
        aitem.add_effect(FPalaceHelper.lust_id, -1);
        
        
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.lust_id);
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.dex_id);
        aitem.add_type(-FPalaceHelper.sex_appeal_id);
        aitem.add_type(FPalaceHelper.anal_depth_id);
        aitem.add_type(-FPalaceHelper.weight_id);
        aitem.add_type(FPalaceHelper.bloat_id);
        
        aitem.setNumUses(2);

        aitem.setValue(30);
        aitem.setWeight(2);
        return aitem;
    }
    
    public static AlchemyItem fishy_fruit(){
        //selling NPC: job_chastity_witch
        AlchemyItem aitem = new AlchemyItem("Fishy Fruit");
        aitem.setDroppedDescription("a fruit is laying on the ground here");
        aitem.setInventoryDescription("This fruit is shaped plainly enough, but seems fishy somehow. ");
        aitem.setUseDescription("</n> bites into the fruit, and feels a bit more at home in the water.");
        aitem.setImageID(FPalaceHelper.unknown_img);
                    
        aitem.add_change_effect(FPalace_races.race_anthro_fish());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.will_id);
        aitem.add_type(-FPalaceHelper.dex_id);			
        aitem.add_type(FPalaceHelper.penis_girth_id);
        aitem.add_type(-FPalaceHelper.erection_ratio_id);
        aitem.add_type(-FPalaceHelper.age_id);
        
        aitem.setIdentifyDifficulty(20);
        aitem.setNumUses(2);			
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem foxy_fruit(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Foxy Fruit");
        aitem.setDroppedDescription("a fruit is laying on the ground here");
        aitem.setInventoryDescription("This strangely shaped red fruit seems to constantly slip out of your hands. ");
        aitem.setUseDescription("</n> bites into the fruit, and </noun> eyes widen in surprise.");
        aitem.setImageID(FPalaceHelper.unknown_img);
                    
        aitem.add_change_effect(FPalace_races.race_anthro_fox());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 4);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.int_id);
        aitem.add_type(-FPalaceHelper.str_id);
        aitem.add_type(-FPalaceHelper.waist_id);
        aitem.add_type(FPalaceHelper.waist_id);
        
        aitem.add_type(-FPalaceHelper.age_id);
        
        aitem.setIdentifyDifficulty(20);
        aitem.setNumUses(2);			
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem penguins_pocky(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Penguins Pocky");
        aitem.setDroppedDescription("there is some candy on the ground");
        aitem.setInventoryDescription("This length of chocolate coated biscuit sure looks tasty. ");
        aitem.setUseDescription("</n> quickly crunches through the pocky, surprised to find a fishy after-taste.");
        aitem.setImageID(FPalaceHelper.unknown_img);
                    
        aitem.add_change_effect(FPalace_races.race_anthro_penguin());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 1);
        aitem.add_effect(FPalaceHelper.curr_hp_id, 1);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        
        aitem.add_type(FPalaceHelper.sex_appeal_id);
        aitem.add_type(-FPalaceHelper.dex_id);
        
        aitem.add_type(-FPalaceHelper.goo_colour_id);
        aitem.add_type(FPalaceHelper.cum_volume_id);			
        aitem.add_type(-FPalaceHelper.hair_length_id);
        
        aitem.setIdentifyDifficulty(20);
        aitem.setNumUses(2);			
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem rabbity_carrot(){
        //selling NPC: equine_encampment_shopkeeper
        AlchemyItem aitem = new AlchemyItem("Rabbity Carrot");
        aitem.setDroppedDescription("a carrot is laying on the ground here");
        aitem.setInventoryDescription("The leaves on this carrot look suspiciously like a rabbit.");
        aitem.setUseDescription("</n> bites into the carrot, and feels a bit more intuitive, and at home in nature.");
        aitem.setImageID(FPalaceHelper.unknown_img);
                    
        aitem.add_change_effect(FPalace_races.race_anthro_rabbit());
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 2);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.sex_appeal_id);
        aitem.add_type(-FPalaceHelper.int_id);
        aitem.add_type(FPalaceHelper.egg_fertility_id);
        aitem.add_type(-FPalaceHelper.cum_volume_id);
        aitem.add_type(FPalaceHelper.hips_id);
        
        aitem.setIdentifyDifficulty(20);
        aitem.setNumUses(2);
        
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem mushrooms(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Mushrooms");
        aitem.setPropogate();
        aitem.setDroppedDescription("some mushrooms are growing from the ground here");
        aitem.setInventoryDescription("These round red capped mushrooms have cute little white stems.");
        aitem.setUseDescription("</n> eats the mushrooms happily, though </noun> stomach gurgles afterwards.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(7);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        
        Consequence consequence = new Consequence();
            TickEffect tf = new TickEffect();
            tf.set_status_id(TickEffect.poisoned_status);
            Consequence c2 = new Consequence();
            c2.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> coughs up some blood. ", 0);
            tf.set_tick_consequence(3, c2);
            
        consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> feels a bit sick. ",0,0,0,-1, false, tf);
        
        aitem.addConsequence(consequence);
        
        aitem.add_type(FPalaceHelper.max_hp_id);
        aitem.add_type(-FPalaceHelper.max_weight_id);
        aitem.add_type(-FPalaceHelper.max_fatigue_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.setValue(10);
        return aitem;
    }
    
    public static AlchemyItem spent_tissues(){
        //selling NPC: 
        AlchemyItem aitem = new AlchemyItem("Tissues");
        aitem.setDroppedDescription("a pile of crusty tissues is lying on the ground");
        aitem.setInventoryDescription("These crusty things are rough in some places, and still slimey in others.");
        aitem.setUseDescription("</n> sniffs at the tissues and the scent immediately reminds </objnoun> of sex.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(5);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, -1);
        aitem.add_effect(FPalaceHelper.lust_id, 10);
        
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(-FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.max_fatigue_id);
        aitem.add_type(-FPalaceHelper.max_lust_id);
        aitem.add_type(-FPalaceHelper.max_mp_id);
        
        aitem.setValue(1);
        return aitem;
    }
    
    public static AlchemyItem devils_food_cake(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Devils-food cake");
        aitem.setDroppedDescription("there's a piece of cake on the ground");
        aitem.setInventoryDescription("This cake smells sweetly of sulfur.");
        aitem.setUseDescription("</n> consumes the cake.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_demon());
        aitem.add_effect(FPalaceHelper.curr_mp_id, 5);
        aitem.add_effect(FPalaceHelper.lust_id, 25);
        aitem.add_effect(FPalaceHelper.curr_hp_id, -2);
        
        aitem.add_type(FPalaceHelper.curr_mp_id);
        aitem.add_type(FPalaceHelper.lust_id);
        aitem.add_type(-FPalaceHelper.curr_hp_id);
        
        aitem.add_type(-FPalaceHelper.cha_id);
        aitem.add_type(FPalaceHelper.sex_appeal_id);
        
        aitem.add_type(-FPalaceHelper.skin_colour_id);
        aitem.add_type(FPalaceHelper.scale_colour_id);
        aitem.add_type(-FPalaceHelper.semen_fertility_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    public static AlchemyItem heavenly_hash(){
        //selling NPC: N/A
        AlchemyItem aitem = new AlchemyItem("Heavenly Hash Ice Cream");
        aitem.setDroppedDescription("there's a bowl on the ground");
        aitem.setInventoryDescription("This bowl of ice cream smells absolutely heavenly.");
        aitem.setUseDescription("</n> consumes the ice cream.");
        aitem.setImageID(FPalaceHelper.unknown_img);
        aitem.setIdentifyDifficulty(15);
        aitem.add_change_effect(FPalace_races.race_angel());
        aitem.add_effect(FPalaceHelper.curr_hp_id, 5);
        aitem.add_effect(FPalaceHelper.curr_fatigue_id, 5);
        aitem.add_effect(FPalaceHelper.lust_id, -25);
        
        aitem.add_type(FPalaceHelper.curr_fatigue_id);
        aitem.add_type(FPalaceHelper.curr_hp_id);
        aitem.add_type(-FPalaceHelper.lust_id);
        
        aitem.add_type(FPalaceHelper.cha_id);
        aitem.add_type(-FPalaceHelper.sex_appeal_id);
        
        aitem.add_type(FPalaceHelper.skin_colour_id);
        aitem.add_type(-FPalaceHelper.scale_colour_id);
        aitem.add_type(-FPalaceHelper.vaginal_width_id);
        
        aitem.setValue(20);
        return aitem;
    }
    
    //EQUIPMENT
    
        //HEAD
    public static Equipment bronze_salet(){
        //selling NPC: mensch_smith
        Equipment equip = new Equipment("Bronze Sallet");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_crafting_requirement(bronze(),2);			
        
        equip.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.pierce_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.bludg_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.add_upgrade_slot(Upgrade_Item.upgrade_plates);
        equip.setDroppedDescription("a helmet is laying on the ground");
        equip.setInventoryDescription("This helmet looks to cover the entire face, with one long slim eyeslit.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"A Bronze Sallet is completely covering </noun> head. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hair_slot,"");
        equip.new_cover_slot(FPalaceHelper.hair_slot,"</noun> <sd/"+FPalaceHelper.hair_colour_id+"> hair flows from the bottom of </noun> sallet. ",FPalaceHelper.hair_length_id, 12);
        equip.new_cover_image(FPalaceHelper.hair_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.horn_slot,"");
        equip.new_cover_image(FPalaceHelper.horn_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        
        equip.add_effect(FPalaceHelper.con_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,3);
        
        equip.setValue(21);
        equip.setWeight(5);
        return equip;
    }
    
    public static Equipment shy_mask(){
        //selling NPC: correction_office_shopkeeper
        Equipment equip = new Equipment("Shy mask");
        equip.add_crafting_requirement(wood(),2);
        equip.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.pierce_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.bludg_damage_type().get_id());
        equip.setDroppedDescription("a mask is laying on the ground");
        equip.setInventoryDescription("This mask completely covers the entire face, with only two black eyes that almost appear painted on.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"A mask is completely covering </noun> face, only two painted black eyes visible on the white surface. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.eyes_slot,"");
        equip.new_cover_image(FPalaceHelper.eyes_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(25);
        
        equip.add_effect(FPalaceHelper.max_hp_id,3);
        equip.add_effect(FPalaceHelper.sex_appeal_id,-5);
        
        equip.setValue(11);
        equip.setWeight(1);
        return equip;
    }
        
    public static Equipment gold_medallion(){
        //selling NPC: benevol_jeweller
        Equipment equip = new Equipment("Gold Medallion");
        equip.add_crafting_requirement(gold_bar(),1);
        equip.setDroppedDescription("a medallion is lying on the ground");
        equip.setInventoryDescription("A round hunk of gold with a crest on it.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_show_other_cover();
        equip.new_equip_slot(FPalaceHelper.head_slot, 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"</pronoun> is wearing a gold medallion around </noun> neck. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        
        equip.add_effect(FPalaceHelper.cha_id,1);
                                
        equip.setValue(25);
        return equip;
    }
        
    public static Equipment fancy_pee_cap(){
        //selling NPC: castilla_seamstress
        Equipment equip = new Equipment("Fancy Pee Cap");
        equip.add_crafting_requirement(textiles(),1);
        
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a hat is lying on the ground");
        equip.setInventoryDescription("This Blue and Red hat balloons out from it's brim.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"A Blue and Red ballooning cap is covering </noun> head. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hair_slot,"");
        equip.new_cover_slot(FPalaceHelper.hair_slot,"</noun> <sd/"+FPalaceHelper.hair_colour_id+"> hair flows from the bottom of </noun> cap. ",FPalaceHelper.hair_length_id, 2);
        equip.new_cover_image(FPalaceHelper.hair_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.horn_slot,"");
        equip.new_cover_image(FPalaceHelper.horn_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(20);
        
        equip.add_effect(FPalaceHelper.sex_appeal_id,-1);
        equip.add_effect(FPalaceHelper.dex_id,1);
        equip.add_effect(FPalaceHelper.con_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        
        equip.setValue(9);
        return equip;
    }
    
    public static Equipment baseball_cap(){
        //selling NPC: century_city_shopkeeper
        Equipment equip = new Equipment("Baseball Cap");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a hat is lying on the ground");
        equip.setInventoryDescription("This baseball hat seems to be advertising something in an emroidered emblem on its front.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"A Baseball cap is covering </noun> head. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hair_slot,"");
        equip.new_cover_slot(FPalaceHelper.hair_slot,"</noun> <sd/"+FPalaceHelper.hair_colour_id+"> hair flows from the bottom of </noun> cap. ",FPalaceHelper.hair_length_id, 2);
        equip.new_cover_image(FPalaceHelper.hair_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.horn_slot,"");
        equip.new_cover_image(FPalaceHelper.horn_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(20);
        
        equip.add_effect(FPalaceHelper.sex_appeal_id,-1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        
        equip.setValue(4);
        
        return equip;
    }
        
    public static Equipment cowboy_hat(){
        //selling NPC: freedom_farms_lilly
        Equipment equip = new Equipment("Cowboy Hat");
        equip.add_crafting_requirement(leather(),1);
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a hat is lying on the ground");
        equip.setInventoryDescription("A tough leather hat made for long days in the sun.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"A Cowboy Hat is covering </noun> head. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hair_slot,"");
        equip.new_cover_slot(FPalaceHelper.hair_slot,"</noun> <sd/"+FPalaceHelper.hair_colour_id+"> hair flows from the bottom of </noun> hat. ",FPalaceHelper.hair_length_id, 2);
        equip.new_cover_image(FPalaceHelper.hair_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.horn_slot,"");
        equip.new_cover_image(FPalaceHelper.horn_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(20);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.dex_id,1);
        equip.add_effect(FPalaceHelper.con_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        equip.setValue(15);
        return equip;
    }
        
    public static Equipment silver_circlet(){
        //selling NPC: benevol_jeweller
        Equipment equip = new Equipment("Silver Circlet");
        equip.add_crafting_requirement(silver_bar(),1);
        equip.setDroppedDescription("a Circlet is lying on the ground");
        equip.setInventoryDescription("A gorgeous silver circlet incrusted with a leaf pattern.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_show_other_cover();
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"</pronoun> is wearing a silver circlet incrusted with designs. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(25);
        equip.add_effect(FPalaceHelper.wis_id,2);
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        equip.add_effect(FPalaceHelper.cha_id,2);
        equip.add_effect(FPalaceHelper.dex_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.setValue(37);
        return equip;
    }
    
    public static Equipment goggles(){
        //selling NPC: industria_seamstress
        Equipment equip = new Equipment("Goggles");
        equip.add_crafting_requirement(glass(),1);
        equip.add_crafting_requirement(wood(),1);
        equip.setDroppedDescription("a pair of goggles are lying on the ground");
        equip.setInventoryDescription("A set of goggles, thick and protective of the eyes. Supposedly. ");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot, 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"</noun> eyes are covered by goggles that hook around the back of </noun> head. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_image(FPalaceHelper.eyes_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(15);
        
        equip.add_effect(FPalaceHelper.cha_id,-1);
        equip.add_effect(FPalaceHelper.con_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.setValue(17);
        return equip;
    }
    
    public static Equipment black_rimmed_glasses(){
        //selling NPC: school_store_shopkeeper
        Equipment equip = new Equipment("Black Rimmed Glasses");
        equip.add_crafting_requirement(glass(),1);
        equip.add_crafting_requirement(wood(),1);
        equip.setDroppedDescription("a pair of glasses are lying on the ground");
        equip.setInventoryDescription("A set of Black Rimmed glasses, whose lenses you find to just be flat glass.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot, 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"</noun> eyes are covered by black rimmed glasses that hook around </noun> </rn> ears. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_image(FPalaceHelper.eyes_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(15);
        
        equip.add_effect(FPalaceHelper.cha_id,-1);
        equip.add_effect(FPalaceHelper.int_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.setValue(32);
        return equip;
    }
    
    public static Equipment monocle(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Black Rimmed Glasses");
        equip.add_crafting_requirement(glass(),1);
        equip.add_crafting_requirement(gold_bar(),1);
        equip.setDroppedDescription("a pair of glasses are lying on the ground");
        equip.setInventoryDescription("A single monocle, with accompanying length of chain.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.eyes_slot, 1);
        equip.new_cover_slot(FPalaceHelper.eyes_slot,"one of </noun> eyes is covered by a monocle </pronoun> is squinting to keep in place. ");
        equip.new_cover_image(FPalaceHelper.eyes_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(15);
        
        equip.add_effect(FPalaceHelper.cha_id,2);
        equip.add_effect(FPalaceHelper.int_id,-1);
        
        equip.setValue(45);
        return equip;
    }
    
    public static Equipment red_lipstick(){
        //selling NPC: fpalace_shopkeeper
        Equipment equip = new Equipment("Red Lipstick");
        equip.setDroppedDescription("a stick of lipstick is on the ground");
        equip.setInventoryDescription("A stick of lipstick that extends when you twirl the base.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_show_other_cover();
        equip.new_equip_slot(FPalaceHelper.head_slot, 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"</noun> </rn> lips are a bright shade of red. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(10);
        
        equip.add_effect(FPalaceHelper.cha_id,1);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
                    
        equip.setValue(5);
        return equip;
    }
        
    public static Equipment bunny_ears(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Bunny Ears");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_crafting_requirement(silk(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a set of novelty ears are on the ground");
        equip.setInventoryDescription("This set of novelty ears looks uncomfortable, but sexy.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot , 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"At first glance </pronoun> appears to have bunny ears, but you quickly see the plastic strap holding </noun> hair back, exposing </noun> </rn> ears. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        
        
        equip.add_effect(FPalaceHelper.wis_id,-1);
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        equip.add_effect(FPalaceHelper.cha_id,2);
        equip.add_effect(FPalaceHelper.con_id,-1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        equip.setValue(22);
        return equip;
    }
    
    public static Equipment sunglasses(){
        //selling NPC: century_city_shopkeeper
        Equipment equip = new Equipment("Sunglasses");
        equip.add_crafting_requirement(glass(),1);
        equip.add_crafting_requirement(wood(),1);
        equip.setDroppedDescription("a pair of glasses are lying on the ground");
        equip.setInventoryDescription("The lenses in these glasses are nearly pitch black.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot, 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"</noun> eyes are covered by sunglasses that hook around </noun> </rn> ears. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.eyes_slot,"");
        equip.new_cover_image(FPalaceHelper.eyes_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(15);
        equip.add_effect(FPalaceHelper.cha_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.set_skill_bonus(FPalace_skills.perception_id, -5);
        
        equip.setValue(12);
        return equip;
    }
    
    public static Equipment blue_surgical_mask(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Surgical Mask");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a face-mask is on the ground here");
        equip.setInventoryDescription("This blue surgical mask is somewhat inhuman looking, but would probably protect from disease.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.head_slot, 1);
        equip.new_cover_slot(FPalaceHelper.head_slot,"Most of </noun> face is covered by a blue surgical mask that hook around </noun> </rn> ears with white elastic bands. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(10);
        equip.add_effect(FPalaceHelper.cha_id,-1);
        equip.add_effect(FPalaceHelper.con_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.setValue(12);
        return equip;
    }
    
        //HAIR
    public static Equipment rapunzels_ribbon(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Ribbon");
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a piece of silk is on the ground");
        equip.setInventoryDescription("This ribbon looks funtional and sexy.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.hair_slot , 1);
        equip.new_cover_slot(FPalaceHelper.hair_slot,"</pronoun> is wearing a ribbon that pulls her </noun> hair back, exposing </noun> </rn> ears. ");
        equip.new_cover_image(FPalaceHelper.head_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        equip.add_effect(FPalaceHelper.cha_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.hair_length_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.rapunzels_ribbon_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.hair_length_id,1, "", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.rapunzels_ribbon_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);
        return equip;
    }
        
        //TORSO
    public static Equipment spandex_suit(){
        //selling NPC: century_city_clothing_store_clerk			
        Equipment equip = new Equipment("Spandex suit");
        equip.add_crafting_requirement(plastics(),2);
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a piece of plastic is on the ground");
        equip.setInventoryDescription("This looks like a skintight spandex suit.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 4);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 5);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a skin tight spandex suit. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a skin tight spandex suit that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);			
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"the top of </noun> spandex buldges slightly from </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The spandex is struggling to contain </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"The lower half of </noun> spandex is being stretched as </noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock knocks it about. ",FPalaceHelper.penis_length_id, 12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"");
        equip.new_cover_image(FPalaceHelper.hips_id,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(10);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.set_skill_bonus(FPalace_skills.covert_id, -1);
        
        equip.setValue(10);
        equip.setWeight(1);
        return equip;
    }
    
    public static Equipment bronze_breastplate(){
        //selling NPC: mensch_smith
        Equipment equip = new Equipment("Bronze Breastplate");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_crafting_requirement(bronze(),6);
        equip.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.pierce_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.bludg_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.add_upgrade_slot(Upgrade_Item.upgrade_plates);
        equip.setDroppedDescription("a breastplate is on the ground");
        equip.setInventoryDescription("A bronze breastplate, with pectorals pounded out but worn from use.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 4);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 2);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a bronze breastplate. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The breastplate can't contain </noun> breasts, and </n> can see them trying to escape from the top. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(10);
        equip.add_effect(FPalaceHelper.max_hp_id,10);
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(35);
        equip.setWeight(25);
        return equip;
    }
    
    public static Equipment red_tunic(){
        //selling NPC: ahimsa_seamstress
        Equipment equip = new Equipment("Red Tunic");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a tunic is on the ground");
        equip.setInventoryDescription("A bright red shirt that extends down to mid thigh.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 4);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 3);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a tight red tunic. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a tight red tunic that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"the top of </noun> tunic has some small bumps in it where </noun> breasts push against it. ",-1,0,0,1);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The tunic can't contain </noun> breasts, and it looks as though it is starting to fray around </noun> <sd/"+FPalaceHelper.breast_size_id+"> mounds. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The tunic is stretched at the stomach, barely containing </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> cock hangs past the bottom edge of </noun> tunic. ",FPalaceHelper.penis_length_id, 7);
        equip.new_cover_image(FPalaceHelper.cock_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(15);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,3);
        
        equip.setValue(18);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment blue_apron(){
        //selling NPC: castilla_seamstress
        Equipment equip = new Equipment("Blue Apron");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("an apron is on the ground");
        equip.setInventoryDescription("A light blue apron that extends down to mid thigh.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a light blue apron. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a light blue apron that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"the top of </noun> apron has some small bumps in it where </noun> breasts push against it. ",-1,0,0,1);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The apron can't contain </noun> breasts, and it looks as though </noun> </sd"+FPalaceHelper.breast_size_id+"> mounds are ready to leap from its top. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The apron is disdends at the stomach, </noun> udder causing it to jut away from the rest of </objnoun>. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> </sd"+FPalaceHelper.penis_length_id+"> cock hangs past the bottom edge of </noun> apron. ",FPalaceHelper.penis_length_id, 7);
        equip.new_cover_image(FPalaceHelper.cock_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot, Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(10);
        equip.add_effect(FPalaceHelper.max_hp_id,3);
        
        equip.setValue(11);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment maternity_bra(){
        //selling NPC: nunnery_shopkeeper
        Equipment equip = new Equipment("Maternity Bra");
        equip.setDroppedDescription("a bra is on the ground");
        equip.setInventoryDescription("A classy red bra.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 5);
        equip.new_equip_slot(FPalaceHelper.torso_slot);
        
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a frumpy maternity bra. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A maternity is pressing </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts together and in place as they proudly pressing against the white fabric. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> maternity bra is overflowing with flesh as </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts burst around the constricting edges and straps. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(17);
        equip.add_effect(FPalaceHelper.sex_appeal_id,-2);
        equip.add_effect(FPalaceHelper.max_weight_id,3);
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.milk_volume_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.maternity_bra_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.milk_volume_id,50, "", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.maternity_bra_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);
        
        return equip;
    }
    
    public static Equipment training_bra(){
        //selling NPC: 
        Equipment equip = new Equipment("Training Bra");
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a bra is on the ground");
        equip.setInventoryDescription("A bra with large padded inserts.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 5);
        equip.new_equip_slot(FPalaceHelper.torso_slot);
        
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a training bra. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A training bra is pressing </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts together and in place as they proudly pressing against the white fabric. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> training bra is overflowing with flesh as </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts burst around the constricting edges and straps. ",FPalaceHelper.breast_size_id,2);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(17);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.breast_size_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,2);
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.breast_size_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.training_bra_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.breast_size_id,0.1, "", 0);
        c2.addConsequence(FPalaceHelper.lust_id,10, "", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.training_bra_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);
        return equip;
    }
        
    public static Equipment red_bra(){
        //selling NPC: lux_invira_lingerie
        Equipment equip = new Equipment("Red Bra");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_crafting_requirement(silk(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a bra is on the ground");
        equip.setInventoryDescription("A classy red bra.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 5);
        equip.new_equip_slot(FPalaceHelper.torso_slot);
        
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a classy red bra. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A red bra is pressing </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts together and in place as they proudly pressing against the red fabric. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> red bra is overflowing with flesh as </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts burst around the constricting edges and straps. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(17);
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,3);
        equip.setValue(30);
        return equip;
    }
    
    public static Equipment pushup_bra(){
        //selling NPC: lux_invira_lingerie
        Equipment equip = new Equipment("Pushup Bra");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_crafting_requirement(silk(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a bra is on the ground");
        equip.setInventoryDescription("A bra with large padded inserts.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 4);
        equip.new_equip_slot(FPalaceHelper.torso_slot);
        
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a pushup bra. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A pushup bra is pressing </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts together and in place as they proudly pressing against the red fabric. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> pushup bra is overflowing with flesh as </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts burst around the constricting edges and straps. ",FPalaceHelper.breast_size_id,2);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(17);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.breast_size_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,2);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        equip.setValue(23);
        return equip;
    }
        
    public static Equipment dirty_haltertop(){
        //selling NPC: equine_encampment_shopkeeper
        Equipment equip = new Equipment("Dirty haltertop");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("This stained and dirty haltertop looks like it might have been white once.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 7);
        equip.new_equip_slot(FPalaceHelper.torso_slot ,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a stained and dirty haltertop. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The haltertop is barely covering </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts, glimpses of them appearing as the loose fabric moves. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> dirty haltertop doesn't cover </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts at all, as they squeeze and tear at the fabric. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(13);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.setValue(12);
        return equip;
    }
    
    public static Equipment leather_tube_top(){
        //selling NPC: lux_invira_shopkeeper
        Equipment equip = new Equipment("Leather tube top");
        equip.add_crafting_requirement(leather(),2);
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A leather tube top made of animal skins.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 6);
        equip.new_equip_slot(FPalaceHelper.breasts_slot);
        equip.new_equip_slot(FPalaceHelper.torso_slot ,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a rough cut leather tube-top. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A rough cut leather tube top is tauntly holding </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts steady and in place as they proudly press against the fabric. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> rough cut leather tube top is visibly stretched, wavy lines apparent between </noun> </sd"+FPalaceHelper.breast_size_id+"> breasts. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(12);
        return equip;
    }
    
    public static Equipment Blue_silk_shirt(){
        //selling NPC: industria_seamstress
        Equipment equip = new Equipment("Blue Silk Shirt");
        equip.add_crafting_requirement(silk(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A blue silk shirt thats smooth fabric doesn't stretch, no matter how hard you pull.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 5);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 3);
        equip.new_equip_slot(FPalaceHelper.torso_slot ,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a blue silk shirt. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a blue silk shirt that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"There are barely noticible bumps in the chest of </noun> blue silk shirt. ",FPalaceHelper.breast_size_id, 1);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> blue silk shirt is lifted from </noun> chest by </sd"+FPalaceHelper.breast_size_id+"> breasts, sensually falling back to follow </noun> curves. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The shirt is stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(11);
        equip.add_effect(FPalaceHelper.max_hp_id,3);

        equip.setValue(31);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment black_tshirt(){
        //selling NPC: century_city_clothing_store_clerk
        Equipment equip = new Equipment("Black T-shirt");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A black t-shirt. You half expect there to be some sort of colourful design on the front, but find it conspiciously absent.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 10);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 7);
        equip.new_equip_slot(FPalaceHelper.torso_slot ,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a black t-shirt. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a black t-shirt that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A black t-shirt is tauntly holding </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts steady and in place as they do their best to be visible. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> black t-shirt is visibly stretched, wavy lines apparent between </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts as they visibly stretch </noun> t-shirt. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The shirt is stretched at the stomach by </noun> udder. ");
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.max_hp_id,2);

        equip.setValue(11);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment white_tshirt(){
        //selling NPC: century_city_clothing_store_clerk
        Equipment equip = new Equipment("White T-shirt");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A plain white t-shirt, with short sleaves, and stretchy fabric.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 15);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 8);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a white t-shirt. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a white t-shirt that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The white t-shirt is pressed out by </noun> <sd/"+FPalaceHelper.breast_size_id+"> breast. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> white t-shirt is visibly stretched, wavy lines apparent between </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts as they desperately try to break free. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"</noun> nipples are clearly visible through the white material of </noun> shirt. ");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The shirt is stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(16);
        return equip;
    }
    
    public static Equipment white_blouse(){
        //selling NPC: castilla_seamstress
        Equipment equip = new Equipment("White Blouse");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A starched white blouse, with a button up front.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 6);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 6);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a white blouse. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a white blouse that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A white blouse is tauntly holding </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts as they gently jut from either side of the buttons. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> white blouse is visibly stretched, the buttons fighting against </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"</noun> nipples are clearly visible through the white material of </noun> shirt. ", FPalaceHelper.nipple_size_id, 1);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The blouses buttons struggle to contain </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(16);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment white_dress_shirt(){
        //selling NPC: castilla_seamstress
        Equipment equip = new Equipment("White Dress Shirt");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A starched white shirt, with a button up front.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 15);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 15);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a white dress shirt. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a white dress shirt that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A white dress shirt is tauntly holding </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts as they gently jut from either side of the buttons. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> white dress shirt is visibly stretched, the buttons fighting against </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"</noun> nipples are clearly visible through the white material of </noun> shirt. ", FPalaceHelper.nipple_size_id, 1);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The dress shirts buttons struggle to contain </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(16);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment plaid_blazer(){
        //selling NPC: school_store_shopkeeper
        Equipment equip = new Equipment("Plaid Blazer");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A plaid blazer, like those a student at a private school would wear.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 15);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 15);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a plaid blazer. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a plaid blazer that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A plaid blazer is tauntly holding </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts as they gently jut from either side of the buttons. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> plaid blazer is visibly stretched, the buttons fighting against </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"</noun> nipples are clearly visible through the white material of </noun> blazer. ", FPalaceHelper.nipple_size_id, 1);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The blazer is stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(11);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment blue_scrub_top(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Scrubs top");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a shirt is on the ground");
        equip.setInventoryDescription("A solid blue top that is surprisingly form fitting.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 10);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 10);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.new_equip_slot(FPalaceHelper.arms_slot ,2);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a blue scrub shirt. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a blue scrub shirt that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A blue scrub shirt is barely disturbed by </noun> <sd/"+FPalaceHelper.breast_size_id+"> breast. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> blue scrub shirt is visibly stretched, wavy lines apparent between </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts as they do their best to escape the constricting garment. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"</noun> nipples are clearly visible through the blue material of </noun> shirt. ");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The scrubs are stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(16);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(16);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment black_leather_jacket(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Black Leather Jacket");
        equip.add_crafting_requirement(leather(),4);
        equip.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a Jacket is on the ground");
        equip.setInventoryDescription("This Black Leather Jacket is the sort you'd expect to find on a biker.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.arms_slot,2);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a black leather jacket. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a black leather jacket that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"A black leather jacket is closed and shows only the briefest hint of what is underneath. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> black leather jacket has been pushed open by </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(19);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        equip.setValue(22);
        equip.setWeight(5);
        return equip;
    }
    
    public static Equipment Red_fur_overcoat(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Fur Overcoat");
        equip.add_crafting_requirement(textiles(),8);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.show_other_cover();
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a robe is on the ground here");
        equip.setInventoryDescription("A gorgeous fur overcoat that screams \"Money\"");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a rich, and warm, looking red fur overcoat. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a rich, warm looking red fur overcoat that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"the top of </noun> robe is tightly drawn, but the bulge of </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts is never the less evident. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The robe can't contain </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts, and the edges of </noun> areola are showing from </noun> orbs shoving out from the rest of </noun>. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are completely bare to the world despite </noun> robe. ",FPalaceHelper.breast_size_id,6);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"and are capped by <sd/"+FPalaceHelper.nipple_size_id+"> nipples. ",FPalaceHelper.breast_size_id,15);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"The lower half of </noun> robe is being torn assunder as </noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock knocks it about. ",FPalaceHelper.penis_length_id, 12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"");
        equip.new_cover_image(FPalaceHelper.hips_id,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(13);
        equip.add_effect(FPalaceHelper.max_hp_id,7);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(19);
        equip.setWeight(10);
        return equip;
    }
    
    public static Equipment robe(){
        //selling NPC: FPalace_guardian
        Equipment equip = new Equipment("Robe");
        equip.add_crafting_requirement(textiles(),8);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a robe is on the ground here");
        equip.setInventoryDescription("Just a standard white bathrobe, with fluffy white trim.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a loose fitting robe. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a loose fitting robe that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"the top of </noun> robe is tightly drawn, but </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts do their best to be noticed. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The robe can't contain </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts, and the edges of </noun> areola are showing from </noun> orbs shoving out from the rest of </noun>. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are completely bare to the world despite </noun> robe. ",FPalaceHelper.breast_size_id,6);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"and are capped by <sd/"+FPalaceHelper.nipple_size_id+"> nipples. ",FPalaceHelper.breast_size_id,15);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"The lower half of </noun> robe is being torn assunder as </noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock knocks it about. ",FPalaceHelper.penis_length_id, 12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(16);
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(25);
        equip.setWeight(5);
        return equip;
    }
    
    public static Equipment habit(){
        //selling NPC: nunnery_shopkeeper
        Equipment equip = new Equipment("Nuns habit");
        equip.add_crafting_requirement(textiles(),8);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a robe is on the ground here");
        equip.setInventoryDescription("This is a nuns habit, intended to hide the form of the wearer. ");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a loose fitting habit that gives no hint to </noun> form. ");
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"");
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(16);
        equip.add_effect(FPalaceHelper.sex_appeal_id,-2);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(5);
        equip.setWeight(5);
        return equip;
    }
    
    public static Equipment bloody_lab_coat(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Lab coat");
        equip.add_crafting_requirement(textiles(),6);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a coat is on the ground here.");
        equip.setInventoryDescription("This long coat has a disquieting amount of blood on it.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a lab coat with a disquieting amount of blood on it. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a lab coat with a disquieting amount of blood on it. The coat disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        //this one needs to be variable dependent on the stat; - this works
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"the top of </noun> lab coat is tightly drawn, but </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are doing their best to open it. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The lab coat can't contain </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts, and the edges of </noun> areola are showing from </noun> orbs shoving out from the rest of </noun>. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are completely bare to the world despite </noun> lab coat. ",FPalaceHelper.breast_size_id,6);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"and are capped by<sd/"+FPalaceHelper.nipple_size_id+"> nipples. ",FPalaceHelper.breast_size_id,15);
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"The lower half of </noun> lab coat is being knocked about as </noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock flaps about. ",FPalaceHelper.penis_length_id, 12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(18);
        equip.add_effect(FPalaceHelper.sex_appeal_id,-1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        
        equip.setValue(9);
        equip.setWeight(5);
        
        return equip;
    }
    
    public static Equipment prosperous_one_piece(){
        //selling NPC: N/A
        Equipment equip = new Equipment("One Piece Bathing Suit");
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a leotard is on the ground");
        equip.setInventoryDescription("A tight fitting leotard like one would use for bathing.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a nearly skin-tight blue leotard. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a nearly skin-tight blue leotard that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are trying as they jut out from the rest of </noun> chest. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"</noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are barely contained by the garment. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The suit is stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"In the crotch there is a bulge clearly indicating the presence of male genitalia. ");
        equip.new_cover_slot(FPalaceHelper.cock_slot,"There is a <sd/"+FPalaceHelper.penis_length_id+"> bulge in the fabric jutting from </noun> nether regions. ",FPalaceHelper.penis_length_id, 8);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> scrotum is clearly trying to escape from the outfit, each orb struggling seperately. ");
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(19);
        equip.add_effect(FPalaceHelper.sex_appeal_id,4);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        equip.add_effect(FPalaceHelper.max_weight_id,4);
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.bust_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.one_piece_status);
        Challenge chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.bust_id);
        chall.set_defense_stat(-1, 36);
        chall.setVariability(0);
        Consequence c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(0.2);
        c2.addConsequence(FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.bust_id,Consequence.amt_from_roll_const, "", -1);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2,chall);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.waist_id);
        chall.set_defense_stat(-1, 24);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(0.2);
        c2.addConsequence(FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.waist_id,Consequence.amt_from_roll_const, "", -1);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2,chall);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.hips_id);
        chall.set_defense_stat(-1, 36);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(0.2);
        c2.addConsequence(FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.hips_id,Consequence.amt_from_roll_const, "", -1);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2,chall);
        
        chall = new Challenge();
        chall.set_attack_stat(FPalaceHelper.breast_size_id);
        chall.set_defense_stat(-1, 4.9);
        chall.setVariability(0);
        c2 = new Consequence();
        c2.amt_by_roll_flag();
        c2.set_max_damage(0.2);
        c2.addConsequence(FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", 0);
        c2.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "", -1);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2,chall);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.one_piece_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);			
        equip.setWeight(5);
        
        return equip;
    }
    
    public static Equipment bunny_suit(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Bunny suit");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a leotard is on the ground");
        equip.setInventoryDescription("A tight fitting leotard with a large white ball of fluff where ones bum would end up.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 22);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 12);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 12);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a nearly skin-tight red leotard with a large fluffy bulge on top of </noun> ass. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a nearly skin-tight red leotard with a large fluffy bulge on top of </noun> ass. The leotard disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"You can see a teardrop of flesh where the leotard is cut out for a much better endowed woman, though </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are trying as they jut out from the rest of </noun> chest. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"There is a cavern of cleavage in the leotards teardrop opening, and </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are barely contained by the garment. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The suit is stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"In the crotch there is a bulge clearly indicating the presence of male genitalia. ");
        equip.new_cover_slot(FPalaceHelper.cock_slot,"There is a <sd/"+FPalaceHelper.penis_length_id+"> bulge in the fabric jutting from </noun> nether regions. ",FPalaceHelper.penis_length_id, 8);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> scrotum is clearly trying to escape from the outfit, each orb struggling seperately. ");
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(19);
        equip.add_effect(FPalaceHelper.sex_appeal_id,4);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        equip.add_effect(FPalaceHelper.max_weight_id,4);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
                    
        equip.setValue(40);
        equip.setWeight(5);
        
        return equip;
    }
    
    public static Equipment brown_elvish_gown(){
        //selling NPC: ahimsa_seamstress
        Equipment equip = new Equipment("Brown Elvish Gown");
        equip.add_crafting_requirement(textiles(),10);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a dress is on the ground");
        equip.setInventoryDescription("This full length brown gown has woodland patterns in greens highlighting it.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 8);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 8);
        equip.new_equip_slot(FPalaceHelper.torso_slot,1);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a flowing full length brown gown with patterns of the forest inlaid in stitch. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a flowing full length brown gown with patterns of the forest inlaid in stitch that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"There is a slight bump in the gown as </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts press out from the rest of </noun> chest. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"There is a huge mound where </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts are barely contained by the gown. ",FPalaceHelper.breast_size_id,3);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The gown is stretched at the stomach by </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"The gown has a <sd/"+FPalaceHelper.penis_length_id+"> buldge in </noun> nether regions. ",FPalaceHelper.penis_length_id, 14);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"Twin <sd/"+FPalaceHelper.balls_size_id+"> orbs seem to be knocking about </noun> knees. ", 10);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\nThe curve of </noun> body shows as </noun> </"+FPalaceHelper.hips_id+"> inch hips show in the gown. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.arms_slot,"");
        equip.new_cover_image(FPalaceHelper.arms_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(21);
        equip.add_effect(FPalaceHelper.sex_appeal_id,3);
        equip.add_effect(FPalaceHelper.max_hp_id,10);
                    
        equip.setValue(38);
        equip.setWeight(5);
        
        return equip;
    }
        
        //ARMS
        
        //HANDS
        
    public static Equipment bronze_gauntlets(){
        //selling NPC: mensch_smith
        Equipment equip = new Equipment("bronze gauntlets");
        equip.add_crafting_requirement(bronze(),1);
        equip.add_crafting_requirement(leather(),1);
        equip.setDroppedDescription("some gauntlets are on the ground");
        equip.setInventoryDescription("A set of solid bronze gauntlets made to protect the hands.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.hands_slot,2);

        equip.new_cover_slot(FPalaceHelper.hands_slot,"</pronoun> is wearing bronze gauntlets on </noun> </bpn>. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.hands_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(11);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        equip.setValue(13);
        
        return equip;
    }
        
    public static Equipment gold_ring(){
        //selling NPC: benevol_jeweller
        Equipment equip = new Equipment("Gold Ring");
        equip.add_crafting_requirement(gold_bar(),1);
        equip.setDroppedDescription("a ring is on the ground");
        equip.setInventoryDescription("A solid golden ring. Nothing suspicious about that.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.hands_slot,1);

        equip.new_cover_slot(FPalaceHelper.hands_slot,"</pronoun> is wearing a gold ring on </noun> </bpn>. ",-1,0,1);
        equip.new_cover_image(FPalaceHelper.hands_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(11);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.wis_id,2);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        equip.setValue(33);
        return equip;
    }
    
    public static Equipment hermpire_ring(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Golden Woman Ring");
        equip.setDroppedDescription("a ring is on the ground");
        equip.setInventoryDescription("A solid golden ring, made to look like a woman bending over backwards and grabbing her feet. There is a barely perceptable bulge in her robes at the groin.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.hands_slot,1);

        equip.new_cover_slot(FPalaceHelper.hands_slot,"</pronoun> is wearing a gold ring on </noun> </bpn>. ",-1,0,1);
        equip.new_cover_image(FPalaceHelper.hands_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(15);
        equip.add_effect(FPalaceHelper.sex_appeal_id,4);
        equip.add_effect(FPalaceHelper.min_lust_id,15);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        a.set_impreg_action();
        a.set_consume_action();
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.penis_length_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        tef_con.set_change_on_success();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0, 0, 0, 1);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "\n</n> struggles to keep </noun> feet as </noun> stomach gurgles, and a pungent smell escapes </noun> lips. </pronoun> itches at </noun> groin. ", -1, 0, 0, 1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1, 0, 0, 3);
        tef_con.add_change_effect(FPalaceHelper.new_penis(null,3,1));
        tef_con.add_change_effect(FPalaceHelper.new_balls(null));
        tef_con.add_change_effect(a,FPalaceHelper.cum_volume_id);
        tef_con.add_change_effect(a,FPalaceHelper.milk_volume_id);
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//1
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.breasts_slot,true);
        tef_chall.set_attack_stat(-1, 0);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0, 0, 0, 2);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "\n</n> struggles to keep </noun> feet as </noun> stomach gurgles, and a pungent smell escapes </noun> lips. </pronoun> itches at </noun> chest. ", -1, 0, 0, 2);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1, 0, 0, 3);
        tef_con.add_change_effect(FPalaceHelper.new_breasts(null,1));
        tef_con.add_change_effect(a,FPalaceHelper.cum_volume_id);
        tef_con.add_change_effect(a,FPalaceHelper.milk_volume_id);
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//2
        tef_chall.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "\n</n> struggles to keep </noun> feet as </noun> stomach gurgles, and a pungent smell escapes </noun> lips. </pronoun> itches at </noun> groin. ", -1, 0, 0, 3);
        tef_con.add_change_effect(FPalaceHelper.new_vagina(null));
        tef_con.add_change_effect(FPalaceHelper.new_clit(null));
        tef_con.add_change_effect(a,FPalaceHelper.cum_volume_id);
        tef_con.add_change_effect(a,FPalaceHelper.milk_volume_id);
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//3
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.cum_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(250.0)});
        tef_con.set_max_damage(5);
        tef_con.addConsequence(-FPalaceHelper.penis_girth_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,4);
        
        //no cum... must be milk instead
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,7);
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//4
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.cum_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(83.0)});
        tef_con.set_max_damage(15);
        tef_con.addConsequence(-FPalaceHelper.penis_length_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,5);
                    
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//5
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.cum_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(250.0)});
        tef_con.set_max_damage(5);
        tef_con.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(-FPalaceHelper.balls_size_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,6);
                    
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//6
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.cum_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(2.0)});
        tef_con.set_max_damage(4000);
        tef_con.addConsequence(-FPalaceHelper.cum_volume_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(-FPalaceHelper.milk_volume_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,0);
                    
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//7
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.milk_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(250.0)});
        tef_con.set_max_damage(5);
        tef_con.addConsequence(-FPalaceHelper.penis_girth_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,8);
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//8
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.milk_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(83.0)});
        tef_con.set_max_damage(15);
        tef_con.addConsequence(-FPalaceHelper.penis_length_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,9);
                    
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//9
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.milk_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(250.0)});
        tef_con.set_max_damage(5);
        tef_con.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(-FPalaceHelper.balls_size_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,10);
                    
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();//10
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.milk_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(2.0)});
        tef_con.set_max_damage(4000);
        tef_con.addConsequence(-FPalaceHelper.cum_volume_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(-FPalaceHelper.milk_volume_id,Consequence.amt_from_roll_const, "\n", -1);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1,0,0,0);
                    
        a.addChallenge(tef_chall, tef_con);
        
        
        equip.new_stat_action(FPalaceHelper.cum_volume_id, a);
        equip.new_stat_action(FPalaceHelper.milk_volume_id, a);
        
        equip.add_action(a);
        
        equip.setValue(500);
        return equip;
    }
    
    //COCK
    public static Equipment be_cock_ring(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Large Silver Ring");
        equip.setDroppedDescription("a ring is on the ground");
        equip.setInventoryDescription("A solid silver ring, far too large for a finger. There are strange circles engraved on every surface.");
        equip.setImageID(FPalaceHelper.unknown_img);
        
        equip.new_equip_slot(FPalaceHelper.cock_slot,1);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</pronoun> is wearing a silver ring around the base of </noun> <sd/"+FPalaceHelper.penis_length_id+"> </"+FPalaceHelper.penis_length_id+">-inch long, <sd/"+FPalaceHelper.penis_girth_id+"> sized </"+FPalaceHelper.penis_girth_id+">-inch </bpn> that is </r>",FPalaceHelper.penis_length_id,0,1);
        equip.new_cover_image(FPalaceHelper.cock_slot,FPalaceHelper.unknown_img);
        
        equip.add_effect(FPalaceHelper.con_id,4);
        equip.add_effect(FPalaceHelper.cum_volume_id,6);
        
        equip.setIdentifyDifficulty(15);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        a.set_consume_action();
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.breast_size_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0, 0, 0, 1);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "\n</n> struggles to keep </noun> feet as </noun> stomach gurgles, and a pungent smell escapes </noun> lips. </pronoun> itches at </noun> chest. ", -1, 0, 0, 1);
        tef_con.add_change_effect(FPalaceHelper.new_breasts(null,1));
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.cum_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag(new String[]{"r", "/", Double.toString(250.0)});
        tef_con.set_max_damage(5);
        tef_con.addConsequence(-FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "\n", -1,0,0,2);
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(FPalaceHelper.cum_volume_id);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.amt_by_roll_flag();
        tef_con.set_max_damage(4000);
        tef_con.addConsequence(-FPalaceHelper.milk_volume_id,Consequence.amt_from_roll_const, "\n", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        
        
        equip.new_stat_action(FPalaceHelper.cum_volume_id, a);
        
        equip.setValue(200);
        return equip;
    }
    
    public static Equipment queens_cock_ring(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Large Gold Ring");
        equip.setDroppedDescription("a ring is on the ground");
        equip.setInventoryDescription("A solid gold ring, far too large for a finger. There are strange triangles engraved on every surface.");
        equip.setImageID(FPalaceHelper.unknown_img);
        
        equip.new_equip_slot(FPalaceHelper.cock_slot,1);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</pronoun> is wearing a gold ring around the base of </noun> <sd/"+FPalaceHelper.penis_length_id+"> </"+FPalaceHelper.penis_length_id+">-inch long, <sd/"+FPalaceHelper.penis_girth_id+"> sized </"+FPalaceHelper.penis_girth_id+">-inch </bpn> that is </r>",FPalaceHelper.penis_length_id,0,1);
        equip.new_cover_image(FPalaceHelper.cock_slot,FPalaceHelper.unknown_img);
        
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        
        equip.setIdentifyDifficulty(15);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        a.set_extract_action();
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(-1,1);
        tef_chall.set_defense_stat(-1,0);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();
        tef_con.addConsequence(FPalaceHelper.height_id,10, "", 0);
        tef_con.addConsequence(FPalaceHelper.bust_id,5, "", 0);
        tef_con.addConsequence(FPalaceHelper.waist_id,3, "", 0);
        tef_con.addConsequence(FPalaceHelper.hips_id,5, "", 0);
        tef_con.addConsequence(FPalaceHelper.str_id,0.25, "", 0);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.new_stat_action(FPalaceHelper.cum_volume_id, a);
        
        equip.setValue(200);
        return equip;
    }
        
    //LEGS
    public static Equipment girdle_masculin_feminin(){
        Equipment equip = new Equipment("Girdle");
        equip.setDroppedDescription("a belt is on the ground");
        equip.setInventoryDescription("A thick belt made to fit around the waist. ");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a girdle. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.set_skill_bonus(FPalace_skills.covert_id, -1);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.cock_slot,true);//tef_chall.set_attack_stat(FPalaceHelper.penis_length_id);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.add_change_effect(FPalaceHelper.new_penis(null));
        tef_con.addConsequence(0,0, "", 0,0,0,1);
        tef_con.addConsequence(0,0, "", -1);//add penis
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.cock_slot,true);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,-100, "", 0,0,0,-1,false,null, FPalaceHelper.cock_slot);//remove penis
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        equip.add_remove_action(a);
        
        a = new CharAction();
        a.set_dialogue("",0);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.balls_slot,true);//tef_chall.set_attack_stat(FPalaceHelper.balls_size_id);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.add_change_effect(FPalaceHelper.new_balls(null));
        tef_con.addConsequence(0,0, "", 0,0,0,1);
        tef_con.addConsequence(0,0, "", -1);//add balls
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.balls_slot,true);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,-100, "", 0,0,0,-1,false,null, FPalaceHelper.balls_slot);//remove penis
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        equip.add_remove_action(a);
        
        a = new CharAction();
        a.set_dialogue("",0);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.breasts_slot,true);//tef_chall.set_attack_stat(FPalaceHelper.breast_size_id);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.add_change_effect(FPalaceHelper.new_breasts(null));
        tef_con.addConsequence(0,0, "", 0,0,0,1);
        tef_con.addConsequence(0,0, "", -1);//add breasts
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.breasts_slot,true);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,-100, "", 0,0,0,-1,false,null, FPalaceHelper.breasts_slot);//remove breasts
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        equip.add_remove_action(a);
        
        a = new CharAction();
        a.set_dialogue("",0);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.vag_slot,true);//tef_chall.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.add_change_effect(FPalaceHelper.new_vagina(null));
        tef_con.addConsequence(0,0, "", 0,0,0,1);
        tef_con.addConsequence(0,0, "", -1);//add vagina
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.vag_slot,true);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,-100, "", 0,0,0,-1,false,null, FPalaceHelper.vag_slot);//remove vag
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        equip.add_remove_action(a);
        
        a = new CharAction();
        a.set_dialogue("",0);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.clit_slot,true);//tef_chall.set_attack_stat(FPalaceHelper.clit_length);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.set_change_on_success();
        tef_con.add_change_effect(FPalaceHelper.new_clit(null));
        tef_con.addConsequence(0,0, "", 0,0,0,1);
        tef_con.addConsequence(0,0, "", -1);//add clit
        
        a.addChallenge(tef_chall, tef_con);
        
        tef_chall = new Challenge();
        tef_chall.set_attack_equip_slot_check(FPalaceHelper.clit_slot,true);
        tef_chall.set_defense_stat(-1,1);
        tef_chall.setVariability(0);
        
        tef_con = new Consequence();
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,-100, "", 0,0,0,-1,false,null, FPalaceHelper.clit_slot);//remove clit
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        equip.add_remove_action(a);
        
        equip.setValue(50);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment bronze_greaves(){
        //selling NPC: mensch_smith
        Equipment equip = new Equipment("Bronze Greaves");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_crafting_requirement(leather(),4);
        equip.add_crafting_requirement(bronze(),4);
        equip.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.pierce_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.bludg_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.add_upgrade_slot(Upgrade_Item.upgrade_plates);
        equip.setDroppedDescription("a pair of greaves is on the ground");
        equip.setInventoryDescription("A set of leather shorts with the thighs covered by banged up bronze plates.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 40,28);
        equip.set_equip_condition(FPalaceHelper.hips_id, 50);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of bronze greaves. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock just manages to peek it's head out from underneath </noun> greaves, just barely visible. ",FPalaceHelper.penis_length_id,13);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> balls are even visibly hanging from </noun> greaves, the <sd/"+FPalaceHelper.balls_size_id+"> twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,14);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.max_hp_id,10);
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        equip.setValue(33);
        equip.setWeight(15);
        return equip;
    }
        
    public static Equipment Overalls(){
        //selling NPC: aghapei_seamstress
        Equipment equip = new Equipment("Over-alls");
        equip.add_crafting_requirement(textiles(),6);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a pair of overalls is on the ground");
        equip.setInventoryDescription("A pair of blue denim pants with a tall front and straps that hook over the shoulders.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 30);
        equip.set_equip_condition(FPalaceHelper.breast_size_id, 10);
        equip.set_equip_condition(FPalaceHelper.bloat_id, 10);
        equip.new_equip_slot(FPalaceHelper.torso_slot, 1);
        equip.new_equip_slot(FPalaceHelper.hips_slot, 1);
        equip.new_equip_slot(FPalaceHelper.legs_slot, 2);

        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a set of denim overalls. ");
        equip.new_cover_slot(FPalaceHelper.torso_slot,"</pronoun> is wearing a set of denim overalls that disdends around </noun> pregnant belly. ", FPalaceHelper.bloat_id,2);
        equip.new_cover_image(FPalaceHelper.torso_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The straps that hold the overalls up are pressing barely managing to cover </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts. ");
        equip.new_cover_slot(FPalaceHelper.breasts_slot,"The overalls straps are being visibly stretched as </noun> <sd/"+FPalaceHelper.breast_size_id+"> breasts jut out from </noun> chest. ",FPalaceHelper.breast_size_id,2);
        equip.new_cover_slot(FPalaceHelper.nipples_slot,"");
        equip.new_cover_image(FPalaceHelper.breasts_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.udder_slot,"The overalls stretch over </noun> udder. ");
        equip.new_cover_image(FPalaceHelper.udder_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"In the crotch there is a bulge clearly indicating the presence of male genitalia. ",FPalaceHelper.penis_length_id, 8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"There is a <sd/"+FPalaceHelper.penis_length_id+"> bulge in the fabric starting from </noun> nether regions and trailing down the pantleg. ",FPalaceHelper.penis_length_id, 16);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> scrotum is clearly trying to escape from the outfit, each orb struggling seperately. ", FPalaceHelper.balls_size_id, 15);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        equip.setValue(23);
        equip.setWeight(8);
        
        return equip;
    }
    
    public static Equipment black_pencil_skirt(){
        //selling NPC: century_city_clothing_store_clerk
        Equipment equip = new Equipment("Black Pencil Skirt");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a skirt is on the ground");
        equip.setInventoryDescription("This black pencil skirt is surprisingly short.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 32,20);
        equip.set_equip_condition(FPalaceHelper.hips_id, 40);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a tight black pencil skirt. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> skirt, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly showing against the black fabric. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock just manages to peek it's head out from underneath </noun> skirt, just barely visible. ",FPalaceHelper.penis_length_id,13);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> </rn> <sd/"+FPalaceHelper.penis_length_id+"> cock hangs heavily out from underneath </noun> skirt,  it's length completely passing the skirts bottomost freyed edge. ",FPalaceHelper.penis_length_id,18);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> skirt, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,14);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(18);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(14);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment plaid_skirt(){
        //selling NPC: school_store_shopkeeper
        Equipment equip = new Equipment("Plaid Skirt");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a skirt is on the ground");
        equip.setInventoryDescription("This plaid skirt is quite modest.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 26,20);
        equip.set_equip_condition(FPalaceHelper.hips_id, 50);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a loose plaid skirt. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> skirt, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly showing against the plaid fabric. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock just manages to peek it's head out from underneath </noun> skirt, just barely visible. ",FPalaceHelper.penis_length_id,20);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> </rn> <sd/"+FPalaceHelper.penis_length_id+"> cock hangs heavily out from underneath </noun> skirt,  it's length completely passing the skirts bottomost edge. ",FPalaceHelper.penis_length_id,30);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> skirt, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,14);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(18);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(14);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment leather_skirt(){
        //selling NPC: lux_invira_shopkeeper
        Equipment equip = new Equipment("Leather skirt");
        equip.add_crafting_requirement(leather(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a skirt is on the ground");
        equip.setInventoryDescription("This short leather skirt is made from animal hides whose fur has been cut very short.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 26,20);
        equip.set_equip_condition(FPalaceHelper.hips_id, 50);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a rough cut leather skirt. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> rough leather skirt, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock just manages to peek it's head out from underneath </noun> skirt, it's length just barely visible. ",FPalaceHelper.penis_length_id,13);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from underneath </noun> skirt, it's length completely passing the skirts bottomost freyed edge. ",FPalaceHelper.penis_length_id,18);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> skirt, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,14);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(19);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.setValue(16);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment booty_thong(){
        //selling NPC: 
        Equipment equip = new Equipment("Thong");
        equip.setDroppedDescription("a small slip of cloth is on the ground");
        equip.setInventoryDescription("This barely noticible strip of red cloth could be used as underwear.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 36,16);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a nearly invisible red thong. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as the thong disappears between their mass. ", FPalaceHelper.hips_id, 33);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> thong,  it's length just barely visible. ",FPalaceHelper.penis_length_id,4);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock juts boldly from </noun> thong,  it's length completely passing the thong scant covering. ",FPalaceHelper.penis_length_id,6);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> thong,  the twin orbs pushed off to one side. ",FPalaceHelper.balls_size_id,4);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,1);
        equip.new_cover_image(FPalaceHelper.vag_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,FPalaceHelper.unknown_img);
        
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.add_effect(FPalaceHelper.max_weight_id,1);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.hips_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.booty_thong_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.hips_id,0.25, "", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.booty_thong_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);
        return equip;
    }
    
    public static Equipment red_g_string(){
        //selling NPC: lux_invira_lingerie
        Equipment equip = new Equipment("Red G-String");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_crafting_requirement(silk(),1);
        equip.setDroppedDescription("a small slip of cloth is on the ground");
        equip.setInventoryDescription("This barely noticible strip of red cloth could be used as underwear.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 36,16);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a nearly invisible red G-String. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as the g-string disappears between their mass. ", FPalaceHelper.hips_id, 33);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> G-String,  it's length just barely visible. ",FPalaceHelper.penis_length_id,4);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock juts boldly from </noun> G-String,  it's length completely passing the G-Strings scant covering. ",FPalaceHelper.penis_length_id,6);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> G-String,  the twin orbs pushed off to one side. ",FPalaceHelper.balls_size_id,4);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,1);
        equip.new_cover_image(FPalaceHelper.vag_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,FPalaceHelper.unknown_img);
        
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.add_effect(FPalaceHelper.max_weight_id,1);
        equip.setValue(24);
        return equip;
    }
    
    public static Equipment leather_panties(){
        //selling NPC: lux_invira_shopkeeper
        Equipment equip = new Equipment("Leather panties");
        equip.add_crafting_requirement(leather(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("A set of womens underwear made from brown leather.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 26,20);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a small pair of rough cut leather panties. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as the panties disappear between their mass. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> panties,  it's length just barely visible. ",FPalaceHelper.penis_length_id,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from </noun> panties,  it's length completely passing the panties bottomost freyed edge. ",FPalaceHelper.penis_length_id,10);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> panties,  the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,6);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,2);
        equip.new_cover_image(FPalaceHelper.vag_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.add_effect(FPalaceHelper.max_weight_id,1);
        equip.setValue(14);
        return equip;
    }
    
    public static Equipment chastity_belt(){
        //selling NPC: 
        Equipment equip = new Equipment("Chastity Belt");
        equip.add_crafting_requirement(iron(),2);
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("A chastity belt made of shimmering iron. Someone has attached a dildo to the inside of the crotch. ");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 30, 18);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 10);
        equip.set_equip_condition(FPalaceHelper.balls_size_id, 4);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a chastity belt. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as the chastity belt disappear between their mass. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is attempting to escape from </noun> chastity belt,  it's head peaking out from the edge of the belt. ",FPalaceHelper.penis_length_id,5);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> chastity belt, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,2);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,2);
        equip.new_cover_image(FPalaceHelper.vag_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,1);
        equip.set_skill_bonus(FPalace_skills.grappling_id, 5);
        
        equip.setValue(26);
        return equip;
    }
    
    public static Equipment horny_chastity_belt(){
        //selling NPC: 
        Equipment equip = new Equipment("Chastity Belt");
        equip.add_crafting_requirement(iron(),2);
        equip.add_crafting_requirement(plastics(),1);
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("A chastity belt made of shimmering iron. Someone has attached a dildo to the inside of the crotch. ");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 30,18);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 10);
        equip.set_equip_condition(FPalaceHelper.balls_size_id, 4);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a chastity belt. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as the chastity belt disappear between their mass. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is attempting to escape from </noun> chastity belt,  it's head peaking out from the edge of the belt. ",FPalaceHelper.penis_length_id,5);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> chastity belt, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,2);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,2);
        equip.new_cover_image(FPalaceHelper.vag_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,1);
        equip.add_effect(FPalaceHelper.min_lust_id,5);
        equip.set_skill_bonus(FPalace_skills.grappling_id, 5);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.curr_hp_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.horny_chastity_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.lust_id,10, "</n> feels something pushing against </noun> insides. ", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.horny_chastity_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(39);
        return equip;
    }
    
    public static Equipment jutting_jockstrap(){
        Equipment equip = new Equipment("Jutting jockstrap");
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("This jockstrap looks like it'd help keep dangling bits in place.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 40,16);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 12);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a jockstrap. ");
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing jockstrap rides up between them. ", FPalaceHelper.hips_id);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> boxers,  it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from </noun> boxers  it's length completely passing the jockstraps bindings. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> jockstrap, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,4);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.add_effect(FPalaceHelper.max_weight_id,3);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.penis_length_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.jutting_jockstrap_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.penis_length_id,0.3, "", 0);
        c2.addConsequence(FPalaceHelper.penis_girth_id,0.1, "", 0);
        c2.addConsequence(FPalaceHelper.lust_id,10, "", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.jutting_jockstrap_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);
        return equip;
    }
    
    public static Equipment Blue_silk_boxers(){
        //selling NPC: industria_seamstress
        Equipment equip = new Equipment("Blue Silk Boxers");
        equip.add_crafting_requirement(silk(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("This airy pair of blue silk boxers would probably be form fitting.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 40,16);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a small pair of blue silken boxers. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as the boxers fall from their mass. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> boxers, it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from </noun> boxers it's length completely passing the boxers bottomost freyed edge. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> boxers, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,9);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,3);
        equip.setValue(27);
        return equip;
    }
    
    public static Equipment tightie_whities(){
        //selling NPC: century_city_clothing_store_clerk
        Equipment equip = new Equipment("White underwear");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("This pair of white underwear are dangerously reminiscent of what a mother would buy for her son.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 30, 20);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a small pair of tight white underwear. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as their underwear fails to hide their mass. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> underwear, it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from </noun> underwear it's length falling from the underwears bottomost edge. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> underwear, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,9);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,-1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,2);
        equip.setValue(8);
        return equip;
    }
    
    public static Equipment mighty_whities(){
        //selling NPC: nunnery_shopkeeper
        Equipment equip = new Equipment("Mighty Whities");
        equip.setDroppedDescription("a pair of underwear is on the ground");
        equip.setInventoryDescription("This pair of white underwear are dangerously reminiscent of what a mother would buy for her son.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 40, 20);
        //equip.set_equip_condition(FPalaceHelper.balls_size_id, 2.5);
        //TODO why double?
        equip.set_equip_condition(FPalaceHelper.balls_size_id, 2);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a small pair of tight white underwear. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing as their underwear fails to hide their mass. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is clearly buldging in </noun> underwear, it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from </noun> underwear it's length falling from the underwears bottomost edge. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are even visibly hanging from </noun> underwear, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,2);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,-1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        equip.add_effect(FPalaceHelper.max_weight_id,2);
        
        CharAction a = new CharAction();
        a.set_dialogue("",0);
        
        Challenge tef_chall = new Challenge();
        tef_chall.set_attack_stat(FPalaceHelper.cum_volume_id);
        tef_chall.set_defense_stat(-1, 1);
        tef_chall.setVariability(0);
        
        Consequence tef_con = new Consequence();//0
        
        TickEffect tf = new TickEffect();
        tf.set_status_id(TickEffect.mighty_whities_status);
        Consequence c2 = new Consequence();
        c2.addConsequence(FPalaceHelper.cum_volume_id,5, "", 0);
        c2.addConsequence(FPalaceHelper.balls_size_id,0.1, "", 0);
        c2.addConsequence(FPalaceHelper.lust_id,10, "", 0);
        
        tf.set_tick_consequence(FPGameGithub.T1_HOUR,c2);
        
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", 0,0,0,-1,false,tf);
        tef_con.addConsequence(FPalaceHelper.curr_hp_id,0, "", -1);
        
        a.addChallenge(tef_chall, tef_con);
        
        equip.add_action(a);
        
        tef_con = new Consequence();
        tef_con.add_remove_status(TickEffect.mighty_whities_status);
        
        equip.add_remove_consequence(tef_con);
        
        equip.setValue(50);
        
        
        return equip;
    }
    
    public static Equipment Loincloth(){
        //selling NPC: lux_invira_shopkeeper
        Equipment equip = new Equipment("Loincloth");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a piece of cloth is on the ground");
        equip.setInventoryDescription("This lengthly piece of cloth has a string that looks to go around the waist.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.waist_id, 40);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a length of cloth trailing down the front of </noun> groin. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is clearly visible, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind showing, despite her loincloth. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_girth_id+"> </rn> cock is clearly buldging down the length of </noun> loincloth. ",FPalaceHelper.penis_girth_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"the head of </noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock hangs heavily out from </noun> loincloth it's length completely passing the fabrics bottomost freyed edge. ",FPalaceHelper.penis_length_id,16);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> balls are visibly hanging from </noun> loincloth, the twin orbs ballooning beneath. ",FPalaceHelper.balls_size_id,9);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        equip.setValue(12);
        return equip;
    }
    
    public static Equipment Blue_silk_pants(){
        //selling NPC: industria_seamstress
        Equipment equip = new Equipment("Blue Silk Pants");
        equip.add_crafting_requirement(silk(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a pair of pants is on the ground");
        equip.setInventoryDescription("This pair of blue pants is made from a smooth, unstretchable material.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 50,6);
        
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of blue silk pants. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is gently carrassed by </noun> pair of blue silk pants, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge, it's length just barely visible. ",FPalaceHelper.penis_length_id,13);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock bulges down </noun> pantleg, it's length trailing down </noun> thigh. ",FPalaceHelper.penis_length_id,18);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, stretching </noun> pants fabric. ",FPalaceHelper.balls_size_id,6);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(11);
        equip.add_effect(FPalaceHelper.max_hp_id,6);
                                
        equip.setValue(37);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment blue_slacks(){
        //selling NPC: castilla_seamstress
        Equipment equip = new Equipment("Navy Blue Slacks");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a pair of pants is on the ground");
        equip.setInventoryDescription("This pair of navy blue slacks is made from a soft warm wool.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 50,6);
        
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of navy blue slacks. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is gently carrassed by </noun> pair of slacks, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge, it's length just barely visible. ",FPalaceHelper.penis_length_id,13);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock bulges down </noun> pantleg, it's length trailing down </noun> thigh. ",FPalaceHelper.penis_length_id,18);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, stretching </noun> pants fabric. ",FPalaceHelper.balls_size_id,6);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(11);
        equip.add_effect(FPalaceHelper.max_hp_id,6);
                                
        equip.setValue(19);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment baggy_bluejeans(){
        //selling NPC: century_city_clothing_store_clerk
        Equipment equip = new Equipment("Baggy Bluejeans");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of pants is on the ground");
        equip.setInventoryDescription("A pair of blue denim pants whose legs balloon from the waist.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 40,6);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 40);
        equip.set_equip_condition(FPalaceHelper.penis_girth_id, 15);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of baggy blue jeans. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> pair of baggy blue jeans, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge, it's length just barely visible. ",FPalaceHelper.penis_length_id,13);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock bulges down </noun> pantleg, it's length trailing down </noun> thigh. ",FPalaceHelper.penis_length_id,18);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, stretching </noun> pants fabric. ",FPalaceHelper.balls_size_id,6);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.max_hp_id,4);
                    
        equip.setValue(15);
        equip.setWeight(4);
        return equip;
    }
    
    public static Equipment ripped_jean_shorts(){
        //selling NPC: aghapei_seamstress
        Equipment equip = new Equipment("Ripped jean shorts");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of shorts is on the ground");
        equip.setInventoryDescription("This pair of blue denim shorts is ripped and torn just below the groin.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 36,20);
        equip.set_equip_condition(FPalaceHelper.penis_girth_id, 10);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of ripped blue jean shorts. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> pair of baggy blue jeans, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind falling from the short shorts. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge,  it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock bulges out of </noun> shorts through a leg,  it's length trailing down </noun> thigh. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, falling from </noun> shorts. ",FPalaceHelper.balls_size_id,5);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.setIdentifyDifficulty(10);
        equip.add_effect(FPalaceHelper.max_hp_id,3);

        equip.setValue(11);
        return equip;
    }
    
    public static Equipment normal_bluejeans(){
        //selling NPC: century_city_clothing_store_clerk
        Equipment equip = new Equipment("Bluejeans");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of pants is on the ground");
        equip.setInventoryDescription("A standard pair of blue denim pants.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 40,6);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 18);
        equip.set_equip_condition(FPalaceHelper.penis_girth_id, 8);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of baggy blue jeans. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> pair of baggy blue jeans, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge,  it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock bulges down </noun> pantleg,  it's length trailing down </noun> thigh. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, stretching </noun> pants fabric. ",FPalaceHelper.balls_size_id,6);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(9);
        equip.add_effect(FPalaceHelper.max_hp_id,4);

        equip.setValue(15);
        equip.setWeight(4);
        return equip;
    }
    
    public static Equipment black_hose(){
        //selling NPC: lux_invira_lingerie
        Equipment equip = new Equipment("Black Pantyhose");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_crafting_requirement(silk(),1);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of hose are on the ground");
        equip.setInventoryDescription("A pair of sexy black pantyhose.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 40,6);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 30);
        equip.set_equip_condition(FPalaceHelper.penis_girth_id, 8);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of semi-translucent black pantyhose. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is nice compressed in </noun> hose, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 20);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge,  it's length trailing down the hose. ",FPalaceHelper.penis_length_id,1);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock reaches passed </noun> knee,  it's length barely contained by </noun> black pantyhose. ",FPalaceHelper.penis_length_id,16);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, stretching </noun> hoses fabric. ",FPalaceHelper.balls_size_id,1);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(7);
        equip.add_effect(FPalaceHelper.max_hp_id,2);

        equip.setValue(14);
        return equip;
    }
    
    public static Equipment knee_high_socks(){
        //selling NPC: school_store_shopkeeper
        Equipment equip = new Equipment("Knee high socks");
        equip.add_crafting_requirement(textiles(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of socks are on the ground");
        equip.setInventoryDescription("A pair of knee high socks.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);
        equip.new_equip_slot(FPalaceHelper.feet_slot,2);

        equip.new_cover_slot(FPalaceHelper.legs_slot,"</pronoun> is wearing a pair of knee high socks. ");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</pronoun> is wearing a pair of knee high socks. ");
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        
        equip.setIdentifyDifficulty(7);
        equip.add_effect(FPalaceHelper.max_hp_id,2);

        equip.setValue(9);
        return equip;
    }
    
    public static Equipment blue_scrub_bottom(){
        //selling NPC: N/A
        Equipment equip = new Equipment("Scrubs bottom");
        equip.add_crafting_requirement(textiles(),4);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of pants is on the ground");
        equip.setInventoryDescription("A pair of clean blue pants.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.set_equip_condition(FPalaceHelper.hips_id, 40,6);
        equip.set_equip_condition(FPalaceHelper.penis_length_id, 18);
        equip.set_equip_condition(FPalaceHelper.penis_girth_id, 8);
        equip.new_equip_slot(FPalaceHelper.hips_slot,1);
        equip.new_equip_slot(FPalaceHelper.legs_slot,2);

        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</pronoun> is wearing a pair of blue scrub pants. ");
        equip.new_cover_image(FPalaceHelper.hips_slot,FPalaceHelper.unknown_img);
        equip.new_cover_slot(FPalaceHelper.hips_slot,"\n\n</noun> ass is roughly pressing against </noun> pair of blue scrub pants, each orb of </noun> </"+FPalaceHelper.hips_id+"> inch behind clearly visible. ", FPalaceHelper.hips_id, 36);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock is visible as a buldge,  it's length just barely visible. ",FPalaceHelper.penis_length_id,8);
        equip.new_cover_slot(FPalaceHelper.cock_slot,"</noun> <sd/"+FPalaceHelper.penis_length_id+"> </rn> cock bulges down </noun> pantleg,  it's length trailing down </noun> thigh. ",FPalaceHelper.penis_length_id,12);
        equip.new_cover_image(FPalaceHelper.cock_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"",-1,0,0,5);
        equip.new_cover_slot(FPalaceHelper.balls_slot,"</noun> <sd/"+FPalaceHelper.balls_size_id+"> twin orbs bulge out from </noun> groin, stretching </noun> pants fabric. ",FPalaceHelper.balls_size_id,6);
        equip.new_cover_image(FPalaceHelper.balls_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.vag_slot,"",-1,0,0,5);
        equip.new_cover_image(FPalaceHelper.vag_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.clit_slot,"");
        equip.new_cover_image(FPalaceHelper.clit_slot,Equipment.hide_part);
        equip.new_cover_slot(FPalaceHelper.legs_slot,"");
        equip.new_cover_image(FPalaceHelper.legs_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(7);
        equip.add_effect(FPalaceHelper.max_hp_id,2);

        equip.setValue(11);
        return equip;
    }
        
        //FEET
    public static Equipment hard_leather_boots(){
        //selling NPC: castilla_cobbler
        Equipment equip = new Equipment("Hard leather boots");
        equip.add_crafting_requirement(leather(),2);
        equip.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
        equip.add_damage_resistance(FPalaceHelper.bludg_damage_type().get_id());
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setDroppedDescription("a pair of boots are on the ground");
        equip.setInventoryDescription("This set of tough black leather look comfortable.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.feet_slot, 2);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</noun> feet and shins are covered by thick, hard leather boots. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.con_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,5);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(15);
        equip.setWeight(5);
        return equip;
    }
        
    public static Equipment black_heels(){
        //selling NPC: century_city_shoe_store_clerk
        Equipment equip = new Equipment("Black High Heels");
        equip.add_crafting_requirement(leather(),2);
        equip.setDroppedDescription("a pair of heels are on the ground");
        equip.setInventoryDescription("These inch high heels are made of shiny black material.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.feet_slot, 2);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</noun> feet are being held up by a pair of sheer black high heels. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.height_id,1);
        equip.add_effect(FPalaceHelper.sex_appeal_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,1);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(9);
        equip.setWeight(2);
        return equip;
    }
        
    public static Equipment black_boots(){
        //selling NPC: castilla_cobbler
        Equipment equip = new Equipment("Black Boots");
        equip.add_crafting_requirement(leather(),2);
        equip.setDroppedDescription("a pair of boots are on the ground");
        equip.setInventoryDescription("This pair of solid black boots look comfortable.");
        equip.add_upgrade_slot(Upgrade_Item.upgrade_lining);
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.feet_slot, 2);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</noun> feet are covered by thick black boots. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.con_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -5);
        
        equip.setValue(20);
        equip.setWeight(5);
        return equip;
    }
    
    public static Equipment black_dress_shoes(){
        //selling NPC: century_city_shoe_store_clerk
        Equipment equip = new Equipment("Black dress shoes");
        equip.add_crafting_requirement(leather(),2);
        equip.setDroppedDescription("a pair of shoes are on the ground");
        equip.setInventoryDescription("These shiny black shoes look both comfy AND classy.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.feet_slot, 2);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</noun> feet are covered by shining black shoes. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.con_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
                    
        equip.setValue(25);
        equip.setWeight(2);
        return equip;
    }
    
    public static Equipment green_leather_sandals(){
        //selling NPC: ahimsa_cobler
        Equipment equip = new Equipment("Green Sandals");
        equip.add_crafting_requirement(leather(),1);
        equip.setDroppedDescription("a pair of sandals are on the ground");
        equip.setInventoryDescription("This pair of green dyed leathers each have two leather straps that meet slightly closer to one side then the other.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.feet_slot, 2);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</noun> feet are covered by green dyed leather sandals. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(12);
        equip.add_effect(FPalaceHelper.dex_id,2);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        
        equip.set_skill_bonus(FPalace_skills.covert_id, -2);
        
        equip.setValue(17);
        return equip;
    }
    
    public static Equipment sneakers(){
        //selling NPC: century_city_shoe_store_clerk
        Equipment equip = new Equipment("Sneakers");
        equip.add_crafting_requirement(textiles(),1);
        equip.add_crafting_requirement(leather(),2);
        equip.add_damage_weakness(FPalaceHelper.fire_damage_type().get_id());
        equip.setDroppedDescription("a pair of shoes are on the ground");
        equip.setInventoryDescription("This pair of comfortable looking shoes is covered in advertisements.");
        equip.setImageID(FPalaceHelper.unknown_img);
        equip.new_equip_slot(FPalaceHelper.feet_slot, 2);
        equip.new_cover_slot(FPalaceHelper.feet_slot,"</noun> feet are covered by a pair of comfortable looking shoes. ",-1,0,2);
        equip.new_cover_image(FPalaceHelper.feet_slot,FPalaceHelper.unknown_img);
        equip.setIdentifyDifficulty(14);
        equip.add_effect(FPalaceHelper.dex_id,1);
        equip.add_effect(FPalaceHelper.max_hp_id,2);
        
        equip.setValue(15);
        equip.setWeight(2);
        return equip;
    }
    
    //HELD ITEMS
    public static Weapon bronze_short_sword(){
        //selling NPC: mensch_smith
        Weapon weapon = new Weapon("Bronze Short Sword");
        weapon.add_crafting_requirement(bronze(),4);
        weapon.setDroppedDescription("a sword is lying on the ground here");
        weapon.setInventoryDescription("A solid copper sword with a foot and a half long blade.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.str_id, 10);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_blade);
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> short sword and strikes </n> successfully, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> slashes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.set_max_damage(10);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-2, "</n2> has left a huge wound in </n>. ",4,0,0,-1,false,null,Body.change_stats_individual);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        
        weapon.setValue(15);
        weapon.setWeight(10);
        
        return weapon;
    }
    
    public static Weapon bronze_shield(){
        //selling NPC: mensch_smith
        Weapon weapon = new Weapon("Bronze Shield");
        weapon.add_crafting_requirement(bronze(),8);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_plates);
        weapon.setDroppedDescription("a shield is lying on the ground here");
        weapon.setInventoryDescription("This solid bronze shield would probably add some protection.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.str_id, 10);
        weapon.set_num_hold(1);
        weapon.setIdentifyDifficulty(17);
        weapon.add_effect(FPalaceHelper.dex_id,2);
        weapon.add_effect(FPalaceHelper.con_id,2);
        weapon.add_effect(FPalaceHelper.max_hp_id,10);
        weapon.set_skill_bonus(FPalace_skills.blocking_id, 10);
        
        weapon.setValue(70);
        weapon.setWeight(15);
        
        return weapon;
    }
    
    public static Weapon pitch_fork(){
        //selling NPC: freedom_farms_lilly
        Weapon weapon = new Weapon("Pitch Fork");
        weapon.add_crafting_requirement(wood(),4);
        weapon.setDroppedDescription("a pitch fork is lying on the ground here");
        weapon.setInventoryDescription("This long three pronged stick still has a few pieces of straw attached to the end.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.str_id, 10);
        weapon.set_num_hold(2);
        weapon.set_skill_bonus(FPalace_skills.two_handed_id, -2);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,10);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> pokes at </n> with </noun2> pitch-fork, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> swipes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.set_max_damage(10);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-10, "</n2> lifts </n> up with </noun2> pitch-fork, then slams </objnoun> to the ground. ",10);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        
        weapon.setValue(5);
        weapon.setWeight(5);
        
        return weapon;
    }
    
    public static Weapon hardcover_war_and_peace(){
        //selling NPC: mensch_librarian, ahimsa_librarian, benevol_librarian, aghapei_librarian
        Weapon weapon = new Weapon("Hardcover copy of War & Peace by Leo Tolstoy");
        weapon.add_crafting_requirement(paper(),10);
        weapon.add_crafting_requirement(dye(),3);
        weapon.add_crafting_requirement(textiles(),1);
        weapon.setDroppedDescription("a book is lying on the ground here");
        weapon.setInventoryDescription("You're pretty sure you'd earn a degree if you bothered to read this.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.wis_id, 10);
        weapon.set_num_hold(2);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> smashes </n> with </noun2> book, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> books *wooshes* through the air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
            consequence.set_max_damage(7);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_mp_id,-5, "The beating leaves </n>s wondering where </pronoun> is. ",1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        
        weapon.setValue(45);
        weapon.setWeight(5);
        
        return weapon;
    }
    
    public static Weapon knife(){
        //selling NPC: grasslands_caravan_merchant
        Weapon weapon = new Weapon("Knife");
        weapon.add_crafting_requirement(leather(),1);
        weapon.add_crafting_requirement(iron(),2);
        weapon.add_crafting_requirement(wood(),1);			
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_blade);
        weapon.setDroppedDescription("a knife is lying on the ground here");
        weapon.setInventoryDescription("A plain knife, with a sharp edge and leather covered handle.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 8);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> knife and strikes </n> successfully, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> slashes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.set_max_damage(6);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-2, "</n2> has left a nasty red gash on </n>s skin. ",1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        
        weapon.setValue(10);
        
        return weapon;
    }
    
    public static Weapon whip(){
        //selling NPC: mensch_slaver
        Weapon weapon = new Weapon("Whip");
        weapon.add_crafting_requirement(leather(),5);		
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.setDroppedDescription("a whip is lying on the ground here");
        weapon.setInventoryDescription("A length of hardened leather, perfect for lashing things with.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 10);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> whip and strikes </n> successfully, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </noun2> whip flails through the air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.set_max_damage(10);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-2, "</n2> has left a nasty red gash on </n>s skin. ",1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        
        weapon.setValue(8);
        
        return weapon;
    }
    
    public static Weapon scalpel(){
        //selling NPC: century_city_medical_supplies_clerk
        Weapon weapon = new Weapon("Scalpel");
        weapon.add_crafting_requirement(iron(),1);
        weapon.setDroppedDescription("a scalpel is lying on the ground here");
        weapon.setInventoryDescription("This shining metal blade is only an inch long, but impossibly sharp.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 10);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> scalpel and strikes </n> successfully, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> slashes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.set_max_damage(6);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-5, "</n2> has left a nasty red gash on </n>s skin. ",1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        
        weapon.setValue(5);
        
        return weapon;
    }
    
    public static Weapon elvish_rapier(){
        //selling NPC: ahimsa_smith
        Weapon weapon = new Weapon("Elvish Rapier");
        weapon.add_crafting_requirement(bronze(),1);
        weapon.add_crafting_requirement(iron(),4);
        weapon.add_crafting_requirement(wood(),1);
        weapon.add_crafting_requirement(leather(),1);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_blade);
        weapon.setDroppedDescription("a sword is lying on the ground here");
        weapon.setInventoryDescription("This long thin blade has a fancy bronze hand guard, and gorgeous leaf patterns engraved in its steel blade.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 10);
        weapon.set_skill_bonus(FPalace_skills.one_handed_id, -1);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> rapier, and digs the point at </n>, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> pokes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.set_max_damage(9);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            TickEffect tf = new TickEffect();
                tf.set_end_tick(4);
                Consequence c2 = new Consequence();
                                    
                c2.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> begins to bleed. ", 0);
                tf.set_tick_consequence(1, c2);
                tf.set_tick_consequence(2, c2);
                tf.set_tick_consequence(3, c2);
                tf.set_tick_consequence(4, c2);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "</n2> has opened a bleeding wound in </n>. ",5,0,0,-1, false, tf);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        weapon.set_attack_action(a);
        
        weapon.setValue(24);
        weapon.setWeight(3);
        
        return weapon;
    }
    
    public static Weapon greatsword(){
        //selling NPC: N/A
        Weapon weapon = new Weapon("Greatsword");
        weapon.add_crafting_requirement(bronze(),1);
        weapon.add_crafting_requirement(iron(),12);
        weapon.add_crafting_requirement(wood(),1);
        weapon.add_crafting_requirement(leather(),1);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_blade);
        weapon.setDroppedDescription("a sword is lying on the ground here");
        weapon.setInventoryDescription("This gargantuan iron blade seems... deadly.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_num_hold(2);
        weapon.set_hold_condition(FPalaceHelper.str_id, 12);
        weapon.set_skill_bonus(FPalace_skills.two_handed_id, -5);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> swings </noun2> massive blade, catching </n> in it's swing! ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> swings </noun2> gargantuan sword at the air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.set_max_damage(13);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "",0);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-10, "</n2> nearly cleaves </n> in two! ",5);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        weapon.set_attack_action(a);
        
        weapon.setValue(45);
        weapon.setWeight(15);
        
        return weapon;
    }
    
    public static Weapon spear(){
        //selling NPC: lux_invira_shopkeeper
        Weapon weapon = new Weapon("Spear");
        weapon.add_crafting_requirement(wood(),2);
        weapon.add_crafting_requirement(bronze(),1);
        weapon.setDroppedDescription("a spear is lying on the ground here");
        weapon.setInventoryDescription("This long thin length of wood with a sharp metal tip on one end is quite simple.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 8);
        weapon.set_skill_bonus(FPalace_skills.one_handed_id, -1);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_tip);
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> spear, and digs the point at </n>, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> pokes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.set_max_damage(8);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            TickEffect tf = new TickEffect();
                tf.set_end_tick(4);
                Consequence c2 = new Consequence();
                                    
                c2.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> begins to bleed. ", 0);
                tf.set_tick_consequence(1, c2);
                tf.set_tick_consequence(2, c2);
                tf.set_tick_consequence(3, c2);
                tf.set_tick_consequence(4, c2);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> has opened a bleeding wound in </n>. ",5,0,0,-1, false, tf);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        weapon.set_attack_action(a);
        
        weapon.setValue(9);
        weapon.setWeight(3);
        
        return weapon;
    }
    
    public static Weapon parisol(){
        //selling NPC: N/A
        Weapon weapon = new Weapon("Parisol");
        weapon.add_crafting_requirement(wood(),2);
        weapon.add_crafting_requirement(silk(),3);
        weapon.setDroppedDescription("an umbrella is lying on the ground here");
        weapon.setInventoryDescription("This long thin length of wood has a cloth tarp that extends and retracts at the press of a button. ");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 8);
        weapon.set_skill_bonus(FPalace_skills.one_handed_id, -3);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_tip);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> parisol, and digs the point at </n>, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> pokes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.one_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
            consequence.set_max_damage(8);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
            consequence.addConsequence(FPalaceHelper.curr_mp_id,-4, "</n2> open </noun2> parisol just as </objnoun2> strikes </n>, confusing </objnoun>! ",5);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        weapon.set_attack_action(a);
        
        weapon.setValue(20);
        weapon.setWeight(3);
        
        return weapon;
    }
    
    public static Weapon maidens_wand(){
        //selling NPC: job_witch_potionmaster
        Weapon weapon = new Weapon("Wand");
        weapon.add_crafting_requirement(wood(),1);
        weapon.add_crafting_requirement(silver_bar(),1);
        
        weapon.setDroppedDescription("a wand is lying on the ground here");
        weapon.setInventoryDescription("This long thin length of wood is little more than a carving of a young woman with a handle.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_hold_condition(FPalaceHelper.wis_id, 8);
        weapon.set_skill_bonus(FPalace_skills.mental_magic_id, 4);
        
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.ranged_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.lit_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> points with </noun2> wand, and a bolt of light strikes </n>, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "A flash of light sparks out from </n2>s wand, but it's hard to know what </pronoun2> was aiming at. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.mental_magic_id);
            challenge.set_defense_stat(FPalace_skills.magic_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.lit_damage_type().get_id());
            consequence.set_max_damage(10);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "bursting and scarring </objnoun>. ",0);
            TickEffect tf = new TickEffect();
                tf.set_end_tick(4);
                Consequence c2 = new Consequence();
                c2.set_interupt_chal(inter_chal);
                c2.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n>s head pulses. ", 0);
                tf.set_tick_consequence(1, c2);
                tf.set_tick_consequence(2, c2);
                tf.set_tick_consequence(3, c2);
                tf.set_tick_consequence(4, c2);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> looks to be in some mental anguish from the blast. ",5,0,0,-1, false, tf);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "but </pronoun> shrugs it off. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        weapon.set_attack_action(a);
        
        weapon.setValue(29);
        weapon.setWeight(1);
        
        return weapon;
    }
    
    public static Weapon manyuu_blade(){//had to make a manyuu titty blade
    //selling NPC: N/A
        Weapon weapon = new Weapon("Manyuu Katana");
        weapon.setDroppedDescription("a shimmering pink katana is laying on the ground here");
        weapon.setInventoryDescription("This long curved blade shines pink in the light, and has a long handle intended for two hands.");
        weapon.setImageID(FPalaceHelper.unknown_img);
        weapon.set_num_hold(2);
        weapon.set_hold_condition(FPalaceHelper.str_id, 10);
        weapon.set_hold_condition(FPalaceHelper.dex_id, 10);
        weapon.set_skill_bonus(FPalace_skills.two_handed_id, -2);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_grip);
        weapon.add_upgrade_slot(Upgrade_Item.upgrade_blade);
        Challenge inter_chal = new Challenge(true);
            inter_chal.set_attack_stat(FPalace_skills.concentration_id);
            inter_chal.set_defense_stat(-1,12);
            inter_chal.setVariability(10);
        
        CharAction a = new CharAction();
            a.setName("Attack");
            a.set_attack_flag();
            //dodge
            a.set_blowback(FPalaceHelper.breast_size_id, 0);
            Challenge challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.dodging_id);
            challenge.setVariability(10);
            challenge.setText("Attack");
            Consequence consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with </noun2> katana and tries to cut across </n>s skin, ",0,1,0,1);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n2> misses as </pronoun2> slashes at air. ",-1);
            
            a.addChallenge(challenge,consequence);
            
            //parry - need to check to see if opponent is holding something, otherwise, no parry
            challenge = new Challenge();
            challenge.set_attack_stat(-1,0);
            challenge.set_defense_stat(-1,0);
            challenge.set_defense_hold_check();
            challenge.setVariability(0);
            challenge.setText("");
            consequence = new Consequence();
            consequence.addConsequence(0,0, "",0,1,0,3);
            consequence.addConsequence(0,0, "",-1,1,0,2);
            
            a.addChallenge(challenge,consequence);
            
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.parrying_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,3);
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
            
            a.addChallenge(challenge,consequence);
            //block
            challenge = new Challenge(true);
            challenge.set_attack_stat(FPalace_skills.two_handed_id);
            challenge.set_defense_stat(FPalace_skills.blocking_id);
            challenge.setVariability(10);
            challenge.setText("");
            consequence = new Consequence();
            consequence.set_max_damage(15);
            consequence.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-5, "and lands a clean hit upon </n>. ",0);
             consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "</n2> has left a nasty red gash on </n>s skin. ",2);
            //this is completely destroying the opponents breasts, and I mean it to only reduce them to 0 or 1... not sure what i should do about it
            //maybe completely remove the part?
            consequence.addConsequence(FPalaceHelper.breast_size_id,Consequence.amt_from_roll_const, "</n>s breasts seem to deflate and recede as the slash strikes. ",1);
        
            consequence.set_interupt_chal(inter_chal);
            consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
            consequence.amt_by_roll_flag();
            
            a.addChallenge(challenge,consequence);
        
        weapon.set_attack_action(a);
        weapon.setWeight(10);
        
        return weapon;
    }
    
//MODS
    public static Upgrade_Item strong_grip(){
        //selling NPC: ahimsa_smith
        Upgrade_Item mod = new Upgrade_Item("Strong grip");
        mod.add_crafting_requirement(leather(),1);
        mod.setDroppedDescription("a weapon piece is lying on the ground here");
        mod.setInventoryDescription("This is a weapon grip that looks strong and tough. ");
        mod.setImageID(FPalaceHelper.unknown_img);
        mod.add_effect(FPalaceHelper.str_id,1);
        mod.set_skill_bonus(FPalace_skills.melee_id,-5);
        mod.set_upgrade_type(Upgrade_Item.upgrade_grip);
        mod.setWeight(0);
        mod.setValue(10);
        return mod;
    }
    
    public static Upgrade_Item wool_lining(){
        //selling NPC: industria_seamstress
        Upgrade_Item mod = new Upgrade_Item("Wool lining");
        mod.add_crafting_requirement(textiles(),2);
        mod.setDroppedDescription(CLOTHLYING);
        mod.setInventoryDescription("This looks like the lining to some sort of garment. ");
        mod.setImageID(FPalaceHelper.unknown_img);
        mod.add_effect(FPalaceHelper.max_hp_id,4);
        
        //should be adding weakness to fire
        
        mod.set_upgrade_type(Upgrade_Item.upgrade_lining);
        mod.setWeight(0);
        mod.setValue(18);
        return mod;
    }
    
    public static Upgrade_Item hooked_tip(){
        //selling NPC: lux_invira_shopkeeper
        Upgrade_Item mod = new Upgrade_Item("Hooked tip");
        mod.add_crafting_requirement(iron(),1);
        mod.setDroppedDescription("a weapon piece is lying on the ground here");
        mod.setInventoryDescription("This looks like a spearhead with hooked back points. ");
        mod.setImageID(FPalaceHelper.unknown_img);
        mod.set_skill_bonus(FPalace_skills.two_handed_id,-5);
        
        //should be increasing max damage
        
        mod.set_upgrade_type(Upgrade_Item.upgrade_tip);
        mod.setWeight(0);
        mod.setValue(5);
        return mod;
    }
    
    public static Upgrade_Item blade_balance(){
        //selling NPC: mensch_smith
        Upgrade_Item mod = new Upgrade_Item("Balanced blade");
        mod.add_crafting_requirement(iron(),1);
        mod.setDroppedDescription("a weapon piece is lying on the ground here");
        mod.setInventoryDescription("This looks like a weight you could clamp on a blade. ");
        mod.setImageID(FPalaceHelper.unknown_img);
        mod.set_skill_bonus(FPalace_skills.melee_id,5);
        
        //should be decreasing max damage
        
        mod.set_upgrade_type(Upgrade_Item.upgrade_blade);
        mod.setWeight(0);
        mod.setValue(15);
        return mod;
    }
    
    public static Upgrade_Item slanted_plates(){
        //selling NPC: mensch_smith
        Upgrade_Item mod = new Upgrade_Item("Slanted plates");
        mod.add_crafting_requirement(iron(),1);
        mod.setDroppedDescription("a weapon piece is lying on the ground here");
        mod.setInventoryDescription("This looks like addition plating for armour. ");
        mod.setImageID(FPalaceHelper.unknown_img);
        mod.add_effect(FPalaceHelper.max_hp_id,4);
        mod.set_skill_bonus(FPalace_skills.blocking_id,5);
        
        mod.set_upgrade_type(Upgrade_Item.upgrade_plates);
        mod.setWeight(0);
        mod.setValue(23);
        return mod;
    }
    
}
