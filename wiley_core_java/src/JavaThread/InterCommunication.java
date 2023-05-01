package JavaThread;


class BankAccount{
	int amount=1000;
	
	public synchronized void withdrawAmount(int amount) {
		if(this.amount<amount) {
			System.out.println("Amount is less");
			try {
				wait();
			}catch(InterruptedException e) {
					e.printStackTrace();
			}
			System.out.println("Amount Withdraw is successful");
		}
	}
	public synchronized void depositedAmount(int amount) {
		this.amount+=amount;
		System.out.println("Amount deposited");
		notify();
	}
}


public class InterCommunication {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		
		Thread t1=new Thread() {
			public void run() {
				ba.withdrawAmount(1500);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				ba.depositedAmount(1000);
			}
		};
		
		t1.start();
		t2.start();
	}

}
