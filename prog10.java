import javax.swing.*;
import java.awt.Container;
import java.awt.event.*;
public class prog10 extends JFrame implements MouseListener {
    private JButton clickButton;
    public prog10() {
        clickButton = new JButton("Click");
        clickButton.addMouseListener(this);
        Container contentPane = getContentPane();
        contentPane.add(clickButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }
    public static void main(String[] args) {
        new prog10();
    }
}
