package konzol;

import java.util.Scanner;

public class NumberFromConsole {

	public static Integer read() {

		Integer result = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Kérem, adjon meg egy számot (1-4) konzolra, vagy felette fájlba kerül írásra: ");
			result = Integer.valueOf(sc.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Nem egész számot adtál meg...");
		} finally {
			sc.close();
		}

		return result;

	}

	

}
