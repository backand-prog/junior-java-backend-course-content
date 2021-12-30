package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Kérjük be a felhasználó születési helyét, majd döntsük el, hogy vidéken vagy a fõvárosban
született!
 */

	
public class _24szuletett_fovaros {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg a fõváros nevét: ");
		String Capital = br.readLine();		
		System.out.print("Adja meg a születési helyét: ");
		String UserCapital = br.readLine();
		
		if (Capital.equals(UserCapital)) {
			System.out.println("Ön a fõvárosban született.");
		} else {
			System.out.println("Ön vidéken született.");
		}
		
		br.close();

	}

}
