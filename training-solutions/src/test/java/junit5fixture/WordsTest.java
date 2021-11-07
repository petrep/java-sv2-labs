package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
	Words words;

	@BeforeEach
	void init() {
		words = new Words();
		words.addWord("alma");
		words.addWord("barack");
		words.addWord("boróka");
		words.addWord("cica");
		words.addWord("cumi");
		words.addWord("dió");
		words.addWord("eper");
	}
	@Test
	void testGetWordsStartWith() {
		List<String> expected = Arrays.asList("barack", "boróka");
		words.getWordsStartWith("b");

		assertEquals(expected, words.getWords());
	}

	@Test
	void testGetWordsWithLength() {
		List<String> expected = Arrays.asList("alma", "cica", "cumi", "eper");
		words.getWordsWithLength(4);

		assertEquals(expected, words.getWords());
	}

}
