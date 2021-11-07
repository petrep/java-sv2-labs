package controliteration.division;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;


public class DivisionTest {
	Division division;

	@BeforeEach
	void init() {
		division = new Division();
	}

	@Test
	void testDivisionUsingFor() {
		List<Integer> results = Arrays.asList(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33);
		Assertions.assertEquals(results, Division.divisionUsingFor(35, 3));
	}

	@Test
	void testDivisionUsingWhile() {
		List<Integer> results = Arrays.asList(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33);
		Assertions.assertEquals(results, Division.divisionUsingFor(35, 3));
	}
}
