package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
	private String name;
	private int age;

	public static void main(String[] args) {
		Person person = new Person(null, 32);
		System.out.println("name: " + person.getName());
		System.out.println(person.toString());
		System.out.println("name: " + person.name.toUpperCase());
		// Exception: null értékre nem hívhatunk metódust
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				  "name='" + name + '\'' +
				  ", age=" + age +
				  '}';
	}
}
