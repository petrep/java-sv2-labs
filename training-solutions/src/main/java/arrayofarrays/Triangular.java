package arrayofarrays;

public class Triangular {
	public int[][] triangularMatrix(int size) {
		int[][] triangle = new int[size+1][];
		for (int i = 0; i < size+1; i++) {
			triangle[i] = new int[i+1];
			for (int j=0; j<triangle[i].length; j++) {
				triangle[i][j] = i;
			}
		}
		return triangle;
	}

	public static void main(String[] args) {
		Triangular triangular = new Triangular();
//		int[][] myArray = {{0}, {1, 1}, {2, 2, 2}};
		int[][] myArray = triangular.triangularMatrix(9);

		for (int i[] : myArray) {
			for (int j : i) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
