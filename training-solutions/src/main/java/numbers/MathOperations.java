package numbers;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {

		String quiz = "(5 / (2 + 1)) * (8 - 6)";
		double result = (5d / (2 + 1)) * (8 - 6);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type in the result (round to 4 decimal places)");
		System.out.println(quiz);

		double resultByUser = scanner.nextDouble();

		if (Math.abs(result - resultByUser) < 0.0001) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
			System.out.println("The correct answer was: " + result);
		}
	}
}
