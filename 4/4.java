import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ввелите трёхзначное число: ");
		int inputNumber = in.nextInt();
		char[] array = String.valueOf(inputNumber).toCharArray();
		for (var i = 0; i < array.length; i+=1) {
			System.out.print(array[i] + " ");
		}
	}
}