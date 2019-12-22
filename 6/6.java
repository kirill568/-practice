import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите 1 число: ");
		double numberOne = in.nextDouble();

		System.out.print("Введите 2 число: ");
		double numberTwo = in.nextDouble();

		System.out.print("Введите 3 число: ");
		double numberThree = in.nextDouble();

		double sr = (numberOne + numberTwo + numberThree) / 3;

		System.out.print("Среднее арифметическое: " + sr);
	}
}