import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class prog12 extends Applet implements WindowListener {
    private Frame frame;
    public void init() {
        frame = new Frame("Window Listener Demo");
        frame.addWindowListener(this);
        Label label = new Label("This is a window");
        label.setAlignment(Label.CENTER);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }
  public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        frame.dispose();
    }
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified");
    }
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }
}
//<applet code=prog12.class width = 500 height =500></applet>