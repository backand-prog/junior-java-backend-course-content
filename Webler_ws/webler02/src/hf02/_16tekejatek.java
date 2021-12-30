package hf02;

import java.util.Random;

public class _16tekejatek {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//a j�t�kosok dob�saira l�trehozott t�mb
		int playerOneThrows[] = new int[10];
		int playerTwoThrows[] = new int[10];


		//10 k�r tekegur�t�s mindk�t j�t�kosnak
		for (int i = 0; i < playerOneThrows.length; i++) {
			//els� j�t�kos dob�sa
			playerOneThrows[i] = r.nextInt(11) + 0;
			System.out.println("Az els� j�t�kos " + (i + 1) + ". dob�sa: " + playerOneThrows[i]);
			if (playerOneThrows[i] == 10) {
				System.out.println("AZ ELS� J�T�KOS TAROLT!!");
			}
			//m�sodik j�t�kos dob�sa
			playerTwoThrows[i] = r.nextInt(11);
			System.out.println("A m�sodik j�t�kos " + (i + 1) + ". dob�sa: " + playerTwoThrows[i]);
			if (playerTwoThrows[i] == 10) {
				System.out.println("A M�SODIK J�T�KOS TAROLT!!");
			}
			
		}
		
		System.out.println("\nFeladatok:");
		pointsEarned(playerOneThrows, playerTwoThrows);
		declareWinner(playerOneThrows, playerTwoThrows);
		leaderAtHalfTime(playerOneThrows, playerTwoThrows);
		strikes(playerOneThrows, playerTwoThrows);
		checkIfMoreStrikeWon(playerOneThrows, playerTwoThrows);
		
	}
	
	public static void pointsEarned (int[] playerOneThrows, int[]playerTwoThrows) {
		
		int playerOneScore = 0;
		int playerTwoScore = 0;
		
		for (int i = 0; i < playerOneThrows.length; i++) {
			playerOneScore+=playerOneThrows[i];
		}
		
		for (int i = 0; i < playerTwoThrows.length; i++) {
			playerTwoScore+=playerTwoThrows[i];
		}
		
		System.out.println("Az els� j�t�kos eredm�nye: " + playerOneScore);
		System.out.println("A m�sodik j�t�kos eredm�nye: " + playerTwoScore);
		
	}
	
	public static void declareWinner(int[] playerOneThrows, int[]playerTwoThrows) {
		
		int playerOneScore = 0;
		int playerTwoScore = 0;
		
		for (int i = 0; i < playerOneThrows.length; i++) {
			playerOneScore+=playerOneThrows[i];
		}
		
		for (int i = 0; i < playerTwoThrows.length; i++) {
			playerTwoScore+=playerTwoThrows[i];
		}
		
		int diff;
		if (playerOneScore > playerTwoScore) {
			diff = playerOneScore - playerTwoScore;
			System.out.println("Az els� j�t�kos nyert " + diff + " ponttal.");
		} else if (playerTwoScore > playerOneScore) {
			diff = playerTwoScore - playerOneScore;
			System.out.println("A m�sodik j�t�kos nyert " + diff + " ponttal.");
	} else {
		System.out.println("D�ntetlen.");
	}
		
	}
	
	public static void leaderAtHalfTime(int[] playerOneThrows, int[]playerTwoThrows) {
		int playerOneScore = 0;
		int playerTwoScore = 0;
		
		for (int i = 0; i < playerOneThrows.length/2; i++) {
			playerOneScore+=playerOneThrows[i];
		}
		
		for (int i = 0; i < playerTwoThrows.length/2; i++) {
			playerTwoScore+=playerTwoThrows[i];
		}
		
		if (playerOneScore > playerTwoScore) {
			System.out.println("A j�t�k fel�n�l az els� j�t�kos vezetett. (" + playerOneScore + "-" + playerTwoScore + ")");
		} else if (playerTwoScore > playerOneScore) {
			System.out.println("A j�t�k fel�n�l a m�sodik j�t�kos vezetett.(" + playerOneScore + "-" + playerTwoScore + ")");
	} else {
		System.out.println("D�ntetlenre �lltak a j�t�k fel�n�l. (" + playerOneScore + "-" + playerTwoScore + ")");
	}

	}
	
	public static void strikes (int[] playerOneThrows, int[]playerTwoThrows) {
		
		int playerOneStrikes = 0;
		for (int i = 0; i < playerOneThrows.length; i++) {
			if (playerOneThrows[i] == 10) {
				playerOneStrikes++;
			}
		}
		
		int playerTwoStrikes = 0;
		for (int i = 0; i < playerTwoThrows.length; i++) {
			if (playerTwoThrows[i] == 10) {
				playerTwoStrikes++;
			}
		}
		System.out.println("Az els� j�t�kos " + playerOneStrikes + " alkalommal, a m�sodik j�t�kos " + playerTwoStrikes + " alkalommal tarolt.");
		
	}
	
	public static void checkIfMoreStrikeWon (int[] playerOneThrows, int[]playerTwoThrows) {
		
		int playerOneStrikes = 0;
		for (int i = 0; i < playerOneThrows.length; i++) {
			if (playerOneThrows[i] == 10) {
				playerOneStrikes++;
			}
		}
		
		int playerTwoStrikes = 0;
		for (int i = 0; i < playerTwoThrows.length; i++) {
			if (playerTwoThrows[i] == 10) {
				playerTwoStrikes++;
			}
		}
		
		String playerWithMoreStrikes;
		if (playerOneStrikes > playerTwoStrikes) {
			playerWithMoreStrikes = "Els� j�t�kos";
		} else if (playerOneStrikes < playerTwoStrikes) {
			playerWithMoreStrikes = "M�sodik j�t�kos";
		} else {
			playerWithMoreStrikes = "D�ntetlen";
		}
		
		int playerOneScore = 0;
		for (int i = 0; i < playerOneThrows.length; i++) {
			playerOneScore+=playerOneThrows[i];
		}
		
		int playerTwoScore = 0;
		for (int i = 0; i < playerTwoThrows.length; i++) {
			playerTwoScore+=playerTwoThrows[i];
		}
		
		String winner;
		if (playerOneScore > playerTwoScore) {
			winner = "Els� j�t�kos";
		} else if (playerOneScore < playerTwoScore) {
			winner = "M�sodik j�t�kos";
		} else {
			winner = "D�ntetlen";
		}
		
		if (winner.equals(playerWithMoreStrikes)) {
			if (winner.contains("D�ntetlen")) {
				System.out.println("D�ntetlen lett az eredm�ny, �gy nem �rtelmezhet� a k�rd�s.");
			} else {
				System.out.println("Az nyert, akinek t�bb tarol�sa volt.");
			}
		} else if (playerOneScore == playerTwoStrikes) {
			System.out.println("Ugyanannyi tarol�suk volt, de nem d�ntetlen az eredm�ny");
		} else {
			System.out.println("Nem az nyert, akinek t�bb tarol�sa volt");
		}
		
		
	}
}
	



