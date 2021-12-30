package alapok;

import java.util.Random;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		//Matrix - többdimenziós tömb
		//itt van sor és oszlop index - nem mindegy a sorrend: elõbb a sor mint az oszlop
		//matrix[0][2] -> elsõ sor harmadik eleme
		//sorindex - i
		//oszlopindex - j
		//sorXoszlop
		
		
		//3X4 mátrix deklaráció és definíció
		int[][] matrix = {
				{1, 44, 66, 88},
				{77, 49, 93, 11},
				{2, 52, 17, 5}
		};
		
		
		System.out.println(matrix[2][1]);
		System.out.println(matrix[1][3]);
		
		//matrix elemeinek bejárása
		//elemek kiírása formázottan tabulátorokkal
		
		//külsõ kör lépteti a sorokat
		//belsõ kör lépteti a sorelemeket
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	
		//Feladat: 5X6 (t sor és 6 oszlop) mátrix feltöltése (sorszintûen véletlen számokkal
		//1-100 között
		
		
		//feltölti a mátrixunkat
		int [][] matrix2 = new int[5][6];
		Random r = new Random();
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = r.nextInt(100) + 1;
 			}
			
		}	
		
		//kiírja a mátrix elemeit
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t");
 			}
			System.out.println();
			
		}	
		
		System.out.println();
		
		//Feladat: 2X3 (2 sor és 3 oszlop) mátrix feltöltése (sorszintû) felhasználótól
		//érkezõ adatokkal
		
		int[][] matrix3 = new int[2][3];
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print("Adja meg a mátrix következõ elemét: ");
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