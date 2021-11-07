package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {

	@Test
	void testGetTableOfNumbers() {
		// Given
		Labels labels = new Labels();

		// When
		int[][] table = labels.getTableOfNumbers(6);

		// Then
		assertEquals(7, table[3][2]);
		assertEquals(8, table[1][5]);
	}
}
