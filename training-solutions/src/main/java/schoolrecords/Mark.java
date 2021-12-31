package schoolrecords;

public class Mark {
	private MarkType markType;
	private Subject subject;
	private Tutor tutor;
	private String markTypeString;

	public Mark(MarkType markType, Subject subject, Tutor tutor) {
		if ((subject == null) || (tutor == null))
			throw new NullPointerException("Both subject and tutor must be provided!");
		this.markType = markType;
		this.subject = subject;
		this.tutor = tutor;
	}

	public Mark(String markType, Subject subject, Tutor tutor) {
		if ((subject == null) || (tutor == null))
			throw new NullPointerException("Both subject and tutor must be provided!");
		this.markTypeString = markType;
		this.subject = subject;
		this.tutor = tutor;
	}

	public MarkType getMarkType() {
		return markType;
	}

	public Subject getSubject() {
		return subject;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public String getMarkTypeString() {
		return markTypeString;
	}

	public String toString() {
		return markType.getRating() + "(" + markType.getScore() + ")";
	}
}

