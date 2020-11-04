package fpgamegithubredux;

public class OldFPHelper {
    /*replaced by arraylist version
		public static Bitmap get_image_by_id(int image_id){
			BufferedImage ret = null;
			if(images == null){
				//images = new Array();
				images[unknown_img] = unknown;
				
				images[test_img] = image_1;
				//images[linty_1_img] = linty_1;
				
				images[background_test_img] = background_test;
				
				images[human_head_1_img] = human_head_1;
				images[human_eyes_1_img] = human_eyes_1;
				images[human_torso_1_img] = human_torso_1;
				images[human_hips_1_img] = human_hips_1;
				images[human_breasts_1_img] = human_breasts_1;
				images[human_balls_1_img] = human_balls_1;
				images[human_penis_1_img] = human_penis_1;
				images[human_leg_1_img] = human_leg_1;
				images[human_foot_1_img] = human_foot_1;
				images[human_arm_1_img] = human_arm_1;
				images[human_hand_1_img] = human_hand_1;
				
				images[goo_char_img] = goo_char_1;
				
				images[futa_cola_1_img] = futa_cola_1;
				images[view34_test_img] = view34_test;
				
				images[Button_disabledSkin_img] = Button_disabledSkin;
				images[Button_downSkin_img] = Button_downSkin;
				images[Button_emphasizedSkin_img] = Button_emphasizedSkin;
				images[Button_overSkin_img] = Button_overSkin;
				images[Button_selectedDisabledSkin_img] = Button_selectedDisabledSkin;
				images[Button_selectedDownSkin_img] = Button_selectedDownSkin;
				images[Button_selectedOverSkin_img] = Button_selectedOverSkin;
				images[Button_selectedUpSkin_img] = Button_selectedUpSkin;
				images[Button_upSkin_img] = Button_upSkin;
				
				images[ProgressBar_barSkin_img] = ProgressBar_barSkin;
				images[ProgressBar_indeterminateSkin_img] = ProgressBar_indeterminateSkin;
				images[ProgressBar_trackSkin_img] = ProgressBar_trackSkin;
				
				images[TextArea_disabledSkin_img] = TextArea_disabledSkin;
				images[TextArea_upSkin_img] = TextArea_upSkin;
				
				images[ScrollArrowDown_disabledSkin_img] = ScrollArrowDown_disabledSkin;
				images[ScrollArrowDown_downSkin_img] = ScrollArrowDown_downSkin;
				images[ScrollArrowDown_overSkin_img] = ScrollArrowDown_overSkin;
				images[ScrollArrowDown_upSkin_img] = ScrollArrowDown_upSkin;
				images[ScrollArrowUp_disabledSkin_img] = ScrollArrowUp_disabledSkin;
				images[ScrollArrowUp_downSkin_img] = ScrollArrowUp_downSkin;
				images[ScrollArrowUp_overSkin_img] = ScrollArrowUp_overSkin;
				images[ScrollArrowUp_upSkin_img] = ScrollArrowUp_upSkin;
				images[ScrollBar_thumbIcon_img] = ScrollBar_thumbIcon;
				images[ScrollThumb_downSkin_img] = ScrollThumb_downSkin;
				images[ScrollThumb_overSkin_img] = ScrollThumb_overSkin;
				images[ScrollThumb_upSkin_img] = ScrollThumb_upSkin;
				images[ScrollTrack_skin_img] = ScrollTrack_skin;
				
				images[TextInput_disabledSkin_img] = TextInput_disabledSkin;
				images[TextInput_upSkin_img] = TextInput_upSkin;
			}
			if(images[image_id] != null){
                //ret = new images[image_id] as BufferedImage;
                ret = (BufferedImage)new images[image_id];
			}else{
				ret = (BufferedImage)new unknown();
			}
			
			return ret;
        }
        */
//below now done in constructor, and lists made under the image ints
        //images to embed
        
        //[Embed (source="unknown.gif")]
        //img[unknown_img] = this.getResource("../imgs/unknown.gif");
    	//public static final Class unknown;
		
		/*
		[Embed (source="Button_disabledSkin.png")]
		public static final Class Button_disabledSkin;
		[Embed (source="Button_downSkin.png")]
		public static final Class Button_downSkin;
		[Embed (source="Button_emphasizedSkin.png")]
		public static final Class Button_emphasizedSkin;
		[Embed (source="Button_overSkin.png")]
		public static final Class Button_overSkin;
		[Embed (source="Button_selectedDisabledSkin.png")]
		public static final Class Button_selectedDisabledSkin;
		[Embed (source="Button_selectedDownSkin.png")]
		public static final Class Button_selectedDownSkin;
		[Embed (source="Button_selectedOverSkin.png")]
		public static final Class Button_selectedOverSkin;
		[Embed (source="Button_selectedUpSkin.png")]
		public static final Class Button_selectedUpSkin;
		[Embed (source="Button_upSkin.png")]
		public static final Class Button_upSkin;
		
		[Embed (source="ProgressBar_barSkin.png")]
		public static final ProgressBar_barSkin:Class;
		[Embed (source="ProgressBar_indeterminateSkin.png")]
		public static final ProgressBar_indeterminateSkin:Class;
		[Embed (source="ProgressBar_trackSkin.png")]
		public static final ProgressBar_trackSkin:Class;
		
		[Embed (source="TextArea_disabledSkin.png")]
		public static final TextArea_disabledSkin:Class;
		[Embed (source="TextArea_upSkin.png")]
		public static final TextArea_upSkin:Class;
		
		[Embed (source="ScrollArrowDown_disabledSkin.png")]
		public static final ScrollArrowDown_disabledSkin:Class;
		[Embed (source="ScrollArrowDown_downSkin.png")]
		public static final ScrollArrowDown_downSkin:Class;
		[Embed (source="ScrollArrowDown_overSkin.png")]
		public static final ScrollArrowDown_overSkin:Class;
		[Embed (source="ScrollArrowDown_upSkin.png")]
		public static final ScrollArrowDown_upSkin:Class;
		[Embed (source="ScrollArrowUp_disabledSkin.png")]
		public static final ScrollArrowUp_disabledSkin:Class;
		[Embed (source="ScrollArrowUp_downSkin.png")]
		public static final ScrollArrowUp_downSkin:Class;
		[Embed (source="ScrollArrowUp_overSkin.png")]
		public static final ScrollArrowUp_overSkin:Class;
		[Embed (source="ScrollArrowUp_upSkin.png")]
		public static final ScrollArrowUp_upSkin:Class;
		[Embed (source="ScrollBar_thumbIcon.png")]
		public static final ScrollBar_thumbIcon:Class;
		[Embed (source="ScrollThumb_downSkin.png")]
		public static final ScrollThumb_downSkin:Class;
		[Embed (source="ScrollThumb_overSkin.png")]
		public static final ScrollThumb_overSkin:Class;
		[Embed (source="ScrollThumb_upSkin.png")]
		public static final ScrollThumb_upSkin:Class;
		[Embed (source="ScrollTrack_skin.png")]
		public static final ScrollTrack_skin:Class;
		
		[Embed (source="TextInput_disabledSkin.png")]
		public static final TextInput_disabledSkin:Class;
		[Embed (source="TextInput_upSkin.png")]
		public static final TextInput_upSkin:Class;
		
		
		[Embed (source="linty_namiAndRobin.gif" )]
    	public static final image_1:Class;
		
		[Embed (source="462062941.jpg" )]
		public static final background_test:Class;
		
		[Embed (source="human_head_1.gif" )]
    	public static final human_head_1:Class;
		[Embed (source="human_eyes_1.jpg" )]
    	public static final human_eyes_1:Class;
		[Embed (source="human_torso_1.gif" )]
    	public static final human_torso_1:Class;
		[Embed (source="human_hips_1.gif" )]
    	public static final human_hips_1:Class;
		[Embed (source="human_leg_1.gif" )]
    	public static final human_leg_1:Class;
		[Embed (source="human_foot_1.gif" )]
    	public static final human_foot_1:Class;
		[Embed (source="human_arm_1.gif" )]
    	public static final human_arm_1:Class;
		[Embed (source="human_hand_1.gif" )]
    	public static final human_hand_1:Class;
		[Embed (source="human_breasts_1.gif" )]
		public static final human_breasts_1:Class;
		[Embed (source="human_balls_1.gif" )]
		public static final human_balls_1:Class;
		[Embed (source="human_penis_1.gif" )]
		public static final human_penis_1:Class;
		
		[Embed (source="slime_1.gif" )]
		public static final Class goo_char_1;
		
		[Embed (source="futa_cola_1.gif" )]
		public static final futa_cola_1:Class;
		
		[Embed (source="34_test.gif" )]
		public static final view34_test:Class;
		*/
    }
