package collectionsPractice;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		//natural order TreeMap
		TreeMap<Integer, String> treeMapIntsNaturalOrder = new TreeMap<>();
		treeMapIntsNaturalOrder = new TreeMapPractice().createNewTreeMapNaturalOrderInts(); 
		printTreeMapIntString(treeMapIntsNaturalOrder);
		
		//reverse order TreeMap
		System.out.println();
		TreeMap<String, String> treeMapStringsReverseOrder = new TreeMapPractice().createNewTreeMapReverseOrderStrings();
		printTreeMapStringString(treeMapStringsReverseOrder);
		
		// get the largest (last) key from TreeMap
		Integer largestIntNaturalOrder = treeMapIntsNaturalOrder.lastKey();
		//get the lowest (first) key from TreeMap
		Integer lowestIntNaturalOrder = treeMapIntsNaturalOrder.firstKey();
		System.out.println("The largest key: " + largestIntNaturalOrder + ", the lowest key: " + lowestIntNaturalOrder);
		
		//keys greater than 3 stored in a set
		Set<Integer> keysLessThan3 = treeMapIntsNaturalOrder.headMap(3).keySet(); 
		System.out.print("Keys less than 5: ");
		for (Integer item : keysLessThan3) {
			System.out.print(item + " ");
		}
		
		
		System.out.println();
		//keys greater than or equal to 3 stored in a set		
		Set<Integer> keysLargerThan3 = treeMapIntsNaturalOrder.tailMap(3).keySet(); 
		System.out.print("Keys greater than 5: ");
		for (Integer item : keysLargerThan3) {
			System.out.print(item + " ");
		}
		

	}

	public TreeMap<Integer, String> createNewTreeMapNaturalOrderInts(){
		
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		treeMap.put(3, "val");
	    treeMap.put(2, "val");
	    treeMap.put(1, "val");
	    treeMap.put(5, "val");
	    treeMap.put(4, "val");
		
		return treeMap;
		
	}
	
	public TreeMap<String, String> createNewTreeMapReverseOrderStrings(){
			
		TreeMap<String, String> treeMap = new TreeMap(Comparator.reverseOrder());
			
		treeMap.put("f", "val");
		treeMap.put("h", "val");
		treeMap.put("a", "val");
		treeMap.put("z", "val");
		treeMap.put("e", "val");
			
		return treeMap;
		
		
	
		
		
	}
	
	public static void printTreeMapIntString(TreeMap<Integer, String> treeMap) {
		
		for (Map.Entry<Integer, String> item : treeMap.entrySet()) {
			
			System.out.println(item.getKey() + ": " + item.getValue());
			
		}
		
	}
	
	public static void printTreeMapStringString(TreeMap<String, String> treeMap) {
			
			for (Map.Entry<String, String> item : treeMap.entrySet()) {
				
				System.out.println(item.getKey() + ": " + item.getValue());
				
			}
		
	}
	
}
