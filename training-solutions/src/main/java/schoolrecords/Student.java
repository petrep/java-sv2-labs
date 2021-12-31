package schoolrecords;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;


public class Student {
	private MarkType markType;
	private String name;
	private List<Mark> marks = new ArrayList<>();

	public Student(String name) {
		if (name.isEmpty()) throw new IllegalArgumentException("Student name must not be empty!");
		this.name = name;
	}

	public Student(MarkType markType) {
		this.markType = markType;
	}


	public String getName() {
		return name;
	}

	public void grading(Mark mark) {
		if (mark == null) throw new NullPointerException("Mark must not be null!");
		marks.add(mark);
	} // érdemjegy rögzítése

	public double calculateAverage() {
		double average = 0.0;
		int markSum = 0;

		if (marks.size() == 0) return 0.0;

		for (Mark actualMark : marks) {
			markSum += actualMark.getMarkType().getScore();
		}

		average = markSum / (marks.size() * 1.0);

		String averageValue = String.format("%1.2f", average);

		return Double.valueOf(averageValue);
	} // teljes átlag számolása

	public double calculateSubjectAverage(Subject subject) {
		double subjectAverage = 0.0;
		int markSum = 0;
		int subjectCount = 0;

		if (marks.size() == 0) return 0.0;

		for (Mark actualMark : marks) {
			if (doesSubjectMatch(actualMark.getSubject(), subject)) {
				markSum += actualMark.getMarkType().getScore();
				subjectCount++;
			}
		}

		subjectAverage = markSum / (subjectCount * 1.0);
		String subjectAverageValue = String.format("%1.2f", subjectAverage);

		if (subjectCount > 0) {
			return Double.valueOf(subjectAverageValue);
		} else return 0.0;
	} // tantárgyhoz tartozó átlag számítása

	public String toString() {
		return name + " marks: " +
				  marks.get(0).getSubject().getSubjectName() + ": " +
				  marks.get(0).getMarkType().getRating() + "(" +
				  marks.get(0).getMarkType().getScore() + ")";

	} // diák szöveges reprezentációja


	public MarkType getMarkType() {
		return markType;
	}

	public List<Mark> getMarks() {
		return new ArrayList<>(marks);
	}

	private boolean doesSubjectMatch(Subject subject, Subject actualSubject) {
		String subjectName = subject.getSubjectName();
		String actualSubjectName = actualSubject.getSubjectName();

		return actualSubjectName.equalsIgnoreCase(subjectName);
	}

}
