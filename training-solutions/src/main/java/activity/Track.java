package activity;

import methodvarargs.gps.FieldPoint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Track {
    List<TrackPoint> trackPoints = new ArrayList<>();


    public void addTrackPoint(TrackPoint trackPoint) {

    }

    public void loadFromGpx(){
        Path path = Paths.get("src/test/resources/track.gpx");

        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }

        for (String line : lines) {
            String[] parts = line.split(",");
            String note = parts[0];
            String minFrequencyString = parts[1];
            Float minFrequencyFloat = Float.parseFloat(minFrequencyString);
            String maxFrequencyString = parts[2];
            Float maxFrequencyFloat = Float.parseFloat(maxFrequencyString);
            //notes.add(new Note(note, minFrequencyFloat, maxFrequencyFloat));
        }
    }

    public Coordinate findMaximumCoordinate() {
        return null;
    }

    public Coordinate findMinimumCoordinate() {
        return null;
    }

    public double getDistance() {
        return 0;
    }

    public double getFullDecrease() {
        return 0;
    }

    public double getFullElevation() {
        return 0;
    }

    public double getRectangleArea() {
        return 0;
    }

    public List<TrackPoint> getTrackPoints() {
        return null;
    }

}
