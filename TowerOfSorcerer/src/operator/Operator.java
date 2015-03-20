package operator;

import java.util.ArrayList;

import map.Map;

public class Operator {
	private String User;
	private ArrayList<Integer> itemsid;
	private ArrayList<Map> map;
	


	public Operator(String user, ArrayList<Integer> itemsid, ArrayList<Map> map) {
		super();
		User = user;
		this.itemsid = itemsid;
		this.map = map;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public ArrayList<Integer> getItemsid() {
		return itemsid;
	}

	public void setItemsid(ArrayList<Integer> itemsid) {
		this.itemsid = itemsid;
	}

	public ArrayList<Map> getMap() {
		return map;
	}

	public void setMap(ArrayList<Map> map) {
		this.map = map;
	}



}
