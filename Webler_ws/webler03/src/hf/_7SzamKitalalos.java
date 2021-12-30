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
				System.out.print("Adj meg egy sz�mot (" + minInt + " �s " + maxInt + ") k�z�tt: ");
				guessNum = Integer.parseInt(br.readLine());
				if (guessNum > maxInt || guessNum < minInt) {
					System.out.println("Nem a gener�lt sz�mok tartom�ny�ban adt�l meg �rt�ket(" + minInt + " �s " + maxInt + ").");
				} else {
					if (guessNum > randInt) {
						System.out.println("A megadott sz�m nagyobb, mint a keresett sz�m.");
					} else if (guessNum < randInt) {
						System.out.println("A megadott sz�m kisebb, mint a keresett sz�m.");
					}
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Eg�sz sz�mot kell megadni");
			} catch (IOException e) {
				System.out.println("Input/Output hiba");
			}
		} while (guessNum != randInt);
		
		System.out.print("Siker. A keresett sz�m: " + randInt + ".");
		
		
	}

}
