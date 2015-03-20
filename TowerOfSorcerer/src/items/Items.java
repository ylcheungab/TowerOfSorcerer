package items;

import java.util.ArrayList;

public class Items {
	private String name;
	private String picName;
	private int iD;
	private boolean pickable;
	private ArrayList<Integer> featureID;
	private String description;
	
	public Items(String name, String picName, boolean pickable, int iD,
			ArrayList<Integer> featureID, String description) {
		super();
		this.name = name;
		this.picName = picName;
		this.iD = iD;
		this.pickable = pickable;
		this.featureID = new ArrayList<Integer>(featureID);
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
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", picName=" + picName + ", ID=" + iD
				+ ", pickable=" + pickable + ", featureID=" + featureID
				+ ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iD;
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
		if (iD != other.iD)
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
