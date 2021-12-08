package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void testOfWithLowerClassChild() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(9);

        assertEquals(LowerClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void testOfWithUpperClassChild() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(11);

        assertEquals(UpperClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void testOfWithWrongAge() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(3));
        assertEquals("It's not a schoolchild with this age!", ex.getMessage());
    }
}