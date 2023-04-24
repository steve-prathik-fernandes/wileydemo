package wiley_core_java;

public class MethodType {
	//instance method
	public void sub(int v1,int v2) {
		int val=v1-v2;
		System.out.println("Subtraction instance method:- "+val);
	}
	//static method with return type
	public static int add(int v1,int v2) {
		int val=v1+v2;
		
	}
	// static method with void
	public static void mul(int v1,int v2) {
		int val=v1*v2;
		System.out.println("Multiplication in instance method:-  "+val);
	}
	
	public static void main(String[] args) {
		mul(25,30);
		
		MethodType m=new MethodType();
		
		
		m.sub(45,30);
		System.out.println("Addition in instance method:-  "+add(5, 5));
	}

}
