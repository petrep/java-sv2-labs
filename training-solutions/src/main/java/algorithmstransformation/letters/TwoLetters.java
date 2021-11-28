package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
	public List<String> getFirstTwoLetters(List<String> wordList) {
		List<String> firstTwoLetterList = new ArrayList<>();

		for (String word : wordList) {
			firstTwoLetterList.add(word.substring(0, 2));
		}

		return firstTwoLetterList;
	}
}
