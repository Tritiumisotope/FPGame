/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.text.Format;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author hhhin
 */
public class FPGameGithub {
//timescales 1:180, 1:6		
    		public static int t6_sec = 1;
		public static int t1_min = 1;//10;//
		public static int t10_min = 3;//100;//
		public static int t30_min = 9;//300;//
		public static int t1_hour = 18;//600;//
		public static int t1_day = 432;//14400;//
		public static int t1_week = 3024;//100800;//
		public static int t1_month = 12096;//403200;//
		public static int t1_year = 145152;//4838400
		public JTextField input_text;
		//public var world_gen_progressbar:ProgressBar;
		//public var sound_music_channel:SoundChannel;
		public int  background_img_id;
		public int GUI_height;//unused
		public int  GUI_width;//unused
                static long tm = 0,  tm2 = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Format button_text_format = new Format();
	//button_text_format.size = 16;
        
        /*
        textfield_text_format = new TextFormat();
        textfield_text_format.size = 12;
        textfield_text_format.color = 0x000000;
        textfield_text_format.font = "Times New Roman";
        textfield_text_format.italic = false;
        textfield_text_format.leftMargin

        combat_text_format = new TextFormat();
        combat_text_format.size = 20;
        combat_text_format.color = Main_gui.combat_txt_colour;

        array_of_fate = null;
        */
        FPGameGithub Main = new FPGameGithub();
        Main.background_img_id = -1;
        JFrame Window = new JFrame();
        GridBagLayout gbl = new GridBagLayout();
        Window.setTitle("Welcome...");
        Window.setSize(1639,1024);
        MainGUIPanel primarypanel = new MainGUIPanel();
        
        int appWidth  = Window.getWidth();
        int appHeight = Window.getHeight();
        Window.add(primarypanel);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Window.pack();
        Window.setVisible(true);
        try{
        Thread.sleep(1000);
        }
        catch (InterruptedException ex) {}
        
        while (primarypanel.isVisible()) {
        tm = System.currentTimeMillis();
        primarypanel.repaint();
        try {
            tm2 = System.currentTimeMillis();
            Thread.sleep(Math.max(0, tm + 1000 - tm2));
            }
        catch (InterruptedException ex) {}
        }
    }  
}