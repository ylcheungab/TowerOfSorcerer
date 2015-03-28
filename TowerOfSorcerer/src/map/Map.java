package map;

import items.*;

public class Map{
	private String name;
	private int [][] mapping;
	private int width;
	private int length;
	
	public Map(String name, int width, int length) {
		super();
		this.name = name;
		this.width = width;
		this.length = length;
		this.mapping = new int [length][width];
		for (int i = 0; i < length; i++){
			for (int j = 0; j < width; j++){
				this.mapping[i][j] = 0;
			}
		}
	}
	public Map(String name) {
		super();
		this.name = name;
		this.width = 20;
		this.length = 20;
		this.mapping = new int [this.length][this.width];
		for (int i = 0; i < this.length; i++){
			for (int j = 0; j < this.width; j++){
				this.mapping[i][j] = 0;
			}
		}
	}
	public int getMapID(int x, int y) {
		return this.mapping[x][y];
	}

	/**
	 * set the item id be the new id in map according to the xy-coor
	 * @param itemID
	 * @param xpos starting from 0
	 * @param ypos starting from 0
	 */
	public void setMapping(ItemGroup group, Items item, int xpos, int ypos) {
		if (group.searchItem(item.getiD()) != null)
			this.mapping[xpos][ypos] = item.getiD();
		else
			System.out.println("failed.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Map " + name + " mapping: " + "\n"
				+ mapToString(mapping) + "\n" + ", width=" + width + ", length="
				+ length + "]";
	}

	public String mapToString(int[][] mapping) {
		String map = "";
		for (int i = 0; i < length; i++){
			for (int j = 0; j < width; j++){
				map = map + getMapID(i, j);
				map = map + " ";
			}
			map = map + "\n";
		}
		return map;
	}
	public int[][] getMapping() {
		return mapping;
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}

}
