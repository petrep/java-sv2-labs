package lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {
	private List<Sapling> saplings;

	public List<Sapling> getSaplings() {
		return saplings;
	}

	public TreeNursery(List<Sapling> saplings) {
		this.saplings = saplings;
	}

	public void prune(int maxHeight) {
		// a lista összes elemére meghívja a cut() metódust
		saplings.forEach(sapling -> sapling.cut(maxHeight));
	}

	public void sell(String species, int minHeight) {
		// ha az adott facsemete fajtája egyezik a megadott fajtával, illetve a magassága
		// nagyobb, mint a paraméterül kapott érték, akkor törli a listából.

		saplings.removeIf(sapling -> sapling.getSpecies().equals(species) &&
			sapling.getHeight()>minHeight);
	}
}
