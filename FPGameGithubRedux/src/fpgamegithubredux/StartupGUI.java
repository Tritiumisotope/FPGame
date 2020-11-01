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
    protected String contents;
    protected String fpLink;
    protected HyperlinkListener hlListen;
    public StartupGUI(){
        contents = "Click 'New Game' to begin a new game. You can use the numpad to move in the cardinal directions," +
                                "as well as to look at where you are and check your status. Keybinds can be changed in the options menu. "
                                +"You can interact with the world through various keywords, sometimes highlighted <font color='#4CC417'>like this</font>, or <i>this</i>, but othertimes not. Experiment to see what you can do!\n\n\n"
				+ "If you have any comments, criticism, or suggestions, please feel free to share! ";
        fpLink = "<br><a href=\"https://www.futanaripalace.com/showthread.php?37585-Well-here-s-my-attempt\">https://www.futanaripalace.com/showthread.php?37585-Well-here-s-my-attempt<a>";
    }
    public void setStartup(JTextPane upperTextField){
        upperTextField.setText(contents+ fpLink);
        upperTextField.setEditable(false);
        hlListen = e -> {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                    try {
                        URL url = e.getURL();
                        URI uri = url.toURI();
                        desktop.browse(uri);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        /* apparently this is the same?
        hlListen = new HyperlinkListener()  {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                        try {
                            URL url = e.getURL();
                            URI uri = url.toURI();   
                            desktop.browse(uri);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        };
        */
        upperTextField.addHyperlinkListener(hlListen);
    }
    public void exitStartup(JTextPane upperTextField){
        upperTextField.removeHyperlinkListener(hlListen);
    }
}
