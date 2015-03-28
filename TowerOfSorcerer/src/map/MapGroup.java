package map;

import items.Items;

import java.util.ArrayList;

/**
 * Organize map
 * @author YatLaam
 *
 */
public class MapGroup {
	private ArrayList<Map> mapGroup;

	public Map searchMap(String m) {
		for (Map i:this.getMapGroup()){
			if(i.getName() == m)
			return i;
		}
		return null;
	}
	
	public void addMap (String name, int width, int length){
		this.mapGroup.add(new Map(name, width, length));
	}
	public void addMap (String name){
		this.mapGroup.add(new Map(name));
	}
	
	public void deleteMap (String m){
		this.mapGroup.remove(searchMap(m));
		System.out.println("deleted.");
	}
	
	public void listMap (){
		for (Map i:this.getMapGroup()){
			System.out.println(i);
		}
	}
	
	public ArrayList<Map> getMapGroup() {
		return mapGroup;
	}

	public void setMapGroup(ArrayList<Map> mapGroup) {
		this.mapGroup = mapGroup;
	}

	public MapGroup(ArrayList<Map> mapGroup) {
		super();
		this.mapGroup = mapGroup;
	}
	
	public MapGroup() {
		super();
		this.mapGroup = new ArrayList<Map>();
	}
	
	
}
