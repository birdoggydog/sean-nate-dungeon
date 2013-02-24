package seanNate.TestDungeon;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Combat.CombatFactory;

import seanNate.Dungeon.Dungeon;
import seanNate.Dungeon.DungeonMap;
import seanNate.Dungeon.Hallway;
import seanNate.Dungeon.Room;
import seanNate.Dungeon.SimpleHallway;
import seanNate.DungeonFactory.CreatureFactory;
import seanNate.DungeonFactory.RoomFactory;
import seanNate.Interactive.Creature;
import seanNate.Interactive.SimpleCreature;

public class testDungeonGen extends Dungeon {
	
	RoomFactory rf;
	DungeonMap map;
	CreatureFactory cf;
	ArrayList<Creature> dead = new ArrayList<Creature>();
	public static void main(String[] args) { 
		new testDungeonGen();
	}
	public testDungeonGen() {
		super();
		height = 40;
		Random random = new Random();
		width = 80;
		map = new DungeonMap(width,height);
		numRooms = 40;
		numCreatures = 9000;
		int creaturesFound = 0;
		rooms = new ArrayList<Room>();
		hallways = new ArrayList<Hallway>();
		creatures = new ArrayList<Creature>();
		
		rf = new RoomFactory();
		int numFound= 0;
		while (numFound< numRooms) {
			Room rm = rf.GenSmallRoom(random.nextInt(width),random.nextInt(height) , 4, 4);
			if(map.canAdd(rm)) {
				map.add(rm);
				rooms.add(rm);
				numFound++;
			}
		}
		int numHalls = 0;
		while(numHalls<numRooms) {
			SimpleHallway hall = new SimpleHallway(rooms.get(random.nextInt(rooms.size())).entrance,rooms.get(random.nextInt(rooms.size())).entrance);
			numHalls ++;
			hallways.add(hall);
			map.add(hall);
		}
		int x; int y;
		while(creaturesFound < numCreatures) {
			x  = random.nextInt(width);
			y = random.nextInt(height);
			Point location = new Point (x,y);
			if (map.canPlaceMob(location)) {
				creatures.add(new SimpleCreature(location));
				creaturesFound++;
			}
		}	
		int iter = 0;
		while(true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ArrayList<Creature> neighbors;
		
			

			print(""+iter);
			printMap();
//			print("");
			iter++;
			for (int i = 0; i<creatures.size();i++) {
				Creature C = creatures.get(i);
				C.move(map);
				if(C.getAlive() == true) {
					neighbors = getNeighbors(C);
					
						for(Creature enemy: neighbors) {
							CombatFactory.resolveCombat(C, enemy);
						
					}
				}
				else  {
					dead.add(C);
				}
			}
			creatures.removeAll(dead);
		}
	}
	private ArrayList<Creature> getNeighbors(Creature first) {
		ArrayList<Creature> c = new ArrayList<Creature>();
		for (Creature second: creatures) {
			if (Math.abs(first.location.x-second.location.x)<=1 && Math.abs(first.location.y -second.location.y) <= 1 && second.getAlive()==true) {
				c.add(second);
			}
		}
		return c;
	}
	public void print(String s){
		System.out.println(s);
	}
	public void printMap() {
		int[][] copyArray = copyMap(map.getMap());
		for (Creature c: creatures) {
			if(c.getAlive()) {
//				print("Value: "+c.getValue());
//				print("Xp: "+c.getXp());
//				print("Level: "+c.getLeve());
				copyArray[c.location.y][c.location.x]= c.getToken();
			}
		}
		for (int i = 0; i< height; i ++) {
			String line = "";
			for (int j = 0; j<width; j++) {
				line = line + genSybol(copyArray[i][j]);
				
			}
			print(line);
		}
		print(""+creatures.size());
		
	}
	public int[][] copyMap(int[][] map1) {
		int h = map1.length;
		int w = map1[0].length;
		int[][] copy = new int[h][w];
		for (int i = 0; i<h; i++) {
			for (int j = 0;j<w;j++) {
				copy[i][j] = map1[i][j];
			}
		}
		return copy;
	}
	public String genSybol(int sym) {
		String mx="*";
		switch(sym) {
		case(2):
			mx = ".";
			break;
		case(9):
			mx="E";
			break;
		case(5):
			mx = "%";
			break;
		case(99):
			mx="M";
			break;
		}
	
		return mx;
	}
}
