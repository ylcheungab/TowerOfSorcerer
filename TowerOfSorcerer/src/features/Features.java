package features;

public class Features {
	private int featureID;

	public int getFeatureID() {
		return featureID;
	}

	public void setFeatureID(int featureID) {
		this.featureID = featureID;
	}

	public Features(int featureID) {
		super();
		this.featureID = featureID;
	}
	
	public Features() {
		super();
		this.featureID = 0;
	}
	
	public void triggerFeature(int ID){
		switch(ID){
		case 0:
		case 1:
			;
		}
	}
}
