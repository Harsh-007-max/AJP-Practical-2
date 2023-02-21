/*Create a frame and demonstrate CardLayout that displays list of 
subjects in semesterwise Cards . ( Semester 1 - Computer 
Programming,Fundamental of digital electronics) place a home 
button to return to the main card. */
import java.awt.*;
import javax.swing.*;
public class prog9 extends Frame{
    JButton b;
    prog9(){
        setLayout(new CardLayout());
        setVisible(true);
        setSize(500,500);
        // setDefaultCloseOperation(   .EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel(new CardLayout());

        b = new JButton("Home");
        
        p1.add(b,"card1");
        
        //Show the initial card
        CardLayout cl = (CardLayout) p1.getLayout();
        cl.show(p1, "card1");
        add(p1);


        JPanel sem1 = new JPanel(new CardLayout());

        
        JPanel sem2 = new JPanel(new CardLayout());

        
    }
    public static void main(String[] args){
        new prog9();
    }
}