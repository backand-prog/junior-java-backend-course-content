package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class _13array30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] array = new int[30];
		fillArray(array);
		printArray(array);
		System.out.println();
		System.out.println(positiveNumCount(array) + " db pozitív szám van a tömbben.");
		System.out.println(divisibleCount2And3(array) + " db 2-vel és 3-al osztható szám van a tömbben.");
		System.out.println(over10Count(array) + " db 10-nél nagyobb szám van a tömbben.");
		System.out.println("Az utolsó elõtti szám: " + lastButOne(array));
		System.out.println("A megadott indexen lévõ szám: " + inputIndexValue(array));
		System.out.println("A legmagasabb érték a tömbben: " + maxValueAndIndex(array));
		System.out.println("A legalacsonyabb érték a tömbben: " + minValueAndIndex(array));
	
	}
	
	public static void fillArray (int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt((15 - (-10) + 1)) + (-10);
		}
		
	}
	
	public static void printArray (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int positiveNumCount (int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
		
	}
	
	public static int divisibleCount2And3 (int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int over10Count (int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 10) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int lastButOne (int[] arr) {
		
		return arr[arr.length - 2];
		
	}
	
	public static int inputIndexValue (int[] arr) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kérem adja meg az indexet (0-29): ");
		int index = Integer.parseInt(br.readLine());
		int value = arr[index];
		return value;
		
	}
	
	public static int maxValueAndIndex (int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int minValueAndIndex (int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
}
