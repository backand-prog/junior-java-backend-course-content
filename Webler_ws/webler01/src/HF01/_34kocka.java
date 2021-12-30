package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Hozzunk l�tre alkalmaz�st, amely kisz�molja a kocka felsz�n�t �s t�rfogat�t!
* V = a3
* A = 6 * a2
*
*/

public class _34kocka {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("K�rem adja meg a kocka oldal�t (cm): ");
		double a = Double.parseDouble(br.readLine());
		
		double V = Math.pow(a, 3); 
		double A = 6 * Math.pow(a, 2);
		
		System.out.println("A kocka t�rfogata: " + V + " k�bcentim�ter.\nA kocka felsz�ne: " + A + " n�gyzetcentim�ter.");
		
		br.close();
		

	}

}
