package konzol;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
	
	public static void writeToConsole(Integer number) {
		
		for (int i = 0; i < number; i++) {
			System.out.println("Hello, World!!!");
		}
		
	}
	
	public static void writeToFile(Integer number) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("out.txt");
			for (int i = 0; i < number; i++) {
				pw.write(i + ".Hello, World!!!\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
		
	}

}
