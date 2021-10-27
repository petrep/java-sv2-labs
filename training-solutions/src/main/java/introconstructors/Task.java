package introconstructors;

import java.time.LocalDateTime;

public class Task {
	private String title;
	private String description;
	private LocalDateTime startDateTime;
	private int duration;

	// At this point, a default constructor is created in the
	// class file when building the source code.

	public Task(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void start() {
		startDateTime = LocalDateTime.now();
	}


	public static void main(String[] args) {
		Task task = new Task("UT homework", "Create the homework for the UT course");

		System.out.println("Title: " + task.getTitle());
		System.out.println("Description: " + task.getDescription());

		task.start();
		task.setDuration(1000);

		System.out.println("Started at: "
				  + task.getStartDateTime()
				  + " and took: "
				  + task.getDuration()
				  + " minutes to finish.");
	}
}
