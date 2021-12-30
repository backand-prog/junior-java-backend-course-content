package hf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14sarkiZoldseges {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] income = {250600, 200150, 190500, 230700, 280640, 220750, 195300};
				
		System.out.println("A heti összes bevétel: " + incomeSum(income));
		System.out.println("A napi átlagos bevétel: " + incomeAvg(income) + " volt.");
		System.out.println("Ennyi darab nap volt, amikor a bevtéel meghaladta a 200000 Ft: " + incomeOver200K(income) + " db");
		System.out.println("Legkevesebb bevétel " + daySwitch(incomeMin(income)) + " volt: " + incomeMin(income) + " Ft.");
		System.out.println("Legtöbb bevétel " + daySwitch(incomeMax(income)) + " volt: " + incomeMax(income) + " Ft.");
		System.out.println("Hétköznap ennyi volt az összes bevétel: " + incomeSumWeekdays(income) + " Ft.");
		System.out.println("Hétvégi átlagbevétel : " + incomeAVGWeekend(income) + " Ft.");
		System.out.println("A megadott napon a bévétel: " + userInputDayIncome(income) + " Ft");
		System.out.println("A hétvégi bevétel " + (int)percentWeekendOfWeek(income) + " százaléka a hétnek." );
		
	}

	public static double percentWeekendOfWeek (int[] arr) {
			
			int sumWeek = 0;
			int sumWeekend = 0;
			
			for (int i = 0; i < arr.length; i++) {
				sumWeek+=arr[i];
			}
			
			for (int i = 5; i < arr.length; i++) {
				sumWeekend+=arr[i];
			}
			
			double percentWeekendOfWeekday = ((double)sumWeekend / (double)sumWeek);
			
			return percentWeekendOfWeekday * 100;
			
		}	
	
	public static int incomeSum (int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static int incomeAvg (int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int avg = sum / arr.length;
		
		return avg;
	}
	
	public static int incomeOver200K (int arr[]) {
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 200_000) {
				count++;
			}
			
		}
		
		return count;
		
	}
	
	public static int incomeMin (int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int incomeMax (int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
		}
		
		return max;
		
	}
	
	public static int incomeSumWeekdays (int[] arr) {
		int sumWeekdays = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			sumWeekdays+=arr[i];
		}
		
		return sumWeekdays;
		
	}
	
	public static int incomeAVGWeekend (int[] arr) {
		
		int sumWeekend = 0;
		
		for (int i = 5; i < arr.length; i++) {
			sumWeekend+=arr[i];
		}
		
		int avgWeekend = sumWeekend / 2;
		
		return avgWeekend;
		
	}
	
	public static int userInputDayIncome (int[] arr) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Adja meg a nap számát (1-7): ");
		int indexDay = Integer.parseInt(br.readLine()) - 1;
		
		
		return arr[indexDay];
		
	}
	
	
	
	
	
	public static String daySwitch (int dailyIncome) {
		
		String string = "";
		
		switch (dailyIncome) {
		case 250600: string = "hétfõn";
			break;
		case 200150: string = ("kedden");
			break;
		case 190500: string = ("szerdán");
			break;
		case 230700: string = ("csütörtökön");
			break;
		case 280640: string = ("pénteken");
			break;
		case 220750: string = ("szombaton");
			break;
		case 195300: string = ("vasárnap");
			break;
		default:
			break;
		}
		
		return string;
	}
	
}
