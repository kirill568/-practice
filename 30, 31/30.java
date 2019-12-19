import java.util.Scanner;

class Car {
	private int currentSpeed;
	private int maxSpeed;

	public Car(int maxSpeed) {
		this.setMaxSpeed(maxSpeed);
	}

	public Car() {

	}

	public String toString() {
		String out = "Максимальная скорость: " + maxSpeed + "\n" + "Текущая скорость: " + currentSpeed;
		return out;
	}

	public void setMaxSpeed(int num) {
		if (num < 0) {
			Scanner in = new Scanner(System.in);
			System.out.print("Максимальная скорость не должна быть отрицательной, введите максимальную скорость: ");
			int inputNumber = in.nextInt();
			setMaxSpeed(inputNumber);
		} else {
			maxSpeed = num;
		}
	}

	public void setCurrentSpeed(int num) {
		if (num > maxSpeed) {
			Scanner in = new Scanner(System.in);
			System.out.print("Текущая скорость не должа быть больше максимальной, введите текущую скорость скорость: ");
			int inputNumber = in.nextInt();
			setCurrentSpeed(inputNumber);
		} else {
			currentSpeed = num;
		}
	}
}

class MiniVan extends Car {
	private int currentWeight;
	private int maxWeight;

	public MiniVan(int maxSpeed, int maxWeight) {
		super(maxSpeed);
		this.setMaxWeight(maxWeight);
	}

	public MiniVan() {
		super();
	}

	public String toString() {
		String out = super.toString() + "\n" + "Максимальный вес: " + maxWeight + "\n" + "Текущий вес: " + this.currentWeight;
		return out;
	}

	public void setCurrentWeight(int num) {
		if (num > maxWeight) {
			System.out.println("Текущий вес не должен превышать максимальный вес");
		} else {
			currentWeight = num;
		}
	}

	public void setMaxWeight(int num) {
		if (num < 0) {
			System.out.println("Максимальный вес не должен быть отрицательным");
		} else {
			maxWeight = num;
		}
	}
}


class App {
	public static void main(String[] args) {
		Car car = new Car(180);
		car.setCurrentSpeed(90);
		System.out.println(car.toString());
		System.out.println("\n");

		MiniVan miniVan = new MiniVan(120, 3000);
		miniVan.setCurrentWeight(1200);
		System.out.println(miniVan.toString());
	}
}