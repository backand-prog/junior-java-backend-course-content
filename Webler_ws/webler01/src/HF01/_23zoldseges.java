package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Háromféle terméket vásárolunk: almát (240 Ft / kg), szilvát (310 Ft/kg) és szõlõt (650 Ft/kg). A
program kérje be a vásárolt mennyiségeket, majd írja ki az árakat tételenként és a végösszeget is!
Tájékoztasd a felhasználót az egységárakról is!
 */

public class _23zoldseges {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int applePrice = 240;
		int plumPrice = 310;
		int grapePrice = 650;
		
		System.out.print("Kérem a vásárolni kívánt alma mennyiséget(kg): ");
		int appleAmount = Integer.parseInt(br.readLine());
		System.out.print("Kérem a vásárolni kívánt szilva mennyiséget(kg): ");
		int plumAmount = Integer.parseInt(br.readLine());
		System.out.print("Kérem a vásárolni kívánt szõlõ mennyiséget(kg): ");
		int grapeAmount = Integer.parseInt(br.readLine());
		
		int appleFullPrice = appleAmount * applePrice;
		int plumFullPrice = plumAmount * plumPrice;
		int grapeFullPrice = grapeAmount * grapePrice;
		
		int fullPrice = appleFullPrice + plumFullPrice + grapeFullPrice;
		
		
		System.out.println("Az alma ára: " + applePrice + " Ft/kg.\nA szilva ára: " + plumPrice + " Ft/kg.\nA szõlõ ára: " + grapePrice + " Ft/kg");
		System.out.println("Az alma mennyisége: " + appleAmount + " kg. Az alma teljes ára így: " + appleFullPrice + " Forint.");
		System.out.println("Az szilva mennyisége: " + plumAmount + " kg. Az szilva teljes ára így: " + plumFullPrice + " Forint.");
		System.out.println("Az szõlõ mennyisége: " + grapeFullPrice + " kg. Az szõlõ teljes ára így: " + grapeFullPrice + " Forint.");
		
		System.out.println("A teljes vételár: " + fullPrice + " Forint.");
		
		
		br.close();
		
	}

}
