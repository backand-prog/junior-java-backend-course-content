package BookAnalyzer;

import java.util.List;
import java.util.stream.Collectors;

public class WordHandler {
	
	public List<String> handleWords(List<String> words) {
		toLowerCaseEveryWord(words);
		removeSpecialChars(words);
		removeEmptyElements(words);
		
		return words;
	}
	
	public List<String> removeSpecialChars(List<String> words){
		
		for (int i = 0; i < words.size(); i++) {
			
			words.set(i, words.get(i).replace(".", ""));
			words.set(i, words.get(i).replace("=", ""));
			words.set(i, words.get(i).replace(",", ""));
			words.set(i, words.get(i).replace(";", ""));
			words.set(i, words.get(i).replace("_", ""));
			words.set(i, words.get(i).replace(":", ""));
			words.set(i, words.get(i).replace("'", ""));
			words.set(i, words.get(i).replace("`", ""));
			words.set(i, words.get(i).replace("!", ""));
			words.set(i, words.get(i).replace("?", ""));
			words.set(i, words.get(i).replace("(", ""));
			words.set(i, words.get(i).replace(")", ""));
			words.set(i, words.get(i).replace("\"", ""));
			words.set(i, words.get(i).replace("-", ""));

			
		}
		
		return words;
		
	};
	
	
	public List<String> removeEmptyElements(List<String> words) {
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() == 0) {
				words.remove(i);
			}
		}
		
		return words;
		
	}
	
	public List<String> toLowerCaseEveryWord(List<String> words){
			
		for (int i = 0; i < words.size(); i++) {
			
			words.set(i, words.get(i).toLowerCase());
		}
		
		return words;
	}
	
	
	
}
