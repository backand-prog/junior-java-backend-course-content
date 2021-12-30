package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * �rjunk programot, amely bek�ri egy k�r sugar�t, majd kisz�molja a k�r ker�let�t �s ter�let�t!
 * K = 2 * r * pi
 * T = r*r * pi
 */

public class _04kor_ker_ter {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		//SCANNER
		Scanner sc = new Scanner(System.in);
		System.out.print("Add meg a k�r sugar�t!");
		double r = sc.nextDouble();
		
		double K = 2 * r * Math.PI;
		double T = Math.pow(r, 2) * Math.PI;
		System.out.println("A k�r ker�lete: " + K + "\nA k�r ter�lete: " + T);
		
		
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nAdd meg a k�r sugar�t (BufferedReader)");
		double rbr = Double.parseDouble(br.readLine());
		
		double Kbr = 2 * rbr * Math.PI;
		double Tbr = Math.pow(rbr, 2) * Math.PI;
		
		System.out.println("A k�r ker�lete: " + Kbr + "\nA k�r ter�lete: " + Tbr);		
		
		sc.close();
		br.close();
		
	}

}