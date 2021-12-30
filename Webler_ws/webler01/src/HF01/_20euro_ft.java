package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programunk kérje be az Euró árfolyamát (1 € hány Ft-ot ér), majd azt, hogy hány eurót akarunk
átváltani Ft-ba, majd írja ki, hogy hány Ft az átváltott euró.
 */
public class _20euro_ft {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem írja be az Euro jelenlegi árfolyamát!");
		double euroToForint = Double.parseDouble(br.readLine());
		System.out.print("Kérem írja be, hogy hány Eurót szeretne Forintra váltani: ");
		double euro = Double.parseDouble(br.readLine());
		
		double changeEuToFt = euro * euroToForint;
				
		System.out.println("Az Ön által beírt Euro értéke: " + (int)changeEuToFt + " Forint");
			
		
	}

}
