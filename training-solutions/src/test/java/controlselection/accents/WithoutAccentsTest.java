package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutAccentsTest {

	@Test
	void testWith() {
		assertEquals('a', new WithoutAccents().toCharWithoutAccents('á'));
		assertEquals('i', new WithoutAccents().toCharWithoutAccents('í'));
		assertEquals('e', new WithoutAccents().toCharWithoutAccents('é'));
		assertEquals('u', new WithoutAccents().toCharWithoutAccents('ü'));
		assertEquals('o', new WithoutAccents().toCharWithoutAccents('ó'));
		assertEquals('U', new WithoutAccents().toCharWithoutAccents('Ű'));
		assertEquals('O', new WithoutAccents().toCharWithoutAccents('Ó'));
	}

	@Test
	void testWithout() {
		assertEquals('a', new WithoutAccents().toCharWithoutAccents('a'));
		assertEquals('y', new WithoutAccents().toCharWithoutAccents('y'));
		assertEquals('k', new WithoutAccents().toCharWithoutAccents('k'));
	}
}
