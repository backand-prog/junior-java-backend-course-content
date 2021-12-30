package alapok;

import java.util.Scanner;

public class Elagazasok {

	public static void main(String[] args) {
		//elágazások
		//szeretnénk egy feltételtõl függõen valamilyen irányba vezérelni az appot

		//1. Egyirányú elágazás
		//csak true
		//Kérjük be a kinti hõmérsékletet, és írjuk ki ha fagy
		
		
		//ctrl+shift+o -> automatikus importálás, kiszedi a feleslegest
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. feladat - Egyirányú elágazás");
		System.out.print("Kérem, adja meg a kinti hõmérsékletet: ");
		int homerseklet = Integer.parseInt(sc.nextLine());
		if (homerseklet < 0) {
			System.out.println("Fagy odakint...");
		}
		
		//két irányú pozitív egész számot, majd döntsük el hogy páros vagy páratlan
		
		System.out.println("2. feladat - Kétirányú elágazás");
		System.out.print("Kérek egy pozitív egész számot: ");
		int egeszSzam = Integer.parseInt(sc.nextLine());
		if (egeszSzam % 2 == 0) {
			System.out.println("Páros");
		} else {
			System.out.println("Páratlan");
		}
		
		//3. Többirányú elágazás
		//Feladat: Bekérül 2 egész számot, majd eldöntjük, hogy melyik kisebb/nagyobb
		//esetleg egyenlõ
		
		System.out.println("3. feladat - Többirányú elágazás");
		System.out.println("Kérem adja meg az elsõ számot: ");
		int elsoSzam = Integer.parseInt(sc.nextLine());
		System.out.println("Kérem adja meg a második számot: ");
		int masodikSzam = Integer.parseInt(sc.nextLine());
		
		if (elsoSzam > masodikSzam) {
			System.out.print("Az elsõ megadott szám volt a nagyobb.");
			} else if (masodikSzam > elsoSzam) {
				System.out.println("A második megadott szám volt a nagyobb.");
			} else {
				System.out.println("A megadott két szám egyenlõ.");
			}
		System.out.println();
		
		//Switch-case szerkezet: kötött a lehetõségek száma
		//Többirányú elágazás switch-case szerkezettel
		//Feladat01: bekérünk egy érdemjegyet számmal, majd kiírjuk szövegesen
		System.out.println("4. feladat - Érdemjegy");
		System.out.print("Kérem adjon meg egy érdemjegyet számmal! (1-5) ");
		int erdemJegy = Integer.parseInt(sc.nextLine());
		switch (erdemJegy) {
			case 1: System.out.println("Elégtelen");
				break;
			case 2: System.out.println("Elégséges");
				break;
			case 3: System.out.println("Közepes");
				break;
			case 4: System.out.println("Jó");
				break;	
			case 5: System.out.println("Jeles");
				break;
			default: System.out.println("Hibás értékes adott meg!");
				break;
		
		}
	
		
		//Feladat05: Beérjük a nap sorszámát (1-7), majd meghatározzuk, hogy hétköznap vagy hétvége
	
		System.out.println("Kérem adja meg a nap sorszámát (1-7): ");
		int napSorszam = Integer.parseInt(sc.nextLine());
		switch (napSorszam) {
			case 1: System.out.println();
			case 2: System.out.println();
			case 3: System.out.println();
			case 4: System.out.println();
			case 5: System.out.println("Hétköznap");
			case 6: System.out.println();
			case 7: System.out.println("Hétvége");
				break;
		default:
			break;
		}
		
		sc.close();
	}

}
