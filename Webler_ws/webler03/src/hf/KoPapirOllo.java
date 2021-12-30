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
			System.out.println("Szeretn�l m�g egy k�rt j�tszani? (Kil�p�s: q karakter be�r�sa)");
			try {
				playAgain = br.readLine();
			} catch (IOException e) {
				System.out.println("Input/Output hiba.");
			}
			
		} while (!(playAgain.equals("q")));
		
		System.out.println("A V�GEREDM�NY:");
		printScore(outcomes);
		

	}

	public static int[] chooseWeapons() {
		//A j�t�kos fegyver�nek kiv�laszt�sa
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Add meg, hogy milyen fegyverrel szeretn�l lenni (�rd be a sz�m�t): ");
		System.out.println("K�: 1 - Pap�r: 2 - Oll� - 3");
		
		//Ebben az arrayben lesz a k�t fegyver sz�ma
		int[] weapons = new int[2];
		
		//J�t�kos fegyvernem�nek bek�r�se
		int userWeapon = 0;
		while ( !((userWeapon == 1) || (userWeapon == 2) || (userWeapon == 3)) ) {
			
			try {
				
				userWeapon = Integer.parseInt(br.readLine());
				if (userWeapon != 1 && userWeapon != 2 && userWeapon != 3) {
					System.out.println("Nem j� sz�mot adt�l meg, 1-3 k�z�tt kell megadni.");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Nem sz�mot, vagy nem eg�sz sz�mot adt�l meg.");
				
			} catch (IOException e) {
				System.out.println("Input/Output hiba t�rt�nt.");
			}
			
		}
		weapons[0] = userWeapon;
		
		//G�p fegyvernem�nek bek�r�se
		Random r = new Random();
		
		weapons[1] = r.nextInt(3) + 1;
		
		System.out.println();
		
//a j�t�kos fegyver�nek ki�r�sa
		switch (weapons[0]) {
			case 1: System.out.println("A j�t�kos K�VET v�lasztott!");
				break;
			case 2: System.out.println("A j�t�kos PAP�RT v�lasztott!");
				break;
			case 3: System.out.println("A j�t�kos OLL�T v�lasztott!");
				break;
			default:
				break;
				}
				
		//a g�p fegyver�nek ki�r�sa
		switch (weapons[1]) {
			case 1: System.out.println("A g�p K�VET v�lasztott!");
				break;
			case 2: System.out.println("A g�p PAP�RT v�lasztott!");
				break;
			case 3: System.out.println("A g�p OLL�T v�lasztott!");
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
		//a t�mb els� �rt�ke t�rolja a d�ntetleneket, a m�sodik a j�t�kos
		//gy�zelmeit, a harmadik a g�p gy�zelmeit
		
		
		
		int differenceModulo = (choices[0] + 3 - choices[1]) % 3;
		if (differenceModulo == 0) {
			outcomes[0]++;
			System.out.println("D�NTETLEN");
		} else if (differenceModulo == 1) {
			outcomes[1]++;
			System.out.println("A J�T�KOS NYERT");
		} else if (differenceModulo == 2) {
			outcomes[2]++;
			System.out.println("A G�P NYERT");
		}
		
		return outcomes;
	}
	
	
	public static void	printScore (int[] outcomes) {
		System.out.println("D�ntetlenek: " + outcomes[0] + ", J�t�kos gy�zelmek: " + outcomes[1] +
		", G�p gy�zelmek: " + outcomes[2]);
		
		
	}
	

	
	
}