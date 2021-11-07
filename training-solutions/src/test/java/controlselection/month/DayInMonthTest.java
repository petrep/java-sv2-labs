package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayInMonthTest {

	@Test
	void testNumberOfDays() {
		assertEquals(31, new DayInMonth().numberOfDays(2017, "augusztus"));
		assertEquals(30, new DayInMonth().numberOfDays(2017, "április"));
		assertEquals(28, new DayInMonth().numberOfDays(2021, "február"));
		assertEquals(28, new DayInMonth().numberOfDays(1700, "február"));
	}

	@Test
	void testCase() {
		assertEquals(31, new DayInMonth().numberOfDays(2020, "AUgusztus"));
	}

	@Test
	void testLeapYear() {
		assertEquals(29, new DayInMonth().numberOfDays(1612, "február"));
	}

	@Test
	void testInvalidEntry() {
		assertEquals(0, new DayInMonth().numberOfDays(2012, "dummy"));
	}
}
