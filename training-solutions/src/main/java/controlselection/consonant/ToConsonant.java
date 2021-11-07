package controlselection.consonant;

import java.util.Arrays;
import java.util.List;

public class ToConsonant {
	public char toConsonant(char enteredChar) {
		char consonant;
		List<Character> vowels = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
		if (vowels.contains(enteredChar)) {
			consonant = (char) (enteredChar + 1);
		} else {
			consonant = enteredChar;
		}
		return consonant;
	}
}
