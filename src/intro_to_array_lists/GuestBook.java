package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JButton button1;
	JPanel panel;
	JButton button2;
	ArrayList<String> names= new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		new GuestBook().createUI();
	}
	void createUI() {
		frame=new JFrame();
		panel=new JPanel();
		button1=new JButton();
		button2=new JButton();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button1.setText("Add Name");
		button2.setText("View Name");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String newName=JOptionPane.showInputDialog("Enter a name");
			names.add(newName);
		}
		if(e.getSource()==button2) {
			for (int i = 0; i < names.size(); i++) {
				JOptionPane.showMessageDialog(null,names.get(i));
			}
		}
	}
}
