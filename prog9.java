/*Create a frame and demonstrate CardLayout that displays list of 
subjects in semesterwise Cards . ( Semester 1 - Computer 
Programming,Fundamental of digital electronics) place a home 
button to return to the main card. */
// Create the card panel and add the cards
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog9 extends JFrame implements ActionListener {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton homeButton;

    public prog9() {
        super("Semester CardLayout Demo");

        // Create the cards
        JPanel mainCard = new JPanel();
        mainCard.add(new JLabel("Click on a semester to view the subjects."));

        JPanel semester1Card = new JPanel();
        semester1Card.add(new JLabel("Semester 1"));
        semester1Card.add(new JLabel("Computer Programming"));
        semester1Card.add(new JLabel("Fundamentals of Digital Electronics"));

        JPanel semester2Card = new JPanel();
        semester2Card.add(new JLabel("Semester 2"));
        semester2Card.add(new JLabel("Data Structures and Algorithms"));
        semester2Card.add(new JLabel("Computer Networks"));

        JPanel semester3Card = new JPanel();
        semester3Card.add(new JLabel("Semester 3"));
        semester3Card.add(new JLabel("Operating Systems"));
        semester3Card.add(new JLabel("Database Management Systems"));

cardLayout = new CardLayout();
cardPanel = new JPanel(cardLayout);
cardPanel.add(mainCard, "Main");
cardPanel.add(semester1Card, "Semester 1");
cardPanel.add(semester2Card, "Semester 2");
cardPanel.add(semester3Card, "Semester 3");

// Create the home button
homeButton = new JButton("Home");
homeButton.addActionListener(this);

// Add the card panel and home button to the content pane
Container contentPane = getContentPane();
contentPane.setLayout(new BorderLayout());
contentPane.add(cardPanel, BorderLayout.CENTER);
contentPane.add(homeButton, BorderLayout.SOUTH);

// Display the window
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 300);
setLocationRelativeTo(null);
setVisible(true);
}

// Handles events for the home button
public void actionPerformed(ActionEvent e) {
cardLayout.show(cardPanel, "Main");
}

// Displays the card for the given semester
private void showSemesterCard(String semester) {
cardLayout.show(cardPanel, semester);
}

public static void main(String[] args) {
new prog9();
}
}
