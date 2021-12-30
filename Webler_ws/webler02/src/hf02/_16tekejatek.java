package hf02;

import java.util.Random;

public class _16tekejatek {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//a játékosok dobásaira létrehozott tömb
		int playerOneThrows[] = new int[10];
		int playerTwoThrows[] = new int[10];


		//10 kör tekegurítás mindkét játékosnak
		for (int i = 0; i < playerOneThrows.length; i++) {
			//elsõ játékos dobása
			playerOneThrows[i] = r.nextInt(11) + 0;
			System.out.println("Az elsõ játékos " + (i + 1) + ". dobása: " + playerOneThrows[i]);
			if (playerOneThrows[i] == 10) {
				System.out.println("AZ ELSÕ JÁTÉKOS TAROLT!!");
			}
			//második játékos dobása
			playerTwoThrows[i] = r.nextInt(11);
			System.out.println("A második játékos " + (i + 1) + ". dobása: " + playerTwoThrows[i]);
			if (playerTwoThrows[i] == 10) {
				System.out.println("A MÁSODIK JÁTÉKOS TAROLT!!");
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
		
		System.out.println("Az elsõ játékos eredménye: " + playerOneScore);
		System.out.println("A második játékos eredménye: " + playerTwoScore);
		
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
			System.out.println("Az elsõ játékos nyert " + diff + " ponttal.");
		} else if (playerTwoScore > playerOneScore) {
			diff = playerTwoScore - playerOneScore;
			System.out.println("A második játékos nyert " + diff + " ponttal.");
	} else {
		System.out.println("Döntetlen.");
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
			System.out.println("A játék felénél az elsõ játékos vezetett. (" + playerOneScore + "-" + playerTwoScore + ")");
		} else if (playerTwoScore > playerOneScore) {
			System.out.println("A játék felénél a második játékos vezetett.(" + playerOneScore + "-" + playerTwoScore + ")");
	} else {
		System.out.println("Döntetlenre álltak a játék felénél. (" + playerOneScore + "-" + playerTwoScore + ")");
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
		System.out.println("Az elsõ játékos " + playerOneStrikes + " alkalommal, a második játékos " + playerTwoStrikes + " alkalommal tarolt.");
		
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
			playerWithMoreStrikes = "Elsõ játékos";
		} else if (playerOneStrikes < playerTwoStrikes) {
			playerWithMoreStrikes = "Második játékos";
		} else {
			playerWithMoreStrikes = "Döntetlen";
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
			winner = "Elsõ játékos";
		} else if (playerOneScore < playerTwoScore) {
			winner = "Második játékos";
		} else {
			winner = "Döntetlen";
		}
		
		if (winner.equals(playerWithMoreStrikes)) {
			if (winner.contains("Döntetlen")) {
				System.out.println("Döntetlen lett az eredmény, így nem értelmezhetõ a kérdés.");
			} else {
				System.out.println("Az nyert, akinek több tarolása volt.");
			}
		} else if (playerOneScore == playerTwoStrikes) {
			System.out.println("Ugyanannyi tarolásuk volt, de nem döntetlen az eredmény");
		} else {
			System.out.println("Nem az nyert, akinek több tarolása volt");
		}
		
		
	}
}
	



