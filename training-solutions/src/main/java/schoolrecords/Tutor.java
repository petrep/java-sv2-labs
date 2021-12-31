package schoolrecords;

import java.util.List;

public class Tutor {
	private String name;
	private List<Subject> taughtSubjects;

	public Tutor(String name, List<Subject> taughtSubjects) {
		this.name = name;
		this.taughtSubjects = taughtSubjects;
	}

	public boolean tutorTeachingSubject(Subject subject) {
		boolean isSubjectInTaughtSubjects = false;
			for (Subject actualSubject: taughtSubjects) {
				isSubjectInTaughtSubjects = doesSubjectMatch(subject, actualSubject);
			}
		return isSubjectInTaughtSubjects;
	}

	private boolean doesSubjectMatch(Subject subject, Subject actualSubject) {
		String actualSubjectName = actualSubject.getSubjectName();
		String subjectName = subject.getSubjectName();

		return actualSubjectName.equalsIgnoreCase(subjectName);
	}

	public String getName() {
		return name;
	}
}
