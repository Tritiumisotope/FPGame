/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpgamegithubredux;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import javax.swing.JTextPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author Ailer and Tritium
 */
public class StartupGUI {
    public String contents;
    public String FPlink;
    public HyperlinkListener HLlisten;
    public StartupGUI(){
        contents = "Click 'New Game' to begin a new game. You can use the numpad to move in the cardinal directions," +
                                "as well as to look at where you are and check your status. Keybinds can be changed in the options menu. "
                                +"You can interact with the world through various keywords, sometimes highlighted <font color='#4CC417'>like this</font>, or <i>this</i>, but othertimes not. Experiment to see what you can do!\n\n\n"
				+ "If you have any comments, criticism, or suggestions, please feel free to share! ";
        FPlink = "<br><a href=\"https://www.futanaripalace.com/showthread.php?37585-Well-here-s-my-attempt\">https://www.futanaripalace.com/showthread.php?37585-Well-here-s-my-attempt<a>";
    }
    public void setStartup(JTextPane upper_text_field){
        upper_text_field.setText(contents+ FPlink);
        upper_text_field.setEditable(false);
        HLlisten = new HyperlinkListener()  {
        @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    //System.out.println(1);
                    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                    //System.out.println(2);
                    //System.out.println(e.getURL());
                    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                        //System.out.println(2.5);
                        try {
                            //System.out.println(3);
                            //System.out.println(e.getURL());
                            URL url = e.getURL();
                            //System.out.println(url);
                            URI uri = url.toURI();   
                            //System.out.println(uri);
                            desktop.browse(uri);

                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        };
        upper_text_field.addHyperlinkListener(HLlisten);
    }
    public void exitStartup(JTextPane upper_text_field){
        upper_text_field.removeHyperlinkListener(HLlisten);
    }
}
