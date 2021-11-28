package algorithmsfilter.movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

	@Test
	void testCreate() {
		Movie movie = new Movie("It", Category.THRILLER, 7);

		assertEquals("It", movie.getTitle());
		assertEquals(Category.THRILLER, movie.getCategory());
		assertEquals(7, movie.getRating());
	}
}