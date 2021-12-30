package hf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class _7SzamKitalalos {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		int minInt = 0;
		int maxInt = 1;
		int randInt = r.nextInt((maxInt - minInt) + 1) + minInt;
		int guessNum = minInt - 1;
		do {
			try {
				System.out.print("Adj meg egy számot (" + minInt + " és " + maxInt + ") között: ");
				guessNum = Integer.parseInt(br.readLine());
				if (guessNum > maxInt || guessNum < minInt) {
					System.out.println("Nem a generált számok tartományában adtál meg értéket(" + minInt + " és " + maxInt + ").");
				} else {
					if (guessNum > randInt) {
						System.out.println("A megadott szám nagyobb, mint a keresett szám.");
					} else if (guessNum < randInt) {
						System.out.println("A megadott szám kisebb, mint a keresett szám.");
					}
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Egész számot kell megadni");
			} catch (IOException e) {
				System.out.println("Input/Output hiba");
			}
		} while (guessNum != randInt);
		
		System.out.print("Siker. A keresett szám: " + randInt + ".");
		
		
	}

}
