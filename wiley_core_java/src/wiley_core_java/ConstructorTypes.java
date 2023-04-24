package wiley_core_java;

public class ConstructorTypes {

	public ConstructorTypes(int a,int b) {
		System.out.println("2 grs count: "+(a+b));
	}
	
	public ConstructorTypes(float a, int b) {
		System.out.println("2 args count :"+(a+b));
	}
	public ConstructorTypes() {
		System.out.println("0 args count");
	}
	
	public static void main(String[] args) {
		ConstructorTypes ct=new ConstructorTypes();
		ConstructorTypes ctadd=new ConstructorTypes(2,3);
		ConstructorTypes ctfl=new ConstructorTypes(2.0f,3);
	}
}
