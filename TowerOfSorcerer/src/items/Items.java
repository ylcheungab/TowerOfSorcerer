package items;

import java.util.ArrayList;

public class Items {
	private String name;
	private String picName;
	private int ID;
	private boolean pickable;
	private ArrayList<Integer> featureID;
	private String description;
	
	public Items(String name, String picName, int iD, boolean pickable,
			ArrayList<Integer> featureID, String description) {
		super();
		this.name = name;
		this.picName = picName;
		ID = iD;
		this.pickable = pickable;
		this.featureID = new ArrayList<Integer>(featureID);
		this.description = description;
	}
	public Items(String name, String picName, int iD, boolean pickable,
			 String description) {
		super();
		this.name = name;
		this.picName = picName;
		ID = iD;
		this.pickable = pickable;
		this.featureID = new ArrayList<Integer>(0);
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

	@Override
	public String toString() {
		return "Items [name=" + name + ", picName=" + picName + ", ID=" + ID
				+ ", pickable=" + pickable + ", featureID=" + featureID
				+ ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((featureID == null) ? 0 : featureID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picName == null) ? 0 : picName.hashCode());
		result = prime * result + (pickable ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (ID != other.ID)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (featureID == null) {
			if (other.featureID != null)
				return false;
		} else if (!featureID.equals(other.featureID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picName == null) {
			if (other.picName != null)
				return false;
		} else if (!picName.equals(other.picName))
			return false;
		if (pickable != other.pickable)
			return false;
		return true;
	}
	
	
}
