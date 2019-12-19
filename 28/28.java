import java.util.Scanner;



class Car {
	private int currentSpeed;
	private int maxSpeed;

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


class App {
	public static void main(String[] args) {
		Car car = new Car();

		car.setMaxSpeed(-35);
		car.setCurrentSpeed(200);
	}
}