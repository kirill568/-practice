
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

		System.out.println("25 + 5 = " + calc.sum(25, 5));
		System.out.println("25 - 5 = " + calc.diff(25, 5));
		System.out.println("25 / 5 = " + calc.div(25, 5));
		System.out.println("25 * 5 = " + calc.multi(25, 5));
	}
}