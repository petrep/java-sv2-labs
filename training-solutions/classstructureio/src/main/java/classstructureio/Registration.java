package classstructureio;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		System.out.println("  * T360 Registration Page *");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kérlek add meg a teljes neved:");
		String name = scanner.nextLine();
		System.out.println("Végül pedig kérlek add meg az email címedet:");
		String emailAddress = scanner.nextLine();
		System.out.println(" Ezeket az adatokat adtad meg:");
		System.out.println(name);
		System.out.println(emailAddress);
	}
}
