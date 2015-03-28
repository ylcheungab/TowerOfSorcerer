package gui_operator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ContentPage extends JFrame implements ActionListener, MouseListener{
	 
	private Mapping Map = new Mapping();
	private ItemPage Item = new ItemPage();
	private Description Description = new Description();
	private JMenu Content = new JMenu("Content");;
	
	public ContentPage (){
		setTitle("Tower of Sorcerer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent But) {
				ExitListener();
			}
		});
		
		//menu bar
		setJMenuBar(createMenuBar());
		
		//panel
		JPanel ItemDesc = new JPanel();
		ItemDesc.setLayout(new BoxLayout(ItemDesc, BoxLayout.Y_AXIS));
		ItemDesc.add(Item);
		ItemDesc.add(Description);
		
		//packing
		setEnabled(true);
		getContentPane().add(BorderLayout.CENTER, Map);
		getContentPane().add(BorderLayout.EAST, ItemDesc);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/**
	 * MenuBar
	 * @return
	 */
	JMenuBar createMenuBar() {
		//menus in menu bar
		JMenuBar menuBar = new JMenuBar();
		menuBar.getAccessibleContext().setAccessibleName("Operator operations");

		//file menu
		JMenu FileMenu = (JMenu) menuBar.add(new JMenu("File"));
		FileMenu.setMnemonic('F');
		FileMenu.getAccessibleContext().setAccessibleDescription(
				"File Management");
		
		JMenuItem mi;	// the elements in file menu
		
		// item menu item button
		mi = (JMenuItem) FileMenu.add(new JMenuItem("New Item"));
		mi.setMnemonic('I');
		mi.getAccessibleContext().setAccessibleDescription("Item addition");
		//TODO build this!
//		mi.addActionListener(new NewItemPage());	
		
		mi = (JMenuItem) FileMenu.add(new JMenuItem("Map"));
		mi.setMnemonic('M');
		
		mi = (JMenuItem) FileMenu.add(new JMenuItem("Options"));
		
		mi = (JMenuItem) FileMenu.add(new JMenuItem("Save"));
		
		mi = (JMenuItem) FileMenu.add(new JMenuItem("Exit"));
		mi.addActionListener(ExitListener());


		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Save")) {
				}
			}
		};
		
		menuBar.add(Content);
		Content.setEnabled(false);
		Content.setMnemonic('p');
		Content.getAccessibleContext().setAccessibleDescription(
				"Appointment Management");
		mi = new JMenuItem("Manual Scheduling");
		mi.addActionListener(listener);
		Content.add(mi);

		return menuBar;
		
	}
	
	public ActionListener ExitListener(){
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "Exit without saving?",
						"Comfirm", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION){
					dispose();
					return;
				}
			}
		};
	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Description.name.setName(Item.getCurr());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
