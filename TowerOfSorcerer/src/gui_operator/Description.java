package gui_operator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Description extends JPanel implements ActionListener{

	public JTextField name;
	public JTextField pickable;
	public JTextField featureID;
	public JTextArea description;
	private JButton EditButton;
	private JButton DeleteButton;
	
	public Description() {
		
		JPanel namePanel = new JPanel();
		name = new JTextField("AAA");
		JLabel nameL = new JLabel("Name: ");
		namePanel.add(nameL);
		namePanel.add(name);
		name.setEditable(false);
		
		JPanel pickablePanel = new JPanel();
		pickable = new JTextField("SS");
		JLabel pickableL = new JLabel("Pickable: ");
		pickablePanel.add(pickableL);
		pickablePanel.add(pickable);
		pickable.setEditable(false);
		
		JPanel featureIDPanel = new JPanel();
		featureID = new JTextField("X");
		JLabel featureIDL = new JLabel("Features: ");
		featureIDPanel.add(featureIDL);
		featureIDPanel.add(featureID);
		featureID.setEditable(false);
		
		JPanel descriptionPanel = new JPanel();
		description = new JTextArea();
		JLabel descriptionL = new JLabel("Description: ");
		descriptionPanel.add(descriptionL);
		descriptionPanel.add(description);
		description.setEditable(false);
		
		EditButton = new JButton("Edit");
		EditButton.addActionListener(this);
		
		DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(this);
				
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(namePanel);
		add(pickablePanel);
		add(featureIDPanel);
		add(descriptionPanel);
		add(EditButton);
		add(DeleteButton);
		setVisible(true);
	}
	
	
	public String getName() {
		return name.getText();
	}


	public void setName(String name) {
		this.name.setText(name);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == EditButton){
			
		}
	}

}
