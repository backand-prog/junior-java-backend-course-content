package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Írjunk programot, amely bekéri egy kör sugarát, majd kiszámolja a kör kerületét és területét!
 * K = 2 * r * pi
 * T = r*r * pi
 */

public class _04kor_ker_ter {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		//SCANNER
		Scanner sc = new Scanner(System.in);
		System.out.print("Add meg a kör sugarát!");
		double r = sc.nextDouble();
		
		double K = 2 * r * Math.PI;
		double T = Math.pow(r, 2) * Math.PI;
		System.out.println("A kör kerülete: " + K + "\nA kör területe: " + T);
		
		
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nAdd meg a kör sugarát (BufferedReader)");
		double rbr = Double.parseDouble(br.readLine());
		
		double Kbr = 2 * rbr * Math.PI;
		double Tbr = Math.pow(rbr, 2) * Math.PI;
		
		System.out.println("A kör kerülete: " + Kbr + "\nA kör területe: " + Tbr);		
		
		sc.close();
		br.close();
		
	}

}