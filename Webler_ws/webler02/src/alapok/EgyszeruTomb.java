package alapok;

import java.util.Random;
import java.util.Scanner;

public class EgyszeruTomb {

	public static void main(String[] args) {
		/*
		 * Tömb: összetett adattípus
		 * több azonos típusú elem tárolására alkalmas
		 * az elemeket a töb nevével és indexével tudjuk elérni
		 * Fontos kötöttség a tömböknél: létrehozáskor meg kell méretét és típusát
		 * inexelés 0-tól kezdõdik
		 * egydimenziós tömb - vektor
		 */
		
		int[] tomb = {3, 6, 77, 22, 98};
		System.out.println(tomb[2]); //77
		System.out.println(tomb[3]); //22
		tomb[0] = 1;
		System.out.println(0); //1
		//A tömbön belül egey olyan elemre hivatkozol, ami nincs
		// System.out.println(tomb[5]); //ArrayIndexOutOfBounds
		System.out.println("A tömb mérete: " + tomb.length);
		
		//a tömb utolsó elemének elérése
		System.out.println("A tömb utolsó eleme: " + tomb[tomb.length-1]);
		
		//üres 20 db egész szám tárolására alkalmas tömb létrehozása
		int[] tombUres = new int[20];
		System.out.println(tombUres[3]);
		
		//írjuk ki a tömb elemeit egymás mellé
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(tomb[i] + " ");
		}
		System.out.println();
		//string tömb
		String[] nevek = {"Elek", "János", "Tamás"};
		System.out.println(nevek[2]); //Tamás;
		
		char[] karakterek = {'g', 'r','w'};
		System.out.println(karakterek[1]);
		System.out.println();
		
		//1. feladat: 20 elemû tömb felöltése véletlen számokkal 1-100 között
		//írjuk ki a tömb elemeit egymás mellé!
		System.out.println("1. feladat");
		int[] tombVeletlen = new int[20];
		Random r = new Random();
		
		
		//tömb feltöltése véletlen számokkal
		//az i-t használva be tudjuk járni a tömböt
		for (int i = 0; i < tombVeletlen.length; i++) {
			tombVeletlen[i] = r.nextInt(100)+1;
		}
		
		//töm elemeinek kiírása FOR ciklussal
		System.out.println("A véletlen tömb elemei: ");
		for (int i = 0; i < tombVeletlen.length; i++) {
			System.out.print(tombVeletlen[i] + " ");
		}
		
		//tömb elemeinek kiírás FOREACH szerkezettel
		//nem foglalkozik az indexeléssel, bejárja az adatszerkezetet
		//ciklusválozó item - felvesz mindenegyes éréket a tömbön belül (egymás után)
		System.out.println("\nA véletlen tömb elemei: (FOREACH) ");
		for (int item:tombVeletlen) {
			System.out.print(item + " ");
		}
		//2. feladat: 5. elemû tömb feltöltése a felhasználótól érkezõ adatokkal
		//Tájékoztassukl a felhasználót arról, hogy melyik értéket várjuk!
		System.out.println("\n\nMásodik feladat");
		
		Scanner sc = new Scanner(System.in);
		int[] tomb2 = new int[5];
		for (int i = 0; i < tomb2.length; i++) {
			System.out.print("Add meg az " + (i + 1) + "/5. egész számot számot: ");
			tomb2[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		sc.close();
				
	}

}


