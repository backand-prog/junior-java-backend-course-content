package collectionsPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayListPractice {

	public static void main(String[] args) {

		//************************* CREATE *************************

		List<Integer> arrList = new ArrayList<Integer>();
		arrList = createIntArrList(1, 500, 30);	

		//************************* PRINT *************************
		System.out.print("Print with for loop: ");
		printList(arrList);

		System.out.println();
		System.out.print("Print with stream: ");
		arrList.stream()			
			.map(x -> x + " ")
			.forEach(System.out::print);	
		System.out.println();
		
		System.out.println("The first element of the list: " + arrList.get(0));

		//************************* ADD, REMOVE ELEMENTS *************************
		
		System.out.println();
				System.out.println("ArrayList size before adding 2 elements: " + arrList.size());
		arrList.add(600);
		arrList.add(800);
		arrList.add(1, 100000); //add to the 1th index
		System.out.println("ArrayList size after adding 3 elements: " + arrList.size());
	
		//remove by index
		arrList.remove(0); 		//removes the element on index "0"
		System.out.println("ArrayList size after removing 1 element: " + arrList.size());
		//remove by value
		arrList.remove(arrList.indexOf(800));
		System.out.println("ArrayList size after removing 1 element: " + arrList.size());
		
		//remove odd nums from the array
		arrList.removeIf(x -> x % 2 == 1);
		System.out.print("Elements after removing odd nums: ");
		printList(arrList);
		
		//add list to another list
		System.out.println();
		List<Integer> newList = new ArrayList<Integer>();
		newList = createIntArrList(1, 500, 5);
		System.out.println();
		System.out.print("The new list to be added to the original list: ");
		printList(newList);
		arrList.addAll(newList);
		System.out.println();
		System.out.print("The list extended with another list: ");
		printList(arrList);
		System.out.println();
		
		//remove all elements of an Arraylist
		System.out.println();
		arrList.removeAll(arrList);
		System.out.println("ArrayList size after removing all elements: " + arrList.size());
		System.out.println();
		
		// ************************* COMPARISON *************************
		
		//refill the list
		arrList = createIntArrList(1, 500, 30);
		System.out.print("The elements of the list after refilling: ");
		printList(arrList);
		System.out.println();
		
		//check if a list is empty
		System.out.println();
		System.out.println(arrList.isEmpty() ? "The list is empty" : "The list is not empty"); //false
		
		//check if a list contains a certain value
		System.out.println();
		int num = 600;
		System.out.println(arrList.contains(num) ? "The list contains " + num  :  "The list doesn't contain " + num); //false
		arrList.add(num);
		System.out.println(num + " added to the list");
		System.out.println(arrList.contains(num) ? "The list contains " + num  :  "The list doesn't contain " + num); //true
		
		//check if 2 list have the same elements (false this time)
		System.out.println();
		System.out.println(arrList.containsAll(newList) ? "Same elements" : "Not the same elements");	
		
		// ************************* SORT *************************

		//sorting with stream doesn't alter the original list
		System.out.println();
		System.out.print("Sorted with stream: ");
		arrList.stream()
			.sorted()
			.map(x -> x + " ")
			.forEach(System.out::print); 

		System.out.println();
		System.out.print("Reverse sort with stream: ");
		arrList.stream()
			.sorted(Comparator.reverseOrder())
			.map(x -> x + " ")
			.forEach(System.out::print); 


		//the Collections.sort alters the original list 
		System.out.print("\nSorted with Collections.sort: ");
		Collections.sort(arrList);
		printList(arrList);
		
		System.out.print("\nReverse sort with Collections.sort: ");
		Collections.sort(arrList, Comparator.reverseOrder());
		printList(arrList);
		
		// ************************* FILTER, COLLECT, SUBLIST *************************

		System.out.println();
		//put all even nums from the list to a new list called evenNums
		System.out.print("Even nums: ");
		List<Integer> evenNums = arrList.stream()
			.filter(x -> x % 2 == 0)
			.collect(Collectors.toList());
		printList(evenNums);
		
		
		List<Integer> arrayListSubList = new ArrayList<>();
		arrayListSubList = arrList.subList(0, 3); //start is incluse, end is exclusive
		System.out.println();
		System.out.print("New sublist - first 3 elements of the original list: ");
		printList(arrayListSubList);
	}
	
	public static void printList(List<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
	
	public static List<Integer> createIntArrList(int intervallStart, int intervallEnd, int lenght) {
		
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < lenght; i++) {
			
			list.add(r.nextInt((intervallEnd - intervallStart) + intervallStart) + 1);
			
		}
		
		return list;
		
	}
	
}
