package oopFajlAllasok;

import java.util.List;

public class App {

	public static void main(String[] args) {


		//A f�jlkezel� oszt�lyb�l el�sz�r l�trehozok egy p�ld�nyt
		FajlKezelo fkObj = new FajlKezelo();
		String fajlNev = "allasok.csv";
		List<AllasTarolo> allasokLista = fkObj.fajlBeolvas(fajlNev);
	
		// ellen�rz�s1 : els� �ll�shirdet�s azonos�t�ja (ID)
		//System.out.println(allasokLista.get(0).getId());
		//ellen�rz�shez kiir: h�ny elem� a lista
		//System.out.println(allasokLista.size());

		//3. l�p�s objektump�ld�ny l�trehoz�sa a feladatok oszt�lyb�l
		System.out.println("b. feladat");
		Feladatok feladatokObj = new Feladatok();
		feladatokObj.adatokKiir(allasokLista);
		System.out.println();

		//c feladat 
		System.out.println("c. feladat");
		feladatokObj.allasokSzamaKiir(allasokLista);
		System.out.println();

		//d. feladat
		System.out.println("d. feladat");
		feladatokObj.maxFizetesKiir(allasokLista);
		System.out.println();

		//e. feladat
		System.out.println("e. feladat");
		System.out.println("Ennyi rendszergazda van: " + feladatokObj.rendszergazdaDbSzamol(allasokLista));
		System.out.println();

		//f. feladat
		System.out.println("f. feladat");
		feladatokObj.tavmunkaAllasokKiir(allasokLista);
		System.out.println();

		//g. feladat
		System.out.println("g. feladat");
		System.out.println("A t�vmunk�k fizet�s�nek �tlaga: " + feladatokObj.tavmunkaAtlagSzamol(allasokLista));
		System.out.println();

		//h feladat
		System.out.println("h. feladat");
		feladatokObj.allasokTapasztalatNelkulKiir(allasokLista);
		System.out.println();

		//i feladat
		System.out.println("i. feladat");
		feladatokObj.allasokNegyEvnelTobbKiir(allasokLista);
		System.out.println();

		//j. feladat
		System.out.println("j. feladat");
		feladatokObj.haromHetnelRegebbiAllasokKiir(allasokLista);
		System.out.println();

		//k feladat
		feladatokObj.legfrissebbAllasKiir(allasokLista);


		//l feladat
		
		System.out.println(feladatokObj.atlagMaxPozicioSzerintMeghataroz(allasokLista));


	}

	

}