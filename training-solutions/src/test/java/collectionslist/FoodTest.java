package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {

    @Test
    void testCreate() {
        Food food1 = new Food("vaj", LocalDate.of(2022, 01, 19));

        assertEquals("vaj", food1.getName());
        assertEquals(LocalDate.of(2022, 01, 19), food1.getExpirationDate());
    }
}
