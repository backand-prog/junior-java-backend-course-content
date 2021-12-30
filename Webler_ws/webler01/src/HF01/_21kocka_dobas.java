package HF01;

import java.util.Random;

/*
 * Véletlen szám generátor segítségével írd ki egy kockadobás eredményét!
 */

public class _21kocka_dobas {

	public static void main(String[] args) {
		
		System.out.print("A kockadobás eredménye: ");
		
		Random r = new Random();
		
		int diceRoll = r.nextInt(6) + 1;
		System.out.println(diceRoll);
		
		
	}

}
