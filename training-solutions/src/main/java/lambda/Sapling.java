package lambda;

public class Sapling {
	private String species;
	private int height;

	public Sapling(String species, int height) {
		this.species = species;
		this.height = height;
	}

	void cut(int maxHeight) {
		// ha az adott facsemete a megadott magasságnál nagyobb, akkor “visszavágja”
		// a megadott magasságra (beállítja azt magassági értékként),
		// ha viszont annál kisebb, akkor békén hagyja.

		if (this.height > maxHeight) {
			this.setHeight(maxHeight);
		}
	}

	public String getSpecies() {
		return species;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
