package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
	private String className;
	private Random random;
	private List<Student> students = new ArrayList<>();

	public ClassRecords(String className, Random random) {
		this.className = className;
		this.random = random;
	}

	public boolean addStudent(Student student) {
		boolean wasStudentAdded = false;

		if (students.size() == 0) {
			students.add(student);
			return true;
		}

		if(isStudentAlreadyInList(student)) return false;

		students.add(student);
		wasStudentAdded = true;

		return wasStudentAdded;
	}// felvesz egy diákot az osztályba

	private boolean isStudentAlreadyInList(Student student) {
		boolean isStudentAlreadyInList = false;
		for (Student actualStudent : students) {
			if (actualStudent.getName().equals(student.getName())) {
				isStudentAlreadyInList = true;
			}
		}
		return isStudentAlreadyInList;
	}

	public boolean removeStudent(Student student) {
		boolean wasStudentRemoved = false;

		if(!isStudentAlreadyInList(student)) return false;

		students.remove(student);
		wasStudentRemoved = true;

		return wasStudentRemoved;
	} //kivesz egy diákot az osztályból

	public double calculateClassAverage() {
		double classAverage = 0;
		double classMarksSum = 0;
		int markCount = 0;

		if (students.size() == 0) {
			throw new ArithmeticException("No student in the class, average calculation aborted!");
		}

		if (!isMarkPresent()) {
			throw new ArithmeticException("No marks present, average calculation aborted!");
		}

		List<Mark> markList = new ArrayList<>();
			for (Student actualStudent : students) {
				double studentAverage = actualStudent.calculateAverage();
				classMarksSum += studentAverage;
				if (studentAverage > 0) markCount++;
		}

		classAverage = classMarksSum / (markCount * 1.0);
		String averageValue = String.format("%1.2f", classAverage);

		return Double.valueOf(averageValue);
	} //osztályátlagot számol, minden diákot figyelembe véve

	private boolean isMarkPresent() {
		boolean markFound = false;
		for (Student actualStudent : students) {
			if (actualStudent.sumStudentMarks() != 0) markFound = true;
		}
		return markFound;
	}

	public double calculateClassAverageBySubject(Subject subject) {
		double classAverageBySubject = 0;

		double classSubjectMarksSum = 0;
		int subjectMarkCount = 0;

		for (Student actualStudent : students) {
			double studentSubjectAverage = actualStudent.calculateSubjectAverage(subject);
			classSubjectMarksSum += studentSubjectAverage;
			if (studentSubjectAverage > 0) subjectMarkCount++;
		}

		classAverageBySubject = classSubjectMarksSum / (subjectMarkCount * 1.0);
		String classAverageBySubjectValue = String.format("%1.2f", classAverageBySubject);

		return classAverageBySubject;
	} //tantárgy szerinti osztályátlagot számol,
	// kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye

	public Student findStudentByName(String name) {
		Student student = null;

		if (isEmpty(name)) {
			throw new IllegalArgumentException("Student name must not be empty!");
		}

		if (students.size() == 0) {
			throw new IllegalStateException("No students to search!");
		}

		for (Student actualStudent : students) {
			if (actualStudent.getName().equalsIgnoreCase(name)) student = actualStudent;
		}

		if (student == null) {
			throw new IllegalArgumentException("Student by this name cannot be found! " + name);
		}

		return student;
	} // név szerint megkeres egy diákot az osztályban

	public Student repetition() {
		Student student = null;

		if (students.size() == 0) {
			throw new IllegalStateException("No students to select for repetition!");
		}

		int randomIndex = random.nextInt(students.size());
		student = students.get(randomIndex);

		return student;
	} //felelethez a listából random módon kiválaszt egy diákot

	public List<StudyResultByName> listStudyResults() {
		List<StudyResultByName> studyResultsByName = new ArrayList<>();

		for (Student actualStudent : students) {
			studyResultsByName.add(new StudyResultByName(
				actualStudent, actualStudent.calculateAverage()
			));
		}

		return studyResultsByName;

	} //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
	// és azok listáját adja vissza

	public String listStudentNames() {
		String studentNames = "";

		if (students.size() == 0) {
			throw new IllegalStateException("No students in class!");
		}

		for (Student actualStudent : students) {
			studentNames += actualStudent.getName() + ", ";
		}

		studentNames = studentNames.substring(0, studentNames.length() - 2);

		return studentNames;
	} //kilistázza a diákok neveit, vesszővel elválasztva

	private boolean isEmpty(String str) {
		return (str == null || str.trim().length() < 1);
	}

	public String getClassName() {
		return className;
	}

	public Random getRandom() {
		return random;
	}
}
