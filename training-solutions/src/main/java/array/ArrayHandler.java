package array;

public class ArrayHandler {
	public static void main(String[] args) {
		ArrayHandler ah = new ArrayHandler();
		int[] source = {2, 9, 14};
		ah.addIndexToNumber(source);

		for (int currentNumber : source) {
			System.out.println(currentNumber);
		}

		for (int currentNumber : source) {
			System.out.print(currentNumber + ", ");
		}

		System.out.println("\n");

		String[] words = new String[]{"first", "second", "third"};
		ah.concatenateIndexToWord(words);

		for (String currentString : words) {
			System.out.println(currentString);
		}

		for (String currentString : words) {
			System.out.print(currentString + ", ");
		}
	}

	public void addIndexToNumber(int[] source) {
		int index = 0;
		for (int currentNumber : source) {
			currentNumber += index;
			source[index] = currentNumber;
			index++;
//			System.out.println(currentNumber);
		}
	}

	public void concatenateIndexToWord(String[] source) {
		int index = 0;
		for (String currentString : source) {
			currentString = index + currentString;
			source[index] = currentString;
//			System.out.println(currentString);
			index++;
		}
	}
}
