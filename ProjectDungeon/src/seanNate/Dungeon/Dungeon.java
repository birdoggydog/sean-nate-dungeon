package seanNate.Dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import seanNate.Interactive.Creature;

public abstract class Dungeon {
	static Random random = new Random(); // GOD.
	public ArrayList<Room> rooms;
	public ArrayList<Hallway> hallways;
	public ArrayList<Creature> creatures;
	public int height;
	public int width;
	public int numRooms;
	public int numCreatures;
}
