package sandbox;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Tomb {

	public static void main(String[] args) {
		int[] tomb = Tombfeltolt(10);
		TombKiir(tomb);
		System.out.println();
		System.out.println("A legkisebb elem: " + TombMin(tomb));
		System.out.println("A legnagyobb elem: " + TombMax(tomb));
		System.out.println("Az elemek összege: " + TombOsszegSzamol(tomb));
		System.out.println("Az elemek átlaga: "+ TombAtlagSzamol(tomb));
		TombKiir(TombRendez(tomb));
		System.out.println();
		System.out.println(TombBenneVan(tomb, 10));
		
		try {
			FileWriter fw = new FileWriter("hazi_feladat.txt", false);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TombFajlbaIr("A tömb elemei: ", tomb);
		TombFajlbaIr("A legkisebb elem: ", TombMin(tomb));
		TombFajlbaIr("A legnagyobb elem: ", TombMax(tomb));
		TombFajlbaIr("Az elemek összege: ", TombOsszegSzamol(tomb));
		TombFajlbaIr("Az elemek átlaga: ", TombAtlagSzamol(tomb));
		TombFajlbaIr("A rendezett tömb elemei: ", TombRendez(tomb));
		TombFajlbaIr(TombBenneVan(tomb, 10));
		
	}
	
	public static void TombFajlbaIr (boolean benneVan) {
		
		try {
			FileWriter fw = new FileWriter("hazi_feladat.txt", true);
			if (benneVan) {
				fw.write("A keresett szám benne volt.");
			} else {
				fw.write("A keresett szám nem volt benne.");
			}
			
			fw.write("\r\n");
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void TombFajlbaIr (String szoveg, int[] eredmeny) {
		
		try {
			FileWriter fw = new FileWriter("hazi_feladat.txt", true);
			fw.write(szoveg);
			for (int i = 0; i < eredmeny.length; i++) {
				fw.write(eredmeny[i] + " ");
			}
			fw.write("\r\n");
			fw.close();	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void TombFajlbaIr (String szoveg, int eredmeny) {
		
		try {
			FileWriter fw = new FileWriter("hazi_feladat.txt", true);
			fw.write(szoveg + eredmeny);
			fw.write("\r\n");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void TombFajlbaIr (String szoveg, double eredmeny) {
		
		try {
			FileWriter fw = new FileWriter("hazi_feladat.txt", true);
			fw.write(szoveg + eredmeny);
			fw.write("\r\n");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}


	
	public static boolean TombBenneVan(int[] tomb, int keresett) {
	
		boolean isInIt = false;
		int x = 0;
		
		while (x < tomb.length && tomb[x] != keresett) {
			x++;
		}
		
		if (x < tomb.length) {
			isInIt = true;
		}
		
		return isInIt;
		
	}
	
	public static int[] TombRendez (int[] tomb) {
		for (int i = 0; i < tomb.length-1; i++) {
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[i] > tomb[j]) {
					int csere = tomb[j];
					tomb[j] = tomb[i];
					tomb[i] = csere;
					
				}
			}
		}
		
		return tomb;
	}
	
	public static double TombAtlagSzamol(int[] tomb) {
		
		int szamlalo = 0;
		for (int i = 0; i < tomb.length; i++) {
			szamlalo++;
		}
		
		int sum = 0;
		for (int i = 0; i < tomb.length; i++) {
			sum+=tomb[i];
		}
		
		double atlag = sum / szamlalo; 	
		
		return atlag;
		
		
	}
	
	public static int TombOsszegSzamol(int[] tomb) {
		int sum = 0;
		for (int i = 0; i < tomb.length; i++) {
			sum+=tomb[i];
		}
		
		
		return sum;
		
		
	}
	
	public static int TombMax(int[] tomb) {
		int max = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] > max) {
				max = tomb[i];
			}
		}
		return max;
	}
	
	public static int TombMin(int[] tomb) {
		int min = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] < min) {
				min = tomb[i];
			}
		}
		
		return min;
	}
	
	public static void TombKiir (int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
	
	public static int[] Tombfeltolt (int meret) {
		
		Random r = new Random();
		
		int[] tomb = new int[meret];
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = r.nextInt(50) + 1;
		}
		
		return tomb;
		
	}

}
