package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

	private List<Student> students = new ArrayList<>();

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public boolean areEqual(Student student, Student otherStudent) {
		String studentNeptunCode = student.getNeptunCode();
		String otherStudentNeptunCode = student.getNeptunCode();
		String studentEducationalId = student.getEducationalId();
		String anotherStudentEducationalId = otherStudent.getEducationalId();

		return studentNeptunCode.equals(otherStudentNeptunCode)
				  && studentEducationalId.equals(anotherStudentEducationalId);
	}
}
