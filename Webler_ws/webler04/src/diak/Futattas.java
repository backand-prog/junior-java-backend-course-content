package diak;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Futattas {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
			System.out.print("Mi a di�k vezet�kneve?");
			String vezeteknev1 = br.readLine();
			System.out.print("Mi a di�k keresztneve?");
			String keresztnev1 = br.readLine();
			System.out.print(vezeteknev1 + " " + keresztnev1 + " h�ny �r�t hi�nyzott?");
			int igazolatlanOrak = Integer.parseInt(br.readLine());
		
			
			Diak diakObj = new Diak(vezeteknev1, keresztnev1, igazolatlanOrak);

			if (diakObj.alertParents()) {
				System.out.println("�rtes�teni kell a sz�l�ket!");
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
