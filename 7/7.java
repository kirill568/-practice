import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите длину верхнего основания: ");
		double a = in.nextDouble();

		System.out.print("Введите длину нижнего основания: ");
		double b = in.nextDouble();

		System.out.print("Введите длину левой боковой стороны: ");
		double c= in.nextDouble();

		System.out.print("Введите длину правой боковой стороны: ");
		double d = in.nextDouble();

		double onePart = ( a + b) / 2;
        double twoPart = square((square(b - a) + square(c) - square(d)) / (2 * (b - a)));
        double square = onePart * Math.sqrt(square(c) - twoPart);
        System.out.print("Площадь: " + square);
	}

	public static double square(double number) {
		return number * number;
	}
}