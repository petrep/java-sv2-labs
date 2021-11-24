package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankAccountDecisionMakerTest {

	List<BankAccount> accounts = Arrays.asList(
			  new BankAccount("John Doe", "11111-11111", 1400),
			  new BankAccount("Jack Doe", "22222-22222", 2500),
			  new BankAccount("Jill Doe", "33333-33333", 95)
	);

	@Test
	void testContainsBalanceGreaterThan() {

		BankAccountDecisionMaker test = new BankAccountDecisionMaker();

		assertTrue(test.containsBalanceGreaterThan(accounts, 1600));
		assertFalse(test.containsBalanceGreaterThan(accounts, 2800));

	}
}
