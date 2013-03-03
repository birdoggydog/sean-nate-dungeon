package seanNate.Dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import seanNate.Interactive.Creature;

public abstract class BaseDungeon {
	static Random random = new Random(); // GOD.
	public ArrayList<BaseRoom> rooms;
	public ArrayList<BaseHallways> hallways;
	public ArrayList<Creature> creatures;
	public int height;
	public int width;
	public int numRooms;
	public int numCreatures;
}
