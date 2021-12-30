package konzol;

public class App {

	public static void main(String[] args) {
		
		Integer number = NumberFromConsole.read();
		if (number != null) {
			if (number >= 5 ) {
				WriteData.writeToFile(number);
			} else {
				WriteData.writeToConsole(number);
			}
		}
	}

}
