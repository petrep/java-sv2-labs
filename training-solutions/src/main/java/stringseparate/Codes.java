package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Codes {
	public static void main(String[] args) {
		List<String> codesString = new ArrayList<>();
		codesString.add("T57fbj");
		codesString.add("4T57fbj");
		codesString.add("xtcu45");
		codesString.add("5xtcu45");
		codesString.add("f578GVHd");
		Codes codes = new Codes();
		System.out.println(codes.getCodesStartWithLetter(codesString));
	}

	public String getCodesStartWithLetter(List<String> codes) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < codes.size(); i++) {
			String currentCode = codes.get(i);
			if (Character.isLetter(currentCode.charAt(0))) {
				sb.append(codes.get(i));
				if (i != (codes.size() - 1)) {
					sb.append(", ");
				}
			}
		}

		return sb.toString();
	}
}
