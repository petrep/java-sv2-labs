package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1981, 11, 22));
        Man man = new Man("John Doe", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("John Doe", man.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals(LocalDate.of(1981, 11, 22), man.getRegisterDates().get(0).getDate());
    }
}
