package HF01;

import java.util.Random;

/*
 * V�letlen sz�m gener�tor seg�ts�g�vel �rd ki egy kockadob�s eredm�ny�t!
 */

public class _21kocka_dobas {

	public static void main(String[] args) {
		
		System.out.print("A kockadob�s eredm�nye: ");
		
		Random r = new Random();
		
		int diceRoll = r.nextInt(6) + 1;
		System.out.println(diceRoll);
		
		
	}

}
