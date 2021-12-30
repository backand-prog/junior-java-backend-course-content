package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * K�rd be a t�glalap k�t oldal�t �s �rd ki a ker�let�t, ter�let�t! (teglap_ter_ker)
 * K = 2 * (a + b)
 * T = a * b
 */

public class _03teglap_ter_ker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//SCANNER
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Add meg a t�glalap egyik oldal�t (a):");
		double a = sc.nextDouble();
		System.out.print("Add meg a t�glalap m�sik oldal�t (b):");
		double b = sc.nextDouble();
		
		double K = 2 * (a + b);
		double T = a * b;
		
		System.out.println("A t�glalap ker�lete :" + (int)K + "\nA t�glalap ter�lete: " + (int)T);
		
		//BufferedReader
		System.out.println("\nFeladat megold�sa BufferedReaderrel");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Add meg a t�glalap egyik oldal�t (abr):");
		double abr = Double.parseDouble(br.readLine());
		System.out.print("Add meg a t�glalap egyik oldal�t (bbr):");
		double bbr = Double.parseDouble(br.readLine());
		
		double Kbr = 2 * (abr + bbr);
		double Tbr = abr * bbr;
		
		System.out.println("A t�glalap ker�lete " + (int)Kbr + "\nA t�glalap ter�lete: " + (int)Tbr);
			
		sc.close();
		br.close();
		
	}

}
