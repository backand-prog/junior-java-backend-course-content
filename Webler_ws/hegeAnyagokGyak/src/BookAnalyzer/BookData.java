package BookAnalyzer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class BookData {
	
	public void printWordAmount(Map<String, Integer> wordMap) {
		
		for (Map.Entry<String, Integer> item : wordMap.entrySet()) {
			System.out.println(item.getKey() + ": " + item.getValue());
		}
	}

	public Map<String, Integer> wordAmount(List<String> words) {
		
		Map<String, Integer> wordsNum = new HashMap<>();
		
		for (int i = 0; i < words.size(); i++) {
			
			if (!wordsNum.containsKey(words.get(i))) {
				wordsNum.put(words.get(i), 1);
			} else if (wordsNum.containsKey(words.get(i))) {
				int count = wordsNum.get(words.get(i));
				wordsNum.replace(words.get(i), ++count);
			}
			
		}
		
		return wordsNum;
		
		/* THIS SOULTION WAS VERY SLOW (USING SET)
		Set<String> wordsDistinct = new HashSet<>();
		
		wordsDistinct = words.stream()
				.distinct()
				.collect(Collectors.toSet());
		
		
		Map<String, Integer> wordsNum = new HashMap<>();
		
		for (String item : wordsDistinct) {
			wordsNum.put(item, 0);
		}
		
		
		for (int i = 0; i < words.size(); i++) {
			for (Map.Entry<String, Integer> item : wordsNum.entrySet()) {
				if (words.get(i).equals(item.getKey())) {
					item.setValue(item.getValue()+1);
				}
			}
			
		}
		
		return wordsNum;
		*/

	}
	
	public Map<String, Integer> sortedWordAmounts (Map<String, Integer> unsortedWordAmounts) {
		
		 Map<String, Integer> sortedWordAmounts =  unsortedWordAmounts.entrySet().stream()
				 .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				 .limit(200)
				 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
				 
		 
		 return sortedWordAmounts;
		
	}
	
}
