package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {
	@Test
	void setup() {

		Salesperson person = new Salesperson("Dagobert", 11000, 10000);

		assertEquals(11000, person.getAmount());
		assertEquals(10000, person.getTarget());
		assertEquals(1000, person.getDifferenceFromTarget());
	}
}
