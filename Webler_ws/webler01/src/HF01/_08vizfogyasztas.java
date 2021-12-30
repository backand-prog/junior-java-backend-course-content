package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 
 * Kérjük be a felhasználótól a napi vízfogyasztását! Döntsük el, hogy elég vizet ivott –e (ajánlott
bevitel min. 3 liter)! (vizfogyasztas_3liter)
 */

public class _08vizfogyasztas {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Scanner

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kérem adja meg a napi vízfogyasztását literben!");
		int vizfogyasztas = Integer.parseInt(sc.nextLine());
		
		if (vizfogyasztas >= 3) {
			System.out.println("Az elfogyasztott vízmennyiség elegendõ!");
		} else {
			System.out.println("Ön nem elegendõ vízmennyiséget fogyaszt. A javasolt napi vízbevitel minimum 3 liter.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nA feladat megoldása BufferedReaderrel");
		System.out.print("Kérem adja meg a napi vízfogyasztását literben!");
		
		int vizfogyasztas2 = Integer.parseInt(br.readLine());
		
		if (vizfogyasztas2 >= 3) {
			System.out.println("Az elfogyasztott vízmennyiség elegendõ!");
		} else {
			System.out.println("Ön nem elegendõ vízmennyiséget fogyaszt. A javasolt napi vízbevitel minimum 3 liter.");
		}
		
		sc.close();
		br.close();
	}

}
