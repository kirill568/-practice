import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String string = in.nextLine();
		System.out.println("Длина строки: " + string.length());
	}
}