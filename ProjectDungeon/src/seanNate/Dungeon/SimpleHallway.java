package seanNate.Dungeon;

import java.awt.Point;
import java.util.ArrayList;

public class SimpleHallway extends BaseHallways{

	public SimpleHallway(Point start, Point end) {		
		this.start = start;
		this.end = end;
		this.path=generatePath(start, end);
		this.token = 5;
	}
	public int getToken() {
		return this.token;
	}
	@Override 
	public ArrayList<Point> generatePath(Point start, Point end) {
		path = new ArrayList<Point>();
			// x first, moving left
			int dir = genDir(start.x,end.x);
			moveX(dir, path);
			dir = genDir(start.y, end.y);
			moveY(dir,path);		
		return path;
	}
	private int genDir(int x, int x2) {
		if (x>x2) 
			return -1;
		else 
			return 1;
	}
	public void moveX(int dir, ArrayList<Point> path) {
		if(dir == -1) {
			for (int i = start.x; i>=end.x;i+=dir) {
				Point p= new Point();
				p.x = i;
				p.y = start.y;
				path.add(p);
			}
		}
		else if(dir == 1) {
			for (int i = start.x; i<=end.x;i+= dir) {
				Point p= new Point();
				p.x = i;
				p.y = start.y;
				path.add(p);
			}
		}
	}
	public void moveY(int dir, ArrayList<Point> path) {
		if(dir == -1) {
			for (int i = start.y; i>=end.y;i+=dir) {
				Point p= new Point();
				p.y = i;
				p.x = end.x;
				path.add(p);
			}
		}
		else if(dir == 1) {
			for (int i = start.y; i<=end.y;i+=dir) {
				Point p= new Point();
				p.y = i;
				p.x = end.x;
				path.add(p);
			}
		}
	}


}
