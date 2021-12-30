package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_8elemuTomb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] testArr = new int[8];
		
		for (int i = 0; i < testArr.length; i++) {
			
			System.out.print("Kérem adja meg a tömb " + (i + 1) + ". elemét (egész szám): ");
			testArr[i] = Integer.parseInt(br.readLine());
			
		}
		
		System.out.print("A tömb elemei: ");
		for (int i = 0; i < testArr.length; i++) {
			
			if (i == testArr.length - 1) {
				System.out.println(testArr[i]);
			} else {
				System.out.print(testArr[i] + ", ");
			}
		
		}
		
		System.out.println("\na) feladat");
		System.out.println("Páros számok és indexeik kiírása: ");
		
		for (int i = 0; i < testArr.length; i++) {
			if (testArr[i] % 2 == 0) {
				System.out.print(testArr[i] + "[" + i +"] ");
			}
		}
		
		System.out.println();
		System.out.println("\nb) feladat");
		System.out.println("Utolsó elem (" + (testArr[testArr.length - 1])+") négyzete: " + (int)Math.pow(testArr[testArr.length -1] , 2));
		
		
		System.out.println("\nc) feladat");
		System.out.println("Az elsõ két elem (" + (testArr[0] + ", " + testArr[1]) + ") átlaga: " + ((double)(testArr[0] + testArr[1]) / 2));
		
		
		System.out.println("\nd) feladat");
		System.out.println("Az utolsó három elem (" +
		(testArr[testArr.length -1] + ", " + testArr[testArr.length -2]  + ", " + testArr[testArr.length -3] + ") összege: " + (testArr[testArr.length -1] + testArr[testArr.length -2] + testArr[testArr.length -3])));
	
		System.out.println("\ne) feladat");
		System.out.println("Az elsõ és második ("+ testArr[0] + ", " + testArr[1] + ") elem különbsége: " + (testArr[0] -testArr[1]));
		
		System.out.println("\nf) feladat");
		System.out.print("Kérem adja meg az indexet (0-7): ");
		int index = Integer.parseInt(br.readLine());
		System.out.print("Kérem adja meg a kitevõt: ");
		int	exponent = Integer.parseInt(br.readLine());
		
		System.out.println("A " + index + ". indexû szám ("+ testArr[index] + ") " + exponent + ". hatványa: " + (int)Math.pow(testArr[index], exponent));
		
	
	}

}
