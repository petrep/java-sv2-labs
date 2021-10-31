package stringscanner;

import java.util.Scanner;

public class IntScanner {

	public static void main(String[] args) {
		IntScanner intScanner = new IntScanner();

		System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
		System.out.println(intScanner.convertInts("200"));
		System.out.println(intScanner.convertInts("2"));
		System.out.println(intScanner.convertInts(""));
		System.out.println(intScanner.convertInts("11;9;43;67;32;82"));
	}

	public String convertInts(String ints) {
		Scanner scanner = new Scanner(ints).useDelimiter(";");
		StringBuilder sb = new StringBuilder();
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if (number > 100) {
				sb.append(number);
				sb.append(",");
			}
		}
		String result = sb.toString();
		if (result.length() == 0) {
			return result;
		}
		return result.substring(0, result.length() - 1);
	}
}
