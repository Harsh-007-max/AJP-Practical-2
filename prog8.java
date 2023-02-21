/*Create a frame of 300x200 having BorderLayout and each should 
contain a button having the Label same as the name of that region. 
(ex. NORTH, SOUTH, EAST, WEST, CENTER etc.) */
import java.awt.*;
import java.awt.Button;
public class prog8 extends Frame{
    Button c , n , s , e , w;
    prog8(){
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(300,200);
        n = new Button("NORTH");
        s = new Button("SOUTH");
        e = new Button("EAST");
        w = new Button("WEST");
        c = new Button("CENTER");
        add(n,BorderLayout.NORTH);
        add(s,BorderLayout.SOUTH);
        add(e,BorderLayout.EAST);
        add(w,BorderLayout.WEST);
        add(c,BorderLayout.CENTER);

    }
    public static void main(String[] args){
        prog8 p = new prog8();
    }

}