package introjunit;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GentlemanTest {
	@Test
	public void testNames() {
		//Given
		Gentleman gentleman = new Gentleman();

		//When
		String greeting = gentleman.sayHello("John Doe");

		//Then
		assertThat(greeting, equalTo("Hello John Doe"));
	}

	@Test
	public void testNullNames() {
		//Given
		Gentleman gentleman = new Gentleman();

		//When
		String greetingNull = gentleman.sayHello(null);

		//Then
		assertThat(greetingNull, equalTo("Hello Anonymous"));
	}

}
