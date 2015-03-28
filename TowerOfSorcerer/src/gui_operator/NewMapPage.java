package gui_operator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import map.Map;

public class NewMapPage extends JFrame implements ActionListener{
	
	private JTextField name;
	private JTextField width;
	private JTextField length;
	
	public NewMapPage(){
		JPanel namePanel = new JPanel();
		JTextField name = new JTextField(20);
		JLabel nameL = new JLabel("Name: ");
		namePanel.add(nameL);
		namePanel.add(name);
		
		JPanel widthPanel = new JPanel();
		JTextField width = new JTextField(2);
		JLabel widthL = new JLabel("Width(1~20): ");		
		widthPanel.add(widthL);
		widthPanel.add(width);
		
		JPanel lengthPanel = new JPanel();
		JTextField length = new JTextField(2);
		JLabel lengthL = new JLabel("Length(1~20): ");		
		lengthPanel.add(lengthL);
		lengthPanel.add(length);
		
		JButton confirmBut = new JButton("OK");
		confirmBut.addActionListener(this);
		
		add(namePanel);
		add(widthPanel);
		add(lengthPanel);
		add(confirmBut);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String mapname = name.getText();
		int wid = Integer.parseInt(width.getText());
		int len = Integer.parseInt(length.getText());
		if(wid < 1 || wid > 20 || len < 1 || len > 20){
			String notice = "";
			if(wid < 1 || wid > 20)
				notice = notice + "width";
			else
				notice = notice + "length";
			JOptionPane.showMessageDialog(this, "Improper " + notice + "!",
					"Map Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		return;
		
	}

}
