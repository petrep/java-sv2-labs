package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankAccountTest {

	BankAccount bankAccount = new BankAccount("John Doe", "11111-11111", 1000);

	@Test
	void testCreateBankAccount() {

		assertEquals("11111-11111", bankAccount.getAccountNumber());
		assertEquals(1000, bankAccount.getBalance());

	}

	@Test
	void testWithdraw() {
		bankAccount.withdraw(500);
		assertEquals(500, bankAccount.getBalance());
		assertFalse(bankAccount.withdraw(1100));
		assertTrue(bankAccount.withdraw(200));
	}

	@Test
	void testDeposit() {
		bankAccount.deposit(100);
		assertEquals(200, bankAccount.getBalance());
		assertTrue(bankAccount.deposit(20));

	}
}
