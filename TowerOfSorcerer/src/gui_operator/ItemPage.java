package gui_operator;

import items.*;
import misc.Misc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel for the item list
 * @author YatLaam
 *
 */
public class ItemPage extends JPanel implements ActionListener, MouseListener{

	//saves items currently chosen.
	private int currID;
	private String curr;
	
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public int getCurrID() {
		return currID;
	}
	public void setCurrID(int currID) {
		this.currID = currID;
	}


	public ItemPage() {
		ItemGroup group = new ItemGroup();
		Misc misc = new Misc();
		group.addItem(new Items("ground", "0.png", false, misc.randGen(),
				new ArrayList<Integer>(0), "ground"));
		group.addItem(new Items("Wall", "1.png", false, misc.randGen(),
				new ArrayList<Integer>(0), "wall"));
		group.addItem(new Items("Wall", "0.png", false, misc.randGen(),
				new ArrayList<Integer>(0), "wall"));
		group.addItem(new Items("Wall", "1.png", false, misc.randGen(),
				new ArrayList<Integer>(0), "wall"));
	    
		// Label: "Items: "
		JLabel itemL = new JLabel("Items: ");
		
		// Item grid
		JPanel itemList = new JPanel(new GridLayout(2, 8));
		for (Items i:group.getItemGroup()){
			String picname = "";
			picname = picname + i.getPicName();
			JLabel piclabel = new JLabel(new ImageIcon("D:/Entertainment/ToS/" + picname));
	        itemList.add(piclabel);
	        itemList.add(piclabel, group.getItem(i));
	        
			piclabel.addMouseListener(this);
		}
		
		//packing
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(itemL);
		add(itemList);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		curr = e.getSource().toString();
		System.out.println(curr);
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
	

}

