package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
	public int getMin(List<Integer> temperatures) {
		int minimumTemperature = temperatures.get(0);
		for (int i : temperatures) {
			if (i < minimumTemperature) {
				minimumTemperature = i;
			}
		}
		return minimumTemperature;
	}
}
