package wiley_core_java;

class Employee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class EmployeeImpll {
	public void show(Employee emp) {
		System.out.println("Calling Show Method");
		System.out.println("Name: " + emp.getName() + "age: " + emp.getAge());
	}
}

public class EmployeeEncapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Wiley");
		emp.setAge(15);

		EmployeeImpll eimpl = new EmployeeImpll();
		eimpl.show(emp);

		// System.out.println("Name :"+ emp.getName() +"age: "+emp.getAge());
	}
}
