package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

	private List<Flight> flights = new ArrayList<>();

	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public String getDeletedFlights() {
		StringBuilder sb = new StringBuilder("Deleted flights: ");
		for (Flight f : flights) {
			if (f.getStatus() == Status.DELETED) {
				sb.append("\n");
				sb.append(f.getFlightNumber());
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Flight flightToBombay = new Flight("A-1234", Status.DELETED);
		Flight flightToParis = new Flight("B-1234", Status.ACTIVE);
		Flight flightToFrankfurt = new Flight("C-1234", Status.ACTIVE);
		Flight flightToNewYork = new Flight("D-1234", Status.DELETED);
		Flight flightToSydney = new Flight("E-1234", Status.DELETED);

		Airport airport = new Airport();
		airport.addFlight(flightToBombay);
		airport.addFlight(flightToParis);
		airport.addFlight(flightToFrankfurt);
		airport.addFlight(flightToNewYork);
		airport.addFlight(flightToSydney);

		String deletedFlights = airport.getDeletedFlights();

		System.out.println(deletedFlights);
	}
}
