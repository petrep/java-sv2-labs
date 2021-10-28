package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();

		Dog firstDog = new Dog("Picur", 1, "white");
		dogs.add(firstDog);

		Dog secondDog = new Dog("Vaur", 2, "black");
		dogs.add(secondDog);

		Dog thirdDog = new Dog("Frakk", 3, "grey");
		dogs.add(thirdDog);

		System.out.println(dogs);

		Dog fourthDog = dogs.get(1);
		fourthDog.setColour("yellow");

		System.out.println(dogs);

		Dog fifthDog = new Dog("Clifford", 12, "red");
		System.out.println(fifthDog);

		fifthDog = dogs.get(1);
		System.out.println(fifthDog);

		dogs.add(fifthDog);
		System.out.println(dogs);

		Dog sixthDog = fourthDog;
		sixthDog.setColour("blue");

		System.out.println(dogs);

		List<Dog> otherDogs = dogs;

		Dog seventhDog = fourthDog;
		seventhDog.setColour("purple");

		System.out.println(otherDogs);

		secondDog.setColour("brown");
		System.out.println(otherDogs);

		secondDog = null;
		System.out.println(otherDogs);

		Dog eighthDog = dogs.get(1);
		eighthDog = null;
		System.out.println(otherDogs);

		Dog ninthDog = dogs.get(1);
		ninthDog.setColour("green");
		System.out.println(otherDogs);
	}
}
