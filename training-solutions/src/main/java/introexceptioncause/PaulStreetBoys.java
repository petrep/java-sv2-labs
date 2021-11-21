package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        new PaulStreetBoys().readAndWritePaulStreetBoysNames();
    }

    private void readAndWritePaulStreetBoysNames() {
        List<String> paulStreetBoys = new ArrayList<>();
        try {
            paulStreetBoys = Files.readAllLines(Paths.get("training-solutions/src/main/java/introexceptioncause/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file.", ioe);
        }
        writePaulStreetBoysNames(paulStreetBoys);
    }

    private void writePaulStreetBoysNames(List<String> paulStreetBoys) {
        for (String thisBoy : paulStreetBoys) {
            if (thisBoy.equals("Nemecsek Ernő")) {
                System.out.println(thisBoy.toLowerCase());
            } else {
                System.out.println(thisBoy);
            }
        }
    }
}
