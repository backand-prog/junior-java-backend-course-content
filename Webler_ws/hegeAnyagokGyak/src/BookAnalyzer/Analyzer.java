package BookAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Analyzer {

	public static void main(String[] args) {
	
		FileHandler fh = new FileHandler();	
		String fileName = "Fellowship of the ring.txt";
		List<String> words = new ArrayList<String>();		
		words = fh.fileReader(fileName);

		new WordHandler().handleWords(words);

		Map<String, Integer> test = new HashMap<>();
		BookData bd = new BookData();
		test = bd.wordAmount(words);

		Map<String, Integer> sortedWordsAmount = new LinkedHashMap<>();
		sortedWordsAmount = bd.sortedWordAmounts(test);
		
		bd.printWordAmount(sortedWordsAmount);

	}

}
