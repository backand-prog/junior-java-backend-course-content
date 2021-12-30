package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A sípályák nehézség szerint osztályozva vannak mindenhol. A könnyû pályákat kék színnel jelzik.
Ezeken a pályákon maximum 12 fokos lejtõk találhatók. A középnehéz pályák piros színûek, és
maximum 20 fokos lejtõk találhatók rajtuk. Ennél meredekebb lejtõvel rendelkezõ pályák fekete
színûek. Írj programot, amely beolvassa, hogy egy sípálya legmeredekebb lejtõje hány fokos, és az
alapján megadja a sípálya színét! Ügyelj arra, hogy negatív lejtésszög nem lehet!
 */
public class _39sipalya {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg a sípálya legmeredekebb lejtõjének fokát: ");
		int highestSteep = Integer.parseInt(br.readLine());
		
		if (highestSteep < 0) {
			System.out.println("Negatív érték nem érelmezett");
		} else if (highestSteep < 13) {
			System.out.println("Kék pálya");
		} else if (highestSteep < 21) {
			System.out.println("Piros pálya");
		} else {
			System.out.println("Fekete pálya");
		}
		
		br.close();

	}

}
