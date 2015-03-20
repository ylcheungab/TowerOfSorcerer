package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableModel;

public class ContentPage extends JFrame implements ActionListener{
	
	private JMenu Appmenu = new JMenu("Options");;

	public ContentPage (){
		setTitle("Tower of Sorcerer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent But) {
				int n = JOptionPane.showConfirmDialog(null, "Exit Program without saving?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		
		Container contentPane;
		contentPane = getContentPane();
		
		/**
		 * the menu bar
		 */
		setJMenuBar(createMenuBar());

		JPanel left = new Mapping();
		
		JPanel Item = new ItemPage();
		JPanel Description = new Description();
	
		contentPane.add("West", left);
	
		JPanel Map = new Mapping();
		contentPane.add("East", Map);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	JMenuBar createMenuBar() {

		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Save")) {

				}

			}
		};
		JMenuBar menuBar = new JMenuBar();
		menuBar.getAccessibleContext().setAccessibleName("Calendar Choices");
		JMenuItem mi;

		JMenu Options = (JMenu) menuBar.add(new JMenu("Options"));
		Options.setMnemonic('O');
		Options.getAccessibleContext().setAccessibleDescription(
				"Options");
		
		mi = (JMenuItem) Options.add(new JMenuItem("Exit"));
		mi.setMnemonic('E');
		mi.getAccessibleContext().setAccessibleDescription("Exit Program");
		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "Exit Program ?",
						"Comfirm", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION)
					System.exit(0);

			}
		});

		menuBar.add(Appmenu);
		Appmenu.setEnabled(true);
		Appmenu.setMnemonic('p');
		Appmenu.getAccessibleContext().setAccessibleDescription(
				"Appointment Management");
		mi = new JMenuItem("Manual Scheduling");
		mi.addActionListener(listener);
		Appmenu.add(mi);

		return menuBar;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
