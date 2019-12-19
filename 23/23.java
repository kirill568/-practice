class App {
	public static void main(String[] args) {
		String str = "workshop";
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i+=1) {
			System.out.println("Символ - " + array[i] + " код - " + (int)array[i]);
		}
	}
}