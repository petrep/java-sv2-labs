package chars;

public class Whitespace {

	public String makeWhitespaceToStar(String text) {
		char[] textChars = text.toCharArray();
		for (int i = 0; i < textChars.length; i++) {
			if (Character.isWhitespace(textChars[i])) {
				textChars[i] = '*';
			}
		}
		String result = new String(textChars);
		return result;
	}

	public static void main(String[] args) {
		Whitespace whitespace = new Whitespace();
		System.out.println(whitespace.makeWhitespaceToStar("All spaces replaced with a star"));
	}
}
