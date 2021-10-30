package chars;

public class LettersAndDigits {

	public void printLetterOrDigit(String text) {
		char[] myChars = text.toCharArray();
		for (char c : myChars) {
			if (Character.isAlphabetic(c)) {
				System.out.println(c + " : letter");
			} else if (Character.isDigit(c)) {
				System.out.println(c + " : digit");
			} else {
				System.out.println(c + " : other");
			}
		}
	}

	public static void main(String[] args) {
		LettersAndDigits lettersAndDigits = new LettersAndDigits();
		lettersAndDigits.printLetterOrDigit("bfa68fF;X eicpxy43é9");
	}
}
