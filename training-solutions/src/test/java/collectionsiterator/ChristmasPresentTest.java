package collectionsiterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasPresentTest {

    @Test
    void testCreate() {
        ChristmasPresent christmasPresent = new ChristmasPresent("Starwars legó", "Ati", 8000);

        assertEquals("Starwars legó", christmasPresent.getDescription());
        assertEquals("Ati", christmasPresent.getNameOfPerson());
    }
}