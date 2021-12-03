package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

	@Test
	void testPublicVehicles() {
		PublicVehicle bus = new Bus(5, 11.5, "Ikarus");
		PublicVehicle tram = new Tram(9, 21.2, 5);
		PublicVehicle metro = new Metro(2, 49.4, 6);

		PublicTransport publicTransport = new PublicTransport();
		publicTransport.addVehicle(bus);
		publicTransport.addVehicle(tram);
		publicTransport.addVehicle(metro);

		assertEquals(3, publicTransport.getPublicVehicles().size());
	}
}