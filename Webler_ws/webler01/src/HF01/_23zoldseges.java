package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * H�romf�le term�ket v�s�rolunk: alm�t (240 Ft / kg), szilv�t (310 Ft/kg) �s sz�l�t (650 Ft/kg). A
program k�rje be a v�s�rolt mennyis�geket, majd �rja ki az �rakat t�telenk�nt �s a v�g�sszeget is!
T�j�koztasd a felhaszn�l�t az egys�g�rakr�l is!
 */

public class _23zoldseges {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int applePrice = 240;
		int plumPrice = 310;
		int grapePrice = 650;
		
		System.out.print("K�rem a v�s�rolni k�v�nt alma mennyis�get(kg): ");
		int appleAmount = Integer.parseInt(br.readLine());
		System.out.print("K�rem a v�s�rolni k�v�nt szilva mennyis�get(kg): ");
		int plumAmount = Integer.parseInt(br.readLine());
		System.out.print("K�rem a v�s�rolni k�v�nt sz�l� mennyis�get(kg): ");
		int grapeAmount = Integer.parseInt(br.readLine());
		
		int appleFullPrice = appleAmount * applePrice;
		int plumFullPrice = plumAmount * plumPrice;
		int grapeFullPrice = grapeAmount * grapePrice;
		
		int fullPrice = appleFullPrice + plumFullPrice + grapeFullPrice;
		
		
		System.out.println("Az alma �ra: " + applePrice + " Ft/kg.\nA szilva �ra: " + plumPrice + " Ft/kg.\nA sz�l� �ra: " + grapePrice + " Ft/kg");
		System.out.println("Az alma mennyis�ge: " + appleAmount + " kg. Az alma teljes �ra �gy: " + appleFullPrice + " Forint.");
		System.out.println("Az szilva mennyis�ge: " + plumAmount + " kg. Az szilva teljes �ra �gy: " + plumFullPrice + " Forint.");
		System.out.println("Az sz�l� mennyis�ge: " + grapeFullPrice + " kg. Az sz�l� teljes �ra �gy: " + grapeFullPrice + " Forint.");
		
		System.out.println("A teljes v�tel�r: " + fullPrice + " Forint.");
		
		
		br.close();
		
	}

}
