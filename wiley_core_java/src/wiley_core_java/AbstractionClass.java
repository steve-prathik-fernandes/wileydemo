package wiley_core_java;

abstract class Test1{
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	static { //static methods will execute first before constructor methods
		System.out.println("Test 1 static block");
	}
	public Test1() { //Parent Class is first executed.
		System.out.println("Test 1 Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("This is test1 main method from main method");
	}
}

class Test2 extends Test1{
	public void m1() {
		System.out.println("Test2 m1 method");
	}
	
	public Test2() {
		System.out.println("Test 2 Constructor");
	}
	static {
		System.out.println("Test 2 static block");
	}
}

public class AbstractionClass {
	public static void main (String[] args) {
		Test2 t2= new Test2();// Test 1 is initialized and then Test 2.
		
		t2.m1();
		t2.m2();
		Test1.main(args);//There are two main method.
	}
}
