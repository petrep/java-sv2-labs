package introinheritance.coffee;

public class CoffeeMain {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.setName("Tsibo");
		coffee.setPrice(150);
		System.out.println(coffee.getName() + " " + coffee.getPrice());

		Cappuccino cappuccino = new Cappuccino();
		cappuccino.setName("decaf");
		cappuccino.setPrice(250);
		System.out.println(cappuccino.getName() + " " + cappuccino.getPrice());

	}
}
