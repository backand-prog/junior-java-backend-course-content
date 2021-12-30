package hf02;

import java.util.Random;

public class _02VeletlenSzamok1ParosParatlan {

	public static void main(String[] args) {
		
		Random r = new Random();
		int sum = 0;
		System.out.print("A generált számok: ");
		
		for (int i = 0; i < 10; i++) {
			int randInt = r.nextInt((30 - 5) + 1) + 5;
			sum += randInt;
			System.out.print(randInt + " ");
		}
		
		System.out.println();
		
		if (sum % 2 == 0) {
			System.out.println("Az elemek összege (" + sum + ") páros");
		} else {
			System.out.println("Az elemek összege (" + sum + ") páratlan");
		}
		
	}

}
