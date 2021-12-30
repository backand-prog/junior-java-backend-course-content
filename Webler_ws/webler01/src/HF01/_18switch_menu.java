package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * K�sz�ts min. 5 men�pontb�l �ll� men�t switch-case szerkezettel! (pld. az 1-est lenyomva �rja ki:
"Az els� men�pontot v�lasztotta!�, a 2-est lenyomva �rja ki: "A m�sodik men�pontot v�lasztotta!"
stb.)
 */

public class _18switch_menu {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Men�pontok:\n1. �j j�t�k\n2. Mentett j�t�k\n3. Rekordok\n4. Credits\n5. Kil�p�s");
		System.out.print("Add meg a k�v�lasztott men�pontsz�m�t: ");
		
		int chosenMenu = Integer.parseInt(br.readLine());
		String chosenMessage = "A kiv�lasztott men�pont: ";
		
		switch (chosenMenu) {
		case 1: System.out.println(chosenMessage + "�j j�t�k");
			break;
		case 2: System.out.println(chosenMessage + "Mentett j�t�k");
			break;
		case 3: System.out.println(chosenMessage + "Rekordok");
			break;
		case 4: System.out.println(chosenMessage + "Credits");
			break;
		case 5: System.out.println(chosenMessage + "Kil�p�s");
			break;
		default: System.out.println("Nincs ilyen men�pont.");
			break;
		}
		
		br.close();
		
	}

}
