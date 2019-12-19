import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ввелите 1 число: ");
		int numberOne = in.nextInt();

		System.out.print("Ввелите 2 число: ");
		int numberTwo = in.nextInt();

		System.out.print("Ввелите 3 число: ");
		int numberThree = in.nextInt();

		float sr = ( (float)numberOne + (float) numberTwo + (float) numberThree) / 3;

		System.out.print("Среднее арифметическое: " + sr);
	}
}