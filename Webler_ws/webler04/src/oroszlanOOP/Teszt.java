package oroszlanOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Teszt {

	public static void main(String[] args) {
		
		//Random r = new Random();
		
		Lion simbaObj = new Lion("Simba", 5, 190);
		System.out.println("N�v: " + simbaObj.getName() + ", kor: " + simbaObj.getAge() +
		" �ves, s�ly: " + simbaObj.getWeight() + " kilogramm.");
		
		for (int i = 0; i < 7; i++) {
			simbaObj.sleep(10);
			
		}
		System.out.println("Aktu�lis s�ly: " + simbaObj.getWeight() + "kg");

		
		//e. feladat
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("K�rem adja meg az oroszl�n nev�t: ");
			String nevBekert = br.readLine();
			System.out.println("K�rem adja meg az oroszl�n �letkor�t:");
			int korBekert = Integer.parseInt(br.readLine());
			System.out.println("K�rem adja meg az oroszl�n s�ly�t?");
			double sulyBekert = Double.parseDouble(br.readLine());
		
			
			
			//1. megold�s
			Lion newLionObj = new Lion(nevBekert, korBekert, sulyBekert);
			//2. megold�s
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
			System.out.println("Az oroszl�n adatai:");
			System.out.println("N�v: "+newLionObj.getName());
			System.out.println("S�ly" + newLionObj.getWeight());
			
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
