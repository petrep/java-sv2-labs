package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

	private List<Person> registeredPeople = new ArrayList<>();

	public List<Person> getRegisteredPeople() {
		return registeredPeople;
	}

	public void addPerson(Person person) {
		registeredPeople.add(person);
	}
}
