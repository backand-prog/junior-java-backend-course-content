package gyujtemenyek;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		/*
		 * Set interface: sperci�lis Collection: nem tartalmazhat azonos elemeket
		 * 	(equals �s hashcode mt�dusokat haszn�l arra, hogy a duplik�ci�kat kisz�rje
		 * 
		 * H�rom implement�ci�t tartalmaz:
		 * 	HashSet: az elemeket t�bl�kban t�rolja, nem fontos az elemek bej�r�sa
		 * 	TreeSet: Gyors a a bej�r�s, az elemeket fa szerkezetben t�rolja,
		 * 		neh�kes besz�r�s, rendezetten t�rolja az adatokat
		 * 	LinkedHashSet: l�ncolt lista �s a hasht�bla tulajdons�gait �tv�zi
		 */
		
		int[] szamokTomb = {32, 22, 10, 60, 30, 22};
		Set<Integer> egyediElemek = new HashSet<Integer>();
		for (int i = 0; i < szamokTomb.length; i++) {
			egyediElemek.add(szamokTomb[i]);
		}
		
		System.out.println(egyediElemek); //22-es csak egyszer ker�lt bele
		
		TreeSet<Integer> rendezettElemek = new TreeSet<Integer>(egyediElemek);
		System.out.println(rendezettElemek);
		
		System.out.println("A rendezett elemek els� eleme: " + rendezettElemek.first());
		System.out.println("A rendezett elemek utols� eleme: " + rendezettElemek.last());
		
		/*
		 * Tov�bbi f�ggv�nyek:
		 * Van k�t hlamaz: s1 �s s2
		 * s1.containAll(s2): r�szhalmaza az s2 az s1-nek
		 * s1.addAll(s2): s1-be beleker�l a k�t halmaz uni�ja
		 * s1.retainAll(s2): s1-be beleker�l a k�t halmaz metszete
		 * s1.removeAll(s2): s1-be beleker�l, az s1 �s az s2 k�l�nbs�ge
		 * 
		 * HF - metszet, uni�, k�l�nbs�g
		 * 
		 */
		
	}

}
