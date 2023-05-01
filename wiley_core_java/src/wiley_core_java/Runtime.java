package wiley_core_java;


class person1{
	public void food() {
		System.out.println("I like North Indian Cuisine");
		
	}
	
}

class person2 extends person1{
	public void food() {
		System.out.println("I like South Indian Cuisine");
		super.food();
	}
	
}




public class Runtime {
	public static void main(String[] args) {
		person2 p=new person2();
		p.food();
		
		
	}
	

}
