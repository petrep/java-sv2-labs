package statements;

import java.util.Scanner;

public class InvestmentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kérlek add meg a befektetési összeget:");
		int fund = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Kérlek add meg a kamatlábat:");
		int interestRate = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Tőke: " + fund);

		Investment myInvestment = new Investment(fund, interestRate);
		System.out.println("Hozam 50 napra: " + myInvestment.getYield(50));

		System.out.println("Kivett összeg 80 nap után: " + myInvestment.close(80));
		System.out.println("Kivett összeg 90 nap után: " + myInvestment.close(90));
	}
}
