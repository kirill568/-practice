import java.util.Arrays; 

class App {
	public static void main(String[] args) {
		int[] array = {0, 1, 2 , 1, 0, 2, 1, 0, 2};

		for (int i = 0; i < array.length; i+=1) {
			if (array[i] == 0) {
				array[i] = 1;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}