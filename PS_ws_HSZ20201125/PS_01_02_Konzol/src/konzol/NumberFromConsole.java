package konzol;

import java.util.Scanner;

public class NumberFromConsole {

	public static Integer read() {

		Integer result = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("K�rem, adjon meg egy sz�mot (1-4) konzolra, vagy felette f�jlba ker�l �r�sra: ");
			result = Integer.valueOf(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Nem eg�sz sz�mot adt�l meg...");
		} finally {
			sc.close();
		}

		return result;

	}

	

}
