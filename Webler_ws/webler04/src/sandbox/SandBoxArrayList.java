package sandbox;

import java.util.ArrayList;

import java.util.List;

public class SandBoxArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> myOwnList = new ArrayList<Integer>();
		
		myOwnList.add(300);
		myOwnList.add(42);
		myOwnList.add(4123);
		myOwnList.add(122);
		
		System.out.println("A lista elsõ eleme: " + myOwnList.get(0));
		System.out.println("A lista második eleme: " + myOwnList.get(1));
		System.out.println("A lista harmadik eleme: " + myOwnList.get(2));
		System.out.println("A lista negyedik eleme: " + myOwnList.get(3));
		
		
		for (int i = 0; i < myOwnList.size(); i++) {
			System.out.print(myOwnList.get(i) + " ");
		}
		System.out.println();
		for (Integer item : myOwnList) {
			System.out.print(item + " ");
		}
		System.out.println();
		List<Integer> partList = new ArrayList<Integer>();
		partList = myOwnList.subList(0, 2);
		for (int i = 0; i < partList.size(); i++) {
			System.out.print(partList.get(i) + " ");
		}
		
		System.out.println();
		List<Integer> twoListsTogether = new ArrayList<Integer>();
		twoListsTogether.addAll(partList);
		twoListsTogether.addAll(myOwnList);
		for (int i = 0; i < twoListsTogether.size(); i++) {
			System.out.print(twoListsTogether.get(i) + " ");
		}
		System.out.println();
		myOwnList.clear();
		myOwnList.add(3);
		for (int i = 0; i < myOwnList.size(); i++) {
			System.out.println(myOwnList.get(i) + " ");
		}
		
		
		System.out.println(twoListsTogether.contains(123));
		System.out.println(myOwnList.getClass());
		myOwnList.add(100);
		System.out.println(myOwnList.indexOf(100));
		
		
		System.out.println(myOwnList.toString());
		
	}

}
