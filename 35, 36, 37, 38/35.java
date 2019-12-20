abstract class Employee {
	private String name;
	private int salary;

	public abstract void getBonus();

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public String toString() {
		String out = "";
		return out += "Имя: " + this.name + "\n" + "Зарплата: " + this.salary;
	}
}

class SalesManager extends Employee {
	private int countSales;

	public SalesManager(String name, int salary, int countSales) {
		this.setCountSalese(countSales);
		super.setName(name);
		super.setSalary(salary);
	}

	public void setCountSalese(int sales) {
		this.countSales = sales;
	}

	public void getBonus() {
		if (this.countSales == 0) {
			int percentSalary = (super.getSalary() * 1) / 100;
			super.setSalary(super.getSalary() - percentSalary);
		}

		if (this.countSales >= 1 && this.countSales <= 100) {
			int percentSalary = (super.getSalary() * 5) / 100;
			super.setSalary(super.getSalary() + percentSalary);
		}

		if (this.countSales >= 101 && this.countSales <= 200) {
			int percentSalary = (super.getSalary() * 15) / 100;
			super.setSalary(super.getSalary() - percentSalary);
		}
	}
}

class Worker extends Employee {
	private int experience;

	public Worker(String name, int salary, int experience) {
		this.setExperience(experience);
		super.setName(name);
		super.setSalary(salary);
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void getBonus() {
		if (this.experience <= 4) {
			int percentSalary = (super.getSalary() * 5) / 100;
			super.setSalary(super.getSalary() + percentSalary);
		}

		if (this.experience >= 5 && this.experience <=10) {
			int percentSalary = (super.getSalary() * 8) / 100;
			super.setSalary(super.getSalary() + percentSalary);
		}
	}
}

class App {
	public static void main(String[] args) {
		SalesManager manager = new SalesManager("Джанго", 40000, 0);
		manager.getBonus();
		System.out.println(manager.toString());

		SalesManager manager2 = new SalesManager("Рикардо", 40000, 120);
		manager2.getBonus();
		System.out.println(manager2.toString());

		Worker worker = new Worker("Tommy", 25000, 3);
		worker.getBonus();
		System.out.println(worker.toString());

		Worker worker2 = new Worker("Турецкий", 25000, 7);
		worker2.getBonus();
		System.out.println(worker2.toString());
	}
}