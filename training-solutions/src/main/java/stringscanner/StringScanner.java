package stringscanner;

import java.util.Scanner;

public class StringScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in a compound sentence");
		System.out.println("Meaning a sentence of multiple parts, separated by comma:");

		String firstSentence = scanner.nextLine();

		Scanner scannerByWords = new Scanner(firstSentence);
		while (scannerByWords.hasNext()) {
			System.out.println(scannerByWords.next());
		}

		System.out.println("Please type in another compound sentence:");
		String sentenceByClause = scanner.nextLine();

		Scanner scannerByClause = new Scanner(sentenceByClause).useDelimiter(", ");

		while (scannerByClause.hasNext()) {
			System.out.println(scannerByClause.next());
		}
	}
}
