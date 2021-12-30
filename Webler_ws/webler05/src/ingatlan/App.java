package ingatlan;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<IngatlanTarolo> ingatlanok = new ArrayList<>();
		FajlKezelo fk = new FajlKezelo();
		String fajlNev = "ingatlan.txt";
		ingatlanok = fk.fajlBeolvas(fajlNev);
		
		Feladatok feladatObj = new Feladatok();
		//a feladat
		System.out.println("a feladat");
		feladatObj.adatokKiir(ingatlanok);
		System.out.println();
		
		//b feladat
		System.out.println("b feladat");
		System.out.println("Ennyi rekord van: " +feladatObj.rekordokDarab(ingatlanok));
		System.out.println();
		
		//c feladat
		System.out.println("c feladat");
		System.out.println(feladatObj.tizenegyKerDarab(ingatlanok) + " db 11. kerületi ingatlan van");
		System.out.println();
		
		//d feladat
		System.out.println("d feladat");
		String agent = "Farkas Péter";
		feladatObj.soldByGivenAgent(ingatlanok, agent);
		System.out.println();
		
		//e feladat
		System.out.println("e feladat");
		System.out.println("Az 4 szobások átlagterülete: " + feladatObj.negySzobasAtlagTerulet(ingatlanok));
		System.out.println();
		
		//f feladat
		System.out.println("f feladat");
		feladatObj.hetKerMin80NmNincsEladva(ingatlanok);
		System.out.println();
		
		//g feladat
		System.out.println("g feladat");
		feladatObj.ujIngatlan(ingatlanok);
		
	}

}
