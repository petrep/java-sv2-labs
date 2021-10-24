package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {

	public void printStudyGroups(List<String> students) {
		for (String student : students) {
			if (student.length() <= 10) {
				System.out.println(student + ": 1-es csoport");
			} else {
				System.out.println(student + ": 2-es csoport");
			}
		}
	}

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Pete Russ", "Justin Mitchell", "Joe Dowd", "Kevin Piper", "Lauren Peters");
		StudyGroup studyGroup = new StudyGroup();
		studyGroup.printStudyGroups(students);
	}
}
