import java.util.Scanner;

class Cover {
	int width;
	int height;
	int getPerimeter() {
		return (width + height) * 2;
	}
}

class App {
	public static void main(String[] args) {
		Cover cover1 = new Cover();
		Cover cover2 = new Cover();
		Scanner in = new Scanner(System.in);

		System.out.print("Введите ширину первого конвера: ");
		cover1.width = in.nextInt();

		System.out.print("Введите высоту первого конвера: ");
		cover1.height = in.nextInt();

		System.out.print("Введите ширину второго конвера: ");
		cover2.width = in.nextInt();

		System.out.print("Введите высоту второго конвера: ");
		cover2.height = in.nextInt();

		if (cover1.getPerimeter() < cover2.getPerimeter()) {
			System.out.println("первый коверт можно вложить во второй");
		} else if (cover2.getPerimeter() < cover1.getPerimeter()) {
			System.out.println("второй коверт можно вложить во первый");
		} else {
			System.out.println("конверты одинаковы");
		}
	}
}