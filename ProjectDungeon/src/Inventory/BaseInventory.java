package Inventory;

import java.lang.reflect.Array;

public abstract class BaseInventory {
	int size;
	int weightAllow;
	BaseItem  weapons[];
	BaseItem armor[];
	BaseItem  professionItems[];
	BaseItem  personalItems[];
	BaseItem  clothes[];
	BaseItem  flair[];
	BaseItem  backpack[];
	BaseItem  equipped[];
	public BaseInventory() {
		armor = new BaseItem[BodyLocationConstants.armorLocations.length];
		clothes = new BaseItem[BodyLocationConstants.clothesLocations.length];
		weapons = new BaseItem[BodyLocationConstants.armorLocations.length];
		professionItems = new BaseItem[BodyLocationConstants.armorLocations.length];
		personalItems = new BaseItem[BodyLocationConstants.clothesLocations.length];
		backpack= new BaseItem[BodyLocationConstants.armorLocations.length];
		equipped = new BaseItem[BodyLocationConstants.armorLocations.length];	
	}
	public BaseItem  getArmor() {
		return armor;
	}
	public BaseItem  getWeapons() {
		return weapons;
	}
	public BaseItem  getProfessionItems() {
		return armor;
	}
	public BaseItem  getFlair() {
		return weapons;
	}
	public BaseItem  getClothes() {
		return weapons;
	}
	public BaseItem  getBackpack(){
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
		for (int i: BodyLocationConstants.armorLocations) {
			if (armor.get(i, i) == null) {
				armor[i] = t;
			}
		}
		return false;
	}
}

