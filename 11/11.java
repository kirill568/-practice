import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите предложение: ");
		String sentence = in.nextLine();
		String[] words = sentence.split(" ");
		String newSentence = join(words);
		System.out.println(newSentence);
	}

	public static String join(String[] str) {
		String newStr = "";
		for (int i = 0; i < str.length; i += 1) {
			newStr += str[i];
		}
		return newStr;
	}
}