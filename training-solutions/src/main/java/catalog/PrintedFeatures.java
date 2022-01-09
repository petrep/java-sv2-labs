package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
	private List<String> authors = new ArrayList<>();
	private String title;
	private int numberOfPages;

	public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
		this.numberOfPages = numberOfPages;
		this.title = title;
		this.authors = authors;
	}

	public List<String> getContributors() {
		List<String> contributors = new ArrayList<>();

		return contributors;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public String getTitle() {
		return title;
	}
}
