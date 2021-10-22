package introcontrol;

public class IntroControl {
	public int subtractTenIfGreaterThanTen(int number) {
	int result = 0;
	if (number <= 10) {
		result = number;
	} else {
		result = number -10;
	}
	return result;
	}

	public String describeNumber(int number) {
		if (number == 0) {
			return "zero";
		} else {
			return "not zero";
		}
	}

	public String greetingToJoe(String name) {
		if (name.equals("Joe")) {
			return "Hello Joe";
		} else {
			return "";
		}
	}

	public int calculateBonus(int sale) {
		if (sale >= 1000000) {
			return (int) (sale * 0.1);
		} else {
			return 0;
		}
	}

	public int calculateConsumption(int prev, int next) {
		int result = 0;
		if (prev > next) {
			result = (10000 - prev) + next;
		} else {
			result = next - prev;
		}

		return result;
	}

	public void printNumbers(int max) {
		for (int i = 0; i <= max; i++) {
			System.out.println(i);
		}
	}

	public void printNumbersBetween(int min, int max) {
		for (int j = min; j <= max; j++) {
			System.out.println(j);
		}
	}

	public void printNumbersBetweenAnyDirection(int a, int b) {
		if (b > a) {
			for (int k = a; k <= b; k++) {
				System.out.println(k);
			}
		} else {
			for (int l = a; l >= b; l--) {
				System.out.println(l);
			}
		}
	}

	public void printOddNumbers(int max) {
		for (int m = 0; m <= max; m++) {
			if (m%2 != 0) {
				System.out.println(m);
			}
		}
	}
}
