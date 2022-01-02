package schoolrecords;

import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {

	private ClassRecords cr = new ClassRecords("Fourth Grade A", new Random(5));

	public static void main(String[] args) {
		SchoolRecordsController src = new SchoolRecordsController();
		src.printMenu();
	}

	public void printMenu() {
		System.out.println("1. Diákok nevének listázása\n" +
			"2. Diák név alapján keresése\n" +
			"3. Diák létrehozása\n" +
			"4. Diák név alapján törlése\n" +
			"5. Diák feleltetése\n" +
			"6. Osztályátlag kiszámolása\n" +
			"7. Tantárgyi átlag kiszámolása\n" +
			"8. Diákok átlagának megjelenítése\n" +
			"9. Diák átlagának kiírása\n" +
			"10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
			"11. Kilépés\n"
		);
		runMenu();
	}

	public void runMenu() {
		System.out.println("Melyik menüpontot választod?");
		Scanner scanner = new Scanner(System.in);
		int menuItem = scanner.nextInt();
		scanner.nextLine();

		if (menuItem == 1) {
			String studentNames = cr.listStudentNames();
			System.out.println(studentNames);
			printMenu();
		}

		if (menuItem == 2) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			Student student = cr.findStudentByName(name);
			System.out.println("Ezt a diákot találtuk a rendszerben:");
			System.out.println(student.getName());
			printMenu();
		}

		if (menuItem == 3) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			Student student = new Student(name);
			cr.addStudent(student);
			printMenu();
		}

		if (menuItem == 4) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			Student student = cr.findStudentByName(name);
			cr.removeStudent(student);
			printMenu();
		}

		if (menuItem == 5) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			cr.findStudentByName(name);
			printMenu();
		}

		if (menuItem == 6) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			cr.findStudentByName(name);
			printMenu();
		}

		if (menuItem == 7) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			cr.findStudentByName(name);
			printMenu();
		}

		if (menuItem == 8) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			cr.findStudentByName(name);
			printMenu();
		}

		if (menuItem == 9) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			cr.findStudentByName(name);
			printMenu();
		}

		if (menuItem == 10) {
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			cr.findStudentByName(name);
			printMenu();
		}
	}
}
