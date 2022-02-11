package activity;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Track {
    List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public void loadFromGpx(InputStream is) {
        loadFromGpx();
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
        System.out.println("lines:" + lines.size());

        Coordinate coordinate = null;
        for (String line : lines) {
            if (line.startsWith("<trkpt")) {
                double la = Double.parseDouble(line.substring(12, 22));
                double lo = Double.parseDouble(line.substring(29, 39));
                coordinate = new Coordinate(la, lo);
            }
            if (line.startsWith("<ele")) {
                double elevation = Double.parseDouble(line.substring(5, 10));
                trackPoints.add(new TrackPoint(coordinate, elevation));
            }
        }
    }

    public Coordinate findMaximumCoordinate() {

        if(this.trackPoints.size() == 0) return null;
        if(this.trackPoints.size() == 1) return new Coordinate(trackPoints.get(0).getCoordinate().getLongitude(), trackPoints.get(0).getCoordinate().getLatitude());

        double maxLatitude = this.trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .max().getAsDouble();

        double maxLongitude = this.trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .max().getAsDouble();

        return new Coordinate(maxLatitude, maxLongitude);

    }

    public Coordinate findMinimumCoordinate() {
        if(this.trackPoints.size() == 0) return null;
        if(this.trackPoints.size() == 1) return new Coordinate(trackPoints.get(0).getCoordinate().getLongitude(), trackPoints.get(0).getCoordinate().getLatitude());

        double minLatitude = this.trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .min().getAsDouble();

        double minLongitude = this.trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .min().getAsDouble();

        return new Coordinate(minLatitude, minLongitude);
    }

    public double getDistance() {
        if(this.trackPoints.size() < 2) return 0.0;

        double result = 0.0;
        for(int i = 1; i < this.trackPoints.size(); i++) {
            result += trackPoints.get(i-1).getDistanceFrom(trackPoints.get(i));

        }

        return result;

    }

    public double getFullDecrease(){

        if(this.trackPoints.size() < 2) return 0.0;

        double result = 0.0;
        for(int i = 1; i < this.trackPoints.size(); i++) {
            if(trackPoints.get(i).getElevation() < trackPoints.get(i-1).getElevation()){
                result += trackPoints.get(i-1).getElevation() - trackPoints.get(i).getElevation();
            }
        }

        return result;
    }

    public double getFullElevation(){

        if(this.trackPoints.size() < 2) return 0.0;

        double result = 0.0;
        for(int i = 1; i < this.trackPoints.size(); i++) {
            if(trackPoints.get(i).getElevation() > trackPoints.get(i-1).getElevation()){
                result += trackPoints.get(i).getElevation() - trackPoints.get(i-1).getElevation();
            }
        }

        return result;
    }

public double getRectangleArea() {
    Coordinate min = findMinimumCoordinate();
    Coordinate max = findMaximumCoordinate();
    return (max.getLatitude() - min.getLatitude()) * (max.getLongitude() - min.getLongitude());
}
//
//    public List<TrackPoint> getTrackPoints() {
//        return null;
//    }

}
