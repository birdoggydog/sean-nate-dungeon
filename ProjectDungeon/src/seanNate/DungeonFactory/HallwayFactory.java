package seanNate.DungeonFactory;

import seanNate.Dungeon.DungeonMap;
import seanNate.Dungeon.Hallway;
import seanNate.Dungeon.Room;
import seanNate.Dungeon.SimpleHallway;

public class HallwayFactory {
	DungeonMap map;
	public HallwayFactory(DungeonMap map) {
		this.map=map;
	}
	public Hallway genHallway(Room one, Room two) {
		Hallway newHall = new SimpleHallway(one.entrance, two.entrance);
		return newHall;
	}
}
