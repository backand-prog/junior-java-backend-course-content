package HF01;

import java.util.Random;

/*
 * Hozz l�tre 12 db v�letlen sz�mot [10, 40] k�z�tti tartom�nyban, majd �rjuk ki a p�ros sz�mok k�z�l a
3-mal is oszthat�akat!
 */
public class _32veletlenSzamok {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randInt;
		
		System.out.println("A 12 sz�mb�l, amik oszthat�k kett�vel �s h�rommal: ");
		
		for (int i = 0; i < 12; i++) {
			
			randInt = r.nextInt((40-10) + 1) + 10;
			
			if (randInt % 2 == 0 && randInt % 3 == 0) {
				System.out.println(randInt);
			} 			
		}

	}

}
