package schoolrecords;

public class StudyResultByName {
	private Student student;
	private double subjectAverage;

	public StudyResultByName(Student student, double subjectAverage) {
		this.student = student;
		this.subjectAverage = subjectAverage;
	}

	public Student getStudent() {
		return student;
	}

	public double getSubjectAverage() {
		return subjectAverage;
	}

	public String getStudentName() {
		return student.getName();
	}

	public double getStudyAverage() {
		double studyAverage = 0;

		return studyAverage;
	}
}
