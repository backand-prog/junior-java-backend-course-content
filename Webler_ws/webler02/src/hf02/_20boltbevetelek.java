package hf02;

import java.util.Random;

public class _20boltbevetelek {

	public static void main(String[] args) {
		int[][] incomeFourWeeks = incomeFourWeeks();
		printIncomeMatrix(incomeFourWeeks);
		fourWeekSumAndAvg(incomeFourWeeks);
		sumAndAvgPerWeek(incomeFourWeeks);
		System.out.println("A különbség: " + differenceWeekdaysWeekend2ndWeek(incomeFourWeeks));
		maxIncome(incomeFourWeeks);

	}
	
	
	
	public static void maxIncome (int[][] m) {
		int maxIncome = 0;
		int weekWithMaxIncome = 0;
		
		for (int i = 0; i < m.length; i++) {
			int weeklyIncome = 0;
			for (int j = 0; j < m[i].length; j++) {
				weeklyIncome += m[i][j];
			}
			
			if (weeklyIncome > maxIncome) {
				maxIncome = weeklyIncome;
				weekWithMaxIncome = i+1;
				
			}
			
		}
		
		System.out.println(weekWithMaxIncome + ". héten volt a legnagyobb a bevétel: " + maxIncome);
		
	}
	
	public static int differenceWeekdaysWeekend2ndWeek (int[][] m) {
		
		int difference;
		int incomeWeekdays = 0;
		int incomeWeekend = 0;
		
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < m[i].length - 2; j++) {
				incomeWeekdays+=m[i][j];
			}			
		}
		
		for (int i = 1; i < 2; i++) {
			for (int j = m[i].length -2; j < m[i].length; j++) {
				incomeWeekend+=m[i][j];
			}
		}
		System.out.println(incomeWeekdays);
		System.out.println(incomeWeekend);
		difference = incomeWeekdays - incomeWeekend;
		
		return difference;
		
	}
	
	public static void sumAndAvgPerWeek (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int sumWeek = 0;
			int countElementsWeek = 0;
			for (int j = 0; j < m[i].length; j++) {
				sumWeek+=m[i][j];
				countElementsWeek++;
			}
			int avgWeek = sumWeek / countElementsWeek;
			System.out.println("Az " + (i+1) + " hét összbevétele: " + sumWeek);
			System.out.println("Az " + (i+1) + " hét napi átlagbevétele: " + avgWeek);
		}
			
	}
	
	public static void fourWeekSumAndAvg (int[][] m) {
		int sum = 0;
		int countAllElements = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sum+=m[i][j];
				countAllElements++;
			}
		}
		
		int avg = sum / countAllElements;
		
		System.out.println("Az összbevétel: " + sum + " forint, a napi átlagbevétel " + avg + " forint.");
		
	}
	
	public static void printIncomeMatrix (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < m[0].length; j++) {
				System.out.print("   " + (i+1) + "\t");
				i++;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			System.out.print((i + 1) + ". hét: ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] incomeFourWeeks () {
		Random r = new Random();
		
		int[][] income = new int[4][7];
		
		for (int i = 0; i < income.length; i++) {
			for (int j = 0; j < income[i].length; j++) {
				income[i][j] = r.nextInt(300_000 - 200_000 + 1) + 200_000;
			}
		}
		
		return income;
		
		
	}
	
}
