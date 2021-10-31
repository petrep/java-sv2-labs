package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bill Burr", "Ricky Gerwais", "Tom Hanks");

		for (String name : names) {
			System.out.printf("Dear %s! Thank you for choosing our product!", name);
			System.out.println();
		}
	}
}
