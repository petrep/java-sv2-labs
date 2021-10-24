package arrayofarrays;

public class Rectangle {
	public int[][] rectangularMatrix(int size){
		int[][] rectangleMatrix = new int[size][];
		for (int i = 0; i < size; i++) {
			rectangleMatrix[i] = new int[size];
			for (int j=0; j<size; j++) {
				rectangleMatrix[i][j] = i;
			}
		}
		return rectangleMatrix;
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		int[][] myArray = rectangle.rectangularMatrix(4);

		for (int i[] : myArray) {
			for (int j : i) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
