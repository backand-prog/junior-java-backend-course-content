package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12matrix3x4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		int[][] matrix = new int[3][4];

		
		fillMatrixWithUserInput(matrix);
		printMatrixElements(matrix);
		valueAtGivenIndexes(matrix);
		changeFirstAndLastRow(matrix);
		printMatrixElements(matrix);
		
		
	}
	
	public static void fillMatrixWithUserInput(int matrix[][]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				System.out.print("Kérem adjam meg a mátrix következõ elemét: ");
				matrix[i][j] = Integer.parseInt(br.readLine());
				
			}
			
		}
		
	}
	

	public static void printMatrixElements (int matrix[][]) {
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void valueAtGivenIndexes (int matrix[][]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kérem adja az elsõ indexet: ");
		int index1 = Integer.parseInt(br.readLine());
		System.out.print("Kérem adja a második indexet: ");
		int index2 = Integer.parseInt(br.readLine());
		System.out.println("A bekért indexek által határolt érték: " + matrix[index1][index2]);

	}
	
	public static void changeFirstAndLastRow (int matrix[][]) {
	
		int a = matrix.length - 1;
		
	    for (int i = 0; i < matrix[a].length; i++) {
	        int b = matrix[a][i];
	        matrix[a][i] = matrix[0][i];
	        matrix[0][i] = b;
	    }
	    
	}
	
}
	

