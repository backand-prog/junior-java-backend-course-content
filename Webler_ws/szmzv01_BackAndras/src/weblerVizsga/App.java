package weblerVizsga;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
		//1. feladat
		String fajlNev = "kutyak.txt";
		Fajlkezelo fk = new Fajlkezelo();
		List<Kutyak> kutyak = new ArrayList<Kutyak>();
		kutyak = fk.fajlBeolvas(fajlNev);
		Feladatok feladatObj = new Feladatok();
		/*
		System.out.println(kutyak.size());
		System.out.println(kutyak.get(0).getBecenev());
		*/

		//2. feladat
		System.out.println("2. feladat - Adatok megjelen�t�se:");
		feladatObj.adatokKiir(kutyak);
		System.out.println();

		//3. feladat
		System.out.print("3. feladat: Ennyi kever�k kutya van a menhelyen: ");
		System.out.println(feladatObj.keverekDb(kutyak));
		System.out.println();

		//4. feladat
		System.out.println("4. feladat: Kuty�k fajta alapj�n:");
		feladatObj.bekertFajtaAdatokKiir(kutyak);
		System.out.println();

		//5. feladat
		System.out.println("5. feladat: magyar vizsla, kan, ivartalan�tott, legfeljebb 2 �ves:");
		feladatObj.vizslaKanIvartalan�tottLegfeljebbKetEves(kutyak);
		System.out.println();
		
		//6. feladat
		System.out.println("6. feladat: Kutyafajt�k");
		feladatObj.kuytafajtak(kutyak);

	}

}
