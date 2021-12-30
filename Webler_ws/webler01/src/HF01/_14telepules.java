package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Írj programot, amely bekér a felhasználótól egy helységnevet, valamint ennek a helységnek a
lélekszámát, és a megadott lélekszámtól függõen kiírja, hogy az adott helység milyen
településtípusba tartozik. (telepules)
- ha a lélekszám kevesebb, mint 5000, akkor község
- ha a lélekszám legalább 5000, de kevesebb, mint 20 000, akkor kisváros
- ha a lélekszám legalább 20 000, de kevesebb, mint 100 000, akkor középváros
- ha a lélekszám legalább 100 000, de kevesebb, mint 1 000 000, akkor nagyváros
- ha a lélekszám legalább 1 000 000, akkor metropolis
- ha a felhasználó 0 vagy annál kisebb számot ad meg, a program írja ki, hogy "Hibás
adatbevitel"!
 */

public class _14telepules {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kérem, adja meg a település nevét: ");
		String townName = sc.nextLine();
		System.out.print("Kérem, adja meg a település lélekszámát: ");
		int townCapitation = Integer.parseInt(sc.nextLine());
		
		if (townCapitation <= 0) {
			System.out.println("Hibás adatbevitel");
		} else if (townCapitation > 0 && townCapitation < 5000) {
			System.out.println(townName + " egy község");
		} else if (townCapitation >= 5000 && townCapitation < 20000) {
			System.out.println(townName + " egy kisváros");
		} else if (townCapitation >= 20000 && townCapitation < 100000) {
			System.out.println(townName + " egy középváros");
		} else if (townCapitation >= 100000 && townCapitation < 1000000) {
			System.out.println(townName + " egy nagyváros");
		} else {
			System.out.println(townName + " egy metropolis");
		}
		
		//BufferedReader
		
		System.out.println("\nMegoldás BufferedReaderrel");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem, adja meg a település nevét: ");
		String townName2 = br.readLine();
		System.out.print("Kérem, adja meg a település lélekszámát: ");
		int townCapitation2 = Integer.parseInt(br.readLine());
		
		if (townCapitation2 <= 0) {
			System.out.println("Hibás adatbevitel");
		} else if (townCapitation2 > 0 && townCapitation2 < 5000) {
			System.out.println(townName2 + " egy község");
		} else if (townCapitation >= 5000 && townCapitation < 20000) {
			System.out.println(townName2 + " egy kisváros");
		} else if (townCapitation2 >= 20000 && townCapitation2 < 100000) {
			System.out.println(townName + " egy középváros");
		} else if (townCapitation2 >= 100000 && townCapitation2 < 1000000) {
			System.out.println(townName2 + " egy nagyváros");
		} else {
			System.out.println(townName2 + " egy metropolis");
		}
		
		
		sc.close();
		br.close();
		
		
	}

}
