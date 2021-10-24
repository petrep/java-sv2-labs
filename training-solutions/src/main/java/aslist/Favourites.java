package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

	public static void main(String[] args) {
		Favourites favourites = new Favourites();
		Scanner scanner = new Scanner(System.in);
		List<String> favouriteThings = new ArrayList<>();

		System.out.println("Mi a kedvenc filmed?");
		String movie = scanner.nextLine();
		favouriteThings.add(movie);

		System.out.println("Ki a kedvenc színészed?");
		String actor = scanner.nextLine();
		favouriteThings.add(actor);

		System.out.println("Mi a kedvenc állatod?");
		String animal = scanner.nextLine();
		favouriteThings.add(animal);

		System.out.println("Melyik a kedvenc sportod?");
		String sport = scanner.nextLine();
		favouriteThings.add(sport);

		System.out.println("Kedvencek lista mérete: " + favouriteThings.size());
		System.out.println("Kedvencek lista tartalma: " + favouriteThings);
	}
}
