package fajlKezeles;

import java.io.FileWriter;
import java.io.IOException;

public class FajlIro {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("kimenet.txt", false);
			fw.write("Els� sor...\r\n");
			fw.write("M�sodik sor...\r\n");
			int[] tomb = {4,5,6,777,9};
			for (int i = 0; i < tomb.length; i++) {
				fw.write(tomb[i] + " ");
			}
			//ha az fw.close() nincs benne, akkor nem ker�lnek bele az adatok
			fw.close();

			System.out.println("Elk�sz�lt a f�jl...");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
