package operatorok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Feladatok {
	
	//2. feladat
	public int kifejezesDb (List<OperatorTarolo> kifejezesek) {
		
		return kifejezesek.size();
		
	}
	
	//3. feladat
	public int maradekosDb (List<OperatorTarolo> kifejezesek) {
		
		int maradekosDb = 0;
		
		for (OperatorTarolo item : kifejezesek) {
			if (item.getOperator().equals("mod")) {
				maradekosDb++;
			}
		}
		
		return maradekosDb;
			
	}
	
	//4. feladat
	
	public boolean mindketOperandusTizzelOszthatoEldont(List<OperatorTarolo> kifejezesek) {
		
		boolean oszthatok = false;
		int x = 0;

		while (kifejezesek.size() > x && (kifejezesek.get(x).getMasodikOperandus() % 10 != 0 || kifejezesek.get(x).getElsoOperandus() % 10 != 0)) {
			
			x++;
		}
		
		if (kifejezesek.size() > x) {
			oszthatok = true;
		}
		

		return oszthatok;
		
		
	}
	
	//5. feladat
	public void muveletekStatisztika(List<OperatorTarolo> kifejezesek) {
		
		int osszeadasDb = 0;
		int kivonasDb = 0;
		int szorzasDb = 0;
		int valosOsztasDb = 0;
		int egeszOsztasDb = 0;
		int maradekosOsztasDb = 0;
		
		for (OperatorTarolo item : kifejezesek) {
			switch (item.getOperator()) {
			case "+":
				osszeadasDb++;
				break;
			case "-":
				kivonasDb++;
				break;	
			case "*":
				szorzasDb++;
				break;
			case "/":
				valosOsztasDb++;
				break;
			case "div":
				egeszOsztasDb++;
				break;
			case "mod":
				maradekosOsztasDb++;
				break;
			default:
				break;
			}
			
			
		}
		
		System.out.println("Összeadás mûveletek száma: " + osszeadasDb);
		System.out.println("Kivonás mûveletek száma: " + kivonasDb);
		System.out.println("Szorzás mûveletek száma: " + szorzasDb);
		System.out.println("Valós osztás mûveletek száma: " + valosOsztasDb);
		System.out.println("Egész osztás mûveletek száma: " + egeszOsztasDb);
		System.out.println("Maradékos osztás mûveletek száma: " + maradekosOsztasDb);

	}
	
	public String szamoloGep () {
		String eredmeny = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] muveletek = {"+", "-", "*", "/", "div", "mod"};
		
		try {
			System.out.print("Kérem az elsõ operandust! ");
			int operandus1 = Integer.parseInt(br.readLine());
			System.out.print("Kérem a második operandust!" );
			int operandus2 = Integer.parseInt(br.readLine());
			System.out.print("Kérem az operátort!" );
			String operator = br.readLine();
			
			if (!Arrays.asList(muveletek).contains(operator)) {
				System.out.println("Ismeretlen opeátor!");
			} else if (operator.equals(muveletek[0])) {
				System.out.println(operandus1 + operandus2);
			} else if (operator.equals(muveletek[1])) {
				System.out.println(operandus1 - operandus2);
			} else if (operator.equals(muveletek[2])) {
				System.out.println(operandus1 * operandus2);
			} else if (operator.equals(muveletek[3])) {
				if (operandus2 == 0) {
					System.out.println("Nullával nem osztunk");
				} else {
					System.out.println(operandus1 / operandus2);
				}
			} else if (operator.equals(muveletek[4])) {
				if (operandus2 == 0) {
					System.out.println("Nullával nem osztunk");
				} else {
					System.out.println(operandus1 / operandus2);
				}
			} else if (operator.equals(muveletek[5])) {
				if (operandus2 == 0) {
					System.out.println("Nullával nem osztunk");
				} else {
					System.out.println(operandus1 % operandus2);
				}
			}
			
			
		
		} catch (NumberFormatException e) {
			System.out.println("Számot kell megadni az operandusoknak!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eredmeny;
		
		
		
	}
	
	

}
