package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;

public class FPalace_races {

		public FPalace_races() {
			// constructor code
		}
		
		//thinking the some of the anthropomorphic races should be based on the chinese zodiac: 
			//Rat(thereish) – 鼠 (子) (Yang, 1st Trine, Fixed Element Water)
			//Ox(thereish) – 牛 (丑) (Yin, 2nd Trine, Fixed Element Water)
			//Tiger(thereish) – 虎 (寅) (Yang, 3rd Trine, Fixed Element Wood)
			//Rabbit(there) – 兔 or 兎 (卯) (Yin, 4th Trine, Fixed Element Wood)
			//Dragon(thereish) – 龍 / 龙 (辰) (Yang, 1st Trine, Fixed Element Wood)
			//Snake(thereish) – 蛇 (巳) (Yin, 2nd Trine, Fixed Element Fire)
			//Horse(there) – 馬 / 马 (午) (Yang, 3rd Trine, Fixed Element Fire)
			//Goat – 羊 (未) (Yin, 4th Trine, Fixed Element Fire)
			//Monkey – 猴 (申) (Yang, 1st Trine, Fixed Element Metal)
			//Rooster – 雞 / 鸡 (酉) (Yin, 2nd Trine, Fixed Element Metal)
			//Dog – 狗 / 犬 (戌) (Yang, 3rd Trine, Fixed Element Metal)
			//Pig – 豬 / 猪 (亥) (Yin, 4th Trine, Fixed Element Water)
			
		/*20 most popular "fursonas"
			1	Fox
			2	Wolf
			3	(There)Dog
			4	(thereish)Dragon
			5	(there)Cat
			6	Tiger
			7	Lion
			8	Raccoon
			9	(there)Rabbit
			10	Skunk
			11	Bear
			12	Otter
			13	(there)Horse
			14	Coyote
			15	Cheetah
			16	Hyena
			17	Snow Leopard
			18	Kangaroo
			19	Bird
			20	(There)Rat
		*/
		//need to finish adding part descriptions
		//want the descriptions to be able to change based on stat values
		
		private static Race gooRace;
		private static Race humanRace;
		private static Race anthroRabbitRace;
		private static Race elfRace;
		private static Race dwarfRace;
		private static Race goblinRace;
		private static Race anthroFelinRace;
		private static Race anthroCanineRace;
		private static Race anthroBovineRace;
		private static Race anthroEquineRace;
		private static Race anthroDonkeyRace;
		private static Race anthroBeeRace;
		private static Race anthroLizardRace;
		private static Race anthroFrogRace;
		private static Race anthroFishRace;
		private static Race anthroSpiderRace;
		private static Race anthroMouseRace;
		private static Race angelicRace;
		private static Race demonRace;
		private static Race orcRace;
		private static Race anthroDeerRace;
		private static Race anthroFoxRace;
		private static Race anthroPenguinRace;
		private static Race anthroSealRace;
		
		private static Race sexsnakeRace;
		private static Race scorpionRace;
		private static Race horseRace;
		private static Race wolfRace;
		private static Race hyenaRace;
		private static Race crocRace;
		private static Race reindeerRace;
        private static Race polarRace;
        private static String[] outputStrings = new String[]{"</n2> invades </n> nether regions with a tendril of </noun2> goo. ",
        "oval translucent white orbs, with pupils that are circular ","straight, "};
		
		public static Race race_goo(){
			if(gooRace == null){
				Race race = new Race();
				
				race.set_name("goo");
				race.new_stat(FPalaceHelper.stat_biomass_consumed());
				race.new_stat(FPalaceHelper.stat_goo_colour());
				
				race.add_damage_resistance(FPalaceHelper.fire_damage_type().get_id());
				race.add_damage_resistance(FPalaceHelper.pierce_damage_type().get_id());
				race.add_damage_resistance(FPalaceHelper.slash_damage_type().get_id());
				race.add_damage_weakness(FPalaceHelper.lit_damage_type().get_id());
				
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.anal_depth_id,15, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.anal_width_id,7, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.vaginal_width_id,7, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.vaginal_depth_id,15, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.max_lust_id,10);
				race.set_bonus(FPalaceHelper.goo_colour_id,0.3);
				
				race.add_status_immunity(TickEffect.lactating_status);
				//STR:22
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX:25
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.hands_slot);				
				//CON:25
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.hands_slot);
				//BEAUTY:22
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);				
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				
				//INT:20	
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.torso_slot);
				//WIS:20
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.torso_slot);
				//WILL:21	
				race.set_stat_max(FPalaceHelper.will_id, 10.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 10.5, FPalaceHelper.torso_slot);
				//CHA:24
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.torso_slot);
											
				race.add_part_description(FPalaceHelper.head_slot,"smiling caricature of humanity, </noun> translucent face slightly disturbing as you look at both </objnoun> and the room behind </noun> head. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.goo_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"large, perfectly circular, perfectly white orbs, with pupils that are every bit as circular ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.goo_eyes_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"translucent, allowing you to see through </objnoun> to the other side. It occasionaly shifts and flows, forming visible edies within </objnoun>. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.goo_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"appear to be made of </sd"+FPalaceHelper.goo_colour_id+"> goo, an occasional tendril dripping as </pronoun> moves them. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.goo_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"shifting and moving, changing from one shape to the next without actually moving the individual digits. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.goo_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"semi-translucent and almost spherical, like water balloons. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.goo_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"completely translucent, and justs from </noun> groin like a foreign object. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.goo_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"visibly churning, their inner workings apparent due to their less than opaque nature. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.goo_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"jiggles with each movement mermerizingly as </pronoun> moves. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.goo_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"appears as a gapping maw delving deep into </noun> torso. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.goo_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"merging and seperating occasionally as you watch </objnoun>. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.goo_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"nothing more than a pile of </sd"+FPalaceHelper.goo_colour_id+"> goo from which the rest of </objnoun> seems to stem from. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.goo_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"nothing more than a slighly different coloured nub of goo. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.goo_clit_1_img);
				
				race.new_female_name_set(new String[]{"Aaqua","Jinni","Areena","Seka","Trinity","Amethyst","Bebe","Coco","Desiree","Gigi","Gooey","Oozi","Glo"});
				race.new_male_name_set(new String[]{"Goon", "Lexington", "Mister", "Mandingo", "Nacho", "Toni", "Boz", "Kid", "Tee", "Slimi","Slus"});
				race.new_surname_set(new String[]{""});
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_breasts(race), 1);
				race.add_part(FPalaceHelper.new_vagina(race), 1);
				race.add_part(FPalaceHelper.new_clit(race), 1);
				
				CharAction a3 = new CharAction();
					a3.setName("Goo lob");
					a3.set_attack_flag(CharAction.attack_type_single_target, "Skills");
					a3.set_attack_description("Lob some of your goo at a single opponent. ");
						Challenge challenge2 = new Challenge(true);
						 challenge2.set_attack_stat(FPalace_skills.ranged_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Goo lob");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> hits </n> with some of </noun2> lobbed goo. ",0);
						consequence2.addConsequence(FPalaceHelper.lust_id,2, "</n> is a bit distracted by the scent. ",0);
						consequence2.addConsequence(0,0, "</n2> futily throws </noun2> goo about. ",-1);
									
					a3.addChallenge(challenge2,consequence2);			
				
				race.new_attack(a3);
				
				a3 = new CharAction();
					a3.setName("Body Invade");
					a3.set_attack_flag(CharAction.attack_type_single_target, "Skills");
					a3.set_attack_description("Invade a single targets body with your goo. ");
					a3.set_requirement(FPalaceHelper.lust_id, 10);
						challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.grappling_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Body Invade");
						consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.lust_id,20, "</n2> slathers </n> with a tendril of </noun2> goo. ",0);
						consequence2.addConsequence(FPalaceHelper.vaginal_depth_id,1, outputStrings[0],0);
						consequence2.addConsequence(FPalaceHelper.vaginal_width_id,0.3, outputStrings[0],0);
						consequence2.addConsequence(FPalaceHelper.breast_size_id,0.3, "</n2> invades </n> nipples with a tendril of </noun2> goo. ",0);
						consequence2.addConsequence(FPalaceHelper.penis_length_id,1, outputStrings[0],0);
						consequence2.addConsequence(FPalaceHelper.penis_girth_id,0.3, outputStrings[0],0);
						consequence2.addConsequence(FPalaceHelper.balls_size_id,1, outputStrings[0],0);
						consequence2.addConsequence(0,0, "</n2> futily lashes about with a tendril of goo. ",-1);
						consequence2.apply_random_effect();					
									
					a3.addChallenge(challenge2,consequence2);		
				
				race.new_attack(a3);
				
				//need an action to dump out biomass_consumed into either new body parts or FPalace_npcs.goo_slime() (or takeover other parts for a non-entirely goo character)
				CharAction a = new CharAction();
				a.setName("Goo-spantion");
				a.set_personal();
				a.set_dialogue("</n> suddenly has a look of constirnation on </noun> </c0>. ");
				a.set_requirement(FPalaceHelper.biomass_consumed,2000);
				Challenge c = new Challenge();
				c.set_attack_stat(FPalaceHelper.biomass_consumed);
				c.set_defense_stat(-1,0);
				c.setVariability(0);
				c.setText("face");
				Consequence cons = new Consequence();
				cons.add_change_effect(race);
				//still want to be able to spawn new creature... or maybe that should be a special one for just one character (Goo empress)
				cons.addConsequence(FPalaceHelper.lust_id,0, "</n> suddenly opens </noun> eyes in shock, </noun> body growing and changing. ",0);
				cons.addConsequence(FPalaceHelper.lust_id,26, "</n> ends up furrowing </noun> brow as nothing happens. ",-1);
				a.addChallenge(c,cons);
				
				race.new_action(a);
				gooRace = race;
			}
			
			return gooRace;
        }
        
		
		public static Race race_human(){
			if(humanRace == null){
				Race race = new Race();
				
				race.set_name("human");
				
				race.new_stat(FPalaceHelper.stat_skin_colour());
				
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.9, FPalaceHelper.eyes_slot);
				
				//STR: 22	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);				
				//DEX: 22	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				//BEAUTY: 23
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 24
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.torso_slot);				
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced human, </noun> smooth </sd"+FPalaceHelper.skin_colour_id+"> skin and curved ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.human_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,outputStrings[1]);
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.human_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.human_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.skin_colour_id+"> flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.human_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth skinned and </sd"+FPalaceHelper.skin_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.human_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.skin_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.human_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.skin_colour_id+"> skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.human_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth </sd"+FPalaceHelper.skin_colour_id+"> flesh, it's head mushroom-shaped. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.human_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in wrinkly </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.human_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.human_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.human_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.skin_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.human_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.human_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.human_clit_1_img);
				
				race.new_female_name_set(new String[]{"Abby", "Adela", "Becky", "Bianca", "Brittany", "Carol", "Caitlyn", "Casey", "Chelsi", "Crissy", "Dana", "Dara", "Jane", "Erica", "Evelyn", "Felicia", "Franchesca", "Giana", "Gracie", "Hailey", "Hazel", "Heidi", "Ivana", "Janeen", "Janice", "Jazmin", "Jessica", "Josie", "Lana", "Lauren", "Mandy", "Marcy", "Natalie", "Nicole", "Nikki", "Pamela", "Penny", "Priscilla", "Rachel", "Sabrina", "Sarah", "Shannon", "Stacy", "Tammy", "Teresa", "Katherine", "Wendy"});
				race.new_male_name_set(new String[]{ "Adam", "Bruce", "Bob", "Daniel", "Ed", "Jim", "John", "Tony", "Peter", "Rob", "Ryan", "Will"});
				race.new_surname_set(new String[]{"Armschlong", "Adams", "Anaconda", "Baker", "Batterblaster", "Bonesworth", "Cummings", "Cockswell", "Danglemore", "Doe", "Everhard", "Femwood", "Frankfurter", "Junkstuffer", "Jerkstein", "Jumboner", "Lancealot", "Ramrod", "Smith", "Stinger"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 9));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				humanRace = race;
			}
			return humanRace;
		}
		
		public static Race race_angel(){
			if(angelicRace == null){
				Race race = new Race();
				race.set_name("angel");
				
				race.set_aging_mod(100);
				race.new_stat(FPalaceHelper.stat_skin_colour());
				
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.9, FPalaceHelper.eyes_slot);
				//STR: 18	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX: 19	
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				//CON: 19	
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				//BEAUTY: 19
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.wings_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);				
				//INT: 26
				race.set_stat_max(FPalaceHelper.int_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 13, FPalaceHelper.torso_slot);
				//WIS: 26
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.torso_slot);
				//WILL: 26
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.torso_slot);
				//CHA: 26
				race.set_stat_max(FPalaceHelper.cha_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 13, FPalaceHelper.torso_slot);
				
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced angel, </noun> smooth </sd"+FPalaceHelper.skin_colour_id+"> skin and curved ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.human_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,outputStrings[1]);
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.human_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.human_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.skin_colour_id+"> flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.human_torso_1_img);
				race.add_part_description(FPalaceHelper.wings_slot,"filled with the purest white feathers. ");
				race.add_part_image(FPalaceHelper.wings_slot, FPalaceHelper.angel_wing_1_img);				
				race.add_part_description(FPalaceHelper.arms_slot,"smooth skinned and </sd"+FPalaceHelper.skin_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.human_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.skin_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.human_hand_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.human_hips_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.skin_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.human_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.human_foot_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.skin_colour_id+"> skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.human_breasts_1_img);				
				
				race.new_female_name_set(new String[]{"Angela", "Eve"});
				race.new_male_name_set(new String[]{ "Adam", "Angel"});
				race.new_surname_set(new String[]{""});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 9));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_wings(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				angelicRace = race;
			}
			return angelicRace;
		}
		
		public static Race race_demon(){
			if(demonRace == null){
				Race race = new Race();
				race.set_name("demon");
				
				race.set_aging_mod(100);
				race.new_stat(FPalaceHelper.stat_goo_colour());
				
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.9, FPalaceHelper.eyes_slot);
				//STR:26	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);				
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				//DEX:26	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.feet_slot);
				//CON:26	
				race.set_stat_max(FPalaceHelper.con_id, 4, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 4, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				//BEAUTY:26
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.wings_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);				
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 19
				race.set_stat_max(FPalaceHelper.int_id, 9.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 9.5, FPalaceHelper.torso_slot);
				//WIS: 18
				race.set_stat_max(FPalaceHelper.wis_id, 9, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 9, FPalaceHelper.torso_slot);
				//WILL: 19
				race.set_stat_max(FPalaceHelper.will_id, 9.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 9.5, FPalaceHelper.torso_slot);
				//CHA: 19
				race.set_stat_max(FPalaceHelper.cha_id, 9.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 9.5, FPalaceHelper.torso_slot);
				
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced demon, </noun> smooth </sd"+FPalaceHelper.goo_colour_id+"> skin and pointed ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.human_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"oval translucent white orbs, with pupils that are serpent-like ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.human_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.human_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.goo_colour_id+"> flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.human_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth skinned and </sd"+FPalaceHelper.goo_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.human_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.goo_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.human_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.goo_colour_id+"> skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.human_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"ribbed </sd"+FPalaceHelper.goo_colour_id+"> flesh, it's head mushroom-shaped. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.human_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in wrinkly </sd"+FPalaceHelper.goo_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.human_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.goo_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.human_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.human_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.goo_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.human_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.goo_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.human_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.human_clit_1_img);				
				race.add_part_description(FPalaceHelper.wings_slot,"skeletal and leathery. ");
				race.add_part_image(FPalaceHelper.wings_slot, FPalaceHelper.demon_wing_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a thin length of </sd"+FPalaceHelper.goo_colour_id+"> that ends in a spade. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.demon_tail_1_img);
				
				
				race.new_female_name_set(new String[]{"Demona", "Lilith"});
				race.new_male_name_set(new String[]{ "Cain", "Lucifer"});
				race.new_surname_set(new String[]{""});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 9));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_wings(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				demonRace = race;
			}
			return demonRace;
		}
		
		public static Race race_anthro_rabbit(){
			if(anthroRabbitRace == null){
				Race race = new Race();
				race.set_name("lagomorph");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.4);
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.wis_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,5, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.con_id,-0.5, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,-0.5, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.bust_id,-4, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.waist_id,-4, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.hips_id,-4, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.5, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.height_id,-20, FPalaceHelper.tail_slot);
				race.set_bonus(FPalaceHelper.max_lust_id,-3);
				//STR: 17	
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.hands_slot);				
				//DEX: 29
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.hands_slot);				
				//CON: 19	
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				//BEAUTY: 25
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 20
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.torso_slot);
				//WIS: 26
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.torso_slot);
				//WILL: 21
				race.set_stat_max(FPalaceHelper.will_id, 10.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 10.5, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced lagomorph with long, floppy ears and a small darting pink nose amidst short </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.rabbit_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark circular pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.rabbit_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.rabbit_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"soft fuzzy </sd"+FPalaceHelper.fur_colour_id+"> fur excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.rabbit_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in short, soft looking </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.rabbit_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in short </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.rabbit_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"soft fuzzy teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.rabbit_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pink flesh, with only the slightest flare on its length. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.rabbit_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in a soft fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.rabbit_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"covered in soft fuzzy </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.rabbit_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.rabbit_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.rabbit_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.rabbit_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.rabbit_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a large tuff of white fur. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.rabbit_tail_1_img);
				
				race.new_female_name_set(new String[]{"Fluffy", "Akeeta", "Angel", "April", "Bambi", "Bella", "Bernadette", "Bluebell", "Breezy", "Buffy", "Buttercup", "Caramel", "Chloe", "Cinnamon", "Cookie", "Crystal"});
				race.new_male_name_set(new String[]{"Thumper", "Cottontail", "Harry", "Sterling", "Franklin", "Redding", "Theodore", "Peter", "Raul"});
				race.new_surname_set(new String[]{"Bunny", "Altex", "Flopper", "Baladi", "Beveren", "Niklaas", "Chaudry", "Elfin", "Bourgog", "Gotland"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 2));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroRabbitRace = race;
			}
			
			return anthroRabbitRace;
		}
		
		public static Race race_elf(){
			if(elfRace == null){
				Race race = new Race();
				race.set_name("elf");
				
				race.new_stat(FPalaceHelper.stat_skin_colour());
				
				race.set_aging_mod(10);
				race.set_bonus(FPalaceHelper.str_id,-0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.int_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.5, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,-0.5, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,-0.5, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.breast_size_id, -0.5, FPalaceHelper.breasts_slot);
				race.set_bonus(FPalaceHelper.penis_length_id, -1, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,-0.1, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,-0.01, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.max_lust_id,2);
				//STR: 17	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.hands_slot);
				//DEX: 28	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hands_slot);
				//CON: 17	
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.hands_slot);
				//BEAUTY: 27
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.25, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.25, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.25, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.25, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.25, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.25, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 26
				race.set_stat_max(FPalaceHelper.int_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 13, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 20
				race.set_stat_max(FPalaceHelper.will_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 10, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced elf, </noun> smooth </sd"+FPalaceHelper.skin_colour_id+"> skin and pointed ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.elf_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,outputStrings[1]);
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.elf_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.elf_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"pale flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.elf_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth skinned and </sd"+FPalaceHelper.skin_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.elf_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.skin_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.elf_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.skin_colour_id+"> skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.elf_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth </sd"+FPalaceHelper.skin_colour_id+"> flesh, it's head flared and conical. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.elf_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.elf_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.elf_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.elf_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.skin_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.elf_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.elf_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.elf_clit_1_img);
				
				race.new_female_name_set(new String[]{"Aywin", "Arwen", "Mirima", "Alya", "Vanya", "Caladwen", "Melda", "Verya", "Euraina", "Lona", "Yellwen"});
				race.new_male_name_set(new String[]{"Elwin", "Adan", "Durion", "Glandur", "Rimedur", "Thalion", "Beleg", "Voron", "Manwe", "Arthion", "Sellion"});
				race.new_surname_set(new String[]{"Gemflower", "Moonwhisper", "Silverfrond", "Oakenheel", "Nightbrook"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 15));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				elfRace = race;
			}
			
			return elfRace;
		}
		
		public static Race race_dwarf(){
			if(dwarfRace == null){
				Race race = new Race();
				race.set_name("dwarf");
				
				race.new_stat(FPalaceHelper.stat_skin_colour());
				
				race.set_aging_mod(5);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.hands_slot);
				race.set_bonus(FPalaceHelper.wis_id,2, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.5, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.con_id,0.5, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,0.5, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.dex_id,-1, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.height_id,-4, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.height_id,-4, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.height_id,-4, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.height_id,-4, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,-0.1, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,-0.01, FPalaceHelper.balls_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced dwarf, </noun> rough </sd"+FPalaceHelper.skin_colour_id+"> skin and round ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.dwarf_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,outputStrings[1]);
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.dwarf_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.dwarf_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"rough </sd"+FPalaceHelper.skin_colour_id+"> flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.dwarf_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"rough skinned and </sd"+FPalaceHelper.skin_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.dwarf_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in rough </sd"+FPalaceHelper.skin_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.dwarf_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"rough skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.dwarf_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"rough </sd"+FPalaceHelper.skin_colour_id+"> flesh, it's head flared and conical. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.dwarf_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in taunt </sd"+FPalaceHelper.skin_colour_id+"> rough flesh. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.dwarf_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.skin_colour_id+"> rough flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.dwarf_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.dwarf_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight rough </sd"+FPalaceHelper.skin_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.dwarf_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of rough </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.dwarf_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.dwarf_clit_1_img);
				
				race.new_female_name_set(new String[]{"Cheery", "Griia", "Dimundi", "Norumma", "Hergoli", "Harli", "Bina", "Druia"});
				race.new_male_name_set(new String[]{"Bruenor", "Farund", "Daldin", "Gomond", "Dalak"});
				race.new_surname_set(new String[]{"Ironfist", "Bulstor", "Gimest", "Thorhak"});
				//STR: 31	
				race.set_stat_max(FPalaceHelper.str_id, 3.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3.5, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hands_slot);
				//DEX: 14	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1.25, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1.25, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1.25, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1.25, FPalaceHelper.hands_slot);
				//CON: 28	
				race.set_stat_max(FPalaceHelper.con_id, 3.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.feet_slot);
				//BEAUTY: 20
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 20
				race.set_stat_max(FPalaceHelper.cha_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 10, FPalaceHelper.torso_slot);
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 15));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				dwarfRace = race;
			}
			
			return dwarfRace;
		}
		
		public static Race race_goblin(){
			if(goblinRace == null){
				Race race = new Race();
				race.set_name("goblin");
				
				race.new_stat(FPalaceHelper.stat_skin_colour());
				
				race.set_aging_mod(0.3);
				race.set_bonus(FPalaceHelper.wis_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,2, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.5, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.4, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.min_lust_id,20,FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.skin_colour_id,0.3);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced goblin, </noun> </sd"+FPalaceHelper.skin_colour_id+"> skin and pointy ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.goblin_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,outputStrings[1]);
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.goblin_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.goblin_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.skin_colour_id+"> flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.goblin_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth skinned and </sd"+FPalaceHelper.skin_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.goblin_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.skin_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.goblin_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.skin_colour_id+"> skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.goblin_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"rough </sd"+FPalaceHelper.skin_colour_id+"> flesh, it's head flared and conical. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.goblin_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.goblin_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.goblin_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.goblin_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.skin_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.goblin_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.goblin_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.goblin_clit_1_img);
				
				race.new_female_name_set(new String[]{"Vagloh", "Loklo", "Ampa", "Zugnook", "Chogasa"});
				race.new_male_name_set(new String[]{"Chub", "Zig", "Floort"});
				race.new_surname_set(new String[]{""});				
				//STR: 22	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);				
				//DEX: 22	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				//BEAUTY: 23
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				//INT: 28
				race.set_stat_max(FPalaceHelper.int_id, 14, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 14, FPalaceHelper.torso_slot);
				//WIS: 18
				race.set_stat_max(FPalaceHelper.wis_id, 9, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 9, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 3));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				goblinRace = race;
			}
			
			return goblinRace;
		}
		
		public static Race race_orc(){
			if(orcRace == null){
				Race race = new Race();
				race.set_name("orc");
				
				race.new_stat(FPalaceHelper.stat_skin_colour());
				
				race.set_aging_mod(0.7);
				race.set_bonus(FPalaceHelper.cha_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.str_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.will_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,9.5, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.skin_colour_id,0.3);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced orc, </noun> </sd"+FPalaceHelper.skin_colour_id+"> skin and pointy ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.goblin_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,outputStrings[1]);
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.goblin_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.goblin_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.skin_colour_id+"> flesh excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.goblin_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth skinned and </sd"+FPalaceHelper.skin_colour_id+">. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.goblin_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.skin_colour_id+"> flesh, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.goblin_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.skin_colour_id+"> skinned teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.goblin_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"rough </sd"+FPalaceHelper.skin_colour_id+"> flesh, it's head flared and conical. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.goblin_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.goblin_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.goblin_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.goblin_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.skin_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.goblin_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.skin_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.goblin_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.goblin_clit_1_img);
				
				race.new_female_name_set(new String[]{"Vagloh", "Loklo", "Ampa", "Zugnook", "Chogasa"});
				race.new_male_name_set(new String[]{"Chub", "Zig", "Floort"});
				race.new_surname_set(new String[]{""});
				//STR: 26	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX: 22	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 27	
				race.set_stat_max(FPalaceHelper.con_id, 4, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEAUTY: 17
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 0.5, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 0.5, FPalaceHelper.feet_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 26
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.torso_slot);
				//CHA: 17
				race.set_stat_max(FPalaceHelper.cha_id, 8.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 8.5, FPalaceHelper.torso_slot);
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 3));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				orcRace = race;
			}
			
			return orcRace;
		}
		
		public static Race race_anthro_feline(){
			if(anthroFelinRace == null){
				Race race = new Race();
				race.set_name("feline");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.7);
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,6, FPalaceHelper.eyes_slot);				
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.breast_size_id, -1, FPalaceHelper.breasts_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,0.5, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,0.5, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.5, FPalaceHelper.arms_slot);				
				race.set_bonus(FPalaceHelper.max_lust_id,-1);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.3, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				
				race.set_skill_bonus(FPalace_skills.covert_id, 5, FPalaceHelper.feet_slot);
				//STR: 17	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.hands_slot);
				//DEX: 29	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEAUTY: 28
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 17
				race.set_stat_max(FPalaceHelper.int_id, 8.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 8.5, FPalaceHelper.torso_slot);
				//WIS: 20
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 24
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced feline, </noun> triangular ears darting from sound to sound, and short </sd"+FPalaceHelper.fur_colour_id+"> fur covering everything except a small pink triangle of a nose. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.feline_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark slit-like pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.feline_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.feline_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur that doesn't fail to show </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.feline_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.feline_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a long, sharp looking claw. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.feline_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"furry </sd"+FPalaceHelper.fur_colour_id+"> teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.feline_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"bright red flesh, and covered in spines. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.feline_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered by a fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.feline_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"taunt, </sd"+FPalaceHelper.fur_colour_id+">, and fuzzy. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.feline_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.feline_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.feline_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.feline_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.feline_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long fuzzy length of </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.feline_tail_1_img);
				
				race.new_female_name_set(new String[]{"Misty","Tiffany","Angel","Lily","Amber","Ellie","Molly","Winnie","Sienna","Kiki","Kiara","Ayla","Maisy","Nikita","Emma","Sophie","Chloe","Vicky"});
				race.new_male_name_set(new String[]{"Max","Rex","Don","Dave","Napoleon","Peter","Toby","Oliver","Leo","Milo","Tigger", "Ace", "Aaron", "Duncan", "Simba", "Felix", "Loki", "Ash", "Gus", "Tommy"});
				race.new_surname_set(new String[]{"Kitty", "Aegean", "Mau", "Bengal", "Bombay", "Birman", "Burmilla", "Chantilly", "Chartreux", "Foldex", "Javanese", "Khao", "Korat","Raas","Selkirk","Sphynx"});
				
				CharAction a3 = new CharAction();
					a3.setName("Cat Claws");
					a3.set_attack_flag();
					a3.set_attack_description("Strike a single opponent with your claws. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Cat Claws");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.slash_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> slashes </n> with </noun2> claws. ",0,0,1);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n> has a bloody three lined gash left in </noun> skin. ",2);
						consequence2.addConsequence(0,0, "</n2> futily slashes with </noun2> claws. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				
				race.new_attack(a3, FPalaceHelper.hands_slot);
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 4));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroFelinRace = race;
			}
			
			return anthroFelinRace;
		}
		
		public static Race race_anthro_canine(){
			if(anthroCanineRace == null){
				Race race = new Race();
				race.set_name("canine");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.6);
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.wis_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.breast_size_id, -1, FPalaceHelper.breasts_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.3, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				//STR: 28	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.hands_slot);
				//DEX: 29	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.feet_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 23
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);				
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 16
				race.set_stat_max(FPalaceHelper.int_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 8, FPalaceHelper.torso_slot);
				//WIS: 16
				race.set_stat_max(FPalaceHelper.wis_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 8, FPalaceHelper.torso_slot);
				//WILL: 21
				race.set_stat_max(FPalaceHelper.will_id, 10.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 10.5, FPalaceHelper.torso_slot);
				//CHA: 24
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced canine, </noun> triangular ears darting from sound to sound, and short </sd"+FPalaceHelper.fur_colour_id+"> fur covering everything except a dark triangle of a nose that rests on a snout. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.canine_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark wide friendly pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.canine_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.canine_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur that doesn't fail to show </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.canine_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.canine_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a short dull claw. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.canine_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> furry teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.canine_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"bright red with a thick knot at its base. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.canine_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered by a fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.canine_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"taunt and fuzzy. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.canine_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.canine_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.canine_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.canine_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.canine_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long fuzzy length of </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.canine_tail_1_img);
				
				race.new_female_name_set(new String[]{"Angel"});
				race.new_male_name_set(new String[]{"Rex"});
				race.new_surname_set(new String[]{""});
				
				CharAction a3 = new CharAction();
					a3.setName("Bite");
					a3.set_attack_flag();
					a3.set_attack_description("Bite an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Bite");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> bites </n>! ",0,0,1);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> tears out a hunk of </n>s flesh! ",2);
						consequence2.addConsequence(0,0, "</n2> futily gnashes at air. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.head_slot);
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 4));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroCanineRace = race;
			}
			
			return anthroCanineRace;
		}
		
		public static Race race_anthro_fox(){
			if(anthroFoxRace == null){
				Race race = new Race();
				race.set_name("vulpe");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.6);
				race.set_bonus(FPalaceHelper.int_id,2, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.wis_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.5, FPalaceHelper.arms_slot);
				//STR: 17	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.hands_slot);
				//DEX: 23	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 23
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);				
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 28
				race.set_stat_max(FPalaceHelper.int_id, 14, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 14, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced vulpe, </noun> triangular ears darting from sound to sound, and short </sd"+FPalaceHelper.fur_colour_id+"> fur covering everything except a dark triangle of a nose that rests on a snout. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.canine_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark wide friendly pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.canine_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.canine_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur that doesn't fail to show </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.canine_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.canine_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a short dull claw. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.canine_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> furry teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.canine_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"bright red with a thick knot at its base. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.canine_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered by a fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.canine_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"taunt and fuzzy. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.canine_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.canine_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.canine_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.canine_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.canine_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long fuzzy length of </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.canine_tail_1_img);
				
				race.new_female_name_set(new String[]{"Angel"});
				race.new_male_name_set(new String[]{"Rex"});
				race.new_surname_set(new String[]{""});
				
				CharAction a3 = new CharAction();
					a3.setName("Bite");
					a3.set_attack_flag();
					a3.set_attack_description("Bite an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Bite");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-2, "</n2> bites </n>! ",0,0,1);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> tears out a hunk of </n>s flesh! ",6);
						consequence2.addConsequence(0,0, "</n2> futily gnashes at air. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.head_slot);
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 4));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroFoxRace = race;
			}
			
			return anthroFoxRace;
		}
		
		
		
		public static Race race_anthro_penguin(){
			if(anthroPenguinRace == null){
				Race race = new Race();
				race.set_name("sphenis");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.7);
				race.set_bonus(FPalaceHelper.will_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.dex_id,-0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.dex_id,-0.5, FPalaceHelper.legs_slot);
				
				race.add_status_immunity(TickEffect.lactating_status);
				//STR: 22	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX: 14	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 27
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				//INT: 25
				race.set_stat_max(FPalaceHelper.int_id, 12.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 12.5, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 25
				race.set_stat_max(FPalaceHelper.will_id, 12.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 12.5, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced sphenis, with small ears, and short </sd"+FPalaceHelper.fur_colour_id+"> feathers covering everything except a long pointed beak. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.mouse_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.mouse_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.mouse_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> feathers that doesn't fail to show </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.mouse_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> feathers. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.mouse_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"strange lengths of flipper. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.mouse_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"feathered </sd"+FPalaceHelper.fur_colour_id+"> teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.mouse_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"bright red flesh. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.mouse_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered by a fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.mouse_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"taunt and fuzzy. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.mouse_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.mouse_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> feathers that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.mouse_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"webbed. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.mouse_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.mouse_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a short </sd"+FPalaceHelper.fur_colour_id+"> tail feather that covers </noun> rump. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.mouse_tail_1_img);
				
				race.new_female_name_set(new String[]{"Misty"});
				race.new_male_name_set(new String[]{"Peter"});
				race.new_surname_set(new String[]{"Penguin"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 6));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroPenguinRace = race;
			}
			
			return anthroPenguinRace;
		}
		
		public static Race race_anthro_seal(){
			if(anthroSealRace == null){
				Race race = new Race();
				race.set_name("pinnip");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.7);
				race.set_bonus(FPalaceHelper.wis_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,1, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.25, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.25, FPalaceHelper.legs_slot);
				
				//STR: 17	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.hands_slot);
				//DEX: 22	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 25	
				race.set_stat_max(FPalaceHelper.con_id, 4, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 23		
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 26
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced pinnip, with small ears, and short, tough </sd"+FPalaceHelper.fur_colour_id+"> skin covering everything except a small black nose. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.mouse_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.mouse_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.mouse_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> tough skin that doesn't fail to show </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.mouse_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> skin. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.mouse_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"strange lengths of flipper. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.mouse_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"feathered </sd"+FPalaceHelper.fur_colour_id+"> teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.mouse_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"bright red flesh. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.mouse_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered by a fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.mouse_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"taunt and fuzzy. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.mouse_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.mouse_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> skin that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.mouse_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"webbed. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.mouse_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.mouse_clit_1_img);
				
				race.new_female_name_set(new String[]{"Misty"});
				race.new_male_name_set(new String[]{"Peter"});
				race.new_surname_set(new String[]{"Seal"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 6));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				anthroSealRace = race;
			}
			
			return anthroSealRace;
		}
		
		public static Race race_anthro_mouse(){
			if(anthroMouseRace == null){
				Race race = new Race();
				race.set_name("mouse");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.7);
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,17, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.height_id,-6, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.5, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				
				race.set_skill_bonus(FPalace_skills.covert_id, 2, FPalaceHelper.feet_slot);
				//STR: 20	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX: 30	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hands_slot);
				//CON: 20	
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 25
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 20
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.torso_slot);
				//WILL: 20
				race.set_stat_max(FPalaceHelper.will_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 10, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced mouse, </noun> triangular ears darting from sound to sound, short </sd"+FPalaceHelper.fur_colour_id+"> fur covering everything except a small pink triangle of a nose. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.mouse_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.mouse_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.mouse_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur that doesn't fail to show </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.mouse_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.mouse_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered flesh. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.mouse_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"furry </sd"+FPalaceHelper.fur_colour_id+"> teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.mouse_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"bright red flesh. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.mouse_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered by a fuzzy </sd"+FPalaceHelper.fur_colour_id+"> sack. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.mouse_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"taunt and fuzzy. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.mouse_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.mouse_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.mouse_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of pink flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.mouse_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.mouse_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long length of pink flesh. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.mouse_tail_1_img);
				
				race.new_female_name_set(new String[]{"Misty"});
				race.new_male_name_set(new String[]{"Max"});
				race.new_surname_set(new String[]{"Mouse"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 4));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroMouseRace = race;
			}
			
			return anthroMouseRace;
		}
		
		public static Race race_anthro_bovine(){
			if(anthroBovineRace == null){
				Race race = new Race();
				race.set_name("bovine");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.int_id,-2, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,6, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.height_id,1, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.dex_id,-0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.hands_slot);
				race.set_bonus(FPalaceHelper.height_id,1, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.dex_id,-0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.feet_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.breasts_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,-0.05, FPalaceHelper.vag_slot);
				
				race.set_bonus(FPalaceHelper.semen_fertility_id,-0.01, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.height_id,3, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.height_id,2, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.breast_size_id, 3, FPalaceHelper.breasts_slot);
				race.set_bonus(FPalaceHelper.milk_volume_id, 675, FPalaceHelper.breasts_slot);
				race.set_bonus(FPalaceHelper.vaginal_depth_id, 24, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.vaginal_width_id, 8, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.penis_length_id, 24, FPalaceHelper.cock_slot);//3 feet long errect, 2 feet flaccid
				race.set_bonus(FPalaceHelper.penis_girth_id, 8, FPalaceHelper.cock_slot);//just 1 inch around
				race.set_bonus(FPalaceHelper.erection_ratio_id,-0.2, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.balls_size_id, 3, FPalaceHelper.balls_slot);//Should be 11 inches around
				race.set_bonus(FPalaceHelper.max_lust_id,-2);
				//STR: 33	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 4, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hands_slot);
				//DEX: 13	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 28
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.horn_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.udder_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				//INT: 15
				race.set_stat_max(FPalaceHelper.int_id, 7.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 7.5, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 24
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.torso_slot);				
							
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced bovine, </noun> smooth </sd"+FPalaceHelper.fur_colour_id+"> fur and floppy ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.bovine_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with circular irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.bovine_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.bovine_hair_1_img);
				race.add_part_description(FPalaceHelper.horn_slot,"pearly white protrussions of bone. ");
				race.add_part_image(FPalaceHelper.horn_slot, FPalaceHelper.bovine_horns_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.fur_colour_id+"> fur excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.bovine_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth </sd"+FPalaceHelper.fur_colour_id+"> fur with splotches of different colours. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.bovine_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.bovine_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> furry teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.bovine_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth brown flesh, it's length tapered, and it's head flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.bovine_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in wrinkly </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.bovine_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.bovine_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.bovine_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.fur_colour_id+"> fur that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.bovine_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.bovine_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.bovine_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long slender length of </sd"+FPalaceHelper.fur_colour_id+"> fur that ends in a tuff of hair. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.bovine_tail_1_img);
				race.add_part_description(FPalaceHelper.udder_slot,"a large pink bulge with four large nipples. ");
				race.add_part_image(FPalaceHelper.udder_slot, FPalaceHelper.bovine_udder_1_img);
				
				race.new_female_name_set(new String[]{"Bess","Jayne","Jyll","Wande","Virginia","Kalee","Hayleigh","Danalee","Elvira","Belle","Beverlee", "Pandora"});
				race.new_male_name_set(new String[]{"Highball", "Dillinger", "Blueberry", "Bones", "Hammer", "Slim", "Apollo", "Rock"});
				race.new_surname_set(new String[]{"Abigar","Baoule","Heffer","Braunvieh","Camargue","Caracu","Corsica","Devon","Ennstal","Fleckvieh"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				race.add_part(FPalaceHelper.new_horns(race), 1);
				race.add_part(FPalaceHelper.new_udder(race), 1, FPalaceHelper.sex_female().name);
				race.add_part(FPalaceHelper.new_udder(race), 1, FPalaceHelper.sex_herm().name);
				race.add_part(FPalaceHelper.new_udder(race), 1, FPalaceHelper.sex_futa().name);
				anthroBovineRace = race;
			}
			
			return anthroBovineRace;
		}
		
		public static Race race_anthro_deer(){
			if(anthroDeerRace == null){
				Race race = new Race();
				race.set_name("cervida");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.eye_colour_id,6, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.con_id,1, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.wis_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.str_id,-0.5, FPalaceHelper.arms_slot);
				//STR: 17	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1.5, FPalaceHelper.hands_slot);
				//DEX: 23	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 27	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 24
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.tail_slot);		
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.horn_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 20
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.torso_slot);
				//WIS: 26
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 13, FPalaceHelper.torso_slot);
				//WILL: 20
				race.set_stat_max(FPalaceHelper.will_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 10, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);				
							
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced cervida, </noun> smooth </sd"+FPalaceHelper.fur_colour_id+"> fur and floppy ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.cervine_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with circular irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.cervine_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.cervine_hair_1_img);
				race.add_part_description(FPalaceHelper.horn_slot,"pearly white protrussions of bone. ");
				race.add_part_image(FPalaceHelper.horn_slot, FPalaceHelper.cervine_horns_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.fur_colour_id+"> fur excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.cervine_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"smooth </sd"+FPalaceHelper.fur_colour_id+"> fur with splotches of different colours. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.cervine_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.cervine_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> furry teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.cervine_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth brown flesh, it's length tapered, and it's head flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.cervine_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in wrinkly </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.cervine_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm taunt </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.cervine_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.cervine_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.fur_colour_id+"> fur that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.cervine_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.cervine_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.cervine_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long slender length of </sd"+FPalaceHelper.fur_colour_id+"> fur that ends in a tuff of hair. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.cervine_tail_1_img);
				
				race.new_female_name_set(new String[]{"Bess","Jayne","Jyll","Wande","Virginia","Kalee","Hayleigh","Danalee","Elvira","Belle","Beverlee", "Pandora"});
				race.new_male_name_set(new String[]{"Highball", "Dillinger", "Blueberry", "Bones", "Hammer", "Slim", "Apollo", "Rock"});
				race.new_surname_set(new String[]{"Abigar","Baoule","Heffer","Braunvieh","Camargue","Caracu","Corsica","Devon","Ennstal","Fleckvieh"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				race.add_part(FPalaceHelper.new_horns(race), 1);
				anthroDeerRace = race;
			}
			
			return anthroDeerRace;
		}
		
		public static Race race_anthro_equine(){
			if(anthroEquineRace == null){
				Race race = new Race();
				race.set_name("equine");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.will_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.arms_slot);				
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.legs_slot);
				
				race.set_bonus(FPalaceHelper.eye_colour_id,6, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.height_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.height_id,6, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.height_id,3, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.height_id,6, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.height_id,2, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.penis_length_id, 12, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.penis_girth_id, 4, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.cum_volume_id, 125, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.erection_ratio_id,-0.2, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.cum_volume_id, 125, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.balls_size_id, 2, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,-0.05, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,-0.01, FPalaceHelper.cock_slot);				
				race.set_bonus(FPalaceHelper.max_lust_id,-2);
				//STR: 31	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hands_slot);
				//DEX: 23	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 23
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				//INT: 20
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 10, FPalaceHelper.torso_slot);
				//WIS: 20
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 10, FPalaceHelper.torso_slot);
				//WILL: 9
				race.set_stat_max(FPalaceHelper.will_id, 9, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 9, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);				
							
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced equine, </noun> smooth </sd"+FPalaceHelper.fur_colour_id+"> fur and twitchy ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.equine_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with circular irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.equine_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.equine_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.fur_colour_id+"> fur excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.equine_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.equine_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.equine_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> furry teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.equine_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pink flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.equine_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.equine_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm and lightly furred. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.equine_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.equine_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.equine_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"a length of </sd"+FPalaceHelper.fur_colour_id+"> fur that end in hooves. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.equine_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.equine_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long a tuff of hair. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.equine_tail_1_img);
				
				race.new_female_name_set(new String[]{"Bella","Adobe","Brandy","Autumn","Fiona","Pippi","Rapunzel","Lacey","Bonney","Misty","Dolly","Isabelle","Juliet","Henrietta"});
				race.new_male_name_set(new String[]{"Adam","Chad","Steve","Cleveland","Opie","Peter","Russel","Napoleon","Monte","Dale","Charlie","Olaf","Randolph"});
				race.new_surname_set(new String[]{"Stallion", "Pony","Abaco","Berger","Alban","Altai","Boerp","Clydesdale","Banker","Henson","Falabella","Lokai","Marwari","Pampa"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				
				anthroEquineRace = race;
			}
				
			return anthroEquineRace;
		}
		
		public static Race race_anthro_donkey(){
			if(anthroDonkeyRace == null){
				Race race = new Race();
				race.set_name("equidae");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.will_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.cha_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,1, FPalaceHelper.breasts_slot);
				
				race.set_bonus(FPalaceHelper.eye_colour_id,6, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.penis_length_id, 10, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.penis_girth_id, 4, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.cum_volume_id, 250, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.erection_ratio_id,-0.2, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.cum_volume_id, 250, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.balls_size_id, 4, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,-0.05, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.str_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.max_lust_id,-2);
				//STR: 28	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.hands_slot);
				//DEX: 23	
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				//BEA: 26
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 16
				race.set_stat_max(FPalaceHelper.int_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 8, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 26
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.torso_slot);
				//CHA: 16
				race.set_stat_max(FPalaceHelper.cha_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 8, FPalaceHelper.torso_slot);
											
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced equidae, </noun> smooth </sd"+FPalaceHelper.fur_colour_id+"> fur and twitchy ears marking </objnoun> as such. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.equidae_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"dark pupils, with circular irises that fill the rest ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.equidae_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.equidae_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.fur_colour_id+"> fur excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.equidae_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.equidae_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> fur, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.equidae_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> furry teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.equidae_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pink flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.equidae_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.equidae_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"firm and lightly furred. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.equidae_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.equidae_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.equidae_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of fuzzy </sd"+FPalaceHelper.fur_colour_id+"> flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.equidae_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.equidae_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long a tuff of hair. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.equidae_tail_1_img);
				
				race.new_female_name_set(new String[]{"Bella", "Jenny", "Jubilee", "Muriel", "Cora", "Pixie"});
				race.new_male_name_set(new String[]{"Duncan", "Jack", "Noah", "Herbert", "Jacob", "Oscar", "Bogart"});
				race.new_surname_set(new String[]{"Donkey", "Byssin", "Geria", "Merijack", "Anatoli", "Ane", "Bourbon", "Cotent", "Normand", "Berry", "Wallon"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroDonkeyRace = race;
			}
			
			return anthroDonkeyRace;
		}
		
		public static Race race_anthro_bee(){
			if(anthroBeeRace == null){
				Race race = new Race();
				race.set_name("Apini");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.eye_colour_id,20, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.will_id,-1, FPalaceHelper.head_slot);
				
				race.add_status_immunity(TickEffect.lactating_status);
				//STR: 22	
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.wings_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.str_id, 1, FPalaceHelper.abdomen_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);				
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				//DEX: 31	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.wings_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.abdomen_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 22	
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.wings_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.con_id, 3, FPalaceHelper.abdomen_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1, FPalaceHelper.hands_slot);
				//BEA: 22
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.wings_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.abdomen_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 7, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.int_id, 7, FPalaceHelper.thorax_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 7, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 7, FPalaceHelper.thorax_slot);
				//WILL: 16
				race.set_stat_max(FPalaceHelper.will_id, 6, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.will_id, 5, FPalaceHelper.thorax_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 8, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 7, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 7, FPalaceHelper.thorax_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced apini, </noun> black antenna twitching about above </noun> </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.bee_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"large gem like orbs ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.bee_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.bee_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.fur_colour_id+"> and black fuzzy stripes excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.bee_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"</sd"+FPalaceHelper.fur_colour_id+"> and black fuzzy stripes. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.bee_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in black fuzz, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.bee_hand_1_img);
				race.add_part_description(FPalaceHelper.wings_slot,"nearly translucent. ");
				race.add_part_image(FPalaceHelper.wings_slot, FPalaceHelper.bee_wing_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> and black fuzzy striped teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.bee_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pale flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.bee_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in hair ridden </sd"+FPalaceHelper.fur_colour_id+"> fur. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.bee_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> and black fuzzy stripes. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.bee_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.bee_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight pitch black fuzzy hide that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.bee_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"sharp black fuzz covered tips. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.bee_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.bee_clit_1_img);
				race.add_part_description(FPalaceHelper.thorax_slot,"</sd"+FPalaceHelper.fur_colour_id+"> and black fuzzy striped hide with. ");
				race.add_part_image(FPalaceHelper.thorax_slot, FPalaceHelper.bee_thorax_1_img);
				race.add_part_description(FPalaceHelper.abdomen_slot,"a large </sd"+FPalaceHelper.fur_colour_id+"> and black bulb tipped with a single needle in the rear. ");
				race.add_part_image(FPalaceHelper.abdomen_slot, FPalaceHelper.bee_abdomen_1_img);
				
				race.new_female_name_set(new String[]{"Honee","Beatrice","Deborah"});
				race.new_male_name_set(new String[]{"Ben","Doug","Steve","Buzz","Ned"});
				race.new_surname_set(new String[]{"Bee", "Carniola", "Caucasi", "Buckfast", "Starline"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 2));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_wings(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_thorax(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_abdomen(race), 1);
				
				anthroBeeRace = race;
			}
							
			return anthroBeeRace;
		}
		
		public static Race race_anthro_lizard(){
			if(anthroLizardRace == null){
				Race race = new Race();
				race.set_name("caudata");
				
				race.new_stat(FPalaceHelper.stat_scale_colour());
				
				race.set_aging_mod(1.2);
				race.set_bonus(FPalaceHelper.cha_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,1, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.7, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				
				race.add_status_immunity(TickEffect.lactating_status);
				//STR: 22	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX: 23	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 1, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 28
				race.set_stat_max(FPalaceHelper.con_id, 4, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 4, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.hands_slot);
				//BEAUTY: 22	
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 0.5, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 0.5, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);				
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 22
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 18
				race.set_stat_max(FPalaceHelper.cha_id, 9, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 9, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced caudata, </noun> </sd"+FPalaceHelper.scale_colour_id+"> scaled face and holes for nose and ears featured prominantly around </noun> mouth. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.lizard_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"large gem like orbs ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.lizard_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.lizard_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scales excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.lizard_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"scaled. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.lizard_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.scale_colour_id+"> scales, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.lizard_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scaled teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.lizard_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pale flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.lizard_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"scaled. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.lizard_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scaled hide. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.lizard_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.lizard_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.scale_colour_id+"> scaled hide that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.lizard_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.scale_colour_id+"> scaled flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.lizard_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.lizard_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long a trunk of </sd"+FPalaceHelper.scale_colour_id+"> scaled flesh. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.lizard_tail_1_img);
				
				race.new_female_name_set(new String[]{"Elle","Abby","Aja","Beanie","Cleo","Eki","Ishi","Jade","Kirra"});
				race.new_male_name_set(new String[]{"Iggy","Chuck","Gila","Dino","Gorn","Spike","Rex","Sobek","Abel","Darvarus","Draco"});
				race.new_surname_set(new String[]{"Salamander","Gecko","Tegu","Skink","Basilisk","Walla","Uromastyx","Gargoyle"});
				
				TickEffect tf = new TickEffect();
				tf.set_status_id(TickEffect.pregnant_status);
				tf.set_end_tick(FPGameGithub.T1_MONTH);
				ItemConsequence iconsequence = new ItemConsequence();
				iconsequence.add_item_reward(FPalace_items.caudata_egg(),0);
				iconsequence.addConsequence(FPalaceHelper.bloat_id,-2, "</n> struggles and pushes, but finally lays an egg. ", 0,1);
				
				tf.set_end_consequence(iconsequence);
				
				Consequence consequence = new Consequence();
				consequence.addConsequence(FPalaceHelper.bloat_id,0.3, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
				for(int count= FPGameGithub.T1_DAY*6;count<FPGameGithub.T1_MONTH;count+= FPGameGithub.T1_DAY*6){
					tf.set_tick_consequence(count,consequence);
				}
							
				race.set_preg_type(Race.egg_pregnancy);
				race.set_preg_effect(tf);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				anthroLizardRace = race;
			}
			return anthroLizardRace;
		}
		
		public static Race race_anthro_frog(){
			if(anthroFrogRace == null){
				Race race = new Race();
				race.set_name("anura");
				
				race.new_stat(FPalaceHelper.stat_scale_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.cha_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.dex_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.wis_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.con_id,-1, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.7, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.05, FPalaceHelper.balls_slot);
				
				race.add_status_immunity(TickEffect.lactating_status);
				
				race.set_bonus(FPalaceHelper.height_id,-3, FPalaceHelper.arms_slot);
				race.set_bonus(FPalaceHelper.height_id,-3, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.height_id,-3, FPalaceHelper.hips_slot);
				race.set_bonus(FPalaceHelper.height_id,-3, FPalaceHelper.legs_slot);
				//STR: 22	
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				//DEX: 26	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.hands_slot);				
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2.5, FPalaceHelper.feet_slot);
				//CON: 17	
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 1.5, FPalaceHelper.hands_slot);
				//BEAUTY: 22
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				//INT: 22
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 11, FPalaceHelper.torso_slot);
				//WIS: 24
				race.set_stat_max(FPalaceHelper.wis_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 12, FPalaceHelper.torso_slot);
				//WILL: 22
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				//CHA: 24
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 12, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced anura, </noun> </sd"+FPalaceHelper.scale_colour_id+"> scaled face and holes for nose and ears featured prominantly around </noun> mouth. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.frog_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"large gem like orbs ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.frog_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.frog_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scales excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.frog_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"scaled. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.frog_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.scale_colour_id+"> scales, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.frog_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scaled teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.frog_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pale flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.frog_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"scaled. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.frog_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scaled hide. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.frog_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.frog_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.scale_colour_id+"> scaled hide that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.frog_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"five toes and a length of </sd"+FPalaceHelper.scale_colour_id+"> scaled flesh. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.frog_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.frog_clit_1_img);
				
				race.new_female_name_set(new String[]{"Elle","Abby","Aja","Beanie","Cleo","Eki","Ishi","Jade","Kirra"});
				race.new_male_name_set(new String[]{"Iggy","Chuck","Gila","Dino","Gorn","Spike","Rex","Sobek","Abel","Darvarus","Draco"});
				race.new_surname_set(new String[]{"Salamander","Gecko","Tegu","Skink","Basilisk","Walla","Uromastyx","Gargoyle"});
				
				TickEffect tf = new TickEffect();
				tf.set_status_id(TickEffect.pregnant_status);
				tf.set_end_tick(FPGameGithub.T1_MONTH);
				ItemConsequence iconsequence = new ItemConsequence();
				iconsequence.add_item_reward(FPalace_items.caudata_egg(),0);
				iconsequence.addConsequence(FPalaceHelper.bloat_id,-2, "</n> struggles and pushes, but finally lays an egg. ", 0,1);
				
				tf.set_end_consequence(iconsequence);
				
				Consequence consequence = new Consequence();
				consequence.addConsequence(FPalaceHelper.bloat_id,0.3, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
				for(int count= FPGameGithub.T1_DAY*6;count<FPGameGithub.T1_MONTH;count+= FPGameGithub.T1_DAY*6){
					tf.set_tick_consequence(count,consequence);
				}
							
				race.set_preg_type(Race.egg_pregnancy);
				race.set_preg_effect(tf);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 1);
				race.add_part(FPalaceHelper.new_left_feet(race), 1);
				race.add_part(FPalaceHelper.new_right_legs(race), 1);
				race.add_part(FPalaceHelper.new_right_feet(race), 1);
				
				anthroFrogRace = race;
			}
			return anthroFrogRace;
		}
		
		public static Race race_anthro_fish(){
			if(anthroFishRace == null){
				Race race = new Race();
				race.set_name("actino");
				
				race.new_stat(FPalaceHelper.stat_scale_colour());
				
				race.set_aging_mod(0.4);
				race.set_bonus(FPalaceHelper.dex_id,-1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.will_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.int_id,1, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.7, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.1, FPalaceHelper.balls_slot);
				
				race.add_status_immunity(TickEffect.lactating_status);
				//STR: 21	
				race.set_stat_max(FPalaceHelper.str_id, 5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 6, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2.5, FPalaceHelper.hands_slot);
				//DEX: 16	
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 2, FPalaceHelper.hands_slot);
				//CON: 21	
				race.set_stat_max(FPalaceHelper.con_id, 6, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 5, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2.5, FPalaceHelper.hands_slot);
				//BEAUTY: 22
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.tail_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 2, FPalaceHelper.hair_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);				
				//INT: 28
				race.set_stat_max(FPalaceHelper.int_id, 14, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 14, FPalaceHelper.torso_slot);
				//WIS: 23
				race.set_stat_max(FPalaceHelper.wis_id, 11.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11.5, FPalaceHelper.torso_slot);
				//WIL: 26
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 13, FPalaceHelper.torso_slot);
				//CHA: 22
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 11, FPalaceHelper.torso_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced Actino, </noun> </sd"+FPalaceHelper.scale_colour_id+"> scaled face and holes for nose and ears featured prominantly around </noun> mouth. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.fish_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"large gem like orbs ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.fish_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.fish_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scales excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.fish_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"scaled. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.fish_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.scale_colour_id+"> scales, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.fish_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scaled teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.fish_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth pale flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.fish_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"scaled. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.fish_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"</sd"+FPalaceHelper.scale_colour_id+"> scaled hide. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.fish_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.fish_vag_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.fish_clit_1_img);
				race.add_part_description(FPalaceHelper.tail_slot,"a long a trunk of </sd"+FPalaceHelper.scale_colour_id+"> scaled flesh that ends in a fin. ");
				race.add_part_image(FPalaceHelper.tail_slot, FPalaceHelper.fish_tail_1_img);
				
				race.new_female_name_set(new String[]{"Ariel"});
				race.new_male_name_set(new String[]{"Enki"});
				race.new_surname_set(new String[]{"Marbenlar"});
				
				TickEffect tf = new TickEffect();
				tf.set_status_id(TickEffect.pregnant_status);
				tf.set_end_tick(FPGameGithub.T1_WEEK*2);
				ItemConsequence iconsequence = new ItemConsequence();
				iconsequence.add_item_reward(FPalace_items.actino_egg(),0);
				iconsequence.addConsequence(FPalaceHelper.bloat_id,-2, "</n> struggles and pushes, but finally lays an egg. ", 0,1);
				
				tf.set_end_consequence(iconsequence);
				
				Consequence consequence = new Consequence();
				consequence.addConsequence(FPalaceHelper.bloat_id,0.3, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
				for(int count= FPGameGithub.T1_DAY*6;count<FPGameGithub.T1_WEEK*2;count+= FPGameGithub.T1_DAY*6){
					tf.set_tick_consequence(count,consequence);
				}
							
				race.set_preg_type(Race.egg_pregnancy);
				race.set_preg_effect(tf);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				
				anthroFishRace = race;
			}
							
			return anthroFishRace;
		}
		
		public static Race race_anthro_spider(){
			if(anthroSpiderRace == null){
				Race race = new Race();
				race.set_name("arachnid");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.8);
				race.set_bonus(FPalaceHelper.cha_id,-0.5, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.cha_id,-0.5, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,-0.5, FPalaceHelper.head_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,-0.5, FPalaceHelper.torso_slot);
				race.set_bonus(FPalaceHelper.sex_appeal_id,-0.25, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.eye_colour_id,20, FPalaceHelper.eyes_slot);
				race.set_bonus(FPalaceHelper.dex_id,0.5, FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,0.7, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,0.1, FPalaceHelper.balls_slot);
				
				race.set_skill_bonus(FPalace_skills.covert_id, 5, FPalaceHelper.feet_slot);
				
				race.add_status_immunity(TickEffect.lactating_status);
				
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.str_id, 2, FPalaceHelper.abdomen_slot);
				
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.dex_id, 3, FPalaceHelper.abdomen_slot);
					
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.con_id, 2, FPalaceHelper.abdomen_slot);
				
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.arms_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.hands_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.hips_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.legs_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.feet_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.thorax_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1, FPalaceHelper.abdomen_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.breasts_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.vag_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.clit_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.cock_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.balls_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.eyes_slot);
				race.set_stat_max(FPalaceHelper.sex_appeal_id, 1.5, FPalaceHelper.hair_slot);				
				
				race.set_stat_max(FPalaceHelper.int_id, 12, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.int_id, 12, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.int_id, 12, FPalaceHelper.thorax_slot);
				
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.wis_id, 11, FPalaceHelper.thorax_slot);
				
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.will_id, 11, FPalaceHelper.thorax_slot);
				
				race.set_stat_max(FPalaceHelper.cha_id, 7, FPalaceHelper.head_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 7, FPalaceHelper.torso_slot);
				race.set_stat_max(FPalaceHelper.cha_id, 7, FPalaceHelper.thorax_slot);
				
				race.add_part_description(FPalaceHelper.head_slot,"cheery faced arachnid, </noun> </sd"+FPalaceHelper.fur_colour_id+"> chitnanous hide and eight eyes mildly disturbing. ");
				race.add_part_image(FPalaceHelper.head_slot, FPalaceHelper.spider_head_1_img);
				race.add_part_description(FPalaceHelper.eyes_slot,"large gem like orbs ");
				race.add_part_image(FPalaceHelper.eyes_slot, FPalaceHelper.spider_eyes_1_img);
				race.add_part_description(FPalaceHelper.hair_slot,outputStrings[2]);
				race.add_part_image(FPalaceHelper.hair_slot, FPalaceHelper.spider_hair_1_img);
				race.add_part_description(FPalaceHelper.torso_slot,"</sd"+FPalaceHelper.fur_colour_id+"> chitnanous hide excentuating </noun> form. ");
				race.add_part_image(FPalaceHelper.torso_slot, FPalaceHelper.spider_torso_1_img);
				race.add_part_description(FPalaceHelper.arms_slot,"</sd"+FPalaceHelper.fur_colour_id+"> chitnanous hide. ");
				race.add_part_image(FPalaceHelper.arms_slot, FPalaceHelper.spider_arm_1_img);
				race.add_part_description(FPalaceHelper.hands_slot,"five fingers covered in </sd"+FPalaceHelper.fur_colour_id+"> chiten, every finger tipped with a translucent nail. ");
				race.add_part_image(FPalaceHelper.hands_slot, FPalaceHelper.spider_hand_1_img);
				race.add_part_description(FPalaceHelper.breasts_slot,"</sd"+FPalaceHelper.fur_colour_id+"> scaled teardrops atop </noun> torso, each topped with a pert pink nipple. ");
				race.add_part_image(FPalaceHelper.breasts_slot, FPalaceHelper.spider_breasts_1_img);
				race.add_part_description(FPalaceHelper.cock_slot,"smooth </sd"+FPalaceHelper.fur_colour_id+"> flesh, it's head flared and flat. ");
				race.add_part_image(FPalaceHelper.cock_slot, FPalaceHelper.spider_penis_1_img);
				race.add_part_description(FPalaceHelper.balls_slot,"covered in </sd"+FPalaceHelper.fur_colour_id+"> fuzz. ");
				race.add_part_image(FPalaceHelper.balls_slot, FPalaceHelper.spider_balls_1_img);
				race.add_part_description(FPalaceHelper.hips_slot,"</sd"+FPalaceHelper.fur_colour_id+"> chitnanous hide. ");
				race.add_part_image(FPalaceHelper.hips_slot, FPalaceHelper.spider_hips_1_img);
				race.add_part_description(FPalaceHelper.vag_slot,"a set of cute, pert lips that fold on one another like flower pettles. ");
				race.add_part_image(FPalaceHelper.vag_slot, FPalaceHelper.spider_vag_1_img);
				race.add_part_description(FPalaceHelper.legs_slot,"straight </sd"+FPalaceHelper.fur_colour_id+"> chitnanous hide that bend forward at the knee. ");
				race.add_part_image(FPalaceHelper.legs_slot, FPalaceHelper.spider_leg_1_img);
				race.add_part_description(FPalaceHelper.feet_slot,"sharp </sd"+FPalaceHelper.fur_colour_id+"> scale covered tips. ");
				race.add_part_image(FPalaceHelper.feet_slot, FPalaceHelper.spider_foot_1_img);
				race.add_part_description(FPalaceHelper.clit_slot,"a pink pearl shapped nub. ");
				race.add_part_image(FPalaceHelper.clit_slot, FPalaceHelper.spider_clit_1_img);
				race.add_part_description(FPalaceHelper.thorax_slot,"</sd"+FPalaceHelper.fur_colour_id+"> chitanous hide with an occasional hair sticking from it. ");
				race.add_part_image(FPalaceHelper.thorax_slot, FPalaceHelper.spider_thorax_1_img);
				race.add_part_description(FPalaceHelper.abdomen_slot,"a large </sd"+FPalaceHelper.fur_colour_id+"> bulb tipped with two needles in the rear. ");
				race.add_part_image(FPalaceHelper.abdomen_slot, FPalaceHelper.spider_abdomen_1_img);
				
				race.new_female_name_set(new String[]{"Alystin", "Baltana", "Chandara"});
				race.new_male_name_set(new String[]{"Alton", "Balok", "Chakos"});
				race.new_surname_set(new String[]{"Abaeir", "Drider"});
				
				TickEffect tf = new TickEffect();
				tf.set_status_id(TickEffect.pregnant_status);
				tf.set_end_tick(FPGameGithub.T1_MONTH);
				ItemConsequence iconsequence = new ItemConsequence();
				iconsequence.add_item_reward(FPalace_items.arachnid_egg(),0);
				iconsequence.addConsequence(FPalaceHelper.bloat_id,-2, "</n> struggles and pushes, but finally lays an egg. ", 0,1);
				
				tf.set_end_consequence(iconsequence);
				
				Consequence consequence = new Consequence();
				consequence.addConsequence(FPalaceHelper.bloat_id,0.3, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
				for(int count= FPGameGithub.T1_DAY*6;count<FPGameGithub.T1_MONTH;count+= FPGameGithub.T1_DAY*6){
					tf.set_tick_consequence(count,consequence);
				}
							
				race.set_preg_type(Race.egg_pregnancy);
				race.set_preg_effect(tf);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_torso(race), 1);
				race.add_part(FPalaceHelper.new_left_arms(race), 1);
				race.add_part(FPalaceHelper.new_right_arms(race), 1);
				race.add_part(FPalaceHelper.new_left_hands(race), 1);
				race.add_part(FPalaceHelper.new_right_hands(race), 1);
				race.add_part(FPalaceHelper.new_hips(race), 1);
				race.add_part(FPalaceHelper.new_thorax(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 4);
				race.add_part(FPalaceHelper.new_left_feet(race), 4);
				race.add_part(FPalaceHelper.new_right_legs(race), 4);
				race.add_part(FPalaceHelper.new_right_feet(race), 4);
				race.add_part(FPalaceHelper.new_abdomen(race), 1);
				anthroSpiderRace = race;
			}
						
			return anthroSpiderRace;
		}
		
		public static Race race_sexsnake(){
			if(sexsnakeRace == null){
				Race race = new Race();
				race.set_anthropomorphic();
				race.set_name("sexsnake");
				race.set_aging_mod(0.15);
				race.set_bonus(FPalaceHelper.dex_id,1);
				race.set_bonus(FPalaceHelper.wis_id,1);
				race.set_bonus(FPalaceHelper.int_id,-3);
				race.set_bonus(FPalaceHelper.max_lust_id,-20);
				race.new_female_name_set(new String[]{"Vag"});
				race.new_male_name_set(new String[]{"Cock"});
				race.new_surname_set(new String[]{"Snake"});
				
				TickEffect tf = new TickEffect();
				tf.set_status_id(TickEffect.pregnant_status);
				tf.set_end_tick(FPGameGithub.T1_WEEK);
				ItemConsequence iconsequence = new ItemConsequence();
				iconsequence.add_item_reward(FPalace_items.sexsnake_egg(),0);
				iconsequence.addConsequence(FPalaceHelper.bloat_id,-2, "</n> struggles and pushes, but finally lays an egg. ", 0,1);
				
				tf.set_end_consequence(iconsequence);
				
				Consequence consequence = new Consequence();
				consequence.addConsequence(FPalaceHelper.bloat_id,0.1, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
				
				for(int count = FPGameGithub.T1_DAY;count<FPGameGithub.T1_WEEK;count+= FPGameGithub.T1_DAY){
					tf.set_tick_consequence(count,consequence);
				}
							
				race.set_preg_type(Race.egg_pregnancy);
				race.set_preg_effect(tf);
				sexsnakeRace = race;
			}
			return sexsnakeRace;
		}
		
		public static Race race_scorpion(){
			if(scorpionRace == null){
				Race race = new Race();
				race.set_anthropomorphic();
				race.set_name("scorpion");
				race.set_aging_mod(0.15);
				race.set_bonus(FPalaceHelper.dex_id,1);
				race.set_bonus(FPalaceHelper.str_id,1);
				race.set_bonus(FPalaceHelper.int_id,-3);
				
				race.set_bonus(FPalaceHelper.height_id,-20,FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.height_id,-5,FPalaceHelper.head_slot);
								
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Scorpion"});
				
				
				CharAction a3 = new CharAction();
					a3.setName("Sting");
					a3.set_attack_flag();
					a3.set_attack_description("Sting an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Sting");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						
						TickEffect tf = new TickEffect();
						tf.set_status_id(TickEffect.poisoned_status);
						Consequence c2 = new Consequence();
						c2.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> feels </noun> blood pulsing. ", 0);
						tf.set_tick_consequence(3, c2);
						tf.set_end_tick(21);
						
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-2, "</n2> stings </n>! ",0,0,0,-1,false,tf);
						consequence2.addConsequence(0,0, "</n2> tail strikes into the ground. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.tail_slot);
				
				
				tf = new TickEffect();
				tf.set_status_id(TickEffect.pregnant_status);
				tf.set_end_tick(FPGameGithub.T1_WEEK);
				ItemConsequence iconsequence = new ItemConsequence();
				iconsequence.add_item_reward(FPalace_items.scorpion_egg(),0);
				iconsequence.addConsequence(FPalaceHelper.bloat_id,-2, "</n> struggles and pushes, but finally lays an egg. ", 0,1);
				
				tf.set_end_consequence(iconsequence);
				
				Consequence consequence = new Consequence();
				consequence.addConsequence(FPalaceHelper.bloat_id,0.1, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
				for(int count = FPGameGithub.T1_DAY;count<FPGameGithub.T1_WEEK;count+= FPGameGithub.T1_DAY){
					tf.set_tick_consequence(count,consequence);
				}
							
				race.set_preg_type(Race.egg_pregnancy);
				race.set_preg_effect(tf);
				scorpionRace = race;
			}
			return scorpionRace;
		}
		
		public static Race race_horse(){
			if(horseRace == null){
				Race race = new Race();
				race.set_anthropomorphic();
				race.set_name("horse");
				
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.5);
				race.set_bonus(FPalaceHelper.str_id,1);
				race.set_bonus(FPalaceHelper.wis_id,-1);
				race.set_bonus(FPalaceHelper.int_id,-5);
				race.set_bonus(FPalaceHelper.hips_id,6);
				race.set_bonus(FPalaceHelper.penis_length_id, 18, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.penis_girth_id, 6, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.cum_volume_id, 125, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.erection_ratio_id,-0.2, FPalaceHelper.cock_slot);
				race.set_bonus(FPalaceHelper.cum_volume_id, 125, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.balls_size_id, 3, FPalaceHelper.balls_slot);
				race.set_bonus(FPalaceHelper.egg_fertility_id,-0.05, FPalaceHelper.vag_slot);
				race.set_bonus(FPalaceHelper.semen_fertility_id,-0.01, FPalaceHelper.cock_slot);				
				race.set_bonus(FPalaceHelper.height_id,15,FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.height_id,8,FPalaceHelper.barrel_slot);
				race.set_bonus(FPalaceHelper.height_id,8,FPalaceHelper.thighs_slot);
				
				
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Horse"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 11));
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_barrel(race), 1);
				race.add_part(FPalaceHelper.new_thighs(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 2);
				race.add_part(FPalaceHelper.new_right_legs(race), 2);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				horseRace = race;
			}
			return horseRace;
		}
		
		public static Race race_wolf(){
			if(wolfRace == null){
				Race race = new Race();
				race.set_name("wolf");
				race.set_anthropomorphic();
				race.new_stat(FPalaceHelper.stat_fur_colour());
								
				race.set_aging_mod(0.25);
				race.set_bonus(FPalaceHelper.str_id,0.5);
				race.set_bonus(FPalaceHelper.dex_id,1.5);
				race.set_bonus(FPalaceHelper.wis_id,-1);
				race.set_bonus(FPalaceHelper.int_id,-4);
				race.set_bonus(FPalaceHelper.max_lust_id,-20);
				race.set_bonus(FPalaceHelper.height_id,-11,FPalaceHelper.legs_slot);
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Wolf"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				CharAction a3 = new CharAction();
					a3.setName("Bite");
					a3.set_attack_flag();
					a3.set_attack_description("Bite an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Bite");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> bites </n>! ",0);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> tears out a hunk of </n>s flesh! ",2);
						consequence2.addConsequence(0,0, "</n2> futily gnashes at air. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.head_slot);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_barrel(race), 1);
				race.add_part(FPalaceHelper.new_thighs(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 2);
				race.add_part(FPalaceHelper.new_right_legs(race), 2);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				wolfRace = race;
			}
			return wolfRace;
		}
		
		public static Race race_reindeer(){
			if(reindeerRace == null){
				Race race = new Race();
				race.set_name("reindeer");
				race.set_anthropomorphic();
				race.new_stat(FPalaceHelper.stat_fur_colour());
								
				race.set_aging_mod(0.25);
				race.set_bonus(FPalaceHelper.str_id,0.5);
				race.set_bonus(FPalaceHelper.dex_id,1.5);
				race.set_bonus(FPalaceHelper.wis_id,-1);
				race.set_bonus(FPalaceHelper.int_id,-4);
				race.set_bonus(FPalaceHelper.max_lust_id,-20);
				race.set_bonus(FPalaceHelper.height_id,-6,FPalaceHelper.legs_slot);
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Reindeer"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				CharAction a3 = new CharAction();
					a3.setName("Charge");
					a3.set_attack_flag();
					a3.set_attack_description("Charge an opponent with your horns. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Charge");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> charges into </n> with </noun2> horns! ",0);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> manages to impale </objnoun>! ",2);
						consequence2.addConsequence(0,0, "</n2> charges past </n>. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.horn_slot);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_horns(race), 1);
				race.add_part(FPalaceHelper.new_barrel(race), 1);
				race.add_part(FPalaceHelper.new_thighs(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 2);
				race.add_part(FPalaceHelper.new_right_legs(race), 2);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				reindeerRace = race;
			}
			return reindeerRace;
		}
		
		public static Race race_hyena(){
			if(hyenaRace == null){
				Race race = new Race();
				race.set_name("hyena");
				race.set_anthropomorphic();
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.25);
				race.set_bonus(FPalaceHelper.str_id,1.5);
				race.set_bonus(FPalaceHelper.dex_id,0.5);
				race.set_bonus(FPalaceHelper.wis_id,-1);
				race.set_bonus(FPalaceHelper.int_id,-4);
				race.set_bonus(FPalaceHelper.max_lust_id,-20);
				race.set_bonus(FPalaceHelper.height_id,-13,FPalaceHelper.legs_slot);
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Hyena"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				CharAction a3 = new CharAction();
					a3.setName("Bite");
					a3.set_attack_flag();
					a3.set_attack_description("Bite an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Bite");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> bites </n>! ",0);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> tears out a hunk of </n>s flesh! ",2);
						consequence2.addConsequence(0,0, "</n2> futily gnashes at air. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.head_slot);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_barrel(race), 1);
				race.add_part(FPalaceHelper.new_thighs(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 2);
				race.add_part(FPalaceHelper.new_right_legs(race), 2);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				hyenaRace = race;
			}
			return hyenaRace;
		}
		
		public static Race race_crocodile(){
			if(crocRace == null){
				Race race = new Race();
				race.set_name("crocodile");
				race.set_anthropomorphic();
				race.new_stat(FPalaceHelper.stat_scale_colour());
				
				race.set_aging_mod(0.6);
				race.set_bonus(FPalaceHelper.str_id,1.5);
				race.set_bonus(FPalaceHelper.dex_id,0.5);
				race.set_bonus(FPalaceHelper.wis_id,-1);
				race.set_bonus(FPalaceHelper.int_id,-4);
				race.set_bonus(FPalaceHelper.max_lust_id,-20);
				race.set_bonus(FPalaceHelper.height_id,-20,FPalaceHelper.legs_slot);
				race.set_bonus(FPalaceHelper.height_id,-5,FPalaceHelper.head_slot);
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Crocodile"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				CharAction a3 = new CharAction();
					a3.setName("Bite");
					a3.set_attack_flag();
					a3.set_attack_description("Bite an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Bite");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> bites </n>! ",0);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> tears out a hunk of </n>s flesh! ",2);
						consequence2.addConsequence(0,0, "</n2> futily gnashes at air. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.head_slot);
				
				race.add_part(FPalaceHelper.new_head(race), 1);
				race.add_part(FPalaceHelper.new_barrel(race), 1);
				race.add_part(FPalaceHelper.new_thighs(race), 1);
				race.add_part(FPalaceHelper.new_left_legs(race), 2);
				race.add_part(FPalaceHelper.new_right_legs(race), 2);
				race.add_part(FPalaceHelper.new_tail(race), 1);
				crocRace = race;
			}
			return crocRace;
		}
		
		public static Race race_polar_bear(){
			if(polarRace == null){
				Race race = new Race();
				race.set_name("polar bear");
				race.set_anthropomorphic();
				race.new_stat(FPalaceHelper.stat_fur_colour());
				
				race.set_aging_mod(0.6);
				race.set_bonus(FPalaceHelper.str_id,1.5);
				race.set_bonus(FPalaceHelper.dex_id,0.5);
				race.set_bonus(FPalaceHelper.wis_id,-1);
				race.set_bonus(FPalaceHelper.int_id,-4);
				race.set_bonus(FPalaceHelper.max_lust_id,-20);
				race.new_female_name_set(new String[]{"Female"});
				race.new_male_name_set(new String[]{"Male"});
				race.new_surname_set(new String[]{"Polar Bear"});
				
				race.set_preg_effect(mamal_preg(FPGameGithub.T1_MONTH * 7));
				
				CharAction a3 = new CharAction();
					a3.setName("Bite");
					a3.set_attack_flag();
					a3.set_attack_description("Bite an opponent. ");
						Challenge challenge2 = new Challenge(true);
						challenge2.set_attack_stat(FPalace_skills.melee_id);
						challenge2.set_defense_stat(FPalace_skills.dodging_id);
						challenge2.setVariability(20);
						challenge2.setText("Bite");
						Consequence consequence2 = new Consequence();
						consequence2.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> bites </n>! ",0);
						consequence2.addConsequence(FPalaceHelper.curr_hp_id,-4, "</n2> tears out a hunk of </n>s flesh! ",2);
						consequence2.addConsequence(0,0, "</n2> futily gnashes at air. ",-1);
									
					a3.addChallenge(challenge2,consequence2);
				
				race.new_attack(a3, FPalaceHelper.head_slot);
				
				polarRace = race;
			}
			return polarRace;
		}
		
		private static TickEffect mamal_preg(int pregLength){
			TickEffect tf = new TickEffect();
			tf.set_status_id(TickEffect.pregnant_status);
			tf.set_end_tick(pregLength);
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.bloat_id,-4, "</n> struggles and pushes, but finally gives birth. ", 0,1);
			
			tf.set_end_consequence(consequence);
			
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.bloat_id,0.3, "</n> can feel the pregnancy setting in, </noun> belly bulging. ", 0,1);
			
			for(int count = pregLength/16;count<pregLength;count+= pregLength/16){
				tf.set_tick_consequence(count,consequence);
			}
			TickEffect lactateTF = new TickEffect();
			lactateTF.set_status_id(TickEffect.lactating_status);
			Challenge tfChal = new Challenge();
			tfChal.set_attack_stat(FPalaceHelper.milk_volume_id);
			tfChal.set_defense_stat(-1,250);
			tfChal.setVariability(0);
			Consequence  tfCon = new Consequence();
			tfCon.addConsequence(FPalaceHelper.breast_size_id,0.25, "</n> can feel the pregnancy setting in, </noun> breasts balooning in preparation. ", -1,1);
			lactateTF.set_tick_consequence(1,tfCon, tfChal);
			lactateTF.set_end_tick(pregLength);
			
			consequence = new Consequence();
			consequence.addConsequence(0,0,"</n> begins to lactate. ",0,0,0,-1,false,lactateTF);			
			tf.set_tick_consequence(3*pregLength/4.0,consequence);
			
			return tf;
        }
        
	}	
