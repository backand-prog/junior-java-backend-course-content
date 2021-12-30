package diak;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Futattas {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
			System.out.print("Mi a diák vezetékneve?");
			String vezeteknev1 = br.readLine();
			System.out.print("Mi a diák keresztneve?");
			String keresztnev1 = br.readLine();
			System.out.print(vezeteknev1 + " " + keresztnev1 + " hány órát hiányzott?");
			int igazolatlanOrak = Integer.parseInt(br.readLine());
		
			
			Diak diakObj = new Diak(vezeteknev1, keresztnev1, igazolatlanOrak);

			if (diakObj.alertParents()) {
				System.out.println("Értesíteni kell a szülõket!");
			}
			
			if (diakObj.alertParents() == true) {
				diakObj.letter();
			}
			
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
