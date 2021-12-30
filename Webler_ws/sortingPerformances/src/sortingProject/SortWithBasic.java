package sortingProject;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SortWithBasic {

	public static void main(String[] args) {
		int[] arrayToBeSorted = createArray(500_000);
		int[] sortWithBasic = basicSort(arrayToBeSorted);
		printArray(sortWithBasic);
	}
	
	public static int[] basicSort (int[] arr) {
		
		//starting time of sorting
		long startTime = System.nanoTime();
		//sorting
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
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
			fw.write("Az egyszerû cserés módszerrel " + arr.length + " db 1 és 1 millió közötti szám sorbarendezése " + (int)timeInSecs + " másodpercig tartott.");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return the sorted array
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
