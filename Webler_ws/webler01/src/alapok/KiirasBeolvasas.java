package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KiirasBeolvasas {

	public static void main(String[] args) throws IOException {
		
		//Scanner és BufferedReader
		//Különbség - a BufferedReader újabb, gyorsabb, több szálon mûködik. Szinkronizált és szálbiztos
		//A BufferedReaeder kötelez minket a kivételkezelésre
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//szöveg beolvasása Scanner osztállyal
		System.out.print("Kérem, adja meg a nevét: ");
		String beolvasottNev = sc.nextLine();
		System.out.println("A megadott név ez volt: " + beolvasottNev);
		
		//egész szám beolvasása Scanner osztállyal, kevertálás/parsolás
		System.out.print("Kérem, adjon meg egy egész számot: ");
		int beolvasottSzam = Integer.parseInt(sc.nextLine());
		System.out.println("A megadott szám ez volt: " + beolvasottSzam);
		
		//törtszám beolvasása Scanner osztállyal, konvertálással, parsolás
		System.out.print("Kérem, adjon meg egy tört számot: ");
		double beolvasottTortSzam = Double.parseDouble(sc.nextLine());
		System.out.println("A megadott törtszám ez volt: " + beolvasottTortSzam);
		
		//BufferedRead objektumpéldány léterhozása
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//szöveg beolvasása BufferedReader segítségével
		System.out.println("kérem adja meg a nevét (BufferedReader): ");
		String beolvasottNev2 = br.readLine();
		System.out.println("A beolvasott név BufferedReader-rel ez volt: " + beolvasottNev2);
	
		//egész szám beolvasása BufferedReader segítségével
		System.out.println("kérem adja meg a korát (BufferedReader): ");
		int kor = Integer.parseInt(br.readLine());
		System.out.println("A beolvasott kor ez volt: " + kor);
		
		//minkettõt le kell zárni
		sc.close();

		br.close();

	}

}