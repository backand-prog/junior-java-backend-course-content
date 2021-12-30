package hf02;

public class _15arrayDoubles {

	public static void main(String[] args) {
		
		double[] array = {5.29, 6.71, 6.11, 9.5, 6.00, 4.5, 8.43, 9.31, 4.24, 4.55, 3.87};
		
		printElements(array);
		System.out.println();
		elementsBiggerThan6(array);
		elementsInIntervallWithIndex(array);
		System.out.println("7-nél nagyobb elemek: " + biggerThan6Count(array));
		System.out.println("Az elemek összege: " + arraySum(array));
		System.out.println("Az elemek átlaga: " + avgElements(array));

	}
	
	public static double arraySum (double[] arr) {
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static double avgElements (double[] arr) {
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
		
		double avg = sum / arr.length;
		
		return avg;
	}
	
	public static int biggerThan6Count (double[] arr) {
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 7) {
				count++;
			}
			
		}
		return count;
		
		
	}
	
	public static void elementsInIntervallWithIndex (double[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 4.55 && arr[i] <= 5.0) {
				System.out.print(arr[i] + "(" + i + ") ");
			}
		}
		
	}

	public static void printElements (double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void elementsBiggerThan6 (double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 6.00) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	
}
