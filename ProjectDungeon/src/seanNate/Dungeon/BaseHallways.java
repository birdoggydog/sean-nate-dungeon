package seanNate.Dungeon;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseHallways {
	Point start;
	Point end;
	ArrayList<Point> path;
	ArrayList<Point> intersections;
	int token;
	public ArrayList<Point> generatePath(Point start, Point end) {
		return path;
	}

}
