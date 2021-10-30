package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("I will give you a word.");
		System.out.println("Please try to spell it, letter by letter: ");
		System.out.println("Teacher, please type in the word: ");
		String word = scanner.nextLine();
		System.out.println("Student, please spell the word letter by letter:");

		char[] chars = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			String letter = scanner.nextLine();
			chars[i] = letter.toCharArray()[0];
		}

		System.out.println("You typed in these letters: " + Arrays.toString(chars));
		String result = new String(chars);
		System.out.println("The word was: " + result);

		if (result.equals(word)) {
			System.out.println("You solved the exercise correctly.");
		} else {
			System.out.println("Sorry, incorrect.");
		}
	}
}
