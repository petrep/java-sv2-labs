package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word with max 5 letters:");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("Word is too long!");
        }

        char[] wordChars = word.toCharArray();
        for (char c : wordChars) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Not a word: " + word);
            }
        }
        System.out.println("Your word was: " + word);
    }
}
