package HF01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A s�p�ly�k neh�zs�g szerint oszt�lyozva vannak mindenhol. A k�nny� p�ly�kat k�k sz�nnel jelzik.
Ezeken a p�ly�kon maximum 12 fokos lejt�k tal�lhat�k. A k�z�pneh�z p�ly�k piros sz�n�ek, �s
maximum 20 fokos lejt�k tal�lhat�k rajtuk. Enn�l meredekebb lejt�vel rendelkez� p�ly�k fekete
sz�n�ek. �rj programot, amely beolvassa, hogy egy s�p�lya legmeredekebb lejt�je h�ny fokos, �s az
alapj�n megadja a s�p�lya sz�n�t! �gyelj arra, hogy negat�v lejt�ssz�g nem lehet!
 */
public class _39sipalya {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Adja meg a s�p�lya legmeredekebb lejt�j�nek fok�t: ");
		int highestSteep = Integer.parseInt(br.readLine());
		
		if (highestSteep < 0) {
			System.out.println("Negat�v �rt�k nem �relmezett");
		} else if (highestSteep < 13) {
			System.out.println("K�k p�lya");
		} else if (highestSteep < 21) {
			System.out.println("Piros p�lya");
		} else {
			System.out.println("Fekete p�lya");
		}
		
		br.close();

	}

}
