package catalog;

public class SearchCriteria {
	private String contributor;
	private String title;

	public SearchCriteria(String contributor, String title) {
		this.contributor = contributor;
		this.title = title;
	}

	public static SearchCriteria createByBoth(String ride_the_lightning, String metallica) {
		SearchCriteria sc = null;
		return sc;
	}

	public static SearchCriteria createByContributor(String metallica) {
		SearchCriteria sc = null;
		return sc;
	}

	public static SearchCriteria createByTitle(String imagine_dragons) {
		SearchCriteria sc = null;
		return sc;
	}

	public boolean hasContributor() {
		boolean result = false;

		return result;
	}

	public boolean hasTitle() {
		boolean result = false;

		return result;
	}

	public String getContributor() {
		return contributor;
	}

	public String getTitle() {
		return title;
	}
}
