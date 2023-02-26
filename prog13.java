import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prog13 extends JFrame implements ActionListener {

    private JLabel nameLabel, phoneLabel, genderLabel, birthYearLabel;
    private JTextField nameField, phoneField;
    private JComboBox<String> genderBox, birthYearBox;
    private JButton displayButton;

    public prog13() {
        super("User Registration");

        // Create the labels and fields
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        phoneLabel = new JLabel("Phone No:");
        phoneField = new JTextField(20);
        genderLabel = new JLabel("Gender:");
        genderBox = new JComboBox<String>(new String[] {"Male", "Female", "Other"});
        birthYearLabel = new JLabel("Birth Year:");
        birthYearBox = new JComboBox<String>(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999"});
        displayButton = new JButton("Display");
        displayButton.addActionListener(this);

        // Create a panel for the labels and fields
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(phoneLabel);
        inputPanel.add(phoneField);
        inputPanel.add(genderLabel);
        inputPanel.add(genderBox);
        inputPanel.add(birthYearLabel);
        inputPanel.add(birthYearBox);

        // Create a panel for the button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(displayButton);

        // Add the panels to the frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set up the frame
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displayButton) {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String gender = (String) genderBox.getSelectedItem();
            String birthYear = (String) birthYearBox.getSelectedItem();

            String message = "Name: " + name + "\n"
                    + "Phone No: " + phone + "\n"
                    + "Gender: " + gender + "\n"
                    + "Birth Year: " + birthYear + "\n";

            JOptionPane.showMessageDialog(this, message, "User Registration Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new prog13();
    }
}
