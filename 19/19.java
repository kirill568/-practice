import java.util.*;

class App {
	public static void main(String[] args) {
		int[][] matrix = fillMatrix(new int[15][15]);
		System.out.println("Матрица до сортировки");
		showMatrix(matrix);

		int[][] sortedMatrix = sortMatrix(matrix);
		System.out.println("Матрица после сортировки");
		showMatrix(sortedMatrix);
	}

	public static int rnd(int min, int max) {
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}

	public static int[][] fillMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i+=1) {
			for (int j = 0; j < matrix[i].length; j+=1) {
				int counter = rnd(10, 99);
				matrix[i][j] = counter;
			}
		}
		return matrix;
	}

	public static void showMatrix(int matrix[][]) {
		for (var i = 0; i < matrix.length; i+=1) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static int[][] sortMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i+=1) {
			Arrays.sort(matrix[i]);
		}
		return matrix;
	}
}