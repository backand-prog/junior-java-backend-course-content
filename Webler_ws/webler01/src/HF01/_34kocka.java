package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Hozzunk létre alkalmazást, amely kiszámolja a kocka felszínét és térfogatát!
* V = a3
* A = 6 * a2
*
*/

public class _34kocka {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kérem adja meg a kocka oldalát (cm): ");
		double a = Double.parseDouble(br.readLine());
		
		double V = Math.pow(a, 3); 
		double A = 6 * Math.pow(a, 2);
		
		System.out.println("A kocka térfogata: " + V + " köbcentiméter.\nA kocka felszíne: " + A + " négyzetcentiméter.");
		
		br.close();
		

	}

}
