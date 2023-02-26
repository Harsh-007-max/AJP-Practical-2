/*Create a Java applet to Enter product name in one TextField, Base 
Price in another TextField and third TextField having rate of GST. 
Place a button Calculate. Upon Clicking that the final price of the 
product should be dispplayed along with the product name. */

import java.applet.Applet;
import java.awt.*;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class prog2 extends Applet implements ActionListener{
    TextField tfname,GSTv,totpritf,bpt;
    Label name,GSTl,totprice,bpl;
    Button calculate,Clear;
    public void init(){
        setLayout(new FlowLayout());
        name = new Label("Enter Name:");
        tfname = new TextField("Enter Name Here...");
        GSTl = new Label("Enter GST: ");
        GSTv = new TextField("Enter GST Here...");
        bpl = new Label("Enter Base Price: ");
        bpt = new TextField("Enter Base Price Here...");
        totprice = new Label("Total Price: ");
        totpritf = new TextField("Total Price is given here...");
        calculate = new Button("Calculate");
        Clear = new Button("Clear");
        calculate.addActionListener(this);
        Clear.addActionListener(this);
        add(name);
        add(tfname);
        add(GSTl);
        add(GSTv);
        add(bpl);
        add(bpt);
        add(calculate);
        add(Clear);
        add(totprice);
        add(totpritf);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == calculate){
            float gst = (Float.parseFloat(bpt.getText())*Float.parseFloat(GSTv.getText()))/100,totalcost = Float.parseFloat(bpt.getText())+gst;
            totpritf.setText(" "+totalcost);
        }
        if(e.getSource() == Clear){
            totpritf.setText("Total Price is given here...");
            tfname.setText("Enter Name Here...");
            GSTv.setText("Enter GST Here...");
            bpt.setText("Enter Base Price Here...");
        }
    }
}
//<applet code="prog2.java" width=500 height=500></applet>