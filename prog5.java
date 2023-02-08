/*Create a frame window of 300x200 with a label of Hello Java 
from Frame Window and the frame window should close when the 
Close button of the window is clicked. */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class prog5 extends Applet implements ActionListener {
    Frame f = new Frame();
    Label l;
    Button Close;
    public void init(){
        l = new Label("Hello Java from Frame Window");
        Close = new Button("Close");
        Close.addActionListener(this);
        f.setSize(300,200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.add(l);
        f.add(Close);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Close){
            f.setVisible(false);
        }
    }
}
//<applet code = prog5.class width = 300 height = 200></applet>