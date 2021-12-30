package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class _18Otoslotto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int lotteryNums[][] = lotteryNumsForAYear();
		printLotteryNums(lotteryNums);
		printInputWeekNums(lotteryNums);
		numThirteenWeeks(lotteryNums);
		System.out.println("A p�ros sz�mok az �sszes sz�m " + evenNumsPercentage(lotteryNums) + " sz�zal�k�t teszik ki");
		System.out.println(over80InSecondSemester(lotteryNums) + " nyolcvann�l nagyobb sz�m volt a m�sodik f�l�vben");	
		allNumsOddWeek(lotteryNums);
		moreNumsOver50(lotteryNums);
		hitsOutOfFive(lotteryNums);
		System.out.println("A leggyakrabban el�fordul� sz�m: " + mostFrequentNum(lotteryNums));
		weeksWithNeighboringNums(lotteryNums);
		
	}
	
	
	public static void weeksWithNeighboringNums (int[][] matrix) {
		
		
		for (int i = 0; i < matrix.length; i++) {
			
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == 0) {
					continue;
				} else if (matrix[i][j] - matrix[i][j-1] == 1 ) {
					System.out.println((i+1) + ". h�ten vannak egym�st k�vet� sz�mok.");
					continue;
				}
			}
		}
				
	}
		
	
	
	public static int mostFrequentNum (int[][] matrix) {
		int[][] numberOccurence = new int[90][2];
		
		for (int i = 0; i < numberOccurence.length; i++) {
			for (int j = 0; j < numberOccurence[i].length; j++) {
				numberOccurence[i][0] = i + 1;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				numberOccurence[matrix[i][j]-1][1]++;						
			}
			
		}
		
		int max = 0;
		for (int i = 0; i < numberOccurence.length; i++) {
			for (int j = 0; j < numberOccurence.length; j++) {
				if (numberOccurence[i][1] > max) {
					max = numberOccurence[i][0];
				}
				
			}
			
		}
		
		
		return max;
		
		
		
	}
	
	public static void hitsOutOfFive (int[][] matrix) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] fiveNums = new int[5];
		
		for (int i = 0; i < fiveNums.length; i++) {
			System.out.println("K�rem, adja meg a k�vetkez� sz�mot(" + (i+1) + "): ");
			fiveNums[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("A megadott sz�mok:");
		
		for (int i = 0; i < fiveNums.length; i++) {
			
			System.out.print(fiveNums[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < matrix.length; i++) {
			int hitCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				for (int j2 = 0; j2 < fiveNums.length; j2++) {
					if (fiveNums[j2] == matrix[i][j]) {
						hitCounter++;
					}
				}
			}
			if (hitCounter > 1) {
				System.out.println((i+1) + ". h�t: " + hitCounter + " tal�lat.");
			}
			
		}
		
	}
	
	public static void moreNumsOver50 (int[][] matrix) {
		int over50FirstQuarterYear = 0;
		for (int i = 0; i < matrix.length / 4; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 50) {
					over50FirstQuarterYear++;					
				}
			}
		}
		
		int over50ThirdQuarterYear = 0;
		
		for (int i = matrix.length/2; i < (matrix.length / 4) * 3; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 50) {
					over50ThirdQuarterYear++;					
				}
			}
		}
		
		if (over50FirstQuarterYear > over50ThirdQuarterYear) {
			System.out.println("Az els� negyed�vben volt t�bb 50 feletti sz�m. " + over50FirstQuarterYear + ")");
		} else if (over50FirstQuarterYear < over50ThirdQuarterYear) {
			System.out.println("A harmadik negyed�vben volt t�bb 50 feletti sz�m. (" + over50ThirdQuarterYear + ")");
		} else {
			System.out.println("Ugyanannyi volt a k�t harmad�vben az 50 feletti.");
		}
		
		
		
	}
	
	public static void allNumsOddWeek (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			boolean allOdd = true;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] % 2 == 0) {
					allOdd = false;
				}
			}
			
			if (allOdd == true) {
				System.out.println((i+1) + ". h�ten minden sz�m p�ratlan volt.");
			}
		}
	}
	
	public static int over80InSecondSemester (int[][] matrix) {
		int counter = 0;
		for (int i = matrix.length/2; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 80) {
					counter++;
				}
			}
		}
		
		return counter;
	}
	
	public static int evenNumsPercentage (int[][] matrix) {
		int evenCounter = 0;
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				counter++;
				if (matrix[i][j] % 2 == 0) {
				evenCounter++;
				}
		
			}
			
		}
		System.out.println(counter);
		System.out.println(evenCounter);
		int evenPercentage = (int)(((double)evenCounter / (double)counter) * 100);
		
		return evenPercentage;
			
	}
	
	public static void numThirteenWeeks (int[][] matrix) {
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 13) {
					System.out.println("A " + (i+1) + ". h�ten kih�zt�k a 13-as sz�mot.");
				}
			}
		}
		
	}
	
	public static void printInputWeekNums (int[][] matrix) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("K�rem adja meg, hogy melyik h�t nyer�sz�maira k�v�ncsi (1-52): ");
		int weekNum = Integer.parseInt(br.readLine()) - 1;
		
		for (int i = weekNum; i < weekNum + 1; i++) {
			System.out.print("A " + (weekNum + 1) + ". h�t nyer� sz�mai: ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
		}
		
	}
	
	public static void printLotteryNums (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println((i+1) + ". h�t nyer�sz�mai: ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print( matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

	public static int[][] lotteryNumsForAYear () {
		
		Random r = new Random();
		
		// int[][] mockedNums = {{11, 22, 33, 44, 55}, {1, 2, 3, 4, 5}};
		int[][] lotteryNumsForAYear = new int[52][5];
		
		for (int i = 0; i < lotteryNumsForAYear.length; i++) {
			for (int j = 0; j < lotteryNumsForAYear[i].length; j++) {
				
				lotteryNumsForAYear[i][j] = r.nextInt(90) + 1;
				
				
			
			}
			
		}
		
		return lotteryNumsForAYear;
			
	}
		
		
}

				
				
				/* 
				boolean alreadyUsedNum = false;
				int randInt;
				do {
					randInt = r.nextInt(1000) + 1;
					for (int j2 = 0; j2 < lotteryNumsForAYear[i].length; j2++) {
						if (randInt == lotteryNumsForAYear[i][j2]) {
							alreadyUsedNum = true;
						} 
						
					}
					
					
					
				} while (alreadyUsedNum == true);
				
				lotteryNumsForAYear[i][j] = randInt;
				
			}
			*/
			
	