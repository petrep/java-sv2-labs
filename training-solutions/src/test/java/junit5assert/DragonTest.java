package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
	Dragon dragon = new Dragon("Süsü", 1, 2.8);

	@Test
	void testName(){
		assertEquals("Süsü", dragon.getName());
		assertNotEquals("Süsüke", dragon.getName());
	}

	@Test
	void testNumberOfHeads() {
		assertEquals(1, dragon.getNumberOfHeads());
		assertTrue(1 == dragon.getNumberOfHeads());
		assertFalse(2 == dragon.getNumberOfHeads());
	}

	@Test
	void testHeight() {
		assertEquals(2.8, dragon.getHeight(), 0.005);
	}

	@Test
	void testNull() {
		Dragon dragon1 = new Dragon("Süsü1", 1, 2.8);
		Dragon dragon2 = null;

		assertNotNull(dragon1);
		assertNull(dragon2);
	}

	@Test
	void testSameObjects() {
		Dragon dragon3 = new Dragon("Süsü1", 1, 2.8);
		Dragon dragon4 = dragon3;

		assertSame(dragon3, dragon4);
	}

	@Test
	void testNotSameObjects() {
		Dragon dragon5 = new Dragon("Süsü", 1, 2.8);
		Dragon dragon6 = new Dragon("Süsü", 1, 2.8);

//		assertSame(dragon5, dragon6);
		assertNotSame(dragon5, dragon6);
	}
}
