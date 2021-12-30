package hf02;

public class _10matrix8x8 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[8][8];
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][i] = 1;

		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			
			System.out.println();
		}
		

	}

}
