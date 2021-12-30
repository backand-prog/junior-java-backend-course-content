package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * K�rj be 3 eg�sz sz�mot, majd �rd ki az �tlagukat! (atlag_harom)
 */

public class _07atlag_harom {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		//Scanner
		System.out.print("Add meg az els� sz�mot: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Add meg a m�sodik sz�mot: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("Add meg a harmadik sz�mot: ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		double avg = (double)(num1 + num2 + num3) / 3;
		
		System.out.println("A h�rom sz�m �tlaga: " + avg);
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nSz�m�t�s BufferedReaderrel");
		
		System.out.print("Add meg az els� sz�mot: ");
		int num4 = Integer.parseInt(br.readLine());
		System.out.print("Add meg a m�sodik sz�mot: ");
		int num5 = Integer.parseInt(br.readLine());
		System.out.print("Add meg a harmadik sz�mot: ");
		int num6 = Integer.parseInt(br.readLine());
		
		double avg2 = (double)(num4 + num5 + num6) / 3;
		
		System.out.println("A h�rom sz�m �tlaga: " + avg2);
		
		sc.close();
		br.close();
		
	}

}
