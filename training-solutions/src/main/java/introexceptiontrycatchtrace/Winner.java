package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

	private List<String> players = new ArrayList<>(Arrays.asList("Jack Doe", "John Doe", null, "Jerry Doe"));

	public List<String> getPlayers() {
		return players;
	}

	public void addPerson(String name) {
		players.add(name);
	}

	public String getWinner() {
		Random random = new Random();
		int index = random.nextInt(players.size());
		String winner = players.get(index);
		return winner.toUpperCase();
	}
}
