class App {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] newArray = changeArray(array);
		showArray(newArray);
	}

	public static int[] changeArray(int[] array) {
		for (int i = 0; i < 6; i+=1) {
			array[i] = 0;
		}
		return array;
	}

	public static void showArray(int[] array) {
		for (int i = 0; i < array.length; i+=1 ) {
			System.out.print(array[i] + " ");
		}
	}
}