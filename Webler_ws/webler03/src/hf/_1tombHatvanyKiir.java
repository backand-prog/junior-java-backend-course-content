package hf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1tombHatvanyKiir {

	public static void main(String[] args) {
		
		int[] arr = createArray();
		arrPrint(arr);
		System.out.println();
		arrElementPowPrint(arr, 2);
		
	}
	
	public static void arrElementPowPrint (int[] arr, int pow) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((int)Math.pow(arr[i], pow) + " ");
		}
		
	}
	
	
	public static int[] createArray () {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("Kérem adja meg, hogy mekkora legyen a tömb (pozitív egész szám): ");
		int arrLength = -1;
		
		while (arrLength < 1) {
			try {
				arrLength = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.print("Nem megfelelõ értéket adtál meg. ");
			} catch (IOException e) {
				System.out.println("I/O hiba történt.");
			}
			if (arrLength < 1) {
				System.out.println("A megadott számnak pozitív egésznek kell lennie.");
			}
		};
			
		int[] arr = new int[arrLength];
		

		
		for (int i = 0; i < arr.length; i++) {
			
				boolean isInt = false;
				do {
					try {
						System.out.print("Adjon meg egy egész számot: ");
						arr[i] = Integer.parseInt(br.readLine());
						isInt = true;
					} catch (NumberFormatException e) {
						System.out.print("Nem egész szám. ");	
						isInt = false;
					} catch (IOException e) {
						System.out.println("I/O hiba történt.");
					}
				} while (isInt == false);
				
		}
			
			return arr;
		
	}
		
	
	
	public static void arrPrint (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
