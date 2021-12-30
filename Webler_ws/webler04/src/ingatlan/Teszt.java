package ingatlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teszt {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//megnevezés bekérése
		String megnevezes = "";
		System.out.print("Mi az ingatlan megnevezése? ");
		try {
			megnevezes = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//négyzetméter bekérése
		int nm = 0;
		boolean isValidNm = false;
		System.out.print("Hány négyzetméter az ingatlan?");
		do {
			try {
				nm = Integer.parseInt(br.readLine());
				if (0 < nm) {
					isValidNm = true;
				} else {
					System.out.println("Nullánál nagyobb négyzetmétert adj meg!");
				}	
			} catch (NumberFormatException e) {
				System.out.println("Pozitív egész számot kell megadni négymetméternek!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (isValidNm == false);
		
		//irányítószám bekérése
		int iranyitoszam = 0;
		boolean isValidIranyitoszam = false;
		do {
			try {
				System.out.print("Mi az irányítószám?");
				iranyitoszam = Integer.parseInt(br.readLine());
				int iranyitoszamHossz = Integer.toString(iranyitoszam).length();
				if (iranyitoszam > 0 && iranyitoszamHossz == 4) {
					isValidIranyitoszam = true;
				} else if (iranyitoszam < 0) {
					System.out.println("Az irányítószám nem lehet negatív!");
				} else if (iranyitoszamHossz < 4 || iranyitoszamHossz > 4){
					System.out.println("Az irányítószámnak 4 számjegy hosszúnak kell lennie!");
				} 
			} catch (NumberFormatException e) {
				System.out.println("Az irányítószámnak számnak kell lennie!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (isValidIranyitoszam == false);
		
		//város bekésére
		String varos = "";
		System.out.print("Mi a város? ");
		try {
			varos = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//cím bekésére
		String cim = "";
		System.out.print("Mi a cím? ");
		try {
			cim = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//szobák számának bekérése
		int szobakSzama = 0;
		boolean isValidNum = false;
		System.out.print("Hány szoba van az ingatlanban?");
		do {
			try {
				szobakSzama = Integer.parseInt(br.readLine());
				if (szobakSzama > 0) {
					isValidNum = true;
				} else {
					System.out.println("Nem lehet negatív szám a szobák száma!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Pozitív egész számot kell megadni!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (isValidNum == false);
		
		
		Ingatlan ingatlan = new Ingatlan(megnevezes, nm, iranyitoszam, varos, cim, szobakSzama);
		
		ingatlan.printAllData();
		ingatlan.isCapital(ingatlan.getVaros());
		ingatlan.isEnoughForBigFams(ingatlan.getNegyzetmeter());
		
	}

}
