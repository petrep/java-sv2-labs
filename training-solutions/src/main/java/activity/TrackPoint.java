package activity;

public class TrackPoint {
    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    double getDistanceFrom(TrackPoint tp) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(tp.getCoordinate().getLatitude() - this.getCoordinate().getLatitude());
        double lonDistance = Math.toRadians(tp.getCoordinate().getLongitude() - this.getCoordinate().getLongitude());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.getCoordinate().getLatitude()))
                * Math.cos(Math.toRadians(tp.getCoordinate().getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        return distance;
    }

    public double getElevation() {
        return elevation;
    }
}
