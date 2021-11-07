package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Adja meg, hány elemet szeretne kiíratni a Fibonacci-sorozatból!");
		int number = scanner.nextInt();
		scanner.nextLine();

		int[] fibonacci1 = new int[number + 2];
		fibonacci1[1] = 1;
		for (int i = 0; i < number; i++) {
			int nextElement = fibonacci1[i] + fibonacci1[i + 1];
			fibonacci1[i + 2] = nextElement;
			System.out.print(fibonacci1[i] + ", ");
		}
		System.out.println();

		int[] fibonacci2 = new int[number + 2];
		fibonacci2[1] = 1;
		int i = 0;
		while (i < number) {
			int nextElement = fibonacci2[i] + fibonacci2[i + 1];
			fibonacci2[i + 2] = nextElement;
			System.out.print(fibonacci2[i] + ", ");
			i++;
		}
	}
}
