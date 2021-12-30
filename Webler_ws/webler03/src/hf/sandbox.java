package hf;

import java.io.FileWriter;
import java.io.IOException;

public class sandbox {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("proba.txt", true);
			for (int i = 0; i < 100; i++) {
			fw.write((i+101) + ". Hello World\r\n");
			}
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
