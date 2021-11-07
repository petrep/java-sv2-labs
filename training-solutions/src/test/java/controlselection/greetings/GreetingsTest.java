package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {

	@Test
	void testGreet() {

		Greetings greetings = new Greetings();

		assertEquals("jó éjt", greetings.greet(1, 0));
		assertEquals("jó éjt", greetings.greet(5, 0));
		assertEquals("jó reggelt", greetings.greet(6, 10));
		assertEquals("jó reggelt", greetings.greet(9, 0));
		assertEquals("jó napot", greetings.greet(9, 10));
		assertEquals("jó napot", greetings.greet(18, 30));
		assertEquals("jó estét", greetings.greet(18, 40));
		assertEquals("jó estét", greetings.greet(20, 0));
		assertEquals("jó éjt", greetings.greet(20, 10));
	}
}
