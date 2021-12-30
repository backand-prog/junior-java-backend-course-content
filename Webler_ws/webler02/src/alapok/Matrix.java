package alapok;

import java.util.Random;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		//Matrix - t�bbdimenzi�s t�mb
		//itt van sor �s oszlop index - nem mindegy a sorrend: el�bb a sor mint az oszlop
		//matrix[0][2] -> els� sor harmadik eleme
		//sorindex - i
		//oszlopindex - j
		//sorXoszlop
		
		
		//3X4 m�trix deklar�ci� �s defin�ci�
		int[][] matrix = {
				{1, 44, 66, 88},
				{77, 49, 93, 11},
				{2, 52, 17, 5}
		};
		
		
		System.out.println(matrix[2][1]);
		System.out.println(matrix[1][3]);
		
		//matrix elemeinek bej�r�sa
		//elemek ki�r�sa form�zottan tabul�torokkal
		
		//k�ls� k�r l�pteti a sorokat
		//bels� k�r l�pteti a sorelemeket
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	
		//Feladat: 5X6 (t sor �s 6 oszlop) m�trix felt�lt�se (sorszint�en v�letlen sz�mokkal
		//1-100 k�z�tt
		
		
		//felt�lti a m�trixunkat
		int [][] matrix2 = new int[5][6];
		Random r = new Random();
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = r.nextInt(100) + 1;
 			}
			
		}	
		
		//ki�rja a m�trix elemeit
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t");
 			}
			System.out.println();
			
		}	
		
		System.out.println();
		
		//Feladat: 2X3 (2 sor �s 3 oszlop) m�trix felt�lt�se (sorszint�) felhaszn�l�t�l
		//�rkez� adatokkal
		
		int[][] matrix3 = new int[2][3];
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print("Adja meg a m�trix k�vetkez� elem�t: ");
				matrix3[i][j] = Integer.parseInt(sc.nextLine());
			}
			
		}

		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j] + "\t");
			}
			System.out.println();
		}
	
		
		sc.close();
		

	}

}