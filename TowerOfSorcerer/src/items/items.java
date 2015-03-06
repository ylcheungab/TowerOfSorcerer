package items;

public class items {
	private String name;
	private String picName;
	private int ID;
	private boolean pickable;
	private int featureID;
	private String description;
	
	public items(String name, String picName, int iD, boolean pickable,
			int featureID, String description) {
		super();
		this.name = name;
		this.picName = picName;
		ID = iD;
		this.pickable = pickable;
		this.featureID = featureID;
		this.description = description;
	}
	
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public boolean isPickable() {
		return pickable;
	}
	public void setPickable(boolean pickable) {
		this.pickable = pickable;
	}
	public int getFeatureID() {
		return featureID;
	}
	public void setFeatureID(int featureID) {
		this.featureID = featureID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
