package gui_operator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * this is used for the startup Operator
 * @author YatLaam
 *
 */
public class StartPage extends JDialog implements ActionListener{

	private JButton NewButton;
	private JButton LoadButton;
	private JButton LeaveButton;
	
	public StartPage(){
		setTitle("Start Options");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Action taken after closing the window
		//i.e. exit program
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent But) {
				System.exit(0);
			}
		});
		
		//the panel divided into five parts(east, north, south, west, center)
		//north part
		String startmsg = "This is Tower of Sorcerer ver. 1.0. "
				+ "\n" + "Please choose one of the options:";
		JLabel intromsg = new JLabel(startmsg);
		
		//center part is a panel, panel with buttons
		JPanel ButtonPanel = new JPanel();
		
		NewButton = new JButton("New game");
		NewButton.addActionListener(this);
		ButtonPanel.add(NewButton);
		
		LoadButton = new JButton("Load game");
		LoadButton.addActionListener(this);
		ButtonPanel.add(LoadButton);
		
		LeaveButton = new JButton("Quit game");
		LeaveButton.addActionListener(this);
		ButtonPanel.add(LeaveButton);
		
		//packing
		getContentPane().add(BorderLayout.NORTH, intromsg);
		getContentPane().add(BorderLayout.CENTER, ButtonPanel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * react with the three button pressed
	 * NewButton: A new pack on maps
	 * LoadButton: Loading unfinished maps
	 * Exit: close program (finished)
	 */
	@Override
	public void actionPerformed(ActionEvent But) {
		if (But.getSource() == NewButton){
			ContentPage main = new ContentPage();
			dispose();
		}else if (But.getSource() == LoadButton){
			
		}else if (But.getSource() == LeaveButton){
			int n = JOptionPane.showConfirmDialog(null, "Exit Program ?",
					"Confirm", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION)
				System.exit(0);
		}
	}
}
