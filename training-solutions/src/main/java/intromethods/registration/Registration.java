package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
	public String getFullName(String lastName, String firstName) {
		return lastName + " " + firstName;
	}

	public LocalDate getDateOfBirth(int year, int month, int day) {
		return LocalDate.of(year, month, day);
	}

	public static void main(String[] args) {
		Registration registration = new Registration();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your last name:");
		String lastName = scanner.nextLine();

		System.out.println("Now please enter your first name:");
		String firstName = scanner.nextLine();

		System.out.println("And now please type your date of birth:");
		System.out.println("Year:");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Month:");
		int month = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Day:");
		int day = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Please provide your email address:");
		String email = scanner.nextLine();

		String name = registration.getFullName(lastName, firstName);
		LocalDate dateOfBirth = registration.getDateOfBirth(year, month, day);

		Person registratedPerson = new Person(name, dateOfBirth, email);
		System.out.println(registratedPerson);
	}
}
