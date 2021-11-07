package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ShipTest {

	Ship ship;

	@BeforeEach
	void init() {
		ship = new Ship("Fonyód", 1994, 14.4);
	}

	@Test
	void testName() {
		assertEquals("Fonyód", ship.getName());
		assertNotEquals("Rossznév", ship.getName());
	}

	@Test
	void testYearOfConstruction() {
		assertEquals(1994, ship.getYearOfConstruction());
		assertTrue(ship.getYearOfConstruction() == 1994);
		assertFalse(ship.getYearOfConstruction() == 1333);
		assertEquals(true, ship.getYearOfConstruction() == 1994);
		assertEquals(false, ship.getYearOfConstruction() == 1323);
	}

	@Test
	void testLength() {
		assertEquals(14.4, ship.getLength(), 0.005);
	}

	@Test
	void testNull() {
		Ship anotherShip = null;

		assertNotNull(ship);
		assertNull(anotherShip);
	}

	@Test
	void testSameObjects() {
		Ship anotherShip = ship;

		assertSame(ship, anotherShip);
	}

	@Test
	void testNotSameObjects() {
		Ship anotherShip = new Ship("Fonyód", 1994, 14.4);

		assertNotSame(ship, anotherShip);
	}
}
