package gyujtemenyek;

import java.util.ArrayList;

import java.util.List;


public class ListInterface {

	public static void main(String[] args) {
		
		/*List interface
		 * rendezett Collection, duplik�lt elemeket is tartalmazhat
		 * Tov�bbi jellemz�k:
		 * 		Dinamikus elemhozz�ad�s, t�rl�s, besz�r�s
		 * 		T�mb h�tr�nyait k�sz�b�li ki
		 * 		Poz�ci� szerinti el�r�s
		 * 		Keres�s
		 * 		Bej�r�s: iterator ala� sozlg�ltat�sok el�het�ek
		 * 		R�szlista k�pz�s: lehet�v� teszi a r�szlista m�veleteket
		 * 
		 * List interface-en bel�li oszt�lyok:
		 * 		ArrayList
		 * 		LinkedList
		 * 		Vector
		 * 		Stack
		 */

		List<Integer> sajatLista = new ArrayList<Integer>();
		sajatLista.add(44);
		sajatLista.add(74);
		sajatLista.add(9);
		sajatLista.add(72);
		sajatLista.add(4);
		sajatLista.add(9);
		sajatLista.add(2);
		//0-t�l indexel - adott index� elem el�r�se get(index)
		System.out.println(sajatLista.get(1)); //74
		sajatLista.remove(1); //kit�r�lj�k az egyes indexen l�v� elemet - 74
		
		System.out.println(sajatLista); //ez a ki�r�s csak saj�t magunknak, hibakezel�snek val�
		//lista m�ret�nek lek�rdez�se
		System.out.println(sajatLista.size());
		
		//bej�r�s for ciklussal
		System.out.println("A lista elemei: ");
		for (int i = 0; i < sajatLista.size(); i++) {
			System.out.print(sajatLista.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Lista elemei (FOREACH):");
		for (Integer item : sajatLista) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		//Keress�k meg a 9-es �rt�k� elem index�t
		System.out.println("A 9-es �rt�k indexe " + sajatLista.indexOf(9));
		
		//r�szlista k�pz�s
		List<Integer> sajatReszLista = new ArrayList<Integer>();
		sajatReszLista = sajatLista.subList(2, 4);
		System.out.println(sajatReszLista);

	}

}
