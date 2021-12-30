package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class _17szinhaz {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int theatreMatrix[][] = new int[30][20];
		
		fillMatrixRandInt(theatreMatrix);
		showMatrix(theatreMatrix);
		checkIfFreeReserve(theatreMatrix);
		showMatrix(theatreMatrix);
		System.out.println("Eddig " + soldTicketsAmount(theatreMatrix) + " jegyet értékesítettek.");
		System.out.println("A jegyek " + percentageNotSold(theatreMatrix) + " százaléka nem lett még értékesítve");
		freeSeatsInRow(theatreMatrix);
		System.out.println();
		System.out.println("Az eddigi teljes bevétel: " + incomeFromTickets(theatreMatrix) + " Forint.");;
		System.out.println("Az üres ülések száma: " + freeSeatsOnEdge(theatreMatrix));
		rowBelowSixSoldTickets(theatreMatrix);
		statSoldPercentagePerRow(theatreMatrix);
		threeBorderingEmptyInRow(theatreMatrix);
		
	}
	
	public static void threeBorderingEmptyInRow (int [][] matrix ) {
		
		for (int i = 0; i < matrix.length; i++) {
			int emptySeatCounter = 0;
			
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					emptySeatCounter = 0;
				} else if (matrix[i][j] == 0) {
					emptySeatCounter++;
				}
				
				if (emptySeatCounter > 2) {
					System.out.println((i+1) + ". sorban van egymás mellett három üres hely.");
					break;
				}
				
			}
					
		}

	}
				
	
		

	
	public static void statSoldPercentagePerRow  (int[][] matrix) {
			
		for (int i = 0; i < matrix.length; i++) {
			int sumSoldInRow = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					sumSoldInRow++;
				}

			}

			int seatSoldInRowPercentage = (int)(( (double)sumSoldInRow / (double)matrix[i].length ) * 100);
			
			System.out.println((i + 1) + ". sorban a helyek " + seatSoldInRowPercentage + " százalékát adták el.");
			
		}
		
		
		
	}
	
	public static void rowBelowSixSoldTickets (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					counter++;
				}
					
				}
			
			if (counter < 6) {
				System.out.println("Ebben a sorban nem sikerült még 6 jegyet sem sikerülni eladni: " + (i + 1));
			}
			
		}
		
	}
		
		
	
	
	public static int freeSeatsOnEdge(int[][] matrix) {
		
		int freeSeatsCount = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (matrix[i][j] == 0) {
					freeSeatsCount++;
				}			
			}

		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix[i].length - 2; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					freeSeatsCount++;
				}
			}

		}
		return freeSeatsCount;
	}
	
	
	public static int incomeFromTickets (int[][] matrix) {
		int income = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1 && i < 6) {
					income+=4500;
				} else if(matrix[i][j] == 1 && i >= 6) {
					income+=3500;
				} 
				
			}
			
		}
		
		return income;
		
		
	}
	
	public static void freeSeatsInRow (int[][] matrix) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Adja meg a sorszámot: ");
		int rowNum = Integer.parseInt(br.readLine()) - 1;
		System.out.print("Ebben a sorban a következõ székek üresek: ");
		for (int i = rowNum; i < rowNum + 1; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					System.out.print((j + 1) + " ");
				}
				
			}
		}
		
	}
	
	public static int percentageNotSold (int[][] matrix) {
		int seatCounter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				seatCounter++;
			}
		}
		
		int notSoldCounter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					notSoldCounter++;
				}
			}
		}
		
		int percentageNotSold = (int)(((double)notSoldCounter / (double)seatCounter) * 100);
		
		return percentageNotSold;
	}
	
	public static int soldTicketsAmount (int[][] matrix) {
		int soldCounter = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					soldCounter++;
				}
			}
		}
		
		return soldCounter;
	}
	
	public static void checkIfFreeReserve (int[][] matrix) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kérem adja meg a sor számát: ");
		int rowNum = Integer.parseInt(br.readLine()) - 1;
		System.out.print("Kérem adja meg a szék számát: ");
		int seatNum = Integer.parseInt(br.readLine()) - 1;
		
		if (matrix[rowNum][seatNum] == 1) {
			System.out.println("A megadott hely: " + (rowNum + 1)  + ". sor, " + (seatNum + 1) + ". szék. A hely már foglalt.");
		} else {
			matrix[rowNum][seatNum] = 1;
			System.out.println("A megadott hely: " + (rowNum + 1) + ". sor, " + (seatNum + 1) + ". szék. A hely szabad volt még, sikeres foglalás.");
		}
		
	}
	
	public static void fillMatrixRandInt (int[][] matrix) {
		
		Random r = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = r.nextInt(2);
			}
		}
	}
	
	public static void showMatrix (int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}
