package oopFajlAllasok;

import java.util.List;

public class App {

	public static void main(String[] args) {


		//A fájlkezelõ osztálybõl elõször létrehozok egy példányt
		FajlKezelo fkObj = new FajlKezelo();
		String fajlNev = "allasok.csv";
		List<AllasTarolo> allasokLista = fkObj.fajlBeolvas(fajlNev);
	
		// ellenõrzés1 : elsõ álláshirdetés azonosítója (ID)
		//System.out.println(allasokLista.get(0).getId());
		//ellenõrzéshez kiir: hány elemû a lista
		//System.out.println(allasokLista.size());

		//3. lépés objektumpéldány létrehozása a feladatok osztályból
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
		System.out.println("A távmunkák fizetésének átlaga: " + feladatokObj.tavmunkaAtlagSzamol(allasokLista));
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