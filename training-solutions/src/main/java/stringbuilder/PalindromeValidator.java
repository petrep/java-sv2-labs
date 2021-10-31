package stringbuilder;

public class PalindromeValidator {

	public boolean isPalindrome(String word) {
		word = word.trim();
		StringBuilder sb = new StringBuilder(word);

		return word.equalsIgnoreCase(sb.reverse().toString());
	}

	public static void main(String[] args) {
		PalindromeValidator palindromeValidator = new PalindromeValidator();

		System.out.println(palindromeValidator.isPalindrome("madam"));
		System.out.println(palindromeValidator.isPalindrome("rotator"));
		System.out.println(palindromeValidator.isPalindrome(""));
		System.out.println(palindromeValidator.isPalindrome("expression"));
	}
}
