package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Switch-case szerkezettel készíts el a következõ programot! Kérjük be egy nap sorszámát (1..7)
numerikus formában, és írjuk ki a nap megnevezését a képernyõre (hétfõ, kedd, ..., vasárnap).
Amennyiben a beírt sorszám nem 1..7 közötti szám, úgy a „Hibás adat!” kiírás jelenjen meg.
 */
public class _17hetnapjai {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg a hét sorszámát (1-7): ");
		
		int dayNum = Integer.parseInt(br.readLine());
		
		
		switch (dayNum) {
		case 1: System.out.println("Hétfõ");
			break;
		case 2: System.out.println("Kedd");
			break;
		case 3: System.out.println("Szerda");
			break;
		case 4: System.out.println("Csütörtök");
			break;
		case 5: System.out.println("Péntek");
			break;
		case 6: System.out.println("Szombat");
			break;
		case 7: System.out.println("Vasárnap");
			break;
		default: System.out.println("Hibás adat!");
			break;
		}
		
		br.close();

	}

}
