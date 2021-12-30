package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * K�rd be k�t dolgoz� nev�t, beoszt�s�t �s fizet�s�t, majd �rd ki a t�bbet keres� munkav�llal�
minden adat�t egym�s mell�! Lehets�ges, hogy ugyanannyit keresnek, ebben az esetben azt �rd ki:
�Fizet�s�k egyenl�.�!
 */

public class _12dolgozo_tobbletkeres {

	public static void main(String[] args) throws IOException {
	
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//els� dolgoz� adatai
		System.out.print("K�rem, add meg az els� dolgoz� nev�t!");
		String worker1Name = sc.nextLine();
		System.out.print("K�rem, add meg az els� dolgoz� beoszt�s�t!");
		String worker1Position = sc.nextLine();
		System.out.print("K�rem, add meg az els� dolgoz� fizet�s�t!");
		int worker1Salary = Integer.parseInt(sc.nextLine());
		//m�sodik dolgoz� adatai
		System.out.print("K�rem, add meg a m�sodik dolgoz� nev�t!");
		String worker2Name = sc.nextLine();
		System.out.print("K�rem, add meg a m�sodik dolgoz� beoszt�s�t!");
		String worker2Position = sc.nextLine();
		System.out.print("K�rem, add meg a m�sodik dolgoz� fizet�s�t!");
		int worker2Salary = Integer.parseInt(sc.nextLine());
		
		if (worker1Salary > worker2Salary) {
			System.out.println("A jobban keres� dolgoz�: N�v: " + worker1Name + ", Beoszt�s: " + worker1Position + ", Fizet�s: " + worker1Salary + " Ft."); 
		} else if (worker1Salary < worker2Salary) {
			System.out.println("A jobban keres� dolgoz�: N�v: " + worker2Name + ", Beoszt�s: " + worker2Position + ", Fizet�s: " + worker2Salary + " Ft.");
		} else {
			System.out.println("Fizet�s�k egyenl�.");
		}
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nFeladat megold�sa BufferedReaderrel");
		
		//els� dolgoz� adatai
		System.out.print("K�rem, add meg az els� dolgoz� nev�t!");
		String worker3Name = br.readLine();
		System.out.print("K�rem, add meg az els� dolgoz� beoszt�s�t!");
		String worker3Position = br.readLine();
		System.out.print("K�rem, add meg az els� dolgoz� fizet�s�t!");
		int worker3Salary = Integer.parseInt(br.readLine());
		//m�sodik dolgoz� adatai
		System.out.print("K�rem, add meg a m�sodik dolgoz� nev�t!");
		String worker4Name = br.readLine();
		System.out.print("K�rem, add meg a m�sodik dolgoz� beoszt�s�t!");
		String worker4Position = br.readLine();
		System.out.print("K�rem, add meg a m�sodik dolgoz� fizet�s�t!");
		int worker4Salary = Integer.parseInt(br.readLine());	
		
		if (worker3Salary > worker4Salary) {
			System.out.println("A jobban keres� dolgoz�: N�v: " + worker3Name + ", Beoszt�s: " + worker3Position + ", Fizet�s: " + worker3Salary + " Ft."); 
		} else if (worker3Salary < worker4Salary) {
			System.out.println("A jobban keres� dolgoz�: N�v: " + worker4Name + ", Beoszt�s: " + worker4Position + ", Fizet�s: " + worker4Salary + " Ft.");
		} else {
			System.out.println("Fizet�s�k egyenl�.");
		}
		
		sc.close();
		br.close();

	}

}
