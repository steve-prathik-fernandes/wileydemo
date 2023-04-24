package wiley_core_java;

public class createClass implements Cloneable {
	int a=10;
	public void add() {
		System.out.println("Number Adding");
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InstantiationException, IllegalAccessException {
		createClass cc =new createClass();
		
		cc.add();
		System.out.println(cc);
		
		//Create object with new Instance()
		try {
		Class c=Class.forName("wiley_core_java.createClass");
		createClass c1=(createClass)c.newInstance();
		c1.add();
		System.out.println(c1);
		
	} catch(ClassNotFoundException e) {
		//TODO Auto-generated catch block
			e.printStackTrace();
	}
		createClass objClone= (createClass) cc.clone();
		objClone.add();
		System.out.println();
		
}
}
