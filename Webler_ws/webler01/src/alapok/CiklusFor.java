package alapok;

import java.util.Scanner;

public class CiklusFor {

	public static void main(String[] args) {
		
		Scanner scObj = new Scanner(System.in);
		
		System.out.println("1. feladat");
		System.out.print("K�rem adja meg a nev�t: ");
		
		String nev = scObj.nextLine();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". fut�s " + nev);
		
		}
		
		//2. feladat K�rj�nk be egy sz�veget �s egy ism�tl�ssz�mot, majd �rjuk ki a sz�veget
		//egym�s al� annyiszor, amilyen �rt�ket be�rtunk
			
		System.out.println("\n2.feladat");
		
		System.out.print("Adja meg az ism�tlend� sz�veget: ");
		String stringToRepeat = scObj.nextLine();
		System.out.print("Adja meg, h�nyszor leyen ism�telve a sz�veg: ");
		int timesToRepeat = Integer.parseInt(scObj.nextLine());
		
		for (int i = 0; i < timesToRepeat; i++) {
			System.out.println((i + 1) + ": " + stringToRepeat);
		}
			
		//3. feladat K�rj�nk be 10 db eg�sz sz�mot ,amdj mindegyikr�l mondjuk meg k�l�n-k�l�n
		//hogy osztahat� e h�rommal
		System.out.println("\n3. feladat");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("K�rem adjon meg egy sz�mot: ");
			int szamBekert = Integer.parseInt(scObj.nextLine());
			if (szamBekert % 3 == 0 ) {
				System.out.println("Oszthat� h�rommal.");
			} else {
				System.out.println("Nem oszthat� h�rommal.");
			}
			
		}
			
			//HF 4. 10-t�l visszafel� 1-ig egym�s mell� sz�k�zzel elv�lasztva �rjuk ki a sz�mokat
		System.out.println("\n4. feladat: ");
		
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
			
		}
			
			//HF 5. feladat: K�r�nk be egy kezd� �s egy v�g�rt�ket, majd �rjuk ki a k�t �rt�k 
			//k�z�tt a h�rommal �s n�ggyel marad�k n�lk�l oszthat� sz�mokat (egym�s mell� sz�k�zzel)
		
		System.out.println("\n5. feladat");
		
		System.out.print("K�rem, adja meg a kezd��rt�ket: ");
		int startValue = Integer.parseInt(scObj.nextLine());
		System.out.print("K�rem, adja meg a v�g�rt�ket: ");
		int endValue = Integer.parseInt(scObj.nextLine());
		System.out.print("A " + startValue + " �s " + endValue + " k�z�tt 3-al �s 4-el oszthat� sz�mok: ");
		
		for (int i = startValue; i <= endValue; i++) {
			
			if (i % 4 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		scObj.close();

	}


}

		
	


