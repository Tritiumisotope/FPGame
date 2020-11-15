package fpgamegithubredux;

//import java.awt.image.BufferedImage
//import java.io.File
//import java.io.IOException
import java.net.URL;

//import javax.imageio.ImageIO
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.util.ArrayList;
//import java.util.Arrays
import java.util.Arrays;

public class FPalaceHelper{
        
        //protected BufferedImage[] img
        protected JLabel loader;
        protected String[] imgPaths = {"imgs/unknown.gif", "imgs/Button_disabledSkin.png"
		, "imgs/Button_downSkin.png", "imgs/Button_emphasizedSkin.png", "imgs/Button_overSkin.png"
		, "imgs/Button_selectedDisabledSkin.png", "imgs/Button_selectedDownSkin.png", "imgs/Button_selectedOverSkin.png"
		, "imgs/Button_selectedUpSkin.png", "imgs/Button_upSkin.png"
		, "imgs/ProgressBar_barSkin.png", "imgs/ProgressBar_indeterminateSkin.png", "imgs/ProgressBar_trackSkin.png"
		, "imgs/TextArea_disabledSkin.png", "imgs/TextArea_upSkin.png", "imgs/ScrollArrowDown_disabledSkin.png"
		, "imgs/ScrollArrowDown_downSkin.png", "imgs/ScrollArrowDown_overSkin.png", "imgs/ScrollArrowDown_upSkin.png"
		, "imgs/ScrollArrowUp_disabledSkin.png", "imgs/ScrollArrowUp_downSkin.png", "imgs/ScrollArrowUp_overSkin.png"
	    , "imgs/ScrollArrowUp_upSkin.png", "imgs/ScrollBar_thumbIcon.png", "imgs/ScrollThumb_downSkin.png"
		, "imgs/ScrollThumb_overSkin.png", "imgs/ScrollThumb_upSkin.png", "imgs/ScrollTrack_skin.png"
	    , "imgs/TextInput_disabledSkin.png", "imgs/TextInput_upSkin.png", "imgs/linty_namiAndRobin.gif" 
    	, "imgs/462062941.jpg",  "imgs/slime_1.gif", "imgs/futa_cola_1.gif", "imgs/34_test.gif" };
        
		//fiddlng with images...
		public static final int unknown_img = 0;
		
		public static final int test_img = 99;
		//public static final int.* = 2
		
		//Background images
		public static final int background_test_img = 1;
		
		//Character images
            //human
            protected String[] humanBodyImgStrs = {"imgs/unknown.gif"/*Default*/,"imgs/Body/human_head_1.gif", "imgs/Body/human_eyes_1.jpg", "imgs/Body/human_torso_1.gif",
            "imgs/Body/human_hips_1.gif", "imgs/Body/human_leg_1.gif", "imgs/Body/human_foot_1.gif", "imgs/Body/human_arm_1.gif",
            "imgs/Body/human_hand_1.gif", "imgs/Body/human_breasts_1.gif", "imgs/Body/human_balls_1.gif", "imgs/Body/human_penis_1.gif" };
			public static final int human_head_1_img = 1;
			public static final int human_eyes_1_img = 2;
			public static final int human_torso_1_img = 3;
			public static final int human_hips_1_img = 4;
			public static final int human_breasts_1_img = 9;
			public static final int human_balls_1_img = 10;
			public static final int human_penis_1_img =11;
			public static final int human_hair_1_img = 0;//12
			public static final int human_arm_1_img = 7;
			public static final int human_hand_1_img = 8;
			public static final int human_vag_1_img = 0;//13
			public static final int human_leg_1_img = 5;
			public static final int human_foot_1_img = 6;
            public static final int human_clit_1_img = 0;//14
            

			// goo
			public static final int goo_head_1_img = 2;// 16
			public static final int goo_eyes_1_img = 3;// 17
			public static final int goo_torso_1_img = 4;// 18
			public static final int goo_hips_1_img = 5;// 19
			public static final int goo_breasts_1_img = 6;// 20
			public static final int goo_balls_1_img = 7;// 21
			public static final int goo_penis_1_img = 8;// 22
			public static final int goo_arm_1_img = 10;// 23
			public static final int goo_hand_1_img = 11;// 24
			public static final int goo_vag_1_img = 0;// 25
			public static final int goo_leg_1_img = 13;// 26
			public static final int goo_foot_1_img = 14;// 27
			public static final int goo_clit_1_img = 0;// 28

			public static final int goo_char_img = 29;

			// anthro_rabbit
			public static final int rabbit_head_1_img = 2;// 30
			public static final int rabbit_eyes_1_img = 3;// 31
			public static final int rabbit_torso_1_img = 4;// 32
			public static final int rabbit_hips_1_img = 5;// 33
			public static final int rabbit_breasts_1_img = 6;// 34
			public static final int rabbit_balls_1_img = 7;// 35
			public static final int rabbit_penis_1_img = 8;// 36
			public static final int rabbit_hair_1_img = 0;// 37
			public static final int rabbit_arm_1_img = 10;// 38
			public static final int rabbit_hand_1_img = 11;// 39
			public static final int rabbit_vag_1_img = 0;// 40
			public static final int rabbit_leg_1_img = 13;// 41
			public static final int rabbit_foot_1_img = 14;// 42
			public static final int rabbit_clit_1_img = 0;// 43
			public static final int rabbit_tail_1_img = 0;// 44

			// elf
			public static final int elf_head_1_img = 2;// 45
			public static final int elf_eyes_1_img = 3;// 46
			public static final int elf_torso_1_img = 4;// 47
			public static final int elf_hips_1_img = 5;// 48
			public static final int elf_breasts_1_img = 6;// 49
			public static final int elf_balls_1_img = 7;// 50
			public static final int elf_penis_1_img = 8;// 51
			public static final int elf_hair_1_img = 0;// 52
			public static final int elf_arm_1_img = 10;// 53
			public static final int elf_hand_1_img = 11;// 54
			public static final int elf_vag_1_img = 0;// 55
			public static final int elf_leg_1_img = 13;// 56
			public static final int elf_foot_1_img = 14;// 57
			public static final int elf_clit_1_img = 0;// 58

			// dwarf
			public static final int dwarf_head_1_img = 2;// 59
			public static final int dwarf_eyes_1_img = 3;// 60
			public static final int dwarf_torso_1_img = 4;// 61
			public static final int dwarf_hips_1_img = 5;// 62
			public static final int dwarf_breasts_1_img = 6;// 63
			public static final int dwarf_balls_1_img = 7;// 64
			public static final int dwarf_penis_1_img = 8;// 65
			public static final int dwarf_hair_1_img = 0;// 66
			public static final int dwarf_arm_1_img = 10;// 67
			public static final int dwarf_hand_1_img = 11;// 68
			public static final int dwarf_vag_1_img = 0;// 69
			public static final int dwarf_leg_1_img = 13;// 70
			public static final int dwarf_foot_1_img = 14;// 71
			public static final int dwarf_clit_1_img = 0;// 72

			// goblin
			public static final int goblin_head_1_img = 2;// 59
			public static final int goblin_eyes_1_img = 3;// 60
			public static final int goblin_torso_1_img = 4;// 61
			public static final int goblin_hips_1_img = 5;// 62
			public static final int goblin_breasts_1_img = 6;// 63
			public static final int goblin_balls_1_img = 7;// 64
			public static final int goblin_penis_1_img = 8;// 65
			public static final int goblin_hair_1_img = 0;// 66
			public static final int goblin_arm_1_img = 10;// 67
			public static final int goblin_hand_1_img = 11;// 68
			public static final int goblin_vag_1_img = 0;// 69
			public static final int goblin_leg_1_img = 13;// 70
			public static final int goblin_foot_1_img = 14;// 71
			public static final int goblin_clit_1_img = 0;// 72

			// anthro_feline
			public static final int feline_head_1_img = 2;// 73
			public static final int feline_eyes_1_img = 3;// 74
			public static final int feline_torso_1_img = 4;// 75
			public static final int feline_hips_1_img = 5;// 76
			public static final int feline_breasts_1_img = 6;// 77
			public static final int feline_balls_1_img = 7;// 78
			public static final int feline_penis_1_img = 8;// 79
			public static final int feline_hair_1_img = 0;// 80
			public static final int feline_arm_1_img = 10;// 81
			public static final int feline_hand_1_img = 11;// 82
			public static final int feline_vag_1_img = 0;// 83
			public static final int feline_leg_1_img = 13;// 84
			public static final int feline_foot_1_img = 14;// 85
			public static final int feline_clit_1_img = 0;// 86
			public static final int feline_tail_1_img = 0;// 87

			// anthro_lizard
			public static final int lizard_head_1_img = 2;// 88
			public static final int lizard_eyes_1_img = 3;// 89
			public static final int lizard_torso_1_img = 4;// 90
			public static final int lizard_hips_1_img = 5;// 91
			public static final int lizard_breasts_1_img = 6;// 92
			public static final int lizard_balls_1_img = 7;// 93
			public static final int lizard_penis_1_img = 8;// 94
			public static final int lizard_hair_1_img = 0;// 95
			public static final int lizard_arm_1_img = 10;// 96
			public static final int lizard_hand_1_img = 11;// 97
			public static final int lizard_vag_1_img = 0;// 98
			public static final int lizard_leg_1_img = 13;// 99
			public static final int lizard_foot_1_img = 14;// 100
			public static final int lizard_clit_1_img = 0;// 101
			public static final int lizard_tail_1_img = 0;// 102

			// anthro_fish
			public static final int fish_head_1_img = 2;// 103
			public static final int fish_eyes_1_img = 3;// 104
			public static final int fish_torso_1_img = 4;// 105
			public static final int fish_hips_1_img = 5;// 106
			public static final int fish_breasts_1_img = 6;// 107
			public static final int fish_balls_1_img = 7;// 108
			public static final int fish_penis_1_img = 8;// 109
			public static final int fish_hair_1_img = 0;// 110
			public static final int fish_arm_1_img = 10;// 111
			public static final int fish_hand_1_img = 11;// 112
			public static final int fish_vag_1_img = 0;// 113
			public static final int fish_leg_1_img = 13;// 114
			public static final int fish_foot_1_img = 14;// 115
			public static final int fish_clit_1_img = 0;// 116
			public static final int fish_tail_1_img = 0;// 117

			// anthro_bovine
			public static final int bovine_head_1_img = 2;// 118
			public static final int bovine_eyes_1_img = 3;// 119
			public static final int bovine_torso_1_img = 4;// 120
			public static final int bovine_hips_1_img = 5;// 121
			public static final int bovine_breasts_1_img = 6;// 122
			public static final int bovine_balls_1_img = 7;// 123
			public static final int bovine_penis_1_img = 8;// 124
			public static final int bovine_hair_1_img = 0;// 125
			public static final int bovine_arm_1_img = 10;// 126
			public static final int bovine_hand_1_img = 11;// 127
			public static final int bovine_vag_1_img = 0;// 128
			public static final int bovine_leg_1_img = 13;// 129
			public static final int bovine_foot_1_img = 14;// 130
			public static final int bovine_clit_1_img = 0;// 131
			public static final int bovine_tail_1_img = 0;// 132
			public static final int bovine_udder_1_img = 0;// 133
			public static final int bovine_horns_1_img = 0;// 134

			// anthro_equine
			public static final int equine_head_1_img = 2;// 135
			public static final int equine_eyes_1_img = 3;// 136
			public static final int equine_torso_1_img = 4;// 137
			public static final int equine_hips_1_img = 5;// 138
			public static final int equine_breasts_1_img = 6;// 139
			public static final int equine_balls_1_img = 7;// 140
			public static final int equine_penis_1_img = 8;// 141
			public static final int equine_hair_1_img = 0;// 142
			public static final int equine_arm_1_img = 10;// 143
			public static final int equine_hand_1_img = 11;// 144
			public static final int equine_vag_1_img = 0;// 145
			public static final int equine_leg_1_img = 13;// 146
			public static final int equine_foot_1_img = 14;// 147
			public static final int equine_clit_1_img = 0;// 148
			public static final int equine_tail_1_img = 0;// 149

			// anthro_spider
			public static final int spider_head_1_img = 2;// 150
			public static final int spider_eyes_1_img = 3;// 151
			public static final int spider_torso_1_img = 4;// 152
			public static final int spider_hips_1_img = 5;// 153
			public static final int spider_breasts_1_img = 6;// 154
			public static final int spider_balls_1_img = 7;// 155
			public static final int spider_penis_1_img = 8;// 156
			public static final int spider_hair_1_img = 0;// 157
			public static final int spider_arm_1_img = 10;// 158
			public static final int spider_hand_1_img = 11;// 159
			public static final int spider_vag_1_img = 0;// 160
			public static final int spider_leg_1_img = 13;// 161
			public static final int spider_foot_1_img = 14;// 162
			public static final int spider_clit_1_img = 0;// 163
			public static final int spider_thorax_1_img = 0;// 164
			public static final int spider_abdomen_1_img = 0;// 165

			// anthro_bee
			public static final int bee_head_1_img = 2;// 166
			public static final int bee_eyes_1_img = 3;// 167
			public static final int bee_torso_1_img = 4;// 168
			public static final int bee_hips_1_img = 5;// 169
			public static final int bee_breasts_1_img = 6;// 170
			public static final int bee_balls_1_img = 7;// 171
			public static final int bee_penis_1_img = 8;// 172
			public static final int bee_hair_1_img = 0;// 173
			public static final int bee_arm_1_img = 10;// 174
			public static final int bee_hand_1_img = 11;// 175
			public static final int bee_vag_1_img = 0;// 176
			public static final int bee_leg_1_img = 13;// 177
			public static final int bee_foot_1_img = 14;// 178
			public static final int bee_clit_1_img = 0;// 179
			public static final int bee_thorax_1_img = 0;// 180
			public static final int bee_abdomen_1_img = 0;// 181
			public static final int bee_wing_1_img = 0;// 182

			// anthro_donkey
			public static final int equidae_head_1_img = 2;// 183
			public static final int equidae_eyes_1_img = 3;// 184
			public static final int equidae_torso_1_img = 4;// 185
			public static final int equidae_hips_1_img = 5;// 186
			public static final int equidae_breasts_1_img = 6;// 187
			public static final int equidae_balls_1_img = 7;// 188
			public static final int equidae_penis_1_img = 8;// 189
			public static final int equidae_hair_1_img = 0;// 190
			public static final int equidae_arm_1_img = 10;// 191
			public static final int equidae_hand_1_img = 11;// 192
			public static final int equidae_vag_1_img = 0;// 193
			public static final int equidae_leg_1_img = 13;// 194
			public static final int equidae_foot_1_img = 14;// 195
			public static final int equidae_clit_1_img = 0;// 196
			public static final int equidae_tail_1_img = 0;// 197

			// anthro_canine
			public static final int canine_head_1_img = 2;// 198
			public static final int canine_eyes_1_img = 3;// 199
			public static final int canine_torso_1_img = 4;// 200
			public static final int canine_hips_1_img = 5;// 201
			public static final int canine_breasts_1_img = 6;// 202
			public static final int canine_balls_1_img = 7;// 203
			public static final int canine_penis_1_img = 8;// 204
			public static final int canine_hair_1_img = 0;// 205
			public static final int canine_arm_1_img = 10;// 206
			public static final int canine_hand_1_img = 11;// 207
			public static final int canine_vag_1_img = 0;// 208
			public static final int canine_leg_1_img = 13;// 209
			public static final int canine_foot_1_img = 14;// 210
			public static final int canine_clit_1_img = 0;// 211
			public static final int canine_tail_1_img = 0;// 212

			// anthro_mouse
			public static final int mouse_head_1_img = 2;// 213
			public static final int mouse_eyes_1_img = 3;// 214
			public static final int mouse_torso_1_img = 4;// 215
			public static final int mouse_hips_1_img = 5;// 216
			public static final int mouse_breasts_1_img = 6;// 217
			public static final int mouse_balls_1_img = 7;// 218
			public static final int mouse_penis_1_img = 8;// 219
			public static final int mouse_hair_1_img = 0;// 220
			public static final int mouse_arm_1_img = 10;// 221
			public static final int mouse_hand_1_img = 11;// 222
			public static final int mouse_vag_1_img = 0;// 223
			public static final int mouse_leg_1_img = 13;// 224
			public static final int mouse_foot_1_img = 14;// 225
			public static final int mouse_clit_1_img = 0;// 226
			public static final int mouse_tail_1_img = 0;// 227

			// anthro_frog
			public static final int frog_head_1_img = 2;// 228
			public static final int frog_eyes_1_img = 3;// 229
			public static final int frog_torso_1_img = 4;// 230
			public static final int frog_hips_1_img = 5;// 231
			public static final int frog_breasts_1_img = 6;// 232
			public static final int frog_balls_1_img = 7;// 233
			public static final int frog_penis_1_img = 8;// 234
			public static final int frog_hair_1_img = 0;// 235
			public static final int frog_arm_1_img = 10;// 236
			public static final int frog_hand_1_img = 11;// 237
			public static final int frog_vag_1_img = 0;// 238
			public static final int frog_leg_1_img = 13;// 239
			public static final int frog_foot_1_img = 14;// 240
			public static final int frog_clit_1_img = 0;// 241

			// angel
			public static final int angel_wing_1_img = 0;// 242

			// demon
			public static final int demon_wing_1_img = 0;// 243
			public static final int demon_tail_1_img = 0;// 244

			// anthro_deer
			public static final int cervine_head_1_img = 2;// 245
			public static final int cervine_eyes_1_img = 3;// 246
			public static final int cervine_torso_1_img = 4;// 247
			public static final int cervine_hips_1_img = 5;// 248
			public static final int cervine_breasts_1_img = 6;// 249
			public static final int cervine_balls_1_img = 7;// 250
			public static final int cervine_penis_1_img = 8;// 251
			public static final int cervine_hair_1_img = 0;// 252
			public static final int cervine_arm_1_img = 10;// 253
			public static final int cervine_hand_1_img = 11;// 254
			public static final int cervine_vag_1_img = 0;// 255
			public static final int cervine_leg_1_img = 13;// 256
			public static final int cervine_foot_1_img = 14;// 257
			public static final int cervine_clit_1_img = 0;// 258
			public static final int cervine_tail_1_img = 0;// 259
			public static final int cervine_horns_1_img = 0;// 260

			// sex_snake

			// GUI images
			public static final int Button_disabledSkin_img = 185;
			public static final int Button_downSkin_img = 186;
			public static final int Button_emphasizedSkin_img = 187;
			public static final int Button_overSkin_img = 188;
			public static final int Button_selectedDisabledSkin_img = 189;
			public static final int Button_selectedDownSkin_img = 190;
			public static final int Button_selectedOverSkin_img = 191;
			public static final int Button_selectedUpSkin_img = 192;
			public static final int Button_upSkin_img = 193;

			public static final int ProgressBar_barSkin_img = 194;
			public static final int ProgressBar_indeterminateSkin_img = 195;
			public static final int ProgressBar_trackSkin_img = 196;

			public static final int TextArea_disabledSkin_img = 197;
			public static final int TextArea_upSkin_img = 198;

			public static final int ScrollArrowDown_disabledSkin_img = 201;
			public static final int ScrollArrowDown_downSkin_img = 202;
			public static final int ScrollArrowDown_overSkin_img = 203;
			public static final int ScrollArrowDown_upSkin_img = 204;
			public static final int ScrollArrowUp_disabledSkin_img = 205;
			public static final int ScrollArrowUp_downSkin_img = 206;
			public static final int ScrollArrowUp_overSkin_img = 207;
			public static final int ScrollArrowUp_upSkin_img = 208;
			public static final int ScrollBar_thumbIcon_img = 209;
			public static final int ScrollThumb_downSkin_img = 210;
			public static final int ScrollThumb_overSkin_img = 211;
			public static final int ScrollThumb_upSkin_img = 212;
			public static final int ScrollTrack_skin_img = 213;

			public static final int TextInput_disabledSkin_img = 199;
			public static final int TextInput_upSkin_img = 200;

			// 3/4 view images...
			public static final int view34_test_img = 183;

			// item images
			public static final int futa_cola_1_img = 184;

			public static int relations_affect_id = -999;
			// Default stat id's - ordering of these can be important, as is the case with
			// items applying effects
			public static final int str_id = 1;
			public static final int dex_id = 2;
			public static final int con_id = 3;
			public static final int sex_appeal_id = 4;
			public static final int int_id = 5;
			public static final int wis_id = 6;
			public static final int will_id = 7;
			public static final int cha_id = 8;
			public static final int max_hp_id = 9;
			public static final int lust_id = 10;
			public static final int curr_hp_id = 11;
			public static final int max_lust_id = 12;
			public static final int penis_length_id = 13;
			public static final int penis_girth_id = 14;
			public static final int breast_size_id = 15;
			public static final int nipple_size_id = 16;
			public static final int balls_size_id = 17;
			public static final int bust_id = 18;
			public static final int waist_id = 19;
			public static final int hips_id = 20;
			public static final int cum_volume_id = 21;
			public static final int anal_width_id = 22;
			public static final int anal_depth_id = 23;
			public static final int vaginal_width_id = 24;
			public static final int vaginal_depth_id = 25;
			public static final int milk_volume_id = 26;
			public static final int min_lust_id = 27;
			public static final int age_id = 28;
			public static final int semen_fertility_id = 29;
			public static final int egg_fertility_id = 30;
			public static final int bloat_id = 31;
			public static final int height_id = 32;
			public static final int clit_length = 33;
			public static final int biomass_consumed = 34;
			public static final int curr_mp_id = 35;
			public static final int max_mp_id = 36;
			public static final int curr_fatigue_id = 37;
			public static final int max_fatigue_id = 38;
			public static final int erection_ratio_id = 39;
			public static final int weight_id = 40;
			public static final int max_weight_id = 41;
			public static final int hair_length_id = 42;
			public static final int hair_colour_id = 43;
			public static final int eye_colour_id = 44;
			public static final int skin_colour_id = 45;
			public static final int goo_colour_id = 46;
			public static final int fur_colour_id = 47;
			public static final int scale_colour_id = 48;

			// Default BodyPart id's
			public static final int horn_slot = 1;
			public static final int hair_slot = 2;
			public static final int head_slot = 3;
			public static final int eyes_slot = 4;
			public static final int torso_slot = 5;
			public static final int wings_slot = 6;
			public static final int breasts_slot = 7;
			public static final int nipples_slot = 8;
			public static final int arms_slot = 9;
			public static final int hands_slot = 10;
			public static final int hips_slot = 11;
			public static final int barrel_slot = 12;
			public static final int thighs_slot = 13;
			public static final int udder_slot = 14;
			public static final int vag_slot = 15;
			public static final int clit_slot = 16;
			public static final int balls_slot = 17;
			public static final int cock_slot = 18;
			public static final int thorax_slot = 19;
			public static final int abdomen_slot = 20;
			public static final int legs_slot = 21;
			public static final int feet_slot = 22;
			public static final int tail_slot = 23;

			private static Sex herm_sex;
			private static Sex futa_sex;
			private static Sex shemale_sex;
			private static Sex male_sex;
			private static Sex female_sex;
			private static Sex female_eunuch_sex;
			private static Sex male_eunuch_sex;
			private static Sex androgynous_sex;

			private static Mob sin_mob;
			private static Mob goo_empress_mob;
			private static Mob amazon_mob;
			private static Mob humility_mob;
			private static Mob kindness_mob;
			private static Mob patience_mob;
			private static Mob diligence_mob;
			private static Mob freedom_farm_mob;
			private static Mob charity_mob;
			private static Mob temperance_mob;
			private static Mob chastity_mob;
			private static Mob heaven_mob;
			private static Mob hell_mob;

			private static Mob monster_mob;

			private static Stat[] stat_names;
			private static DamageType[] damage_types;
			//private static int[] images

			protected static ArrayList<JLabel> humanBodyImgs = new ArrayList<>();
			protected static ArrayList<JLabel> otherImgs = new ArrayList<>();

			public FPalaceHelper() {
				// finalructor code
				for (String s : humanBodyImgStrs) {
					loader = loadIMG(s);
					humanBodyImgs.add(loader);
				}
				for (String s : imgPaths) {
					loader = loadIMG(s);
					otherImgs.add(loader);
				}
				loader = null;
			}

			/*
			 * public static JLabel get_image_by_id(int image_id, ArrayList<JLabel> list){
			 * return list.get(image_id); }
			 */
			public static JLabel get_image_by_id(int image_id, String whichList){
			if (whichList.equals("Body")){
				return humanBodyImgs.get(image_id);
			}else{
				return otherImgs.get(image_id);
			}
		}
		//replaces old one
		
		public static Stat get_stat_by_id(int stat_id){
			Stat ret = null;
			if(stat_names == null){
				get_stat_name_by_id(stat_id);
			}
			
			if(stat_names[stat_id] != null) ret = stat_names[stat_id];
			
			return ret;
		}
		
		public static DamageType get_type_by_id(int type_id){
			DamageType  ret= null;
			if(damage_types == null){
				get_stat_name_by_id(type_id);
			}
			
			if(damage_types[type_id] != null) ret = damage_types[type_id];
			
			return ret;
		}
		
		public static String get_type_name_by_id(int type_id){
			String ret = "?";
			if(damage_types == null){
				
				damage_types = new DamageType[0];//damage_types = new Array()
				damage_types[0] = lust_damage_type();
				damage_types[1] = bludg_damage_type();
				damage_types[2] = pierce_damage_type();
				damage_types[3] = slash_damage_type();
				damage_types[4] = earth_damage_type();
				damage_types[5] = air_damage_type();
				damage_types[6] = water_damage_type();
				damage_types[7] = acid_damage_type();
				damage_types[8] = fire_damage_type();
				damage_types[9] = lit_damage_type();
			}
			
			if(damage_types[type_id] != null) ret = damage_types[type_id].get_name();
			
			return ret;
		}
		
		public static Mob get_empress_mob(){
			if(goo_empress_mob == null){
				goo_empress_mob = new Mob();
				//likes: Sin
				goo_empress_mob.new_ally(get_sin_mob());
				goo_empress_mob.new_ally(get_amazon_mob());
				//Dislikes: ?
				
				goo_empress_mob.new_ideal(trait_semen_production());
				goo_empress_mob.new_ideal(trait_milk_production());
				
				
			}
			return goo_empress_mob;
		}
		
		public static Mob get_monster_mob(){
			if(monster_mob == null){
				monster_mob = new Mob();
				
				monster_mob.new_enemy(get_sin_mob());
				monster_mob.new_enemy(get_amazon_mob());
				monster_mob.new_enemy(get_humility_mob());
				monster_mob.new_enemy(get_kindness_mob());
				monster_mob.new_enemy(get_patience_mob());
				monster_mob.new_enemy(get_diligence_mob());
				monster_mob.new_enemy(get_charity_mob());
				monster_mob.new_enemy(get_temperance_mob());
				monster_mob.new_enemy(get_chastity_mob());
				monster_mob.new_enemy(get_heaven_mob());
				monster_mob.new_enemy(monster_mob);
			}
			return monster_mob;
		}
		
		public static Mob get_freedom_farm_mob(){
			if(freedom_farm_mob == null){
				freedom_farm_mob = new Mob();
				
				freedom_farm_mob.new_ally(get_diligence_mob());
				
			}
			return freedom_farm_mob;
		}
		
		public static Mob get_amazon_mob(){
			if(amazon_mob == null){
				amazon_mob = new Mob();
				//likes: Sin
				amazon_mob.new_ally(get_sin_mob());
				amazon_mob.new_ally(get_empress_mob());
				//Dislikes: ?
				

				amazon_mob.new_topic(FPalace_topics.fresh_meat());
								
			}
			return amazon_mob;
		}
		
		public static Mob get_sin_mob(){
			if(sin_mob == null){
				sin_mob = new Mob();
				//likes: Patience, Temperance
				sin_mob.new_ally(get_patience_mob());
				sin_mob.new_ally(get_temperance_mob());
				//Dislikes: Chastity
				sin_mob.new_enemy(get_chastity_mob());
				
				sin_mob.new_ideal(trait_high_beauty());
				
				
			}
			return sin_mob;
		}
		
		public static Mob get_humility_mob(){
			if(humility_mob == null){
				humility_mob = new Mob();
				//likes: Dilligence, Temperance
				humility_mob.new_ally(get_diligence_mob());
				humility_mob.new_ally(get_temperance_mob());
				//Dislikes: Humility
				humility_mob.new_enemy(humility_mob);
				
				humility_mob.new_ideal(trait_high_willpower());
				humility_mob.new_ideal(trait_beauty_loss());
				
				
			}
			return humility_mob;
		}
		
		public static Mob get_kindness_mob(){
			if(kindness_mob == null){
				kindness_mob = new Mob();
				//likes: Chastity, Charity
				kindness_mob.new_ally(get_chastity_mob());
				kindness_mob.new_ally(get_charity_mob());
				//dislikes: Patience
				kindness_mob.new_enemy(get_patience_mob());
				
				kindness_mob.new_ideal(trait_high_strength());
				
				
			}
			return kindness_mob;
		}
		
		public static Mob get_patience_mob(){
			if(patience_mob == null){
				patience_mob = new Mob();
				//likes: Sin, Charity
				patience_mob.new_ally(get_sin_mob());
				patience_mob.new_ally(get_charity_mob());
				//dislikes: Diligence
				patience_mob.new_enemy(get_diligence_mob());
				
				patience_mob.new_ideal(trait_high_wisdom());
				
				
			}
			return patience_mob;
		}
		
		public static Mob get_diligence_mob(){
			if(diligence_mob == null){
				diligence_mob = new Mob();
				//likes: Humility, Chastity
				diligence_mob.new_ally(get_humility_mob());
				diligence_mob.new_ally(get_chastity_mob());
				//dislikes: Charity
				diligence_mob.new_enemy(get_charity_mob());
				
				diligence_mob.new_ideal(trait_high_intelligence());
				
				
			}
			return diligence_mob;
		}
		
		public static Mob get_charity_mob(){
			if(charity_mob == null){
				charity_mob = new Mob();
				//likes: Kindness, Patience
				charity_mob.new_ally(get_kindness_mob());
				charity_mob.new_ally(get_patience_mob());
				//dislikes: Temperance
				charity_mob.new_enemy(get_temperance_mob());
				
				charity_mob.new_ideal(trait_high_dexterity());
				
				
			}
			return charity_mob;
		}
		
		public static Mob get_temperance_mob(){
			if(temperance_mob == null){
				temperance_mob = new Mob();
				//likes: Humility, Sin
				temperance_mob.new_ally(get_humility_mob());
				temperance_mob.new_ally(get_sin_mob());
				//dislikes: Kindness
				temperance_mob.new_enemy(get_kindness_mob());
				
				temperance_mob.new_ideal(trait_high_finalitution());
				
				
			}
			return temperance_mob;
		}
		
		public static Mob get_chastity_mob(){
			if(chastity_mob == null){
				chastity_mob = new Mob();
				//likes: Diligence, Kindness
				chastity_mob.new_ally(get_diligence_mob());
				chastity_mob.new_ally(get_kindness_mob());
				//dislikes: Sin
				chastity_mob.new_enemy(get_sin_mob());
				
				chastity_mob.new_ideal(trait_high_charisma());
				
				//Should add a dislike for lust increases/decreases that is equal to or greater then the normal character like of lust changes
			}
			return chastity_mob;
		}
		
		public static Mob get_heaven_mob(){
			if(heaven_mob == null){
				heaven_mob = new Mob();
				
				heaven_mob.new_enemy(get_hell_mob());
			}
			
			return heaven_mob;
		}
		
		public static Mob get_hell_mob(){
			if(hell_mob == null){
				hell_mob = new Mob();
				
				hell_mob.new_enemy(get_heaven_mob());
			}
			
			return hell_mob;
		}
		
		
		public static String get_stat_name_by_id(int stat_id){
			String ret = "?";
			if(stat_names == null){
				stat_names =new Stat[0]; // new Array()
				stat_names[str_id] = stat_strength();
				stat_names[dex_id] = stat_dexterity();
				stat_names[con_id] = stat_finalitution();
				stat_names[sex_appeal_id] = stat_sex_appeal();
				stat_names[int_id] = stat_intelligence();
				stat_names[wis_id] = stat_wisdom();
				stat_names[will_id] = stat_willpower();
				stat_names[cha_id] = stat_charisma();
				stat_names[max_hp_id] = stat_max_hp();
				stat_names[lust_id] = stat_lust();
				stat_names[curr_hp_id] = stat_curr_hp();
				stat_names[max_lust_id] = stat_max_lust();
				stat_names[penis_length_id] = stat_penis_length();
				stat_names[penis_girth_id] = stat_penis_girth();
				stat_names[breast_size_id] = stat_breast_size();
				stat_names[nipple_size_id] = stat_nipple_length();
				stat_names[balls_size_id] = stat_ball_size();
				stat_names[bust_id] = stat_bust();
				stat_names[waist_id] = stat_waist();
				stat_names[hips_id] = stat_hips();
				//stat_names[cum_volume_id] = stat_cum_volume();
				stat_names[anal_width_id] = stat_anal_width();
				stat_names[anal_depth_id] = stat_anal_depth();
				stat_names[vaginal_width_id] = stat_vaginal_width();
				stat_names[vaginal_depth_id] = stat_vaginal_depth();
				stat_names[milk_volume_id] = stat_milk_volume();
				stat_names[min_lust_id] = stat_min_lust();
				stat_names[age_id] = stat_age();
				stat_names[semen_fertility_id] = stat_semen_fertility();
				stat_names[egg_fertility_id] = stat_womb_fertility();
				stat_names[bloat_id] = stat_bloat();
				stat_names[height_id] = stat_height();
				stat_names[clit_length] = stat_clit_length();
				stat_names[biomass_consumed] = stat_biomass_consumed();
				stat_names[curr_mp_id] = stat_curr_mp();
				stat_names[max_mp_id] = stat_max_mp();
				stat_names[curr_fatigue_id] = stat_curr_fatigue();
				stat_names[max_fatigue_id] = stat_max_fatigue();
				stat_names[erection_ratio_id] = stat_erection_ratio();
				stat_names[weight_id] = stat_weight();
				stat_names[max_weight_id] = stat_max_weight();
				stat_names[hair_length_id] = stat_hair_length();
				stat_names[hair_colour_id] = stat_hair_colour();
				stat_names[eye_colour_id] = stat_eye_colour();
				stat_names[skin_colour_id] = stat_skin_colour();
				stat_names[goo_colour_id] = stat_goo_colour();
				stat_names[fur_colour_id] = stat_fur_colour();
				stat_names[scale_colour_id] = stat_scale_colour();
			}
			
			if(stat_names[stat_id] != null) ret = stat_names[stat_id].getName();
			
			return ret;
		}
		
		public static BodyPart new_head(Race r){
			BodyPart p = new BodyPart();
				p.set_name("head");
				p.set_part_id(FPalaceHelper.head_slot);
				p.add_description("</pronoun> is a </r>");
				
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(thorax_slot);
				p.new_connect_slot(barrel_slot);
				p.new_connect_slot(horn_slot);
				p.new_connect_slot(hair_slot);
				p.new_connect_slot(eyes_slot);
				p.set_display_direction(BodyPart.display_top);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.height_id);
				p.set_display_width_mod(0.64);
				
				p.set_crit_part();
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 5);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 5);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 5);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 5);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 10);
				
				CharAction a = new CharAction();
				a.setName("Talk down");
				a.set_attack_flag(CharAction.attack_type_single_target, "Skills");
				a.set_attack_description("Attempt to talk an opponent out of fighting you. ");
				a.set_requirement(FPalaceHelper.curr_mp_id,1);
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.people_id);
				challenge.set_defense_stat(FPalace_skills.concentration_id);
				challenge.setVariability(20);
				challenge.setText("Talk down");
				Consequence consequence = new Consequence();
				consequence.amt_by_roll_flag();
				consequence.addConsequence(-Character.relations_affect_id,Consequence.amt_from_roll_const, "</n2> tries to talk </n> out of fighting, and provides a persuasive argument. ",0);
				consequence.addConsequence(Character.relations_affect_id,1, "",0,0,0,-1,true);
				consequence.addConsequence(Character.relations_affect_id,Consequence.amt_from_roll_const, "</n2> tries to talk </n> down, but only seems to anger </objnoun> more. ",-1);
				consequence.addConsequence(Character.relations_affect_id,-1, "",-1,0,0,-1,true);
				
				a.addChallenge(challenge,consequence);
								
			p.new_attack(a);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_hair(Race r){
			return new_hair(r,1,5.9);
		}
		public static BodyPart new_hair(Race r, int s1, double s2){
            // s1 = 1, s2 = 5.9
			BodyPart p = new BodyPart();
				p.set_name("hair");
				p.set_part_id(FPalaceHelper.hair_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(head_slot);
				p.set_display_direction(BodyPart.display_back);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.new_stat(hair_length_id, stat_hair_length(), s1);
				
				BodyPartState ps = new BodyPartState();
					ps.new_ratio_stat(FPalaceHelper.hair_length_id);
					ps.new_ratio_stat(FPalaceHelper.height_id);
					ps.new_comparison("<=", 0.005, 1, "", "and is only evident as stuble. " );
					ps.new_comparison("<=", 0.02, 1, "", "and is cut short and uniform. " );
					ps.new_comparison("<=", 0.05, 1, "", "and falls to </noun> ears. " );
					ps.new_comparison("<=", 0.1, 1, "", "and is shoulder length. " );
					ps.new_comparison("<=", 0.2, 1, "", "and falls past </noun> shoulders. " );
					ps.new_comparison("<", 0.4, 1, "", "and falls to midback. ");
					ps.new_comparison(">=", 0.4, 1, "", "and trails down to </noun> backside. ");
					
				p.set_part_state(ps);
				
				p.new_stat(hair_colour_id, stat_hair_colour(), s2);
				
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_eyes(Race r){
			return new_eyes(r,0.0);
		}
		public static BodyPart new_eyes(Race r, Double s1){
            // s1 = 0
			BodyPart p = new BodyPart();
				p.set_name("eyes");
				p.set_part_id(FPalaceHelper.eyes_slot);
				p.add_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(head_slot);
				p.set_display_direction(BodyPart.display_front);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				p.set_display_length_mod(0.15);
				
				p.set_display_width_stat(FPalaceHelper.height_id);
				p.set_display_width_mod(0.44);
				
				p.new_stat(eye_colour_id, stat_eye_colour(), s1);
				
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_left_arms(Race r){
			BodyPart p = new BodyPart();
				p.set_name("left arm");
				p.set_pair_name("arms");
				p.set_part_id(FPalaceHelper.arms_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(thorax_slot);
				p.new_connect_slot(hands_slot);
				
				p.set_display_direction(BodyPart.display_left);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.str_id);
				p.set_display_width_mod(2);
				
				CharAction a = new CharAction();
				a.setName("Defend");
				a.set_attack_flag(CharAction.attack_type_self_target);
				a.set_attack_description("Defend yourself from a single attack. ");
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.blocking_id);
				challenge.set_defense_stat(-1, 0);
				challenge.setVariability(0);
				challenge.setText("Defend");
				Consequence consequence = new Consequence();
				consequence.set_change_skills();
				
					TickEffect tf = new TickEffect();
					tf.set_end_tick(1);
					Consequence c2 = new Consequence();
					c2.set_change_skills();
					c2.addConsequence(FPalace_skills.blocking_id,-10, "</n> stops blocking. ", 0);
					
					tf.set_end_consequence(c2);
					
				consequence.addConsequence(FPalace_skills.blocking_id,10, "</n2> defends </objnoun>self. ",0,0,0,-1, false, tf);
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 17);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_right_arms(Race r){
			BodyPart p = new BodyPart();
				p.set_name("right arm");
				p.set_pair_name("arms");
				p.set_part_id(FPalaceHelper.arms_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(thorax_slot);
				p.new_connect_slot(hands_slot);
				
				p.set_display_direction(BodyPart.display_right);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.str_id);
				p.set_display_width_mod(2);
				
				p.set_mirror_display();
				
				CharAction a = new CharAction();
				a.setName("Defend");
				a.set_attack_flag(CharAction.attack_type_self_target);
				a.set_attack_description("Defend yourself from a single attack. ");
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.blocking_id);
				challenge.set_defense_stat(-1, 0);
				challenge.setVariability(0);
				challenge.setText("Defend");
				Consequence consequence = new Consequence();
				consequence.set_change_skills();
				
					TickEffect tf = new TickEffect();
					tf.set_end_tick(1);
					Consequence c2 = new Consequence();
					c2.set_change_skills();
					c2.addConsequence(FPalace_skills.blocking_id,-10, "</n> stops blocking. ", 0);
					
					tf.set_end_consequence(c2);
					
				consequence.addConsequence(FPalace_skills.blocking_id,10, "</n2> defends </objnoun>self. ",0,0,0,-1, false, tf);
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 17);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_left_hands(Race r){
			BodyPart p = new BodyPart();
				p.set_name("left hand");
				p.set_pair_name("hands");
				p.set_part_id(FPalaceHelper.hands_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				p.set_num_hold_slots(1);
				
				p.new_connect_slot(arms_slot);
				
				p.set_display_direction(BodyPart.display_bottom);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.str_id);
				p.set_display_width_mod(2);
				
				Challenge inter_chal = new Challenge(true);
				inter_chal.set_attack_stat(FPalace_skills.concentration_id);
				inter_chal.set_defense_stat(-1,10);
				inter_chal.setVariability(10);
			
				CharAction a = new CharAction();
				a.setName("Attack");
				a.set_attack_flag();
				a.set_attack_description("Strike out at a single foe. ");
				a.set_attack_order(0);
				a.set_fire_weapon_challenge();
				//dodge
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.dodging_id);
				challenge.setVariability(10);
				challenge.setText("Attack");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out and strikes </n> successfully, ",0,1,0,1);
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(0,0, "</n2> misses. ",-1);
				
				a.addChallenge(challenge,consequence);
				
				//parry
				challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.parrying_id);
				challenge.setVariability(10);
				challenge.setText("");
				consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,2);
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
				
				a.addChallenge(challenge,consequence);
				//block
				challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.blocking_id);
				challenge.setVariability(10);
				challenge.setText("");
				consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.set_max_damage(5);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
				consequence.set_interupt_chal(inter_chal);
				
					TickEffect tf = new TickEffect();
					tf.set_status_id(TickEffect.prone_status);
					tf.set_end_tick(4);
					Consequence c2 = new Consequence();
					c2.addConsequence(FPalaceHelper.dex_id,1, "</n> recovers </noun> feet. ", 0);
					
					tf.set_end_consequence(c2);
					
					c2 = new Consequence();
					c2.addConsequence(FPalaceHelper.dex_id,-1, "</n> struggles to keep </noun> feet. ", 0);
					tf.set_tick_consequence(1, c2);
					
				consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> manages to unbalance </n>. ",5,0,0,-1, false, tf);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n> blocks most of the blow. ",-1);
				consequence.amt_by_roll_flag();
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				a = new CharAction();
				a.setName("Use Item");
				a.set_attack_flag(CharAction.attack_type_self_target);
				a.set_attack_description("Use an item on yourself. ");
				challenge = new Challenge(true);
				challenge.set_attack_stat(-1,1);
				challenge.set_defense_stat(-1,0);
				challenge.setVariability(0);
				challenge.setText("Use Item");
				
				DynamicConsequence dconsequence = new DynamicConsequence();
				dconsequence.set_consequence_list("", DynamicConsequence.list_inventory, DynamicConsequence.list_useitem);
				dconsequence.addConsequence(0,0,"", 0);
				
				a.addChallenge(challenge,dconsequence);
				
				p.new_attack(a);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 7);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_right_hands(Race r){
			BodyPart p = new BodyPart();
				p.set_name("right hand");
				p.set_pair_name("hands");
				p.set_part_id(FPalaceHelper.hands_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				p.set_num_hold_slots(1);
				
				p.new_connect_slot(arms_slot);
				
				p.set_display_direction(BodyPart.display_bottom);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.str_id);
				p.set_display_width_mod(2);
				
				p.set_mirror_display();
				
				Challenge inter_chal = new Challenge(true);
				inter_chal.set_attack_stat(FPalace_skills.concentration_id);
				inter_chal.set_defense_stat(-1,10);
				inter_chal.setVariability(10);
			
				CharAction a = new CharAction();
				a.setName("Attack");
				a.set_attack_flag();
				a.set_attack_description("Strike out at a single foe. ");
				a.set_attack_order(0);
				a.set_fire_weapon_challenge();
				//dodge
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.dodging_id);
				challenge.setVariability(10);
				challenge.setText("Attack");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out and strikes </n> successfully, ",0,1,0,1);
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(0,0, "</n2> misses. ",-1);
				
				a.addChallenge(challenge,consequence);
				
				//parry
				challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.parrying_id);
				challenge.setVariability(10);
				challenge.setText("");
				consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "",0,1,0,2);
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(0,0, "</n> manages to parry the blow however! ",-1);
				
				a.addChallenge(challenge,consequence);
				//block
				challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.blocking_id);
				challenge.setVariability(10);
				challenge.setText("");
				consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.set_max_damage(5);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "and lands a clean hit upon </n>. ",0);
				consequence.set_interupt_chal(inter_chal);
				
					TickEffect tf = new TickEffect();
					tf.set_status_id(TickEffect.prone_status);
					tf.set_end_tick(4);
					Consequence c2 = new Consequence();
					c2.addConsequence(FPalaceHelper.dex_id,1, "</n> recovers </noun> feet. ", 0);
					
					tf.set_end_consequence(c2);
					
					c2 = new Consequence();
					c2.addConsequence(FPalaceHelper.dex_id,-1, "</n> struggles to keep </noun> feet. ", 0);
					tf.set_tick_consequence(1, c2);
					
				consequence.addConsequence(FPalaceHelper.curr_hp_id,0, "</n2> manages to unbalance </n>. ",5,0,0,-1, false, tf);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "but </n> blocks most of the blow. ",-1);
				consequence.amt_by_roll_flag();
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				a = new CharAction();
				a.setName("Use Item");
				a.set_attack_flag(CharAction.attack_type_self_target);
				a.set_attack_description("Use an item on yourself. ");
				challenge = new Challenge(true);
				challenge.set_attack_stat(-1,1);
				challenge.set_defense_stat(-1,0);
				challenge.setVariability(0);
				challenge.setText("Use Item");
				
				DynamicConsequence dconsequence = new DynamicConsequence();
				dconsequence.set_consequence_list("", DynamicConsequence.list_inventory, DynamicConsequence.list_useitem);
				dconsequence.addConsequence(0,0,"", 0);
				
				a.addChallenge(challenge,dconsequence);
				
				p.new_attack(a);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 7);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_left_feet(Race r){
			BodyPart p = new BodyPart();
				p.set_name("left foot");
				p.set_pair_name("feet");
				p.set_part_id(FPalaceHelper.feet_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(legs_slot);
				
				p.set_display_direction(BodyPart.display_bottom);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				CharAction a = new CharAction();
				a.setName("Run Away!");
				a.set_attack_flag(CharAction.attack_type_all_enemy_target_single_conseq);//should target all enemies
				a.set_attack_description("Run from combat to the nearest exit. ");
				Challenge challenge = new Challenge();
				
				challenge.set_attack_stat(FPalaceHelper.dex_id);
				challenge.set_defense_stat(FPalaceHelper.dex_id);
				challenge.setVariability(6);
				challenge.setText("Run Away!");
				RoomConsequence rconsequence = new RoomConsequence();
				rconsequence.addConsequence(0,0, "</n2> runs away from </n>! ",0);
				rconsequence.addConsequence(0,0, "</n2> tries to run away, but </n> stops </objnoun2>. ",-1);
				rconsequence.add_room_effect();
				a.addChallenge(challenge,rconsequence);
				p.new_attack(a);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 6);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_right_feet(Race r){
			BodyPart p = new BodyPart();
				p.set_name("right foot");
				p.set_pair_name("feet");
				p.set_part_id(FPalaceHelper.feet_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(legs_slot);
				
				p.set_display_direction(BodyPart.display_bottom);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_mirror_display();
				
				CharAction a = new CharAction();
				a.setName("Run Away!");
				a.set_attack_flag(CharAction.attack_type_all_enemy_target_single_conseq);//should target all enemies
				a.set_attack_description("Run from combat to the nearest exit. ");
				Challenge challenge = new Challenge();
				
				challenge.set_attack_stat(FPalaceHelper.dex_id);
				challenge.set_defense_stat(FPalaceHelper.dex_id);
				challenge.setVariability(6);
				challenge.setText("Run Away!");
				RoomConsequence rconsequence = new RoomConsequence();
				rconsequence.addConsequence(0,0, "</n2> runs away from </n>! ",0);
				rconsequence.addConsequence(0,0, "</n2> tries to run away, but </n> stops </objnoun2>. ",-1);
				rconsequence.add_room_effect();
				a.addChallenge(challenge,rconsequence);
				p.new_attack(a);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 6);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				
			p.set_race(r);
			return p;
		}
				
		public static BodyPart new_horns(Race r){
			BodyPart p = new BodyPart();
				p.set_name("horns");
				p.set_part_id(FPalaceHelper.horn_slot);
				p.add_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(head_slot);
				
				p.set_display_direction(BodyPart.display_front);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				
				//Should have a "gore" attack
				CharAction a = new CharAction();
				a.setName("Gore");
				a.set_attack_flag(CharAction.attack_type_single_target, "Skills");
				a.set_attack_description("Strike out at a single foe with your horns. ");
				a.set_requirement(FPalaceHelper.curr_fatigue_id,1);
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.melee_id);
				challenge.set_defense_stat(FPalace_skills.dodging_id);
				challenge.setVariability(10);
				challenge.setText("Gore");
				Consequence consequence = new Consequence();
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,4);
					inter_chal.setVariability(10);
				
				consequence.set_damage_type(FPalaceHelper.pierce_damage_type().get_id());
				consequence.set_interupt_chal(inter_chal);
				consequence.set_max_damage(10);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,Consequence.amt_from_roll_const, "</n2> charges into </n> with </noun2> horns. ",0);
				consequence.addConsequence(0,0, "</n2> charges forward aimlessly. ",-1);
				consequence.amt_by_roll_flag();
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
			p.set_race(r);
			return p;
		}
		
		
		public static BodyPart new_udder(Race r){
			BodyPart p = new BodyPart();
				p.set_name("udder");
				p.set_part_id(FPalaceHelper.udder_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(hips_slot);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.milk_volume_id, FPalaceHelper.stat_milk_volume(), 500);
				
				p.set_display_direction(BodyPart.display_front);
				
				p.set_display_length_stat(FPalaceHelper.breast_size_id);
				p.set_display_length_mod(1);
				
				p.set_display_width_stat(FPalaceHelper.breast_size_id);
				p.set_display_width_mod(1);
				
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_tail(Race r){
			BodyPart p = new BodyPart();
				p.set_name("tail");
				p.set_part_id(FPalaceHelper.tail_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(hips_slot);
				
				p.set_display_direction(BodyPart.display_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 24);
				
				
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_left_legs(Race r){
			BodyPart p = new BodyPart();
				p.set_name("left leg");
				p.set_pair_name("legs");
				p.set_part_id(FPalaceHelper.legs_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(barrel_slot);
				p.new_connect_slot(thighs_slot);
				p.new_connect_slot(abdomen_slot);
				p.new_connect_slot(feet_slot);
				
				p.set_display_direction(BodyPart.display_bottom_left);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.hips_id);
				p.set_display_width_mod(0.14);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 27);
				
				/*CharAction a = new CharAction();
				a.setName("Knee");
				a.set_attack_flag(CharAction.attack_type_single_target, "Skills");
				a.set_requirement(FPalaceHelper.curr_fatigue_id,1);
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.dodging_id);
				challenge.setVariability(10);
				challenge.setText("Knee");
				Consequence consequence = new Consequence();
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,4);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "</n2> knees </n>. ",0);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-0.5, "</n2> crushes </n>s balls. ",0,0,0,-1, false, null, FPalaceHelper.balls_slot);//need this to target specific part id...
				consequence.addConsequence(0,0, "</n2> misses as </pronoun2> lashes out with a leg. ",-1);
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);*/
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_right_legs(Race r){
			BodyPart p = new BodyPart();
				p.set_name("right leg");
				p.set_pair_name("legs");
				p.set_part_id(FPalaceHelper.legs_slot);
				p.add_description("</noun> </bpn> is </r>");
				p.add_pair_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(barrel_slot);
				p.new_connect_slot(thighs_slot);
				p.new_connect_slot(abdomen_slot);
				p.new_connect_slot(feet_slot);
				
				p.set_display_direction(BodyPart.display_bottom_right);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.hips_id);
				p.set_display_width_mod(0.14);
				
				p.set_mirror_display();
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 27);
				
				
				/*CharAction a = new CharAction();
				a.setName("Knee");
				a.set_attack_flag(CharAction.attack_type_single_target, "Skills")
				a.set_requirement(FPalaceHelper.curr_fatigue_id,1);
				Challenge challenge = new Challenge(true);
				challenge.set_attack_stat(FPalace_skills.striking_id);
				challenge.set_defense_stat(FPalace_skills.dodging_id);
				challenge.setVariability(10);
				challenge.setText("Knee");
				Consequence consequence = new Consequence();
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,4);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "</n2> knees </n>. ",0);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-0.5, "</n2> crushes </n>s balls. ",0,0,0,-1, false, null, FPalaceHelper.balls_slot);//need this to target specific part id...
				consequence.addConsequence(0,0, "</n2> misses as </pronoun2> lashes out with a leg. ",-1);
				
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);*/
				
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_torso(Race r){
			return new_torso(r,30,26);
		}
		public static BodyPart new_torso(Race r, int s1, int s2){
            //Race r,s1 = 30, s2 = 26
			BodyPart p = new BodyPart();
				p.set_name("torso");
				p.set_part_id(FPalaceHelper.torso_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(head_slot);
				p.new_connect_slot(arms_slot);
				p.new_connect_slot(arms_slot);
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(barrel_slot);
				p.new_connect_slot(breasts_slot);
				p.new_connect_slot(wings_slot);
				
				p.set_display_direction(BodyPart.display_bottom_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				p.set_display_width_stat(FPalaceHelper.bust_id);
				p.set_display_width_mod(0.3);
				
				p.set_display_width2_stat(FPalaceHelper.waist_id);
				p.set_display_width2_mod(0.3);
				
				p.new_stat(bust_id, stat_bust(), s1);
				
				p.new_stat(waist_id, stat_waist(), s2);
				
				
				
				//there's alot to be done with this still... like only showing the description at certains times! blarg! - DONE!
				p.new_stat(bloat_id, stat_bloat());
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.set_crit_part();
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 5);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 5);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 5);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 5);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 10);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_barrel(Race r){
			return new_barrel(r, 30, 26);
		}
        public static BodyPart new_barrel(Race r, int s1, int s2){//
            //Race r,s1 = 30, s2 = 26
			BodyPart p = new BodyPart();
				p.set_name("barrel");
				p.set_part_id(FPalaceHelper.barrel_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(head_slot);
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(barrel_slot);
				p.new_connect_slot(thighs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(breasts_slot);
				p.new_connect_slot(wings_slot);
				
				p.set_display_direction(BodyPart.display_bottom_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				p.set_display_width_stat(FPalaceHelper.bust_id);
				p.set_display_width_mod(0.3);
				
				p.new_stat(bust_id, stat_bust(), s1);
				
				p.new_stat(waist_id, stat_waist(), s2);
				//there's alot to be done with this still... like only showing the description at certains times! blarg! - DONE!
				p.new_stat(bloat_id, stat_bloat());
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.set_crit_part();
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 5);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 5);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 5);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 5);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 10);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_wings(Race r){
			BodyPart p = new BodyPart();
				p.set_name("wings");
				p.set_part_id(FPalaceHelper.wings_slot);
				p.add_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(thorax_slot);
								
				p.set_display_direction(BodyPart.display_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),5);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 5);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),3);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 3);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_abdomen(Race r){
			return new_abdomen(r, 30, 26);
		}
		public static BodyPart new_abdomen(Race r, int s1, int s2){
            //s1=30, s2=26
			BodyPart p = new BodyPart();
				p.set_name("abdomen");
				p.set_part_id(FPalaceHelper.abdomen_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(thorax_slot);
				
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				
				p.new_connect_slot(tail_slot);
				
				p.new_connect_slot(cock_slot);
				p.new_connect_slot(balls_slot);
				p.new_connect_slot(vag_slot);
				p.new_connect_slot(clit_slot);
				
				//p.set_display_direction(BodyPart.display_up_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				Stat s = new Stat(waist_id);
				s.set_min(-2);
				s.new_description("</noun> abdomen is </"+waist_id+"> inches around. ");
				s.new_increase_description( "</n>s abdomen bulges outward. ");
				s.new_descrease_description("</n>s abdomen seems to contract. ");
				
				p.new_stat(waist_id, s, s2);
				
				
				
				p.new_stat(bloat_id, stat_bloat());
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),5);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 5);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),3);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 3);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 11);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_thorax(Race r){
			return new_thorax(r, 30, 26);
		}
		public static BodyPart new_thorax(Race r, int s1, int s2){
            //Race r,s1 = 30, s2=26
			BodyPart p = new BodyPart();
				p.set_name("thorax");
				p.set_part_id(FPalaceHelper.thorax_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(head_slot);
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(abdomen_slot);
				p.new_connect_slot(arms_slot);
				p.new_connect_slot(arms_slot);
				p.new_connect_slot(wings_slot);
				
				p.set_display_direction(BodyPart.display_bottom_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				Stat s = new Stat(bust_id);
				s.set_min(-2);
				s.new_description("</noun> thorax is </"+bust_id+"> inches around and ");
				s.new_increase_description( "</n>s thorax bulges outward. ");
				s.new_descrease_description("</n>s thorax seems to contract. ");
				
				p.new_stat(bust_id, s, s1);
				
				p.new_stat(bloat_id, stat_bloat());
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),3);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 3);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),3);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 3);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 1);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 1);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 1);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 1);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 11);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_hips(Race r){
			return new_hips(r,30,3,6);
		}
		public static BodyPart new_hips(Race r, int s1, int s2, int s3){
            //Race r,s1 = 30, s2= 3, s3= 6
			BodyPart p = new BodyPart();
				p.set_name("hips");
				p.set_part_id(FPalaceHelper.hips_slot);
				p.add_description("");
				
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(thorax_slot);
				p.new_connect_slot(udder_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(vag_slot);
				p.new_connect_slot(clit_slot);
				p.new_connect_slot(balls_slot);
				p.new_connect_slot(cock_slot);
				p.new_connect_slot(tail_slot);
				
				p.set_display_direction(BodyPart.display_bottom_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.waist_id);
				p.set_display_width_mod(0.3);
				
				p.set_display_width2_stat(FPalaceHelper.hips_id);
				p.set_display_width2_mod(0.3);
				
				p.new_stat(hips_id, stat_hips(),s1);
				p.new_stat(anal_width_id, stat_anal_width(),s2);
				p.new_stat(anal_depth_id, stat_anal_depth(),s3);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.set_crit_part();
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 13);
				
					BodyPartState ps = new BodyPartState();
					ps.new_ratio_stat(FPalaceHelper.hips_id);
					ps.new_ratio_stat(FPalaceHelper.waist_id);
					ps.set_stat_effected(0);
					ps.new_comparison(">=", 1.5,1,"", "</n>s ass protrudes from </noun> hips, every slight motion sending a torrent of ripples across it. ");
					ps.new_comparison(">=", 1.3,1,"", "</n>s ass jiggles softly as </pronoun> moves. ");
					ps.new_comparison("<", 1.3,1,"");
					
			p.set_part_state(ps);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_thighs(Race r){
			return new_thighs(r, 30, 3, 6);
		}
		public static BodyPart new_thighs(Race r, int s1, int s2, int s3){
            //Race r,s1= 30, s2 = 3, s3= 6
			BodyPart p = new BodyPart();
				p.set_name("thighs");
				p.set_part_id(FPalaceHelper.thighs_slot);
				p.add_description("");
				
				p.new_connect_slot(barrel_slot);
				p.new_connect_slot(udder_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(legs_slot);
				p.new_connect_slot(vag_slot);
				p.new_connect_slot(clit_slot);
				p.new_connect_slot(balls_slot);
				p.new_connect_slot(cock_slot);
				p.new_connect_slot(tail_slot);
				
				p.set_display_direction(BodyPart.display_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.hips_id);
				p.set_display_width_mod(0.3);
				
				p.new_stat(hips_id, stat_hips(),s1);
				p.new_stat(anal_width_id, stat_anal_width(),s2);
				p.new_stat(anal_depth_id, stat_anal_depth(),s3);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.set_crit_part();
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 0.5);
				
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 10);
				
					BodyPartState ps = new BodyPartState();
					ps.new_ratio_stat(FPalaceHelper.hips_id);
					ps.new_ratio_stat(FPalaceHelper.waist_id);
					ps.set_stat_effected(0);
					ps.new_comparison(">=", 1.5,1,"", "</n>s ass protrudes from </noun> hips, every slight motion sending a torrent of ripples across it. ");
					ps.new_comparison(">=", 1.3,1,"", "</n>s ass jiggles softly as </pronoun> moves. ");
					ps.new_comparison("<", 1.3,1,"");
					
			p.set_part_state(ps);
				
			p.set_race(r);
			return p;
		}
		public static BodyPart new_breasts(Race r){
			return new_breasts(r,1,1,70);
		}
		public static BodyPart new_breasts(Race r, int s1){
			return new_breasts(r,s1,1,70);
		}
		public static BodyPart new_breasts(Race r, int s1, int s2, int s3){
            //Race r,s1= 1, s2 = 1, s3 = 70
			BodyPart p = new BodyPart();
				p.set_name("breasts");
				p.set_part_id(breasts_slot);
				p.add_description("</noun> </bpn> are </r>");
				
				p.new_connect_slot(torso_slot);
				
				p.new_stat(breast_size_id, stat_breast_size(),s1);
				//p.set_part_id(nipples_slot); --probably need to break these into a seperate BodyPart, but we'll see - nipple rings, once we get into items
				
				p.new_stat(nipple_size_id, stat_nipple_length(),s2);
				
				p.new_stat(milk_volume_id, stat_milk_volume(),s3);
				
				p.set_display_direction(BodyPart.display_mid_top);
				
				p.set_display_length_stat(FPalaceHelper.breast_size_id);
				p.set_display_length_mod(2);
				
				p.set_display_width_stat(FPalaceHelper.bust_id);
				p.set_display_width_mod(0.3);
				
				p.set_display_width2_stat(FPalaceHelper.breast_size_id);
				p.set_display_width2_mod(4);
				
				BodyPartState ps = new BodyPartState();
					ps.new_ratio_stat(FPalaceHelper.lust_id);
					ps.new_ratio_stat(FPalaceHelper.max_lust_id);
					ps.set_stat_effected(nipple_size_id);
					ps.new_comparison(">=", 0.6,1.2,"</n>s nipples pierce out from </noun> breasts. ", "</n>s nipples look painfully erect. ");
					ps.new_comparison(">=", 0.4,1.0,"</n>s nipples begin to show themselves. ", "</n>s nipples stand erect. ");
					ps.new_comparison("<=", 0.1,0.1,"");
					
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
			
			p.set_part_state(ps);
			
			p.set_race(r);
			
			CharAction a = new CharAction();
				a.setName("Flash");
				a.set_attack_flag(CharAction.attack_type_single_target, "Sex");
				a.set_attack_description("Flash your breasts at a single foe. ");
				Challenge challenge = new Challenge();
				
				challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
				challenge.set_defense_stat(FPalaceHelper.wis_id);
				challenge.setVariability(10);
				challenge.setText("Flash");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
				consequence.set_max_damage(20);
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,0);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(-FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "</n2> attempts to distract </n>, flashing </noun2> breasts. ",0);
				consequence.addConsequence(FPalaceHelper.wis_id,-1, "</n>s eyes are glued to </n2>s chest. ",5,1,1);
				consequence.addConsequence(0,0, "</n> ignores </n2>s exposed breasts! ",-1);
				consequence.amt_by_roll_flag();
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
			
			
			
			return p;
		}
		public static BodyPart new_vagina(Race r){
			return new_vagina(r, 3,7,0.5);
		}
		public static BodyPart new_vagina(Race r, int s1, int s2){
			return new_vagina(r, s1,s2,0.5);
		}
		public static BodyPart new_vagina(Race r, int s1, int s2, double s3){
            //Race r,s1= 3, s2 = 7, s3 = 0.5
			BodyPart p = new BodyPart();
				p.set_name("vulva");
				p.set_part_id(vag_slot);
				p.set_get_pregnant();
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(thighs_slot);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				
				p.new_stat(vaginal_width_id, stat_vaginal_width(),s1);
				
				p.new_stat(vaginal_depth_id, stat_vaginal_depth(),s2);
				
				p.set_display_direction(BodyPart.display_bottom_back);
								
				p.set_display_length_mod(0.25);
				
				p.set_display_width_stat(FPalaceHelper.vaginal_width_id);
				
				//this should probably be effected by a part_state based on "time of the month" (aka, number of ticks)
				p.new_stat(egg_fertility_id, stat_womb_fertility(),s3);
				
				CharAction a = new CharAction();
				a.setName("Entice");
				a.set_attack_flag(CharAction.attack_type_single_target, "Sex");
				a.set_attack_description("Entice a single enemy with your groin. ");
				Challenge challenge = new Challenge();
				
				challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
				challenge.set_defense_stat(FPalaceHelper.wis_id);
				challenge.setVariability(10);
				challenge.setText("Entice");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
				consequence.set_max_damage(20);
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,0);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(-FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "</n2> attempts to entice </n>, spreading </noun2> legs wide and gently feeling </noun2> own genitalia. ",0);
				consequence.addConsequence(FPalaceHelper.wis_id,-1, "</n2> manages to unbalance </n>, as </pronoun> oggles </n2>s form. ",5,1,1);
				consequence.addConsequence(0,0, "</n> ignores </n2>! ",-1);
				consequence.amt_by_roll_flag();
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				
				
				
				
			BodyPartState ps = new BodyPartState();
				ps.new_ratio_stat(FPalaceHelper.lust_id);
				ps.new_ratio_stat(FPalaceHelper.max_lust_id);
				ps.set_stat_effected(vaginal_width_id);
				ps.set_stat_effected(vaginal_depth_id);
				ps.new_comparison(">=", 0.7,1.2,"</n>s folds are visibly leaking. ", "</n>s inner thighs are completely covered in juices. ");
				ps.new_comparison(">=", 0.5,1,"</n>s vagina opens its petal like lips. ");
				ps.new_comparison("v", 0.5,0.8,"</n>s slit shuts tight. ");
				
				TickEffect tf = new TickEffect();
					Consequence c2 = new Consequence();
					c2.addConsequence(FPalaceHelper.dex_id,-1, "</n> struggles to keep </noun> feet as </noun> groin cramps up. ", 0);
					TickEffect tf2 = new TickEffect();
						Consequence c3 = new Consequence();
						c3.addConsequence(FPalaceHelper.dex_id,1, "</n> feels more dexterous as </pronoun> recovers from cramps. ", 0);
						c3.addConsequence(FPalaceHelper.str_id,1, "</n> feels stronger as </pronoun> recovers from cramps. ", 0);
						TickEffect tf3 = new TickEffect();
							Consequence c4 = new Consequence();
							c4.addConsequence(FPalaceHelper.min_lust_id,-5, "</n> recovers from </noun> randy state. ", 0);
							tf3.set_end_tick(FPGameGithub.T1_WEEK);
							tf3.set_end_consequence(c4);
						c3.addConsequence(FPalaceHelper.min_lust_id,5, "</n> feels horny as </pronoun> recovers from cramps. ", 0, 0, 0, -1, false, tf3);
						tf2.set_end_tick(FPGameGithub.T1_WEEK);
						tf2.set_end_consequence(c3);
					c2.addConsequence(FPalaceHelper.str_id,-1, "</n> feels weak thanks to cramps. ", 0, 0, 0, -1, false, tf2);
					tf.set_tick_consequence(FPGameGithub.T1_MONTH, c2);
										
				p.add_upkeep(tf);
						
			
			p.set_race(r);
			p.set_part_state(ps);
			
			a = new CharAction();
			
			a.setName("Envelope");
			a.set_attack_flag(CharAction.attack_type_single_target, "Sex");
			a.set_attack_description("Force an opponent to have sex with you. ");
			a.set_requirement(FPalaceHelper.lust_id,25);
			a.set_requirement(FPalaceHelper.curr_fatigue_id,1);
			a.set_delayed_trigger();
			challenge = new Challenge(true);
			
			challenge.set_attack_stat(FPalace_skills.grappling_id);
			challenge.set_defense_stat(FPalace_skills.dodging_id);
			challenge.setVariability(20);
			challenge.setText("Envelope");
			consequence = new Consequence();
			consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> jumps upon </n> and pins </objnoun>. </n> moans out in pleasure as </n2> explores </noun> body. ",0,0,0,1);
				//and now begins the madness... first choice: top half or bottom half
				Challenge challenge1 = new Challenge();
				challenge1.set_attack_stat(-1,1);//challenge1.set_attack_stat(-1,0)
				challenge1.set_defense_stat(-1,0);
				challenge1.setVariability(00);//challenge1.setVariability(20)
				challenge1.setText("");//TODO why zero up there?!
				Consequence consequence1 = new Consequence();
				
					//top half! facial... if breasts are present, try to pull off the top
					consequence1.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
					//consequence1.addConsequence(FPalaceHelper.lust_id,/*25*/1, "</n2> aggressively starts fondling </n>s chest, enticing </objnoun>. ",0,0,0,2);
					consequence1.addConsequence(FPalaceHelper.lust_id,/*25*/1, "</c2><br></c4>",0);
						//check if breasts present
						Challenge challenge2 = new Challenge();
						challenge2.set_attack_stat(-1,1);
						challenge2.set_defense_stat(FPalaceHelper.breast_size_id);
						challenge2.setVariability(0);
						challenge2.setText("Chest");
						Consequence consequence2 = new Consequence();
							//no titties... facesit...
							consequence2.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
							consequence2.addConsequence(FPalaceHelper.lust_id,25, "</n2> forces </noun2> groin into </n>s face. </n> can't help but enjoy the view. ",0,0,0,9);
								Challenge challenge9 = new Challenge();
								challenge9.set_attack_stat(FPalaceHelper.lust_id);
								challenge9.set_defense_stat(-1,40);
								challenge9.setVariability(0);
								challenge9.setText("");
								Consequence consequence9 = new Consequence();
									//attacker is super-aroused and leaking
									consequence9.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence9.addConsequence(FPalaceHelper.lust_id,25, "</n2>s juices flood into </n>s mouth, suffocating </objnoun> with the smell of sex. ",0,0,0,10);
										Challenge challenge10 = new Challenge();
										challenge10.set_attack_stat(FPalaceHelper.lust_id);
										challenge10.set_defense_stat(-1,50);
										challenge10.setVariability(0);
										challenge10.setText("");
										Consequence consequence10 = new Consequence();
										//attacker is ready to climax herself
										consequence10.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
										consequence10.addConsequence(FPalaceHelper.lust_id,40, "</n2> climaxes, forcing </n>s face even deeper into </noun2> cunt. ",0,0,0,-1);
										consequence10.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,-1, true);
										//attacker isn't quite there yet....
										consequence10.addConsequence(FPalaceHelper.lust_id,25, "",-1,0,0,-1);
										consequence10.addConsequence(FPalaceHelper.lust_id,25, "<br></n2> nearly crushes </n>s face as </pronoun2> appreciates the feeling of </n>s sucking for air. ",-1,0,0,1, true);
									//attacker isn't particularly aroused... start from scratch
									consequence9.addConsequence(FPalaceHelper.lust_id,25, "The smell of </n2>s folds have </n>s eyes rolling into </noun> head. ",-1,0,0,-1);
									consequence9.addConsequence(FPalaceHelper.lust_id,15, "<br>",-1,0,0,2,true);
							//titties! attempt to disrobe breasts
							consequence2.addConsequence(FPalaceHelper.lust_id,10, "</n2>s hands dive for </n>s chest, and begin to grope and dig! ",-1,0,0,3);
							Challenge challenge3 = new Challenge();
							challenge3.set_attack_stat(-1,0);
							challenge3.set_defense_stat(-1,0);
							challenge3.set_defense_equip_slot_check(FPalaceHelper.breasts_slot);
							challenge3.setVariability(0);
							challenge3.setText("");
							Consequence consequence3 = new Consequence();
								//clothing found! 
								consequence3.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
								consequence3.addConsequence(FPalaceHelper.lust_id,0, "</n2> pulls at </n>s attempt to cover </noun> breasts. ",-1,0,0,8);
								Challenge challenge8 = new Challenge(true);
								challenge8.set_attack_stat(FPalace_skills.grappling_id);
								challenge8.set_defense_stat(FPalace_skills.grappling_id);
								challenge8.setVariability(10);
								challenge8.setText("");
								Consequence consequence8 = new Consequence();
									consequence8.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence8.add_disrobe(FPalaceHelper.breasts_slot);
									//disrobe success! titties!
									consequence8.addConsequence(FPalaceHelper.lust_id,10, "</n2> rips </n>s coverings and begins to attack </noun> breasts in earnest! </n> moans out from the deep massage. ",0,0,0,3);
									//disrobe failure! horniness increases past even where it was before!
									//need some way for this to effect other character... - flip target flag!
									consequence8.addConsequence(FPalaceHelper.lust_id,25, "</n2> is knocked back as </n> defends </noun> mounds. </n2> is just turned on by </noun2> targets persistance. ",-1,0,0,-1,true);
									
								//no clothing! Titties!
								consequence3.addConsequence(FPalaceHelper.lust_id,10, "</n2> begins to massage </n>s breasts and tweek </noun> nipples! </n> moans out from the sensations. ",0,0,0,11);
								Challenge challenge11 = new Challenge();
										challenge11.set_attack_stat(FPalaceHelper.breast_size_id);
										challenge11.set_defense_stat(-1,1);
										challenge11.setVariability(0);
										challenge11.setText("");
										Consequence consequence11 = new Consequence();
										//attacker has breasts! titty bump!
										consequence11.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
										consequence11.addConsequence(FPalaceHelper.lust_id,25, "</n2> begins to press </noun2> own breasts against </n>s fleshy mounds. ",0,0,0,12);
											Challenge challenge12 = new Challenge();
											challenge12.set_attack_stat(FPalaceHelper.lust_id);
											challenge12.set_defense_stat(-1,40);
											challenge12.setVariability(15);
											challenge12.setText("");
											Consequence consequence12 = new Consequence();
											//attacker can keep going! Head to pussy
											consequence12.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
											consequence12.addConsequence(FPalaceHelper.lust_id,25, "</n2> aggressively starts exploring </n>s groin with </noun2> fingers, enticing </n>. ",0,0,0,4);
											//attacker is done! facesit for climax
											consequence12.addConsequence(FPalaceHelper.lust_id,10, "</n2> bites </noun2> lip, alongside </n>s, dragging it upward before letting go. </n> blinks from the pain and opens </noun> eyes to find </n2>s pussy in </noun> face. ",-1,0,0,9,true);
										//attack has no breasts. Play with tits, then move to cunt
										consequence11.addConsequence(FPalaceHelper.lust_id,10, "</n2> begins to suck on a nipple and smiles as </n> lets out a moan. It isn't long before </n2> begins kissing </n> aggressively. ",-1,0,0,4);
					//bottom half!
					//consequence1.addConsequence(FPalaceHelper.lust_id,25, "</n2> aggressively starts exploring </n>s groin with </noun2> fingers, enticing </n>. ",-1,0,0,4);
						//check for clothes
						Challenge challenge4 = new Challenge();
						challenge4.set_attack_stat(-1,0);
						challenge4.set_defense_stat(-1,0);
						challenge4.set_defense_equip_slot_check(FPalaceHelper.hips_slot);
						challenge4.setVariability(0);
						challenge4.setText("Groin");
						Consequence consequence4 = new Consequence();
							//defenders groin not covered
							consequence4.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
							consequence4.addConsequence(FPalaceHelper.lust_id,10, "</n2> traces a line around </n>s bare groins exploringly. ",0,0,0,5);
							Challenge challenge5 = new Challenge();
							challenge5.set_attack_stat(-1,0);
							challenge5.set_defense_stat(FPalaceHelper.penis_length_id);
							challenge5.setVariability(0);
							challenge5.setText("");
							Consequence consequence5 = new Consequence();
								//defender has male genitals - time to envelope
								consequence5.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
								consequence5.addConsequence(FPalaceHelper.lust_id,25, "As </noun2> fingers fall on </n>s manhood, </n2> quickly begins to stroke it to life. ",-1,0,0,6);
									Challenge challenge6 = new Challenge();
									challenge6.set_attack_stat(FPalaceHelper.vaginal_width_id,-1, Body.get_stat_max);
									challenge6.set_defense_stat(FPalaceHelper.penis_girth_id,-1, Body.get_stat_min);
									challenge6.setVariability(0);
									challenge6.setText("");
									Consequence consequence6 = new Consequence();
									//attackers pussy can't take the girth! STRETCH or move on! 
									consequence6.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence6.addConsequence(FPalaceHelper.lust_id,25, "It isn't long before </n2> begins to lead </n>s cock towards </noun2> pussy, though its massive girth is being an obstacle. ",-1,0,0,13);
										//Stretch that cunt
										Challenge challenge13 = new Challenge();
										challenge13.set_attack_stat(FPalaceHelper.vaginal_width_id,-1, Body.get_stat_max);
										challenge13.set_defense_stat(FPalaceHelper.penis_girth_id,-1, Body.get_stat_min);
										challenge13.setVariability(0);
										challenge13.setText("");
										Consequence consequence13 = new Consequence();
										
											//Can now take the girth... move on to real sex.
											consequence13.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
											consequence13.addConsequence(FPalaceHelper.lust_id,40, "</n> grunts as </noun> dick is enveloped by </n2>s waiting pussy. ",0,0,0,14);
											
											//try and stretch
											consequence13.addConsequence(FPalaceHelper.vaginal_width_id,0.5, "</n2> pounds </noun2> cunt uselessly against the head of </n>s massive cock. ",-1,0,0,13, true);
											consequence13.addConsequence(FPalaceHelper.curr_hp_id,-1, "",-1,0,0,-1, true);
											consequence13.addConsequence(FPalaceHelper.lust_id,20, "<br>",-1,0,0,-1);
											//give up if it's more than 2 inches bigger
											consequence13.addConsequence(FPalaceHelper.lust_id,25, "Realizing the futility of </noun2> task, </n2> gives up, disgruntled. ",-2,0,0,-1, true);
											
									//can take the girth. Check how much length we can take
									consequence6.addConsequence(FPalaceHelper.lust_id,40, "It isn't long before </n2> begins to lead </n>s cock towards </noun2> pussy, which quickly begins to envelope the grunting </n>s manhood. ",-1,0,0,14);
										Challenge challenge14 = new Challenge();
										challenge14.set_attack_stat(FPalaceHelper.vaginal_depth_id,-1, Body.get_stat_max);
										challenge14.set_defense_stat(FPalaceHelper.penis_length_id,-1, Body.get_stat_min);
										challenge14.setVariability(0);
										challenge14.setText("");
										Consequence consequence14 = new Consequence();
										
											//Can now take the entire cock... try for an impregnate....
											consequence14.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
											consequence14.addConsequence(FPalaceHelper.lust_id,40, "The two begin to find a rhythm, groin to groin, </n2> taking all of </n>s length. ",0,0,0,15);
											
											//Bumping the cervix... can still try for an impregnate
											consequence14.addConsequence(FPalaceHelper.lust_id,30, "</n2> rams </objnoun2>self down on </n>s cock and yelps out in pain as it crashes into </noun2> cervix. ",-1,0,0,-1);
											consequence14.addConsequence(FPalaceHelper.lust_id,15, "",-1,0,0,15, true);
												
												Challenge challenge15 = new Challenge();
												challenge15.set_attack_stat(FPalaceHelper.lust_id);
												challenge15.set_defense_stat(-1,50);
												challenge15.setVariability(0);
												challenge15.setText("");
												Consequence consequence15 = new Consequence();
													consequence15.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
													consequence15.set_impregnate(2);
													//Attacker is ready to climax...
													consequence15.addConsequence(FPalaceHelper.lust_id,50, "</n2> lets out a moan as </noun2> body clenches and jerks from orgasm. </n> can't help but loose a load. ",0,0,0,-1);
													consequence15.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,-1,true);
													
													//Not ready for own climax! Keep going!
													consequence15.addConsequence(FPalaceHelper.lust_id,15, "</n> grunts as </pronoun> finds a load of spunk being extracted from </objnoun>. </n2> doesn't look particularly satisfied. ",-1,0,0,-1);
													consequence15.addConsequence(FPalaceHelper.lust_id,15, "<br>",-1,0,0,14, true);
								//defender has no dick... check for a pussy, and some lesbian action
								consequence5.addConsequence(FPalaceHelper.lust_id,15, "</n2>s fingers continue to wander around </n>s groin enticingly. ",0,0,0,7);
								Challenge challenge7 = new Challenge();
								challenge7.set_attack_stat(-1,0);
								challenge7.set_defense_stat(FPalaceHelper.vaginal_depth_id);
								challenge7.setVariability(0);
								challenge7.setText("");
								Consequence consequence7 = new Consequence();
									//has a cunt... time to scissor... 
									consequence7.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence7.addConsequence(FPalaceHelper.lust_id,50, "Finally, </n2> plunges a finger into </n>s waiting pussy. The soft moan let out by </n> makes </n2> *tsk* before maneauvering </noun2> own lips into place. ",-1,0,0,16);
										Challenge challenge16 = new Challenge();
										challenge16.set_attack_stat(FPalaceHelper.lust_id);
										challenge16.set_defense_stat(-1, 50);
										challenge16.setVariability(0);
										challenge16.setText("");
										Consequence consequence16 = new Consequence();
											//Attacker is ready to climax
											consequence16.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
											consequence16.addConsequence(FPalaceHelper.lust_id,50, "</n2> screams out as </pronoun2> climaxes, bringing </n> along for the ride. ",0,0,0,-1);
											consequence16.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,-1,true);
											//Not ready yet... keep going....
											consequence16.addConsequence(FPalaceHelper.lust_id,25, "A moan and a grunt escape the entwined pair. ",-1,0,0,-1);
											consequence16.addConsequence(FPalaceHelper.lust_id,25, "<br>",-1,0,0,16,true);
									//no genitals!? head to the top...
									consequence7.addConsequence(FPalaceHelper.lust_id,15, "Quickly bored by the lack of genitals on </n>, </n2> moves up the anotomy. ",0,0,0,2);
							//defender is wearing something! Try and take it off!
							consequence4.addConsequence(FPalaceHelper.lust_id,10, "</n2> begins to struggle with </n>s converings. ",-1,0,0,17,true);
								Challenge challenge17 = new Challenge();
								challenge17.set_attack_stat(FPalaceHelper.str_id);
								challenge17.set_defense_stat(FPalaceHelper.str_id);
								challenge17.setVariability(10);
								challenge17.setText("");
								Consequence consequence17 = new Consequence();
									consequence17.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence17.add_disrobe(FPalaceHelper.hips_slot);
									//disrobe successfull! Try the bottom again!
									consequence17.addConsequence(FPalaceHelper.lust_id,20, "</n2> manages to rip away at </n>s clothing. ",0,0,0,4);
									//no disrobe! attacker successfully faught off!
									consequence17.addConsequence(FPalaceHelper.lust_id,20, "</n2> is knocked back as </n> defends </noun> groin. </n2> is just turned on by </noun2> targets persistance. ",-1,0,0,-1,true);
							
							
							
			consequence.addConsequence(0,0, "</n2> leaps towards </n>, but </pronoun> deftly step out of the way! ",-1);
						
			a.addChallenge(challenge,consequence);
			a.addChallenge(challenge1,consequence1);
			a.addChallenge(challenge2,consequence2);
			a.addChallenge(challenge3,consequence3);
			a.addChallenge(challenge4,consequence4);
			a.addChallenge(challenge5,consequence5);
			a.addChallenge(challenge6,consequence6);
			a.addChallenge(challenge7,consequence7);
			a.addChallenge(challenge8,consequence8);
			a.addChallenge(challenge9,consequence9);
			a.addChallenge(challenge10,consequence10);
			a.addChallenge(challenge11,consequence11);
			a.addChallenge(challenge12,consequence12);
			a.addChallenge(challenge13,consequence13);
			a.addChallenge(challenge14,consequence14);
			a.addChallenge(challenge15,consequence15);
			a.addChallenge(challenge16,consequence16);
			a.addChallenge(challenge17,consequence17);
			
			p.new_attack(a);
			
			//i still have quite a bit in the way of chaining together consequences here
			a = new CharAction();
			a.setName("Masturbate");
			a.set_personal();
			a.set_attack_flag(-1, "Skills");
			a.set_dialogue("</n> tries to find a secluded area to </c0>. ");
			a.set_requirement(FPalaceHelper.lust_id,25);
			a.set_status_change(" is masturbating here");
			Challenge c = new Challenge();
			c.set_attack_stat(FPalaceHelper.lust_id);
			//how to set a static defense stat
			c.set_defense_stat(-1,25);
			c.setVariability(0);
			c.setText("masturbate");
			//this is something i want to have a few possible chains for, depending on the characters current endowments
			Consequence cons = new Consequence();
			consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
			cons.amt_by_roll_flag();
			cons.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "</n> manages to find a nice spot, and masturbate furiously. </pronoun> appears a little relieved. ",0);
			cons.addConsequence(FPalaceHelper.lust_id,26, "</n> manages to find a nice spot, and masturbate furiously. </pronoun> toils for naught, and just end up even more pent up than before. ",-1);

			a.addChallenge(c,cons);
			
			p.new_action(a);

			return p;
		}
		public static BodyPart new_clit(Race r){
			return new_clit(r,1);
		}	
		public static BodyPart new_clit(Race r, int s1){
            //Race r, s1 = 1
			BodyPart p = new BodyPart();
				p.set_name("clitoris");
				p.set_part_id(clit_slot);
				p.add_description("</noun> </bpn> is </r>");
				
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(thighs_slot);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				
				p.new_stat(clit_length, stat_clit_length(),s1);
				
				p.set_display_length_stat(FPalaceHelper.clit_length);
				
				p.set_display_direction(BodyPart.display_bottom_back);
				
			BodyPartState ps = new BodyPartState();
				ps.new_ratio_stat(FPalaceHelper.lust_id);
				ps.new_ratio_stat(FPalaceHelper.max_lust_id);
				ps.set_stat_effected(clit_length);
				ps.new_comparison(">=", 0.4,1,"</n>s clit bulges out from beneath it's hood. ", "</n>s clit is proudly on display. ");
				ps.new_comparison("v", 0.4,0.1,"</n>s clit once again hides away. ");
				
				
							
			
			p.set_race(r);
			p.set_part_state(ps);
			return p;
		}
		public static BodyPart new_penis(Race r){
			return new_penis(r,6,2,3);
		}
		public static BodyPart new_penis(Race r,Number s1, Number s2){
			return new_penis(r,s1,s2,3);
		}
		public static BodyPart new_penis(Race r,Number s1, Number s2, Number s3){
            //s1:Number = 6, s2:Number = 2, s3:Number = 3
			BodyPart p = new BodyPart();
			p.set_name("penis");
			p.set_part_id(cock_slot);
			p.add_description("</noun> </bpn> is </r>");
			
			p.new_connect_slot(hips_slot);
			p.new_connect_slot(abdomen_slot);
			p.new_connect_slot(thighs_slot);
			
			p.set_display_direction(BodyPart.display_bottom);
			
			p.set_display_length_stat(FPalaceHelper.penis_length_id);
			
			p.set_display_width_stat(FPalaceHelper.penis_girth_id);
			p.set_display_width_mod(0.5);
			
			p.new_stat(penis_length_id, stat_penis_length(),s1);
			
			p.new_stat(penis_girth_id, stat_penis_girth(),s2);
			//p.new_stat(cum_volume_id, stat_cum_volume(),s3);
			
			
			BodyPartState ps = new BodyPartState();
				ps.new_ratio_stat(FPalaceHelper.lust_id);
				ps.new_ratio_stat(25, true);
				ps.set_stat_effected(penis_length_id);
				ps.set_stat_effected(penis_girth_id);
				ps.new_comparison(">=", FPalaceHelper.erection_ratio_id,1,"</n>s penis comes to attention, standing fully erect. ", ", and ocassionally throbs, it's erect shaft coursing with blood. ", true);
				ps.new_comparison("<=", 0,FPalaceHelper.erection_ratio_id,"</n>s penis falls completely flaccid. ", ", and is hanging flaccidly over </noun> groin. ", false, true);
				ps.new_comparison("^", FPalaceHelper.erection_ratio_id,-1,"</n> shows some stirings in </noun> groin. ", ", it pulses occasionally as it hangs over </noun> groin. ", true);
				ps.new_comparison("v", FPalaceHelper.erection_ratio_id,-1,"</n>s groin visibly begins to lose blood, </noun> penis falling flaccid. ", ", it pulses occasionally as it hangs over </noun> groin. ",true);
			
			
			p.set_part_state(ps);
			
			CharAction a = new CharAction();
			a.setName("Rape");
			a.set_attack_flag(CharAction.attack_type_single_target, "Sex");
			a.set_attack_description("Force an opponent to have sex with you. ");
			a.set_requirement(FPalaceHelper.lust_id,25);
			a.set_requirement(FPalaceHelper.curr_fatigue_id,1);
			a.set_delayed_trigger();
			Challenge challenge = new Challenge(true);
			
			challenge.set_attack_stat(FPalace_skills.grappling_id);
			challenge.set_defense_stat(FPalace_skills.dodging_id);
			challenge.setVariability(20);
			challenge.setText("Rape");
			Consequence consequence = new Consequence();
			consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
			consequence.addConsequence(FPalaceHelper.lust_id,10, "</n2> jumps upon </n> and pins </objnoun>. </n> moans out in pleasure as </n2> explores </noun> body. ",0,0,0,1);
				//and now begins the madness... first choice: top half or bottom half
				Challenge challenge1 = new Challenge();
				challenge1.set_attack_stat(-1,1);//challenge1.set_attack_stat(-1,0)
				challenge1.set_defense_stat(-1,0);
				challenge1.setVariability(0);//challenge1.setVariability(20)
				challenge1.setText("");//TODO why zero again!?
				Consequence consequence1 = new Consequence();				
					//top half! facial... if breasts are present, try to pull off the top
					consequence1.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
					//consequence1.addConsequence(FPalaceHelper.lust_id,10, "</n2> aggressively starts fondling </n>s chest, enticing </objnoun>. ",0,0,0,2);
					consequence1.addConsequence(FPalaceHelper.lust_id,0, "</c2><br></c4>",0);
						//check if breasts present
						Challenge challenge2 = new Challenge();
						challenge2.set_attack_stat(-1,1);
						challenge2.set_defense_stat(FPalaceHelper.breast_size_id);
						challenge2.setVariability(0);
						challenge2.setText("Chest");
						Consequence consequence2 = new Consequence();
							//no titties... blowjob...
							consequence2.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
							consequence2.addConsequence(FPalaceHelper.lust_id,25, "</n2> forces </noun2> groin into </n>s face. </n> can't help but enjoy the view. ",0,0,0,9);
								Challenge challenge9 = new Challenge();
								challenge9.set_attack_stat(FPalaceHelper.lust_id);
								challenge9.set_defense_stat(-1,50);
								challenge9.setVariability(0);
								challenge9.setText("");
								Consequence consequence9 = new Consequence();
									//attacker is aroused! BJ! 
									consequence9.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence9.addConsequence(FPalaceHelper.lust_id,50, "</n2> thrusts </noun2> cock at </n>s mouth, greadily pouring </noun2> waiting inches into </n>s agape mouth. ",0,0,0,-1);
									consequence9.addConsequence(FPalaceHelper.lust_id,20, "<br>",0,0,0,10,true);
										Challenge challenge10 = new Challenge();
										challenge10.set_attack_stat(FPalaceHelper.cum_volume_id);
										challenge10.set_defense_stat(-1,1);
										challenge10.setVariability(0);
										challenge10.setText("");
										Consequence consequence10 = new Consequence();
										//attacker has cum! Change consequence depending on how much!
										//need some way to have a "cum effect" so cum can cause effect when consumed (breast growth, etc...)
										//maybe part actions... BodyParts can have an action associated with them.
										//I've put some more thought into this, and I'm thinking it makes more sense to have stats have actions(mostly because there are 
										//more of them, and it will be easier to distinguish between impregnation and consumption)
										//call would be something like this
										//consequence10.trigger_stat_action(cum_volume_id);
										//this could replace the impregnate to some extent(assuming I can figure out how to split out consuming semen from impregnation, as the part is the same)
										consequence10.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
										consequence10.set_consume(FPalaceHelper.cum_volume_id);
										consequence10.addConsequence(FPalaceHelper.lust_id,50, "</n2> begins to launch a load of semen down </n>s throat, a look of relief crossing </noun2> face. ",0,0,0,-1);
										consequence10.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,-1,true);
										//attack has no cum!? Still need a climax!
										consequence10.addConsequence(FPalaceHelper.lust_id,50, "</n2> bucks and jerks as </pronoun2> climaxes. ",-1,0,0,-1);
										consequence10.addConsequence(FPalaceHelper.lust_id,-50, "<br>",-1,0,0,-1,true);
									//attack is not aroused! Smother and try again!
									consequence9.addConsequence(FPalaceHelper.lust_id,25, "Not quite hard yet, </n2> coaxes a lick from </n>. ",-1,0,0,-1);
									consequence9.addConsequence(FPalaceHelper.lust_id,25, "<br>",-1,0,0,9,true);
	
							//titties! attempt to disrobe breasts
							consequence2.addConsequence(FPalaceHelper.lust_id,10, "</n2>s hands dive for </n>s chest, and begin to grope and dig! ",-1,0,0,3);
							Challenge challenge3 = new Challenge();
							challenge3.set_attack_stat(-1,0);
							challenge3.set_defense_stat(-1,0);
							challenge3.set_defense_equip_slot_check(FPalaceHelper.breasts_slot);
							challenge3.setVariability(0);
							challenge3.setText("");
							Consequence consequence3 = new Consequence();
								//clothing found! 
								consequence3.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
								consequence3.addConsequence(FPalaceHelper.lust_id,10, "</n2> pulls at </n>s attempt to cover </noun> breasts. ",-1,0,0,8);
								Challenge challenge8 = new Challenge(true);
								challenge8.set_attack_stat(FPalace_skills.grappling_id);
								challenge8.set_defense_stat(FPalace_skills.grappling_id);
								challenge8.setVariability(10);
								challenge8.setText("");
								Consequence consequence8 = new Consequence();
									consequence8.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence8.add_disrobe(FPalaceHelper.breasts_slot);
									//disrobe success! titties!
									consequence8.addConsequence(FPalaceHelper.lust_id,25, "</n2> rips </n>s coverings and begins to attack </noun> breasts in earnest! </n> moans out from the deep massage. ",0,0,0,11);
									//disrobe failure! horniness increases past even where it was before!
									//need some way for this to effect other character... - flip target flag!
									consequence8.addConsequence(FPalaceHelper.lust_id,25, "</n2> is knocked back as </n> defends </noun> mounds. </n2> is just turned on by </noun2> targets persistance. ",-1,0,0,-1,true);
									
								//no clothing! Titties!
								consequence3.addConsequence(FPalaceHelper.lust_id,25, "</n2> begins to massage </n>s breasts and tweek </noun> nipples! </n> moans out from the sensations. ",0,0,0,11);
								Challenge challenge11 = new Challenge();
										challenge11.set_attack_stat(FPalaceHelper.lust_id);
										challenge11.set_defense_stat(-1,50);
										challenge11.setVariability(0);
										challenge11.setText("");
										Consequence consequence11 = new Consequence();
										//attacker is aroused! titty job!
										consequence11.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
										consequence11.addConsequence(FPalaceHelper.lust_id,40, "</n2> begins to shove </noun2> cock between </n>s fleshy mounds. ",0,0,0,12);
											Challenge challenge12 = new Challenge();
											challenge12.set_attack_stat(FPalaceHelper.lust_id);
											challenge12.set_defense_stat(-1,100);
											challenge12.setVariability(15);
											challenge12.setText("");
											Consequence consequence12 = new Consequence();
											//attacker can keep going! Head to BJ!
											consequence12.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
											consequence12.addConsequence(FPalaceHelper.lust_id,50, "</n2> blows </noun2> load all over </n>s face and tits. Unsatisfied </pronoun2> begins to eye </n>s cum smeered face. ",0,0,0,-1);
											consequence12.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,9,true);
											//attacker is done! stop the madness!
											consequence12.addConsequence(FPalaceHelper.lust_id,50, "</n2> blows </noun2> load all over </n>s face and tits, leaving </objnoun2> spent for the moment. ",-1,0,0,-1);
											consequence12.addConsequence(FPalaceHelper.lust_id,-50, "<br>",-1,0,0,-1,true);
										//attack is not aroused. Play with tits and try again
										consequence11.addConsequence(FPalaceHelper.lust_id,25, "</n2> takes a moment to stroke </objnoun2>self to erection. ",-1,0,0,-1);
										consequence11.addConsequence(FPalaceHelper.lust_id,25, "<br>",-1,0,0,11,true);
					//bottom half!
					//consequence1.addConsequence(FPalaceHelper.lust_id,25, "</n2> aggressively starts exploring </n>s groin with </noun2> fingers, enticing </n>. ",-1,0,0,4);
						//disrobe attempt
						Challenge challenge4 = new Challenge();
						challenge4.set_attack_stat(-1,0);
						challenge4.set_defense_stat(-1,0);
						challenge4.set_defense_equip_slot_check(FPalaceHelper.hips_slot);
						challenge4.setVariability(0);
						challenge4.setText("Groin");
						Consequence consequence4 = new Consequence();
							//disrobe success or not covered
							consequence4.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
							consequence4.addConsequence(FPalaceHelper.lust_id,25, "</n2> whips out </noun2> dick and quickly takes up position over </n>. ",0,0,0,5);
							Challenge challenge5 = new Challenge();
							challenge5.set_attack_stat(FPalaceHelper.lust_id);
							challenge5.set_defense_stat(-1,50);
							challenge5.setVariability(0);
							challenge5.setText("");
							Consequence consequence5 = new Consequence();
								//character is fully aroused
								consequence5.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
								consequence5.addConsequence(FPalaceHelper.lust_id,50, "</n2> begins to rub </noun2> penis against </n>s groin. ",0,0,0,6);
									Challenge challenge6 = new Challenge();
									challenge6.set_attack_stat(-1,0);
									challenge6.set_defense_stat(FPalaceHelper.vaginal_depth_id,-1);
									challenge6.setVariability(0);
									challenge6.setText("");
									Consequence consequence6 = new Consequence();
									//fuck pussy if present
									consequence6.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
									consequence6.addConsequence(FPalaceHelper.lust_id,50, "Finally, </n2> begins to penetrate </n>. ",-1,0,0,13);
										//check to see if dick fits...
										Challenge challenge13 = new Challenge();
										challenge13.set_attack_stat(FPalaceHelper.penis_girth_id,-1, Body.get_stat_min);
										challenge13.set_defense_stat(FPalaceHelper.vaginal_width_id,-1, Body.get_stat_max);
										challenge13.setVariability(0);
										challenge13.setText("");
										Consequence consequence13 = new Consequence();
												consequence13.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
												consequence13.addConsequence(FPalaceHelper.lust_id,50, "Plunging to work, </n2> furiously begins to pump </noun2> ass. ",0,0,0,14);
												Challenge challenge14 = new Challenge();
												challenge14.set_attack_stat(FPalaceHelper.cum_volume_id);
												challenge14.set_defense_stat(-1,1);
												challenge14.setVariability(0);
												challenge14.setText("");
												Consequence consequence14 = new Consequence();
												consequence14.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
												consequence14.set_impregnate();
												consequence14.addConsequence(FPalaceHelper.lust_id,50, "</n2> begins to launch a load of semen into </n>, an *O* visible on </noun2> face. ",0,0,0,-1);
												consequence14.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,-1,true);
												//attack has no cum!? Still need a climax!
												consequence14.addConsequence(FPalaceHelper.lust_id,50, "</n2> bucks and jerks as </pronoun2> climaxes. ",-1,0,0,-1);
												consequence14.addConsequence(FPalaceHelper.lust_id,-50, "<br>",-1,0,0,-1,true);
											//dick too big... go for blowjob
											consequence13.addConsequence(FPalaceHelper.lust_id,50, "Despite </noun> attempts, </n2>s dick isn't going to fit. ",-1,0,0,-1);
											consequence13.addConsequence(FPalaceHelper.vaginal_width_id,0.5, "<br>",-1,0,0,2);
									//fuck ass
									consequence6.addConsequence(FPalaceHelper.lust_id,25, "Finding nothing else, </n2> leads </noun2> cock towards </n>s ass. ",0,0,0,7);
										Challenge challenge7 = new Challenge();
										challenge7.set_attack_stat(FPalaceHelper.penis_girth_id,-1, Body.get_stat_min);
										challenge7.set_defense_stat(FPalaceHelper.anal_width_id,-1, Body.get_stat_max);
										challenge7.setVariability(0);
										challenge7.setText("");
										Consequence consequence7 = new Consequence();
											//pump 'er full
											consequence7.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
											consequence7.addConsequence(FPalaceHelper.lust_id,50, "</n2> penetrates </n>, and it isn't long before </pronoun2> begins pounding </n>s asshole. ",0,0,0,15);
												Challenge challenge15 = new Challenge();
												challenge15.set_attack_stat(FPalaceHelper.cum_volume_id);
												challenge15.set_defense_stat(-1,1);
												challenge15.setVariability(0);
												challenge15.setText("");
												Consequence consequence15 = new Consequence();
												consequence15.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
												consequence15.addConsequence(FPalaceHelper.lust_id,50, "</n2> begins to launch a load of semen into </n>, an *O* visible on </noun2> face. ",0,0,0,-1);
												consequence15.addConsequence(FPalaceHelper.lust_id,-50, "<br>",0,0,0,-1,true);
												//attack has no cum!? Still need a climax!
												consequence15.addConsequence(FPalaceHelper.lust_id,50, "</n2> bucks and jerks as </pronoun2> climaxes. ",-1,0,0,-1);
												consequence15.addConsequence(FPalaceHelper.lust_id,-50, "<br>",-1,0,0,-1,true);
											
											//dick too big... try mouth...
											consequence7.addConsequence(FPalaceHelper.lust_id,50, "</n2> pounds and pounds but </pronoun2> just isn't going to fit. ",-1,0,0,-1);
											consequence7.addConsequence(FPalaceHelper.anal_width_id,0.5, "<br>",-1,0,0,2);
								//character is not aroused...
								consequence5.addConsequence(FPalaceHelper.lust_id,25, "</n2> take a moment to stroke </objnoun2>self to arrousal. ",-1,0,0,-1);
								consequence5.addConsequence(FPalaceHelper.lust_id,25, "<br>",-1,0,0,5,true);
								
						//character is wearing clothing!
						consequence4.addConsequence(FPalaceHelper.lust_id,25, "</n2> pulls and tugs on </n>s clothing. ",-1,0,0,16,true);
							Challenge challenge16 = new Challenge(true);
							challenge16.set_attack_stat(FPalace_skills.grappling_id);
							challenge16.set_defense_stat(FPalace_skills.grappling_id);
							challenge16.setVariability(10);
							challenge16.setText("");
							Consequence consequence16 = new Consequence();
								consequence16.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
								consequence16.add_disrobe(FPalaceHelper.hips_slot);
								//disrobe success! groin!
								consequence16.addConsequence(FPalaceHelper.lust_id,25, "</n2> rips </n>s coverings and begins to attack </noun> groin in earnest! ",0,0,0,4);
								//disrobe failure! horniness increases past even where it was before!
								consequence16.addConsequence(FPalaceHelper.lust_id,25, "</n2> is knocked back as </n> defends </noun> crotch. </n2> is just turned on by </noun2> targets persistance. ",-1,0,0,-1,true);
								
							
			consequence.addConsequence(0,0, "</n2> leaps towards </n>, but </pronoun> deftly step out of the way! ",-1);
						
			a.addChallenge(challenge,consequence);
			a.addChallenge(challenge1,consequence1);
			a.addChallenge(challenge2,consequence2);
			a.addChallenge(challenge3,consequence3);
			a.addChallenge(challenge4,consequence4);
			a.addChallenge(challenge5,consequence5);
			a.addChallenge(challenge6,consequence6);
			a.addChallenge(challenge7,consequence7);
			a.addChallenge(challenge8,consequence8);
			a.addChallenge(challenge9,consequence9);
			a.addChallenge(challenge10,consequence10);
			a.addChallenge(challenge11,consequence11);
			a.addChallenge(challenge12,consequence12);
			a.addChallenge(challenge13,consequence13);
			a.addChallenge(challenge14,consequence14);
			a.addChallenge(challenge15,consequence15);
			a.addChallenge(challenge16,consequence16);
			
			
			p.new_attack(a);
			
			a = new CharAction();
				a.setName("Thrust");
				a.set_attack_flag(CharAction.attack_type_single_target, "Sex");
				a.set_attack_description("Thrust your genitals at a single opponent. ");
				challenge = new Challenge();
				
				challenge.set_attack_stat(FPalaceHelper.sex_appeal_id);
				challenge.set_defense_stat(FPalaceHelper.wis_id);
				challenge.setVariability(10);
				challenge.setText("Thrust");
				consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
				consequence.set_max_damage(20);
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,0);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(-FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "</n2> thrusts </noun2> hips towards </n>, </noun2> wang waggling. ",0);
				consequence.addConsequence(FPalaceHelper.wis_id,-1, "</n2>s pendulous swing catches </n>s attention, distracting </objnoun>. ",5,1,1);
				consequence.addConsequence(0,0, "</n> looks away from </n2>s swinging junk! ",-1);
				consequence.amt_by_roll_flag();
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
			
			//i still have quite a bit in the way of chaining together consequences here
			a = new CharAction();
			a.setName("Jerk off");
			a.set_personal();
			a.set_dialogue("</n> tries to find a secluded area to </c0>. ");
			a.set_requirement(FPalaceHelper.lust_id,25);
			a.set_status_change(" is masturbating here");
			a.set_attack_flag(-1, "Skills");
			Challenge c = new Challenge();
			c.set_room_challenge(Challenge.CONTENTCOUNT);
			c.set_defense_stat(-1,2);
			c.setVariability(0);
			c.setText("masturbate");
			Consequence cons = new Consequence();
			cons.addConsequence(FPalaceHelper.lust_id,0, "There are people about. ",0,0,0,2);//folks about, gotta check to see if we're embarrassed or not
			cons.addConsequence(FPalaceHelper.lust_id,0, "",-1,0,0,1);//nobodies around. Go right for it
			
			a.addChallenge(c,cons);
			
			c = new Challenge();//1
			c.set_attack_stat(FPalaceHelper.lust_id);
			c.set_defense_stat(-1,0);
			c.setVariability(0);
			c.setText("");
			//this is something i want to have a few possible chains for, depending on the characters current endowments
			cons = new Consequence();
			cons.set_extract(FPalaceHelper.cum_volume_id);
			cons.amt_by_roll_flag();
			cons.addConsequence(FPalaceHelper.lust_id,Consequence.amt_from_roll_const, "</n> manages to find a nice spot, and masturbates furiously. A smile develops on </noun> lips as a </sd"+FPalaceHelper.cum_volume_id+"> of cum spews from </noun> throbbing erection. </pronoun> appears a little relieved. ",0);
			cons.addConsequence(FPalaceHelper.lust_id,50, "</n> manages to find a nice spot, and masturbate furiously. </pronoun> toils for naught, and just end up even more pent up than before. ",-1);

			a.addChallenge(c,cons);
			
			c = new Challenge();//2
			c.set_attack_stat(FPalaceHelper.wis_id);
			c.set_defense_stat(-1,10);
			c.setVariability(10);
			c.setText("");
			cons = new Consequence();
			cons.addConsequence(FPalaceHelper.lust_id,0,"</n> decides </pronoun> doesn't mind an audience. ",0,0,0,1);//don't care there are people around
			cons.addConsequence(FPalaceHelper.lust_id,0,"</n>s cheeks turn a deep shade of red. ",-1,0,0,3);//I care there are people around

			a.addChallenge(c,cons);
			
			c = new Challenge();//3
			c.set_attack_stat(FPalaceHelper.curr_mp_id);
			c.set_defense_stat(-1,3);
			c.setVariability(0);
			c.setText("");
			cons = new Consequence();
			cons.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
			cons.addConsequence(FPalaceHelper.curr_mp_id,-3, "Finally, </pronoun> decides to masturbate despite the people. ",0,0,0,1);//doing it despite the fact I care
			cons.addConsequence(FPalaceHelper.lust_id,40, "</n> decides to wait for a less crowded situation. ",-1);//Chickening out

			a.addChallenge(c,cons);

			p.new_action(a);
			
			p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
			p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
			p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
			p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
			p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
			p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
			p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
			p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
			p.new_stat(FPalaceHelper.erection_ratio_id, FPalaceHelper.stat_erection_ratio(), 0.7);
			
			
			p.set_race(r);
			return p;
		}
		public static BodyPart new_balls(Race r){
			return new_balls(r,1.5,1,0.05);
		}
		public static BodyPart new_balls(Race r, double s1, int s2, double s3){
            //Race r,s1 = 1.5, s2= 1, s3 = 0.05
			BodyPart p = new BodyPart();
			p.set_name("balls");
			p.set_part_id(balls_slot);
			p.add_description("</noun> </bpn> are </r>");
			
			p.new_connect_slot(hips_slot);
			p.new_connect_slot(thighs_slot);
			p.new_connect_slot(abdomen_slot);
			
			p.set_display_direction(BodyPart.display_bottom);
			
			p.set_display_length_stat(FPalaceHelper.balls_size_id);
			p.set_display_length_mod(0.75);
			
			p.set_display_width_stat(FPalaceHelper.hips_id);
			p.set_display_width_mod(0.1);
			
			p.set_display_width2_stat(FPalaceHelper.balls_size_id);
			p.set_display_width2_mod(1.5);
						
			//p.new_stat(cum_volume_id, stat_cum_volume(),s2);
			
			p.new_stat(balls_size_id, stat_ball_size(),s1);
				
			
			p.new_stat(semen_fertility_id, stat_semen_fertility(),s3);
				
			p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(),1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),1);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 1);
			p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
			p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
			p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
			p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
			
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_cocksnake_head(Race r){
			BodyPart p = new BodyPart();
				p.set_name("reptilian head");
				p.set_part_id(FPalaceHelper.head_slot);
				p.add_description("</noun> </bpn> bears a striking resemblance to the human penis. ");
				
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(eyes_slot);
				
				p.set_display_direction(BodyPart.display_top_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				CharAction a = new CharAction();
				a.setName("Bite");
				a.set_attack_flag();
				a.set_attack_description("Bite a single opponent with your teeth. ");
				a.set_fire_weapon_challenge();
				Challenge challenge = new Challenge();
				challenge.set_attack_stat(FPalaceHelper.str_id);
				challenge.set_defense_stat(FPalaceHelper.dex_id);
				challenge.setVariability(10);
				challenge.setText("Bite");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
				consequence.set_max_damage(15);
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,4);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with its mouth wide open, biting </n>. ",0);
				consequence.addConsequence(FPalaceHelper.lust_id,1, "",0);
				consequence.addConsequence(FPalaceHelper.penis_length_id,1, "",0);
				consequence.addConsequence(FPalaceHelper.penis_girth_id,0.3, "",0);
				consequence.addConsequence(FPalaceHelper.cum_volume_id,1.2, "",0);
				consequence.addConsequence(FPalaceHelper.balls_size_id,0.2, "",0);
				consequence.addConsequence(0,0, "</n2> misses. ",-1);
								
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				//"rape" to use against anyone with a vagina
				p.set_crit_part();
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(), 5);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),5);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 5);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 5);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 5);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 5);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 5);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 5);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 5);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 5);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 5);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 3);
				
				
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_vagsnake_head(Race r){
			BodyPart p = new BodyPart();
				p.set_name("reptilian head");
				p.set_part_id(FPalaceHelper.head_slot);
				p.add_description("</noun> </bpn> bears a striking resemblance to the human vulva, the folds and odd nub on </noun> bright and oily pink face. ");
				
				p.new_connect_slot(hips_slot);
				p.new_connect_slot(eyes_slot);
				
				p.set_display_direction(BodyPart.display_top_back);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				CharAction a = new CharAction();
				a.setName("Bite");
				a.set_attack_flag();
				a.set_attack_description("Bite a single opponent with your teeth. ");
				a.set_fire_weapon_challenge();
				Challenge challenge = new Challenge();
				challenge.set_attack_stat(FPalaceHelper.str_id);
				challenge.set_defense_stat(FPalaceHelper.dex_id);
				challenge.setVariability(10);
				challenge.setText("Bite");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.lust_damage_type().get_id());
				consequence.set_max_damage(15);
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,4);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-1, "</n2> lashes out with its mouth wide open, biting </n>. ",0);
				consequence.addConsequence(FPalaceHelper.lust_id,1, "",0);
				consequence.addConsequence(FPalaceHelper.vaginal_depth_id,0.3, "",0);
				consequence.addConsequence(FPalaceHelper.vaginal_width_id,0.1, "",0);
				consequence.addConsequence(FPalaceHelper.milk_volume_id,5, "",0);
				consequence.addConsequence(FPalaceHelper.breast_size_id,0.5, "",0);
				consequence.addConsequence(0,0, "</n2> misses. ",-1);
								
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				
				//"rape" to use against anyone with a penis
				p.set_crit_part();
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(), 5);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),5);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 5);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 5);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 5);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 5);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 5);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 5);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 5);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 5);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 5);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 5);
				
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_sexsnake_body(Race r){
			BodyPart p = new BodyPart();
				p.set_name("body");
				p.set_part_id(FPalaceHelper.hips_slot);
				p.add_description("</noun> </bpn> is about arm length and covered in scales that flash as </pronoun> moves. ");
				
				p.new_connect_slot(head_slot);
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(vag_slot);
				p.new_connect_slot(cock_slot);
				p.new_connect_slot(balls_slot);
				p.new_connect_slot(clit_slot);
				
				
				p.set_display_direction(BodyPart.display_bottom);
				
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				CharAction a = new CharAction();
				a.setName("Thrash");
				a.set_attack_flag();
				a.set_attack_description("Strike a single opponent with your body. ");
				a.set_fire_weapon_challenge();
				Challenge challenge = new Challenge();
				challenge.set_attack_stat(FPalaceHelper.str_id);
				challenge.set_defense_stat(FPalaceHelper.dex_id);
				challenge.setVariability(10);
				challenge.setText("Thrash");
				Consequence consequence = new Consequence();
				consequence.set_damage_type(FPalaceHelper.bludg_damage_type().get_id());
				consequence.set_max_damage(15);
				Challenge inter_chal = new Challenge(true);
					inter_chal.set_attack_stat(FPalace_skills.concentration_id);
					inter_chal.set_defense_stat(-1,4);
					inter_chal.setVariability(10);
				
				consequence.set_interupt_chal(inter_chal);
				consequence.addConsequence(FPalaceHelper.curr_hp_id,-3, "</n2> lashes out with </noun2> body and strikes </n> successfully. ",0);
				consequence.addConsequence(0,0, "</n2> misses. ",-1);
								
				a.addChallenge(challenge,consequence);
				
				p.new_attack(a);
				p.set_crit_part();
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(), 5);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),5);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 5);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 50);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 5);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 5);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 5);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 5);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 5);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 5);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 5);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 5);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 11);
				
			p.set_race(r);
			return p;
		}
		
		public static BodyPart new_goo_head(Race r){
			BodyPart p = new BodyPart();
				p.set_name("head");
				p.set_part_id(FPalaceHelper.head_slot);
				p.add_description("</pronoun> is a </r>");
				p.set_crit_part();
								
				p.new_connect_slot(torso_slot);
				p.new_connect_slot(horn_slot);
				p.new_connect_slot(hair_slot);
				p.new_connect_slot(eyes_slot);
				p.set_display_direction(BodyPart.display_top);
				p.set_display_length_stat(FPalaceHelper.height_id);
				
				p.set_display_width_stat(FPalaceHelper.height_id);
				p.set_display_width_mod(0.64);
				
				p.new_stat(FPalaceHelper.max_hp_id, FPalaceHelper.stat_max_hp(), 4);
				p.new_stat(FPalaceHelper.max_fatigue_id, FPalaceHelper.stat_max_fatigue(),4);
				p.new_stat(FPalaceHelper.curr_fatigue_id, FPalaceHelper.stat_curr_fatigue(), 4);
				p.new_stat(FPalaceHelper.sex_appeal_id, FPalaceHelper.stat_sex_appeal(), 1);
				p.new_stat(FPalaceHelper.min_lust_id, FPalaceHelper.stat_min_lust(), 0);
				p.new_stat(FPalaceHelper.max_lust_id, FPalaceHelper.stat_max_lust(), 25);
				p.new_stat(FPalaceHelper.str_id, FPalaceHelper.stat_strength(), 1);
				p.new_stat(FPalaceHelper.dex_id, FPalaceHelper.stat_dexterity(), 1);
				p.new_stat(FPalaceHelper.con_id, FPalaceHelper.stat_finalitution(), 1);
				p.new_stat(FPalaceHelper.wis_id, FPalaceHelper.stat_wisdom(), 1);
				p.new_stat(FPalaceHelper.will_id, FPalaceHelper.stat_willpower(), 1);
				p.new_stat(FPalaceHelper.int_id, FPalaceHelper.stat_intelligence(), 1);
				p.new_stat(FPalaceHelper.max_mp_id, FPalaceHelper.stat_max_mp(),1);
				p.new_stat(FPalaceHelper.curr_mp_id, FPalaceHelper.stat_curr_mp(), 1);
				p.new_stat(FPalaceHelper.cha_id, FPalaceHelper.stat_charisma(), 1);
				p.new_stat(FPalaceHelper.curr_hp_id, FPalaceHelper.stat_curr_hp(), 1);
				p.new_stat(FPalaceHelper.lust_id, FPalaceHelper.stat_lust(), 0);
				p.new_stat(FPalaceHelper.height_id, FPalaceHelper.stat_height(), 11);
				
			p.set_race(r);
			return p;
		}
		
		public static Sex sex_male(){
			if(male_sex == null){
				Sex sex = new Sex();
				sex.set_default_orient(new Trait[]{FPalaceHelper.trait_has_vagina(),FPalaceHelper.trait_has_breasts(),FPalaceHelper.trait_high_fertility()}, new Trait[]{});
				sex.add_damage_weakness(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("male");
				sex.new_age_name(0,"boy");
				sex.new_age_name(13,"teenage boy");
				sex.new_age_name(18,"young man");
				sex.new_age_name(22,"man");
				sex.new_age_name(40,"old man");
				sex.set_bonus(FPalaceHelper.int_id,1);
				sex.set_bonus(FPalaceHelper.str_id,2);
				sex.set_bonus(bust_id,2);
				sex.set_bonus(waist_id,6);
				sex.set_bonus(hips_id,2);
				sex.set_bonus(FPalaceHelper.height_id,10);
				sex.set_pronoun("he");
				//"him"
				sex.set_noun("his");
				//"himself"
				sex.set_objnoun("him");
				
				//most stats max out by 18. str, dex, con, sex_appeal starting to fade around 45
				sex.new_age_stat(FPalaceHelper.str_id, 		/*All had closing/opening brackets*/new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});//,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.5,-0.5,-0.5,-0.5,-0.5])
				sex.new_age_stat(FPalaceHelper.dex_id, 		new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});//,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.5,-0.5,-0.5,-0.5,-0.5])
				sex.new_age_stat(FPalaceHelper.con_id,			new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});//,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.5,-0.5,-0.5,-0.5,-0.5])
				sex.new_age_stat(FPalaceHelper.wis_id, 		new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.int_id, 		new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.cha_id, 		new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, 	new double[]{0,-0.1,-0.1,-0.15,-0.05,-0.02,-0.01,-0.01,-0.02,-0.02,-0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});//,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.02,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.05,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.5,-0.5,-0.5,-0.5,-0.5])
				sex.new_age_stat(FPalaceHelper.max_hp_id,		new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.min_lust_id, 	new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.max_lust_id, 	new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(bust_id, 						new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(waist_id, 						new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(hips_id, 						new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.height_id, 		new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(anal_width_id, 				new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(anal_depth_id, 				new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				
				sex.new_age_stat(penis_length_id, 				new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(penis_girth_id, 				new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(balls_size_id, 				new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(cum_volume_id, 				new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(semen_fertility_id, 			new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				
				sex.new_topic(FPalace_topics.flirt());
				sex.new_topic(FPalace_topics.blow_job());
				sex.new_topic(FPalace_topics.sex());
				male_sex = sex;
			}
			return male_sex;
		}
		
		public static Sex sex_female(){
			if(female_sex == null){
				Sex sex = new Sex();
				sex.set_default_orient(new Trait[]{FPalaceHelper.trait_has_penis(), FPalaceHelper.trait_has_gold(), FPalaceHelper.trait_is_taller()},new Trait[]{});
				sex.add_damage_resistance(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("female");
				sex.new_age_name(0,"girl");
				sex.new_age_name(13,"teenage girl");
				sex.new_age_name(18,"young woman");
				sex.new_age_name(22,"woman");
				sex.new_age_name(40,"old woman");
				sex.set_bonus(FPalaceHelper.con_id,1);
				sex.set_bonus(FPalaceHelper.wis_id,2);
				sex.set_bonus(FPalaceHelper.hair_length_id,12);
				sex.set_pronoun("she");
				sex.set_noun("her");
				sex.set_objnoun("her");
				
				//most stats max out by 18
				//beauty and fertility should start to fade around 30(done), with str, dex, and con starting to fade around 45
				sex.new_age_stat(FPalaceHelper.str_id, 		/*All had closing/opening brackets*/new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.dex_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.con_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.wis_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.int_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.cha_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, 	new double[]{0,-0.1,-0.1,-0.1,-0.05,-0.05,-0.05,-0.1,-0.1,-0.05,-0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01,-0.02,-0.03,-0.05,-0.03,-0.02,-0.01});
				sex.new_age_stat(FPalaceHelper.max_hp_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.max_lust_id, 	new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(bust_id, 						new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(waist_id, 						new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(hips_id, 						new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.height_id, 		new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_width_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_depth_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				
				sex.new_age_stat(breast_size_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.5,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(nipple_size_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(vaginal_width_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(vaginal_depth_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(milk_volume_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(egg_fertility_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,-0.01,-0.01,-0.01,-0.01,-0.01,-0.01,-0.05,-0.05,-0.5,-0.6,-0.7,-0.8,-0.9,-0.99});
				
				sex.new_topic(FPalace_topics.flirt());
				sex.new_topic(FPalace_topics.drink_breast_milk());
				sex.new_topic(FPalace_topics.cunnalingus());
				sex.new_topic(FPalace_topics.sex());
				female_sex = sex;
			}
			return female_sex;
		}
		
		public static Sex sex_herm(){
			if(herm_sex == null){
				Sex sex = new Sex();
				sex.set_default_orient(new Trait[]{FPalaceHelper.trait_has_penis(),FPalaceHelper.trait_has_vagina(),FPalaceHelper.trait_has_breasts(),FPalaceHelper.trait_high_fertility()},new Trait[]{});
				sex.add_damage_weakness(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("hermaphrodite");
				sex.new_age_name(0,"youth");
				sex.new_age_name(13,"teenager");
				sex.new_age_name(18,"young adult");
				sex.new_age_name(22,"adult");
				sex.new_age_name(40,"elder");
				sex.set_bonus(FPalaceHelper.con_id,3);
				//no need to add a sex_appeal bonus... the extra parts do it
				sex.set_bonus(penis_length_id,7.4);
				sex.set_bonus(penis_girth_id,1.5);
				sex.set_bonus(balls_size_id,3.5);
				sex.set_bonus(breast_size_id,1);
				sex.set_bonus(milk_volume_id, 50);
				sex.set_bonus(cum_volume_id,50);
				sex.set_bonus(semen_fertility_id,0.3);
				sex.set_bonus(egg_fertility_id,0.3);
				sex.set_bonus(FPalaceHelper.min_lust_id,10);
				sex.set_bonus(FPalaceHelper.erection_ratio_id,0.1);
				sex.set_bonus(FPalaceHelper.height_id,6);
				sex.set_bonus(FPalaceHelper.hair_length_id,12);
				sex.set_pronoun("she");
				sex.set_noun("her");
				sex.set_objnoun("her");
				
				//most stats max out by 18... some then surge forward a second time around age 25 - Done! Though it's currently ending around 44... Decline in female fertility starts around 55 so decline in physical stats should begin around 70
				
				sex.new_age_stat(FPalaceHelper.str_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.02,0.04,0.05,0.04,0.02,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.dex_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.con_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.wis_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.int_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.cha_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, 	new double[]{0,-0.1,-0.1,-0.1,-0.05,-0.05,-0.05,-0.1,-0.1,-0.05,-0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0   ,0   ,0   ,0   ,0   ,0.01,0.02,0.04,0.05,0.04,0.02,0.01,0   ,0   ,0   ,0   ,0   ,0,0,0,0,0,0,0,0,-0.01,-0.02,-0.04,-0.05,-0.04,-0.02,-0.01});
				sex.new_age_stat(FPalaceHelper.max_hp_id, 		new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.min_lust_id, 	new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0.0,0.05,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1 ,0.1 ,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,-0.01,-0.02,-0.04,-0.05,-0.04,-0.02,-0.01});
				sex.new_age_stat(FPalaceHelper.max_lust_id, 	new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(bust_id, 						new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.02,0.04,0.05,0.04,0.02,0.01,0,0,0,0,0});
				sex.new_age_stat(waist_id, 						new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0,0});
				sex.new_age_stat(hips_id, 						new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.02,0.04,0.05,0.04,0.02,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_width_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0});
				sex.new_age_stat(anal_depth_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.height_id, 		new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.02,0.03,0.02,0.01,0,0,0,0,0});
				
				sex.new_age_stat(balls_size_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(breast_size_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.5,0.02,0.01,0.01,0.01,0,0,0,0,0,0, 0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				
				sex.new_age_stat(nipple_size_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(vaginal_width_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0});
				sex.new_age_stat(vaginal_depth_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0,0,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0});

				sex.new_age_stat(milk_volume_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(cum_volume_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				
				sex.new_age_stat(egg_fertility_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.01,0.01,0.01,0.01,0.01,0.01,0.02,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01,-0.025,-0.05,-0.1,-0.15,-0.2,-0.3,-0.4,-0.5,-0.6,-0.7,-0.8,-0.9,-0.99});
				sex.new_age_stat(semen_fertility_id, 			new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.01,0.02,0.03,0.04,0.05,0.04,0.03,0.02,0.01,0});
				
				sex.new_age_stat(penis_length_id,				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(penis_girth_id, 				new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0.04,0.03,0.02,0.01,0.01,0.02,0.02,0.02,0.03,0.02,0.02,0.02,0.01,0.01,0.01,0});
				
				sex.new_topic(FPalace_topics.flirt());
				sex.new_topic(FPalace_topics.blow_job());
				sex.new_topic(FPalace_topics.cunnalingus());
				sex.new_topic(FPalace_topics.drink_breast_milk());
				sex.new_topic(FPalace_topics.sex());
				
				herm_sex = sex;
			}
			
			return herm_sex;
		}
		
		//futanari - similar to herm, but no testicles, and no second puberty
		public static Sex sex_futa(){
			if(futa_sex == null){
				Sex sex = new Sex();
				sex.set_default_orient(new Trait[]{FPalaceHelper.trait_has_penis(),FPalaceHelper.trait_has_vagina(),FPalaceHelper.trait_has_breasts(),FPalaceHelper.trait_high_fertility()},new Trait[]{});
				sex.set_name("futanari");
				sex.new_age_name(0,"youth");
				sex.new_age_name(13,"teenager");
				sex.new_age_name(18,"young adult");
				sex.new_age_name(22,"adult");
				sex.new_age_name(40,"elder");
				sex.set_bonus(penis_length_id,8);
				sex.set_bonus(penis_girth_id,2);
				sex.set_bonus(breast_size_id,2);
				sex.set_bonus(milk_volume_id, 100);
				sex.set_bonus(cum_volume_id,250);
				sex.set_bonus(FPalaceHelper.min_lust_id,5);
				sex.set_bonus(FPalaceHelper.erection_ratio_id,-0.4);
				sex.set_bonus(FPalaceHelper.hair_length_id,12);
				sex.set_bonus(egg_fertility_id,0.1);
				sex.set_pronoun("she");
				sex.set_noun("her");
				sex.set_objnoun("her");
				
				//still working on this....
				sex.new_age_stat(FPalaceHelper.str_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.dex_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.con_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.wis_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.int_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.cha_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.max_hp_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.max_lust_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, new double[]{0,-0.1,-0.1,-0.1,-0.05,-0.05,-0.05,-0.1,-0.1,-0.05,-0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01,-0.02,-0.03,-0.05,-0.03,-0.02,-0.01});
				sex.new_age_stat(breast_size_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.5,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(penis_length_id,new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(penis_girth_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(nipple_size_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(bust_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(waist_id,new double[]{ 0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(hips_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(cum_volume_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_width_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_depth_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(vaginal_width_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(vaginal_depth_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(milk_volume_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.min_lust_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
	
				sex.new_age_stat(egg_fertility_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01,-0.025,-0.05,-0.1,-0.15,-0.2,-0.3,-0.4,-0.5,-0.6,-0.7,-0.8,-0.9,-0.99});
				sex.new_age_stat(FPalaceHelper.height_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				
				sex.new_topic(FPalace_topics.flirt());
				sex.new_topic(FPalace_topics.blow_job());
				sex.new_topic(FPalace_topics.drink_breast_milk());
				sex.new_topic(FPalace_topics.cunnalingus());
				sex.new_topic(FPalace_topics.sex());
				futa_sex = sex;
			}
			
			return futa_sex;
		}
		
		//shemale - similar to herm, but no vagina, and no second puberty
		public static Sex sex_shemale(){
			if(shemale_sex == null){
				Sex sex = new Sex();
				sex.set_default_orient(new Trait[]{FPalaceHelper.trait_has_penis(),FPalaceHelper.trait_has_vagina(),FPalaceHelper.trait_has_breasts(),FPalaceHelper.trait_high_fertility()},new Trait[]{});
				sex.add_damage_weakness(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("shemale");
				sex.new_age_name(0,"youth");
				sex.new_age_name(13,"teenager");
				sex.new_age_name(18,"young adult");
				sex.new_age_name(22,"adult");
				sex.new_age_name(40,"elder");
				sex.set_bonus(penis_length_id,10);
				sex.set_bonus(penis_girth_id,3);
				sex.set_bonus(balls_size_id,2);
				sex.set_bonus(cum_volume_id,10);
				sex.set_bonus(breast_size_id,2);
				sex.set_bonus(milk_volume_id, 100);
				sex.set_bonus(FPalaceHelper.height_id,14);
				sex.set_bonus(FPalaceHelper.min_lust_id,2);
				sex.set_bonus(FPalaceHelper.erection_ratio_id,0.2);
				sex.set_bonus(FPalaceHelper.hair_length_id,5);
				sex.set_pronoun("she");
				sex.set_noun("her");
				sex.set_objnoun("her");
	
				
				//still working on this....
				sex.new_age_stat(FPalaceHelper.str_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.dex_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.con_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.wis_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.int_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.cha_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.max_hp_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.max_lust_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, new double[]{0,-0.1,-0.1,-0.15,-0.05,-0.02,-0.01,-0.01,-0.02,-0.02,-0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(breast_size_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.5,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(penis_length_id,new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(penis_girth_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(nipple_size_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(balls_size_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(bust_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(waist_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(hips_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(cum_volume_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(anal_width_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(anal_depth_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(milk_volume_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.min_lust_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(semen_fertility_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.height_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				
				sex.new_topic(FPalace_topics.flirt());
				sex.new_topic(FPalace_topics.blow_job());
				sex.new_topic(FPalace_topics.drink_breast_milk());
				sex.new_topic(FPalace_topics.sex());
				shemale_sex = sex;
			}
			return shemale_sex;
		}
		
		//androgynous/no sex
		public static Sex sex_androgynous(){
			if(androgynous_sex == null){
				Sex sex = new Sex();
				sex.add_damage_resistance(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("androgynous");
				sex.set_pronoun("it");
				sex.set_noun("its");
				sex.set_objnoun("it");
				androgynous_sex = sex;
			}
						
			return androgynous_sex;
		}
		
		public static Sex sex_male_eunuch(){
			if(male_eunuch_sex == null){
				Sex sex = new Sex();
				sex.add_damage_resistance(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("eunuch");
				sex.new_age_name(0,"boy");
				sex.new_age_name(13,"teenage boy");
				sex.new_age_name(18,"young man");
				sex.new_age_name(22,"man");
				sex.new_age_name(40,"old man");
				sex.set_bonus(FPalaceHelper.int_id,2);
				sex.set_bonus(FPalaceHelper.wis_id,2);
				sex.set_bonus(bust_id,2);
				sex.set_bonus(waist_id,6);
				sex.set_bonus(hips_id,2);
				sex.set_bonus(FPalaceHelper.height_id,10);
				sex.set_pronoun("he");
				//"him"
				sex.set_noun("his");
				//"himself"
				sex.set_objnoun("him");
				
				sex.new_age_stat(FPalaceHelper.str_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.dex_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.con_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.wis_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.int_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.cha_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.max_hp_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.max_lust_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, new double[]{0,-0.1,-0.1,-0.15,-0.05,-0.02,-0.01,-0.01,-0.02,-0.02,-0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(penis_length_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(penis_girth_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(balls_size_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(bust_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(waist_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(hips_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(cum_volume_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(anal_width_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(anal_depth_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.min_lust_id, new double[]{0,0.1,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				sex.new_age_stat(FPalaceHelper.height_id, new double[]{0,0.5,0.1,0.15,0.05,0.02,0.01,0.01,0.02,0.02,0.02,0.05,0.05,0.1,0.1,0.05,0.02,0.01,0.01,0.01,0});
				
				sex.new_topic(FPalace_topics.flirt());
				
				male_eunuch_sex = sex;
			}
			return male_eunuch_sex;
		}
		
		public static Sex sex_female_eunuch(){
			if(female_eunuch_sex == null){
				Sex sex = new Sex();
				sex.add_damage_resistance(FPalaceHelper.lust_damage_type().get_id());
				sex.set_name("eunuch");
				sex.new_age_name(0,"girl");
				sex.new_age_name(13,"teenage girl");
				sex.new_age_name(18,"young woman");
				sex.new_age_name(22,"woman");
				sex.new_age_name(40,"old woman");
				sex.set_bonus(FPalaceHelper.int_id,2);
				sex.set_bonus(FPalaceHelper.con_id,1);
				sex.set_bonus(FPalaceHelper.wis_id,3);
				sex.set_bonus(FPalaceHelper.hair_length_id,12);
				sex.set_pronoun("she");
				sex.set_noun("her");
				sex.set_objnoun("her");
				
				//growth should be stunted for a Eunuch... it isn't, but it should be
				sex.new_age_stat(FPalaceHelper.str_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.dex_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.con_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.wis_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.int_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.cha_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.max_hp_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.max_lust_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01});
				sex.new_age_stat(FPalaceHelper.sex_appeal_id, new double[]{0,-0.1,-0.1,-0.1,-0.05,-0.05,-0.05,-0.1,-0.1,-0.05,-0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.01,-0.02,-0.03,-0.05,-0.03,-0.02,-0.01});
				sex.new_age_stat(breast_size_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.5,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(nipple_size_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(bust_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(waist_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(hips_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_width_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(anal_depth_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(vaginal_width_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(vaginal_depth_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(milk_volume_id, new double[]{0,0.1,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				sex.new_age_stat(FPalaceHelper.height_id, new double[]{0,0.5,0.1,0.1,0.05,0.05,0.05,0.1,0.1,0.05,0.02,0.05,0.02,0.02,0.04,0.02,0.01,0.01,0.01,0,0,0,0,0});
				
				sex.new_topic(FPalace_topics.drink_breast_milk());
				sex.new_topic(FPalace_topics.flirt());
				
				female_eunuch_sex = sex;
			}
			return female_eunuch_sex;
		}
		
		public static Stat stat_eye_colour(){
			Stat s = new Stat(eye_colour_id);
				s.set_min(-2);
				s.setName("eye colour");
				s.new_description("and as dark as midnight. <br><br>",0);
				s.new_description("and a dark yellow. <br><br>",1);
				s.new_description("and an eye-catching yellow. <br><br>",2);
				s.new_description("and a dull golden yellow. <br><br>",3);
				s.new_description("and a dull brown. <br><br>",4);
				s.new_description("and a hazel that sparkles brown and green. <br><br>",5);
				s.new_description("and a light-brown that twinkle. <br><br>",6);
				s.new_description("and a green with brown and yellow spots that flare in the light. <br><br>",7);
				s.new_description("and a shimmering green. <br><br>",8);
				s.new_description("and a green with silver flecks that shimmer. <br><br>",9);
				s.new_description("and a blue gray with brown spots and golden flecks that sparkle. <br><br>",10);
				s.new_description("and a childish grey. <br><br>",11);
				s.new_description("and a grey blue reminiscent of a cloudy sky. <br><br>",12);
				s.new_description("and a deep piercing blue. <br><br>",13);
				s.new_description("and a sky coloured blue. <br><br>",14);
				s.new_description("and a violet that glows with inner light. <br><br>",15);
				s.new_description("and a purple that shimmers in the light. <br><br>",16);
				s.new_description("and a blood red that reflects the light with menace. <br><br>",17);
				s.new_description("and a red that glows with inner light. <br><br>",18);
				s.new_description("and a light, sickly red. <br><br>",19);
				s.new_description("and a stark white. <br><br>",20);
				
				
				s.new_increase_description("</n>s eyes looks a different colour. ");
				s.new_descrease_description("</n>s eyes looks a different colour. ");
				
			return s;
		}
		
		public static Stat stat_hair_colour(){
			Stat s = new Stat(hair_colour_id);
				s.set_min(-2);
				s.setName("hair colour");
				s.new_description("stark white ",0);
				s.new_description("grey ",1);
				s.new_description("dark as midnight ",2);
				s.new_description("yellow ",3);
				s.new_description("golden yellow ",4);
				s.new_description("brown that shimmers in the light ",5);
				s.new_description("light red ",6);
				s.new_description("fiery red ",7);
				s.new_description("dark orange ",8);
				s.new_description("green ",9);
				s.new_description("blue ",10);
				s.new_description("violet ",11);
				s.new_description("purple ",12);
				
				s.new_short_description("stark white",0);
				s.new_short_description("grey",1);
				s.new_short_description("black",2);
				s.new_short_description("yellow",3);
				s.new_short_description("golden yellow",4);
				s.new_short_description("brown",5);
				s.new_short_description("light red",6);
				s.new_short_description("fiery red",7);
				s.new_short_description("dark orange",8);
				s.new_short_description("green",9);
				s.new_short_description("blue",10);
				s.new_short_description("violet",11);
				s.new_short_description("purple",12);
				
				//st.new_description("",0);
				s.new_increase_description("</n>s hair looks a different colour. ");
				s.new_descrease_description("</n>s hair looks a different colour. ");
				
			return s;
		}
		
		public static Stat stat_skin_colour(){
			Stat s = new Stat(skin_colour_id);
				s.set_min(-2);
				s.set_max(-9);
				
				s.setName("skin colour");
				s.new_short_description("pale",0);
				s.new_short_description("light",1);
				s.new_short_description("light brown",2);
				s.new_short_description("olive",3);
				s.new_short_description("green",4);//darn orcs and goblins ruining an actually used skin colour scale....
				s.new_short_description("brown",5);
				s.new_short_description("black",6);				
				
				//st.new_description("",0);
				s.new_increase_description("</n>s skin looks a different colour. ");
				s.new_descrease_description("</n>s skin looks a different colour. ");
				
			return s;
		}
		
		public static Stat stat_goo_colour(){
			Stat s = new Stat(goo_colour_id);
				s.set_min(-2);
				s.set_max(-9);
				s.setName("goo colour");
				
				s.new_short_description("red",0);
				s.new_short_description("orange",1);
				s.new_short_description("yellow",2);
				s.new_short_description("green",3);
				s.new_short_description("blue",4);
				s.new_short_description("indigo",5);
				s.new_short_description("violet",6);
				
				s.new_increase_description("</n>s goo looks a different colour. ");
				s.new_descrease_description("</n>s goo looks a different colour. ");
				
			return s;
		}
		
		public static Stat stat_fur_colour(){
			Stat s = new Stat(fur_colour_id);
				s.set_min(-2);
				s.set_max(-11);
				s.setName("fur colour");
				s.new_short_description("white",0);
				s.new_short_description("cream",1);
				s.new_short_description("yellow",2);
				s.new_short_description("gold",3);
				s.new_short_description("red",4);
				s.new_short_description("chocolate",5);
				s.new_short_description("brown",6);
				s.new_short_description("grey",7);
				s.new_short_description("black",8);
				
				//st.new_description("",0);
				s.new_increase_description("</n>s fur looks a different colour. ");
				s.new_descrease_description("</n>s fur looks a different colour. ");
				
			return s;
		}
		
		public static Stat stat_scale_colour(){
			Stat s = new Stat(scale_colour_id);
				s.set_min(-2);
				s.set_max(-14);
				s.setName("scale colour");
				s.new_short_description("white",0);
				s.new_short_description("pink",1);
				s.new_short_description("yellow",2);
				s.new_short_description("orange",3);
				s.new_short_description("red",4);
				s.new_short_description("brown",5);
				s.new_short_description("green",6);
				s.new_short_description("light blue",7);
				s.new_short_description("blue",8);				
				s.new_short_description("turquoise",9);
				s.new_short_description("purple",10);
				s.new_short_description("black",11);
				
				
				//st.new_description("",0);
				s.new_increase_description("</n>s scales look a different colour. ");
				s.new_descrease_description("</n>s scales look a different colour. ");
				
			return s;
		}
		
		public static Stat stat_hair_length(){
			Stat s = new Stat(hair_length_id);
				s.set_min(-2);
				s.setName("hair length");
				s.set_show_decimal(0);
				//s.new_description(", </"+hair_length_id+"> inch long and ");
				//s.new_description(", </"+hair_length_id+"> inches long and ", 2);
				s.new_increase_description( "</n>s hair grows longer. ");
				s.new_descrease_description("</n>s hair is shorter than before. ");
				
			return s;
		}
		
		public static Stat stat_clit_length(){
			Stat s = new Stat(clit_length);
			s.set_min(-2);
				s.setName("clit size");
				s.new_description("");
				s.new_increase_description("</n> clit stretchs and bulges. ");
				s.new_descrease_description("</n> clit shrinks. ");
				
			return s;
		}
		
		public static Stat stat_bloat(){
			Stat s = new Stat(bloat_id);
			s.set_min(-2);
				s.setName("bloat");
				s.new_description("</noun> stomach disdends </"+bloat_id+"> inches from </noun> waist. ",1);
				s.new_increase_description("</n>s stomach bulges outward. ");
				s.new_descrease_description("</n>s stomach seems to contract. ");
				
			return s;
		}
		
		public static Stat stat_womb_fertility(){
			Stat s = new Stat(egg_fertility_id);
				s.setName("womb fertility");
				s.new_description("");
				s.new_increase_description("</n> suddenly looks desperate to be pregnant. ");
				s.new_descrease_description("</n> appears less fertile. ");
				s.set_min(-2);
				s.set_alchemy_hundreds();
			return s;
		}
		
		
		public static Stat stat_semen_fertility(){
			Stat s = new Stat(semen_fertility_id);
				s.setName("semen fertility");
				s.new_description("");
				s.new_increase_description("</n> balls shift and groan. ");
				s.new_descrease_description("</n> seems less fertile. ");
				s.set_min(-2);
				s.set_alchemy_hundreds();
			return s;
		}
		
		public static Stat stat_vaginal_depth(){
			Stat s = new Stat(vaginal_depth_id);
			s.set_min(-2);
				s.setName("vaginal depth");
				s.new_description("");
				s.new_increase_description("</n>s vaginal canal has been stretched deeper. ");
				s.new_descrease_description("</n>s vag squeezes tighter, and </noun> innards seem less displaced. ");
				
				s.new_short_description("puny",0);
				s.new_short_description("average",5);
				s.new_short_description("large",8);
				s.new_short_description("huge",12);
				s.new_short_description("gargantuan",18);
				s.new_short_description("arm sized",24);
				s.new_short_description("leg sized",36);
				s.new_short_description("person sized",40);
			return s;
		}
		
		public static Stat stat_vaginal_width(){
			Stat s = new Stat(vaginal_width_id);
			s.set_min(-2);
				s.setName("vaginal width");
				s.new_description("");
				s.new_increase_description("</n>s vaginal canal has been stretched wider. ");
				s.new_descrease_description("</n>s vag squeezes tight. ");
				
				s.new_short_description("petite",0);
				s.new_short_description("cute",2);
				s.new_short_description("three finger wide",4);
				s.new_short_description("fist sized",5);
				s.new_short_description("arm sized",6);
				s.new_short_description("leg sized",10);
				s.new_short_description("person sized",20);
				
			return s;
		}
		
		public static Stat stat_anal_depth(){
			Stat s = new Stat(anal_depth_id);
			s.set_min(-2);
				s.setName("anal depth");
				s.new_description("");
				s.new_increase_description("</n>s asshole has been stretched deeper. ");
				s.new_descrease_description("</n>s ass squeezes tighter, and </noun> innards seem less displaced. ");
				
			return s;
		}
		
		public static Stat stat_anal_width(){
			Stat s = new Stat(anal_width_id);
			s.set_min(-2);
				s.setName("anal width");
				s.new_description("");
				s.new_increase_description("</n>s asshole has been stretched wider. ");
				s.new_descrease_description("</n>s ass squeezes tight. ");
				
			return s;
		}
		/*
		public static Stat stat_cum_volume(){
			Stat s = new Stat(cum_volume_id);
			s.set_min(-2);
				s.setName("cum volume");
				s.new_description("");
				s.new_increase_description("</n> somehow seems a more prodigious producer. ");
				s.new_descrease_description("</n>s abdomen grumbles. ");
				s.set_stat_calculation(new ArrayList<String>("s" + FPalaceHelper.balls_size_id, "*", "s" + FPalaceHelper.balls_size_id,"*", "s" + FPalaceHelper.balls_size_id);
				
				s.new_short_description("dram",0);
				s.new_short_description("teaspoon",5);
				s.new_short_description("tablespoon",15);
				s.new_short_description("ounce",29);
				s.new_short_description("gill",142);
				s.new_short_description("cup",284);
				s.new_short_description("pint",568);
				s.new_short_description("quart",1140);
				s.new_short_description("gallon",4550);
				s.new_short_description("multiple gallons",9000);
			return s;
		}
		*/
		public static Stat stat_hips(){
			Stat s = new Stat(hips_id);
			s.set_min(-2);
				s.setName("hips");
				s.new_description("<br><br></noun> </bpn> are </"+hips_id+"> inches around and </r>");
				s.new_increase_description("</n>s ass jiggles as it grows. ");
				s.new_descrease_description("</n>s ass seems to contract. ");
				
			return s;
		}
		
		public static Stat stat_waist(){
			Stat s = new Stat(waist_id);
			s.set_min(-2);
				s.setName("waist");
				s.new_description("</noun> waist is </"+waist_id+"> inches around. ");
				s.new_increase_description( "</n>s waist bulges outward. ");
				s.new_descrease_description("</n>s waist seems to contract. ");
				
			return s;
		}
		
		public static Stat stat_bust(){
			Stat s = new Stat(bust_id);
			s.set_min(-2);
				s.setName("bust");
				s.new_description("</noun> bust is </"+bust_id+"> inches around and ");
				s.new_increase_description( "</n>s upper body bulges outward. ");
				s.new_descrease_description("</n>s upper body seems to contract. ");
				
			return s;
		}
		
		public static Stat stat_ball_size(){
			Stat s = new Stat(balls_size_id);
			s.set_min(-2);
			
			//s.set_stat_calculation(new String[]{"s" + FPalaceHelper.max_mp_id, "/", Double.toString(10.0)});
			s.setName("ball size");
				s.new_description("They are a </sd"+balls_size_id+"> </"+balls_size_id+">-inches around. ");
				s.new_increase_description("</n>s balls swell. ");
				s.new_descrease_description("</n>s balls shrink, </noun> sack receding into </noun> crotch. ");
				
				s.new_short_description("golf-ball sized",1);
				s.new_short_description("average sized",2);
				s.new_short_description("large",3);
				s.new_short_description("fist-sized",5);
				s.new_short_description("grape-fruit sized",7);
				s.new_short_description("gargantuan",10);
				
			return s;
		}
		
		public static Stat stat_nipple_length(){
			Stat s = new Stat(nipple_size_id);
			s.set_min(-2);
				s.setName("nipple length");
				s.new_description("and are capped by </sd"+nipple_size_id+"> nipples. ");
				s.new_increase_description("</n>s nipples extend. ");
				s.new_descrease_description("</n>s nipples retract. ");
				
				s.new_short_description("nearly inverted",0);
				s.new_short_description("normal",1);
				s.new_short_description("thumb sized",2);
				s.new_short_description("large",3);
				s.new_short_description("huge",4);
				
			return s;
		}
		
		public static Stat stat_breast_size(){
			Stat s = new Stat(breast_size_id);
				//s.set_stat_calculation(new String[]{"s" + FPalaceHelper.max_mp_id, "/", Double.toString(10.0)});
				s.setName("breast size");
				s.set_min(-2);
				//s.new_description("They stick out from </noun> chest </"+breast_size_id+"> inches ");
				s.new_description("</noun> </sd"+breast_size_id+"> breasts are barely noticable ");
				s.new_description("</noun> </sd"+breast_size_id+"> breasts sit high on </noun> chest ", 1);
				s.new_description("</noun> </sd"+breast_size_id+"> breasts are clearly weighing </noun> down ", 4);
				s.new_increase_description("</n>s breasts jiggle as they grow. ");
				s.new_descrease_description("</n>s breasts recede into </noun> chest. ");
				s.new_short_description("A-cup",0);
				s.new_short_description("B-cup",1);
				s.new_short_description("C-cup",2);
				s.new_short_description("D-cup",3);
				s.new_short_description("E-cup",4);
				s.new_short_description("F-cup",5);
				s.new_short_description("G-cup",6);
				s.new_short_description("H-cup",7);
				s.new_short_description("I-cup",8);
				s.new_short_description("J-cup",9);
				s.new_short_description("K-cup",10);
				s.new_short_description("L-cup",11);
				s.new_short_description("M-cup",12);
				s.new_short_description("N-cup",13);
				s.new_short_description("O-cup",14);
				s.new_short_description("P-cup",15);
				s.new_short_description("Q-cup",16);
				s.new_short_description("R-cup",17);
				s.new_short_description("S-cup",18);
				s.new_short_description("T-cup",19);
				s.new_short_description("U-cup",20);
				s.new_short_description("V-cup",21);
				s.new_short_description("W-cup",22);
				s.new_short_description("X-cup",23);
				s.new_short_description("Y-cup",24);
				s.new_short_description("Z-cup",25);
				s.new_short_description("large",26);
				s.new_short_description("ridiculously large",30);
				s.new_short_description("gargantuan",50);
				s.new_short_description("person-sized",70);
			return s;
		}
		
		public static Stat stat_penis_girth(){
			Stat s = new Stat(penis_girth_id);
			s.setName("penis girth");
				s.set_min(-2);
				s.new_description("and a </sd"+penis_girth_id+"> sized </"+penis_girth_id+">-inches thick");
				s.new_increase_description("</n>s cock bulges, thickening. ");
				s.new_descrease_description("</n>s penis seems slimmer. ");
				
				s.new_short_description("pencil",0);
				s.new_short_description("pinkie",1);
				s.new_short_description("finger",2);
				s.new_short_description("thumb",3);
				s.new_short_description("three fingers",4);
				s.new_short_description("fist",5);
				s.new_short_description("arm",6);
				s.new_short_description("leg",10);
				s.new_short_description("person",20);
			return s;
		}
		
		public static Stat stat_penis_length(){
			Stat s = new Stat(penis_length_id);
				s.set_min(-2);
				s.setName("penis length");
				s.new_description("It is a </sd"+penis_length_id+"> </"+penis_length_id+">-inches in length ");
				s.new_increase_description("</n>s penis waggles with renewed vigor as it lengthens. ");
				s.new_descrease_description("</n>s penis recedes into </noun> crotch, shrinking. ");
				
				s.new_short_description("puny",0);
				s.new_short_description("average",5);
				s.new_short_description("large",8);
				s.new_short_description("huge",12);
				s.new_short_description("gargantuan",18);
				s.new_short_description("arm sized",24);
				s.new_short_description("leg sized",36);
				s.new_short_description("person sized",40);
			return s;
		}
		
		public static Stat stat_age(){
			Stat st = new Stat(FPalaceHelper.age_id);
			st.set_min(-2);
			st.setName("Age");
			st.set_show_decimal(0);
			st.new_description("</pronoun> is trying to hide </noun> age. ",35);
			st.new_description("</pronoun> has seen three decades. ",30);
			st.new_description("</pronoun> is heading into middle age. ",27);
			st.new_description("</pronoun> is 25. ",25);
			st.new_description("</pronoun> is 24. ",24);
			st.new_description("</pronoun> is an adult. ",23);
			st.new_description("</pronoun> is 22. ",22);
			st.new_description("</pronoun> is 21. ",21);
			st.new_description("</pronoun> is a young adult. ",18);
			st.new_description("</pronoun> is a teenager. ",13);
			st.new_description("</pronoun> is a pre-teen. ",9);
			st.new_description("</pronoun> is a child. ",7);
			st.new_description("</pronoun> is a young child. ",5);
			st.new_description("</pronoun> is just a toddler. ",2);
			st.new_description("</pronoun> is just an infant. ",0);
			st.new_increase_description("</n> appears older. ");
			st.new_descrease_description("</n> appears younger. ");
			st.set_age();
			return st;
		}
		
		public static Stat stat_sex_appeal(){
			Stat st = new Stat(FPalaceHelper.sex_appeal_id);
			st.setName("Beauty");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> is somehow sexier. ");
			st.new_descrease_description("</n> is somehow less attractive than before. ");
			return st;
		}
		
		public static Stat stat_min_lust(){
			Stat st = new Stat(FPalaceHelper.min_lust_id);
			st.set_show_decimal(0);
			st.set_min(-2);
			st.setName("Min Lust");
			st.new_description("");
			st.new_increase_description("</n> appears lustier, as though </noun> body has started producing more hormones. ");
			st.new_descrease_description("</n> looks a litte depressed suddenly. ");
			return st;
		}
		
		public static Stat stat_max_lust(){
			Stat st = new Stat(FPalaceHelper.max_lust_id);
			st.set_show_decimal(0);
			st.set_min(-2);
			st.setName("Max Lust");
			st.new_description("");
			st.new_increase_description("");
			st.new_descrease_description("");
			return st;
		}
		
		public static Stat stat_strength(){
			Stat st = new Stat(FPalaceHelper.str_id);
			st.setName("Strength");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_description("</noun> </bpn> are bulging with muscle. ",2);
			st.new_increase_description("</n> looks stronger. ");
			st.new_descrease_description("</n> looks weaker. ");
			return st;
		}
		
		public static Stat stat_dexterity(){
			Stat st = new Stat(FPalaceHelper.dex_id);
			st.setName("Dexterity");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> looks more nimble. ");
			st.new_descrease_description("</n> looks awkward, and heavy. ");
			return st;
		}
		
		public static Stat stat_willpower(){
			Stat st = new Stat(FPalaceHelper.will_id);
			st.setName("Willpower");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> looks more determined, and certain. ");
			st.new_descrease_description("</n> looks a little depressed. ");
			return st;
		}
		
		public static Stat stat_wisdom(){
			Stat st = new Stat(FPalaceHelper.wis_id);
			st.setName("Wisdom");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> looks wiser, and more experienced. ");
			st.new_descrease_description("</n> looks ready to get in trouble. ");
			return st;
		}
		
		public static Stat stat_finalitution(){
			Stat st = new Stat(FPalaceHelper.con_id);
			st.setName("finalitution");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> looks tougher. ");
			st.new_descrease_description("</n> looks more vulnerable to the world around </objnoun>. ");
			
			st.add_combat_status_check("<=", -1, Stat.STATUSCONFIRMEDDEAD);
			return st;
		}
		
		public static Stat stat_intelligence(){
			Stat st = new Stat(FPalaceHelper.int_id);
			st.setName("Intelligence");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> looks more intelligent. ");
			st.new_descrease_description("</n> looks stupider. ");
			return st;
		}
		
		public static Stat stat_charisma(){
			Stat st = new Stat(FPalaceHelper.cha_id);
			st.setName("Charisma");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("</n> appears more charismatic. ");
			st.new_descrease_description("</n> is somehow more coarse, and rambunctious. ");
			return st;
		}
		
		public static Stat stat_curr_hp(){
			Stat st = new Stat(FPalaceHelper.curr_hp_id);
			st.setName("Current HP");
			st.set_show_decimal(0);
			st.new_description("");
			st.set_max(FPalaceHelper.max_hp_id);
			st.new_increase_description("");
			st.new_descrease_description("</n> looks very wounded. ",FPalaceHelper.max_hp_id,"/", 0.01);
			st.new_descrease_description("</n> looks battered and bruised. ",FPalaceHelper.max_hp_id,"/", 0.25);
			st.new_descrease_description("</n> looks a little shaken. ",FPalaceHelper.max_hp_id,"/", 0.50);
			st.new_descrease_description("</n> looks to be in pretty good health. ",FPalaceHelper.max_hp_id,"/", 0.75);
			
			
			st.add_combat_status_check("<=", -1, Stat.STATUSCONFIRMEDDEAD);//negatives are static versus + 1... so this -1 is actually a 0, and a -2 would actually be a 1, -3 w/b 2, -4 w/b 3 etc etc
						
			return st;
		}
		
		public static Stat stat_max_hp(){
			Stat st = new Stat(FPalaceHelper.max_hp_id);
			st.setName("Max HP");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("");
			st.new_descrease_description("");
			st.set_always_calc();
			
			//st.set_stat_calculation(new String[]{"k" + FPalace_skills.toughness_id, "/", Double.toString(15.0)});
			
			return st;
		}
		
		public static Stat stat_curr_fatigue(){
			Stat st = new Stat(FPalaceHelper.curr_fatigue_id);
			st.setName("Current Fatigue");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.set_max(FPalaceHelper.max_fatigue_id);
			st.new_increase_description("");
			st.new_descrease_description("</n> looks very tired. ",FPalaceHelper.max_fatigue_id,"/", 0.01);
			st.new_descrease_description("</n> is huffing and puffing. ",FPalaceHelper.max_fatigue_id,"/", 0.25);
			st.new_descrease_description("</n> looks a little tired. ",FPalaceHelper.max_fatigue_id,"/", 0.50);
			st.new_descrease_description("</n> is moving around actively. ",FPalaceHelper.max_fatigue_id,"/", 0.75);
			
			
			st.add_combat_status_check("<", -2, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> collapses from exhaustion. ", true);
			st.add_overworld_status_check("<", -2, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> is too fatigued to do that! ", true);
			
			return st;
		}
		
		public static Stat stat_max_fatigue(){
			Stat st = new Stat(FPalaceHelper.max_fatigue_id);
			st.setName("Max Fatigue");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("");
			st.new_descrease_description("");
			st.set_always_calc();
			
			//st.set_stat_calculation(new String[]{"k" + FPalace_skills.fortitude_id, "/", Double.toString(15.0)});
			
			st.add_combat_status_check("<=", -1, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> collapses from exhaustion. ");
			
			return st;
		}
		
		public static Stat stat_curr_mp(){
			Stat st = new Stat(FPalaceHelper.curr_mp_id);
			st.setName("Current MP");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.set_max(FPalaceHelper.max_mp_id);
			st.new_increase_description("");			
			
			return st;
		}
		
		public static Stat stat_max_mp(){
			Stat st = new Stat(FPalaceHelper.max_mp_id);
			st.setName("Max MP");
			st.set_show_decimal(0);
			st.set_min(-2);
			st.new_description("");
			st.new_increase_description("");
			st.new_descrease_description("");
			st.set_always_calc();
			
			//st.set_stat_calculation(new String[]{"k" + FPalace_skills.concentration_id, "/", Double.toString(2.0)});
			
			st.add_combat_status_check("<=", -1, Stat.STATUSCONFIRMEDDEAD);
			
			return st;
		}
		
		public static Stat stat_lust(){
			Stat st = new Stat(FPalaceHelper.lust_id);
			st.setName("Lust");
			st.set_show_decimal(0);
			st.new_description("");
			st.set_min(FPalaceHelper.min_lust_id);
			st.new_increase_description("");
			st.new_descrease_description("");
			
			st.add_combat_status_check(">=", FPalaceHelper.max_lust_id, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> is suddenly pre-ocupied with </noun> own body! ", true);
			
			st.add_overworld_status_check(">=", FPalaceHelper.max_lust_id, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> is too lusty to do that! ", true);
			
			return st;
		}
		
		public static Stat stat_height(){
			Stat st = new Stat(FPalaceHelper.height_id);
			st.setName("Height");
			st.set_min(-2);
			st.set_always_show();
			Integer[] parts_to_show = {head_slot, torso_slot, hips_slot, legs_slot, feet_slot, barrel_slot};//was array with non curly 
			st.set_stat_description_show(new ArrayList<Integer>(Arrays.asList(parts_to_show)));//show this as a total in appearance instead of individually
			st.new_description("</pronoun> is only </"+FPalaceHelper.height_id+"> inches tall. <br><br>",0);
			st.new_description("</pronoun> is under 2' tall. ",12);
			st.new_description("</pronoun> is under 3' tall. ",24);
			st.new_description("</pronoun> is 3' tall. ",36);
			st.new_description("</pronoun> is 3'1\" tall. ",37);
			st.new_description("</pronoun> is 3'2\" tall. ",38);
			st.new_description("</pronoun> is 3'3\" tall. ",39);
			st.new_description("</pronoun> is 3'4\" tall. ",40);
			st.new_description("</pronoun> is 3'5\" tall. ",41);
			st.new_description("</pronoun> is 3'6\" tall. ",42);
			st.new_description("</pronoun> is 3'7\" tall. ",43);
			st.new_description("</pronoun> is 3'8\" tall. ",44);
			st.new_description("</pronoun> is 3'9\" tall. ",45);
			st.new_description("</pronoun> is 3'10\" tall. ",46);
			st.new_description("</pronoun> is 3'11\" tall. ",47);
			st.new_description("</pronoun> is 4' tall. ",48);
			st.new_description("</pronoun> is 4'1\" tall. ",49);
			st.new_description("</pronoun> is 4'2\" tall. ",50);
			st.new_description("</pronoun> is 4'3\" tall. ",51);
			st.new_description("</pronoun> is 4'4\" tall. ",52);
			st.new_description("</pronoun> is 4'5\" tall. ",53);
			st.new_description("</pronoun> is 4'6\" tall. ",54);
			st.new_description("</pronoun> is 4'7\" tall. ",55);
			st.new_description("</pronoun> is 4'8\" tall. ",56);
			st.new_description("</pronoun> is 4'9\" tall. ",57);
			st.new_description("</pronoun> is 4'10\" tall. ",58);
			st.new_description("</pronoun> is 4'11\" tall. ",59);
			st.new_description("</pronoun> is 5' tall. ",60);
			st.new_description("</pronoun> is 5'1\" tall. ",61);
			st.new_description("</pronoun> is 5'2\" tall. ",62);
			st.new_description("</pronoun> is 5'3\" tall. ",63);
			st.new_description("</pronoun> is 5'4\" tall. ",64);
			st.new_description("</pronoun> is 5'5\" tall. ",65);
			st.new_description("</pronoun> is 5'6\" tall. ",66);
			st.new_description("</pronoun> is 5'7\" tall. ",67);
			st.new_description("</pronoun> is 5'8\" tall. ",68);
			st.new_description("</pronoun> is 5'9\" tall. ",69);
			st.new_description("</pronoun> is 5'10\" tall. ",70);
			st.new_description("</pronoun> is 5'11\" tall. ",71);
			st.new_description("</pronoun> is 6' tall. ",72);
			st.new_description("</pronoun> is 6'1\" tall. ",73);
			st.new_description("</pronoun> is 6'2\" tall. ",74);
			st.new_description("</pronoun> is 6'3\" tall. ",75);
			st.new_description("</pronoun> is 6'4\" tall. ",76);
			st.new_description("</pronoun> is 6'5\" tall. ",77);
			st.new_description("</pronoun> is 6'6\" tall. ",78);
			st.new_description("</pronoun> is 6'7\" tall. ",79);
			st.new_description("</pronoun> is 6'8\" tall. ",80);
			st.new_description("</pronoun> is 6'9\" tall. ",81);
			st.new_description("</pronoun> is 6'10\" tall. ",82);
			st.new_description("</pronoun> is 6'11\" tall. ",83);
			st.new_description("</pronoun> is 7' tall. ",84);
			st.new_description("</pronoun> is 7'1\" tall. ",85);
			st.new_description("</pronoun> is 7'2\" tall. ",86);
			st.new_description("</pronoun> is 7'3\" tall. ",87);
			st.new_description("</pronoun> is 7'4\" tall. ",88);
			st.new_description("</pronoun> is 7'5\" tall. ",89);
			st.new_description("</pronoun> is 7'6\" tall. ",90);
			st.new_description("</pronoun> is 7'7\" tall. ",91);
			st.new_description("</pronoun> is 7'8\" tall. ",92);
			st.new_description("</pronoun> is 7'9\" tall. ",93);
			st.new_description("</pronoun> is 7'10\" tall. ",94);
			st.new_description("</pronoun> is 7'11\" tall. ",95);
			st.new_description("</pronoun> is 8' tall. ",96);
			st.new_description("</pronoun> is 8'1\" tall. ",97);
			st.new_description("</pronoun> is 8'2\" tall. ",98);
			st.new_description("</pronoun> is 8'3\" tall. ",99);
			st.new_description("</pronoun> is 8'4\" tall. ",100);
			st.new_description("</pronoun> is 8'5\" tall. ",101);
			st.new_description("</pronoun> is 8'6\" tall. ",102);
			st.new_description("</pronoun> is 8'7\" tall. ",103);
			st.new_description("</pronoun> is 8'8\" tall. ",104);
			st.new_description("</pronoun> is 8'9\" tall. ",105);
			st.new_description("</pronoun> is 8'10\" tall. ",106);
			st.new_description("</pronoun> is 8'11\" tall. ",107);
			st.new_description("</pronoun> is more than nine feet tall. ",108);
			st.new_description("</pronoun> is more than ten feet tall. ",120);
			st.new_description("</pronoun> is more than eleven feet tall. ",132);
			st.new_description("</pronoun> is more than twelve feet tall. ",144);
			//st.new_description("",0);
			st.new_increase_description("</n> looks taller. ");
			st.new_descrease_description("</n> looks shorter. ");
			
			//new_stat(FPalaceHelper.height_id, st, 66);
			return st;
		}
		
		public static Stat stat_biomass_consumed(){
			Stat st = new Stat(FPalaceHelper.biomass_consumed);
			st.setName("Internal floating fluid");
			st.set_min(-2);
			st.set_stat_description_show();
			st.new_description("",0);
			st.new_description("There is a bit of milky substance floating in </noun> goo. ",1);
			st.new_increase_description("</n> looks fuller. ");
			st.new_descrease_description("</n> looks like </pronoun> could use a good meal. ");
						
			return st;
		}
		
		public static Stat stat_erection_ratio(){
			Stat st = new Stat(FPalaceHelper.erection_ratio_id);
			st.setName("Erection ratio");
			st.new_description("");
			st.set_min(-2);
			st.set_max(-3);
			st.set_alchemy_hundreds();
			st.new_increase_description("</n> looks like a shower. ");
			st.new_descrease_description("</n> looks like a grower. ");
						
			return st;
		}
		
		public static Stat stat_weight(){//may need to do one for each separate part....
			Stat st = new Stat(FPalaceHelper.weight_id);
			st.setName("Weight");
			st.new_description("");
			st.new_increase_description("</n> looks heavier. ");
			st.new_descrease_description("</n> looks more fit. ");
			st.set_min(-2);
			st.set_rummage_inv();
			st.set_rummage_body();
			
			/*st.set_stat_calculation("(", "s" + FPalaceHelper.penis_girth_id, "*", "s" + FPalaceHelper.penis_girth_id, "/", 12.5, "*", "s" + FPalaceHelper.penis_length_id, "/", 3.0, ")", "+", 
				"(", "s" + FPalaceHelper.breast_size_id, "*", "s" + FPalaceHelper.breast_size_id, "*", "s" + FPalaceHelper.breast_size_id, "/", 25.0,")", "+",
				"(", "s" + FPalaceHelper.balls_size_id, "*", "s" + FPalaceHelper.balls_size_id, "*", "s" + FPalaceHelper.balls_size_id, "/", 248.0, ")", "+",
				"(","(","(", "s" + FPalaceHelper.hips_id, "+","s" + FPalaceHelper.bust_id, "+", "s" + FPalaceHelper.waist_id, "/", 3.0, ")" , "*", "s" + FPalaceHelper.height_id, ")" , "/", 32.0,")",  "+",
				"(", "s" + FPalaceHelper.bloat_id, "*", "s" + FPalaceHelper.bloat_id, "*", "s" + FPalaceHelper.bloat_id, "/", 8.0,")", "+",
				"(", "s" + FPalaceHelper.biomass_consumed, "/", 1000.0, ")")*/
			/*st.set_stat_calculation(new String[]{"(", "s" + FPalaceHelper.penis_girth_id, "*", "s" + FPalaceHelper.penis_girth_id, "/", Double.toString(12.5), "*", "s" + FPalaceHelper.penis_length_id, "/", Double.toString(3.0), ")", "+", 
				"(", "s" + FPalaceHelper.breast_size_id, "*", "s" + FPalaceHelper.breast_size_id, "*", "s" + FPalaceHelper.breast_size_id, "/", Double.toString(25.0),")", "+",
				"(", "s" + FPalaceHelper.balls_size_id, "*", "s" + FPalaceHelper.balls_size_id, "*", "s" + FPalaceHelper.balls_size_id, "/", Double.toString(248.0), ")", "+",
				"(","(","(", "s" + FPalaceHelper.hips_id, "+","s" + FPalaceHelper.bust_id, "+", "s" + FPalaceHelper.waist_id, "/", Double.toString(3.0), ")" , "*", "s" + FPalaceHelper.height_id, ")" , "/", Double.toString(32.0),")",  "+",
				"(", "s" + FPalaceHelper.bloat_id, "*", "s" + FPalaceHelper.bloat_id, "*", "s" + FPalaceHelper.bloat_id, "/", Double.toString(8.0),")", "+",
				"(", "s" + FPalaceHelper.biomass_consumed, "/", Double.toString(1000.0), ")"});
			*/
			st.add_overworld_status_check(">=", FPalaceHelper.max_weight_id, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> is carrying to much to do that! ");
			st.add_combat_status_check(">=", FPalaceHelper.max_weight_id, Stat.STATUSCONFIRMEDINCAPACITATED, "</n> collapses from the weight </pronoun> is carrying! ");
			
			return st;
		}
		
		public static Stat stat_max_weight(){
			Stat st = new Stat(FPalaceHelper.max_weight_id);
			st.setName("Max Weight");
			st.new_description("");
			st.new_increase_description("</n> looks like </pronoun> can carry more. ");
			st.new_descrease_description("</n> looks physically weaker. ");
			
			//st.set_stat_calculation(new String[]{"(", "s" + FPalaceHelper.str_id, "*", "s" + FPalaceHelper.str_id, ")", "+", "s" + FPalaceHelper.height_id});
						
			return st;
		}
		
		public static Stat stat_milk_volume(){
			//An actual breast feeding woman will produce a little over 10 times the default amount when being milked... the things you learn!
			Stat s = new Stat(milk_volume_id);
			s.set_min(-2);
			s.setName("Milk Production");
			s.new_description("");
			s.new_increase_description("</n> feels </noun> breasts swell with milk. ");
			s.new_descrease_description("</n>s breasts feel empty. ");
			//s.set_stat_calculation(new String[]{"s" + FPalaceHelper.breast_size_id, "*", "s" + FPalaceHelper.breast_size_id, "*", "s" + FPalaceHelper.breast_size_id});
			
			s.new_short_description("dram",0);
			s.new_short_description("teaspoon",5);
			s.new_short_description("tablespoon",15);
			s.new_short_description("ounce",29);
			s.new_short_description("gill",142);
			s.new_short_description("cup",284);
			s.new_short_description("pint",568);
			s.new_short_description("quart",1140);
			s.new_short_description("gallon",4550);
			s.new_short_description("multiple gallons",9000);
				
			return s;				
		}
		
		public static Trait trait_gold_gain(){
			Trait t = new Trait();
			t.set_stat_trait(Character.gold_id);
			return t;
		}
		
		public static Trait trait_has_gold(){
			Trait t = new Trait();
			t.set_stat_trait(Character.gold_id,-1);//has more money then I do
			return t;
		}
		
		public static Trait trait_is_taller(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.height_id,-1);
			return t;
		}
		
		public static Trait trait_hp_gain(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.curr_hp_id);
			return t;
		}
		
		public static Trait trait_max_hp_gain(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.max_hp_id);
			return t;
		}
		
		public static Trait trait_lust_gain(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.lust_id);
			t.set_attraction_check(Trait.attracted);
			return t;
		}
		
		public static Trait trait_lust_gain_by_unattractive(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.lust_id);
			t.set_attraction_check(Trait.disgusted);
			return t;
		}
		
		public static Trait trait_fatigue_gain(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.curr_fatigue_id);
			return t;
		}
		
		public static Trait trait_mp_gain(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.curr_mp_id);
			return t;
		}
		
		public static Trait trait_hp_loss(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.curr_hp_id, 0, false);
			t.set_trait_strength(6);
			return t;
		}
		
		public static Trait trait_lust_loss(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.lust_id, 0, false);
			t.set_attraction_check(Trait.attracted);
			return t;
		}
		
		public static Trait trait_lust_loss_by_unattractive(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.lust_id, 0, false);
			t.set_attraction_check(Trait.disgusted);
			return t;
		}
		
		public static Trait trait_beauty_loss(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.sex_appeal_id, 0, false);
			return t;
		}
		
		public static Trait trait_semen_production(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.cum_volume_id, 1);
			return t;
		}
		
		public static Trait trait_milk_production(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.milk_volume_id, 1);
			return t;
		}
		
		public static Trait trait_high_fertility(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.egg_fertility_id, 0.4);
			return t;
		}
		
		public static Trait trait_high_beauty(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.sex_appeal_id, 10);
			return t;
		}
		
		public static Trait trait_high_willpower(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.will_id, 10);
			return t;
		}
		
		public static Trait trait_high_strength(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.str_id, 10);
			return t;
		}
		
		public static Trait trait_high_wisdom(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.wis_id, 10);
			return t;
		}
		
		public static Trait trait_high_intelligence(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.int_id, 10);
			return t;
		}
		
		public static Trait trait_high_dexterity(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.dex_id, 10);
			return t;
		}
		
		public static Trait trait_high_finalitution(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.con_id, 10);
			return t;
		}
		
		public static Trait trait_high_charisma(){
			Trait t = new Trait();
			t.set_stat_trait(FPalaceHelper.cha_id, 10);
			return t;
		}
		
		public static Trait trait_has_penis(){
			Trait t = new Trait();
			t.set_trait_strength(2);
			t.set_part_id(cock_slot);
			return t;
		}
		
		public static Trait trait_has_vagina(){
			Trait t = new Trait();
			t.set_trait_strength(2);
			t.set_part_id(vag_slot);
			return t;
		}
		
		public static Trait trait_has_breasts(){
			Trait t = new Trait();
			t.set_part_id(breasts_slot);
			return t;
		}
		
		public static Trait trait_is_human(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_human());
			return t;
		}
		
		public static Trait trait_is_goblin(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_goblin());
			return t;
		}
		
		public static Trait trait_is_actino(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_fish());
			return t;
		}
		
		public static Trait trait_is_equidae(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_donkey());
			return t;
		}
		
		public static Trait trait_is_caudata(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_lizard());
			return t;
		}
		
		public static Trait trait_is_goo(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_goo());
			return t;
		}
		
		public static Trait trait_is_lagomorph(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_rabbit());
			return t;
		}
		
		public static Trait trait_is_elf(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_elf());
			return t;
		}
		
		public static Trait trait_is_dwarf(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_dwarf());
			return t;
		}
		
		public static Trait trait_is_feline(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_feline());
			return t;
		}
		
		public static Trait trait_is_bovine(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_bovine());
			return t;
		}
		
		public static Trait trait_is_equine(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_equine());
			return t;
		}
		
		public static Trait trait_is_apini(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_bee());
			return t;
		}
				
		public static Trait trait_is_spider(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_anthro_spider());
			return t;
		}
		
		public static Trait trait_is_sexsnake(){
			Trait t = new Trait();
			t.set_racial_trait(FPalace_races.race_sexsnake());
			return t;
		}
		
		public static DamageType lust_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(0);
			dt.set_type_name("Lust");
			return dt;
		}
		
		public static DamageType bludg_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(1);
			dt.set_type_name("Bludgeoning");
			return dt;
		}
		
		public static DamageType pierce_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(2);
			dt.set_type_name("Piercing");
			return dt;
		}
		
		public static DamageType slash_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(3);
			dt.set_type_name("Slashing");
			return dt;
		}
		
		public static DamageType earth_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(4);
			dt.set_type_name("Earth");
			return dt;
		}
		
		public static DamageType air_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(5);
			dt.set_type_name("Air");
			return dt;
		}
		
		public static DamageType water_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(6);
			dt.set_type_name("Water");
			return dt;
		}
		
		public static DamageType acid_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(7);
			dt.set_type_name("Acid");
			return dt;
		}
		
		public static DamageType fire_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(8);
			dt.set_type_name("Fire");
			return dt;
		}
		
		public static DamageType lit_damage_type(){
			DamageType dt = new DamageType();
			dt.set_type_id(9);
			dt.set_type_name("Lightning");
			return dt;
		}
		
		public static Area_weather clear_skies_weather(){
			Area_weather weather = new Area_weather();
			
			weather.set_minimum_length(FPGameGithub.T1_HOUR*6);
			weather.new_daytime_status("It is night, the moon high in the sky.<br>",0);
			weather.new_daytime_status("It is the early morning, sun shinning from the east.<br>",FPGameGithub.T1_DAY*1/4);
			weather.new_daytime_status("It is the morning, the sun shining brightly.<br>",FPGameGithub.T1_DAY*3/8);
			weather.new_daytime_status("It is the afternoon, the sun high overhead.<br>",FPGameGithub.T1_DAY*1/2);
			weather.new_daytime_status("It is the late afternoon, the sun shining brightly.<br>",FPGameGithub.T1_DAY*5/8);
			weather.new_daytime_status("It is the evening, the sun retreating to the west.<br>",FPGameGithub.T1_DAY*3/4);
			weather.new_daytime_status("It is night, the moon high in the sky.<br>",FPGameGithub.T1_DAY*7/8);
			
			return weather;			
		}
		
		public static Area_weather rain_weather(){
			Area_weather weather = new Area_weather();
			
			weather.set_minimum_length(FPGameGithub.T1_HOUR*6);
			weather.new_daytime_status("It is night, and raining heavily.<br>",0);
			weather.new_daytime_status("It is the early morning, though the rain obscures the sun.<br>",FPGameGithub.T1_DAY*1/4);
			weather.new_daytime_status("It is the morning, the rain unable to abate the light of the sun.<br>",FPGameGithub.T1_DAY*3/8);
			weather.new_daytime_status("It is the afternoon, silver lining bright in the clouds pouring rain down.<br>",FPGameGithub.T1_DAY*1/2);
			weather.new_daytime_status("It is the late afternoon, the rain unable to abate the light of the sun.<br>",FPGameGithub.T1_DAY*5/8);
			weather.new_daytime_status("It is the evening, the sun visible between the horizon and the rain.<br>",FPGameGithub.T1_DAY*3/4);
			weather.new_daytime_status("It is night, and raining heavily.<br>",FPGameGithub.T1_DAY*7/8);
			
			return weather;			
		}
		
		public static Container cart_container(){
			Container cont = new Container();
			cont.set_name("Cart");
			cont.open();
			cont.set_always_open();
			cont.set_description("There is a <s0>broken cart</s0> to the side of the path. ");
			cont.add_sub_descriptions("It is an aging merchants cart, a broken axle making it useless. ");
			
			cont.add_to_loot_table(FPalace_items.Healing_Potion(),0.1);
			cont.add_to_loot_table(FPalace_items.textiles(),0.6);
			cont.add_to_loot_table(FPalace_items.wood(),0.4);
			cont.add_to_loot_table(FPalace_items.leather(),0.1);
			cont.add_to_loot_table(FPalace_items.iron(),0.1);
			cont.add_to_loot_table(FPalace_items.bandages(),0.4);
			cont.add_to_loot_table(FPalace_items.knife(),0.1);
			cont.add_to_loot_table(FPalace_items.reduction_salve(),0.1);
			cont.add_to_loot_table(FPalace_items.Tent(),0.1);	
			
			CharAction ba = new CharAction();
			ba.set_dialogue("",0);
			
			Challenge challenge = new Challenge(true);
			challenge.set_attack_stat(FPalace_skills.items_id);
			challenge.set_defense_stat(-1,15);
			challenge.setVariability(20);
			ItemConsequence iconsequence = new ItemConsequence();
			iconsequence.addConsequence(FPalaceHelper.curr_fatigue_id,-1,"You work for awhile, managing to not only break the cart down, but recover material as well. ",0);
			iconsequence.addConsequence(FPalaceHelper.curr_fatigue_id,-1,"You work for awhile and manage to dispose of the broken cart. ",-1);
			iconsequence.add_item_reward(FPalace_items.wood(),0);
			iconsequence.add_item_reward(FPalace_items.wood(),2);
			iconsequence.add_item_reward(FPalace_items.wood(),4);
			iconsequence.add_item_reward(FPalace_items.wood(),6);
			iconsequence.add_item_reward(FPalace_items.wood(),8);
			iconsequence.add_item_reward(FPalace_items.wood(),10);			
			
			ba.addChallenge(challenge,iconsequence);
			cont.set_bury("clean up", "cleans up", ba);
			
			return cont;
        }
        public JLabel loadIMG(String i) {
            //String listingFolder = MainGUIPanel.class.getProtectionDomain().getCodeSource().getLocation().getPath()
            URL url = FPalaceHelper.class.getResource(i);//imageURL[unknown_img])
            ImageIcon ii = new ImageIcon(url); 
            return new JLabel(ii);
        }
						
	}
	

