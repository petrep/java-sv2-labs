package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDigitEvensTest {

	@Test
	void getSumTest() {

	TwoDigitEvens tde = new TwoDigitEvens();

	assertEquals(1980,tde.getSum());
	}

}
