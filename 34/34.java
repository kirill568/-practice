import java.io.*;

class Truck {
	private int currentWeight;
	private int maxWeight;

	public Truck(int currentWeight, int maxWeight) {
		this.setCurrentWeight(currentWeight);
		this.setMaxWeight(maxWeight);
	}

	public Truck() {

	}

	public void setCurrentWeight(int num) {
		this.currentWeight = num;
	}

	public void setMaxWeight(int num) {
		this.maxWeight = num;
	}

	public void incWeight(double amount) {
		if (this.currentWeight + amount > this.maxWeight) {
			try {
				throw new IndexOutOfBoundsException();
			}
			catch (IndexOutOfBoundsException exc) {
				System.out.println("Текущий вес не должен превышать максимальный");
			}
		} else {
			this.currentWeight += amount;
		}

	}
}

class App {
	public static void main(String[] args) {
		Truck truck = new Truck(5000, 25000);

		truck.incWeight(10000);
	}
}