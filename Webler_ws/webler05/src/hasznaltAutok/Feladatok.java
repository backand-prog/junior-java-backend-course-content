package hasznaltAutok;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Feladatok {

	//a. feladat
	public void adatokKiir(List<AutoTarolo> autokLista) {
		
		for (int i = 0; i < autokLista.size(); i++) {
			System.out.print(autokLista.get(i).getAzonosito());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getMarka());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getTipus());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getMotorTerfogat());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getSzallithatoSzemelyek());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getEvjarat());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getAr());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getKilometer());
			System.out.print("\t");
			System.out.print(autokLista.get(i).getUzemanyag());
			System.out.println();
		}
		
	}
	
	//b feladat
	public int autokDarab(List<AutoTarolo> autokLista) {
		
		return autokLista.size();	
		
	}
	
	//c feladat
	
	public double benzinAutokAtlagar(List<AutoTarolo> autokLista) {
		int sumAr = 0;
		int db = 0;
		for (AutoTarolo item : autokLista) {
			if (item.getUzemanyag().equals("benzin")) {
				sumAr+=item.getAr();
				db++;
				
				
			}
			
		}
	
		return (double)(sumAr / db);
		
	}
	
	//d feladat
	public double dizelAtlagKm(List<AutoTarolo> autokLista) {
		int sumKm = 0;
		int db = 0;
		
		for (AutoTarolo item : autokLista) {
			if (item.getUzemanyag().equals("dízel")) {
				sumKm+=item.getKilometer();
				db++;
			}
		}
		
		return (double)(sumKm/db);
		
	}
	
	//e feladat
	
	public boolean vanHibrid(List<AutoTarolo> autokLista, String keresett) {
		boolean vanHibrid = false;
		int x = 0;
		
		while(x < autokLista.size() && !autokLista.get(x).getUzemanyag().equals(keresett)) {
			x++;
		}
		
		if (x<autokLista.size()) {
			vanHibrid = true;
		}
		
		
		return vanHibrid;
		
	}
	
	//f feladat
	
	public void hibasAzonositok(List<AutoTarolo> autokLista) {
		
		for (AutoTarolo item : autokLista) {
			String[] azonositoDarabol = item.getAzonosito().split("-");
			Short azonositoEvszam = Short.parseShort(azonositoDarabol[1]);
			
			if (!azonositoEvszam.equals(item.getEvjarat())) {
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMarka());
				System.out.print("\t");
				System.out.print(item.getTipus());
				System.out.print("\t");
				System.out.print(item.getMotorTerfogat());
				System.out.print("\t");
				System.out.print(item.getSzallithatoSzemelyek());
				System.out.print("\t");
				System.out.print(item.getEvjarat());
				System.out.print("\t");
				System.out.print(item.getAr());
				System.out.print("\t");
				System.out.print(item.getKilometer());
				System.out.print("\t");
				System.out.print(item.getUzemanyag());
				System.out.println();
				
			}
			
		}
		
	}
	//g feladat
	public void ujAuto(List<AutoTarolo> autokLista) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		AutoTarolo autoObj = new AutoTarolo();
		
		
		try {
			System.out.print("Mi az autó azonosítója? ");
			autoObj.setAzonosito(br.readLine());
			System.out.println("Mi az autó márkája? ");
			autoObj.setMarka(br.readLine());
			System.out.print("Mi az autó típusa?");
			autoObj.setTipus(br.readLine());
			System.out.print("Mennyi az autó motortérfogata?");
			autoObj.setMotorTerfogat(Short.parseShort(br.readLine()));
			System.out.print("Mennyi az autó által szállítható személyek száma?");
			autoObj.setSzallithatoSzemelyek(Byte.parseByte(br.readLine()));
			System.out.print("Mi az autó évjárata?");
			autoObj.setEvjarat(Short.parseShort(br.readLine()));
			System.out.print("Mi az autó ára?");
			autoObj.setAr(Integer.parseInt(br.readLine()));
			System.out.print("Hány km van az autóban?");
			autoObj.setKilometer(Integer.parseInt(br.readLine()));
			System.out.print("Milyen típusú üzemanyagot használ az autó?");
			autoObj.setUzemanyag(br.readLine());
			
			autokLista.add(9, autoObj);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	//h feladat
	
	public void legIdosebbEsFiatalabb(List<AutoTarolo> autokLista) {
		int max = autokLista.get(0).getEvjarat();
		
		for (int i = 0; i < autokLista.size(); i++) {
			if (autokLista.get(i).getEvjarat() > max) {
				max = autokLista.get(i).getEvjarat();
			}
			
		}
		
		System.out.println("A legidõsebb autó(k): ");
		for (AutoTarolo item : autokLista) {
			if (item.getEvjarat() == max) {
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMarka());
				System.out.print("\t");
				System.out.print(item.getTipus());
				System.out.print("\t");
				System.out.print(item.getMotorTerfogat());
				System.out.print("\t");
				System.out.print(item.getSzallithatoSzemelyek());
				System.out.print("\t");
				System.out.print(item.getEvjarat());
				System.out.print("\t");
				System.out.print(item.getAr());
				System.out.print("\t");
				System.out.print(item.getKilometer());
				System.out.print("\t");
				System.out.print(item.getUzemanyag());
				System.out.println();
			}
		}
		
		
		int min = autokLista.get(0).getEvjarat();
		
		for (int i = 0; i < autokLista.size(); i++) {
			if (autokLista.get(i).getEvjarat() < min) {
				min = autokLista.get(i).getEvjarat();
			}
		}
		
		System.out.println("A legkisebb évjáratú autó(k): ");
		for (AutoTarolo item : autokLista) {
			if (item.getEvjarat() == min) {
				System.out.print(item.getAzonosito());
				System.out.print("\t");
				System.out.print(item.getMarka());
				System.out.print("\t");
				System.out.print(item.getTipus());
				System.out.print("\t");
				System.out.print(item.getMotorTerfogat());
				System.out.print("\t");
				System.out.print(item.getSzallithatoSzemelyek());
				System.out.print("\t");
				System.out.print(item.getEvjarat());
				System.out.print("\t");
				System.out.print(item.getAr());
				System.out.print("\t");
				System.out.print(item.getKilometer());
				System.out.print("\t");
				System.out.print(item.getUzemanyag());
				System.out.println();
			}
		}
	}
	
	//i feladat
	
	public void statEvjarat (List<AutoTarolo> autokLista) {
		
		Set<Short> evjaratDarab = new HashSet<>();
		for (int i = 0; i < autokLista.size(); i++) {
			evjaratDarab.add(autokLista.get(i).getEvjarat());
		}
		
		Map<Short, Integer> darabPerEvjarat = new HashMap<>();
		
		for (Short item : evjaratDarab) {
			darabPerEvjarat.put(item, 0);
		}
		
		for (int i = 0; i < autokLista.size(); i++) {
			for (Map.Entry<Short, Integer> item : darabPerEvjarat.entrySet()) {
				if (item.getKey().equals(autokLista.get(i).getEvjarat())) {
					item.setValue(item.getValue()+1);
				}
				
			}	
			
		}
		
		for (Map.Entry<Short, Integer> item : darabPerEvjarat.entrySet()) {
			System.out.println(item.getKey() + ". évjárat: " + item.getValue() + " db.");			
			
		}
		
	}
	
	//j feladat
	
	public void statMarka (List<AutoTarolo> autokLista) {
		
		Set<String> markaDarab = new HashSet<>();
		
		for (int i = 0; i < autokLista.size(); i++) {
			markaDarab.add(autokLista.get(i).getMarka());
		}
		
		Map<String, Integer> darabPerMarka = new HashMap<>();
		
		for (String item : markaDarab) {
			darabPerMarka.put(item, 0);
		}
		
		for (int i = 0; i < autokLista.size(); i++) {
			for (Map.Entry<String, Integer> item : darabPerMarka.entrySet()) {
				if (item.getKey().equals(autokLista.get(i).getMarka())) {
					item.setValue(item.getValue()+1);
				}
			}
		}
		
		for (Map.Entry<String, Integer> item : darabPerMarka.entrySet()) {

			System.out.println(item.getKey() + ": " + item.getValue() + " db.");
			
			
		}
		
		
	}
	
	//k feladat
	
	public void dizelFajlba (List<AutoTarolo> autokLista) {
		
		try {
			FileWriter fw = new FileWriter("dizel.txt", false);
			for (int i = 0; i < autokLista.size(); i++) {
				if (autokLista.get(i).getUzemanyag().equals("dízel")) {
					fw.write(autokLista.get(i).getAzonosito());
					fw.write("\t");
					fw.write(autokLista.get(i).getMarka());
					fw.write("\t");
					fw.write(autokLista.get(i).getTipus());
					fw.write("\t");
					fw.write(autokLista.get(i).getMotorTerfogat().toString());
					fw.write("\t");
					fw.write(autokLista.get(i).getSzallithatoSzemelyek().toString());
					fw.write("\t");
					fw.write(autokLista.get(i).getEvjarat().toString());
					fw.write("\t");
					fw.write(autokLista.get(i).getAr().toString());
					fw.write("\t");
					fw.write(autokLista.get(i).getKilometer().toString());
					fw.write("\t");
					fw.write(autokLista.get(i).getUzemanyag());
					fw.write("\r\n");
					
				}
				
			}
			
			fw.close();
			System.out.println("A fájl elkészült.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
		
}
	
	
	

