package Inventory;

import java.lang.reflect.Array;
import Inventory.ItemTypeConstants;

public abstract class BaseInventory {
	int size;
	int weightAllow;
	Array weapons;
	Array armor;
	Array professionItems;
	Array personalItems;
	Array clothes;
	Array flair;
	Array backpack;
	public Array getArmor() {
		return armor;
	}
	public Array getWeapons() {
		return weapons;
	}
	public Array getProfessionItems() {
		return armor;
	}
	public Array getFlair() {
		return weapons;
	}

	public Array getClothes() {
		return weapons;
	}
	public Array getBackpack(){
		return backpack;
	}
	public boolean addItem(Item t) {
		switch(t.getType()){
		case
		}
	}
}
