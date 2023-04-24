package wiley_core_java;

public class InstanceOrder {
	String name;
	int age;
	{
		name="Steve";
		age=21;
		System.out.println("Instance Block");
	}
	// which variable will be called first
	public InstanceOrder() {
		System.out.println("Name :"+name+" Age :"+age);
		System.out.println("Constructor block");
	}
	
	public InstanceOrder(int a,int b) {
		System.out.println("Constructor Parameterized :"+(a+b));
	}
	
	public static void main(String[] args) {
		InstanceOrder ior=new InstanceOrder();
		new InstanceOrder(1,2);
		
	}

}
