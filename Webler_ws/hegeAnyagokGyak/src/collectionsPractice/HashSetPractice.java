package collectionsPractice;

import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {


		Set<String> hashset = new HashSet<>();
		
		//add elements with add() - only added if it is not present yet
		//there is a HashMap in the Set - (value, "PRESENT)
		//when we add a new value to the set, it checks in the map if it is present
		hashset.add("a");
		for (String item : hashset) {
			System.out.println(item);
		}
		//add the same element again, and print out the set (only once it will be in the set)
		hashset.add("a");
		hashset.add("vv");
		hashset.add("d");
		hashset.add("4");
		for (String item : hashset) {
			System.out.print(item + " ");
		}
		
		//check if a value in is the set with .contains()
		System.out.println();
		String setContains = hashset.contains("b") ? "The value is in the set" : "The value is not int the set";
		System.out.println(setContains);
		setContains = hashset.contains("a") ? "The value is in the set" : "The value is not int the set";
		System.out.println(setContains);

		//remove a value from the set
		hashset.remove("4");
		System.out.println();
		setContains = hashset.contains("4") ? "The value is in the set" : "The value is not int the set";
		System.out.println(setContains);
		
		System.out.println("Size before clear : " + hashset.size());
		//clear elements from set
		hashset.clear();
		System.out.println("Size after clear : " + hashset.size());
		
		//check if set is empty
		String isEmpty = hashset.isEmpty() ? "The HashSet is empty" : "The HashSet is not empty";
		System.out.println(isEmpty);
		
		//using an iterator on hashset
		hashset.add("l");
		hashset.add("c");
		hashset.add("k");
		
		Iterator<String> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}	
		
	}

}
