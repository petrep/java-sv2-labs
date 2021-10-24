package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
	public static void main(String[] args) {
		List<String> food = new ArrayList<>();
		food.add("10 dkg vaj");
		food.add("10 dkg sajt");
		food.add("10 dkg sonka");
		food.add("1 l tej");
		food.add("2 l kakaó");

		System.out.println("A hűtő tartalma:\n" + food);
		System.out.println("A benne lévő ételek száma:\n" + food.size());

		food.remove("1 l tej");
		food.remove("2 l kakaó");

		System.out.println("A hűtő tartalma:\n" + food);
		System.out.println("A benne lévő ételek száma:\n" + food.size());
	}
}
