package Exceptions;

public class ThrowClass {
	public static void main(String[] args) {
		try {
			m2();
		}catch(InterruptedException e) {
			//TODO: Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void m2() throws InterruptedException{
		Thread t=new Thread();
		t.sleep(1000);
		
	}
	public static void main(String[] args) {
		m1();
	}

}
