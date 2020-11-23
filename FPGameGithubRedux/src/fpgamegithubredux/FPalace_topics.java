package fpgamegithubredux;

import java.util.ArrayList;
import java.util.Arrays;

public class FPalace_topics {

		public FPalace_topics() {
			// constructor code
		}
		
		
		//Need topics for the areas, races, classes, etc... also thinking of randomly generated ones for people and events, but likely pre-generated to start with
			//kinda have "gossip" started in Personality.gossip()
		//Also need topics that exist to improve/destroy character relationships... combat is the primary method right now
			//some sort of "taunt" to destroy relation?
			//Intimidate as well
				//a non-attraction based flirt... you CAN improve your relation, though it can go terribly wrong
			
		public static Conversation_topic grasslands_info(){
			Conversation_topic  ct= new Conversation_topic();
            ct.set_topic_name("area");
            
			ct.set_no_mention();
			
			ct.add_dialog("You ask </n2> about the area you're in.", Character.relations_affect_id, 5,false, Conversation_topic.ask_topic);
			
			ct.add_dialog("You ask </n2> about the area you're in",Character.relations_affect_id, 5,false, Conversation_topic.telling_topic);
			
			ct.add_dialog("</n2> begins telling you about the grasslands.",Character.relations_affect_id, 5,false, Conversation_topic.being_told_topic);
			
			return ct;
		}
			
        //...and a flirt topic to build some initial lust, and lead into the more sex oriented topics
        
		public static Conversation_topic flirt(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Flirt");
			
			CharAction a = new CharAction();
			a.setName("Flirt");
			a.set_dialogue("",0);
			Challenge challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,2, "You flirt with </n2>. ",0,0,0,1);
			consequence.addConsequence(0,0, "You flirt with </n2>, but quickly run out of things to say. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</pronoun2> is extremely receptive to your advances, and you can see </objnoun2> pining for more. ",0,0,0,-1,true);
			consequence.addConsequence(0,0, "</pronoun2> quickly takes control of the conversation. ",-1,0,0,2);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0, 0, "</n2> is terribly boring. ",0);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "it's hard not to listen to </n2>, every word interesting. ",-1);
			a.addChallenge(challenge,consequence);
			
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.attraction_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5, 5));
			ct.add_action(a, dia1, dia2,false, Conversation_topic.ask_topic);
			ct.add_action(a, dia1, dia2,false, Conversation_topic.telling_topic);
			
			a = new CharAction();
			a.setName("Flirt");
			a.set_dialogue("",0);
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,2, "</n2> begins flirting with you. ",-1,0,0,1,true);
			consequence.addConsequence(0,0, "</n2> begins flirting with you, but stutters and stalls. ",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "it's hard not to be receptive to </noun2> advances, and you can't help but pine for more. ",-1);
			consequence.addConsequence(0,0, "You can't help but take control of the conversation. ",0,0,0,2);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0, 0, "you end up boring </n2>. ",-1);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> eats up your every word. ",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			ArrayList<Integer> dia3 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.attraction_id));
			ct.add_action(a,dia3, dia2,Boolean.FALSE, Conversation_topic.being_told_topic);
			//TODO make sure this will always be the same as the earlier two add_actions
			return ct;
		}
		
		public static Conversation_topic blow_job(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Blow Jobs");
			
			CharAction a = new CharAction();
			a.setName("Blow Jobs");
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.penis_length_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,8, "You begin to look at </n2>s lips, and motion toward your groin. ",0,0,0,12);
			consequence.addConsequence(0,0, "",-1,0,0,1);//someone doesn't have a penis...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "You nonchalantly ask </n2> what they think about giving blow jobs. ",0,0,0,3);//no one here has a penis...
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You make a few suggestive motions to </n2>, a smirk on your face. ",-1,0,0,6);//asking to give a blow job...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("recieving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</pronoun2> smiles back, </noun2> face colouring. You quickly move in closer. ",0,0,0,4,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "</pronoun2> looks confused and frowns at you. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(FPalace_skills.conversing_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> seems hesitent, so you end up telling </noun2> about the last blow job you experienced. ",0,0,0,-1);
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> quickly jumps into the conversation, talking about </noun2> last blow job happily. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> seems hesitent, so you start to gently touch </objnoun2>. ",0,0,0,5,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> jumps at the opportunity, rapidly descending </noun2> face to your groin. ",-1,0,0,8);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you can feel the heat rising in </n2> and gently begin maneuvering </objnoun2> to your groin. ",0,0,0,8);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "</n2> doesn't seem to be into it at all. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you move in closer and gently fondle </n2>s groin, getting a smile in return. ",0,0,0,7,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "you approach and grasp at </n2>s groin, but </pronoun2> doesn't seem to be into it at all, flashing you a frown. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you quickly duck your head down to </n2>s groin. ",0,0,0,10,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2>s starts gently pushing your face towards </noun2> groin. ",-1,0,0,10);
			a.addChallenge(challenge,consequence);
			
			//8
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_attack_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.set_defense_stat(-1, 1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> begins to tug on </n>s coverings. ",0,0,0,9);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> stares at </n>s </sd"+FPalaceHelper.penis_length_id+"> </s"+FPalaceHelper.penis_length_id+">-inch long, </sd"+FPalaceHelper.penis_girth_id+"> thick </p"+FPalaceHelper.cock_slot+"rn> cock. ",-1,0,0,14,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> quickly helps </objnoun2> remove </noun> clothing. </n2> is left staring at </n>s </sd"+FPalaceHelper.penis_length_id+"> </s"+FPalaceHelper.penis_length_id+">-inch long, </sd"+FPalaceHelper.penis_girth_id+"> thick </p"+FPalaceHelper.cock_slot+"rn> cock.",0,0,0,14,true);
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_defense_stat(-1, 0);
			challenge.set_defense_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> stares at </n2>s </2sd"+FPalaceHelper.penis_length_id+"> </2s"+FPalaceHelper.penis_length_id+">-inch long, </2sd"+FPalaceHelper.penis_girth_id+"> thick </2p"+FPalaceHelper.cock_slot+"rn> cock.",0,0,0,13);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> begins to tug on </n2>s coverings. ",-1,0,0,11,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> quickly helps </objnoun> remove </noun2> clothing. </n> is left staring at </n2>s </2sd"+FPalaceHelper.penis_length_id+"> </2s"+FPalaceHelper.penis_length_id+">-inch long, </2sd"+FPalaceHelper.penis_girth_id+"> thick </2p"+FPalaceHelper.cock_slot+"rn> cock.",0,0,0,13);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			a.addChallenge(challenge,consequence);
			
			//12
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",0,0,0,2);//only one dick...
			consequence.addConsequence(0,0, "\n\n</c23>\n</c6>",-1);//can ask to give OR recieve a blow job...
			a.addChallenge(challenge,consequence);
			
			//13 - give blow job
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(FPalace_skills.concentration_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "You expertly move into position, giving </n2>s dick a kiss. ",0,0,0,15,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You awkwardly move about, unable to stop staring at </n2>s dick. ",-1,0,0,15,true);
			a.addChallenge(challenge,consequence);
			
			//14 - recieve blowjob
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.concentration_id);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> moves about awkwardly, reaching a hesitent finger towards your dick. ",0,0,0,16);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> eagerly moves into place, licking and fondling you expertly. ",-1,0,0,16);
			a.addChallenge(challenge,consequence);
			
			//15 - Erection checks...
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you can't help but start to fiddle with </noun2> flaccid penis. ",0,0,0,17,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you set your lips on </noun2> erect </2sd"+FPalaceHelper.penis_length_id+"> glans. ",-1,0,0,21,true);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</pronoun2> begins to lick and suck on your erect </sd"+FPalaceHelper.penis_length_id+"> glans. ",0,0,0,22);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</pronoun2> starts to grab and tug on your flaccid member. ",-1,0,0,18);
			a.addChallenge(challenge,consequence);
			
			//17 - bring it to life...
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,15);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,20, "you expertly lick </n2>s cock, breathing life into it like a pro. ",0,0,0,19,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you mostly just end up playing with it. ",-1,0,0,19,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,15);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> has a determined look on </pronoun2> face as she continues to tug on your shaft. ",0,0,0,20);
			consequence.addConsequence(FPalaceHelper.lust_id,20, "</noun2> begins to lick and suck like she was born to do it. ",-1,0,0,20);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "you give up, your work all for naught. ",0);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> comes to </noun2> erect </2sd"+FPalaceHelper.penis_length_id+"> length and you can't help but look proudly on your work. ",-1,0,0,21,true);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "Your erect </sd"+FPalaceHelper.penis_length_id+"> length on display, </n2> looks on proudly at her work. ",0,0,0,22);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</pronoun2> gives up, since you're clearly not into it. ",-1);
			a.addChallenge(challenge,consequence);
			
			//21 - blowjob proper
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,20);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.set_consume(FPalaceHelper.cum_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</pronoun2> cums a </2sd"+FPalaceHelper.cum_volume_id+"> quickly, and you chug every drop. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "your awkward blowjob leaves much to be desired, and </n2> ends up suggesting something else. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,20);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.set_consume(-FPalaceHelper.cum_volume_id);
			consequence.set_change_on_success();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2>s awkward blowjob leaves much to be desired, and you end up breaking it off. ",0,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You can't help but climax quickly, shooting a </sd"+FPalaceHelper.cum_volume_id+"> of cum, and </pronoun2> chugs every drop. ",-1,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//22 - may not want to give... check how horny
			challenge.set_attack_stat(-1,80);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(20);
			challenge.setText("receiving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "",0,0,0,2);//ok, you can have a blow job
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> turns the situation around, forcing you down to </noun2> groin! ",-1,0,0,6);//HA! I want one and you ain't stoping me!
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id, FPalaceHelper.lust_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,20,20));
			ct.add_action(a,  dia1, dia2, false, Conversation_topic.ask_topic);
			ct.add_action(a,  dia1, dia2, false, Conversation_topic.telling_topic);
			
			
			
			a = new CharAction();
			a.setName("Blow Jobs");
			a.set_dialogue("",0);
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,8, "</n2> begins to look at your lips, and motion towards </noun2> groin. ",-1,0,0,12,true);
			consequence.addConsequence(0,0, "",0,0,0,1);//someone doesn't have a penis...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.penis_length_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "</n2> begins to tell you about giving blow jobs. ",-1,0,0,3);//no one here has a penis...
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> makes a few suggestive motions to you, a smirk on </noun2> face. ",0,0,0,6,true);//asking to give a blow job...
			a.addChallenge(challenge,consequence);
			
			//2 - get blow job from player
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("recieving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "It's difficult not to smile back, and you can feel your face flush. </n2> quickly moves in closer. ",-1,0,0,4);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "It's hard to determine </noun2> intentions, and you can't help but flash a frown. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(FPalace_skills.conversing_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> seems hesitent, so you end up telling </noun2> about the last blow job you experienced. ",0,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> goes into a long drawn out tale, talking about </noun2> last blow job happily. ",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you hesitate, and </n2> starts to gently touch you. ",0,0,0,5);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you jump at the opportunity, rapidly descending your face to </noun2> groin. ",-1,0,0,8,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you can feel heat rising through your body, and </n2> begins maneuvering you to </objnoun2> groin. ",-1,0,0,8);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "It's hard to be impressed by </n2> flailing flirtations. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			//6 - give blow job to player
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> moves in closer and gently fondles your groin. It's hard not to flash </objnoun2> a smile in return. ",-1,0,0,7);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "</n2> approaches and grasps at your groin, but </pronoun2> just ends up drawing a wince from you. It's hard not to frown at </objnoun2>. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> quickly ducks </objnoun2> head down to your groin. ",0,0,0,10);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you start gently pushing </n2>s face towards your groin. ",-1,0,0,10,true);
			a.addChallenge(challenge,consequence);
			
			//8 - clothing checks
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_defense_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you begin to tug on </n2>s coverings. ",-1,0,0,9,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you stare at </n2>s </2sd"+FPalaceHelper.penis_length_id+"> </2s"+FPalaceHelper.penis_length_id+">-inch long, </2sd"+FPalaceHelper.penis_girth_id+"> thick </2p"+FPalaceHelper.cock_slot+"rn> cock. ",0,0,0,14);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you quickly help </objnoun2> remove </noun2> clothing. you are left staring at </n2>s </2sd"+FPalaceHelper.penis_length_id+"> </2s"+FPalaceHelper.penis_length_id+">-inch long, </2sd"+FPalaceHelper.penis_girth_id+"> thick </2p"+FPalaceHelper.cock_slot+"rn> cock. ",0,0,0,14);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_defense_stat(-1, 1);
			challenge.set_attack_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> stares at your </sd"+FPalaceHelper.penis_length_id+"> </s"+FPalaceHelper.penis_length_id+">-inch long, </sd"+FPalaceHelper.penis_girth_id+"> thick </p"+FPalaceHelper.cock_slot+"rn> cock.",-1,0,0,13,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> begins to tug on your coverings. ",0,0,0,11);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you quickly help </objnoun2> remove your clothing. </n2> is left staring at your </sd"+FPalaceHelper.penis_length_id+"> </s"+FPalaceHelper.penis_length_id+">-inch long, </sd"+FPalaceHelper.penis_girth_id+"> thick </p"+FPalaceHelper.cock_slot+"rn> cock.",0,0,0,13, true);
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			a.addChallenge(challenge,consequence);
			
			//12
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.penis_length_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",-1,0,0,2);//only one dick...
			consequence.addConsequence(0,0, "",0,0,0,23);//can decide to give OR recieve a blow job...
			a.addChallenge(challenge,consequence);
			
			//13 - give blow job to player
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.concentration_id);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> expertly moves into position, giving your dick a kiss. ",-1,0,0,15);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> awkwardly moves about, unable to stop staring at your dick. ",0,0,0,15);
			a.addChallenge(challenge,consequence);
			
			//14 - recieve blowjob from player
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(FPalace_skills.concentration_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you move about awkwardly, reaching a hesitent finger towards </n2>s dick. ",-1,0,0,16,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "you eagerly moves into place, licking and fondling </n2> expertly. ",0,0,0,16,true);
			a.addChallenge(challenge,consequence);
			
			//15 - Erection checks...
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> can't help but start to fiddle with your flaccid penis. ",-1,0,0,17);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> sets </noun2> lips on your erect </sd"+FPalaceHelper.penis_length_id+"> glans. ",0,0,0,21);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you begin to lick and suck on </noun2> </2sd"+FPalaceHelper.penis_length_id+"> erect glans. ",-1,0,0,22,true);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you start to grab and tug on </noun2> flaccid member. ",0,0,0,18,true);
			a.addChallenge(challenge,consequence);
			
			//17 - bring it to life...
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,15);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,20, "</n2> expertly licks your cock, breathing life into it like a pro. ",-1,0,0,19);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> mostly just end ups playing with it. ",0,0,0,19);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,15);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you set on your task with determination as you continue to tug on </pronoun2> shaft. ",-1,0,0,20, true);
			consequence.addConsequence(FPalaceHelper.lust_id,20, "you begin to lick and suck like you were born to do it. ",0,0,0,20, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> gives up, </noun2> work all for naught. ",-1);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you come to your erect </sd"+FPalaceHelper.penis_length_id+"> length and </n2> can't help but look proudly on </noun2> work. ",0,0,0,21);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2>s erect </2sd"+FPalaceHelper.penis_length_id+"> length on display, you look proudly at your work. ",-1,0,0,22,true);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,0, "you give up, since </n2> is clearly not into it. ",0);
			a.addChallenge(challenge,consequence);
			
			//21 - blowjob proper
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,20);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(-FPalaceHelper.cum_volume_id);
			consequence.set_change_on_success();
			consequence.amt_by_roll_flag();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "you climax, shooting a </sd"+FPalaceHelper.cum_volume_id+"> of cum and </pronoun2> chugs every drop. ",-1,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",-1,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</noun2> awkward blowjob leaves much to be desired, and you ends up suggesting something else. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,20);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.set_consume(FPalaceHelper.cum_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "your awkward blowjob leaves much to be desired, and </n2> ends up breaking it off. ",-1,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> climaxes quickly, shooting a </sd"+FPalaceHelper.cum_volume_id+"> of cum, and you chug every drop. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			//23 - npcs decisions...
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",-1,0,0,2);//get blow job from player
			consequence.addConsequence(0,0, "",0,0,0,6);//give blow job to player
			a.addChallenge(challenge,consequence);
			
			ct.add_action(a,  dia1, dia2, false, Conversation_topic.being_told_topic);
			//TODO make sure always same as previous two!
			return ct;
		}
		
		public static Conversation_topic drink_breast_milk(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Bountiful Bosom");
			
			CharAction a = new CharAction();
			a.setName("Bountiful Bosom");
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.breast_size_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,1, "You tell </n2> about the wonders of having breasts. ",0,0,0,8);
			consequence.addConsequence(0,0, "You ask </n2> about breasts. ",-1,0,0,1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.breast_size_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,1, "</n2> glances at </noun2> boobs before looking back to you expectantly. ",-1,0,0,2,true);
			consequence.addConsequence(0,0, "</n2> tells you how much </pronoun2> wishes there were some around. ",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(15);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You wink and smile, quickly complimenting </noun2> </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> bossom. ",0,0,0,3,true);
			consequence.addConsequence(0,0, "You fumble and find yourself fantasizing about </n2>s </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> tits. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.wis_id);
			challenge.set_defense_stat(FPalaceHelper.sex_appeal_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> returns your flirting with a quick flash and giggle. You can't help but press for more. ",0,0,0,4);
			consequence.addConsequence(FPalaceHelper.lust_id,20, "</n2> returns your advances with a quick flash and giggle. You can't help but find yourself smiling like a fool from the flash. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_equip_slot_check(FPalaceHelper.breasts_slot);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</pronoun2> acquieces to your advances, unleasing </noun2> </sd"+FPalaceHelper.breast_size_id+"> mounds and thrusting them towards you. ",0,0,0,6);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "",-1,0,0,5);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> removes an article of clothing. ",0,0,0,4);
			consequence.add_disrobe(FPalaceHelper.breasts_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "Your pressure misses the mark, earning you a wicked smile from </n2>. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//6
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,15, "You thrust your face into the freed flesh of </n2>, your hands quickly groping and earning you a moan. ",0,0,0,7,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> shoves you back as you attempt to play, choosing instead to flick her own nipples while teasing you. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);			
			challenge.set_defense_status_id(TickEffect.lactating_status);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_change_on_success();
			consequence.addConsequence(0,0, "",0);
			consequence.set_consume(FPalaceHelper.milk_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,15, "Much to your surprise, milk begins to leak from </n2>s nipples. You quickly latch on and begin to suckle, earning another moan. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//8
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.breast_size_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,1, "</n2> glances at </noun2> chest and yours before looking back to your face expectantly. ",-1,0,0,12,true);
			consequence.addConsequence(0,0, "</n2> smirks at you. ",0,0,0,9);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "You flash your </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> breasts, enticing </objnoun2>. ",0,0,0,10,true);
			consequence.addConsequence(0,0, "You press your breasts against </n2> but </pronoun2> recoils, </noun2> smirk turning into a frown. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//10
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(20);
			challenge.setText("receiving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,15, "</n2> thrusts </noun2> face into your flesh, </noun2> hands quickly groping and causing you to moan. ",0,0,0,11);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> causes you to yelp as </pronoun2> attempts to play. You end up playing with your breasts yourself. ",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_status_id(TickEffect.lactating_status);
			challenge.set_defense_stat(-1,1);			
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",-1);
			consequence.set_consume(-FPalaceHelper.milk_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,15, "Much to </n2>s surprise, milk begins to leak from your nipples. </pronoun2> quickly latches on and begin to suckle, eliciting another moan from you. ",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//12
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "You flash a smile at </n2> and press your </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> breasts against </noun2> body, whispering in </noun2> ear. ",0,0,0,13,true);
			consequence.addConsequence(0,0, "You press your breasts against </n2> but </pronoun2> recoils, </objnoun2> inquisitive look becoming a frown. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//13
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "\n\n</c6>\n</c10>\n",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id, FPalaceHelper.lust_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5, 25, 20));
			ct.add_action(a,  dia1, dia2, false, Conversation_topic.ask_topic);
			ct.add_action(a, dia1, dia2, false, Conversation_topic.telling_topic);
			
			a = new CharAction();
			a.setName("Bountiful Bosom");
			a.set_dialogue("",0);
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.breast_size_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,1, "</n2> starts talking about </noun2> breasts. ",-1,0,0,1,true);
			consequence.addConsequence(0,0, "</n2> asks you about breasts. ",0,0,0,10);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.breast_size_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,1, "</n2> glances at </noun2> chest and yours before looking back to your face expectantly. ",0,0,0,8);
			consequence.addConsequence(0,0, "",-1,0,0,2);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(15);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You wink and smile, quickly complimenting </noun2> </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> bossom. ",0,0,0,3,true);
			consequence.addConsequence(0,0, "You fumble and find yourself fantasizing about </n2>s </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> tits. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.wis_id);
			challenge.set_defense_stat(FPalaceHelper.sex_appeal_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> returns your flirting with a quick flash and giggle. You can't help but press for more. ",0,0,0,4);
			consequence.addConsequence(FPalaceHelper.lust_id,20, "</n2> returns your advances with a quick flash and giggle. You can't help but find yourself smiling like a fool from the flash. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_equip_slot_check(FPalaceHelper.breasts_slot);
			challenge.setVariability(0);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</pronoun2> acquieces to your advances, unleasing </noun2> </sd"+FPalaceHelper.breast_size_id+"> mounds and thrusting them towards you. ",0,0,0,6);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "",-1,0,0,5);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> removes an article of clothing. ",0,0,0,4);
			consequence.add_disrobe(FPalaceHelper.breasts_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "Your pressure misses the mark, earning you a wicked smile from </n2>. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//6
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,15, "You thrust your face into the freed flesh of </n2>, your hands quickly groping and earning you a moan. ",0,0,0,7,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> shoves you back as you attempt to play, choosing instead to flick her own nipples while teasing you. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);			
			challenge.set_defense_status_id(TickEffect.lactating_status);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_change_on_success();
			consequence.addConsequence(0,0, "",0);
			consequence.set_consume(FPalaceHelper.milk_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,15, "Much to your surprise, milk begins to leak from </n2>s nipples. You quickly latch on and begin to suckle, earning another moan. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//8
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "You flash a smile at </n2> and press your </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> breasts against </noun2> body, whispering in </noun2> ear. ",0,0,0,9,true);
			consequence.addConsequence(0,0, "You press your breasts against </n2> but </pronoun2> recoils, </objnoun2> inquisitive look becoming a frown. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//9
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "",0,0,0,4,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "",-1,0,0,10,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("receiving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "You flash your </sd"+FPalaceHelper.breast_size_id+"> </p"+FPalaceHelper.breasts_slot+"rn> breasts, enticing </objnoun2>. ",0,0,0,11,true);
			consequence.addConsequence(0,0, "You press your breasts against </n2> but </pronoun2> recoils, </objnoun2> smirk turning to frown. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//11
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,15, "</n2> thrusts </noun2> face into your flesh, </noun2> hands quickly groping and causing you to moan. ",0,0,0,12);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> causes you to yelp as </pronoun2> attempts to play. You end up playing with your breasts yourself. ",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_status_id(TickEffect.lactating_status);
			challenge.set_defense_stat(-1,1);			
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",-1);
			consequence.set_consume(-FPalaceHelper.milk_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,15, "Much to </n2>s surprise, milk begins to leak from your nipples. </pronoun2> quickly latches on and begin to suckle, eliciting another moan from you. ",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			
			
			ct.add_action(a,  dia1, dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic cunnalingus(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Quivering Cleft");
			
			CharAction a = new CharAction();
			a.setName("Cunnalingus");
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,8, "You begin to look at </n2>s lips, and motion toward your groin. ",0,0,0,12);
			consequence.addConsequence(0,0, "",-1,0,0,1);//someone doesn't have a vag...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "You nonchalantly ask </n2> what they think about cunnalingus. ",0,0,0,3);//no one here has a vag...
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You make a few suggestive motions to </n2>, a smirk on your face. ",-1,0,0,6);//asking to give a blow job...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("recieving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</pronoun2> smiles back, </noun2> face colouring. You quickly move in closer. ",0,0,0,4,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "</pronoun2> looks confused and frowns at you. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(FPalace_skills.conversing_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> seems hesitent, so you end up telling </noun2> about the last time you ate someone out. ",0,0,0,-1);
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> quickly jumps into the conversation, talking about the last time </noun2> ate someone out happily. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> seems hesitent, so you start to gently touch </objnoun2>. ",0,0,0,5);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> jumps at the opportunity, rapidly descending </noun2> face to your groin. ",-1,0,0,8,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you can feel the heat rising in </n2> and gently begin maneuvering </objnoun2> to your groin. ",0,0,0,8);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "</n2> doesn't seem to be into it at all. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you move in closer and gently fondle </n2>s groin, getting a smile in return. ",0,0,0,7);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "you approach and grasp at </n2>s groin, but </pronoun2> doesn't seem to be into it at all, flashing you a frown. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you quickly duck your head down to </n2>s groin. ",0,0,0,10);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2>s starts gently pushing your face towards </noun2> groin. ",-1,0,0,10,true);
			a.addChallenge(challenge,consequence);
			
			//8
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_attack_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.set_defense_stat(-1, 1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> begins to tug on </n>s coverings. ",0,0,0,9);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> stares at </n>s </sd"+FPalaceHelper.vaginal_width_id+"> </p"+FPalaceHelper.vag_slot+"rn> vulva. ",-1,0,0,14,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> quickly helps </objnoun2> remove </noun> clothing. </n2> is left staring at </n>s </sd"+FPalaceHelper.vaginal_width_id+"> </p"+FPalaceHelper.vag_slot+"rn> vulva. ",0,0,0,14);
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_defense_stat(-1, 0);
			challenge.set_defense_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> stares at </n2>s </2sd"+FPalaceHelper.vaginal_width_id+"> </2p"+FPalaceHelper.vag_slot+"rn> vulva. ",0,0,0,13,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n> begins to tug on </n2>s coverings. ",-1,0,0,11);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> quickly helps </objnoun> remove </noun2> clothing. </n> is left staring at </n2>s </2sd"+FPalaceHelper.vaginal_width_id+"> </2p"+FPalaceHelper.vag_slot+"rn> vulva. ",0,0,0,13);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			a.addChallenge(challenge,consequence);
			
			//12
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",0,0,0,2);//only one vag...
			consequence.addConsequence(0,0, "\n\n</c2>\n</c6>",-1);//can ask to give OR recieve a blow job...
			a.addChallenge(challenge,consequence);
			
			//13 - give blow job
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(FPalace_skills.concentration_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "You expertly move into position, giving </n2>s lips a kiss. ",0,0,0,15,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You awkwardly move about, unable to stop staring at </n2>s pussy. ",-1,0,0,15,true);
			a.addChallenge(challenge,consequence);
			
			//14 - recieve blowjob
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.concentration_id);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> moves about awkwardly, reaching a hesitent finger towards your lips. ",0,0,0,16);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> eagerly moves into place, licking and fondling you expertly. ",-1,0,0,16);
			a.addChallenge(challenge,consequence);
			
			//15 - Erection checks...
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you can't help but start to fiddle with </noun2> unaroused lips. ",0,0,0,17,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you set your lips on </noun2> </sd"+FPalaceHelper.vaginal_width_id+"> vulva. ",-1,0,0,21,true);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</pronoun2> begins to lick and suck on your </sd"+FPalaceHelper.vaginal_width_id+"> pussy. ",0,0,0,22);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</pronoun2> places an unsure finger on you unaroused lips. ",-1,0,0,18);
			a.addChallenge(challenge,consequence);
			
			//17 - bring it to life...
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,15);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,20, "you expertly lick </n2>s folds, breathing life into it like a pro. ",0,0,0,19,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you mostly just end up poking at it. ",-1,0,0,19,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,15);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> has a determined look on </noun2> face as </pronoun2> continues to dig </noun2> face into your groin. ",0,0,0,20);
			consequence.addConsequence(FPalaceHelper.lust_id,20, "</noun2> begins to lick and suck like </pronoun2> was born to do it. ",-1,0,0,20);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "you give up, your work all for naught. ",0);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> folds open and you can't help but look proudly on your work. ",-1,0,0,21,true);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "Your folds on display, </n2> looks on proudly at </noun2> work. ",0,0,0,22);//character is aroused
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</pronoun2> gives up, since you're clearly not into it. ",-1);
			a.addChallenge(challenge,consequence);
			
			//21 - blowjob proper
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,20);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</pronoun2> quickly orgasms. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "your awkward attempt at cunnalingus leaves much to be desired, and </n2> ends up suggesting something else. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,20);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2>s awkward attempt at cunnalingus leaves much to be desired, and you end up breaking it off. ",0,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You can't help but orgasm quickly. ",-1,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id, FPalaceHelper.lust_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5, 30,40));
			ct.add_action(a, dia1,dia2, false, Conversation_topic.ask_topic);
			ct.add_action(a, dia1,dia2, false, Conversation_topic.telling_topic);
			
			a = new CharAction();
			a.setName("Cunnalingus");
			a.set_dialogue("",0);
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,8, "</n2> begins to look at your lips, and motion towards </noun2> groin. ",-1,0,0,12,true);
			consequence.addConsequence(0,0, "",0,0,0,1);//someone doesn't have a penis...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "</n2> begins to tell you about cunnalingus. ",-1,0,0,3);//no one here has a penis...
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> makes a few suggestive motions to you, a smirk on </noun2> face. ",0,0,0,6,true);//asking to give a blow job...
			a.addChallenge(challenge,consequence);
			
			//2 - get blow job from player
			challenge = new Challenge(true);
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("recieving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "It's difficult not to smile back, and you can feel your face flush. </n2> quickly moves in closer. ",-1,0,0,4);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "It's hard to determine </noun2> intentions, and you can't help but flash a frown. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(FPalace_skills.conversing_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> seems hesitent, so you end up telling </noun2> about the last time you gave cunnalingus. ",0,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> goes into a long drawn out tale, talking about </noun2> the last time </pronoun2> ate someone out. ",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you hesitate, and </n2> starts to gently touch you. ",0,0,0,5);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you jump at the opportunity, rapidly descending your face to </noun2>s groin. ",-1,0,0,8,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 10);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you can feel heat rising through your body, and </n2> begins maneuvering you to </objnoun2> groin. ",-1,0,0,8);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "It's hard to be impressed by </n2> flailing flirtations. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			//6 - give blow job to player
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 10);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> moves in closer and gently fondles your groin. It's hard not to flash </objnoun2> a smile in return. ",-1,0,0,7);
			consequence.addConsequence(FPalaceHelper.lust_id,-2, "</n2> approaches and grasps at your groin, but </pronoun2> just ends up drawing a wince from you. It's hard not to frown at </objnoun2>. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(FPalace_skills.flirting_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> quickly ducks </objnoun2> head down to your groin. ",0,0,0,10);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you start gently pushing </n2>s face towards your groin. ",-1,0,0,10,true);
			a.addChallenge(challenge,consequence);
			
			//8 - clothing checks
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_defense_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you begin to tug on </n2>s coverings. ",-1,0,0,9,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you stare at </n2>s </2sd"+FPalaceHelper.vaginal_width_id+"> </2p"+FPalaceHelper.vag_slot+"rn> vulva. ",0,0,0,14);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you quickly help </objnoun2> remove </noun2> clothing. you are left staring at </n2>s </2sd"+FPalaceHelper.vaginal_width_id+"> </2p"+FPalaceHelper.vag_slot+"rn> vulva. ",0,0,0,14);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 0);
			challenge.set_defense_stat(-1, 1);
			challenge.set_attack_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> stares at your </sd"+FPalaceHelper.vaginal_width_id+"> </p"+FPalaceHelper.vag_slot+"rn> vulva. ",-1,0,0,13,true);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> begins to tug on your coverings. ",0,0,0,11);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1, 1);
			challenge.set_defense_stat(-1, 0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you quickly help </objnoun2> remove your clothing. </n2> is left staring at your </sd"+FPalaceHelper.vaginal_width_id+"> </p"+FPalaceHelper.vag_slot+"rn> vulva. ",0,0,0,13, true);
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			a.addChallenge(challenge,consequence);
			
			//12
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",-1,0,0,2);//only one dick...
			consequence.addConsequence(0,0, "",0,0,0,23);//can decide to give OR recieve a blow job...
			a.addChallenge(challenge,consequence);
			
			//13 - give blow job to player
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.concentration_id);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> expertly moves into position, giving your lips a kiss. ",-1,0,0,15);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> awkwardly moves about, unable to stop staring at your pussy. ",0,0,0,15);
			a.addChallenge(challenge,consequence);
			
			//14 - recieve blowjob from player
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(FPalace_skills.concentration_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you move about awkwardly, reaching a hesitent finger towards </n2>s lips. ",-1,0,0,16,true);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "you eagerly moves into place, licking and fondling </n2> expertly. ",0,0,0,16,true);
			a.addChallenge(challenge,consequence);
			
			//15 - Erection checks...
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> can't help but start to fiddle with your labia. ",-1,0,0,17);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> sets </noun2> lips on your </sd"+FPalaceHelper.vaginal_width_id+"> vulva. ",0,0,0,21);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you begin to lick and suck on </noun2> </2sd"+FPalaceHelper.vaginal_width_id+"> lips. ",-1,0,0,22,true);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you start to poke and rub on </noun2> outer lips. ",0,0,0,18,true);
			a.addChallenge(challenge,consequence);
			
			//17 - bring it to life...
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,15);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,20, "</n2> expertly licks your vulva, breathing life into it like a pro. ",-1,0,0,19);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> mostly just end up playing with it. ",0,0,0,19);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,15);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "you set on your task with determination as you continue to rub on </pronoun2> lips. ",-1,0,0,20, true);
			consequence.addConsequence(FPalaceHelper.lust_id,20, "you begin to lick and suck like you were born to do it. ",0,0,0,20, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> gives up, </noun2> work all for naught. ",-1);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "your </sd"+FPalaceHelper.vaginal_width_id+"> cunt becomes engourged and </n2> can't help but look proudly on </noun2> work. ",0,0,0,21);//character is erect
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,50);
			challenge.set_defense_stat(FPalaceHelper.lust_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2>s </2sd"+FPalaceHelper.vaginal_width_id+"> leaking lips, and you look proudly at your work. ",-1,0,0,22,true);//character is erect
			consequence.addConsequence(FPalaceHelper.lust_id,0, "you give up, since </n2> is clearly not into it. ",0);
			a.addChallenge(challenge,consequence);
			
			//21 - blowjob proper
			challenge = new Challenge(true);
			challenge.set_attack_stat(-1,20);
			challenge.set_defense_stat(FPalace_skills.blowjobs_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.set_change_on_success();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "you orgasm quickly. ",-1,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",-1,0,0,-1);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</noun2> awkward attempt leaves much to be desired, and you ends up suggesting something else. ",0,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.blowjobs_id);
			challenge.set_defense_stat(-1,20);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.amt_by_roll_flag();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "your awkward attempt leaves much to be desired, and </n2> ends up breaking it off. ",-1,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> orgasms quickly. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			//23 - npcs decisions...
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",-1,0,0,2);//get blow job from player
			consequence.addConsequence(0,0, "",0,0,0,6);//give blow job to player
			a.addChallenge(challenge,consequence);
			
			ct.add_action(a, dia1,dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic sex(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Sex");
			
			ct.add_topic_reference_by_name("Blow Jobs");
			ct.add_topic_reference_by_name("Quivering Cleft");
			
			CharAction a = new CharAction();
			a.setName("Sex");
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();//0
			challenge.set_attack_stat(FPalaceHelper.penis_length_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You move in close to </n2> with a smile. ",0,0,0,2);
			consequence.addConsequence(0,0, "",-1,0,0,1);//someone doesn't have a penis...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,15);//No dicks here...
			consequence.addConsequence(0,0, "",-1,0,0,9);//we have a dick!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,3);//Just one dick... let's see if our partner has a vag...
			consequence.addConsequence(0,0, "\n</c3>\n</c9>",-1,0,0,-1);//we have two dicks... have an option for pitching/catching
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//3
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,4);//lookin' like a dick and asshole...
			consequence.addConsequence(0,0, "</pronoun2> smiles back shyly, and snuggles close. ",-1,0,0,5);//we have both a dick and a vagina!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//4
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.anal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> suggests a <ctref0>. ",0,0,0,-1);//There just ain't no where to put this dick... head towards a blowjob
			consequence.addConsequence(0,0, "</pronoun2> gives a wink over </noun2> shoulder and begins to spoon with you. ",-1,0,0,7);//we have both a dick and a ass!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//5
			challenge.set_attack_stat(FPalaceHelper.penis_girth_id);
			challenge.set_defense_stat(FPalaceHelper.vaginal_width_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> slides </noun2> wet slit over your dick, but no amount of effort makes it look like it will fit. ",0,0,0,4);//dick ain't fittin in this pussy... try the ass.
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find your dick slipping inside </n2>s waiting pussy. ",-1,0,0,6);//It fits!			
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//6
			challenge.set_attack_stat(FPalace_skills.sex_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_impregnate(2);
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> screams and moans as you savagely fuck </noun2> brains out. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You grunt and thrust, cumming quickly. </n2> looks disappointed. ",-1,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//7
			challenge.set_attack_stat(FPalaceHelper.penis_girth_id);
			challenge.set_defense_stat(FPalaceHelper.anal_width_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> mentions <ctref0>. ",0);//dick ain't fittin... try a blowjob		
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find your dick slipping inside </n2>s waiting asshole. ",-1,0,0,8);//It fits!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//8
			challenge.set_attack_stat(FPalace_skills.sex_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(FPalaceHelper.cum_volume_id);
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> screams and moans as you savagely fuck </noun2> ass. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You grunt and thrust, cumming quickly. </n2> looks disappointed. ",-1,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//9
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("recieving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You start to grind up against </n2>. ",0,0,0,11);//we have both a dick and a vagina!
			consequence.addConsequence(0,0, "",-1,0,0,10);//lookin' like a dick and asshole...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//10
			challenge.set_attack_stat(FPalaceHelper.anal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You grind your ass up against </n2>. ",0,0,0,13);//we have both a dick and an ass!
			consequence.addConsequence(0,0, "You suggest <ctref0> might be a better idea. ",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//11
			challenge.set_attack_stat(FPalaceHelper.vaginal_width_id);
			challenge.set_defense_stat(FPalaceHelper.penis_girth_id);			
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find </n2>s dick slipping inside your waiting slit. ",0,0,0,12);//It fits!
			consequence.addConsequence(FPalaceHelper.lust_id,0, "you slide your wet slit over </n2>s dick, but no amount of effort makes it look like it will fit. ",-1,0,0,10);//dick ain't fittin... try anal			
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//12
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.sex_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_impregnate();
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You screams and moan as </n2> savagely fucks your brains out. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> grunts and thrusts, but the whole affair is disappointing. ",-1);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//13
			challenge.set_attack_stat(FPalaceHelper.anal_width_id);
			challenge.set_defense_stat(FPalaceHelper.penis_girth_id);			
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find </n2>s dick slipping inside your waiting ass. ",0,0,0,14);//It fits!
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You suggest <ctref0> might be a better idea. ",-1,0,0,-1);//dick ain't fittin.
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//14
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.sex_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(-FPalaceHelper.cum_volume_id);
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You screams and moan as </n2> savagely fucks your ass. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> grunts and thrusts, but the whole affair is disappointing. ",-1);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//15
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,17);//no vag...
			consequence.addConsequence(0,0, "",-1,0,0,16);//one vagina...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//16
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,18);//two vagina! Lesbian sex!
			consequence.addConsequence(0,0, "It isn't long before </n2> mentions </noun2> <ctref1>.",-1,0,0,-1);//one vagina...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//17
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find yourself mentioning your <ctref1>. ",0,0,0,-1);//just one vagina...
			consequence.addConsequence(0,0, "You're left a little confused how to have sex without genitals. ",-1,0,0,-1);//no sex parts...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//18
			challenge.set_attack_stat(FPalace_skills.sex_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> screams and moans as you grind your groin against </noun2>. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You find yourself climaxing quickly as your grind your lips against </n2>s. </n2> looks disappointed. ",-1,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id, FPalaceHelper.lust_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5, 50, 50));
			ct.add_action(a, dia1,dia2, false, Conversation_topic.ask_topic);
			ct.add_action(a, dia1,dia2, false, Conversation_topic.telling_topic);
			
			a = new CharAction();
			a.setName("Sex");
			a.set_dialogue("",0);
			challenge = new Challenge();//0
			challenge.set_attack_stat(FPalaceHelper.penis_length_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> moves in close to you with a smile. ",0,0,0,2);
			consequence.addConsequence(0,0, "",-1,0,0,1);//someone doesn't have a penis...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,15);//No dicks here...
			consequence.addConsequence(0,0, "</n2> moves in close to you with a smile. ",-1,0,0,9);//we have a dick!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.penis_length_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,3);//Just one dick... let's see if our partner has a vag...
			consequence.addConsequence(0,0, "\n</c3>\n</c9>",-1,0,0,-1);//we have two dicks... have an option for pitching/catching
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//3
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("giving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,4);//lookin' like a dick and asshole...
			consequence.addConsequence(0,0, "</pronoun2> smiles and begins to snuggle close. ",-1,0,0,5);//we have both a dick and a vagina!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//4
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.anal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> suggests a <ctref0>. ",0,0,0,-1);//There just ain't no where to put this dick... head towards a blowjob
			consequence.addConsequence(0,0, "</pronoun2> gives a wink over </noun2> shoulder and begins to spoon with you. ",-1,0,0,7);//we have both a dick and a ass!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//5
			challenge.set_attack_stat(FPalaceHelper.penis_girth_id);
			challenge.set_defense_stat(FPalaceHelper.vaginal_width_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> slides </noun2> wet slit over your dick, but no amount of effort makes it look like it will fit. ",0,0,0,4);//dick ain't fittin in this pussy... try the ass.
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find your dick slipping inside </n2>s waiting pussy. ",-1,0,0,6);//It fits!			
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//6
			challenge.set_attack_stat(FPalace_skills.sex_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_impregnate(2);
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> screams and moans as you savagely fuck </noun2> brains out. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You grunt and thrust, cumming quickly. </n2> looks disappointed. ",-1,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//7
			challenge.set_attack_stat(FPalaceHelper.penis_girth_id);
			challenge.set_defense_stat(FPalaceHelper.anal_width_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> mentions <ctref0>. ",0);//dick ain't fittin... try a blowjob		
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find your dick slipping inside </n2>s waiting asshole. ",-1,0,0,8);//It fits!
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//8
			challenge.set_attack_stat(FPalace_skills.sex_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(FPalaceHelper.cum_volume_id);
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> screams and moans as you savagely fuck </noun2> ass. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You grunt and thrust, cumming quickly. </n2> looks disappointed. ",-1,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//9
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("recieving");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You start to grind up against </n2>. ",0,0,0,11);//we have both a dick and a vagina!
			consequence.addConsequence(0,0, "",-1,0,0,10);//lookin' like a dick and asshole...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//10
			challenge.set_attack_stat(FPalaceHelper.anal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You grind your ass up against </n2>. ",0,0,0,13);//we have both a dick and an ass!
			consequence.addConsequence(0,0, "You suggest <ctref0> might be a better idea. ",-1,0,0,-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//11
			challenge.set_attack_stat(FPalaceHelper.vaginal_width_id);
			challenge.set_defense_stat(FPalaceHelper.penis_girth_id);			
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find </n2>s dick slipping inside your waiting slit. ",0,0,0,12);//It fits!
			consequence.addConsequence(FPalaceHelper.lust_id,0, "you slide your wet slit over </n2>s dick, but no amount of effort makes it look like it will fit. ",-1,0,0,10);//dick ain't fittin... try anal			
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//12
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.sex_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_impregnate();
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You screams and moan as </n2> savagely fucks your brains out. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> grunts and thrusts, but the whole affair is disappointing. ",-1);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//13
			challenge.set_attack_stat(FPalaceHelper.anal_width_id);
			challenge.set_defense_stat(FPalaceHelper.penis_girth_id);			
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.add_disrobe(FPalaceHelper.hips_slot,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find </n2>s dick slipping inside your waiting ass. ",0,0,0,14);//It fits!
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You suggest <ctref0> might be a better idea. ",-1,0,0,-1);//dick ain't fittin.
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//14
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalace_skills.sex_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(-FPalaceHelper.cum_volume_id);
			consequence.set_always_change();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You screams and moan as </n2> savagely fucks your ass. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> grunts and thrusts, but the whole affair is disappointing. ",-1);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//15
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(FPalaceHelper.vaginal_depth_id);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,17);//no vag...
			consequence.addConsequence(0,0, "",-1,0,0,16);//one vagina...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//16
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,18);//two vagina! Lesbian sex!
			consequence.addConsequence(0,0, "It isn't long before </n2> mentions </noun2> <ctref1>.",-1,0,0,-1);//one vagina...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//17
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "It isn't long before you find yourself mentioning your <ctref1>. ",0,0,0,-1);//just one vagina...
			consequence.addConsequence(0,0, "You're left a little confused how to have sex without genitals. ",-1,0,0,-1);//no sex parts...
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//18
			challenge.set_attack_stat(FPalace_skills.sex_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> screams and moans as you grind your groin against </noun2>. You twine together as your climaxes strike simultaneously. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "",0);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You find yourself climaxing quickly as your grind your lips against </n2>s. </n2> looks disappointed. ",-1,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-5, "",0);
			a.addChallenge(challenge,consequence);
			
			ct.add_action(a, dia1,dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic topic_linty_art(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Lintys artwork");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("Tell tale");
			a.set_dialogue("You want to see my artwork?\n\n</c0>\n</c1>");
			
			Challenge challenge = new Challenge(true);
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("Yes");
			Consequence consequence = new Consequence();
			consequence.addConsequence(0,0, "<img id="+FPalaceHelper.unknown_img+"/><img id="+FPalaceHelper.test_img+"/>",0,0,0,-1, true);
			consequence.addConsequence(0,0, "",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5, 0));
			ct.add_action(a, dia1,dia2, false, Conversation_topic.telling_topic);
			ct.add_action(a, dia1,dia2, false, Conversation_topic.ask_topic);
			ct.add_action(a, dia1,dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic topic_help(Quest q){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Help");
			ct.set_no_spread();
			ct.add_topic_reference_by_name("area");
			
			CharAction a = new CharAction();
			a.setName("Tell tale");
			a.set_dialogue("Do you need something?\n\n</c0>\n</c1>");
			
			Challenge challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(20);
			challenge.setText("Tell about arrival");
			Consequence consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "You elequently tell the story of your arrival to this strange place. </n2> Seems intrigued by your story.",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-2, "</n2> looks incredulous as you do your best to relay the strange details of your journey.",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,2);
			challenge.setVariability(20);
			challenge.setText("Ask where you are");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,3, "</n2> does </noun2> best to describe the <ctref0>, though it doesn't sound </c2>. ",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-1, "</n2> laughs at you for not knowing.",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.wis_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(5);
			challenge.setText("familiar");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,0, "You start to tell </n2> about where you're from. ",0,0,0,3, true);
			consequence.addConsequence(Character.relations_affect_id,0, "You can't bring yourself to interupt </n2> as </pronoun2> describes the <ctref0>. ",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,15);
			challenge.set_defense_stat(FPalaceHelper.int_id);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence  qconsequence= new Quest_Consequence();
			qconsequence.addConsequence(Character.relations_affect_id,0, "Unfortunately it doesn't seem familiar to </objnoun2>. </n2> suggests finding someone smarter. ",0,0,0,-1, true);
			qconsequence.addConsequence(Character.relations_affect_id,0, "</n2> suggests looking for Century City. ",-1,0,0,-1, true);
			qconsequence.set_change_on_success();
			qconsequence.set_quest(q,1);
			a.addChallenge(challenge,qconsequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(Character.relations_affect_id,FPalaceHelper.int_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(0,5));
			ct.add_action(a, dia1, dia2, false, Conversation_topic.telling_topic);
			ct.add_action(a, dia1, dia2, false, Conversation_topic.ask_topic);
									
			a = new CharAction();
			a.setName("Party join");
			a.set_dialogue("Hello </n>. What do you need help with?\n\n</c0>\n</c1>");
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
			challenge.set_defense_stat(FPalaceHelper.wis_id);
			challenge.setVariability(20);
			challenge.setText("Will you join my quest?");
			consequence = new Consequence();
			//consequence.join_party();
			//TODO
			consequence.addConsequence(0,0, "</n2> moves closer and touches your arm as </pronoun2> wanders by, smiling in agreement to your proposition. </pronoun2> takes up position following you.",0);
			consequence.addConsequence(0,0, "</n2> has somehow taken affront to your request and turns away.",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,2);
			challenge.setVariability(20);
			challenge.setText("Ask where you are");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,3, "</n2> does </noun2> best to describe the <ctref0>, though it doesn't sound </c2>. ",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-1, "</n2> laughs at you for not knowing.",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.wis_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(5);
			challenge.setText("familiar");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,0, "You start to tell </n2> about where you're from. ",0,0,0,3, true);
			consequence.addConsequence(Character.relations_affect_id,0, "You can't bring yourself to interupt </n2> as </pronoun2> describes the <ctref0>. ",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,15);
			challenge.set_defense_stat(FPalaceHelper.int_id);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.addConsequence(Character.relations_affect_id,0, "Unfortunately it doesn't seem familiar to </objnoun2>. </n2> suggests finding someone smarter. ",0,0,0,-1, true);
			qconsequence.addConsequence(Character.relations_affect_id,0, "</n2> suggests looking for Century City. ",-1,0,0,-1, true);
			qconsequence.set_change_on_success();
			qconsequence.set_quest(q,1);
			a.addChallenge(challenge,qconsequence);
			dia2 = new ArrayList<>(Arrays.asList(25,0));
			ct.add_action(a,dia1, dia2, false, Conversation_topic.ask_topic);
			
			//need a 'party leave' action
			a = new CharAction();
			a.setName("Party leave");
			a.set_dialogue("Hello </n>. What do you need help with?\n\n</c0>\n</c1>");
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("Will you leave my party?");
			consequence = new Consequence();
			//consequence.leave_party();
			//TODO
			consequence.addConsequence(0,0, "</n2> moves closer and touches your arm as </pronoun2> agrees. </pronoun2> stops following you.",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,2);
			challenge.setVariability(20);
			challenge.setText("Ask where you are");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,3, "</n2> appologizes profusely, explaining </pronoun2> doesn't entirely know either.",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-1, "</n2> laughs at you for not knowing.",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			dia1 = new ArrayList<>(Arrays.asList(Character.relations_affect_id));
			dia2 = new ArrayList<>(Arrays.asList(-10));
			ct.add_action(a, dia1, dia2, true, Conversation_topic.ask_topic);
			return ct;
		}
		
		public static Conversation_topic topic_amazon_excursion(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("The Excursion");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("Talk");
			a.set_dialogue("We sent some of our own </c1>. I hope it isn't a </c2>.");
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("take you there");
			RoomConsequence rconsequence = new RoomConsequence();
			rconsequence.addConsequence(FPalaceHelper.lust_id,0, "\"OK, but I hope you don't regret this\" </pronoun2> says before striking you over the head. It seems like sometime has passed, but you're not sure.",0);
			rconsequence.set_move_area(0);//FPalace_area_id
			a.addChallenge(challenge,rconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("abroad");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "Yes, to a far-away palace. I can </c0> if you like.",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("disaster");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "All of our previous excursions to the mainland have ended poorly. I can only hope they find the ring.",0);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));
			ct.add_action(a,dia1, dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic topic_amazon_homeland(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Homeland");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("Talk");
			a.set_dialogue("You know we're not from around </c2>. Would you like to know about my </c1>?");
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("take you there");
			RoomConsequence rconsequence = new RoomConsequence();
			rconsequence.addConsequence(FPalaceHelper.lust_id,0, "\"OK, but I hope you don't regret this\" </pronoun2> says before striking you over the head. It seems like sometime has passed, but you're not sure.",0);
			rconsequence.set_move_area(18);//amazon_island_area_id
			a.addChallenge(challenge,rconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("home");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "We come from an island, a ways away. I can </c0> if you like.",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("here");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "\"Why are we here? That's a secret.\" </pronoun2> says with a smile.",0);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));
			ct.add_action(a, dia1, dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic topic_wicked_grin(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Wicked Grin");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("Talk");
			a.set_dialogue("</n2> stares at you with a sloppy grin.\n\n</c0>\n</c1>",2);
			Challenge challenge = new Challenge(true);//0
			challenge.set_attack_stat(FPalace_skills.covert_id);
			challenge.set_defense_stat(-1,5);
			challenge.setVariability(10);
			challenge.setText("approach");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You calmly </c5> </n2>. ",0);
			consequence.addConsequence(Character.relations_affect_id,-5, "You do your best, but end up startling </n2> as you approach. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//1
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("leave it alone");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You quietly back away from </n2>, unsure what to think. ",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//2
			challenge.set_attack_stat(FPalaceHelper.wis_id);
			challenge.set_defense_stat(-1,12);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "\n</c3>\n</c4>",0);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "\n</c4>",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//3
			challenge.set_attack_stat(FPalace_skills.people_id);
			challenge.set_defense_stat(-1,5);
			challenge.setVariability(20);
			challenge.setText("smile back");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You smile back at </n2> and are surprised when </pronoun2> begins to </c5> you. ",0);
			consequence.addConsequence(Character.relations_affect_id,-1, "You smile back at </n2> but it only seems to startle </objnoun2>. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//4
			challenge.set_attack_stat(FPalace_skills.intimidating_id);
			challenge.set_defense_stat(-1,20);
			challenge.setVariability(30);
			challenge.setText("growl");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "You growl at </n2>. </pronoun2> backs down and whimpers at you.\n\n</c0>",0,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,-20, "You growl at </n2>. </pronoun2> growls back. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//5
			challenge.set_attack_stat(FPalaceHelper.cum_volume_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("approach");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> comes to a halt and you can't help but notice </noun2> gaze upon your </c7>. ",0,0,0,-1,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",-1,0,0,6);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//6
			challenge.set_attack_status_id(TickEffect.lactating_status);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "</n2> comes to a halt and you can't help but notice </noun2> gaze upon your </c11>. ",0,0,0,-1,true);
			consequence.addConsequence(Character.relations_affect_id,1, "</n2> comes to a halt and just continues to smile at you. ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//7
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,50);
			challenge.setVariability(25);
			challenge.setText("groin");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You quickly decide on what to do, suddenly returning </n2>s sloppy grin. ",0,0,0,8,true);
			consequence.addConsequence(FPalaceHelper.lust_id,1, "It takes a moment to realize what </n2> wants from you. \n\nDo you want to </c8> in </n2>? ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//8
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_equip_slot_check(FPalaceHelper.hips_slot);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("put your dick");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.hips_slot);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You pull at your clothing. ",0,0,0,8);//need to take your pants off first buddy
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",-1,0,0,9);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//9
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(-FPalaceHelper.cum_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "The insides of </n2> feel amazing, and it isn't long before you find yourself climaxing. You pull yourself free of </n2>. ",0,0,0,6);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//10
			challenge.set_attack_stat(FPalaceHelper.milk_volume_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("approach");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "",0,0,0,11,true);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "</n2> continues to smile at you. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//11
			challenge.set_attack_stat(FPalaceHelper.lust_id);
			challenge.set_defense_stat(-1,25);
			challenge.setVariability(25);
			challenge.setText("chest");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You quickly decide on what to do, suddenly returning </n2>s sloppy grin. ",0,0,0,12,true);
			consequence.addConsequence(FPalaceHelper.lust_id,1, "It takes a moment to realize what </n2> wants from you. \n\nDo you want to </c12> </n2>? ",-1,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//12
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_equip_slot_check(FPalaceHelper.breasts_slot);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("feed");
			consequence = new Consequence();
			consequence.add_disrobe(FPalaceHelper.breasts_slot);
			consequence.addConsequence(FPalaceHelper.lust_id,0, "You pull at your clothing. ",0,0,0,12);//need to take your shirt off first dear
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",-1,0,0,13);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//13
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);	
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.set_consume(-FPalaceHelper.milk_volume_id);
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "You can feel </n2> suckling, strangely tendrils pushing into your nipple. It isn't long before you find yourself climaxing. You pull yourself free of </n2>. ",0,0,0,-1,true);
			a.addChallenge(challenge,consequence);
			
			
			ct.add_action(a, Character.relations_affect_id, 0, false, Conversation_topic.being_told_topic);
			
			a = new CharAction();
			a.setName("Talk");
			a.set_dialogue("\"Hey, you're kinda sexy\", </pronoun2> says at you with a </c0>.");
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("wink");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You smile and wink back. </n2> moves closer and touches your arm as </pronoun2> wanders by. The touch tingles and has you thinking naughty </c1>. ",0);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> has somehow taken affront to your reaction to </noun2> wink, and slaps you. ",-1);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("thoughts");
			consequence = new Consequence();
			consequence.set_reward(2);//successfully talked to a girl
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> moves closer still, and begins feeling you up, spreading </noun2> goo about. It feels amazing, and you can see </objnoun2> longing for your </c2>. ",0);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> can plainly see what's in your mind, and is not impressed. </pronoun2> wanders back over just to knock you upside the head. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.cum_volume_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("embrace");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You quickly acquiesce, reaching your arms around </n2>, the texture of </noun2> lips sending shocks through your system. ",0,0,0,3);
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You quickly acquiesce, reaching your arms around </n2>, the texture of </noun2> lips sending shocks through your system. ",-1,0,0,4);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> sends a tendril to your groin, and you can feel the goop flex throughout. It isn't long before you find yourself coming to a climax. ",0,0,0,4);
			consequence.set_consume(-FPalaceHelper.cum_volume_id);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_status_id(TickEffect.lactating_status);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,5);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> sends a tendril to your chest, and you can feel the goop flex throughout. Suddenly a look of disapointment crosses </n2>s face, and </pronoun2> breaks the embrace. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.milk_volume_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,0, "",0,0,0,6);
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> sends a tendril to your chest, and you can feel the goop flex throughout. Suddenly a look of disapointment crosses </n2>s face, and </pronoun2> breaks the embrace. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,-50, "</n2> sends a tendril to your chest, and you can feel the goop flex throughout. It isn't long before you find yourself coming to a climax. ",0);
			consequence.set_consume(-FPalaceHelper.milk_volume_id);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));
			ct.add_action(a, dia1,dia2, false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic topic_fpalace_protest(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Bloody Protest");
			
			//I really need to do a check in the "being told" action here to see if the character is pro/anti the Futanari Palace... having the greeting girl or bouncers tell you this is strange, and a bunny girl or merchant? why should they care?
			CharAction a = new CharAction();
			a.setName("FPalace Protest");
			a.set_dialogue("\"There's a </c0> going on at the goo empress' palace.\" </n2> says to you.\n\n");
			
			Challenge challenge = new Challenge(true);
			challenge.set_attack_stat(-1,10);
			challenge.set_defense_stat(FPalace_skills.conversing_id);
			challenge.setVariability(20);
			challenge.setText("protest");
			Consequence consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,10, "</n2> tells you about the strange protestors outside the goo empress' palace. It's a very strange but intriguing story. ",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-5, "It's almost impossible to believes </n2>s tale of protestors hacking people to pieces. ",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,5));
			ct.add_action(a, dia1,dia2, false, Conversation_topic.being_told_topic);
			
			a = new CharAction();
			a.setName("Protest");
			a.set_dialogue("Go back! Evil and sin reside </c0>!");
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("within");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id, 5, "Yes! In that palace! Even over the pervertion of these grasslands you can still hear the </c1> in the night!",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("moans");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,5, "It's evil! Ungodly! The work of devils and demons! </c2>! </c2>!",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("Repent");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,10, "It's simple! They just have to go under <ctref0>.",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			dia2 = new ArrayList<>();
			second = new int[]{5, 5};
			for(int i : second){
			dia2.add(second[i]);
			}
			ct.add_action(a, dia1, dia2, false, Conversation_topic.being_told_topic,FPalaceHelper.get_chastity_mob());//want to set a mob alignment here...
			
			ct.add_topic_reference_by_name("The Blade");
			
			a = new CharAction();
			a.setName("Tell about the protest");
			a.set_dialogue("\"A protest? What about?\" </n2> asks upon your mention.\n\n</c0>");
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(20);
			challenge.setText("Tell about the protestors");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,10, "You tell </n2> about the strange protestors outside the goo empress' palace. </pronoun2> seems intrigued by your story.",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-5, "</n2> looks incredulous as you do your best to tell </objnoun2> about the Bloody Protest.",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			
			ct.add_action(a, dia1,dia2, false, Conversation_topic.telling_topic);
			
			return ct;
		}
		
		public static Conversation_topic topic_crazy_surgeon(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("The Blade");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("Surgeon");
			a.set_dialogue("Yes, the blade! I even pay for my </c0>!");
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("services");
			Consequence consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id, 1, "Any </c1> you want! Except the critical ones of course....",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("part");
			DynamicConsequence dconsequence = new DynamicConsequence();
			dconsequence.set_consequence_list("</n2> slashes and cuts at your body, removing your </choice>. You don't see what </pronoun2> does with it, but </c2> immediately flashes in </noun2> hand.", DynamicConsequence.list_noncrit_parts, DynamicConsequence.list_removepart);
			
			dconsequence.addConsequence(Character.relations_affect_id,1, "Any of these parts! I'll even give you 5 gold!\n",0,0,0,-1, true);
			a.addChallenge(challenge,dconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("gold");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id, 1, "You greedily grab the gold, and both of you share a smile.",0,0,0,-1, true);
			iconsequence.add_item_reward(FPalace_items.gold(5),0);
			a.addChallenge(challenge,iconsequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,15));
			ct.add_action(a, dia1,dia2,false, Conversation_topic.being_told_topic);
			ct.add_action(a, dia1,dia2,false, Conversation_topic.ask_topic);
			
			return ct;
		}
		
		//Item topics
		
		public static Conversation_topic topic_naughty_pictures(Item picture_item){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Naughty pictures");
			
			CharAction a = new CharAction();
			a.setName("naughty pictures");
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();//0
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(picture_item);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(0,0, "",0,0,0,6);//attacker has naughty pictures
			consequence.addConsequence(0,0, "",-1,0,0,1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(-1,0);
			challenge.set_defense_item(picture_item);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "</n2> shakes </noun2> head as you ask about lude images. ",0);//no one has naughty pictures
			consequence.addConsequence(0,0, "",-1,0,0,10);//defender has naughty pictures
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("give");
			ItemConsequence iconsequence= new ItemConsequence();
			iconsequence.addConsequence(0,0, "",0);//removing naughty pictures from attacker, and giving them to defender. 
			iconsequence.add_item_reward(picture_item,0,false,true,true);
			iconsequence.add_item_reward(picture_item,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "</n2> hands you a packet of pictures. ",0);
			iconsequence.add_item_reward(picture_item,0,false,false,true);
			iconsequence.add_item_reward(picture_item,0,false,true);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//4
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "</n2> starts going through </noun2> packet of pictures with you, every one a nude image, some women, some men, and some strange beyond description. ",0);//use pictures on attacker. 
			iconsequence.add_item_use(picture_item,0);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("use");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "",0);//use pictures on defender. 
			iconsequence.add_item_use(picture_item,0,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//6
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "Do you want to </c8> the pictures, or </c7> them? ",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//7
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(10);
			challenge.setText("give");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,1, "You offer the images to </n2> with a smile, and </pronoun2> happily takes them. ",0,0,0,2);
			consequence.addConsequence(Character.relations_affect_id,-1, "</n2> scoffs as </pronoun2> peeks at the pages you offer. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//8
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("use");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You move smoothly into place next to </n2>, withdrawing the images from your inventory and flipping through them with </objnoun>. ",0,0,0,5);
			consequence.addConsequence(Character.relations_affect_id,-2, "</n2> frowns at you as you hold the pictures in hand, and as you try to show them to you, she tells you to stop. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//9
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,1, "</n2> smiles as you ask, and you see </objnoun2> reach into </noun2> inventory. ",0,0,0,3,true);
			consequence.addConsequence(0,0, "</n2> looks at you for a moment before shaking <noun2> head. \"I don't know anything about that.\" </pronoun2> says explicitly. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//10
			challenge.set_attack_stat(-1,10);
			challenge.set_defense_stat(Character.relations_affect_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",0,0,0,9);
			consequence.addConsequence(0,0, "",10,0,0,11);
			consequence.addConsequence(0,0, "</n2> looks at you for a moment before shaking <noun2> head. \"I don't know anything about that.\" </pronoun2> says explicitly. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//11
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> smiles as you ask, and you see </objnoun2> reach into </noun2> inventory. ",0,0,0,4,true);
			consequence.addConsequence(0,0, "</n2> looks at you for a moment before shaking <noun2> head. \"I don't know anything about that.\" </pronoun2> says explicitly. ",-1);
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));						
			ct.add_action(a, dia1,dia2,false, Conversation_topic.ask_topic);
			ct.add_action(a, dia1,dia2,false, Conversation_topic.telling_topic);
			
			
			a = new CharAction();
			a.setName("naughty pictures");
			a.set_dialogue("",0);
			challenge = new Challenge();//0
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(picture_item);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "</n2> asks you about lude images. ",0,0,0,6);//attacker has naughty pictures
			consequence.addConsequence(0,0, "",-1,0,0,1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_defense_stat(-1,0);
			challenge.set_defense_item(picture_item);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "</n2> asks you about lude images. You tell </objnoun2> you don't have any. ",0);//no one has naughty pictures
			consequence.addConsequence(0,0, "</n2> starts russling about in </noun2> inventory. ",-1,0,0,10);//defender has naughty pictures
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("give");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "",0);//removing naughty pictures from attacker, and giving them to defender. 
			iconsequence.add_item_reward(picture_item,0,false,true,true);
			iconsequence.add_item_reward(picture_item,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "</n2> hands you a packet of pictures. ",0);
			iconsequence.add_item_reward(picture_item,0,false,false,true);
			iconsequence.add_item_reward(picture_item,0,false,true);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//4
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "</n2> starts going through </noun2> packet of pictures with you, every one a nude image, some women, some men, and some strange beyond description. ",0);//use pictures on attacker. 
			iconsequence.add_item_use(picture_item,0);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("use");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(0,0, "",0);//use pictures on defender. 
			iconsequence.add_item_use(picture_item,0,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//6
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "Do you want to </c8> the pictures, or </c7> them? ",0);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//7
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(10);
			challenge.setText("give");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,1, "You offer the images to </n2> with a smile, and </pronoun2> happily takes them. ",0,0,0,2);
			consequence.addConsequence(Character.relations_affect_id,-1, "</n2> scoffs as </pronoun2> peeks at the pages you offer. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//8
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(10);
			challenge.setText("use");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "You move smoothly into place next to </n2>, withdrawing the images from your inventory and flipping through them with </objnoun>. ",0,0,0,5);
			consequence.addConsequence(Character.relations_affect_id,-2, "</n2> frowns at you as you hold the pictures in hand, and as you try to show them to you, </pronoun2> tells you to stop. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//9
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,1, "</n2> smiles and withdraws a packet of images, offering them to you quickly. ",0,0,0,3,true);
			consequence.addConsequence(0,0, "</n2> looks at you for a moment before shaking </noun2> head, removing </noun2> hands from </noun2> possessions. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//10
			challenge.set_attack_stat(-1,10);
			challenge.set_defense_stat(Character.relations_affect_id);
			challenge.setVariability(10);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(0,0, "",0,0,0,9);
			consequence.addConsequence(0,0, "",10,0,0,11);
			consequence.addConsequence(0,0, "</n2> looks at you for a moment before shaking </noun2> head, removing </noun2> hands from </noun2> possessions. ",-1);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);//11
			challenge.set_attack_stat(FPalace_skills.flirting_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> smiles and you see </objnoun2> reach draw some images from their inventory. It's hard not to notice the images lude natures as you glance at them. ",0,0,0,4,true);
			consequence.addConsequence(0,0, "</n2> looks at you for a moment before shaking </noun2> head, removing </noun2> hands from </noun2> possessions. ",-1);
			a.addChallenge(challenge,consequence);
			
			ct.add_action(a, dia1,dia2,false, Conversation_topic.being_told_topic);
			
			return ct;
		}
		
		public static Conversation_topic Being_like_big_sister(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Becoming like Heidi");
			
			Item cola_item = FPalace_items.futa_cola();
            Quest get_futa_cola_quest= new Quest();
			get_futa_cola_quest.set_name("Helping out Lucy");
			get_futa_cola_quest.new_objective("Find something to help Lucy become more like her big sister Heidi. ",Quest.pick_up_action,cola_item);
			get_futa_cola_quest.new_objective("Get the cola back to Lucy. ",Quest.talk_action,null);
			get_futa_cola_quest.add_end_reward(new ArrayList<>(Arrays.asList(50)));
			get_futa_cola_quest.set_end_step(2);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(get_futa_cola_quest,1);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.set_change_on_success();
			qconsequence.set_quest(get_futa_cola_quest);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Lucy looks greedily at your inventory. ",0,0,0,1);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Lucy is lamenting her lack of a full set of equipment. She'd like to become more like her sister Heidi, and be able to help out around the farm. ",-1);
	
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(cola_item);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You smile at Lucy, and get an enormous grin in return. ",0,0,0,2);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "When she realizes you don't have anything for her, she frowns. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(get_futa_cola_quest,2);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You take a moment to get the cola out. Lucy grabs at it and greedily guzzles it down. ",0,0,0,3);
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id,40, "You watch as Lucys body changes before your eyes. As her body finally settles down, you see her staring at your body hungrily. ",0,0,0,-1,true);
			iconsequence.add_item_use(cola_item,0,false);
			iconsequence.add_item_use(cola_item,0,false);
			a.addChallenge(challenge,iconsequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));
			ct.add_action(a, dia1, dia2,false, Conversation_topic.being_told_topic);
			
			return ct;
			
		}
		
		public static Conversation_topic clearing_the_field(Quest farm_quest){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Clearing the fields");
            Character temp_char = FPalace_npcs.goo_slime().gen_char();
            
            Quest murder_slime_quest = new Quest();
            
			murder_slime_quest.set_name("Clearing the fields");
			murder_slime_quest.new_objective("Kill 5 slimes in the fields of Freedom Farms for John. ",Quest.kill_action,temp_char);
			murder_slime_quest.new_objective("Kill 4 slimes in the fields of Freedom Farms for John. ",Quest.kill_action,temp_char);
			murder_slime_quest.new_objective("Kill 3 slimes in the fields of Freedom Farms for John. ",Quest.kill_action,temp_char);
			murder_slime_quest.new_objective("Kill 2 more slimes in the fields of Freedom Farms for John. ",Quest.kill_action,temp_char);
			murder_slime_quest.new_objective("Kill just 1 more slime in the fields of Freedom Farms for John. ",Quest.kill_action,temp_char);
			murder_slime_quest.new_objective("Talk to John. ",Quest.talk_action,null);
			murder_slime_quest.add_end_reward(new ArrayList<>(Arrays.asList(50,FPalace_items.gold(10))));
			murder_slime_quest.set_end_step(6);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(murder_slime_quest,5);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.set_change_on_success();
			qconsequence.set_quest(murder_slime_quest);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John smiles at you and shakes your hand. ",0,0,0,1);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John starts complaining about the slimes that plague his fields. ",-1);
	
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(murder_slime_quest,6);
			qconsequence.set_quest(farm_quest,1);
			qconsequence.addConsequence(Character.relations_affect_id,30, "",0);
	
			a.addChallenge(challenge,qconsequence);
			
			ct.add_action(a, new ArrayList<Integer>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id)), new ArrayList<>(Arrays.asList(5, 0)),false, Conversation_topic.being_told_topic);

			return ct;			
		}
        
        
		public static Conversation_topic delivery_to_nunnery(Quest farm_quest){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Making a Delivery");
			Quest nunnery_quest= new Quest();
			nunnery_quest.set_name("Making a Delivery");
			nunnery_quest.new_objective("Deliver Johns package to the Nunnery in the mountains. ",Quest.talk_action,null);
			nunnery_quest.new_objective("Talk to John. ",Quest.talk_action,null);
			nunnery_quest.add_end_reward(new ArrayList<>(Arrays.asList(100,FPalace_items.gold(20))));
			nunnery_quest.set_end_step(2);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(nunnery_quest,1);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.set_quest(nunnery_quest,2);
			qconsequence.set_quest(farm_quest,0);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John smiles at you and shakes your hand. ",0);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John smiles and asks if you'd deliver a package for him.\n</c1>\n</c2> ",-1);
	
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(nunnery_quest,0);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("Yes");
			qconsequence = new Quest_Consequence();
			qconsequence.set_change_on_success();
			qconsequence.set_quest(nunnery_quest);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John asks if you've delivered the package yet. ",0);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",-1,0,0,3);
			
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("No");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John looks a little down-trodden as you reject his offer. ",0);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.add_item_reward(FPalace_items.milk_jug(),0);
			iconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "John hands you a dozen bottles of milk, and tells you to deliver it to a nunnery found in the mountains. ",0);
	
			a.addChallenge(challenge,iconsequence);
			
			ct.add_action(a, new ArrayList<Integer>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id)), new ArrayList<>(Arrays.asList(5, Personality.like)),false, Conversation_topic.being_told_topic);

			return ct;			
		}
		
		public static Conversation_topic nunnery_recieve_delivery(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Making a Delivery");
            Quest nunnery_quest = new Quest();
            
			nunnery_quest.set_name("Making a Delivery");
			nunnery_quest.new_objective("Deliver Johns package to the Nunnery in the mountains. ",Quest.talk_action,null);
			nunnery_quest.new_objective("Talk to John. ",Quest.talk_action,null);
			nunnery_quest.add_end_reward(new ArrayList<>(Arrays.asList(100,FPalace_items.gold(20))));
			nunnery_quest.set_end_step(2);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(nunnery_quest,0);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The nun mentions a delivery, and you're reminded of the farm. ",0,0,0,2);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The nun says she's waiting for a delivery. ",-1);
	
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(nunnery_quest,0);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("Yes");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(nunnery_quest,1);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0,0,0,3);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",-1);
			
			a.addChallenge(challenge,qconsequence);
			
			Item temp_item = FPalace_items.milk_jug();
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(temp_item);
			challenge.set_defense_stat(-1,12);
			challenge.setVariability(0);
			challenge.setText("");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.add_item_reward(temp_item,0,false,false);
			iconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You hand over the delivery for the farm, and the nun thanks you. ",0,0,0,1);
			iconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You realize you don't have the delivery! ",-1);
			
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(FPalace_items.nunnery_trapdoor_key());
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();			
			iconsequence.add_item_reward(FPalace_items.nunnery_trapdoor_key(),-1);
			iconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",0);
			iconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Afterwards, the nun mentions visiting the basement for your own needs, and gently hands you a key. ",-1);
			
			a.addChallenge(challenge,iconsequence);
			
			ct.add_action(a, new ArrayList<Integer>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id)), new ArrayList<>(Arrays.asList(5, 0)),false, Conversation_topic.being_told_topic);
            
			return ct;			
		}
		
		public static Conversation_topic looking_for_cum(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Filling the quota for cum");
			
			Item temp_item = FPalace_items.cum_jug();
            Quest cum_quota_quest = new Quest();
			cum_quota_quest.set_name("Filling the quota for cum");
			cum_quota_quest.new_objective("Get a jug of cum for Heidi. ",Quest.pick_up_action,temp_item);
			cum_quota_quest.new_objective("Get the cum back to Heidi. ",Quest.talk_action,null);
			cum_quota_quest.add_end_reward(new ArrayList<>(Arrays.asList(50,FPalace_items.gold(7))));
			cum_quota_quest.set_end_step(2);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(cum_quota_quest,1);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.set_change_on_success();
			qconsequence.set_quest(cum_quota_quest);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Heidi looks greedily at your inventory. ",0,0,0,1);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Heidi is unhappy with how high her father set her quota this month. ",-1);
	
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(temp_item);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You smile at Heidi, and get an enormous grin in return. ",0,0,0,2);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "When she realizes you don't have anything for her, she frowns. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(cum_quota_quest,2);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You take a moment to get the jug out. Heidi grabs it and offers some money. ",0,0,0,3);
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id,5, "",0,0,0,-1,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			ct.add_action(a, new ArrayList<Integer>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id)), new ArrayList<>(Arrays.asList(5, 0)),false, Conversation_topic.being_told_topic);
            
			return ct;
		}
		
		public static Conversation_topic keeping_the_girl_calm(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Keeping the girls Calm");
			Character temp_char = FPalace_npcs.FPalace_Herm().gen_char();
            Quest sleeping_with_amazons_quest = new Quest();
			sleeping_with_amazons_quest.set_name("Calming the girls down");
			sleeping_with_amazons_quest.new_objective("Incapacitate 2 Amazons in the Palace for Vivian. ",Quest.incapacitate_action,temp_char);
			sleeping_with_amazons_quest.new_objective("Incapacitate an Amazon in the Palace for Vivian. ",Quest.incapacitate_action,temp_char);
			sleeping_with_amazons_quest.new_objective("Talk to Vivian. ",Quest.talk_action,null);
			sleeping_with_amazons_quest.add_end_reward(new ArrayList<>(Arrays.asList(50)));
			sleeping_with_amazons_quest.set_end_step(3);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(sleeping_with_amazons_quest,2);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.set_change_on_success();
			qconsequence.set_quest(sleeping_with_amazons_quest);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Vivian smiles at you and shakes your hand. ",0,0,0,1);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "Vivian starts complaining about how upity the other girls are. ",-1);
	
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(sleeping_with_amazons_quest,3);
			qconsequence.addConsequence(Character.relations_affect_id,10, "",0,0,0,-1,true);
	
			a.addChallenge(challenge,qconsequence);
			
			ct.add_action(a, new ArrayList<Integer>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id)), new ArrayList<>(Arrays.asList(5, 0)),false, Conversation_topic.being_told_topic);
    
			return ct;			
		}
		
		public static Conversation_topic collecting_ingredients(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Potion Ingredients");
			
			Item temp_item = FPalace_items.floppy_cucumber();
			Item temp_item2 = FPalace_items.dickweed();
			Item temp_item3 = FPalace_items.Stubby_twig();
			Item temp_item4 = FPalace_items.round_apple();
			
            Quest gathering_quest = new Quest();
			gathering_quest.set_name("Gathering Ingredients for a Hermit");
			gathering_quest.new_objective("Get a floppy cucumber for the Hermit. ",Quest.pick_up_action,temp_item);
			gathering_quest.new_objective("Give the cucumber to the Hermit. ",Quest.talk_action,null);
			gathering_quest.new_objective("Get some dickweed for the Hermit. ",Quest.pick_up_action,temp_item2);
			gathering_quest.new_objective("Give the dickweed to the Hermit. ",Quest.talk_action,null);
			gathering_quest.new_objective("Get a stubby twig for the Hermit. ",Quest.pick_up_action,temp_item3);
			gathering_quest.new_objective("Give the stubby twig to the Hermit. ",Quest.talk_action,null);
			gathering_quest.new_objective("Get a round apple for the Hermit. ",Quest.pick_up_action,temp_item4);
			gathering_quest.new_objective("Give the apple to the Hermit. ",Quest.talk_action,null);
			gathering_quest.add_end_reward(new ArrayList<>(Arrays.asList(100,FPalace_items.gold(20))));
			gathering_quest.set_end_step(8);
			
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();//0
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(gathering_quest,1);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The Hermit looks greedily at your inventory. ",0,0,0,1);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",-1,0,0,13);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//1
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(temp_item);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You smile at the hermit, and get a smirk return. ",0,0,0,2);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "When </pronoun2> realizes you don't have anything for her, </pronoun2> frowns. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//2
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			Quest_Consequence qconsequence = new Quest_Consequence();
			qconsequence.set_quest(gathering_quest,2);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You take a moment to get the cucumber out. The Hermit grabs it and quickly throws it into the cauldron. </pronoun2> mentions needing some Dickweed next. ",0,0,0,3);
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();//3
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id,5, "",0,0,0,-1,true);
			iconsequence.add_item_reward(temp_item,0,false,true,true);
			iconsequence.add_item_reward(temp_item,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//4
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(temp_item2);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You smile at the hermit, and get a smirk in return. ",0,0,0,5);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "When </pronoun2> realizes you don't have anything for her, </pronoun2> frowns. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//5
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(gathering_quest,4);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You take a moment to get the dickweed out. The Hermit grabs it and quickly throws it into the cauldron. </pronoun2> mentions needing a stubby twig next. ",0,0,0,6);
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();//6
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id,5, "",0,0,0,-1,true);
			iconsequence.add_item_reward(temp_item2,0,false,true,true);
			iconsequence.add_item_reward(temp_item2,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//7
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(temp_item3);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You smile at the hermit, and get a smirk return. ",0,0,0,8);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "When </pronoun2> realizes you don't have anything for her, </pronoun2> frowns. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//8
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(gathering_quest,6);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You take a moment to get the stubby twig out. The Hermit grabs it and quickly throws it into the cauldron. </pronoun2> says the final ingredient </pronoun2> is looking for is a round apple. ",0,0,0,9);
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();//9
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id,5, "",0,0,0,-1,true);
			iconsequence.add_item_reward(temp_item3,0,false,true,true);
			iconsequence.add_item_reward(temp_item3,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//10
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_item(temp_item4);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You smile at the hermit, and get a smirk return. ",0,0,0,11);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "When </pronoun2> realizes you don't have anything for her, </pronoun2> frowns. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//11
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_quest(gathering_quest,8);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You take a moment to get the round apple out. The Hermit grabs it and quickly throws it into the cauldron, thanking you for your help. ",0,0,0,12);
			a.addChallenge(challenge,qconsequence);
			
			challenge = new Challenge();//12
			challenge.set_attack_stat(FPalaceHelper.curr_hp_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			iconsequence = new ItemConsequence();
			iconsequence.addConsequence(Character.relations_affect_id,20, "",0,0,0,-1,true);
			iconsequence.add_item_reward(temp_item4,0,false,true,true);
			iconsequence.add_item_reward(temp_item4,0,false,false);
			a.addChallenge(challenge,iconsequence);
			
			challenge = new Challenge();//13
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(gathering_quest,3);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The Hermit looks greedily at your inventory. ",0,0,0,4);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",-1,0,0,14);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//14
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(gathering_quest,5);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The Hermit looks greedily at your inventory. ",0,0,0,7);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "",-1,0,0,15);
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//15
			challenge.set_attack_stat(-1,0);
			challenge.set_attack_quest(gathering_quest,7);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			qconsequence = new Quest_Consequence();
			qconsequence.set_change_on_success();
			qconsequence.set_quest(gathering_quest);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The Hermit looks greedily at your inventory. ",0,0,0,10);
			qconsequence.addConsequence(FPalaceHelper.curr_hp_id,0, "The Hermit complains about how hard it is to find ingredients. ",-1);
			a.addChallenge(challenge,qconsequence);
			
			ct.add_action(a, new ArrayList<Integer>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id)), new ArrayList<>(Arrays.asList(5, 0)),false, Conversation_topic.being_told_topic);
            
			return ct;			
		}
		
		public static Conversation_topic pimping_aint_easy(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_no_spread();
			ct.set_topic_name("Job Offer");
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();//0
			challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
			challenge.set_defense_stat(-1,13);
			challenge.setVariability(0);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> looks you up and down, giving you a wink. \"Do you want a </c1>?\" </pronoun2> asks. ",0);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> looks you up and down, but scoffs at you in the end. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//1
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("job");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> smiles. \"There's a very simple </c2>.\" </pronoun2> says. ",0);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();//2
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("audition");
			consequence = new Consequence();
            consequence.add_change_effect(FPalace_classes.job_prostitute());
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2>s smile becomes a grin as </pronoun2> motions to </noun2> groin. ",0);
	
			a.addChallenge(challenge,consequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,10));
			ct.add_action(a, dia1,dia2,false, Conversation_topic.being_told_topic);
			
			return ct;			
		}
		
		public static Conversation_topic fresh_meat(){
			Conversation_topic ct = new Conversation_topic();
			
			ct.set_topic_name("Amazonian Greeting");
			CharAction a = new CharAction();
			a.set_dialogue("",0);
			Challenge challenge = new Challenge();//0
			challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
			challenge.set_defense_stat(Character.attraction_id);
			challenge.setVariability(20);
			challenge.setText("");
			Consequence consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> looks you up and down, giving you a toothy grin before </pronoun2> grunts \"Fresh meat!\" and lunges at you! ",0,0,0,1);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> looks you up and down, but scoffs at you in the end. ",-1);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.grappling_id);
			challenge.set_defense_stat(FPalace_skills.grappling_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You manage to knock </n2> back!\n",0);
            //consequence.add_char_effect(null);//Start combat
            //TODO char_template etc.
			consequence.addConsequence(FPalaceHelper.lust_id,5, "</n2> manages to get the jump on you, pining you quickly, </noun2> breathing heavy. ",-1,0,0,2);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(Character.attraction_id);
			challenge.set_defense_stat(FPalaceHelper.sex_appeal_id);
			challenge.setVariability(5);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "you struggle and fight as </n2> looms over you. </pronoun2> leans in and licks your face, a hand grasping at your groin. ",0,0,0,3);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "you think about struggling, but decide to give in and let it happen. </n2> looks a bit disapointed, and quickly flips you over. ",-1,0,0,5);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalace_skills.grappling_id);
			challenge.set_defense_stat(FPalace_skills.grappling_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "you manage to gain an advantage as the positions change! Suddenly you're on top of </n2>. ",0,0,0,4);
			consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "as you struggle, </n2> maintains </noun2> advantage, flipping you over with a grunt and bite to your neck. ",-1,0,0,5);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.grappling_id);
			challenge.set_defense_stat(FPalace_skills.grappling_id);
			challenge.setVariability(20);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "You manage to knock </n2> off of you and regain your feet!\n",0);
			//consequence.add_char_effect(null);//Start combat
            //TODO char_template etc.
			consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> regains </noun2> advantage! ",-1,0,0,2);
	
			a.addChallenge(challenge,consequence);
			
			challenge = new Challenge();
			challenge.set_attack_stat(FPalaceHelper.vaginal_depth_id);
			challenge.set_defense_stat(-1,1);
			challenge.setVariability(0);
			challenge.setText("");
			consequence = new Consequence();
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> begins to massage your vulva with </noun2> groin as </pronoun2> mounts you. ",0);			
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> begins to massage your ass with </noun2> groin as </pronoun2> mounts you. ",-1);
	
			a.addChallenge(challenge,consequence);			
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,-1));
			ct.add_action(a, dia1,dia2,false, Conversation_topic.being_told_topic,FPalaceHelper.get_amazon_mob());
			
			a = new CharAction();
			a.setName("Amazonian Greeting");
			a.set_dialogue("\"Amazon Greeting?\" </n2> asks inquisitively.\n\n</c0>");
			
			challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.conversing_id);
			challenge.set_defense_stat(-1,20);
			challenge.setVariability(20);
			challenge.setText("Tell about the greeting");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id,10, "You tell </n2> about the strange sexual greeting that amazonians offer. </pronoun2> seems intrigued by your story. ",0,0,0,-1, true);
			consequence.addConsequence(Character.relations_affect_id,-5, "</n2> looks incredulous as you do your best to tell </objnoun2> about the horrible rape an amazon is likely to greet them with. ",-1,0,0,-1, true);
			a.addChallenge(challenge,consequence);
			dia2 = new ArrayList<>();
			 second = new int[]{5, 0};
			for(int i : second){
			dia2.add(i);
			}
			ct.add_action(a, dia1,dia2, false, Conversation_topic.telling_topic);
						
			return ct;
		}
		
		public static Conversation_topic inkeeper_topic(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Inn");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("");
			a.set_dialogue("\"Yes, we take </c0>!\" </n2> says enthusiaticly.");
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("boarders");
			Consequence consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id, 0, "Just </c1> a night!",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(Character.gold_id);
			challenge.set_defense_stat(-1,5);
			challenge.setVariability(0);
			challenge.setText("5 gold");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.set_rest_flag();
			iconsequence.addConsequence(Character.relations_affect_id, 1, "You hand over the gold and share a smile with </n2>. </pronoun2> leads you to a room and you lay down and rest. ",0,0,0,-1, true);
			iconsequence.addConsequence(Character.relations_affect_id, -1, "</n2> appologizes as </pronoun2> points out you don't have enough. ",-1,0,0,-1, true);
			iconsequence.add_item_reward(FPalace_items.gold(-5),0);			
			a.addChallenge(challenge,iconsequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));
			ct.add_action(a, dia1,dia2,false, Conversation_topic.being_told_topic);
			ct.add_action(a, dia1,dia2,false, Conversation_topic.ask_topic);
			
			return ct;
		}
		
		public static Conversation_topic doctor_topic(){
			Conversation_topic ct = new Conversation_topic();
			ct.set_topic_name("Doctor");
			ct.set_no_spread();
			
			CharAction a = new CharAction();
			a.setName("");
			a.set_dialogue("\"Yes, I am a Doctor!\" </n2> says enthusiaticly. \"I can fix the following ailments:\"\n</c0>\n</c2>\n</c4>");
			//TickEffect.poisoned_status
			Challenge challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("Poison");
			Consequence consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id, 0, "Just </c1>!",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(Character.gold_id);
			challenge.set_defense_stat(-1,5);
			challenge.setVariability(0);
			challenge.setText("5 gold");
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.add_remove_status(TickEffect.poisoned_status);
			iconsequence.addConsequence(Character.relations_affect_id, 1, "You hand over the gold and share a smile with </n2>. </pronoun2> gives you a strange paste to choke down. ",0,0,0,-1, true);
			iconsequence.addConsequence(Character.relations_affect_id, -1, "</n2> appologizes as </pronoun2> points out you don't have enough. ",-1,0,0,-1, true);
			iconsequence.add_item_reward(FPalace_items.gold(-5),0);			
			a.addChallenge(challenge,iconsequence);
			
			//TickEffect.pregnant_status
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("Pregnancy");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id, 0, "Just </c3>!",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(Character.gold_id);
			challenge.set_defense_stat(-1,10);
			challenge.setVariability(0);
			challenge.setText("10 gold");
			iconsequence = new ItemConsequence();
			iconsequence.add_remove_status(TickEffect.pregnant_status);
			iconsequence.addConsequence(Character.relations_affect_id, 1, "You hand over the gold and share a smile with </n2>. </pronoun2> takes a few moments to brew and feed you some tea and warns you you'll have to take care of the bloating on your own. ",0,0,0,-1, true);
			iconsequence.addConsequence(Character.relations_affect_id, -1, "</n2> appologizes as </pronoun2> points out you don't have enough. ",-1,0,0,-1, true);
			iconsequence.add_item_reward(FPalace_items.gold(-10),0);			
			a.addChallenge(challenge,iconsequence);
			
			//TickEffect.worms_status
			challenge = new Challenge();
			challenge.set_attack_stat(-1,1);
			challenge.set_defense_stat(-1,0);
			challenge.setVariability(0);
			challenge.setText("Worms");
			consequence = new Consequence();
			consequence.addConsequence(Character.relations_affect_id, 0, "Just </c5>!",0,0,0,-1, true);
			a.addChallenge(challenge,consequence);

			challenge = new Challenge();
			challenge.set_attack_stat(Character.gold_id);
			challenge.set_defense_stat(-1,5);
			challenge.setVariability(0);
			challenge.setText("5 gold");
			iconsequence = new ItemConsequence();
			iconsequence.add_remove_status(TickEffect.worms_status);
			iconsequence.addConsequence(Character.relations_affect_id, 1, "You hand over the gold and share a smile with </n2>. </pronoun2> leads you to a room and you lay down and let him poke needles into your body. ",0,0,0,-1, true);
			iconsequence.addConsequence(Character.relations_affect_id, -1, "</n2> appologizes as </pronoun2> points out you don't have enough. ",-1,0,0,-1, true);
			iconsequence.add_item_reward(FPalace_items.gold(-5),0);			
			a.addChallenge(challenge,iconsequence);
			ArrayList<Integer> dia1 = new ArrayList<>(Arrays.asList(FPalaceHelper.int_id, Character.relations_affect_id));
			ArrayList<Integer> dia2 = new ArrayList<>(Arrays.asList(5,0));
			ct.add_action(a, dia1,dia2,false, Conversation_topic.being_told_topic);
			ct.add_action(a, dia1,dia2,false, Conversation_topic.ask_topic);
			
			return ct;
        }
        

	}
	

