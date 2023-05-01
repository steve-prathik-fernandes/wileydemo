package wiley_core_java;

public class Polymorphism {
	
	public void shapes(int length,int breadth) {
		System.out.println("Area of the Rectangle :"+(length*breadth));
		
	}
	public void shapes(float radius) {
		System.out.println("Area of a circle"+(3.14*radius*radius));
	}
	public void shapes(int length) {
		System.out.println("Area of a square :"+(length*length));
		
	}
	
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.shapes(50);
		p.shapes(40,50);
		p.shapes(44.0f);
	}

}
