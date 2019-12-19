import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите длину верхнего основания: ");
		int a = in.nextInt();

		System.out.print("Введите длину нижнего основания: ");
		int b = in.nextInt();

		System.out.print("Введите длину левой боковой стороны: ");
		int c= in.nextInt();

		System.out.print("Введите длину правой боковой стороны: ");
		int d = in.nextInt();

		float onePart = ((float) a + (float) b) / 2;
        float twoPart = square((square((float)b - (float)a) + (float)square(c) - (float)square(d)) / (2 * ((float)b - (float)a)));
        float square = onePart * (float)Math.sqrt((double)square(c) - (double)twoPart);
        System.out.print("Площадь: " + square);
	}

	public static float square(float number) {
		return number * number;
	}
}