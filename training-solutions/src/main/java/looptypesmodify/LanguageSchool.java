package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		Student firstStudent = new Student("Penelope Russell");
		Student secondStudent = new Student("Justin Mitchell");
		Student thirdStudent = new Student("Tracey Dowd");
		Student fourthStudent = new Student("Kevin Piper");
		Student fifthStudent = new Student("Lauren Peters");
		students.add(firstStudent);
		students.add(secondStudent);
		students.add(thirdStudent);
		students.add(fourthStudent);
		students.add(fifthStudent);

		System.out.println(students.size());

		secondStudent.setActive(false);
		thirdStudent.setActive(false);

		List<Student> studentsToRemove = new ArrayList<>();
		for (Student student : students) {
			if (!student.isActive()) {
				studentsToRemove.add(student);
			}
		}
		students.removeAll(studentsToRemove);

		System.out.println(students.size());
	}
}
