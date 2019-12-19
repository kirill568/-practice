import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите длину высоты: ");
		int h = in.nextInt();

		System.out.print("Введите длину средней линии: ");
		int m = in.nextInt();
		int square = m * h;
		System.out.print("Площадь: " + square);
	}

	public static float square(float number) {
		return number * number;
	}
}