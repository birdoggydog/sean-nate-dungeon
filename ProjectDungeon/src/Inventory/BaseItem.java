package Inventory;

import java.awt.Point;

public class BaseItem {
	String description;
	String name;
	int durability;
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
	public int getValue() {
		return this.value;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public String getDesc() {
		return description;
	}
	public void addDur(int amt) {
		this.durability+=amt;
	}
	public void subDur(int amt) {
		this.durability-=amt;
	}
}
