package arrayofarrays;

public class DailyValues {
	public int[][] getValues() {
		int[][] valuesMatrix = new int[12][];
		int[] daysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < 12; i++) {
			valuesMatrix[i] = new int[daysCount[i]];
			for (int j=0; j<valuesMatrix[i].length; j++) {
			}
		}
		return valuesMatrix;
	}

	public static void main(String[] args) {
		DailyValues dailyValues = new DailyValues();
		int[][] myArray = dailyValues.getValues();

		for (int i[] : myArray) {
			for (int j : i) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
