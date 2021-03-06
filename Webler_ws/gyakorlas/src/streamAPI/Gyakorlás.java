package streamAPI;

import java.util.ArrayList;

import java.util.List;

import java.util.Random;

import java.util.stream.Stream;

public class Gyakorl?s {

	public static void main(String[] args) {
	
		
		List<Integer> numList = generateNumList(5);
		
		//numList.stream().filter(x -> x%2==0).forEach(System.out::println);
		String xxxxxx = "Kutya";
		numList.stream()
			.map(x -> (int)Math.pow(x, 2))
			.map(x -> x + ". elem: " + xxxxxx +"\n")
			.forEach(System.out::print);
		
		
		
		
		
		
		
		List<String> stringList = new ArrayList();
		stringList.add("Els?");
		stringList.add("M?sodik");
		stringList.add("Harmadik");
		stringList.add("Negyedik");
		
		stringList.stream()
			.filter(x -> x.length() > 4)
			.map(String::toLowerCase)
			.map(x -> x + " ")
			.count();
		
		
		
		
		
		/*
		Stream<String> streamBuilder = Stream.<String>builder()
				  .add("a")
				  .add("b")
				  .add("c")
				  .build();
		System.out.println(streamBuilder.count());	
		*/
		
		
		
		
		/* random sz?mok streambe .generate-el, iter?ci?val elemek l?trehoz?sa (0-t?l kett?vel n? 20 elem)
		Random r = new Random();
		Stream<Integer> streamGenerate = Stream.generate(() -> r.nextInt()).limit(10);
		System.out.println(streamGenerate.count());
		Stream<Integer> streamIterate = Stream.iterate(0, n -> n+2).limit(20);
		System.out.println(streamIterate.count());
		*/
		
		
	}
	
	public static List<Integer> generateNumList (int length)
	{
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 1; i <= length; i++) {
			numList.add(i);
		}
		
		return numList;
		
	}
	
	public static void printList(List<Integer> list) {
		
		for (Integer item: list) {
			
			System.out.print(item);
			System.out.print(" ");
			
		}
		
	}
	
	public static Stream<String> streamOfStringArr(List<String> list) {
	    
	    return list == null || list.isEmpty() ? Stream.empty() : list.stream();

	}
	
	public static Stream<Integer> streamOfIntArr(List<Integer> list) {
	    
	    return list == null || list.isEmpty() ? Stream.empty() : list.stream();

	}

}
