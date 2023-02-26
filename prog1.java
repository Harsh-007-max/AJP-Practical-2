import java.applet.Applet;
import java.awt.*;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class prog1 extends Applet implements ActionListener{
    Label lname, l,lpass;
    TextField tname,tpass;
    Button Login,Cancel;
    public void init(){
        lname = new Label("Username");
        tname= new TextField(10);
        lpass = new Label("Password");
        tpass = new TextField(10);
        Login = new Button("Login");
        Cancel = new Button("Cancel");
        l = new Label("");
        Login.addActionListener(this);
        Cancel.addActionListener(this);
        add(lname);
        add(tname);
        add(lpass);
        add(tpass);
        add(Login);
        add(Cancel);
        add(l);
    }
    public void actionPerformed(ActionEvent e){
        l.setText(e.getSource() == Login ? tname.getText().toString().equals("admin")? tpass.getText().toString().equals("admin")? "Login successful": "Login unsuccessful": "Login unsuccessful": e.getSource() == Cancel? "Login Canceled": "error");
    }
}
//<applet code="prog1.class" width = 200 height = 200 ></applet>