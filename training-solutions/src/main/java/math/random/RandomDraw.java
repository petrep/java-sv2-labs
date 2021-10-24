package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

	public static void main(String[] args) {
		List<String> persons = new ArrayList<>();
		persons.add("Pierre");
		persons.add("Ricky");
		persons.add("Sergio");
		persons.add("Tara");
		persons.add("Miles");
		persons.add("Liam");
		persons.add("Maritza");
		persons.add("Julien");
		persons.add("Donavan");
		persons.add("Oscar");

		Random random = new Random();
		int firstIndex = random.nextInt(5);
		int secondIndex = 5 + random.nextInt(5);

		System.out.println(persons.get(firstIndex));
		System.out.println(persons.get(secondIndex));
	}
}
