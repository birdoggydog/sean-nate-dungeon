package seanNate.Dungeon;

import java.awt.Point;
import java.util.List;

import seanNate.Interactive.Creature;
import seanNate.Interactive.Item;

public abstract class Room {
	
	public int height;
	public int width;
	public List<Item> items;
	public List<Creature> creatures;
	public List<Point> layout;
	public Point entrance;
	public List<Room> neighbors;
	int token;
	public int getToken() {
		return this.token;
	}
	public boolean isEntrance(int x, int y) {
		if(x == entrance.x  && y == entrance.y) {
			return true;
		}
		return false;
	}
}
