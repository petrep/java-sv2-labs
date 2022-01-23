package lambda;

import java.util.ArrayList;
import java.util.List;

public class Remainder {
	public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
		List<Integer> results = new ArrayList<>();

		numbers.replaceAll(number -> number % divisor);
		results = numbers;

		return results;
	}
}
