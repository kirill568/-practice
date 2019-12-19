import java.util.Arrays; 

class App {
	public static void main(String[] args) {
		int[] arrayOne = {5, 6, 7, 4, 2, 6};
		int[] arrayTwo = {5, 6, 3, 5, 8, 4};

		if (Arrays.equals(arrayOne, arrayTwo)) {
			System.out.println("Массивы одинаковы");
		} else {
			System.out.println("Массивы различны");
		}

		int[][] matrixOne = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
		int[][] matrixTwo = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};

		if (Arrays.deepEquals(matrixOne, matrixTwo)) {
			System.out.println("Двумерные массивы одинаковы");
		} else {
			System.out.println("Двумерные массивы различны");
		}
	}
}