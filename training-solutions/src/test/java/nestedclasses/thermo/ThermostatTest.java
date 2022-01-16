package nestedclasses.thermo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThermostatTest {

    @Test
    void testAddThermometer() {
        Thermostat thermostat = new Thermostat();
        thermostat.addThermometer(new Thermometer("room1", 30));
        thermostat.addThermometer(new Thermometer("room2", 9));
        thermostat.addThermometer(new Thermometer("room3", 13));

        assertEquals(Arrays.asList("room2", "room3"), thermostat.getRoomsToHeat());
    }

    @Test
    void testThermometerSetTemperatureShouldSetRoomsToHeat() {
        Thermostat thermostat = new Thermostat();
        Thermometer thermometer = new Thermometer("room1", 30);
        thermostat.addThermometer(thermometer);

        thermometer.setTemperature(9);
        assertEquals(Arrays.asList("room1"), thermostat.getRoomsToHeat());

        thermometer.setTemperature(14);
        assertEquals(new ArrayList<>(), thermostat.getRoomsToHeat());
    }
}