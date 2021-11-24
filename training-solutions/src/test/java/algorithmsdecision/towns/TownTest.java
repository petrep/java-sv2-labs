package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

	@Test
	void testContainsFewerHabitants() {
		Town town = new Town();
		List<Integer> habitants = Arrays.asList(4344, 14442, 54232, 5244, 665, 43334);

		assertTrue(town.containsFewerHabitants(habitants, 1000));
		assertFalse(town.containsFewerHabitants(habitants, 100));
	}
}