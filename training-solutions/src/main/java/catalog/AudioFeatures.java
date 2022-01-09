package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

	private final String title;
	private final int length;
	private final List<String> composer;
	private final List<String> performers;

	public AudioFeatures(String title, int length, List<String> performers) {
		this(title, length, performers, new ArrayList<>());
		performers = new ArrayList<>();
	}

	public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {

		if (Validators.isBlank(title)) {
			throw new IllegalArgumentException("missing title");
		}
		if (length <= 0) {
			throw new IllegalArgumentException("invalid length");
		}
		if (Validators.isEmpty(performers)) {
			throw new IllegalArgumentException("no performer");
		}

		this.title = title;
		this.length = length;
		this.composer = composer;
		this.performers = performers;
	}

	@Override
	public List<String> getContributors() {
		List<String> contributors = new ArrayList<>(composer);
		contributors.addAll(performers);
		return contributors;
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
