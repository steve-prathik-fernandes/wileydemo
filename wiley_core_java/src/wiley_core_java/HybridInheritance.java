package wiley_core_java;

class A{
	public void methodA() {
		System.out.println("class A");
	}
}

class C extends A{
	public void methodC() {
		System.out.println("class C");
	}
	
}

 class B extends A{
	 public void methodB() {
		 System.out.println("class B");
	 }
	
}

class D extends B{
	public void methodD() {
		System.out.println("class D");
	}
	
}
class E extends D{
	public void methodE() {
		System.out.println("class E");
	}
	
}



public class HybridInheritance {
	public static void main(String[] args) {
		E e=new E();
		C c=new C();
		e.methodE();
		e.methodD();
		e.methodB();
		c.methodC();
		c.methodA();
		
		
		
		
	}

}
