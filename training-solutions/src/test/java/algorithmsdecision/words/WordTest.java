package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

	@Test
	void testContainsLongerWord() {
		Word word = new Word();
		List<String> words = Arrays.asList("short", "verylongword", "evenlongerword", "shorty");

		assertTrue(word.containsLongerWord(words, "shortword"));
		assertFalse(word.containsLongerWord(words, "veryveryverylongword"));
		assertFalse(word.containsLongerWord(words, "veryveryveryverylongword"));
	}
}