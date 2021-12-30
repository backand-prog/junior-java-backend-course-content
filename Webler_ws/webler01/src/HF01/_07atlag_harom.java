package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Kérj be 3 egész számot, majd írd ki az átlagukat! (atlag_harom)
 */

public class _07atlag_harom {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		//Scanner
		System.out.print("Add meg az elsõ számot: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Add meg a második számot: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("Add meg a harmadik számot: ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		double avg = (double)(num1 + num2 + num3) / 3;
		
		System.out.println("A három szám átlaga: " + avg);
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nSzámítás BufferedReaderrel");
		
		System.out.print("Add meg az elsõ számot: ");
		int num4 = Integer.parseInt(br.readLine());
		System.out.print("Add meg a második számot: ");
		int num5 = Integer.parseInt(br.readLine());
		System.out.print("Add meg a harmadik számot: ");
		int num6 = Integer.parseInt(br.readLine());
		
		double avg2 = (double)(num4 + num5 + num6) / 3;
		
		System.out.println("A három szám átlaga: " + avg2);
		
		sc.close();
		br.close();
		
	}

}
