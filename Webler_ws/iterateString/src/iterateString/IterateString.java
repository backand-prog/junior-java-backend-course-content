package iterateString;

public class IterateString {

	public static void main(String[] args) {
		String toIterate = "IterateThroughThisAndWriteIndexNum";
		
		for (int i = 0; i < toIterate.length(); i++) {
			
			System.out.println(toIterate.charAt(i));
			System.out.println(i);
		}

	}

}
