package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;
//import fl.controls.ProgressBar;
import java.util.logging.Logger;
	
public class FPalace_content {
    
    //Need win conditions. Most obvious one is "return home", though others could be "rule a city" or things like that
        
    //Area ideas:
    //Thinking I need a mad scientist (Dr. Feichenrein) castle with zombie futa etc.
    //Charity Aligned: Refugee camp, Charity Organization, Beauractratic Org, Thieves Guild, Pirates/Sailors, Hunters, Orphanage
        //Item: Musical Instrument
    //Kindness Aligned: Bazaar, Oasis, Fishermans Wharf, Barbarian Tribe (Equine Encampment?), Viking Tribe, Colluseum
        //Item: Wooden Cup
    //Humility Aligned: Hermits shack, Mages tower, Monastary, Crypt, Witches School(there)
        //Item: Shephards crook
    //Chastitiy Aligned: Nunnery, Church, Monastary, Traveling Circus, Aristocracy
        //Item: Book
    //Patience Aligned: Workshop, art gallery, Monastary, School, Courts
        //Item: Scales
    //Temperance Aligned: Church, Pilgramage, Fighting Pit, Army
        //Item: Ankh/Amulet
    //Diligence Aligned: Workshop, Quarry, Farm(there), School/University, Playhouse, Casino, ancient ruins
        //Item: Glove
    //Sin Aligned: Futanari Palace(there), Battlefield, Brothel(Should be part of the palace, though a few other places), Bar(Same as brothel), Casino(Should be part of palace and no where else)
        //Item: Hermpire ring (exists)
                            
    //Also thinking of a plot for this 'game'
    //Need to collect all of the McGuffins
    //Start with a questionair challenge between the Stats to determine starting zone
    //Eight cities dot the country side, each named for the virtue it holds dear
        //They have taken the virtues too far, and are suffering for it
            //Over all theme: The danger of excess virtue, and the virtue of sin (and moderation)
                //Win condition: Blaspheme against all the virtues (including the non-traditional sex_appeal/appearance/beauty/sin)
                    //or, more realisticly, collect something from each place that they want and/or hold sacred
        //I've placed the cities
            //need some sort of "theme" for them
                //Races without a home city: Goblins, Fish, Dwarf, Centaur, Frog, Orcs, Fox, Deer, Seals, Penguins
                //Dad suggested Greco-Roman, Dark Ages, Middle-eastern/Phenetian, Egyptian, Oriental, and Indian (as in India)
                    //Sin - Purple - Main Stat: Beauty - Main Skills: N/A - Lux Invira - Tribal  - Races: Human
                        //FPalace - Casino/Bar/Brothel - Races: Human, Goo
                    //Humility - Blue - Main Skills: Magic - Main Stat: Willpower - Century City - modern - Races: Human
                        //Witches School - Races: Human
                    //Dilligence - Yellow - Main Skills: Knowledge - Main Stat: Intelligence - Industria - Oriental - Races: Human, lizard
                        //Bee Hive - Races: Bees
                        //Freedom Farms - Races: Human, Bovine
                    //Temperance - Orange - Main Skills: Adventure - Main Stat: Constitution - Mensch - Egyption - Races: Bovine, Human (has two feline shopkeepers I likely need to change)
                    //Chastity - White - Main Skills: People - Main Stat: Charisma - Castilla - Dark Ages - Races: Human, Canine
                    //Kindness - Red - Main Skills: Fighting - Main Stat: Strength - Benevol - Middle-eastern - Races: Donkey, Human
                        //Equine Encampment - Gypsy camp - Races: Equine
                    //Charity - Green - Main Skills: Covert - Main Stat: Dexterity - Aghapei - Indian - Races: Feline, Human
                        //Burrowton - Races: Rabbits, Mouse
                    //Patience - Black - Main Skills: Crafting - Main Stat: Wisdom - Ahimsa - Greco-Roman - Races: Elves
                        //Spiders Den - Races: Spider Girls
    //Thinking on it, this is ultimately the same plot as Homers Odyssey, so I should probably look to it for some inspiration
        //Nymphs, sex crazed witches, a kingdom beset upon by suitors... it really is right at home here
        //A hint for a better name too, since Odysseus' name means "trouble" in Greek, referring to both the giving and receiving of trouble
            //Something like "Entanglement" would be an english equivalent... Ailers Entangliati? Entanglemy? Entanglessey?
            //"Jacan" is a biblical name that also means trouble... the female equivalent is "Achor"
                //Jacany? Ailers Achory?
                    //If I go with "Achory" I can genderswap the suitors, and have an Achor trying to get to the kingdom as something going on in the world external to the player
                        //This would be for Dilligence, so the more Oriental theme... An Oriental Odyssey. Heh.
                            //So an Orientel(Dilligence) girl who is married to a Greco-Roman(Patience) man returning to him. This is fedora fantasy territory
            //"Mashaka" is a genderless African name that also means trouble
                //Something to throw on the Amazon Isle in all likelihood
    
    //realworld biomes (for colour matching): http://i.imgur.com/NbptvMv.png
    /*
    ice sheet/polar desert
    tundra
    taiga
    temperate broadleaf forest
    temperate steppe
    subtropical rainforest
    Mediterranean vegetation
    monsoon forest
    arid desert
    xeric shrubland
    dry steppe
    semi arid desert
    grass savanna
    tree savanna
    subtropical dry forest
    tropical rainforest
    alpine tundra
    montane forest
    */
    
    /*Example of possible play:
    Hero falls alseep
    awakes in woods
    comes across abandoned temple/statue garden
    Is confronted by godess
    demands hero breed 1000 women
    hero refuses, but is captured and raped by statue
    hero is guaranteed to have hermaphrodite children
    rape is witnessed by lone remaining priestess
    hero awakes in priestesses shack down the road
    priestess demands sex
    still injured, hero is unable to resist, but protests none the less
    hero recovers, asks priestess about way back home... priestess tells hero of Hermaphrodite godesses words
    They set out to the nearest village, small, population around 500... mostly farmers
    Priestess has arangement with Inn keeper - they are free to stay.
    Priestess goes out to round up breeding material
    Hero wanders town - finds knife
    Hero learns of slavers, and goes to free the captured women
    Hero has first kill, trying to sneak slaves away, finding a sword on the corpse... manage to escape without incident
    Upon return to the town, one of them women freely gives herself to the hero... hero attempts to refuse, but is spotted and berated by the priestess
    Priestess has found 10 women willing to be bred. Casts spells and concocts potions to enable the hero to last the night.
    Hero manages to impregnate the women to the priestesses satisfaction, but falls severly ill. 
    Priestess arranges transport with a travelling merchant to larger city, hero is mostly incapacitated, but they still keep up the guise of being guards
    Along the journey they are attacked by a  giant boar. A few of the guards fall before the hero rises and finishes the beast, the heros sword breaking to do so.
    One of the hired guards is a travelling fighter. She was impressed with the heros skills, and begins to hang around the hero and the priestess.
    The hero finally manages to get an erection from some of the fighters teasing. The priestesses cheers the fighter on while she rapes the still recovering hero.
    The hero is stuck with a priapism.
    They arrive at the city (approx pop 50,000) but leave quickly to go to another nearby temple of the hermaphrodite godesses. The fighter continues to follow the group.
    The priestess is welcomed shakily by the well endowed members of her convent who lived at the other temple, little belief in her claims about the hero. They agree to mix a concoction to help his priapism though.
    The hero confronts the statue of the hermaphrodite goddess, and is plead with by the god. She feeds the hero some of her breast milk, which further curses the hero, though cures the hero of the priapism.
    The heroes penis grows when the hero masturbates.
    Hero imediately begins cursing the godess again, but the statue remains still. Priestesses come to investigate, and spot the milk dripping from their gods breast.
    Rape hero mercilessly, tying him to a bed to be raped. Priestess and fighter find Hero hours later and escape.
    Hero, priestess, and fighter return to city. Have difficulty finding accomodities, as the lord believed in other gods, they eventually settle for a small two bed room in a seedy part of town.
    Priestess goes to look for more breeding stock. Fighter goes to look for work. Hero wanders around.
    Hero learns of missing women, all with one thing in common... large breasts. The city guard has been un-interested in investigating.
    Hero snoops around, and finds warehouse full of the missing women being milked, odd leather collars strapped around their necks.
    Hero is confronted by a warehouse guard. Forgets about the broken sword, and is captured.
    Hero is awakened by a wizard giving the hero a hand job. Hero's penis predictably grows, as does the volume of ejaculate.
    Wizard shouts of success, and reaches into robes, pulling out cock ring. Cock ring is placed on hero. Hand job is repeated, heros penis grows AGAIN, and increased volume of ejaculate is stored in a bucket.
    Bucket is force fed to woman in next cell, causing her breasts to swell with each gulp.
    Wizard goes to remove cock ring from hero, but finds himself unable. Hero is tied to chair and left locked in cell. 
    Woman in next cell begins to talk to hero when the two are left alone. She's a thief, and really wants to suck the hero off. 
    Hero crashes chair into wall and frees self. Woman continues to motion for hero to let her felate the hero. Hero instead investigates door.
    Hero notices bad door design, and frees self from the cell. Turns to free the thief as well. Interrupted by warehouse guard, who hero strikes with cell door.
    Hero steals sword, and tosses dagger to Thief. Tells thief to hide next to the stairs, and walks towards a wooden door on the far side of the hall.
    The wizard heads down the steps, and threatens the hero. The hero smiles and taunts the wizard. The wizard is summarily stabbed in the back.
    The Hero and the Thief scoure the compound, the Hero finding some books that looked interesting. They free the captured women.
    They both return to the Heroes room, and find the priestess waiting. The fighter has been looking for the Hero, and returns mid conversation.
    The priestess notices the cock ring on the Hero, and begins to cast a spell. Before long, the ring is no longer restricting the hero, but has rather melded with the heroes cock, creating a large bulge at the base.
    It is quickly discovered by the rest of the group that the heroes cum now causes breasts to grow. 
    The hero awakes the next day to a blowjob from the thief. The heros sexual desire has increased with the size of the heros penis. The thiefs breasts are getting rather large.
    The hero heads out to the common room, and finds the fighter, who tells the hero of the priestesses going ons. Hoping the recent event would increase the chance at her attempt to find breeders.
    Fighter and Hero head to town to get Hero a weapon.
    Fighter and Hero head into blacksmith. Fighter and blacksmith begin to talk of weapons when wife of blacksmith bursts in. Wife was one of the captured women. 
    Takes hero into house and seduces hero. 
    Hero attempts to explain situation. Blacksmiths wife refuses to submit, and begins suckling on heroes nether regions. Rapes hero, leaving own belly bloated from seminal volume.
    Forces hero on 4 unwed daughters. 
    Hero continues to explain situation.
    Daughters don't care. Hero raped 4 more times.
    Offered dinner. Fighter has shown a nack with the blacksmith, and the blacksmith seems unconcerned about the state of his wife and daughters. 
    Hero appologizes to blacksmith, who shrugs it off, and makes comments about un-controllable women.
    Hero and Fighter return to inn to find Priestess has aranged for meeting with the city council to reward Hero. Hero is expected to be present. They need money for presentable clothing... the bulge in heroes legware is extremely noticible.
    Thief shows up, spent the day trying to pick pockets, though new breasts keep getting in the way. Priestess attacks hero for having a thief tag along. Hero offers to teach thief some cons.
    Hero tells all three companions that they are needed, and wants them to stay for the journey. Needs one of them to sleep alongside each night to contain urges.
    New clothes are bought, and council is attended. The lord is present, as is the blacksmiths wife.
    Very little support for the priestesses suggestion, though the blacksmiths wife is encouraging it whole heartadly. 
    The lord agrees with the priestess, and suggests and statue be made. And that elegable young women of the town be made available to the Hero.
    The Hero immediately starts to hide out at the inn, leaving rarely. When approached by sculptors, the Hero suggests rather they sculpt the beautiful women that were rescued.
    The priestess is furious with the Hero for not taking the opportunity given, and the Hero explains fears about the milking operation that was broken up and the lords response at the council. The priestess begins to share in the Heroes fears.
    A gala is announced, and the Hero is required to attend.
    At the gala, the lord requires the hero to masturbate, so that his daughter can partake. This causes the heroes glans to grow again. When the lords daughters breasts grow on consumption, the hero and the heroes companions are arrested for stealing the lords property.
    They are strung up by their hands in the castle dungeon. 
    The lord wants his magic cock ring back.
    The priestess explains that the hero can never be un-cursed, and the ring is permanently part of the hero.
    The lord proposes to them that they can be his slaves, fuelling his milk production.
    The lord leaves before answering why he needs to much milk.
    The heroes cock growth has caused an increase in testoserone, enabling the hero to break free from prison bonds.
    Guard comes to investigate, but hero gets the drop.
    Hero frees the thief with some coaching of how to pick the locks.
    The group is free, and flees without event, leaving their belongings.
    They flee down the river, and debate where to go next.
    Hero expresses some interest in learning magic, particularly since learning about not being able to be un-cursed.
    A nearby witches college is mentioned, though deemed unlikely... hero is particularly suseptible to their kind of magic.
    Hero reverses the argument, and claims that is exactly the kind of magic that needs to be learned.
    Hero joins the witches school, after convincing head-mistress of latent ability. Priestess joins schools rectory, and is surprised to find a statue for the hermaphrodite godess among the gods present. Fighter helps on the grounds, and along with thief act as rangers.
    */
    
    private static int step_num = -1;
    private static final Logger LOGGER = Logger.getLogger(FPalace_content.class.getName());
    
    public FPalace_content() {
        // constructor code
    }
    
    public static World new_world(World world/*,ProgressBar //aPb*/){
        step_num++; 
        
        switch (step_num){
        case 0:
        world.add_area(area_fpalace_forum());
        
        //aPb.value = 0;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 0");
        break;
        
        case 1:
        world.add_area(area_fpalace_library());
        
        //aPb.value = 8;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 1");
        break;
        
        case 2:
        world.add_area(area_grasslands());
        Area temp_area = world.areas.get(2);
        world.new_starting_room(temp_area.get_random_room());			
        
        //aPb.value = 16;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 2");
        break;
        
        case 3:
        world.add_area(area_fpalace_images());
        world.add_area(area_fpalace_stories());
        world.add_area(area_fpalace_artist());
        
        //aPb.value = 24;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 3");
        break;
        
        case 4:
        world.add_area(area_forest());			
        temp_area = world.areas.get(6);
        world.new_starting_room(temp_area.get_random_room());
        
        //aPb.value = 32;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 4");
        break;
        
        case 5:			
        world.add_area(area_freedom_farms());
        
        //aPb.value = 40;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 5");
        break;
        
        case 6:			
        world.add_area(area_desert());
        temp_area = world.areas.get(8);
        world.new_starting_room(temp_area.get_random_room());			
        
        world.add_area(area_mountains());
        temp_area = world.areas.get(9);
        world.new_starting_room(temp_area.get_random_room());
        
        world.add_area(area_century_city());
        world.add_area(area_futa_high());
        world.add_area(area_bee_hive());

        //aPb.value = 48;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 6");
        break;
        
        case 7:			
        world.add_area(area_under_lake());
        world.add_area(area_volcano());			
        temp_area = world.areas.get(14);
        world.new_starting_room(temp_area.get_random_room());
        
        world.add_area(area_snow_plain());
        temp_area = world.areas.get(15);
        world.new_starting_room(temp_area.get_random_room());
        
        world.add_area(area_spider_den());
        world.add_area(area_nunnery());
        world.add_area(area_amazon_beach());
        world.add_area(area_amazon_forest());
        
        //aPb.value = 56;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 7");
        break;
                    
        case 8:
        world.add_area(area_hell());			
        world.add_area(area_heaven());
        world.add_area(area_amazon_village());
        world.add_area(area_fpalace_tower());
        world.add_area(area_shrublands());
        temp_area = world.areas.get(24);
        world.new_starting_room(temp_area.get_random_room());
        
        //aPb.value = 64;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 8");
        break;
        
        case 9:
        world.add_area(area_ice_sheets());
        world.add_area(area_grass_hills());
        world.add_area(area_rainforest());
        world.add_area(area_savanna());
        temp_area = world.areas.get(28);
        world.new_starting_room(temp_area.get_random_room());
        
        LOGGER.info("adding 9... ");
        //aPb.value = 72;
        //aPb.setProgress(//aPb.value, 100);
        break;
        
        case 10:			
        world.add_area(area_castilla());
        world.add_area(area_ahimsa());			
        world.add_area(area_benevol());
        world.add_area(area_industria());
        world.add_area(area_mensch());			
        
        //aPb.value = 80;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 10... ");
        break;
        
        case 11:
        world.add_area(area_aghapei());
        world.add_area(area_grasslands_cave());
        world.add_area(area_fpalace_mausoleum());
        world.add_area(area_fpalace_warehouse());
        world.add_area(area_equine_encampment());
        world.add_area(area_swamp());
        world.add_area(witches_school());
        world.add_area(area_burrowton());
        world.add_area(area_tower_to_god());
        
        //aPb.value = 88;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 11... ");
        break;
        
        case 12:			
        Room grasslands_to_forest = new Room("The grasslands give way to a forest here. ");
        grasslands_to_forest.set_area_effects();			
        Room forest_to_grasslands = new Room("The forest cedes to grasslands here. ");
        forest_to_grasslands.set_area_effects();			
        world.connect_areas(2,6,grasslands_to_forest,forest_to_grasslands);			
        
        Room grasslands_to_desert = new Room("The grasslands disapate and are doing their best to grow in the sand here. ");
        grasslands_to_desert.set_area_effects();			
        Room desert_to_grasslands = new Room("Small grasses are growing in the sand here, the desert giving way to life. ");
        desert_to_grasslands.set_area_effects();
        world.connect_areas(2,8, grasslands_to_desert, desert_to_grasslands);
        
        Room desert_to_mountains = new Room("Outcroppings of rock are piercing through the sand here. ");
        desert_to_mountains.set_area_effects();			
        Room mountain_to_desert = new Room("Sand covers the rocky terrain here. ");
        mountain_to_desert.set_area_effects();			
        world.connect_areas(8,9, desert_to_mountains, mountain_to_desert);
        
        Room mountain_to_volcano = new Room("Even the rocks seem to give off heat here as the path leads on towards a volcano. ");
        mountain_to_volcano.set_area_effects();			
        Room volcano_to_mountain = new Room("The magma flows appear to be cooling off as they make their way down the mountain. ");
        volcano_to_mountain.set_area_effects();			
        world.connect_areas(9,14,mountain_to_volcano,volcano_to_mountain);
        
        Room mountain_to_snowplains = new Room("Snow covers the rocky terrain here. ");
        mountain_to_snowplains.set_area_effects();			
        Room snowplains_to_mountain = new Room("Outcroppings of rock are piercing through the snow here. ");
        snowplains_to_mountain.set_area_effects();			
        world.connect_areas(9,15,mountain_to_snowplains, snowplains_to_mountain);
        
        Room desert_to_shrubland = new Room("Small shrubs begin to dot the sand here. ");
        desert_to_shrubland.set_area_effects();			
        Room shrubland_to_desert = new Room("The soil turns to sand here. ");
        shrubland_to_desert.set_area_effects();			
        world.connect_areas(8, 24,desert_to_shrubland,shrubland_to_desert);
        
        Room snowplains_to_icesheets = new Room("Snow gives way to ice here. ");
        snowplains_to_icesheets.set_area_effects();			
        Room icesheets_to_snowplains = new Room("The ice begins to show signs of snow and frozen ground here. ");
        icesheets_to_snowplains.set_area_effects();			
        world.connect_areas(15, 25, snowplains_to_icesheets, icesheets_to_snowplains);
        
        Room forest_to_hills = new Room("The forest gives way to rolling green hills here. ");
        forest_to_hills.set_area_effects();			
        Room hills_to_forest = new Room("Trees begin to dot the landscape here. ");
        hills_to_forest.set_area_effects();			
        world.connect_areas(6, 26, forest_to_hills, hills_to_forest);
        
        Room forest_to_rainforest = new Room("The humidity is much higher here. ");
        forest_to_rainforest.set_area_effects();			
        Room rainforest_to_forest = new Room("The humidity seems to be less oppressive here. ");
        rainforest_to_forest.set_area_effects();			
        world.connect_areas(6, 27, forest_to_rainforest, rainforest_to_forest);
        
        Room hills_to_savanna = new Room("The hills give way to savanna here. ");
        hills_to_savanna.set_area_effects();			
        Room savanna_to_hills = new Room("The savanna turns to rolling hills here. ");
        savanna_to_hills.set_area_effects();			
        world.connect_areas(26,28, hills_to_savanna, savanna_to_hills);
        
        Room shrubland_to_swamp = new Room("The humidity seems to rise as small pools of water are visible near the small shrubs. ");
        shrubland_to_swamp.set_area_effects();			
        Room swamp_to_shrubland = new Room("Small shrubs are visible here amongst the reeds and water. ");
        swamp_to_shrubland.set_area_effects();			
        world.connect_areas(24,39,shrubland_to_swamp,swamp_to_shrubland);			
        
        world.connect_areas(0,2,null, null, true);
        world.connect_areas(2,7,null, null, true);
        world.connect_areas(8,10, null, null, true);
        world.connect_areas(10,11,null, null, true);	
        world.connect_areas(6,12,null, null, true);
        world.connect_areas(9,13, null, null, true);
        world.connect_areas(6,16,null, null, true);
        world.connect_areas(9,17,null, null, true);	
        world.connect_areas(19,22, null, null, true);
        world.connect_areas(20, 23, null, null, true);
        world.connect_areas(21, 23, null, null, true);
        world.connect_areas(15,29, null, null, true);
        world.connect_areas(6,30, null, null, true);
        world.connect_areas(9,31, null, null, true);
        world.connect_areas(14,32, null, null, true);
        world.connect_areas(28,33, null, null, true);
        world.connect_areas(24,34, null, null, true);
        world.connect_areas(2,35, null, null, true);
        world.connect_areas(35,36, null, null, true);
        world.connect_areas(36,37, null, null, true);
        world.connect_areas(26,38, null, null, true);
        world.connect_areas(2,41, null, null, true);
        world.connect_areas(21,42,null,null, true);
        world.map_gen();//generate some water before placing islands and the like
        
        //aPb.value = 96;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 12...");
        break;
        
        case 13:			
        Room beach_to_forest = new Room("Trees grow from the sand here. ");
        beach_to_forest.set_area_effects();			
        Room forest_to_beach = new Room("The soil turns to sand here. ");
        forest_to_beach.set_area_effects();			
        world.connect_areas(18,19,beach_to_forest,forest_to_beach);				
        
        world.map_gen();
        world.finalizeThis();
        
        FPalaceHelper.get_monster_mob().initialize_mob();
        FPalaceHelper.get_sin_mob().initialize_mob();
            FPalaceHelper.get_empress_mob().initialize_mob();
            FPalaceHelper.get_amazon_mob().initialize_mob();
        FPalaceHelper.get_humility_mob().initialize_mob();
        FPalaceHelper.get_kindness_mob().initialize_mob();
        FPalaceHelper.get_patience_mob().initialize_mob();
        FPalaceHelper.get_diligence_mob().initialize_mob();
            FPalaceHelper.get_freedom_farm_mob().initialize_mob();
        FPalaceHelper.get_charity_mob().initialize_mob();
        FPalaceHelper.get_temperance_mob().initialize_mob();
        FPalaceHelper.get_chastity_mob().initialize_mob();
        
        //aPb.value = 100;
        //aPb.setProgress(//aPb.value, 100);
        LOGGER.info("adding 13...");
        break;
        
        default:
        world.tick();
        LOGGER.info("adding some time before the player gets to the world... " + step_num);
        }

        return world;
    }
    
    public static Area area_fpalace_tower(){
        Area area = new Area("Futanari Palace Tower");
        area.set_move_time(1);
        
        Room tower_to_intro = new Room("This is a small cramped tower with stairs heading both up and down from where you stand. Fortunately theres a door here so you have room to breath. ");
        int loop_int = 0;
        Room last_room = tower_to_intro;
        for (loop_int=0;loop_int<10;loop_int++){
            Room room = new Room("You're standing on a set of stairs inside a surprisingly cramped tower for how high it seems to go. ");
            room.new_exit(last_room, "Down");
            last_room.new_exit(room, "Up");
            last_room = room;
        }
        
        Room tower_to_heaven = new Room("You finally find your self atop the flight of stairs, and are met with the sight of a giant set of gates amidst clouds. ");
        last_room.new_exit(tower_to_heaven, "Up");
        tower_to_heaven.new_exit(last_room, "Down");
        
        last_room = tower_to_intro;
        
        for (loop_int=0;loop_int<10;loop_int++){
            Room room = new Room("You're standing on a set of stairs inside a surprisingly cramped tower for how high it seems to go. ");
            room.new_exit(last_room, "Up");
            last_room.new_exit(room, "Down");
            last_room = room;
        }
        
        Room tower_to_hell = new Room("You find your self at the bottom of a tall set of stairs, leading away from which there is bleak rock and a some how omnipresent light that shows no sky. ");
        last_room.new_exit(tower_to_hell, "Down");
        tower_to_hell.new_exit(last_room, "Up");
        
        area.add_room(tower_to_intro);
        
        area.add_connect_room(tower_to_intro);
        area.add_connect_room(tower_to_heaven);
        area.add_connect_room(tower_to_hell);
        
        return area;
    }
    
    public static Area area_fpalace_forum(){
        //The palace! Slime Girls(done!), members, and I'd like a throne room with a Slime Queen Herm
        //Shop sells: Nude pictures of course. Probably need a few more items, but at least s\he is there
        Area area = new Area("Futanari Palace");
        area.set_move_time(1);
        
        Template_Room template_room = new Template_Room("This is a stone hallway, with little clutter. There is heavy red carpet in the middle of the floor, placed on dusty Marble floors. ");
        
        Container cont = new Container();
        cont.set_name("Chest");
        cont.set_description("There is a <s0>Chest</s0> against a wall. ");
        cont.add_sub_descriptions("It is a sturdy wood and iron chest. ");

        cont.add_content(FPalace_items.gold(5));
        cont.add_content(FPalace_items.Healing_Draught());
        template_room.add_container(cont,0.2);

        cont = new Container();
        cont.set_name("Stand");
        cont.set_description("There is a <s0>Stand</s0> against the wall. ");
        cont.add_sub_descriptions("It looks a bit like a nightstand, and even has a sliding drawer. ");

        cont.add_content(FPalace_items.spent_tissues());
        template_room.add_container(cont,0.3);
        
        template_room.add_character(FPalace_npcs.goo_girl(),0.3);
        template_room.add_character(FPalace_npcs.FPalace_Futa(),0.3);
        template_room.add_character(FPalace_npcs.FPalace_Shemale(),0.2);
        template_room.add_character(FPalace_npcs.FPalace_Herm(),0.1);
        
        template_room.set_max_same_exits(2);
        
        area.add_room_template(template_room);
        area.random_area(15);
        
        Room fpalace_rest_room = new Room("This room is completely filled with <a0>, many of them occupied. ");
        CharAction rest_action = new CharAction();
        rest_action.set_rest_flag();
        rest_action.setName("beds");
        
        rest_action.set_dialogue("You lay down and rest on one of the beds. It is surprisingly comfy, and appears to have been laundered. ");
        
        fpalace_rest_room.addAction(rest_action);
        
        area.add_room(fpalace_rest_room);

        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
                    
        Room room = new Room("The <s2>stone hallway</s2> ends here, and you can see up a <s0>tower</s0> for what seems like miles. ");
        room.add_sub_descriptions("The tower just keeps going up and up... you can even see little <s1>clouds</s1>. ");
        room.add_sub_descriptions("The little clouds appear a bit angry, and are crackling thunder at nearby <a0>. ");
        room.add_sub_descriptions("Inspecting the base of the tower, you spot a <a1> cradled by an alchove. ");
        //want to have one more description that trigger an action that causes a body to appear in the room. The body has a key, that triggers another action
        //creating an up and down exit... one to heaven, one to hell - done, though heaven and hell are lacking
        room.set_id(-1);
        
        CharAction a = new CharAction();
        a.setName("winged creatures");
        a.set_dialogue("As you gaze up, trying to get a better view, you catch sight of lightning striking one of the creatures.\n", 0);
        
        Challenge c = new Challenge();
        c.set_attack_stat(FPalaceHelper.dex_id);
        c.set_defense_stat(-1,10);
        c.setVariability(20);
        c.setText("creatures");
        RoomConsequence rcon = new RoomConsequence();
        //need this to add a 'bloody mess' container to the room with a key - Done!
        
        cont = new Container();
        cont.set_name("Bloody mess");
        cont.set_always_open();
        cont.set_description("There is a <s0>Bloody mess</s0> about the room. ");
        cont.add_sub_descriptions("You can still see bits and pieces of bone laying about, and a torn apart robe, but mostly there's just blood. ");
        cont.add_content(FPalace_items.FPalace_tower_key());
        
        rcon.add_container_creation(cont,room);
        rcon.addConsequence(FPalaceHelper.dex_id,1, "The winged thing appears more and more humanoid as it gets closer in it's decent. You find it difficult to avert your stare, never having seen a falling angel before, but never the less manage to step aside as it crashes into a bloody mess upon contact with the ground. ",0);
        rcon.addConsequence(FPalaceHelper.curr_hp_id,-5, "The winged thing appears more and more humanoid as it gets closer in it's decent. You find it difficult to avert your stare, never having seen a falling angel before, and don't quite manage to get out of the way as the angelic creature smashes into the ground you were standing on. ",-1);
        rcon.set_reward(2);
        rcon.set_always_change();
        a.addChallenge(c,rcon);

        //I'd like it if this could only happen once too - Done! second number below is max number of times the action can be done.
        room.addAction(a,1);
        
        //next step in this is making another event appear in the room text for a door, which leads into our tower - Done
        a = new CharAction();
        a.setName("small door");
        
        a.set_dialogue("The small </c0> is incredibly non-descript. Almost like it was intended to be hidden.\n");
        a.set_item_requirement(FPalace_items.FPalace_tower_key());
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("door");
        rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(room, /*tower_to_intro*/null);//,"Door")
        rcon.set_join_area(23);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        a.addChallenge(c,rcon);
        
        room.addAction(a);
        
        area.add_room(room);
        Room intro_to_library = new Room("The stone hallway ends here, and you can see a <s0>large door</s0> with the image of a book inscribed in it. ");
        intro_to_library.add_sub_descriptions("The door is solid and wooden, a large <a0> and two wooden handles evident. ");
        intro_to_library.set_id(-1);
        
        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("You see a keyhole clearly looking to be </c0>.\n");
        a.set_item_requirement(FPalace_items.FPalace_membership());
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("used");
        rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(intro_to_library, /*library_to_into*/null);//,"Door")
        rcon.set_join_area(1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        a.addChallenge(c,rcon);

        intro_to_library.addAction(a);

        area.add_room(intro_to_library);

        Room intro_to_images = new Room("The stone hallway ends here, and you can see a <s0>large door</s0> with a vulgar image glued to it. ");
        intro_to_images.add_sub_descriptions("The door is solid and wooden, a large <a0> and two wooden handles evident. ");
        intro_to_images.set_id(-1);

        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("You see a keyhole clearly looking to be </c0>.\n");
        a.set_item_requirement(FPalace_items.FPalace_membership());
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("used");
        rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(intro_to_images, /*images_to_intro*/null);//,"Door")
        rcon.set_join_area(3);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        a.addChallenge(c,rcon);

        intro_to_images.addAction(a);

        area.add_room(intro_to_images);

        Room intro_to_writers = new Room("The stone hallway ends here, and you can see a <s0>large door</s0> with a pen and quill inscribed in it. ");
        intro_to_writers.add_sub_descriptions("The door is solid and wooden, a large <a0> and two wooden handles evident. ");
        intro_to_writers.set_id(-1);

        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("You see a keyhole clearly looking to be </c0>.\n");
        a.set_item_requirement(FPalace_items.FPalace_membership());
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("used");
        rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(intro_to_writers, /*writers_to_into*/null);//,"Door")
        rcon.set_join_area(4);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        a.addChallenge(c,rcon);

        intro_to_writers.addAction(a);

        area.add_room(intro_to_writers);

        Room intro_to_artist = new Room("The stone hallway ends here, and you can see a <s0>large door</s0> with a paintbrush inscribed in it. ");
        intro_to_artist.add_sub_descriptions("The door is solid and wooden, a large <a0> and two wooden handles evident. ");
        intro_to_artist.set_id(-1);

        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("You see a keyhole clearly looking to be </c0>.\n");
        a.set_item_requirement(FPalace_items.FPalace_membership());
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("used");
        rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(intro_to_artist, /*artist_to_intro*/null);//,"Door")
        rcon.set_join_area(5);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        a.addChallenge(c,rcon);

        intro_to_artist.addAction(a);

        area.add_room(intro_to_artist);
        
        Template_Room palace_template = new Template_Room("");
        palace_template.set_filler_connect();
        palace_template.add_no_connect_template(template_room);
        palace_template.set_max_same_exits(0);
        
        Room throne_antechamber = new Room("An enormous gilded door stands here, gold and silver shining, despite large traces of different coloured slimes across it. ");
        throne_antechamber.set_id(-1);
        
        Room throne_room_entrance = new Room("This is the entrance to the palaces throne room. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that comes from the overly adorned door. ");
        throne_room_entrance.set_id(-1);
        throne_room_entrance.set_template(palace_template);
        
        Room throne_central_carpet1 = new Room("There is a large plush red carpet with gold gilding the edges on the floor here. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_central_carpet1.set_id(-1);
        throne_central_carpet1.set_template(palace_template);
        
        Room throne_central_carpet2 = new Room("There is a large plush red carpet with gold gilding the edges on the floor here. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_central_carpet2.set_id(-1);
        throne_central_carpet2.set_template(palace_template);
        
        Room throne_central_carpet3 = new Room("There is a large plush red carpet with gold gilding the edges on the floor here. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne nearby to the north. ");
        throne_central_carpet3.set_id(-1);
        throne_central_carpet3.set_template(palace_template);
        
        Room throne_central_carpet4 = new Room("There is a large plush red carpet with gold gilding the edges on steps here. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne directly to the north. ");
        throne_central_carpet4.set_id(-1);
        throne_central_carpet4.set_template(palace_template);
        
        Room throne_proper = new Room("A large golden chair, with plush red apolstery, sits here, overlooking the entire throne room. ");
        throne_proper.set_id(-1);
        throne_proper.set_template(palace_template);
        
        Room throne_gallery_east_entrance = new Room("A few steps lead down to the west into the throne room proper, while to the east, the gallery begins in earnest. ");
        throne_gallery_east_entrance.set_id(-1);
        throne_gallery_east_entrance.set_template(palace_template);
        
        Room throne_carpet1_east = new Room("There is a large plush red carpet with gold gilding the edges to the west, and a gallery, raised a few feet and a railing, to the east. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_carpet1_east.set_id(-1);
        throne_carpet1_east.set_template(palace_template);
        
        Room throne_carpet2_east = new Room("There is a large plush red carpet with gold gilding the edges to the west, and a gallery, raised a few feet and a railing, to the east. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_carpet2_east.set_id(-1);
        throne_carpet2_east.set_template(palace_template);
        
        Room throne_carpet3_east = new Room("There is a large plush red carpet with gold gilding the edges to the west, and a gallery, raised a few feet and a railing, to the east. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_carpet3_east.set_id(-1);
        throne_carpet3_east.set_template(palace_template);
        
        Room throne_gallery1_east = new Room("A few steps lead down to the west into the throne room proper, while to the north, the gallery begins in earnest. Open space, covered in multi-coloured slime, lies to the north west, over a railing. ");
        throne_gallery1_east.set_id(-1);
        throne_gallery1_east.set_template(palace_template);
        
        Room throne_gallery2_east = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne. Open space, covered in multi-coloured slime, lies to the west, over a railing. ");
        throne_gallery2_east.set_id(-1);
        throne_gallery2_east.set_template(palace_template);
        
        Room throne_gallery3_east = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne. Open space, covered in multi-coloured slime, lies to the west, over a railing. ");
        throne_gallery3_east.set_id(-1);
        throne_gallery3_east.set_template(palace_template);
        
        Room throne_gallery4_east = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne. Open space, covered in multi-coloured slime, lies to the west, over a railing. ");
        throne_gallery4_east.set_id(-1);
        throne_gallery4_east.set_template(palace_template);
        
        Room throne_gallery5_east = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne, which lies to the west. Open space, covered in multi-coloured slime, lies to the south west, over a railing. ");
        throne_gallery5_east.set_id(-1);
        throne_gallery5_east.set_template(palace_template);
        
        Room throne_gallery6_east = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne, which lies directly to the west. Open space, covered in multi-coloured slime, lies to the south, over a railing. ");
        throne_gallery6_east.set_id(-1);
        throne_gallery6_east.set_template(palace_template);
        
        Room throne_carpet1_west = new Room("There is a large plush red carpet with gold gilding the edges to the east, and a gallery, raised a few feet and a railing, to the west. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_carpet1_west.set_id(-1);
        throne_carpet1_west.set_template(palace_template);
        
        Room throne_carpet2_west = new Room("There is a large plush red carpet with gold gilding the edges to the east, and a gallery, raised a few feet and a railing, to the west. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_carpet2_west.set_id(-1);
        throne_carpet2_west.set_template(palace_template);
        
        Room throne_carpet3_west = new Room("There is a large plush red carpet with gold gilding the edges to the east, and a gallery, raised a few feet and a railing, to the west. Trails of slime, every colour of the rainbow, cross the room and elaborate red carpet that leads towards the throne to the north. ");
        throne_carpet3_west.set_id(-1);
        throne_carpet3_west.set_template(palace_template);
        
        Room throne_gallery_west_entrance = new Room("A few steps lead down to the east into the throne room proper, while to the west, the gallery begins in earnest. ");
        throne_gallery_west_entrance.set_id(-1);
        throne_gallery_west_entrance.set_template(palace_template);
        
        Room throne_gallery1_west = new Room("A few steps lead down to the east into the throne room proper, while to the north, the gallery begins in earnest. Open space, covered in multi-coloured slime, lies to the north east, over a railing. ");
        throne_gallery1_west.set_id(-1);
        throne_gallery1_west.set_template(palace_template);
        
        Room throne_gallery2_west = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne. Open space, covered in multi-coloured slime, lies to the east, over a railing. ");
        throne_gallery2_west.set_id(-1);
        throne_gallery2_west.set_template(palace_template);
        
        Room throne_gallery3_west = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne. Open space, covered in multi-coloured slime, lies to the east, over a railing. ");
        throne_gallery3_west.set_id(-1);
        throne_gallery3_west.set_template(palace_template);
        
        Room throne_gallery4_west = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne. Open space, covered in multi-coloured slime, lies to the east, over a railing. ");
        throne_gallery4_west.set_id(-1);
        throne_gallery4_west.set_template(palace_template);
        
        Room throne_gallery5_west = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne, which lies to the west. Open space, covered in multi-coloured slime, lies to the south west, over a railing. ");
        throne_gallery5_west.set_id(-1);
        throne_gallery5_west.set_template(palace_template);
        
        Room throne_gallery6_west = new Room("This is a gallery, overlooking the throne room, though still sitting below the throne, which lies directly to the east. Open space, covered in multi-coloured slime, lies to the south, over a railing. ");
        throne_gallery6_west.set_id(-1);
        throne_gallery6_west.set_template(palace_template);
        
        
        
        throne_antechamber.new_exit(throne_room_entrance, "Gilded Door");
        throne_room_entrance.new_exit(throne_antechamber, "Door");
        
        throne_room_entrance.new_exit(throne_central_carpet1, "North");
        throne_central_carpet1.new_exit(throne_room_entrance, "South");
        
        throne_central_carpet1.new_exit(throne_central_carpet2, "North");
        throne_central_carpet2.new_exit(throne_central_carpet1, "South");
        
        throne_central_carpet2.new_exit(throne_central_carpet3, "North");
        throne_central_carpet3.new_exit(throne_central_carpet2, "South");
        
        throne_central_carpet3.new_exit(throne_central_carpet4, "North");
        throne_central_carpet4.new_exit(throne_central_carpet3, "South");
        
        throne_room_entrance.new_exit(throne_gallery_east_entrance, "East");
        throne_gallery_east_entrance.new_exit(throne_room_entrance, "West");
        
        throne_room_entrance.new_exit(throne_carpet1_east, "North-East");
        throne_carpet1_east.new_exit(throne_room_entrance, "South-West");
        
        throne_central_carpet1.new_exit(throne_carpet1_east, "East");
        throne_carpet1_east.new_exit(throne_central_carpet1, "West");
        
        throne_central_carpet2.new_exit(throne_carpet1_east, "South-East");
        throne_carpet1_east.new_exit(throne_central_carpet2, "North-West");
        
        throne_central_carpet1.new_exit(throne_carpet2_east, "North-East");
        throne_carpet2_east.new_exit(throne_central_carpet1, "South-West");
        
        throne_central_carpet2.new_exit(throne_carpet2_east, "East");
        throne_carpet2_east.new_exit(throne_central_carpet2, "West");
        
        throne_central_carpet3.new_exit(throne_carpet2_east, "South-East");
        throne_carpet2_east.new_exit(throne_central_carpet3, "North-West");
        
        throne_central_carpet2.new_exit(throne_carpet3_east, "North-East");
        throne_carpet3_east.new_exit(throne_central_carpet2, "South-West");
        
        throne_central_carpet3.new_exit(throne_carpet3_east, "East");
        throne_carpet3_east.new_exit(throne_central_carpet3, "West");
        
        throne_central_carpet4.new_exit(throne_carpet3_east, "South-East");
        throne_carpet3_east.new_exit(throne_central_carpet4, "North-West");
        
        throne_carpet1_east.new_exit(throne_carpet2_east, "North");
        throne_carpet2_east.new_exit(throne_carpet1_east, "South");
        
        throne_carpet2_east.new_exit(throne_carpet3_east, "North");
        throne_carpet3_east.new_exit(throne_carpet2_east, "South");
        
        throne_gallery_east_entrance.new_exit(throne_gallery1_east, "East");
        throne_gallery1_east.new_exit(throne_gallery_east_entrance, "West");
        
        throne_gallery1_east.new_exit(throne_gallery2_east, "North");
        throne_gallery2_east.new_exit(throne_gallery1_east, "South");
        
        throne_gallery2_east.new_exit(throne_gallery3_east, "North");
        throne_gallery3_east.new_exit(throne_gallery2_east, "South");
        
        throne_gallery3_east.new_exit(throne_gallery4_east, "North");
        throne_gallery4_east.new_exit(throne_gallery3_east, "South");
        
        throne_gallery4_east.new_exit(throne_gallery5_east, "North");
        throne_gallery5_east.new_exit(throne_gallery4_east, "South");
        
        throne_central_carpet4.new_exit(throne_gallery6_east, "East");
        throne_gallery6_east.new_exit(throne_central_carpet4, "West");
        
        throne_gallery6_east.new_exit(throne_gallery5_east, "East");
        throne_gallery5_east.new_exit(throne_gallery6_east, "West");
        
        throne_room_entrance.new_exit(throne_carpet1_west, "North-West");
        throne_carpet1_west.new_exit(throne_room_entrance, "South-East");
        
        throne_central_carpet1.new_exit(throne_carpet1_west, "West");
        throne_carpet1_west.new_exit(throne_central_carpet1, "East");
        
        throne_central_carpet2.new_exit(throne_carpet1_west, "South-West");
        throne_carpet1_west.new_exit(throne_central_carpet2, "North-East");
        
        throne_central_carpet1.new_exit(throne_carpet2_west, "North-West");
        throne_carpet2_west.new_exit(throne_central_carpet1, "South-East");
        
        throne_central_carpet2.new_exit(throne_carpet2_west, "West");
        throne_carpet2_west.new_exit(throne_central_carpet2, "East");
        
        throne_central_carpet3.new_exit(throne_carpet2_west, "South-West");
        throne_carpet2_west.new_exit(throne_central_carpet3, "North-East");
        
        throne_central_carpet2.new_exit(throne_carpet3_west, "North-West");
        throne_carpet3_west.new_exit(throne_central_carpet2, "South-East");
        
        throne_central_carpet3.new_exit(throne_carpet3_west, "West");
        throne_carpet3_west.new_exit(throne_central_carpet3, "East");
        
        throne_central_carpet4.new_exit(throne_carpet3_west, "South-West");
        throne_carpet3_west.new_exit(throne_central_carpet4, "North-East");
        
        throne_carpet1_west.new_exit(throne_carpet2_west, "North");
        throne_carpet2_west.new_exit(throne_carpet1_west, "South");
        
        throne_carpet2_west.new_exit(throne_carpet3_west, "North");
        throne_carpet3_west.new_exit(throne_carpet2_west, "South");
        
        throne_room_entrance.new_exit(throne_gallery_west_entrance, "West");
        throne_gallery_west_entrance.new_exit(throne_room_entrance, "East");
        
        throne_gallery_west_entrance.new_exit(throne_gallery1_west, "West");
        throne_gallery1_west.new_exit(throne_gallery_west_entrance, "East");
        
        throne_gallery1_west.new_exit(throne_gallery2_west, "North");
        throne_gallery2_west.new_exit(throne_gallery1_west, "South");
        
        throne_gallery2_west.new_exit(throne_gallery3_west, "North");
        throne_gallery3_west.new_exit(throne_gallery2_west, "South");
        
        throne_gallery3_west.new_exit(throne_gallery4_west, "North");
        throne_gallery4_west.new_exit(throne_gallery3_west, "South");
        
        throne_gallery4_west.new_exit(throne_gallery5_west, "North");
        throne_gallery5_west.new_exit(throne_gallery4_west, "South");
        
        throne_central_carpet4.new_exit(throne_gallery6_west, "West");
        throne_gallery6_west.new_exit(throne_central_carpet4, "East");
        
        throne_gallery6_west.new_exit(throne_gallery5_west, "West");
        throne_gallery5_west.new_exit(throne_gallery6_west, "East");
        
        throne_central_carpet4.new_exit(throne_proper, "North");
        throne_proper.new_exit(throne_central_carpet4, "South");
        
        
        area.add_room(throne_antechamber);
        
        Character creature = FPalace_npcs.FPalace_guardian();			
        creature.new_location(throne_antechamber);
        
        Room alchemy_room = new Room("This is a small alcove, filled with bottles, cleaning supplies, a tap, and, amazingly, a <s0>small bench</s0>. ");
        alchemy_room.add_sub_descriptions("The bench seems to have a number of devices useful for <a0> and a number of stains of... questionable origin. ");
        alchemy_room.set_id(-1);
        
        a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        alchemy_room.addAction(a);
        
        
        area.add_room(alchemy_room);

        Template_Room intro_template = new Template_Room("");
        intro_template.add_no_connect_template(palace_template);
        intro_template.set_max_exits(3);

        Room intro_to_plains = new Room("The stone hallway ends here, and you can see a Huge open door leading out into the daylight. ");
        intro_to_plains.set_id(-1);
        intro_to_plains.set_template(intro_template);
        
        Template_Room store = new Template_Room("This shop almost seems like a gift boutique. ");
        store.set_map_room_colour(0x5C4033);
        store.set_no_area_exit();
        store.add_no_connect_template(template_room);
        
        store.add_character(FPalace_npcs.fpalace_shopkeeper(), 1);
        
        Room fpalace_shop = store.make_room();
        
        intro_to_plains.new_exit(fpalace_shop, "Down");
        fpalace_shop.new_exit(intro_to_plains, "Up");
        
        area.add_room(intro_to_plains);
        area.add_connect_room(intro_to_plains);
        
        a = new CharAction();
        a.setName("");
        a.set_item_requirement(FPalace_items.FPalace_membership());
        a.set_force_failure();


        a.set_dialogue("As you pass attempt to pass through the door, a bouncer seems to appear from nowhere, asking to see your membership. ",0);

        c = new Challenge();
        
        c.set_attack_stat(FPalaceHelper.curr_hp_id);
        c.set_defense_stat(-1,1);
        c.setVariability(0);
        
        c.setText("membership");

        rcon = new RoomConsequence();
        
        rcon.addConsequence(FPalaceHelper.curr_hp_id,0, "You show your membership key and she apologizes for the mixup. ",0);
        rcon.add_room_effect(intro_to_plains.get_exit(0));
        rcon.addConsequence(FPalaceHelper.lust_id,5, "You don't have anything that looks like a membership, and so the bouncer grabs you rather roughly dragging you back to the entrance. You feel slightly used after all the groping. ",-1);

        a.addChallenge(c,rcon);
        
        intro_to_plains.add_exit_action(intro_to_plains.get_exit(0), a);
        
        
                                

        Room trans_reception = new Room("This is a reception room. There are <s0>magazines</s0> on a small table in the center of the room, and some chairs. ");
        trans_reception.add_sub_descriptions("The magazines are all about futanari, and their day to day <s1>troubles</s1>. ");
        trans_reception.add_sub_descriptions("Apparently futa have alot of problems... there are a plethora of articles about how to deal with their <a0>. ");
        trans_reception.set_id(-1);

        CharAction a2 = new CharAction();
        a2.setName("bodies");
        a2.set_dialogue("The magazines go into fine details about how to </c0> discreetly.\n");

        Challenge c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.wis_id);
        c2.set_defense_stat(-1,5);
        c2.static_defense_climb(5);
        c2.setVariability(10);
        c2.setText("masturbate");
        Consequence con2 = new Consequence();

        con2.addConsequence(FPalaceHelper.lust_id,15, "Even if you didn't mean too, you find yourself hot reading the articles. ",-1);
        con2.addConsequence(FPalaceHelper.int_id,1, "You manage to discover from the magazines that there are three primary types of futa... they get their secondary characteristics from magic, science, or alchemy, and as such, deal with masturbation in different ways. ",0);

        a2.addChallenge(c2,con2);

        trans_reception.addAction(a2);

        
        
        Room trans_hall = new Room("You're in an odd intersection. With the almost pleasent looking door at your back you can see down three <s0>hallways</s0>. ");
        trans_hall.add_sub_descriptions("The hall to the north is covered in blood smears and ends in a battered looking wooden door. To the west are flashing coloured lights and music that vibrates the mortar from the corridor. To the east is a rather plain, and non-discript hallway that ends with a leather door. ");
        trans_hall.set_id(-1);

        trans_hall.new_exit(trans_reception, "Reception room");
        trans_reception.new_exit(trans_hall, "Door");
        
        
        Room trans_science = new Room("You are trapped inside a large plastic <s0>tube</s0>, floating in a strange liquid that still lets you breath. Outside of the tube you can see an operation table covered in blood. ");
        trans_science.add_sub_descriptions("As you look around the tube, you notice there is a large <a1> at the bottom past your feet. ");
        trans_science.set_id(-1);
        trans_science.set_discovery_difficulty(-1);
        trans_science.set_locate_difficulty(-1);
        //I want this exit to trigger an action (aka, going through the exit causes the action) - done
        a2 = new CharAction();
        a2.setName("");

        a2.set_dialogue("As you pass through the door you hear a </c0>. ");

        c2 = new Challenge();
        c2.set_attack_stat(-1,1);//FPalaceHelper.dex_id) original comment
        c2.set_defense_stat(-1, 27);
        c2.setVariability(4);
        c2.setText("chuckle");

        RoomConsequence rcon2 = new RoomConsequence();
        rcon2.set_change_on_success();
        //need success consequence here to spawn character and start combat
        rcon2.addConsequence(FPalaceHelper.curr_hp_id,0, "You manage to duck away at the last second, evading a blow to your head. ",0);
        rcon2.addConsequence(FPalaceHelper.lust_id,5, "There is a sharp pain in the back of your head, and you find yourself in a dream like-state. Occasionally you see a pair of </c1> that seem to be part of the ceiling. ",-1);
        rcon2.add_room_effect(trans_science);
        
        a2.addChallenge(c2,rcon2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("eyes");

        //need change to only happen on failure... - done
        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.lust_id,2, "You feel some pleasurable stroking of your manhood, and a side commment about </c2>. A hand is stroking your </c5> soothingly. ",0);

        con2.add_change_effect(FPalaceHelper.new_penis(null));
        con2.addConsequence(FPalaceHelper.curr_hp_id,-1, "There are mumblings about whether or not </c3> are in order, after a dull fire on the edge of your fuzzy senses. Another hand grabs one of your </c6>s measuring it. ",-1);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("size");

        con2 = new Consequence();
        con2.addConsequence(FPalaceHelper.balls_size_id,1, "There is a pricking sensation what seems like miles away. ",0,1);
        con2.addConsequence(FPalaceHelper.penis_girth_id,1, "It almost feels like wind is rushing across the skin of your shaft. ",0,1);
        con2.addConsequence(FPalaceHelper.penis_length_id,3, "You begin to hear mumblings and feel a sharp jab just below your </c4>. You can't move your head to see what it was, but see another hand reach up and grab at your </c5>. ",0,1);

        con2.addConsequence(FPalaceHelper.int_id,0, "A hand reaches into your view and grabs a </c6>, squeezing it. ",-1);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.balls_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("balls");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.lust_id,2, "Suddenly there is a feeling of release after the fire, and additional weight on your frame. A hand reaches into your view and grabs a </c6>, though the feeling is distant. ",-1);
        con2.add_change_effect(FPalaceHelper.new_balls(null));
        
        con2.addConsequence(FPalaceHelper.int_id,0, "You hear a fuzzy and out of focus comment about </c6>s. ",0);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("scrotum");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.str_id,0, "There is a sharp pain, and you once more pass out completely. When you come to again it feels as though a hole has opened in your body, and the flesh left tingles at it's new sensation. You find yourself unrestrained, and upon looking down, find a full set of breasts on your body. ",-1);
        con2.add_change_effect(FPalaceHelper.new_breasts(null));
        con2.add_change_effect(FPalaceHelper.new_vagina(null));
        con2.add_change_effect(FPalaceHelper.new_clit(null));
        
        con2.addConsequence(FPalaceHelper.int_id,0, "A finger pokes a </c6> and you only vaguely feel the sensation. ",0);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("chest");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.str_id,0, "A hand clamps over your mouth and you find yourself completely unconcious. When you come to, you find you have bumps where none were before, and nipples with unfamiliar sensitivity. ",-1);
        con2.add_change_effect(FPalaceHelper.new_breasts(null));
        
        
        con2.addConsequence(FPalaceHelper.int_id,0, "You're only vaguely aware of a constant massaging in one of your </c6>s. ",0);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("breast");

        con2 = new Consequence();
        con2.addConsequence(FPalaceHelper.breast_size_id,1, "There is a sharp jabbing sensation in your chest suddenly, and you begin to once again lose conciousness. When you come to, you find yourself with a significantly more sizable bust line, floating in a strange liquid. ",0,1);
        con2.addConsequence(FPalaceHelper.str_id,0, "There is a sharp jabbing sensation on your arm suddenly, and you begin to once again lose conciousness. When you come to, you find yourself trapped inside a tube, floating in a strange liquid. ",-1,1);
        
        a2.addChallenge(c2,con2);

        trans_hall.new_exit(trans_science,"North");
        trans_hall.add_exit_action(trans_science, a2);
        trans_science.addAction(a2);

        a2 = new CharAction();
        a2.setName("red latch");

        a2.set_dialogue("The latch seems to be an emergency pump release, and it seems like it would take quite a </c0> to flip it. ");

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.str_id);
        c2.set_defense_stat(-1, 8);
        c2.setVariability(5);
        c2.setText("pull");

        rcon2 = new RoomConsequence();
        rcon2.add_room_effect(intro_to_plains);
        rcon2.addConsequence(FPalaceHelper.dex_id,0, "You pull the latch, and manage to control your passage as you get sucked down through a complex series of curves and turns. You exit near the Palaces main entrance, and manages to land semi-gracefully. ",0);
        rcon2.addConsequence(FPalaceHelper.curr_hp_id,-4, "You pull the latch and manage to jam yourself in the tube poorly, the sudden release of the fluid with air shocking you. The tube once again fills up with the fluid, and small metalic arms reach up from the top of the tube towards you. They do nothing but poke you for a few moments before retreating back into their un-knowable holes. ",-1);

        a2.addChallenge(c2,rcon2);
        trans_science.addAction(a2);

        
        Room trans_stripper = new Room("Bright flashing lights assault your eyes as you gaze around, catching glances of figures on poles. The only consistantly lit part of the room appears to be some sort of bar. ");
        trans_stripper.set_id(-1);
        //want this room to have a character to talk to (and as such, a conversation topic) instead of the room actions of the others
        
        Character  fpalace_bartender= FPalace_npcs.FPalace_bartender();
                    
        //need to move this to Conversation_topic... or not. It's a one off topic
        Conversation_topic bartender_convert = new Conversation_topic();
        bartender_convert.set_no_spread();
        bartender_convert.set_topic_name("Strip-club");
        
        a = new CharAction();
        a.setName("Dancing figures");
        a.set_dialogue("The Bartender catches you glancing at the figures on the poles and asks \"Like what you </c0>, do you?\" The smile on her face is telling. \"Or do you want a </c1>?\". ");
        Challenge challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.penis_length_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("see");
        Consequence consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "\"They'll give </c2>, if you've got the cash...\" the bartender says suggestively, but continues \"Or you can </c3> yourself...\" She says looking you up and down \"We're always looking for new dancers.\" ",0);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"Not often we see your sort around here...\" the bartender says to you, raising an eyebrow. \"Or are you looking for </c4>?\" The twinkle in her eye leaves you wondering just what kind of </c4>. " ,-1);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.penis_length_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("drink");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "It's a little pricy, but I have some </c12> from the mountains for 20 gold a pint\n",0,0,0,6);//Drinks on offer for men/herms/shemales/male-eunuchs: Grow Breasts, Grow Breasts + Vag
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "I've got some wonderful </c5> for 2 gold\n",-1,0,0,6);//Drinks on offer for women/female-eunuchs/androgynous: Grow Penis, Grow Penis + Balls
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,15);
        challenge.setVariability(0);
        challenge.setText("private dances");
        ItemConsequence iconsequence = new ItemConsequence();
        iconsequence.addConsequence(FPalaceHelper.lust_id, 50, "The bartender takes your gold and points to a booth you hadn't noticed before. A dancer appears almost immediately, wearing a two piece bikini that doesn't particularly fit, her areola peeking out from behind the triangles of the top. She grinds against you, her back to your face, and you can feel an aditional bulge against your groin as her ass gyrates.\nBefore long she leaves, without even looking back at you. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.gold(-15), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
        challenge.set_defense_stat(-1,18);
        challenge.setVariability(10);
        challenge.setText("give it a go");
        iconsequence = new ItemConsequence();
        iconsequence.addConsequence(FPalaceHelper.lust_id, 15, "The bartender smiles as you ask, and points you towards a door in the back you hadn't noticed. As you push through the door hands are suddenly shoving you onto a stage, music blaring. You do your best to emulate the girations and stripping you'd seen, and are pleasantly surprised when coins start pouring onto the stage. You're led from the stage with cheers of \"Encore!\" and numerous, significantly less savoury things. As your earnings are passed to you, the bartender suggests you buy a </c1>. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "The bartender smiles as you ask, and points you towards a door in the back you hadn't noticed. As you push through the door a hand reaches out but retracts, and you hear an off-hand comment about you being made before you're shoved on to a stage. You don't have much luck dancing to the beat, and jeers begin to rain upon you as you try to show off your dick. It isn't long before you're shown off the stage, though a few coins are offered for your attempt, and a suggestion made that you buy a </c1>. ",-1);
        iconsequence.add_change_effect(FPalace_classes.cclass_stripper()); 
        iconsequence.add_item_reward(FPalace_items.gold(5), -1);
        iconsequence.add_item_reward(FPalace_items.gold(50), 0);
        iconsequence.set_always_change();
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
        challenge.set_defense_stat(-1,16);
        challenge.setVariability(10);
        challenge.setText("work");
        iconsequence = new ItemConsequence();
        iconsequence.addConsequence(FPalaceHelper.lust_id, 15, "The bartender smiles as you ask, and points you towards a door in the back you hadn't noticed. As you push through the door hands are suddenly shoving you onto a stage, music blaring. You do your best to emulate the girations and stripping you'd seen, and are pleasantly surprised when coins start pouring onto the stage. You're led from the stage with cheers of \"Encore!\" and numerous, significantly less savoury things. As your earnings are passed to you, the bartender suggests you buy a </c1>. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "The bartender smiles as you ask, and points you towards a door in the back you hadn't noticed. As you push through the door a hand reaches out but retracts, and you hear an off-hand comment about you being made before you're shoved on to a stage. You don't have much luck dancing to the beat, and jeers begin to rain upon you as you try to show off your dick. It isn't long before you're shown off the stage, though a few coins are offered for your attempt, and a suggestion made that you buy a </c1>. ",-1);
        iconsequence.set_always_change();
        iconsequence.add_change_effect(FPalace_classes.cclass_stripper()); 
        iconsequence.add_item_reward(FPalace_items.gold(5), -1);
        iconsequence.add_item_reward(FPalace_items.gold(50), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,2);
        challenge.setVariability(0);
        challenge.setText("Senip Sangria");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a martini glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Senip_Sangria(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-2), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.breast_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "I've got glasses of </c13> for 10 gold\n",0,0,0,8);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "I've got glasses of </c7> for 5 gold\n",-1,0,0,8);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(0);
        challenge.setText("Streabs Sherry");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a sherry glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Streabs_Sherry(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-5), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "I've got some </c14> for 30 gold a glass\n",0,0,0,10);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "I've got some </c9> for 1 gold a pint\n",-1,0,0,10);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("Gavin ale");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a pint glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Gavin_Ale(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-1), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.balls_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "And some of the </c15> for 15 gold each\n",0);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "And some shots of </c11> for 1 gold each\n",-1);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("Allbs homebrew Alcohol");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you the shot. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Allbs_Homebrew(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-1), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,20);
        challenge.setVariability(0);
        challenge.setText("Prothgs wine");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Prothg_wine(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-20), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,10);
        challenge.setVariability(0);
        challenge.setText("Wests Bourban");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Wests_Bourban(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-10), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,30);
        challenge.setVariability(0);
        challenge.setText("Grulv Wthrin Vodka");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Grulv_Vodka(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-30), 0);
        a.addChallenge(challenge,iconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.gold_id);
        challenge.set_defense_stat(-1,15);
        challenge.setVariability(0);
        challenge.setText("Palace Private Reserve");
        iconsequence = new ItemConsequence();
        //check to make sure the character can afford, and add to inventory if they can.
        iconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The bartender thanks you for your custom, and hands you a wine glass. ",0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"I'm afraid you don't have enough...\" the bartender says appologetically. ",-1);
        iconsequence.add_item_reward(FPalace_items.Palace_Private_Reserve(), 0);
        iconsequence.add_item_reward(FPalace_items.gold(-15), 0);
        a.addChallenge(challenge,iconsequence);
        
        
        bartender_convert.add_action(a,Character.relations_affect_id,0,false,Conversation_topic.being_told_topic);
        
        fpalace_bartender.personality.add_conversation_topic(bartender_convert);
        
        fpalace_bartender.new_location(trans_stripper);
        
        trans_hall.new_exit(trans_stripper,"West");
        trans_stripper.new_exit(trans_hall,"East");
        
        
        Room trans_talker = new Room("This room seems to be exclusively decorated in leather and metal, though the abundance of florecent plastic objects laying on shelves quickly catch the eye. In the middle of the room is what appears to be some sort of <a0>. ");
        trans_talker.set_id(-1);
        trans_talker.set_discovery_difficulty(-1);
        trans_talker.set_locate_difficulty(-1);
        a2 = new CharAction();
        a2.setName("excercise machine");
        a2.set_dialogue("As you get closer to the machine, it suddenly seems to leap to life, and </c0>! ");

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.dex_id);
        c2.set_defense_stat(-1, 27);
        c2.setVariability(0);
        c2.setText("lashes out at you");

        con2 = new Consequence();
        //need success consequence here to spawn npc and start combat
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "You manage to dodge aside, and prepare to be attacked!",0);
        con2.addConsequence(FPalaceHelper.curr_hp_id,-1, "Strange straps wrap around your arms and legs, rapidly dragging you in towards the machine. As you slam into it's body, you hear a </c1>. The straps tighten and tighten, and the machine seems to open while it </c2>, until you find yourself staring at the floor, imobalized. ",-1);

        a2.addChallenge(c2,con2);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.curr_hp_id);
        c2.set_defense_stat(-1, 2);
        c2.setVariability(0);
        c2.setText("bell ring");

        rcon2 = new RoomConsequence();
        rcon2.set_change_on_success();
        rcon2.addConsequence(FPalaceHelper.curr_hp_id,-1, "A </c3> coos out \"Fresh meat!\" and you're left desperately trying to catch a glance. A lash suddenly smacks out and you feel flesh tear from your back. ",0);
        rcon2.addConsequence(FPalaceHelper.curr_hp_id,0, "\"You don't look like you can take this at all honey...\" a voice echos from your left, and you feel a set of hands begin to work at the bindings on your limbs. You don't even catch a glance at the owner of the voice before you find yourself back in the hallway. ",-1);
        rcon2.add_room_effect(trans_hall);
        
        a2.addChallenge(c2,rcon2);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.curr_hp_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("whirs mechanically");

        ItemConsequence itemcon = new ItemConsequence();
        //need success consequence here to spawn npc and start combat
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "You suddenly feel metal on your body, and an electric current suddenly sends your hair to it's end and causes you scream out. A </c4> catches your attention, though you can't see where it came from. ",0);
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "You suddenly feel metal on your body, and an electric current fries and crisps your body. You feel your mind slip away as the pain becomes too great. ",-1);
        itemcon.add_item_reward(FPalace_items.gold(2),0);
        
        a2.addChallenge(c2,itemcon);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.curr_hp_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("voice");

        itemcon = new ItemConsequence();
        itemcon.set_change_on_success();
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "A </c4> that borders on a giggle echoes through the room as the lash continues to hail down on your back. ",0);
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "The lash continues to tear at your flesh when a heavy step towards you suddenly has it strike a loud snap. It rapidly grabs around your throat and whips back, giving you a brief glimpse of the world behind you as your neck snaps backwards. ",-1);
        itemcon.add_item_reward(FPalace_items.gold(2),0);
        
        a2.addChallenge(c2,itemcon);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.curr_hp_id);
        c2.set_defense_stat(-1, 2);
        c2.setVariability(0);
        c2.setText("laugh");

        rcon = new RoomConsequence();
        rcon.set_change_on_success();
        rcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "\"Does it </c5>?\" the voice suddenly says, sounding concerned, and you feel a gentle brush against your torn up back. Suddenly you feel it grab, and tear a piece of you off. The voice giggles. ",0);
        rcon.addConsequence(FPalaceHelper.curr_hp_id,0, "\"Done already...\" the voice says disapointedly, and you feel a set of hands begin to work at the bindings on your limbs. You're surprised when you finally catch a glimpse of your torturer and behold a tall blonde in a corset with breasts ready to burst free. She smiles at you disapointedly and tosses some coins your way. \"You look like you need a drink...\" she says, a strange tinge of concern on her voice. \"Let me show you the way to the bar.\"\n It isn't far, and you find yourself being assailed by flashing lights as you enter. The blonde disappears almost immediately back the way you came, a saidstic grin on her face. ",-1);
        rcon.add_room_effect(trans_stripper);
        rcon.add_change_effect(FPalace_classes.cclass_dominatrix()); 
        //itemcon.add_item_reward(FPalace_items.gold(2),-1) original comment
        
        a2.addChallenge(c2,rcon);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.curr_hp_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("hurt");

        itemcon = new ItemConsequence();
        itemcon.set_change_on_success();
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "The hands tear at every available piece of your skin they can, and you can feel the blood pouring from your back, and the giggle finally breaks into a full blown </c4>. After what seems an eternity, the </c3> gives a disappointed sigh and stops. \"No more...\" You can't help but focus on your ears as footsteps click away, and the contraption holding you </c2>. ",0);
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-1, "You can feel your conciousness fade as pieces of you continue to be torn away, and you find yourself staring at the growing pool of blood on the floor beneath you. ",-1);
        itemcon.add_item_reward(FPalace_items.gold(2),0);
        
        a2.addChallenge(c2,itemcon);

        trans_talker.addAction(a2);
        
        trans_hall.new_exit(trans_talker,"East");
        
        
        area.add_room(trans_reception);
        
        
        creature = FPalace_npcs.FPalace_greeting_girl();
        
        //need to move this to Conversation_topic... or not. It's a one off topic
        Conversation_topic ct = new Conversation_topic();
        ct.set_no_spread();
        ct.set_topic_name("Membership");
        
        a = new CharAction();
        a.setName("Job");
        //The plan is to have her give a member ship card... but only if you're a herm  - Done!
        //And, if you are a Herm, to lead towards some sort of sex scene
        a.set_dialogue("Hello! Would you like to sign up to be a </c0>?");
        a.set_item_requirement(FPalace_items.FPalace_membership());
        a.set_force_failure();
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("member");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "Oh! You're already a member! Sorry for bothering you. ",0);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "Yup! A member of this here club of like bodied individuals. There's just one </c1> to join. ",-1);
        a.addChallenge(challenge,consequence);

        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.penis_length_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("condition");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id,10, "\"Yup, just one itty bitty condition.\" She says as she wiggles back and forth as though shivering, her cock visibly moving under her leotard. She stops and starts looking you up and down </c2>. ",0);
        consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "I'm afraid you don't meet our condition... we can help you </c3> this if you'd like. ",-1);
        a.addChallenge(challenge,consequence);

        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.breast_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("measuring");
        iconsequence = new ItemConsequence();
        iconsequence.addConsequence(FPalaceHelper.lust_id,10, "You pass with flying colours! Enjoy your time at the Palace! ",0,0,0,5);
        iconsequence.add_item_reward(FPalace_items.FPalace_membership(),0);
        iconsequence.addConsequence(FPalaceHelper.curr_hp_id,0,"I'm afraid you don't meet our condition... we can help you </c3> this if you'd like. ",-1);
        a.addChallenge(challenge,iconsequence);

        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("rectify");
        RoomConsequence rconsequence = new RoomConsequence();
        //Still need to build rest of transformation area - oh, it's there... and it's a mess (look above)
        rconsequence.add_room_effect(trans_reception);
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "\"Just follow me\" She says, and leads you through the maze of halls. You're left in what looks like a reception room alone. ",0,0,0,4);

        a.addChallenge(challenge,rconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("");
        Quest_Consequence qconsequence = new Quest_Consequence();
        Quest fpalace_membership_quest = new Quest();
        fpalace_membership_quest.set_name("Becoming a member");
        fpalace_membership_quest.new_objective("Rectify whatever situation the palaces greeting girl indicated there was with you. ",Quest.talk_action,null);
        fpalace_membership_quest.set_end_step(1);
        fpalace_membership_quest.add_end_reward(new ArrayList<>(Arrays.asList(10)));
        qconsequence.set_quest(fpalace_membership_quest);
        qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);

        a.addChallenge(challenge,qconsequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("");
        qconsequence = new Quest_Consequence();
        qconsequence.set_quest(fpalace_membership_quest,1);
        qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);

        a.addChallenge(challenge,qconsequence);
        
        ct.add_action(a,Character.relations_affect_id,0,false,Conversation_topic.being_told_topic);
        
        creature.personality.add_conversation_topic(ct);
        
        creature.new_location(intro_to_plains);
        
        Party cparty = new Party();
        creature.set_party(cparty);
        cparty.add_member(creature);
        //Need some futa bouncers...
        creature = FPalace_npcs.FPalace_bouncer_1();
                    
        creature.set_party(cparty);
        cparty.add_member(creature);
        
        creature.new_location(intro_to_plains);
        
        creature = FPalace_npcs.FPalace_bouncer_2();
        creature.set_party(cparty);
        cparty.add_member(creature);
        
        creature.new_location(intro_to_plains);
        
        return area;
    }
    
    public static Area area_fpalace_library(){
        Area area = new Area("Futanari Palace Library");
        area.set_move_time(1);
        //Librarians(done...ish), some sort of imp
        //also want to make exit to archive(archive will have exit to store-room... equipment and such can be found there 
        //(I really want a hermpire ring to be in the storeroom, but that's it's own issue... make rape transform somehow?))
        Template_Room template_room = new Template_Room("This is a path between bookshelves that seem to have been placed around rather haphazardesly. ");
        template_room.add_item(FPalace_items.FPalace_book(),0.2);
        
        template_room.add_character(FPalace_npcs.FPalace_Librarian(),0.15);
        
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        area.add_room_template(template_room);
        area.random_area(50);
        
        Room library_to_warehouse = new Room("This is a path between <s0>bookshelves</s0> that seem to have been placed around rather haphazardesly. ");
        library_to_warehouse.add_sub_descriptions("A book stands out, a line of <a0> in front of it seperating it from the others. ");
        library_to_warehouse.set_id(-1);
        
        CharAction a = new CharAction();
        a.setName("dust");
        a.set_dialogue("The book is clearly looking to be </c0>.\n");
        Challenge c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("tugged on");
        RoomConsequence rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(library_to_warehouse, /*library_to_into*/null);//,"Door") original comments, all of these
        rcon.set_join_area(37);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You tug on the book, and a door opens. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You tug on the book, and a door closes. ",0);
        a.addChallenge(c,rcon);

        library_to_warehouse.addAction(a);

        area.add_room(library_to_warehouse);
        
        Room library_to_into = new Room("The bookshelves end here, and you can see a large door leading toward stone hallways. ");
        library_to_into.set_id(-1);
        area.add_room(library_to_into);
        area.add_connect_room(library_to_into);
        return area;
    }
    
    public static Area area_fpalace_images(){
        Area area = new Area("Futanari Palace Image Forum");
        area.set_move_time(1);
        //images in here cause the player to change to more closely match whatever the image is of
        Template_Room template_room = new Template_Room("You're standing in a hallway with vulgar images pasted over every surface. ");
        template_room.add_item(FPalace_items. naughty_pictures(),0.2);
        area.add_room_template(template_room);
        template_room.set_max_same_exits(2);
        area.random_area(10);

        Room images_to_intro = new Room("The vulgar images end in a large wooden door leading back to carpeted stone hallways. ");
        area.add_room(images_to_intro);
        area.add_connect_room(images_to_intro);
        
        
        Character creature = FPalace_npcs.FPalace_legdig();
        
        creature.new_location(area.get_random_room());
        
        return area;
    }
    
    public static Area area_fpalace_stories(){
        Area area = new Area("Futanari Palace Stories Forum");
        area.set_move_time(1);
        //Stories here cause the player to undergo whatever the main character of the story does
        //SilentEye has requested an appearance... dressed in the ryu from ninja gaiden outfit, with the katana of "silent" on his helmet instead of whatever ryu has, and blue gloves
        Template_Room template_room = new Template_Room("You're standing in an open concept room with desks and paper everywhere. Some desks have type-writers, others computers, others still simply have a plethora of writing instruments");
        
        area.add_room_template(template_room);
        template_room.set_max_same_exits(2);
        area.random_area(10);

        Room room = new Room("There a sense of calm here, and several leatherback chairs sit around a <s0>fireplace</s0> that crackles and spits heat. ");
        room.add_sub_descriptions("Above the fireplace you see an ornate pink <a0>. ");
        room.set_id(-1);
        
        CharAction empty_scabbard_action = new CharAction();
        empty_scabbard_action.setName("scabbard");
        empty_scabbard_action.set_dialogue("A disapointingly empty pink scabbard with a surprisingly large number of circles painted in fine red lines. \n");
        
        CharAction a = new CharAction();
        a.setName("scabbard");
        a.set_dialogue("A handle protrudes from the scabbard, just begging to be </c0>.\n");
        
        Challenge c = new Challenge();
        c.set_attack_stat(FPalaceHelper.dex_id);
        c.set_defense_stat(-1,12);
        c.setVariability(5);
        c.setText("grabbed");
        ItemConsequence itemcon = new ItemConsequence();
        
        itemcon.set_replace_action(empty_scabbard_action);
        itemcon.addConsequence(FPalaceHelper.dex_id,0, "You draw the blade from the scabbard and immediately pocket it. </replace>",0);
        itemcon.add_item_reward(FPalace_items.manyuu_blade(), 0);
        itemcon.addConsequence(FPalaceHelper.curr_hp_id,-5, "You draw the blade from the scabbard, managing to cut yourself rather badly in the attempt. You quietly resheathe the sword and hope no one saw as you try to staunch the bleeding. ",-1);
        a.addChallenge(c,itemcon);

        room.addAction(a);
        
        area.add_room(room);
        
        
        Room writers_to_into = new Room("The mess of print ends( or begins, depending on your point of view) here in a large doorway heading out into a stone hallway. ");
        area.add_room(writers_to_into);
        area.add_connect_room(writers_to_into);
        return area;
    }
    
    public static Area area_fpalace_artist(){
        Area area = new Area("Futanari Palace Artists Forum");
        area.set_move_time(1);
        //Painting that transports players... i'm thinking to a domain like Sparrows but i'll have to ask permission first
        //obviously paintings that teleport to different areas of the normal world too
        Template_Room template_room = new Template_Room("You're standing in an open concept room with paint and easils, sketchbooks and pencils everywhere. ");
        template_room.add_item(FPalace_items. naughty_pictures(),0.2);
        template_room.set_max_same_exits(2);
        area.add_room_template(template_room);			
        area.random_area(10);
        
        FPalace_npcs.FPalace_Artist_Linty().new_location(area.get_random_room(),true);

        Room artist_to_intro = new Room("You stand on the precipace between grey stone walls, and an area made of paper and colour. ");
        area.add_room(artist_to_intro);
        area.add_connect_room(artist_to_intro);
        return area;
    }
    
    public static Area area_grasslands(){
        Area area = new Area("Grasslands");
        area.set_move_time(3);
        area.set_colour(0xFFEC8B);
        area.set_background_img(FPalaceHelper.background_test_img);
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.new_conversation_topic(FPalace_topics.grasslands_info());
        
        Template_Room template_room = new Template_Room("You're standing on a cobblestone road with tall grass on either side. ");
        //Humans (Done)
        //Merchant(Caravan) sells: Knives (Done)
        template_room.set_map_room_colour(0x96190E);
        template_room.set_background_img(FPalaceHelper.unknown_img);
        template_room.set_combat_img(FPalaceHelper.unknown_img);
        //template_room.add_party(FPalace_npcs.grasslands_party_caravan(), 0.15);
        //TODO is this a Party or ArrayList<Character_template>?!
        
        template_room.set_area_effects();
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(2);
        template_room.set_propagating_description("The road continues to the </path>. ");
        template_room.set_propagating_description_distance(1);
        template_room.set_propagating_to_template();
        
        area.add_room_template(template_room);
        area.random_area(30, template_room);
        
        template_room = new Template_Room("You're standing on a narrow path cut through tall grass. ");
        //Anthro-Rabbits(Done), Anthro-Deer
        //Merchant(Fox) sells: Dickweed
        template_room.add_item(FPalace_items.dickweed(),0.3);
        template_room.add_item(FPalace_items.bulky_seeds(),0.15);

        template_room.add_character(FPalace_npcs.rabbit_girl(),0.25);
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_area_effects();
        
        template_room.set_max_same_exits(2);
        template_room.set_same_exit_offset(1);
        
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        
        Template_Room template_filler = new Template_Room("You're completely surrounded by grass on all sides");
        //Slimes(done), horses(done-ish), coyotes
        template_filler.set_area_effects();
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        template_filler.add_item(FPalace_items.dickweed(),0.4);
        template_filler.add_item(FPalace_items.bulky_seeds(),0.3);
        
        CharAction a = new CharAction();
        a.setName("Sunburnt golden grass looms over you. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the grass. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.goo_slime());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A Slime crawls out from the brush as you begin to push through. ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.horny_equine());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A drunken equine pushes through just as you begin to. ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("Dense brush looms to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the grass. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        area.set_filler_template(template_filler);
        
        
        
        
        Room plains_to_intro = new Room("The long grass paths end here in a large entrance to a rather dark looking Palace. ");
        plains_to_intro.set_area_effects();
        template_room = new Template_Room("The long grass paths end here in a large entrance to a rather dark looking Palace. ");
        template_room.set_propagating_description("A shadowy palace shoots above the grass off to the </path>. ");
        template_room.set_propagating_description_distance(2);
        
        plains_to_intro.set_template(template_room);
        plains_to_intro.set_id(-1);
        
        Character creature = FPalace_npcs.grasslands_protestor();
        
        creature.new_location(plains_to_intro);
        
        area.add_room(plains_to_intro);
        
        area.add_connect_room(plains_to_intro);
        
        return area;
    }
    
    public static Area area_forest(){
        Area area = new Area("Forest");
        area.set_move_time(3);
        area.set_colour(0x9CCB19);
        //Fountain of the Elder - age++
        //Elves(there), Centaurs(there), Anthro-Squirels
        //Merchant(Racoon) sells: Apples
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        
        Template_Room template_room = new Template_Room("You stand amidst tall trees, following a vague path. ");
        template_room.add_item(FPalace_items.round_apple(),0.2);
        template_room.add_item(FPalace_items.rainbow_cherry(),0.2);
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
                    
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
                    
        area.add_room_template(template_room);
        area.random_area(50);
        
        Room elder_fountain = new Room("This is a gentle forest bourgh, sunlight spilling down in beams. A small <s0>fountain</s0> sits in the middle of a grouping of trees. ");
        elder_fountain.add_sub_descriptions("The fountain spurts clear <a0> from the faces of <s1>three men</s1> into a basin of purest white. ");
        elder_fountain.add_sub_descriptions("Each of the three faces are much the same: very elderly men with long flowing beards. Underneath one of them is a <s2>plaque</s2>. ");
        elder_fountain.add_sub_descriptions("The bronze plaque has the following words engraved:\nFountain of the Elders\n\nScrawled by what looks like claws over the message is what appears to be\n<b>Caution</b>");
        elder_fountain.set_id(-1);
        elder_fountain.set_area_effects();

            CharAction a2 = new CharAction();
            a2.setName("water");
            a2.set_dialogue("The water is clear, and there is even a small cup on a chain to </c0> from it.\n");

            Challenge c2 = new Challenge();
            c2.set_attack_stat(-1,10);
            c2.set_defense_stat(-1,5);
            c2.setVariability(0);
            c2.setText("drink");
            Consequence con2 = new Consequence();

            con2.addConsequence(FPalaceHelper.age_id,7, "The water is cool and as clean as it's clarity suggested. ",0);

            a2.addChallenge(c2,con2);

        elder_fountain.addAction(a2);

        area.add_room(elder_fountain);
        
        
        Template_Room template_filler = new Template_Room("You're completely surrounded by dence brush and trees on all sides");
        //Wolves, Centaurs
        template_filler.add_item(FPalace_items.round_apple(),0.2);
        template_filler.add_item(FPalace_items.rainbow_cherry(),0.2);
        
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        
        CharAction a = new CharAction();
        a.setName("Ancient trees loom over you. ");//</path>
        a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the brush. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.forest_wolf());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A wolf leaps from the brush as you begin to push through! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.forest_centaur());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A centaur crashes into you just as you begin to push through the forest! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("Ancient trees loom to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the brush. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        
        
        area.set_filler_template(template_filler);
        
        
        return area;
    }
    
    public static Area area_freedom_farms(){
        Area area = new Area("Freedom Farms");
        area.set_move_time(1);
        //Cow-girls(done), anthro-Horses, anthro-sheep, anthro-pigs, and maybe a few normal people, along with their barn yard equivalents, working in harmony
        //Merchant(Lilly) sells: Milk
        //Family: Father, Mother, 5 daughters(Heidi(bull), and Sarah age 20, Ella age 18, Lilly age 15, Lucy age 9), and 2 sons(Ryan aged 19, Sam aged 13)
            //(exists)Father (John) has found a (unique) cockring that makes his cum cause breasts to grow when consumed. Found in his bedroom
                //cockring is done, and seems to work
                //Think he should have a steady stream of "customers" giving him blow-jobs
            //(exists, though unclothed)Mother (Daisy) Constant blowjobs have left this farm-wife overburdened by her breasts. Found in the kitchen.
                //should probably have some sort of item-exchange where she cooks for you
                //Thinking I may want her carrying some kids too. She's sleeping with both her husband AND her daughter, and isn't sure who is the father of her current pregnancy
                    //John is unaware Daisy is sleeping with Heidi
            //(exists)Heidi is the farms "bull". Found in the barn.
                //(exists, though unclothed)she has a collection of brood-mares at varying stages of pregnancy in the barn.
                    //Kind of want there to be more of them too, but I'm running into time constraints
                //she is obsessed with her fertility (already obscenely high) and wants to have even bigger loads and more fertile semen
                //Thinking she has a boyfriend... Has the biggest male human dick of any non-random NPC (13.5")
                    //Heidi is maybe pregnant with his kid(s)
                    //name is Dave... probably a farm hand
                        //Pretty normal guy, but the only human on the farm who isn't a member of the family
                //Heidi is secretly watched by Ronny, the bovine bull whose job she has taken over, leaving him to mostly get drunk
                    //Only male member of the bovine species on the farm. Possibly Heidi/Sarahs real father
            //(exists)Heidis twin sister Sarah is kept over pregnant in the basement of the barn thanks to a constant fucking by her twin
                //she's too pregnant to move(good). Should probably think up some quest involving her... or her expected children.
                    //... or another room, where the children her Father, brother, and sister put in her have left them
                        //would have been pregnant 6 times or so in addition to the current pregnancy...
                //Kinda of want her hooked up to a variety of suck and fuck machines...
            //Ryan... straight up cowboy, every girls dream. Found wandering the paths.
                //Bigger then his dad at 8", Ryan is still deeply envious of Heidis male member. Constantly trying to prove he is every bit the stud Heidi is.
            //Ella... Lilly grown up... and pregnant... not sure who the father is yet (either Heidi or some uncreated farmhand... maybe Heidis "boyfriend". Or John himself.). Found wandering the paths
            //(exists)Lilly (merchant) is a gorgeous young woman, and potential large breasted love interest for not only the player, but her family members
                //Wants to have bigger breasts like her sister/mom. Would like little mini-tasks that cause her already large breasts to grow.
            //Sam... gay, possibly a cunt-boi, ashamed of his love of Heidi. Found in the boys room.
                //Looking to stretch himself to fit Heidi's massive member
            //(exists)Lucy... Lilly aged down... still precocious and adorable like all farm girls. Found in the girls room.
                //Still learning what sex is, and curious why she doesn't have a penis like her oldest sisters.
                    //Maybe a quest to turn her futa? - DONE!
        
        //Plan to have an 'evil' farm also, where people are being milked while chained up in windowless rooms
            //Probably IN the chastity city. Need some conglomerate milking name... like <city name> milk
                //depends on drugs rather then a bull to induce lactation
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        //barn
        Template_Room template_room = new Template_Room("");
        template_room.set_filler_connect();

        template_room.set_map_room_colour(0x5C4033);
        template_room.set_propagating_description("A large red barn is visible to the </path>. ");
        template_room.set_propagating_description_distance(2);
        
        CharAction milking_machine = new CharAction();
        milking_machine.setName("milking machines");
        
        milking_machine.set_dialogue("They have obscenely large nozzles, and are clearly intended for cows. The machine appears quite easy to use, having nothing but a </c0> and an empty glass jar connected to a tube. ");
        
            Challenge c2 = new Challenge();
            c2.set_attack_stat(FPalaceHelper.milk_volume_id);
            c2.set_defense_stat(-1,1);
            c2.setVariability(0);
            c2.setText("large red button");
            Consequence con2 = new Consequence();
            con2.addConsequence(FPalaceHelper.lust_id,0, "You press the button, but nothing seems to happen. ",-1, 0, 0);
            con2.addConsequence(FPalaceHelper.lust_id,15, "As you press the button, the nozzles suddenly take on a life of their own and strike towards you with suprising speed, latching on. ",0, 0, 0, 1);

            milking_machine.addChallenge(c2,con2);
            
            c2 = new Challenge();
            c2.set_attack_stat(-1,0);
            c2.set_attack_status_id(TickEffect.lactating_status);
            c2.set_defense_stat(-1,1);
            c2.setVariability(0);
            c2.setText("");
            con2 = new Consequence();
            con2.addConsequence(FPalaceHelper.lust_id,10, "\nThe nozzles give up quickly as they fail to draw milk. ",-1);
            con2.addConsequence(FPalaceHelper.lust_id,10, "",0, 0, 0, 2);
            
            milking_machine.addChallenge(c2,con2);
            
            c2 = new Challenge();
            c2.set_attack_stat(FPalaceHelper.milk_volume_id);
            c2.set_defense_stat(-1,500);
            c2.setVariability(0);
            c2.setText("");
            ItemConsequence itemcon = new ItemConsequence();
            itemcon.set_always_change();
            itemcon.set_extract(FPalaceHelper.milk_volume_id);
            itemcon.addConsequence(FPalaceHelper.lust_id,10, "\nAfter a few moments, the nozzles unlatch themselves, somehow seeming disappointed. There isn't very much milk in the jar, maybe a </sd"+FPalaceHelper.milk_volume_id+">,and no matter how you pull, it won't release itself from the machine. ",-1);
            itemcon.addConsequence(FPalaceHelper.lust_id,25, "\nThe nozzles pulse and pump, streams of creamy fluid leaping from your breasts and flowing into the empty jar. The ordeal is surprisingly exhausting, the nozzles pulling you about to their whim, but as the flow of milk abates, you're released and the nozzles return to their place about the machine. There's a *plink* and you notice the filled milk jug just has been released. ",0);
            itemcon.add_item_reward(FPalace_items.milk_jug(),0, true);
            
            milking_machine.addChallenge(c2,itemcon);
            
        CharAction semen_machine = new CharAction();
        semen_machine.setName("semen extractor");
        
        semen_machine.set_dialogue("A large tube leads out the back of this oblong white box on a stainless steel post, while the front is dominated by a soft looking pink hole. A </c0> sits on top. ");
        
            c2 = new Challenge();
            c2.set_attack_stat(FPalaceHelper.cum_volume_id);
            c2.set_defense_stat(-1,1);
            c2.setVariability(0);
            c2.setText("large red button");
            con2 = new Consequence();
            con2.addConsequence(FPalaceHelper.lust_id,0, "You press the button, but nothing seems to happen. ",-1, 0, 0);
            con2.addConsequence(FPalaceHelper.lust_id,50, "As you press the button, the tube starts to pump, and you're surprised at it vacuums you into it, latching on to your crotch. ",0, 0, 0, 1);

            semen_machine.addChallenge(c2,con2);
            
            c2 = new Challenge();
            c2.set_attack_stat(FPalaceHelper.cum_volume_id);
            c2.set_defense_stat(-1,500);
            c2.setVariability(0);
            c2.setText("");
            itemcon = new ItemConsequence();
            itemcon.set_always_change();
            itemcon.set_extract(FPalaceHelper.cum_volume_id);
            itemcon.addConsequence(FPalaceHelper.lust_id,-45, "\nAfter a few moments, the machine stops pumping, somehow seeming disappointed. You quickly extricate yourself from the machine. Suddenly numbers flash on the device and show </s"+FPalaceHelper.cum_volume_id+">mL. ",-1);
            itemcon.addConsequence(FPalaceHelper.lust_id,-75, "\nThe machine pulses and pumps, and you can feel yourself being drained of your seed. The ordeal is surprisingly exhausting, the machine pulling you about to its whim, but as the flow of semen abates, you're released and the machine stops it motions. There's a *plink* and you notice a semen filled jug falls to the ground from the back of the machine. Suddenly numbers flash on the device and show </s"+FPalaceHelper.cum_volume_id+">mL. ",0);
            itemcon.add_item_reward(FPalace_items.cum_jug(),0, true);
            
            semen_machine.addChallenge(c2,itemcon);
            
        Room barn_entrance = new Room("You're standing in the entrance of a large barn. ");
        barn_entrance.set_template(template_room);
        
        template_room = new Template_Room("");
        template_room.set_filler_connect();

        template_room.set_map_room_colour(0x5C4033);
        template_room.set_propagating_description("A large red barn is visible to the </path>. ");
        template_room.set_propagating_description_distance(2);
        Room barn_ground_floor1 = new Room("You're standing in the middle of a large barn. ");
        barn_ground_floor1.set_template(template_room);
        Room barn_ground_floor2 = new Room("You're standing in the middle of a large barn. ");
        barn_ground_floor2.set_template(template_room);
        Room barn_ground_floor3 = new Room("You're standing in the middle of a large barn. ");
        barn_ground_floor3.set_template(template_room);
        Room barn_ground_underloft = new Room("You're standing at the edge of a large barn, underneath a loft. ");
        barn_ground_underloft.set_template(template_room);
        Room barn_ground_ne_corner = new Room("You're standing in the corner of a large barn. ");
        barn_ground_ne_corner.set_template(template_room);
        Room barn_ground_se_corner = new Room("You're standing in the corner of a large barn. ");
        barn_ground_se_corner.set_template(template_room);
        
        Template_Room hidden_template_room = new Template_Room("");
        hidden_template_room.set_filler_connect();
        hidden_template_room.set_unconnected();
        hidden_template_room.set_map_room_colour(0x5C4033);
        
        Room barn_hidden_basement = new Room("You're standing in a dark room, light glinting through the floorboards above. ");
        barn_hidden_basement.set_template(hidden_template_room);
        
        Room barn_ground_nw_corner = new Room("You're standing underneath a loft in the corner of a large barn, <s1>hay</s1> falling from above and settling on a <s0>small bench</s0>. ");
        barn_ground_nw_corner.set_template(template_room);
        barn_ground_nw_corner.add_sub_descriptions("The bench seems to have a number of devices useful for <a0> and a number of stains of... questionable origin. ");
        barn_ground_nw_corner.add_sub_descriptions("The hay is suspiciously falling through a <a1> in the floor. ");
        
        barn_ground_nw_corner.set_id(-1);
        
        CharAction a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        barn_ground_nw_corner.addAction(a);
        
        a = new CharAction();
        a.setName("crack");
        a.set_dialogue("",0);
         c2 = new Challenge();
            c2.set_room_challenge(Challenge.EXITCHECK);
            c2.set_defense_stat(-1,0);
            c2.setVariability(0);
            c2.setText("");
            RoomConsequence rcon2 = new RoomConsequence();
            rcon2.set_never_change();
            rcon2.addConsequence(FPalaceHelper.lust_id,0, "It's hard not to notice the open trapdoor. You could probably </c3> it. ",0);//exit exists... close
            rcon2.addConsequence(FPalaceHelper.lust_id,0, "",-1,0,0,2);
            rcon2.add_room_effect(barn_ground_nw_corner, barn_hidden_basement);
                
            a.addChallenge(c2,rcon2);
            
            c2 = new Challenge();
            c2.set_attack_stat(FPalaceHelper.str_id);
            c2.set_defense_stat(-1,12);
            c2.setVariability(12);
            c2.setText("trapdoor");
            RoomConsequence barn_trapdoor = new RoomConsequence();
            barn_trapdoor.addConsequence(FPalaceHelper.lust_id,0, "You tug on the trapdoor to no avail. ",-1);
            barn_trapdoor.addConsequence(FPalaceHelper.lust_id,0, "You open the trapdoor, reavealing a way down. ",0);
            barn_trapdoor.add_room_effect(barn_ground_nw_corner, barn_hidden_basement);
            
            a.addChallenge(c2,barn_trapdoor);
            
            c2 = new Challenge(true);//2
            c2.set_attack_stat(FPalace_skills.perception_id);
            c2.set_defense_stat(-1,20);
            c2.setVariability(20);
            c2.setText("");
            con2 = new Consequence();
            con2.addConsequence(FPalaceHelper.lust_id,0, "You spy at the cracks, but it doesn't look like anything in the end. ",-1);
            con2.addConsequence(FPalaceHelper.lust_id,0, "You look hard at the cracks in the floor, and are surprised to find a </c1>! ",0);

            a.addChallenge(c2,con2);
            
            c2 = new Challenge(true);//3
            c2.set_room_challenge(Challenge.EXITCHECK);
            c2.set_defense_stat(-1, 0);
            c2.setVariability(0);
            c2.setText("close");
            rcon2 = new RoomConsequence();
            //con.add_consequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
            rcon2.addConsequence(FPalaceHelper.con_id,0, "You close the trapdoor. ",0);
            rcon2.add_room_effect(barn_ground_nw_corner, barn_hidden_basement);
            a.addChallenge(c2,rcon2);
            
        barn_ground_nw_corner.addAction(a);
        
        Room barn_ground_sw_corner = new Room("You're standing underneath a loft in the corner of a large barn.  There appears to be a <a0> shoved into the corner. ");
        barn_ground_sw_corner.addAction(semen_machine);
        barn_ground_sw_corner.set_template(template_room);
        Room barn_ground_edge1 = new Room("You're standing along the wall in a large barn. There are some <a0> near a support beam. ");
        barn_ground_edge1.set_template(template_room);
        barn_ground_edge1.addAction(milking_machine);//maybe turn this into static content, and add it to the template to spawn in more than one room....
        Room barn_ground_edge2 = new Room("You're standing along the wall in a large barn. There are some <a0> near a support beam. ");
        barn_ground_edge2.set_template(template_room);
        barn_ground_edge2.addAction(milking_machine);
        Room barn_ground_edge3 = new Room("You're standing along the wall in a large barn. There are some <a0> near a support beam. ");
        barn_ground_edge3.set_template(template_room);
        barn_ground_edge3.addAction(milking_machine);
        Room barn_ground_edge4 = new Room("You're standing along the wall in a large barn. There are some <a0> near a support beam. ");
        barn_ground_edge4.set_template(template_room);
        barn_ground_edge4.addAction(milking_machine);
        Room barn_ground_edge5 = new Room("You're standing along the wall in a large barn. ");
        barn_ground_edge5.set_template(template_room);
        Room barn_ground_edge6 = new Room("You're standing along the wall in a large barn. ");
        barn_ground_edge6.set_template(template_room);
        Room barn_loft = new Room("You're standing in a barn loft. There's a lot of hay about. ");
        barn_loft.set_template(template_room);
        
        barn_entrance.new_exit(barn_ground_floor1,"West");
        barn_ground_floor1.new_exit(barn_entrance,"East");
        
        barn_entrance.new_exit(barn_ground_ne_corner,"North");
        barn_ground_ne_corner.new_exit(barn_entrance,"South");
        
        barn_entrance.new_exit(barn_ground_se_corner,"South");
        barn_ground_se_corner.new_exit(barn_entrance,"North");
        
        barn_entrance.new_exit(barn_ground_edge1,"North-West");
        barn_ground_edge1.new_exit(barn_entrance,"South-East");
        
        barn_entrance.new_exit(barn_ground_edge2,"South-West");
        barn_ground_edge2.new_exit(barn_entrance,"North-East");
        
        barn_ground_floor1.new_exit(barn_ground_floor2,"West");
        barn_ground_floor2.new_exit(barn_ground_floor1,"East");
        
        barn_ground_floor1.new_exit(barn_ground_ne_corner,"North-East");
        barn_ground_ne_corner.new_exit(barn_ground_floor1,"South-West");
        
        barn_ground_floor1.new_exit(barn_ground_se_corner,"South-East");
        barn_ground_se_corner.new_exit(barn_ground_floor1,"North-West");
        
        barn_ground_floor1.new_exit(barn_ground_edge1,"North");
        barn_ground_edge1.new_exit(barn_ground_floor1,"South");
        
        barn_ground_floor1.new_exit(barn_ground_edge2,"South");
        barn_ground_edge2.new_exit(barn_ground_floor1,"North");
        
        barn_ground_floor1.new_exit(barn_ground_edge3,"North-West");
        barn_ground_edge3.new_exit(barn_ground_floor1,"South-East");
        
        barn_ground_floor1.new_exit(barn_ground_edge4,"South-West");
        barn_ground_edge4.new_exit(barn_ground_floor1,"North-East");
        
        barn_ground_ne_corner.new_exit(barn_ground_edge1,"West");
        barn_ground_edge1.new_exit(barn_ground_ne_corner,"East");
        
        barn_ground_se_corner.new_exit(barn_ground_edge2,"West");
        barn_ground_edge2.new_exit(barn_ground_se_corner,"East");
        
        barn_ground_floor2.new_exit(barn_ground_edge1,"North-East");
        barn_ground_edge1.new_exit(barn_ground_floor2,"South-West");
        
        barn_ground_floor2.new_exit(barn_ground_edge2,"South-East");
        barn_ground_edge2.new_exit(barn_ground_floor2,"North-West");
        
        barn_ground_floor2.new_exit(barn_ground_edge3,"North");
        barn_ground_edge3.new_exit(barn_ground_floor2,"South");
        
        barn_ground_floor2.new_exit(barn_ground_edge4,"South");
        barn_ground_edge4.new_exit(barn_ground_floor2,"North");
        
        barn_ground_floor2.new_exit(barn_ground_floor3,"West");
        barn_ground_floor3.new_exit(barn_ground_floor2,"East");
        
        barn_ground_floor2.new_exit(barn_ground_edge5,"North-West");
        barn_ground_edge5.new_exit(barn_ground_floor2,"South-East");
        
        barn_ground_floor2.new_exit(barn_ground_edge6,"South-West");
        barn_ground_edge6.new_exit(barn_ground_floor2,"North-East");
        
        barn_ground_edge1.new_exit(barn_ground_edge3,"West");
        barn_ground_edge3.new_exit(barn_ground_edge1,"East");
        
        barn_ground_edge3.new_exit(barn_ground_edge5,"West");
        barn_ground_edge5.new_exit(barn_ground_edge3,"East");
        
        barn_ground_edge2.new_exit(barn_ground_edge4,"West");
        barn_ground_edge4.new_exit(barn_ground_edge2,"East");
        
        barn_ground_edge4.new_exit(barn_ground_edge6,"West");
        barn_ground_edge6.new_exit(barn_ground_edge4,"East");
        
        barn_ground_floor3.new_exit(barn_ground_edge5,"North");
        barn_ground_edge5.new_exit(barn_ground_floor3,"South");
        
        barn_ground_floor3.new_exit(barn_ground_edge6,"South");
        barn_ground_edge6.new_exit(barn_ground_floor3,"North");
        
        barn_ground_floor3.new_exit(barn_ground_underloft,"West");
        barn_ground_underloft.new_exit(barn_ground_floor3,"East");
        
        barn_ground_floor3.new_exit(barn_ground_edge3,"North-East");
        barn_ground_edge3.new_exit(barn_ground_floor3,"South-West");
        
        barn_ground_floor3.new_exit(barn_ground_edge4,"South-East");
        barn_ground_edge4.new_exit(barn_ground_floor3,"North-West");
        
        barn_ground_floor3.new_exit(barn_ground_nw_corner,"North-West");
        barn_ground_nw_corner.new_exit(barn_ground_floor3,"South-East");
        
        barn_ground_floor3.new_exit(barn_ground_sw_corner,"South-West");
        barn_ground_sw_corner.new_exit(barn_ground_floor3,"North-East");
        
        barn_ground_underloft.new_exit(barn_ground_nw_corner,"North");
        barn_ground_nw_corner.new_exit(barn_ground_underloft,"South");
        
        barn_ground_underloft.new_exit(barn_ground_sw_corner,"South");
        barn_ground_sw_corner.new_exit(barn_ground_underloft,"North");
        
        barn_ground_underloft.new_exit(barn_ground_edge5,"North-East");
        barn_ground_edge5.new_exit(barn_ground_underloft,"South-West");
        
        barn_ground_underloft.new_exit(barn_ground_edge6,"South-East");
        barn_ground_edge6.new_exit(barn_ground_underloft,"North-West");
        
        barn_ground_underloft.new_exit(barn_loft,"Up");
        barn_loft.new_exit(barn_ground_underloft,"Down");
        
        barn_ground_edge6.new_exit(barn_ground_sw_corner,"West");
        barn_ground_sw_corner.new_exit(barn_ground_edge6,"East");
        
        barn_ground_edge5.new_exit(barn_ground_nw_corner,"West");
        barn_ground_nw_corner.new_exit(barn_ground_edge5,"East");
        
        barn_ground_nw_corner.new_exit(barn_hidden_basement,"Down");
        barn_hidden_basement.new_exit(barn_ground_nw_corner,"Up");
        
        area.add_room(barn_entrance);
        
        barn_trapdoor.trigger(0);
        
        template_room = new Template_Room("You're in what appears to be some sort of farm. ");
        
        template_room.add_no_connect_template(barn_ground_floor1.template);
        template_room.add_no_connect_template(barn_hidden_basement.template);
        
        template_room.add_character(FPalace_npcs.cow_herm(),0.05);//most of the cow-herms move to greener pastures, their services not needed thanks to Heidi
        template_room.add_character(FPalace_npcs.cow_girl(),0.3);
        
        template_room.set_max_same_exits(2);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        
        area.random_area(15);
        
        Room farm_entrance = new Room("You find yourself at the dirt entrance to a farm, a small counter and sign nearby. ");
        farm_entrance.set_template(template_room);
        farm_entrance.set_area_effects();
        area.add_room(farm_entrance);
                    
        area.add_connect_room(farm_entrance);
        
        //farmhouse
        template_room = new Template_Room("");
        template_room.set_filler_connect();
        template_room.add_no_connect_template(barn_entrance.template);
        template_room.add_no_connect_template(barn_ground_floor1.template);
        template_room.add_no_connect_template(barn_hidden_basement.template);
        template_room.set_map_room_colour(0x5C4033);
        template_room.set_propagating_description("A white washed house is visible to the </path>. ");
        template_room.set_propagating_description_distance(2);
        
        Room farmhouse_entrance = new Room("You are in the entrance way of a house. ");
        farmhouse_entrance.set_template(template_room);
        Room farmhouse_livingroom = new Room("You are in a living room, with a floral print couch sitting in front of a fireplace. ");
        farmhouse_livingroom.set_template(template_room);
        Room farmhouse_kitchen = new Room("You are in a kitchen, the oven unlit, and the table empty. ");
        farmhouse_kitchen.set_template(template_room);
        Room farmhouse_rootcellar = new Room("A dark, dank root cellar. Nothing Suspicious here. ");
        farmhouse_rootcellar.set_template(template_room);
        Room farmhouse_diningroom = new Room("You are in a dining room, an empty table covered by a blue tablecloth and surrounded by chairs stands in the center. ");
        farmhouse_diningroom.set_template(template_room);
        Room farmhouse_upstairs = new Room("You are in a hallway with entrances to what appear to be bedrooms. ");
        farmhouse_upstairs.set_template(template_room);
        Room farmhouse_girls_room = new Room("You're in a crowded <a0> clearly belonging to a number of young women. ");
        farmhouse_girls_room.set_template(template_room);
        CharAction rest_action = new CharAction();
        rest_action.set_rest_flag();
        rest_action.setName("bedroom");
        
        rest_action.set_dialogue("You lay down and rest on one of the beds. It is surprisingly comfy, and appears to have been laundered. ");
        
        farmhouse_girls_room.addAction(rest_action);
        
        Room farmhouse_boys_room = new Room("You're in a crowded <a0> clearly belonging to a number of young boys. ");
        farmhouse_boys_room.set_template(template_room);
        
        farmhouse_boys_room.addAction(rest_action);
        Room farmhouse_parents_room = new Room("You're in a bedroom with a single large <a0>. ");
        farmhouse_parents_room.set_template(template_room);
        rest_action = new CharAction();
        rest_action.set_rest_flag();
        rest_action.setName("bed");
        
        rest_action.set_dialogue("You lay down and rest in the bed. It is surprisingly comfy, and appears to have been laundered. ");
        farmhouse_parents_room.addAction(rest_action);
        
        
        farmhouse_entrance.new_exit(farmhouse_livingroom,"West");
        farmhouse_livingroom.new_exit(farmhouse_entrance,"East");
        
        farmhouse_livingroom.new_exit(farmhouse_kitchen,"North");
        farmhouse_kitchen.new_exit(farmhouse_livingroom,"South");
        
        farmhouse_kitchen.new_exit(farmhouse_diningroom,"East");
        farmhouse_diningroom.new_exit(farmhouse_kitchen,"West");
        
        farmhouse_kitchen.new_exit(farmhouse_rootcellar, "Down");
        farmhouse_rootcellar.new_exit(farmhouse_kitchen, "Up");
        
        farmhouse_diningroom.new_exit(farmhouse_entrance,"South");
        farmhouse_entrance.new_exit(farmhouse_diningroom,"North");
        
        farmhouse_entrance.new_exit(farmhouse_upstairs,"Up");
        farmhouse_upstairs.new_exit(farmhouse_entrance,"Down");
        
        farmhouse_upstairs.new_exit(farmhouse_girls_room,"North");
        farmhouse_girls_room.new_exit(farmhouse_upstairs,"South");
        
        farmhouse_upstairs.new_exit(farmhouse_boys_room,"North-West");
        farmhouse_boys_room.new_exit(farmhouse_upstairs,"South-East");
        
        farmhouse_upstairs.new_exit(farmhouse_parents_room,"West");
        farmhouse_parents_room.new_exit(farmhouse_upstairs,"East");
        
        Character John = FPalace_npcs.freedom_farms_john();
        John.new_location(farmhouse_parents_room);
        
        Character Daisy = FPalace_npcs.freedom_farms_daisy();
        Daisy.new_location(farmhouse_kitchen);
        //John get's a crack at her first... otherwise Heidi is pretty much guaranteed to get her there
        Daisy.impregnate(John, true);
        
        Character heidi = FPalace_npcs.freedom_farms_heidi();
        heidi.new_location(barn_ground_sw_corner);
        //heidi.father = John;
        heidi.mother = Daisy;
        
        Daisy.impregnate(heidi, true);
        
        Character lilly = FPalace_npcs.freedom_farms_lilly();
        lilly.new_location(farm_entrance);
        lilly.father = John;
        lilly.mother = Daisy;
        
        Character lucy = FPalace_npcs.freedom_farms_lucy();
        lucy.new_location(farmhouse_girls_room);
        lucy.father = John;
        lucy.mother = Daisy;			
        
        ArrayList<Room> spawn_rooms = new ArrayList<>(Arrays.asList(barn_ground_edge1, barn_ground_edge2, barn_ground_edge3, barn_ground_edge4, barn_ground_edge5, barn_ground_edge6));
        //Add the rest of Heidi's brood-mares... one for each milking machine....
        int count = 0;
        for(count=0;count<4;count++){
            Character heidi_breeder = FPalace_npcs.freedom_farms_breeder().gen_char();
            heidi_breeder.personality.new_relationship(heidi, heidi_breeder, Relationship.initial_reaction_change, 20, Relationship.father_type);
            heidi_breeder.new_location(spawn_rooms.get((int)Math.round(Math.random()*(spawn_rooms.size()-1))));
            heidi_breeder.impregnate(heidi, true);
        }
        
        Character sarah = FPalace_npcs.freedom_farms_sarah();
        sarah.new_location(barn_hidden_basement);
        //creature.father = John;
        sarah.mother = Daisy;
        
        sarah.impregnate(John, true);
        sarah.impregnate(heidi, true);
        
        John.personality.new_relationship(Daisy, John, Relationship.initial_reaction_change, 20, Relationship.married_type);
        John.personality.new_relationship(heidi, John, Relationship.initial_reaction_change, 10, Relationship.child_type);
        John.personality.new_relationship(lilly, John, Relationship.initial_reaction_change, 25, Relationship.child_type);
        John.personality.new_relationship(lucy, John, Relationship.initial_reaction_change, 30, Relationship.child_type);
        John.personality.new_relationship(sarah, John, Relationship.initial_reaction_change, 15, Relationship.child_type);
        
        Daisy.personality.new_relationship(John, Daisy, Relationship.initial_reaction_change, 20, Relationship.married_type);
        Daisy.personality.new_relationship(heidi, Daisy, Relationship.initial_reaction_change, 20, Relationship.child_type);
        Daisy.personality.new_relationship(lilly, Daisy, Relationship.initial_reaction_change, 15, Relationship.child_type);
        Daisy.personality.new_relationship(lucy, Daisy, Relationship.initial_reaction_change, 20, Relationship.child_type);
        Daisy.personality.new_relationship(sarah, Daisy, Relationship.initial_reaction_change, 10, Relationship.child_type);
        
        heidi.personality.new_relationship(Daisy, heidi, Relationship.initial_reaction_change, 25, Relationship.mother_type);
        heidi.personality.new_relationship(John, heidi, Relationship.initial_reaction_change, 5, Relationship.father_type);
        heidi.personality.new_relationship(lilly, heidi, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        heidi.personality.new_relationship(lucy, heidi, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        heidi.personality.new_relationship(sarah, heidi, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        
        lilly.personality.new_relationship(Daisy, lilly, Relationship.initial_reaction_change, 20, Relationship.mother_type);
        lilly.personality.new_relationship(heidi, lilly, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        lilly.personality.new_relationship(John, lilly, Relationship.initial_reaction_change, 15, Relationship.father_type);
        lilly.personality.new_relationship(lucy, lilly, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        lilly.personality.new_relationship(sarah, lilly, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        
        lucy.personality.new_relationship(Daisy, lucy, Relationship.initial_reaction_change, 20, Relationship.mother_type);
        lucy.personality.new_relationship(heidi, lucy, Relationship.initial_reaction_change, 40, Relationship.sibling_type);
        lucy.personality.new_relationship(lilly, lucy, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        lucy.personality.new_relationship(John, lucy, Relationship.initial_reaction_change, 15, Relationship.father_type);
        lucy.personality.new_relationship(sarah, lucy, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        
        sarah.personality.new_relationship(Daisy, sarah, Relationship.initial_reaction_change, 20, Relationship.mother_type);
        sarah.personality.new_relationship(heidi, sarah, Relationship.initial_reaction_change, 0, Relationship.sibling_type);
        sarah.personality.new_relationship(John, sarah, Relationship.initial_reaction_change, 0, Relationship.father_type);			
        
        heidi.apply_affect_by_id(FPalaceHelper.lust_id, -heidi.get_stat(FPalaceHelper.lust_id).doubleValue(),0,null,Body.change_stats_total);
        heidi.equip(FPalace_items.Overalls(),0);
        
        area.add_room(farmhouse_entrance);
        
        
        Template_Room template_filler = new Template_Room("All around are tall stalks of corn. ");
        //scare-crows for static content (contains hay... and maybe an encounter with) crow-girls too
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.add_item(FPalace_items.cockorn(),0.5);
        template_filler.set_area_effects();			
        
        a = new CharAction();
        a.setName("There is some extremely oversized corn growing nearby. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the corn. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.goo_slime());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A Slime crawls out from the corn as you begin to push through. ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.farm_crowgirl());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A crow crashes into you just as you begin to push through the corn! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The corn trembles in the breeze to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the corn. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        
        area.set_filler_template(template_filler);
        
        return area;
    }
    
    public static Area area_desert(){
        Area area = new Area("Desert");
        area.set_move_time(3);
        area.set_colour(0xF4A460);
        //Anthro-Cactus, Sand Witch, Anthro-Scorpion
        //Merchant(Spirit of the oasis) sells: ANTI-VENOM
        //Should probably make ruins too....
        area.new_weather(FPalaceHelper.clear_skies_weather());
        
        Template_Room template_room = new Template_Room("Theres a trail of footsteps here, in a desert that stretches out as far as the eye can see. ");
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        template_room.set_area_effects();
        template_room.set_map_room_colour(0xC2B280);
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(2);
        
        area.add_room_template(template_room);
        area.random_area(100);
        
        Template_Room template_filler = new Template_Room("You're completely surrounded by sand in every direction, no signs of life anywhere. ");
        //Scorpians...
        template_filler.set_map_room_colour(0xEDC9AF);
        template_filler.set_discovery_difficulty(20);
        template_filler.set_sight_difficulty(25);
        template_filler.set_locate_difficulty(30);
        template_filler.set_area_effects();
        
        template_filler.add_item(FPalace_items.Cactus_petal(),0.1);
        template_filler.add_item(FPalace_items.pleni_chili(),0.1);
        
        CharAction a = new CharAction();
        a.setName("Trackless wastes of sand seem to be omni-present. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You trudge along the trackless wastes",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.desert_scorpion());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A scorpion slithers from the sand as you move! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.desert_lamia());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A Lamia seems to appear from nowhere! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The wastes are visible to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You trudge along the trackless wastes. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);		
        
        area.set_filler_template(template_filler);
        
        return area;
    }
    
    public static Area area_mountains(){
        Area area = new Area("Mountains");
        area.set_move_time(3);
        area.set_colour(0x87421F);
        //Fountain of Youth - age--
        //Harpies, Giants, anthro-goat, four armed people
        //Merchant(Human, hiding in a small cave):Stubby twigs
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        
        Template_Room template_room = new Template_Room("You're following a rough steep trail through mountainous terrain. ");
        template_room.add_item(FPalace_items.Stubby_twig(),0.1);
        template_room.add_item(FPalace_items.black_beans(),0.1);
        template_room.add_item(FPalace_items.thick_rice(),0.1);
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(2);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(25);
        
        Room fountain_of_youth = new Room("This is a small plateau on the mountainside, the clearing home to small bushes and brush. A small <s0>fountain</s0> sits in the middle of the area, though the area around it is barren. ");
        fountain_of_youth.add_sub_descriptions("The fountain spurts clear <a0> from the faces of <s1>three human</s1> into a deep black basin that doesn't match the other stone in the area. ");
        fountain_of_youth.add_sub_descriptions("Each of the three faces are much the same: giggling faces of new-born infants. Underneath one of them is a <s2>plaque</s2>. ");
        fountain_of_youth.add_sub_descriptions("The bronze plaque has the following words engraved:\nFountain of Youth");
        fountain_of_youth.set_id(-1);
        fountain_of_youth.set_area_effects();
            CharAction a2 = new CharAction();
            a2.setName("water");
            a2.set_dialogue("The water is clear, and there is even a small cup on a chain to </c0> from it.\n");

            Challenge c2 = new Challenge();
            c2.set_attack_stat(-1,10);
            c2.set_defense_stat(-1,5);
            c2.setVariability(0);
            c2.setText("drink");
            Consequence con2 = new Consequence();

            con2.addConsequence(FPalaceHelper.age_id,-7, "The water is cool and as clean as it's clarity suggested. ",0);

            a2.addChallenge(c2,con2);

        fountain_of_youth.addAction(a2);

        area.add_room(fountain_of_youth);
        
        Template_Room template_filler = new Template_Room("You're in a series of strangely connected valleys and hills");
        template_filler.add_item(FPalace_items.Stubby_twig(),0.1);
        template_filler.add_item(FPalace_items.black_beans(),0.1);
        template_filler.add_item(FPalace_items.thick_rice(),0.1);
        template_filler.set_area_effects();
        template_filler.set_map_room_colour(0x87421F);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        CharAction a = new CharAction();
        a.setName("Some rocky crags and valleys dot the view. ");//</path>
        a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",4);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You manage to make your way through the hills and valleys. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.mountain_cougar());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A cougar leaps from a cravase! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,0);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(2);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.mountain_harpy());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A Harpy begins to harangue you from above! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,3);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.mountain_goatgirl());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A goat grabs at you from a gorge! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("A hidden path juts off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You manage to make your way through the hills and valleys. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        area.set_filler_template(template_filler);
        
        return area;
    }
    
    public static Area area_century_city(){
        Area area = new Area("Century City");
        area.set_move_time(2);
        area.set_colour(0x808069);
        //City of Humility - Everyone where masks and things to lower their stats. The land of 'equality'
        //Merchant(Human, stores):Clothing
        //Would like some sort of pharmasutical company running
        //Would like to add the Futa Family from Girlfriends Futanari Secret (Brian, Anna, Zoe, and Catherine)... Kinda there
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.add_item(FPalace_items.garbage(), 0.1);
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character(FPalace_npcs.male_human_century_city(),1);
        template_house.add_character(FPalace_npcs.female_human_century_city(),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        area.add_room_template(template_house);
        area.random_area(10,template_house);
        
        Template_Room corner_store = new Template_Room("This store is filled with shelves covered in boxes and cans proudly claiming their products benefits. ");
        corner_store.set_map_room_colour(0x5C4033);
        corner_store.set_no_area_exit();
        corner_store.add_no_connect_template(template_house);
        corner_store.add_no_connect_template(kitchens);
        corner_store.add_no_connect_template(bedrooms);
        
        corner_store.add_character(FPalace_npcs.century_city_shopkeeper(), 1);
        
        area.random_area(1, corner_store);
        
        Template_Room correction_office = new Template_Room("There is a large bronze sign upon the wall proudling proclaring this to be the \"Corrections Office\". There are a number of strange objects lining the walls, and a small desk with a till underneath the sign. ");
        correction_office.set_map_room_colour(0x5C4033);
        correction_office.set_no_area_exit();
        correction_office.add_no_connect_template(template_house);
        correction_office.add_no_connect_template(kitchens);
        correction_office.add_no_connect_template(bedrooms);
        correction_office.add_no_connect_template(corner_store);
        
        correction_office.add_character(FPalace_npcs.correction_office_shopkeeper(), 1);
        
        area.random_area(1, correction_office);
        
        Template_Room mall_foyer = new Template_Room("You're standing in a mall foyer. ");
        mall_foyer.set_map_room_colour(0x5C4033);
        mall_foyer.set_max_same_exits(0);
        mall_foyer.set_no_area_exit();
        
        Template_Room clothing_store = new Template_Room("You're standing in a small clothing store. ");
        clothing_store.set_map_room_colour(0x5C4033);
        clothing_store.set_max_same_exits(0);
        clothing_store.set_no_area_exit();
        clothing_store.add_character(FPalace_npcs.century_city_clothing_store_clerk(), 1);
        
        mall_foyer.add_other_room(clothing_store);
        
        Template_Room shoe_store = new Template_Room("You're standing in a small shoe store. ");
        shoe_store.set_map_room_colour(0x5C4033);
        shoe_store.set_max_same_exits(0);
        shoe_store.set_no_area_exit();
        shoe_store.add_character(FPalace_npcs.century_city_shoe_store_clerk(), 1);
        
        mall_foyer.add_other_room(shoe_store);
        
        Template_Room medical_supplies_store = new Template_Room("You're standing in a small medical supplies store. ");
        medical_supplies_store.set_map_room_colour(0x5C4033);
        medical_supplies_store.set_max_same_exits(0);
        medical_supplies_store.set_no_area_exit();
        medical_supplies_store.add_character(FPalace_npcs.century_city_medical_supplies_clerk(), 1);
        
        mall_foyer.add_other_room(medical_supplies_store);
        
        mall_foyer.add_no_connect_template(template_house);
        mall_foyer.add_no_connect_template(kitchens);
        mall_foyer.add_no_connect_template(bedrooms);
        mall_foyer.add_no_connect_template(corner_store);
        mall_foyer.add_no_connect_template(correction_office);
        
        area.add_room_template(mall_foyer);
        area.random_area(1,mall_foyer);
        
        Template_Room Johnson_template = new Template_Room();
        Johnson_template.set_map_room_colour(0x5C4033);
        Johnson_template.set_no_area_exit();
        Johnson_template.add_no_connect_template(template_house);
        Johnson_template.add_no_connect_template(kitchens);
        Johnson_template.add_no_connect_template(bedrooms);
        Johnson_template.add_no_connect_template(corner_store);
        Johnson_template.add_no_connect_template(correction_office);
        Johnson_template.add_no_connect_template(mall_foyer);
        Johnson_template.add_no_connect_template(medical_supplies_store);
        Johnson_template.add_no_connect_template(shoe_store);
        Johnson_template.add_no_connect_template(clothing_store);
        
        Room Johnson_house = new Room();
        Johnson_house.set_template(Johnson_template);
        Johnson_house.set_description("This is the living room of a surprisingly modern house. There's a coach, and a television set up against the stairs. ");
        
        Room Johnson_kitchen = new Room();
        Johnson_kitchen.set_template(Johnson_template);
        Johnson_kitchen.set_description("This small spotless kitchen is home to an oven, a sink, and a refridgerator that *wirrs*. ");
        
        Room Johnson_landing = new Room();
        Johnson_landing.set_template(Johnson_template);
        Johnson_landing.set_description("This is the landing of the stairs that head down back to the main floor. There a number of doors, some of which seem to have been customized. ");
        
        
        Room Johnson_brians_room = new Room();
        Johnson_brians_room.set_template(Johnson_template);
        Johnson_brians_room.set_description("This is a pretty standard bedroom of a six year old boy. ");
        Character Brian = FPalace_npcs.century_city_brian();
        Brian.new_location(Johnson_brians_room);
        
        Room Johnson_annas_room = new Room();
        Johnson_annas_room.set_template(Johnson_template);
        Johnson_annas_room.set_description("This is a pretty standard bedroom of a thirteen year old girl. ");
        Character Anna = FPalace_npcs.century_city_anna();
        Anna.new_location(Johnson_annas_room);
        
        Room Johnson_zoes_room = new Room();
        Johnson_zoes_room.set_template(Johnson_template);
        Johnson_zoes_room.set_description("This is a pretty standard bedroom of a sixteen year old girl. ");
        Character Zoe = FPalace_npcs.century_city_zoe();
        Zoe.new_location(Johnson_zoes_room);
        
        Room Johnson_catherines_room = new Room();
        Johnson_catherines_room.set_template(Johnson_template);
        Johnson_catherines_room.set_description("This bedroom has a fullsize king bed, as well as armoirs and dressers assorted around a vanity. ");
        Character Catherine = FPalace_npcs.century_city_catherine();
        Catherine.new_location(Johnson_catherines_room);
        
        Catherine.personality.new_relationship(Brian, Catherine, Relationship.initial_reaction_change, 20, Relationship.child_type);
        Catherine.personality.new_relationship(Anna, Catherine, Relationship.initial_reaction_change, 10, Relationship.child_type);
        Catherine.personality.new_relationship(Zoe, Catherine, Relationship.initial_reaction_change, 15, Relationship.child_type);
        Brian.mother = Catherine;
        Brian.father = Catherine;
        Brian.personality.new_relationship(Catherine, Brian, Relationship.initial_reaction_change, 25, Relationship.mother_type);
        Brian.personality.new_relationship(Anna, Brian, Relationship.initial_reaction_change, 10, Relationship.sibling_type);
        Brian.personality.new_relationship(Zoe, Brian, Relationship.initial_reaction_change, 20, Relationship.sibling_type);
        
        Anna.mother = Catherine;
        Anna.father = Catherine;
        Anna.personality.new_relationship(Catherine, Anna, Relationship.initial_reaction_change, 10, Relationship.mother_type);
        Anna.personality.new_relationship(Brian, Anna, Relationship.initial_reaction_change, 20, Relationship.sibling_type);
        Anna.personality.new_relationship(Zoe, Anna, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        
        Zoe.mother = Catherine;
        Zoe.father = Catherine;
        Zoe.personality.new_relationship(Catherine, Zoe, Relationship.initial_reaction_change, 15, Relationship.mother_type);
        Zoe.personality.new_relationship(Brian, Zoe, Relationship.initial_reaction_change, 20, Relationship.sibling_type);
        Zoe.personality.new_relationship(Anna, Zoe, Relationship.initial_reaction_change, 15, Relationship.sibling_type);
        
        Room Johnson_upstairs_bathroom = new Room();
        Johnson_upstairs_bathroom.set_template(Johnson_template);
        Johnson_upstairs_bathroom.set_description("This is a modern bathroom, with fullsize bath, toilet, and sink. ");
        
        Johnson_house.new_exit(Johnson_landing,"Up");
        Johnson_landing.new_exit(Johnson_house,"Down");
        
        Johnson_house.new_exit(Johnson_kitchen);
        Johnson_landing.new_exit(Johnson_brians_room);
        Johnson_landing.new_exit(Johnson_annas_room);
        Johnson_landing.new_exit(Johnson_zoes_room);
        Johnson_landing.new_exit(Johnson_catherines_room);
        Johnson_landing.new_exit(Johnson_upstairs_bathroom);
        
        
        area.add_room(Johnson_house);
        
        
        Template_Room inn_template = new Template_Room("This is a rather upscale hotel. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(corner_store);
        inn_template.add_no_connect_template(correction_office);
        inn_template.add_no_connect_template(mall_foyer);
        inn_template.add_no_connect_template(medical_supplies_store);
        inn_template.add_no_connect_template(shoe_store);
        inn_template.add_no_connect_template(clothing_store);
        inn_template.add_no_connect_template(Johnson_template);
        inn_template.add_character(FPalace_npcs.century_city_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        Template_Room doctor_template = new Template_Room("This is a rather small medical facility. ");
        doctor_template.set_map_room_colour(0x5C4033);
        doctor_template.set_no_area_exit();
        doctor_template.add_no_connect_template(template_house);
        doctor_template.add_no_connect_template(kitchens);
        doctor_template.add_no_connect_template(bedrooms);
        doctor_template.add_no_connect_template(corner_store);
        doctor_template.add_no_connect_template(correction_office);
        doctor_template.add_no_connect_template(mall_foyer);
        doctor_template.add_no_connect_template(medical_supplies_store);
        doctor_template.add_no_connect_template(shoe_store);
        doctor_template.add_no_connect_template(clothing_store);
        doctor_template.add_no_connect_template(Johnson_template);
        doctor_template.add_no_connect_template(inn_template);
        doctor_template.add_character(FPalace_npcs.century_city_doctor(), 1);
        
        area.add_room_template(doctor_template);
        area.random_area(1,doctor_template);
        
        Template_Room gro_corp_foyer = new Template_Room("You're standing in the attrium of what appears to be a medical research company. ");
        gro_corp_foyer.set_map_room_colour(0x5C4033);
        gro_corp_foyer.set_max_same_exits(0);
        gro_corp_foyer.set_no_area_exit();
        
        Template_Room gro_corp_lab = new Template_Room("You're standing in a lab. ");
        gro_corp_lab.set_map_room_colour(0x5C4033);
        gro_corp_lab.set_max_same_exits(0);
        gro_corp_lab.set_no_area_exit();
        gro_corp_lab.add_character(FPalace_npcs.gro_corp_doctor(), 1);
        
        gro_corp_foyer.add_other_room(gro_corp_lab);
        
        gro_corp_foyer.add_no_connect_template(template_house);
        gro_corp_foyer.add_no_connect_template(kitchens);
        gro_corp_foyer.add_no_connect_template(bedrooms);
        gro_corp_foyer.add_no_connect_template(corner_store);
        gro_corp_foyer.add_no_connect_template(correction_office);
        gro_corp_foyer.add_no_connect_template(mall_foyer);
        gro_corp_foyer.add_no_connect_template(medical_supplies_store);
        gro_corp_foyer.add_no_connect_template(shoe_store);
        gro_corp_foyer.add_no_connect_template(clothing_store);
        gro_corp_foyer.add_no_connect_template(Johnson_template);
        gro_corp_foyer.add_no_connect_template(inn_template);
        gro_corp_foyer.add_no_connect_template(doctor_template);
        gro_corp_foyer.add_character(FPalace_npcs.gro_corp_receptionist(), 1);
        
        area.add_room_template(gro_corp_foyer);
        area.random_area(1,gro_corp_foyer);
        
        return area;
    }
    
    public static Area area_futa_high(){
        Area area = new Area("Our Lady of Futama High School");
        area.set_move_time(1);
        //Futa High! A few students are futa (or latent futa). Everyone else is a good citizen of Century City.
        //Merchant(Vending Machine):Soda
        Template_Room template_room = new Template_Room("This looks like a highschool. There are lockers everywhere. ");
        template_room.add_character(FPalace_npcs.futa_high_Male(),0.4);
        template_room.add_character(FPalace_npcs.futa_high_Female(),0.4);
        template_room.set_max_same_exits(2);
        area.add_room_template(template_room);
        area.random_area(20);
        
        Template_Room cafeteria_template = new Template_Room();
        Room cafeteria = new Room("You're in what is clearly a cafeteria, large tables with chairs circling them lining the room. A small <s0>alcove</s0> looks like it services the demand for food. ");
        cafeteria.add_sub_descriptions("Large <a0> dominate a wall, while a small opening next to them shows a shudder and a closed sign. ");
        cafeteria.set_template(cafeteria_template);
        cafeteria.set_id(-1);

            CharAction a2 = new CharAction();
            a2.setName("vending machines");
            a2.set_dialogue("The machine has the following offerings:\n</c0> 50gp\n</c1> 10gp\n");

            Challenge challenge = new Challenge();
            challenge.set_attack_stat(Character.gold_id);
            challenge.set_defense_stat(-1,50);
            challenge.setVariability(0);
            challenge.setText("Cola");
            ItemConsequence itemconsequence = new ItemConsequence();
            //check to make sure the character can afford, and add to inventory if they can.
            itemconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The machine whizes and grinds. A cola drops from the dispensor. ",0);
            itemconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "You find you don't have enough money to feed the machine. ",-1);
            itemconsequence.add_item_reward(FPalace_items.futa_cola(), 0);
            itemconsequence.add_item_reward(FPalace_items.gold(-50), 0);
            
            a2.addChallenge(challenge,itemconsequence);
            
            challenge = new Challenge();
            challenge.set_attack_stat(Character.gold_id);
            challenge.set_defense_stat(-1,10);
            challenge.setVariability(0);
            challenge.setText("lollipop");
            itemconsequence = new ItemConsequence();
            //check to make sure the character can afford, and add to inventory if they can.
            itemconsequence.addConsequence(FPalaceHelper.lust_id, 0, "The machine whizes and grinds. A lollipop drops from the dispensor. ",0);
            itemconsequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "You find you don't have enough money to feed the machine. ",-1);
            itemconsequence.add_item_reward(FPalace_items.loli_pop(), 0);
            itemconsequence.add_item_reward(FPalace_items.gold(-10), 0);
            
            a2.addChallenge(challenge,itemconsequence);
            
        cafeteria.addAction(a2);

        area.add_room(cafeteria);
        
        FPalace_npcs.futa_high_shemale_sammy().new_location(area.get_random_room());
        
        FPalace_npcs.futa_high_teacher_timmins().new_location(area.get_random_room());
        
        FPalace_npcs.futa_high_queen_jane().new_location(area.get_random_room());
        
        Template_Room school_store = new Template_Room("This is a small shop with a sign proudly proclairing it has everything a student could need. ");
        school_store.set_map_room_colour(0x5C4033);
        school_store.set_no_area_exit();
        
        school_store.add_character(FPalace_npcs.school_store_shopkeeper(), 1);
        
        area.random_area(1, school_store);
        
        Template_Room girls_locker_template = new Template_Room();
        girls_locker_template.add_no_connect_template(school_store);
        girls_locker_template.add_no_connect_template(cafeteria_template);
        girls_locker_template.set_no_area_exit();
        Room girls_locker = new Room("This is a <s0>locker</s0> room with a definitely emphasis on pink. ");
        girls_locker.set_template(girls_locker_template);
        girls_locker.add_sub_descriptions("Most of the lockers are closed, though there's one that's <a0>.");
        CharAction empty_locker_action = new CharAction();
        empty_locker_action.setName("open");
        empty_locker_action.set_dialogue("The locker is completely empty. \n");
        
        CharAction a = new CharAction();
        a.setName("open");
        a.set_dialogue("A bra hangs from a hook, begging to be </c0>.\n");
        
        Challenge c = new Challenge();
        c.set_attack_stat(-1,1);
        c.set_defense_stat(-1,0);
        c.setVariability(0);
        c.setText("grabbed");
        ItemConsequence itemcon = new ItemConsequence();
        
        itemcon.set_replace_action(empty_locker_action);
        itemcon.addConsequence(FPalaceHelper.dex_id,0, "You snatch the bra. </replace>",0);
        itemcon.add_item_reward(FPalace_items.training_bra(), 0);
        a.addChallenge(c,itemcon);
        
        girls_locker.addAction(a);
        
        area.add_room(girls_locker);
        
        Template_Room boys_locker_template = new Template_Room();
        boys_locker_template.add_no_connect_template(school_store);
        boys_locker_template.add_no_connect_template(cafeteria_template);
        boys_locker_template.add_no_connect_template(girls_locker_template);
        boys_locker_template.set_no_area_exit();
        Room boys_locker = new Room("This is a <s0>locker</s0> room with a definite emphasis on blue. ");
        boys_locker.set_template(girls_locker_template);
        boys_locker.add_sub_descriptions("Most of the lockers are closed, though there's one that's <a0>.");
        
        a = new CharAction();
        a.setName("open");
        a.set_dialogue("A jockstrap lies on the bottom of the locker, begging to be </c0>.\n");
        
        c = new Challenge();
        c.set_attack_stat(-1,1);
        c.set_defense_stat(-1,0);
        c.setVariability(0);
        c.setText("grabbed");
        itemcon = new ItemConsequence();			
        itemcon.set_replace_action(empty_locker_action);
        itemcon.addConsequence(FPalaceHelper.dex_id,0, "You snatch the jockstrap. </replace>",0);
        itemcon.add_item_reward(FPalace_items.jutting_jockstrap(), 0);
        a.addChallenge(c,itemcon);
        
        boys_locker.addAction(a);
        
        area.add_room(boys_locker);
        
        Room alchemy_room = new Room("This is a science classroom, filled with bottles, cleaning supplies, taps, and <s0>benches</s0>. ");
        alchemy_room.add_sub_descriptions("The bench seems to have a number of devices useful for <a0>. ");
        alchemy_room.set_id(-1);
        
        a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        alchemy_room.addAction(a);
        
        
        area.add_room(alchemy_room);
        
        return area;
    }
    
    public static Area area_bee_hive(){
        Area area = new Area("Giant Bee Hive");
        area.set_move_time(1);
        //some sort of bee girl - encounter with a queen
        //Merchant(Human, girl in apiary outfil):Honey
        Template_Room template_room = new Template_Room("You see giant honeycomb everywhere. ");
        template_room.add_item(FPalace_items.Honey(),0.1);
        template_room.set_max_same_exits(2);
        template_room.add_character(FPalace_npcs.bee_girl(),0.3);
        
        area.add_room_template(template_room);
        area.random_area(25);
        
        Template_Room beehive_store = new Template_Room("Strangely, someone has setup a stall here upon the honeycombs.");
        beehive_store.set_map_room_colour(0x5C4033);
        beehive_store.set_no_area_exit();
                    
        beehive_store.add_character(FPalace_npcs.bee_hive_shopkeeper(), 1);
        
        area.random_area(1, beehive_store);
        
        area.add_creature_spawn(FPalace_npcs.bee_girl());
        area.set_spawn_threshold(5);
        
        return area;
    }
    
    public static Area area_under_lake(){
        Area area = new Area("Underground Lake");
        area.set_move_time(2);
        area.set_colour(0xCDCD00);
        //Giant tentacle beastie, Mermaids, Amphibious humanoids, etc.)
        //Merchant(Male Gobi Fish): ?
        Template_Room template_room = new Template_Room("You stand underground along a ledge next to a large dark lake. ");
        template_room.add_item(FPalace_items.mushrooms(),0.4);
        template_room.add_item(FPalace_items.gaping_moss(),0.1);
        template_room.set_max_same_exits(2);
        
        area.add_room_template(template_room);
        area.random_area(10);
        
        Template_Room template_filler = new Template_Room("You're standing in knee deep water. ");
        template_filler.add_item(FPalace_items.sperm_fish(), 0.3);
        template_filler.add_item(FPalace_items.floppy_cucumber(), 0.15);
        
        template_filler.set_map_room_colour(0x1C6BA0);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        
        CharAction a = new CharAction();
        a.setName("The sea casts its waves here. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",5);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.swimming_id);
        challenge.set_defense_stat(-1,10);
        challenge.setVariability(20);
        challenge.setText("");

        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.set_never_move();
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0,0,0,1);
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "You find yourself struggling to swim. ",-1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,4);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You swim along. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You swim along. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,3);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.lake_jellyfish());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A jellyfish gives you a jolt! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,4);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.lake_mermaid());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A mermaid makes you stop moving! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,0);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("The water lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        area.set_filler_template(template_filler);
        
        return area;
    }
    
    public static Area area_ocean(){
        Area ocean = new Area("Ocean");
        ocean.set_move_time(3);			
        ocean.set_colour(0x1C6BA0);
        ocean.new_weather(FPalaceHelper.clear_skies_weather());
        ocean.new_weather(FPalaceHelper.rain_weather());
        Template_Room template_filler = new Template_Room("You're doing your best to swim here. ");
        template_filler.set_map_room_colour(0x1C6BA0);
        template_filler.set_discovery_difficulty(30);
        template_filler.set_sight_difficulty(40);
        template_filler.set_locate_difficulty(30);
        template_filler.set_area_effects();
        
        
        CharAction a = new CharAction();
        a.setName("The ocean casts its waves here. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",6);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.swimming_id);
        challenge.set_defense_stat(-1,10);
        challenge.setVariability(20);
        challenge.setText("");

        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.set_never_move();
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0,0,0,1);
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "You choke and struggle as you attempt to swim, finding yourself staying put by the end. ",-1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,4);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You swim along. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,6);
        challenge.setVariability(20);
        challenge.setText("");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You swim along. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,3);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.stealing_seagull());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A seagull attacks from above! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,4);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,0);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(2);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.oppai_octopus());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "An octopus assails you from the abyss! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,5);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.tsunedere_shark());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A shark strikes! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,0);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("The water lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        ocean.add_room_template(template_filler);
        ocean.random_area(20);
        
        ocean.set_filler_template(template_filler);
        
        return ocean;
    }
    
    public static Area area_volcano(){
        Area area = new Area("Volcano");
        area.set_move_time(3);
        area.set_colour(0x660000);
        //Anthro-lizards, fire/rock golems apparently
        //Merchant(Herm Liz-girl): Weapons
        Template_Room template_room = new Template_Room("You are deep inside a volcano. ");
        template_room.set_max_same_exits(2);
        
        area.add_room_template(template_room);
        
        area.random_area(10);
        
        Template_Room template_filler = new Template_Room("You're standing knee deep in lava. ");
        
        template_filler.set_map_room_colour(0x9C2A00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        CharAction a = new CharAction();
        a.setName("Lava glows ominously here. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "Your feet burn as you move along the lava. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.volcano_salamander());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A salamander strikes from a perch! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.volcano_roc());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A ravenous Roc makes the magma around you move! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The lava lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "Your feet burn as you move along the lava. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);		
        
        
        area.set_filler_template(template_filler);
        return area;
    }
    
    public static Area area_snow_plain(){
        Area area = new Area("Snow Plains");
        area.set_move_time(3);
        //Winter witch, Vikings
        //Merchant(Viking): Armour
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        
        Template_Room template_room = new Template_Room("You stand on winter plains, an occasional fur tree dotting the view. ");
        template_room.add_item(FPalace_items.snowy_flower(), 0.15);
        template_room.add_item(FPalace_items.iceberg_lettuce(), 0.1);
        template_room.set_area_effects();
        
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(2);
        
        area.add_room_template(template_room);
        area.random_area(25);
        
        Template_Room template_filler = new Template_Room("You're standing in a wasteland of white, no trail or life to be seen. ");
        template_filler.add_item(FPalace_items.snowy_flower(), 0.15);
        template_filler.add_item(FPalace_items.iceberg_lettuce(), 0.1);
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        
        CharAction a = new CharAction();
        a.setName("Untouched snow peacefully sits nearby. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You tromp through the pristine snow. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.snow_reindeer());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A reindeer crashes into you as you try to pass through the snow! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.parisol_penguin());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A penguin blocks your path, demanding payment! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The snow lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You tromp through the pristine snow. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);		
        
        
        area.set_filler_template(template_filler);
        
        return area;
    }
    
    public static Area area_spider_den(){
        Area area = new Area("Spider Queens Den");
        area.set_move_time(1);
        //some sort of spider girl - encounter with a queen
        //Merchant(cliche Terrified man in hiding, but still willing to sell stuff): ANTIVENOM
        Template_Room template_room = new Template_Room("You see giant spider-webs everywhere. ");
        template_room.add_character(FPalace_npcs.spider_girl(),0.5);
        template_room.set_max_same_exits(2);
        
        area.add_room_template(template_room);
        
        area.add_creature_spawn(FPalace_npcs.spider_girl());//there should always be a minimum of 5 spider girls wandering around
        area.set_spawn_threshold(5);
        
        area.random_area(10);
        
        return area;
    }
    
    public static Area area_nunnery(){
        Area area = new Area("Nunnery of the Fertile Crescent");
        area.set_move_time(1);
        //fertility priestesses/nuns (un-impregnable, but having sex with one increases cocks size and fertility)
        //Merchant(Sex Nun): Min lust potions
        Template_Room template_room = new Template_Room("You find yourself in cloistered halls, every surface covered in some sort of religious symbols. ");
        template_room.add_character(FPalace_npcs.nunnery_nun(),0.5);
        template_room.set_max_same_exits(2);
        area.add_room_template(template_room);
        area.random_area(10);
        
        Template_Room fertility_shop = new Template_Room("The nuns have set up a small shop here, selling all sort of nick nacks, fertility charms, and marital aids. ");
        fertility_shop.set_map_room_colour(0x5C4033);
        fertility_shop.set_no_area_exit();
        fertility_shop.add_character(FPalace_npcs.nunnery_shopkeeper(), 1);
        
        area.random_area(1, fertility_shop);			
        
        Template_Room trans_divine_template = new Template_Room();
        trans_divine_template.set_no_area_exit();
        
        Room trans_divine = new Room("You're standing in something of a chapel a large <a0> looming over the pulpit and rest of the <a1>. ");
        trans_divine.set_template(trans_divine_template);
        trans_divine.set_id(-1);
        trans_divine.set_discovery_difficulty(-1);
        trans_divine.set_locate_difficulty(-1);
        
        CharAction a2 = new CharAction();
        a2.setName("statue");
        a2.set_dialogue("As you stare at the statue it seems like the rest of the world is bathed in white light that has made every detail of the statue visible. Even the stone robes on the </c0> appear translucent. ");

        Challenge c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("figure");

        Consequence con2 = new Consequence();
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "The statue is of a softly smiling woman, though her garments translucency leaves you gaping at the out of place </c1> dangling and gently oozing stone droplets. ",-1,1);
        
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "The statue is of a softly smiling woman. Despite her garments translucency you can see her </c2> are supposed to have stained the garment. ",0);

        a2.addChallenge(c2,con2);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("penis");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "The feeling of being stared at becomes over-powering as you gaze at the statues genitalia, and you raise your gaze, only to find the statue looking at you with an enormous grin. You blink, and the statue is back as it was when you first gazed upon it. ",-1);
        con2.add_change_effect(FPalace_classes.cclass_fertility_nun());
        con2.add_change_effect(FPalaceHelper.new_penis(null));
        con2.add_change_effect(FPalaceHelper.new_balls(null));
        
        a2.addChallenge(c2,con2);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("breasts");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "You feel a strange surge in your chest, and can't help but feel a strange new weight appear. Your gaze immediatly shoots to the statue, where a suddenly </c3> catches your attention. ",-1);
        con2.add_change_effect(FPalaceHelper.new_breasts(null));
        
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "You stare long an hard at the strange statue, and it isn't long before you see that not only do it's breasts appear to be leaking, but it also has a </c3>. ",0);

        a2.addChallenge(c2,con2);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("moist groin");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "A sharp pain from your own groin suddenly takes your eyes from the statue for a moment, and blinding pain takes over. When you open your eyes, the statue is back as it was when you first gazed upon it. ",-1);
        con2.add_change_effect(FPalace_classes.cclass_fertility_nun());
        con2.add_change_effect(FPalaceHelper.new_vagina(null));
        con2.add_change_effect(FPalaceHelper.new_clit(null));
        
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "A </c4> suddenly seems to emenate from the statue, causing you to blink and shield your eyes. ",0);

        a2.addChallenge(c2,con2);
        
        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.vaginal_depth_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("blinding light");

        con2 = new Consequence();
        con2.set_always_change();
        con2.add_change_effect(FPalace_classes.cclass_fertility_nun());
        con2.addConsequence(FPalaceHelper.semen_fertility_id,0.05, "As the light fades, and your eyes once again adjust to the area around you, you're surprised to find the statue is back as it was when you first gazed upon it. ",0);
        con2.addConsequence(FPalaceHelper.egg_fertility_id,0.05, "",0);
        
        a2.addChallenge(c2,con2);

        trans_divine.addAction(a2);
        
        Template_Room hidden_template_room = new Template_Room("");
        hidden_template_room.set_filler_connect();
        hidden_template_room.set_unconnected();
        hidden_template_room.set_map_room_colour(0x5C4033);
        Room nunnery_hidden_basement = new Room("You're standing in a dark room, light glinting through the floorboards above showing tables covered in various powders. ");
        nunnery_hidden_basement.set_template(hidden_template_room);
        Character drug_dealer = FPalace_npcs.nunnery_dealer().gen_char();
        drug_dealer.new_location(nunnery_hidden_basement);
        
        a2 = new CharAction();
        a2.setName("room");
        a2.set_dialogue("",0);
        c2 = new Challenge();
            c2.set_room_challenge(Challenge.EXITCHECK);
            c2.set_defense_stat(-1,0);
            c2.setVariability(0);
            c2.setText("");
            RoomConsequence rcon2 = new RoomConsequence();
            rcon2.set_never_change();
            rcon2.addConsequence(FPalaceHelper.lust_id,0, "It's hard not to notice the open trapdoor behind the statue. You could probably </c3> it. ",0);//exit exists... close
            rcon2.addConsequence(FPalaceHelper.lust_id,0, "",-1,0,0,2);
            rcon2.add_room_effect(trans_divine, nunnery_hidden_basement);
                
            a2.addChallenge(c2,rcon2);
            
            c2 = new Challenge();
            c2.set_attack_stat(-1,0);
            c2.set_attack_item(FPalace_items.nunnery_trapdoor_key());
            c2.set_defense_stat(-1,1);
            c2.setVariability(0);
            c2.setText("trapdoor");
            RoomConsequence barn_trapdoor = new RoomConsequence();
            barn_trapdoor.addConsequence(FPalaceHelper.lust_id,0, "You tug on the trapdoor to no avail, only noticing a lock after the attempt. ",-1);
            barn_trapdoor.addConsequence(FPalaceHelper.lust_id,0, "You open the trapdoor with the key, reavealing a way down. ",0);
            barn_trapdoor.add_room_effect(trans_divine, nunnery_hidden_basement);
            
            a2.addChallenge(c2,barn_trapdoor);
            
            c2 = new Challenge(true);//2
            c2.set_attack_stat(FPalace_skills.perception_id);
            c2.set_defense_stat(-1,20);
            c2.setVariability(20);
            c2.setText("");
            con2 = new Consequence();
            con2.addConsequence(FPalaceHelper.lust_id,0, "You poke around the chapel but find little out of place. ",-1);
            con2.addConsequence(FPalaceHelper.lust_id,0, "You look around the room, and are surprised to find a </c1> behind the statue! ",0);

            a2.addChallenge(c2,con2);
            
            c2 = new Challenge(true);//3
            c2.set_room_challenge(Challenge.EXITCHECK);
            c2.set_defense_stat(-1, 0);
            c2.setVariability(0);
            c2.setText("close");
            rcon2 = new RoomConsequence();
            //con.add_consequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
            rcon2.addConsequence(FPalaceHelper.con_id,0, "You close the trapdoor. ",0);
            rcon2.add_room_effect(trans_divine, nunnery_hidden_basement);
            a2.addChallenge(c2,rcon2);
        trans_divine.addAction(a2);
        
        trans_divine.new_exit(nunnery_hidden_basement,"Down");
        nunnery_hidden_basement.new_exit(trans_divine,"Up");
        
        area.add_room(trans_divine);			
        
        barn_trapdoor.trigger(0);
        
        return area;
    }
    
    public static Area area_amazon_beach(){
        Area area = new Area("Amazonian Beach");
        area.set_move_time(3);
        area.set_colour(0x9CCB19);
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        
        Template_Room template_room = new Template_Room("You stand on fine sand beach, ocean to one side, and woods to the other. ");
        template_room.set_max_same_exits(2);
        template_room.add_item(FPalace_items.coconuts(), 0.3);
        template_room.add_item(FPalace_items.black_onion(), 0.15);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(25);
        
        Template_Room template_filler = new Template_Room("You're standing in a small uncleared section of brush, young, vibrant trees surrounding you. ");
        template_filler.add_item(FPalace_items.coconuts(), 0.3);
        template_filler.add_item(FPalace_items.black_onion(), 0.15);
        //template_filler.add_character(FPalace_npcs.vag_snake(),0.2);
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        
        CharAction a = new CharAction();
        a.setName("Untouched forest sits nearby. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",4);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You bumble through the brush. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.beach_crab());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A crab crawls out from the brush as you begin to push through. ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,0);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(2);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.beach_turtle());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A turtle trundles into you! ",0);
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,3);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.beach_otter());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "An otter opens an attack! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The brush lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You bumble through the brush. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);			
        
        
        area.set_filler_template(template_filler);
        
        Room tanning_spot = new Room("It looks like someone has setup for some tanning here, with a small umbrella and a rolled out <s0>towel</s0>. ");
        tanning_spot.add_sub_descriptions("Everything is meticulously laid out, and you can see whomever set the scenario up has left their <a0>.");
        tanning_spot.set_area_effects();
        CharAction nothing_action = new CharAction();
        nothing_action.setName("possessions");
        nothing_action.set_dialogue("It doesn't look like there's anything valuable. \n");
        
        a = new CharAction();
        a.setName("possessions");
        a.set_dialogue("A swimsuit lays there, begging to be </c0>.\n");
        
        Challenge c = new Challenge();
        c.set_attack_stat(-1,1);
        c.set_defense_stat(-1,0);
        c.setVariability(0);
        c.setText("grabbed");
        ItemConsequence itemcon = new ItemConsequence();
        
        itemcon.set_replace_action(nothing_action);
        itemcon.addConsequence(FPalaceHelper.dex_id,0, "You snatch the swimsuit. </replace>",0);
        itemcon.add_item_reward(FPalace_items.prosperous_one_piece(), 0);
        a.addChallenge(c,itemcon);
        
        tanning_spot.addAction(a);
        
        area.add_room(tanning_spot);			
        
        return area;
    }
    
    public static Area area_amazon_forest(){
        Area area = new Area("Amazonian Forest");
        area.set_move_time(3);
        //Cock and Vag snakes for the Amazonians to use...
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x9CCB19);
        
        Template_Room template_room = new Template_Room("You stand in a light airy forest, sunlight surprisingly abundent. ");
        template_room.add_item(FPalace_items.hearty_pepper(), 0.2);
        template_room.add_item(FPalace_items.floppy_cucumber(), 0.01);
        template_room.set_area_effects();
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
                    
        area.add_room_template(template_room);
        area.random_area(25);
        
        Template_Room template_filler = new Template_Room("You're standing in a small uncleared section of brush, young, vibrant trees surrounding you. ");
        template_filler.add_item(FPalace_items.hearty_pepper(), 0.3);
        template_filler.add_item(FPalace_items.floppy_cucumber(), 0.15);
        //template_filler.add_character(FPalace_npcs.vag_snake(),0.2);
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        
        CharAction a = new CharAction();
        a.setName("Untouched forest sits nearby. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",4);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You bumble through the brush. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.cock_snake());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A snake crawls out from the brush as you begin to push through. ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,0);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(2);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.vag_snake());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A snake crawls out from the brush as you begin to push through. ",0);
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,3);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.forest_snail());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A snail stumbles into you! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The brush lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You bumble through the brush. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);			
        
        
        area.set_filler_template(template_filler);
        
        Template_Room alchemists_hut = new Template_Room("You're inside a small wooden hut, little here beyond a small bed, and a large <s0>cauldron</s0> inside and equally enormous fireplace. ");
        alchemists_hut.set_map_room_colour(0x5C4033);
        alchemists_hut.set_no_area_exit();
        
        Room temp_room = alchemists_hut.make_room();
        temp_room.add_sub_descriptions("The cauldron could probably be used for <a0>. ");
        
        a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        temp_room.addAction(a);
        
        Character temp_char = FPalace_npcs.amazonian_alchemist();
        
        Conversation_topic alchemy_lesson = new Conversation_topic();
        alchemy_lesson.set_no_spread();
        alchemy_lesson.set_topic_name("Learning Alchemy");
        
        a = new CharAction();
        a.setName("Learn Alchemy");
        a.set_dialogue("</n2> catches you glancing at the cauldron and asks \"Like what you </c0>?\" </pronoun2> smiles as </pronoun2> asks \"Do you know what it is?\". ");
        challenge = new Challenge();//0
        challenge.set_attack_stat(FPalaceHelper.breast_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("see");
        Consequence consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "\"Not much now I'll admit\" the sensei says suggestively, but continues \"But I can </c1> of what I'm doing.\"",-1);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"Important to learn this stuff for </c4> I think...\" </pronoun2> says as you poke your nose into the cauldron. " ,0);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.item_alchemy_effects_id);
        challenge.set_defense_stat(-1,15);
        challenge.setVariability(20);
        challenge.setText("show you a bit");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.curr_hp_id, -2, "Inevitably </n2> tells you to take a drink. Knowing better, you refuse. ",0,0,0,2,true);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, -2, "Inevitably </n2> tells you to take a drink. You quickly drink the stuff down. " ,-1,0,0,3);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(-1,10);
        challenge.set_defense_stat(Character.relations_affect_id);
        challenge.setVariability(5);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(Character.relations_affect_id, -5, "</n2> huffs as you refuse. \"I clearly don't have anything to show you\" </pronoun2> says melevolently before waving you away. ",0,0,0,-1,true);
        consequence.addConsequence(Character.relations_affect_id, 5, "</n2> huffs as you refuse. \"You're quite good!\" </pronoun2> says with a smile. \"I can still show you </c5> if you'd like.\"" ,-1);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.relations_affect_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(10);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(Character.relations_affect_id, -2, "The terrible stuff leaves you suspicious of </n2>. ",0);
        consequence.addConsequence(Character.relations_affect_id, 1, "You sputter and cough, but foolishly ask for seconds. \"You're quite good!\" </pronoun2> says with a smile. \"I can still show you </c5> if you'd like.\"" ,-1,0,0,-1,true);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge(true);//4
        challenge.set_attack_stat(FPalace_skills.item_alchemy_effects_id);
        challenge.set_defense_stat(-1,10);
        challenge.setVariability(20);
        challenge.setText("every girl");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "</n2> moves to the cauldron and waves you over. You give in, moving into position. </pronoun2> goes through some motions, having you run across the room to grab various ingredients for </objnoun2>. \"You're quite good!\" </pronoun2> says with a smile. \"I can still show you </c5> if you'd like.\" </pronoun2> says with a smile. ",0);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "</n2> moves to the cauldron and waves you over. You follow and </n2> begins telling you about the strange brew </pronoun2> is cooking up. \"I can show you </c5> if you'd like.\" </pronoun2> says with a smile. " ,-1);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge(true);//5
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        challenge.setText("my technique");
        consequence = new Consequence();
        consequence.add_change_effect(FPalace_classes.cclass_alchemist());
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "You spend an afternoon with </n2>, learning what </pronoun2> has to teach.\n\n",0);
        a.addChallenge(challenge,consequence);
        
        alchemy_lesson.add_action(a,Character.relations_affect_id,20,false,Conversation_topic.being_told_topic);
        
        temp_char.personality.add_conversation_topic(alchemy_lesson);
        
        temp_char.new_location(temp_room);
        area.add_room(temp_room);
        
        return area;
    }
    
    public static Area area_amazon_village(){
        Area area = new Area("Lux Invira");
        area.set_move_time(2);
        area.set_colour(0x9CCB19);
        //City of Sin
        //Merchant(Human, stores):Clothing
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        
        Template_Room template_room = new Template_Room("You stand on a wide foot path that weaves through the amazonian village. ");
        template_room.set_max_same_exits(3);
        template_room.set_area_effects();
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small hut, thatch roof overhead. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.add_character(FPalace_npcs.Amazonian_Isle_Amazon(),1);
        template_house.add_character(FPalace_npcs.Amazonian_Isle_Amazon(),0.5);
        template_house.set_no_area_exit();
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_room);
        area.random_area(25, template_room);
        area.add_room_template(template_house);
        area.random_area(3,template_house);
        
                
        Character creature = FPalace_npcs.futa_amazon_guardian();
        //creature.set_move();
        //should probably ask The Guardian about this, but... s/he gets to be one of the leaders of the village
        creature.new_location(area.get_random_room());//Should give her a home, or council house or something to be in, but meh for now
        
        Template_Room village_store = new Template_Room("This store is filled with wooden shelves covered in furs and jars.");
        village_store.set_map_room_colour(0x5C4033);
        village_store.set_no_area_exit();
        village_store.add_no_connect_template(template_house);
        village_store.add_no_connect_template(kitchens);
        village_store.add_no_connect_template(bedrooms);
        
        village_store.add_character(FPalace_npcs.lux_invira_shopkeeper(), 1);
        
        area.random_area(1, village_store);
        
        Template_Room lingerie_store = new Template_Room("This store seems out of place with the village, but seems to be filled with lingerie.");
        lingerie_store.set_map_room_colour(0x5C4033);
        lingerie_store.set_no_area_exit();
        lingerie_store.add_no_connect_template(template_house);
        lingerie_store.add_no_connect_template(kitchens);
        lingerie_store.add_no_connect_template(bedrooms);
        lingerie_store.add_no_connect_template(village_store);
        
        lingerie_store.add_character(FPalace_npcs.lux_invira_lingerie(), 1);
        
        area.random_area(1, lingerie_store);
        
        Template_Room venutian_arts_dojo = new Template_Room("This is a relatively wide open space, wooden dummies standing around the edge. ");
        venutian_arts_dojo.set_map_room_colour(0x5C4033);
        venutian_arts_dojo.set_no_area_exit();
        venutian_arts_dojo.add_no_connect_template(template_house);
        venutian_arts_dojo.add_no_connect_template(kitchens);
        venutian_arts_dojo.add_no_connect_template(bedrooms);
        venutian_arts_dojo.add_no_connect_template(village_store);
        venutian_arts_dojo.add_no_connect_template(lingerie_store);
        
        Room temp_room = venutian_arts_dojo.make_room();
        Character temp_char = FPalace_npcs.venutian_arts_teacher();
        
        Conversation_topic dojo_lesson = new Conversation_topic();
        dojo_lesson.set_no_spread();
        dojo_lesson.set_topic_name("Dojo");
        
        CharAction a = new CharAction();
        a.setName("Learn the Venutian Arts");
        a.set_dialogue("</n2> catches you glancing at the empty space and asks \"Like what you </c0>, do you?\" The smile on </noun2> face is telling you this could be painful. ");
        Challenge challenge = new Challenge();//0
        challenge.set_attack_stat(FPalaceHelper.breast_size_id);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(0);
        challenge.setText("see");
        Consequence consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.lust_id, 0, "\"Not much now I'll admit\" the sensei says suggestively, but continues \"But I can </c1> of what we're about.\"",-1);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "\"Not often we see your sort around here...\" the sensei says to you, raising an eyebrow. \"Looking to learn to defend yourself in a more...\" </pronoun2> stops for a moment to huff \"...</c4> perhaps?\"" ,0);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.fight_id);
        challenge.set_defense_stat(FPalace_skills.fight_id);
        challenge.setVariability(20);
        challenge.setText("show you a bit");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.curr_hp_id, -2, "</n2> moves to the center of the space and waves you over. You give in, moving into position. It isn't particularly difficult to fend off </noun2> attacks, though it is awkward as </pronoun2> flails </noun2> genitals at you. ",0,0,0,2,true);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, -2, "</n2> moves to the center of the space and waves you over. You give in, moving into position. </n2> suddenly launches </noun2> genitals at you, and you find yourself firmly planted on your back. " ,-1,0,0,3);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(-1,10);
        challenge.set_defense_stat(Character.relations_affect_id);
        challenge.setVariability(5);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(Character.relations_affect_id, -5, "</n2> huffs as </pronoun2> gets to </noun2> feet. \"I clearly don't have anything to show you\" </pronoun2> says melevolently before waving you away. ",0,0,0,-1,true);
        consequence.addConsequence(Character.relations_affect_id, 5, "</n2> huffs as </pronoun2> gets to </noun2> feet. \"You're quite good!\" </pronoun2> says with a smile. \"I can still show you </c5> if you'd like.\"" ,-1);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge();
        challenge.set_attack_stat(Character.relations_affect_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(10);
        challenge.setText("");
        consequence = new Consequence();
        consequence.addConsequence(Character.relations_affect_id, -2, "You get to your feet and walk away from the ring, disgruntled. ",0);
        consequence.addConsequence(Character.relations_affect_id, 1, "You get to your feet and get back in position, challenging </n2> again. \"You're quite good!\" </pronoun2> says with a smile. \"I can still show you </c5> if you'd like.\"" ,-1,0,0,-1,true);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge(true);//4
        challenge.set_attack_stat(FPalace_skills.fight_id);
        challenge.set_defense_stat(-1,10);
        challenge.setVariability(20);
        challenge.setText("feminine way");
        consequence = new Consequence();
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "</n2> moves to the center of the space and waves you over. You give in, moving into position. </pronoun2> goes through some motions, showing you how </pronoun2> uses </noun2> genital in combat. \"You're quite good!\" </pronoun2> says with a smile. \"I can still show you </c5> if you'd like.\" </pronoun2> says with a smile. ",0);
        consequence.addConsequence(FPalaceHelper.curr_hp_id, -1, "</n2> moves to the center of the space and waves you over. You give in, clumsily moving into position. </n2> frowns as you approach and you can hear </objnoun2> mumble something about \"... a lot of work...\" </pronoun2> goes through some motions, showing you how </pronoun2> uses </noun2> genital in combat. \"I can show you </c5> if you'd like.\" </pronoun2> says with a smile. " ,-1);
        a.addChallenge(challenge,consequence);
        
        challenge = new Challenge(true);//5
        challenge.set_attack_stat(-1,1);
        challenge.set_defense_stat(-1,0);
        challenge.setVariability(0);
        challenge.setText("my technique");
        consequence = new Consequence();
        consequence.add_change_effect(FPalace_classes.cclass_gene_splice());
        consequence.addConsequence(FPalaceHelper.curr_hp_id, 0, "You spend an afternoon with </n2>, learning what </pronoun2> has to teach.\n\n",0);
        a.addChallenge(challenge,consequence);
        
        dojo_lesson.add_action(a,Character.relations_affect_id,0,false,Conversation_topic.being_told_topic);
        
        temp_char.personality.add_conversation_topic(dojo_lesson);
        
        
        temp_char.new_location(temp_room);
        area.add_room(temp_room);
        
        Template_Room inn_template = new Template_Room("This hut has a large drinking area, as well as rooms off to the side and upstairs. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(village_store);
        inn_template.add_no_connect_template(lingerie_store);
        inn_template.add_no_connect_template(venutian_arts_dojo);
        inn_template.add_character(FPalace_npcs.lux_invira_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_heaven(){
        Area heaven = new Area("Heaven");
        heaven.set_move_time(3);
        //Angels and such. There really isn't much written about heaven passed that...
        Template_Room template_room = new Template_Room("This is heaven. ");
        template_room.set_max_same_exits(2);
        heaven.add_room_template(template_room);
        heaven.random_area(20);
        
        Template_Room template_filler = new Template_Room("You're standing on a cloud, no hint of a path anywhere. ");
        template_filler.set_map_room_colour(0x000000);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        CharAction a = new CharAction();
        a.setName("Fluffy clouds float about. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",2);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You jump from cloud to cloud. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,1);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(0);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_list(new ArrayList<>(Arrays.asList(FPalace_npcs.heaven_cherub(), FPalace_npcs.heaven_angel())));
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "An angel seems to appear from nowhere! ",0);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("A cloud floats to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You jump from cloud to cloud. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        heaven.set_filler_template(template_filler);
        
        return heaven;
    }
    
    public static Area area_hell(){
        Area hell = new Area("Hell");
        hell.set_move_time(3);
        //Lets go through sexy Dante's inferno here			
        Template_Room template_room = new Template_Room("This is hell. ");
        template_room.set_max_same_exits(2);
        hell.add_room_template(template_room);
        hell.random_area(20);
        
        Template_Room template_filler = new Template_Room("You're standing on a cloud, no hint of a path anywhere. ");
        template_filler.set_map_room_colour(0xFF0000);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        CharAction a = new CharAction();
        a.setName("Vents of steam and pools of actively flowing magma are all around. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",2);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You jump towards a safe looking patch of land",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,1);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(0);
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_list(new ArrayList<>(Arrays.asList(FPalace_npcs.hell_imp(), FPalace_npcs.hell_succubus())));
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A demon seems to appear from nowhere! ",0);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("A safe patch of land is to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You jump towards a safe looking patch of land. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        hell.set_filler_template(template_filler);
        
        Room trans_magic = new Room("You see runes glowing on the ground beneath you, and a large <a0> that appears to be on fire, yet casts no light. ");
        trans_magic.set_id(-1);
        trans_magic.set_discovery_difficulty(-1);
        trans_magic.set_locate_difficulty(-1);
        a2 = new CharAction();
        a2.setName("circle");
        a2.set_dialogue("As you gaze into the circle, you lose control of your own body. A large well endowed demon appears, a </c0> on her lips, one hand on one of her lucious breasts, the other stroking a cock that would have been more at home on a horse. ");

        Challenge c2 = new Challenge();
        c2.set_attack_stat(-1,1);//FPalaceHelper.wis_id) original comment
        c2.set_defense_stat(-1, 27);
        c2.setVariability(0);
        c2.setText("smile");

        Consequence con2 = new Consequence();
        //need success consequence here to spawn npc and start combat
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "You manage to break whatever hold the demon has on you, and prepare to be attacked!",0);
        con2.addConsequence(FPalaceHelper.lust_id,5, "The demons smile grows wider as she regards your form.\"There's quite a bit of </c1> to be done here I see...\" she chimes out in a suductive tone. ",-1);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("work");

        //need change to only happen on failure... - done
        
        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.lust_id,2, "You feel the demons eyes on your manhood \"That just won't do... it's not </c2> enough\". Her eyes flick to your </c5> and she exclaims \"That just won't do!\". ",0);
        con2.add_change_effect(FPalaceHelper.new_penis(null));
        con2.addConsequence(FPalaceHelper.lust_id,10, "\"Hmmm maybe some </c3>...\" the demon lets out with a lusty sigh as a large cock bursts forth from your groin. \"Although you can never have enough breast, with such </c6> assets.\" She continues in her dulcet tones. ",-1);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("big");

        con2 = new Consequence();
        con2.addConsequence(FPalaceHelper.penis_length_id,2, "You feel a pulse in your groin. ",0,1);
        con2.addConsequence(FPalaceHelper.penis_girth_id,1, "Your shaft is conspicuously cedeing to the demons demands. ",0,1);
        con2.addConsequence(FPalaceHelper.curr_hp_id, 0, "The demon looks at her handy work, and reaches down to her </c4> as it begins to leak... A frown forms on her face as she regards your </c5>. ",0,1);
        con2.addConsequence(FPalaceHelper.balls_size_id,2, "",0,1);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.penis_length_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("balls");
        
        con2 = new Consequence();
        con2.addConsequence(FPalaceHelper.lust_id,5, "You feel a sudden pain in your stomach that grows and grows, until upon it's apex you feel a set of balls spill from your crotch. The demon giggles happily. \"Just one last </c6> modification...\" you hear her almost whisper. ",0);

        con2.add_change_effect(FPalaceHelper.new_balls(null));

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("snatch");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.int_id,0, "You close your eyes as a feeling of both growth and loss occurs in your groin, and as your newly grown clit is stroked by your balls you swoon. Looking down to regard the new sensation, you find yourself free from whatever force the demon had you under, though your vision of your groin is impared by a set of breasts. A quick look around puts you at the palace entrance, no sign of the demon, but a faint chuckle on the wind. ",-1);
        con2.add_change_effect(FPalaceHelper.new_breasts(null));
        con2.add_change_effect(FPalaceHelper.new_vagina(null));
        con2.add_change_effect(FPalaceHelper.new_clit(null));
        con2.add_change_effect(FPalace_classes.cclass_sexmagus());
        
        con2.addConsequence(FPalaceHelper.int_id,0, "\"Just one last </c6> modification...\" you hear the succubus whisper with a smile. ",0);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("chest");

        con2 = new Consequence();
        con2.set_change_on_success();
        con2.addConsequence(FPalaceHelper.int_id,0, "The demon makes a gesture towards your chest, and you feel flesh suddenly rush towards your pecks. You have to close your eyes as you feel your breasts fill out and your nipples suddenly pop, and when you open them, you find yourself back at the entrance to the Palace, the only sign left of the demon a faint laughter on the wind. ",-1);
        con2.add_change_effect(FPalaceHelper.new_breasts(null));
        con2.add_change_effect(FPalace_classes.cclass_sexmagus());
        
        con2.addConsequence(FPalaceHelper.int_id,0, "\"Just one last </c6> modification...\" you hear the succubus whisper with a smile. ",0);

        a2.addChallenge(c2,con2);

        c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.breast_size_id);
        c2.set_defense_stat(-1, 1);
        c2.setVariability(0);
        c2.setText("minor");

        con2 = new Consequence();
        con2.add_change_effect(FPalace_classes.cclass_sexmagus());
        con2.addConsequence(FPalaceHelper.breast_size_id,1, "You feel your bust swell and grow from a simple gesture the demon makes. You close your eyes for a second, and when you open them, find yourself back at the Palace entrance, the only sign of the previous encounter your new body, and a faint laughter on the air. ",0,1);
        
        con2.set_reward(5);

        a2.addChallenge(c2,con2);
        
        
        trans_magic.addAction(a2);
        
        hell.add_room(trans_magic);
        
        return hell;
    }
    
    public static Area area_shrublands(){
        Area shrublands = new Area("Shrublands");
        shrublands.set_move_time(3);
        
        shrublands.new_weather(FPalaceHelper.clear_skies_weather());
        shrublands.new_weather(FPalaceHelper.rain_weather());
        
        shrublands.set_colour(0x00FF00);
        
        Template_Room template_room = new Template_Room("This is a weatherbeaten path that cuts through short grasses dotted with an occasional shrub. ");
        template_room.set_max_same_exits(2);
        template_room.add_item(FPalace_items.baby_berry(), 0.15);
        template_room.add_item(FPalace_items.heavy_squash(), 0.15);
        template_room.set_area_effects();
        
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        shrublands.add_room_template(template_room);
        shrublands.random_area(20);
        
        Template_Room template_filler = new Template_Room("You're standing amidst short grass that seems to spread as far as the eye can see. ");
        template_filler.add_item(FPalace_items.baby_berry(), 0.15);
        template_filler.add_item(FPalace_items.heavy_squash(), 0.15);
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        
        CharAction a = new CharAction();
        a.setName("Untouched plains seem to surround you. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",4);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You plod along the plains. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.attacking_orc());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "An orc leaps from a bush as you pass! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,0);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(2);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.rushing_deer());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A deer sprints past, crashing into you! ",0);
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,3);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        Challenge char_chall3 = new Challenge();
        char_chall3.set_attack_stat(-1,1);
        char_chall3.set_defense_stat(-1,0);
        char_chall3.setVariability(0);
        Consequence char_consequence3 = new Consequence();
        char_consequence3.add_char_effect(FPalace_npcs.fencing_fox());
        char_consequence3.addConsequence(FPalaceHelper.con_id,0, "A fox surprises you with a strike from behind! ",0);
        
        a.addChallenge(char_chall3, char_consequence3);
        a2.addChallenge(char_chall3, char_consequence3);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The plains are apparent to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You plod along the plains. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);		
        
        shrublands.set_filler_template(template_filler);
        
        return shrublands;
    }

    public static Area area_ice_sheets(){
        Area ice_sheets = new Area("Ice Sheets");
        ice_sheets.set_move_time(3);
        Template_Room template_room = new Template_Room("This is a barely visible white path on thick sheets of glowing blue ice. ");
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(2);
        ice_sheets.add_room_template(template_room);
        ice_sheets.random_area(20);
        
        Template_Room template_filler = new Template_Room("You're standing in knee deep water. ");
        template_filler.add_item(FPalace_items.sperm_fish(), 0.3);
        template_filler.add_item(FPalace_items.floppy_cucumber(), 0.15);			
        
        template_filler.set_map_room_colour(0x1C6BA0);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        
        CharAction a = new CharAction();
        a.setName("A shallow sea casts its waves here. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You slosh along in the shallow water. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.polar_bear());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A polar bear strikes out from the slosh! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.seal_girl());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A strange seal smashes you as you slosh about! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The water lies just off to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You slosh along in the shallow water. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        
        ice_sheets.set_filler_template(template_filler);
        
        return ice_sheets;
    }
    
    public static Area area_grass_hills(){
        Area grass_hills = new Area("Grass Steppes");
        grass_hills.set_move_time(3);
        
        grass_hills.new_weather(FPalaceHelper.clear_skies_weather());
        grass_hills.new_weather(FPalaceHelper.rain_weather());
        
        grass_hills.set_colour(0x00FF00);
        
        Template_Room template_room = new Template_Room("This is a weather beaten dirt trail that winds throw green hills of short-cut grass. ");
        template_room.add_item(FPalace_items.spotted_peas(), 0.15);
        template_room.add_item(FPalace_items.colourful_cabbage(), 0.3);
        template_room.set_area_effects();
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        
        grass_hills.add_room_template(template_room);
        grass_hills.random_area(20);
        
        Template_Room template_filler = new Template_Room("You're standing atop a hill amidst short grass that seems to spread as far as the eye can see. ");
        template_filler.add_item(FPalace_items.spotted_peas(), 0.15);
        template_filler.add_item(FPalace_items.colourful_cabbage(), 0.3);
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        template_filler.add_item(FPalace_items.spotted_peas(), 0.15);
        template_filler.add_item(FPalace_items.colourful_cabbage(), 0.3);
        
        
        CharAction a = new CharAction();
        a.setName("Untouched tracks of land seem to surround you. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You head out through the hills. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.steppes_horse());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A horse crashes into you from an unseen angle! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.steppes_sheep());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A sheep strikes out from amongst the steppes! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The wild hills are apparent to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You head out through the hills. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        grass_hills.set_filler_template(template_filler);
        
        Template_Room tower_template = new Template_Room();
        tower_template.set_map_room_colour(0x5C4033);
        tower_template.set_no_area_exit();
        tower_template.set_filler_connect();
        tower_template.set_unconnected();
        Room tower_ground_floor = new Room("This is the base of a stone tower, and is filled with cooking implements and a small eating area. ");
        tower_ground_floor.set_template(tower_template);			
        Room tower_bedroom = new Room("This looks like the bedroom of an 18 year old girl, frills and pink everywhere, a large vanity present. ");
        tower_bedroom.set_template(tower_template);
        Character rapunzel = FPalace_npcs.hills_rampion();
        rapunzel.new_location(tower_bedroom);
        
        tower_ground_floor.new_exit(tower_bedroom,"Up");
        tower_bedroom.new_exit(tower_ground_floor,"Down");
        
        grass_hills.add_room(tower_ground_floor);
        
        Room temp_room = tower_ground_floor.exits.get(0);
        temp_room.set_description("A small <s0>tower</s0> made of solid stone stands amongst the hills nearby. ");
        temp_room.add_sub_descriptions("The tower has a nearly indistinguishable <s1>door</s1>, strangely made of metal. ");
        temp_room.add_sub_descriptions("The door is heavy looking, and you can't see a handle, though there is a <a0>. ");
        
        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("",0);
        Challenge c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("");
        RoomConsequence rcon = new RoomConsequence();
        rcon.set_never_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You see a keyhole clearly looking to be </c1>.\n",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "The door is already open. You could </c2> it if you wanted. ",0);
        rcon.add_room_effect(temp_room, tower_ground_floor);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.covert_id);
        c.set_defense_stat(-1, 10);
        c.setVariability(20);
        c.setText("used");
        Consequence con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "You begin to fenangle with the </c3>, as you don't possess a key. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You bash against the door, no key in sight, but your efforts are in vain. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("close");
        rcon = new RoomConsequence();
        //con.add_consequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.add_room_effect(temp_room, tower_ground_floor);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.theft_id);
        c.set_defense_stat(-1, 10);
        c.setVariability(20);
        c.setText("lock");
        con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "It takes a few tries, but you begin to work out the mechanism. It isn't long before you hear a </c4>. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You do your best, but nothing seems to work, and the inner mechanisms of the lock remain a mystery. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("click");
        rcon = new RoomConsequence();
        rcon.add_room_effect(temp_room, tower_ground_floor);//,"Door") original comment
        rcon.set_always_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.trigger(0);//close the door...
        
        a.addChallenge(c,rcon);

        temp_room.addAction(a);			
        
        return grass_hills;
    }
    
    public static Area area_rainforest(){
        Area rainforest = new Area("Rainforest");
        rainforest.set_move_time(3);
        
        rainforest.new_weather(FPalaceHelper.clear_skies_weather());
        rainforest.new_weather(FPalaceHelper.rain_weather());
        
        rainforest.set_colour(0x00FF00);			
        
        Template_Room template_room = new Template_Room("This is a barely visible path amidst bushes and shrubs of every height and size that cover the ground amidst enormous trees. The air is heavy and humid, and lit by sunbeams that shift as the leaves above do. ");
        template_room.add_item(FPalace_items.cocoa_beans(),0.1);
        template_room.add_item(FPalace_items.funny_figs(),0.2);
        template_room.add_item(FPalace_items.manly_mangoes(),0.2);
        template_room.set_area_effects();
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);			
        
        rainforest.add_room_template(template_room);
        rainforest.random_area(20);
        
        Template_Room template_filler = new Template_Room("Dense brush and heavy mist is all you manage to see. ");
        template_filler.add_item(FPalace_items.cocoa_beans(),0.1);
        template_filler.add_item(FPalace_items.funny_figs(),0.2);
        template_filler.add_item(FPalace_items.manly_mangoes(),0.2);
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        
        
        CharAction a = new CharAction();
        a.setName("Heavy, humid air hangs heavily about. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way into the mist. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.rainforest_bug());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A giant bug drops from above! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.rainforest_plant());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A plant lashes out as you place your foot down! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The heavy air is apparent to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way into the mist. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        
        rainforest.set_filler_template(template_filler);
        
        return rainforest;
    }
    
    public static Area area_savanna(){
        Area savanna = new Area("Savanna");
        savanna.set_move_time(3);
        
        savanna.new_weather(FPalaceHelper.clear_skies_weather());
        savanna.new_weather(FPalaceHelper.rain_weather());
        
        savanna.set_colour(0x00FF00);
        
        Template_Room template_room = new Template_Room("This is a well beaten path amidst flat grasslands, an occasional tree, mostly leafless, doting the countryside. ");
        template_room.add_item(FPalace_items.perky_potatoes(),0.1);
        template_room.add_item(FPalace_items.hairy_eggplant(),0.1);
        template_room.set_area_effects();
        
        
        template_room.add_container(FPalaceHelper.cart_container(),0.1);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        
        savanna.add_room_template(template_room);
        savanna.random_area(20);
        
        Template_Room template_filler = new Template_Room("Golden grasses line the view as far as you can see. ");
        template_filler.add_item(FPalace_items.perky_potatoes(),0.1);
        template_filler.add_item(FPalace_items.hairy_eggplant(),0.1);
        template_filler.set_area_effects();
        template_filler.set_map_room_colour(0x00FF00);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        
        
        CharAction a = new CharAction();
        a.setName("Wild grasslands loom nearby. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the grasses. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.savanna_hyena());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A hyena bursts out from the brush as you begin to push through. ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.horny_feline());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A drunk feline pushes through just as you begin to. ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The grass looms from the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You push your way through the grasses. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        savanna.set_filler_template(template_filler);
        
        Room tanning_spot = new Room("Some brave soul has setup for some tanning here, with a small umbrella and a rolled out <s0>towel</s0>. ");
        tanning_spot.add_sub_descriptions("Everything is meticulously laid out, and you can see whomever set the scenario up has left their <a0>.");
        tanning_spot.set_area_effects();
        CharAction nothing_action = new CharAction();
        nothing_action.setName("possessions");
        nothing_action.set_dialogue("It doesn't look like there's anything valuable. \n");
        
        a = new CharAction();
        a.setName("possessions");
        a.set_dialogue("A swimsuit lays there, begging to be </c0>.\n");
        
        Challenge c = new Challenge();
        c.set_attack_stat(-1,1);
        c.set_defense_stat(-1,0);
        c.setVariability(0);
        c.setText("grabbed");
        ItemConsequence itemcon = new ItemConsequence();
        
        itemcon.set_replace_action(nothing_action);
        itemcon.addConsequence(FPalaceHelper.dex_id,0, "You snatch the swimsuit. </replace>",0);
        itemcon.add_item_reward(FPalace_items.booty_thong(), 0);
        a.addChallenge(c,itemcon);
        
        tanning_spot.addAction(a);
        
        savanna.add_room(tanning_spot);			
        
        return savanna;
    }
    
    public static Area area_castilla(){
        Area area = new Area("Castilla");
        area.set_move_time(2);
        //City of Chastity
        //Merchant(Human, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.male_human_castilla(),FPalace_npcs.male_canine_castilla())),1);
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.female_human_castilla(),FPalace_npcs.female_canine_castilla())),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room seamstress = new Template_Room("This store has many ornate cabinets filled with clothing. ");
        seamstress.set_map_room_colour(0x5C4033);
        seamstress.set_no_area_exit();
        seamstress.add_no_connect_template(template_house);
        seamstress.add_no_connect_template(kitchens);
        seamstress.add_no_connect_template(bedrooms);
        
        seamstress.add_character(FPalace_npcs.castilla_seamstress(), 1);
        
        area.random_area(1, seamstress);
        
        Template_Room cobbler = new Template_Room("This store is filled with boots and shoes. ");
        cobbler.set_map_room_colour(0x5C4033);
        cobbler.set_no_area_exit();
        cobbler.add_no_connect_template(template_house);
        cobbler.add_no_connect_template(kitchens);
        cobbler.add_no_connect_template(bedrooms);
        cobbler.add_no_connect_template(seamstress);
        
        cobbler.add_character(FPalace_npcs.castilla_cobbler(), 1);
        
        area.random_area(1, cobbler);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(seamstress);
        inn_template.add_no_connect_template(cobbler);
        inn_template.add_character(FPalace_npcs.castilla_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_ahimsa(){
        Area area = new Area("Ahimsa");
        area.set_move_time(2);
        //City of Patience
        //Merchant(Human, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        
        template_house.add_character(FPalace_npcs.female_elf(),1);
        template_house.add_character(FPalace_npcs.male_elf(),1);			
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room village_store = new Template_Room("This store is filled with ornate wooden shelves covered in fine goods. ");
        village_store.set_map_room_colour(0x5C4033);
        village_store.set_no_area_exit();
        village_store.add_no_connect_template(template_house);
        village_store.add_no_connect_template(kitchens);
        village_store.add_no_connect_template(bedrooms);
        
        village_store.add_character(FPalace_npcs.ahimsa_shopkeeper(), 1);
        
        area.random_area(1, village_store);
        
        Template_Room village_seamstress = new Template_Room("This store is filled with fine cabinetry and clothing. ");
        village_seamstress.set_map_room_colour(0x5C4033);
        village_seamstress.set_no_area_exit();
        village_seamstress.add_no_connect_template(template_house);
        village_seamstress.add_no_connect_template(kitchens);
        village_seamstress.add_no_connect_template(bedrooms);
        village_seamstress.add_no_connect_template(village_store);
        
        village_seamstress.add_character(FPalace_npcs.ahimsa_seamstress(), 1);
        
        area.random_area(1, village_seamstress);
        
        Template_Room village_cobler = new Template_Room("This store is filled with ornate wooden shelves covered in shoes. ");
        village_cobler.set_map_room_colour(0x5C4033);
        village_cobler.set_no_area_exit();
        village_cobler.add_no_connect_template(template_house);
        village_cobler.add_no_connect_template(kitchens);
        village_cobler.add_no_connect_template(bedrooms);
        village_cobler.add_no_connect_template(village_store);
        village_cobler.add_no_connect_template(village_seamstress);
        
        village_cobler.add_character(FPalace_npcs.ahimsa_cobler(), 1);
        
        area.random_area(1, village_cobler);
        
        Template_Room village_library = new Template_Room("You're in a room filled with shelves of books. ");
        village_library.set_map_room_colour(0x5C4033);
        village_library.set_no_area_exit();
        village_library.add_no_connect_template(template_house);
        village_library.add_no_connect_template(kitchens);
        village_library.add_no_connect_template(bedrooms);
        village_library.add_no_connect_template(village_store);
        village_library.add_no_connect_template(village_seamstress);
        village_library.add_no_connect_template(village_cobler);
        
        village_library.add_character(FPalace_npcs.ahimsa_librarian(), 1);
        
        area.random_area(1, village_library);
        
        Template_Room village_smithy = new Template_Room("Heat pours from a strange wood furnace centered on one wall here. ");
        village_smithy.set_map_room_colour(0x5C4033);
        village_smithy.set_no_area_exit();
        village_smithy.add_no_connect_template(template_house);
        village_smithy.add_no_connect_template(kitchens);
        village_smithy.add_no_connect_template(bedrooms);
        village_smithy.add_no_connect_template(village_store);
        village_smithy.add_no_connect_template(village_seamstress);
        village_smithy.add_no_connect_template(village_cobler);
        village_smithy.add_no_connect_template(village_library);
        
        village_smithy.add_character(FPalace_npcs.ahimsa_smith(), 1);
        
        area.random_area(1, village_smithy);
        
        var village_doctor = new Room("There is a wooden table covered in straps in this room, though notably, there's also a piece of paper on the wall above a <s0>desk</s0>. ");
        village_doctor.add_sub_descriptions("The desk is covered in a huge assortment of papers, candles, pans, and instruments for measuring. You could probably perform <a0> here if you wanted. ");
        village_doctor.set_id(-1);
        
        CharAction a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        village_doctor.addAction(a);
        
        FPalace_npcs.ahimsa_doctor().gen_char().new_location(village_doctor);
        
        Template_Room village_doctor_template = new Template_Room();
        village_doctor_template.set_map_room_colour(0x5C4033);
        village_doctor_template.set_no_area_exit();
        village_doctor_template.add_no_connect_template(template_house);
        village_doctor_template.add_no_connect_template(kitchens);
        village_doctor_template.add_no_connect_template(bedrooms);
        village_doctor_template.add_no_connect_template(village_store);
        village_doctor_template.add_no_connect_template(village_seamstress);
        village_doctor_template.add_no_connect_template(village_cobler);
        village_doctor_template.add_no_connect_template(village_library);
        village_doctor_template.add_no_connect_template(village_smithy);
        
        village_doctor.set_template(village_doctor_template);
        
        area.add_room(village_doctor);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(village_store);
        inn_template.add_no_connect_template(village_seamstress);
        inn_template.add_no_connect_template(village_cobler);
        inn_template.add_no_connect_template(village_library);
        inn_template.add_no_connect_template(village_smithy);
        inn_template.add_no_connect_template(village_doctor_template);
        inn_template.add_character(FPalace_npcs.ahimsa_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_benevol(){
        Area area = new Area("Benevol");
        area.set_move_time(2);
        //City of Kindness
        //Merchant(Human, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.benevol_donkey_citizen(),FPalace_npcs.benevol_human_citizen())),1);
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.benevol_female_donkey(),FPalace_npcs.benevol_female_citizen())),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room jeweller = new Template_Room("This store is filled with ornate wooden shelves covered in fine goods.");
        jeweller.set_map_room_colour(0x5C4033);
        jeweller.set_no_area_exit();
        jeweller.add_no_connect_template(template_house);
        jeweller.add_no_connect_template(bedrooms);
        jeweller.add_no_connect_template(kitchens);
        
        jeweller.add_character(FPalace_npcs.benevol_jeweller(), 1);
        
        area.random_area(1, jeweller);
        
        Template_Room library = new Template_Room("This small building is filled with cobwebs and shelves of books. ");
        library.set_map_room_colour(0x5C4033);
        library.set_no_area_exit();
        library.add_no_connect_template(template_house);
        library.add_no_connect_template(jeweller);
        library.add_no_connect_template(bedrooms);
        library.add_no_connect_template(kitchens);
        
        library.add_character(FPalace_npcs.benevol_librarian(), 1);
        
        area.random_area(1, library);
        
        Template_Room bathhouse = new Template_Room("This large building is filled with pools of water that steam and fog the air. ");
        bathhouse.set_map_room_colour(0x5C4033);
        bathhouse.set_no_area_exit();
        bathhouse.add_no_connect_template(template_house);
        bathhouse.add_no_connect_template(jeweller);
        bathhouse.add_no_connect_template(bedrooms);
        bathhouse.add_no_connect_template(kitchens);
        bathhouse.add_no_connect_template(library);
        
        bathhouse.add_character(FPalace_npcs.benevol_herbalist(), 1);
        
        area.random_area(1, bathhouse);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(jeweller);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(library);
        inn_template.add_no_connect_template(bathhouse);
        inn_template.add_character(FPalace_npcs.benevol_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_industria(){
        Area area = new Area("Industria");
        area.set_move_time(2);
        //City of Dilligence
        //Merchant(Human, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.set_max_same_exits(2);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.industria_female_citizen(), FPalace_npcs.lizard_girl())),1);
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.industria_male_citizen(), FPalace_npcs.lizard_guy())),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);	
        bedrooms.add_no_connect_template(template_room);
        bedrooms.set_no_area_exit();
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room seamstress = new Template_Room("This store is filled with ornate wooden shelves covered in fine clothing.");
        seamstress.set_map_room_colour(0x5C4033);
        seamstress.set_no_area_exit();
        seamstress.add_no_connect_template(template_house);
        seamstress.add_no_connect_template(bedrooms);
        seamstress.add_no_connect_template(kitchens);
        
        seamstress.add_character(FPalace_npcs.industria_seamstress(), 1);
        
        area.random_area(1, seamstress);
        
        Template_Room grocer = new Template_Room("This store is filled with ornate wooden shelves covered in fine clothing.");
        grocer.set_map_room_colour(0x5C4033);
        grocer.set_no_area_exit();
        grocer.add_no_connect_template(template_house);
        grocer.add_no_connect_template(bedrooms);
        grocer.add_no_connect_template(kitchens);
        grocer.add_no_connect_template(seamstress);
        
        grocer.add_character(FPalace_npcs.industria_grocer(), 1);
        
        area.random_area(1, grocer);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(seamstress);
        inn_template.add_no_connect_template(grocer);
        inn_template.add_character(FPalace_npcs.industria_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_mensch(){
        Area area = new Area("Mensch");
        area.set_move_time(2);
        //City of Temperance
        //Merchant(Human, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.mensch_cow_girl(), FPalace_npcs.mensch_woman())),1);
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.mensch_cow_guy(), FPalace_npcs.mensch_citizen())),1);
        
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room smithy = new Template_Room("This smithy exudes raw heat as the fire blares. ");
        smithy.set_map_room_colour(0x5C4033);
        smithy.set_no_area_exit();
        smithy.add_no_connect_template(template_house);
        smithy.add_no_connect_template(kitchens);
        smithy.add_no_connect_template(bedrooms);
        
        smithy.add_character(FPalace_npcs.mensch_smith(), 1);
        
        area.random_area(1, smithy);
        
        Template_Room library = new Template_Room("This room is filled with bookshelves carved from stone. ");
        library.set_map_room_colour(0x5C4033);
        library.set_no_area_exit();
        library.add_no_connect_template(template_house);
        library.add_no_connect_template(smithy);
        library.add_no_connect_template(kitchens);
        library.add_no_connect_template(bedrooms);
        
        library.add_character(FPalace_npcs.mensch_librarian(), 1);
        
        area.random_area(1, library);
        
        Template_Room farm_store = new Template_Room("This room is filled with farm implements, like seed and sickles and slaves. ");
        farm_store.set_map_room_colour(0x5C4033);
        farm_store.set_no_area_exit();
        farm_store.add_no_connect_template(template_house);
        farm_store.add_no_connect_template(smithy);
        farm_store.add_no_connect_template(library);
        farm_store.add_no_connect_template(kitchens);
        farm_store.add_no_connect_template(bedrooms);
        
        farm_store.add_character(FPalace_npcs.mensch_slaver(), 1);
        
        area.random_area(1, farm_store);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(smithy);
        inn_template.add_no_connect_template(library);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(farm_store);
        inn_template.add_character(FPalace_npcs.mensch_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_aghapei(){
        Area area = new Area("Aghapei");
        area.set_move_time(2);
        area.set_colour(0x808069);
        //City of Charity
        //Theft is legal: it is considered the ultimate charity to forgive one who has stolen from you
        //Merchant(Human, stores):Clothing
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        Template_Room template_room = new Template_Room("You're standing on a paved street with buildings to either side of you. ");
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        Character guru = FPalace_npcs.aghapei_guru().gen_char();
        guru.new_location(area.get_random_room());
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small house. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.cat_girl(),FPalace_npcs.aghapei_woman())),1);
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.cat_guy(),FPalace_npcs.aghapei_citizen())),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room seamstress = new Template_Room("This small ratty store has racks upon racks of what appears to be used clothing. ");
        seamstress.set_map_room_colour(0x5C4033);
        seamstress.set_no_area_exit();
        seamstress.add_no_connect_template(template_house);
        seamstress.add_no_connect_template(kitchens);
        seamstress.add_no_connect_template(bedrooms);
        
        seamstress.add_character(FPalace_npcs.aghapei_seamstress(), 1);
        
        area.random_area(1, seamstress);
        
        Template_Room library = new Template_Room("This small building is filled with cobwebs and shelves of books. ");
        library.set_map_room_colour(0x5C4033);
        library.set_no_area_exit();
        library.add_no_connect_template(template_house);
        library.add_no_connect_template(seamstress);
        library.add_no_connect_template(kitchens);
        library.add_no_connect_template(bedrooms);
        
        library.add_character(FPalace_npcs.aghapei_librarian(), 1);
        
        area.random_area(1, library);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(seamstress);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(library);
        inn_template.add_character(FPalace_npcs.aghapei_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_grasslands_cave(){
        Area cave = new Area("Cave");
        cave.set_move_time(1);
        
        Template_Room template_room = new Template_Room("These are small cramped quarters, large boulders and walls of dirt making your surroundings. ");
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        Container cont = new Container();
        cont.set_name("skeleton");
        cont.set_description("There is a <a href=\"event:inspect,</id>,0\">skeleton</a> on the ground. ");
        cont.add_sub_descriptions("A slightly desicated skeleton.");
        cont.set_always_open();
        cont.set_bury();
        cont.add_to_loot_table(FPalace_items.Healing_Draught(),0.2);
        cont.add_to_loot_table(FPalace_items.Healing_Potion(),0.2);
        cont.add_to_loot_table(FPalace_items.knife(),0.2);
        cont.add_to_loot_table(FPalace_items.bandages(),0.3);
        cont.add_to_loot_table(FPalace_items.plain_jane_potion(),0.1);
        cont.open();
        template_room.add_container(cont,0.10);
        
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",2);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You silently step through the dark. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,1);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(0);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.goo_slime());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A slime strikes from the dark! ",0);
        
        a2.addChallenge(char_chall, char_consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The darkness looms to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You silently step through the dark. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_room.add_exit_action(a2, challenge, rconsequence);
        
        
        cave.add_room_template(template_room,new ArrayList<>(Arrays.asList(0,5)));
        cave.random_area(20);
        
        Template_Room template_filler = new Template_Room("It's dark and cramped here, little past a narrow path to follow amidst the dirt. ");
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        //template_filler.add_character(FPalace_npcs.goo_slime(),0.15);
        template_filler.add_container(cont,0.10);
        
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        cave.set_filler_template(template_filler, Area.single_connected_filler,new ArrayList<>(Arrays.asList(0,5)));
        
        Template_Room down_template = new Template_Room("It's dark and cramped here, large boulders and walls of dirt making a narrow path to follow amidst the dirt. There is a hole that allows access to another floor. ");
        down_template.set_discovery_difficulty(15);
        down_template.add_container(cont,0.10);
        down_template.set_sight_difficulty(20);
        down_template.set_locate_difficulty(15);
        
        cave.set_dynamicBuildTemplate(down_template,new ArrayList<>(Arrays.asList(0,5)));
        
        template_room = new Template_Room("The walls seem strangely straight, and give off a faint glow. ");
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        //template_room.add_character(FPalace_npcs.cave_goblin_Female(),0.15);
        cont = new Container();
        cont.set_name("box");
        cont.set_description("There is a <a href=\"event:inspect,</id>,0\">box</a> on the ground. ");
        cont.add_sub_descriptions("A strange box with no lid made of the same stone as the walls.");
        cont.set_always_open();
        cont.add_to_loot_table(FPalace_items.silver_bar(),0.2);
        cont.add_to_loot_table(FPalace_items.iron(),0.2);
        cont.add_to_loot_table(FPalace_items.glass(),0.2);
        cont.add_to_loot_table(FPalace_items.bronze(),0.5);
        cont.add_to_loot_table(FPalace_items.gold_bar(),0.1);
        cont.open();
        template_room.add_container(cont,0.10);
        
        a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You silently step through the dark. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a2.addChallenge(challenge, rconsequence);
        
        char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.goo_slime());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A slime strikes from the dark! ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a2.addChallenge(char_chall, char_consequence);
        
        char_chall = new Challenge();
        char_chall.set_attack_stat(-1,1);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(0);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.cave_goblin_Female());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A goblin grabs at you from the dark! ",0);
        
        a2.addChallenge(char_chall, char_consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The grass looms from the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You silently step through the dark. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_room.add_exit_action(a2, challenge, rconsequence);			
        
        
        cave.add_room_template(template_room,new ArrayList<>(Arrays.asList(6,-1)));	
        
        down_template = new Template_Room("There is a strange glowing staircase to match the walls here. ");
        down_template.set_discovery_difficulty(15);
        down_template.add_container(cont,0.10);
        down_template.set_sight_difficulty(20);
        down_template.set_locate_difficulty(15);
        
        cave.set_dynamicBuildTemplate(down_template,new ArrayList<>(Arrays.asList(6,-1)));
        
        template_filler = new Template_Room("It's pitch black here. ");
        template_filler.set_discovery_difficulty(20);
        template_filler.set_sight_difficulty(25);
        template_filler.set_locate_difficulty(20);
        
        //template_filler.add_character(FPalace_npcs.cave_goblin_Female(),0.2);
            cont = new Container();
            cont.set_name("skeleton");
            cont.set_description("There is a <a href=\"event:inspect,</id>,0\">skeleton</a> on the ground. ");
            cont.add_sub_descriptions("A long since desicated skeleton.");
            cont.set_always_open();
            cont.set_bury();
            cont.add_to_loot_table(FPalace_items.Tent(),0.1);
            cont.add_to_loot_table(FPalace_items.Healing_Potion(),0.3);
            cont.add_to_loot_table(FPalace_items.bronze_short_sword(),0.2);
            cont.add_to_loot_table(FPalace_items.bronze_shield(),0.2);
            cont.add_to_loot_table(FPalace_items.bronze_breastplate(),0.1);
            cont.open();
        template_filler.add_container(cont,0.10);
        
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        cave.set_filler_template(template_filler, Area.single_connected_filler,new ArrayList<>(Arrays.asList(6,-1)));			
        
        cave.set_dynamic_build_direction();
        
        cont = new Container();
            cont.set_name("skeleton");
            cont.set_description("There is a <a href=\"event:inspect,</id>,0\">skeleton</a> on the ground. ");
            cont.add_sub_descriptions("A long since desicated skeleton.");
            cont.set_always_open();
            cont.set_bury();
            cont.add_content(FPalace_items.girdle_masculin_feminin());
            cont.open();
            
        cave.get_random_room().new_static_content(cont);
        
        var trans_vore = new Room("You find yourself surrounded by a pungent smell, and pulsing sounds that make you glad it's pitch <a0>. ");
        trans_vore.set_id(-1);
        trans_vore.set_discovery_difficulty(-1);
        trans_vore.set_locate_difficulty(-1);
        a2 = new CharAction();
        a2.setName("dark");
        a2.set_dialogue("The dark is a tad oppressive, but after a few steps that squish unsettlingly, and running into something that oozed and pulsed, you see a </c0> in the distance. ");
        Challenge c2 = new Challenge();
        c2.set_attack_stat(FPalaceHelper.curr_hp_id);
        c2.set_defense_stat(-1, 0);
        c2.setVariability(0);
        c2.setText("light");
        
            TickEffect tf = new TickEffect();
                tf.set_end_tick( 5 );
                Consequence tef_con = new Consequence();
                tef_con.addConsequence(FPalaceHelper.curr_hp_id,1, "Whatever strange things have been happening inside </n> since </noun> encounter in the cave have finally stopped. ", 0);
                
                tf.set_end_consequence(tef_con);
                
                Challenge tef_chall = new Challenge();
                tef_chall.set_attack_stat(FPalaceHelper.penis_length_id);
                tef_chall.set_defense_stat(-1, 1);
                tef_chall.setVariability(0);
                
                tef_con = new Consequence();
                tef_con.set_change_on_success();
                tef_con.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> struggles to keep </noun> feet as </noun> stomach gurgles, and a pungent smell escapes </noun> lips. </pronoun> itches at </noun> flesh. ", 0);
                
                tef_con.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> struggles to keep </noun> feet as </noun> stomach gurgles, and a pungent smell escapes </noun> lips. </pronoun> itches at </noun> flesh. ", -1);
                //tef_con.add_change_effect(FPalaceHelper.new_penis(null,1,0.33,5))
                
                tf.set_tick_consequence(1, tef_con, tef_chall);
                
                tef_con = new Consequence();
                
                tef_con.addConsequence(FPalaceHelper.curr_hp_id,-1, "", 0);
                tef_con.add_change_effect(FPalace_classes.cclass_fleshstealer()); 
                
                tf.set_tick_consequence(4, tef_con);
                                
                
        Consequence con2 = new Consequence();
        con2.addConsequence(FPalaceHelper.curr_hp_id,0, "You follow the light, and confusingly end up back where you started. ",0,1,0,-1, false, tf);
        
        a2.addChallenge(c2,con2);
        trans_vore.addAction(a2);
        
        cave.add_room(trans_vore);			
        
        return cave;
    }
    
    public static Area area_fpalace_mausoleum(){
        Area mausoleum = new Area("Mausoleum");
        mausoleum.set_move_time(1);
        Template_Room template_room = new Template_Room("These are artistically carved halls, filled with busts and sarcofagii. ");
        template_room.set_max_same_exits(2);
        
        
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",2);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You silently step through the mausoleum. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,1);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(0);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.goo_slime());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A slime strikes from a sarcophogus! ",0);
        
        a2.addChallenge(char_chall, char_consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The grass looms from the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You silently step through the mausoleum. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_room.add_exit_action(a2, challenge, rconsequence);
        
        
        mausoleum.add_room_template(template_room);
        mausoleum.random_area(20);
        
        return mausoleum;
    }
    
    public static Area area_fpalace_warehouse(){
        Area warehouse = new Area("Warehouse");
        warehouse.set_move_time(1);
        Template_Room template_room = new Template_Room("Large crates and boxes upon scaffolding delineate the space here, as lanterns hang from the ceiling and wooden floor boards squeek with every step. ");
        template_room.set_max_same_exits(3);
        warehouse.add_room_template(template_room);
        warehouse.random_area(20);
        
        var safety_deposit = new Room("This is a surprisingly spacious room, every wall, the floor, even the ceilings made of <s0>drawers</s0>. ");
        Template_Room safety_deposit_template = new Template_Room();
        safety_deposit_template.set_unconnected();
        safety_deposit.set_template(safety_deposit_template);
        safety_deposit.add_sub_descriptions("Every single one has a unique <s1>lock</s1> and differing make. Some are wood, others metal, some large, some small. The only consistant thing amongst them are the small handles. ");
        safety_deposit.add_sub_descriptions("Amongst the locks, you find a <a0> that spins. ");
        safety_deposit.set_id(-1);

            CharAction a2 = new CharAction();
            a2.setName("tumbler");
            a2.set_dialogue("The tumbler </c0> smoothly when you touch it, though you don't recognize the symbols that line its outer edge.\n");

            Challenge c2 = new Challenge(true);
            c2.set_attack_stat(FPalace_skills.theft_id);
            c2.set_defense_stat(-1,15);
            c2.setVariability(20);
            c2.setText("spins");
            RoomConsequence rcon2 = new RoomConsequence();
            rcon2.addConsequence(FPalaceHelper.curr_hp_id,0, "You expertly spin the tumbler, listening for the various clicks as pins fall into place. It isn't long before you find yourself pulling the drawer open. ",0);
            
            Container cont = new Container();
            cont.set_name("safety deposit box");
            cont.set_always_open();
            //cont.set_bury("Close", "closes");
            cont.set_description("There is a single <s0>open drawer</s0>. ");
            cont.add_sub_descriptions("It isn't a particularly large safety deposit box, but it looks like it could hold a few valuables. ");

            cont.add_content(FPalace_items.hermpire_ring());
            
            rcon2.add_container_creation(cont,safety_deposit);
            
            rcon2.addConsequence(FPalaceHelper.curr_hp_id,0, "You spin and spin, but no amount of luck seems to be helping you unlock the drawer. ",-1);

            a2.addChallenge(c2,rcon2);

        safety_deposit.addAction(a2);

        warehouse.add_room(safety_deposit);
        
        //make a locked door to the safety deposit room
        Room temp_room = safety_deposit.exits.get(0);
        temp_room.set_description("A small <s0>wall</s0> made of solid concrete is clear from the crates and boxes upon scaffolding delineating the space here, as lanterns hang from the ceiling and wooden floor boards squeek with every step. ");
        temp_room.add_sub_descriptions("The barely cleared space has a nearly indistinguishable <s1>door</s1>, the solid grey of the door matching perfectly with the stone. ");
        temp_room.add_sub_descriptions("The door is heavy looking, and you can't see a handle, though there is a <a0>. ");
        
        CharAction a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("",0);
        Challenge c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("");
        RoomConsequence rcon = new RoomConsequence();
        rcon.set_never_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You see a keyhole clearly looking to be </c1>.\n",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "The door is already open. You could </c2> it if you wanted. ",0);
        rcon.add_room_effect(temp_room, safety_deposit);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.covert_id);
        c.set_defense_stat(-1, 15);
        c.setVariability(20);
        c.setText("used");
        Consequence con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "You begin to fenangle with the </c3>, as you don't possess a key. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You bash against the door, no key in sight, but your efforts are in vain. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("close");
        rcon = new RoomConsequence();
        //con.add_consequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.add_room_effect(temp_room, safety_deposit);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.theft_id);
        c.set_defense_stat(-1, 15);
        c.setVariability(20);
        c.setText("lock");
        con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "It takes a few tries, but you begin to work out the mechanism. It isn't long before you hear a </c4>. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You do your best, but nothing seems to work, and the inner mechanisms of the lock remain a mystery. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("click");
        rcon = new RoomConsequence();
        rcon.add_room_effect(temp_room, safety_deposit);//,"Door") original comment
        rcon.set_always_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.trigger(0);//close the door...
        
        a.addChallenge(c,rcon);

        temp_room.addAction(a);
        
        return warehouse;
    }
    
    public static Area area_equine_encampment(){
        Area area = new Area("Equine Encampment");
        area.set_move_time(2);
        //Wandering Gypsies...
        //Merchant(Human, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        Template_Room template_room = new Template_Room("You're standing on a beaten dirt path with carts all about. ");
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(50, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of a small cart. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character(FPalace_npcs.encampment_equine(),1);
        template_house.add_character(FPalace_npcs.encampment_woman(),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room gypsy_store = new Template_Room("This cart is filled with wooden shelves with pots, pans, jars, jugs, and all sorts of assorted things.");
        gypsy_store.set_map_room_colour(0x5C4033);
        gypsy_store.set_no_area_exit();
        gypsy_store.add_no_connect_template(template_house);
        gypsy_store.add_no_connect_template(kitchens);
        gypsy_store.add_no_connect_template(bedrooms);
        
        gypsy_store.add_character(FPalace_npcs.equine_encampment_shopkeeper(), 1);
        
        area.random_area(1, gypsy_store);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(gypsy_store);
        inn_template.add_character(FPalace_npcs.encampment_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    public static Area area_swamp(){
        Area swamp = new Area("Swamp");
        swamp.set_move_time(3);
        
        swamp.new_weather(FPalaceHelper.clear_skies_weather());
        swamp.new_weather(FPalaceHelper.rain_weather());
        
        swamp.set_colour(0x006400);
        
        Template_Room template_room = new Template_Room("This is a well travelled dirt trail that traces it's path amidst reeds and water. ");
        template_room.add_item(FPalace_items.slim_reed(), 0.15);
        template_room.add_item(FPalace_items.sucking_shrooms(), 0.3);
        template_room.set_area_effects();
        
        template_room.add_container(FPalaceHelper.cart_container(),0.15);
        
        CharAction rest_action = new CharAction();
        rest_action.setName("campsite");
        rest_action.set_dialogue("You rest at the campsite. ");
        rest_action.set_rest_flag();
        
        CharActionObject camp_object = new CharActionObject();
        camp_object.set_description("There is a <a0> here. ");
        camp_object.add_action(rest_action, 3);
        
        template_room.add_action_object(camp_object, 0.1);
        
        template_room.set_max_same_exits(3);
        template_room.set_same_exit_offset(1);
        
        swamp.add_room_template(template_room);
        swamp.random_area(20);
        
        Template_Room hut_template = new Template_Room();
        hut_template.set_map_room_colour(0x5C4033);
        hut_template.set_no_area_exit();
        hut_template.set_filler_connect();			
        hut_template.set_unconnected();
        var witch_entrance = new Room("This is the entrance way of a small stone hut, and as such, doubles as <s0>kitchen</s0> and <s1>living room</s0>. ");
        witch_entrance.add_sub_descriptions("The kitchen has taps, knives, and a number of glass containers. You could probably use them to perform some <a0>. ");
        witch_entrance.add_sub_descriptions("There's a comfy looking chair, an armoire, and even a small coffee table by the <a1>. ");
        witch_entrance.set_id(-1);
        
        CharAction a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        witch_entrance.addAction(a);	
        
        a = new CharAction();
        a.setName("fireplace");
        
        a.set_dialogue("The fireplace is unlit, and it's hard not to notice a small </c0> in the back.\n");
        Challenge c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("door");
        RoomConsequence rcon = new RoomConsequence();
        rcon.set_always_change();
        rcon.add_room_effect(witch_entrance, null);
        rcon.set_join_area(40);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        a.addChallenge(c,rcon);
        
        witch_entrance.addAction(a);
        
        witch_entrance.set_template(hut_template);			
        var witch_bedroom = new Room("This looks like a bedroom, mostly because it has a bed. There is next to nothing else present past a broom in one corner. ");
        witch_bedroom.set_template(hut_template);
        Character granny = FPalace_npcs.castilla_witch();
        granny.new_location(witch_bedroom);
        
        witch_entrance.new_exit(witch_bedroom,"Up");
        witch_bedroom.new_exit(witch_entrance,"Down");
        
        swamp.add_room(witch_entrance);
        
        Room temp_room = witch_entrance.exits.get(0);
        temp_room.set_description("A small <s0>hut</s0> made of solid stone stands on a small patch of dry land nearby. ");
        temp_room.add_sub_descriptions("The hut has a proud wooden <s1>door</s1>, a thatch roof, and seems somehow tidy and messy at the same time. ");
        temp_room.add_sub_descriptions("The door is heavy looking, with a large handle and a <a0>. ");
        
        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("",0);
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("");
        rcon = new RoomConsequence();
        rcon.set_never_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You see a keyhole clearly looking to be </c1>.\n",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "The door is already open. You could </c2> it if you wanted. ",0);
        rcon.add_room_effect(temp_room, witch_entrance);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.covert_id);
        c.set_defense_stat(-1, 15);
        c.setVariability(20);
        c.setText("used");
        Consequence con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "You begin to fenangle with the </c3>, as you don't possess a key. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You bash against the door, no key in sight, but your efforts are in vain. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("close");
        rcon = new RoomConsequence();
        //con.add_consequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.add_room_effect(temp_room, witch_entrance);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.theft_id);
        c.set_defense_stat(-1, 10);
        c.setVariability(20);
        c.setText("lock");
        con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "It takes a few tries, but you begin to work out the mechanism. It isn't long before you hear a </c4>. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You do your best, but nothing seems to work, and the inner mechanisms of the lock remain a mystery. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("click");
        rcon = new RoomConsequence();
        rcon.add_room_effect(temp_room, witch_entrance);//,"Door") original comment
        rcon.set_always_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.trigger(0);//close the door...
        
        a.addChallenge(c,rcon);

        temp_room.addAction(a);
        
        Template_Room template_filler = new Template_Room("You're standing knee deep in swamp-water, surrounded by reeds. ");
        template_filler.add_item(FPalace_items.slim_reed(), 0.15);
        template_filler.add_item(FPalace_items.sucking_shrooms(), 0.3);
        template_filler.set_map_room_colour(0x006400);
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        template_filler.set_area_effects();
        template_filler.add_item(FPalace_items.slim_reed(), 0.15);
        template_filler.add_item(FPalace_items.sucking_shrooms(), 0.3);
        
        a = new CharAction();
        a.setName("Walls of reeds seem to surround you. ");//</path>
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",3);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You work your way through the reeds. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a.addChallenge(challenge, rconsequence);
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,0);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(2);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_effect(FPalace_npcs.swamp_crocodile());
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "A crocodile crawls out from the reeds as you push through!. ",0);
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,2);
        
        a.addChallenge(char_chall, char_consequence);
        a2.addChallenge(char_chall, char_consequence);
        
        Challenge char_chall2 = new Challenge();
        char_chall2.set_attack_stat(-1,1);
        char_chall2.set_defense_stat(-1,0);
        char_chall2.setVariability(0);
        Consequence char_consequence2 = new Consequence();
        char_consequence2.add_char_effect(FPalace_npcs.swamp_frog_fighter());
        char_consequence2.addConsequence(FPalaceHelper.con_id,0, "A froggy fighter leaps into your way! ",0);
        
        a.addChallenge(char_chall2, char_consequence2);
        a2.addChallenge(char_chall2, char_consequence2);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The wall of reeds is visible to the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You work your way through the reeds. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_filler.set_hidden_exit_action(a, challenge,rconsequence);
        template_filler.add_exit_action(a2, challenge, rconsequence);				
        
        swamp.set_filler_template(template_filler);
        
        return swamp;
    }
    
    public static Area witches_school(){
        Area area = new Area("School of Witchcraft");
        area.set_move_time(1);
        //Witches school... pseudo-Hogwarts, though girls only
        //Merchant(Potion Master)
        var school_to_hut = new Room("This small mud-room seems oddly out of place next to the shimmering portal that likely leads back to the real world. ");
        area.add_room(school_to_hut);
        area.add_connect_room(school_to_hut);			
        
        Template_Room template_room = new Template_Room("This looks like a posh boarding school, with wood panneling for the walls, and carpet on marble floors, though strangely no windows. ");
        template_room.add_character(FPalace_npcs.witches_student(),0.4);
        template_room.set_max_same_exits(2);
        area.add_room_template(template_room);
        area.random_area(20);
        
        Template_Room school_store = new Template_Room("This small room is lined top to bottom in potions of every colour, wide-brimed and pointed hats, and the ocassional wand. ");
        school_store.set_map_room_colour(0x5C4033);
        school_store.set_no_area_exit();
        
        Room temp_room = school_store.make_room();
        FPalace_npcs.witches_potionmaster().new_location(temp_room);
        area.add_room(temp_room);
        
        Room alchemy_room = new Room("This is a potions <s1>classroom</s1>, filled with bottles, cleaning supplies, taps, and <s0>benches</s0>. ");
        alchemy_room.add_sub_descriptions("The bench seems to have a number of devices useful for <a0>. ");
        alchemy_room.add_sub_descriptions("As you look about the class-room, you find a small <a1> hidden amongst the shelves of bottles. ");
        alchemy_room.set_id(-1);
        
        CharAction a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        alchemy_room.addAction(a);
        
        Template_Room hidden_alchemy = new Template_Room();
        hidden_alchemy.set_map_room_colour(0x5C4033);
        hidden_alchemy.set_no_area_exit();
        hidden_alchemy.set_filler_connect();
        hidden_alchemy.set_unconnected();
        Room hidden_alchemy_room = new Room("This is a small, dark stone room. ");
        hidden_alchemy_room.set_template(hidden_alchemy);			
        Character rapunzel = FPalace_npcs.witches_naughty_potionmaker().gen_char();
        rapunzel.new_location(hidden_alchemy_room);
        
        alchemy_room.new_exit(hidden_alchemy_room);
        
        a = new CharAction();
        a.setName("keyhole");
        a.set_dialogue("",0);
        Challenge c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("");
        RoomConsequence rcon = new RoomConsequence();
        rcon.set_never_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "On closer inspection, the keyhole is </c1> on the shelf, rather than being real.\n",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "The door is already open. You could </c2> it if you wanted. ",0);
        rcon.add_room_effect(alchemy_room, hidden_alchemy_room);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.magic_id);
        c.set_defense_stat(-1, 10);
        c.setVariability(20);
        c.setText("drawn");
        Consequence con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "You focus on the </c3>, imagining a key. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You poke your finger at the drawing. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("close");
        rcon = new RoomConsequence();
        //con.add_consequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
        rcon.add_room_effect(alchemy_room, hidden_alchemy_room);
        
        a.addChallenge(c,rcon);
        
        c = new Challenge(true);
        c.set_attack_stat(FPalace_skills.physical_magic_id);
        c.set_defense_stat(-1, 10);
        c.setVariability(20);
        c.setText("drawing");
        con = new Consequence();
        con.addConsequence(FPalaceHelper.con_id,0, "It isn't long before you're projecting an image of your key turn in the hole, and you hear a </c4>. ",0);
        con.addConsequence(FPalaceHelper.con_id,0, "You play pretend for a few minutes, but nothing changes. ",-1);
        
        a.addChallenge(c,con);
        
        c = new Challenge();
        c.set_room_challenge(Challenge.EXITCHECK);
        c.set_defense_stat(-1, 0);
        c.setVariability(0);
        c.setText("click");
        rcon = new RoomConsequence();
        rcon.add_room_effect(alchemy_room, hidden_alchemy_room);//,"Door") original comment
        rcon.set_always_change();
        rcon.addConsequence(FPalaceHelper.con_id,0, "You open the door. ",-1);
        rcon.addConsequence(FPalaceHelper.con_id,0, "You close the door. ",0);
                    
        a.addChallenge(c,rcon);

        alchemy_room.addAction(a);			
        
        area.add_room(alchemy_room);
        rcon.trigger(0);//close the door...
        
        return area;
    }
    
    public static Area area_burrowton(){
        Area area = new Area("Burrowton");
        area.set_move_time(2);
        //Hobbit holes and rabbits
        //Merchant(Rabbit, stores):Clothing
        
        area.new_weather(FPalaceHelper.clear_skies_weather());
        area.new_weather(FPalaceHelper.rain_weather());
        
        area.set_colour(0x808069);
        Template_Room template_room = new Template_Room("You're standing on a beaten dirt path with small homes dug into the ground all about. ");
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        template_room.set_area_effects();
        area.add_room_template(template_room);
        area.random_area(20, template_room);
        
        
        Template_Room template_house = new Template_Room("You're standing in the entrance of burrow hole. ");
        template_house.set_map_room_colour(0x5C4033);
        template_house.set_max_same_exits(0);
        template_house.set_no_area_exit();
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.rabbit_girl(),FPalace_npcs.burrowton_girl())),1);
        template_house.add_character_list(new ArrayList<>(Arrays.asList(FPalace_npcs.rabbit_guy(),FPalace_npcs.burrowton_guy())),1);
        
        Template_Room kitchens = new Template_Room("You're standing in a small kitchen. ");
        kitchens.set_map_room_colour(0x5C4033);
        kitchens.set_max_same_exits(0);
        kitchens.set_no_area_exit();
        kitchens.add_no_connect_template(template_room);
        
        Template_Room bedrooms = new Template_Room("You're standing in a small bedroom. ");
        bedrooms.set_map_room_colour(0x5C4033);
        bedrooms.set_max_same_exits(0);		
        bedrooms.set_no_area_exit();
        bedrooms.add_no_connect_template(template_room);
        
        template_house.add_other_room(kitchens);
        template_house.add_other_room(bedrooms);
        
        template_house.add_no_connect_template(kitchens);
        template_house.add_no_connect_template(bedrooms);
        
        area.add_room_template(template_house);
        area.random_area(10, template_house);
        
        Template_Room cheesemonger = new Template_Room("This store is filled with shelves covered in large rounds of cheese. There's also a <s0>small bench</s0> covered in kitchen tools. ");
        cheesemonger.add_sub_descriptions("The bench seems to have a number of devices useful for <a0>. ");
        cheesemonger.set_id(-1);
        CharAction a = new CharAction();
        a.setName("alchemy");
        a.set_alchemy_flag();
        
        cheesemonger.add_action(a);
        cheesemonger.set_map_room_colour(0x5C4033);
        cheesemonger.set_no_area_exit();
        cheesemonger.add_no_connect_template(template_house);
        cheesemonger.add_no_connect_template(kitchens);
        cheesemonger.add_no_connect_template(bedrooms);
        
        cheesemonger.add_character(FPalace_npcs.burrowton_cheesemonger(), 1);
        
        area.random_area(1, cheesemonger);
        
        Template_Room inn_template = new Template_Room("This appears to be something of an inn. ");
        inn_template.set_map_room_colour(0x5C4033);
        inn_template.set_no_area_exit();
        inn_template.add_no_connect_template(template_house);
        inn_template.add_no_connect_template(kitchens);
        inn_template.add_no_connect_template(bedrooms);
        inn_template.add_no_connect_template(cheesemonger);
        inn_template.add_character(FPalace_npcs.burrowton_inkeep(), 1);
        
        area.add_room_template(inn_template);
        area.random_area(1,inn_template);
        
        return area;
    }
    
    
    public static Area area_tower_to_god(){
        Area tower = new Area("Tower");
        tower.set_move_time(1);
        
        Template_Room template_room = new Template_Room("You're standing in a well lit hall seemingly made of light. ");
        template_room.set_max_same_exits(4);
        template_room.set_same_exit_offset(1);
        Container cont = new Container();
        cont.set_name("bowl");
        cont.set_description("There is a <a href=\"event:inspect,</id>,0\">bowl</a> on a small table. ");
        cont.add_sub_descriptions("A golden and visibly chilled bowl, perfect for storing food.");
        cont.set_always_open();
        cont.set_bury();
        cont.add_to_loot_table(FPalace_items.devils_food_cake(),0.2);
        cont.add_to_loot_table(FPalace_items.heavenly_hash(),0.2);
        cont.add_to_loot_table(FPalace_items.rabbity_carrot(),0.1);
        cont.add_to_loot_table(FPalace_items.penguins_pocky(),0.1);
        cont.add_to_loot_table(FPalace_items.foxy_fruit(),0.1);
        cont.add_to_loot_table(FPalace_items.fishy_fruit(),0.1);
        cont.add_to_loot_table(FPalace_items.vial_of_ichor(),0.1);
        cont.add_to_loot_table(FPalace_items.vial_of_goo(),0.1);
        cont.add_to_loot_table(FPalace_items.elvish_bread(),0.1);
        cont.add_to_loot_table(FPalace_items.catnip(),0.1);
        cont.add_to_loot_table(FPalace_items.plain_jane_potion(),0.1);
        cont.add_to_loot_table(FPalace_items.bovine_milk_jug(),0.1);
        cont.add_to_loot_table(FPalace_items.scaled_egg(),0.1);
        cont.add_to_loot_table(FPalace_items.doggy_bone(),0.1);
        cont.add_to_loot_table(FPalace_items.veiny_venison(),0.1);
        cont.add_to_loot_table(FPalace_items.orcish_delight(),0.1);
        cont.add_to_loot_table(FPalace_items.goblin_giblets(),0.1);
        cont.add_to_loot_table(FPalace_items.strong_cheese(),0.1);
        cont.add_to_loot_table(FPalace_items.froggy_feijoa(),0.1);
        cont.add_to_loot_table(FPalace_items.donkey_daikon(),0.1);
        cont.add_to_loot_table(FPalace_items.Honey(),0.1);
        cont.add_to_loot_table(FPalace_items.Stallion_Stout(),0.1);
        cont.add_to_loot_table(FPalace_items.edible_warranty(),0.1);			
        cont.open();
        template_room.add_container(cont,0.10);
        
        CharAction a2 = new CharAction();
        a2.setName("");
        a2.set_dialogue("",2);
        
        Challenge challenge = new Challenge(true);
        challenge.set_attack_stat(FPalace_skills.covert_id);
        challenge.set_defense_stat(-1,5);
        challenge.setVariability(20);
        challenge.setText("");
        
        RoomConsequence rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You walk along the way. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,1);
        
        a2.addChallenge(challenge, rconsequence);
        
        Challenge char_chall = new Challenge();
        char_chall.set_attack_stat(-1,1);
        char_chall.set_defense_stat(-1,0);
        char_chall.setVariability(0);//Slime is 33% more likely to spawn then equine with this. If 1, slime is 50% more likely
        char_chall.setText("an enemy");
        Consequence char_consequence = new Consequence();
        char_consequence.add_char_list(new ArrayList<>(Arrays.asList(FPalace_npcs.heaven_cherub(), FPalace_npcs.heaven_angel(), FPalace_npcs.hell_imp(), FPalace_npcs.hell_succubus())));
        char_consequence.addConsequence(FPalaceHelper.con_id,0, "The towers defenders decide to attack! ",0);
        
        a2.addChallenge(char_chall, char_consequence);
        
        challenge = new Challenge(true);
        challenge.set_attack_stat(-1,5);
        challenge.set_defense_stat(-1,1);
        challenge.setVariability(20);
        challenge.setText("The grass looms from the </path>. ");
        
        rconsequence = new RoomConsequence();
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "You walk along the way. ",0);
        rconsequence.addConsequence(FPalaceHelper.con_id,0, "",-1,0,0,0);
        
        template_room.add_exit_action(a2, challenge, rconsequence);
        
        
        tower.add_room_template(template_room);
        tower.random_area(20);
        
        Template_Room template_filler = new Template_Room("You're standing in a well lit hall seemingly made of light. ");
        template_filler.set_discovery_difficulty(15);
        template_filler.set_sight_difficulty(20);
        template_filler.set_locate_difficulty(15);
        //template_filler.add_character(FPalace_npcs.heaven_cherub(),0.15);
        //template_filler.add_character(FPalace_npcs.heaven_angel(),0.15);
        template_filler.add_container(cont,0.10);
        
        template_filler.add_exit_action(a2, challenge, rconsequence);
        
        tower.set_filler_template(template_filler, Area.single_connected_filler);
        
        Template_Room downTemplate = new Template_Room("You're standing in a well lit hall seemingly made of light. A staircase made of clouds looks to lead to another level. ");
        downTemplate.set_discovery_difficulty(15);
        downTemplate.add_container(cont,0.10);
        downTemplate.set_sight_difficulty(20);
        downTemplate.set_locate_difficulty(15);
        
        tower.set_dynamicBuildTemplate(downTemplate);						
        
        return tower;
    }
    
}

