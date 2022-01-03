package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {

	private ClassRecords cr = new ClassRecords("Fourth Grade A", new Random(5));
	private List<Subject> subjects = new ArrayList<>();
	private List<Tutor> tutors = new ArrayList<>();

	public static void main(String[] args) {
		SchoolRecordsController src = new SchoolRecordsController();
		src.initSchool();
		src.printMenu();
	}

	public void initSchool() {
		subjects = Arrays.asList(new Subject("földrajz"),
			new Subject("matematika"),
			new Subject("biológia"),
			new Subject("zene"),
			new Subject("fizika"),
			new Subject("kémia"));

			// Segítség a teszteléshez:
			Student student1 = new Student("Test Student1");
			cr.addStudent(student1);
			Student student2 = new Student("Test Student2");
			cr.addStudent(student2);
			Student student3 = new Student("Test Student3");
			cr.addStudent(student3);

		// emlékeztető magamnak:
		// az UML diagram alapján egy tantárgyhoz csak 1 tanár tartozhat,
		// viszont egy tanár taníthat több tantárgyat
		tutors.add(new Tutor("Nagy Csilla",
			Arrays.asList(subjects.get(0), subjects.get(1), subjects.get(2))));
		tutors.add(new Tutor("Szigorú Kornélia",
			Arrays.asList(subjects.get(3), subjects.get(4), subjects.get(5))));
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
			System.out.println("Kérlek írd be a keresett diák nevét:");
			String name = scanner.nextLine();
			Student student = cr.findStudentByName(name);
			System.out.println("Ezt a diákot találtuk a rendszerben:");
			System.out.println(student.getName());
			printMenu();
		}

		if (menuItem == 3) {
			System.out.println("Kérlek írd be a létrehozandó diák nevét:");
			String name = scanner.nextLine();
			Student student = new Student(name);
			cr.addStudent(student);
			printMenu();
		}

		if (menuItem == 4) {
			System.out.println("Kérlek írd be a törlendő diák nevét:");
			String name = scanner.nextLine();
			Student student = cr.findStudentByName(name);
			cr.removeStudent(student);
			printMenu();
		}

		if (menuItem == 5) {
			System.out.println("Diák feleltetése:");

			Student candidate = cr.repetition();
			System.out.println("candidate: " + candidate.getName());

			System.out.println("Kérlek írd be a kapott érdemjegyet (1-5):");
			int grade = scanner.nextInt();
			scanner.nextLine();
			MarkType markType = getMarkType(grade);

			System.out.println("Kérlek írd be a tárgy nevét:");
			String subjectName = scanner.nextLine();
			Subject subject = getSubject(subjectName);
//			System.out.println("subject: " + subject.getSubjectName());

			System.out.println("Kérlek írd be az oktató nevét:");
			String tutorName = scanner.nextLine();
			Tutor tutor = getTutor(tutorName);
//			System.out.println("tutor: " + tutor.getName());

			Mark mark = new Mark(markType, subject, tutor);

			candidate.grading(mark);

			printMenu();
		}

		if (menuItem == 6) {
			System.out.println("Osztályátlag kiszámolása:");
			System.out.println("Az osztályátlag: " + cr.calculateClassAverage());
			printMenu();
		}

		if (menuItem == 7) {
			System.out.println("Tantárgyi átlag kiszámolása:");
			System.out.println("Kérlek írd be a tantárgy nevét:");
			String subjectName = scanner.nextLine();
			Subject subject = getSubject(subjectName);
			System.out.println("A tantárgyi átlag: " + cr.calculateClassAverageBySubject(subject));
			printMenu();
		}

		if (menuItem == 8) {
			System.out.println("Diákok átlagának megjelenítése:");
			List<StudyResultByName> studyResults = cr.listStudyResults();
			for (StudyResultByName sr : studyResults) {
				System.out.println(sr.getStudentName());
				System.out.println(sr.getStudyAverage());
			}
			printMenu();
		}

		if (menuItem == 9) {
			System.out.println("Kérlek írd be a diák nevét az átlagszámításhoz:");
			String name = scanner.nextLine();
			Student student = cr.findStudentByName(name);
			System.out.println("A diák átlaga: " + student.calculateAverage());
			printMenu();
		}

		if (menuItem == 10) {
			System.out.println("Diák tantárgyhoz tartozó átlagának kiírása.");
			System.out.println("Kérlek írd be a diák nevét:");
			String name = scanner.nextLine();
			Student student = cr.findStudentByName(name);
			System.out.println("Kérlek írd be a tantárgy nevét:");
			String subjectName = scanner.nextLine();
			Subject subject = getSubject(subjectName);

			System.out.println("A diák tantárgyi átlaga: " + student.calculateSubjectAverage(subject));

			printMenu();
		}
	}

	private MarkType getMarkType(int grade) {
		MarkType markType = null;

		for (MarkType actualMarkType : MarkType.values()) {
			if (actualMarkType.getScore() == grade) {
				markType = actualMarkType;
			}
		}

		return markType;
	}

	private Subject getSubject(String subjectName) {
		Subject subject = null;

		for (Subject actualSubject: subjects) {
			if (actualSubject.getSubjectName().equals(subjectName)) {
				subject = actualSubject;
			}
		}

		return subject;
	}

	private Tutor getTutor(String tutorName) {
		Tutor tutor = null;

		for (Tutor actualTutor: tutors) {
			if (actualTutor.getName().equals(tutorName)) {
				tutor = actualTutor;
			}
		}

		return tutor;

	}

}
