package hf02;

import java.util.Random;

public class _07_huszelemuTomb {

	public static void main(String[] args) {
		
		Random r = new Random();
		int arr[] = new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(((60 + 60)) +1) + (-60);
			System.out.print(arr[i] + " ");
		
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < -20) {
				System.out.print(arr[i] + " ");
			
			}

		}

	}

}