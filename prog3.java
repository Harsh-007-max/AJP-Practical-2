/*Develop a program to launch an appplet from a Frame. */
import java.applet.Applet;
import java.awt.*;
class MyApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello, this is a applet...",50,50);
    }
}
public class prog3 extends Frame{
    public static void main(String args[]){
        prog3 f = new prog3();
        f.setSize(300,300);
        f.setVisible(true);
        Applet applet = new MyApplet();
        applet.init();
        f.add(applet);
    }
}
//<appletd code="prog1.class" width=400 height = 400></applet>