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
			System.out.print("Hogy hívják az oroszlánt? ");
			name = br.readLine();
		} catch (IOException e) {
			System.out.println("Input/Output hiba");
			e.printStackTrace();
		}
		
		
		//acquiring age
		boolean isValidInt = false;
		do {
			System.out.print("Hány éves az oroszlán? ");
			try {
				age = Integer.parseInt(br.readLine());
				if (age > -1 && age < 30) {
					isValidInt = true;
				} else if (age >= 30) {
					System.out.println("A valaha élt legöregebb oroszlán 29 évet élt, úgyhogy a " + age + " éves oroszlán nem túl életszerû. Adj meg egy új értéket!");
				} else {
					System.out.println("Nem valószínû, hogy egy élõlény a mínusz éveiben jár... Adj meg egy új értéket!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Számot kell megadni!");
			} catch (IOException e) {
				System.out.println("Input/Output hiba");
				e.printStackTrace();
			}
		} while (isValidInt == false);
		
		//acquiring weight
		boolean isValidBool = false;
		do {
			System.out.println("Hány kilós az oroszlán?");
			try {
				weight = Double.parseDouble(br.readLine());
				if (weight > 0 && weight < 315) {
					isValidBool = true;
				} else if (weight >= 315) {
					System.out.println("A legnagyobb oroszlán amit vala lemértek 1973-ban 313 kilós volt. Tehát a " + 
				weight + " kilós oroszlán nem túl életszerû. Adj meg egy új értéket!");
				}  else {
					System.out.println("A negatív kilós élõlény nem értelmezhetõ. Adj meg egy új értéket!");
				}
			} catch (NumberFormatException e1) {
				System.out.println("Számot kell megadni!");
			} catch (IOException e1) {
				System.out.println("Input/Output hiba");
				e1.printStackTrace();
			}
		} while (isValidBool == false);
		
		Lion userInputLion = new Lion(name, age, weight);
		
		Random r = new Random();
		
		System.out.println("A hét elején " + userInputLion.getName() + " " + userInputLion.getWeight() + " kiló volt.");
		
		for (int i = 0; i < 7; i++) {
			
			boolean successful;
			int randInt = r.nextInt(2);
			if (randInt == 1) {
				successful = true;
				System.out.println((i+1) + ". nap: a vadászat sikeres volt.");
			} else {
				successful = false;
				System.out.println((i+1) + ". nap: a vadászat sikertelen volt.");
			}
			
			userInputLion.Hunt(successful);
		
		}
		
		System.out.println("A hét végére " + userInputLion.getName() + " " + userInputLion.getWeight() + " kiló lett.");
		
		
		System.out.println();
		
		
		Lion Simba = new Lion("Simba", 5, 190);
				
		System.out.println(Simba.getName() + " súlya a hét elején " + Simba.getWeight() + ".");
		
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
		
		System.out.println(Simba.getName() + " súlya a hét végén " + Simba.getWeight() + ".");
		
		
	}

}
