package JavaThread;

class Sheet {
	public void writeIn(int k) {
		synchronized (this) {
			for (int i = 1; i <= 2; i++) {
				System.out.println("in sync" + (i + k));
			}
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i * k);
		}
	}
}

class Person1 extends Thread {
	Sheet st;

	public Person1(Sheet st) {
		super();
		this.st = st;
	}

	@Override
	public void run() {
		st.writeIn(5);
	}
}

class Person2 extends Thread {
	Sheet st;

	public Person2(Sheet st) {
		super();
		this.st = st;
	}

	public void run() {
		st.writeIn(5);
	}
}

public class SynchronizationConcepts {
	public static void main(String[] args) {
		Sheet st = new Sheet();

		Person1 t1 = new Person1(st);
		Person2 t2 = new Person2(st);

		t1.start();
		t2.start();
	}

}
