/*Create a applet that contains "Generate" button upon clicking that it 
should display number of circles entered in Textfield by user */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class prog6 extends Applet implements ActionListener{
    Label l;
    Button Generate;
    TextField tf;
    Graphics g;
    int val =0;
    int x = 0,y=100;
    public void init(){
        l = new Label("Enter number of circles");
        Generate = new Button("Generate");
        tf = new TextField("Enter number of circles here...");
        Generate.addActionListener(this);
        add(l);
        add(tf);
        add(Generate);
    }
    public void paint(Graphics g){
        x=100;  
        for(int i =0;i<val;i++){
            g.drawOval(x,y,50,50);
            x+=50;
            if(x>500){
                y+=50;
                x=0;
            }
        }
    }
    public void actionPerformed(ActionEvent e){
        //prog6 p = new prog6();
        val = Integer.parseInt(tf.getText());
        repaint();
    }
}
//<applet code=prog6.class width = 500 height =500></applet>