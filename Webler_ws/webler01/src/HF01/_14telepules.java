package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * �rj programot, amely bek�r a felhaszn�l�t�l egy helys�gnevet, valamint ennek a helys�gnek a
l�leksz�m�t, �s a megadott l�leksz�mt�l f�gg�en ki�rja, hogy az adott helys�g milyen
telep�l�st�pusba tartozik. (telepules)
- ha a l�leksz�m kevesebb, mint 5000, akkor k�zs�g
- ha a l�leksz�m legal�bb 5000, de kevesebb, mint 20 000, akkor kisv�ros
- ha a l�leksz�m legal�bb 20 000, de kevesebb, mint 100 000, akkor k�z�pv�ros
- ha a l�leksz�m legal�bb 100 000, de kevesebb, mint 1 000 000, akkor nagyv�ros
- ha a l�leksz�m legal�bb 1 000 000, akkor metropolis
- ha a felhaszn�l� 0 vagy ann�l kisebb sz�mot ad meg, a program �rja ki, hogy "Hib�s
adatbevitel"!
 */

public class _14telepules {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("K�rem, adja meg a telep�l�s nev�t: ");
		String townName = sc.nextLine();
		System.out.print("K�rem, adja meg a telep�l�s l�leksz�m�t: ");
		int townCapitation = Integer.parseInt(sc.nextLine());
		
		if (townCapitation <= 0) {
			System.out.println("Hib�s adatbevitel");
		} else if (townCapitation > 0 && townCapitation < 5000) {
			System.out.println(townName + " egy k�zs�g");
		} else if (townCapitation >= 5000 && townCapitation < 20000) {
			System.out.println(townName + " egy kisv�ros");
		} else if (townCapitation >= 20000 && townCapitation < 100000) {
			System.out.println(townName + " egy k�z�pv�ros");
		} else if (townCapitation >= 100000 && townCapitation < 1000000) {
			System.out.println(townName + " egy nagyv�ros");
		} else {
			System.out.println(townName + " egy metropolis");
		}
		
		//BufferedReader
		
		System.out.println("\nMegold�s BufferedReaderrel");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem, adja meg a telep�l�s nev�t: ");
		String townName2 = br.readLine();
		System.out.print("K�rem, adja meg a telep�l�s l�leksz�m�t: ");
		int townCapitation2 = Integer.parseInt(br.readLine());
		
		if (townCapitation2 <= 0) {
			System.out.println("Hib�s adatbevitel");
		} else if (townCapitation2 > 0 && townCapitation2 < 5000) {
			System.out.println(townName2 + " egy k�zs�g");
		} else if (townCapitation >= 5000 && townCapitation < 20000) {
			System.out.println(townName2 + " egy kisv�ros");
		} else if (townCapitation2 >= 20000 && townCapitation2 < 100000) {
			System.out.println(townName + " egy k�z�pv�ros");
		} else if (townCapitation2 >= 100000 && townCapitation2 < 1000000) {
			System.out.println(townName2 + " egy nagyv�ros");
		} else {
			System.out.println(townName2 + " egy metropolis");
		}
		
		
		sc.close();
		br.close();
		
		
	}

}
