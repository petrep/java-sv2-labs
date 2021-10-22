package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1989, 06, 02);
		String artist = "Queen";
		LocalTime st = LocalTime.of(18, 00);;
		LocalTime et = LocalTime.of(20, 00);;

		Performance performance = new Performance(
		date, artist, st, et);
		System.out.println(performance.getInfo());

		System.out.println(performance.getDate());
		System.out.println(performance.getArtist());
		System.out.println(performance.getStartTime());
		System.out.println(performance.getEndTime());
	}
}
