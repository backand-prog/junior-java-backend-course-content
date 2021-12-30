package gyujtemenyek;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableLegacy {

	public static void main(String[] args) {
		
		//kulcs-értékpárokban történik az adattárolás
		Hashtable<String, String> szotar = new Hashtable<>();
		
		szotar.put("apple", "alma");
		szotar.put("pear", "körte");
		szotar.put("banana", "banán");
		
		//szotar.clear(); kitörli a teljes tartalmát
		szotar.remove("apple");
		System.out.println(szotar.containsKey("apple"));
		System.out.println(szotar.containsKey("pear"));
		
		//Bejárás for és foreach sem használható a Hashtable-nél
		//azért nem használható, mert nem implementálja az iterable interface-t
		
		//Hashatable - az Enumeration interface-en belül van
		//kulcsok beszerzése
		Enumeration<String> enumeration = szotar.keys();
		
		//enumeration object segítségével járjuk be
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			System.out.println("Angolul: " + key + "\t" + "Magyarul: " + szotar.get(key));
		}
		
		
	}

}
