package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Switch-case szerkezettel k�sz�ts el a k�vetkez� programot! K�rj�k be egy nap sorsz�m�t (1..7)
numerikus form�ban, �s �rjuk ki a nap megnevez�s�t a k�perny�re (h�tf�, kedd, ..., vas�rnap).
Amennyiben a be�rt sorsz�m nem 1..7 k�z�tti sz�m, �gy a �Hib�s adat!� ki�r�s jelenjen meg.
 */
public class _17hetnapjai {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg a h�t sorsz�m�t (1-7): ");
		
		int dayNum = Integer.parseInt(br.readLine());
		
		
		switch (dayNum) {
		case 1: System.out.println("H�tf�");
			break;
		case 2: System.out.println("Kedd");
			break;
		case 3: System.out.println("Szerda");
			break;
		case 4: System.out.println("Cs�t�rt�k");
			break;
		case 5: System.out.println("P�ntek");
			break;
		case 6: System.out.println("Szombat");
			break;
		case 7: System.out.println("Vas�rnap");
			break;
		default: System.out.println("Hib�s adat!");
			break;
		}
		
		br.close();

	}

}
