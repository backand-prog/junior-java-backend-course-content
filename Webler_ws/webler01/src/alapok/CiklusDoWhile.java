package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CiklusDoWhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Do-While ciklus
		 * itt sem tudjuk, hogy hányszor ismétlünk
		 * hátultesztelõs ciklus
		 * Egyszer biztosan lefeut, utána ellenõrzi a feltételt
		 * ha igaz, belemegy a ciklusbagba
		 */
		
		//1.Addig kérek be számokat, amíg 0-at nem adok meg
		System.out.println("1. feladat - Számok nulláig");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int requestInt;
		
		do {
			//ciklusmag
			System.out.println("Kérem adjon meg egy számot (0-ra kilép): ");
			requestInt = Integer.parseInt(br.readLine());
		} while (requestInt != 0);
		
		//Addig hozok létre véletlen számokat (1-10 között), amíg 6-os nem lesz
		
		System.out.println("\nMásodik feladat");
		
		int randInt;
		Random r = new Random();
		
		do {
			randInt = r.nextInt(10) + 1;
			System.out.print(randInt + " ");
		} while (randInt != 6);
		
		br.close();
		
	}

}
