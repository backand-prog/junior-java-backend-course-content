package metodusok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Udvozles {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("K�rem adja meg a teljes nev�t:");
		String nevBekert = br.readLine();
		udvozlesKiir(nevBekert); //amit itt kap az aktu�lis param�ter
		
		System.out.println("K�rem adja meg a vezet�knev�t: ");
		String vezNevBekert = br.readLine();
		System.out.println("K�rem adja meg a keresztnev�tnev�t: ");
		String kerNevBekert = br.readLine();
		udvozlesKiir(vezNevBekert, kerNevBekert);
	}
	
	//a met�dus neve �s a param�terei = met�dus szignat�ra
	public static void udvozlesKiir(String nev) { //az itt megadott param�ter a form�lis param�ter
		System.out.println("�dv�z�llek, " + nev + "!");
	}
	
	//met�dus t�lterhel�s - azonos n�v, k�l�nb�z� param�terlista
	public static void udvozlesKiir(String vezNev, String kerNev) {
		System.out.println("�dv�z�llek, " + vezNev + " " + kerNev + "....");
	
	}
	

}
