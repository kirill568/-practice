class App {
	public static void main(String[] args) {
		int[] myArray = new int[10];
		for (var i = 0; i < myArray.length; i += 1) {
			myArray[i] = i;
		}
		System.out.println("Массив заполненный при помощи for");
		showArray(myArray);
		cleanArray(myArray);

		var counterWhile = 0;
		while (counterWhile < myArray.length) {
			myArray[counterWhile] = counterWhile + 2;
			counterWhile += 1;
		}
		System.out.println("Массив заполненный при помощи while");
		showArray(myArray);
		cleanArray(myArray);

		var counterDo = 0;
		do {
			myArray[counterDo] = counterDo + 5;
			counterDo += 1;
		} while (counterDo < myArray.length);
		System.out.println("Массив заполненный при помощи do while");
		showArray(myArray);
	}

	public static void showArray(int array[]) {
		for (var i = 0; i < array.length; i+=1) {
			System.out.println(array[i]);
		}
	}

	public static void cleanArray(int array[]) {
		for (int i = 0; i < array.length; i+=1) {
            array[i] = 0;
        }
	}
}