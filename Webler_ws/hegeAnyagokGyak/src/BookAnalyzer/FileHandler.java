package BookAnalyzer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
	
	public List<String> fileReader(String fileName) {
		
		List<String> words = new ArrayList<String>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			
			while (br.ready()) {
				
				String line = br.readLine();
				
				String[] wordsofLine = line.split(" ");
				
				for (String item : wordsofLine) {
					words.add(item);
				}
							
				
			}
			
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return words;
		
	}

}
