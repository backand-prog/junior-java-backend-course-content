package gyujtemenyek;


import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		/*
		 * Map Interface: kulcs-�rt�kp�rokat t�rol� interface
		 * 		duplik�lt elemeket nem tartalmazhat, a kulcsna egyedinek kell lennie
		 * 		Rendezett form�ja a SortedMap interface
		 * Map interface-t megval�s�t� (implement�l�) oszt�lyok:
		 * 		HashMap, LinkedHashMap
		 * Mi a k�l�nbs�g a HashMap �s a HashTable k�z�tt?
		 * 		Hashtable -> java 1.7 �ta elavult (depracated)
		 * 		Hashtable -> t�bbsz�l� feldolgoz�s
		 * 		HashMap -> nem sz�lbiztos, a t�bbsz�l� feldolgoz�sra nem alkalmas
		 * 			helyette alkalmazhat� a syncronizedMap vagy ConcurrentHashMap
		 * 		HashMap -> iterator interface-t haszn�l,
		 * 		Hashtable -> enumeration interface-t haszn�l
		 * 
		 * Konkluzio: HashMape-et �rdemes haszn�lni, ha sz�ks�g van t�bbsz�l�
		 * 		feldolgoz�sra, akkor syncronizedMap, ConcurrentHashMap
		 * 
		 */
		
		Map<String, Integer> gyumolcsArak = new TreeMap<String, Integer>();
		gyumolcsArak.put("alma", 750);
		gyumolcsArak.put("szilva", 350);
		gyumolcsArak.put("barack", 980);
		System.out.println(gyumolcsArak);
		
		gyumolcsArak.put("alma", 880);
		
		
		//HashMap eset�ben m�k�dik a for ciklus, mert az iterable interfaceben van
		for (Map.Entry<String, Integer> item : gyumolcsArak.entrySet()) {
			System.out.println("Kulcs: " + item.getKey() + ", �rt�k: " + item.getValue());
		}
		
		
	}

}
