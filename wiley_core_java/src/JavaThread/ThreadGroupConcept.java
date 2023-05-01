package JavaThread;

class Demo implements Runnable {

	public void run() {
		System.out.println("Thread Name :"+Thread.currentThread().getName());
		
	}
}

public class ThreadGroupConcept {
	public static void main(String[] args) {
			ThreadGroup tgParent=new ThreadGroup("Parent Group");
			ThreadGroup tgChild1=new ThreadGroup("Parent Group");
	
	
			Thread t1=new Thread(tgParent,new Demo(),"First");
			Thread t2=new Thread(tgParent,new Demo(),"Second");
			Thread t3=new Thread(tgParent,new Demo(),"Third");
	
			t1.start();
			t2.start();
			t3.start();
			
			System.out.println("Active group of threads: "+tgParent.activeCount());
			System.out.println("Child group threads :"+tgChild1.activeCount());
	}
}
