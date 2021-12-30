package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KiirasBeolvasas {

	public static void main(String[] args) throws IOException {
		
		//Scanner �s BufferedReader
		//K�l�nbs�g - a BufferedReader �jabb, gyorsabb, t�bb sz�lon m�k�dik. Szinkroniz�lt �s sz�lbiztos
		//A BufferedReaeder k�telez minket a kiv�telkezel�sre
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//sz�veg beolvas�sa Scanner oszt�llyal
		System.out.print("K�rem, adja meg a nev�t: ");
		String beolvasottNev = sc.nextLine();
		System.out.println("A megadott n�v ez volt: " + beolvasottNev);
		
		//eg�sz sz�m beolvas�sa Scanner oszt�llyal, kevert�l�s/parsol�s
		System.out.print("K�rem, adjon meg egy eg�sz sz�mot: ");
		int beolvasottSzam = Integer.parseInt(sc.nextLine());
		System.out.println("A megadott sz�m ez volt: " + beolvasottSzam);
		
		//t�rtsz�m beolvas�sa Scanner oszt�llyal, konvert�l�ssal, parsol�s
		System.out.print("K�rem, adjon meg egy t�rt sz�mot: ");
		double beolvasottTortSzam = Double.parseDouble(sc.nextLine());
		System.out.println("A megadott t�rtsz�m ez volt: " + beolvasottTortSzam);
		
		//BufferedRead objektump�ld�ny l�terhoz�sa
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//sz�veg beolvas�sa BufferedReader seg�ts�g�vel
		System.out.println("k�rem adja meg a nev�t (BufferedReader): ");
		String beolvasottNev2 = br.readLine();
		System.out.println("A beolvasott n�v BufferedReader-rel ez volt: " + beolvasottNev2);
	
		//eg�sz sz�m beolvas�sa BufferedReader seg�ts�g�vel
		System.out.println("k�rem adja meg a kor�t (BufferedReader): ");
		int kor = Integer.parseInt(br.readLine());
		System.out.println("A beolvasott kor ez volt: " + kor);
		
		//minkett�t le kell z�rni
		sc.close();

		br.close();

	}

}