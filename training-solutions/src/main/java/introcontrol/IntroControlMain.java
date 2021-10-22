package introcontrol;

public class IntroControlMain {
	public static void main(String[] args) {
		IntroControl introControl = new IntroControl();

		System.out.println(introControl.subtractTenIfGreaterThanTen(8));
		System.out.println(introControl.subtractTenIfGreaterThanTen(10));
		System.out.println(introControl.subtractTenIfGreaterThanTen(81));

		System.out.println(introControl.describeNumber(0));
		System.out.println(introControl.describeNumber(1));

		System.out.println(introControl.greetingToJoe("Joe"));
		System.out.println(introControl.greetingToJoe("John"));

		System.out.println(introControl.calculateBonus(0));
		System.out.println(introControl.calculateBonus(1000));
		System.out.println(introControl.calculateBonus(1000000));
		System.out.println(introControl.calculateBonus(2000100));

		System.out.println(introControl.calculateConsumption(1000, 2000));
		System.out.println(introControl.calculateConsumption(9000, 1000));

		introControl.printNumbersBetween(5, 15);

		introControl.printNumbersBetweenAnyDirection(1, 10);
		introControl.printNumbersBetweenAnyDirection(10, 1);

		introControl.printOddNumbers(1);
		introControl.printOddNumbers(10);
		introControl.printOddNumbers(11);


	}
}
