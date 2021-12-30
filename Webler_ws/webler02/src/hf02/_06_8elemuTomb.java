package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_8elemuTomb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] testArr = new int[8];
		
		for (int i = 0; i < testArr.length; i++) {
			
			System.out.print("K�rem adja meg a t�mb " + (i + 1) + ". elem�t (eg�sz sz�m): ");
			testArr[i] = Integer.parseInt(br.readLine());
			
		}
		
		System.out.print("A t�mb elemei: ");
		for (int i = 0; i < testArr.length; i++) {
			
			if (i == testArr.length - 1) {
				System.out.println(testArr[i]);
			} else {
				System.out.print(testArr[i] + ", ");
			}
		
		}
		
		System.out.println("\na) feladat");
		System.out.println("P�ros sz�mok �s indexeik ki�r�sa: ");
		
		for (int i = 0; i < testArr.length; i++) {
			if (testArr[i] % 2 == 0) {
				System.out.print(testArr[i] + "[" + i +"] ");
			}
		}
		
		System.out.println();
		System.out.println("\nb) feladat");
		System.out.println("Utols� elem (" + (testArr[testArr.length - 1])+") n�gyzete: " + (int)Math.pow(testArr[testArr.length -1] , 2));
		
		
		System.out.println("\nc) feladat");
		System.out.println("Az els� k�t elem (" + (testArr[0] + ", " + testArr[1]) + ") �tlaga: " + ((double)(testArr[0] + testArr[1]) / 2));
		
		
		System.out.println("\nd) feladat");
		System.out.println("Az utols� h�rom elem (" +
		(testArr[testArr.length -1] + ", " + testArr[testArr.length -2]  + ", " + testArr[testArr.length -3] + ") �sszege: " + (testArr[testArr.length -1] + testArr[testArr.length -2] + testArr[testArr.length -3])));
	
		System.out.println("\ne) feladat");
		System.out.println("Az els� �s m�sodik ("+ testArr[0] + ", " + testArr[1] + ") elem k�l�nbs�ge: " + (testArr[0] -testArr[1]));
		
		System.out.println("\nf) feladat");
		System.out.print("K�rem adja meg az indexet (0-7): ");
		int index = Integer.parseInt(br.readLine());
		System.out.print("K�rem adja meg a kitev�t: ");
		int	exponent = Integer.parseInt(br.readLine());
		
		System.out.println("A " + index + ". index� sz�m ("+ testArr[index] + ") " + exponent + ". hatv�nya: " + (int)Math.pow(testArr[index], exponent));
		
	
	}

}
