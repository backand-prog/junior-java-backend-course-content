package hf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2partibleBy7And3 {

	public static void main(String[] args) {
	int[] arr = partibleNums(getFirstNum(), getSecondNum(), getDivisible(), getDivisible());
	System.out.print("A megadott intervallumban a megadott számokkal osztható számok: ");arrPrint(arr);
	
	}
	
	public static int[] partibleNums (int startNum, int endNum, int divisible1, int divisible2) {
		
		int[] arrNums = new int[(endNum - startNum) + 1];
		for (int i = 0; i < arrNums.length; i++) {
			arrNums[i] = startNum;
			startNum++;
		}
		
		int partibleCounter = 0;
		for (int i = 0; i < arrNums.length; i++) {
			if (arrNums[i] % divisible1 == 0 && arrNums[i] % divisible2 == 0) {
				partibleCounter++;
			}
		}
		
		int[] partible3And7Nums = new int[partibleCounter];
		
		int partibleIncrementer = 0;
		for (int i = 0; i < arrNums.length; i++) {
			if (arrNums[i] % divisible1 == 0 && arrNums[i] % divisible2 == 0) {
				partible3And7Nums[partibleIncrementer] = arrNums[i];
				partibleIncrementer++;
			}
		}
				
				
		return partible3And7Nums;
	}
	
	public static int getFirstNum () {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		boolean isInt = true;
		do {
			
			try {
				System.out.print("Adja meg a sorozat elsõ számát: ");
				num = Integer.parseInt(br.readLine());
				isInt = true;
			} catch (NumberFormatException e) {
				System.out.println("Nem egész számot adott meg.");
				isInt = false;
			} catch (IOException e) {
				System.out.println("I/O hiba");
			}
		
		} while (isInt == false);
			
		
		return num;
	}
	
public static int getSecondNum () {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		boolean isInt = true;
		do {
			
			try {
				System.out.print("Adja meg a sorozat utolsó számát: ");
				num = Integer.parseInt(br.readLine());
				isInt = true;
			} catch (NumberFormatException e) {
				System.out.println("Nem egész számot adott meg.");
				isInt = false;
			} catch (IOException e) {
				System.out.println("I/O hiba");
			}
		
		} while (isInt == false);
			
		
		return num;
	}

public static int getDivisible () {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int num = 0;
	boolean isInt = true;
	do {
		
		try {
			System.out.print("Adja meg a kívánt osztót: ");
			num = Integer.parseInt(br.readLine());
			isInt = true;
		} catch (NumberFormatException e) {
			System.out.println("Nem egész számot adott meg.");
			isInt = false;
		} catch (IOException e) {
			System.out.println("I/O hiba");
		}
	
	} while (isInt == false);
		
	
	return num;
}
	
	public static void arrPrint(int[] arr) {
		for (int item : arr) {
			System.out.print(item + " ");
		}
		
	}
	
}

