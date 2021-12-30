package collectionsPractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> randLinkedList = new LinkedList<Integer>();
		randLinkedList = createLinkedList(1, 200, 50);
		printList(randLinkedList);
		//add(), addAll() -> like ArrayList
		
		
		//add element to the beginning of the LinkedList
		randLinkedList.addFirst(500);
		System.out.println();
		//print first element with stream api
		System.out.print("First element after addFirst(500): ");
		randLinkedList.stream()
		.limit(1)
		.forEach(System.out::println);
		
		//add element to the end of the LinkedList
		randLinkedList.addLast(555333);
		//print last element of LinkedList 
		System.out.print("Last element after addLast(555333): ");
		System.out.println(randLinkedList.getLast());
		
		
		//queue-like behavior
		randLinkedList.poll(); //removes the first element - pollFirst() works the same
		System.out.print("First element after poll: ");
		randLinkedList.stream()
		.limit(1)
		.forEach(System.out::println);
		
		randLinkedList.pollLast(); //removes the last element
		System.out.print("Last element after pollLast: ");
		System.out.println(randLinkedList.getLast());
		
		randLinkedList.pop(); //removes first element
		System.out.print("First element after pop: ");
		randLinkedList.stream()
		.limit(1)
		.forEach(System.out::println);
		
		
		
		LinkedList<Integer> emptyList = new LinkedList<Integer>();
		System.out.println(emptyList.poll()); // if empty returns null
		
		emptyList.pop(); // if empty returns NoSuchElementException()
		
		

	}
	
	public static LinkedList<Integer> createLinkedList (int intervallStart, int intervallEnd, int lenght) {
			
			LinkedList<Integer> list = new LinkedList<>();
			Random r = new Random();
			
			for (int i = 0; i < lenght; i++) {
				
				list.add(r.nextInt((intervallEnd - intervallStart) + intervallStart) + 1);
				
			}
			
			return list;
		
	}
	
	public static void printList(List<Integer> list) {
		
		for (Integer item : list) {
			System.out.print(item + " ");
		}
		
	}
	
	
	


}
