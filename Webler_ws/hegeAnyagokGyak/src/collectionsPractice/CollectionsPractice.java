package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsPractice {

	public static void main(String[] args) {
		System.out.println("COLLECTIONS ARRAYLIST");
		List<Integer> collPractArrList = new ArrayListPractice().createIntArrList(1, 100, 20);

		System.out.print("Original list : ");
		for (Integer item : collPractArrList) {
			System.out.print(item + " ");
		}

		System.out.println();
		System.out.println("The max value of the arraylist: " + Collections.max(collPractArrList));
		System.out.println("The min value of the arraylist: " + Collections.min(collPractArrList));
		Collections.reverse(collPractArrList);
		System.out.print("Reverse list : ");
		for (Integer item : collPractArrList) {
			System.out.print(item + " ");
		}

		Collections.sort(collPractArrList);
		System.out.println();
		System.out.print("Sorted list: ");
		for (Integer item : collPractArrList) {
			System.out.print(item + " ");
		}

		Collections.shuffle(collPractArrList);
		System.out.println();
		System.out.print("Shuffled list: ");
		for (Integer item : collPractArrList) {
			System.out.print(item + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("COLLECTIONS SET");
		Set<String> hashset = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			hashset.add("element" + i);
		}
		System.out.print("Original set: ");
		for (String item : hashset) {
			System.out.print(item + " ");
		}

		System.out.println();
		System.out.println("The minimum value of the set: " + Collections.min(hashset));
		System.out.println("The maximum value of the set: " + Collections.max(hashset));
		//set is an unordered collecion -> cant sort, shuffle, etc, only if it is converted into an ordered collciton type (ArrayList)
		List<String> orderedSet = new ArrayList<>(hashset);
		Collections.shuffle(orderedSet);
		System.out.print("Set shuffled after converted to an ArrayList: ");
		for (String item : orderedSet) {
			System.out.print(item + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("COLLECTIONS HASHMAP");
		Map<String, String> currencyCodes = Stream.of(new String[][] {
			  { "Forint", "HUF" }, 
			  { "Euro", "EUR" },
			  { "Czech Crown", "CZK" },	  
			  { "Zloty", "PLN" },
			  { "Pound", "GBP" },
			  { "Yen", "JPY" },
			}).collect(Collectors.toMap(x -> x[0], x -> x[1]));
		
		System.out.println("Elements of the map with stream:");
		currencyCodes.entrySet().stream().forEach(System.out::println);
		
		System.out.println();
		//Get min and max using Collections with lambda expression
		Entry<String, String> maxEntry = Collections.max(currencyCodes.entrySet(), (Entry<String, String> e1, Entry<String, String> e2) -> e1.getValue()
		        .compareTo(e2.getValue()));
		System.out.println("The maximum value of the map: " + maxEntry);
		
		Entry<String, String> minEntry = Collections.min(currencyCodes.entrySet(), (Entry<String, String> e1, Entry<String, String> e2) -> e1.getValue()
		        .compareTo(e2.getValue()));
		System.out.println("The minimum value of the map: " + minEntry);

	}

}