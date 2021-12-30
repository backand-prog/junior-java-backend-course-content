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
		//Ki kell deríteni, hány sora van a fájlnak, mert ekkora méretû tömböt kell deklarálni
		
		
		try {

			String fajlNev = "adatokDarabol.txt";
			Path fajlEleresiUt = Paths.get(fajlNev);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(fajlNev), "UTF-8"));
			
			//Ki kell deríteni hány sora van a fájlnak, mert ekkora méretû tömböt kell deklarálni
			//java8 óta
			long sorokSzam = Files.lines(fajlEleresiUt).count();
			System.out.println(sorokSzam);
			int tombMeret = (int)sorokSzam;
			String[] nevek = new String[tombMeret];
			int[] magassagok = new int[tombMeret];
			for (int i = 0; i < tombMeret; i++) {
				//beolvassuk a teljes sort a sorvégjelig
				String sor = br.readLine();
				//szétszedjük határoló mentén egy String tömbbe
				//0-ás indexen lesz a név
				//1-es indexen a magasság
				String[] sorAdatok = sor.split(";");
				nevek[i] = sorAdatok[0];
				//FONTOS, minden ami a fájlban van az szöveg, át kell alakítani
				magassagok[i] = Integer.parseInt(sorAdatok[1]);	
			}	
			br.close();
			
			for (int i = 0; i < nevek.length; i++) {
				System.out.println("Név: " +  nevek[i] + ", magassága: " + magassagok[i] + " cm.");
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
