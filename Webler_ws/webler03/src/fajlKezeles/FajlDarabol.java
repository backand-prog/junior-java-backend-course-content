package fajlKezeles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FajlDarabol {

	public static void main(String[] args) {
		//Ki kell der�teni, h�ny sora van a f�jlnak, mert ekkora m�ret� t�mb�t kell deklar�lni
		
		
		try {

			String fajlNev = "adatokDarabol.txt";
			Path fajlEleresiUt = Paths.get(fajlNev);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(fajlNev), "UTF-8"));
			
			//Ki kell der�teni h�ny sora van a f�jlnak, mert ekkora m�ret� t�mb�t kell deklar�lni
			//java8 �ta
			long sorokSzam = Files.lines(fajlEleresiUt).count();
			System.out.println(sorokSzam);
			int tombMeret = (int)sorokSzam;
			String[] nevek = new String[tombMeret];
			int[] magassagok = new int[tombMeret];
			for (int i = 0; i < tombMeret; i++) {
				//beolvassuk a teljes sort a sorv�gjelig
				String sor = br.readLine();
				//sz�tszedj�k hat�rol� ment�n egy String t�mbbe
				//0-�s indexen lesz a n�v
				//1-es indexen a magass�g
				String[] sorAdatok = sor.split(";");
				nevek[i] = sorAdatok[0];
				//FONTOS, minden ami a f�jlban van az sz�veg, �t kell alak�tani
				magassagok[i] = Integer.parseInt(sorAdatok[1]);	
			}	
			br.close();
			
			for (int i = 0; i < nevek.length; i++) {
				System.out.println("N�v: " +  nevek[i] + ", magass�ga: " + magassagok[i] + " cm.");
			}
	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
