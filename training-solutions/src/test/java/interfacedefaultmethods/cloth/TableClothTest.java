package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testSquare() {
        TableCloth tableCloth = new TableCloth(4.8);

        assertEquals(4, tableCloth.getNumberOfSides());
        assertEquals(6.79, tableCloth.getLengthOfDiagonal(), 0.005);
        assertEquals(19.2, tableCloth.getPerimeter(), 0.001);
        assertEquals(23.04, tableCloth.getArea(), 0.001);
    }
}