package HF01;

import java.util.Random;

public class _33penzfeldobas {

	public static void main(String[] args) {
		
		Random r = new Random();
		int rollNum = 1;
		
		for (int i = 0; i < 3; i++) {
			
			boolean diceRoll = r.nextBoolean();
			
			
			if (diceRoll == true) {
				System.out.println(rollNum + ". dob�s eredm�nye: Fej");
			} else {
				System.out.println(rollNum + ". dob�s eredm�nye: �r�s");
			}
			
			rollNum += 1;
		
		}

	}

}
