package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Írjunk programot a Pitagorasz-tétel alkalmazására! A program kérje be egy derékszögû
háromszög két befogóját, és számítsa ki az átfogó hosszát! (pitagorasz)
*/

public class _01pitagorasz {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scannerrel
		Scanner sc = new Scanner(System.in);
		
		//az elsõ befogó bekérése, mint a
		System.out.println("Scannerrel való számítás:");
		System.out.print("Kérem a derékszögû háromszög elsõ befogóját!");
		double a = sc.nextDouble();
		
		//a második befogó bekérése, mint b
		System.out.print("Kérem a derékszögû háromszög második befogóját!");
		double b = sc.nextDouble();
		
		//az átfogó kiszámítása, mint c
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		//a bekért értékek, majd az eredmény eredmény kiírása
		System.out.println("Az 'a' befogó :" + a + ".\nA 'b' befogó érétéke: " + b +
				".\nAz átfogó értéke: " + c + ".");
		

		//Beolvasás BufferedReader-el
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//az elsõ befogó bekérése, mint abr
		System.out.println("\nBufferedReaderrel való számítás:");
		System.out.print("Adja meg a derékszögû háromszög elsõ befogóját!");
		double abr = Double.parseDouble(br.readLine());
		
		//a második befogó bekérése, mint bbr
		System.out.print("Adja meg a derékszögû háromszög második befogóját!");
		double bbr = Double.parseDouble(br.readLine());
		
		//az átfogó kiszámítása, mint cbr
		double cbr = Math.sqrt(Math.pow(abr, 2) + Math.pow(bbr, 2));
		
		//a bekért értékek, majd az eredmény eredmény kiírása
		System.out.println("(BufferedReader) Az 'a' befogó :" + abr + ".\nA 'b' befogó érétéke: " + bbr +
				".\nAz átfogó értéke: " + cbr + ".");
		
		sc.close();
		br.close();
		
	}

}
