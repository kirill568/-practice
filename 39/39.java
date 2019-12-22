import java.util.Scanner;
import java.util.*;

class App {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		Scanner in = new Scanner(System.in);
		System.out.print("Введите предложение: ");
		String sentence = in.nextLine();
		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i+=1) {
			if (hashMap.containsKey(words[i])) {
				int pre = hashMap.get(words[i]);
				hashMap.put(words[i], pre+1);
			} else {
				hashMap.put(words[i], 1);
			}
		}

		System.out.println(hashMap.entrySet());
	}
}