package catalog;

import java.util.List;

public class Validators {

	public static boolean isBlank(String text) {
		return (text == null || text.trim().length() < 1);
	}

	public static boolean isEmpty(List<String> list) {
		return (list == null || list.size() < 1);
	}
}
