package localvariables;

public class DistanceMain {
	public static void main(String[] args) {
		Distance myDistance = new Distance(2.2, true);

		System.out.println("Distance: " + myDistance.getDistanceInKm());
		System.out.println("Exactly? " + myDistance.isExact());

		int newDistance = (int) myDistance.getDistanceInKm();

		System.out.println("New distance: " + newDistance);
	}
}
