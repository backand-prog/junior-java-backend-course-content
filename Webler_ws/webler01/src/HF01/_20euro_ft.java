package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programunk k�rje be az Eur� �rfolyam�t (1 � h�ny Ft-ot �r), majd azt, hogy h�ny eur�t akarunk
�tv�ltani Ft-ba, majd �rja ki, hogy h�ny Ft az �tv�ltott eur�.
 */
public class _20euro_ft {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem �rja be az Euro jelenlegi �rfolyam�t!");
		double euroToForint = Double.parseDouble(br.readLine());
		System.out.print("K�rem �rja be, hogy h�ny Eur�t szeretne Forintra v�ltani: ");
		double euro = Double.parseDouble(br.readLine());
		
		double changeEuToFt = euro * euroToForint;
				
		System.out.println("Az �n �ltal be�rt Euro �rt�ke: " + (int)changeEuToFt + " Forint");
			
		
	}

}
