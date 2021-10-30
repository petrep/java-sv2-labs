package numbers;

import java.util.Scanner;

public class Percent {

 	public double getValue(int firstNumber, int secondNumber) {
		double value = firstNumber / 100d * secondNumber;
		return value;
	}

	public double getBase(int firstNumber, int secondNumber) {
		double base = firstNumber / (double) secondNumber * 100;
		return base;
	}

	public double getPercent(int firstNumber, int secondNumber) {
		double percent = secondNumber / (double) firstNumber * 100;
		return percent;
	}

	public static void main(String[] args) {
		Percent percent = new Percent();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		int valueNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Please enter the second number:");
		int valueAnotherNumber = Integer.parseInt(scanner.nextLine());

		double valueResult = percent.getValue(valueNumber, valueAnotherNumber);

		System.out.println("The result: " + valueResult);

		System.out.println();

		System.out.println("Please enter the first number:");
		int baseNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Please enter the second number");
		int baseAnotherNumber = Integer.parseInt(scanner.nextLine());

		double baseResult = percent.getBase(baseNumber, baseAnotherNumber);

		System.out.println("The result: " + baseResult);

		System.out.println();

		System.out.println("Please enter the first number");
		int percentNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Please enter the second number");
		int percentAnotherNumber = Integer.parseInt(scanner.nextLine());

		double percentResult = percent.getPercent(percentNumber, percentAnotherNumber);

		System.out.println("The result: " + percentResult + " %");
	}
}
