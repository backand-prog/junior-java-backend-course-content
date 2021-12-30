package progTetelek;

import java.util.Random;

public class Sandbox {

	public static void main(String[] args) {
		int[] array = arrCreate();
		arrPrint(array);


	}
	
	public static boolean decide(int[] arr, int num) {
		boolean isTrue = false;
		int x = 0;
		while(x<arr.length && arr[x] != num)
			x++;
		if (x<arr.length) {
			isTrue = true;
			
		}
		
		return isTrue;
	}
	
	public static int[] arrCreate() {
		Random r = new Random();
		
		int[] arr = new int[5];
		int randInt;
		for (int i = 0; i < arr.length; i++) {
			do {
				randInt = r.nextInt(10) + 1;
			} while (decide(arr, randInt));
			
			arr[i] = randInt;

		}
		
		return arr;
		
	}
	
	public static void arrPrint(int[] arr) {
		
		for (int item : arr) {
			System.out.print(item + " ");
		}
		
	}
	
	public static int select (int[] arr, int findThis) {
		int i = 0;
		while (arr[i] != findThis) {
			i++;
		}
		return i;
	}

}
