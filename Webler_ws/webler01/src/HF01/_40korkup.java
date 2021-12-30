package HF01;
/*
 * Olvasd be egy egyenes k�rk�p sugar�t �s magass�g�t, majd sz�mold ki bel�le a t�rfogat�t �s a
felsz�n�t!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _40korkup {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem adja meg a k�rk�p sugar�t (cm): ");
		double r = Double.parseDouble(br.readLine());
		System.out.print("K�rem adja meg a k�rk�p magass�g�t (cm): ");
		double m = Double.parseDouble(br.readLine());
		
		double Ta = Math.PI * Math.pow(r, 2);
		
		double s = Math.sqrt(Math.pow(r, 2) + Math.pow(m, 2));
		double Tp = Math.PI * r * s;
		
		double V = (Math.PI / 3) * Math.pow(r, 2) * m;
		double A = Ta + Tp;
		

		System.out.println("A k�rk�p t�rfogata: " + V + " k�bcentim�ter.");
		System.out.println("A k�rk�p t�rfogata: " + A + " n�gyzetcentim�ter.");
		
		br. close();
		
	}

}
