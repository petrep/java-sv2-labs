package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NameServerTest {

    NameServer nameServer;

    @BeforeEach
    void init() {
        nameServer = new NameServer();
        nameServer.addEntry("aa.bb.com", "111.111.111.111");
        nameServer.addEntry("cc.dd.com", "111.111.111.112");
        nameServer.addEntry("ee.dd.com", "111.111.111.113");
    }

    @Test
    void testAddEntryNameAlreadyExists() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.addEntry("cc.dd.com", "1"));
        assertEquals("Already exists", ex.getMessage());
    }

    @Test
    void testAddEntryIpAlreadyExists() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.addEntry("c", "111.111.111.112"));
        assertEquals("Already exists", ex.getMessage());
    }

    @Test
    void testGetIpByNameNotFound() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.getIpByName("aa"));
        assertEquals("Element not found", ex.getMessage());
    }

    @Test
    void testGetIpByName() {
        assertEquals("111.111.111.112", nameServer.getIpByName("cc.dd.com"));
    }

    @Test
    void testGetNameByIpNotFound() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.getNameByIp("1"));
        assertEquals("Element not found", ex.getMessage());
    }

    @Test
    void testGetNameByIp() {
        assertEquals("ee.dd.com", nameServer.getNameByIp("111.111.111.113"));
    }

    @Test
    void testRemoveEntryByName() {
        nameServer.removeEntryByName("aa.bb.com");

        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.getIpByName("aa.bb.com"));
        assertEquals("Element not found", ex.getMessage());
    }

    @Test
    void testRemoveEntryByIp() {
        nameServer.removeEntryByIp("111.111.111.113");

        Exception ex = assertThrows(IllegalArgumentException.class, () -> nameServer.getNameByIp("111.111.111.113"));
        assertEquals("Element not found", ex.getMessage());
    }
}