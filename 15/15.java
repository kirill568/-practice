class App {
	public static void main(String[] args) {
		int[] arrayOne = {1, 3, 5, 7, 9, 11, 13, 15};
		int[] arrayTwo = {2, 4, 6, 8, 10, 12, 14, 16};

		for (int i = 0; i < arrayOne.length; i+=1) {
			System.out.print(arrayOne[i] + " " + arrayTwo[i] + "\n");
		}
	}
}