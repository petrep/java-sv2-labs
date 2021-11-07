package controliteration.division;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		dividerApp();
	}

	public static void dividerApp() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("“Adjon meg egy pozitív egész számot!" +
		 " A program ennél kisebb számokat fog kiíírni.”");
		int dividend = scanner.nextInt();
		System.out.println("Hánnyal osztható számokat szeretne kapni?");
		int divider = scanner.nextInt();

		List<Integer> myResults1 = divisionUsingFor(dividend, divider);
		List<Integer> myResults2 = divisionUsingWhile(dividend, divider);
		System.out.println("" + Arrays.asList(myResults1) + ", ");
		System.out.println("" + Arrays.asList(myResults2) + ", ");
	}

	public static List<Integer> divisionUsingFor(int dividend, int divider) {
		List<Integer> results = new ArrayList<>();

		for (int i = 1; i < dividend; i++) {
			if (i % divider == 0) results.add(i);
		}

		return results;
	}

	public static List<Integer> divisionUsingWhile(int dividend, int divider) {
		List<Integer> results = new ArrayList<>();

		int i = 1;
		while (i < dividend) {
			if (i % divider == 0) results.add(i);
			i++;
		}

		return results;
	}
}
