package introexceptiontrace.aquarium;

public class AquariumMain {

	public static void main(String[] args) {
		Aquarium aquarium = new Aquarium();

		Fish firstFish = new Fish("ponty", "szürke");
		Fish secondFish = new Fish("aranyhal", "arany");
		Fish thirdFish = new Fish("neonhal", "neon");

		aquarium.addFish(firstFish);
		aquarium.addFish(secondFish);
		aquarium.addFish(thirdFish);

		System.out.println(aquarium.getNumberOfFish());
	}
}

// List was never instanciated therefore it is null