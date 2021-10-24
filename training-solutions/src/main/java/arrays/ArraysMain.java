package arrays;

import java.util.Arrays;

public class ArraysMain {
	public String numberOfDaysAsString() {
		int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return Arrays.toString(numberOfDays);
	}

	public String multiplicationTableAsString(int size) {
		String result = "";
		int[][] table = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		result = Arrays.deepToString(table);
		return result;
	}

	public boolean sameTempValues(double[] day, double[] anotherDay) {
		return Arrays.equals(day, anotherDay);
	}

	public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
		int min = min(day.length, anotherDay.length);
		double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);
		double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
		return Arrays.equals(rangeOfDay, rangeOfAnotherDay);
	}

	private int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public boolean wonLottery(int[] myNumbers, int[] lotteryNumbers) {
		int[] copyOfMyNumbers = Arrays.copyOf(myNumbers, myNumbers.length);
		int[] copyOfLotteryNumbers = Arrays.copyOf(lotteryNumbers, lotteryNumbers.length);
		Arrays.sort(copyOfMyNumbers);
		Arrays.sort(copyOfLotteryNumbers);
		return Arrays.equals(copyOfMyNumbers, copyOfLotteryNumbers);
	}

	public static void main(String[] args) {
		ArraysMain arraysMain = new ArraysMain();
		System.out.println(arraysMain.numberOfDaysAsString());

		System.out.println(arraysMain.multiplicationTableAsString(10));

		System.out.println("same?: " + arraysMain.sameTempValues(new double[]{1, 2, 3, 4}, new double[]{1, 2, 3, 4}));
		System.out.println("same?: " + arraysMain.sameTempValues(new double[]{1, 2, 3, 4}, new double[]{1, 9, 3, 4}));

		System.out.println("\nsameTempValuesDaylight:");
		System.out.println("same?: " + arraysMain.sameTempValuesDaylight(new double[]{1, 2, 3, 4}, new double[]{1, 2, 3, 4, 5}));
		System.out.println("same?: " + arraysMain.sameTempValuesDaylight(new double[]{1, 2, 3, 4}, new double[]{1, 9, 3, 4, 5, 6}));

		System.out.println("\nwonLottery:");
		int[] myNumbers = new int[]{9, 22, 53, 74, 85};
		int[] lotteryNumbers = new int[]{85, 22, 74, 9, 53};
		System.out.println("Did I win: " + arraysMain.wonLottery(myNumbers, lotteryNumbers));
		System.out.println(Arrays.toString(myNumbers));
		System.out.println(Arrays.toString(lotteryNumbers));
		System.out.println("Did I win: " + arraysMain.wonLottery(new int[]{31, 33, 55, 66, 77}, new int[]{77, 31, 32, 55, 66}));
	}
}
