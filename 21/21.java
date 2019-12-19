import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите должность: ");
		String position = in.nextLine();

		switch (position) {
			case ("Vice President"):
				System.out.println("Hello, sir");
				break;

			case ("Top Manager"):
				System.out.println("Hello");
				break;

			case ("Sales Manager"):
				System.out.println("Welcome");
				break;

			case ("Worker"):
				System.out.println("Hi");
				break;
		}
	}
}