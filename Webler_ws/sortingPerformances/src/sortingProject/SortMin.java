package sortingProject;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SortMin {

	public static void main(String[] args) {
		
		int[] arrayToBeSorted = createArray(500_000);

		int[] sortedWithMin = sortMin(arrayToBeSorted);
		printArray(sortedWithMin);
		
		
	}
	
	public static int[] sortMin(int[] arr) {
		
		//starting time of sorting
		long startTime = System.nanoTime();
		//sorting with Min method
		int csere;
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[minIndex]) {
					minIndex = j;
				}
				
				if (i!=minIndex) {
					csere = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = csere;
				}
				

			}
			
		}
		
		//ending time of sorting
		long endTime = System.nanoTime();
		//all time elapsed with sorting
		long timeElapsed = endTime - startTime;
		//converting time to seconds 
		double timeInSecs =  (double)TimeUnit.SECONDS.convert(timeElapsed, TimeUnit.NANOSECONDS);	
		
		
		//creating log in file
		Date date = new Date();	
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			FileWriter fw = new FileWriter("sortLog.txt", true);
			fw.write("\r\n");
			fw.write(formatter.format(date) + " ");
			fw.write("A minimum kiválasztás rendezés módszerrel " + arr.length + " db 1 és 1 millió közötti szám sorbarendezése " + (int)timeInSecs + " másodpercig tartott.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//returning sorted array
		return arr;
		
	}
	
	
	
	
	public static int[] createArray(int arrLength) {
		//create an array that contains given amount of elements, all elements generated 
		//randomly between 1 and 1.000.000
		Random r = new Random();
		
		int[] array = new int[arrLength];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(1_000_000) + 1;
		}
		
		
		
		return array;
		
	}
	
	public static void printArray(int[] arr) {
		//print every element of an array on console

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}

	}

}
