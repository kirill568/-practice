
class User {
	private String fullName;
	private String login;
	private String password;
	private String group;
	private int age;

	public void showInfo(String name) {
		System.out.println(fullName);
	}

	public void showInfo(String login, int age) {
		System.out.println(login + " "+ age);
	}

	public void showInfo(String name, String group, int age) {
		System.out.println(fullName + " " + group + " " + age);
	}

	public void showInfo(String name, String login, String password,  String group, int age) {
		System.out.println(fullName + " " + login + " " + password + " " + group + " " + age);
	}

	public void setName(String str) {
		fullName = str;
	}

	public void showName() {
		System.out.println(fullName);
	}


	public void setLogin(String str) {
		login = str;
	}

	public void showLogin() {
		System.out.println(login);
	}


	public void setPassword(String str) {
		password = str;
	}

	public void showPassword() {
		System.out.println(password);
	}


	public void setGroup(String str) {
		group = str;
	}

	public void showGroup() {
		System.out.println(group);
	}


	public void setAge(int str) {
		age = str;
	}

	public void showAge() {
		System.out.println(age);
	}
}


class App {
	public static void main(String[] args) {
		User user = new User();

		String name = "kirill";
		String login = "rebatishki";
		String password = "topGamer";
		String group = "272b";
		int age = 18;

		user.setName(name);
		user.showName();

		user.setLogin(login);
		user.showLogin();

		user.setPassword(password);
		user.showPassword();

		user.setGroup(group);
		user.showGroup();

		user.setAge(age);
		user.showAge();

		user.showInfo(name);
		user.showInfo(login, age);
		user.showInfo(name, group, age);
		user.showInfo(name, login, password, group, age);
	}
}