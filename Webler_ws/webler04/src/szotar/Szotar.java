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
		//bekérni, hogy angolról magyarra vagy magyarról angolra akar fordítani (1-es vagy 2-es menüpont)
		//bekérni az adott szót, amit le kell fordítani, és kiírni a fordítást (meg kell vizsgálni, hogy tartalmazza-e - contains)
		//kulcs alapján könnyebb (angolról magyarra) - a másiknál is be kell járni ciklussal
		//megoldás lehet a kétféle fájlbeolvasás
		
		

	}

	
	public static void engToHun(String word) {

		for (Map.Entry<String, String> item : szotar.entrySet()) {
			if (item.getKey().equals(word)) {
				System.out.println("A keresett szó: " + item.getKey() + ". A fordítás: " + item.getValue());
			}

		}

	}

	public static void hunToEng(String word) {

		for (Map.Entry<String, String> item : szotar.entrySet()) {
			if (item.getValue().equals(word)) {
				System.out.println("A keresett szó: " + item.getValue() + ". A fordítás: " + item.getKey());
			}

		}

	}

	public static String getWord() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = "";
		try {
			System.out.print("Mi a lefordítandó szó? ");
			word = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return word;

	}

	public static String translate() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Melyik nyelvrõl szeretne fordítani? 1 - angol, 2 - magyar");
		
		String word = " ";
		
		try {
			
			int menuPont;
			do {
				menuPont = Integer.parseInt(br.readLine());
				if (menuPont != 1 && menuPont != 2) {
					System.out.println("Csak 1-es (angol) és 2-es (magyar) menüpont van!");
					System.out.print("Melyik nyelvrõl szeretne fordítani? 1 - angol, 2 - magyar");
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
			System.out.println("Számot kell megadni!");
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
			System.out.println("Nincs ilyen szó a magyar szavak között!");
		}
		
		return inDict;
		
	}
	
	public static boolean checkIfInDictEng(String key) {
		fajlBeolvas();
		boolean inDict = false;
		
		if (szotar.containsKey(key)) {
			inDict = true;
		} else {
			System.out.println("Nincs ilyen szó az angol szavak között!");
		}
		
		return inDict;
		
	}
	
	//static - osztályszintû, nem kell példányosítani, és azon keresztül meghívni
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