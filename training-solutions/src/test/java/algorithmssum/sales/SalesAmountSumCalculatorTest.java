package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesAmountSumCalculatorTest {

	@Test
	void testSumSalesAmount() {
		SalesAmountSumCalculator test = new SalesAmountSumCalculator();

		List<Salesperson> salespersons = Arrays.asList(
				  new Salesperson("Ace", 150),
				  new Salesperson("Billy", 400),
				  new Salesperson("Colin", 900),
				  new Salesperson("David", 230),
				  new Salesperson("Elon", 440)
		);

		assertEquals(2120, test.sumSalesAmount(salespersons));
	}
}
