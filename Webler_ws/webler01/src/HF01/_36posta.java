package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A postai küldeményeket súlyuk alapján árazzák (2 kg-ig 475 Ft, 20 kg-ig 3395 Ft, 40 kg-ig 6415 Ft).
Készíts alkalmazást, ami bekéri a küldemény súlyát, majd kiírja a fizetendõ összeget! 40 kg felett írja
ki, hogy nem vállal a posta súlyos küldemény kézbesítését!
*/

public class _36posta {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem adja meg, hány kg-os küldeményt kíván felpostázni: ");
		int packageWeight = Integer.parseInt(br.readLine());
		
		if (packageWeight < 1) {
			System.out.println("0 és negatív érték nem értelmezhetõ.");
		} else if (packageWeight < 3) {
			System.out.println("A postázás ára 475 Ft.");
		} else if (packageWeight < 21) {
			System.out.println("A postázás ára 3995 Ft.");
		} else if (packageWeight < 41) {
			System.out.println("A postázás ára 6415 Ft.");
		} else {
			System.out.println("A posta nem vállalja súlyos kézbesítését.");
		}
		
		br.close();
		
	}

}
