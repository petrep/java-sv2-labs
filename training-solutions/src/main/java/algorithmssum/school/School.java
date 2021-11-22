package algorithmssum.school;

import java.util.List;

public class School {

	public int getNumberOfStudents(List<Integer> headcounts) {
		int studentCount = 0;

		for (int headcount : headcounts) {
			studentCount += headcount;
		}

		return studentCount;
	}
}
