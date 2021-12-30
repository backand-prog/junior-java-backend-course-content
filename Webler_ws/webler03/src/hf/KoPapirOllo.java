package hf;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class KoPapirOllo {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] outcomes = outcomes();
		String playAgain = "y";
		
		do {
			
			outcomes = battle(chooseWeapons(), outcomes);
			printScore(outcomes);
			System.out.println();
			System.out.println("Szeretnél még egy kört játszani? (Kilépés: q karakter beírása)");
			try {
				playAgain = br.readLine();
			} catch (IOException e) {
				System.out.println("Input/Output hiba.");
			}
			
		} while (!(playAgain.equals("q")));
		
		System.out.println("A VÉGEREDMÉNY:");
		printScore(outcomes);
		

	}

	public static int[] chooseWeapons() {
		//A játékos fegyverének kiválasztása
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Add meg, hogy milyen fegyverrel szeretnél lenni (írd be a számát): ");
		System.out.println("Kõ: 1 - Papír: 2 - Olló - 3");
		
		//Ebben az arrayben lesz a két fegyver száma
		int[] weapons = new int[2];
		
		//Játékos fegyvernemének bekérése
		int userWeapon = 0;
		while ( !((userWeapon == 1) || (userWeapon == 2) || (userWeapon == 3)) ) {
			
			try {
				
				userWeapon = Integer.parseInt(br.readLine());
				if (userWeapon != 1 && userWeapon != 2 && userWeapon != 3) {
					System.out.println("Nem jó számot adtál meg, 1-3 között kell megadni.");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Nem számot, vagy nem egész számot adtál meg.");
				
			} catch (IOException e) {
				System.out.println("Input/Output hiba történt.");
			}
			
		}
		weapons[0] = userWeapon;
		
		//Gép fegyvernemének bekérése
		Random r = new Random();
		
		weapons[1] = r.nextInt(3) + 1;
		
		System.out.println();
		
//a játékos fegyverének kiírása
		switch (weapons[0]) {
			case 1: System.out.println("A játékos KÖVET választott!");
				break;
			case 2: System.out.println("A játékos PAPÍRT választott!");
				break;
			case 3: System.out.println("A játékos OLLÓT választott!");
				break;
			default:
				break;
				}
				
		//a gép fegyverének kiírása
		switch (weapons[1]) {
			case 1: System.out.println("A gép KÖVET választott!");
				break;
			case 2: System.out.println("A gép PAPÍRT választott!");
				break;
			case 3: System.out.println("A gép OLLÓT választott!");
				break;
			default:
				break;
			}
		
		return weapons;
		
		
		}
	
	public static int[] outcomes() {

			int[] outcomes = {0,0,0};
			
			return outcomes;
			
	}
	
		
	
	
	public static int[] battle(int[] choices, int[] outcomes) {
		//a tömb elsõ értéke tárolja a döntetleneket, a második a játékos
		//gyõzelmeit, a harmadik a gép gyõzelmeit
		
		
		
		int differenceModulo = (choices[0] + 3 - choices[1]) % 3;
		if (differenceModulo == 0) {
			outcomes[0]++;
			System.out.println("DÖNTETLEN");
		} else if (differenceModulo == 1) {
			outcomes[1]++;
			System.out.println("A JÁTÉKOS NYERT");
		} else if (differenceModulo == 2) {
			outcomes[2]++;
			System.out.println("A GÉP NYERT");
		}
		
		return outcomes;
	}
	
	
	public static void	printScore (int[] outcomes) {
		System.out.println("Döntetlenek: " + outcomes[0] + ", Játékos gyõzelmek: " + outcomes[1] +
		", Gép gyõzelmek: " + outcomes[2]);
		
		
	}
	

	
	
}