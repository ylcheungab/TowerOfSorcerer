package items;

import java.util.ArrayList;

public class Creatures extends Items{
	private int hp;
	private int atk;
	private int def;
	
	
	public Creatures(String name, String picName, int iD, boolean pickable,
			ArrayList<Integer> featureID, String description, int hp, int atk,
			int def) {
		super(name, picName, pickable, iD, featureID, description);
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
}
