package activity;

public final class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if ((latitude>90 || latitude < -90) ||
        (longitude > 180 || longitude < -180)) {
            throw new IllegalArgumentException("Coordinate data invalid");
        } else{
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
