package stringbasic;

import java.util.List;

public class UniversityMain {

	public static void main(String[] args) {
		Person person = new Person("Bill Burr", "billburr@gmail.com", "222333444",
				  "12345678-12345678-12345678", "+36701234567");
		Student student = new Student(person, "A12345", "55555");
		University university = new University();
		Person samePerson = new Person("Bill Terry Burr", "billburr@gmail.com", "222333444",
				  "12345678-12345678-12345678", "+36701234567");
		Student sameStudent = new Student(samePerson, "A12345", "55555");
		Person anotherPerson = new Person("Eric Clapton", "eclapton@gmail.com", "222333999",
				  "12345678-12345678-12345678", "+36201234567");
		Student anotherStudent = new Student(anotherPerson, "Z12345", "99999");

		student.setCardNumber("id123123");
		System.out.println(student.getPerson().getName() + "'s id is: " + student.getCardNumber());
		System.out.print("checking if " + student.getPerson().getName() +
			" equals " + sameStudent.getPerson().getName() + ": ");
		System.out.println(university.areEqual(student, sameStudent));
		System.out.print("checking if " + student.getPerson().getName() +
			  " equals " + anotherStudent.getPerson().getName() + ": ");
		System.out.println(university.areEqual(student, anotherStudent));

		List<Student> uniWithoutStudents = university.getStudents();
		System.out.println("uniWithoutStudents.size: " + uniWithoutStudents.size());
		university.addStudent(student);
		List<Student> uniWithStudents = university.getStudents();
		System.out.println("uniWithStudents.size: " + uniWithStudents.size());
	}
}

