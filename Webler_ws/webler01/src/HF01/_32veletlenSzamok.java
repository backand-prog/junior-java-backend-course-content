package HF01;

import java.util.Random;

/*
 * Hozz létre 12 db véletlen számot [10, 40] közötti tartományban, majd írjuk ki a páros számok közül a
3-mal is oszthatóakat!
 */
public class _32veletlenSzamok {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randInt;
		
		System.out.println("A 12 számból, amik oszthatók kettõvel és hárommal: ");
		
		for (int i = 0; i < 12; i++) {
			
			randInt = r.nextInt((40-10) + 1) + 10;
			
			if (randInt % 2 == 0 && randInt % 3 == 0) {
				System.out.println(randInt);
			} 			
		}

	}

}
