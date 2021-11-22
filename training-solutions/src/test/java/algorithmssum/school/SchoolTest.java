package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {

	@Test
	public void getNumberOfStudentsTest() {
		List<Integer> headcounts = Arrays.asList(16, 18, 15, 25, 28, 20);
		School school = new School();
		int expected = school.getNumberOfStudents(headcounts);

		assertEquals(122, expected);
	}
}
