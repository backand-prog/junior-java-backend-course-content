package alapok;

import java.util.Random;
import java.util.Scanner;

public class EgyszeruTomb {

	public static void main(String[] args) {
		/*
		 * T�mb: �sszetett adatt�pus
		 * t�bb azonos t�pus� elem t�rol�s�ra alkalmas
		 * az elemeket a t�b nev�vel �s index�vel tudjuk el�rni
		 * Fontos k�t�tts�g a t�mb�kn�l: l�trehoz�skor meg kell m�ret�t �s t�pus�t
		 * inexel�s 0-t�l kezd�dik
		 * egydimenzi�s t�mb - vektor
		 */
		
		int[] tomb = {3, 6, 77, 22, 98};
		System.out.println(tomb[2]); //77
		System.out.println(tomb[3]); //22
		tomb[0] = 1;
		System.out.println(0); //1
		//A t�mb�n bel�l egey olyan elemre hivatkozol, ami nincs
		// System.out.println(tomb[5]); //ArrayIndexOutOfBounds
		System.out.println("A t�mb m�rete: " + tomb.length);
		
		//a t�mb utols� elem�nek el�r�se
		System.out.println("A t�mb utols� eleme: " + tomb[tomb.length-1]);
		
		//�res 20 db eg�sz sz�m t�rol�s�ra alkalmas t�mb l�trehoz�sa
		int[] tombUres = new int[20];
		System.out.println(tombUres[3]);
		
		//�rjuk ki a t�mb elemeit egym�s mell�
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(tomb[i] + " ");
		}
		System.out.println();
		//string t�mb
		String[] nevek = {"Elek", "J�nos", "Tam�s"};
		System.out.println(nevek[2]); //Tam�s;
		
		char[] karakterek = {'g', 'r','w'};
		System.out.println(karakterek[1]);
		System.out.println();
		
		//1. feladat: 20 elem� t�mb fel�lt�se v�letlen sz�mokkal 1-100 k�z�tt
		//�rjuk ki a t�mb elemeit egym�s mell�!
		System.out.println("1. feladat");
		int[] tombVeletlen = new int[20];
		Random r = new Random();
		
		
		//t�mb felt�lt�se v�letlen sz�mokkal
		//az i-t haszn�lva be tudjuk j�rni a t�mb�t
		for (int i = 0; i < tombVeletlen.length; i++) {
			tombVeletlen[i] = r.nextInt(100)+1;
		}
		
		//t�m elemeinek ki�r�sa FOR ciklussal
		System.out.println("A v�letlen t�mb elemei: ");
		for (int i = 0; i < tombVeletlen.length; i++) {
			System.out.print(tombVeletlen[i] + " ");
		}
		
		//t�mb elemeinek ki�r�s FOREACH szerkezettel
		//nem foglalkozik az indexel�ssel, bej�rja az adatszerkezetet
		//ciklusv�loz� item - felvesz mindenegyes �r�ket a t�mb�n bel�l (egym�s ut�n)
		System.out.println("\nA v�letlen t�mb elemei: (FOREACH) ");
		for (int item:tombVeletlen) {
			System.out.print(item + " ");
		}
		//2. feladat: 5. elem� t�mb felt�lt�se a felhaszn�l�t�l �rkez� adatokkal
		//T�j�koztassukl a felhaszn�l�t arr�l, hogy melyik �rt�ket v�rjuk!
		System.out.println("\n\nM�sodik feladat");
		
		Scanner sc = new Scanner(System.in);
		int[] tomb2 = new int[5];
		for (int i = 0; i < tomb2.length; i++) {
			System.out.print("Add meg az " + (i + 1) + "/5. eg�sz sz�mot sz�mot: ");
			tomb2[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		sc.close();
				
	}

}


