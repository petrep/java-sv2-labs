package junit5fixture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
	List<String> words = new ArrayList<String>();

	public List<String> getWords() {
		return words;
	}

	public void addWord(String word) {
		words.add(word);
	}

	public void getWordsStartWith(String prefix) {
		List<String> notNeededWords = new ArrayList<>();
		for (String myWord : words) {
			if (!myWord.startsWith(prefix)) {
				notNeededWords.add(myWord);
			}
		}
		words.removeAll(notNeededWords);
	}

	public void getWordsWithLength(int length) {
		List<String> notNeededWords = new ArrayList<>();
		for (String myWord : words) {
			if (myWord.length() != length) {
				notNeededWords.add(myWord);
			}
		}
		words.removeAll(notNeededWords);
	}
}
