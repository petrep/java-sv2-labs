package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

	private Words words = new Words();

	@Test
	public void testGetFirstWordWithA() {

		Path path = Paths.get("words.txt");
		String firstWordWithA = words.getFirstWordWithA(path);

		assertEquals("Anna", firstWordWithA);
	}

	@Test
	public void testGetFirstWordWithANoSuchWord() {
		Path path = Paths.get("anotherwords.txt");
		String firstWordWithA = words.getFirstWordWithA(path);

		assertEquals("A", firstWordWithA);
	}

	@Test
	public void testGetFirstWordWithANotExistingFile() {
		Path path = Paths.get("xyzs.txt");

		IllegalStateException exception = assertThrows(IllegalStateException.class,
				  () -> words.getFirstWordWithA(path));
		assertEquals("Can not read file.", exception.getMessage());
	}
}