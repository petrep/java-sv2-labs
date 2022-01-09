package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	public List<CatalogItem> catalogItems = new ArrayList<>();

	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	public void addItem(CatalogItem catalogItem) {
	
	}

	public Double averagePageNumberOver(int i) {
		double result = 0;

		return result;
	}

	public void deleteItemByRegistrationNumber(String s) {
	}

	public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
		List<CatalogItem> ci = null;

		return ci;
	}

	public int getAllPageNumber() {
		int result = 0;

		return result;
	}

	public List<CatalogItem> getAudioLibraryItems() {
		List<CatalogItem> ci = null;
		
		return ci;
	}

	public int getFullLength() {
		int result = 0;

		return result;
	}

	public List<CatalogItem> getPrintedLibraryItems() {
		List<CatalogItem> ci = null;

		return ci;
	}
}
