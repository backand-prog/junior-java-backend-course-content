package ingatlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teszt {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//megnevez�s bek�r�se
		String megnevezes = "";
		System.out.print("Mi az ingatlan megnevez�se? ");
		try {
			megnevezes = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//n�gyzetm�ter bek�r�se
		int nm = 0;
		boolean isValidNm = false;
		System.out.print("H�ny n�gyzetm�ter az ingatlan?");
		do {
			try {
				nm = Integer.parseInt(br.readLine());
				if (0 < nm) {
					isValidNm = true;
				} else {
					System.out.println("Null�n�l nagyobb n�gyzetm�tert adj meg!");
				}	
			} catch (NumberFormatException e) {
				System.out.println("Pozit�v eg�sz sz�mot kell megadni n�gymetm�ternek!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (isValidNm == false);
		
		//ir�ny�t�sz�m bek�r�se
		int iranyitoszam = 0;
		boolean isValidIranyitoszam = false;
		do {
			try {
				System.out.print("Mi az ir�ny�t�sz�m?");
				iranyitoszam = Integer.parseInt(br.readLine());
				int iranyitoszamHossz = Integer.toString(iranyitoszam).length();
				if (iranyitoszam > 0 && iranyitoszamHossz == 4) {
					isValidIranyitoszam = true;
				} else if (iranyitoszam < 0) {
					System.out.println("Az ir�ny�t�sz�m nem lehet negat�v!");
				} else if (iranyitoszamHossz < 4 || iranyitoszamHossz > 4){
					System.out.println("Az ir�ny�t�sz�mnak 4 sz�mjegy hossz�nak kell lennie!");
				} 
			} catch (NumberFormatException e) {
				System.out.println("Az ir�ny�t�sz�mnak sz�mnak kell lennie!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (isValidIranyitoszam == false);
		
		//v�ros bek�s�re
		String varos = "";
		System.out.print("Mi a v�ros? ");
		try {
			varos = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//c�m bek�s�re
		String cim = "";
		System.out.print("Mi a c�m? ");
		try {
			cim = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//szob�k sz�m�nak bek�r�se
		int szobakSzama = 0;
		boolean isValidNum = false;
		System.out.print("H�ny szoba van az ingatlanban?");
		do {
			try {
				szobakSzama = Integer.parseInt(br.readLine());
				if (szobakSzama > 0) {
					isValidNum = true;
				} else {
					System.out.println("Nem lehet negat�v sz�m a szob�k sz�ma!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Pozit�v eg�sz sz�mot kell megadni!");
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
