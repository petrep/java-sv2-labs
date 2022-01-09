package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
	private String registrationNumber;
	private int price;
	private List<Feature> features = new ArrayList<>();

	public CatalogItem(String registrationNumber, int price, Feature... features) {
		this.registrationNumber = registrationNumber;
		this.price = price;
	}

	public int fullLengthAtOneItem() {
		int result = 0;

		return result;
	}

	public List<String> getContributors() {
		List<String> result = new ArrayList<>();
		return result;
	}

	public List<String> getTitles() {
		List<String> result = new ArrayList<>();
		return result;
	}

	public boolean hasAudioFeature() {
		boolean result = false;

		return result;
	}

	public boolean hasPrintedFeature() {
		boolean result = false;

		return result;
	}

	public int numberOfPagesAtOneItem() {
		int result = 0;

		return result;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public int getPrice() {
		return price;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
}
