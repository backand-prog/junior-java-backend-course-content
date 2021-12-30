package hasznaltAutok;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		String fajlNev = "hasznalt_autok.txt";
		Fajlkezelo fkObj = new Fajlkezelo();
		Feladatok feladatObj = new Feladatok();
		
		List<AutoTarolo> autok = new ArrayList<>();
		
		autok = fkObj.fajlBetolt(fajlNev);
		
		//a feladat
		System.out.println("a. feladat");
		feladatObj.adatokKiir(autok);
		System.out.println();
		
		//b feladat
		System.out.println("b. feladat");
		System.out.println(feladatObj.autokDarab(autok) + " darab auto szerepel a nyilvántartásban");
		System.out.println();
		
		//c feladat
		System.out.println("c. feladat");
		System.out.println("A benzin autók átlagára: " + feladatObj.benzinAutokAtlagar(autok));
		System.out.println();
		
		//d feladat
		System.out.println("d feladat");
		System.out.println("A dízelautok ennyi km-t tettek meg átlagosan: " + feladatObj.dizelAtlagKm(autok));
		System.out.println();
		
		//e feladat
		System.out.println("e feladat");
		String keresett = "hibrid";
		if (feladatObj.vanHibrid(autok, keresett)) {
			System.out.println("Az autók között van " + keresett);
		} else {
			System.out.println("Nincs az autók között " + keresett);
		}
		System.out.println();
		
		//f feladat
		System.out.println("f. feladat");
		System.out.println("Ezeknél az autóknál van elírva az azonosító:");
		feladatObj.hibasAzonositok(autok);
		System.out.println();
		
		//g feladat
		/*
		System.out.println("g feladat");
		feladatObj.ujAuto(autok);
		feladatObj.adatokKiir(autok);
		*/
		
		
		//h feladat
		System.out.println("h. feladat");
		feladatObj.legIdosebbEsFiatalabb(autok);
		System.out.println();
		
		//i feladat
		System.out.println("i. feladat");
		feladatObj.statEvjarat(autok);
		System.out.println();
		
		//j. feladat
		System.out.println("j. feladat");
		feladatObj.statMarka(autok);
		System.out.println();
		
		//k. feladat
		System.out.println("k. feladat");
		feladatObj.dizelFajlba(autok);
		
	}
	
	
	
	

}
