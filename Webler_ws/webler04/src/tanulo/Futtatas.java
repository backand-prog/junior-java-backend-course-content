package tanulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Futtatas {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Mi az els� tanul� vezet�kneve?");
			String vezeteknev1 = br.readLine();
			System.out.print("Mi az els� tanul� keresztneve?");
			String keresztnev1 = br.readLine();
			System.out.print("Mennyi " + vezeteknev1 + " " + keresztnev1 + " �tlaga?(1-5) ");
			double atlag1 = Double.parseDouble(br.readLine());
			/*
			System.out.print("Mi a m�sodik tanul� vezet�kneve?");
			String vezeteknev2 = br.readLine();
			System.out.print("Mi a m�sodik tanul� tanul� keresztneve?");
			String keresztnev2 = br.readLine();
			System.out.print("Mennyi " + vezeteknev2 + " " + keresztnev2 + " �tlaga?(1-5) ");
			double atlag2 = Double.parseDouble(br.readLine());
			*/
			Tanulo tanulo1 = new Tanulo(vezeteknev1, keresztnev1, atlag1);
			//Tanulo tanulo2 = new Tanulo(vezeteknev2, keresztnev2, atlag2);
			
			tanulo1.printData();
			tanulo1.alertParent();
			tanulo1.getPraise();
			
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	
	}

}
