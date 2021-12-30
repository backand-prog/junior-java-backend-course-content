package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 
 * K�rj�k be a felhaszn�l�t�l a napi v�zfogyaszt�s�t! D�nts�k el, hogy el�g vizet ivott �e (aj�nlott
bevitel min. 3 liter)! (vizfogyasztas_3liter)
 */

public class _08vizfogyasztas {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Scanner

		Scanner sc = new Scanner(System.in);
		
		System.out.print("K�rem adja meg a napi v�zfogyaszt�s�t literben!");
		int vizfogyasztas = Integer.parseInt(sc.nextLine());
		
		if (vizfogyasztas >= 3) {
			System.out.println("Az elfogyasztott v�zmennyis�g elegend�!");
		} else {
			System.out.println("�n nem elegend� v�zmennyis�get fogyaszt. A javasolt napi v�zbevitel minimum 3 liter.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nA feladat megold�sa BufferedReaderrel");
		System.out.print("K�rem adja meg a napi v�zfogyaszt�s�t literben!");
		
		int vizfogyasztas2 = Integer.parseInt(br.readLine());
		
		if (vizfogyasztas2 >= 3) {
			System.out.println("Az elfogyasztott v�zmennyis�g elegend�!");
		} else {
			System.out.println("�n nem elegend� v�zmennyis�get fogyaszt. A javasolt napi v�zbevitel minimum 3 liter.");
		}
		
		sc.close();
		br.close();
	}

}
