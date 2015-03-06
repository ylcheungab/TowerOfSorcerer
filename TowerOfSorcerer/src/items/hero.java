package items;

public class hero extends creatures{
	private int[] holdItems;

	public hero(String name, String picName, int iD, boolean pickable,
			int featureID, String description, int hp, int atk, int def,
			int[] holdItems) {
		super(name, picName, iD, pickable, featureID, description, hp, atk, def);
		this.holdItems = holdItems;
	}
	
	public hero(String name, String picName, int iD, 
			int featureID, String description, int hp, int atk, int def,
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
	
	
	
}
