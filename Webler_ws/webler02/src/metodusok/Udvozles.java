package metodusok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Udvozles {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Kérem adja meg a teljes nevét:");
		String nevBekert = br.readLine();
		udvozlesKiir(nevBekert); //amit itt kap az aktuális paraméter
		
		System.out.println("Kérem adja meg a vezetéknevét: ");
		String vezNevBekert = br.readLine();
		System.out.println("Kérem adja meg a keresztnevétnevét: ");
		String kerNevBekert = br.readLine();
		udvozlesKiir(vezNevBekert, kerNevBekert);
	}
	
	//a metódus neve és a paraméterei = metódus szignatúra
	public static void udvozlesKiir(String nev) { //az itt megadott paraméter a formális paraméter
		System.out.println("Üdvözöllek, " + nev + "!");
	}
	
	//metódus túlterhelés - azonos név, különbözõ paraméterlista
	public static void udvozlesKiir(String vezNev, String kerNev) {
		System.out.println("Üdvözöllek, " + vezNev + " " + kerNev + "....");
	
	}
	

}
