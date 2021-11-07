package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeeksTest {

	@Test
	void testWeekStatus() {
		assertEquals("hét eleje", new DayOfWeeks().getTypeOfDayWithSwitchStatement("hétfő"));
		assertEquals("hét közepe", new DayOfWeeks().getTypeOfDayWithSwitchStatement("csütörtök"));
		assertEquals("majdnem hétvége", new DayOfWeeks().getTypeOfDayWithSwitchStatement("péntek"));
		assertEquals("hét vége", new DayOfWeeks().getTypeOfDayWithSwitchStatement("szombat"));
	}

	@Test
	void testCase() {
		assertEquals("hét eleje", new DayOfWeeks().getTypeOfDayWithSwitchStatement("HÉtfŐ"));
	}

	@Test
	void testIllegalDay() {
		assertEquals("ismeretlen nap", new DayOfWeeks().getTypeOfDayWithSwitchStatement("dummy"));
	}
}
