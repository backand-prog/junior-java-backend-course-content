package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Egy p�nzt�ros a napi bev�tel�nek 5%-�t megkapja jutalomk�nt. K�rd be a napi bev�telt, �s �rd a
k�perny�re, hogy mennyi a jutalom! A jutalmat kerek�tsd eg�sz �rt�kre!
 */

public class _38penztaros {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem adja meg a napi bev�telt: ");
		double dailyIncome = Integer.parseInt(br.readLine());
		double workerShare = Math.ceil((dailyIncome / 100) * 5);
		
		System.out.println("A napi bev�tel " + (int)dailyIncome + " forint, amib�l p�nt�ros jutalma: " + (int)workerShare + " forint.");
		
		br.close();
		
	}

}
