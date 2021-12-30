package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Egy pénztáros a napi bevételének 5%-át megkapja jutalomként. Kérd be a napi bevételt, és írd a
képernyõre, hogy mennyi a jutalom! A jutalmat kerekítsd egész értékre!
 */

public class _38penztaros {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Kérem adja meg a napi bevételt: ");
		double dailyIncome = Integer.parseInt(br.readLine());
		double workerShare = Math.ceil((dailyIncome / 100) * 5);
		
		System.out.println("A napi bevétel " + (int)dailyIncome + " forint, amibõl péntáros jutalma: " + (int)workerShare + " forint.");
		
		br.close();
		
	}

}
