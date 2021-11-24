package algorithmsmax;

public class Plane {
	public int getLongestOcean(String map) {
		int largestOcean = 0;
		int sumOcean = 0;

		for (int i = 0; i < map.length(); i++) {
			char charAtI = map.charAt(i);
			int currentCharAsInt = Character.getNumericValue(charAtI);
			if (currentCharAsInt == 0) {
				sumOcean++;
			}
			if (currentCharAsInt == 1 && sumOcean > largestOcean) {
				largestOcean = sumOcean;
			}
			if (currentCharAsInt == 1) {
				sumOcean = 0;
			}

		}

		return largestOcean;
	}
}
