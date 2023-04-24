package wiley_core_java;

public class VarScope {

int ins=20;
static String name="Steve";
int val=18;
int val1=12;

public void sum() {
	int val=10;
	int val1=25;
	System.out.println("Sum Methods :- "+(this.val + this.val1));
}

public static void main(String args[]) {
	int loc=10;
	VarScope vso=new VarScope();
	System.out.println("Local variable loc :"+loc);
	System.out.println("Instance variable loc:"+vso.ins);
	System.out.println("Static variable name: "+name);
	vso.sum();
}
}
