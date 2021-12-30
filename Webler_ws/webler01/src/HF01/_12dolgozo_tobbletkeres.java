package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Kérd be két dolgozó nevét, beosztását és fizetését, majd írd ki a többet keresõ munkavállaló
minden adatát egymás mellé! Lehetséges, hogy ugyanannyit keresnek, ebben az esetben azt írd ki:
„Fizetésük egyenlõ.”!
 */

public class _12dolgozo_tobbletkeres {

	public static void main(String[] args) throws IOException {
	
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//elsõ dolgozó adatai
		System.out.print("Kérem, add meg az elsõ dolgozó nevét!");
		String worker1Name = sc.nextLine();
		System.out.print("Kérem, add meg az elsõ dolgozó beosztását!");
		String worker1Position = sc.nextLine();
		System.out.print("Kérem, add meg az elsõ dolgozó fizetését!");
		int worker1Salary = Integer.parseInt(sc.nextLine());
		//második dolgozó adatai
		System.out.print("Kérem, add meg a második dolgozó nevét!");
		String worker2Name = sc.nextLine();
		System.out.print("Kérem, add meg a második dolgozó beosztását!");
		String worker2Position = sc.nextLine();
		System.out.print("Kérem, add meg a második dolgozó fizetését!");
		int worker2Salary = Integer.parseInt(sc.nextLine());
		
		if (worker1Salary > worker2Salary) {
			System.out.println("A jobban keresõ dolgozó: Név: " + worker1Name + ", Beosztás: " + worker1Position + ", Fizetés: " + worker1Salary + " Ft."); 
		} else if (worker1Salary < worker2Salary) {
			System.out.println("A jobban keresõ dolgozó: Név: " + worker2Name + ", Beosztás: " + worker2Position + ", Fizetés: " + worker2Salary + " Ft.");
		} else {
			System.out.println("Fizetésük egyenlõ.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nFeladat megoldása BufferedReaderrel");
		
		//elsõ dolgozó adatai
		System.out.print("Kérem, add meg az elsõ dolgozó nevét!");
		String worker3Name = br.readLine();
		System.out.print("Kérem, add meg az elsõ dolgozó beosztását!");
		String worker3Position = br.readLine();
		System.out.print("Kérem, add meg az elsõ dolgozó fizetését!");
		int worker3Salary = Integer.parseInt(br.readLine());
		//második dolgozó adatai
		System.out.print("Kérem, add meg a második dolgozó nevét!");
		String worker4Name = br.readLine();
		System.out.print("Kérem, add meg a második dolgozó beosztását!");
		String worker4Position = br.readLine();
		System.out.print("Kérem, add meg a második dolgozó fizetését!");
		int worker4Salary = Integer.parseInt(br.readLine());	
		
		if (worker3Salary > worker4Salary) {
			System.out.println("A jobban keresõ dolgozó: Név: " + worker3Name + ", Beosztás: " + worker3Position + ", Fizetés: " + worker3Salary + " Ft."); 
		} else if (worker3Salary < worker4Salary) {
			System.out.println("A jobban keresõ dolgozó: Név: " + worker4Name + ", Beosztás: " + worker4Position + ", Fizetés: " + worker4Salary + " Ft.");
		} else {
			System.out.println("Fizetésük egyenlõ.");
		}
		
		sc.close();
		br.close();

	}

}
