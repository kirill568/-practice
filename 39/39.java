import java.util.Scanner;
import java.util.*;

class App {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		Scanner in = new Scanner(System.in);
		System.out.print("Введите предложение: ");
		String sentence = in.nextLine();
		String[] words = sentence.split(" ");

		hashMap = convertToHashMap(words, hashMap);

		System.out.println("Слов в предложении: " + hashMap.size());
	}

	public static Map convertToHashMap(String[] array, Map hashMap) {
		for (int i = 0; i < array.length; i += 1) {
			hashMap.put(i, array[i]);	
		}
		return hashMap;
	}
}