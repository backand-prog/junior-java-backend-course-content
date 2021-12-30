package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _11paros_hat {

	public static void main(String[] args) throws IOException {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for (int i = 1; i < 7; i++) {
			System.out.println(i + ". szám.");
			System.out.print("Kérem, adjon meg egy számot!");
						
			num = Integer.parseInt(sc.nextLine());
			
			if (num % 2 == 0) {
				System.out.println("A megadott szám (" + num + ") páros.");
			} else {
				System.out.println("A megadott szám (" + num + ") páratlan.");
			}
			
		}
		
		//BufferedReader
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nFeladat megoldása BufferedReaderrel");
		int num2;
		
		for (int i = 1; i < 7; i++) {
			System.out.println(i + ". szám.");
			System.out.print("Kérem, adjon meg egy számot!");
						
			num2 = Integer.parseInt(br.readLine());
			
			if (num2 % 2 == 0) {
				System.out.println("A megadott szám (" + num2 + ") páros.");
			} else {
				System.out.println("A megadott szám (" + num2 + ") páratlan.");
			}
		
		
		
		}
		
		sc.close();
		br.close();
	}

}


