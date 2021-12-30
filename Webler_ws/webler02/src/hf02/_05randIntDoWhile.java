package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05randIntDoWhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = 0;
		do {
			System.out.print("Adjon meg egy számot: ");
			number = Integer.parseInt(br.readLine());
			if (number % 3 == 0 && number % 4 == 0) {
				System.out.println("A megadott szám (" + (number) + ") osztható 4-el és 3-al.");
			} else {
				System.out.print("A megadott szám (" + (number) + ") nem osztható 4-el és 3-al. ");
			}
		} while (number % 3 != 0 || number % 4 != 0);
		
	}

}
