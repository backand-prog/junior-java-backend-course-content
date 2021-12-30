package oopFajlAllasok;


import java.util.Calendar;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Feladatok {
	
	//b. feladat - adatok kiírása
	public void adatokKiir(List<AllasTarolo> allasokLista) {
		
		for (AllasTarolo item : allasokLista) {
			System.out.print(item.getId());
			System.out.print("\t");
			System.out.print(item.getMegnevezes());
			System.out.print("\t");
			System.out.print(item.getBruttoFizetes());
			System.out.print("\t");
			System.out.print(item.getElvartTapasztalatiEvek());
			System.out.print("\t");
			//ternary operator - short if
			String tavMunka = item.getTavmunka() ? "Tavmunka" : "Nincs távmunka";
			System.out.print(tavMunka);
			System.out.print("\t");
			System.out.printf("%tF", item.getPublikacioIdeje());
			System.out.println();
			
		}
		
	}
	
	//c. feladat - állások száma kiír
	
	public void allasokSzamaKiir(List<AllasTarolo> allasokLista) {
		
		Integer allasokSzama = allasokLista.size();
		
		System.out.println("Ennyi állás van: " + allasokSzama);
	}
	
	//d. feladat
	
	public void maxFizetesKiir(List<AllasTarolo> allasokLista) {
		
		Integer maxFizetes = allasokLista.get(0).getBruttoFizetes();
		for (int i = 0; i < allasokLista.size(); i++) {
			if (allasokLista.get(i).getBruttoFizetes() > maxFizetes) {
				maxFizetes = allasokLista.get(i).getBruttoFizetes();
			}
		}
		
		for (AllasTarolo item : allasokLista) {
			if (item.getBruttoFizetes() == maxFizetes) {
				
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.println();
				
			}
		}
		
	}
	
	//e. feladat
	public Integer rendszergazdaDbSzamol(List<AllasTarolo> allasokLista) {
		Integer rgazdaDb = 0;
		for (AllasTarolo item : allasokLista) {
			if (item.getMegnevezes().equals("rendszergazda")) {	
				
				rgazdaDb++;
			}	
		}
		return rgazdaDb;
		
	}
	
	//f. feladat
	public void tavmunkaAllasokKiir(List<AllasTarolo> allasokLista) {
		System.out.println("Távmunkás állások:");
		for (AllasTarolo item : allasokLista) {
			if (item.getTavmunka()) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.println();
			}
			
		}
		
	}
	
	//g feladat
	public double tavmunkaAtlagSzamol(List<AllasTarolo> allasokLista) {
		
		Integer osszeg = 0;
		Integer tavmunkaDb = 0;
		for (AllasTarolo item : allasokLista) {
			osszeg += item.getBruttoFizetes();
			tavmunkaDb++;
			
		}
		
		return (double)osszeg/tavmunkaDb;
		
	}
	
	//h feladat
	public void allasokTapasztalatNelkulKiir(List<AllasTarolo> allasokLista) {
		System.out.println("Ezekhez nem kell tapasztalat");
		for (AllasTarolo item: allasokLista) {
			if (item.getElvartTapasztalatiEvek()==0) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.println();
			}
		}
	}
	
	//i feladat
	
	public void allasokNegyEvnelTobbKiir(List<AllasTarolo> allasokLista) {
		System.out.println("Ezeknél kell több, mint 4 év tapasztalat kell:");
		for (AllasTarolo item : allasokLista) {
			if (item.getElvartTapasztalatiEvek() > 4) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.println();
			}
		}
	}
	
	//j. feladat
	public void haromHetnelRegebbiAllasokKiir(List<AllasTarolo> allasokLista) {
	
		//1. lépés: aktuális dátumot meghatározzuk
		Date ma = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(ma);
		
		c.add(Calendar.DATE, -21);
		ma = c.getTime();
		
		
		for (AllasTarolo item: allasokLista) {
			
			if (item.getPublikacioIdeje().before(ma)) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.printf("%tF", item.getPublikacioIdeje());
				System.out.println();
				
			}
			
		}
		
			
	}
	
	//k feladat
	
			public void legfrissebbAllasKiir(List<AllasTarolo> allasokLista) {
				System.out.println("Legfrissebb állás(ok): ");
				Date legfrissebbDatum = allasokLista.get(0).getPublikacioIdeje();
				
				for (int i = 0; i < allasokLista.size(); i++) {
					
					if (allasokLista.get(i).getPublikacioIdeje().compareTo(legfrissebbDatum)>0) {
						legfrissebbDatum = allasokLista.get(i).getPublikacioIdeje();
					}
					
				}
				
				for (AllasTarolo item : allasokLista) {
					if (item.getPublikacioIdeje().compareTo(legfrissebbDatum) == 0) {
						System.out.print(item.getId());
						System.out.print("\t");
						System.out.print(item.getMegnevezes());
						System.out.print("\t");
						System.out.printf("%tF", item.getPublikacioIdeje());
						System.out.println();
					}
				}
				
			}
	
	public String atlagMaxPozicioSzerintMeghataroz(List<AllasTarolo> allasokLista) {
		
		//mindegyik pozício csak egyszer szerepeljen a listán belül
		
		//elso megoldas - lista tartalmazás vizsgálat
		/*
		List<String> poziciok = new ArrayList<String>();
		for (AllasTarolo item : allasokLista) {
			if (!poziciok.contains(item.getMegnevezes())) {
				poziciok.add(item.getMegnevezes());
				
			}
			
		}
		*/
		
		//második megoldás - Set interface - halmazmûveletek
		Set<String> pozicizok = new HashSet<String>();
		for (int i = 0; i < allasokLista.size(); i++) {
			pozicizok.add(allasokLista.get(i).getMegnevezes());
		}

		System.out.println(pozicizok);
		
		//pozicio szerinti átlag meghatározása
		Map<String, Double> atlagPoziciok = new HashMap<String, Double>();
		for (String pozicio : pozicizok) {
		for (int i = 0; i < pozicizok.size(); i++) {	
			Double osszegTemp = 0.0;
			Double darabTemp = 0.0;
			for (AllasTarolo item : allasokLista) {
				if(pozicio.equals(item.getMegnevezes())) {
					osszegTemp += item.getBruttoFizetes();
					darabTemp++;
				}
			}
			
			atlagPoziciok.put(pozicio, osszegTemp/darabTemp);
			
		}
		
		}
		System.out.println(atlagPoziciok);
		//3. harmadik lépés: max kiválasztás
		Double maxAtlag = 0.0;
		String maxAtlagPozicio = null;
		for (Map.Entry<String, Double> item : atlagPoziciok.entrySet()) {
			if (item.getValue()>maxAtlag) {
				maxAtlag = item.getValue();
				maxAtlagPozicio = item.getKey();
			}
			
		}
		
		String valasz = maxAtlagPozicio + ", " + maxAtlag;
		return valasz;

	}

	//l feladat Átlagosan melyik pozícioban keresnek a legtöbbet
	/* ha nem ezzel csináljuk, akkor késõbb megcsinálom
	public String atlagLegtobbetKeresoAllas (List<AllasTarolo> allasokLista) {
		
		String legtobbAtlag = "";
		
		Set<String> allasTípusok = new HashSet<>();
		for (int i = 0; i < allasokLista.size(); i++) {
			allasTípusok.add(allasokLista.get(i).getMegnevezes());
		}
		Map<String, Integer> darab = new HashMap<>();
		Map<String, Integer> sum = new HashMap<>();
		Map<String, Integer> atlag = new HashMap<>();
		for (String item : allasTípusok) {
			darab.put(item, 0);
			sum.put(item, 0);
			atlag.put(item, 0);
		}
		
		
		for (int i = 0; i < allasokLista.size(); i++) {
			for (Map.Entry<String, Integer> item : darab.entrySet()) {
				if (item.getKey().equals(allasokLista.get(i).getMegnevezes())) {
					item.setValue(item.getValue()+1);
				}
			}

			for (Map.Entry<String, Integer> item : sum.entrySet()) {
				if (item.getKey().equals(allasokLista.get(i).getMegnevezes())) {
					item.setValue(item.getValue()+allasokLista.get(i).getBruttoFizetes());
				}
			}

		}

		for (Map.Entry<String, Integer> item : atlag.entrySet()) {
			
		}

		System.out.println(darab);
		System.out.println(sum);
		System.out.println(atlag);

		return legtobbAtlag;

	}
	*/

}
