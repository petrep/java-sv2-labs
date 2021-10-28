package composition.person;

public class PersonMain {

	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();

		Person person = new Person("Tom Jerry", "1234");

		Address address = new Address("Magyarország", "Budapest", "Kis utca 3", "1111");
		person.moveTo(address);

		System.out.println(person.personToString());
		System.out.println(person.getAddress().addressToString());

		person.correctData("Ano Nimusz", "1235");
		System.out.println(person.personToString());

		person.getAddress().correctData("Magyarország", "Budapest", "Nagy utca 3", "1111");

		System.out.println(person.getAddress().addressToString());

		Address newAddress = new Address("Magyarország", "Budapest", "Közepes utca 3.",  "1111");

		person.moveTo(newAddress);

		System.out.println(person.getAddress().addressToString());
	}
}
