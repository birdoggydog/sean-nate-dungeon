package seanNate.Interactive;

import java.awt.Point;
import java.util.Random;

import seanNate.Dungeon.DungeonMap;

public class SimpleCreature extends Creature{
	Random random;
	public SimpleCreature(Point location, Random random) {
		this.random = random;
		this.exp = 0;
		this.expVal = 100;
		this.xpToLevel = 200;
		this.Size = 1;
		this.hp=10;
		this.vision =3;
		this.toHit =10;
		this.speed = 2;
		this.token = 99;
		this.location = location;
		this.level = 1;
		this.damage = 10;
		this.armor = 3;
	}
	/**
	 *  basic movement example
	 */
	@Override 
	public void move(DungeonMap map) { 
		int dir = random.nextInt(4);
		int moved =0;
		// you get as many moves qas you are fast
		while (moved<speed){
			int tried = 0;			
			// try all four directions
			while(tried<4) {
				// can YOU move?!
				if(canMove(dir,map)) {	
					tried = 5;
					moved++;
				}
				// nope
				else {
					tried++;
					dir++;
					dir = dir%4;
				}
			}
			moved += 1;
		}
	}
	// checks against map to see if placement is ok, if so assigns and then increments movement counters..
	public boolean canMove(int dir, DungeonMap map) {
		int tx=location.x; 
		int ty=location.y;
		switch(dir){
		case(0):
			tx = this.location.x+1;
			break;
		case(1):
			ty = this.location.y+1;
			break;
		case(2):
			tx = this.location.x-1;
			break;
		case(3):
			ty = this.location.y-1;
			break;
		}
		Point moveTo = new Point(tx,ty);
		
		if(map.canPlaceMob(moveTo)) {
			this.location = moveTo;
			return true;
		}
		return false;
	}
}
