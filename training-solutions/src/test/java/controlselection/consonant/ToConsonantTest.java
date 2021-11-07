package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
	@Test
	void testVowel() {
		assertEquals('b', new ToConsonant().toConsonant('a'));
		assertEquals('f', new ToConsonant().toConsonant('e'));
		assertEquals('j', new ToConsonant().toConsonant('i'));
	}

	@Test
	void testConsonant() {
		assertEquals('b', new ToConsonant().toConsonant('b'));
		assertEquals('g', new ToConsonant().toConsonant('g'));
		assertEquals('z', new ToConsonant().toConsonant('z'));
	}
}
