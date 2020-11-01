/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author Ailer and Tritium
 */
public class FPGameGithub {
//timescales 1:180, 1:6		
    public static final int T6_SEC = 1;
    public static final int T1_MIN = 1;//10
    public static final int T10_MIN = 3;//100
		public static final int T30_MIN = 9;//300
		public static final int T1_HOUR = 18;//600
		public static final int T1_DAY = 432;//14400
		public static final int T1_WEEK = 3024;//100800
		public static final int T1_MONTH = 12096;//403200
		public static final int T1_YEAR = 145152;//4838400
		protected JTextField inputText;
		//for later: public var world_gen_progressbar:ProgressBar;
		//for later: public var sound_music_channel:SoundChannel;
		protected int  backgroundImgId;
		protected int guiHeight;//unused
		protected int  guiWidth;//unused
    
    static long tm = 0;
    static long tm2 = 0;
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FPGameGithub container = new FPGameGithub();
        container.backgroundImgId = -1;
        JFrame window = new JFrame();        
        window.setTitle("Welcome...");
        window.setSize(800, 800);
        MainGUIPanel primarypanel = new MainGUIPanel();

        window.add(primarypanel);
        window.setMinimumSize(new Dimension(800, 800));
        window.addComponentListener(new ComponentAdapter() {
        });
        window.setVisible(true);
    }  
}