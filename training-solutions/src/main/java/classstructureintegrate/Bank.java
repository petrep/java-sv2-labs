package classstructureintegrate;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kérlek add meg a számlaszámod:");
		String accountNumber = scanner.nextLine();
		System.out.println("Kérlek add meg a neved:");
		String owner = scanner.nextLine();
		System.out.println("Most pedig kérlek add meg a számlaegyenleged:");
		int balance = scanner.nextInt();
		scanner.nextLine();
		BankAccount myBankAccount = new BankAccount(accountNumber, owner,
			balance);

		System.out.println(myBankAccount.getInfo());

		myBankAccount.deposit(300);
		System.out.println(myBankAccount.getInfo());

		myBankAccount.withdraw(100);
		System.out.println(myBankAccount.getInfo());
	}
}
