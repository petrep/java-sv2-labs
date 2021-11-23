package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightTest {

	@Test
	void testCountChildrenWithHeightGreaterThan() {
		List<Integer> heights = Arrays.asList(110, 160, 101, 109, 166, 145);
		Height height = new Height();
		int expected = height.countChildrenWithHeightGreaterThan(heights, 130);

		assertEquals(3, expected);
	}
}
