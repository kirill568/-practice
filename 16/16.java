import java.util.ArrayList;
import java.util.Scanner;

class App {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		int i = 0;

		while(true) {
			System.out.print("Введите имя: ");
			String name = in.nextLine(); 
			names.add(name);
			if (name.equals("")) {
				break;
			}
			i += 1;
		}

		for (int j = 0; j < names.size(); j+=1 ) {
			System.out.print(names.get(j) + " ");
		}
	}
}