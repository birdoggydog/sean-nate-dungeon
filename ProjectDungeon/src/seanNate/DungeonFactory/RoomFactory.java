package seanNate.DungeonFactory;

import java.awt.Point;
import java.util.ArrayList;

import seanNate.Dungeon.SimpleRoom;
import java.util.Random;
public class RoomFactory {
	Random random;
	public RoomFactory() {
		random = new Random();
	}
	public SimpleRoom GenSmallRoom(int x, int y, int width, int height) {
		ArrayList<Point> layout = new ArrayList<Point>();
		SimpleRoom rm = new SimpleRoom(height, height, null, null);
		for (int i = x; i < x+width; i++) {
			for (int j = y; j < y+height; j ++){
				Point pt = new Point();
				pt.x = i;
				pt.y = j;
				layout.add(pt);
			}
		}
		rm.layout = layout;
		rm.entrance = genEntrance(layout);
		return rm;
	}

	private Point genEntrance(ArrayList<Point> layout) {
		/*
		 * Put smart entrance generation here...
		 */
		return layout.get(random.nextInt(layout.size()));

	}
}
