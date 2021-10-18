package conventions;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car("Hyundai", "1.0", 4,5);
		myCar.setDoors(5);
		System.out.println("doors:" + myCar.getdoors());
		myCar.setPersons(4);
		System.out.println("max ppl: " + myCar.getPersons());
		myCar.setCarType("Lamborghini");
		System.out.println("Car type: " + myCar.getCarType());
		myCar.setEngineType("Diesel");
		System.out.println("Engine type: " + myCar.getEngineType());
		myCar.addModelName("MegaStar");
	}
}
