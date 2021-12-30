package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Kérd be a téglalap két oldalát és írd ki a kerületét, területét! (teglap_ter_ker)
 * K = 2 * (a + b)
 * T = a * b
 */

public class _03teglap_ter_ker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Add meg a téglalap egyik oldalát (a):");
		double a = sc.nextDouble();
		System.out.print("Add meg a téglalap másik oldalát (b):");
		double b = sc.nextDouble();
		
		double K = 2 * (a + b);
		double T = a * b;
		
		System.out.println("A téglalap kerülete :" + (int)K + "\nA téglalap területe: " + (int)T);
		
		//BufferedReader
		System.out.println("\nFeladat megoldása BufferedReaderrel");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg a téglalap egyik oldalát (abr):");
		double abr = Double.parseDouble(br.readLine());
		System.out.print("Add meg a téglalap egyik oldalát (bbr):");
		double bbr = Double.parseDouble(br.readLine());
		
		double Kbr = 2 * (abr + bbr);
		double Tbr = abr * bbr;
		
		System.out.println("A téglalap kerülete " + (int)Kbr + "\nA téglalap területe: " + (int)Tbr);
			
		sc.close();
		br.close();
		
	}

}
