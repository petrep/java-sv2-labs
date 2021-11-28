package algorithmsfilter.movies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

	VideoTheque videoTheque;

	@BeforeEach
	void setUp() {
		videoTheque = new VideoTheque();
		videoTheque.addMovie(new Movie("It", Category.THRILLER, 7));
		videoTheque.addMovie(new Movie("The Godfather", Category.THRILLER, 9));
		videoTheque.addMovie(new Movie("The Dark Knight", Category.THRILLER, 5));
		videoTheque.addMovie(new Movie("Madagascar", Category.ANIMATION, 8));
		videoTheque.addMovie(new Movie("Garfield", Category.ANIMATION, 2));
		videoTheque.addMovie(new Movie("Shrek", Category.ANIMATION, 5));
		videoTheque.addMovie(new Movie("Mission: Impossible", Category.ACTION, 5));
	}

	@Test
	void testGetGoodMoviesWithCategoryGiven() {
		List<Movie> expected = videoTheque.getGoodMoviesWithCategoryGiven(Category.ANIMATION);

		assertEquals(2, expected.size());
	}
}