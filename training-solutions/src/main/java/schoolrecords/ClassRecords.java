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

		return classAverage;
	} //osztályátlagot számol, minden diákot figyelembe véve

	public double calculateClassAverageBySubject(Subject subject) {
		double classAverageBySubject = 0;

		return classAverageBySubject;
	} //tantárgy szerinti osztályátlagot számol,
	// kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye

	public Student findStudentByName(String name) {
		Student student = null;

		return student;
	} // név szerint megkeres egy diákot az osztályban

	public Student repetition() {
		Student student = null;

		return student;
	} //felelethez a listából random módon kiválaszt egy diákot

	public List<StudyResultByName> listStudyResults() {
		List<StudyResultByName> studyResultsByName = null;

		return studyResultsByName;

	} //a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
	// és azok listáját adja vissza

	public String listStudentNames() {
		String studentNames = "";

		return studentNames;
	} //kilistázza a diákok neveit, vesszővel elválasztva


	public String getClassName() {
		return className;
	}

	public Random getRandom() {
		return random;
	}

	public List<Student> getStudents() {
		return new ArrayList<>(students);
	}
}
