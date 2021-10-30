package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

	public static void main(String[] args) {
		Exam exam = new Exam();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name if you would like to do the exam:");
		String name = scanner.nextLine();

		System.out.println("Please provide your data:");

		System.out.println("Year of birth:");
		String yearString = scanner.nextLine();
		int year = Integer.parseInt(yearString);

		System.out.println("Month of birth:");
		String monthString = scanner.nextLine();
		int month = Integer.parseInt(monthString);

		System.out.println("Day of birth:");
		String dayString = scanner.nextLine();
		int day = Integer.parseInt(dayString);

		LocalDate dateOfBirth = LocalDate.of(year, month, day);

		System.out.println("Please provide your zip code:)");
		String zipCodeString = scanner.nextLine();
		int zipCode = Integer.parseInt(zipCodeString);

		System.out.println("Please type in your average score:");
		String averageString = scanner.nextLine();
		double average = Double.parseDouble(averageString);

		Person person = new Person(name, dateOfBirth, zipCode, average);
		exam.addPerson(person);
		System.out.println(exam.getRegisteredPeople());
	}
}
