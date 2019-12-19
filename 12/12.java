import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите слово: ");
		String word = in.nextLine();
		String[] letters = word.split("");
		System.out.print("В слове " + letters.length + " букв");
	}
}