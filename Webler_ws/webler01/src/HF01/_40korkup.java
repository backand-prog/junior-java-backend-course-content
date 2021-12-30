package HF01;
/*
 * Olvasd be egy egyenes körkúp sugarát és magasságát, majd számold ki belõle a térfogatát és a
felszínét!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _40korkup {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem adja meg a körkúp sugarát (cm): ");
		double r = Double.parseDouble(br.readLine());
		System.out.print("Kérem adja meg a körkúp magasságát (cm): ");
		double m = Double.parseDouble(br.readLine());
		
		double Ta = Math.PI * Math.pow(r, 2);
		
		double s = Math.sqrt(Math.pow(r, 2) + Math.pow(m, 2));
		double Tp = Math.PI * r * s;
		
		double V = (Math.PI / 3) * Math.pow(r, 2) * m;
		double A = Ta + Tp;
		

		System.out.println("A körkúp térfogata: " + V + " köbcentiméter.");
		System.out.println("A körkúp térfogata: " + A + " négyzetcentiméter.");
		
		br. close();
		
	}

}
