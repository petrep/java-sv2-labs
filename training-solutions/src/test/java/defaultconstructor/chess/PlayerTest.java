package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testCreate() {
        Player player = new Player();

        assertNull(player.getName());
        assertNull(player.getEmail());
    }

    @Test
    void testSetNameAndEmail() {
        Player player = new Player();
        player.setName("John Doe");
        player.setEmail("doej@gmail.com");

        assertEquals("John Doe", player.getName());
        assertEquals("doej@gmail.com", player.getEmail());
    }
}