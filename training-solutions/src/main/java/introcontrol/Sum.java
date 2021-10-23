package introcontrol;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kérlek adj meg öt számot, össze fogom őket adni: ");
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ":");
			sum += scanner.nextInt();
		}
		System.out.println("Az eredmény: " + sum);
	}
}
