import java.util.Scanner;
import java.util.*;

import java.util.Scanner;
import java.util.*;

class App {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку: ");
		String string = in.nextLine();

		String[] letters = string.split("");

		for (int i = 0; i < letters.length; i+=1) {
			if (hashMap.containsKey(letters[i])) {
				int pre = hashMap.get(letters[i]);
				hashMap.put(letters[i], pre+1);
			} else {
				hashMap.put(letters[i], 1);
			}
		}

		
		for (Map.Entry<String, Integer> pair: hashMap.entrySet())
    	{
        	if (pair.getValue() > 1) {
        		System.out.println(pair.getKey() + " " + pair.getValue());
        	}
    	}
	}
}