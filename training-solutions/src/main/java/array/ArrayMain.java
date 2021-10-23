package array;

public class ArrayMain {
	public static void main(String[] args) {
		String[] daysOfWeek = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
		System.out.println(daysOfWeek[1]);
		System.out.println(daysOfWeek.length);

		int[] twoSquared = new int[5];
		int base = 1;
		for (int i = 0; i <= 4; i++) {
//			System.out.print(base + " ");
			twoSquared[i] = base;
			base *= 2;
		}

		for (int myInt : twoSquared) {
			System.out.print(myInt + " ");
		}

		System.out.println("\n");
		System.out.println("Starting my boolean algorithm: ");
		boolean[] switchTrueFalse = new boolean[6];
		boolean myBoolean = false;
		for (int i = 0; i <= 5; i++) {
//			System.out.print(myBoolean + " ");
			switchTrueFalse[i] = myBoolean;
			myBoolean = myBoolean ? false : true;
		}

		for (boolean currentBoolean : switchTrueFalse) {
			System.out.print(currentBoolean + " ");
		}
	}
}
