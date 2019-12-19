import java.util.Scanner;

class App {
	public static void main(String[] args) {
		int[] array = new int[0];
		Scanner in = new Scanner(System.in);
		System.out.print("Введите длинну массива: ");
		int len = in.nextInt();

		array = new int[len];

		for (int j = 0; j < array.length; j+=1) {
			int counter = j + 1;
			System.out.print("Введите "+ counter +" число: ");
			int number = in.nextInt();
			array[j] = number;
		}

		int sum = 0;

		for (int k = 0; k < array.length; k+=1) {
			sum += array[k];
		}
		System.out.print("Сумма " + sum);

	}
}