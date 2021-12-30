package zsebtolvajok;

public class Futtatas {

	public static void main(String[] args) {
		
		Tolvajok tolvaj1 = new Tolvajok("William M.", "Perez", 0, 0);
		Tolvajok tolvaj2 = new Tolvajok("Hector", "Fleming", 0, 0);
		int tolvaj1Probalkozasok = 0;
		for (int i = 0; i < 3; i++) {
			tolvaj1.Rabol(3, i);
			tolvaj1Probalkozasok++;
		}
		int tolvaj2Probalkozasok = 0;
		for (int i = 0; i < 2; i++) {
			tolvaj2.Rabol(4, i);
			tolvaj2Probalkozasok++;
		}
		
		System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " " + tolvaj1.getSikeresRablasokSzama() + 
				" sikeres rablással zárta a hetet.");
		System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " " + tolvaj2.getSikeresRablasokSzama() + 
				" sikeres rablással zárta a hetet.");
		
		System.out.println();
		
		System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " " + tolvaj1.getPenz() + " dollárral zárta a hetet.");
		System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " " + tolvaj2.getPenz() + " dollárral zárta a hetet.");
		
		System.out.println();
		
		if (tolvaj1Probalkozasok > tolvaj1.getSikeresRablasokSzama()) {
			System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " börtönben van a hét végére.");
		} else {
			System.out.println(tolvaj1.getKeresztnev() + " " + tolvaj1.getVezeteknev() + " szabadlábon van a hét végére.");
		}
		
		if (tolvaj2Probalkozasok > tolvaj2.getSikeresRablasokSzama()) {
			System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " börtönben van a hét végére.");
		} else {
			System.out.println(tolvaj2.getKeresztnev() + " " + tolvaj2.getVezeteknev() + " szabadlábon van a hét végére.");
		}
		
	}

}
