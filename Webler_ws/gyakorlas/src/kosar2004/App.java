package kosar2004;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws ParseException {
		FajlKezelo fk = new FajlKezelo();
		
		String fajlNev = "eredmenyek.csv";
		
		List<KosarasTarolo> meccsek = new ArrayList<>();
		
		meccsek = fk.fajlBeolvas(fajlNev);
		
		Feladatok feladatObj = new Feladatok();
		
		//3. feladat
		System.out.println("3. feladat: " + feladatObj.meccsekMadrid(meccsek));
		
		
		//4. feladat
		System.out.println("4. feladat: Volt döntetlen? " + (feladatObj.dontetlenek(meccsek) ? "igen" : "nem"));
		
		//5. feladat
		System.out.println("5. feladat: barcelonai csapat teljes neve: " + feladatObj.nevBarcelona(meccsek));
		

		//6. feladat
		feladatObj.adottDatumMeccsek(meccsek);
		
		//7. feladat
		System.out.println("7. feladat");
		feladatObj.husznalTobbMeccsStadion(meccsek);
		
		
	}

}
