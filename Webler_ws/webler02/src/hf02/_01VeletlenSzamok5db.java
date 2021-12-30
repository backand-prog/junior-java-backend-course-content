package hf02;

import java.util.Random;

public class _01VeletlenSzamok5db {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int sum = 0;

		System.out.print("A generált számok: ");
		for (int i = 0; i < 5; i++) {
			int randInt = r.nextInt(8) + 1;
			System.out.print(randInt + " ");
			sum += randInt;
		}
		
		double avg = (double)sum / 5;
		
		System.out.println("\nA számok átlaga: " + avg);
			
		}
	
}


