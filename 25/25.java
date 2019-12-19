
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
}


class App {
	public static void main(String[] args) {
		User user = new User();
	}
}