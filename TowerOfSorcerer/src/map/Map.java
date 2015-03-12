package map;

import java.util.Arrays;

public class Map {
	private String name;
	private int floor;
	private int [][] mapping;
	private int width;
	private int length;
	
	public Map(String name, int floor, int width, int length) {
		super();
		this.name = name;
		this.floor = floor;
		this.width = width;
		this.length = length;
		this.mapping = new int [width][length];
		for (int i = 0; i < width; i++){
			for (int j = 0; j < length; j++){
				mapping[i][j] = 0;
			}
		}
	}
	public Map(String name, int floor) {
		super();
		this.name = name;
		this.floor = floor;
		this.width = 20;
		this.length = 20;
		this.mapping = new int [width][length];
		for (int i = 0; i < width; i++){
			for (int j = 0; j < length; j++){
				mapping[i][j] = 0;
			}
		}
	}
	public int[][] getMapping() {
		return mapping;
	}
	public void setMapping(int[][] mapping) {
		this.mapping = mapping;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Map " + name + " floorid = " + floor + " mapping: " + "\n"
				+ Arrays.toString(mapping) + "\n" + ", width=" + width + ", length="
				+ length + "]";
	}


}
