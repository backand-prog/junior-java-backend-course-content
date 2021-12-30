package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03AtlagFizetes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String months[] = {"janu�r", "febru�r", "m�rcius", "�prilis", "m�jus", "j�nius"};
		int sumSalary = 0;
		
		for (int i = 0; i < months.length; i++) {
			System.out.print("Adja meg a " + months[i] + "ban kapott fizet�s�t: ") ;
			int salary = Integer.parseInt(br.readLine());
			sumSalary += salary;
	
		}
		
		double avgSalary = (double)sumSalary / months.length;
		
		System.out.println("A dolgoz� �tlagkeresete janu�rt�l j�niusig: " + (int)avgSalary + " forint.");
		System.out.println("�sszesen " + sumSalary + " forintot keresett ebben az id�szakban");
	
	}

}
