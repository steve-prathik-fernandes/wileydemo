package JavaThread;


class TPriority extends Thread {
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(
				"Thread Name:- "+ Thread.currentThread().getName() +
				"   -   Thread Prioriy:- " + Thread.currentThread().getPriority() +
				"   -   Thread ID:- " + Thread.currentThread().getId()
			);
		}
	}
}


public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		TPriority t1 = new TPriority();
		TPriority t2 = new TPriority();
		TPriority t3 = new TPriority();

		t1.start();
		t1.join();
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
	}
}
