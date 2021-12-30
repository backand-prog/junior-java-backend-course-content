package gyujtemenyek;


import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		/*
		 * Map Interface: kulcs-értékpárokat tároló interface
		 * 		duplikált elemeket nem tartalmazhat, a kulcsna egyedinek kell lennie
		 * 		Rendezett formája a SortedMap interface
		 * Map interface-t megvalósító (implementáló) osztályok:
		 * 		HashMap, LinkedHashMap
		 * Mi a különbség a HashMap és a HashTable között?
		 * 		Hashtable -> java 1.7 óta elavult (depracated)
		 * 		Hashtable -> többszáló feldolgozás
		 * 		HashMap -> nem szálbiztos, a többszáló feldolgozásra nem alkalmas
		 * 			helyette alkalmazható a syncronizedMap vagy ConcurrentHashMap
		 * 		HashMap -> iterator interface-t használ,
		 * 		Hashtable -> enumeration interface-t használ
		 * 
		 * Konkluzio: HashMape-et érdemes használni, ha szükség van többszáló
		 * 		feldolgozásra, akkor syncronizedMap, ConcurrentHashMap
		 * 
		 */
		
		Map<String, Integer> gyumolcsArak = new TreeMap<String, Integer>();
		gyumolcsArak.put("alma", 750);
		gyumolcsArak.put("szilva", 350);
		gyumolcsArak.put("barack", 980);
		System.out.println(gyumolcsArak);
		
		gyumolcsArak.put("alma", 880);
		
		
		//HashMap esetében mûködik a for ciklus, mert az iterable interfaceben van
		for (Map.Entry<String, Integer> item : gyumolcsArak.entrySet()) {
			System.out.println("Kulcs: " + item.getKey() + ", érték: " + item.getValue());
		}
		
		
	}

}
