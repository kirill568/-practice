import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ввелите число: ");
		int inputNumber = in.nextInt();
		if (inputNumber % 2 == 0) {
			System.out.print("Число четное");
		} else {
			System.out.print("Число не четное");
		}
	}
}