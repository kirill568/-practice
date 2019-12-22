import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		double inputNumber = in.nextDouble();
		char[] array = String.valueOf(inputNumber).toCharArray();

		int countWholePart = 0;
		int countFractionPart = 0;
		boolean comma = false;

		for (int i = 0; i < array.length; i += 1) {
            if (String.valueOf(array[i]).equals(".") && inputNumber % 1 != 0) {
                comma = true;
                continue;
            }

            if (comma == true) {
                countFractionPart += 1;
            } else {
                countWholePart += 1; 
            }
        }

		System.out.println("Количество разрядов целой части: " + countWholePart);
		System.out.println("Количество разрядов дробной части: " + countFractionPart);
	}
}