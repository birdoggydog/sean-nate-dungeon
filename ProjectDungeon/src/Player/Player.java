package Player;

import java.awt.Point;
import java.util.Random;

import seanNate.Interactive.Creature;

public class Player extends Creature{
	
	public Player(Point location, Random random) {
		this.Size = 0;
		this.speed = 0;
		this.vision = 0;
		this.hp = 0;
		this.toHit = 0;
		this.expVal = 0;
		this.exp = 0;
		this.token = 1;
		this.armor =0;
		this.level = 0;
		this.xpToLevel = 0;
	}
}

