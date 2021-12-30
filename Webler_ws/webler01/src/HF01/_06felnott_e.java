package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Kérjük be a felhasználó életkorát, 
 * majd döntsük el, hogy felnõtt –e (18 éves kortól már felnõtt)! 
 */
public class _06felnott_e {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem adja meg az életkorát: ");
		int age = Integer.parseInt(br.readLine());
		
		if (age < 0) {
			System.out.println("Negatív szám nem értelmezhetõ életkornál.");
		} else if (age < 18) {
			System.out.println("Nem felnõtt");
		} else {
			System.out.println("Felnõtt");
		}
		
		br.close();
		
	}

}
