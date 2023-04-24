package wiley_core_java;

class Vehicle1{
	public void steering() {
		System.out.println("steering");
	}
}

class Car1 extends Vehicle1{
	public void airBag() {
		System.out.println("airbag");
	}
}

class Truck extends Vehicle1{
	public void HydraulicPump() {
		System.out.println("hydraulic pump");
	}
}




public class HierarchialInheritance {
public static void main(String[] args) {
	Truck t=new Truck();
	Car1 c=new Car1();
	t.HydraulicPump();
	c.airBag();
	t.steering();
	c.steering();
	
	
}

}
