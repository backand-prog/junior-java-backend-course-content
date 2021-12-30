package hf02;

import java.util.Random;

public class _09array15 {

	public static void main(String[] args) {
		
		int[] arr = createRandomArray(15);
		
		printWithSpace(arr);
		printBiggerThan40(arr);
		printLowerThan25(arr);
		divisibleWith3(arr);
		oddElements(arr);
		
	}
	
	public static int[] createRandomArray(int arrLength) {
		
		Random r = new Random();
		
		int[] arr = new int[arrLength];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt((60-20) + 1) + 20;
			
		}
		
		return arr;
		
		
	}

	public static void printWithSpace(int[] arr) {
		System.out.print("A t�mb elemei: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void printBiggerThan40(int[] arr) {
		System.out.print("\n40-n�l nagyobb elemek: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 40) {
				System.out.print(arr[i] + " ");
				
			}
			
		}
		
	}
	
	public static void printLowerThan25(int[] arr) {
		System.out.print("\n25-n�l kisebb elemek: ");
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		
		if (min >= 25) {
			System.out.println("Nincs 25-n�l kisebb �rt�k");
		} else {	
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < 25) {
					System.out.print(arr[i] + " ");
				} 
		
			}	
		
		}
		
	}
	
	public static void divisibleWith3 (int[] arr) {
		System.out.print("\nH�rommal oszthat� elemek: ");
		
		for (int item : arr) {
			if (item % 3 == 0) {
				System.out.print(item + " ");
			}
		}
		
		
	}
	
	public static void oddElements (int[] arr) {
		System.out.print("\nP�ratlan elemek: ");
		for (int item : arr) {
			if (item % 2 == 1) {
				System.out.print(item + " ");
			}
		}
		
	}
}
