package Inventory;

import java.lang.reflect.Array;

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
	public boolean addItemTo(BaseItem t) {
		switch(t.getType()){
		case(ItemTypeConstants.ARMOR_CONST):
			return addArmor(t);
		case(ItemTypeConstants.CLOTHES_CONST):
			return addClothes(t);
		case(ItemTypeConstants.GEM_CONST):
			return addGem(t);
		case(ItemTypeConstants.FLAIR_CONST):
			return addFlair(t);	
		case(ItemTypeConstants.PERSONAL_ITEM_CONST):
			return addPersonal(t);
		case(ItemTypeConstants.PROFESSION_ITEM_CONST):
			return addProf(t);
		}
		return false;
	}
	private boolean addProf(BaseItem t) {
		return false;
	}
	private boolean addPersonal(BaseItem t) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean addFlair(BaseItem t) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean addGem(BaseItem t) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean addClothes(BaseItem t) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean addArmor(BaseItem t) {
		// TODO Auto-generated method stub
		
		return false;
	}
}

