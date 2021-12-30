package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _10szorzat_paros {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kérem az elsõ számot!");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Kérem a második számot!");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if ((num1 * num2) % 2 == 0) {
			System.out.println("A szorzat páros.");
		} else {
			System.out.println("A szorzat páratlan.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nA feladat megoldása BufferedReaderrel.");
		
		System.out.print("Kérem az elsõ számot!");
		int num3 = Integer.parseInt(br.readLine());
		System.out.print("Kérem a második számot!");
		int num4 = Integer.parseInt(br.readLine());
		
		if ((num3 * num4) % 2 == 0) {
			System.out.println("A szorzat páros.");
		} else {
			System.out.println("A szorzat páratlan.");
		}
		
		sc.close();
		br.close();
		
	}

}
