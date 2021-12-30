package collectionsPractice;

import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args) {
		
		//when a new element is inserted into a PriorityQueue, a the queue is ordered by its natural ordering (or with Comparator)
		
		PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
		
		integerQueue.add(9);
		integerQueue.add(2);
		integerQueue.add(4);
		printQueue(integerQueue);
		
		
		//core methods 
		// offer() – Inserts a new element onto the Queue
		System.out.println();
		integerQueue.offer(100);
		printQueue(integerQueue); 
		
		
		// poll() – Removes an element from the front of the Queue
		System.out.println();
		integerQueue.poll();
		printQueue(integerQueue); 
		
		// peek() – Inspects the element at the front of the Queue, without removing it
		System.out.println();
		System.out.println(integerQueue.peek());
		
		
		

	}
	
	public static void printQueue(PriorityQueue<Integer> queue) {
		
		for (Integer item : queue) {
			
			System.out.print(item + " ");
			
		}
		
	}

}
