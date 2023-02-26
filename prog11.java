import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class prog11 extends Applet implements MouseMotionListener {
    private String coordinates;
    public void init() {
        addMouseMotionListener(this);
    }
    public void paint(Graphics g) {
        g.drawString(coordinates, 10, 50);
    }
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        coordinates = "Cursor coordinates: " + x + ", " + y;
        repaint();
    }
    public void mouseDragged(MouseEvent e) {
        // Do nothing
    }
}
//<applet code=prog11.class width = 500 height =500></applet>