package chars;

import java.util.Scanner;

public class Words {

	public String pushWord(String word) {
		char[] wordChars = word.toCharArray();
		for (int i = 0; i < wordChars.length; i++) {
			wordChars[i] += 1;
		}
		String result = new String(wordChars);
		return result;
	}

	public static void main(String[] args) {
		Words words = new Words();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type in a word:");
		String word = scanner.nextLine();

		String result = words.pushWord(word);
		System.out.println("Each letters in the word is now replaced with the next letter : " + result);
	}
}
