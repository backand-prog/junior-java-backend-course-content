package hf02;

public class _08bytearray {

	public static void main(String[] args) {
		
		char[] arr = {'a', 'h', 'r', 't', 'z', 'e', 'v'};
		
		printWithSpace(arr);
		System.out.println();
		charArrVowelIndexes(arr);
		System.out.println();
		isCharInArr(arr, 'z');
		
		}
		

	public static void charArrVowelIndexes(char[] arr) {
		System.out.print("Ezeken az indexeken találhatók magánhangzók: ");
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 'a': 
			case 'á': 
			case 'e': 
			case 'é': 
			case 'i': 
			case 'í': 
			case 'o':
			case 'ó':
			case 'ö':
			case 'õ':
			case 'u':
			case 'ú':
			case 'ü':
			case 'û': System.out.print(i + " ");
				break;
			default:
				break;
			}
			
		}
			
	}
	
	public static void isCharInArr(char[] arr, char c) {
		
		boolean charInArr = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				charInArr = true;
			}
			
		}

		if (charInArr) {
			System.out.println("A " + c + " karakter szerepel a tömbben.");
		} else {
			System.out.println("A " + c + " karakter nem szerepel a tömbben.");
		}

	}

	public static void printWithSpace(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}