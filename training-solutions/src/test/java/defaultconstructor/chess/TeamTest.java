package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void testCreate() {
        Team team = new Team();

        assertNull(team.getPlayerOne());
        assertNull(team.getPlayerTwo());
    }

    @Test
    void testSetPlayers() {
        Player firstPlayer = new Player();
        firstPlayer.setName("John Doe");
        firstPlayer.setEmail("doej@gmail.com");
        Player secondPlayer = new Player();
        secondPlayer.setName("Nagy Béla");
        secondPlayer.setEmail("nagyb@gmail.com");
        Team team = new Team();
        team.setPlayerOne(firstPlayer);
        team.setPlayerTwo(secondPlayer);

        assertEquals("John Doe", team.getPlayerOne().getName());
        assertEquals("nagyb@gmail.com", team.getPlayerTwo().getEmail());
    }
}