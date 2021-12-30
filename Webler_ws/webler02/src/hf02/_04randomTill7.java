package hf02;

import java.util.Random;

public class _04randomTill7 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int randInt;
		
		do {
			randInt = r.nextInt(10) + 1;
			System.out.print(randInt + " ");
		} while (randInt != 7);
		

	}

}
