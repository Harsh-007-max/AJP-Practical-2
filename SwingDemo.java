import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingDemo extends JFrame implements ActionListener {

	CardLayout c;
	Container pane;

	SwingDemo(String title) {
		setSize(1000, 800);
		setTitle(title);

		JLabel header = new JLabel("Card Layout Demo Frame using Swing Components...");
		header.setHorizontalAlignment(JLabel.CENTER);
		header.setOpaque(true);
		header.setBackground(Color.GRAY);
		header.setFont(new Font("Cambria", Font.BOLD, 35));
		add(header, BorderLayout.NORTH);
		
		c = new CardLayout();
		
		JPanel container = new JPanel();
		container.setLayout(c);
		pane = container;
		add(container, BorderLayout.CENTER);

		JPanel footer = new JPanel();
		footer.setOpaque(true);
		footer.setBackground(new Color(70, 120, 230));
		JButton first = new JButton("Go to First Page");
		JButton previous = new JButton("<< Previous");
		JButton next = new JButton("Next >>");
		JButton last = new JButton("Go to Last Page");
		footer.add(first);
		footer.add(previous);
		footer.add(next);
		footer.add(last);
		add(footer, BorderLayout.SOUTH);
		
		JPanel home = new JPanel();
		home.setOpaque(true);
		home.setBackground(Color.GRAY);
		JButton os = new JButton("Operating Systems");
		Button hobbies = new Button("Hobbies");
		home.add(os);
		home.add(hobbies);
		container.add("home", home);
		
		JPanel osList = new JPanel();
		osList.setOpaque(true);
		osList.setBackground(Color.YELLOW);
		JRadioButton win = new JRadioButton("Windows");
		JRadioButton linux = new JRadioButton("Linux");
		ButtonGroup group = new ButtonGroup();
		group.add(win);
		group.add(linux);
		osList.add(win);
		osList.add(linux);
		JList list = new JList();
		String[] winos = {"Windows 98", "Windows 2000", "Windows XP", "Windows 7", "Windows 8", "Windows 10"};
		list.setListData(winos);
		osList.add(list);
		JComboBox dropdown = new JComboBox();
		dropdown.addItem("Debian");
		dropdown.addItem("Red Hat");
		dropdown.addItem("Fedora");
		dropdown.addItem("Ubuntu");
		osList.add(dropdown);
		container.add("os", osList);

		JPanel hobbiesList = new JPanel();
		hobbiesList.setOpaque(true);
		hobbiesList.setBackground(new Color(120, 60, 180));
		JCheckBox cricket = new JCheckBox("Cricket");
		JCheckBox reading = new JCheckBox("Reading");
		JCheckBox swimming = new JCheckBox("Swimming");
		hobbiesList.add(cricket);
		hobbiesList.add(reading);
		hobbiesList.add(swimming);
		container.add("hobbies", hobbiesList);

		JButton exit = new JButton("Close the Program");
		container.add("exit", exit);

		first.addActionListener(this);
		previous.addActionListener(this);
		next.addActionListener(this);
		last.addActionListener(this);
		os.addActionListener(this);
		hobbies.addActionListener(this);
		win.addActionListener(this);
		linux.addActionListener(this);
		exit.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Operating Systems"))
			c.show(pane, "os");
		if(ae.getActionCommand().equals("Hobbies"))
			c.show(pane, "hobbies");
		if(ae.getActionCommand().equals("Go to First Page"))
			c.first(pane);
		if(ae.getActionCommand().equals("Next >>"))
			c.next(pane);
		if(ae.getActionCommand().equals("<< Previous"))
			c.previous(pane);
		if(ae.getActionCommand().equals("Go to Last Page"))
			c.last(pane);
		if(ae.getActionCommand().equals("Windows"))
			JOptionPane.showMessageDialog(this, "You Selected Window OS");
		if(ae.getActionCommand().equals("Linux"))
			JOptionPane.showMessageDialog(this, "You Selected Linux OS", "Alert", JOptionPane.WARNING_MESSAGE);
		if(ae.getActionCommand().equals("Close the Program")) {
			int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit!!!", "Exit???", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(result == JOptionPane.YES_OPTION)
				dispose();
			else
				c.show(pane, "home");
		}
	}

	public static void main(String[] args) {
		new SwingDemo("JFrame with Swing Components");
	}
}