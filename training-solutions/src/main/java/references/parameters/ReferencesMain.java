package references.parameters;

public class ReferencesMain {
	public static void main(String[] args) {
		Person firstPerson;
		Person secondPerson;

		firstPerson = new Person("Bloody Bill", 23);
		secondPerson = firstPerson;

		secondPerson.setName("Burr Bill");

		System.out.println(firstPerson.getName());
		System.out.println(secondPerson.getName());

		int first = 24;
		int second = first;

		second++;
		System.out.println(first);
		System.out.println(second);

		Person thirdPerson = new Person("Banana Bill", 24);
		firstPerson = thirdPerson;

		System.out.println(firstPerson.getName());
		System.out.println(thirdPerson.getName());
	}




}
