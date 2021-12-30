package szotar;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Szotar {

	public static Map<String, String> szotar = new HashMap<String, String>();
	
	public static void main(String[] args) {
		
		translate();
		
		//HF befejezni
		//bek�rni, hogy angolr�l magyarra vagy magyarr�l angolra akar ford�tani (1-es vagy 2-es men�pont)
		//bek�rni az adott sz�t, amit le kell ford�tani, �s ki�rni a ford�t�st (meg kell vizsg�lni, hogy tartalmazza-e - contains)
		//kulcs alapj�n k�nnyebb (angolr�l magyarra) - a m�sikn�l is be kell j�rni ciklussal
		//megold�s lehet a k�tf�le f�jlbeolvas�s
		
		

	}

	
	public static void engToHun(String word) {

		for (Map.Entry<String, String> item : szotar.entrySet()) {
			if (item.getKey().equals(word)) {
				System.out.println("A keresett sz�: " + item.getKey() + ". A ford�t�s: " + item.getValue());
			}

		}

	}

	public static void hunToEng(String word) {

		for (Map.Entry<String, String> item : szotar.entrySet()) {
			if (item.getValue().equals(word)) {
				System.out.println("A keresett sz�: " + item.getValue() + ". A ford�t�s: " + item.getKey());
			}

		}

	}

	public static String getWord() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = "";
		try {
			System.out.print("Mi a leford�tand� sz�? ");
			word = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return word;

	}

	public static String translate() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Melyik nyelvr�l szeretne ford�tani? 1 - angol, 2 - magyar");
		
		String word = " ";
		
		try {
			
			int menuPont;
			do {
				menuPont = Integer.parseInt(br.readLine());
				if (menuPont != 1 && menuPont != 2) {
					System.out.println("Csak 1-es (angol) �s 2-es (magyar) men�pont van!");
					System.out.print("Melyik nyelvr�l szeretne ford�tani? 1 - angol, 2 - magyar");
					}
			} while (menuPont != 1 && menuPont != 2);
			
			word = getWord();
			
			switch (menuPont) {
		
			case 1:
				if (checkIfInDictEng(word)) {
					engToHun(word);
				}
				break;
			case 2:	
				if (checkIfInDictHun(word)) {
					hunToEng(word);
				}
				
				break;
			default:
				break;
			}				
			
			
		} catch (NumberFormatException e) {
			System.out.println("Sz�mot kell megadni!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return word;
		
	}
	
	public static boolean checkIfInDictHun(String value) {
		fajlBeolvas();
		boolean inDict = false;
		
		if (szotar.containsValue(value)) {
			inDict = true;
		} else {
			System.out.println("Nincs ilyen sz� a magyar szavak k�z�tt!");
		}
		
		return inDict;
		
	}
	
	public static boolean checkIfInDictEng(String key) {
		fajlBeolvas();
		boolean inDict = false;
		
		if (szotar.containsKey(key)) {
			inDict = true;
		} else {
			System.out.println("Nincs ilyen sz� az angol szavak k�z�tt!");
		}
		
		return inDict;
		
	}
	
	//static - oszt�lyszint�, nem kell p�ld�nyos�tani, �s azon kereszt�l megh�vni
	public static void fajlBeolvas () {
		
		String fajlEleresiUt = "szotar/szotar.txt";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlEleresiUt), "UTF-8"));
			while (br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				szotar.put(sorAdatok[0], sorAdatok[1]);
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}