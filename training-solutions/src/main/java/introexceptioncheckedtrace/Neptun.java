package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

	public static void main(String[] args) {
		Neptun neptun = new Neptun();
		List<String> namesAndCodes = new ArrayList<>();
		try {
			namesAndCodes = neptun.readNamesAndCodes();
		} catch (IOException ioe) {
			System.out.println("Error while reading file.");
		}

		List<String> codes = new ArrayList<>();
		for (String s : namesAndCodes) {
			String[] stringParts = s.split(",");
			codes.add(stringParts[1]);
		}

		System.out.println(codes);
	}

	private List<String> readNamesAndCodes() throws IOException {
		Path path = Paths.get("training-solutions/src/main/java/introexceptioncheckedtrace/neptun.csv");
		List<String> namesAndCodes = Files.readAllLines(path);
		return namesAndCodes;
	}
}
