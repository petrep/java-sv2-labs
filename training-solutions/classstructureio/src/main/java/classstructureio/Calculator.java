package classstructureio;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Üdv a csodálatos összeadó programban!");
		System.out.println("Kérlek írd be az első számot, lécci" +
				" egész szám legyen: ");
		int firstInt = scanner.nextInt();
		System.out.println("Oké, és most kérlek írd be a második számot," +
				" lécci ez is egész szám legyen: ");
		int secondInt = scanner.nextInt();

		System.out.println("" + firstInt + " + " + secondInt);
		System.out.println(firstInt + secondInt);
	}
}
