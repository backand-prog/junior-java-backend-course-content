package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
�rjunk programot a Pitagorasz-t�tel alkalmaz�s�ra! A program k�rje be egy der�ksz�g�
h�romsz�g k�t befog�j�t, �s sz�m�tsa ki az �tfog� hossz�t! (pitagorasz)
*/

public class _01pitagorasz {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scannerrel
		Scanner sc = new Scanner(System.in);
		
		//az els� befog� bek�r�se, mint a
		System.out.println("Scannerrel val� sz�m�t�s:");
		System.out.print("K�rem a der�ksz�g� h�romsz�g els� befog�j�t!");
		double a = sc.nextDouble();
		
		//a m�sodik befog� bek�r�se, mint b
		System.out.print("K�rem a der�ksz�g� h�romsz�g m�sodik befog�j�t!");
		double b = sc.nextDouble();
		
		//az �tfog� kisz�m�t�sa, mint c
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		//a bek�rt �rt�kek, majd az eredm�ny eredm�ny ki�r�sa
		System.out.println("Az 'a' befog� :" + a + ".\nA 'b' befog� �r�t�ke: " + b +
				".\nAz �tfog� �rt�ke: " + c + ".");
		

		//Beolvas�s BufferedReader-el
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//az els� befog� bek�r�se, mint abr
		System.out.println("\nBufferedReaderrel val� sz�m�t�s:");
		System.out.print("Adja meg a der�ksz�g� h�romsz�g els� befog�j�t!");
		double abr = Double.parseDouble(br.readLine());
		
		//a m�sodik befog� bek�r�se, mint bbr
		System.out.print("Adja meg a der�ksz�g� h�romsz�g m�sodik befog�j�t!");
		double bbr = Double.parseDouble(br.readLine());
		
		//az �tfog� kisz�m�t�sa, mint cbr
		double cbr = Math.sqrt(Math.pow(abr, 2) + Math.pow(bbr, 2));
		
		//a bek�rt �rt�kek, majd az eredm�ny eredm�ny ki�r�sa
		System.out.println("(BufferedReader) Az 'a' befog� :" + abr + ".\nA 'b' befog� �r�t�ke: " + bbr +
				".\nAz �tfog� �rt�ke: " + cbr + ".");
		
		sc.close();
		br.close();
		
	}

}
