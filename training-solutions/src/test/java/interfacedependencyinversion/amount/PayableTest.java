package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount() {
        Payable payable = new Amount();

        assertEquals(155, payable.getPayableAmount(155));
    }

    @Test
    void testCash() {
        Payable payable = new Cash();

        assertEquals(165, payable.getPayableAmount(166));
        assertEquals(175, payable.getPayableAmount(173));
        assertEquals(170, payable.getPayableAmount(171));
        assertEquals(170, payable.getPayableAmount(170));
        assertEquals(170, payable.getPayableAmount(168));
    }

    @Test
    void testBankAtm() {
        Payable payable = new BankAtm();

        assertEquals(1000, payable.getPayableAmount(177));
    }
}