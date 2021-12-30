package alapok;

import java.util.Scanner;

public class CiklusFor {

	public static void main(String[] args) {
		
		Scanner scObj = new Scanner(System.in);
		
		System.out.println("1. feladat");
		System.out.print("Kérem adja meg a nevét: ");
		
		String nev = scObj.nextLine();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". futás " + nev);
		
		}
		
		//2. feladat Kérjénk be egy szöveget és egy ismétlésszámot, majd írjuk ki a szöveget
		//egymás alá annyiszor, amilyen értéket beírtunk
			
		System.out.println("\n2.feladat");
		
		System.out.print("Adja meg az ismétlendõ szöveget: ");
		String stringToRepeat = scObj.nextLine();
		System.out.print("Adja meg, hányszor leyen ismételve a szöveg: ");
		int timesToRepeat = Integer.parseInt(scObj.nextLine());
		
		for (int i = 0; i < timesToRepeat; i++) {
			System.out.println((i + 1) + ": " + stringToRepeat);
		}
			
		//3. feladat Kérjünk be 10 db egész számot ,amdj mindegyikrõl mondjuk meg külön-külön
		//hogy osztaható e hárommal
		System.out.println("\n3. feladat");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Kérem adjon meg egy számot: ");
			int szamBekert = Integer.parseInt(scObj.nextLine());
			if (szamBekert % 3 == 0 ) {
				System.out.println("Osztható hárommal.");
			} else {
				System.out.println("Nem osztható hárommal.");
			}
			
		}
			
			//HF 4. 10-tõl visszafelé 1-ig egymás mellé szóközzel elválasztva írjuk ki a számokat
		System.out.println("\n4. feladat: ");
		
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
			
		}
			
			//HF 5. feladat: Kérünk be egy kezdõ és egy végértéket, majd írjuk ki a két érték 
			//között a hárommal és néggyel maradék nélkül osztható számokat (egymás mellé szóközzel)
		
		System.out.println("\n5. feladat");
		
		System.out.print("Kérem, adja meg a kezdõértéket: ");
		int startValue = Integer.parseInt(scObj.nextLine());
		System.out.print("Kérem, adja meg a végértéket: ");
		int endValue = Integer.parseInt(scObj.nextLine());
		System.out.print("A " + startValue + " és " + endValue + " között 3-al és 4-el osztható számok: ");
		
		for (int i = startValue; i <= endValue; i++) {
			
			if (i % 4 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		scObj.close();

	}


}

		
	


