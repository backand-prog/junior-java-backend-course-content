package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Kérdezzük meg a felhasználót hány kockával szeretne dobni (hagyományos 6 oldalú), majd írjunk ki
5 lehetséges dobás eredményét a megadott kockaszámmal!
 */


public class _35kockaDobas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		
		
		System.out.print("Hány kockával szeretne dobni? ");
		int rollNum = Integer.parseInt(br.readLine());
	
		
		for (int i = 1; i < 6; i++) {
			
			int roll =  rollNum * (r.nextInt(6) + 1);
			System.out.println(i + ". dobás: " + roll);
			
		}
		
		br.close();
		
		/* itt egy kicsit félreértettem a feladatot elsõre, kiírattam minden egyes dobást
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < rollNum + 1; j++) {
				System.out.print(i + ". kör " + j + ". kocka: ");
				System.out.println(r.nextInt(6) + 1);
			}
		}
		
		System.out.println("A kockadobás befejezõdött.");
		
		*/
		
		
		
	}

}
