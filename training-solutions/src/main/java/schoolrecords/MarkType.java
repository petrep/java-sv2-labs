package schoolrecords;

public enum MarkType {
	A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

	private String name;
	private int score;
	private String rating;

	MarkType(int score, String rating) {
		this.score = score;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getRating() {
		return rating;
	}
}
