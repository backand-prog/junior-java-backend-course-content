package oroszlanOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Teszt {

	public static void main(String[] args) {
		
		//Random r = new Random();
		
		Lion simbaObj = new Lion("Simba", 5, 190);
		System.out.println("Név: " + simbaObj.getName() + ", kor: " + simbaObj.getAge() +
		" éves, súly: " + simbaObj.getWeight() + " kilogramm.");
		
		for (int i = 0; i < 7; i++) {
			simbaObj.sleep(10);
			
		}
		System.out.println("Aktuális súly: " + simbaObj.getWeight() + "kg");

		
		//e. feladat
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Kérem adja meg az oroszlán nevét: ");
			String nevBekert = br.readLine();
			System.out.println("Kérem adja meg az oroszlán életkorát:");
			int korBekert = Integer.parseInt(br.readLine());
			System.out.println("Kérem adja meg az oroszlán súlyát?");
			double sulyBekert = Double.parseDouble(br.readLine());
		
			
			
			//1. megoldás
			Lion newLionObj = new Lion(nevBekert, korBekert, sulyBekert);
			//2. megoldás
			/*
			Lion newLionObj2 = new Lion();
			
			newLionObj2.setName(nevBekert);
			newLionObj2.setAge(korBekert);
			newLionObj2.setWeight(sulyBekert);
		*/
			Random r = new Random();
			int velSzam = r.nextInt(2)+1;
			if (velSzam == 1) {
				newLionObj.hunt(false);
			} else {
				newLionObj.hunt(true);
			}
			System.out.println("Az oroszlán adatai:");
			System.out.println("Név: "+newLionObj.getName());
			System.out.println("Súly" + newLionObj.getWeight());
			
			br.close();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	

}
