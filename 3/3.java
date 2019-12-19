class App {
	public static void main(String[] args) {
		int[][] myArray = new int [4][];
		var counter = 1;
		for (var i = 0; i < myArray.length; i+=1) {
			myArray[i] = new int[i + 1];
			for (var j = 0; j < myArray[i].length; j+=1) {
				myArray[i][j] = counter;
				counter += 1;
			}
		}
		showArray(myArray);
	}

	public static void showArray(int array[][]) {
		for (var i = 0; i < array.length; i+=1) {
			for (var j = 0; j < array[i].length; j+=1) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}