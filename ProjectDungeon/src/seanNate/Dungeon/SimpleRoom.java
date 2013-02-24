package seanNate.Dungeon;

import java.awt.Point;
import java.util.ArrayList;

public class SimpleRoom extends Room{
	public SimpleRoom(int width, int height, Point entrance, ArrayList<Point> layout) {
		super();
		this.width = width;
		this.height = height;
		this.layout = layout;
		this.entrance = entrance;
		this.token = 2;
	}
}
