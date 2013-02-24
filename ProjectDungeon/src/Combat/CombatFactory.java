package Combat;

import java.util.Random;

import seanNate.Interactive.Creature;

public class CombatFactory {;
	static Random random = new Random();
	public static void resolveCombat(Creature one, Creature two) {
		if(!one.equals(two)) {
			int ones = random.nextInt(one.getToHit());
			int twos = random.nextInt(two.getToHit());
			boolean oneHit = false;
			boolean twoHit = false;
			if(ones>= two.getArmor()) {
				oneHit = true;
			}
			if(twos>= one.getArmor()) {
				twoHit = true;
			}
			if(oneHit) {
				two.takeHit(random.nextInt(one.getDamage()));
			}
			if(twoHit) {
				one.takeHit(random.nextInt(two.getDamage()));
			}
			int xp;
			if(one.getHp() <=0) {
				xp = one.die(); 
				two.receiveExp(xp);
			}
			if(two.getHp()<=0) {
				xp = two.die();
				two.receiveExp(xp);
			}
		}
	}
}
