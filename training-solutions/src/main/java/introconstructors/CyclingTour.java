package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
	private String description;
	private LocalDate startTime;
	private int numberOfPeople;
	private double kms;

	public void registerPerson(int person) {
		numberOfPeople += person;
	}

	public void ride (double km) {
		kms += km;
	}

	public CyclingTour(String description, LocalDate startTime) {
		this.description = description;
		this.startTime = startTime;
	}

	public static void main(String[] args) {
		LocalDate turaTime = LocalDate.of(2021, 10, 27);
		CyclingTour cyclingTour = new CyclingTour("Erdei Túra 1", turaTime);
		System.out.println(cyclingTour.getDescription());
		System.out.println(cyclingTour.getStartTime());
		System.out.println(cyclingTour.getNumberOfPeople());
		System.out.println(cyclingTour.getKms());

		cyclingTour.registerPerson(5);
		cyclingTour.ride(40);

		System.out.println(cyclingTour.getNumberOfPeople());
		System.out.println(cyclingTour.getKms());
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public double getKms() {
		return kms;
	}
}
