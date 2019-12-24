import java.util.Scanner;


class Calc {
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static double diff(double num1, double num2) {
		return num1 - num2;
	}

	public static double div(double num1, double num2) {
		return num1 / num2;
	}

	public static double multi(double num1, double num2) {
		return num1 * num2;
	}
}


class App {
	public static void main(String[] args) {
		Calc calc = new Calc();
		Scanner in = new Scanner(System.in);
		System.out.print("Введит первое число: ");
		double firstNumber = in.nextDouble();

		System.out.print("Введит второе число: ");
		double secondeNumber = in.nextDouble();

		System.out.println(firstNumber + " + " + secondeNumber + " = " + calc.sum(firstNumber, secondeNumber));
		System.out.println(firstNumber + " - " + secondeNumber + " = " + calc.diff(firstNumber, secondeNumber));
		System.out.println(firstNumber + " / " + secondeNumber + " = " + calc.div(firstNumber, secondeNumber));
		System.out.println(firstNumber + " * " + secondeNumber + " = " + calc.multi(firstNumber, secondeNumber));
	}
}