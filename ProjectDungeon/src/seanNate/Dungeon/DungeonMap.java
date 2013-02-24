package seanNate.Dungeon;

import java.awt.Point;

public class DungeonMap {

	int[][] map;
	int width;
	int height;
	public DungeonMap(int width, int height){

		this.width = width;
		this.height= height;
		map = new int[height][width];
		initMap();
	}
	
	public boolean canAdd(Room rm) {
		for (Point p: rm.layout) {
			if(pointInDungeon(p)) {
				if (ptOverlap(p)) {
					return false;
				}
				else if(!wallSep(p)) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	private boolean wallSep(Point p) {
		int x; 
		int y;
		for (int i = -1; i<2; i++) {
			y = p.y+i;
			for (int j = -1; j<2; j++) {
				x = p.x+j;
				if(y<height-1 && y>0 && x<width-1 && x>0) {
					if (map[y][x]!= 0) {
						return false;
					}
				}
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

	private boolean ptOverlap(Point p) {
		if (map[p.y][p.x] != 0) {
			return true;
		}
		return false;
	}
	public void initMap() {
		for (int i = 0; i<height; i++) {
			for (int j = 0; j<width; j++) {
				map[i][j]=0;
			}
		}
	}
	public boolean pointInDungeon(Point p) {

		print("X: "+p.x);
		print("Y: "+p.y);
		print("Wi: "+width+" he:"+height);
		if (p.x < width && p.y < height) {
			print("true");
			return true;
		}
		else {
			print("False");
			return false;
		}
	}
	public void add(Room rm) {
		// TODO Auto-generated method stub
		for (Point p : rm.layout) {
			if (rm.isEntrance(p.x, p.y))
				map[p.y][p.x] = 9;
			else 
				map[p.y][p.x] = rm.getToken();

		}
	}
	public int[][] getMap() {
		return this.map;
	}

	public int get(int i, int j) {
		// TODO 
		return this.map[i][j];
	}
	public void print(String s){
	//	System.out.println(s);
	}

	public void add(SimpleHallway hall) {
		// TODO Auto-generated method stub
		for (Point p: hall.path) {
			if(map[p.y][p.x]==0) {
				map[p.y][p.x]=hall.getToken();
			}
		}
		
	}

	public boolean canPlaceMob(Point location) {
		// TODO Auto-generated method stub
		
		if(location.y>=0 && location.y < map.length) {
			if(location.x>=0 && location.x < map[0].length) {
					
				if (map[location.y][location.x]!=0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
}
