package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

	public void writeStreets(Path path) {
		List<String> streets = getListOfStreets();
		try {
			Files.write(path, streets);
		} catch (IOException ioe) {
			throw new IllegalStateException("Can not write file.", ioe);
		}
	}

	private List<String> getListOfStreets() {
		List<String> streets = new ArrayList<>();
		streets.add(LocalDate.now().toString());
		streets.add("Orsó utca");
		streets.add("Anna utca");
		streets.add("Tündér utca");
		streets.add("Virág utca");
		streets.add("Kóczos utca");
		return streets;
	}
}
