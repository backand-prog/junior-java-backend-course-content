package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * K�rdezz�k meg a felhaszn�l�t h�ny kock�val szeretne dobni (hagyom�nyos 6 oldal�), majd �rjunk ki
5 lehets�ges dob�s eredm�ny�t a megadott kockasz�mmal!
 */


public class _35kockaDobas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		
		
		System.out.print("H�ny kock�val szeretne dobni? ");
		int rollNum = Integer.parseInt(br.readLine());
	
		
		for (int i = 1; i < 6; i++) {
			
			int roll =  rollNum * (r.nextInt(6) + 1);
			System.out.println(i + ". dob�s: " + roll);
			
		}
		
		br.close();
		
		/* itt egy kicsit f�lre�rtettem a feladatot els�re, ki�rattam minden egyes dob�st
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < rollNum + 1; j++) {
				System.out.print(i + ". k�r " + j + ". kocka: ");
				System.out.println(r.nextInt(6) + 1);
			}
		}
		
		System.out.println("A kockadob�s befejez�d�tt.");
		
		*/
		
		
		
	}

}
