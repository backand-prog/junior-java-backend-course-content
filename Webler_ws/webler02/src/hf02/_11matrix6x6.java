package hf02;

public class _11matrix6x6 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[6][6];
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j == 5) {
					matrix[i][j] = 1;
				}
			}
		
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			
			System.out.println();
			
		}
		

	}

}
