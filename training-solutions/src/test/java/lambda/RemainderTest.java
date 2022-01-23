package lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

	@Test
	void changeNumbersToRemaindersTest() {
		Remainder remainder = new Remainder();

		//ha az eredeti lista tartalma [45, 13, 64, 51, 92, 33], akkor a metódus
		// a következőt adja vissza 3-mal való osztás esetén: [0, 1, 1, 0, 2, 0]!

		List<Integer> originalNumbers = new ArrayList<>(Arrays.asList(45, 13, 64, 51, 92, 33));

		assertEquals(Arrays.asList(0, 1, 1, 0, 2, 0), remainder.changeNumbersToRemainders(originalNumbers, 3));
	}
}