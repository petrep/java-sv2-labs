package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

	private List<String> titles = new ArrayList<>();

	public List<String> getTitles() {
		return titles;
	}

	public void addBook(String title) {
		titles.add(title);
	}

	public void findBookAndSetAuthor(String title, String author) {
		boolean isBookAvailable = titles.contains(title);
		if (isBookAvailable) {
			int index = titles.indexOf(title);
			String bookWithAuthor = author + ": " + titles.get(index);
			titles.set(index, bookWithAuthor);
		}
	}

	public static void main(String[] args) {
		Books books = new Books();
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many titles would you like to store?");
		int numberOfBooks = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("Please type in the title of book " + (i + 1));
			String title = scanner.nextLine();
			books.addBook(title);
		}
		System.out.println(books.getTitles());
		System.out.println();

		System.out.println("Please type in the title of the book, for which you'd" +
		"like to store the author:");
		String titleWithAuthor = scanner.nextLine();
		System.out.println("Now please provide the author:");
		String author = scanner.nextLine();
		books.findBookAndSetAuthor(titleWithAuthor, author);
		System.out.println(books.getTitles());
	}
}
