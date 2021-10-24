package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class PiMain {

	public static void main(String[] args) {

		System.out.println(PI);

		CircleCalculator circleCalculator = new CircleCalculator();

		System.out.println(circleCalculator.calculateArea(100));
		System.out.println(circleCalculator.calculatePerimeter(100));

		CylinderCalculator cylinderCalculator = new CylinderCalculator();

		System.out.println(cylinderCalculator.calculateVolume(100, 200));
		System.out.println(cylinderCalculator.calculateSurfaceArea(100, 200));

		CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

		System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(100, 200));
		System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(100, 200));
	}
}
