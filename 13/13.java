class Computer {
	String chip;
	String ram;
	String manufacture;

	void showFeatures() {
		System.out.print("Процессор - " + chip + "\n" +
						"Оперативная память - " + ram + "\n" +
						"Производитель - " + manufacture);
	}
}

class App {
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.chip = "ryzen 2600";
		comp.ram = "8000 mb";
		comp.manufacture = "HP";
		comp.showFeatures();
	}
}