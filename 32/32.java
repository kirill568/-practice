class Money {
	String currency;
	int total;

	public Money(String currency, int total) {
		this.currency = currency;
		this.total = total;
	}

	public String toString() {
		String out = "Валюта " + this.currency + "\n" + "Сумма " + this.total;
		return out;
	}
}

class Test {

	public static void main(String[] args) {
		Money money1 = new Money("dollors", 60);
		Money money2 = new Money("eur", 500);

		Money money3 = sum(money1, money2);

		System.out.println(money3.toString());
	}

	public static Money sum(Money m1, Money m2) {

		int rubs1 = 1;
		int rubs2 = 1;

		switch (m1.currency) {
			case("dollors"):
				rubs1 = m1.total * 60;
				break;

			case("eur"):
				rubs1 = m1.total * 70;
				break;

			case("rub"):
				rubs1 = m1.total;
				break;
		}

		switch (m2.currency) {
			case("dollors"):
				rubs2 = m2.total * 60;
				break;

			case("eur"):
				rubs2 = m2.total * 70;
				break;

			case("rub"):
				rubs2 = m2.total;
				break;
		}

		int sum = rubs1 + rubs2;

		return new Money("rub", sum);
	}
}