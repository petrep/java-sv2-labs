package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void createTransaction() {
        Transaction transaction = new Transaction("123456", TransactionType.CREDIT, 1000);

        assertEquals("123456", transaction.getAccountNumber());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
        assertEquals(1000, transaction.getAmount());
    }
}
