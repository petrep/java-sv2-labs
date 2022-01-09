package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

	private String title = "";
	private int length = 0;
	private List<String> composer = new ArrayList<>();
	private List<String> performers = new ArrayList<>();

	public AudioFeatures(String title, int length, List<String> composer) {
		this.title = title;
		this.length = length;
		this.composer = composer;
	}

	public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
		this.title = title;
		this.length = length;
		this.composer = composer;
		this.performers = performers;
	}

	@Override
	public List<String> getContributors() {
		return null;
	}

	public List<String> getComposer() {
		return composer;
	}

	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}
}
