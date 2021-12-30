package alapok;

import java.util.Scanner;

public class Elagazasok {

	public static void main(String[] args) {
		//el�gaz�sok
		//szeretn�nk egy felt�telt�l f�gg�en valamilyen ir�nyba vez�relni az appot

		//1. Egyir�ny� el�gaz�s
		//csak true
		//K�rj�k be a kinti h�m�rs�kletet, �s �rjuk ki ha fagy
		
		
		//ctrl+shift+o -> automatikus import�l�s, kiszedi a feleslegest
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. feladat - Egyir�ny� el�gaz�s");
		System.out.print("K�rem, adja meg a kinti h�m�rs�kletet: ");
		int homerseklet = Integer.parseInt(sc.nextLine());
		if (homerseklet < 0) {
			System.out.println("Fagy odakint...");
		}
		
		//k�t ir�ny� pozit�v eg�sz sz�mot, majd d�nts�k el hogy p�ros vagy p�ratlan
		
		System.out.println("2. feladat - K�tir�ny� el�gaz�s");
		System.out.print("K�rek egy pozit�v eg�sz sz�mot: ");
		int egeszSzam = Integer.parseInt(sc.nextLine());
		if (egeszSzam % 2 == 0) {
			System.out.println("P�ros");
		} else {
			System.out.println("P�ratlan");
		}
		
		//3. T�bbir�ny� el�gaz�s
		//Feladat: Bek�r�l 2 eg�sz sz�mot, majd eld�ntj�k, hogy melyik kisebb/nagyobb
		//esetleg egyenl�
		
		System.out.println("3. feladat - T�bbir�ny� el�gaz�s");
		System.out.println("K�rem adja meg az els� sz�mot: ");
		int elsoSzam = Integer.parseInt(sc.nextLine());
		System.out.println("K�rem adja meg a m�sodik sz�mot: ");
		int masodikSzam = Integer.parseInt(sc.nextLine());
		
		if (elsoSzam > masodikSzam) {
			System.out.print("Az els� megadott sz�m volt a nagyobb.");
			} else if (masodikSzam > elsoSzam) {
				System.out.println("A m�sodik megadott sz�m volt a nagyobb.");
			} else {
				System.out.println("A megadott k�t sz�m egyenl�.");
			}
		System.out.println();
		
		//Switch-case szerkezet: k�t�tt a lehet�s�gek sz�ma
		//T�bbir�ny� el�gaz�s switch-case szerkezettel
		//Feladat01: bek�r�nk egy �rdemjegyet sz�mmal, majd ki�rjuk sz�vegesen
		System.out.println("4. feladat - �rdemjegy");
		System.out.print("K�rem adjon meg egy �rdemjegyet sz�mmal! (1-5) ");
		int erdemJegy = Integer.parseInt(sc.nextLine());
		switch (erdemJegy) {
			case 1: System.out.println("El�gtelen");
				break;
			case 2: System.out.println("El�gs�ges");
				break;
			case 3: System.out.println("K�zepes");
				break;
			case 4: System.out.println("J�");
				break;	
			case 5: System.out.println("Jeles");
				break;
			default: System.out.println("Hib�s �rt�kes adott meg!");
				break;
		
		}
	
		
		//Feladat05: Be�rj�k a nap sorsz�m�t (1-7), majd meghat�rozzuk, hogy h�tk�znap vagy h�tv�ge
	
		System.out.println("K�rem adja meg a nap sorsz�m�t (1-7): ");
		int napSorszam = Integer.parseInt(sc.nextLine());
		switch (napSorszam) {
			case 1: System.out.println();
			case 2: System.out.println();
			case 3: System.out.println();
			case 4: System.out.println();
			case 5: System.out.println("H�tk�znap");
			case 6: System.out.println();
			case 7: System.out.println("H�tv�ge");
				break;
		default:
			break;
		}
		
		sc.close();
	}

}
