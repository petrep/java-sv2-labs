package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void testGetHighestIncome() {
        int[] incomes = new int[]{45732, 7726, 92689, 891655, 41, 42427, 6717};

        assertEquals(891655, new Income(incomes).getHighestIncome());
    }
}