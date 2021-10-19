package statements;

public class StatementMain {
	public static void main(String[] args) {
		int x = 5 + 6;
		int y = 11 - x;
		int z = 8;
		boolean b = (x > y) ? true : false;
		boolean c = (b || z > 5);

		System.out.println(
			"x: " + x + "\n" +
			"y: " + y + "\n" +
			"z: " + z + "\n" +
			"b: " + b + "\n" +
			"c: " + c
		);
	}
}
