package tortaGyar;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Feladatok {
	
	public void adatokKiir(List<Tortak> tortak) {
		
		for (Tortak item : tortak) {
			
			System.out.print(item.getAzonosito());
			System.out.print("\t");
			System.out.print(item.getMegnevezes());
			System.out.print("\t");
			System.out.print(item.getNetto_ar() + " forint");
			System.out.print("\t");
			System.out.print(item.getSzeletes() + " szelet");
			System.out.print("\t");
			System.out.print(item.getAkcios() == 1 ? "akciós" : "nem akciós");
			System.out.print("\t");
			System.out.print(item.getGm() == 1 ? "gluténmentes" : "nem gluténmentes");
			System.out.print("\t");
			System.out.print(item.getLm() == 1? "laktózmentes" : "nem laktózmentes");
			System.out.println();
			
		}
		

	}
	
	public long rendelhetoTortakSzama(List<Tortak> tortak) {
		
		return tortak.stream().count();
		
	}
	
	public void legdragabbTortak(List<Tortak> tortak) {
		
		int max = 0;
		
		for (Tortak item : tortak) {
			if (item.getNetto_ar() > max) {
				max = item.getNetto_ar();
			}
		}
		
		for (Tortak item : tortak) {
			if (item.getNetto_ar() == max) {
				
				System.out.println(item.getAzonosito() + ", " + item.getMegnevezes() + ", " + item.getNetto_ar());

			}
		}
		
	}
	
	public void glutenEsLaktozmentesTortak(List<Tortak> tortak) {
		
		for (Tortak item : tortak) {
			if (item.getGm() == 1 && item.getLm() == 1) {
				
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getNetto_ar() + " forint");
				System.out.print("\t");
				System.out.print(item.getSzeletes() + " szelet");
				System.out.print("\t");
				System.out.print(item.getAkcios() == 1 ? "akciós" : "nem akciós");
				System.out.print("\t");
				System.out.print(item.getGm() == 1 ? "gluténmentes" : "nem gluténmentes");
				System.out.print("\t");
				System.out.print(item.getLm() == 1? "laktózmentes" : "nem laktózmentes");
				System.out.println();
			}
		}
		
		
	}
	
	public double atlagGlutenmentesSzelet(List<Tortak> tortak) {
		
		double atlagSzelet = 0;
		double glutenMentesSzeletek = 0;
		double glutenmentesArSum = 0;
		
		for (Tortak item : tortak) {
			
			if (item.getGm() == 1) {
				
				glutenMentesSzeletek += item.getSzeletes();
				glutenmentesArSum += item.getNetto_ar();
				
			}
			
		}
		
		atlagSzelet = glutenmentesArSum / glutenMentesSzeletek;
		
		return atlagSzelet;
		
	}
	
	public double akciosSzazalek(List<Tortak> tortak) {
		
		double akciosSzazalek = 0;
		double akciosDb = 0;
		for (Tortak item : tortak) {
			
			if (item.getAkcios() == 1) {
				akciosDb++;
			}
			
		}
		
		akciosSzazalek = akciosDb / tortak.size() * 100;
		
		return akciosSzazalek;
		
	}
	
	public void mandulatTartalmazoTortanevNev(List<Tortak> tortak) {
		
		for (Tortak item : tortak) {
			
			if (item.getMegnevezes().contains("mandula")) {
				
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getNetto_ar() + " forint");
				System.out.print("\t");
				System.out.print(item.getSzeletes() + " szelet");
				System.out.print("\t");
				System.out.print(item.getAkcios() == 1 ? "akciós" : "nem akciós");
				System.out.print("\t");
				System.out.print(item.getGm() == 1 ? "gluténmentes" : "nem gluténmentes");
				System.out.print("\t");
				System.out.print(item.getLm() == 1? "laktózmentes" : "nem laktózmentes");
				System.out.println();
				
			}
			
		}
		
	}
	
	public void kereso(List<Tortak> tortak) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("Kérem a keresett szöveget: ");
			String keresettSzoveg = br.readLine();
			
			
			System.out.println("A következõ torták megnevezése tartalmazza a keresett szöveget(" + keresettSzoveg + "):");
			for (Tortak item : tortak) {
				
				if (item.getMegnevezes().contains(keresettSzoveg)) {
					
					System.out.print(item.getAzonosito());
					System.out.print("\t");
					System.out.print(item.getMegnevezes());
					System.out.print("\t");
					System.out.print(item.getNetto_ar() + " forint");
					System.out.print("\t");
					System.out.print(item.getSzeletes() + " szelet");
					System.out.print("\t");
					System.out.print(item.getAkcios() == 1 ? "akciós" : "nem akciós");
					System.out.print("\t");
					System.out.print(item.getGm() == 1 ? "gluténmentes" : "nem gluténmentes");
					System.out.print("\t");
					System.out.print(item.getLm() == 1? "laktózmentes" : "nem laktózmentes");
					System.out.println();
				}
				
			}
				
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public void bruttoArakFajlba(List<Tortak> tortak) {
		
		try {
			FileWriter fw = new FileWriter("tortaGyar_brutto.csv");
			
			for (Tortak item : tortak) {
				
				Integer bruttoAr = (int) (item.getNetto_ar() * 1.27);
				
				fw.write(item.getAzonosito());
				fw.write(";");
				fw.write(item.getMegnevezes());
				fw.write(";");
				fw.write(bruttoAr.toString());
				fw.write(";");
				fw.write(item.getSzeletes().toString());
				fw.write(";");
				fw.write(item.getAkcios().toString());
				fw.write(";");
				fw.write(item.getGm().toString());
				fw.write(";");
				fw.write(item.getLm().toString());
				fw.write("\r\n");
				
			}
			fw.close();
			System.out.println("A fájl sikeresen létrejött.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
