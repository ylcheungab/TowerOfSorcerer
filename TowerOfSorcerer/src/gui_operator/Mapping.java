package gui_operator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import map.*;

public class Mapping extends JPanel implements ActionListener{
	private JButton addButton = new JButton("New Map");
	private JButton delButton = new JButton("Delete Map");;
	private MapGroup mapgroup;
	private JComboBox<String> mapSelection;
	
	public Mapping() {
		mapgroup = new MapGroup();
		mapgroup.addMap("Floor 1");
		
		//north: map level, delete, add new map
		JPanel MapPanel = new JPanel();
		mapSelection = new JComboBox<String>();
		for (Map m:mapgroup.getMapGroup()){
			mapSelection.addItem(m.getName());
		}
		MapPanel.add(mapSelection);
		addButton.addActionListener(this);
		MapPanel.add(addButton);
		delButton.addActionListener(this);
		MapPanel.add(delButton);
		
		//center: map grid
		Map currmap = mapgroup.searchMap ((String) mapSelection.getSelectedItem());
		JPanel mapDetail = new JPanel(new GridLayout(currmap.getWidth(), currmap.getLength()));
		for (int i = 0; i < currmap.getLength() ; i++){
			for (int j = 0; j < currmap.getWidth() ; j++){
				String picname = "";
				picname = picname + currmap.getMapID(i, j) + ".png";
				JLabel mapPiece = new JLabel(new ImageIcon("D:/Entertainment/ToS/" + picname));
				mapDetail.add(mapPiece, j+i*currmap.getWidth());
			}
		}
		
		//packing
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(MapPanel);
		add(mapDetail);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent But) {
		if (But.getSource() == addButton){	// adding new map
			NewMapPage page = new NewMapPage();			
		}else if (But.getSource() == delButton){ //delete current map
			if (mapSelection.getItemCount() == 1){
				JOptionPane.showMessageDialog(this, "You can't have a tower with no map!",
						"Map Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String curr = (String) mapSelection.getSelectedItem();
			mapgroup.deleteMap(curr);
		}
	}
	
}
