package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class HeroStat extends JPanel{
	private int AtkValue;
	private int DefValue;
	private int VitValue;
	private JTable tableView;
	private final String[] names = { "Types", "Value" };
	private final String[] states = { "HP", "Attack", "Defence" };
	private final int[] statdata = { 1000, 10, 10 };
	private final Object[][] data = new Object[3][2];
	
	public HeroStat(){

		TitledBorder b = BorderFactory
				.createTitledBorder("Hero Stats");
		setBorder(b);

		AtkValue = 10;
		DefValue = 10;
		VitValue = 1000;
		
		TableModel dataModel = prepareTableModel();
		tableView = new JTable(dataModel);
		tableView.setAutoResizeMode(tableView.AUTO_RESIZE_ALL_COLUMNS);
		tableView.setRowHeight(20);
		tableView.setRowSelectionAllowed(false);
		
		setSize(600, 300);
	}

	public TableModel prepareTableModel() {

		TableModel dataModel = new AbstractTableModel() {

			public int getColumnCount() {
				return names.length;
			}

			public int getRowCount() {
				return states.length;
			}

			public Object getValueAt(int row, int col) {
				return data[row][col];
			}

			public String getRowName(int row) {
				return states[row];
			}

			public Class getColumnClass(int c) {
				return getValueAt(0, c).getClass();
			}

			public boolean isCellEditable(int row, int col) {
				return false;
			}

			public void setValueAt(int row, int column) {
				data[row][0] = states[row];
				data[row][1] = statdata[row];
			}
		};
		return dataModel;
	}
	
}
