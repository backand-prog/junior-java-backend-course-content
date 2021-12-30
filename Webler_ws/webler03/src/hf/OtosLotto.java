package hf;

import java.util.Random;

public class OtosLotto {

	public static void main(String[] args) {
		int[][] nums = numbersOneYear();
		printNumsForAYear(nums);

	}
	
	public static int[][] numbersOneYear() {
		
		Random r = new Random();
		
		int[][] numbers = new int[52][5];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = r.nextInt(90) + 1;					
				while (!isInNums(numbers, i, numbers[i][j]))   {
					numbers[i][j] = r.nextInt(90) + 1;
				}
				
			}
		}
		
		return numbers;
	}
	
	public static boolean isInNums(int[][] matrix, int row, int searchNum) {
		
		boolean isInNums = false;
		int x = 0;
		
		for (int i = 0; i < matrix[row].length; i++) {	
			while (x <matrix[row].length && matrix[row][i] != searchNum) {
				System.out.println(x);
				x++;
				} 
			
			if (x<matrix[row].length) {
				isInNums = true;
				
			}
			
			
		}
		
		return isInNums;		
		
	}
	
	public static void printNumsForAYear (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print( matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
