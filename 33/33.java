import java.io.*;

class MyStack {
	String[] stack;

	public MyStack(int number) {
		this.stack = new String[number];
	}

	public String toString() {
		String out = "";
		for (int i = 0; i < this.stack.length; i += 1) {
			if (this.stack[i] != null) {
				out += this.stack[i] + " ";
			}
		}
		return out;
	}

	public void push(String item) {
		for (int i = 0; i < this.stack.length; i += 1) {
			if (this.stack[i] == null) {
				this.stack[i] = item;
				break;
			}

			if (i == this.stack.length - 1) {
				throw new IndexOutOfBoundsException();
			}
		}
	}

	public String pop() {
		for (int i = this.stack.length - 1; i >= 0; i -= 1) {
			if (this.stack[i] != null) {
				this.stack[i] = null;
				return this.stack[i];
			}

			if (i == 0) {
				throw new IndexOutOfBoundsException();
			}
		}
		return "";
	}
}

class App {
	public static void main(String[] args) {
		MyStack stack = new MyStack(4);
		try {
			stack.push("kirill");
			stack.push("nikita");
			stack.push("olga");
			stack.push("oleg");
			stack.push("sveta");
		} catch(IndexOutOfBoundsException exc) {
			System.out.println("Массив переполнен");
		}
		

		System.out.println(stack.toString());

		try {
			String name = stack.pop();
			String name2 = stack.pop();
			String name3 = stack.pop();
			String name4 = stack.pop();
			String name5 = stack.pop();
		} catch(IndexOutOfBoundsException exc) {
			System.out.println("Выход за пределы массива");
		}

		stack.push("sveta");
		
		System.out.println(stack.toString());
	}
}