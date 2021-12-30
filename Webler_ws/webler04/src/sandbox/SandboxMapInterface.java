package sandbox;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class SandboxMapInterface {
	
	

	public static void main(String[] args) {
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, String> map2 = new TreeMap<Integer, String>();

		
		map.put(2, 10);
		map2.put(1, "B�la");
		map.put(33, 12);
		map.put(31, 12);
		map.put(35, 13);
		map.put(312, 12);
		//System.out.println(map);
		//System.out.println(map2);
		
		for (int i = 0; i < 10; i++) {
			map.put(i+500, i+500);
		}
		
		//System.out.println(map.get(35));
		/*
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			System.out.print(item.getKey() + " " + item.getValue() + " ; ");
		}
		*/
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			System.out.print(item.getKey() + " " + item.getValue() + " ; ");
		}
		
	}

}
