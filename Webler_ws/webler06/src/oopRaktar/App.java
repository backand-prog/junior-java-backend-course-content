package oopRaktar;

import java.util.List;

public class App {

	public static void main(String[] args) {
		FajlKezelo fkObj = new FajlKezelo();

		String fajlNev = "raktarKeszlet.csv";
		
		List<EszkozTarolo> termekLista = fkObj.fajlbeolvas(fajlNev);
		
		//System.out.println(termekLista.get(0).getLeltarSzam());
		//System.out.println(termekLista.size());
		
		Feladatok feladatObj = new Feladatok();
		
		//c feladat
		System.out.println("c feladat - hibás adat törlése");
		feladatObj.hibasLeltarSzamuAdatTorol(termekLista);
		System.out.println();
		
		//d feladat
		System.out.println("d feladat - adatok kiírása");
		feladatObj.adatokKiir(termekLista);
		System.out.println();
		
		//e feladat
		System.out.println("e feladat - Akciós termékek raktármennyisége");
		System.out.println(feladatObj.akciosTermekekRaktarMennyisegeMeghataroz(termekLista));
		System.out.println();
		
		//f feladat
		System.out.println("f feladat");
		feladatObj.notebookfajtaDbKiir(termekLista);
		System.out.println();
		
		//g feladat
		System.out.println("g feladat");
		feladatObj.legdragabbNotebookKiir(termekLista);
		System.out.println();
		
		//h feladat
		System.out.println("h feladat");
		System.out.println(feladatObj.notebookAtlagArMeghataroz(termekLista));
		System.out.println();
		
		//i feladat
		System.out.println("i feladat");
		feladatObj.legOlcsobbAsztaliPcRogzitesIdejeKiir(termekLista);
		System.out.println();
		
		//j feladat
		System.out.println("j feladat");
		feladatObj.legtobbPeriferiaRaktaronKiir(termekLista);
		System.out.println();
		
		//k feladat
		System.out.println("k feladat");
		fkObj.notebookFajlbaIr(termekLista);
		
		
	}

}
