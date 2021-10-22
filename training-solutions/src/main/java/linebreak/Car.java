package linebreak;

public class Car {
	public String getBrandAndTypeInSeparateLines(String brand, String type) {
		return brand + System.lineSeparator() + type;
		//return brand + type; // -> use this for printing in 1 line
	}

	public static void main(String[] args) {
		Car car = new Car();
		String brandAndType =
			car.getBrandAndTypeInSeparateLines("Hyundai", "i10");
		System.out.println(brandAndType);
		int lineBreak = brandAndType.indexOf("\n");
		System.out.println(lineBreak >= 0 ? "Text printed in 2 lines" :
		"Text printed in 1 line");
	}
}
