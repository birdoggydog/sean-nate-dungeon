package seanNate.Interactive;

import java.awt.Point;

import seanNate.Dungeon.DungeonMap;

public abstract class Creature {
	public Point location;
	String name;
	boolean alive=true;
	protected int Size;
	protected int speed;
	protected int vision;
	protected int hp;
	protected int toHit;
	protected int expVal;
	protected int exp;
	protected int token;
	protected int armor;
	protected int level;
	protected int xpToLevel;
	protected int damage;
	public void move(DungeonMap map) {		
	}
	public int getToken() {
		return this.token;
	}
	public boolean canLevel(){
		if (this.exp>= this.xpToLevel) {
			return true;
		}
		return false;
	}
	public void levelUp() {
		this.xpToLevel = xpToLevel*2;
		this.level++;
		this.exp = 100*level;
		this.hp = level*10;
	}
	public void receiveExp(int amt) {
		this.exp+= amt;
		if(canLevel()){
			levelUp();
		}
	}
	public int getToHit() {
		return this.toHit;
	}
	public int getArmor() {
		return this.armor;
	}
	public int takeHit(int damage) {
		this.hp-= damage;
		return hp;
	}
	public int die() {
		this.alive = false;
		return this.expVal;
	}
	public int getDamage() {
		return this.damage;
	}
	public int getHp() {
		return this.hp;
	}
	public boolean getAlive() {
		// TODO Auto-generated method stub
		return this.alive;
	}
	public int getLeve() {
		return this.level;
	}
	public int getValue() {
		return this.expVal;
	}
	public int getXp() {
		return this.exp;
	}
}
