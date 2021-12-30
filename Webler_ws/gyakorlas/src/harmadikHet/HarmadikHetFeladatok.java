package harmadikHet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class HarmadikHetFeladatok {

	public static void main(String[] args) {
		int[] arr = {5, 3, 1};
		
		printNums(arr);
		System.out.println();
		divisibleWith3and7InIntervall(1, 100);
		System.out.println();
		divisibleWith3and7InIntervall(1, 20, 2, 3);
		System.out.println();
		arrSort(10, 50, 10);
		
		

	}
	

	public static void printNums (int[] arr) {
			
		
		Arrays.stream(arr)
			.map(x -> (int)Math.pow(x, 2))
			.mapToObj(Integer::toString)
			.map(x -> x + " ")
			.forEach(System.out::print);
		
	}
	
	
	public static void divisibleWith3and7InIntervall(int startIntervall, int endIntervall) {
		List<Integer> list = new ArrayList<>();
		for (int i = startIntervall; i <= endIntervall; i++) {
			list.add(i);
		}
		
		list.stream()
			.filter(x -> x % 3 == 0 && x % 7 == 0)
			.map(x -> x + " ")
			.forEach(System.out::print);
		
	}
	

	
	public static void divisibleWith3and7InIntervall(int startIntervall, int endIntervall, int div1, int div2) {
		List<Integer> list = new ArrayList<>();
		for (int i = startIntervall; i <= endIntervall; i++) {
			list.add(i);
		}
		
		list.stream()
			.filter(x -> x % div1 == 0 && x % div2 == 0)
			.map(x -> x + " ")
			.forEach(System.out::print);
		
	}
	
	public static void arrSort(int intervallStart, int intervallEnd, int count) {
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < count; i++) {
			int randInt = r.nextInt((intervallEnd - intervallStart) + 1) + intervallStart;
			list.add(randInt);
		}

		FileOutputStream fs;

		
		try {
			fs = new FileOutputStream("szamok.txt", false);
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			out.write("A tömb elemei: ");
			list.stream()
				.map(x -> x + " ")
				.forEach(x -> {
					try {
						out.write(x);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
			out.write("\n");
			out.write("A tömb elemei rendezve: ");
			list.stream()
			.sorted()
			.map(x -> x + " ")
			.forEach(x -> {
				try {
					out.write(x);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		
		
			

		
		out.write("\n");
		out.write("Páros elemek: ");
		list.stream()
			.filter(x -> x % 2 == 0)
			.sorted()
			.map(x -> x + " ")
			.forEach(x -> {
				try {
					out.write(x);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		out.close();

		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
