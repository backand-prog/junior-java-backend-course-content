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
		
		
		
		System.out.print("K�rem adja meg, hogy mekkora legyen a t�mb (pozit�v eg�sz sz�m): ");
		int arrLength = -1;
		
		while (arrLength < 1) {
			try {
				arrLength = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.print("Nem megfelel� �rt�ket adt�l meg. ");
			} catch (IOException e) {
				System.out.println("I/O hiba t�rt�nt.");
			}
			if (arrLength < 1) {
				System.out.println("A megadott sz�mnak pozit�v eg�sznek kell lennie.");
			}
		};
			
		int[] arr = new int[arrLength];
		

		
		for (int i = 0; i < arr.length; i++) {
			
				boolean isInt = false;
				do {
					try {
						System.out.print("Adjon meg egy eg�sz sz�mot: ");
						arr[i] = Integer.parseInt(br.readLine());
						isInt = true;
					} catch (NumberFormatException e) {
						System.out.print("Nem eg�sz sz�m. ");	
						isInt = false;
					} catch (IOException e) {
						System.out.println("I/O hiba t�rt�nt.");
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
