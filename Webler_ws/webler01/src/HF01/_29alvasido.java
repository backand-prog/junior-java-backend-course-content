package HF01;

/*
 * Olvasd be, hogy a felhasználó átlagosan hány órát alszik naponta (egész számként), és jellemezd
az alvásidejét a következõ módon: 0-6 óráig kevés, 7-9 óráig átlagos, 10-12 óráig sok, 13-24 óráig
nagyon sok!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29alvasido {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg, hány órát alszik naponta: ");
		int sleepHours = Integer.parseInt(br.readLine());
		
		if (sleepHours > 0 && sleepHours < 7 ) {
			System.out.println("Kevés");
		} else if (sleepHours >= 7 && sleepHours < 9) {
			System.out.println("Átlagos");
		} else if (sleepHours >= 10 && sleepHours < 12) {
			System.out.println("Sok");
		} else if (sleepHours >= 12 && sleepHours < 25) {
			System.out.println("Nagyon sok");
		} else {
			System.out.println("Nem megfelelõ adat. 0 és 24 között egész számokat kell megadni");
		}
		
	}

}
