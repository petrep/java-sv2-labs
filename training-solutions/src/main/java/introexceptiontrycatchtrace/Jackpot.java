package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Jackpot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Winner winner = new Winner();

		try {
			System.out.println("The winner is: " + winner.getWinner());
		} catch (NullPointerException npe) {
			System.out.println("Unexpected error");
		}
	}
}
