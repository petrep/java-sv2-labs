package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ez a program kiírja egy tetszőleges ");
		System.out.println("pozitív egész számtól kezdve az összes számot, " +
		 "de a 7-tel osztható számok helyett X-et ír ki, " +
		  "viszont 7-tel nem osztható, de 7-es számjegyet tartalmazó szám " +
		   "elérése esetén pedig leáll.");
		System.out.println(" Kérem írjon be egy kezdőszámot:");
		int startingNumber = scanner.nextInt();

		printNumbers(startingNumber);
	}

	private static void printNumbers(int startingNumber) {
		boolean foundIt = false;
		while (!foundIt) {
			if (startingNumber % 7 == 0) {
			System.out.println("X");
			startingNumber++;
			continue;
			}
			if ((startingNumber + "").contains("7")) break;
			System.out.println(startingNumber);
			startingNumber++;
		}
	}
}
