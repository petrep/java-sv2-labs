package introcontrol;

import java.util.Scanner;

public class Qualifier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kérlek adj meg egy egész számot: ");
		int number = scanner.nextInt();
//		scanner.nextLine();
		System.out.println((number > 100) ? "Nagyobb, mint száz" : "Száz, vagy kisebb");
	}
}
