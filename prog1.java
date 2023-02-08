/*Develop a java applet to design a log in form having Fields 
Username and Password and buttons for Log-in and Cancel */
import java.applet.Applet;
import java.awt.*;
import java.awt.Label;
public class prog1 extends Applet{
    public void init(){
        Label lname = new Label("Username");
        add(lname);
        TextField tname= new TextField(10);
        add(tname);
        Label lpass = new Label("Password");
        add(lpass);
        TextField tpass = new TextField(10);
        add(tpass);
        Button Login = new Button("Login");
        add(Login);
        Button Cancel = new Button("Cancel");
        add(Cancel);
    }
}

//<applet code="prog1.class" width = 200 height = 200 ></applet>