package Inventory;

import java.awt.Point;

public class BaseItem {
	String description;
	String name;
	int weight;
	int value;
	int[] allowedLocations;
	int type;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
