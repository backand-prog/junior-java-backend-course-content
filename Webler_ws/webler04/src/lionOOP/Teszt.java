package lionOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Teszt {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		String name = null;
		int age = 0;
		double weight = 0;
		
		//acquiring name
		try {
			System.out.print("Hogy h�vj�k az oroszl�nt? ");
			name = br.readLine();
		} catch (IOException e) {
			System.out.println("Input/Output hiba");
			e.printStackTrace();
		}
		
		
		//acquiring age
		boolean isValidInt = false;
		do {
			System.out.print("H�ny �ves az oroszl�n? ");
			try {
				age = Integer.parseInt(br.readLine());
				if (age > -1 && age < 30) {
					isValidInt = true;
				} else if (age >= 30) {
					System.out.println("A valaha �lt leg�regebb oroszl�n 29 �vet �lt, �gyhogy a " + age + " �ves oroszl�n nem t�l �letszer�. Adj meg egy �j �rt�ket!");
				} else {
					System.out.println("Nem val�sz�n�, hogy egy �l�l�ny a m�nusz �veiben j�r... Adj meg egy �j �rt�ket!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Sz�mot kell megadni!");
			} catch (IOException e) {
				System.out.println("Input/Output hiba");
				e.printStackTrace();
			}
		} while (isValidInt == false);
		
		//acquiring weight
		boolean isValidBool = false;
		do {
			System.out.println("H�ny kil�s az oroszl�n?");
			try {
				weight = Double.parseDouble(br.readLine());
				if (weight > 0 && weight < 315) {
					isValidBool = true;
				} else if (weight >= 315) {
					System.out.println("A legnagyobb oroszl�n amit vala lem�rtek 1973-ban 313 kil�s volt. Teh�t a " + 
				weight + " kil�s oroszl�n nem t�l �letszer�. Adj meg egy �j �rt�ket!");
				}  else {
					System.out.println("A negat�v kil�s �l�l�ny nem �rtelmezhet�. Adj meg egy �j �rt�ket!");
				}
			} catch (NumberFormatException e1) {
				System.out.println("Sz�mot kell megadni!");
			} catch (IOException e1) {
				System.out.println("Input/Output hiba");
				e1.printStackTrace();
			}
		} while (isValidBool == false);
		
		Lion userInputLion = new Lion(name, age, weight);
		
		Random r = new Random();
		
		System.out.println("A h�t elej�n " + userInputLion.getName() + " " + userInputLion.getWeight() + " kil� volt.");
		
		for (int i = 0; i < 7; i++) {
			
			boolean successful;
			int randInt = r.nextInt(2);
			if (randInt == 1) {
				successful = true;
				System.out.println((i+1) + ". nap: a vad�szat sikeres volt.");
			} else {
				successful = false;
				System.out.println((i+1) + ". nap: a vad�szat sikertelen volt.");
			}
			
			userInputLion.Hunt(successful);
		
		}
		
		System.out.println("A h�t v�g�re " + userInputLion.getName() + " " + userInputLion.getWeight() + " kil� lett.");
		
		
		System.out.println();
		
		
		Lion Simba = new Lion("Simba", 5, 190);
				
		System.out.println(Simba.getName() + " s�lya a h�t elej�n " + Simba.getWeight() + ".");
		
		for (int i = 0; i < 7; i++) {
			Simba.sleep(10);
		}		
		
		for (int i = 0; i < 3; i++) {
			
			boolean successful;
			int randInt = r.nextInt(2);
			if (randInt == 1) {
				successful = true;
			} else {
				successful = false;
			}
			
			Simba.Hunt(successful);
			
		}
		
		System.out.println(Simba.getName() + " s�lya a h�t v�g�n " + Simba.getWeight() + ".");
		
		
	}

}
