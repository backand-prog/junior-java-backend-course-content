package hf;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class _8TombRendezes {

	public static void main(String[] args) {
		
		
		int[] arr = generateNums();
		writeArrayElementsInFile(arr, "szamok.txt");
		writeArrayElementsInFile(sortArray(arr), "szamok.txt");
		writeArrayElementsInFile(evenNums(arr), "paros_szamok.txt");
 
	}
	
	public static int[] evenNums(int[] arr) {
		int evenCounter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCounter++;
			} 
		}
		
		int[] evens = new int[evenCounter];
 		
		int evenIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				evens[evenIndex] = arr[i];
				evenIndex++;
				
			}
			
		}
		
		return evens;
		
	}
	
	
	public static int[] sortArray(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
				
			}
		}
		
		return arr;
	}
	
	public static void writeArrayElementsInFile(int[] arr, String filename) {
		try {
			FileWriter fw = new FileWriter(filename, true);
			for (int i = 0; i < arr.length; i++) {
				fw.write(arr[i] + " ");
			}
			fw.write("\r\n");
			fw.close();
			System.out.println("A számok fájlba írása sikeresen megtörént a " + filename + " fájlba.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static int[] generateNums() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		
		int arrayLength = 0;
		int numIntervallStart = 0;
		int numIntervallEnd = 0;
		
		do {
			
			try {
				System.out.print("Adja meg hány számot szeretne generálni: ");
				arrayLength = Integer.parseInt(br.readLine());
				System.out.print("Adja meg a generálandó számok kezdõértékét: ");
				numIntervallStart = Integer.parseInt(br.readLine());
				System.out.print("Adja meg a generálandó számok végzõértékét: ");
				numIntervallEnd = Integer.parseInt(br.readLine());
				
				
			} catch (NumberFormatException e) {
				System.out.println("Pozitív egész számot kell megadni.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (arrayLength < 0 || numIntervallEnd < numIntervallStart) {
				System.out.println("Nem megfelelõ adatokat adott meg.");
				System.out.println("A tömb hossza legyen legalább 1, és a generáladó számok kezdõértéke nem lehet magasabb, mint a végzõérték.");
				System.out.println("Kérem, adja meg újra az adatokat!");
				
			}
			
		} while (arrayLength < 0 || numIntervallEnd < numIntervallStart);
		

		int[] array = new int[arrayLength];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt((numIntervallEnd - numIntervallStart) + 1) + numIntervallStart;	
			}
		
		return array;
		
	}
	
	
	public static void printArray (int[] arr) {
		
		for (int item : arr) {
			System.out.print(item + " ");
		}
		
	}

}
