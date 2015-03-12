package items;

import java.util.ArrayList;

public class Hero extends Creatures{
	private int[] holdItems;

	public Hero(String name, String picName, int iD, boolean pickable,
			ArrayList<Integer> featureID, String description, int hp, int atk, int def,
			int[] holdItems) {
		super(name, picName, iD, pickable, featureID, description, hp, atk, def);
		this.holdItems = holdItems;
	}
	
	public Hero(String name, String picName, int iD, 
			ArrayList<Integer> featureID, String description, int hp, int atk, int def,
			int[] holdItems) {
		super(name, picName, iD, false, featureID, description, hp, atk, def);
		this.holdItems = holdItems;
	}

	public int[] getHoldItems() {
		return holdItems;
	}

	public void setHoldItems(int[] holdItems) {
		this.holdItems = holdItems;
	}
	
	public void trigger(Items item){
		
	}
	
}
