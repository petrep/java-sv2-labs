package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("csoki");
		names.add("vanília");
		names.add("eper");
		names.add("citrom");
		names.add("puncs");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < names.size(); i++) {
			sb.append(names.get(i));
			if (i != (names.size() - 1)) {
				sb.append(", ");
			}
		}

		System.out.println("Ma kapható: " + sb.toString() + ".");
		System.out.println("Gyerekeknek féláron!");
	}
}
