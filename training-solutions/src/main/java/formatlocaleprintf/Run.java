package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
	private List<Double> distance = new ArrayList<>();
	private String name;
	private int days = 0;

	public Run(String name) {
		this.name = name;
	}

	public void addRun(double km) {
		distance.add(km);
	}

	public void printFormattedRunText() {
		String template = "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";
		String dateString = LocalDate.now().toString();
		days++;
		double km = distance.get(distance.size() - 1);
		String outputText = String.format(template, name, dateString, days, km);
		System.out.println(outputText);
	}

	public static void main(String[] args) {
		Run run = new Run("Teszt Ödön");
		run.addRun(13.40);
		run.printFormattedRunText();
		run.addRun(9.30);
		run.printFormattedRunText();
		run.addRun(10.60);
		run.printFormattedRunText();
		run.addRun(12.80);
		run.printFormattedRunText();
	}
}
