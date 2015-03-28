package items;

import java.util.ArrayList;

/**
 * this class only used for organizing the Items
 * @author YatLaam
 *
 */

public class ItemGroup {
	private ArrayList<Items> itemGroup;
	
	public ItemGroup() {
		super();
		this.itemGroup = new ArrayList<Items>();
	}
	
	public ItemGroup(ArrayList<Items> itemGroup) {
		super();
		this.itemGroup = itemGroup;
	}

	public ArrayList<Items> getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ArrayList<Items> itemGroup) {
		this.itemGroup = itemGroup;
	}
	public Items getItem(int i){
		return itemGroup.get(i);
	}
	public int getItem(Items item){
		for(int i = 0; i < itemGroup.size(); i++){
			if(itemGroup.get(i) == item)
				return i;
		}
		return -1;
	}
	/**
	 * add items into the list
	 * @param e
	 */
	public void addItem (Items e){
		this.itemGroup.add(e);
	}
	
	public void deleteItem (Items e){
		this.itemGroup.remove(e);
		System.out.println("deleted.");
	}
	
	public void listItems (){
		for (Items i:this.getItemGroup()){
			System.out.println(i);
		}
	}
	
	/**
	 * search the item id corresponds
	 * @param itemID
	 * @return
	 */
	public Items searchItem (int itemID){
		for (Items i:this.getItemGroup()){
			if(i.getiD() == itemID)
			return i;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "ItemGroup [ItemGroup=" + itemGroup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((itemGroup == null) ? 0 : itemGroup.hashCode());
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
		ItemGroup other = (ItemGroup) obj;
		if (itemGroup == null) {
			if (other.itemGroup != null)
				return false;
		} else if (!itemGroup.equals(other.itemGroup))
			return false;
		return true;
	}
	
	
}
