package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	public List<CatalogItem> catalogItems = new ArrayList<>();

	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	public void addItem(CatalogItem catalogItem) {
		catalogItems.add(catalogItem);
	}

	public Double averagePageNumberOver(int pageLimit) {
		if (pageLimit < 1) {
			throw new IllegalArgumentException("Page number must be positive");
		}
		int sum = 0;
		int counter = 0;

		for (CatalogItem catalogItem : catalogItems) {
			int pageCount = catalogItem.numberOfPagesAtOneItem();
			if (pageCount >= pageLimit) {
				sum += pageCount;
				counter++;
			}
		}
		if (counter == 0) {
			throw new IllegalArgumentException("No page");
		}
		return ((double) sum) / counter;
	}

	public void deleteItemByRegistrationNumber(String registrationNumber) {
		List<CatalogItem> itemsToBeRemoved = new ArrayList<>();
		for (CatalogItem catalogItem : catalogItems) {
			if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
				itemsToBeRemoved.add(catalogItem);
			}
		}
		catalogItems.removeAll(itemsToBeRemoved);
	}

	public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
		List<CatalogItem> itemsFound = new ArrayList<>();
		if (searchCriteria.hasContributor()) {
			addCatalogItemByContributor(searchCriteria, itemsFound);
		}
		if (searchCriteria.hasTitle()) {
			addCatalogItemByTitle(searchCriteria, itemsFound);
		}
		return itemsFound;
	}

	private void addCatalogItemByTitle(SearchCriteria criteria, List<CatalogItem> itemsFound) {
		for (CatalogItem catalogItem : catalogItems) {
			if (catalogItem.getTitles().contains(criteria.getTitle()) && !(itemsFound.contains(catalogItem))) {
				itemsFound.add(catalogItem);
			}
		}
	}

	private void addCatalogItemByContributor(SearchCriteria criteria, List<CatalogItem> itemsFound) {
		for (CatalogItem catalogItem : catalogItems) {
			if (catalogItem.getContributors().contains(criteria.getContributor()) && !(itemsFound.contains(catalogItem))) {
				itemsFound.add(catalogItem);
			}
		}
	}

	public int getAllPageNumber() {
		int pageNumberSum = 0;
		for (CatalogItem catalogItem : catalogItems) {
			pageNumberSum += catalogItem.numberOfPagesAtOneItem();
		}
		return pageNumberSum;
	}

	public List<CatalogItem> getAudioLibraryItems() {
		List<CatalogItem> audioLibraryItems = new ArrayList<>();
		for (CatalogItem actual : catalogItems) {
			if (actual.hasAudioFeature()) {
				audioLibraryItems.add(actual);
			}
		}
		return audioLibraryItems;
	}

	public int getFullLength() {
		int length = 0;
		for (CatalogItem catalogItem : catalogItems) {
			length += catalogItem.fullLengthAtOneItem();
		}
		return length;
	}

	public List<CatalogItem> getPrintedLibraryItems() {
		List<CatalogItem> printedLibraryItems = new ArrayList<>();
		for (CatalogItem actual : catalogItems) {
			if (actual.hasPrintedFeature()) {
				printedLibraryItems.add(actual);
			}
		}
		return printedLibraryItems;
	}
}
