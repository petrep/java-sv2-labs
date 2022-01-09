package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
	private String registrationNumber;
	private int price;
	private List<Feature> features = new ArrayList<>();

	public CatalogItem(String registrationNumber, int price, Feature... features) {
		this.registrationNumber = registrationNumber;
		this.price = price;
		this.features.addAll(Arrays.asList(features));
	}

	public int fullLengthAtOneItem() {
		int sumOfLength = 0;
		for (Feature feature : features) {
			if (isAudioFeature(feature)) {
				sumOfLength += ((AudioFeatures) feature).getLength();
			}
		}
		return sumOfLength;
	}

	public List<String> getContributors() {
		List<String> contributors = new ArrayList<>();
		for (Feature feature : features) {
			contributors.addAll(feature.getContributors());
		}
		return contributors;
	}

	public List<String> getTitles() {
		List<String> titles = new ArrayList<>();
		for (Feature feature : features) {
			titles.add(feature.getTitle());
		}
		return titles;
	}

	public boolean hasAudioFeature() {
		for (Feature feature : features) {
			if (isAudioFeature(feature)) {
				return true;
			}
		}
		return false;
	}

	private boolean isAudioFeature(Feature feature) {
		return feature instanceof AudioFeatures;
	}

	public boolean hasPrintedFeature() {
		for (Feature feature : features) {
			if (isPrintedFeature(feature)) {
				return true;
			}
		}
		return false;
	}

	private boolean isPrintedFeature(Feature feature) {
		return feature instanceof PrintedFeatures;
	}

	public int numberOfPagesAtOneItem() {
		int sumOfPages = 0;
		for (Feature feature : features) {
			if (isPrintedFeature(feature)) {
				sumOfPages += ((PrintedFeatures) feature).getNumberOfPages();
			}
		}
		return sumOfPages;
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
