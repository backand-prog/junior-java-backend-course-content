package gyujtemenyek;

import java.util.ArrayList;

import java.util.List;


public class ListInterface {

	public static void main(String[] args) {
		
		/*List interface
		 * rendezett Collection, duplikált elemeket is tartalmazhat
		 * További jellemzõk:
		 * 		Dinamikus elemhozzáadás, törlés, beszúrás
		 * 		Tömb hátrányait küszöböli ki
		 * 		Pozíció szerinti elérés
		 * 		Keresés
		 * 		Bejárás: iterator alaú sozlgáltatások eléhetõek
		 * 		Részlista képzés: lehetõvé teszi a részlista mûveleteket
		 * 
		 * List interface-en belüli osztályok:
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
		//0-tól indexel - adott indexû elem elérése get(index)
		System.out.println(sajatLista.get(1)); //74
		sajatLista.remove(1); //kitöröljük az egyes indexen lévõ elemet - 74
		
		System.out.println(sajatLista); //ez a kiírás csak saját magunknak, hibakezelésnek való
		//lista méretének lekérdezése
		System.out.println(sajatLista.size());
		
		//bejárás for ciklussal
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
		//Keressük meg a 9-es értékû elem indexét
		System.out.println("A 9-es érték indexe " + sajatLista.indexOf(9));
		
		//részlista képzés
		List<Integer> sajatReszLista = new ArrayList<Integer>();
		sajatReszLista = sajatLista.subList(2, 4);
		System.out.println(sajatReszLista);

	}

}
