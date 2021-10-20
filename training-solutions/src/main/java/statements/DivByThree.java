package statements;

import java.util.Scanner;

public class DivByThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kérlek írj be egy egész számot:");
		int number = scanner.nextInt();
		scanner.nextLine();

		if (number % 3 == 0) {
			System.out.println("A megadott szám osztható 3-mal");
		} else {
			System.out.println("A megadott szám nem osztható 3-mal");
		}
	}
}
