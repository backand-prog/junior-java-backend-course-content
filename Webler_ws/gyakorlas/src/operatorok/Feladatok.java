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
		
		System.out.println("�sszead�s m�veletek sz�ma: " + osszeadasDb);
		System.out.println("Kivon�s m�veletek sz�ma: " + kivonasDb);
		System.out.println("Szorz�s m�veletek sz�ma: " + szorzasDb);
		System.out.println("Val�s oszt�s m�veletek sz�ma: " + valosOsztasDb);
		System.out.println("Eg�sz oszt�s m�veletek sz�ma: " + egeszOsztasDb);
		System.out.println("Marad�kos oszt�s m�veletek sz�ma: " + maradekosOsztasDb);

	}
	
	public String szamoloGep () {
		String eredmeny = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] muveletek = {"+", "-", "*", "/", "div", "mod"};
		
		try {
			System.out.print("K�rem az els� operandust! ");
			int operandus1 = Integer.parseInt(br.readLine());
			System.out.print("K�rem a m�sodik operandust!" );
			int operandus2 = Integer.parseInt(br.readLine());
			System.out.print("K�rem az oper�tort!" );
			String operator = br.readLine();
			
			if (!Arrays.asList(muveletek).contains(operator)) {
				System.out.println("Ismeretlen ope�tor!");
			} else if (operator.equals(muveletek[0])) {
				System.out.println(operandus1 + operandus2);
			} else if (operator.equals(muveletek[1])) {
				System.out.println(operandus1 - operandus2);
			} else if (operator.equals(muveletek[2])) {
				System.out.println(operandus1 * operandus2);
			} else if (operator.equals(muveletek[3])) {
				if (operandus2 == 0) {
					System.out.println("Null�val nem osztunk");
				} else {
					System.out.println(operandus1 / operandus2);
				}
			} else if (operator.equals(muveletek[4])) {
				if (operandus2 == 0) {
					System.out.println("Null�val nem osztunk");
				} else {
					System.out.println(operandus1 / operandus2);
				}
			} else if (operator.equals(muveletek[5])) {
				if (operandus2 == 0) {
					System.out.println("Null�val nem osztunk");
				} else {
					System.out.println(operandus1 % operandus2);
				}
			}
			
			
		
		} catch (NumberFormatException e) {
			System.out.println("Sz�mot kell megadni az operandusoknak!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eredmeny;
		
		
		
	}
	
	

}
