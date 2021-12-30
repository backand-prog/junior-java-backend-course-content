package szineszek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Feladatok {
	
	public void adatokKiir(List<SzineszTarolo> szineszek) {
		/*
		szineszek.stream()
			.forEach(x -> System.out.println(
					x.getNev() + "\t" +
			
					(x.getNem()  == 1 ? "férfi" : "nõ") + "\t" +
						
					x.getSzul_datum() + "\t" +
					
					x.getSzul_orszag() + "\t" +
					
					x.getSzul_varos()
					
					)

			);
			*/

		for (SzineszTarolo item : szineszek) {
			System.out.print(item.getNev());
			System.out.print("\t");
			System.out.print(item.getNem() == 1 ? "férfi" : "nõ");
			System.out.print("\t");
			System.out.printf("%tF", item.getSzulDatum());
			System.out.print("\t");
			System.out.print(item.getSzulOrszag());
			System.out.print("\t");
			System.out.println(item.getSzulVaros());
		}

	}

	//b
	public void budapestenSzuletettFilmSzamKiir(List<SzineszTarolo> szineszek) {

		szineszek.stream()
			.filter(x -> x.getSzulVaros().equals("Budapest"))
			.forEach(x -> System.out.println(x.getNev() + ": " + x.getFilmSzam() + " film"));

	}

	//c
	public long berlinbenSzuletettDb(List<SzineszTarolo> szineszek) {

		return szineszek.stream().filter(x -> x.getSzulVaros().equals("Berlin")).count();

	}

	//d
	public long usabanSzuletettFerfiDb (List<SzineszTarolo> szineszek) {

		return szineszek.stream().filter(x -> x.getNem() == 1  && x.getSzulOrszag().equals("USA")).count();

	}
	
	//e
	
	public void fiatalSzineszekFajlba(List<SzineszTarolo> szineszek) {
		
		try {
			FileWriter fw = new FileWriter("fiatal_szineszek.txt");
			
			for (SzineszTarolo item : szineszek) {
				
				Calendar szulDatum = Calendar.getInstance();
				szulDatum.setTime(item.getSzulDatum());

				if (szulDatum.getWeekYear() > 1970) {
					
					fw.write(item.getNev());
					fw.write("\t");
					fw.write(item.getNem() == 1 ? "férfi" : "nõ");
					fw.write("\t");
					fw.write(szulDatum.getWeekYear() + "-" + (szulDatum.get(szulDatum.MONTH) + 1) + "-" + szulDatum.get(szulDatum.DAY_OF_MONTH));
					fw.write("\t");
					fw.write(item.getSzulOrszag());
					fw.write("\t");
					fw.write(item.getSzulVaros());
					fw.write("\t");
					fw.write(item.getFilmSzam().toString());
					
					fw.write("\r\n");
				
					
				}
				
				
			}
			fw.close();
			System.out.println("Sikeres fájlbaírás.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//f
	public int olaszorszagbanSzulOsszesFilm(List<SzineszTarolo> szineszek) {

		int sum = 0;

		for (SzineszTarolo item : szineszek) {
			if (item.getSzulOrszag().equals("Olaszország")) {
				sum = sum + item.getFilmSzam();	
			}

		}

		return sum;

	}
	
	public String legfiatalabbFerfiSzinesz(List<SzineszTarolo> szineszek) {
		
		
		Calendar maxSzulDatum = Calendar.getInstance();
		maxSzulDatum.set(1800, 01, 01);
		String valasz = "";
		
		for (SzineszTarolo item : szineszek) {
			if (item.getNem() == 1) {
				
				Calendar szulDatum = Calendar.getInstance();
				szulDatum.setTime(item.getSzulDatum());
				
				if (szulDatum.after(maxSzulDatum)) {
					maxSzulDatum = szulDatum;
				}
				
			}
			
		}

		
		for (SzineszTarolo item : szineszek) {
			Calendar szulDatum = Calendar.getInstance();
			szulDatum.setTime(item.getSzulDatum());
			if (item.getNem() == 1 && szulDatum.equals(maxSzulDatum)) {
				
				 valasz = item.getNev() + ": " + szulDatum.getWeekYear() + "-" + (szulDatum.get(szulDatum.MONTH) + 1) + "-" + szulDatum.get(szulDatum.DAY_OF_MONTH);
				
			}
		}
		
		return valasz;
		
		
	}
	
	public String legfiatalabbNoiSzinesz(List<SzineszTarolo> szineszek) {
		
		
		Calendar maxSzulDatum = Calendar.getInstance();
		maxSzulDatum.set(1800, 01, 01);
		String valasz = "";
		
		for (SzineszTarolo item : szineszek) {
			if (item.getNem() == 0) {
				
				Calendar szulDatum = Calendar.getInstance();
				szulDatum.setTime(item.getSzulDatum());
				
				if (szulDatum.after(maxSzulDatum)) {
					maxSzulDatum = szulDatum;
				}
				
			}
			
		}

		
		for (SzineszTarolo item : szineszek) {
			Calendar szulDatum = Calendar.getInstance();
			szulDatum.setTime(item.getSzulDatum());
			if (item.getNem() == 0 && szulDatum.equals(maxSzulDatum)) {
				
				 valasz = item.getNev() + ": " + szulDatum.getWeekYear() + "-" + (szulDatum.get(szulDatum.MONTH) + 1) + "-" + szulDatum.get(szulDatum.DAY_OF_MONTH);
				
			}
		}	
		
		return valasz;

	}

	public String legIdosebbSzinesz(List<SzineszTarolo> szineszek) {

		Calendar minSzulDatum = Calendar.getInstance();
		

		String valasz = "";

		for (SzineszTarolo item : szineszek) {
			
			Calendar szulDatum = Calendar.getInstance();
			szulDatum.setTime(item.getSzulDatum());
			
			if (szulDatum.before(minSzulDatum)) {
				minSzulDatum = szulDatum;
			}

		}
		
		for (SzineszTarolo item : szineszek) {
			Calendar szulDatum = Calendar.getInstance();
			szulDatum.setTime(item.getSzulDatum());
			if (szulDatum.equals(minSzulDatum)) {
				valasz = item.getNev() + ": " + szulDatum.getWeekYear() + "-" + (szulDatum.get(szulDatum.MONTH) + 1) + "-" + szulDatum.get(szulDatum.DAY_OF_MONTH);
			}
		}

		return valasz;

	}
	
	public void szeptemberbenSzuletettek(List<SzineszTarolo> szineszek) {
		
		for (SzineszTarolo item : szineszek) {
			Calendar szulDatum = Calendar.getInstance();
			szulDatum.setTime(item.getSzulDatum());
			
			if (szulDatum.get(szulDatum.MONTH) == 6) {
				
				System.out.println(item.getNev() + ": " + szulDatum.getWeekYear() + "-" + (szulDatum.get(szulDatum.MONTH) + 1) + "-" + szulDatum.get(szulDatum.DAY_OF_MONTH));
				
			}
			
			
		}
		
	}
	
	
	public String legtobbSzineszSzuletettOrszag(List<SzineszTarolo> szineszek) {
		Set<String> orszagok = new HashSet<String>();
		
		for (SzineszTarolo item : szineszek) {
			
			orszagok.add(item.getSzulOrszag());
			
		}
		
		Map<String, Integer> orszagokSzulDb = new HashMap<String, Integer>();
		
		for (String string : orszagok) {
			orszagokSzulDb.put(string, 0);
		}
		
		for (Map.Entry<String, Integer> item : orszagokSzulDb.entrySet()) {
			
			for (SzineszTarolo szinesz : szineszek) {
				
				if (szinesz.getSzulOrszag().equals(item.getKey())) {
					item.setValue(item.getValue() + 1);
				}
				
			}
			
		}
		
		// System.out.println(orszagokSzulDb);
		
		String maxOrszag = Collections.max(orszagokSzulDb.entrySet(), (x, y) -> x.getValue() - y.getValue()).getKey();
		
		return maxOrszag;
		
		

	}
	
	//k
	public void szombatonSzuletettek(List<SzineszTarolo> szineszek) {
			
			for (SzineszTarolo item : szineszek) {
				Calendar szulDatum = Calendar.getInstance();
				szulDatum.setTime(item.getSzulDatum());
				
				if (szulDatum.get(szulDatum.DAY_OF_WEEK) == 7) {
					
					System.out.println(item.getNev() + ": " + szulDatum.getWeekYear() + "-" + (szulDatum.get(szulDatum.MONTH) + 1) + "-" + szulDatum.get(szulDatum.DAY_OF_MONTH));
					
				}
				
				
			}
			
		}
	
	

}