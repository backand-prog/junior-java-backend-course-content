package gyujtemenyek;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableLegacy {

	public static void main(String[] args) {
		
		//kulcs-�rt�kp�rokban t�rt�nik az adatt�rol�s
		Hashtable<String, String> szotar = new Hashtable<>();
		
		szotar.put("apple", "alma");
		szotar.put("pear", "k�rte");
		szotar.put("banana", "ban�n");
		
		//szotar.clear(); kit�rli a teljes tartalm�t
		szotar.remove("apple");
		System.out.println(szotar.containsKey("apple"));
		System.out.println(szotar.containsKey("pear"));
		
		//Bej�r�s for �s foreach sem haszn�lhat� a Hashtable-n�l
		//az�rt nem haszn�lhat�, mert nem implement�lja az iterable interface-t
		
		//Hashatable - az Enumeration interface-en bel�l van
		//kulcsok beszerz�se
		Enumeration<String> enumeration = szotar.keys();
		
		//enumeration object seg�ts�g�vel j�rjuk be
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			System.out.println("Angolul: " + key + "\t" + "Magyarul: " + szotar.get(key));
		}
		
		
	}

}
