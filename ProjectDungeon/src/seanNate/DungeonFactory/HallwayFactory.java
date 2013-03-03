package seanNate.DungeonFactory;

import seanNate.Dungeon.DungeonMap;
import seanNate.Dungeon.BaseHallways;
import seanNate.Dungeon.BaseRoom;
import seanNate.Dungeon.SimpleHallway;

public class HallwayFactory {
	DungeonMap map;
	public HallwayFactory(DungeonMap map) {
		this.map=map;
	}
	public BaseHallways genHallway(BaseRoom one, BaseRoom two) {
		BaseHallways newHall = new SimpleHallway(one.entrance, two.entrance);
		return newHall;
	}
}
