package gyujtemenyek;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		/*
		 * Set interface: sperciális Collection: nem tartalmazhat azonos elemeket
		 * 	(equals és hashcode mtódusokat használ arra, hogy a duplikációkat kiszûrje
		 * 
		 * Három implementációt tartalmaz:
		 * 	HashSet: az elemeket táblákban tárolja, nem fontos az elemek bejárása
		 * 	TreeSet: Gyors a a bejárás, az elemeket fa szerkezetben tárolja,
		 * 		nehékes beszúrás, rendezetten tárolja az adatokat
		 * 	LinkedHashSet: láncolt lista és a hashtábla tulajdonságait ötvözi
		 */
		
		int[] szamokTomb = {32, 22, 10, 60, 30, 22};
		Set<Integer> egyediElemek = new HashSet<Integer>();
		for (int i = 0; i < szamokTomb.length; i++) {
			egyediElemek.add(szamokTomb[i]);
		}
		
		System.out.println(egyediElemek); //22-es csak egyszer került bele
		
		TreeSet<Integer> rendezettElemek = new TreeSet<Integer>(egyediElemek);
		System.out.println(rendezettElemek);
		
		System.out.println("A rendezett elemek elsõ eleme: " + rendezettElemek.first());
		System.out.println("A rendezett elemek utolsó eleme: " + rendezettElemek.last());
		
		/*
		 * További függvények:
		 * Van két hlamaz: s1 és s2
		 * s1.containAll(s2): részhalmaza az s2 az s1-nek
		 * s1.addAll(s2): s1-be belekerül a két halmaz uniója
		 * s1.retainAll(s2): s1-be belekerül a két halmaz metszete
		 * s1.removeAll(s2): s1-be belekerül, az s1 és az s2 különbsége
		 * 
		 * HF - metszet, unió, különbség
		 * 
		 */
		
	}

}
