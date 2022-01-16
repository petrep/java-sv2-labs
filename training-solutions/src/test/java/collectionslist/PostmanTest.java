package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman;

    @BeforeEach
    void init() {
        postman = new Postman();
        postman.addAddress("Arany János utca 4.");
        postman.addAddress("Virág utca 7.");
        postman.addAddress("Rákóczi utca 6.");
        postman.addAddress("Virág utca 7.");
        postman.addAddress("Virág utca 7.");
        postman.addAddress("Petőfi utca 37.");
    }

    @Test
    void testInit() {
        assertEquals(6, postman.getAddresses().size());
        assertEquals("Arany János utca 4.", postman.getAddresses().get(0));
        assertEquals("Virág utca 7.", postman.getAddresses().get(1));
        assertEquals("Rákóczi utca 6.", postman.getAddresses().get(2));
    }

    @Test
    void testRemoveAddress() {
        postman.removeAddress("Virág utca 7.");

        assertEquals(5, postman.getAddresses().size());
        assertEquals("Arany János utca 4.", postman.getAddresses().get(0));
        assertEquals("Rákóczi utca 6.", postman.getAddresses().get(1));
    }
}