package statements;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getInMinutes() {
		return hours * 60 + minutes;
	}

	public int getInSeconds() {
		return hours * 60 * 60 + minutes * 60 + seconds;
	}

	public boolean earlierThan(Time timeObject) {
		return timeObject.getInSeconds() > this.getInSeconds();
	}

	public String toString() {
		String formattedTime;
		formattedTime = hours + ":" + minutes + ":" + seconds;
		return formattedTime;
	}
}
