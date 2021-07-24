package fpgamegithubredux;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class DrawableTextArea  extends JTextPane{
    private boolean mapVisible;
    private Room curRoom;
    private String mapString;

    ArrayList<ArrayList<ArrayList<Room>>> rooms;//reads from player location room area
    public DrawableTextArea()
    {

        //Create a window using JFrame with title ( Add image background in JTextArea )
        //JFrame frame=new JFrame("Add image background in JTextArea");
        //MainGUIPanel thePanel = parent;
        //Add JTextArea into JFrame
        //frame.add(this);

        //Set default close operation for JFrame
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set JFrame size
        //frame.setSize(500,500);

        //Make JFrame center
        //frame.setLocationRelativeTo(null);

        //Make JFrame visible
        //frame.setVisible(true);
        mapVisible = false;
        mapString = "";
    }
    public void setMap(boolean visible){
        mapVisible = visible;
    }
    public boolean getMap(){
        return mapVisible;
    }
    public void setMapString(String mS){
        mapString = mS;
    }
    public void setCurRoom(Room playerRoom){
        curRoom = playerRoom;
    }
    //Override JTextArea paint method
    //It enable us to paint JTextArea background image
    public void paint(Graphics g)
    {
        //Make JTextArea transparent
        //setOpaque(false);

        //Get image that we use as JTextPane background
        //ImageIcon ii=new ImageIcon("textAreaBackground.jpg");
        //Image i=ii.getImage();

        //Draw JTextArea background image
        //g.drawImage(i,0,0,null,this);

        //Call super.paint. If we don't do this...We can't see JTextPane
        super.paint(g);
        
        if(mapVisible){
            int center_x = this.getWidth()/2-8;
            int center_y = this.getHeight()/2-8;
            int sightDistance = 99; //later use a return from player skill in main
            g.setColor(Color.black);
            g.drawRect(center_y+3, center_x+3, 10, 10);
            g.setColor(Color.gray);
            g.fillRect(center_y+4, center_x+4, 8, 8);
            g.setColor(Color.black);
            Area curArea = curRoom.area;
            int[] coords = curArea.find_room(curRoom);
            System.out.println("x: " + coords[0] + 
            "y: " + coords[1] + "z: " + coords[2]);
            rooms = curArea.rooms;
            int z = coords[2];
            for(int minix = -1;minix<=1;minix++){//draw all cardinal directions
                for(int miniy = -1;miniy<=1;miniy++){                              
                    if(checkValidRoom(coords[0]+minix, coords[1]+miniy, z) &&/*rooms.get(coords[0]+minix).get(coords[1]+miniy).get(z) !=null &&*/ 
                    /*check connected*/ rooms.get(coords[0]+minix).get(coords[1]+miniy).get(z).get_exit_id(curRoom)!=-1){
                        g.drawLine(
                            center_y+8 - miniy*5,
                            center_x+8 + minix*5,
                            center_y+8 - miniy*8,
                            center_x+8 + minix*8
                        );//draw the directional lines for current location
                    }
                }
            }

            for(int x = 0; x<rooms.size();x++){
                for(int y =0;y<rooms.get(x).size();y++){
                    if(checkValidRoom(x,y,z) &&/*valid room stack, was .get(y) != null*/
                    Math.pow((Math.abs(x-coords[0]) + Math.abs(y-coords[1])),2)
                    <Math.pow(sightDistance,2)){//pythagorean theorem of right angle distance
                        //a^2+b^2 = c^2 so c^2 must be less than sight distance^2
                        g.drawRect(center_y+3+(coords[1]-y)*16, center_x+3+(x-coords[0])*16, 10, 10);
                        for(int minix = -1;minix<=1;minix++){//draw all cardinal directions
                            for(int miniy = -1;miniy<=1;miniy++){                                                                            
                                if(checkValidRoom(x+minix, y+miniy, z) && /*check connected*/ 
                                rooms.get(x+minix).get(y+miniy).get(z).get_exit_id(rooms.get(x).get(y).get(z))!=-1){
                                    g.drawLine(center_y+8+(coords[1]-y)*16 - miniy*5,
                                    center_x+8+(x-coords[0])*16 + minix*5,
                                    center_y+8+(coords[1]-y)*16 - miniy*8,
                                    center_x+8+(x-coords[0])*16 + minix*8
                                    );//draw the directional lines
                                }
                            }
                        }
                    }
                }
            }
        }

    }
    public boolean checkValidRoom(int x, int y, int z){
        if(rooms.size()>x && x>=0){//x is within a valid range
            if(rooms.get(x)!=null){//x is a valid plane
                if(rooms.get(x).size()>y && y>=0){//y is within a valid range
                    if(rooms.get(x).get(y)!=null){//x-y is a valid line
                        if(rooms.get(x).get(y).size()>z && z>=0){//z is within a valid range
                            if(rooms.get(x).get(y).get(z)!=null){
                                //x-y-z is a room (only other option is null)
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

}
