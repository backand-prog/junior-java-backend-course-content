package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Készíts min. 5 menüpontból álló menüt switch-case szerkezettel! (pld. az 1-est lenyomva írja ki:
"Az elsõ menüpontot választotta!”, a 2-est lenyomva írja ki: "A második menüpontot választotta!"
stb.)
 */

public class _18switch_menu {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Menüpontok:\n1. Új játék\n2. Mentett játék\n3. Rekordok\n4. Credits\n5. Kilépés");
		System.out.print("Add meg a kíválasztott menüpontszámát: ");
		
		int chosenMenu = Integer.parseInt(br.readLine());
		String chosenMessage = "A kiválasztott menüpont: ";
		
		switch (chosenMenu) {
		case 1: System.out.println(chosenMessage + "Új játék");
			break;
		case 2: System.out.println(chosenMessage + "Mentett játék");
			break;
		case 3: System.out.println(chosenMessage + "Rekordok");
			break;
		case 4: System.out.println(chosenMessage + "Credits");
			break;
		case 5: System.out.println(chosenMessage + "Kilépés");
			break;
		default: System.out.println("Nincs ilyen menüpont.");
			break;
		}
		
		br.close();
		
	}

}
