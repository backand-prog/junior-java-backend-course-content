package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CiklusDoWhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Do-While ciklus
		 * itt sem tudjuk, hogy h�nyszor ism�tl�nk
		 * h�tultesztel�s ciklus
		 * Egyszer biztosan lefeut, ut�na ellen�rzi a felt�telt
		 * ha igaz, belemegy a ciklusbagba
		 */
		
		//1.Addig k�rek be sz�mokat, am�g 0-at nem adok meg
		System.out.println("1. feladat - Sz�mok null�ig");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int requestInt;
		
		do {
			//ciklusmag
			System.out.println("K�rem adjon meg egy sz�mot (0-ra kil�p): ");
			requestInt = Integer.parseInt(br.readLine());
		} while (requestInt != 0);
		
		//Addig hozok l�tre v�letlen sz�mokat (1-10 k�z�tt), am�g 6-os nem lesz
		
		System.out.println("\nM�sodik feladat");
		
		int randInt;
		Random r = new Random();
		
		do {
			randInt = r.nextInt(10) + 1;
			System.out.print(randInt + " ");
		} while (randInt != 6);
		
		br.close();
		
	}

}
