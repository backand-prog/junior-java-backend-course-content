package kezisek;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		FaljKezelo fk = new FaljKezelo();
		
		List<JatekosTarolo> jatekosok = new ArrayList<>();
		
		jatekosok = fk.FajlBeolvas("kezisek.txt");
		Feladatok feladatObj = new Feladatok();
		
		
		//a feladat
		System.out.println("a feladat");
		feladatObj.jatekosokKiir(jatekosok);
		System.out.println();
		
		//b feladat
		System.out.println("b feladat");
		System.out.println("Az ir�ny�t�k g�ljai �sszesen: " + feladatObj.osszesIranyitoGol(jatekosok));
		System.out.println();
		
		//c feladat
		System.out.println("c feladat");
		System.out.println("Ennyi nem s�r�lt kapus van: " + feladatObj.nemSerultKapusok(jatekosok));
		System.out.println();
		
		//d feladat
		System.out.println("d feladat");
		feladatObj.legtobbGoltSzerzo(jatekosok);
		System.out.println();
		
		//e feladat
		System.out.println("e feladat");
		System.out.println("Ennyien szerepeltek legal�bb 13 meccsen: " + feladatObj.legalabb13Merkozes(jatekosok));
		System.out.println();
		
		//f feladat
		System.out.println("f feladat");
		feladatObj.tobbMintOtvenGoltSzerzok(jatekosok);
		System.out.println();
		
		//g feladat
		System.out.println("g feladat");
		String fajlNev = "kezilabda_ujcsapat.txt";
		feladatObj.jatekosCsere(jatekosok);
		fk.ujFajl(jatekosok, fajlNev);
		
		
		
	}

}
