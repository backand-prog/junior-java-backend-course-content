package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03AtlagFizetes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String months[] = {"január", "február", "március", "április", "május", "június"};
		int sumSalary = 0;
		
		for (int i = 0; i < months.length; i++) {
			System.out.print("Adja meg a " + months[i] + "ban kapott fizetését: ") ;
			int salary = Integer.parseInt(br.readLine());
			sumSalary += salary;
	
		}
		
		double avgSalary = (double)sumSalary / months.length;
		
		System.out.println("A dolgozó átlagkeresete januártól júniusig: " + (int)avgSalary + " forint.");
		System.out.println("Összesen " + sumSalary + " forintot keresett ebben az idõszakban");
	
	}

}
