package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
	private List<String> authors = new ArrayList<>();
	private String title;
	private int numberOfPages;

	public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
		if (Validators.isBlank(title)) {
			throw new IllegalArgumentException("Empty title");
		}
		if (numberOfPages <= 0) {
			throw new IllegalArgumentException("invalid number of pages");
		}
		if (Validators.isEmpty(authors)) {
			throw new IllegalArgumentException("no author");
		}

		this.numberOfPages = numberOfPages;
		this.title = title;
		this.authors = authors;
	}

	public List<String> getContributors() {
		return new ArrayList<>(authors);
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public String getTitle() {
		return title;
	}
}
