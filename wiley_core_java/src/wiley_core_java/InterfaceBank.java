package wiley_core_java;

interface Bank {
	void account();
}

interface Bank1 {
	void account();

}

interface ATM extends Bank, Bank1 {
	void insertcard();

	void selectoption();

	void enterpin();
}

interface AA {
	void m1();
}

abstract class newATM implements ATM, AA {
	public void account() {

	}

	public void m1() {

	}
}

public class InterfaceBank extends newATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceBank b1 = new InterfaceBank();
		b1.account();
		b1.enterpin();
		b1.insertcard();
		b1.selectoption();

	}

	@Override
	public void insertcard() {
		// TODO Auto-generated method stub
		System.out.println("insert the card");

	}

	@Override
	public void selectoption() {
		// TODO Auto-generated method stub
		System.out.println("select the option");

	}

	@Override
	public void enterpin() {
		// TODO Auto-generated method stub
		System.out.println("enter the pin");
	}

}