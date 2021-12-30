package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Készíts programot, mely a hónap sorszáma alapján megadja, melyik évszakba tartozik! Használj
switch-case szerkezetet!
 */
public class _28evszakok {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg a hónap sorszámát! ");
		int monthNum = Integer.parseInt(br.readLine());
		
		switch (monthNum) {
		case 12:
		case 1:
		case 2: System.out.println("Tél");
			break;
		case 3:
		case 4:
		case 5: System.out.println("Tavasz");
			break;
		case 6:
		case 7:
		case 8: System.out.println("Nyár");
			break;
		case 9:
		case 10:
		case 11: System.out.println("Õsz");
			break;
		default: System.out.println("Nem megfelelõ szám, 1-12-ig vannak a hónapok sorszámai.");
			break;
		}
		
		br.close();

	}

}
