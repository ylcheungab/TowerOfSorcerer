package misc;

import java.util.Random;

public class Misc {
	/**
	 * random generator
	 * @return
	 */
	public int randGen(){
		Random rand = new Random();
		return rand.nextInt() * 150;
	}
	
}
